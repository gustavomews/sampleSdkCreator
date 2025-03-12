/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.vfi.smartpos.deviceservice.aidl.card_reader;
public interface IFelica extends android.os.IInterface
{
  /** Default implementation for IFelica. */
  public static class Default implements com.vfi.smartpos.deviceservice.aidl.card_reader.IFelica
  {
    /**
     * Felica power on
     * @return true on success, false on failure
     * @since 2.x.x
     */
    @Override public boolean powerOn() throws android.os.RemoteException
    {
      return false;
    }
    /**
     * Felica power off
     * @return true on success, false on failure
     * @since 2.x.x
     */
    @Override public boolean powerOff() throws android.os.RemoteException
    {
      return false;
    }
    /**
     * search card
     * 
     * @param conflictType 1-conflict slot 1 2-conflict slot 2 4-confilict slot 4 8-confilict slot 8 16-conflict slot 16
     * @param systemNumOne  System number 1, default to 0xFF, indicating the use of wildcard settings
     * @param systemNumTwo  System number 2, default to 0xFF, indicating the use of wildcard settings
     * @param requestType 0-FELICA_REQ_NO_REQUEST 1-FELICA_REQ_SYSTEM_CODE 2-FELICA_REQ_COM_PERFORMANCE
     * @param listener the call back listener
     * @param timeout timeout in ms, should >= 1000
     * @since 2.x.x
     */
    @Override public void searchCard(int conflictType, byte systemNumOne, byte systemNumTwo, int requestType, com.vfi.smartpos.deviceservice.aidl.card_reader.FelicaListener listener, int timeout) throws android.os.RemoteException
    {
    }
    /**
     * communicate command
     * 
     * @param sendData - the command
     * @return the response data
     * @since 2.x.x
     */
    @Override public byte[] communicate(byte[] sendData) throws android.os.RemoteException
    {
      return null;
    }
    /**
     * stop search card
     * @since 2.x.x
     */
    @Override public void stopSearch() throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.vfi.smartpos.deviceservice.aidl.card_reader.IFelica
  {
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.vfi.smartpos.deviceservice.aidl.card_reader.IFelica interface,
     * generating a proxy if needed.
     */
    public static com.vfi.smartpos.deviceservice.aidl.card_reader.IFelica asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.vfi.smartpos.deviceservice.aidl.card_reader.IFelica))) {
        return ((com.vfi.smartpos.deviceservice.aidl.card_reader.IFelica)iin);
      }
      return new com.vfi.smartpos.deviceservice.aidl.card_reader.IFelica.Stub.Proxy(obj);
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
        case TRANSACTION_powerOn:
        {
          boolean _result = this.powerOn();
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        case TRANSACTION_powerOff:
        {
          boolean _result = this.powerOff();
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        case TRANSACTION_searchCard:
        {
          int _arg0;
          _arg0 = data.readInt();
          byte _arg1;
          _arg1 = data.readByte();
          byte _arg2;
          _arg2 = data.readByte();
          int _arg3;
          _arg3 = data.readInt();
          com.vfi.smartpos.deviceservice.aidl.card_reader.FelicaListener _arg4;
          _arg4 = com.vfi.smartpos.deviceservice.aidl.card_reader.FelicaListener.Stub.asInterface(data.readStrongBinder());
          int _arg5;
          _arg5 = data.readInt();
          this.searchCard(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_communicate:
        {
          byte[] _arg0;
          _arg0 = data.createByteArray();
          byte[] _result = this.communicate(_arg0);
          reply.writeNoException();
          reply.writeByteArray(_result);
          break;
        }
        case TRANSACTION_stopSearch:
        {
          this.stopSearch();
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
    private static class Proxy implements com.vfi.smartpos.deviceservice.aidl.card_reader.IFelica
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
       * Felica power on
       * @return true on success, false on failure
       * @since 2.x.x
       */
      @Override public boolean powerOn() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_powerOn, _data, _reply, 0);
          _reply.readException();
          _result = (0!=_reply.readInt());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * Felica power off
       * @return true on success, false on failure
       * @since 2.x.x
       */
      @Override public boolean powerOff() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_powerOff, _data, _reply, 0);
          _reply.readException();
          _result = (0!=_reply.readInt());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * search card
       * 
       * @param conflictType 1-conflict slot 1 2-conflict slot 2 4-confilict slot 4 8-confilict slot 8 16-conflict slot 16
       * @param systemNumOne  System number 1, default to 0xFF, indicating the use of wildcard settings
       * @param systemNumTwo  System number 2, default to 0xFF, indicating the use of wildcard settings
       * @param requestType 0-FELICA_REQ_NO_REQUEST 1-FELICA_REQ_SYSTEM_CODE 2-FELICA_REQ_COM_PERFORMANCE
       * @param listener the call back listener
       * @param timeout timeout in ms, should >= 1000
       * @since 2.x.x
       */
      @Override public void searchCard(int conflictType, byte systemNumOne, byte systemNumTwo, int requestType, com.vfi.smartpos.deviceservice.aidl.card_reader.FelicaListener listener, int timeout) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(conflictType);
          _data.writeByte(systemNumOne);
          _data.writeByte(systemNumTwo);
          _data.writeInt(requestType);
          _data.writeStrongInterface(listener);
          _data.writeInt(timeout);
          boolean _status = mRemote.transact(Stub.TRANSACTION_searchCard, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * communicate command
       * 
       * @param sendData - the command
       * @return the response data
       * @since 2.x.x
       */
      @Override public byte[] communicate(byte[] sendData) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        byte[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(sendData);
          boolean _status = mRemote.transact(Stub.TRANSACTION_communicate, _data, _reply, 0);
          _reply.readException();
          _result = _reply.createByteArray();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * stop search card
       * @since 2.x.x
       */
      @Override public void stopSearch() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_stopSearch, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
    }
    static final int TRANSACTION_powerOn = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_powerOff = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_searchCard = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_communicate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_stopSearch = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
  }
  public static final java.lang.String DESCRIPTOR = "com.vfi.smartpos.deviceservice.aidl.card_reader.IFelica";
  /**
   * Felica power on
   * @return true on success, false on failure
   * @since 2.x.x
   */
  public boolean powerOn() throws android.os.RemoteException;
  /**
   * Felica power off
   * @return true on success, false on failure
   * @since 2.x.x
   */
  public boolean powerOff() throws android.os.RemoteException;
  /**
   * search card
   * 
   * @param conflictType 1-conflict slot 1 2-conflict slot 2 4-confilict slot 4 8-confilict slot 8 16-conflict slot 16
   * @param systemNumOne  System number 1, default to 0xFF, indicating the use of wildcard settings
   * @param systemNumTwo  System number 2, default to 0xFF, indicating the use of wildcard settings
   * @param requestType 0-FELICA_REQ_NO_REQUEST 1-FELICA_REQ_SYSTEM_CODE 2-FELICA_REQ_COM_PERFORMANCE
   * @param listener the call back listener
   * @param timeout timeout in ms, should >= 1000
   * @since 2.x.x
   */
  public void searchCard(int conflictType, byte systemNumOne, byte systemNumTwo, int requestType, com.vfi.smartpos.deviceservice.aidl.card_reader.FelicaListener listener, int timeout) throws android.os.RemoteException;
  /**
   * communicate command
   * 
   * @param sendData - the command
   * @return the response data
   * @since 2.x.x
   */
  public byte[] communicate(byte[] sendData) throws android.os.RemoteException;
  /**
   * stop search card
   * @since 2.x.x
   */
  public void stopSearch() throws android.os.RemoteException;
}
