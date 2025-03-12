/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.vfi.smartpos.deviceservice.aidl;
/**
 * listener of CTLS search
 * @since 1.x.x
 */
public interface RFSearchListener extends android.os.IInterface
{
  /** Default implementation for RFSearchListener. */
  public static class Default implements com.vfi.smartpos.deviceservice.aidl.RFSearchListener
  {
    /**
     * on card pass
     * 
     * @param cardType the card type<BR>
     * <ul><BR>
     * <li>S50_CARD(0x00) S50, mifare card</li><BR>
     * <li>S70_CARD(0x01) - S70, mifare card</li><BR>
     * <li>PRO_CARD(0x02) - PRO card</li><BR>
     * <li>S50_PRO_CARD(0x03) - S50 PRO card</li><BR>
     * <li>S70_PRO_CARD(0x04) - S70 PRO card </li><BR>
     * <li>CPU_CARD_A(0x05) - CPU A card(contactless card)</li><BR>
     * <li>CPU_CARD_B(0x06) - CPU B card(contactless card)</li><BR>
     * <li>UltraLight_CARD_C(0x07) - Mifare UltraLight card C</li><BR>
     * <li>Mifare_Desfire(0x08) - Mifare Desfire card(EV1)</li><BR>
     * <li>NTAG_CARD(0x09) - NTAG card</li><BR>
     * <li>ICode_CARD(0x0A) - ICode card</li><BR>
     * <li>UltraLight_CARD(0x0B) - UltraLight card</li><BR>
     * <li>Mifare_Plus_CARD(0x0C) - Mifare plus card</li><BR>
     * <li>UltraLight_CARD_EV1(0x0D) - Mifare UltraLight card EV1</li><BR>
     * <li>UltraLight_CARD_Nano(0x0E) - Mifare UltraLight card Nano</li><BR>
     * </ul>
     * @since 1.x.x
     */
    @Override public void onCardPass(int cardType) throws android.os.RemoteException
    {
    }
    /**
     * on failure
     * 
     * @param error the error code<BR>
     * <ul><BR>
     * <li>ERROR_TRANSERR(0xA2) error on transation, communication</li><BR>
     * <li>ERROR_PROTERR(0xA3) the response is illegal</li><BR>
     * <li>ERROR_MULTIERR(0x84)multi-cards found</li><BR>
     * <li>ERROR_CARDTIMEOUT(0xA7) timeout</li><BR>
     * <li>ERROR_CARDNOACT(0xB3) card (pro, typeB) not actived</li><BR>
     * <li>ERROR_MCSERVICE_CRASH(0xff01) mater service crash</li><BR>
     * <li>ERROR_REQUEST_EXCEPTION(0xff02) request exception </li><BR>
     * </ul><BR>
     * @param message - the message
     * @since 1.x.x
     */
    @Override public void onFail(int error, java.lang.String message) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.vfi.smartpos.deviceservice.aidl.RFSearchListener
  {
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.vfi.smartpos.deviceservice.aidl.RFSearchListener interface,
     * generating a proxy if needed.
     */
    public static com.vfi.smartpos.deviceservice.aidl.RFSearchListener asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.vfi.smartpos.deviceservice.aidl.RFSearchListener))) {
        return ((com.vfi.smartpos.deviceservice.aidl.RFSearchListener)iin);
      }
      return new com.vfi.smartpos.deviceservice.aidl.RFSearchListener.Stub.Proxy(obj);
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
        case TRANSACTION_onCardPass:
        {
          int _arg0;
          _arg0 = data.readInt();
          this.onCardPass(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_onFail:
        {
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          this.onFail(_arg0, _arg1);
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
    private static class Proxy implements com.vfi.smartpos.deviceservice.aidl.RFSearchListener
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
       * on card pass
       * 
       * @param cardType the card type<BR>
       * <ul><BR>
       * <li>S50_CARD(0x00) S50, mifare card</li><BR>
       * <li>S70_CARD(0x01) - S70, mifare card</li><BR>
       * <li>PRO_CARD(0x02) - PRO card</li><BR>
       * <li>S50_PRO_CARD(0x03) - S50 PRO card</li><BR>
       * <li>S70_PRO_CARD(0x04) - S70 PRO card </li><BR>
       * <li>CPU_CARD_A(0x05) - CPU A card(contactless card)</li><BR>
       * <li>CPU_CARD_B(0x06) - CPU B card(contactless card)</li><BR>
       * <li>UltraLight_CARD_C(0x07) - Mifare UltraLight card C</li><BR>
       * <li>Mifare_Desfire(0x08) - Mifare Desfire card(EV1)</li><BR>
       * <li>NTAG_CARD(0x09) - NTAG card</li><BR>
       * <li>ICode_CARD(0x0A) - ICode card</li><BR>
       * <li>UltraLight_CARD(0x0B) - UltraLight card</li><BR>
       * <li>Mifare_Plus_CARD(0x0C) - Mifare plus card</li><BR>
       * <li>UltraLight_CARD_EV1(0x0D) - Mifare UltraLight card EV1</li><BR>
       * <li>UltraLight_CARD_Nano(0x0E) - Mifare UltraLight card Nano</li><BR>
       * </ul>
       * @since 1.x.x
       */
      @Override public void onCardPass(int cardType) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(cardType);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onCardPass, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * on failure
       * 
       * @param error the error code<BR>
       * <ul><BR>
       * <li>ERROR_TRANSERR(0xA2) error on transation, communication</li><BR>
       * <li>ERROR_PROTERR(0xA3) the response is illegal</li><BR>
       * <li>ERROR_MULTIERR(0x84)multi-cards found</li><BR>
       * <li>ERROR_CARDTIMEOUT(0xA7) timeout</li><BR>
       * <li>ERROR_CARDNOACT(0xB3) card (pro, typeB) not actived</li><BR>
       * <li>ERROR_MCSERVICE_CRASH(0xff01) mater service crash</li><BR>
       * <li>ERROR_REQUEST_EXCEPTION(0xff02) request exception </li><BR>
       * </ul><BR>
       * @param message - the message
       * @since 1.x.x
       */
      @Override public void onFail(int error, java.lang.String message) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(error);
          _data.writeString(message);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onFail, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
    }
    static final int TRANSACTION_onCardPass = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_onFail = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
  }
  public static final java.lang.String DESCRIPTOR = "com.vfi.smartpos.deviceservice.aidl.RFSearchListener";
  /**
   * on card pass
   * 
   * @param cardType the card type<BR>
   * <ul><BR>
   * <li>S50_CARD(0x00) S50, mifare card</li><BR>
   * <li>S70_CARD(0x01) - S70, mifare card</li><BR>
   * <li>PRO_CARD(0x02) - PRO card</li><BR>
   * <li>S50_PRO_CARD(0x03) - S50 PRO card</li><BR>
   * <li>S70_PRO_CARD(0x04) - S70 PRO card </li><BR>
   * <li>CPU_CARD_A(0x05) - CPU A card(contactless card)</li><BR>
   * <li>CPU_CARD_B(0x06) - CPU B card(contactless card)</li><BR>
   * <li>UltraLight_CARD_C(0x07) - Mifare UltraLight card C</li><BR>
   * <li>Mifare_Desfire(0x08) - Mifare Desfire card(EV1)</li><BR>
   * <li>NTAG_CARD(0x09) - NTAG card</li><BR>
   * <li>ICode_CARD(0x0A) - ICode card</li><BR>
   * <li>UltraLight_CARD(0x0B) - UltraLight card</li><BR>
   * <li>Mifare_Plus_CARD(0x0C) - Mifare plus card</li><BR>
   * <li>UltraLight_CARD_EV1(0x0D) - Mifare UltraLight card EV1</li><BR>
   * <li>UltraLight_CARD_Nano(0x0E) - Mifare UltraLight card Nano</li><BR>
   * </ul>
   * @since 1.x.x
   */
  public void onCardPass(int cardType) throws android.os.RemoteException;
  /**
   * on failure
   * 
   * @param error the error code<BR>
   * <ul><BR>
   * <li>ERROR_TRANSERR(0xA2) error on transation, communication</li><BR>
   * <li>ERROR_PROTERR(0xA3) the response is illegal</li><BR>
   * <li>ERROR_MULTIERR(0x84)multi-cards found</li><BR>
   * <li>ERROR_CARDTIMEOUT(0xA7) timeout</li><BR>
   * <li>ERROR_CARDNOACT(0xB3) card (pro, typeB) not actived</li><BR>
   * <li>ERROR_MCSERVICE_CRASH(0xff01) mater service crash</li><BR>
   * <li>ERROR_REQUEST_EXCEPTION(0xff02) request exception </li><BR>
   * </ul><BR>
   * @param message - the message
   * @since 1.x.x
   */
  public void onFail(int error, java.lang.String message) throws android.os.RemoteException;
}
