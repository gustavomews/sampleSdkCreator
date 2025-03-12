/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.vfi.smartpos.deviceservice.aidl;
// Declare any non-default types here with import statements
public interface IWirelessBaseHelper extends android.os.IInterface
{
  /** Default implementation for IWirelessBaseHelper. */
  public static class Default implements com.vfi.smartpos.deviceservice.aidl.IWirelessBaseHelper
  {
    /**
     * @param bundle extend for the future
     * @return bundle
     * <ul> null or no key, value set means base is not connected, or cannot get the details
     * <li> keys are defined from ConstWirelessBase</li>
     * </ul>
     * @throws RemoteException
     */
    @Override public android.os.Bundle getBaseInfo(android.os.Bundle bundle) throws android.os.RemoteException
    {
      return null;
    }
    /**
     * @param bundle - if null or doesn't contain a key/value, then try to connect the last connected deviceInfo
     *               <ul> key - value. Keys defined from ConstWirelessBase.
     *               <li> BaseSN is requested, others are not</li>
     *               </ul>
     * @throws RemoteException
     */
    @Override public void bindBase(android.os.Bundle bundle) throws android.os.RemoteException
    {
    }
    /**
     * This API is for unbind with a base, and need set new BaseSN to bindBase with another one
     * @return
     * <ul>
     * <li>
     * </ul>
     * @throws RemoteException
     */
    @Override public int unbindBase() throws android.os.RemoteException
    {
      return 0;
    }
    /**
     * @param timeout 0~255, timeout >= 20, than it will try to connect / bind the base if no connected.
     *                otherwise, only get the connect status.
     * @param wirelessConnectListener , null for blocking the API till connected or timeout;
     *                                otherwise, it's none-blocking, and wirelessConnectListener tells the result
     * @return while none-blocking, 0 means processing;
     *         while blocking, 0 means connected, -1 for timeout, others for errors
     * 
     * @throws RemoteException
     */
    @Override public int connectStatus(int timeout, com.vfi.smartpos.deviceservice.aidl.WirelessConnectListener wirelessConnectListener) throws android.os.RemoteException
    {
      return 0;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.vfi.smartpos.deviceservice.aidl.IWirelessBaseHelper
  {
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.vfi.smartpos.deviceservice.aidl.IWirelessBaseHelper interface,
     * generating a proxy if needed.
     */
    public static com.vfi.smartpos.deviceservice.aidl.IWirelessBaseHelper asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.vfi.smartpos.deviceservice.aidl.IWirelessBaseHelper))) {
        return ((com.vfi.smartpos.deviceservice.aidl.IWirelessBaseHelper)iin);
      }
      return new com.vfi.smartpos.deviceservice.aidl.IWirelessBaseHelper.Stub.Proxy(obj);
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
        case TRANSACTION_getBaseInfo:
        {
          android.os.Bundle _arg0;
          _arg0 = _Parcel.readTypedObject(data, android.os.Bundle.CREATOR);
          android.os.Bundle _result = this.getBaseInfo(_arg0);
          reply.writeNoException();
          _Parcel.writeTypedObject(reply, _result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          break;
        }
        case TRANSACTION_bindBase:
        {
          android.os.Bundle _arg0;
          _arg0 = _Parcel.readTypedObject(data, android.os.Bundle.CREATOR);
          this.bindBase(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_unbindBase:
        {
          int _result = this.unbindBase();
          reply.writeNoException();
          reply.writeInt(_result);
          break;
        }
        case TRANSACTION_connectStatus:
        {
          int _arg0;
          _arg0 = data.readInt();
          com.vfi.smartpos.deviceservice.aidl.WirelessConnectListener _arg1;
          _arg1 = com.vfi.smartpos.deviceservice.aidl.WirelessConnectListener.Stub.asInterface(data.readStrongBinder());
          int _result = this.connectStatus(_arg0, _arg1);
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
    private static class Proxy implements com.vfi.smartpos.deviceservice.aidl.IWirelessBaseHelper
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
       * @param bundle extend for the future
       * @return bundle
       * <ul> null or no key, value set means base is not connected, or cannot get the details
       * <li> keys are defined from ConstWirelessBase</li>
       * </ul>
       * @throws RemoteException
       */
      @Override public android.os.Bundle getBaseInfo(android.os.Bundle bundle) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.os.Bundle _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _Parcel.writeTypedObject(_data, bundle, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getBaseInfo, _data, _reply, 0);
          _reply.readException();
          _result = _Parcel.readTypedObject(_reply, android.os.Bundle.CREATOR);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * @param bundle - if null or doesn't contain a key/value, then try to connect the last connected deviceInfo
       *               <ul> key - value. Keys defined from ConstWirelessBase.
       *               <li> BaseSN is requested, others are not</li>
       *               </ul>
       * @throws RemoteException
       */
      @Override public void bindBase(android.os.Bundle bundle) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _Parcel.writeTypedObject(_data, bundle, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_bindBase, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * This API is for unbind with a base, and need set new BaseSN to bindBase with another one
       * @return
       * <ul>
       * <li>
       * </ul>
       * @throws RemoteException
       */
      @Override public int unbindBase() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_unbindBase, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * @param timeout 0~255, timeout >= 20, than it will try to connect / bind the base if no connected.
       *                otherwise, only get the connect status.
       * @param wirelessConnectListener , null for blocking the API till connected or timeout;
       *                                otherwise, it's none-blocking, and wirelessConnectListener tells the result
       * @return while none-blocking, 0 means processing;
       *         while blocking, 0 means connected, -1 for timeout, others for errors
       * 
       * @throws RemoteException
       */
      @Override public int connectStatus(int timeout, com.vfi.smartpos.deviceservice.aidl.WirelessConnectListener wirelessConnectListener) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(timeout);
          _data.writeStrongInterface(wirelessConnectListener);
          boolean _status = mRemote.transact(Stub.TRANSACTION_connectStatus, _data, _reply, 0);
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
    static final int TRANSACTION_getBaseInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_bindBase = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_unbindBase = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_connectStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
  }
  public static final java.lang.String DESCRIPTOR = "com.vfi.smartpos.deviceservice.aidl.IWirelessBaseHelper";
  /**
   * @param bundle extend for the future
   * @return bundle
   * <ul> null or no key, value set means base is not connected, or cannot get the details
   * <li> keys are defined from ConstWirelessBase</li>
   * </ul>
   * @throws RemoteException
   */
  public android.os.Bundle getBaseInfo(android.os.Bundle bundle) throws android.os.RemoteException;
  /**
   * @param bundle - if null or doesn't contain a key/value, then try to connect the last connected deviceInfo
   *               <ul> key - value. Keys defined from ConstWirelessBase.
   *               <li> BaseSN is requested, others are not</li>
   *               </ul>
   * @throws RemoteException
   */
  public void bindBase(android.os.Bundle bundle) throws android.os.RemoteException;
  /**
   * This API is for unbind with a base, and need set new BaseSN to bindBase with another one
   * @return
   * <ul>
   * <li>
   * </ul>
   * @throws RemoteException
   */
  public int unbindBase() throws android.os.RemoteException;
  /**
   * @param timeout 0~255, timeout >= 20, than it will try to connect / bind the base if no connected.
   *                otherwise, only get the connect status.
   * @param wirelessConnectListener , null for blocking the API till connected or timeout;
   *                                otherwise, it's none-blocking, and wirelessConnectListener tells the result
   * @return while none-blocking, 0 means processing;
   *         while blocking, 0 means connected, -1 for timeout, others for errors
   * 
   * @throws RemoteException
   */
  public int connectStatus(int timeout, com.vfi.smartpos.deviceservice.aidl.WirelessConnectListener wirelessConnectListener) throws android.os.RemoteException;
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
