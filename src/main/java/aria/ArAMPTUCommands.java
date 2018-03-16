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

public class ArAMPTUCommands {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public ArAMPTUCommands(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(ArAMPTUCommands obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AriaJavaJNI.delete_ArAMPTUCommands(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ArAMPTUCommands() {
    this(AriaJavaJNI.new_ArAMPTUCommands(), true);
  }

  public final static int ABSTILT = AriaJavaJNI.ArAMPTUCommands_ABSTILT_get();
  public final static int RELTILTU = AriaJavaJNI.ArAMPTUCommands_RELTILTU_get();
  public final static int RELTILTD = AriaJavaJNI.ArAMPTUCommands_RELTILTD_get();
  public final static int ABSPAN = AriaJavaJNI.ArAMPTUCommands_ABSPAN_get();
  public final static int RELPANCW = AriaJavaJNI.ArAMPTUCommands_RELPANCW_get();
  public final static int RELPANCCW = AriaJavaJNI.ArAMPTUCommands_RELPANCCW_get();
  public final static int PANTILT = AriaJavaJNI.ArAMPTUCommands_PANTILT_get();
  public final static int PANTILTUCW = AriaJavaJNI.ArAMPTUCommands_PANTILTUCW_get();
  public final static int PANTILTDCW = AriaJavaJNI.ArAMPTUCommands_PANTILTDCW_get();
  public final static int PANTILTUCCW = AriaJavaJNI.ArAMPTUCommands_PANTILTUCCW_get();
  public final static int PANTILTDCCW = AriaJavaJNI.ArAMPTUCommands_PANTILTDCCW_get();
  public final static int ZOOM = AriaJavaJNI.ArAMPTUCommands_ZOOM_get();
  public final static int PAUSE = AriaJavaJNI.ArAMPTUCommands_PAUSE_get();
  public final static int CONT = AriaJavaJNI.ArAMPTUCommands_CONT_get();
  public final static int PURGE = AriaJavaJNI.ArAMPTUCommands_PURGE_get();
  public final static int STATUS = AriaJavaJNI.ArAMPTUCommands_STATUS_get();
  public final static int INIT = AriaJavaJNI.ArAMPTUCommands_INIT_get();
  public final static int RESP = AriaJavaJNI.ArAMPTUCommands_RESP_get();
  public final static int PANSLEW = AriaJavaJNI.ArAMPTUCommands_PANSLEW_get();
  public final static int TILTSLEW = AriaJavaJNI.ArAMPTUCommands_TILTSLEW_get();

}
