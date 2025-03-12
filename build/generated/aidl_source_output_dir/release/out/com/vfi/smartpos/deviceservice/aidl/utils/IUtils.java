/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.vfi.smartpos.deviceservice.aidl.utils;
public interface IUtils extends android.os.IInterface
{
  /** Default implementation for IUtils. */
  public static class Default implements com.vfi.smartpos.deviceservice.aidl.utils.IUtils
  {
    @Override public com.vfi.smartpos.deviceservice.aidl.utils.IImage getImage() throws android.os.RemoteException
    {
      return null;
    }
    @Override public com.vfi.smartpos.deviceservice.aidl.utils.IStrUtils getStrUtils() throws android.os.RemoteException
    {
      return null;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.vfi.smartpos.deviceservice.aidl.utils.IUtils
  {
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.vfi.smartpos.deviceservice.aidl.utils.IUtils interface,
     * generating a proxy if needed.
     */
    public static com.vfi.smartpos.deviceservice.aidl.utils.IUtils asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.vfi.smartpos.deviceservice.aidl.utils.IUtils))) {
        return ((com.vfi.smartpos.deviceservice.aidl.utils.IUtils)iin);
      }
      return new com.vfi.smartpos.deviceservice.aidl.utils.IUtils.Stub.Proxy(obj);
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
        case TRANSACTION_getImage:
        {
          com.vfi.smartpos.deviceservice.aidl.utils.IImage _result = this.getImage();
          reply.writeNoException();
          reply.writeStrongInterface(_result);
          break;
        }
        case TRANSACTION_getStrUtils:
        {
          com.vfi.smartpos.deviceservice.aidl.utils.IStrUtils _result = this.getStrUtils();
          reply.writeNoException();
          reply.writeStrongInterface(_result);
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static class Proxy implements com.vfi.smartpos.deviceservice.aidl.utils.IUtils
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
      @Override public com.vfi.smartpos.deviceservice.aidl.utils.IImage getImage() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        com.vfi.smartpos.deviceservice.aidl.utils.IImage _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getImage, _data, _reply, 0);
          _reply.readException();
          _result = com.vfi.smartpos.deviceservice.aidl.utils.IImage.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public com.vfi.smartpos.deviceservice.aidl.utils.IStrUtils getStrUtils() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        com.vfi.smartpos.deviceservice.aidl.utils.IStrUtils _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getStrUtils, _data, _reply, 0);
          _reply.readException();
          _result = com.vfi.smartpos.deviceservice.aidl.utils.IStrUtils.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
    }
    static final int TRANSACTION_getImage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_getStrUtils = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
  }
  public static final java.lang.String DESCRIPTOR = "com.vfi.smartpos.deviceservice.aidl.utils.IUtils";
  public com.vfi.smartpos.deviceservice.aidl.utils.IImage getImage() throws android.os.RemoteException;
  public com.vfi.smartpos.deviceservice.aidl.utils.IStrUtils getStrUtils() throws android.os.RemoteException;
}
