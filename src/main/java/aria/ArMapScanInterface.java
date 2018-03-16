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

public class ArMapScanInterface {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public ArMapScanInterface(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(ArMapScanInterface obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        AriaJavaJNI.delete_ArMapScanInterface(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static boolean isDefaultScanType(String scanType) {
    return AriaJavaJNI.ArMapScanInterface_isDefaultScanType(scanType);
  }

  public static boolean isSummaryScanType(String scanType) {
    return AriaJavaJNI.ArMapScanInterface_isSummaryScanType(scanType);
  }

  public String getDisplayString(String scanType) {
    return AriaJavaJNI.ArMapScanInterface_getDisplayString__SWIG_0(swigCPtr, this, scanType);
  }

  public String getDisplayString() {
    return AriaJavaJNI.ArMapScanInterface_getDisplayString__SWIG_1(swigCPtr, this);
  }

  public ArPoseVector getPoints(String scanType) {
    long cPtr = AriaJavaJNI.ArMapScanInterface_getPoints__SWIG_0(swigCPtr, this, scanType);
    return (cPtr == 0) ? null : new ArPoseVector(cPtr, false);
  }

  public ArPoseVector getPoints() {
    long cPtr = AriaJavaJNI.ArMapScanInterface_getPoints__SWIG_1(swigCPtr, this);
    return (cPtr == 0) ? null : new ArPoseVector(cPtr, false);
  }

  public ArPose getMinPose(String scanType) {
    return new ArPose(AriaJavaJNI.ArMapScanInterface_getMinPose__SWIG_0(swigCPtr, this, scanType), true);
  }

  public ArPose getMinPose() {
    return new ArPose(AriaJavaJNI.ArMapScanInterface_getMinPose__SWIG_1(swigCPtr, this), true);
  }

  public ArPose getMaxPose(String scanType) {
    return new ArPose(AriaJavaJNI.ArMapScanInterface_getMaxPose__SWIG_0(swigCPtr, this, scanType), true);
  }

  public ArPose getMaxPose() {
    return new ArPose(AriaJavaJNI.ArMapScanInterface_getMaxPose__SWIG_1(swigCPtr, this), true);
  }

  public int getNumPoints(String scanType) {
    return AriaJavaJNI.ArMapScanInterface_getNumPoints__SWIG_0(swigCPtr, this, scanType);
  }

  public int getNumPoints() {
    return AriaJavaJNI.ArMapScanInterface_getNumPoints__SWIG_1(swigCPtr, this);
  }

  public boolean isSortedPoints(String scanType) {
    return AriaJavaJNI.ArMapScanInterface_isSortedPoints__SWIG_0(swigCPtr, this, scanType);
  }

  public boolean isSortedPoints() {
    return AriaJavaJNI.ArMapScanInterface_isSortedPoints__SWIG_1(swigCPtr, this);
  }

  public void setPoints(ArPoseVector points, String scanType, boolean isSortedPoints, SWIGTYPE_p_ArMapChangeDetails changeDetails) {
    AriaJavaJNI.ArMapScanInterface_setPoints__SWIG_0(swigCPtr, this, ArPoseVector.getCPtr(points), points, scanType, isSortedPoints, SWIGTYPE_p_ArMapChangeDetails.getCPtr(changeDetails));
  }

  public void setPoints(ArPoseVector points, String scanType, boolean isSortedPoints) {
    AriaJavaJNI.ArMapScanInterface_setPoints__SWIG_1(swigCPtr, this, ArPoseVector.getCPtr(points), points, scanType, isSortedPoints);
  }

  public void setPoints(ArPoseVector points, String scanType) {
    AriaJavaJNI.ArMapScanInterface_setPoints__SWIG_2(swigCPtr, this, ArPoseVector.getCPtr(points), points, scanType);
  }

  public void setPoints(ArPoseVector points) {
    AriaJavaJNI.ArMapScanInterface_setPoints__SWIG_3(swigCPtr, this, ArPoseVector.getCPtr(points), points);
  }

  public ArLineSegmentVector getLines(String scanType) {
    long cPtr = AriaJavaJNI.ArMapScanInterface_getLines__SWIG_0(swigCPtr, this, scanType);
    return (cPtr == 0) ? null : new ArLineSegmentVector(cPtr, false);
  }

  public ArLineSegmentVector getLines() {
    long cPtr = AriaJavaJNI.ArMapScanInterface_getLines__SWIG_1(swigCPtr, this);
    return (cPtr == 0) ? null : new ArLineSegmentVector(cPtr, false);
  }

  public ArPose getLineMinPose(String scanType) {
    return new ArPose(AriaJavaJNI.ArMapScanInterface_getLineMinPose__SWIG_0(swigCPtr, this, scanType), true);
  }

  public ArPose getLineMinPose() {
    return new ArPose(AriaJavaJNI.ArMapScanInterface_getLineMinPose__SWIG_1(swigCPtr, this), true);
  }

  public ArPose getLineMaxPose(String scanType) {
    return new ArPose(AriaJavaJNI.ArMapScanInterface_getLineMaxPose__SWIG_0(swigCPtr, this, scanType), true);
  }

  public ArPose getLineMaxPose() {
    return new ArPose(AriaJavaJNI.ArMapScanInterface_getLineMaxPose__SWIG_1(swigCPtr, this), true);
  }

  public int getNumLines(String scanType) {
    return AriaJavaJNI.ArMapScanInterface_getNumLines__SWIG_0(swigCPtr, this, scanType);
  }

  public int getNumLines() {
    return AriaJavaJNI.ArMapScanInterface_getNumLines__SWIG_1(swigCPtr, this);
  }

  public boolean isSortedLines(String scanType) {
    return AriaJavaJNI.ArMapScanInterface_isSortedLines__SWIG_0(swigCPtr, this, scanType);
  }

  public boolean isSortedLines() {
    return AriaJavaJNI.ArMapScanInterface_isSortedLines__SWIG_1(swigCPtr, this);
  }

  public void setLines(ArLineSegmentVector lines, String scanType, boolean isSortedLines, SWIGTYPE_p_ArMapChangeDetails changeDetails) {
    AriaJavaJNI.ArMapScanInterface_setLines__SWIG_0(swigCPtr, this, ArLineSegmentVector.getCPtr(lines), lines, scanType, isSortedLines, SWIGTYPE_p_ArMapChangeDetails.getCPtr(changeDetails));
  }

  public void setLines(ArLineSegmentVector lines, String scanType, boolean isSortedLines) {
    AriaJavaJNI.ArMapScanInterface_setLines__SWIG_1(swigCPtr, this, ArLineSegmentVector.getCPtr(lines), lines, scanType, isSortedLines);
  }

  public void setLines(ArLineSegmentVector lines, String scanType) {
    AriaJavaJNI.ArMapScanInterface_setLines__SWIG_2(swigCPtr, this, ArLineSegmentVector.getCPtr(lines), lines, scanType);
  }

  public void setLines(ArLineSegmentVector lines) {
    AriaJavaJNI.ArMapScanInterface_setLines__SWIG_3(swigCPtr, this, ArLineSegmentVector.getCPtr(lines), lines);
  }

  public int getResolution(String scanType) {
    return AriaJavaJNI.ArMapScanInterface_getResolution__SWIG_0(swigCPtr, this, scanType);
  }

  public int getResolution() {
    return AriaJavaJNI.ArMapScanInterface_getResolution__SWIG_1(swigCPtr, this);
  }

  public void setResolution(int resolution, String scanType, SWIGTYPE_p_ArMapChangeDetails changeDetails) {
    AriaJavaJNI.ArMapScanInterface_setResolution__SWIG_0(swigCPtr, this, resolution, scanType, SWIGTYPE_p_ArMapChangeDetails.getCPtr(changeDetails));
  }

  public void setResolution(int resolution, String scanType) {
    AriaJavaJNI.ArMapScanInterface_setResolution__SWIG_1(swigCPtr, this, resolution, scanType);
  }

  public void setResolution(int resolution) {
    AriaJavaJNI.ArMapScanInterface_setResolution__SWIG_2(swigCPtr, this, resolution);
  }

  public void writeScanToFunctor(ArFunctor1_CString functor, String endOfLineChars, String scanType) {
    AriaJavaJNI.ArMapScanInterface_writeScanToFunctor__SWIG_0(swigCPtr, this, ArFunctor1_CString.getCPtr(functor), functor, endOfLineChars, scanType);
  }

  public void writeScanToFunctor(ArFunctor1_CString functor, String endOfLineChars) {
    AriaJavaJNI.ArMapScanInterface_writeScanToFunctor__SWIG_1(swigCPtr, this, ArFunctor1_CString.getCPtr(functor), functor, endOfLineChars);
  }

  public void writePointsToFunctor(SWIGTYPE_p_ArFunctor2T_int_std__vectorT_ArPose_t_p_t functor, String scanType, ArFunctor1_CString keywordFunctor) {
    AriaJavaJNI.ArMapScanInterface_writePointsToFunctor__SWIG_0(swigCPtr, this, SWIGTYPE_p_ArFunctor2T_int_std__vectorT_ArPose_t_p_t.getCPtr(functor), scanType, ArFunctor1_CString.getCPtr(keywordFunctor), keywordFunctor);
  }

  public void writePointsToFunctor(SWIGTYPE_p_ArFunctor2T_int_std__vectorT_ArPose_t_p_t functor, String scanType) {
    AriaJavaJNI.ArMapScanInterface_writePointsToFunctor__SWIG_1(swigCPtr, this, SWIGTYPE_p_ArFunctor2T_int_std__vectorT_ArPose_t_p_t.getCPtr(functor), scanType);
  }

  public void writePointsToFunctor(SWIGTYPE_p_ArFunctor2T_int_std__vectorT_ArPose_t_p_t functor) {
    AriaJavaJNI.ArMapScanInterface_writePointsToFunctor__SWIG_2(swigCPtr, this, SWIGTYPE_p_ArFunctor2T_int_std__vectorT_ArPose_t_p_t.getCPtr(functor));
  }

  public void writeLinesToFunctor(SWIGTYPE_p_ArFunctor2T_int_std__vectorT_ArLineSegment_t_p_t functor, String scanType, ArFunctor1_CString keywordFunctor) {
    AriaJavaJNI.ArMapScanInterface_writeLinesToFunctor__SWIG_0(swigCPtr, this, SWIGTYPE_p_ArFunctor2T_int_std__vectorT_ArLineSegment_t_p_t.getCPtr(functor), scanType, ArFunctor1_CString.getCPtr(keywordFunctor), keywordFunctor);
  }

  public void writeLinesToFunctor(SWIGTYPE_p_ArFunctor2T_int_std__vectorT_ArLineSegment_t_p_t functor, String scanType) {
    AriaJavaJNI.ArMapScanInterface_writeLinesToFunctor__SWIG_1(swigCPtr, this, SWIGTYPE_p_ArFunctor2T_int_std__vectorT_ArLineSegment_t_p_t.getCPtr(functor), scanType);
  }

  public void writeLinesToFunctor(SWIGTYPE_p_ArFunctor2T_int_std__vectorT_ArLineSegment_t_p_t functor) {
    AriaJavaJNI.ArMapScanInterface_writeLinesToFunctor__SWIG_2(swigCPtr, this, SWIGTYPE_p_ArFunctor2T_int_std__vectorT_ArLineSegment_t_p_t.getCPtr(functor));
  }

  public boolean addToFileParser(ArFileParser fileParser) {
    return AriaJavaJNI.ArMapScanInterface_addToFileParser(swigCPtr, this, ArFileParser.getCPtr(fileParser), fileParser);
  }

  public boolean remFromFileParser(ArFileParser fileParser) {
    return AriaJavaJNI.ArMapScanInterface_remFromFileParser(swigCPtr, this, ArFileParser.getCPtr(fileParser), fileParser);
  }

  public boolean readDataPoint(String line) {
    return AriaJavaJNI.ArMapScanInterface_readDataPoint(swigCPtr, this, line);
  }

  public boolean readLineSegment(String line) {
    return AriaJavaJNI.ArMapScanInterface_readLineSegment(swigCPtr, this, line);
  }

  public void loadDataPoint(double x, double y) {
    AriaJavaJNI.ArMapScanInterface_loadDataPoint(swigCPtr, this, x, y);
  }

  public void loadLineSegment(double x1, double y1, double x2, double y2) {
    AriaJavaJNI.ArMapScanInterface_loadLineSegment(swigCPtr, this, x1, y1, x2, y2);
  }

}
