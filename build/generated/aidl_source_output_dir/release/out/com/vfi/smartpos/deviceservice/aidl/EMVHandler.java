/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.vfi.smartpos.deviceservice.aidl;
/**
 * the callback handler of EMV transaction
 * @author Kai.L@verifone.cn, Chao.L@verifone.cn
 */
public interface EMVHandler extends android.os.IInterface
{
  /** Default implementation for EMVHandler. */
  public static class Default implements com.vfi.smartpos.deviceservice.aidl.EMVHandler
  {
    /**
     * on request amount
     * 
     * This method won't be called.
     * The amount should be set while calling the IEMV#startEMV.
     * @deprecated
     */
    @Override public void onRequestAmount() throws android.os.RemoteException
    {
    }
    /**
     * on select application
     * 
     * @param appList the application bundle list
     * <ul>
     *     <li>aidName(String): TAG9F12 Application Preferred Name</li>
     *     <li>aidLabel(String): TAG50 Application Label</li>
     *     <li>aid(String): Application Identifier</li>
     *     <li>aidPriority(int): TAG87 Application Priority Indicator </li>
     *     <li>aidIssuerIdx(int): TAG9F11 Issuer Code Table Index </li>
     * </ul>
     */
    @Override public void onSelectApplication(java.util.List<android.os.Bundle> appList) throws android.os.RemoteException
    {
    }
    /**
     * on confirm card information
     * 
     * @param info the card information
     * <ul>
     * <li>PAN(String) the PAN </li>
     * <li>TRACK1(String) track 1</li>
     * <li>TRACK2(String) track 2</li>
     * <li>CARD_SN(String) card serial number</li>
     * <li>SERVICE_CODE(String) service code</li>
     * <li>EXPIRED_DATE(String) expired date</li>
     * <li>CARD_TYPE(int) card type by CTLS<br>
     *    |---- 0 emv card <br>
     *    |---- 1 mstripe  card <br>
     *    |---- 2 other <br>
     * </li>
     * </ul>
     */
    @Override public void onConfirmCardInfo(android.os.Bundle info) throws android.os.RemoteException
    {
    }
    /**
     * on request input pin
     * 
     * @param isOnlinePin is online pin request
     * @param retryTimes the retry max times of offline pin
     */
    @Override public void onRequestInputPIN(boolean isOnlinePin, int retryTimes) throws android.os.RemoteException
    {
    }
    /**
     * on confirm card holder certinfo
     * 
     * @param certType the cert type
     * @param certInfo the cert information
     */
    @Override public void onConfirmCertInfo(java.lang.String certType, java.lang.String certInfo) throws android.os.RemoteException
    {
    }
    /**
     * on request online process
     * 
     * @param aaResult the result
     * <ul>
     * <li style="text-decoration:line-through;>SIGNATURE(boolean) need to sign<br>
     * <li>CTLS_CVMR(int) get ctls cvm<br>
     *     |---0 NO_CVM<br>
     *     |---1 CVM_PIN<br>
     *     |---2 CVM_SIGN<br>
     *     |---3 CVM_CDCVM<br>
     * <li>RESULT(int) result type<br>
     *   |----CTLS_ARQC(201) - CTLS_ARQC, online request, part of EMV standard<br>
     *   |----AARESULT_ARQC(2) - AARESULT ARQC, the action analysis result<br>
     *   |----PAYPASS_MAG_ARQC(302)-the mode of magnetic card on paypass request<br>
     *   |----PAYPASS_EMV_ARQC(303)- the mode of EMV on paypass request<br>
     * <li>ARQC_DATA(String) - request some of Field55 data, or you can use getAppTLVList() to get by yourself</li>
     *   |----(CTLS data include "9F26,9F27,9F10,9F37,9F1A,9F36,95,9A,9C,9F02,5F2A,82,9F03,9F33,9F34,9F35,84,9F1E,9F09,9F41")<br>
     *   |----(IC data include "9F26,9F27,9F10,9F37,9F36,95,9A,9C,9F02,5F2A,82,9F1A,9F03,9F33,9F34,9F35,9F1E,84,9F09,9F41")<br>
     * <li>REVERSAL_DATA(String) - some of reversal data of IC card, or you can use getAppTLVList() to get by yourself</li>
     *   |----(IC data include "9F26,9F27,9F10,9F37,9F36,95,9A,9C,9F02,5F2A,82,9F1A,9F03,9F33,9F34,9F35,9F1E,84,9F09,9F41")<br>
     * </ul>
     */
    @Override public void onRequestOnlineProcess(android.os.Bundle aaResult) throws android.os.RemoteException
    {
    }
    /**
     * the result of EMV, failure on transaction , etc
     * @param result the result
     * <ul>
     * <li>EMV_NO_APP(8) - emv no application(aid param)</li>
     * <li>EMV_COMPLETE(9) - emv complete </li>
     * <li>EMV_OTHER_ERROR(11) - emv other error,transaction abort</li>
     * <li>EMV_FALLBACK(12) - FALLBACK </li>
     * <li>EMV_DATA_AUTH_FAIL(13) - data auth fail </li>
     * <li>EMV_APP_BLOCKED(14) - app has been blocked </li>
     * <li>EMV_NOT_ECCARD(15) - not EC </li>
     * <li>EMV_UNSUPPORT_ECCARD(16) - unsupport EC </li>
     * <li>EMV_AMOUNT_EXCEED_ON_PURELYEC(17) - amount exceed EC </li>
     * <li>EMV_SET_PARAM_ERROR(18) - set parameter fail on 9F7A </li>
     * <li>EMV_PAN_NOT_MATCH_TRACK2(19) - pan not match track2 </li>
     * <li>EMV_CARD_HOLDER_VALIDATE_ERROR(20) - card holder validate error </li>
     * <li>EMV_PURELYEC_REJECT(21) - purely EC transaction reject </li>
     * <li>EMV_BALANCE_INSUFFICIENT(22) - balance insufficient</li>
     * <li>EMV_AMOUNT_EXCEED_ON_RFLIMIT_CHECK(23) - amount exceed the CTLS limit</li>
     * <li>EMV_CARD_BIN_CHECK_FAIL(24) - check card failed </li>
     * <li>EMV_CARD_BLOCKED(25) - card has been block </li>
     * <li>EMV_MULTI_CARD_ERROR(26) - multiple card conflict </li>
     * <li>EMV_INITERR_GPOCMD(27) - GPO Processing Options response error </li>
     * <li>EMV_GACERR_GACCMD(28) - GAC response error </li>
     * <li>EMV_TRY_AGAIN(29) - Try again </li>
     * <li>EMV_ODA_FAILED(30) - ODA failed </li>
     * <li>EMV_CVM_FAILED(31) - CVM response error</li>
     * 
     * <li>EMV_RFCARD_PASS_FAIL(60) - tap card failure</li>
     * <li>AARESULT_TC(0) - TC on action analysis</li>
     * <li>AARESULT_AAC(1) - refuse on action analysis</li>
     * 
     * <li>CTLS_AAC(202) - refuse on CTLS </li>
     * <li>CTLS_ERROR(203) - error on CTLS </li>
     * <li>CTLS_TC(204) - approval on CTLS</li>
     * <li>CTLS_CONT(205) - need contact</li>
     * <li>CTLS_NO_APP(206) - result of CTLS, no application (UP Card maybe available)</li>
     * <li>CTLS_NOT_CPU_CARD(207) - not a cpu card</li>
     * <li>CTLS_ABORT(208) - Transation abort</li>
     * <li>CTLS_ISSUERUPDATE_APPROVE(209) - Second tap, issuer update approve</li>
     * <li>CTLS_CARD_BLOCK(210) -  6A81 error card block</li>
     * <li>CTLS_SEL_FILE_INVALID(211) -  6283 error Selected file invalidated</li>
     * 
     * <li>EMV_SEE_PHONE(150) - paypass result, please check the result on phone</li>
     * <li>QPBOC_KERNAL_INIT_FAILED(301) - CTLS kernel init failed</li>
     * </ul>
     * 
     * @param data data of result
     * <ul>
     * <li>TC_DATA(String) - the string of TC, you can use getAppTLVList() to get by yourself</li>
     *     |-----(TC data include "9F26,9F27,9F10,9F37,9F36,95,9A,9C,9F02,5F2A,82,9F1A,9F03,9F33,9F34,9F35,9F1E,84,9F09,9F41,9F63,91")
     * <li>REVERSAL_DATA(String) - the string of reversal data</li>
     * <li>ERROR(String) - the error description ( from the result of EMV) </li>
     * <li style="text-decoration:line-through;>SIGNATURE(boolean) need to sign when result is "CTLS_TC(204)"<br>
     * <li>CTLS_CVMR(int) get ctls cvm when result is "CTLS_TC(204)"<br>
     *     |---0 NO_CVM<br>
     *     |---1 CVM_PIN<br>
     *     |---2 CVM_SIGN<br>
     *     |---3 CVM_CDCVM<br>
     * <li>CARD_TYPE(int) card type by CTLS<br>
     *    |---- 0 emv card <br>
     *    |---- 1 mstripe  card <br>
     *    |---- 2 other <br>
     * </ul>
     */
    @Override public void onTransactionResult(int result, android.os.Bundle data) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.vfi.smartpos.deviceservice.aidl.EMVHandler
  {
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.vfi.smartpos.deviceservice.aidl.EMVHandler interface,
     * generating a proxy if needed.
     */
    public static com.vfi.smartpos.deviceservice.aidl.EMVHandler asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.vfi.smartpos.deviceservice.aidl.EMVHandler))) {
        return ((com.vfi.smartpos.deviceservice.aidl.EMVHandler)iin);
      }
      return new com.vfi.smartpos.deviceservice.aidl.EMVHandler.Stub.Proxy(obj);
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
        case TRANSACTION_onRequestAmount:
        {
          this.onRequestAmount();
          reply.writeNoException();
          break;
        }
        case TRANSACTION_onSelectApplication:
        {
          java.util.List<android.os.Bundle> _arg0;
          _arg0 = data.createTypedArrayList(android.os.Bundle.CREATOR);
          this.onSelectApplication(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_onConfirmCardInfo:
        {
          android.os.Bundle _arg0;
          _arg0 = _Parcel.readTypedObject(data, android.os.Bundle.CREATOR);
          this.onConfirmCardInfo(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_onRequestInputPIN:
        {
          boolean _arg0;
          _arg0 = (0!=data.readInt());
          int _arg1;
          _arg1 = data.readInt();
          this.onRequestInputPIN(_arg0, _arg1);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_onConfirmCertInfo:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _arg1;
          _arg1 = data.readString();
          this.onConfirmCertInfo(_arg0, _arg1);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_onRequestOnlineProcess:
        {
          android.os.Bundle _arg0;
          _arg0 = _Parcel.readTypedObject(data, android.os.Bundle.CREATOR);
          this.onRequestOnlineProcess(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_onTransactionResult:
        {
          int _arg0;
          _arg0 = data.readInt();
          android.os.Bundle _arg1;
          _arg1 = _Parcel.readTypedObject(data, android.os.Bundle.CREATOR);
          this.onTransactionResult(_arg0, _arg1);
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
    private static class Proxy implements com.vfi.smartpos.deviceservice.aidl.EMVHandler
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
       * on request amount
       * 
       * This method won't be called.
       * The amount should be set while calling the IEMV#startEMV.
       * @deprecated
       */
      @Override public void onRequestAmount() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onRequestAmount, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * on select application
       * 
       * @param appList the application bundle list
       * <ul>
       *     <li>aidName(String): TAG9F12 Application Preferred Name</li>
       *     <li>aidLabel(String): TAG50 Application Label</li>
       *     <li>aid(String): Application Identifier</li>
       *     <li>aidPriority(int): TAG87 Application Priority Indicator </li>
       *     <li>aidIssuerIdx(int): TAG9F11 Issuer Code Table Index </li>
       * </ul>
       */
      @Override public void onSelectApplication(java.util.List<android.os.Bundle> appList) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedList(appList);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onSelectApplication, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * on confirm card information
       * 
       * @param info the card information
       * <ul>
       * <li>PAN(String) the PAN </li>
       * <li>TRACK1(String) track 1</li>
       * <li>TRACK2(String) track 2</li>
       * <li>CARD_SN(String) card serial number</li>
       * <li>SERVICE_CODE(String) service code</li>
       * <li>EXPIRED_DATE(String) expired date</li>
       * <li>CARD_TYPE(int) card type by CTLS<br>
       *    |---- 0 emv card <br>
       *    |---- 1 mstripe  card <br>
       *    |---- 2 other <br>
       * </li>
       * </ul>
       */
      @Override public void onConfirmCardInfo(android.os.Bundle info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _Parcel.writeTypedObject(_data, info, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onConfirmCardInfo, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * on request input pin
       * 
       * @param isOnlinePin is online pin request
       * @param retryTimes the retry max times of offline pin
       */
      @Override public void onRequestInputPIN(boolean isOnlinePin, int retryTimes) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(((isOnlinePin)?(1):(0)));
          _data.writeInt(retryTimes);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onRequestInputPIN, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * on confirm card holder certinfo
       * 
       * @param certType the cert type
       * @param certInfo the cert information
       */
      @Override public void onConfirmCertInfo(java.lang.String certType, java.lang.String certInfo) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(certType);
          _data.writeString(certInfo);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onConfirmCertInfo, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * on request online process
       * 
       * @param aaResult the result
       * <ul>
       * <li style="text-decoration:line-through;>SIGNATURE(boolean) need to sign<br>
       * <li>CTLS_CVMR(int) get ctls cvm<br>
       *     |---0 NO_CVM<br>
       *     |---1 CVM_PIN<br>
       *     |---2 CVM_SIGN<br>
       *     |---3 CVM_CDCVM<br>
       * <li>RESULT(int) result type<br>
       *   |----CTLS_ARQC(201) - CTLS_ARQC, online request, part of EMV standard<br>
       *   |----AARESULT_ARQC(2) - AARESULT ARQC, the action analysis result<br>
       *   |----PAYPASS_MAG_ARQC(302)-the mode of magnetic card on paypass request<br>
       *   |----PAYPASS_EMV_ARQC(303)- the mode of EMV on paypass request<br>
       * <li>ARQC_DATA(String) - request some of Field55 data, or you can use getAppTLVList() to get by yourself</li>
       *   |----(CTLS data include "9F26,9F27,9F10,9F37,9F1A,9F36,95,9A,9C,9F02,5F2A,82,9F03,9F33,9F34,9F35,84,9F1E,9F09,9F41")<br>
       *   |----(IC data include "9F26,9F27,9F10,9F37,9F36,95,9A,9C,9F02,5F2A,82,9F1A,9F03,9F33,9F34,9F35,9F1E,84,9F09,9F41")<br>
       * <li>REVERSAL_DATA(String) - some of reversal data of IC card, or you can use getAppTLVList() to get by yourself</li>
       *   |----(IC data include "9F26,9F27,9F10,9F37,9F36,95,9A,9C,9F02,5F2A,82,9F1A,9F03,9F33,9F34,9F35,9F1E,84,9F09,9F41")<br>
       * </ul>
       */
      @Override public void onRequestOnlineProcess(android.os.Bundle aaResult) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _Parcel.writeTypedObject(_data, aaResult, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onRequestOnlineProcess, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * the result of EMV, failure on transaction , etc
       * @param result the result
       * <ul>
       * <li>EMV_NO_APP(8) - emv no application(aid param)</li>
       * <li>EMV_COMPLETE(9) - emv complete </li>
       * <li>EMV_OTHER_ERROR(11) - emv other error,transaction abort</li>
       * <li>EMV_FALLBACK(12) - FALLBACK </li>
       * <li>EMV_DATA_AUTH_FAIL(13) - data auth fail </li>
       * <li>EMV_APP_BLOCKED(14) - app has been blocked </li>
       * <li>EMV_NOT_ECCARD(15) - not EC </li>
       * <li>EMV_UNSUPPORT_ECCARD(16) - unsupport EC </li>
       * <li>EMV_AMOUNT_EXCEED_ON_PURELYEC(17) - amount exceed EC </li>
       * <li>EMV_SET_PARAM_ERROR(18) - set parameter fail on 9F7A </li>
       * <li>EMV_PAN_NOT_MATCH_TRACK2(19) - pan not match track2 </li>
       * <li>EMV_CARD_HOLDER_VALIDATE_ERROR(20) - card holder validate error </li>
       * <li>EMV_PURELYEC_REJECT(21) - purely EC transaction reject </li>
       * <li>EMV_BALANCE_INSUFFICIENT(22) - balance insufficient</li>
       * <li>EMV_AMOUNT_EXCEED_ON_RFLIMIT_CHECK(23) - amount exceed the CTLS limit</li>
       * <li>EMV_CARD_BIN_CHECK_FAIL(24) - check card failed </li>
       * <li>EMV_CARD_BLOCKED(25) - card has been block </li>
       * <li>EMV_MULTI_CARD_ERROR(26) - multiple card conflict </li>
       * <li>EMV_INITERR_GPOCMD(27) - GPO Processing Options response error </li>
       * <li>EMV_GACERR_GACCMD(28) - GAC response error </li>
       * <li>EMV_TRY_AGAIN(29) - Try again </li>
       * <li>EMV_ODA_FAILED(30) - ODA failed </li>
       * <li>EMV_CVM_FAILED(31) - CVM response error</li>
       * 
       * <li>EMV_RFCARD_PASS_FAIL(60) - tap card failure</li>
       * <li>AARESULT_TC(0) - TC on action analysis</li>
       * <li>AARESULT_AAC(1) - refuse on action analysis</li>
       * 
       * <li>CTLS_AAC(202) - refuse on CTLS </li>
       * <li>CTLS_ERROR(203) - error on CTLS </li>
       * <li>CTLS_TC(204) - approval on CTLS</li>
       * <li>CTLS_CONT(205) - need contact</li>
       * <li>CTLS_NO_APP(206) - result of CTLS, no application (UP Card maybe available)</li>
       * <li>CTLS_NOT_CPU_CARD(207) - not a cpu card</li>
       * <li>CTLS_ABORT(208) - Transation abort</li>
       * <li>CTLS_ISSUERUPDATE_APPROVE(209) - Second tap, issuer update approve</li>
       * <li>CTLS_CARD_BLOCK(210) -  6A81 error card block</li>
       * <li>CTLS_SEL_FILE_INVALID(211) -  6283 error Selected file invalidated</li>
       * 
       * <li>EMV_SEE_PHONE(150) - paypass result, please check the result on phone</li>
       * <li>QPBOC_KERNAL_INIT_FAILED(301) - CTLS kernel init failed</li>
       * </ul>
       * 
       * @param data data of result
       * <ul>
       * <li>TC_DATA(String) - the string of TC, you can use getAppTLVList() to get by yourself</li>
       *     |-----(TC data include "9F26,9F27,9F10,9F37,9F36,95,9A,9C,9F02,5F2A,82,9F1A,9F03,9F33,9F34,9F35,9F1E,84,9F09,9F41,9F63,91")
       * <li>REVERSAL_DATA(String) - the string of reversal data</li>
       * <li>ERROR(String) - the error description ( from the result of EMV) </li>
       * <li style="text-decoration:line-through;>SIGNATURE(boolean) need to sign when result is "CTLS_TC(204)"<br>
       * <li>CTLS_CVMR(int) get ctls cvm when result is "CTLS_TC(204)"<br>
       *     |---0 NO_CVM<br>
       *     |---1 CVM_PIN<br>
       *     |---2 CVM_SIGN<br>
       *     |---3 CVM_CDCVM<br>
       * <li>CARD_TYPE(int) card type by CTLS<br>
       *    |---- 0 emv card <br>
       *    |---- 1 mstripe  card <br>
       *    |---- 2 other <br>
       * </ul>
       */
      @Override public void onTransactionResult(int result, android.os.Bundle data) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(result);
          _Parcel.writeTypedObject(_data, data, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onTransactionResult, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
    }
    static final int TRANSACTION_onRequestAmount = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_onSelectApplication = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_onConfirmCardInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_onRequestInputPIN = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_onConfirmCertInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_onRequestOnlineProcess = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_onTransactionResult = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
  }
  public static final java.lang.String DESCRIPTOR = "com.vfi.smartpos.deviceservice.aidl.EMVHandler";
  /**
   * on request amount
   * 
   * This method won't be called.
   * The amount should be set while calling the IEMV#startEMV.
   * @deprecated
   */
  @Deprecated
  public void onRequestAmount() throws android.os.RemoteException;
  /**
   * on select application
   * 
   * @param appList the application bundle list
   * <ul>
   *     <li>aidName(String): TAG9F12 Application Preferred Name</li>
   *     <li>aidLabel(String): TAG50 Application Label</li>
   *     <li>aid(String): Application Identifier</li>
   *     <li>aidPriority(int): TAG87 Application Priority Indicator </li>
   *     <li>aidIssuerIdx(int): TAG9F11 Issuer Code Table Index </li>
   * </ul>
   */
  public void onSelectApplication(java.util.List<android.os.Bundle> appList) throws android.os.RemoteException;
  /**
   * on confirm card information
   * 
   * @param info the card information
   * <ul>
   * <li>PAN(String) the PAN </li>
   * <li>TRACK1(String) track 1</li>
   * <li>TRACK2(String) track 2</li>
   * <li>CARD_SN(String) card serial number</li>
   * <li>SERVICE_CODE(String) service code</li>
   * <li>EXPIRED_DATE(String) expired date</li>
   * <li>CARD_TYPE(int) card type by CTLS<br>
   *    |---- 0 emv card <br>
   *    |---- 1 mstripe  card <br>
   *    |---- 2 other <br>
   * </li>
   * </ul>
   */
  public void onConfirmCardInfo(android.os.Bundle info) throws android.os.RemoteException;
  /**
   * on request input pin
   * 
   * @param isOnlinePin is online pin request
   * @param retryTimes the retry max times of offline pin
   */
  public void onRequestInputPIN(boolean isOnlinePin, int retryTimes) throws android.os.RemoteException;
  /**
   * on confirm card holder certinfo
   * 
   * @param certType the cert type
   * @param certInfo the cert information
   */
  public void onConfirmCertInfo(java.lang.String certType, java.lang.String certInfo) throws android.os.RemoteException;
  /**
   * on request online process
   * 
   * @param aaResult the result
   * <ul>
   * <li style="text-decoration:line-through;>SIGNATURE(boolean) need to sign<br>
   * <li>CTLS_CVMR(int) get ctls cvm<br>
   *     |---0 NO_CVM<br>
   *     |---1 CVM_PIN<br>
   *     |---2 CVM_SIGN<br>
   *     |---3 CVM_CDCVM<br>
   * <li>RESULT(int) result type<br>
   *   |----CTLS_ARQC(201) - CTLS_ARQC, online request, part of EMV standard<br>
   *   |----AARESULT_ARQC(2) - AARESULT ARQC, the action analysis result<br>
   *   |----PAYPASS_MAG_ARQC(302)-the mode of magnetic card on paypass request<br>
   *   |----PAYPASS_EMV_ARQC(303)- the mode of EMV on paypass request<br>
   * <li>ARQC_DATA(String) - request some of Field55 data, or you can use getAppTLVList() to get by yourself</li>
   *   |----(CTLS data include "9F26,9F27,9F10,9F37,9F1A,9F36,95,9A,9C,9F02,5F2A,82,9F03,9F33,9F34,9F35,84,9F1E,9F09,9F41")<br>
   *   |----(IC data include "9F26,9F27,9F10,9F37,9F36,95,9A,9C,9F02,5F2A,82,9F1A,9F03,9F33,9F34,9F35,9F1E,84,9F09,9F41")<br>
   * <li>REVERSAL_DATA(String) - some of reversal data of IC card, or you can use getAppTLVList() to get by yourself</li>
   *   |----(IC data include "9F26,9F27,9F10,9F37,9F36,95,9A,9C,9F02,5F2A,82,9F1A,9F03,9F33,9F34,9F35,9F1E,84,9F09,9F41")<br>
   * </ul>
   */
  public void onRequestOnlineProcess(android.os.Bundle aaResult) throws android.os.RemoteException;
  /**
   * the result of EMV, failure on transaction , etc
   * @param result the result
   * <ul>
   * <li>EMV_NO_APP(8) - emv no application(aid param)</li>
   * <li>EMV_COMPLETE(9) - emv complete </li>
   * <li>EMV_OTHER_ERROR(11) - emv other error,transaction abort</li>
   * <li>EMV_FALLBACK(12) - FALLBACK </li>
   * <li>EMV_DATA_AUTH_FAIL(13) - data auth fail </li>
   * <li>EMV_APP_BLOCKED(14) - app has been blocked </li>
   * <li>EMV_NOT_ECCARD(15) - not EC </li>
   * <li>EMV_UNSUPPORT_ECCARD(16) - unsupport EC </li>
   * <li>EMV_AMOUNT_EXCEED_ON_PURELYEC(17) - amount exceed EC </li>
   * <li>EMV_SET_PARAM_ERROR(18) - set parameter fail on 9F7A </li>
   * <li>EMV_PAN_NOT_MATCH_TRACK2(19) - pan not match track2 </li>
   * <li>EMV_CARD_HOLDER_VALIDATE_ERROR(20) - card holder validate error </li>
   * <li>EMV_PURELYEC_REJECT(21) - purely EC transaction reject </li>
   * <li>EMV_BALANCE_INSUFFICIENT(22) - balance insufficient</li>
   * <li>EMV_AMOUNT_EXCEED_ON_RFLIMIT_CHECK(23) - amount exceed the CTLS limit</li>
   * <li>EMV_CARD_BIN_CHECK_FAIL(24) - check card failed </li>
   * <li>EMV_CARD_BLOCKED(25) - card has been block </li>
   * <li>EMV_MULTI_CARD_ERROR(26) - multiple card conflict </li>
   * <li>EMV_INITERR_GPOCMD(27) - GPO Processing Options response error </li>
   * <li>EMV_GACERR_GACCMD(28) - GAC response error </li>
   * <li>EMV_TRY_AGAIN(29) - Try again </li>
   * <li>EMV_ODA_FAILED(30) - ODA failed </li>
   * <li>EMV_CVM_FAILED(31) - CVM response error</li>
   * 
   * <li>EMV_RFCARD_PASS_FAIL(60) - tap card failure</li>
   * <li>AARESULT_TC(0) - TC on action analysis</li>
   * <li>AARESULT_AAC(1) - refuse on action analysis</li>
   * 
   * <li>CTLS_AAC(202) - refuse on CTLS </li>
   * <li>CTLS_ERROR(203) - error on CTLS </li>
   * <li>CTLS_TC(204) - approval on CTLS</li>
   * <li>CTLS_CONT(205) - need contact</li>
   * <li>CTLS_NO_APP(206) - result of CTLS, no application (UP Card maybe available)</li>
   * <li>CTLS_NOT_CPU_CARD(207) - not a cpu card</li>
   * <li>CTLS_ABORT(208) - Transation abort</li>
   * <li>CTLS_ISSUERUPDATE_APPROVE(209) - Second tap, issuer update approve</li>
   * <li>CTLS_CARD_BLOCK(210) -  6A81 error card block</li>
   * <li>CTLS_SEL_FILE_INVALID(211) -  6283 error Selected file invalidated</li>
   * 
   * <li>EMV_SEE_PHONE(150) - paypass result, please check the result on phone</li>
   * <li>QPBOC_KERNAL_INIT_FAILED(301) - CTLS kernel init failed</li>
   * </ul>
   * 
   * @param data data of result
   * <ul>
   * <li>TC_DATA(String) - the string of TC, you can use getAppTLVList() to get by yourself</li>
   *     |-----(TC data include "9F26,9F27,9F10,9F37,9F36,95,9A,9C,9F02,5F2A,82,9F1A,9F03,9F33,9F34,9F35,9F1E,84,9F09,9F41,9F63,91")
   * <li>REVERSAL_DATA(String) - the string of reversal data</li>
   * <li>ERROR(String) - the error description ( from the result of EMV) </li>
   * <li style="text-decoration:line-through;>SIGNATURE(boolean) need to sign when result is "CTLS_TC(204)"<br>
   * <li>CTLS_CVMR(int) get ctls cvm when result is "CTLS_TC(204)"<br>
   *     |---0 NO_CVM<br>
   *     |---1 CVM_PIN<br>
   *     |---2 CVM_SIGN<br>
   *     |---3 CVM_CDCVM<br>
   * <li>CARD_TYPE(int) card type by CTLS<br>
   *    |---- 0 emv card <br>
   *    |---- 1 mstripe  card <br>
   *    |---- 2 other <br>
   * </ul>
   */
  public void onTransactionResult(int result, android.os.Bundle data) throws android.os.RemoteException;
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
