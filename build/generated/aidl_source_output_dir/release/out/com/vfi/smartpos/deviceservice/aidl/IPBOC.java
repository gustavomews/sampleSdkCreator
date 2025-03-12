/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.vfi.smartpos.deviceservice.aidl;
/**
 * PBOC(EMV) object for processing EMV
 * @author Kai.L@verifone.cn, Chao.L@verifone.cn
 */
public interface IPBOC extends android.os.IInterface
{
  /** Default implementation for IPBOC. */
  public static class Default implements com.vfi.smartpos.deviceservice.aidl.IPBOC
  {
    /**
     * check card, non-block method
     * 
     * @param cardOption the card type (list)
     * <ul>
     * <li>supportMagCard(boolean) support magnetic card</li>
     * <li>supportICCard(boolean) support IC card</li>
     * <li>supportRFCard(boolean) support CTLS card</li>
     * </ul>
     * @param timeout the time out(seconds)
     * @param listener the listerner while found card
     * @since 1.x.x
     */
    @Override public void checkCard(android.os.Bundle cardOption, int timeout, com.vfi.smartpos.deviceservice.aidl.CheckCardListener listener) throws android.os.RemoteException
    {
    }
    /**
     * stop check card
     * @since 1.x.x
     */
    @Override public void stopCheckCard() throws android.os.RemoteException
    {
    }
    /**
     * read UP ( chip in SIM ) card
     * @param listener the listern of the result
     * @since 1.x.x
     */
    @Override public void readUPCard(com.vfi.smartpos.deviceservice.aidl.UPCardListener listener) throws android.os.RemoteException
    {
    }
    /**
     * start PBOC process
     * 
     * @param transType transaction type
     * <ul>
     * <li>EC_BALANCE(1) query the balance</li>
     * <li>TRANSFER(2) transfer</li>
     * <li>EC_LOAD(3) EC LOAD</li>
     * <li>EC_LOAD_U(4) EC LOAD without assign account</li>
     * <li>EC_LOAD_CASH(5) EC LOAD with CASH</li>
     * <li>EC_LOAD_CASH_VOID(6) EC LOAD with CASH void</li>
     * <li>PURCHASE(7) purchase</li>
     * <li>Q_PURCHASE(8) quick purchase</li>
     * <li>CHECK_BALANCE(9) get balance</li>
     * <li>PRE_AUTH(10) pre-authorization</li>
     * <li>SALE_VOID(11) sale void</li>
     * <li>SIMPLE_PROCESS(12) simplye process</li>
     * <li>REFUND(13) - refund(full process)</li>
     * </ul>
     * @param intent request setting
     * <ul>
     * <li>cardType(int) card type
     *         * CARD_INSERT(0)- samrt IC card
     *         * CARD_RF(1)- CTLS card 非接触式卡 </li>
     * <li>authAmount(long): auth-amount (transaction amount) </li>
     * <li>isSupportQ(boolean): is support QPBOC </li>
     * <li>isSupportSM(boolean): is support SM </li>
     * <li>isQPBOCForceOnline(boolean): is QPBOC force online </li>
     * <li>merchantName(String):merchant Name </li>
     * <li>merchantId(String): merchant ID </li>
     * <li>terminalId(String):terminal ID </li>
     * </ul>
     * @param handler the call back handler, please refer PBOCHandler
     * @since 1.x.x
     */
    @Override public void startPBOC(int transType, android.os.Bundle intent, com.vfi.smartpos.deviceservice.aidl.PBOCHandler handler) throws android.os.RemoteException
    {
    }
    /**
     * start EMV process
     * 
     * @param processType process type
     * <ul>
     * <li>1：full process</li>
     * <li>2：simple process</li>
     * </ul>
     * @param intent request setting
     * <ul>
     * <li>cardType(int): card type
     *      * CARD_INSERT(0)- smart IC card
     *      * CARD_RF(1)- CTLS card </li>
     * <li>transProcessCode(byte): (1Byte) Translation type (9C first two digits of the ISO 8583:1987 Processing Code)</li>
     * <li>authAmount(long): auth-amount (transaction amount)</li>
     * <li>isSupportQ(boolean): is support QPBOC </li>
     * <li>isSupportSM(boolean): is support SM </li>
     * <li>isQPBOCForceOnline(boolean): is QPBOC force online </li>
     * <li>merchantName(String):merchant Name </li>
     * <li>merchantId(String): merchant ID </li>
     * <li>terminalId(String):terminal ID </li>
     * </ul>
     * @param handler the call back handler, please refer PBOCHandler
     * @since 1.x.x
     */
    @Override public void startEMV(int processType, android.os.Bundle intent, com.vfi.smartpos.deviceservice.aidl.PBOCHandler handler) throws android.os.RemoteException
    {
    }
    /**
     * stop PBOC(EMV)
     * @since 1.x.x
     */
    @Override public void abortPBOC() throws android.os.RemoteException
    {
    }
    /**
     * update AID parameter
     * 
     * @param operation the setting
     * <ul>
     * <li>1：append</li>
     * <li>2：remove</li>
     * <li>3：clear all</li>
     * </ul>
     * @param aidType type of AID parameter
     * <ul>
     * <li>1：contact(smart card)</li>
     * <li>2：contactless</li>
     * </ul>
     * @param aid the AID parameter
     * @return result, true on success, false on failure
     * @since 1.x.x
     */
    @Override public boolean updateAID(int operation, int aidType, java.lang.String aid) throws android.os.RemoteException
    {
      return false;
    }
    /**
     * update CA public KEY
     * 
     * @param operation the setting
     * <ul>
     * <li>1：append</li>
     * <li>2：remove</li>
     * <li>3：clear all</li>
     * </ul>
     * @param rid the CA public KEY
     * @return true on success, false on failure
     * @since 1.x.x
     */
    @Override public boolean updateRID(int operation, java.lang.String rid) throws android.os.RemoteException
    {
      return false;
    }
    /**
     * import amount
     * 
     * There is nothing in this method. The amount should be set while call the startEMV.
     * @param amount the amount
     * @since 1.x.x
     * @Deprecated
     */
    @Override public void importAmount(long amount) throws android.os.RemoteException
    {
    }
    /**
     * select application (multi-application card)
     * 
     * @param index the index of application, start from 1, and 0 means cancel
     * @since 1.x.x
     */
    @Override public void importAppSelect(int index) throws android.os.RemoteException
    {
    }
    /**
     * import the PIN
     * 
     * @param option(int) - 操作选项 | the option
     * <ul>
     * <li> CANCEL(0) cancel</li>
     * <li> CONFIRM(1) confirm</li>
     * </ul>
     * @param pin the PIN data
     * @since 1.x.x
     */
    @Override public void importPin(int option, byte[] pin) throws android.os.RemoteException
    {
    }
    /**
     * import the result of card hodler verification
     * 
     * @param option the option
     * <ul>
     * <li> CANCEL(0) cancel ( BYPASS )</li>
     * <li> CONFIRM(1) confirm</li>
     * <li> NOTMATCH(2) not match</li>
     * </ul>
     * @since 1.x.x
     */
    @Override public void importCertConfirmResult(int option) throws android.os.RemoteException
    {
    }
    /**
     * import the result of card verification
     * 
     * @param pass true on pass, false on error
     * @since 1.x.x
     */
    @Override public void importCardConfirmResult(boolean pass) throws android.os.RemoteException
    {
    }
    /**
     * import(input) the online response
     * 
     * @param onlineResult - the result ( response )
     * <ul>
     * <li> isOnline(boolean)is online</li>
     * <li> respCode(String) the response code</li>
     * <li> authCode(String) the authorize code</li>
     * <li> field55(String) the response of field 55 data</li>
     * </ul>
     * @param handler the result , please refer OnlineResultHandler
     * @since 1.x.x
     */
    @Override public void inputOnlineResult(android.os.Bundle onlineResult, com.vfi.smartpos.deviceservice.aidl.OnlineResultHandler handler) throws android.os.RemoteException
    {
    }
    /**
     * set EMV (kernel) data
     * 
     * before start emv flow, you can set the data
     * @param tlvList the TLV list
     * Support set following tag. If AID list have the same tag, aid list priority over this interface.<BR>
     * <pre>
     * Such as below tag:
     * 9F33：
     * 9F15：
     * 9F16：
     * 9F4E：
     * 9F1C：
     * 9F35：
     * 9F3C：
     * 9F3D：
     * 5F2A：
     * 5F36：
     * 9F1A：
     * 9F40：
     * </pre>
     * @since 1.x.x
     */
    @Override public void setEMVData(java.util.List<java.lang.String> tlvList) throws android.os.RemoteException
    {
    }
    /**
     * get kernal data list in Tag-Length-Value format
     * 
     * @param taglist the tag list want query
     * @return the response in TLV format, null means no response got
     * @since 1.x.x
     * <pre>
     * {
     *    String[] strlist = {"9F33", "9F40", "9F10", "9F26", "95", "9F37", "9F1E", "9F36",
     *            "82", "9F1A", "9A", "9B", "50", "84", "5F2A", "8F"};
     *    String strs = ipboc.getAppTLVList(strlist);
     * }
     * </pre>
     */
    @Override public java.lang.String getAppTLVList(java.lang.String[] taglist) throws android.os.RemoteException
    {
      return null;
    }
    /**
     * get card (emv) data by tag
     * 
     * @param tagName the tag name
     * @return the emv data got
     * @since 1.x.x
     */
    @Override public byte[] getCardData(java.lang.String tagName) throws android.os.RemoteException
    {
      return null;
    }
    /**
     * get PBOC(EMV) data
     * 
     * such as card number, valid dtae, card serial number, etc.
     * <em> will return null if the data is not avalible at the current EMV process</em>
     * @param tagName tag name
     * <ul>
     * <li> PAN card No.</li>
     * <li> TRACK2 track No.2</li>
     * <li> CARD_SN card SN (Serial Number)</li>
     * <li> EXPIRED_DATE expried date</li>
     * <li> DATE date</li>
     * <li> TIME time</li>
     * <li> BALANCE balance</li>
     * <li> CURRENCY currency</li>
     * </ul>
     * @return the return data of PBOC
     * @since 1.x.x
     */
    @Override public java.lang.String getPBOCData(java.lang.String tagName) throws android.os.RemoteException
    {
      return null;
    }
    /**
     * get the candidate application information
     * 
     * for upload the e-signature
     * @return the application information, please refer CandidateAppInfo
     * @since 1.x.x
     */
    @Override public com.vfi.smartpos.deviceservice.aidl.CandidateAppInfo getCandidateAppInfo() throws android.os.RemoteException
    {
      return null;
    }
    /**
     * get the AID parameter
     * 
     * @param type - 1-contact aid  2-contactless aid
     * @return null if the AID is unavailable
     * @since 1.x.x
     */
    @Override public java.lang.String[] getAID(int type) throws android.os.RemoteException
    {
      return null;
    }
    /**
     * get the RID
     * 
     * @return null if the RID is unavailable
     * @since 1.x.x
     */
    @Override public java.lang.String[] getRID() throws android.os.RemoteException
    {
      return null;
    }
    /**
     * Obtain the CTLS card type(In onRequestOnlineProcess callback you can use this interface to obtain the CTLS card type)
     * @return
     *   0-No Type<BR>
     *   1-JCB_CHIP<BR>
     *   2-JCB_MSD<BR>
     *   3-JCB_Legcy<BR>
     *   4-VISA_w1<BR>
     *   5-VISA_w3<BR>
     *   6-Master_EMV<BR>
     *   7-Master_MSD<BR>
     *   8-qPBOC_qUICS<BR>
     * @since 1.x.x
     * @deprecated
     */
    @Override public int getProcessCardType() throws android.os.RemoteException
    {
      return 0;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.vfi.smartpos.deviceservice.aidl.IPBOC
  {
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.vfi.smartpos.deviceservice.aidl.IPBOC interface,
     * generating a proxy if needed.
     */
    public static com.vfi.smartpos.deviceservice.aidl.IPBOC asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.vfi.smartpos.deviceservice.aidl.IPBOC))) {
        return ((com.vfi.smartpos.deviceservice.aidl.IPBOC)iin);
      }
      return new com.vfi.smartpos.deviceservice.aidl.IPBOC.Stub.Proxy(obj);
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
        case TRANSACTION_checkCard:
        {
          android.os.Bundle _arg0;
          _arg0 = _Parcel.readTypedObject(data, android.os.Bundle.CREATOR);
          int _arg1;
          _arg1 = data.readInt();
          com.vfi.smartpos.deviceservice.aidl.CheckCardListener _arg2;
          _arg2 = com.vfi.smartpos.deviceservice.aidl.CheckCardListener.Stub.asInterface(data.readStrongBinder());
          this.checkCard(_arg0, _arg1, _arg2);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_stopCheckCard:
        {
          this.stopCheckCard();
          reply.writeNoException();
          break;
        }
        case TRANSACTION_readUPCard:
        {
          com.vfi.smartpos.deviceservice.aidl.UPCardListener _arg0;
          _arg0 = com.vfi.smartpos.deviceservice.aidl.UPCardListener.Stub.asInterface(data.readStrongBinder());
          this.readUPCard(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_startPBOC:
        {
          int _arg0;
          _arg0 = data.readInt();
          android.os.Bundle _arg1;
          _arg1 = _Parcel.readTypedObject(data, android.os.Bundle.CREATOR);
          com.vfi.smartpos.deviceservice.aidl.PBOCHandler _arg2;
          _arg2 = com.vfi.smartpos.deviceservice.aidl.PBOCHandler.Stub.asInterface(data.readStrongBinder());
          this.startPBOC(_arg0, _arg1, _arg2);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_startEMV:
        {
          int _arg0;
          _arg0 = data.readInt();
          android.os.Bundle _arg1;
          _arg1 = _Parcel.readTypedObject(data, android.os.Bundle.CREATOR);
          com.vfi.smartpos.deviceservice.aidl.PBOCHandler _arg2;
          _arg2 = com.vfi.smartpos.deviceservice.aidl.PBOCHandler.Stub.asInterface(data.readStrongBinder());
          this.startEMV(_arg0, _arg1, _arg2);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_abortPBOC:
        {
          this.abortPBOC();
          reply.writeNoException();
          break;
        }
        case TRANSACTION_updateAID:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          java.lang.String _arg2;
          _arg2 = data.readString();
          boolean _result = this.updateAID(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        case TRANSACTION_updateRID:
        {
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          boolean _result = this.updateRID(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        case TRANSACTION_importAmount:
        {
          long _arg0;
          _arg0 = data.readLong();
          this.importAmount(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_importAppSelect:
        {
          int _arg0;
          _arg0 = data.readInt();
          this.importAppSelect(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_importPin:
        {
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          this.importPin(_arg0, _arg1);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_importCertConfirmResult:
        {
          int _arg0;
          _arg0 = data.readInt();
          this.importCertConfirmResult(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_importCardConfirmResult:
        {
          boolean _arg0;
          _arg0 = (0!=data.readInt());
          this.importCardConfirmResult(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_inputOnlineResult:
        {
          android.os.Bundle _arg0;
          _arg0 = _Parcel.readTypedObject(data, android.os.Bundle.CREATOR);
          com.vfi.smartpos.deviceservice.aidl.OnlineResultHandler _arg1;
          _arg1 = com.vfi.smartpos.deviceservice.aidl.OnlineResultHandler.Stub.asInterface(data.readStrongBinder());
          this.inputOnlineResult(_arg0, _arg1);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_setEMVData:
        {
          java.util.List<java.lang.String> _arg0;
          _arg0 = data.createStringArrayList();
          this.setEMVData(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_getAppTLVList:
        {
          java.lang.String[] _arg0;
          _arg0 = data.createStringArray();
          java.lang.String _result = this.getAppTLVList(_arg0);
          reply.writeNoException();
          reply.writeString(_result);
          break;
        }
        case TRANSACTION_getCardData:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          byte[] _result = this.getCardData(_arg0);
          reply.writeNoException();
          reply.writeByteArray(_result);
          break;
        }
        case TRANSACTION_getPBOCData:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _result = this.getPBOCData(_arg0);
          reply.writeNoException();
          reply.writeString(_result);
          break;
        }
        case TRANSACTION_getCandidateAppInfo:
        {
          com.vfi.smartpos.deviceservice.aidl.CandidateAppInfo _result = this.getCandidateAppInfo();
          reply.writeNoException();
          _Parcel.writeTypedObject(reply, _result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          break;
        }
        case TRANSACTION_getAID:
        {
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String[] _result = this.getAID(_arg0);
          reply.writeNoException();
          reply.writeStringArray(_result);
          break;
        }
        case TRANSACTION_getRID:
        {
          java.lang.String[] _result = this.getRID();
          reply.writeNoException();
          reply.writeStringArray(_result);
          break;
        }
        case TRANSACTION_getProcessCardType:
        {
          int _result = this.getProcessCardType();
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
    private static class Proxy implements com.vfi.smartpos.deviceservice.aidl.IPBOC
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
       * check card, non-block method
       * 
       * @param cardOption the card type (list)
       * <ul>
       * <li>supportMagCard(boolean) support magnetic card</li>
       * <li>supportICCard(boolean) support IC card</li>
       * <li>supportRFCard(boolean) support CTLS card</li>
       * </ul>
       * @param timeout the time out(seconds)
       * @param listener the listerner while found card
       * @since 1.x.x
       */
      @Override public void checkCard(android.os.Bundle cardOption, int timeout, com.vfi.smartpos.deviceservice.aidl.CheckCardListener listener) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _Parcel.writeTypedObject(_data, cardOption, 0);
          _data.writeInt(timeout);
          _data.writeStrongInterface(listener);
          boolean _status = mRemote.transact(Stub.TRANSACTION_checkCard, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * stop check card
       * @since 1.x.x
       */
      @Override public void stopCheckCard() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_stopCheckCard, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * read UP ( chip in SIM ) card
       * @param listener the listern of the result
       * @since 1.x.x
       */
      @Override public void readUPCard(com.vfi.smartpos.deviceservice.aidl.UPCardListener listener) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongInterface(listener);
          boolean _status = mRemote.transact(Stub.TRANSACTION_readUPCard, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * start PBOC process
       * 
       * @param transType transaction type
       * <ul>
       * <li>EC_BALANCE(1) query the balance</li>
       * <li>TRANSFER(2) transfer</li>
       * <li>EC_LOAD(3) EC LOAD</li>
       * <li>EC_LOAD_U(4) EC LOAD without assign account</li>
       * <li>EC_LOAD_CASH(5) EC LOAD with CASH</li>
       * <li>EC_LOAD_CASH_VOID(6) EC LOAD with CASH void</li>
       * <li>PURCHASE(7) purchase</li>
       * <li>Q_PURCHASE(8) quick purchase</li>
       * <li>CHECK_BALANCE(9) get balance</li>
       * <li>PRE_AUTH(10) pre-authorization</li>
       * <li>SALE_VOID(11) sale void</li>
       * <li>SIMPLE_PROCESS(12) simplye process</li>
       * <li>REFUND(13) - refund(full process)</li>
       * </ul>
       * @param intent request setting
       * <ul>
       * <li>cardType(int) card type
       *         * CARD_INSERT(0)- samrt IC card
       *         * CARD_RF(1)- CTLS card 非接触式卡 </li>
       * <li>authAmount(long): auth-amount (transaction amount) </li>
       * <li>isSupportQ(boolean): is support QPBOC </li>
       * <li>isSupportSM(boolean): is support SM </li>
       * <li>isQPBOCForceOnline(boolean): is QPBOC force online </li>
       * <li>merchantName(String):merchant Name </li>
       * <li>merchantId(String): merchant ID </li>
       * <li>terminalId(String):terminal ID </li>
       * </ul>
       * @param handler the call back handler, please refer PBOCHandler
       * @since 1.x.x
       */
      @Override public void startPBOC(int transType, android.os.Bundle intent, com.vfi.smartpos.deviceservice.aidl.PBOCHandler handler) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(transType);
          _Parcel.writeTypedObject(_data, intent, 0);
          _data.writeStrongInterface(handler);
          boolean _status = mRemote.transact(Stub.TRANSACTION_startPBOC, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * start EMV process
       * 
       * @param processType process type
       * <ul>
       * <li>1：full process</li>
       * <li>2：simple process</li>
       * </ul>
       * @param intent request setting
       * <ul>
       * <li>cardType(int): card type
       *      * CARD_INSERT(0)- smart IC card
       *      * CARD_RF(1)- CTLS card </li>
       * <li>transProcessCode(byte): (1Byte) Translation type (9C first two digits of the ISO 8583:1987 Processing Code)</li>
       * <li>authAmount(long): auth-amount (transaction amount)</li>
       * <li>isSupportQ(boolean): is support QPBOC </li>
       * <li>isSupportSM(boolean): is support SM </li>
       * <li>isQPBOCForceOnline(boolean): is QPBOC force online </li>
       * <li>merchantName(String):merchant Name </li>
       * <li>merchantId(String): merchant ID </li>
       * <li>terminalId(String):terminal ID </li>
       * </ul>
       * @param handler the call back handler, please refer PBOCHandler
       * @since 1.x.x
       */
      @Override public void startEMV(int processType, android.os.Bundle intent, com.vfi.smartpos.deviceservice.aidl.PBOCHandler handler) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(processType);
          _Parcel.writeTypedObject(_data, intent, 0);
          _data.writeStrongInterface(handler);
          boolean _status = mRemote.transact(Stub.TRANSACTION_startEMV, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * stop PBOC(EMV)
       * @since 1.x.x
       */
      @Override public void abortPBOC() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_abortPBOC, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * update AID parameter
       * 
       * @param operation the setting
       * <ul>
       * <li>1：append</li>
       * <li>2：remove</li>
       * <li>3：clear all</li>
       * </ul>
       * @param aidType type of AID parameter
       * <ul>
       * <li>1：contact(smart card)</li>
       * <li>2：contactless</li>
       * </ul>
       * @param aid the AID parameter
       * @return result, true on success, false on failure
       * @since 1.x.x
       */
      @Override public boolean updateAID(int operation, int aidType, java.lang.String aid) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(operation);
          _data.writeInt(aidType);
          _data.writeString(aid);
          boolean _status = mRemote.transact(Stub.TRANSACTION_updateAID, _data, _reply, 0);
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
       * update CA public KEY
       * 
       * @param operation the setting
       * <ul>
       * <li>1：append</li>
       * <li>2：remove</li>
       * <li>3：clear all</li>
       * </ul>
       * @param rid the CA public KEY
       * @return true on success, false on failure
       * @since 1.x.x
       */
      @Override public boolean updateRID(int operation, java.lang.String rid) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(operation);
          _data.writeString(rid);
          boolean _status = mRemote.transact(Stub.TRANSACTION_updateRID, _data, _reply, 0);
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
       * import amount
       * 
       * There is nothing in this method. The amount should be set while call the startEMV.
       * @param amount the amount
       * @since 1.x.x
       * @Deprecated
       */
      @Override public void importAmount(long amount) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeLong(amount);
          boolean _status = mRemote.transact(Stub.TRANSACTION_importAmount, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * select application (multi-application card)
       * 
       * @param index the index of application, start from 1, and 0 means cancel
       * @since 1.x.x
       */
      @Override public void importAppSelect(int index) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(index);
          boolean _status = mRemote.transact(Stub.TRANSACTION_importAppSelect, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * import the PIN
       * 
       * @param option(int) - 操作选项 | the option
       * <ul>
       * <li> CANCEL(0) cancel</li>
       * <li> CONFIRM(1) confirm</li>
       * </ul>
       * @param pin the PIN data
       * @since 1.x.x
       */
      @Override public void importPin(int option, byte[] pin) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(option);
          _data.writeByteArray(pin);
          boolean _status = mRemote.transact(Stub.TRANSACTION_importPin, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * import the result of card hodler verification
       * 
       * @param option the option
       * <ul>
       * <li> CANCEL(0) cancel ( BYPASS )</li>
       * <li> CONFIRM(1) confirm</li>
       * <li> NOTMATCH(2) not match</li>
       * </ul>
       * @since 1.x.x
       */
      @Override public void importCertConfirmResult(int option) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(option);
          boolean _status = mRemote.transact(Stub.TRANSACTION_importCertConfirmResult, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * import the result of card verification
       * 
       * @param pass true on pass, false on error
       * @since 1.x.x
       */
      @Override public void importCardConfirmResult(boolean pass) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(((pass)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_importCardConfirmResult, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * import(input) the online response
       * 
       * @param onlineResult - the result ( response )
       * <ul>
       * <li> isOnline(boolean)is online</li>
       * <li> respCode(String) the response code</li>
       * <li> authCode(String) the authorize code</li>
       * <li> field55(String) the response of field 55 data</li>
       * </ul>
       * @param handler the result , please refer OnlineResultHandler
       * @since 1.x.x
       */
      @Override public void inputOnlineResult(android.os.Bundle onlineResult, com.vfi.smartpos.deviceservice.aidl.OnlineResultHandler handler) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _Parcel.writeTypedObject(_data, onlineResult, 0);
          _data.writeStrongInterface(handler);
          boolean _status = mRemote.transact(Stub.TRANSACTION_inputOnlineResult, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * set EMV (kernel) data
       * 
       * before start emv flow, you can set the data
       * @param tlvList the TLV list
       * Support set following tag. If AID list have the same tag, aid list priority over this interface.<BR>
       * <pre>
       * Such as below tag:
       * 9F33：
       * 9F15：
       * 9F16：
       * 9F4E：
       * 9F1C：
       * 9F35：
       * 9F3C：
       * 9F3D：
       * 5F2A：
       * 5F36：
       * 9F1A：
       * 9F40：
       * </pre>
       * @since 1.x.x
       */
      @Override public void setEMVData(java.util.List<java.lang.String> tlvList) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStringList(tlvList);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setEMVData, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * get kernal data list in Tag-Length-Value format
       * 
       * @param taglist the tag list want query
       * @return the response in TLV format, null means no response got
       * @since 1.x.x
       * <pre>
       * {
       *    String[] strlist = {"9F33", "9F40", "9F10", "9F26", "95", "9F37", "9F1E", "9F36",
       *            "82", "9F1A", "9A", "9B", "50", "84", "5F2A", "8F"};
       *    String strs = ipboc.getAppTLVList(strlist);
       * }
       * </pre>
       */
      @Override public java.lang.String getAppTLVList(java.lang.String[] taglist) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStringArray(taglist);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getAppTLVList, _data, _reply, 0);
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
       * get card (emv) data by tag
       * 
       * @param tagName the tag name
       * @return the emv data got
       * @since 1.x.x
       */
      @Override public byte[] getCardData(java.lang.String tagName) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        byte[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(tagName);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getCardData, _data, _reply, 0);
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
       * get PBOC(EMV) data
       * 
       * such as card number, valid dtae, card serial number, etc.
       * <em> will return null if the data is not avalible at the current EMV process</em>
       * @param tagName tag name
       * <ul>
       * <li> PAN card No.</li>
       * <li> TRACK2 track No.2</li>
       * <li> CARD_SN card SN (Serial Number)</li>
       * <li> EXPIRED_DATE expried date</li>
       * <li> DATE date</li>
       * <li> TIME time</li>
       * <li> BALANCE balance</li>
       * <li> CURRENCY currency</li>
       * </ul>
       * @return the return data of PBOC
       * @since 1.x.x
       */
      @Override public java.lang.String getPBOCData(java.lang.String tagName) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(tagName);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getPBOCData, _data, _reply, 0);
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
       * get the candidate application information
       * 
       * for upload the e-signature
       * @return the application information, please refer CandidateAppInfo
       * @since 1.x.x
       */
      @Override public com.vfi.smartpos.deviceservice.aidl.CandidateAppInfo getCandidateAppInfo() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        com.vfi.smartpos.deviceservice.aidl.CandidateAppInfo _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getCandidateAppInfo, _data, _reply, 0);
          _reply.readException();
          _result = _Parcel.readTypedObject(_reply, com.vfi.smartpos.deviceservice.aidl.CandidateAppInfo.CREATOR);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * get the AID parameter
       * 
       * @param type - 1-contact aid  2-contactless aid
       * @return null if the AID is unavailable
       * @since 1.x.x
       */
      @Override public java.lang.String[] getAID(int type) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(type);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getAID, _data, _reply, 0);
          _reply.readException();
          _result = _reply.createStringArray();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * get the RID
       * 
       * @return null if the RID is unavailable
       * @since 1.x.x
       */
      @Override public java.lang.String[] getRID() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getRID, _data, _reply, 0);
          _reply.readException();
          _result = _reply.createStringArray();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * Obtain the CTLS card type(In onRequestOnlineProcess callback you can use this interface to obtain the CTLS card type)
       * @return
       *   0-No Type<BR>
       *   1-JCB_CHIP<BR>
       *   2-JCB_MSD<BR>
       *   3-JCB_Legcy<BR>
       *   4-VISA_w1<BR>
       *   5-VISA_w3<BR>
       *   6-Master_EMV<BR>
       *   7-Master_MSD<BR>
       *   8-qPBOC_qUICS<BR>
       * @since 1.x.x
       * @deprecated
       */
      @Override public int getProcessCardType() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getProcessCardType, _data, _reply, 0);
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
    static final int TRANSACTION_checkCard = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_stopCheckCard = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_readUPCard = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_startPBOC = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_startEMV = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_abortPBOC = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_updateAID = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_updateRID = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_importAmount = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    static final int TRANSACTION_importAppSelect = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
    static final int TRANSACTION_importPin = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
    static final int TRANSACTION_importCertConfirmResult = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
    static final int TRANSACTION_importCardConfirmResult = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
    static final int TRANSACTION_inputOnlineResult = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
    static final int TRANSACTION_setEMVData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
    static final int TRANSACTION_getAppTLVList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
    static final int TRANSACTION_getCardData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
    static final int TRANSACTION_getPBOCData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
    static final int TRANSACTION_getCandidateAppInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
    static final int TRANSACTION_getAID = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
    static final int TRANSACTION_getRID = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
    static final int TRANSACTION_getProcessCardType = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
  }
  public static final java.lang.String DESCRIPTOR = "com.vfi.smartpos.deviceservice.aidl.IPBOC";
  /**
   * check card, non-block method
   * 
   * @param cardOption the card type (list)
   * <ul>
   * <li>supportMagCard(boolean) support magnetic card</li>
   * <li>supportICCard(boolean) support IC card</li>
   * <li>supportRFCard(boolean) support CTLS card</li>
   * </ul>
   * @param timeout the time out(seconds)
   * @param listener the listerner while found card
   * @since 1.x.x
   */
  public void checkCard(android.os.Bundle cardOption, int timeout, com.vfi.smartpos.deviceservice.aidl.CheckCardListener listener) throws android.os.RemoteException;
  /**
   * stop check card
   * @since 1.x.x
   */
  public void stopCheckCard() throws android.os.RemoteException;
  /**
   * read UP ( chip in SIM ) card
   * @param listener the listern of the result
   * @since 1.x.x
   */
  public void readUPCard(com.vfi.smartpos.deviceservice.aidl.UPCardListener listener) throws android.os.RemoteException;
  /**
   * start PBOC process
   * 
   * @param transType transaction type
   * <ul>
   * <li>EC_BALANCE(1) query the balance</li>
   * <li>TRANSFER(2) transfer</li>
   * <li>EC_LOAD(3) EC LOAD</li>
   * <li>EC_LOAD_U(4) EC LOAD without assign account</li>
   * <li>EC_LOAD_CASH(5) EC LOAD with CASH</li>
   * <li>EC_LOAD_CASH_VOID(6) EC LOAD with CASH void</li>
   * <li>PURCHASE(7) purchase</li>
   * <li>Q_PURCHASE(8) quick purchase</li>
   * <li>CHECK_BALANCE(9) get balance</li>
   * <li>PRE_AUTH(10) pre-authorization</li>
   * <li>SALE_VOID(11) sale void</li>
   * <li>SIMPLE_PROCESS(12) simplye process</li>
   * <li>REFUND(13) - refund(full process)</li>
   * </ul>
   * @param intent request setting
   * <ul>
   * <li>cardType(int) card type
   *         * CARD_INSERT(0)- samrt IC card
   *         * CARD_RF(1)- CTLS card 非接触式卡 </li>
   * <li>authAmount(long): auth-amount (transaction amount) </li>
   * <li>isSupportQ(boolean): is support QPBOC </li>
   * <li>isSupportSM(boolean): is support SM </li>
   * <li>isQPBOCForceOnline(boolean): is QPBOC force online </li>
   * <li>merchantName(String):merchant Name </li>
   * <li>merchantId(String): merchant ID </li>
   * <li>terminalId(String):terminal ID </li>
   * </ul>
   * @param handler the call back handler, please refer PBOCHandler
   * @since 1.x.x
   */
  public void startPBOC(int transType, android.os.Bundle intent, com.vfi.smartpos.deviceservice.aidl.PBOCHandler handler) throws android.os.RemoteException;
  /**
   * start EMV process
   * 
   * @param processType process type
   * <ul>
   * <li>1：full process</li>
   * <li>2：simple process</li>
   * </ul>
   * @param intent request setting
   * <ul>
   * <li>cardType(int): card type
   *      * CARD_INSERT(0)- smart IC card
   *      * CARD_RF(1)- CTLS card </li>
   * <li>transProcessCode(byte): (1Byte) Translation type (9C first two digits of the ISO 8583:1987 Processing Code)</li>
   * <li>authAmount(long): auth-amount (transaction amount)</li>
   * <li>isSupportQ(boolean): is support QPBOC </li>
   * <li>isSupportSM(boolean): is support SM </li>
   * <li>isQPBOCForceOnline(boolean): is QPBOC force online </li>
   * <li>merchantName(String):merchant Name </li>
   * <li>merchantId(String): merchant ID </li>
   * <li>terminalId(String):terminal ID </li>
   * </ul>
   * @param handler the call back handler, please refer PBOCHandler
   * @since 1.x.x
   */
  public void startEMV(int processType, android.os.Bundle intent, com.vfi.smartpos.deviceservice.aidl.PBOCHandler handler) throws android.os.RemoteException;
  /**
   * stop PBOC(EMV)
   * @since 1.x.x
   */
  public void abortPBOC() throws android.os.RemoteException;
  /**
   * update AID parameter
   * 
   * @param operation the setting
   * <ul>
   * <li>1：append</li>
   * <li>2：remove</li>
   * <li>3：clear all</li>
   * </ul>
   * @param aidType type of AID parameter
   * <ul>
   * <li>1：contact(smart card)</li>
   * <li>2：contactless</li>
   * </ul>
   * @param aid the AID parameter
   * @return result, true on success, false on failure
   * @since 1.x.x
   */
  public boolean updateAID(int operation, int aidType, java.lang.String aid) throws android.os.RemoteException;
  /**
   * update CA public KEY
   * 
   * @param operation the setting
   * <ul>
   * <li>1：append</li>
   * <li>2：remove</li>
   * <li>3：clear all</li>
   * </ul>
   * @param rid the CA public KEY
   * @return true on success, false on failure
   * @since 1.x.x
   */
  public boolean updateRID(int operation, java.lang.String rid) throws android.os.RemoteException;
  /**
   * import amount
   * 
   * There is nothing in this method. The amount should be set while call the startEMV.
   * @param amount the amount
   * @since 1.x.x
   * @Deprecated
   */
  public void importAmount(long amount) throws android.os.RemoteException;
  /**
   * select application (multi-application card)
   * 
   * @param index the index of application, start from 1, and 0 means cancel
   * @since 1.x.x
   */
  public void importAppSelect(int index) throws android.os.RemoteException;
  /**
   * import the PIN
   * 
   * @param option(int) - 操作选项 | the option
   * <ul>
   * <li> CANCEL(0) cancel</li>
   * <li> CONFIRM(1) confirm</li>
   * </ul>
   * @param pin the PIN data
   * @since 1.x.x
   */
  public void importPin(int option, byte[] pin) throws android.os.RemoteException;
  /**
   * import the result of card hodler verification
   * 
   * @param option the option
   * <ul>
   * <li> CANCEL(0) cancel ( BYPASS )</li>
   * <li> CONFIRM(1) confirm</li>
   * <li> NOTMATCH(2) not match</li>
   * </ul>
   * @since 1.x.x
   */
  public void importCertConfirmResult(int option) throws android.os.RemoteException;
  /**
   * import the result of card verification
   * 
   * @param pass true on pass, false on error
   * @since 1.x.x
   */
  public void importCardConfirmResult(boolean pass) throws android.os.RemoteException;
  /**
   * import(input) the online response
   * 
   * @param onlineResult - the result ( response )
   * <ul>
   * <li> isOnline(boolean)is online</li>
   * <li> respCode(String) the response code</li>
   * <li> authCode(String) the authorize code</li>
   * <li> field55(String) the response of field 55 data</li>
   * </ul>
   * @param handler the result , please refer OnlineResultHandler
   * @since 1.x.x
   */
  public void inputOnlineResult(android.os.Bundle onlineResult, com.vfi.smartpos.deviceservice.aidl.OnlineResultHandler handler) throws android.os.RemoteException;
  /**
   * set EMV (kernel) data
   * 
   * before start emv flow, you can set the data
   * @param tlvList the TLV list
   * Support set following tag. If AID list have the same tag, aid list priority over this interface.<BR>
   * <pre>
   * Such as below tag:
   * 9F33：
   * 9F15：
   * 9F16：
   * 9F4E：
   * 9F1C：
   * 9F35：
   * 9F3C：
   * 9F3D：
   * 5F2A：
   * 5F36：
   * 9F1A：
   * 9F40：
   * </pre>
   * @since 1.x.x
   */
  public void setEMVData(java.util.List<java.lang.String> tlvList) throws android.os.RemoteException;
  /**
   * get kernal data list in Tag-Length-Value format
   * 
   * @param taglist the tag list want query
   * @return the response in TLV format, null means no response got
   * @since 1.x.x
   * <pre>
   * {
   *    String[] strlist = {"9F33", "9F40", "9F10", "9F26", "95", "9F37", "9F1E", "9F36",
   *            "82", "9F1A", "9A", "9B", "50", "84", "5F2A", "8F"};
   *    String strs = ipboc.getAppTLVList(strlist);
   * }
   * </pre>
   */
  public java.lang.String getAppTLVList(java.lang.String[] taglist) throws android.os.RemoteException;
  /**
   * get card (emv) data by tag
   * 
   * @param tagName the tag name
   * @return the emv data got
   * @since 1.x.x
   */
  public byte[] getCardData(java.lang.String tagName) throws android.os.RemoteException;
  /**
   * get PBOC(EMV) data
   * 
   * such as card number, valid dtae, card serial number, etc.
   * <em> will return null if the data is not avalible at the current EMV process</em>
   * @param tagName tag name
   * <ul>
   * <li> PAN card No.</li>
   * <li> TRACK2 track No.2</li>
   * <li> CARD_SN card SN (Serial Number)</li>
   * <li> EXPIRED_DATE expried date</li>
   * <li> DATE date</li>
   * <li> TIME time</li>
   * <li> BALANCE balance</li>
   * <li> CURRENCY currency</li>
   * </ul>
   * @return the return data of PBOC
   * @since 1.x.x
   */
  public java.lang.String getPBOCData(java.lang.String tagName) throws android.os.RemoteException;
  /**
   * get the candidate application information
   * 
   * for upload the e-signature
   * @return the application information, please refer CandidateAppInfo
   * @since 1.x.x
   */
  public com.vfi.smartpos.deviceservice.aidl.CandidateAppInfo getCandidateAppInfo() throws android.os.RemoteException;
  /**
   * get the AID parameter
   * 
   * @param type - 1-contact aid  2-contactless aid
   * @return null if the AID is unavailable
   * @since 1.x.x
   */
  public java.lang.String[] getAID(int type) throws android.os.RemoteException;
  /**
   * get the RID
   * 
   * @return null if the RID is unavailable
   * @since 1.x.x
   */
  public java.lang.String[] getRID() throws android.os.RemoteException;
  /**
   * Obtain the CTLS card type(In onRequestOnlineProcess callback you can use this interface to obtain the CTLS card type)
   * @return
   *   0-No Type<BR>
   *   1-JCB_CHIP<BR>
   *   2-JCB_MSD<BR>
   *   3-JCB_Legcy<BR>
   *   4-VISA_w1<BR>
   *   5-VISA_w3<BR>
   *   6-Master_EMV<BR>
   *   7-Master_MSD<BR>
   *   8-qPBOC_qUICS<BR>
   * @since 1.x.x
   * @deprecated
   */
  @Deprecated
  public int getProcessCardType() throws android.os.RemoteException;
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
