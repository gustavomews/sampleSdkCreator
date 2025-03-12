/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.vfi.smartpos.deviceservice.aidl;
/**
 *  the object of smart card (contact card, or IC card)
 * @author Kai.L@verifone.cn, Chao.L@verifone.cn
 */
public interface IInsertCardReader extends android.os.IInterface
{
  /** Default implementation for IInsertCardReader. */
  public static class Default implements com.vfi.smartpos.deviceservice.aidl.IInsertCardReader
  {
    /**
     * power up the card
     * @return true for success, false for failure
     * @since 1.x.x
     */
    @Override public boolean powerUp() throws android.os.RemoteException
    {
      return false;
    }
    /**
     * power down the card
     * @return true for success, false for failure
     * @since 1.x.x
     */
    @Override public boolean powerDown() throws android.os.RemoteException
    {
      return false;
    }
    /**
     * check if the card avalible
     * 
     * @return true for available, false for unavailable
     * @since 1.x.x
     */
    @Override public boolean isCardIn() throws android.os.RemoteException
    {
      return false;
    }
    /**
     * execute an apdu command
     * 
     * @param apdu apdu command input
     * @return response of the command, null means no response got
     * @since 1.x.x
     */
    @Override public byte[] exchangeApdu(byte[] apdu) throws android.os.RemoteException
    {
      return null;
    }
    /**
     * check if the PSAM card exist
     * @since 1.x.x
     */
    @Override public boolean isPSAMCardExists() throws android.os.RemoteException
    {
      return false;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.vfi.smartpos.deviceservice.aidl.IInsertCardReader
  {
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.vfi.smartpos.deviceservice.aidl.IInsertCardReader interface,
     * generating a proxy if needed.
     */
    public static com.vfi.smartpos.deviceservice.aidl.IInsertCardReader asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.vfi.smartpos.deviceservice.aidl.IInsertCardReader))) {
        return ((com.vfi.smartpos.deviceservice.aidl.IInsertCardReader)iin);
      }
      return new com.vfi.smartpos.deviceservice.aidl.IInsertCardReader.Stub.Proxy(obj);
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
        case TRANSACTION_powerUp:
        {
          boolean _result = this.powerUp();
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        case TRANSACTION_powerDown:
        {
          boolean _result = this.powerDown();
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        case TRANSACTION_isCardIn:
        {
          boolean _result = this.isCardIn();
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        case TRANSACTION_exchangeApdu:
        {
          byte[] _arg0;
          _arg0 = data.createByteArray();
          byte[] _result = this.exchangeApdu(_arg0);
          reply.writeNoException();
          reply.writeByteArray(_result);
          break;
        }
        case TRANSACTION_isPSAMCardExists:
        {
          boolean _result = this.isPSAMCardExists();
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static class Proxy implements com.vfi.smartpos.deviceservice.aidl.IInsertCardReader
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
       * power up the card
       * @return true for success, false for failure
       * @since 1.x.x
       */
      @Override public boolean powerUp() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_powerUp, _data, _reply, 0);
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
       * power down the card
       * @return true for success, false for failure
       * @since 1.x.x
       */
      @Override public boolean powerDown() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_powerDown, _data, _reply, 0);
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
       * check if the card avalible
       * 
       * @return true for available, false for unavailable
       * @since 1.x.x
       */
      @Override public boolean isCardIn() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_isCardIn, _data, _reply, 0);
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
       * execute an apdu command
       * 
       * @param apdu apdu command input
       * @return response of the command, null means no response got
       * @since 1.x.x
       */
      @Override public byte[] exchangeApdu(byte[] apdu) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        byte[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(apdu);
          boolean _status = mRemote.transact(Stub.TRANSACTION_exchangeApdu, _data, _reply, 0);
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
       * check if the PSAM card exist
       * @since 1.x.x
       */
      @Override public boolean isPSAMCardExists() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_isPSAMCardExists, _data, _reply, 0);
          _reply.readException();
          _result = (0!=_reply.readInt());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
    }
    static final int TRANSACTION_powerUp = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_powerDown = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_isCardIn = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_exchangeApdu = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_isPSAMCardExists = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
  }
  public static final java.lang.String DESCRIPTOR = "com.vfi.smartpos.deviceservice.aidl.IInsertCardReader";
  /**
   * power up the card
   * @return true for success, false for failure
   * @since 1.x.x
   */
  public boolean powerUp() throws android.os.RemoteException;
  /**
   * power down the card
   * @return true for success, false for failure
   * @since 1.x.x
   */
  public boolean powerDown() throws android.os.RemoteException;
  /**
   * check if the card avalible
   * 
   * @return true for available, false for unavailable
   * @since 1.x.x
   */
  public boolean isCardIn() throws android.os.RemoteException;
  /**
   * execute an apdu command
   * 
   * @param apdu apdu command input
   * @return response of the command, null means no response got
   * @since 1.x.x
   */
  public byte[] exchangeApdu(byte[] apdu) throws android.os.RemoteException;
  /**
   * check if the PSAM card exist
   * @since 1.x.x
   */
  public boolean isPSAMCardExists() throws android.os.RemoteException;
}
