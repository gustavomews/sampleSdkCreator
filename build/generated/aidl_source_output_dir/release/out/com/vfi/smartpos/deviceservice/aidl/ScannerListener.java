/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.vfi.smartpos.deviceservice.aidl;
/**
 * the listener of scanner
 * @author kai.l@verifone.cn
 */
public interface ScannerListener extends android.os.IInterface
{
  /** Default implementation for ScannerListener. */
  public static class Default implements com.vfi.smartpos.deviceservice.aidl.ScannerListener
  {
    /**
     * Scan code successfully
     * 
     * @param barcode the barcode string
     * @since 1.x.x
     */
    @Override public void onSuccess(java.lang.String barcode) throws android.os.RemoteException
    {
    }
    /**
     * Scan code error
     * 
     * @param error the error code  1-scan failed
     * @param message the message of the error
     * @since 1.x.x
     */
    @Override public void onError(int error, java.lang.String message) throws android.os.RemoteException
    {
    }
    /**
     * Scan timeout
     * @since 1.x.x
     */
    @Override public void onTimeout() throws android.os.RemoteException
    {
    }
    /**
     * Scan cancel
     * @since 1.x.x
     */
    @Override public void onCancel() throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.vfi.smartpos.deviceservice.aidl.ScannerListener
  {
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.vfi.smartpos.deviceservice.aidl.ScannerListener interface,
     * generating a proxy if needed.
     */
    public static com.vfi.smartpos.deviceservice.aidl.ScannerListener asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.vfi.smartpos.deviceservice.aidl.ScannerListener))) {
        return ((com.vfi.smartpos.deviceservice.aidl.ScannerListener)iin);
      }
      return new com.vfi.smartpos.deviceservice.aidl.ScannerListener.Stub.Proxy(obj);
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
        case TRANSACTION_onSuccess:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          this.onSuccess(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_onError:
        {
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          this.onError(_arg0, _arg1);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_onTimeout:
        {
          this.onTimeout();
          reply.writeNoException();
          break;
        }
        case TRANSACTION_onCancel:
        {
          this.onCancel();
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
    private static class Proxy implements com.vfi.smartpos.deviceservice.aidl.ScannerListener
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
       * Scan code successfully
       * 
       * @param barcode the barcode string
       * @since 1.x.x
       */
      @Override public void onSuccess(java.lang.String barcode) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(barcode);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onSuccess, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * Scan code error
       * 
       * @param error the error code  1-scan failed
       * @param message the message of the error
       * @since 1.x.x
       */
      @Override public void onError(int error, java.lang.String message) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(error);
          _data.writeString(message);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onError, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * Scan timeout
       * @since 1.x.x
       */
      @Override public void onTimeout() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onTimeout, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * Scan cancel
       * @since 1.x.x
       */
      @Override public void onCancel() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onCancel, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
    }
    static final int TRANSACTION_onSuccess = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_onError = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_onTimeout = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_onCancel = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
  }
  public static final java.lang.String DESCRIPTOR = "com.vfi.smartpos.deviceservice.aidl.ScannerListener";
  /**
   * Scan code successfully
   * 
   * @param barcode the barcode string
   * @since 1.x.x
   */
  public void onSuccess(java.lang.String barcode) throws android.os.RemoteException;
  /**
   * Scan code error
   * 
   * @param error the error code  1-scan failed
   * @param message the message of the error
   * @since 1.x.x
   */
  public void onError(int error, java.lang.String message) throws android.os.RemoteException;
  /**
   * Scan timeout
   * @since 1.x.x
   */
  public void onTimeout() throws android.os.RemoteException;
  /**
   * Scan cancel
   * @since 1.x.x
   */
  public void onCancel() throws android.os.RemoteException;
}
