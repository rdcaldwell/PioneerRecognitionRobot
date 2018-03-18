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

public class ArRatioInputKeydrive {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public ArRatioInputKeydrive(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(ArRatioInputKeydrive obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AriaJavaJNI.delete_ArRatioInputKeydrive(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ArRatioInputKeydrive(ArRobot robot, ArActionRatioInput input, int priority, double velIncrement) {
    this(AriaJavaJNI.new_ArRatioInputKeydrive__SWIG_0(ArRobot.getCPtr(robot), robot, ArActionRatioInput.getCPtr(input), input, priority, velIncrement), true);
  }

  public ArRatioInputKeydrive(ArRobot robot, ArActionRatioInput input, int priority) {
    this(AriaJavaJNI.new_ArRatioInputKeydrive__SWIG_1(ArRobot.getCPtr(robot), robot, ArActionRatioInput.getCPtr(input), input, priority), true);
  }

  public ArRatioInputKeydrive(ArRobot robot, ArActionRatioInput input) {
    this(AriaJavaJNI.new_ArRatioInputKeydrive__SWIG_2(ArRobot.getCPtr(robot), robot, ArActionRatioInput.getCPtr(input), input), true);
  }

  public void takeKeys() {
    AriaJavaJNI.ArRatioInputKeydrive_takeKeys(swigCPtr, this);
  }

  public void giveUpKeys() {
    AriaJavaJNI.ArRatioInputKeydrive_giveUpKeys(swigCPtr, this);
  }

  public void up() {
    AriaJavaJNI.ArRatioInputKeydrive_up(swigCPtr, this);
  }

  public void down() {
    AriaJavaJNI.ArRatioInputKeydrive_down(swigCPtr, this);
  }

  public void z() {
    AriaJavaJNI.ArRatioInputKeydrive_z(swigCPtr, this);
  }

  public void x() {
    AriaJavaJNI.ArRatioInputKeydrive_x(swigCPtr, this);
  }

  public void left() {
    AriaJavaJNI.ArRatioInputKeydrive_left(swigCPtr, this);
  }

  public void right() {
    AriaJavaJNI.ArRatioInputKeydrive_right(swigCPtr, this);
  }

  public void space() {
    AriaJavaJNI.ArRatioInputKeydrive_space(swigCPtr, this);
  }

  public ArFunctor getFireCB() {
    long cPtr = AriaJavaJNI.ArRatioInputKeydrive_getFireCB(swigCPtr, this);
    return (cPtr == 0) ? null : new ArFunctor(cPtr, false);
  }

}