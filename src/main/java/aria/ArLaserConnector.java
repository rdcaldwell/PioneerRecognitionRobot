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

public class ArLaserConnector {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public ArLaserConnector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(ArLaserConnector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AriaJavaJNI.delete_ArLaserConnector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ArLaserConnector(ArArgumentParser parser, ArRobot robot, ArRobotConnector robotConnector, boolean autoParseArgs, ArLog.LogLevel infoLogLevel, SWIGTYPE_p_ArRetFunctor1T_bool_char_const_p_t turnOnPowerOutputCB, SWIGTYPE_p_ArRetFunctor1T_bool_char_const_p_t turnOffPowerOutputCB) {
    this(AriaJavaJNI.new_ArLaserConnector__SWIG_0(ArArgumentParser.getCPtr(parser), parser, ArRobot.getCPtr(robot), robot, ArRobotConnector.getCPtr(robotConnector), robotConnector, autoParseArgs, infoLogLevel.swigValue(), SWIGTYPE_p_ArRetFunctor1T_bool_char_const_p_t.getCPtr(turnOnPowerOutputCB), SWIGTYPE_p_ArRetFunctor1T_bool_char_const_p_t.getCPtr(turnOffPowerOutputCB)), true);
  }

  public ArLaserConnector(ArArgumentParser parser, ArRobot robot, ArRobotConnector robotConnector, boolean autoParseArgs, ArLog.LogLevel infoLogLevel, SWIGTYPE_p_ArRetFunctor1T_bool_char_const_p_t turnOnPowerOutputCB) {
    this(AriaJavaJNI.new_ArLaserConnector__SWIG_1(ArArgumentParser.getCPtr(parser), parser, ArRobot.getCPtr(robot), robot, ArRobotConnector.getCPtr(robotConnector), robotConnector, autoParseArgs, infoLogLevel.swigValue(), SWIGTYPE_p_ArRetFunctor1T_bool_char_const_p_t.getCPtr(turnOnPowerOutputCB)), true);
  }

  public ArLaserConnector(ArArgumentParser parser, ArRobot robot, ArRobotConnector robotConnector, boolean autoParseArgs, ArLog.LogLevel infoLogLevel) {
    this(AriaJavaJNI.new_ArLaserConnector__SWIG_2(ArArgumentParser.getCPtr(parser), parser, ArRobot.getCPtr(robot), robot, ArRobotConnector.getCPtr(robotConnector), robotConnector, autoParseArgs, infoLogLevel.swigValue()), true);
  }

  public ArLaserConnector(ArArgumentParser parser, ArRobot robot, ArRobotConnector robotConnector, boolean autoParseArgs) {
    this(AriaJavaJNI.new_ArLaserConnector__SWIG_3(ArArgumentParser.getCPtr(parser), parser, ArRobot.getCPtr(robot), robot, ArRobotConnector.getCPtr(robotConnector), robotConnector, autoParseArgs), true);
  }

  public ArLaserConnector(ArArgumentParser parser, ArRobot robot, ArRobotConnector robotConnector) {
    this(AriaJavaJNI.new_ArLaserConnector__SWIG_4(ArArgumentParser.getCPtr(parser), parser, ArRobot.getCPtr(robot), robot, ArRobotConnector.getCPtr(robotConnector), robotConnector), true);
  }

  public boolean connectLasers(boolean continueOnFailedConnect, boolean addConnectedLasersToRobot, boolean addAllLasersToRobot, boolean turnOnLasers, boolean powerCycleLaserOnFailedConnect, SWIGTYPE_p_int failedOnLaser) {
    return AriaJavaJNI.ArLaserConnector_connectLasers__SWIG_0(swigCPtr, this, continueOnFailedConnect, addConnectedLasersToRobot, addAllLasersToRobot, turnOnLasers, powerCycleLaserOnFailedConnect, SWIGTYPE_p_int.getCPtr(failedOnLaser));
  }

  public boolean connectLasers(boolean continueOnFailedConnect, boolean addConnectedLasersToRobot, boolean addAllLasersToRobot, boolean turnOnLasers, boolean powerCycleLaserOnFailedConnect) {
    return AriaJavaJNI.ArLaserConnector_connectLasers__SWIG_1(swigCPtr, this, continueOnFailedConnect, addConnectedLasersToRobot, addAllLasersToRobot, turnOnLasers, powerCycleLaserOnFailedConnect);
  }

  public boolean connectLasers(boolean continueOnFailedConnect, boolean addConnectedLasersToRobot, boolean addAllLasersToRobot, boolean turnOnLasers) {
    return AriaJavaJNI.ArLaserConnector_connectLasers__SWIG_2(swigCPtr, this, continueOnFailedConnect, addConnectedLasersToRobot, addAllLasersToRobot, turnOnLasers);
  }

  public boolean connectLasers(boolean continueOnFailedConnect, boolean addConnectedLasersToRobot, boolean addAllLasersToRobot) {
    return AriaJavaJNI.ArLaserConnector_connectLasers__SWIG_3(swigCPtr, this, continueOnFailedConnect, addConnectedLasersToRobot, addAllLasersToRobot);
  }

  public boolean connectLasers(boolean continueOnFailedConnect, boolean addConnectedLasersToRobot) {
    return AriaJavaJNI.ArLaserConnector_connectLasers__SWIG_4(swigCPtr, this, continueOnFailedConnect, addConnectedLasersToRobot);
  }

  public boolean connectLasers(boolean continueOnFailedConnect) {
    return AriaJavaJNI.ArLaserConnector_connectLasers__SWIG_5(swigCPtr, this, continueOnFailedConnect);
  }

  public boolean connectLasers() {
    return AriaJavaJNI.ArLaserConnector_connectLasers__SWIG_6(swigCPtr, this);
  }

  public boolean setupLaser(ArLaser laser, int laserNumber) {
    return AriaJavaJNI.ArLaserConnector_setupLaser__SWIG_0(swigCPtr, this, ArLaser.getCPtr(laser), laser, laserNumber);
  }

  public boolean setupLaser(ArLaser laser) {
    return AriaJavaJNI.ArLaserConnector_setupLaser__SWIG_1(swigCPtr, this, ArLaser.getCPtr(laser), laser);
  }

  public boolean connectLaser(ArLaser laser, int laserNumber, boolean forceConnection) {
    return AriaJavaJNI.ArLaserConnector_connectLaser__SWIG_0(swigCPtr, this, ArLaser.getCPtr(laser), laser, laserNumber, forceConnection);
  }

  public boolean connectLaser(ArLaser laser, int laserNumber) {
    return AriaJavaJNI.ArLaserConnector_connectLaser__SWIG_1(swigCPtr, this, ArLaser.getCPtr(laser), laser, laserNumber);
  }

  public boolean connectLaser(ArLaser laser) {
    return AriaJavaJNI.ArLaserConnector_connectLaser__SWIG_2(swigCPtr, this, ArLaser.getCPtr(laser), laser);
  }

  public boolean addLaser(ArLaser laser, int laserNumber) {
    return AriaJavaJNI.ArLaserConnector_addLaser__SWIG_0(swigCPtr, this, ArLaser.getCPtr(laser), laser, laserNumber);
  }

  public boolean addLaser(ArLaser laser) {
    return AriaJavaJNI.ArLaserConnector_addLaser__SWIG_1(swigCPtr, this, ArLaser.getCPtr(laser), laser);
  }

  public boolean addPlaceholderLaser(ArLaser placeholderLaser, int laserNumber, boolean takeOwnershipOfPlaceholder) {
    return AriaJavaJNI.ArLaserConnector_addPlaceholderLaser__SWIG_0(swigCPtr, this, ArLaser.getCPtr(placeholderLaser), placeholderLaser, laserNumber, takeOwnershipOfPlaceholder);
  }

  public boolean addPlaceholderLaser(ArLaser placeholderLaser, int laserNumber) {
    return AriaJavaJNI.ArLaserConnector_addPlaceholderLaser__SWIG_1(swigCPtr, this, ArLaser.getCPtr(placeholderLaser), placeholderLaser, laserNumber);
  }

  public boolean addPlaceholderLaser(ArLaser placeholderLaser) {
    return AriaJavaJNI.ArLaserConnector_addPlaceholderLaser__SWIG_2(swigCPtr, this, ArLaser.getCPtr(placeholderLaser), placeholderLaser);
  }

  public boolean parseArgs() {
    return AriaJavaJNI.ArLaserConnector_parseArgs__SWIG_0(swigCPtr, this);
  }

  public boolean parseArgs(ArArgumentParser parser) {
    return AriaJavaJNI.ArLaserConnector_parseArgs__SWIG_1(swigCPtr, this, ArArgumentParser.getCPtr(parser), parser);
  }

  public void logOptions() {
    AriaJavaJNI.ArLaserConnector_logOptions(swigCPtr, this);
  }

  public ArLaser getLaser(int laserNumber) {
    long cPtr = AriaJavaJNI.ArLaserConnector_getLaser(swigCPtr, this, laserNumber);
    return (cPtr == 0) ? null : new ArLaser(cPtr, false);
  }

  public boolean replaceLaser(ArLaser laser, int laserNumber) {
    return AriaJavaJNI.ArLaserConnector_replaceLaser(swigCPtr, this, ArLaser.getCPtr(laser), laser, laserNumber);
  }

  public void logLaserData() {
    AriaJavaJNI.ArLaserConnector_logLaserData(swigCPtr, this);
  }

}
