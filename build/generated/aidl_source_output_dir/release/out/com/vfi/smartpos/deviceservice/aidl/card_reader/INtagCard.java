/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.vfi.smartpos.deviceservice.aidl.card_reader;
public interface INtagCard extends android.os.IInterface
{
  /** Default implementation for INtagCard. */
  public static class Default implements com.vfi.smartpos.deviceservice.aidl.card_reader.INtagCard
  {
    /**
     * obtain Ntag Library version message
     * @return library version message
     * \en_e
     * \code{.java}
     * \endcode
     * @since later 3.1.2
     * @see
     */
    @Override public byte[] getVersion() throws android.os.RemoteException
    {
      return null;
    }
    /**
     * init NTag card(Need to reinitialize when the card is removed or powered off)
     * @return 0-success other-fail
     * @since later 3.1.2
     */
    @Override public int init() throws android.os.RemoteException
    {
      return 0;
    }
    /**
     * authenticate through pwd
     * @return 0-success other-fail
     * @since later 3.1.2
     */
    @Override public int pwdAuth(byte[] pwd) throws android.os.RemoteException
    {
      return 0;
    }
    /**
     * Read 4 pages of data (16 bytes) starting from the specified address
     * @return 4 pages of data (16 bytes) starting from the specified address
     * @since later 3.1.2
     */
    @Override public byte[] read(byte addr) throws android.os.RemoteException
    {
      return null;
    }
    /**
     * read data from addrStart to addrEnd
     * @return data of addrStart to addrEnd
     * @since later 3.1.2
     */
    @Override public byte[] fastRead(byte addrStart, byte addrEnd) throws android.os.RemoteException
    {
      return null;
    }
    /**
     * Write a page of data (4 bytes) to the specified address
     * @param  addr - Page address to be written
     * @param  dataBuf - Data to be written (4 bytes)
     * @return 0-success other-fail
     * @since later 3.1.2
     */
    @Override public int write(byte addr, byte[] dataBuf) throws android.os.RemoteException
    {
      return 0;
    }
    /**
     * Read signature data(The signature data is a 32-byte ECC data containing the chip manufacturer’s identification)
     * @return null-failed
     * @since later 3.1.2
     */
    @Override public byte[] readSig() throws android.os.RemoteException
    {
      return null;
    }
    /**
     * Read counter
     * @return null-failed
     * @since later 3.1.2
     */
    @Override public byte[] readCnt() throws android.os.RemoteException
    {
      return null;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.vfi.smartpos.deviceservice.aidl.card_reader.INtagCard
  {
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.vfi.smartpos.deviceservice.aidl.card_reader.INtagCard interface,
     * generating a proxy if needed.
     */
    public static com.vfi.smartpos.deviceservice.aidl.card_reader.INtagCard asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.vfi.smartpos.deviceservice.aidl.card_reader.INtagCard))) {
        return ((com.vfi.smartpos.deviceservice.aidl.card_reader.INtagCard)iin);
      }
      return new com.vfi.smartpos.deviceservice.aidl.card_reader.INtagCard.Stub.Proxy(obj);
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
        case TRANSACTION_getVersion:
        {
          byte[] _result = this.getVersion();
          reply.writeNoException();
          reply.writeByteArray(_result);
          break;
        }
        case TRANSACTION_init:
        {
          int _result = this.init();
          reply.writeNoException();
          reply.writeInt(_result);
          break;
        }
        case TRANSACTION_pwdAuth:
        {
          byte[] _arg0;
          _arg0 = data.createByteArray();
          int _result = this.pwdAuth(_arg0);
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
        case TRANSACTION_fastRead:
        {
          byte _arg0;
          _arg0 = data.readByte();
          byte _arg1;
          _arg1 = data.readByte();
          byte[] _result = this.fastRead(_arg0, _arg1);
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
        case TRANSACTION_readSig:
        {
          byte[] _result = this.readSig();
          reply.writeNoException();
          reply.writeByteArray(_result);
          break;
        }
        case TRANSACTION_readCnt:
        {
          byte[] _result = this.readCnt();
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
    private static class Proxy implements com.vfi.smartpos.deviceservice.aidl.card_reader.INtagCard
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
       * obtain Ntag Library version message
       * @return library version message
       * \en_e
       * \code{.java}
       * \endcode
       * @since later 3.1.2
       * @see
       */
      @Override public byte[] getVersion() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        byte[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getVersion, _data, _reply, 0);
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
       * init NTag card(Need to reinitialize when the card is removed or powered off)
       * @return 0-success other-fail
       * @since later 3.1.2
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
       * authenticate through pwd
       * @return 0-success other-fail
       * @since later 3.1.2
       */
      @Override public int pwdAuth(byte[] pwd) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(pwd);
          boolean _status = mRemote.transact(Stub.TRANSACTION_pwdAuth, _data, _reply, 0);
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
       * Read 4 pages of data (16 bytes) starting from the specified address
       * @return 4 pages of data (16 bytes) starting from the specified address
       * @since later 3.1.2
       */
      @Override public byte[] read(byte addr) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        byte[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByte(addr);
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
       * read data from addrStart to addrEnd
       * @return data of addrStart to addrEnd
       * @since later 3.1.2
       */
      @Override public byte[] fastRead(byte addrStart, byte addrEnd) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        byte[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByte(addrStart);
          _data.writeByte(addrEnd);
          boolean _status = mRemote.transact(Stub.TRANSACTION_fastRead, _data, _reply, 0);
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
       * Write a page of data (4 bytes) to the specified address
       * @param  addr - Page address to be written
       * @param  dataBuf - Data to be written (4 bytes)
       * @return 0-success other-fail
       * @since later 3.1.2
       */
      @Override public int write(byte addr, byte[] dataBuf) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByte(addr);
          _data.writeByteArray(dataBuf);
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
       * Read signature data(The signature data is a 32-byte ECC data containing the chip manufacturer’s identification)
       * @return null-failed
       * @since later 3.1.2
       */
      @Override public byte[] readSig() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        byte[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_readSig, _data, _reply, 0);
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
       * Read counter
       * @return null-failed
       * @since later 3.1.2
       */
      @Override public byte[] readCnt() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        byte[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_readCnt, _data, _reply, 0);
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
    static final int TRANSACTION_getVersion = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_init = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_pwdAuth = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_read = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_fastRead = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_write = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_readSig = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_readCnt = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
  }
  public static final java.lang.String DESCRIPTOR = "com.vfi.smartpos.deviceservice.aidl.card_reader.INtagCard";
  /**
   * obtain Ntag Library version message
   * @return library version message
   * \en_e
   * \code{.java}
   * \endcode
   * @since later 3.1.2
   * @see
   */
  public byte[] getVersion() throws android.os.RemoteException;
  /**
   * init NTag card(Need to reinitialize when the card is removed or powered off)
   * @return 0-success other-fail
   * @since later 3.1.2
   */
  public int init() throws android.os.RemoteException;
  /**
   * authenticate through pwd
   * @return 0-success other-fail
   * @since later 3.1.2
   */
  public int pwdAuth(byte[] pwd) throws android.os.RemoteException;
  /**
   * Read 4 pages of data (16 bytes) starting from the specified address
   * @return 4 pages of data (16 bytes) starting from the specified address
   * @since later 3.1.2
   */
  public byte[] read(byte addr) throws android.os.RemoteException;
  /**
   * read data from addrStart to addrEnd
   * @return data of addrStart to addrEnd
   * @since later 3.1.2
   */
  public byte[] fastRead(byte addrStart, byte addrEnd) throws android.os.RemoteException;
  /**
   * Write a page of data (4 bytes) to the specified address
   * @param  addr - Page address to be written
   * @param  dataBuf - Data to be written (4 bytes)
   * @return 0-success other-fail
   * @since later 3.1.2
   */
  public int write(byte addr, byte[] dataBuf) throws android.os.RemoteException;
  /**
   * Read signature data(The signature data is a 32-byte ECC data containing the chip manufacturer’s identification)
   * @return null-failed
   * @since later 3.1.2
   */
  public byte[] readSig() throws android.os.RemoteException;
  /**
   * Read counter
   * @return null-failed
   * @since later 3.1.2
   */
  public byte[] readCnt() throws android.os.RemoteException;
}
