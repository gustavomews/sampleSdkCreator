/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.vfi.smartpos.deviceservice.aidl;
/**
 * 读手机芯片卡结果监听器 | the listener of uni-pay mobile card
 * @author: baoxl
 */
public interface UPCardListener extends android.os.IInterface
{
  /** Default implementation for UPCardListener. */
  public static class Default implements com.vfi.smartpos.deviceservice.aidl.UPCardListener
  {
    /**
     * 读卡成功回调 | on success
     * @param data - 芯片卡卡数据 | the date
     * <ul>
     * <li>PAN(String) - 主账号（卡号）| PAN</li>
     * <li>TRACK2(String) - 磁道2数据 | track 2</li>
     * <li>TRACK3(String) - 磁道3数据 | track 3</li>
     * <li>CARD_SN(String) - 卡片序列号 | card serial number</li>
     * <li>EXPIRED_DATE(String) - 卡片有效期 | expired date</li>
     * <li>TLV_DATA(String) - 带标签（DF32，DF33，DF34）TLV数据 | the TLV date, DF32, DF33, DF34 </li>
     * </ul>
     */
    @Override public void onRead(android.os.Bundle data) throws android.os.RemoteException
    {
    }
    /**
     * 读卡错误回调 | on error
     * @param error - 错误码 | the error code
     * <ul>
     * <li>ERROR_DETECT_CARD(1) - 识别卡失败 | error on detect card</li>
     * <li>ERROR_READ_SN(2) - 读卡序列号失败 | error on read serial number</li>
     * <li>ERROR_READ_TRACK(3) - 读卡信息失败 | error on read track information</li>
     * <li>ERROR_SERVICE_CRASH(4) - 设备服务异常 | service crash </li>
     * <li>ERROR_NULL_DRIVER(5) - 非接驱动为null | not CTLS driver</li>
     * </ul>
     * @param message - 错误描述
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
  public static abstract class Stub extends android.os.Binder implements com.vfi.smartpos.deviceservice.aidl.UPCardListener
  {
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.vfi.smartpos.deviceservice.aidl.UPCardListener interface,
     * generating a proxy if needed.
     */
    public static com.vfi.smartpos.deviceservice.aidl.UPCardListener asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.vfi.smartpos.deviceservice.aidl.UPCardListener))) {
        return ((com.vfi.smartpos.deviceservice.aidl.UPCardListener)iin);
      }
      return new com.vfi.smartpos.deviceservice.aidl.UPCardListener.Stub.Proxy(obj);
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
        case TRANSACTION_onRead:
        {
          android.os.Bundle _arg0;
          _arg0 = new android.os.Bundle();
          this.onRead(_arg0);
          reply.writeNoException();
          _Parcel.writeTypedObject(reply, _arg0, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
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
    private static class Proxy implements com.vfi.smartpos.deviceservice.aidl.UPCardListener
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
       * 读卡成功回调 | on success
       * @param data - 芯片卡卡数据 | the date
       * <ul>
       * <li>PAN(String) - 主账号（卡号）| PAN</li>
       * <li>TRACK2(String) - 磁道2数据 | track 2</li>
       * <li>TRACK3(String) - 磁道3数据 | track 3</li>
       * <li>CARD_SN(String) - 卡片序列号 | card serial number</li>
       * <li>EXPIRED_DATE(String) - 卡片有效期 | expired date</li>
       * <li>TLV_DATA(String) - 带标签（DF32，DF33，DF34）TLV数据 | the TLV date, DF32, DF33, DF34 </li>
       * </ul>
       */
      @Override public void onRead(android.os.Bundle data) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onRead, _data, _reply, 0);
          _reply.readException();
          if ((0!=_reply.readInt())) {
            data.readFromParcel(_reply);
          }
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * 读卡错误回调 | on error
       * @param error - 错误码 | the error code
       * <ul>
       * <li>ERROR_DETECT_CARD(1) - 识别卡失败 | error on detect card</li>
       * <li>ERROR_READ_SN(2) - 读卡序列号失败 | error on read serial number</li>
       * <li>ERROR_READ_TRACK(3) - 读卡信息失败 | error on read track information</li>
       * <li>ERROR_SERVICE_CRASH(4) - 设备服务异常 | service crash </li>
       * <li>ERROR_NULL_DRIVER(5) - 非接驱动为null | not CTLS driver</li>
       * </ul>
       * @param message - 错误描述
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
    static final int TRANSACTION_onRead = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_onError = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
  }
  public static final java.lang.String DESCRIPTOR = "com.vfi.smartpos.deviceservice.aidl.UPCardListener";
  /**
   * 读卡成功回调 | on success
   * @param data - 芯片卡卡数据 | the date
   * <ul>
   * <li>PAN(String) - 主账号（卡号）| PAN</li>
   * <li>TRACK2(String) - 磁道2数据 | track 2</li>
   * <li>TRACK3(String) - 磁道3数据 | track 3</li>
   * <li>CARD_SN(String) - 卡片序列号 | card serial number</li>
   * <li>EXPIRED_DATE(String) - 卡片有效期 | expired date</li>
   * <li>TLV_DATA(String) - 带标签（DF32，DF33，DF34）TLV数据 | the TLV date, DF32, DF33, DF34 </li>
   * </ul>
   */
  public void onRead(android.os.Bundle data) throws android.os.RemoteException;
  /**
   * 读卡错误回调 | on error
   * @param error - 错误码 | the error code
   * <ul>
   * <li>ERROR_DETECT_CARD(1) - 识别卡失败 | error on detect card</li>
   * <li>ERROR_READ_SN(2) - 读卡序列号失败 | error on read serial number</li>
   * <li>ERROR_READ_TRACK(3) - 读卡信息失败 | error on read track information</li>
   * <li>ERROR_SERVICE_CRASH(4) - 设备服务异常 | service crash </li>
   * <li>ERROR_NULL_DRIVER(5) - 非接驱动为null | not CTLS driver</li>
   * </ul>
   * @param message - 错误描述
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
