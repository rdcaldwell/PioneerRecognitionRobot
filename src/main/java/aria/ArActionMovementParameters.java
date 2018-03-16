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

public class ArActionMovementParameters extends ArAction {
  private transient long swigCPtr;

  public ArActionMovementParameters(long cPtr, boolean cMemoryOwn) {
    super(AriaJavaJNI.ArActionMovementParameters_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ArActionMovementParameters obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AriaJavaJNI.delete_ArActionMovementParameters(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ArActionMovementParameters(String name, boolean overrideFaster, boolean addLatVelIfAvailable) {
    this(AriaJavaJNI.new_ArActionMovementParameters__SWIG_0(name, overrideFaster, addLatVelIfAvailable), true);
  }

  public ArActionMovementParameters(String name, boolean overrideFaster) {
    this(AriaJavaJNI.new_ArActionMovementParameters__SWIG_1(name, overrideFaster), true);
  }

  public ArActionMovementParameters(String name) {
    this(AriaJavaJNI.new_ArActionMovementParameters__SWIG_2(name), true);
  }

  public ArActionMovementParameters() {
    this(AriaJavaJNI.new_ArActionMovementParameters__SWIG_3(), true);
  }

  public ArActionDesired fire(ArActionDesired currentDesired) {
    long cPtr = AriaJavaJNI.ArActionMovementParameters_fire(swigCPtr, this, ArActionDesired.getCPtr(currentDesired), currentDesired);
    return (cPtr == 0) ? null : new ArActionDesired(cPtr, false);
  }

  public ArActionDesired getDesired() {
    long cPtr = AriaJavaJNI.ArActionMovementParameters_getDesired(swigCPtr, this);
    return (cPtr == 0) ? null : new ArActionDesired(cPtr, false);
  }

  public boolean isEnabled() {
    return AriaJavaJNI.ArActionMovementParameters_isEnabled(swigCPtr, this);
  }

  public void enable() {
    AriaJavaJNI.ArActionMovementParameters_enable(swigCPtr, this);
  }

  public void enableOnceFromSector(ArMapObject mapObject) {
    AriaJavaJNI.ArActionMovementParameters_enableOnceFromSector(swigCPtr, this, ArMapObject.getCPtr(mapObject), mapObject);
  }

  public void disable() {
    AriaJavaJNI.ArActionMovementParameters_disable(swigCPtr, this);
  }

  public void setParameters(double maxVel, double maxNegVel, double transAccel, double transDecel, double rotVelMax, double rotAccel, double rotDecel, double latVelMax, double latAccel, double latDecel) {
    AriaJavaJNI.ArActionMovementParameters_setParameters__SWIG_0(swigCPtr, this, maxVel, maxNegVel, transAccel, transDecel, rotVelMax, rotAccel, rotDecel, latVelMax, latAccel, latDecel);
  }

  public void setParameters(double maxVel, double maxNegVel, double transAccel, double transDecel, double rotVelMax, double rotAccel, double rotDecel, double latVelMax, double latAccel) {
    AriaJavaJNI.ArActionMovementParameters_setParameters__SWIG_1(swigCPtr, this, maxVel, maxNegVel, transAccel, transDecel, rotVelMax, rotAccel, rotDecel, latVelMax, latAccel);
  }

  public void setParameters(double maxVel, double maxNegVel, double transAccel, double transDecel, double rotVelMax, double rotAccel, double rotDecel, double latVelMax) {
    AriaJavaJNI.ArActionMovementParameters_setParameters__SWIG_2(swigCPtr, this, maxVel, maxNegVel, transAccel, transDecel, rotVelMax, rotAccel, rotDecel, latVelMax);
  }

  public void setParameters(double maxVel, double maxNegVel, double transAccel, double transDecel, double rotVelMax, double rotAccel, double rotDecel) {
    AriaJavaJNI.ArActionMovementParameters_setParameters__SWIG_3(swigCPtr, this, maxVel, maxNegVel, transAccel, transDecel, rotVelMax, rotAccel, rotDecel);
  }

  public void setParameters(double maxVel, double maxNegVel, double transAccel, double transDecel, double rotVelMax, double rotAccel) {
    AriaJavaJNI.ArActionMovementParameters_setParameters__SWIG_4(swigCPtr, this, maxVel, maxNegVel, transAccel, transDecel, rotVelMax, rotAccel);
  }

  public void setParameters(double maxVel, double maxNegVel, double transAccel, double transDecel, double rotVelMax) {
    AriaJavaJNI.ArActionMovementParameters_setParameters__SWIG_5(swigCPtr, this, maxVel, maxNegVel, transAccel, transDecel, rotVelMax);
  }

  public void setParameters(double maxVel, double maxNegVel, double transAccel, double transDecel) {
    AriaJavaJNI.ArActionMovementParameters_setParameters__SWIG_6(swigCPtr, this, maxVel, maxNegVel, transAccel, transDecel);
  }

  public void setParameters(double maxVel, double maxNegVel, double transAccel) {
    AriaJavaJNI.ArActionMovementParameters_setParameters__SWIG_7(swigCPtr, this, maxVel, maxNegVel, transAccel);
  }

  public void setParameters(double maxVel, double maxNegVel) {
    AriaJavaJNI.ArActionMovementParameters_setParameters__SWIG_8(swigCPtr, this, maxVel, maxNegVel);
  }

  public void setParameters(double maxVel) {
    AriaJavaJNI.ArActionMovementParameters_setParameters__SWIG_9(swigCPtr, this, maxVel);
  }

  public void setParameters() {
    AriaJavaJNI.ArActionMovementParameters_setParameters__SWIG_10(swigCPtr, this);
  }

  public void addToConfig(ArConfig config, String section, String prefix) {
    AriaJavaJNI.ArActionMovementParameters_addToConfig__SWIG_0(swigCPtr, this, ArConfig.getCPtr(config), config, section, prefix);
  }

  public void addToConfig(ArConfig config, String section) {
    AriaJavaJNI.ArActionMovementParameters_addToConfig__SWIG_1(swigCPtr, this, ArConfig.getCPtr(config), config, section);
  }

}
