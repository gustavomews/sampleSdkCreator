/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.vfi.smartpos.deviceservice.aidl;
/**
 * the listener of event
 * @author kai.l@verifone.cn
 */
public interface SmartCardStatusChangedEvent extends android.os.IInterface
{
  /** Default implementation for SmartCardStatusChangedEvent. */
  public static class Default implements com.vfi.smartpos.deviceservice.aidl.SmartCardStatusChangedEvent
  {
    @Override public void onChanged(int statusNow) throws android.os.RemoteException
    {
    }
    //0x00-card not exist, 0x01-card exist, 0x02-card power on
    @Override public void onTimeout() throws android.os.RemoteException
    {
    }
    @Override public void onError(int errorCode) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.vfi.smartpos.deviceservice.aidl.SmartCardStatusChangedEvent
  {
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.vfi.smartpos.deviceservice.aidl.SmartCardStatusChangedEvent interface,
     * generating a proxy if needed.
     */
    public static com.vfi.smartpos.deviceservice.aidl.SmartCardStatusChangedEvent asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.vfi.smartpos.deviceservice.aidl.SmartCardStatusChangedEvent))) {
        return ((com.vfi.smartpos.deviceservice.aidl.SmartCardStatusChangedEvent)iin);
      }
      return new com.vfi.smartpos.deviceservice.aidl.SmartCardStatusChangedEvent.Stub.Proxy(obj);
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
        case TRANSACTION_onChanged:
        {
          int _arg0;
          _arg0 = data.readInt();
          this.onChanged(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_onTimeout:
        {
          this.onTimeout();
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
    private static class Proxy implements com.vfi.smartpos.deviceservice.aidl.SmartCardStatusChangedEvent
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
      @Override public void onChanged(int statusNow) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(statusNow);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onChanged, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      //0x00-card not exist, 0x01-card exist, 0x02-card power on
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
      @Override public void onError(int errorCode) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(errorCode);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onError, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
    }
    static final int TRANSACTION_onChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_onTimeout = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_onError = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
  }
  public static final java.lang.String DESCRIPTOR = "com.vfi.smartpos.deviceservice.aidl.SmartCardStatusChangedEvent";
  public void onChanged(int statusNow) throws android.os.RemoteException;
  //0x00-card not exist, 0x01-card exist, 0x02-card power on
  public void onTimeout() throws android.os.RemoteException;
  public void onError(int errorCode) throws android.os.RemoteException;
}
