/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.vfi.smartpos.deviceservice.aidl;
/**
 * EMV object for processing EMV
 * @author Kai.L@verifone.cn, Chao.L@verifone.cn
 */
public interface IEMV extends android.os.IInterface
{
  /** Default implementation for IEMV. */
  public static class Default implements com.vfi.smartpos.deviceservice.aidl.IEMV
  {
    /**
     * check card, non-block method
     * 
     * @param cardOption the card type (list)
     * <ul>
     * <li>supportMagCard(boolean) support magnetic card</li>
     * <li>supportSmartCard(boolean) support Smart card</li>
     * <li>supportCTLSCard(boolean) support CTLS card</li>
     * </ul>
     * @param timeout the time out(seconds)
     * @param listener the listerner while found card
     * @since 2.x.x
     */
    @Override public void checkCard(android.os.Bundle cardOption, int timeout, com.vfi.smartpos.deviceservice.aidl.CheckCardListener listener) throws android.os.RemoteException
    {
    }
    /**
     * stop check card
     * @since 2.x.x
     */
    @Override public void stopCheckCard() throws android.os.RemoteException
    {
    }
    /**
     * start EMV process
     * 
     * @param transflow processing type
     * <ul>
     * <li>1：EMV processing</li>
     * <li>2：EMV simplified processing</li>
     * </ul>
     * @param intent request setting
     * <ul>
     * <li>cardType(int): card type
     *      * CARD_INSERT(0)- smart IC card
     *      * CARD_RF(1)- CTLS card </li>
     * <li>transProcessCode(byte): (1Byte) Translation type (9C first two digits of the ISO 8583:1987 Processing Code)</li>
     * <li>authAmount(long): auth-amount (transaction amount)</li>
     * <li>isSupportSM(boolean): is support SM </li>
     * <li>isForceOnline(boolean): is force online </li>
     * <li>merchantName(String):merchant Name (var. bytes)</li>
     * <li>merchantId(String): merchant ID (15 bytes)</li>
     * <li>terminalId(String):terminal ID (8 bytes)</li>
     * <li>transCurrCode(String): currency code(5F2A), if not set, kernel will find the tag in AID string.</li>
     * <li>otherAmount(String): set Other Amount (9F03) value</li>
     * <li>panConfirmTimeOut(int): set timeout of pan confirm, if not set then default 60s(just support smart card)</li>
     * <li>appSelectTimeOut(int): set timeout of selectApp, if not set then default 60s(just support smart card)</li>
     * <li>traceNo(String):trace no (var. bytes)</li>
     * <li>ctlsPriority(byte): CTLS application priority, no necessary, b0-MCCS MyDebit priorty b1-terminal priorty b2~b7 to be define</li>
     * <li>isForceOffline(boolean): is force offline, no necessary, false is default (just support AMEX kernel)</li>
     * <li>ctlsAidsForSingleTrans(ArrayList<String>): CTLS transaction input temporary aid params(AID + KernelID(9F2A01xx) + transType(DF2901xx) + transCurrCode(DF2A02xxxx))</li>
     * <li>isTerminalTypeSetInAID(boolean): default value is false(default vaule is 0x22), you should confirm this tag(9F35) in your AID String when you set this tag is true.</li>
     * <li>ctlsEmvAbortWhenAppBlocked(boolean): when CTLS app blocked then EMV abort</li>
     * <li>paramsGroupName(String): aid/rid/DRL group name</li>
     * <li>merchCateCode(String): set Merchant Category code for each EMV process, default value is 1234</li>
     * <li>isStartVccsFlag(boolean): set this param true(default is false), meanwhile DF2F tag in AID string B1b6 is 1, then open padding 00 rule to change 9F02</li>
     * </ul>
     * @param handler the call back handler, please refer EMVHandler
     * @since 2.x.x
     */
    @Override public void startEMV(int processType, android.os.Bundle intent, com.vfi.smartpos.deviceservice.aidl.EMVHandler handler) throws android.os.RemoteException
    {
    }
    /**
     * stop EMV
     * 
     * @since 2.x.x
     */
    @Override public void abortEMV() throws android.os.RemoteException
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
     * @since 2.x.x
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
     * @since 2.x.x
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
     * @since 2.x.x
     * @deprecated
     */
    @Override public void importAmount(long amount) throws android.os.RemoteException
    {
    }
    /**
     * select application (multi-application card)
     * 
     * @param index the index of application, start from 1, and 0 means cancel
     * @since 2.x.x
     */
    @Override public void importAppSelection(int index) throws android.os.RemoteException
    {
    }
    /**
     * import the PIN
     * 
     * @param option(int) - the option
     * <ul>
     * <li> CANCEL(0) cancel</li>
     * <li> CONFIRM(1) confirm</li>
     * </ul>
     * @param pin the PIN data
     * @since 2.x.x
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
     * @since 2.x.x
     */
    @Override public void importCertConfirmResult(int option) throws android.os.RemoteException
    {
    }
    /**
     * import the result of card verification
     * 
     * @param pass true on pass, false on error
     * @since 2.x.x
     */
    @Override public void importCardConfirmResult(boolean pass) throws android.os.RemoteException
    {
    }
    /**
     * input the online response
     * 
     * @param onlineResult  set the result ( response )
     * <ul>
     * <li> isOnline(boolean)is online</li>
     * <li> respCode(String) the response code</li>
     * <li> authCode(String) the authorize code</li>
     * <li> field55(String) the response of field 55 data form HOST(include ARPC or script)</li>
     * </ul>
     * @param handler the result , please refer OnlineResultHandler
     * @since 2.x.x
     */
    @Override public void importOnlineResult(android.os.Bundle onlineResult, com.vfi.smartpos.deviceservice.aidl.OnlineResultHandler handler) throws android.os.RemoteException
    {
    }
    /**
     * set EMV (kernel) data in trans process (DCC)
     * 
     * In emv flow(onConfirmCardInfo callback or onRequestInputPIN callback), you can modify the emv data. <b>just support smartcard</b><br>
     * for example:<br>
     * 1.firt you set aidString 5F2A=0156, but in onConfirmCardInfo callback you want to reset this tag 5F2A=0116, you can use this interface.<br>
     * 2.second you set authAmount=100(9F02) in startEmv, in onConfirmCardInfo callback you can reset the auth amount.
     * @param tlvList the TLV list
     * @since 2.x.x
     */
    @Override public void setEMVData(java.util.List<java.lang.String> tlvList) throws android.os.RemoteException
    {
    }
    /**
     * get kernal data list in Tag-Length-Value format
     * 
     * @param taglist the tag list want query
     * @return the response in TLV format, null means no response got
     * @since 2.x.x
     * <pre>
     * {
     *     String[] strlist = {"9F33", "9F40", "9F10", "9F26", "95", "9F37", "9F1E", "9F36",
     *             "82", "9F1A", "9A", "9B", "50", "84", "5F2A", "8F"};
     *     String strs = iemv.getAppTLVList(strlist);
     *  }
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
     * @since 2.x.x
     */
    @Override public byte[] getCardData(java.lang.String tagName) throws android.os.RemoteException
    {
      return null;
    }
    /**
     * get EMV data
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
     * @return the return data of EMV
     * @since 2.x.x
     */
    @Override public java.lang.String getEMVData(java.lang.String tagName) throws android.os.RemoteException
    {
      return null;
    }
    /**
     * get the AID parameter
     * 
     * @param type - 1-contact aid  2-contactless aid
     * @return null if the AID is unavailable
     * @since 2.x.x
     */
    @Override public java.lang.String[] getAID(int type) throws android.os.RemoteException
    {
      return null;
    }
    /**
     * get the RID
     * @return null if the RID is unavailable<br>
     * @since 2.x.x
     * @deprecated
     */
    @Override public java.lang.String[] getRID() throws android.os.RemoteException
    {
      return null;
    }
    /**
     * Obtain the CTLS card type
     * @return see below:
     * <pre>
     *   0-No Type
     *   1-JCB_CHIP
     *   2-JCB_MSD
     *   3-JCB_Legcy
     *   4-VISA_w1
     *   5-VISA_w3
     *   6-Master_EMV
     *   7-Master_MSD
     *   8-qPBOC_qUICS
     * </pre>
     * @since 2.x.x
     * @deprecated
     */
    @Override public int getProcessCardType() throws android.os.RemoteException
    {
      return 0;
    }
    /**
     * set EMV kernel to use. set this interface before startEMV()
     * @param customAidList see below:
     * <pre>
     * Map < String, Integer >
     * String - custom aid
     * Integer - kernelID(check CTLSKernelID)
     * </pre>
     * @since 2.x.x
     */
    @Override public void registerKernelAID(java.util.Map customAidList) throws android.os.RemoteException
    {
    }
    /**
     * import(input) the online response
     * 
     * @param onlineResult - the result ( response )
     * <ul>
     * <li> isOnline(boolean)is online</li>
     * <li> respCode(String) the response code(00-approval)</li>
     * <li> authCode(String) the authorize code</li>
     * <li> field55(String) the response of field 55 data</li>
     * </ul>
     * @param handler the result , please refer OnlineResultHandler
     * @since 2.x.x
     */
    @Override public void inputOnlineResult(android.os.Bundle onlineResult, com.vfi.smartpos.deviceservice.aidl.OnlineResultHandler handler) throws android.os.RemoteException
    {
    }
    /**
     * update CTLS Visa APID or AMEX DRL parameter
     * 
     * @param operation the setting
     * <ul>
     * <li>1：append</li>
     * <li>2：clear</li>
     * </ul>
     * @param DRLData data
     * @return result, true on success, false on failure
     * @since 2.x.x
     */
    @Override public boolean updateVisaAPID(int operation, com.vfi.smartpos.deviceservice.aidl.DRLData drlData) throws android.os.RemoteException
    {
      return false;
    }
    /**
     * update card black parameter
     * 
     * @param operation the setting
     * <ul>
     * <li>1：append</li>
     * <li>2：clear</li>
     * </ul>
     * @param BLKData data of card black
     * @param type of card black parameter
     * <ul>
     * <li>1：contact(smart card)</li>
     * <li>2：contactless</li>
     * </ul>
     * @return result, true on success, false on failure
     * @since 2.x.x
     */
    @Override public boolean updateCardBlk(int operation, com.vfi.smartpos.deviceservice.aidl.BLKData blkData, int type) throws android.os.RemoteException
    {
      return false;
    }
    /**
     * set smart card request online after Application Selection and before GAC,
     * it can set TVR B4b4(Merchant forced transaction online) is true.
     * 
     * @return result, 0 on success, others on failure
     * @since 2.x.x
     */
    @Override public int emvProcessingRequestOnline() throws android.os.RemoteException
    {
      return 0;
    }
    /**
     * get the CAPK parameter
     * 
     * @param type - 1-contact aid  2-contactless aid
     * @return null if the CAPK is unavailable
     * @since 2.7.0.0
     */
    @Override public java.lang.String[] getCAPK(int type) throws android.os.RemoteException
    {
      return null;
    }
    /**
     * enable Track(It's not necessary.)
     * @param trkNum - bit0=1 enable trk1; bit1=1 enable trk2; bit2=1 enable trk3. So trkNum < 0 or trkNum > 7 will close track1&2&3
     * @since 2.7.0.0
     */
    @Override public void enableTrack(int trkNum) throws android.os.RemoteException
    {
    }
    /**
     * set ctls pre process(It's not necessary.)
     * @param param setting
     * <ul>
     * <li>traceNo(String):trace no (var. bytes)</li>
     * <li>transProcessCode(byte): (1Byte) Translation type (9C first two digits of the ISO 8583:1987 Processing Code)</li>
     * <li>transCurrCode(String): currency code(5F2A), if not set, kernel will find the tag in AID string.</li>
     * <li>otherAmount(String): set Other Amount (9F03) value</li>
     * <li>authAmount(long): auth-amount (transaction amount)</li>
     * <li>isForceOnline(boolean): is force online </li>
     * <li>ctlsPriority(byte): CTLS application priority, no necessary, b0-MyDebit b1~b7 to be define</li>
     * <li>isForceOffline(boolean): is force offline, no necessary, false is default</li>
     * </ul>
     * @return true-sucess false-failed
     * @since 2.11.0.0
     */
    @Override public boolean setCtlsPreProcess(android.os.Bundle param) throws android.os.RemoteException
    {
      return false;
    }
    /**
     * check card, non-block method
     * 
     * @param cardOption the card type (list)
     * <ul>
     * <li>supportMagCard(boolean) support magnetic card</li>
     * <li>supportSmartCard(boolean) support Smart card</li>
     * <li>supportCTLSCard(boolean) support CTLS card</li>
     * </ul>
     * @param timeout the time out(ms)
     * @param listener the listerner while found card
     * @since 2.11.0.0
     */
    @Override public void checkCardMs(android.os.Bundle cardOption, long timeout, com.vfi.smartpos.deviceservice.aidl.CheckCardListener listener) throws android.os.RemoteException
    {
    }
    /**
     * set before startEMV(), set callback for request issuer update script(CTLS request second tap)
     * @since 2.11.0.0
     */
    @Override public void setIssuerUpdateHandler(com.vfi.smartpos.deviceservice.aidl.IssuerUpdateHandler issuerUpdateHandler) throws android.os.RemoteException
    {
    }
    /**
     * After CTLS second tap to update script
     * @since 2.11.0.0
     */
    @Override public void setIssuerUpdateScript() throws android.os.RemoteException
    {
    }
    /**
     * start EMV process
     * @param EMVTransParam @see EMVTransParams.java
     * @param extend
     * <ul>
     *    <li>panConfirmTimeOut(int): set timeout of pan confirm, if not set then default 60s(just support smart card)</li>
     *    <li>appSelectTimeOut(int): set timeout of selectApp, if not set then default 60s(just support smart card)</li>
     *    <li>ctlsPriority(byte): CTLS application priority, no necessary, b0-MCCS MyDebit priority b1-terminal priority,use DF2D to custom set priority b2~b7 to be define</li>
     *    <li>isForceOffline(boolean): is force offline, no necessary, false is default (just support CTLS AMEX kernel)</li>
     *    <li>ctlsAidsForSingleTrans(ArrayList<String>): CTLS transaction input temporary aid params(AID + KernelID(9F2A01xx) + transType(DF2901xx) + transCurrCode(DF2A02xxxx))</li>
     *    <li>isTerminalTypeSetInAID(boolean): default value is false(default vaule is 0x22), you should confirm this tag(9F35) in your AID String when you set this tag is true.</li>
     *    <li>merchCateCode(String): set Merchant Category code for each EMV process, default value is 1234</li>
     * </ul>
     * @param handler the call back handler, please refer EMVHandler
     * @since 2.11.0.0
     */
    @Override public void startEmvWithTransParams(com.vfi.smartpos.deviceservice.aidl.EMVTransParams emvParams, android.os.Bundle extend, com.vfi.smartpos.deviceservice.aidl.EMVHandler handler) throws android.os.RemoteException
    {
    }
    /**
     * set before startEMV(), set RequestACTypeHandler callback.
     * @since 2.20.3.12
     */
    @Override public void setRequestACTypeCallBack(com.vfi.smartpos.deviceservice.aidl.RequestACTypeHandler requestACTypehandler) throws android.os.RemoteException
    {
    }
    /**
     * re-set 1GAC AC type
     * @param requestACType: chip card can change 1GAC AC Type(not necessary), 0-AAC, 1-ARQC, 2-TC</li>
     * @since 2.20.3.12
     */
    @Override public void setRequestACType(int requestACType) throws android.os.RemoteException
    {
    }
    /**
     * select spec version of kernel before startEMV(), pls refer CTLSKernelID
     * @param kernelID:
     * <pre>
     * Map < Integer kernelID, Integer ver >
     *      kernelId- kernelID(check CTLSKernelID) ver- Specification Version
     *      kernelId:2(Master)  0 - 3.1 ver(default), 1 - 3.1.2 ver
     *      kernelId:4(AMEX)  0 - 3.1 ver (default), 1 - 4.0.2 ver
     *      kernelId:5(JCB)  0 - 1.3 ver(default), 1 - 1.4 ver
     * </pre>
     * @since 2.20.3.12
     */
    @Override public void reRegistKernelVersion(java.util.Map tlvList) throws android.os.RemoteException
    {
    }
    /**
     * reset emvHandler in EMV process
     * @param EMVHandler please refer EMVHandler
     * @since 2.20.3.12
     */
    @Override public void resetEmvHandler(com.vfi.smartpos.deviceservice.aidl.EMVHandler handler) throws android.os.RemoteException
    {
    }
    /**
     * set bypass all PIN
     * @param byPassAllPin: default is false, if set true, will bypass all PIN
     * @since 2.23.0
     */
    @Override public void setByPassAllPin(boolean byPassAllPin) throws android.os.RemoteException
    {
    }
    /**
     * get bypass all PIN status
     * @return true - bypass all PIN, false - not bypass all PIN
     * @since 2.23.0
     */
    @Override public boolean isByPassAllPin() throws android.os.RemoteException
    {
      return false;
    }
    /**
     * update AID/CAPK/DRL parameter
     * 
     * @param operation the setting
     * <ul>
     * <li>1：append</li>
     * <li>2：clear</li>
     * </ul>
     * @param paramType.
     * <ul>
     * <li>1：AID contact</li>
     * <li>2：AID contactless</li>
     * <li>3：RID/CAPK</li>
     * <li>4：DRL</li>
     * </ul>
     * @param params the AID/RID/CAPK parameter value, if DRL type, set NULL.
     * @param extend
     * <ul>
     *    <li>groupName(String): group name</li>
     *    <li>DRLData(Parcelable): input DRLData object if paramType is 4</li>
     * </ul>
     * @return result, true on success, false on failure
     * @since 3.6.3
     */
    @Override public boolean updateGroupParam(int operation, int paramType, java.lang.String params, android.os.Bundle extend) throws android.os.RemoteException
    {
      return false;
    }
    /**
     * obtain card issuer CTLS specification version.
     * @return Map - Spec version of all CTLS kernels
     * Map < String kernel, String SpecVer>
     *      kernel: AMEX; MASTER; JCB; VISA; DISCOVER; CUP; RUPAY; PURE; MIR
     * @throws RemoteException
     * @since 3.10.x
     */
    @Override public java.util.Map getCtlsSpecVer() throws android.os.RemoteException
    {
      return null;
    }
    /**
     * same as updateVisaAPID() interface
     * 
     * @since 3.11.x
     */
    @Override public boolean updateDRL(int operation, com.vfi.smartpos.deviceservice.aidl.DRLData drlData) throws android.os.RemoteException
    {
      return false;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.vfi.smartpos.deviceservice.aidl.IEMV
  {
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.vfi.smartpos.deviceservice.aidl.IEMV interface,
     * generating a proxy if needed.
     */
    public static com.vfi.smartpos.deviceservice.aidl.IEMV asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.vfi.smartpos.deviceservice.aidl.IEMV))) {
        return ((com.vfi.smartpos.deviceservice.aidl.IEMV)iin);
      }
      return new com.vfi.smartpos.deviceservice.aidl.IEMV.Stub.Proxy(obj);
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
        case TRANSACTION_startEMV:
        {
          int _arg0;
          _arg0 = data.readInt();
          android.os.Bundle _arg1;
          _arg1 = _Parcel.readTypedObject(data, android.os.Bundle.CREATOR);
          com.vfi.smartpos.deviceservice.aidl.EMVHandler _arg2;
          _arg2 = com.vfi.smartpos.deviceservice.aidl.EMVHandler.Stub.asInterface(data.readStrongBinder());
          this.startEMV(_arg0, _arg1, _arg2);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_abortEMV:
        {
          this.abortEMV();
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
        case TRANSACTION_importAppSelection:
        {
          int _arg0;
          _arg0 = data.readInt();
          this.importAppSelection(_arg0);
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
        case TRANSACTION_importOnlineResult:
        {
          android.os.Bundle _arg0;
          _arg0 = _Parcel.readTypedObject(data, android.os.Bundle.CREATOR);
          com.vfi.smartpos.deviceservice.aidl.OnlineResultHandler _arg1;
          _arg1 = com.vfi.smartpos.deviceservice.aidl.OnlineResultHandler.Stub.asInterface(data.readStrongBinder());
          this.importOnlineResult(_arg0, _arg1);
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
        case TRANSACTION_getEMVData:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _result = this.getEMVData(_arg0);
          reply.writeNoException();
          reply.writeString(_result);
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
        case TRANSACTION_registerKernelAID:
        {
          java.util.Map _arg0;
          java.lang.ClassLoader cl = (java.lang.ClassLoader)this.getClass().getClassLoader();
          _arg0 = data.readHashMap(cl);
          this.registerKernelAID(_arg0);
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
        case TRANSACTION_updateVisaAPID:
        {
          int _arg0;
          _arg0 = data.readInt();
          com.vfi.smartpos.deviceservice.aidl.DRLData _arg1;
          _arg1 = _Parcel.readTypedObject(data, com.vfi.smartpos.deviceservice.aidl.DRLData.CREATOR);
          boolean _result = this.updateVisaAPID(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        case TRANSACTION_updateCardBlk:
        {
          int _arg0;
          _arg0 = data.readInt();
          com.vfi.smartpos.deviceservice.aidl.BLKData _arg1;
          _arg1 = _Parcel.readTypedObject(data, com.vfi.smartpos.deviceservice.aidl.BLKData.CREATOR);
          int _arg2;
          _arg2 = data.readInt();
          boolean _result = this.updateCardBlk(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        case TRANSACTION_emvProcessingRequestOnline:
        {
          int _result = this.emvProcessingRequestOnline();
          reply.writeNoException();
          reply.writeInt(_result);
          break;
        }
        case TRANSACTION_getCAPK:
        {
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String[] _result = this.getCAPK(_arg0);
          reply.writeNoException();
          reply.writeStringArray(_result);
          break;
        }
        case TRANSACTION_enableTrack:
        {
          int _arg0;
          _arg0 = data.readInt();
          this.enableTrack(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_setCtlsPreProcess:
        {
          android.os.Bundle _arg0;
          _arg0 = _Parcel.readTypedObject(data, android.os.Bundle.CREATOR);
          boolean _result = this.setCtlsPreProcess(_arg0);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        case TRANSACTION_checkCardMs:
        {
          android.os.Bundle _arg0;
          _arg0 = _Parcel.readTypedObject(data, android.os.Bundle.CREATOR);
          long _arg1;
          _arg1 = data.readLong();
          com.vfi.smartpos.deviceservice.aidl.CheckCardListener _arg2;
          _arg2 = com.vfi.smartpos.deviceservice.aidl.CheckCardListener.Stub.asInterface(data.readStrongBinder());
          this.checkCardMs(_arg0, _arg1, _arg2);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_setIssuerUpdateHandler:
        {
          com.vfi.smartpos.deviceservice.aidl.IssuerUpdateHandler _arg0;
          _arg0 = com.vfi.smartpos.deviceservice.aidl.IssuerUpdateHandler.Stub.asInterface(data.readStrongBinder());
          this.setIssuerUpdateHandler(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_setIssuerUpdateScript:
        {
          this.setIssuerUpdateScript();
          reply.writeNoException();
          break;
        }
        case TRANSACTION_startEmvWithTransParams:
        {
          com.vfi.smartpos.deviceservice.aidl.EMVTransParams _arg0;
          _arg0 = _Parcel.readTypedObject(data, com.vfi.smartpos.deviceservice.aidl.EMVTransParams.CREATOR);
          android.os.Bundle _arg1;
          _arg1 = _Parcel.readTypedObject(data, android.os.Bundle.CREATOR);
          com.vfi.smartpos.deviceservice.aidl.EMVHandler _arg2;
          _arg2 = com.vfi.smartpos.deviceservice.aidl.EMVHandler.Stub.asInterface(data.readStrongBinder());
          this.startEmvWithTransParams(_arg0, _arg1, _arg2);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_setRequestACTypeCallBack:
        {
          com.vfi.smartpos.deviceservice.aidl.RequestACTypeHandler _arg0;
          _arg0 = com.vfi.smartpos.deviceservice.aidl.RequestACTypeHandler.Stub.asInterface(data.readStrongBinder());
          this.setRequestACTypeCallBack(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_setRequestACType:
        {
          int _arg0;
          _arg0 = data.readInt();
          this.setRequestACType(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_reRegistKernelVersion:
        {
          java.util.Map _arg0;
          java.lang.ClassLoader cl = (java.lang.ClassLoader)this.getClass().getClassLoader();
          _arg0 = data.readHashMap(cl);
          this.reRegistKernelVersion(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_resetEmvHandler:
        {
          com.vfi.smartpos.deviceservice.aidl.EMVHandler _arg0;
          _arg0 = com.vfi.smartpos.deviceservice.aidl.EMVHandler.Stub.asInterface(data.readStrongBinder());
          this.resetEmvHandler(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_setByPassAllPin:
        {
          boolean _arg0;
          _arg0 = (0!=data.readInt());
          this.setByPassAllPin(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_isByPassAllPin:
        {
          boolean _result = this.isByPassAllPin();
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        case TRANSACTION_updateGroupParam:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          java.lang.String _arg2;
          _arg2 = data.readString();
          android.os.Bundle _arg3;
          _arg3 = _Parcel.readTypedObject(data, android.os.Bundle.CREATOR);
          boolean _result = this.updateGroupParam(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        case TRANSACTION_getCtlsSpecVer:
        {
          java.util.Map _result = this.getCtlsSpecVer();
          reply.writeNoException();
          reply.writeMap(_result);
          break;
        }
        case TRANSACTION_updateDRL:
        {
          int _arg0;
          _arg0 = data.readInt();
          com.vfi.smartpos.deviceservice.aidl.DRLData _arg1;
          _arg1 = _Parcel.readTypedObject(data, com.vfi.smartpos.deviceservice.aidl.DRLData.CREATOR);
          boolean _result = this.updateDRL(_arg0, _arg1);
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
    private static class Proxy implements com.vfi.smartpos.deviceservice.aidl.IEMV
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
       * <li>supportSmartCard(boolean) support Smart card</li>
       * <li>supportCTLSCard(boolean) support CTLS card</li>
       * </ul>
       * @param timeout the time out(seconds)
       * @param listener the listerner while found card
       * @since 2.x.x
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
       * @since 2.x.x
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
       * start EMV process
       * 
       * @param transflow processing type
       * <ul>
       * <li>1：EMV processing</li>
       * <li>2：EMV simplified processing</li>
       * </ul>
       * @param intent request setting
       * <ul>
       * <li>cardType(int): card type
       *      * CARD_INSERT(0)- smart IC card
       *      * CARD_RF(1)- CTLS card </li>
       * <li>transProcessCode(byte): (1Byte) Translation type (9C first two digits of the ISO 8583:1987 Processing Code)</li>
       * <li>authAmount(long): auth-amount (transaction amount)</li>
       * <li>isSupportSM(boolean): is support SM </li>
       * <li>isForceOnline(boolean): is force online </li>
       * <li>merchantName(String):merchant Name (var. bytes)</li>
       * <li>merchantId(String): merchant ID (15 bytes)</li>
       * <li>terminalId(String):terminal ID (8 bytes)</li>
       * <li>transCurrCode(String): currency code(5F2A), if not set, kernel will find the tag in AID string.</li>
       * <li>otherAmount(String): set Other Amount (9F03) value</li>
       * <li>panConfirmTimeOut(int): set timeout of pan confirm, if not set then default 60s(just support smart card)</li>
       * <li>appSelectTimeOut(int): set timeout of selectApp, if not set then default 60s(just support smart card)</li>
       * <li>traceNo(String):trace no (var. bytes)</li>
       * <li>ctlsPriority(byte): CTLS application priority, no necessary, b0-MCCS MyDebit priorty b1-terminal priorty b2~b7 to be define</li>
       * <li>isForceOffline(boolean): is force offline, no necessary, false is default (just support AMEX kernel)</li>
       * <li>ctlsAidsForSingleTrans(ArrayList<String>): CTLS transaction input temporary aid params(AID + KernelID(9F2A01xx) + transType(DF2901xx) + transCurrCode(DF2A02xxxx))</li>
       * <li>isTerminalTypeSetInAID(boolean): default value is false(default vaule is 0x22), you should confirm this tag(9F35) in your AID String when you set this tag is true.</li>
       * <li>ctlsEmvAbortWhenAppBlocked(boolean): when CTLS app blocked then EMV abort</li>
       * <li>paramsGroupName(String): aid/rid/DRL group name</li>
       * <li>merchCateCode(String): set Merchant Category code for each EMV process, default value is 1234</li>
       * <li>isStartVccsFlag(boolean): set this param true(default is false), meanwhile DF2F tag in AID string B1b6 is 1, then open padding 00 rule to change 9F02</li>
       * </ul>
       * @param handler the call back handler, please refer EMVHandler
       * @since 2.x.x
       */
      @Override public void startEMV(int processType, android.os.Bundle intent, com.vfi.smartpos.deviceservice.aidl.EMVHandler handler) throws android.os.RemoteException
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
       * stop EMV
       * 
       * @since 2.x.x
       */
      @Override public void abortEMV() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_abortEMV, _data, _reply, 0);
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
       * @since 2.x.x
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
       * @since 2.x.x
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
       * @since 2.x.x
       * @deprecated
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
       * @since 2.x.x
       */
      @Override public void importAppSelection(int index) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(index);
          boolean _status = mRemote.transact(Stub.TRANSACTION_importAppSelection, _data, _reply, 0);
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
       * @param option(int) - the option
       * <ul>
       * <li> CANCEL(0) cancel</li>
       * <li> CONFIRM(1) confirm</li>
       * </ul>
       * @param pin the PIN data
       * @since 2.x.x
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
       * @since 2.x.x
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
       * @since 2.x.x
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
       * input the online response
       * 
       * @param onlineResult  set the result ( response )
       * <ul>
       * <li> isOnline(boolean)is online</li>
       * <li> respCode(String) the response code</li>
       * <li> authCode(String) the authorize code</li>
       * <li> field55(String) the response of field 55 data form HOST(include ARPC or script)</li>
       * </ul>
       * @param handler the result , please refer OnlineResultHandler
       * @since 2.x.x
       */
      @Override public void importOnlineResult(android.os.Bundle onlineResult, com.vfi.smartpos.deviceservice.aidl.OnlineResultHandler handler) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _Parcel.writeTypedObject(_data, onlineResult, 0);
          _data.writeStrongInterface(handler);
          boolean _status = mRemote.transact(Stub.TRANSACTION_importOnlineResult, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * set EMV (kernel) data in trans process (DCC)
       * 
       * In emv flow(onConfirmCardInfo callback or onRequestInputPIN callback), you can modify the emv data. <b>just support smartcard</b><br>
       * for example:<br>
       * 1.firt you set aidString 5F2A=0156, but in onConfirmCardInfo callback you want to reset this tag 5F2A=0116, you can use this interface.<br>
       * 2.second you set authAmount=100(9F02) in startEmv, in onConfirmCardInfo callback you can reset the auth amount.
       * @param tlvList the TLV list
       * @since 2.x.x
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
       * @since 2.x.x
       * <pre>
       * {
       *     String[] strlist = {"9F33", "9F40", "9F10", "9F26", "95", "9F37", "9F1E", "9F36",
       *             "82", "9F1A", "9A", "9B", "50", "84", "5F2A", "8F"};
       *     String strs = iemv.getAppTLVList(strlist);
       *  }
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
       * @since 2.x.x
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
       * get EMV data
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
       * @return the return data of EMV
       * @since 2.x.x
       */
      @Override public java.lang.String getEMVData(java.lang.String tagName) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(tagName);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getEMVData, _data, _reply, 0);
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
       * get the AID parameter
       * 
       * @param type - 1-contact aid  2-contactless aid
       * @return null if the AID is unavailable
       * @since 2.x.x
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
       * @return null if the RID is unavailable<br>
       * @since 2.x.x
       * @deprecated
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
       * Obtain the CTLS card type
       * @return see below:
       * <pre>
       *   0-No Type
       *   1-JCB_CHIP
       *   2-JCB_MSD
       *   3-JCB_Legcy
       *   4-VISA_w1
       *   5-VISA_w3
       *   6-Master_EMV
       *   7-Master_MSD
       *   8-qPBOC_qUICS
       * </pre>
       * @since 2.x.x
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
      /**
       * set EMV kernel to use. set this interface before startEMV()
       * @param customAidList see below:
       * <pre>
       * Map < String, Integer >
       * String - custom aid
       * Integer - kernelID(check CTLSKernelID)
       * </pre>
       * @since 2.x.x
       */
      @Override public void registerKernelAID(java.util.Map customAidList) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeMap(customAidList);
          boolean _status = mRemote.transact(Stub.TRANSACTION_registerKernelAID, _data, _reply, 0);
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
       * <li> respCode(String) the response code(00-approval)</li>
       * <li> authCode(String) the authorize code</li>
       * <li> field55(String) the response of field 55 data</li>
       * </ul>
       * @param handler the result , please refer OnlineResultHandler
       * @since 2.x.x
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
       * update CTLS Visa APID or AMEX DRL parameter
       * 
       * @param operation the setting
       * <ul>
       * <li>1：append</li>
       * <li>2：clear</li>
       * </ul>
       * @param DRLData data
       * @return result, true on success, false on failure
       * @since 2.x.x
       */
      @Override public boolean updateVisaAPID(int operation, com.vfi.smartpos.deviceservice.aidl.DRLData drlData) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(operation);
          _Parcel.writeTypedObject(_data, drlData, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_updateVisaAPID, _data, _reply, 0);
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
       * update card black parameter
       * 
       * @param operation the setting
       * <ul>
       * <li>1：append</li>
       * <li>2：clear</li>
       * </ul>
       * @param BLKData data of card black
       * @param type of card black parameter
       * <ul>
       * <li>1：contact(smart card)</li>
       * <li>2：contactless</li>
       * </ul>
       * @return result, true on success, false on failure
       * @since 2.x.x
       */
      @Override public boolean updateCardBlk(int operation, com.vfi.smartpos.deviceservice.aidl.BLKData blkData, int type) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(operation);
          _Parcel.writeTypedObject(_data, blkData, 0);
          _data.writeInt(type);
          boolean _status = mRemote.transact(Stub.TRANSACTION_updateCardBlk, _data, _reply, 0);
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
       * set smart card request online after Application Selection and before GAC,
       * it can set TVR B4b4(Merchant forced transaction online) is true.
       * 
       * @return result, 0 on success, others on failure
       * @since 2.x.x
       */
      @Override public int emvProcessingRequestOnline() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_emvProcessingRequestOnline, _data, _reply, 0);
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
       * get the CAPK parameter
       * 
       * @param type - 1-contact aid  2-contactless aid
       * @return null if the CAPK is unavailable
       * @since 2.7.0.0
       */
      @Override public java.lang.String[] getCAPK(int type) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(type);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getCAPK, _data, _reply, 0);
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
       * enable Track(It's not necessary.)
       * @param trkNum - bit0=1 enable trk1; bit1=1 enable trk2; bit2=1 enable trk3. So trkNum < 0 or trkNum > 7 will close track1&2&3
       * @since 2.7.0.0
       */
      @Override public void enableTrack(int trkNum) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(trkNum);
          boolean _status = mRemote.transact(Stub.TRANSACTION_enableTrack, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * set ctls pre process(It's not necessary.)
       * @param param setting
       * <ul>
       * <li>traceNo(String):trace no (var. bytes)</li>
       * <li>transProcessCode(byte): (1Byte) Translation type (9C first two digits of the ISO 8583:1987 Processing Code)</li>
       * <li>transCurrCode(String): currency code(5F2A), if not set, kernel will find the tag in AID string.</li>
       * <li>otherAmount(String): set Other Amount (9F03) value</li>
       * <li>authAmount(long): auth-amount (transaction amount)</li>
       * <li>isForceOnline(boolean): is force online </li>
       * <li>ctlsPriority(byte): CTLS application priority, no necessary, b0-MyDebit b1~b7 to be define</li>
       * <li>isForceOffline(boolean): is force offline, no necessary, false is default</li>
       * </ul>
       * @return true-sucess false-failed
       * @since 2.11.0.0
       */
      @Override public boolean setCtlsPreProcess(android.os.Bundle param) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _Parcel.writeTypedObject(_data, param, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setCtlsPreProcess, _data, _reply, 0);
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
       * check card, non-block method
       * 
       * @param cardOption the card type (list)
       * <ul>
       * <li>supportMagCard(boolean) support magnetic card</li>
       * <li>supportSmartCard(boolean) support Smart card</li>
       * <li>supportCTLSCard(boolean) support CTLS card</li>
       * </ul>
       * @param timeout the time out(ms)
       * @param listener the listerner while found card
       * @since 2.11.0.0
       */
      @Override public void checkCardMs(android.os.Bundle cardOption, long timeout, com.vfi.smartpos.deviceservice.aidl.CheckCardListener listener) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _Parcel.writeTypedObject(_data, cardOption, 0);
          _data.writeLong(timeout);
          _data.writeStrongInterface(listener);
          boolean _status = mRemote.transact(Stub.TRANSACTION_checkCardMs, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * set before startEMV(), set callback for request issuer update script(CTLS request second tap)
       * @since 2.11.0.0
       */
      @Override public void setIssuerUpdateHandler(com.vfi.smartpos.deviceservice.aidl.IssuerUpdateHandler issuerUpdateHandler) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongInterface(issuerUpdateHandler);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setIssuerUpdateHandler, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * After CTLS second tap to update script
       * @since 2.11.0.0
       */
      @Override public void setIssuerUpdateScript() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setIssuerUpdateScript, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * start EMV process
       * @param EMVTransParam @see EMVTransParams.java
       * @param extend
       * <ul>
       *    <li>panConfirmTimeOut(int): set timeout of pan confirm, if not set then default 60s(just support smart card)</li>
       *    <li>appSelectTimeOut(int): set timeout of selectApp, if not set then default 60s(just support smart card)</li>
       *    <li>ctlsPriority(byte): CTLS application priority, no necessary, b0-MCCS MyDebit priority b1-terminal priority,use DF2D to custom set priority b2~b7 to be define</li>
       *    <li>isForceOffline(boolean): is force offline, no necessary, false is default (just support CTLS AMEX kernel)</li>
       *    <li>ctlsAidsForSingleTrans(ArrayList<String>): CTLS transaction input temporary aid params(AID + KernelID(9F2A01xx) + transType(DF2901xx) + transCurrCode(DF2A02xxxx))</li>
       *    <li>isTerminalTypeSetInAID(boolean): default value is false(default vaule is 0x22), you should confirm this tag(9F35) in your AID String when you set this tag is true.</li>
       *    <li>merchCateCode(String): set Merchant Category code for each EMV process, default value is 1234</li>
       * </ul>
       * @param handler the call back handler, please refer EMVHandler
       * @since 2.11.0.0
       */
      @Override public void startEmvWithTransParams(com.vfi.smartpos.deviceservice.aidl.EMVTransParams emvParams, android.os.Bundle extend, com.vfi.smartpos.deviceservice.aidl.EMVHandler handler) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _Parcel.writeTypedObject(_data, emvParams, 0);
          _Parcel.writeTypedObject(_data, extend, 0);
          _data.writeStrongInterface(handler);
          boolean _status = mRemote.transact(Stub.TRANSACTION_startEmvWithTransParams, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * set before startEMV(), set RequestACTypeHandler callback.
       * @since 2.20.3.12
       */
      @Override public void setRequestACTypeCallBack(com.vfi.smartpos.deviceservice.aidl.RequestACTypeHandler requestACTypehandler) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongInterface(requestACTypehandler);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setRequestACTypeCallBack, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * re-set 1GAC AC type
       * @param requestACType: chip card can change 1GAC AC Type(not necessary), 0-AAC, 1-ARQC, 2-TC</li>
       * @since 2.20.3.12
       */
      @Override public void setRequestACType(int requestACType) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(requestACType);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setRequestACType, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * select spec version of kernel before startEMV(), pls refer CTLSKernelID
       * @param kernelID:
       * <pre>
       * Map < Integer kernelID, Integer ver >
       *      kernelId- kernelID(check CTLSKernelID) ver- Specification Version
       *      kernelId:2(Master)  0 - 3.1 ver(default), 1 - 3.1.2 ver
       *      kernelId:4(AMEX)  0 - 3.1 ver (default), 1 - 4.0.2 ver
       *      kernelId:5(JCB)  0 - 1.3 ver(default), 1 - 1.4 ver
       * </pre>
       * @since 2.20.3.12
       */
      @Override public void reRegistKernelVersion(java.util.Map tlvList) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeMap(tlvList);
          boolean _status = mRemote.transact(Stub.TRANSACTION_reRegistKernelVersion, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * reset emvHandler in EMV process
       * @param EMVHandler please refer EMVHandler
       * @since 2.20.3.12
       */
      @Override public void resetEmvHandler(com.vfi.smartpos.deviceservice.aidl.EMVHandler handler) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongInterface(handler);
          boolean _status = mRemote.transact(Stub.TRANSACTION_resetEmvHandler, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * set bypass all PIN
       * @param byPassAllPin: default is false, if set true, will bypass all PIN
       * @since 2.23.0
       */
      @Override public void setByPassAllPin(boolean byPassAllPin) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(((byPassAllPin)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_setByPassAllPin, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * get bypass all PIN status
       * @return true - bypass all PIN, false - not bypass all PIN
       * @since 2.23.0
       */
      @Override public boolean isByPassAllPin() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_isByPassAllPin, _data, _reply, 0);
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
       * update AID/CAPK/DRL parameter
       * 
       * @param operation the setting
       * <ul>
       * <li>1：append</li>
       * <li>2：clear</li>
       * </ul>
       * @param paramType.
       * <ul>
       * <li>1：AID contact</li>
       * <li>2：AID contactless</li>
       * <li>3：RID/CAPK</li>
       * <li>4：DRL</li>
       * </ul>
       * @param params the AID/RID/CAPK parameter value, if DRL type, set NULL.
       * @param extend
       * <ul>
       *    <li>groupName(String): group name</li>
       *    <li>DRLData(Parcelable): input DRLData object if paramType is 4</li>
       * </ul>
       * @return result, true on success, false on failure
       * @since 3.6.3
       */
      @Override public boolean updateGroupParam(int operation, int paramType, java.lang.String params, android.os.Bundle extend) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(operation);
          _data.writeInt(paramType);
          _data.writeString(params);
          _Parcel.writeTypedObject(_data, extend, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_updateGroupParam, _data, _reply, 0);
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
       * obtain card issuer CTLS specification version.
       * @return Map - Spec version of all CTLS kernels
       * Map < String kernel, String SpecVer>
       *      kernel: AMEX; MASTER; JCB; VISA; DISCOVER; CUP; RUPAY; PURE; MIR
       * @throws RemoteException
       * @since 3.10.x
       */
      @Override public java.util.Map getCtlsSpecVer() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.util.Map _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getCtlsSpecVer, _data, _reply, 0);
          _reply.readException();
          java.lang.ClassLoader cl = (java.lang.ClassLoader)this.getClass().getClassLoader();
          _result = _reply.readHashMap(cl);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * same as updateVisaAPID() interface
       * 
       * @since 3.11.x
       */
      @Override public boolean updateDRL(int operation, com.vfi.smartpos.deviceservice.aidl.DRLData drlData) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(operation);
          _Parcel.writeTypedObject(_data, drlData, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_updateDRL, _data, _reply, 0);
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
    static final int TRANSACTION_checkCard = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_stopCheckCard = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_startEMV = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_abortEMV = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_updateAID = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_updateRID = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_importAmount = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_importAppSelection = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_importPin = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    static final int TRANSACTION_importCertConfirmResult = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
    static final int TRANSACTION_importCardConfirmResult = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
    static final int TRANSACTION_importOnlineResult = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
    static final int TRANSACTION_setEMVData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
    static final int TRANSACTION_getAppTLVList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
    static final int TRANSACTION_getCardData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
    static final int TRANSACTION_getEMVData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
    static final int TRANSACTION_getAID = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
    static final int TRANSACTION_getRID = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
    static final int TRANSACTION_getProcessCardType = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
    static final int TRANSACTION_registerKernelAID = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
    static final int TRANSACTION_inputOnlineResult = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
    static final int TRANSACTION_updateVisaAPID = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
    static final int TRANSACTION_updateCardBlk = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
    static final int TRANSACTION_emvProcessingRequestOnline = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
    static final int TRANSACTION_getCAPK = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
    static final int TRANSACTION_enableTrack = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
    static final int TRANSACTION_setCtlsPreProcess = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
    static final int TRANSACTION_checkCardMs = (android.os.IBinder.FIRST_CALL_TRANSACTION + 27);
    static final int TRANSACTION_setIssuerUpdateHandler = (android.os.IBinder.FIRST_CALL_TRANSACTION + 28);
    static final int TRANSACTION_setIssuerUpdateScript = (android.os.IBinder.FIRST_CALL_TRANSACTION + 29);
    static final int TRANSACTION_startEmvWithTransParams = (android.os.IBinder.FIRST_CALL_TRANSACTION + 30);
    static final int TRANSACTION_setRequestACTypeCallBack = (android.os.IBinder.FIRST_CALL_TRANSACTION + 31);
    static final int TRANSACTION_setRequestACType = (android.os.IBinder.FIRST_CALL_TRANSACTION + 32);
    static final int TRANSACTION_reRegistKernelVersion = (android.os.IBinder.FIRST_CALL_TRANSACTION + 33);
    static final int TRANSACTION_resetEmvHandler = (android.os.IBinder.FIRST_CALL_TRANSACTION + 34);
    static final int TRANSACTION_setByPassAllPin = (android.os.IBinder.FIRST_CALL_TRANSACTION + 35);
    static final int TRANSACTION_isByPassAllPin = (android.os.IBinder.FIRST_CALL_TRANSACTION + 36);
    static final int TRANSACTION_updateGroupParam = (android.os.IBinder.FIRST_CALL_TRANSACTION + 37);
    static final int TRANSACTION_getCtlsSpecVer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 38);
    static final int TRANSACTION_updateDRL = (android.os.IBinder.FIRST_CALL_TRANSACTION + 39);
  }
  public static final java.lang.String DESCRIPTOR = "com.vfi.smartpos.deviceservice.aidl.IEMV";
  /**
   * check card, non-block method
   * 
   * @param cardOption the card type (list)
   * <ul>
   * <li>supportMagCard(boolean) support magnetic card</li>
   * <li>supportSmartCard(boolean) support Smart card</li>
   * <li>supportCTLSCard(boolean) support CTLS card</li>
   * </ul>
   * @param timeout the time out(seconds)
   * @param listener the listerner while found card
   * @since 2.x.x
   */
  public void checkCard(android.os.Bundle cardOption, int timeout, com.vfi.smartpos.deviceservice.aidl.CheckCardListener listener) throws android.os.RemoteException;
  /**
   * stop check card
   * @since 2.x.x
   */
  public void stopCheckCard() throws android.os.RemoteException;
  /**
   * start EMV process
   * 
   * @param transflow processing type
   * <ul>
   * <li>1：EMV processing</li>
   * <li>2：EMV simplified processing</li>
   * </ul>
   * @param intent request setting
   * <ul>
   * <li>cardType(int): card type
   *      * CARD_INSERT(0)- smart IC card
   *      * CARD_RF(1)- CTLS card </li>
   * <li>transProcessCode(byte): (1Byte) Translation type (9C first two digits of the ISO 8583:1987 Processing Code)</li>
   * <li>authAmount(long): auth-amount (transaction amount)</li>
   * <li>isSupportSM(boolean): is support SM </li>
   * <li>isForceOnline(boolean): is force online </li>
   * <li>merchantName(String):merchant Name (var. bytes)</li>
   * <li>merchantId(String): merchant ID (15 bytes)</li>
   * <li>terminalId(String):terminal ID (8 bytes)</li>
   * <li>transCurrCode(String): currency code(5F2A), if not set, kernel will find the tag in AID string.</li>
   * <li>otherAmount(String): set Other Amount (9F03) value</li>
   * <li>panConfirmTimeOut(int): set timeout of pan confirm, if not set then default 60s(just support smart card)</li>
   * <li>appSelectTimeOut(int): set timeout of selectApp, if not set then default 60s(just support smart card)</li>
   * <li>traceNo(String):trace no (var. bytes)</li>
   * <li>ctlsPriority(byte): CTLS application priority, no necessary, b0-MCCS MyDebit priorty b1-terminal priorty b2~b7 to be define</li>
   * <li>isForceOffline(boolean): is force offline, no necessary, false is default (just support AMEX kernel)</li>
   * <li>ctlsAidsForSingleTrans(ArrayList<String>): CTLS transaction input temporary aid params(AID + KernelID(9F2A01xx) + transType(DF2901xx) + transCurrCode(DF2A02xxxx))</li>
   * <li>isTerminalTypeSetInAID(boolean): default value is false(default vaule is 0x22), you should confirm this tag(9F35) in your AID String when you set this tag is true.</li>
   * <li>ctlsEmvAbortWhenAppBlocked(boolean): when CTLS app blocked then EMV abort</li>
   * <li>paramsGroupName(String): aid/rid/DRL group name</li>
   * <li>merchCateCode(String): set Merchant Category code for each EMV process, default value is 1234</li>
   * <li>isStartVccsFlag(boolean): set this param true(default is false), meanwhile DF2F tag in AID string B1b6 is 1, then open padding 00 rule to change 9F02</li>
   * </ul>
   * @param handler the call back handler, please refer EMVHandler
   * @since 2.x.x
   */
  public void startEMV(int processType, android.os.Bundle intent, com.vfi.smartpos.deviceservice.aidl.EMVHandler handler) throws android.os.RemoteException;
  /**
   * stop EMV
   * 
   * @since 2.x.x
   */
  public void abortEMV() throws android.os.RemoteException;
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
   * @since 2.x.x
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
   * @since 2.x.x
   */
  public boolean updateRID(int operation, java.lang.String rid) throws android.os.RemoteException;
  /**
   * import amount
   * 
   * There is nothing in this method. The amount should be set while call the startEMV.
   * @param amount the amount
   * @since 2.x.x
   * @deprecated
   */
  @Deprecated
  public void importAmount(long amount) throws android.os.RemoteException;
  /**
   * select application (multi-application card)
   * 
   * @param index the index of application, start from 1, and 0 means cancel
   * @since 2.x.x
   */
  public void importAppSelection(int index) throws android.os.RemoteException;
  /**
   * import the PIN
   * 
   * @param option(int) - the option
   * <ul>
   * <li> CANCEL(0) cancel</li>
   * <li> CONFIRM(1) confirm</li>
   * </ul>
   * @param pin the PIN data
   * @since 2.x.x
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
   * @since 2.x.x
   */
  public void importCertConfirmResult(int option) throws android.os.RemoteException;
  /**
   * import the result of card verification
   * 
   * @param pass true on pass, false on error
   * @since 2.x.x
   */
  public void importCardConfirmResult(boolean pass) throws android.os.RemoteException;
  /**
   * input the online response
   * 
   * @param onlineResult  set the result ( response )
   * <ul>
   * <li> isOnline(boolean)is online</li>
   * <li> respCode(String) the response code</li>
   * <li> authCode(String) the authorize code</li>
   * <li> field55(String) the response of field 55 data form HOST(include ARPC or script)</li>
   * </ul>
   * @param handler the result , please refer OnlineResultHandler
   * @since 2.x.x
   */
  public void importOnlineResult(android.os.Bundle onlineResult, com.vfi.smartpos.deviceservice.aidl.OnlineResultHandler handler) throws android.os.RemoteException;
  /**
   * set EMV (kernel) data in trans process (DCC)
   * 
   * In emv flow(onConfirmCardInfo callback or onRequestInputPIN callback), you can modify the emv data. <b>just support smartcard</b><br>
   * for example:<br>
   * 1.firt you set aidString 5F2A=0156, but in onConfirmCardInfo callback you want to reset this tag 5F2A=0116, you can use this interface.<br>
   * 2.second you set authAmount=100(9F02) in startEmv, in onConfirmCardInfo callback you can reset the auth amount.
   * @param tlvList the TLV list
   * @since 2.x.x
   */
  public void setEMVData(java.util.List<java.lang.String> tlvList) throws android.os.RemoteException;
  /**
   * get kernal data list in Tag-Length-Value format
   * 
   * @param taglist the tag list want query
   * @return the response in TLV format, null means no response got
   * @since 2.x.x
   * <pre>
   * {
   *     String[] strlist = {"9F33", "9F40", "9F10", "9F26", "95", "9F37", "9F1E", "9F36",
   *             "82", "9F1A", "9A", "9B", "50", "84", "5F2A", "8F"};
   *     String strs = iemv.getAppTLVList(strlist);
   *  }
   * </pre>
   */
  public java.lang.String getAppTLVList(java.lang.String[] taglist) throws android.os.RemoteException;
  /**
   * get card (emv) data by tag
   * 
   * @param tagName the tag name
   * @return the emv data got
   * @since 2.x.x
   */
  public byte[] getCardData(java.lang.String tagName) throws android.os.RemoteException;
  /**
   * get EMV data
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
   * @return the return data of EMV
   * @since 2.x.x
   */
  public java.lang.String getEMVData(java.lang.String tagName) throws android.os.RemoteException;
  /**
   * get the AID parameter
   * 
   * @param type - 1-contact aid  2-contactless aid
   * @return null if the AID is unavailable
   * @since 2.x.x
   */
  public java.lang.String[] getAID(int type) throws android.os.RemoteException;
  /**
   * get the RID
   * @return null if the RID is unavailable<br>
   * @since 2.x.x
   * @deprecated
   */
  @Deprecated
  public java.lang.String[] getRID() throws android.os.RemoteException;
  /**
   * Obtain the CTLS card type
   * @return see below:
   * <pre>
   *   0-No Type
   *   1-JCB_CHIP
   *   2-JCB_MSD
   *   3-JCB_Legcy
   *   4-VISA_w1
   *   5-VISA_w3
   *   6-Master_EMV
   *   7-Master_MSD
   *   8-qPBOC_qUICS
   * </pre>
   * @since 2.x.x
   * @deprecated
   */
  @Deprecated
  public int getProcessCardType() throws android.os.RemoteException;
  /**
   * set EMV kernel to use. set this interface before startEMV()
   * @param customAidList see below:
   * <pre>
   * Map < String, Integer >
   * String - custom aid
   * Integer - kernelID(check CTLSKernelID)
   * </pre>
   * @since 2.x.x
   */
  public void registerKernelAID(java.util.Map customAidList) throws android.os.RemoteException;
  /**
   * import(input) the online response
   * 
   * @param onlineResult - the result ( response )
   * <ul>
   * <li> isOnline(boolean)is online</li>
   * <li> respCode(String) the response code(00-approval)</li>
   * <li> authCode(String) the authorize code</li>
   * <li> field55(String) the response of field 55 data</li>
   * </ul>
   * @param handler the result , please refer OnlineResultHandler
   * @since 2.x.x
   */
  public void inputOnlineResult(android.os.Bundle onlineResult, com.vfi.smartpos.deviceservice.aidl.OnlineResultHandler handler) throws android.os.RemoteException;
  /**
   * update CTLS Visa APID or AMEX DRL parameter
   * 
   * @param operation the setting
   * <ul>
   * <li>1：append</li>
   * <li>2：clear</li>
   * </ul>
   * @param DRLData data
   * @return result, true on success, false on failure
   * @since 2.x.x
   */
  public boolean updateVisaAPID(int operation, com.vfi.smartpos.deviceservice.aidl.DRLData drlData) throws android.os.RemoteException;
  /**
   * update card black parameter
   * 
   * @param operation the setting
   * <ul>
   * <li>1：append</li>
   * <li>2：clear</li>
   * </ul>
   * @param BLKData data of card black
   * @param type of card black parameter
   * <ul>
   * <li>1：contact(smart card)</li>
   * <li>2：contactless</li>
   * </ul>
   * @return result, true on success, false on failure
   * @since 2.x.x
   */
  public boolean updateCardBlk(int operation, com.vfi.smartpos.deviceservice.aidl.BLKData blkData, int type) throws android.os.RemoteException;
  /**
   * set smart card request online after Application Selection and before GAC,
   * it can set TVR B4b4(Merchant forced transaction online) is true.
   * 
   * @return result, 0 on success, others on failure
   * @since 2.x.x
   */
  public int emvProcessingRequestOnline() throws android.os.RemoteException;
  /**
   * get the CAPK parameter
   * 
   * @param type - 1-contact aid  2-contactless aid
   * @return null if the CAPK is unavailable
   * @since 2.7.0.0
   */
  public java.lang.String[] getCAPK(int type) throws android.os.RemoteException;
  /**
   * enable Track(It's not necessary.)
   * @param trkNum - bit0=1 enable trk1; bit1=1 enable trk2; bit2=1 enable trk3. So trkNum < 0 or trkNum > 7 will close track1&2&3
   * @since 2.7.0.0
   */
  public void enableTrack(int trkNum) throws android.os.RemoteException;
  /**
   * set ctls pre process(It's not necessary.)
   * @param param setting
   * <ul>
   * <li>traceNo(String):trace no (var. bytes)</li>
   * <li>transProcessCode(byte): (1Byte) Translation type (9C first two digits of the ISO 8583:1987 Processing Code)</li>
   * <li>transCurrCode(String): currency code(5F2A), if not set, kernel will find the tag in AID string.</li>
   * <li>otherAmount(String): set Other Amount (9F03) value</li>
   * <li>authAmount(long): auth-amount (transaction amount)</li>
   * <li>isForceOnline(boolean): is force online </li>
   * <li>ctlsPriority(byte): CTLS application priority, no necessary, b0-MyDebit b1~b7 to be define</li>
   * <li>isForceOffline(boolean): is force offline, no necessary, false is default</li>
   * </ul>
   * @return true-sucess false-failed
   * @since 2.11.0.0
   */
  public boolean setCtlsPreProcess(android.os.Bundle param) throws android.os.RemoteException;
  /**
   * check card, non-block method
   * 
   * @param cardOption the card type (list)
   * <ul>
   * <li>supportMagCard(boolean) support magnetic card</li>
   * <li>supportSmartCard(boolean) support Smart card</li>
   * <li>supportCTLSCard(boolean) support CTLS card</li>
   * </ul>
   * @param timeout the time out(ms)
   * @param listener the listerner while found card
   * @since 2.11.0.0
   */
  public void checkCardMs(android.os.Bundle cardOption, long timeout, com.vfi.smartpos.deviceservice.aidl.CheckCardListener listener) throws android.os.RemoteException;
  /**
   * set before startEMV(), set callback for request issuer update script(CTLS request second tap)
   * @since 2.11.0.0
   */
  public void setIssuerUpdateHandler(com.vfi.smartpos.deviceservice.aidl.IssuerUpdateHandler issuerUpdateHandler) throws android.os.RemoteException;
  /**
   * After CTLS second tap to update script
   * @since 2.11.0.0
   */
  public void setIssuerUpdateScript() throws android.os.RemoteException;
  /**
   * start EMV process
   * @param EMVTransParam @see EMVTransParams.java
   * @param extend
   * <ul>
   *    <li>panConfirmTimeOut(int): set timeout of pan confirm, if not set then default 60s(just support smart card)</li>
   *    <li>appSelectTimeOut(int): set timeout of selectApp, if not set then default 60s(just support smart card)</li>
   *    <li>ctlsPriority(byte): CTLS application priority, no necessary, b0-MCCS MyDebit priority b1-terminal priority,use DF2D to custom set priority b2~b7 to be define</li>
   *    <li>isForceOffline(boolean): is force offline, no necessary, false is default (just support CTLS AMEX kernel)</li>
   *    <li>ctlsAidsForSingleTrans(ArrayList<String>): CTLS transaction input temporary aid params(AID + KernelID(9F2A01xx) + transType(DF2901xx) + transCurrCode(DF2A02xxxx))</li>
   *    <li>isTerminalTypeSetInAID(boolean): default value is false(default vaule is 0x22), you should confirm this tag(9F35) in your AID String when you set this tag is true.</li>
   *    <li>merchCateCode(String): set Merchant Category code for each EMV process, default value is 1234</li>
   * </ul>
   * @param handler the call back handler, please refer EMVHandler
   * @since 2.11.0.0
   */
  public void startEmvWithTransParams(com.vfi.smartpos.deviceservice.aidl.EMVTransParams emvParams, android.os.Bundle extend, com.vfi.smartpos.deviceservice.aidl.EMVHandler handler) throws android.os.RemoteException;
  /**
   * set before startEMV(), set RequestACTypeHandler callback.
   * @since 2.20.3.12
   */
  public void setRequestACTypeCallBack(com.vfi.smartpos.deviceservice.aidl.RequestACTypeHandler requestACTypehandler) throws android.os.RemoteException;
  /**
   * re-set 1GAC AC type
   * @param requestACType: chip card can change 1GAC AC Type(not necessary), 0-AAC, 1-ARQC, 2-TC</li>
   * @since 2.20.3.12
   */
  public void setRequestACType(int requestACType) throws android.os.RemoteException;
  /**
   * select spec version of kernel before startEMV(), pls refer CTLSKernelID
   * @param kernelID:
   * <pre>
   * Map < Integer kernelID, Integer ver >
   *      kernelId- kernelID(check CTLSKernelID) ver- Specification Version
   *      kernelId:2(Master)  0 - 3.1 ver(default), 1 - 3.1.2 ver
   *      kernelId:4(AMEX)  0 - 3.1 ver (default), 1 - 4.0.2 ver
   *      kernelId:5(JCB)  0 - 1.3 ver(default), 1 - 1.4 ver
   * </pre>
   * @since 2.20.3.12
   */
  public void reRegistKernelVersion(java.util.Map tlvList) throws android.os.RemoteException;
  /**
   * reset emvHandler in EMV process
   * @param EMVHandler please refer EMVHandler
   * @since 2.20.3.12
   */
  public void resetEmvHandler(com.vfi.smartpos.deviceservice.aidl.EMVHandler handler) throws android.os.RemoteException;
  /**
   * set bypass all PIN
   * @param byPassAllPin: default is false, if set true, will bypass all PIN
   * @since 2.23.0
   */
  public void setByPassAllPin(boolean byPassAllPin) throws android.os.RemoteException;
  /**
   * get bypass all PIN status
   * @return true - bypass all PIN, false - not bypass all PIN
   * @since 2.23.0
   */
  public boolean isByPassAllPin() throws android.os.RemoteException;
  /**
   * update AID/CAPK/DRL parameter
   * 
   * @param operation the setting
   * <ul>
   * <li>1：append</li>
   * <li>2：clear</li>
   * </ul>
   * @param paramType.
   * <ul>
   * <li>1：AID contact</li>
   * <li>2：AID contactless</li>
   * <li>3：RID/CAPK</li>
   * <li>4：DRL</li>
   * </ul>
   * @param params the AID/RID/CAPK parameter value, if DRL type, set NULL.
   * @param extend
   * <ul>
   *    <li>groupName(String): group name</li>
   *    <li>DRLData(Parcelable): input DRLData object if paramType is 4</li>
   * </ul>
   * @return result, true on success, false on failure
   * @since 3.6.3
   */
  public boolean updateGroupParam(int operation, int paramType, java.lang.String params, android.os.Bundle extend) throws android.os.RemoteException;
  /**
   * obtain card issuer CTLS specification version.
   * @return Map - Spec version of all CTLS kernels
   * Map < String kernel, String SpecVer>
   *      kernel: AMEX; MASTER; JCB; VISA; DISCOVER; CUP; RUPAY; PURE; MIR
   * @throws RemoteException
   * @since 3.10.x
   */
  public java.util.Map getCtlsSpecVer() throws android.os.RemoteException;
  /**
   * same as updateVisaAPID() interface
   * 
   * @since 3.11.x
   */
  public boolean updateDRL(int operation, com.vfi.smartpos.deviceservice.aidl.DRLData drlData) throws android.os.RemoteException;
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
