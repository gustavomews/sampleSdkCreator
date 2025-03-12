/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.vfi.smartpos.deviceservice.aidl;
/**
 * <p>the object of scanner for scanning the bar-code or QR-code
 * 
 * @author: kai.l@verifone.cn
 */
public interface IScanner extends android.os.IInterface
{
  /** Default implementation for IScanner. */
  public static class Default implements com.vfi.smartpos.deviceservice.aidl.IScanner
  {
    /**
     * <p>start scan
     * 
     * @param param
     *  <BR>topTitleString(String) the title string on the top, align center.
     *  <BR>upPromptString(String) the prompt string upside of the scan box, align center.
     *  <BR>downPromptString(String) the prompt string downside of the scan box , align center.
     *  <BR>showScannerBorder(boolean, true is default) false for: scanner border & upPromptString &downPromptString will be hided,
     *  <BR>scannerSelect(int) 0 for front, 1 for rear(if not set this paramater, use IDeviceService.getScanner() to set front/rear position)
     *  <BR>useMaxResolution(boolean, true is default) true - max resolution; false - middle resolution
     *  <BR>startPreView(boolean, true is default) true - start preview when start scanner; false - close preview
     *  <BR>decodeLibName(String) call honeywell scan and config honeywell scan.
     *      <ul>
     *      <li>if decodeLibName starts wtith "honeywell;", follows with the string value of Symbology class properties.</li>
     *      <li>if decodeLibName has multiple properties, split ";" between the properties.</li>
     *      for example, "honeywell;436297729;436289537". "436297729" refers to the Symbology.CODE39, "436289537" refers to the Symbology.CODE128.
     *      CODE39:436297729, CODE128:436289537, QR:436379649, OCR:436391937, Interleaved 2 of 5:436310017, etc.
     *      <li>if you want to set honeywell passport properties, you need to send "honeywell;436391937;453169155" configuration parameter.</li>
     *      </ul>
     *      <BR><b>Note that: the honeywell scanner is not free of charge, please contact local Verifone business staff for details</b>
     * 
     * @param timeout  the timeout, millsecond.
     * @param  listener {@link ScannerListener}the call back listerner
     * @since 1.x.x
     */
    @Override public void startScan(android.os.Bundle param, long timeout, com.vfi.smartpos.deviceservice.aidl.ScannerListener listener) throws android.os.RemoteException
    {
    }
    /**
     * <p>stop scan
     * 
     * @since 1.x.x
     */
    @Override public void stopScan() throws android.os.RemoteException
    {
    }
    /**
     * <p>Custom UI by customers
     * @param param
     * <Br>customUI(boolean) default value is false
     *      <Br>x1(int) vertex coordinates x1, default is 0
     *      <Br>y1(int) vertex coordinates y1, default is 0
     *      <Br>width(int) if customUI is true, default is full screen
     *      <Br>height(int) if customUI is true, default is full screen
     * @throws RemoteException
     * @since after 2.21.0
     */
    @Override public void scannerInit(android.os.Bundle param) throws android.os.RemoteException
    {
    }
    /**
     * <p>open/close flash
     * @param enable open/close flash
     * @throws RemoteException
     * @since after 2.21.0
     */
    @Override public void openFlashLight(boolean enable) throws android.os.RemoteException
    {
    }
    /**
     * <p>switch scanner front/rear camera
     * @throws RemoteException
     * @since after 2.21.0
     */
    @Override public void switchScanner() throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.vfi.smartpos.deviceservice.aidl.IScanner
  {
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.vfi.smartpos.deviceservice.aidl.IScanner interface,
     * generating a proxy if needed.
     */
    public static com.vfi.smartpos.deviceservice.aidl.IScanner asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.vfi.smartpos.deviceservice.aidl.IScanner))) {
        return ((com.vfi.smartpos.deviceservice.aidl.IScanner)iin);
      }
      return new com.vfi.smartpos.deviceservice.aidl.IScanner.Stub.Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      java.lang.String descriptor = DESCRIPTOR;
      if (code >= android.os.IBinder.FIRST_CALL_TRANSACTION && code <= android.os.IBinder.LAST_CALL_TRANSACTION) {
        data.enforceInterface(descriptor);
      }
      switch (code)
      {
        case INTERFACE_TRANSACTION:
        {
          reply.writeString(descriptor);
          return true;
        }
      }
      switch (code)
      {
        case TRANSACTION_startScan:
        {
          android.os.Bundle _arg0;
          _arg0 = _Parcel.readTypedObject(data, android.os.Bundle.CREATOR);
          long _arg1;
          _arg1 = data.readLong();
          com.vfi.smartpos.deviceservice.aidl.ScannerListener _arg2;
          _arg2 = com.vfi.smartpos.deviceservice.aidl.ScannerListener.Stub.asInterface(data.readStrongBinder());
          this.startScan(_arg0, _arg1, _arg2);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_stopScan:
        {
          this.stopScan();
          reply.writeNoException();
          break;
        }
        case TRANSACTION_scannerInit:
        {
          android.os.Bundle _arg0;
          _arg0 = _Parcel.readTypedObject(data, android.os.Bundle.CREATOR);
          this.scannerInit(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_openFlashLight:
        {
          boolean _arg0;
          _arg0 = (0!=data.readInt());
          this.openFlashLight(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_switchScanner:
        {
          this.switchScanner();
          reply.writeNoException();
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static class Proxy implements com.vfi.smartpos.deviceservice.aidl.IScanner
    {
      private android.os.IBinder mRemote;
      Proxy(android.os.IBinder remote)
      {
        mRemote = remote;
      }
      @Override public android.os.IBinder asBinder()
      {
        return mRemote;
      }
      public java.lang.String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      /**
       * <p>start scan
       * 
       * @param param
       *  <BR>topTitleString(String) the title string on the top, align center.
       *  <BR>upPromptString(String) the prompt string upside of the scan box, align center.
       *  <BR>downPromptString(String) the prompt string downside of the scan box , align center.
       *  <BR>showScannerBorder(boolean, true is default) false for: scanner border & upPromptString &downPromptString will be hided,
       *  <BR>scannerSelect(int) 0 for front, 1 for rear(if not set this paramater, use IDeviceService.getScanner() to set front/rear position)
       *  <BR>useMaxResolution(boolean, true is default) true - max resolution; false - middle resolution
       *  <BR>startPreView(boolean, true is default) true - start preview when start scanner; false - close preview
       *  <BR>decodeLibName(String) call honeywell scan and config honeywell scan.
       *      <ul>
       *      <li>if decodeLibName starts wtith "honeywell;", follows with the string value of Symbology class properties.</li>
       *      <li>if decodeLibName has multiple properties, split ";" between the properties.</li>
       *      for example, "honeywell;436297729;436289537". "436297729" refers to the Symbology.CODE39, "436289537" refers to the Symbology.CODE128.
       *      CODE39:436297729, CODE128:436289537, QR:436379649, OCR:436391937, Interleaved 2 of 5:436310017, etc.
       *      <li>if you want to set honeywell passport properties, you need to send "honeywell;436391937;453169155" configuration parameter.</li>
       *      </ul>
       *      <BR><b>Note that: the honeywell scanner is not free of charge, please contact local Verifone business staff for details</b>
       * 
       * @param timeout  the timeout, millsecond.
       * @param  listener {@link ScannerListener}the call back listerner
       * @since 1.x.x
       */
      @Override public void startScan(android.os.Bundle param, long timeout, com.vfi.smartpos.deviceservice.aidl.ScannerListener listener) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _Parcel.writeTypedObject(_data, param, 0);
          _data.writeLong(timeout);
          _data.writeStrongInterface(listener);
          boolean _status = mRemote.transact(Stub.TRANSACTION_startScan, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * <p>stop scan
       * 
       * @since 1.x.x
       */
      @Override public void stopScan() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_stopScan, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * <p>Custom UI by customers
       * @param param
       * <Br>customUI(boolean) default value is false
       *      <Br>x1(int) vertex coordinates x1, default is 0
       *      <Br>y1(int) vertex coordinates y1, default is 0
       *      <Br>width(int) if customUI is true, default is full screen
       *      <Br>height(int) if customUI is true, default is full screen
       * @throws RemoteException
       * @since after 2.21.0
       */
      @Override public void scannerInit(android.os.Bundle param) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _Parcel.writeTypedObject(_data, param, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_scannerInit, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * <p>open/close flash
       * @param enable open/close flash
       * @throws RemoteException
       * @since after 2.21.0
       */
      @Override public void openFlashLight(boolean enable) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(((enable)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_openFlashLight, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * <p>switch scanner front/rear camera
       * @throws RemoteException
       * @since after 2.21.0
       */
      @Override public void switchScanner() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_switchScanner, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
    }
    static final int TRANSACTION_startScan = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_stopScan = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_scannerInit = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_openFlashLight = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_switchScanner = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
  }
  public static final java.lang.String DESCRIPTOR = "com.vfi.smartpos.deviceservice.aidl.IScanner";
  /**
   * <p>start scan
   * 
   * @param param
   *  <BR>topTitleString(String) the title string on the top, align center.
   *  <BR>upPromptString(String) the prompt string upside of the scan box, align center.
   *  <BR>downPromptString(String) the prompt string downside of the scan box , align center.
   *  <BR>showScannerBorder(boolean, true is default) false for: scanner border & upPromptString &downPromptString will be hided,
   *  <BR>scannerSelect(int) 0 for front, 1 for rear(if not set this paramater, use IDeviceService.getScanner() to set front/rear position)
   *  <BR>useMaxResolution(boolean, true is default) true - max resolution; false - middle resolution
   *  <BR>startPreView(boolean, true is default) true - start preview when start scanner; false - close preview
   *  <BR>decodeLibName(String) call honeywell scan and config honeywell scan.
   *      <ul>
   *      <li>if decodeLibName starts wtith "honeywell;", follows with the string value of Symbology class properties.</li>
   *      <li>if decodeLibName has multiple properties, split ";" between the properties.</li>
   *      for example, "honeywell;436297729;436289537". "436297729" refers to the Symbology.CODE39, "436289537" refers to the Symbology.CODE128.
   *      CODE39:436297729, CODE128:436289537, QR:436379649, OCR:436391937, Interleaved 2 of 5:436310017, etc.
   *      <li>if you want to set honeywell passport properties, you need to send "honeywell;436391937;453169155" configuration parameter.</li>
   *      </ul>
   *      <BR><b>Note that: the honeywell scanner is not free of charge, please contact local Verifone business staff for details</b>
   * 
   * @param timeout  the timeout, millsecond.
   * @param  listener {@link ScannerListener}the call back listerner
   * @since 1.x.x
   */
  public void startScan(android.os.Bundle param, long timeout, com.vfi.smartpos.deviceservice.aidl.ScannerListener listener) throws android.os.RemoteException;
  /**
   * <p>stop scan
   * 
   * @since 1.x.x
   */
  public void stopScan() throws android.os.RemoteException;
  /**
   * <p>Custom UI by customers
   * @param param
   * <Br>customUI(boolean) default value is false
   *      <Br>x1(int) vertex coordinates x1, default is 0
   *      <Br>y1(int) vertex coordinates y1, default is 0
   *      <Br>width(int) if customUI is true, default is full screen
   *      <Br>height(int) if customUI is true, default is full screen
   * @throws RemoteException
   * @since after 2.21.0
   */
  public void scannerInit(android.os.Bundle param) throws android.os.RemoteException;
  /**
   * <p>open/close flash
   * @param enable open/close flash
   * @throws RemoteException
   * @since after 2.21.0
   */
  public void openFlashLight(boolean enable) throws android.os.RemoteException;
  /**
   * <p>switch scanner front/rear camera
   * @throws RemoteException
   * @since after 2.21.0
   */
  public void switchScanner() throws android.os.RemoteException;
  /** @hide */
  static class _Parcel {
    static private <T> T readTypedObject(
        android.os.Parcel parcel,
        android.os.Parcelable.Creator<T> c) {
      if (parcel.readInt() != 0) {
          return c.createFromParcel(parcel);
      } else {
          return null;
      }
    }
    static private <T extends android.os.Parcelable> void writeTypedObject(
        android.os.Parcel parcel, T value, int parcelableFlags) {
      if (value != null) {
        parcel.writeInt(1);
        value.writeToParcel(parcel, parcelableFlags);
      } else {
        parcel.writeInt(0);
      }
    }
  }
}
