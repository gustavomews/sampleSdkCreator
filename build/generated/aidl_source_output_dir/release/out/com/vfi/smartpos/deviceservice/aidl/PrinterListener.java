/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.vfi.smartpos.deviceservice.aidl;
/**
 * 打印结果监听器 | listener of printer
 * @author: baoxl
 */
public interface PrinterListener extends android.os.IInterface
{
  /** Default implementation for PrinterListener. */
  public static class Default implements com.vfi.smartpos.deviceservice.aidl.PrinterListener
  {
    /** 打印成功回调 | on print finished */
    @Override public void onFinish() throws android.os.RemoteException
    {
    }
    /**
     * 打印失败回调 | on error occur
     * @param error - 错误码 | the error code
     * <ul>
     * <li>ERROR_NONE(0x00) - normal</li>
     * <li>ERROR_PAPERENDED(0xF0) - Paper out</li>
     * <li>ERROR_NOCONTENT(0xF1) - no content</li>
     * <li>ERROR_HARDERR(0xF2) - printer error</li>
     * <li>ERROR_OVERHEAT(0xF3) - over heat</li>
     * <li>ERROR_NOBM(0xF6) - no black mark</li>
     * <li>ERROR_BUSY(0xF7) - printer is busy</li>
     * <li>ERROR_MOTORERR(0xFB) - moto error</li>
     * <li>ERROR_LOWVOL(0xE1) - battery low</li>
     * <li>ERROR_NOTTF(0xE2) - no ttf</li>
     * <li>ERROR_BITMAP_TOOWIDE(0xE3) - width of bitmap too wide</li>
     * <li>ERROR_PRINTER_CLOSED(0x01) - printer disable by global setting</li>
     * </ul>
     */
    @Override public void onError(int error) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.vfi.smartpos.deviceservice.aidl.PrinterListener
  {
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.vfi.smartpos.deviceservice.aidl.PrinterListener interface,
     * generating a proxy if needed.
     */
    public static com.vfi.smartpos.deviceservice.aidl.PrinterListener asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.vfi.smartpos.deviceservice.aidl.PrinterListener))) {
        return ((com.vfi.smartpos.deviceservice.aidl.PrinterListener)iin);
      }
      return new com.vfi.smartpos.deviceservice.aidl.PrinterListener.Stub.Proxy(obj);
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
        case TRANSACTION_onFinish:
        {
          this.onFinish();
          reply.writeNoException();
          break;
        }
        case TRANSACTION_onError:
        {
          int _arg0;
          _arg0 = data.readInt();
          this.onError(_arg0);
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
    private static class Proxy implements com.vfi.smartpos.deviceservice.aidl.PrinterListener
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
      /** 打印成功回调 | on print finished */
      @Override public void onFinish() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onFinish, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * 打印失败回调 | on error occur
       * @param error - 错误码 | the error code
       * <ul>
       * <li>ERROR_NONE(0x00) - normal</li>
       * <li>ERROR_PAPERENDED(0xF0) - Paper out</li>
       * <li>ERROR_NOCONTENT(0xF1) - no content</li>
       * <li>ERROR_HARDERR(0xF2) - printer error</li>
       * <li>ERROR_OVERHEAT(0xF3) - over heat</li>
       * <li>ERROR_NOBM(0xF6) - no black mark</li>
       * <li>ERROR_BUSY(0xF7) - printer is busy</li>
       * <li>ERROR_MOTORERR(0xFB) - moto error</li>
       * <li>ERROR_LOWVOL(0xE1) - battery low</li>
       * <li>ERROR_NOTTF(0xE2) - no ttf</li>
       * <li>ERROR_BITMAP_TOOWIDE(0xE3) - width of bitmap too wide</li>
       * <li>ERROR_PRINTER_CLOSED(0x01) - printer disable by global setting</li>
       * </ul>
       */
      @Override public void onError(int error) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(error);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onError, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
    }
    static final int TRANSACTION_onFinish = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_onError = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
  }
  public static final java.lang.String DESCRIPTOR = "com.vfi.smartpos.deviceservice.aidl.PrinterListener";
  /** 打印成功回调 | on print finished */
  public void onFinish() throws android.os.RemoteException;
  /**
   * 打印失败回调 | on error occur
   * @param error - 错误码 | the error code
   * <ul>
   * <li>ERROR_NONE(0x00) - normal</li>
   * <li>ERROR_PAPERENDED(0xF0) - Paper out</li>
   * <li>ERROR_NOCONTENT(0xF1) - no content</li>
   * <li>ERROR_HARDERR(0xF2) - printer error</li>
   * <li>ERROR_OVERHEAT(0xF3) - over heat</li>
   * <li>ERROR_NOBM(0xF6) - no black mark</li>
   * <li>ERROR_BUSY(0xF7) - printer is busy</li>
   * <li>ERROR_MOTORERR(0xFB) - moto error</li>
   * <li>ERROR_LOWVOL(0xE1) - battery low</li>
   * <li>ERROR_NOTTF(0xE2) - no ttf</li>
   * <li>ERROR_BITMAP_TOOWIDE(0xE3) - width of bitmap too wide</li>
   * <li>ERROR_PRINTER_CLOSED(0x01) - printer disable by global setting</li>
   * </ul>
   */
  public void onError(int error) throws android.os.RemoteException;
}
