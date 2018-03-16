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

public class ArRobotPacketSender {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public ArRobotPacketSender(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(ArRobotPacketSender obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AriaJavaJNI.delete_ArRobotPacketSender(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ArRobotPacketSender(short sync1, short sync2) {
    this(AriaJavaJNI.new_ArRobotPacketSender__SWIG_0(sync1, sync2), true);
  }

  public ArRobotPacketSender(short sync1) {
    this(AriaJavaJNI.new_ArRobotPacketSender__SWIG_1(sync1), true);
  }

  public ArRobotPacketSender() {
    this(AriaJavaJNI.new_ArRobotPacketSender__SWIG_2(), true);
  }

  public ArRobotPacketSender(ArDeviceConnection deviceConnection, short sync1, short sync2) {
    this(AriaJavaJNI.new_ArRobotPacketSender__SWIG_3(ArDeviceConnection.getCPtr(deviceConnection), deviceConnection, sync1, sync2), true);
  }

  public ArRobotPacketSender(ArDeviceConnection deviceConnection, short sync1) {
    this(AriaJavaJNI.new_ArRobotPacketSender__SWIG_4(ArDeviceConnection.getCPtr(deviceConnection), deviceConnection, sync1), true);
  }

  public ArRobotPacketSender(ArDeviceConnection deviceConnection) {
    this(AriaJavaJNI.new_ArRobotPacketSender__SWIG_5(ArDeviceConnection.getCPtr(deviceConnection), deviceConnection), true);
  }

  public ArRobotPacketSender(ArDeviceConnection deviceConnection, short sync1, short sync2, boolean tracking, String trackingLogName) {
    this(AriaJavaJNI.new_ArRobotPacketSender__SWIG_6(ArDeviceConnection.getCPtr(deviceConnection), deviceConnection, sync1, sync2, tracking, trackingLogName), true);
  }

  public boolean com(short command) {
    return AriaJavaJNI.ArRobotPacketSender_com(swigCPtr, this, command);
  }

  public boolean comInt(short command, short argument) {
    return AriaJavaJNI.ArRobotPacketSender_comInt(swigCPtr, this, command, argument);
  }

  public boolean com2Bytes(short command, char high, char low) {
    return AriaJavaJNI.ArRobotPacketSender_com2Bytes(swigCPtr, this, command, high, low);
  }

  public boolean comStr(short command, String argument) {
    return AriaJavaJNI.ArRobotPacketSender_comStr(swigCPtr, this, command, argument);
  }

  public boolean comStrN(short command, String str, int size) {
    return AriaJavaJNI.ArRobotPacketSender_comStrN(swigCPtr, this, command, str, size);
  }

  public boolean comDataN(short command, String data, int size) {
    return AriaJavaJNI.ArRobotPacketSender_comDataN(swigCPtr, this, command, data, size);
  }

  public boolean sendPacket(ArRobotPacket packet) {
    return AriaJavaJNI.ArRobotPacketSender_sendPacket(swigCPtr, this, ArRobotPacket.getCPtr(packet), packet);
  }

  public void setDeviceConnection(ArDeviceConnection deviceConnection) {
    AriaJavaJNI.ArRobotPacketSender_setDeviceConnection(swigCPtr, this, ArDeviceConnection.getCPtr(deviceConnection), deviceConnection);
  }

  public ArDeviceConnection getDeviceConnection() {
    long cPtr = AriaJavaJNI.ArRobotPacketSender_getDeviceConnection(swigCPtr, this);
    return (cPtr == 0) ? null : new ArDeviceConnection(cPtr, false);
  }

  public void setPacketSentCallback(ArFunctor1_ArRobotPacketP functor) {
    AriaJavaJNI.ArRobotPacketSender_setPacketSentCallback(swigCPtr, this, ArFunctor1_ArRobotPacketP.getCPtr(functor), functor);
  }

  public void setCommandMonitor(SWIGTYPE_p_ArFunctor2T_unsigned_char_short_t func) {
    AriaJavaJNI.ArRobotPacketSender_setCommandMonitor(swigCPtr, this, SWIGTYPE_p_ArFunctor2T_unsigned_char_short_t.getCPtr(func));
  }

  public void setTracking(boolean v) {
    AriaJavaJNI.ArRobotPacketSender_setTracking__SWIG_0(swigCPtr, this, v);
  }

  public void setTracking() {
    AriaJavaJNI.ArRobotPacketSender_setTracking__SWIG_1(swigCPtr, this);
  }

  public void setTrackingLogName(String n) {
    AriaJavaJNI.ArRobotPacketSender_setTrackingLogName(swigCPtr, this, n);
  }

}
