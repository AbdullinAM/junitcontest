/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.31
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package hep.aida.swig;
 
import hep.aida.jni.AIDAJNIUtil;

public class IFitData implements hep.aida.IFitData {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public IFitData(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(hep.aida.IFitData obj) {
    if (obj instanceof IFitData) {
      return (obj == null) ? 0 : ((IFitData)obj).swigCPtr;
    } else {
      long cPtr = AIDAJNI.new_IFitData();
      // FIXME, memory leak if Java class gets finalized, since C++ director is not freed.
      AIDAJNI.IFitData_director_connect(obj, cPtr, true, true);
      return cPtr;
    }
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      AIDAJNI.delete_IFitData(swigCPtr);
    }
    swigCPtr = 0;
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    AIDAJNI.IFitData_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    AIDAJNI.IFitData_change_ownership(this, swigCPtr, true);
  }

  public void create1DConnection(hep.aida.IHistogram1D h) {
    AIDAJNI.IFitData_create1DConnection__SWIG_0(swigCPtr, this, IHistogram1D.getCPtr(h), (hep.aida.IHistogram1D)h);
  }

  public void create1DConnection(hep.aida.ICloud1D c) {
    AIDAJNI.IFitData_create1DConnection__SWIG_1(swigCPtr, this, ICloud1D.getCPtr(c), (hep.aida.ICloud1D)c);
  }

  public void create1DConnection(hep.aida.IProfile1D p) {
    AIDAJNI.IFitData_create1DConnection__SWIG_2(swigCPtr, this, IProfile1D.getCPtr(p), (hep.aida.IProfile1D)p);
  }

  public void create1DConnection(hep.aida.IDataPointSet dp, int xIndex, int valIndex) {
    AIDAJNI.IFitData_create1DConnection__SWIG_3(swigCPtr, this, IDataPointSet.getCPtr(dp), (hep.aida.IDataPointSet)dp, xIndex, valIndex);
  }

  public void create2DConnection(hep.aida.IHistogram2D h) {
    AIDAJNI.IFitData_create2DConnection__SWIG_0(swigCPtr, this, IHistogram2D.getCPtr(h), (hep.aida.IHistogram2D)h);
  }

  public void create2DConnection(hep.aida.IHistogram2D h, int xIndex, int yIndex) {
    AIDAJNI.IFitData_create2DConnection__SWIG_1(swigCPtr, this, IHistogram2D.getCPtr(h), (hep.aida.IHistogram2D)h, xIndex, yIndex);
  }

  public void create2DConnection(hep.aida.ICloud2D c) {
    AIDAJNI.IFitData_create2DConnection__SWIG_2(swigCPtr, this, ICloud2D.getCPtr(c), (hep.aida.ICloud2D)c);
  }

  public void create2DConnection(hep.aida.ICloud2D c, int xIndex, int yIndex) {
    AIDAJNI.IFitData_create2DConnection__SWIG_3(swigCPtr, this, ICloud2D.getCPtr(c), (hep.aida.ICloud2D)c, xIndex, yIndex);
  }

  public void create2DConnection(hep.aida.IProfile2D p) {
    AIDAJNI.IFitData_create2DConnection__SWIG_4(swigCPtr, this, IProfile2D.getCPtr(p), (hep.aida.IProfile2D)p);
  }

  public void create2DConnection(hep.aida.IProfile2D p, int xIndex, int yIndex) {
    AIDAJNI.IFitData_create2DConnection__SWIG_5(swigCPtr, this, IProfile2D.getCPtr(p), (hep.aida.IProfile2D)p, xIndex, yIndex);
  }

  public void create2DConnection(hep.aida.IDataPointSet dp, int xIndex, int yIndex, int valIndex) {
    AIDAJNI.IFitData_create2DConnection__SWIG_6(swigCPtr, this, IDataPointSet.getCPtr(dp), (hep.aida.IDataPointSet)dp, xIndex, yIndex, valIndex);
  }

  public void create3DConnection(hep.aida.IHistogram3D h) {
    AIDAJNI.IFitData_create3DConnection__SWIG_0(swigCPtr, this, IHistogram3D.getCPtr(h), (hep.aida.IHistogram3D)h);
  }

  public void create3DConnection(hep.aida.IHistogram3D h, int xIndex, int yIndex, int zIndex) {
    AIDAJNI.IFitData_create3DConnection__SWIG_1(swigCPtr, this, IHistogram3D.getCPtr(h), (hep.aida.IHistogram3D)h, xIndex, yIndex, zIndex);
  }

  public void create3DConnection(hep.aida.ICloud3D c) {
    AIDAJNI.IFitData_create3DConnection__SWIG_2(swigCPtr, this, ICloud3D.getCPtr(c), (hep.aida.ICloud3D)c);
  }

  public void create3DConnection(hep.aida.ICloud3D c, int xIndex, int yIndex, int zIndex) {
    AIDAJNI.IFitData_create3DConnection__SWIG_3(swigCPtr, this, ICloud3D.getCPtr(c), (hep.aida.ICloud3D)c, xIndex, yIndex, zIndex);
  }

  public void create3DConnection(hep.aida.IDataPointSet dp, int xIndex, int yIndex, int zIndex, int valIndex) {
    AIDAJNI.IFitData_create3DConnection__SWIG_4(swigCPtr, this, IDataPointSet.getCPtr(dp), (hep.aida.IDataPointSet)dp, xIndex, yIndex, zIndex, valIndex);
  }

  public void createConnection(hep.aida.ITuple t, String[] colNames) {
    AIDAJNI.IFitData_createConnection__SWIG_0(swigCPtr, this, ITuple.getCPtr(t), (hep.aida.ITuple)t, AIDAJNIUtil.toPtr(colNames));
  }

  public void createConnection(hep.aida.ITuple t, hep.aida.IEvaluator[] evals) {
    AIDAJNI.IFitData_createConnection__SWIG_1(swigCPtr, this, ITuple.getCPtr(t), (hep.aida.ITuple)t, AIDAJNIUtil.toPtr(evals));
  }

  public void createConnection(hep.aida.IDataPointSet dp, int[] indeces, int valIndex) {
    AIDAJNI.IFitData_createConnection__SWIG_2(swigCPtr, this, IDataPointSet.getCPtr(dp), (hep.aida.IDataPointSet)dp, indeces, valIndex);
  }

  public void reset() {
    AIDAJNI.IFitData_reset(swigCPtr, this);
  }

  public int dimension() {
    return AIDAJNI.IFitData_dimension(swigCPtr, this);
  }

  public String dataDescription() {
    return AIDAJNI.IFitData_dataDescription(swigCPtr, this);
  }

  public hep.aida.IRangeSet range(int index) {
    return new IRangeSet(AIDAJNI.IFitData_range(swigCPtr, this, index), false);
  }

  public IFitData() {
    this(AIDAJNI.new_IFitData(), true);
    AIDAJNI.IFitData_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

}