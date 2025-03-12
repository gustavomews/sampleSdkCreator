/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.vfi.smartpos.deviceservice.aidl.card_reader;
public interface IUltraLightCardEV1 extends android.os.IInterface
{
  /** Default implementation for IUltraLightCardEV1. */
  public static class Default implements com.vfi.smartpos.deviceservice.aidl.card_reader.IUltraLightCardEV1
  {
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
     * Ultralight get version
     * @return get version
     * @since 3.10.7
     */
    @Override public java.lang.String getVersion() throws android.os.RemoteException
    {
      return null;
    }
    /**
     * Ultralight EV1 check Tearing event
     * @param bCntNum counter number(0~2)
     * @return One-byte address containing the valid flag byte (the valid flag for normal operation is BD), other is failed
     * @since 3.10.7
     */
    @Override public byte chkTearingEvent(byte bCntNum) throws android.os.RemoteException
    {
      return 0;
    }
    /**
     * Ultralight EV1 Fast read
     * @param bStartAddr start address of read data
     * @param bEndAddr end address of read data
     * @return data,
     * @since 3.10.7
     */
    @Override public byte[] fastRead(byte bStartAddr, byte bEndAddr) throws android.os.RemoteException
    {
      return null;
    }
    /**
     * Ultralight EV1 Increment count
     * @param bCntNum count number
     * @param pCnt 4byte data of count number, low first.
     * @return 0:success other:fail
     * @since 3.10.7
     */
    @Override public int incrCnt(byte bCntNum, byte[] pCnt) throws android.os.RemoteException
    {
      return 0;
    }
    /**
     * @param pPwd 4bytes PW data
     * @return 2bytes PACK data, failed is NULL
     * @since 3.10.7
     */
    @Override public byte[] pwdAuth(byte[] pPwd) throws android.os.RemoteException
    {
      return null;
    }
    /**
     * @param bCntNum counter number
     * @return 3 bytes data of counter,low first, other is fail
     * @since 3.10.7
     */
    @Override public byte[] readCnt(byte bCntNum) throws android.os.RemoteException
    {
      return null;
    }
    /**
     * Ultralight EV1 read signature command
     * @param bAddr addr is always 0x00
     * @return 32 bytes data, other is fail
     * @since 3.10.7
     */
    @Override public byte[] readSign(byte bAddr) throws android.os.RemoteException
    {
      return null;
    }
    /**
     * Ultralight EV1 Virtual Card Select Command
     * @param pVCIIDbyte data use to select VC
     * @param bVCIIDLen data of length
     * @return 0-success other-fail
     * @since 3.10.7
     */
    @Override public int virtualCardSelect(byte[] pVCIIDbyte, byte bVCIIDLen) throws android.os.RemoteException
    {
      return 0;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.vfi.smartpos.deviceservice.aidl.card_reader.IUltraLightCardEV1
  {
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.vfi.smartpos.deviceservice.aidl.card_reader.IUltraLightCardEV1 interface,
     * generating a proxy if needed.
     */
    public static com.vfi.smartpos.deviceservice.aidl.card_reader.IUltraLightCardEV1 asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.vfi.smartpos.deviceservice.aidl.card_reader.IUltraLightCardEV1))) {
        return ((com.vfi.smartpos.deviceservice.aidl.card_reader.IUltraLightCardEV1)iin);
      }
      return new com.vfi.smartpos.deviceservice.aidl.card_reader.IUltraLightCardEV1.Stub.Proxy(obj);
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
        case TRANSACTION_init:
        {
          int _result = this.init();
          reply.writeNoException();
          reply.writeInt(_result);
          break;
        }
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
        case TRANSACTION_getVersion:
        {
          java.lang.String _result = this.getVersion();
          reply.writeNoException();
          reply.writeString(_result);
          break;
        }
        case TRANSACTION_chkTearingEvent:
        {
          byte _arg0;
          _arg0 = data.readByte();
          byte _result = this.chkTearingEvent(_arg0);
          reply.writeNoException();
          reply.writeByte(_result);
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
        case TRANSACTION_incrCnt:
        {
          byte _arg0;
          _arg0 = data.readByte();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          int _result = this.incrCnt(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          break;
        }
        case TRANSACTION_pwdAuth:
        {
          byte[] _arg0;
          _arg0 = data.createByteArray();
          byte[] _result = this.pwdAuth(_arg0);
          reply.writeNoException();
          reply.writeByteArray(_result);
          break;
        }
        case TRANSACTION_readCnt:
        {
          byte _arg0;
          _arg0 = data.readByte();
          byte[] _result = this.readCnt(_arg0);
          reply.writeNoException();
          reply.writeByteArray(_result);
          break;
        }
        case TRANSACTION_readSign:
        {
          byte _arg0;
          _arg0 = data.readByte();
          byte[] _result = this.readSign(_arg0);
          reply.writeNoException();
          reply.writeByteArray(_result);
          break;
        }
        case TRANSACTION_virtualCardSelect:
        {
          byte[] _arg0;
          _arg0 = data.createByteArray();
          byte _arg1;
          _arg1 = data.readByte();
          int _result = this.virtualCardSelect(_arg0, _arg1);
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
    private static class Proxy implements com.vfi.smartpos.deviceservice.aidl.card_reader.IUltraLightCardEV1
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
       * Ultralight get version
       * @return get version
       * @since 3.10.7
       */
      @Override public java.lang.String getVersion() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getVersion, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readString();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * Ultralight EV1 check Tearing event
       * @param bCntNum counter number(0~2)
       * @return One-byte address containing the valid flag byte (the valid flag for normal operation is BD), other is failed
       * @since 3.10.7
       */
      @Override public byte chkTearingEvent(byte bCntNum) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        byte _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByte(bCntNum);
          boolean _status = mRemote.transact(Stub.TRANSACTION_chkTearingEvent, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readByte();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * Ultralight EV1 Fast read
       * @param bStartAddr start address of read data
       * @param bEndAddr end address of read data
       * @return data,
       * @since 3.10.7
       */
      @Override public byte[] fastRead(byte bStartAddr, byte bEndAddr) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        byte[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByte(bStartAddr);
          _data.writeByte(bEndAddr);
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
       * Ultralight EV1 Increment count
       * @param bCntNum count number
       * @param pCnt 4byte data of count number, low first.
       * @return 0:success other:fail
       * @since 3.10.7
       */
      @Override public int incrCnt(byte bCntNum, byte[] pCnt) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByte(bCntNum);
          _data.writeByteArray(pCnt);
          boolean _status = mRemote.transact(Stub.TRANSACTION_incrCnt, _data, _reply, 0);
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
       * @param pPwd 4bytes PW data
       * @return 2bytes PACK data, failed is NULL
       * @since 3.10.7
       */
      @Override public byte[] pwdAuth(byte[] pPwd) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        byte[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(pPwd);
          boolean _status = mRemote.transact(Stub.TRANSACTION_pwdAuth, _data, _reply, 0);
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
       * @param bCntNum counter number
       * @return 3 bytes data of counter,low first, other is fail
       * @since 3.10.7
       */
      @Override public byte[] readCnt(byte bCntNum) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        byte[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByte(bCntNum);
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
      /**
       * Ultralight EV1 read signature command
       * @param bAddr addr is always 0x00
       * @return 32 bytes data, other is fail
       * @since 3.10.7
       */
      @Override public byte[] readSign(byte bAddr) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        byte[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByte(bAddr);
          boolean _status = mRemote.transact(Stub.TRANSACTION_readSign, _data, _reply, 0);
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
       * Ultralight EV1 Virtual Card Select Command
       * @param pVCIIDbyte data use to select VC
       * @param bVCIIDLen data of length
       * @return 0-success other-fail
       * @since 3.10.7
       */
      @Override public int virtualCardSelect(byte[] pVCIIDbyte, byte bVCIIDLen) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(pVCIIDbyte);
          _data.writeByte(bVCIIDLen);
          boolean _status = mRemote.transact(Stub.TRANSACTION_virtualCardSelect, _data, _reply, 0);
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
    static final int TRANSACTION_init = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_compatibilityWrite = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_read = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_write = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_getVersion = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_chkTearingEvent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_fastRead = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_incrCnt = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_pwdAuth = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    static final int TRANSACTION_readCnt = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
    static final int TRANSACTION_readSign = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
    static final int TRANSACTION_virtualCardSelect = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
  }
  public static final java.lang.String DESCRIPTOR = "com.vfi.smartpos.deviceservice.aidl.card_reader.IUltraLightCardEV1";
  /**
   * init UltraLight card
   * @return 0:success other:fail
   * @since 3.10.7
   */
  public int init() throws android.os.RemoteException;
  /**
   * execute write command
   * @param bAddress address of write
   * @param pData data need to write (16Byte)
   * @return 0:success other:fail
   * @since 3.10.7
   */
  public int compatibilityWrite(byte bAddress, byte[] pData) throws android.os.RemoteException;
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
   * Ultralight get version
   * @return get version
   * @since 3.10.7
   */
  public java.lang.String getVersion() throws android.os.RemoteException;
  /**
   * Ultralight EV1 check Tearing event
   * @param bCntNum counter number(0~2)
   * @return One-byte address containing the valid flag byte (the valid flag for normal operation is BD), other is failed
   * @since 3.10.7
   */
  public byte chkTearingEvent(byte bCntNum) throws android.os.RemoteException;
  /**
   * Ultralight EV1 Fast read
   * @param bStartAddr start address of read data
   * @param bEndAddr end address of read data
   * @return data,
   * @since 3.10.7
   */
  public byte[] fastRead(byte bStartAddr, byte bEndAddr) throws android.os.RemoteException;
  /**
   * Ultralight EV1 Increment count
   * @param bCntNum count number
   * @param pCnt 4byte data of count number, low first.
   * @return 0:success other:fail
   * @since 3.10.7
   */
  public int incrCnt(byte bCntNum, byte[] pCnt) throws android.os.RemoteException;
  /**
   * @param pPwd 4bytes PW data
   * @return 2bytes PACK data, failed is NULL
   * @since 3.10.7
   */
  public byte[] pwdAuth(byte[] pPwd) throws android.os.RemoteException;
  /**
   * @param bCntNum counter number
   * @return 3 bytes data of counter,low first, other is fail
   * @since 3.10.7
   */
  public byte[] readCnt(byte bCntNum) throws android.os.RemoteException;
  /**
   * Ultralight EV1 read signature command
   * @param bAddr addr is always 0x00
   * @return 32 bytes data, other is fail
   * @since 3.10.7
   */
  public byte[] readSign(byte bAddr) throws android.os.RemoteException;
  /**
   * Ultralight EV1 Virtual Card Select Command
   * @param pVCIIDbyte data use to select VC
   * @param bVCIIDLen data of length
   * @return 0-success other-fail
   * @since 3.10.7
   */
  public int virtualCardSelect(byte[] pVCIIDbyte, byte bVCIIDLen) throws android.os.RemoteException;
}
