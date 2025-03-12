/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.vfi.smartpos.deviceservice.aidl;
/**
 * the object of Contactless card, Mifare card, Memory card
 * @author Kai.L@verifone.cn, Chao.L@verifone.cn
 */
public interface IRFCardReader extends android.os.IInterface
{
  /** Default implementation for IRFCardReader. */
  public static class Default implements com.vfi.smartpos.deviceservice.aidl.IRFCardReader
  {
    /**
     * search card
     * 
     * @param listener the call back listener.
     * @param timeout timeout in second, should >= 1 sec
     * @since 1.x.x
     * @see com.vfi.smartpos.deviceservice.aidl.RFSearchListener
     */
    @Override public void searchCard(com.vfi.smartpos.deviceservice.aidl.RFSearchListener listener, int timeout) throws android.os.RemoteException
    {
    }
    /**
     * stop search
     * @since 1.x.x
     */
    @Override public void stopSearch() throws android.os.RemoteException
    {
    }
    /**
     * active the card
     * 
     * @param driver the driver name
     * <ul>
     * <li style="text-decoration:line-through;">"S50" - S50(M1) card</li><BR>
     * <li style="text-decoration:line-through;">"S70" - S70(M1) card</li><BR>
     * <li>"CPU" - CUP card</li><BR>
     * <li>"PRO" - PRO、S5O_PRO、S70_PRO</li><BR>
     * </ul>
     * @param responseData - the response data from the card
     * @return 0 for success, others means failure
     * @since 1.x.x
     */
    @Override public int activate(java.lang.String driver, byte[] responseData) throws android.os.RemoteException
    {
      return 0;
    }
    /**
     * same as stopSearch
     * @since 1.x.x
     */
    @Override public void halt() throws android.os.RemoteException
    {
    }
    /**
     * check the card is present
     * @return true while the card is exist, false while the card is not present
     * @since 1.x.x
     */
    @Override public boolean isExist() throws android.os.RemoteException
    {
      return false;
    }
    /**
     * exchange APDU command
     * 
     * @param apdu - the APDU
     * @return the response APDU
     * @since 1.x.x
     */
    @Override public byte[] exchangeApdu(byte[] apdu) throws android.os.RemoteException
    {
      return null;
    }
    /**
     * reset the card
     * 
     * @return the response from the card
     * @since 1.x.x
     */
    @Override public byte[] cardReset() throws android.os.RemoteException
    {
      return null;
    }
    /**
     * author the block (with given block No.)
     * 
     * @param blockNo the block No.(index) start at 0
     * @param keyType the key type, KEY_A(0) or KEY_B(1)
     * @param key     the key, length: 6
     * @return 0 means success, others while failure
     * @since 1.x.x
     */
    @Override public int authBlock(int blockNo, int keyType, byte[] key) throws android.os.RemoteException
    {
      return 0;
    }
    /**
     * author the sector ( with given sector No.)
     * 
     * @param sectorNo 	the sector No.(index) start at 0.
     * @param keyType	the key type KEY_A(0) or KEY_B(1)
     * @param key		the key, length: 6
     * @return 0 means success, others while failure
     * @since 1.x.x
     */
    @Override public int authSector(int sectorNo, int keyType, byte[] key) throws android.os.RemoteException
    {
      return 0;
    }
    /**
     * read a block
     * 
     * @param blockNo the block No.
     * @param data the data from the block, length: 16
     * @return 0 means success, others while failure
     * @since 1.x.x
     */
    @Override public int readBlock(int blockNo, byte[] data) throws android.os.RemoteException
    {
      return 0;
    }
    /**
     * write a block
     * 
     * The length MUST be 16, others will cause error
     * @param blockNo the block No.
     * @param data the source data
     * @return 0 means success, others while failure
     * @since 1.x.x
     */
    @Override public int writeBlock(int blockNo, byte[] data) throws android.os.RemoteException
    {
      return 0;
    }
    /**
     * increase value
     * 
     * <p>increase the value on given block</p>
     * @param blockNo the block No.
     * @param value the value
     * @return 0 means success, others while failure
     * @since 1.x.x
     */
    @Override public int increaseValue(int blockNo, int value) throws android.os.RemoteException
    {
      return 0;
    }
    /**
     * decrease value
     * 
     * <p>decrease the value on given block</p>
     * @param blockNo the block No.
     * @param value the value
     * @return 0 means success, others while failure
     * @since 1.x.x
     */
    @Override public int decreaseValue(int blockNo, int value) throws android.os.RemoteException
    {
      return 0;
    }
    /**
     * get card info in RFSearchListener.onCardPass callback
     * 
     * @return bundle of cardInfo
     * <ul>
     *     <li>sn(ByteArray)</li>
     *     <li>ATQA(ByteArray) support A/B card and S50 & S70 for now</li>
     *     <li>SAK(ByteArray) support A/B card and S50 & S70 for now</li>
     *     <li>cardInfo(String) all the above card's informations</li>
     * </ul>
     * @since 1.x.x
     */
    @Override public android.os.Bundle getCardInfo() throws android.os.RemoteException
    {
      return null;
    }
    /**
     * restore blockNo
     * @param blockNo the block No.
     * 
     * @return result 0x00-sucess; 0x01-blockNo error; 0x02-operate failed; 0xff-other error
     * @since 1.x.x
     */
    @Override public byte restore(byte blockNo) throws android.os.RemoteException
    {
      return 0;
    }
    /**
     * transfer blockNo
     * @param blockNo set block No.
     * 
     * @return result 0x00-sucess; 0x01-blockNo error; 0x02-operate failed; 0xff-other error
     * @since 1.x.x
     */
    @Override public byte transfer(byte blockNo) throws android.os.RemoteException
    {
      return 0;
    }
    /**
     * Close Rf Field (doesn't work from version 3.X.X)
     * @deprecated pls see stopSearch
     */
    @Override public void CloseRfField() throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.vfi.smartpos.deviceservice.aidl.IRFCardReader
  {
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.vfi.smartpos.deviceservice.aidl.IRFCardReader interface,
     * generating a proxy if needed.
     */
    public static com.vfi.smartpos.deviceservice.aidl.IRFCardReader asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.vfi.smartpos.deviceservice.aidl.IRFCardReader))) {
        return ((com.vfi.smartpos.deviceservice.aidl.IRFCardReader)iin);
      }
      return new com.vfi.smartpos.deviceservice.aidl.IRFCardReader.Stub.Proxy(obj);
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
        case TRANSACTION_searchCard:
        {
          com.vfi.smartpos.deviceservice.aidl.RFSearchListener _arg0;
          _arg0 = com.vfi.smartpos.deviceservice.aidl.RFSearchListener.Stub.asInterface(data.readStrongBinder());
          int _arg1;
          _arg1 = data.readInt();
          this.searchCard(_arg0, _arg1);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_stopSearch:
        {
          this.stopSearch();
          reply.writeNoException();
          break;
        }
        case TRANSACTION_activate:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          byte[] _arg1;
          int _arg1_length = data.readInt();
          if (_arg1_length < 0) {
            _arg1 = null;
          } else {
            _arg1 = new byte[_arg1_length];
          }
          int _result = this.activate(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg1);
          break;
        }
        case TRANSACTION_halt:
        {
          this.halt();
          reply.writeNoException();
          break;
        }
        case TRANSACTION_isExist:
        {
          boolean _result = this.isExist();
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
        case TRANSACTION_cardReset:
        {
          byte[] _result = this.cardReset();
          reply.writeNoException();
          reply.writeByteArray(_result);
          break;
        }
        case TRANSACTION_authBlock:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          byte[] _arg2;
          _arg2 = data.createByteArray();
          int _result = this.authBlock(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(_result);
          break;
        }
        case TRANSACTION_authSector:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          byte[] _arg2;
          _arg2 = data.createByteArray();
          int _result = this.authSector(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(_result);
          break;
        }
        case TRANSACTION_readBlock:
        {
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          int _arg1_length = data.readInt();
          if (_arg1_length < 0) {
            _arg1 = null;
          } else {
            _arg1 = new byte[_arg1_length];
          }
          int _result = this.readBlock(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg1);
          break;
        }
        case TRANSACTION_writeBlock:
        {
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          int _result = this.writeBlock(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          break;
        }
        case TRANSACTION_increaseValue:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          int _result = this.increaseValue(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          break;
        }
        case TRANSACTION_decreaseValue:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          int _result = this.decreaseValue(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          break;
        }
        case TRANSACTION_getCardInfo:
        {
          android.os.Bundle _result = this.getCardInfo();
          reply.writeNoException();
          _Parcel.writeTypedObject(reply, _result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          break;
        }
        case TRANSACTION_restore:
        {
          byte _arg0;
          _arg0 = data.readByte();
          byte _result = this.restore(_arg0);
          reply.writeNoException();
          reply.writeByte(_result);
          break;
        }
        case TRANSACTION_transfer:
        {
          byte _arg0;
          _arg0 = data.readByte();
          byte _result = this.transfer(_arg0);
          reply.writeNoException();
          reply.writeByte(_result);
          break;
        }
        case TRANSACTION_CloseRfField:
        {
          this.CloseRfField();
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
    private static class Proxy implements com.vfi.smartpos.deviceservice.aidl.IRFCardReader
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
       * search card
       * 
       * @param listener the call back listener.
       * @param timeout timeout in second, should >= 1 sec
       * @since 1.x.x
       * @see com.vfi.smartpos.deviceservice.aidl.RFSearchListener
       */
      @Override public void searchCard(com.vfi.smartpos.deviceservice.aidl.RFSearchListener listener, int timeout) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
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
       * stop search
       * @since 1.x.x
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
      /**
       * active the card
       * 
       * @param driver the driver name
       * <ul>
       * <li style="text-decoration:line-through;">"S50" - S50(M1) card</li><BR>
       * <li style="text-decoration:line-through;">"S70" - S70(M1) card</li><BR>
       * <li>"CPU" - CUP card</li><BR>
       * <li>"PRO" - PRO、S5O_PRO、S70_PRO</li><BR>
       * </ul>
       * @param responseData - the response data from the card
       * @return 0 for success, others means failure
       * @since 1.x.x
       */
      @Override public int activate(java.lang.String driver, byte[] responseData) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(driver);
          if ((responseData==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(responseData.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_activate, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(responseData);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * same as stopSearch
       * @since 1.x.x
       */
      @Override public void halt() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_halt, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * check the card is present
       * @return true while the card is exist, false while the card is not present
       * @since 1.x.x
       */
      @Override public boolean isExist() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_isExist, _data, _reply, 0);
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
       * exchange APDU command
       * 
       * @param apdu - the APDU
       * @return the response APDU
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
       * reset the card
       * 
       * @return the response from the card
       * @since 1.x.x
       */
      @Override public byte[] cardReset() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        byte[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_cardReset, _data, _reply, 0);
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
       * author the block (with given block No.)
       * 
       * @param blockNo the block No.(index) start at 0
       * @param keyType the key type, KEY_A(0) or KEY_B(1)
       * @param key     the key, length: 6
       * @return 0 means success, others while failure
       * @since 1.x.x
       */
      @Override public int authBlock(int blockNo, int keyType, byte[] key) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(blockNo);
          _data.writeInt(keyType);
          _data.writeByteArray(key);
          boolean _status = mRemote.transact(Stub.TRANSACTION_authBlock, _data, _reply, 0);
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
       * author the sector ( with given sector No.)
       * 
       * @param sectorNo 	the sector No.(index) start at 0.
       * @param keyType	the key type KEY_A(0) or KEY_B(1)
       * @param key		the key, length: 6
       * @return 0 means success, others while failure
       * @since 1.x.x
       */
      @Override public int authSector(int sectorNo, int keyType, byte[] key) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(sectorNo);
          _data.writeInt(keyType);
          _data.writeByteArray(key);
          boolean _status = mRemote.transact(Stub.TRANSACTION_authSector, _data, _reply, 0);
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
       * read a block
       * 
       * @param blockNo the block No.
       * @param data the data from the block, length: 16
       * @return 0 means success, others while failure
       * @since 1.x.x
       */
      @Override public int readBlock(int blockNo, byte[] data) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(blockNo);
          if ((data==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(data.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_readBlock, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(data);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * write a block
       * 
       * The length MUST be 16, others will cause error
       * @param blockNo the block No.
       * @param data the source data
       * @return 0 means success, others while failure
       * @since 1.x.x
       */
      @Override public int writeBlock(int blockNo, byte[] data) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(blockNo);
          _data.writeByteArray(data);
          boolean _status = mRemote.transact(Stub.TRANSACTION_writeBlock, _data, _reply, 0);
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
       * increase value
       * 
       * <p>increase the value on given block</p>
       * @param blockNo the block No.
       * @param value the value
       * @return 0 means success, others while failure
       * @since 1.x.x
       */
      @Override public int increaseValue(int blockNo, int value) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(blockNo);
          _data.writeInt(value);
          boolean _status = mRemote.transact(Stub.TRANSACTION_increaseValue, _data, _reply, 0);
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
       * decrease value
       * 
       * <p>decrease the value on given block</p>
       * @param blockNo the block No.
       * @param value the value
       * @return 0 means success, others while failure
       * @since 1.x.x
       */
      @Override public int decreaseValue(int blockNo, int value) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(blockNo);
          _data.writeInt(value);
          boolean _status = mRemote.transact(Stub.TRANSACTION_decreaseValue, _data, _reply, 0);
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
       * get card info in RFSearchListener.onCardPass callback
       * 
       * @return bundle of cardInfo
       * <ul>
       *     <li>sn(ByteArray)</li>
       *     <li>ATQA(ByteArray) support A/B card and S50 & S70 for now</li>
       *     <li>SAK(ByteArray) support A/B card and S50 & S70 for now</li>
       *     <li>cardInfo(String) all the above card's informations</li>
       * </ul>
       * @since 1.x.x
       */
      @Override public android.os.Bundle getCardInfo() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.os.Bundle _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getCardInfo, _data, _reply, 0);
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
       * restore blockNo
       * @param blockNo the block No.
       * 
       * @return result 0x00-sucess; 0x01-blockNo error; 0x02-operate failed; 0xff-other error
       * @since 1.x.x
       */
      @Override public byte restore(byte blockNo) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        byte _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByte(blockNo);
          boolean _status = mRemote.transact(Stub.TRANSACTION_restore, _data, _reply, 0);
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
       * transfer blockNo
       * @param blockNo set block No.
       * 
       * @return result 0x00-sucess; 0x01-blockNo error; 0x02-operate failed; 0xff-other error
       * @since 1.x.x
       */
      @Override public byte transfer(byte blockNo) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        byte _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByte(blockNo);
          boolean _status = mRemote.transact(Stub.TRANSACTION_transfer, _data, _reply, 0);
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
       * Close Rf Field (doesn't work from version 3.X.X)
       * @deprecated pls see stopSearch
       */
      @Override public void CloseRfField() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_CloseRfField, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
    }
    static final int TRANSACTION_searchCard = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_stopSearch = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_activate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_halt = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_isExist = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_exchangeApdu = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_cardReset = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_authBlock = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_authSector = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    static final int TRANSACTION_readBlock = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
    static final int TRANSACTION_writeBlock = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
    static final int TRANSACTION_increaseValue = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
    static final int TRANSACTION_decreaseValue = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
    static final int TRANSACTION_getCardInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
    static final int TRANSACTION_restore = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
    static final int TRANSACTION_transfer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
    static final int TRANSACTION_CloseRfField = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
  }
  public static final java.lang.String DESCRIPTOR = "com.vfi.smartpos.deviceservice.aidl.IRFCardReader";
  /**
   * search card
   * 
   * @param listener the call back listener.
   * @param timeout timeout in second, should >= 1 sec
   * @since 1.x.x
   * @see com.vfi.smartpos.deviceservice.aidl.RFSearchListener
   */
  public void searchCard(com.vfi.smartpos.deviceservice.aidl.RFSearchListener listener, int timeout) throws android.os.RemoteException;
  /**
   * stop search
   * @since 1.x.x
   */
  public void stopSearch() throws android.os.RemoteException;
  /**
   * active the card
   * 
   * @param driver the driver name
   * <ul>
   * <li style="text-decoration:line-through;">"S50" - S50(M1) card</li><BR>
   * <li style="text-decoration:line-through;">"S70" - S70(M1) card</li><BR>
   * <li>"CPU" - CUP card</li><BR>
   * <li>"PRO" - PRO、S5O_PRO、S70_PRO</li><BR>
   * </ul>
   * @param responseData - the response data from the card
   * @return 0 for success, others means failure
   * @since 1.x.x
   */
  public int activate(java.lang.String driver, byte[] responseData) throws android.os.RemoteException;
  /**
   * same as stopSearch
   * @since 1.x.x
   */
  public void halt() throws android.os.RemoteException;
  /**
   * check the card is present
   * @return true while the card is exist, false while the card is not present
   * @since 1.x.x
   */
  public boolean isExist() throws android.os.RemoteException;
  /**
   * exchange APDU command
   * 
   * @param apdu - the APDU
   * @return the response APDU
   * @since 1.x.x
   */
  public byte[] exchangeApdu(byte[] apdu) throws android.os.RemoteException;
  /**
   * reset the card
   * 
   * @return the response from the card
   * @since 1.x.x
   */
  public byte[] cardReset() throws android.os.RemoteException;
  /**
   * author the block (with given block No.)
   * 
   * @param blockNo the block No.(index) start at 0
   * @param keyType the key type, KEY_A(0) or KEY_B(1)
   * @param key     the key, length: 6
   * @return 0 means success, others while failure
   * @since 1.x.x
   */
  public int authBlock(int blockNo, int keyType, byte[] key) throws android.os.RemoteException;
  /**
   * author the sector ( with given sector No.)
   * 
   * @param sectorNo 	the sector No.(index) start at 0.
   * @param keyType	the key type KEY_A(0) or KEY_B(1)
   * @param key		the key, length: 6
   * @return 0 means success, others while failure
   * @since 1.x.x
   */
  public int authSector(int sectorNo, int keyType, byte[] key) throws android.os.RemoteException;
  /**
   * read a block
   * 
   * @param blockNo the block No.
   * @param data the data from the block, length: 16
   * @return 0 means success, others while failure
   * @since 1.x.x
   */
  public int readBlock(int blockNo, byte[] data) throws android.os.RemoteException;
  /**
   * write a block
   * 
   * The length MUST be 16, others will cause error
   * @param blockNo the block No.
   * @param data the source data
   * @return 0 means success, others while failure
   * @since 1.x.x
   */
  public int writeBlock(int blockNo, byte[] data) throws android.os.RemoteException;
  /**
   * increase value
   * 
   * <p>increase the value on given block</p>
   * @param blockNo the block No.
   * @param value the value
   * @return 0 means success, others while failure
   * @since 1.x.x
   */
  public int increaseValue(int blockNo, int value) throws android.os.RemoteException;
  /**
   * decrease value
   * 
   * <p>decrease the value on given block</p>
   * @param blockNo the block No.
   * @param value the value
   * @return 0 means success, others while failure
   * @since 1.x.x
   */
  public int decreaseValue(int blockNo, int value) throws android.os.RemoteException;
  /**
   * get card info in RFSearchListener.onCardPass callback
   * 
   * @return bundle of cardInfo
   * <ul>
   *     <li>sn(ByteArray)</li>
   *     <li>ATQA(ByteArray) support A/B card and S50 & S70 for now</li>
   *     <li>SAK(ByteArray) support A/B card and S50 & S70 for now</li>
   *     <li>cardInfo(String) all the above card's informations</li>
   * </ul>
   * @since 1.x.x
   */
  public android.os.Bundle getCardInfo() throws android.os.RemoteException;
  /**
   * restore blockNo
   * @param blockNo the block No.
   * 
   * @return result 0x00-sucess; 0x01-blockNo error; 0x02-operate failed; 0xff-other error
   * @since 1.x.x
   */
  public byte restore(byte blockNo) throws android.os.RemoteException;
  /**
   * transfer blockNo
   * @param blockNo set block No.
   * 
   * @return result 0x00-sucess; 0x01-blockNo error; 0x02-operate failed; 0xff-other error
   * @since 1.x.x
   */
  public byte transfer(byte blockNo) throws android.os.RemoteException;
  /**
   * Close Rf Field (doesn't work from version 3.X.X)
   * @deprecated pls see stopSearch
   */
  @Deprecated
  public void CloseRfField() throws android.os.RemoteException;
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
