/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.vfi.smartpos.deviceservice.aidl.key_manager;
/**
 * Created by RuoYi
 * @since >= 3.x.x
 */
public interface IKLD extends android.os.IInterface
{
  /** Default implementation for IKLD. */
  public static class Default implements com.vfi.smartpos.deviceservice.aidl.key_manager.IKLD
  {
    /**
     * keyStore TR34 Payload
     * @param data json file that download from VHQ, then convert to byte data.
     * @return 0 - success, other - fail
     */
    @Override public int keyStoreTR34Payload(byte[] data) throws android.os.RemoteException
    {
      return 0;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.vfi.smartpos.deviceservice.aidl.key_manager.IKLD
  {
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.vfi.smartpos.deviceservice.aidl.key_manager.IKLD interface,
     * generating a proxy if needed.
     */
    public static com.vfi.smartpos.deviceservice.aidl.key_manager.IKLD asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.vfi.smartpos.deviceservice.aidl.key_manager.IKLD))) {
        return ((com.vfi.smartpos.deviceservice.aidl.key_manager.IKLD)iin);
      }
      return new com.vfi.smartpos.deviceservice.aidl.key_manager.IKLD.Stub.Proxy(obj);
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
        case TRANSACTION_keyStoreTR34Payload:
        {
          byte[] _arg0;
          _arg0 = data.createByteArray();
          int _result = this.keyStoreTR34Payload(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static class Proxy implements com.vfi.smartpos.deviceservice.aidl.key_manager.IKLD
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
       * keyStore TR34 Payload
       * @param data json file that download from VHQ, then convert to byte data.
       * @return 0 - success, other - fail
       */
      @Override public int keyStoreTR34Payload(byte[] data) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(data);
          boolean _status = mRemote.transact(Stub.TRANSACTION_keyStoreTR34Payload, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
    }
    static final int TRANSACTION_keyStoreTR34Payload = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
  }
  public static final java.lang.String DESCRIPTOR = "com.vfi.smartpos.deviceservice.aidl.key_manager.IKLD";
  /**
   * keyStore TR34 Payload
   * @param data json file that download from VHQ, then convert to byte data.
   * @return 0 - success, other - fail
   */
  public int keyStoreTR34Payload(byte[] data) throws android.os.RemoteException;
}
