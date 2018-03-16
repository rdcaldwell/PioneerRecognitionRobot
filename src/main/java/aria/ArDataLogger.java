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

public class ArDataLogger {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public ArDataLogger(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(ArDataLogger obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AriaJavaJNI.delete_ArDataLogger(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ArDataLogger(ArRobot robot, String fileName) {
    this(AriaJavaJNI.new_ArDataLogger__SWIG_0(ArRobot.getCPtr(robot), robot, fileName), true);
  }

  public ArDataLogger(ArRobot robot) {
    this(AriaJavaJNI.new_ArDataLogger__SWIG_1(ArRobot.getCPtr(robot), robot), true);
  }

  public void addToConfig(ArConfig config) {
    AriaJavaJNI.ArDataLogger_addToConfig(swigCPtr, this, ArConfig.getCPtr(config), config);
  }

  public void addString(String name, int maxLen, SWIGTYPE_p_ArFunctor2T_char_p_unsigned_short_t functor) {
    AriaJavaJNI.ArDataLogger_addString(swigCPtr, this, name, maxLen, SWIGTYPE_p_ArFunctor2T_char_p_unsigned_short_t.getCPtr(functor));
  }

  public SWIGTYPE_p_ArFunctor3T_char_const_p_unsigned_short_ArFunctor2T_char_p_unsigned_short_t_p_t getAddStringFunctor() {
    long cPtr = AriaJavaJNI.ArDataLogger_getAddStringFunctor(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_ArFunctor3T_char_const_p_unsigned_short_ArFunctor2T_char_p_unsigned_short_t_p_t(cPtr, false);
  }

  public void startLogging(int interval) {
    AriaJavaJNI.ArDataLogger_startLogging__SWIG_0(swigCPtr, this, interval);
  }

  public void startLogging() {
    AriaJavaJNI.ArDataLogger_startLogging__SWIG_1(swigCPtr, this);
  }

  public void stopLogging() {
    AriaJavaJNI.ArDataLogger_stopLogging(swigCPtr, this);
  }

  public boolean getLogging() {
    return AriaJavaJNI.ArDataLogger_getLogging(swigCPtr, this);
  }

  public int getLogInterval() {
    return AriaJavaJNI.ArDataLogger_getLogInterval(swigCPtr, this);
  }

  public void writeComment(String str) {
    AriaJavaJNI.ArDataLogger_writeComment__SWIG_0(swigCPtr, this, str);
  }

  public void writeComment(ArArgumentBuilder ab) {
    AriaJavaJNI.ArDataLogger_writeComment__SWIG_1(swigCPtr, this, ArArgumentBuilder.getCPtr(ab), ab);
  }

  public SWIGTYPE_p_ArFunctor1T_ArArgumentBuilder_p_t getWriteCommentFunctor() {
    long cPtr = AriaJavaJNI.ArDataLogger_getWriteCommentFunctor(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_ArFunctor1T_ArArgumentBuilder_p_t(cPtr, false);
  }

  public void clearLog() {
    AriaJavaJNI.ArDataLogger_clearLog(swigCPtr, this);
  }

  public ArFunctor getClearLogFunctor() {
    long cPtr = AriaJavaJNI.ArDataLogger_getClearLogFunctor(swigCPtr, this);
    return (cPtr == 0) ? null : new ArFunctor(cPtr, false);
  }

  public ArFunctor getStartLogFunctor() {
    long cPtr = AriaJavaJNI.ArDataLogger_getStartLogFunctor(swigCPtr, this);
    return (cPtr == 0) ? null : new ArFunctor(cPtr, false);
  }

  public ArFunctor getStopLogFunctor() {
    long cPtr = AriaJavaJNI.ArDataLogger_getStopLogFunctor(swigCPtr, this);
    return (cPtr == 0) ? null : new ArFunctor(cPtr, false);
  }

  public String getStatus() {
    return AriaJavaJNI.ArDataLogger_getStatus__SWIG_0(swigCPtr, this);
  }

  public void getStatus(String buf, int buflen) {
    AriaJavaJNI.ArDataLogger_getStatus__SWIG_1(swigCPtr, this, buf, buflen);
  }

  public void saveCopyAs(String name) {
    AriaJavaJNI.ArDataLogger_saveCopyAs(swigCPtr, this, name);
  }

  public void saveCopy() {
    AriaJavaJNI.ArDataLogger_saveCopy(swigCPtr, this);
  }

  public void saveCopyArgs(ArArgumentBuilder ab) {
    AriaJavaJNI.ArDataLogger_saveCopyArgs(swigCPtr, this, ArArgumentBuilder.getCPtr(ab), ab);
  }

  public SWIGTYPE_p_ArFunctor1T_ArArgumentBuilder_p_t getSaveCopyWithArgsFunctor() {
    long cPtr = AriaJavaJNI.ArDataLogger_getSaveCopyWithArgsFunctor(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_ArFunctor1T_ArArgumentBuilder_p_t(cPtr, false);
  }

  public ArFunctor getSaveCopyFunctor() {
    long cPtr = AriaJavaJNI.ArDataLogger_getSaveCopyFunctor(swigCPtr, this);
    return (cPtr == 0) ? null : new ArFunctor(cPtr, false);
  }

  public String getOpenLogFileName() {
    return AriaJavaJNI.ArDataLogger_getOpenLogFileName(swigCPtr, this);
  }

  public String getLogFileName() {
    return AriaJavaJNI.ArDataLogger_getLogFileName(swigCPtr, this);
  }

  public long getAvailableDiskSpaceMB() {
    return AriaJavaJNI.ArDataLogger_getAvailableDiskSpaceMB(swigCPtr, this);
  }

}
