/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.vfi.smartpos.deviceservice.aidl;
public interface RequestACTypeHandler extends android.os.IInterface
{
  /** Default implementation for RequestACTypeHandler. */
  public static class Default implements com.vfi.smartpos.deviceservice.aidl.RequestACTypeHandler
  {
    /**
     * @param aid, current aid
     * @param defaultACType 0-AAC, 1-ARQC, 2-TC
     */
    @Override public void requestConfirmACType(java.lang.String aid, int defaultACType) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.vfi.smartpos.deviceservice.aidl.RequestACTypeHandler
  {
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.vfi.smartpos.deviceservice.aidl.RequestACTypeHandler interface,
     * generating a proxy if needed.
     */
    public static com.vfi.smartpos.deviceservice.aidl.RequestACTypeHandler asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.vfi.smartpos.deviceservice.aidl.RequestACTypeHandler))) {
        return ((com.vfi.smartpos.deviceservice.aidl.RequestACTypeHandler)iin);
      }
      return new com.vfi.smartpos.deviceservice.aidl.RequestACTypeHandler.Stub.Proxy(obj);
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
        case TRANSACTION_requestConfirmACType:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          this.requestConfirmACType(_arg0, _arg1);
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
    private static class Proxy implements com.vfi.smartpos.deviceservice.aidl.RequestACTypeHandler
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
       * @param aid, current aid
       * @param defaultACType 0-AAC, 1-ARQC, 2-TC
       */
      @Override public void requestConfirmACType(java.lang.String aid, int defaultACType) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(aid);
          _data.writeInt(defaultACType);
          boolean _status = mRemote.transact(Stub.TRANSACTION_requestConfirmACType, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
    }
    static final int TRANSACTION_requestConfirmACType = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
  }
  public static final java.lang.String DESCRIPTOR = "com.vfi.smartpos.deviceservice.aidl.RequestACTypeHandler";
  /**
   * @param aid, current aid
   * @param defaultACType 0-AAC, 1-ARQC, 2-TC
   */
  public void requestConfirmACType(java.lang.String aid, int defaultACType) throws android.os.RemoteException;
}
