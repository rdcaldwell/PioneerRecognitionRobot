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

public class ArArgumentParser {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public ArArgumentParser(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(ArArgumentParser obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AriaJavaJNI.delete_ArArgumentParser(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ArArgumentParser(String[] argc) {
    this(AriaJavaJNI.new_ArArgumentParser__SWIG_0(argc), true);
  }

  public ArArgumentParser(ArArgumentBuilder builder) {
    this(AriaJavaJNI.new_ArArgumentParser__SWIG_1(ArArgumentBuilder.getCPtr(builder), builder), true);
  }

  public void setWasReallySetOnlyTrue(boolean wasReallySetOnlyTrue) {
    AriaJavaJNI.ArArgumentParser_setWasReallySetOnlyTrue(swigCPtr, this, wasReallySetOnlyTrue);
  }

  public boolean getWasReallySetOnlyTrue() {
    return AriaJavaJNI.ArArgumentParser_getWasReallySetOnlyTrue(swigCPtr, this);
  }

  public boolean checkArgument(String argument) {
    return AriaJavaJNI.ArArgumentParser_checkArgument(swigCPtr, this, argument);
  }

  public String checkParameterArgument(String argument, boolean returnFirst) {
    return AriaJavaJNI.ArArgumentParser_checkParameterArgument__SWIG_0(swigCPtr, this, argument, returnFirst);
  }

  public String checkParameterArgument(String argument) {
    return AriaJavaJNI.ArArgumentParser_checkParameterArgument__SWIG_1(swigCPtr, this, argument);
  }

  public boolean checkParameterArgumentString(String argument, SWIGTYPE_p_p_char dest, SWIGTYPE_p_bool wasReallySet, boolean returnFirst) {
    return AriaJavaJNI.ArArgumentParser_checkParameterArgumentString__SWIG_0(swigCPtr, this, argument, SWIGTYPE_p_p_char.getCPtr(dest), SWIGTYPE_p_bool.getCPtr(wasReallySet), returnFirst);
  }

  public boolean checkParameterArgumentString(String argument, SWIGTYPE_p_p_char dest, SWIGTYPE_p_bool wasReallySet) {
    return AriaJavaJNI.ArArgumentParser_checkParameterArgumentString__SWIG_1(swigCPtr, this, argument, SWIGTYPE_p_p_char.getCPtr(dest), SWIGTYPE_p_bool.getCPtr(wasReallySet));
  }

  public boolean checkParameterArgumentString(String argument, SWIGTYPE_p_p_char dest) {
    return AriaJavaJNI.ArArgumentParser_checkParameterArgumentString__SWIG_2(swigCPtr, this, argument, SWIGTYPE_p_p_char.getCPtr(dest));
  }

  public boolean checkParameterArgumentInteger(String argument, SWIGTYPE_p_int dest, SWIGTYPE_p_bool wasReallySet, boolean returnFirst) {
    return AriaJavaJNI.ArArgumentParser_checkParameterArgumentInteger__SWIG_0(swigCPtr, this, argument, SWIGTYPE_p_int.getCPtr(dest), SWIGTYPE_p_bool.getCPtr(wasReallySet), returnFirst);
  }

  public boolean checkParameterArgumentInteger(String argument, SWIGTYPE_p_int dest, SWIGTYPE_p_bool wasReallySet) {
    return AriaJavaJNI.ArArgumentParser_checkParameterArgumentInteger__SWIG_1(swigCPtr, this, argument, SWIGTYPE_p_int.getCPtr(dest), SWIGTYPE_p_bool.getCPtr(wasReallySet));
  }

  public boolean checkParameterArgumentInteger(String argument, SWIGTYPE_p_int dest) {
    return AriaJavaJNI.ArArgumentParser_checkParameterArgumentInteger__SWIG_2(swigCPtr, this, argument, SWIGTYPE_p_int.getCPtr(dest));
  }

  public boolean checkParameterArgumentBool(String argument, SWIGTYPE_p_bool dest, SWIGTYPE_p_bool wasReallySet, boolean returnFirst) {
    return AriaJavaJNI.ArArgumentParser_checkParameterArgumentBool__SWIG_0(swigCPtr, this, argument, SWIGTYPE_p_bool.getCPtr(dest), SWIGTYPE_p_bool.getCPtr(wasReallySet), returnFirst);
  }

  public boolean checkParameterArgumentBool(String argument, SWIGTYPE_p_bool dest, SWIGTYPE_p_bool wasReallySet) {
    return AriaJavaJNI.ArArgumentParser_checkParameterArgumentBool__SWIG_1(swigCPtr, this, argument, SWIGTYPE_p_bool.getCPtr(dest), SWIGTYPE_p_bool.getCPtr(wasReallySet));
  }

  public boolean checkParameterArgumentBool(String argument, SWIGTYPE_p_bool dest) {
    return AriaJavaJNI.ArArgumentParser_checkParameterArgumentBool__SWIG_2(swigCPtr, this, argument, SWIGTYPE_p_bool.getCPtr(dest));
  }

  public boolean checkParameterArgumentFloat(String argument, SWIGTYPE_p_float dest, SWIGTYPE_p_bool wasReallySet, boolean returnFirst) {
    return AriaJavaJNI.ArArgumentParser_checkParameterArgumentFloat__SWIG_0(swigCPtr, this, argument, SWIGTYPE_p_float.getCPtr(dest), SWIGTYPE_p_bool.getCPtr(wasReallySet), returnFirst);
  }

  public boolean checkParameterArgumentFloat(String argument, SWIGTYPE_p_float dest, SWIGTYPE_p_bool wasReallySet) {
    return AriaJavaJNI.ArArgumentParser_checkParameterArgumentFloat__SWIG_1(swigCPtr, this, argument, SWIGTYPE_p_float.getCPtr(dest), SWIGTYPE_p_bool.getCPtr(wasReallySet));
  }

  public boolean checkParameterArgumentFloat(String argument, SWIGTYPE_p_float dest) {
    return AriaJavaJNI.ArArgumentParser_checkParameterArgumentFloat__SWIG_2(swigCPtr, this, argument, SWIGTYPE_p_float.getCPtr(dest));
  }

  public boolean checkParameterArgumentDouble(String argument, SWIGTYPE_p_double dest, SWIGTYPE_p_bool wasReallySet, boolean returnFirst) {
    return AriaJavaJNI.ArArgumentParser_checkParameterArgumentDouble__SWIG_0(swigCPtr, this, argument, SWIGTYPE_p_double.getCPtr(dest), SWIGTYPE_p_bool.getCPtr(wasReallySet), returnFirst);
  }

  public boolean checkParameterArgumentDouble(String argument, SWIGTYPE_p_double dest, SWIGTYPE_p_bool wasReallySet) {
    return AriaJavaJNI.ArArgumentParser_checkParameterArgumentDouble__SWIG_1(swigCPtr, this, argument, SWIGTYPE_p_double.getCPtr(dest), SWIGTYPE_p_bool.getCPtr(wasReallySet));
  }

  public boolean checkParameterArgumentDouble(String argument, SWIGTYPE_p_double dest) {
    return AriaJavaJNI.ArArgumentParser_checkParameterArgumentDouble__SWIG_2(swigCPtr, this, argument, SWIGTYPE_p_double.getCPtr(dest));
  }

  public void addDefaultArgument(String argument, int position) {
    AriaJavaJNI.ArArgumentParser_addDefaultArgument__SWIG_0(swigCPtr, this, argument, position);
  }

  public void addDefaultArgument(String argument) {
    AriaJavaJNI.ArArgumentParser_addDefaultArgument__SWIG_1(swigCPtr, this, argument);
  }

  public void addDefaultArgumentAsIs(String argument, int position) {
    AriaJavaJNI.ArArgumentParser_addDefaultArgumentAsIs__SWIG_0(swigCPtr, this, argument, position);
  }

  public void addDefaultArgumentAsIs(String argument) {
    AriaJavaJNI.ArArgumentParser_addDefaultArgumentAsIs__SWIG_1(swigCPtr, this, argument);
  }

  public void loadDefaultArguments(int positon) {
    AriaJavaJNI.ArArgumentParser_loadDefaultArguments__SWIG_0(swigCPtr, this, positon);
  }

  public void loadDefaultArguments() {
    AriaJavaJNI.ArArgumentParser_loadDefaultArguments__SWIG_1(swigCPtr, this);
  }

  public boolean checkHelpAndWarnUnparsed(long numArgsOkay) {
    return AriaJavaJNI.ArArgumentParser_checkHelpAndWarnUnparsed__SWIG_0(swigCPtr, this, numArgsOkay);
  }

  public boolean checkHelpAndWarnUnparsed() {
    return AriaJavaJNI.ArArgumentParser_checkHelpAndWarnUnparsed__SWIG_1(swigCPtr, this);
  }

  public boolean checkHelp() {
    return AriaJavaJNI.ArArgumentParser_checkHelp(swigCPtr, this);
  }

  public long getArgc() {
    return AriaJavaJNI.ArArgumentParser_getArgc(swigCPtr, this);
  }

  public SWIGTYPE_p_p_char getArgv() {
    long cPtr = AriaJavaJNI.ArArgumentParser_getArgv(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_p_char(cPtr, false);
  }

  public ArArgumentBuilder getArgumentBuilder() {
    long cPtr = AriaJavaJNI.ArArgumentParser_getArgumentBuilder(swigCPtr, this);
    return (cPtr == 0) ? null : new ArArgumentBuilder(cPtr, false);
  }

  public String getArg(long whichArg) {
    return AriaJavaJNI.ArArgumentParser_getArg(swigCPtr, this, whichArg);
  }

  public void log() {
    AriaJavaJNI.ArArgumentParser_log(swigCPtr, this);
  }

  public String getStartingArguments() {
    return AriaJavaJNI.ArArgumentParser_getStartingArguments(swigCPtr, this);
  }

  public void removeArg(long which) {
    AriaJavaJNI.ArArgumentParser_removeArg(swigCPtr, this, which);
  }

  public static void addDefaultArgumentFile(String file) {
    AriaJavaJNI.ArArgumentParser_addDefaultArgumentFile(file);
  }

  public static void addDefaultArgumentEnv(String env) {
    AriaJavaJNI.ArArgumentParser_addDefaultArgumentEnv(env);
  }

  public static void logDefaultArgumentLocations() {
    AriaJavaJNI.ArArgumentParser_logDefaultArgumentLocations();
  }

}
