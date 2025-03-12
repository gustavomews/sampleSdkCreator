/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.vfi.smartpos.deviceservice.aidl;
/**
 * Created by Simon on 2019/3/26.
 * @since >= 2.0.9
 */
public interface SmartCardExSearchListener extends android.os.IInterface
{
  /** Default implementation for SmartCardExSearchListener. */
  public static class Default implements com.vfi.smartpos.deviceservice.aidl.SmartCardExSearchListener
  {
    /**
     * @param cardType, refer the com/vfi/smartpos/deviceservice/constdefine/ConstISmartCardReaderEx.java, class ConstISmartCardReaderEx.CardType for defines
     * @since >= 2.0.9
     * @see ConstISmartCardReaderEx.CommType
     */
    @Override public void onSuccess(int cardType) throws android.os.RemoteException
    {
    }
    /**
     * @param errorCode, -1 for error
     * @since >= 2.0.9
     */
    @Override public void onFail(int errorCode) throws android.os.RemoteException
    {
    }
    /** @since >= 2.0.9 */
    @Override public void onTimeout() throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.vfi.smartpos.deviceservice.aidl.SmartCardExSearchListener
  {
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.vfi.smartpos.deviceservice.aidl.SmartCardExSearchListener interface,
     * generating a proxy if needed.
     */
    public static com.vfi.smartpos.deviceservice.aidl.SmartCardExSearchListener asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.vfi.smartpos.deviceservice.aidl.SmartCardExSearchListener))) {
        return ((com.vfi.smartpos.deviceservice.aidl.SmartCardExSearchListener)iin);
      }
      return new com.vfi.smartpos.deviceservice.aidl.SmartCardExSearchListener.Stub.Proxy(obj);
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
          int _arg0;
          _arg0 = data.readInt();
          this.onSuccess(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_onFail:
        {
          int _arg0;
          _arg0 = data.readInt();
          this.onFail(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_onTimeout:
        {
          this.onTimeout();
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
    private static class Proxy implements com.vfi.smartpos.deviceservice.aidl.SmartCardExSearchListener
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
       * @param cardType, refer the com/vfi/smartpos/deviceservice/constdefine/ConstISmartCardReaderEx.java, class ConstISmartCardReaderEx.CardType for defines
       * @since >= 2.0.9
       * @see ConstISmartCardReaderEx.CommType
       */
      @Override public void onSuccess(int cardType) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(cardType);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onSuccess, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * @param errorCode, -1 for error
       * @since >= 2.0.9
       */
      @Override public void onFail(int errorCode) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(errorCode);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onFail, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /** @since >= 2.0.9 */
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
    }
    static final int TRANSACTION_onSuccess = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_onFail = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_onTimeout = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
  }
  public static final java.lang.String DESCRIPTOR = "com.vfi.smartpos.deviceservice.aidl.SmartCardExSearchListener";
  /**
   * @param cardType, refer the com/vfi/smartpos/deviceservice/constdefine/ConstISmartCardReaderEx.java, class ConstISmartCardReaderEx.CardType for defines
   * @since >= 2.0.9
   * @see ConstISmartCardReaderEx.CommType
   */
  public void onSuccess(int cardType) throws android.os.RemoteException;
  /**
   * @param errorCode, -1 for error
   * @since >= 2.0.9
   */
  public void onFail(int errorCode) throws android.os.RemoteException;
  /** @since >= 2.0.9 */
  public void onTimeout() throws android.os.RemoteException;
}
