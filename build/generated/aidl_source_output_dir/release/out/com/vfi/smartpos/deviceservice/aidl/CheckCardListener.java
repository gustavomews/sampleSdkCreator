/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.vfi.smartpos.deviceservice.aidl;
/**
 * the listener of check card
 * @author Kai.L@verifone.cn, Chao.L@verifone.cn
 */
public interface CheckCardListener extends android.os.IInterface
{
  /** Default implementation for CheckCardListener. */
  public static class Default implements com.vfi.smartpos.deviceservice.aidl.CheckCardListener
  {
    /**
     * found magnetic card
     * 
     * @param track the track information
     * <ul>
     * <li>PAN(String) the main / pan number</li>
     * <li>TRACK1(String) track 1 </li>
     * <li>TRACK2(String) track 2 </li>
     * <li>TRACK3(String) track 3 </li>
     * <li>SERVICE_CODE(String) service code </li>
     * <li>EXPIRED_DATE(String) the expired date </li>
     * </ul>
     * @since 1.x.x
     */
    @Override public void onCardSwiped(android.os.Bundle track) throws android.os.RemoteException
    {
    }
    /**
     * found smart card
     * 
     * run the IPBOC#startEMV to start EMV workflow
     * @since 1.x.x
     */
    @Override public void onCardPowerUp() throws android.os.RemoteException
    {
    }
    /**
     * found contactless card
     * 
     * run the IPBOC#startEMV to start EMV workflow
     * @since 1.x.x
     */
    @Override public void onCardActivate() throws android.os.RemoteException
    {
    }
    /**
     * timeout
     * 
     * @since 1.x.x
     */
    @Override public void onTimeout() throws android.os.RemoteException
    {
    }
    /**
     * While error got
     * 
     * @param error the error code
     * <ul>
     * <li>SERVICE_CRASH(99) - service crash </li>
     * <li>REQUEST_EXCEPTION(100) - request cause exception</li>
     * <li>MAG_SWIPE_ERROR(1) - read magnetic error</li>
     * <li>IC_INSERT_ERROR(2) - read smart card error</li>
     * <li>IC_POWERUP_ERROR(3) - smart card cannot power up</li>
     * <li>RF_PASS_ERROR(4) - read contactless card error</li>
     * <li>RF_ACTIVATE_ERROR(5) - contactless card active error</li>
     * <li>MULTI_CARD_CONFLICT_ERROR(6) - found multi-cards</li>
     * <li>M1_CARD_UNSUPPORT_EMV_ERROR(7) - [M1Sn]M1 card unsupport in EMV process</li>
     * <li>FELICA_CARD_UNSUPPORT_EMV_ERROR(8) - emv unsupport Felica card</li>
     * <li>DESFIRE_CARD_UNSUPPORT_EMV_ERROR(9) -[DesFireSN] DesFire card unsupport in EMV process</li>
     * <li>NTAG_CARD_UNSUPPORT_EMV_ERROR(10) -[NtagSN] Ntag card unsupport in EMV process</li>
     * <li>ULTRALIGHT_CARD_UNSUPPORT_EMV_ERROR(11) -[UltralightSN] Ultralight card unsupport in EMV process</li>
     * </ul>
     * @param message the description.
     * @since 1.x.x
     */
    @Override public void onError(int error, java.lang.String message) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.vfi.smartpos.deviceservice.aidl.CheckCardListener
  {
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.vfi.smartpos.deviceservice.aidl.CheckCardListener interface,
     * generating a proxy if needed.
     */
    public static com.vfi.smartpos.deviceservice.aidl.CheckCardListener asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.vfi.smartpos.deviceservice.aidl.CheckCardListener))) {
        return ((com.vfi.smartpos.deviceservice.aidl.CheckCardListener)iin);
      }
      return new com.vfi.smartpos.deviceservice.aidl.CheckCardListener.Stub.Proxy(obj);
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
        case TRANSACTION_onCardSwiped:
        {
          android.os.Bundle _arg0;
          _arg0 = _Parcel.readTypedObject(data, android.os.Bundle.CREATOR);
          this.onCardSwiped(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_onCardPowerUp:
        {
          this.onCardPowerUp();
          reply.writeNoException();
          break;
        }
        case TRANSACTION_onCardActivate:
        {
          this.onCardActivate();
          reply.writeNoException();
          break;
        }
        case TRANSACTION_onTimeout:
        {
          this.onTimeout();
          reply.writeNoException();
          break;
        }
        case TRANSACTION_onError:
        {
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          this.onError(_arg0, _arg1);
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
    private static class Proxy implements com.vfi.smartpos.deviceservice.aidl.CheckCardListener
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
       * found magnetic card
       * 
       * @param track the track information
       * <ul>
       * <li>PAN(String) the main / pan number</li>
       * <li>TRACK1(String) track 1 </li>
       * <li>TRACK2(String) track 2 </li>
       * <li>TRACK3(String) track 3 </li>
       * <li>SERVICE_CODE(String) service code </li>
       * <li>EXPIRED_DATE(String) the expired date </li>
       * </ul>
       * @since 1.x.x
       */
      @Override public void onCardSwiped(android.os.Bundle track) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _Parcel.writeTypedObject(_data, track, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onCardSwiped, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * found smart card
       * 
       * run the IPBOC#startEMV to start EMV workflow
       * @since 1.x.x
       */
      @Override public void onCardPowerUp() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onCardPowerUp, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * found contactless card
       * 
       * run the IPBOC#startEMV to start EMV workflow
       * @since 1.x.x
       */
      @Override public void onCardActivate() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onCardActivate, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * timeout
       * 
       * @since 1.x.x
       */
      @Override public void onTimeout() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onTimeout, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * While error got
       * 
       * @param error the error code
       * <ul>
       * <li>SERVICE_CRASH(99) - service crash </li>
       * <li>REQUEST_EXCEPTION(100) - request cause exception</li>
       * <li>MAG_SWIPE_ERROR(1) - read magnetic error</li>
       * <li>IC_INSERT_ERROR(2) - read smart card error</li>
       * <li>IC_POWERUP_ERROR(3) - smart card cannot power up</li>
       * <li>RF_PASS_ERROR(4) - read contactless card error</li>
       * <li>RF_ACTIVATE_ERROR(5) - contactless card active error</li>
       * <li>MULTI_CARD_CONFLICT_ERROR(6) - found multi-cards</li>
       * <li>M1_CARD_UNSUPPORT_EMV_ERROR(7) - [M1Sn]M1 card unsupport in EMV process</li>
       * <li>FELICA_CARD_UNSUPPORT_EMV_ERROR(8) - emv unsupport Felica card</li>
       * <li>DESFIRE_CARD_UNSUPPORT_EMV_ERROR(9) -[DesFireSN] DesFire card unsupport in EMV process</li>
       * <li>NTAG_CARD_UNSUPPORT_EMV_ERROR(10) -[NtagSN] Ntag card unsupport in EMV process</li>
       * <li>ULTRALIGHT_CARD_UNSUPPORT_EMV_ERROR(11) -[UltralightSN] Ultralight card unsupport in EMV process</li>
       * </ul>
       * @param message the description.
       * @since 1.x.x
       */
      @Override public void onError(int error, java.lang.String message) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(error);
          _data.writeString(message);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onError, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
    }
    static final int TRANSACTION_onCardSwiped = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_onCardPowerUp = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_onCardActivate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_onTimeout = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_onError = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
  }
  public static final java.lang.String DESCRIPTOR = "com.vfi.smartpos.deviceservice.aidl.CheckCardListener";
  /**
   * found magnetic card
   * 
   * @param track the track information
   * <ul>
   * <li>PAN(String) the main / pan number</li>
   * <li>TRACK1(String) track 1 </li>
   * <li>TRACK2(String) track 2 </li>
   * <li>TRACK3(String) track 3 </li>
   * <li>SERVICE_CODE(String) service code </li>
   * <li>EXPIRED_DATE(String) the expired date </li>
   * </ul>
   * @since 1.x.x
   */
  public void onCardSwiped(android.os.Bundle track) throws android.os.RemoteException;
  /**
   * found smart card
   * 
   * run the IPBOC#startEMV to start EMV workflow
   * @since 1.x.x
   */
  public void onCardPowerUp() throws android.os.RemoteException;
  /**
   * found contactless card
   * 
   * run the IPBOC#startEMV to start EMV workflow
   * @since 1.x.x
   */
  public void onCardActivate() throws android.os.RemoteException;
  /**
   * timeout
   * 
   * @since 1.x.x
   */
  public void onTimeout() throws android.os.RemoteException;
  /**
   * While error got
   * 
   * @param error the error code
   * <ul>
   * <li>SERVICE_CRASH(99) - service crash </li>
   * <li>REQUEST_EXCEPTION(100) - request cause exception</li>
   * <li>MAG_SWIPE_ERROR(1) - read magnetic error</li>
   * <li>IC_INSERT_ERROR(2) - read smart card error</li>
   * <li>IC_POWERUP_ERROR(3) - smart card cannot power up</li>
   * <li>RF_PASS_ERROR(4) - read contactless card error</li>
   * <li>RF_ACTIVATE_ERROR(5) - contactless card active error</li>
   * <li>MULTI_CARD_CONFLICT_ERROR(6) - found multi-cards</li>
   * <li>M1_CARD_UNSUPPORT_EMV_ERROR(7) - [M1Sn]M1 card unsupport in EMV process</li>
   * <li>FELICA_CARD_UNSUPPORT_EMV_ERROR(8) - emv unsupport Felica card</li>
   * <li>DESFIRE_CARD_UNSUPPORT_EMV_ERROR(9) -[DesFireSN] DesFire card unsupport in EMV process</li>
   * <li>NTAG_CARD_UNSUPPORT_EMV_ERROR(10) -[NtagSN] Ntag card unsupport in EMV process</li>
   * <li>ULTRALIGHT_CARD_UNSUPPORT_EMV_ERROR(11) -[UltralightSN] Ultralight card unsupport in EMV process</li>
   * </ul>
   * @param message the description.
   * @since 1.x.x
   */
  public void onError(int error, java.lang.String message) throws android.os.RemoteException;
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
