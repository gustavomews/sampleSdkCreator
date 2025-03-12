/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.vfi.smartpos.deviceservice.aidl.utils;
// Declare any non-default types here with import statements
public interface IStrUtils extends android.os.IInterface
{
  /** Default implementation for IStrUtils. */
  public static class Default implements com.vfi.smartpos.deviceservice.aidl.utils.IStrUtils
  {
    @Override public java.lang.String bytes2HexStr(byte[] data) throws android.os.RemoteException
    {
      return null;
    }
    @Override public byte[] hexStr2Bytes(java.lang.String data) throws android.os.RemoteException
    {
      return null;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.vfi.smartpos.deviceservice.aidl.utils.IStrUtils
  {
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.vfi.smartpos.deviceservice.aidl.utils.IStrUtils interface,
     * generating a proxy if needed.
     */
    public static com.vfi.smartpos.deviceservice.aidl.utils.IStrUtils asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.vfi.smartpos.deviceservice.aidl.utils.IStrUtils))) {
        return ((com.vfi.smartpos.deviceservice.aidl.utils.IStrUtils)iin);
      }
      return new com.vfi.smartpos.deviceservice.aidl.utils.IStrUtils.Stub.Proxy(obj);
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
        case TRANSACTION_bytes2HexStr:
        {
          byte[] _arg0;
          _arg0 = data.createByteArray();
          java.lang.String _result = this.bytes2HexStr(_arg0);
          reply.writeNoException();
          reply.writeString(_result);
          break;
        }
        case TRANSACTION_hexStr2Bytes:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          byte[] _result = this.hexStr2Bytes(_arg0);
          reply.writeNoException();
          reply.writeByteArray(_result);
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static class Proxy implements com.vfi.smartpos.deviceservice.aidl.utils.IStrUtils
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
      @Override public java.lang.String bytes2HexStr(byte[] data) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(data);
          boolean _status = mRemote.transact(Stub.TRANSACTION_bytes2HexStr, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readString();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public byte[] hexStr2Bytes(java.lang.String data) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        byte[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(data);
          boolean _status = mRemote.transact(Stub.TRANSACTION_hexStr2Bytes, _data, _reply, 0);
          _reply.readException();
          _result = _reply.createByteArray();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
    }
    static final int TRANSACTION_bytes2HexStr = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_hexStr2Bytes = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
  }
  public static final java.lang.String DESCRIPTOR = "com.vfi.smartpos.deviceservice.aidl.utils.IStrUtils";
  public java.lang.String bytes2HexStr(byte[] data) throws android.os.RemoteException;
  public byte[] hexStr2Bytes(java.lang.String data) throws android.os.RemoteException;
}
