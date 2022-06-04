def makeCoord(x , y):
    y = x * 3.5512312316
    print(str(y) + "\n")

import numpy as np
import pymap3d as pmap

def lla_to_ecef_1(lat, lon, alt):
    rad = np.float64(6378137.0)        # Radius of the Earth (in meters)
    f = np.float64(1.0/298.257223563)  # Flattening factor WGS84 Model
    cosLat = np.cos(lat)
    sinLat = np.sin(lat)
    FF     = (1.0-f)**2
    C      = 1/np.sqrt(cosLat**2 + FF * sinLat**2)
    S      = C * FF

    x = (rad * C + alt)*cosLat * np.cos(lon)
    y = (rad * C + alt)*cosLat * np.sin(lon)
    z = (rad * S + alt)*sinLat
    return x, y, z

import pyproj

def lla_to_ecef_2(lat, lon, alt):
    ecef = pyproj.Proj(proj='geocent', ellps='WGS84', datum='WGS84')
    lla = pyproj.Proj(proj='latlong', ellps='WGS84', datum='WGS84')
    x, y, z = pyproj.transform(lla, ecef, lon, lat, alt, radians=False)
    return x, y, z

def ecef_to_lla(x,y,z):
    ecef = pyproj.Proj(proj='geocent', ellps='WGS84', datum='WGS84')
    lla = pyproj.Proj(proj='latlong', ellps='WGS84', datum='WGS84')
    lon, lat, alt = pyproj.transform(ecef, lla, x, y, z, radians = False)
    return lat, lon, alt


import scipy.spatial.transform


def lla_to_enu(lat, lon, alt) :
    transformer = pyproj.Transformer.from_crs(
        {"proj": 'latlong', "ellps": 'WGS84', "datum": 'WGS84'},
        {"proj": 'geocent', "ellps": 'WGS84', "datum": 'WGS84'},
    )
    # The local coordinate origin (Zermatt, Switzerland)
    lat_org = 46.017 # deg
    lon_org = 7.750  # deg
    alt_org   = 1673     # meters

    x, y, z = transformer.transform(lon, lat, alt, radians=False)
    x_org, y_org, z_org = transformer.transform(lon_org, lat_org, alt_org, radians=False)
    vec = np.array([[x - x_org, y - y_org, z - z_org]]).T

    rot1 = scipy.spatial.transform.Rotation.from_euler('x', -(90 - lat_org),
                                                       degrees=True).as_matrix()  # angle*-1 : left handed *-1
    rot3 = scipy.spatial.transform.Rotation.from_euler('z', -(90 + lon_org),
                                                       degrees=True).as_matrix()  # angle*-1 : left handed *-1

    rotMatrix = rot1.dot(rot3)

    enu = rotMatrix.dot(vec).T.ravel()
    return enu.T


def enu_to_lla(x, y, z):
    transformer1 = pyproj.Transformer.from_crs(
        {"proj": 'latlong', "ellps": 'WGS84', "datum": 'WGS84'},
        {"proj": 'geocent', "ellps": 'WGS84', "datum": 'WGS84'},
    )
    transformer2 = pyproj.Transformer.from_crs(
        {"proj": 'geocent', "ellps": 'WGS84', "datum": 'WGS84'},
        {"proj": 'latlong', "ellps": 'WGS84', "datum": 'WGS84'},
    )
    # The local coordinate origin (Zermatt, Switzerland)
    lat_org = 46.017 # deg
    lon_org = 7.750  # deg
    alt_org   = 1673     # meters
    x_org, y_org, z_org = transformer1.transform(lon_org, lat_org, alt_org, radians=False)
    ecef_org = np.array([[x_org, y_org, z_org]]).T

    rot1 = scipy.spatial.transform.Rotation.from_euler('x', -(90 - lat_org),
                                                       degrees=True).as_matrix()  # angle*-1 : left handed *-1
    rot3 = scipy.spatial.transform.Rotation.from_euler('z', -(90 + lon_org),
                                                       degrees=True).as_matrix()  # angle*-1 : left handed *-1

    rotMatrix = rot1.dot(rot3)

    ecefDelta = rotMatrix.T.dot(np.array([[x, y, z]]).T)
    ecef = ecefDelta + ecef_org
    lon, lat, alt = transformer2.transform(ecef[0, 0], ecef[1, 0], ecef[2, 0], radians=False)

    return lat, lon, alt

def lla_to_aer(lat, lon, alt):
    lat0 = 46.017
    lon0 = 7.750
    h0 = 1673
    return str(pmap.geodetic2aer(lat, lon, alt, lat0, lon0, 0))

def aer_to_lla(az,el,slantrange):
    lat0 = 46.017
    lon0 = 7.750
    h0 = 1673
    return pmap.aer2geodetic(az,el,slantrange,lat0, lon0, h0, None, False)

import matplotlib.pyplot as plt

from mpl_toolkits.mplot3d import Axes3D

def plot(points):
    fig = plt.figure(figsize=(4, 4))
    matrix = []
    for p in points:
        nmr = p.split(',')
        matrix.append(nmr)
        print(matrix)
    coord = np.array(matrix,dtype = float)
    x,y,z = coord.T
    ax = fig.add_subplot(111, projection='3d')

    ax.scatter(x,y,z)  # plot the points on the figure

    plt.show()
    return fig

import math

def compute_3D_polygon_area(points):
    matrix = []
    for p in points:
        nmr = p.split(',')
        matrix.append(nmr)
        print(matrix)
    coord = np.array(matrix,dtype = float)
    points = coord
    if (len(points) < 3): return 0.0
    P1X,P1Y,P1Z = points[0][0],points[0][1],points[0][2]
    P2X,P2Y,P2Z = points[1][0],points[1][1],points[1][2]
    P3X,P3Y,P3Z = points[2][0],points[2][1],points[2][2]
    a = pow(((P2Y-P1Y)*(P3Z-P1Z)-(P3Y-P1Y)*(P2Z-P1Z)),2) + pow(((P3X-P1X)*(P2Z-P1Z)-(P2X-P1X)*(P3Z-P1Z)),2) + pow(((P2X-P1X)*(P3Y-P1Y)-(P3X-P1X)*(P2Y-P1Y)),2)
    cosnx = ((P2Y-P1Y)*(P3Z-P1Z)-(P3Y-P1Y)*(P2Z-P1Z))/(pow(a,1/2))
    cosny = ((P3X-P1X)*(P2Z-P1Z)-(P2X-P1X)*(P3Z-P1Z))/(pow(a,1/2))
    cosnz = ((P2X-P1X)*(P3Y-P1Y)-(P3X-P1X)*(P2Y-P1Y))/(pow(a,1/2))
    s = cosnz*((points[-1][0])*(P1Y)-(P1X)*(points[-1][1])) + cosnx*((points[-1][1])*(P1Z)-(P1Y)*(points[-1][2])) + cosny*((points[-1][2])*(P1X)-(P1Z)*(points[-1][0]))
    for i in range(len(points)-1):
        p1 = points[i]
        p2 = points[i+1]
        ss = cosnz*((p1[0])*(p2[1])-(p2[0])*(p1[1])) + cosnx*((p1[1])*(p2[2])-(p2[1])*(p1[2])) + cosny*((p1[2])*(p2[0])-(p2[2])*(p1[0]))
        s += ss

    s = abs(s/2.0)

    return s
