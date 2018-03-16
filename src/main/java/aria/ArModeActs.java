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

public class ArModeActs extends ArMode {
  private transient long swigCPtr;

  public ArModeActs(long cPtr, boolean cMemoryOwn) {
    super(AriaJavaJNI.ArModeActs_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ArModeActs obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AriaJavaJNI.delete_ArModeActs(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ArModeActs(ArRobot robot, String name, char key, char key2, ArACTS_1_2 acts) {
    this(AriaJavaJNI.new_ArModeActs__SWIG_0(ArRobot.getCPtr(robot), robot, name, key, key2, ArACTS_1_2.getCPtr(acts), acts), true);
  }

  public ArModeActs(ArRobot robot, String name, char key, char key2) {
    this(AriaJavaJNI.new_ArModeActs__SWIG_1(ArRobot.getCPtr(robot), robot, name, key, key2), true);
  }

  public void activate() {
    AriaJavaJNI.ArModeActs_activate(swigCPtr, this);
  }

  public void deactivate() {
    AriaJavaJNI.ArModeActs_deactivate(swigCPtr, this);
  }

  public void help() {
    AriaJavaJNI.ArModeActs_help(swigCPtr, this);
  }

  public void userTask() {
    AriaJavaJNI.ArModeActs_userTask(swigCPtr, this);
  }

  public void channel1() {
    AriaJavaJNI.ArModeActs_channel1(swigCPtr, this);
  }

  public void channel2() {
    AriaJavaJNI.ArModeActs_channel2(swigCPtr, this);
  }

  public void channel3() {
    AriaJavaJNI.ArModeActs_channel3(swigCPtr, this);
  }

  public void channel4() {
    AriaJavaJNI.ArModeActs_channel4(swigCPtr, this);
  }

  public void channel5() {
    AriaJavaJNI.ArModeActs_channel5(swigCPtr, this);
  }

  public void channel6() {
    AriaJavaJNI.ArModeActs_channel6(swigCPtr, this);
  }

  public void channel7() {
    AriaJavaJNI.ArModeActs_channel7(swigCPtr, this);
  }

  public void channel8() {
    AriaJavaJNI.ArModeActs_channel8(swigCPtr, this);
  }

  public void stop() {
    AriaJavaJNI.ArModeActs_stop(swigCPtr, this);
  }

  public void start() {
    AriaJavaJNI.ArModeActs_start(swigCPtr, this);
  }

  public void toggleAcquire() {
    AriaJavaJNI.ArModeActs_toggleAcquire(swigCPtr, this);
  }

}
