/*
Adept MobileRobots Robotics Interface for Applications (ARIA)
Copyright (C) 2004-2005 ActivMedia Robotics LLC
Copyright (C) 2006-2010 MobileRobots Inc.
Copyright (C) 2011-2015 Adept Technology, Inc.
Copyright (C) 2016-2018 Omron Adept Technologies, Inc.

     This program is free software; you can redistribute it and/or modify
     it under the terms of the GNU General Public License as published by
     the Free Software Foundation; either version 2 of the License, or
     (at your option) any later version.

     This program is distributed in the hope that it will be useful,
     but WITHOUT ANY WARRANTY; without even the implied warranty of
     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
     GNU General Public License for more details.

     You should have received a copy of the GNU General Public License
     along with this program; if not, write to the Free Software
     Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA

If you wish to redistribute ARIA under different terms, contact 
Adept MobileRobots for information about a commercial version of ARIA at 
robots@mobilerobots.com or 
Adept MobileRobots, 10 Columbia Drive, Amherst, NH 03031; +1-603-881-7960
*/
/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package aria;

public class ArAnalogGyro {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public ArAnalogGyro(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(ArAnalogGyro obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AriaJavaJNI.delete_ArAnalogGyro(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ArAnalogGyro(ArRobot robot) {
    this(AriaJavaJNI.new_ArAnalogGyro(ArRobot.getCPtr(robot), robot), true);
  }

  public boolean isActive() {
    return AriaJavaJNI.ArAnalogGyro_isActive(swigCPtr, this);
  }

  public void activate() {
    AriaJavaJNI.ArAnalogGyro_activate(swigCPtr, this);
  }

  public void deactivate() {
    AriaJavaJNI.ArAnalogGyro_deactivate(swigCPtr, this);
  }

  public boolean hasGyroOnlyMode() {
    return AriaJavaJNI.ArAnalogGyro_hasGyroOnlyMode(swigCPtr, this);
  }

  public boolean isGyroOnlyActive() {
    return AriaJavaJNI.ArAnalogGyro_isGyroOnlyActive(swigCPtr, this);
  }

  public void activateGyroOnly() {
    AriaJavaJNI.ArAnalogGyro_activateGyroOnly(swigCPtr, this);
  }

  public boolean hasNoInternalData() {
    return AriaJavaJNI.ArAnalogGyro_hasNoInternalData(swigCPtr, this);
  }

  public boolean haveGottenData() {
    return AriaJavaJNI.ArAnalogGyro_haveGottenData(swigCPtr, this);
  }

  public boolean haveData() {
    return AriaJavaJNI.ArAnalogGyro_haveData(swigCPtr, this);
  }

  public double getHeading() {
    return AriaJavaJNI.ArAnalogGyro_getHeading(swigCPtr, this);
  }

  public int getTemperature() {
    return AriaJavaJNI.ArAnalogGyro_getTemperature(swigCPtr, this);
  }

  public void setFilterModel(double gyroSigma, double inertialVar, double rotVar, double transVar) {
    AriaJavaJNI.ArAnalogGyro_setFilterModel(swigCPtr, this, gyroSigma, inertialVar, rotVar, transVar);
  }

  public int getPacCount() {
    return AriaJavaJNI.ArAnalogGyro_getPacCount(swigCPtr, this);
  }

  public double getAverage() {
    return AriaJavaJNI.ArAnalogGyro_getAverage(swigCPtr, this);
  }

  public ArTime getAverageTaken() {
    return new ArTime(AriaJavaJNI.ArAnalogGyro_getAverageTaken(swigCPtr, this), true);
  }

  public double getScalingFactor() {
    return AriaJavaJNI.ArAnalogGyro_getScalingFactor(swigCPtr, this);
  }

  public void setScalingFactor(double factor) {
    AriaJavaJNI.ArAnalogGyro_setScalingFactor(swigCPtr, this, factor);
  }

  public void setLogAnomalies(boolean logAnomalies) {
    AriaJavaJNI.ArAnalogGyro_setLogAnomalies(swigCPtr, this, logAnomalies);
  }

}
