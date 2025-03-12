/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.vfi.smartpos.deviceservice.aidl.card_reader;
public interface IUltraLightCard extends android.os.IInterface
{
  /** Default implementation for IUltraLightCard. */
  public static class Default implements com.vfi.smartpos.deviceservice.aidl.card_reader.IUltraLightCard
  {
    /**
     * execute write command
     * @param bAddress address of write
     * @param pData data need to write (16Byte)
     * @return 0:success other:fail
     * @since 3.10.7
     */
    @Override public int compatibilityWrite(byte bAddress, byte[] pData) throws android.os.RemoteException
    {
      return 0;
    }
    /**
     * init UltraLight card
     * @return 0:success other:fail
     * @since 3.10.7
     */
    @Override public int init() throws android.os.RemoteException
    {
      return 0;
    }
    /**
     * @param bAddress
     * @return 16 bytes data of address, other is fail
     * @since 3.10.7
     */
    @Override public byte[] read(byte bAddress) throws android.os.RemoteException
    {
      return null;
    }
    /**
     * @param bAddress address to write in
     * @param pData 4 bytes data
     * @return 0-success other-fail
     * @since 3.10.7
     */
    @Override public int write(byte bAddress, byte[] pData) throws android.os.RemoteException
    {
      return 0;
    }
    /**
     * Ultralight NANO Write signature command
     * @param bAddress address of need to write signature
     * @param pData 4 bytes data
     * @return 0-success other-fail
     * @deprecated
     */
    @Override public int writeSign(byte bAddress, byte[] pData) throws android.os.RemoteException
    {
      return 0;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.vfi.smartpos.deviceservice.aidl.card_reader.IUltraLightCard
  {
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.vfi.smartpos.deviceservice.aidl.card_reader.IUltraLightCard interface,
     * generating a proxy if needed.
     */
    public static com.vfi.smartpos.deviceservice.aidl.card_reader.IUltraLightCard asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.vfi.smartpos.deviceservice.aidl.card_reader.IUltraLightCard))) {
        return ((com.vfi.smartpos.deviceservice.aidl.card_reader.IUltraLightCard)iin);
      }
      return new com.vfi.smartpos.deviceservice.aidl.card_reader.IUltraLightCard.Stub.Proxy(obj);
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
        case TRANSACTION_compatibilityWrite:
        {
          byte _arg0;
          _arg0 = data.readByte();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          int _result = this.compatibilityWrite(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          break;
        }
        case TRANSACTION_init:
        {
          int _result = this.init();
          reply.writeNoException();
          reply.writeInt(_result);
          break;
        }
        case TRANSACTION_read:
        {
          byte _arg0;
          _arg0 = data.readByte();
          byte[] _result = this.read(_arg0);
          reply.writeNoException();
          reply.writeByteArray(_result);
          break;
        }
        case TRANSACTION_write:
        {
          byte _arg0;
          _arg0 = data.readByte();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          int _result = this.write(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          break;
        }
        case TRANSACTION_writeSign:
        {
          byte _arg0;
          _arg0 = data.readByte();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          int _result = this.writeSign(_arg0, _arg1);
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
    private static class Proxy implements com.vfi.smartpos.deviceservice.aidl.card_reader.IUltraLightCard
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
       * execute write command
       * @param bAddress address of write
       * @param pData data need to write (16Byte)
       * @return 0:success other:fail
       * @since 3.10.7
       */
      @Override public int compatibilityWrite(byte bAddress, byte[] pData) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByte(bAddress);
          _data.writeByteArray(pData);
          boolean _status = mRemote.transact(Stub.TRANSACTION_compatibilityWrite, _data, _reply, 0);
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
       * init UltraLight card
       * @return 0:success other:fail
       * @since 3.10.7
       */
      @Override public int init() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_init, _data, _reply, 0);
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
       * @param bAddress
       * @return 16 bytes data of address, other is fail
       * @since 3.10.7
       */
      @Override public byte[] read(byte bAddress) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        byte[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByte(bAddress);
          boolean _status = mRemote.transact(Stub.TRANSACTION_read, _data, _reply, 0);
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
       * @param bAddress address to write in
       * @param pData 4 bytes data
       * @return 0-success other-fail
       * @since 3.10.7
       */
      @Override public int write(byte bAddress, byte[] pData) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByte(bAddress);
          _data.writeByteArray(pData);
          boolean _status = mRemote.transact(Stub.TRANSACTION_write, _data, _reply, 0);
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
       * Ultralight NANO Write signature command
       * @param bAddress address of need to write signature
       * @param pData 4 bytes data
       * @return 0-success other-fail
       * @deprecated
       */
      @Override public int writeSign(byte bAddress, byte[] pData) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByte(bAddress);
          _data.writeByteArray(pData);
          boolean _status = mRemote.transact(Stub.TRANSACTION_writeSign, _data, _reply, 0);
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
    static final int TRANSACTION_compatibilityWrite = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_init = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_read = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_write = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_writeSign = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
  }
  public static final java.lang.String DESCRIPTOR = "com.vfi.smartpos.deviceservice.aidl.card_reader.IUltraLightCard";
  /**
   * execute write command
   * @param bAddress address of write
   * @param pData data need to write (16Byte)
   * @return 0:success other:fail
   * @since 3.10.7
   */
  public int compatibilityWrite(byte bAddress, byte[] pData) throws android.os.RemoteException;
  /**
   * init UltraLight card
   * @return 0:success other:fail
   * @since 3.10.7
   */
  public int init() throws android.os.RemoteException;
  /**
   * @param bAddress
   * @return 16 bytes data of address, other is fail
   * @since 3.10.7
   */
  public byte[] read(byte bAddress) throws android.os.RemoteException;
  /**
   * @param bAddress address to write in
   * @param pData 4 bytes data
   * @return 0-success other-fail
   * @since 3.10.7
   */
  public int write(byte bAddress, byte[] pData) throws android.os.RemoteException;
  /**
   * Ultralight NANO Write signature command
   * @param bAddress address of need to write signature
   * @param pData 4 bytes data
   * @return 0-success other-fail
   * @deprecated
   */
  @Deprecated
  public int writeSign(byte bAddress, byte[] pData) throws android.os.RemoteException;
}
