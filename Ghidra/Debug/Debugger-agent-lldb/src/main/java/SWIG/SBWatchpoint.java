/* ###
 * IP: Apache License 2.0 with LLVM Exceptions
 */
package SWIG;


/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class SBWatchpoint {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected SBWatchpoint(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SBWatchpoint obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        lldbJNI.delete_SBWatchpoint(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public SBWatchpoint() {
    this(lldbJNI.new_SBWatchpoint__SWIG_0(), true);
  }

  public SBWatchpoint(SBWatchpoint rhs) {
    this(lldbJNI.new_SBWatchpoint__SWIG_1(SBWatchpoint.getCPtr(rhs), rhs), true);
  }

  public boolean IsValid() {
    return lldbJNI.SBWatchpoint_IsValid(swigCPtr, this);
  }

  public SBError GetError() {
    return new SBError(lldbJNI.SBWatchpoint_GetError(swigCPtr, this), true);
  }

  public int GetID() {
    return lldbJNI.SBWatchpoint_GetID(swigCPtr, this);
  }

  public int GetHardwareIndex() {
    return lldbJNI.SBWatchpoint_GetHardwareIndex(swigCPtr, this);
  }

  public java.math.BigInteger GetWatchAddress() {
    return lldbJNI.SBWatchpoint_GetWatchAddress(swigCPtr, this);
  }

  public long GetWatchSize() {
    return lldbJNI.SBWatchpoint_GetWatchSize(swigCPtr, this);
  }

  public void SetEnabled(boolean enabled) {
    lldbJNI.SBWatchpoint_SetEnabled(swigCPtr, this, enabled);
  }

  public boolean IsEnabled() {
    return lldbJNI.SBWatchpoint_IsEnabled(swigCPtr, this);
  }

  public long GetHitCount() {
    return lldbJNI.SBWatchpoint_GetHitCount(swigCPtr, this);
  }

  public long GetIgnoreCount() {
    return lldbJNI.SBWatchpoint_GetIgnoreCount(swigCPtr, this);
  }

  public void SetIgnoreCount(long n) {
    lldbJNI.SBWatchpoint_SetIgnoreCount(swigCPtr, this, n);
  }

  public String GetCondition() {
    return lldbJNI.SBWatchpoint_GetCondition(swigCPtr, this);
  }

  public void SetCondition(String condition) {
    lldbJNI.SBWatchpoint_SetCondition(swigCPtr, this, condition);
  }

  public boolean GetDescription(SBStream description, DescriptionLevel level) {
    return lldbJNI.SBWatchpoint_GetDescription(swigCPtr, this, SBStream.getCPtr(description), description, level.swigValue());
  }

  public static boolean EventIsWatchpointEvent(SBEvent event) {
    return lldbJNI.SBWatchpoint_EventIsWatchpointEvent(SBEvent.getCPtr(event), event);
  }

  public static WatchpointEventType GetWatchpointEventTypeFromEvent(SBEvent event) {
    return WatchpointEventType.swigToEnum(lldbJNI.SBWatchpoint_GetWatchpointEventTypeFromEvent(SBEvent.getCPtr(event), event));
  }

  public static SBWatchpoint GetWatchpointFromEvent(SBEvent event) {
    return new SBWatchpoint(lldbJNI.SBWatchpoint_GetWatchpointFromEvent(SBEvent.getCPtr(event), event), true);
  }

  public String __str__() {
    return lldbJNI.SBWatchpoint___str__(swigCPtr, this);
  }

}
