/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.vfi.smartpos.deviceservice.aidl.card_reader;
// Declare any non-default types here with import statements
public interface IICodeCard extends android.os.IInterface
{
  /** Default implementation for IICodeCard. */
  public static class Default implements com.vfi.smartpos.deviceservice.aidl.card_reader.IICodeCard
  {
    /**
     * Initialize ISO15693 mode. Call this interface to switching from other modes to ISO15693 mode
     * @param  CodingType:  0-ISO15693_CODING_1_4 1-ISO15693_CODING_1_256
     * @param  ModulationType:
     *          0-ISO15693_MODULATION_PERCENT_10
     *          1-ISO15693_MODULATION_PERCENT_14
     *          2-ISO15693_MODULATION_PERCENT_20
     *          3-ISO15693_MODULATION_PERCENT_30,
     *          4-ISO15693_MODULATION_OOK
     * @return  0-success other-failed
     * 
     * @since later 3.6.0.rc0
     */
    @Override public int initialize(byte CodingType, byte ModulationType) throws android.os.RemoteException
    {
      return 0;
    }
    /**
     * Deinitialize ISO15693 mode. This function should be called every time iso 15693 is not needed any more
     * @param  keep_on: if 1 the RF field will not be switched off
     * @return  0-success other-failed
     * 
     * @since later 3.6.0.rc0
     */
    @Override public int deinitialize(byte keep_on) throws android.os.RemoteException
    {
      return 0;
    }
    /**
     * Perform an ISO15693 inventory to return all PICCs in field.
     * @param slotcnt:  Slotcount used (16 or 1)
     * @param maskLength: length of the mask if available (0 - 63)
     * @param mask: mask to use if \a maskLength is set, otherwise NULL
     * @param maxCards: maximum number of cards to return (= size of \a cards)
     * @return: success: return 13bytes otherwise return null, buffer array where found card information is stored and number of cards found and returned
     *                   1byte(number of cards found and returned)+
     *                   1byte(flag byte of response)+
     *                   1byte(Data Storage Format Identifier)+
     *                   8byte(UID of the PICC)+
     *                   2byte(CRC of response)
     * 
     * @since later 3.6.0.rc0
     */
    @Override public byte[] inventory(byte slotcnt, byte maskLength, byte[] mask, byte maxCards) throws android.os.RemoteException
    {
      return null;
    }
    /**
     * Send command 'stay quiet' to given PICC.
     * @param ProximityCard: 12bytes  PICC to be sent into quiet state.
     *                       1byte(flag byte of response)+
     *                       1byte(Data Storage Format Identifier)+
     *                       8byte(UID of the PICC)+
     *                       2byte(CRC of response)
     * @return  0: success,  other: failed
     * 
     * @since later 3.6.0.rc0
     */
    @Override public int sendStayQuiet(byte[] ProximityCard) throws android.os.RemoteException
    {
      return 0;
    }
    /**
     * Send command 'Select' to select a PICC for non-addressed mode.
     * @param ProximityCard: 12bytes  PICC to be sent into quiet state.
     *                           1byte(flag byte of response)+
     *                           1byte(Data Storage Format Identifier)+
     *                           8byte(UID of the PICC)+
     *                           2byte(CRC of response)
     * @return  0: success,  other: failed
     * 
     * @since later 3.6.0.rc0
     */
    @Override public int selectPicc(byte[] ProximityCard) throws android.os.RemoteException
    {
      return 0;
    }
    /**
     * Send command 'get system information' to retrieve information from a given or selected PICC
     * @param ProximityCard:
     *          PICC to retrieve the information from. If card is NULL then this parameter is
     *          ignored and the information is fetched from the PICC priorly selected with #SelectPicc()
     *          12bytes     1byte(flag byte of response)+
     *                      1byte(Data Storage Format Identifier)+
     *                      8byte(UID of the PICC)+
     *                      2byte(CRC of response)
     * @return  success: return 15bytes, fail: return NULL,
     *                      1byte（flag byte of response）+
     *                      1byte（info flags）+
     *                      8byte （UID of the PICC）+
     *                      1byte（Data Storage Format Identifier）+
     *                      1byte（Application Family Identifier）+
     *                      1byte（ number of blocks available）+
     *                      1byte（number of bytes per block）+
     *                      1byte（IC reference field ）
     * 
     * @since later 3.6.0.rc0
     */
    @Override public byte[] getPiccSystemInformation(byte[] ProximityCard) throws android.os.RemoteException
    {
      return null;
    }
    /**
     * Read a single block from a given or selected PICC.
     * @param ProximityCard: PICC to read the block from.
     *                If \a card is NULL then this parameter
     *                is ignored and the information is fetched from the PICC
     *                priorly selected with #SelectPicc()
     * 
     * 	           12bytes	1byte(flag byte of response)+
     *                      1byte(Data Storage Format Identifier)+
     *                      8byte(UID of the PICC)+
     *                      2byte(CRC of response)
     * @return  return 37bytes, null failed.
     *                      1byte（flag byte of response）+
     *                      1byte（errorCode）+
     *                      1byte （security status byte）+
     *                      1byte（blocknr）+
     *                      32byte（the content  data）+
     *                      1byte（ actual size of \a data）
     * 
     * @since later 3.6.0.rc0
     */
    @Override public byte[] readSingleBlock(byte[] ProximityCard) throws android.os.RemoteException
    {
      return null;
    }
    /**
     * Read a multiple blocks from a given or selected PICC.
     * @param ProximityCard: PICC to read the block from.
     *                 If \a card is NULL then this parameter
     *                 is ignored and the information is fetched from the PICC
     *                 priorly selected with #SelectPicc()
     * 
     *                12bytes	1byte(flag byte of response)+
     *                          1byte(Data Storage Format Identifier)+
     *                          8byte(UID of the PICC)+
     *                          2byte(CRC of response)
     * @param startblock: number of the first block to read out
     * @param count: number of blocks to read out.
     * @return return 37bytes, null failed.
     *                  （1byte（flag byte of response）+
     *                        1byte（errorCode）+
     *                        1byte （security status byte）+
     *                        1byte（blocknr）+
     *                        32byte（the content  data）+
     *                        1byte（ actual size of \a data）+）* count
     * 
     * @since later 3.6.0.rc0
     */
    @Override public byte[] readMultipleBlocks(byte[] ProximityCard, byte startblock, byte count) throws android.os.RemoteException
    {
      return null;
    }
    /**
     * Write a single block from a given or selected PICC.
     * @param ProximityCard: PICC to read the block from.
     *                    If \a card is NULL then this parameter
     *                    is ignored and the information is fetched from the PICC
     *                    priorly selected with #SelectPicc
     * 
     *               12bytes    1byte(flag byte of response)+
     *                          1byte(Data Storage Format Identifier)+
     *                          8byte(UID of the PICC)+
     *                          2byte(CRC of response)
     * @param flags: flags to be sent to the card.
     * @param memBlock: :  37bytes  1byte（flag byte of response）+
     *                      1byte（errorCode）+
     *                      1byte （security status byte）+
     *                      1byte（blocknr）+
     *                      32byte（the content  data）+
     *                      1byte（ actual size of \a data
     * @return  0: success,  other: failed
     * 
     * @since later 3.6.0.rc0
     */
    @Override public int writeSingleBlock(byte[] ProximityCard, byte flags, byte[] memBlock) throws android.os.RemoteException
    {
      return 0;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.vfi.smartpos.deviceservice.aidl.card_reader.IICodeCard
  {
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.vfi.smartpos.deviceservice.aidl.card_reader.IICodeCard interface,
     * generating a proxy if needed.
     */
    public static com.vfi.smartpos.deviceservice.aidl.card_reader.IICodeCard asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.vfi.smartpos.deviceservice.aidl.card_reader.IICodeCard))) {
        return ((com.vfi.smartpos.deviceservice.aidl.card_reader.IICodeCard)iin);
      }
      return new com.vfi.smartpos.deviceservice.aidl.card_reader.IICodeCard.Stub.Proxy(obj);
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
        case TRANSACTION_initialize:
        {
          byte _arg0;
          _arg0 = data.readByte();
          byte _arg1;
          _arg1 = data.readByte();
          int _result = this.initialize(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          break;
        }
        case TRANSACTION_deinitialize:
        {
          byte _arg0;
          _arg0 = data.readByte();
          int _result = this.deinitialize(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          break;
        }
        case TRANSACTION_inventory:
        {
          byte _arg0;
          _arg0 = data.readByte();
          byte _arg1;
          _arg1 = data.readByte();
          byte[] _arg2;
          _arg2 = data.createByteArray();
          byte _arg3;
          _arg3 = data.readByte();
          byte[] _result = this.inventory(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          reply.writeByteArray(_result);
          break;
        }
        case TRANSACTION_sendStayQuiet:
        {
          byte[] _arg0;
          _arg0 = data.createByteArray();
          int _result = this.sendStayQuiet(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          break;
        }
        case TRANSACTION_selectPicc:
        {
          byte[] _arg0;
          _arg0 = data.createByteArray();
          int _result = this.selectPicc(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          break;
        }
        case TRANSACTION_getPiccSystemInformation:
        {
          byte[] _arg0;
          _arg0 = data.createByteArray();
          byte[] _result = this.getPiccSystemInformation(_arg0);
          reply.writeNoException();
          reply.writeByteArray(_result);
          break;
        }
        case TRANSACTION_readSingleBlock:
        {
          byte[] _arg0;
          _arg0 = data.createByteArray();
          byte[] _result = this.readSingleBlock(_arg0);
          reply.writeNoException();
          reply.writeByteArray(_result);
          break;
        }
        case TRANSACTION_readMultipleBlocks:
        {
          byte[] _arg0;
          _arg0 = data.createByteArray();
          byte _arg1;
          _arg1 = data.readByte();
          byte _arg2;
          _arg2 = data.readByte();
          byte[] _result = this.readMultipleBlocks(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeByteArray(_result);
          break;
        }
        case TRANSACTION_writeSingleBlock:
        {
          byte[] _arg0;
          _arg0 = data.createByteArray();
          byte _arg1;
          _arg1 = data.readByte();
          byte[] _arg2;
          _arg2 = data.createByteArray();
          int _result = this.writeSingleBlock(_arg0, _arg1, _arg2);
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
    private static class Proxy implements com.vfi.smartpos.deviceservice.aidl.card_reader.IICodeCard
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
       * Initialize ISO15693 mode. Call this interface to switching from other modes to ISO15693 mode
       * @param  CodingType:  0-ISO15693_CODING_1_4 1-ISO15693_CODING_1_256
       * @param  ModulationType:
       *          0-ISO15693_MODULATION_PERCENT_10
       *          1-ISO15693_MODULATION_PERCENT_14
       *          2-ISO15693_MODULATION_PERCENT_20
       *          3-ISO15693_MODULATION_PERCENT_30,
       *          4-ISO15693_MODULATION_OOK
       * @return  0-success other-failed
       * 
       * @since later 3.6.0.rc0
       */
      @Override public int initialize(byte CodingType, byte ModulationType) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByte(CodingType);
          _data.writeByte(ModulationType);
          boolean _status = mRemote.transact(Stub.TRANSACTION_initialize, _data, _reply, 0);
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
       * Deinitialize ISO15693 mode. This function should be called every time iso 15693 is not needed any more
       * @param  keep_on: if 1 the RF field will not be switched off
       * @return  0-success other-failed
       * 
       * @since later 3.6.0.rc0
       */
      @Override public int deinitialize(byte keep_on) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByte(keep_on);
          boolean _status = mRemote.transact(Stub.TRANSACTION_deinitialize, _data, _reply, 0);
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
       * Perform an ISO15693 inventory to return all PICCs in field.
       * @param slotcnt:  Slotcount used (16 or 1)
       * @param maskLength: length of the mask if available (0 - 63)
       * @param mask: mask to use if \a maskLength is set, otherwise NULL
       * @param maxCards: maximum number of cards to return (= size of \a cards)
       * @return: success: return 13bytes otherwise return null, buffer array where found card information is stored and number of cards found and returned
       *                   1byte(number of cards found and returned)+
       *                   1byte(flag byte of response)+
       *                   1byte(Data Storage Format Identifier)+
       *                   8byte(UID of the PICC)+
       *                   2byte(CRC of response)
       * 
       * @since later 3.6.0.rc0
       */
      @Override public byte[] inventory(byte slotcnt, byte maskLength, byte[] mask, byte maxCards) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        byte[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByte(slotcnt);
          _data.writeByte(maskLength);
          _data.writeByteArray(mask);
          _data.writeByte(maxCards);
          boolean _status = mRemote.transact(Stub.TRANSACTION_inventory, _data, _reply, 0);
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
       * Send command 'stay quiet' to given PICC.
       * @param ProximityCard: 12bytes  PICC to be sent into quiet state.
       *                       1byte(flag byte of response)+
       *                       1byte(Data Storage Format Identifier)+
       *                       8byte(UID of the PICC)+
       *                       2byte(CRC of response)
       * @return  0: success,  other: failed
       * 
       * @since later 3.6.0.rc0
       */
      @Override public int sendStayQuiet(byte[] ProximityCard) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(ProximityCard);
          boolean _status = mRemote.transact(Stub.TRANSACTION_sendStayQuiet, _data, _reply, 0);
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
       * Send command 'Select' to select a PICC for non-addressed mode.
       * @param ProximityCard: 12bytes  PICC to be sent into quiet state.
       *                           1byte(flag byte of response)+
       *                           1byte(Data Storage Format Identifier)+
       *                           8byte(UID of the PICC)+
       *                           2byte(CRC of response)
       * @return  0: success,  other: failed
       * 
       * @since later 3.6.0.rc0
       */
      @Override public int selectPicc(byte[] ProximityCard) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(ProximityCard);
          boolean _status = mRemote.transact(Stub.TRANSACTION_selectPicc, _data, _reply, 0);
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
       * Send command 'get system information' to retrieve information from a given or selected PICC
       * @param ProximityCard:
       *          PICC to retrieve the information from. If card is NULL then this parameter is
       *          ignored and the information is fetched from the PICC priorly selected with #SelectPicc()
       *          12bytes     1byte(flag byte of response)+
       *                      1byte(Data Storage Format Identifier)+
       *                      8byte(UID of the PICC)+
       *                      2byte(CRC of response)
       * @return  success: return 15bytes, fail: return NULL,
       *                      1byte（flag byte of response）+
       *                      1byte（info flags）+
       *                      8byte （UID of the PICC）+
       *                      1byte（Data Storage Format Identifier）+
       *                      1byte（Application Family Identifier）+
       *                      1byte（ number of blocks available）+
       *                      1byte（number of bytes per block）+
       *                      1byte（IC reference field ）
       * 
       * @since later 3.6.0.rc0
       */
      @Override public byte[] getPiccSystemInformation(byte[] ProximityCard) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        byte[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(ProximityCard);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getPiccSystemInformation, _data, _reply, 0);
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
       * Read a single block from a given or selected PICC.
       * @param ProximityCard: PICC to read the block from.
       *                If \a card is NULL then this parameter
       *                is ignored and the information is fetched from the PICC
       *                priorly selected with #SelectPicc()
       * 
       * 	           12bytes	1byte(flag byte of response)+
       *                      1byte(Data Storage Format Identifier)+
       *                      8byte(UID of the PICC)+
       *                      2byte(CRC of response)
       * @return  return 37bytes, null failed.
       *                      1byte（flag byte of response）+
       *                      1byte（errorCode）+
       *                      1byte （security status byte）+
       *                      1byte（blocknr）+
       *                      32byte（the content  data）+
       *                      1byte（ actual size of \a data）
       * 
       * @since later 3.6.0.rc0
       */
      @Override public byte[] readSingleBlock(byte[] ProximityCard) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        byte[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(ProximityCard);
          boolean _status = mRemote.transact(Stub.TRANSACTION_readSingleBlock, _data, _reply, 0);
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
       * Read a multiple blocks from a given or selected PICC.
       * @param ProximityCard: PICC to read the block from.
       *                 If \a card is NULL then this parameter
       *                 is ignored and the information is fetched from the PICC
       *                 priorly selected with #SelectPicc()
       * 
       *                12bytes	1byte(flag byte of response)+
       *                          1byte(Data Storage Format Identifier)+
       *                          8byte(UID of the PICC)+
       *                          2byte(CRC of response)
       * @param startblock: number of the first block to read out
       * @param count: number of blocks to read out.
       * @return return 37bytes, null failed.
       *                  （1byte（flag byte of response）+
       *                        1byte（errorCode）+
       *                        1byte （security status byte）+
       *                        1byte（blocknr）+
       *                        32byte（the content  data）+
       *                        1byte（ actual size of \a data）+）* count
       * 
       * @since later 3.6.0.rc0
       */
      @Override public byte[] readMultipleBlocks(byte[] ProximityCard, byte startblock, byte count) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        byte[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(ProximityCard);
          _data.writeByte(startblock);
          _data.writeByte(count);
          boolean _status = mRemote.transact(Stub.TRANSACTION_readMultipleBlocks, _data, _reply, 0);
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
       * Write a single block from a given or selected PICC.
       * @param ProximityCard: PICC to read the block from.
       *                    If \a card is NULL then this parameter
       *                    is ignored and the information is fetched from the PICC
       *                    priorly selected with #SelectPicc
       * 
       *               12bytes    1byte(flag byte of response)+
       *                          1byte(Data Storage Format Identifier)+
       *                          8byte(UID of the PICC)+
       *                          2byte(CRC of response)
       * @param flags: flags to be sent to the card.
       * @param memBlock: :  37bytes  1byte（flag byte of response）+
       *                      1byte（errorCode）+
       *                      1byte （security status byte）+
       *                      1byte（blocknr）+
       *                      32byte（the content  data）+
       *                      1byte（ actual size of \a data
       * @return  0: success,  other: failed
       * 
       * @since later 3.6.0.rc0
       */
      @Override public int writeSingleBlock(byte[] ProximityCard, byte flags, byte[] memBlock) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(ProximityCard);
          _data.writeByte(flags);
          _data.writeByteArray(memBlock);
          boolean _status = mRemote.transact(Stub.TRANSACTION_writeSingleBlock, _data, _reply, 0);
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
    static final int TRANSACTION_initialize = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_deinitialize = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_inventory = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_sendStayQuiet = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_selectPicc = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_getPiccSystemInformation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_readSingleBlock = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_readMultipleBlocks = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_writeSingleBlock = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
  }
  public static final java.lang.String DESCRIPTOR = "com.vfi.smartpos.deviceservice.aidl.card_reader.IICodeCard";
  /**
   * Initialize ISO15693 mode. Call this interface to switching from other modes to ISO15693 mode
   * @param  CodingType:  0-ISO15693_CODING_1_4 1-ISO15693_CODING_1_256
   * @param  ModulationType:
   *          0-ISO15693_MODULATION_PERCENT_10
   *          1-ISO15693_MODULATION_PERCENT_14
   *          2-ISO15693_MODULATION_PERCENT_20
   *          3-ISO15693_MODULATION_PERCENT_30,
   *          4-ISO15693_MODULATION_OOK
   * @return  0-success other-failed
   * 
   * @since later 3.6.0.rc0
   */
  public int initialize(byte CodingType, byte ModulationType) throws android.os.RemoteException;
  /**
   * Deinitialize ISO15693 mode. This function should be called every time iso 15693 is not needed any more
   * @param  keep_on: if 1 the RF field will not be switched off
   * @return  0-success other-failed
   * 
   * @since later 3.6.0.rc0
   */
  public int deinitialize(byte keep_on) throws android.os.RemoteException;
  /**
   * Perform an ISO15693 inventory to return all PICCs in field.
   * @param slotcnt:  Slotcount used (16 or 1)
   * @param maskLength: length of the mask if available (0 - 63)
   * @param mask: mask to use if \a maskLength is set, otherwise NULL
   * @param maxCards: maximum number of cards to return (= size of \a cards)
   * @return: success: return 13bytes otherwise return null, buffer array where found card information is stored and number of cards found and returned
   *                   1byte(number of cards found and returned)+
   *                   1byte(flag byte of response)+
   *                   1byte(Data Storage Format Identifier)+
   *                   8byte(UID of the PICC)+
   *                   2byte(CRC of response)
   * 
   * @since later 3.6.0.rc0
   */
  public byte[] inventory(byte slotcnt, byte maskLength, byte[] mask, byte maxCards) throws android.os.RemoteException;
  /**
   * Send command 'stay quiet' to given PICC.
   * @param ProximityCard: 12bytes  PICC to be sent into quiet state.
   *                       1byte(flag byte of response)+
   *                       1byte(Data Storage Format Identifier)+
   *                       8byte(UID of the PICC)+
   *                       2byte(CRC of response)
   * @return  0: success,  other: failed
   * 
   * @since later 3.6.0.rc0
   */
  public int sendStayQuiet(byte[] ProximityCard) throws android.os.RemoteException;
  /**
   * Send command 'Select' to select a PICC for non-addressed mode.
   * @param ProximityCard: 12bytes  PICC to be sent into quiet state.
   *                           1byte(flag byte of response)+
   *                           1byte(Data Storage Format Identifier)+
   *                           8byte(UID of the PICC)+
   *                           2byte(CRC of response)
   * @return  0: success,  other: failed
   * 
   * @since later 3.6.0.rc0
   */
  public int selectPicc(byte[] ProximityCard) throws android.os.RemoteException;
  /**
   * Send command 'get system information' to retrieve information from a given or selected PICC
   * @param ProximityCard:
   *          PICC to retrieve the information from. If card is NULL then this parameter is
   *          ignored and the information is fetched from the PICC priorly selected with #SelectPicc()
   *          12bytes     1byte(flag byte of response)+
   *                      1byte(Data Storage Format Identifier)+
   *                      8byte(UID of the PICC)+
   *                      2byte(CRC of response)
   * @return  success: return 15bytes, fail: return NULL,
   *                      1byte（flag byte of response）+
   *                      1byte（info flags）+
   *                      8byte （UID of the PICC）+
   *                      1byte（Data Storage Format Identifier）+
   *                      1byte（Application Family Identifier）+
   *                      1byte（ number of blocks available）+
   *                      1byte（number of bytes per block）+
   *                      1byte（IC reference field ）
   * 
   * @since later 3.6.0.rc0
   */
  public byte[] getPiccSystemInformation(byte[] ProximityCard) throws android.os.RemoteException;
  /**
   * Read a single block from a given or selected PICC.
   * @param ProximityCard: PICC to read the block from.
   *                If \a card is NULL then this parameter
   *                is ignored and the information is fetched from the PICC
   *                priorly selected with #SelectPicc()
   * 
   * 	           12bytes	1byte(flag byte of response)+
   *                      1byte(Data Storage Format Identifier)+
   *                      8byte(UID of the PICC)+
   *                      2byte(CRC of response)
   * @return  return 37bytes, null failed.
   *                      1byte（flag byte of response）+
   *                      1byte（errorCode）+
   *                      1byte （security status byte）+
   *                      1byte（blocknr）+
   *                      32byte（the content  data）+
   *                      1byte（ actual size of \a data）
   * 
   * @since later 3.6.0.rc0
   */
  public byte[] readSingleBlock(byte[] ProximityCard) throws android.os.RemoteException;
  /**
   * Read a multiple blocks from a given or selected PICC.
   * @param ProximityCard: PICC to read the block from.
   *                 If \a card is NULL then this parameter
   *                 is ignored and the information is fetched from the PICC
   *                 priorly selected with #SelectPicc()
   * 
   *                12bytes	1byte(flag byte of response)+
   *                          1byte(Data Storage Format Identifier)+
   *                          8byte(UID of the PICC)+
   *                          2byte(CRC of response)
   * @param startblock: number of the first block to read out
   * @param count: number of blocks to read out.
   * @return return 37bytes, null failed.
   *                  （1byte（flag byte of response）+
   *                        1byte（errorCode）+
   *                        1byte （security status byte）+
   *                        1byte（blocknr）+
   *                        32byte（the content  data）+
   *                        1byte（ actual size of \a data）+）* count
   * 
   * @since later 3.6.0.rc0
   */
  public byte[] readMultipleBlocks(byte[] ProximityCard, byte startblock, byte count) throws android.os.RemoteException;
  /**
   * Write a single block from a given or selected PICC.
   * @param ProximityCard: PICC to read the block from.
   *                    If \a card is NULL then this parameter
   *                    is ignored and the information is fetched from the PICC
   *                    priorly selected with #SelectPicc
   * 
   *               12bytes    1byte(flag byte of response)+
   *                          1byte(Data Storage Format Identifier)+
   *                          8byte(UID of the PICC)+
   *                          2byte(CRC of response)
   * @param flags: flags to be sent to the card.
   * @param memBlock: :  37bytes  1byte（flag byte of response）+
   *                      1byte（errorCode）+
   *                      1byte （security status byte）+
   *                      1byte（blocknr）+
   *                      32byte（the content  data）+
   *                      1byte（ actual size of \a data
   * @return  0: success,  other: failed
   * 
   * @since later 3.6.0.rc0
   */
  public int writeSingleBlock(byte[] ProximityCard, byte flags, byte[] memBlock) throws android.os.RemoteException;
}
