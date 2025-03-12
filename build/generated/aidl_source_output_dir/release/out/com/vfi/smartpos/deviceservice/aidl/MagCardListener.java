/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.vfi.smartpos.deviceservice.aidl;
/**
 * \cn_
 * @brief 磁条卡刷卡结果回调
 * 
 * \_en_
 * @brief the call back of magnetic card
 * 
 * \en_e
 * \code{.java}
 * \endcode
 * @version
 * @see IMagCardReader, IMagCardReader#searchCard
 * 
 * @author: baoxl
 */
public interface MagCardListener extends android.os.IInterface
{
  /** Default implementation for MagCardListener. */
  public static class Default implements com.vfi.smartpos.deviceservice.aidl.MagCardListener
  {
    /**
     * \cn_
     * @brief 刷卡成功回调
     * 
     * @param track - 磁卡数据对象 | the card information
     * <ul>
     * <li>PAN(String) - 主账号（卡号）| the PAN</li>
     * <li>TRACK1(String) - 磁道1数据 | the track 1</li>
     * <li>TRACK2(String) - 磁道2数据 | track 2</li>
     * <li>TRACK3(String) - 磁道3数据 | track 3</li>
     * <li>SERVICE_CODE(String) - 服务码 | the service code</li>
     * <li>EXPIRED_DATE(String) - 卡片有效期 | the expired date</li>
     * </ul>
     * \_en_
     * @brief Success while IMagCardReader#searchCard found magnetic card
     * 
     * @param track the card information
     * <ul>
     * <li>PAN(String) the PAN</li><BR>
     * <li>TRACK1(String) the track 1</li><BR>
     * <li>TRACK2(String) track 2</li><BR>
     * <li>TRACK3(String) track 3</li><BR>
     * <li>SERVICE_CODE(String) the service code</li><BR>
     * <li>EXPIRED_DATE(String) the expired date</li><BR>
     * </ul>
     * \en_e
     * \code{.java}
     * \endcode
     * @version
     * @see
     */
    @Override public void onSuccess(android.os.Bundle track) throws android.os.RemoteException
    {
    }
    /**
     * \cn_
     * @brief 刷卡失败回调
     * 
     * \_en_
     * @brief Error while IMagCardReader#searchCard found magnetic card
     * 
     * \en_e
     * \code{.java}
     * \endcode
     * @version
     * @see
     *  |
     * @param error - 错误码 | the error code
     * <ul>
     * <li>REQUEST_EXCEPTION(100) - 请求异常 | request exception</li>
     * </ul>
     * @param message - 错误描述 | the message
     */
    @Override public void onError(int error, java.lang.String message) throws android.os.RemoteException
    {
    }
    /**
     * \cn_
     * @brief
     * 
     * \_en_
     * @brief
     * 
     * \en_e
     * \code{.java}
     * \endcode
     * @version
     * @see
     * 刷卡超时回调 | timeout occur
     */
    @Override public void onTimeout() throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.vfi.smartpos.deviceservice.aidl.MagCardListener
  {
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.vfi.smartpos.deviceservice.aidl.MagCardListener interface,
     * generating a proxy if needed.
     */
    public static com.vfi.smartpos.deviceservice.aidl.MagCardListener asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.vfi.smartpos.deviceservice.aidl.MagCardListener))) {
        return ((com.vfi.smartpos.deviceservice.aidl.MagCardListener)iin);
      }
      return new com.vfi.smartpos.deviceservice.aidl.MagCardListener.Stub.Proxy(obj);
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
        case TRANSACTION_onSuccess:
        {
          android.os.Bundle _arg0;
          _arg0 = _Parcel.readTypedObject(data, android.os.Bundle.CREATOR);
          this.onSuccess(_arg0);
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
        case TRANSACTION_onTimeout:
        {
          this.onTimeout();
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
    private static class Proxy implements com.vfi.smartpos.deviceservice.aidl.MagCardListener
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
       * \cn_
       * @brief 刷卡成功回调
       * 
       * @param track - 磁卡数据对象 | the card information
       * <ul>
       * <li>PAN(String) - 主账号（卡号）| the PAN</li>
       * <li>TRACK1(String) - 磁道1数据 | the track 1</li>
       * <li>TRACK2(String) - 磁道2数据 | track 2</li>
       * <li>TRACK3(String) - 磁道3数据 | track 3</li>
       * <li>SERVICE_CODE(String) - 服务码 | the service code</li>
       * <li>EXPIRED_DATE(String) - 卡片有效期 | the expired date</li>
       * </ul>
       * \_en_
       * @brief Success while IMagCardReader#searchCard found magnetic card
       * 
       * @param track the card information
       * <ul>
       * <li>PAN(String) the PAN</li><BR>
       * <li>TRACK1(String) the track 1</li><BR>
       * <li>TRACK2(String) track 2</li><BR>
       * <li>TRACK3(String) track 3</li><BR>
       * <li>SERVICE_CODE(String) the service code</li><BR>
       * <li>EXPIRED_DATE(String) the expired date</li><BR>
       * </ul>
       * \en_e
       * \code{.java}
       * \endcode
       * @version
       * @see
       */
      @Override public void onSuccess(android.os.Bundle track) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _Parcel.writeTypedObject(_data, track, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onSuccess, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * \cn_
       * @brief 刷卡失败回调
       * 
       * \_en_
       * @brief Error while IMagCardReader#searchCard found magnetic card
       * 
       * \en_e
       * \code{.java}
       * \endcode
       * @version
       * @see
       *  |
       * @param error - 错误码 | the error code
       * <ul>
       * <li>REQUEST_EXCEPTION(100) - 请求异常 | request exception</li>
       * </ul>
       * @param message - 错误描述 | the message
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
      /**
       * \cn_
       * @brief
       * 
       * \_en_
       * @brief
       * 
       * \en_e
       * \code{.java}
       * \endcode
       * @version
       * @see
       * 刷卡超时回调 | timeout occur
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
    }
    static final int TRANSACTION_onSuccess = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_onError = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_onTimeout = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
  }
  public static final java.lang.String DESCRIPTOR = "com.vfi.smartpos.deviceservice.aidl.MagCardListener";
  /**
   * \cn_
   * @brief 刷卡成功回调
   * 
   * @param track - 磁卡数据对象 | the card information
   * <ul>
   * <li>PAN(String) - 主账号（卡号）| the PAN</li>
   * <li>TRACK1(String) - 磁道1数据 | the track 1</li>
   * <li>TRACK2(String) - 磁道2数据 | track 2</li>
   * <li>TRACK3(String) - 磁道3数据 | track 3</li>
   * <li>SERVICE_CODE(String) - 服务码 | the service code</li>
   * <li>EXPIRED_DATE(String) - 卡片有效期 | the expired date</li>
   * </ul>
   * \_en_
   * @brief Success while IMagCardReader#searchCard found magnetic card
   * 
   * @param track the card information
   * <ul>
   * <li>PAN(String) the PAN</li><BR>
   * <li>TRACK1(String) the track 1</li><BR>
   * <li>TRACK2(String) track 2</li><BR>
   * <li>TRACK3(String) track 3</li><BR>
   * <li>SERVICE_CODE(String) the service code</li><BR>
   * <li>EXPIRED_DATE(String) the expired date</li><BR>
   * </ul>
   * \en_e
   * \code{.java}
   * \endcode
   * @version
   * @see
   */
  public void onSuccess(android.os.Bundle track) throws android.os.RemoteException;
  /**
   * \cn_
   * @brief 刷卡失败回调
   * 
   * \_en_
   * @brief Error while IMagCardReader#searchCard found magnetic card
   * 
   * \en_e
   * \code{.java}
   * \endcode
   * @version
   * @see
   *  |
   * @param error - 错误码 | the error code
   * <ul>
   * <li>REQUEST_EXCEPTION(100) - 请求异常 | request exception</li>
   * </ul>
   * @param message - 错误描述 | the message
   */
  public void onError(int error, java.lang.String message) throws android.os.RemoteException;
  /**
   * \cn_
   * @brief
   * 
   * \_en_
   * @brief
   * 
   * \en_e
   * \code{.java}
   * \endcode
   * @version
   * @see
   * 刷卡超时回调 | timeout occur
   */
  public void onTimeout() throws android.os.RemoteException;
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
