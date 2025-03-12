/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.verifone.baseconnect;
// Declare any non-default types here with import statements
public interface StateListener extends android.os.IInterface
{
  /** Default implementation for StateListener. */
  public static class Default implements com.verifone.baseconnect.StateListener
  {
    //00：操作成功
    //10:设备搜索
    //11:链路请求连接
    //12:请求登入设备
    @Override public void onState(int code) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.verifone.baseconnect.StateListener
  {
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.verifone.baseconnect.StateListener interface,
     * generating a proxy if needed.
     */
    public static com.verifone.baseconnect.StateListener asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.verifone.baseconnect.StateListener))) {
        return ((com.verifone.baseconnect.StateListener)iin);
      }
      return new com.verifone.baseconnect.StateListener.Stub.Proxy(obj);
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
        case TRANSACTION_onState:
        {
          int _arg0;
          _arg0 = data.readInt();
          this.onState(_arg0);
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
    private static class Proxy implements com.verifone.baseconnect.StateListener
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
      //00：操作成功
      //10:设备搜索
      //11:链路请求连接
      //12:请求登入设备
      @Override public void onState(int code) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(code);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onState, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
    }
    static final int TRANSACTION_onState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
  }
  public static final java.lang.String DESCRIPTOR = "com.verifone.baseconnect.StateListener";
  //00：操作成功
  //10:设备搜索
  //11:链路请求连接
  //12:请求登入设备
  public void onState(int code) throws android.os.RemoteException;
}
