/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.vfi.smartpos.deviceservice.aidl;
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
 * PBOC流程联机应答数据处理 | the online result
 * @author: baoxl
 */
public interface OnlineResultHandler extends android.os.IInterface
{
  /** Default implementation for OnlineResultHandler. */
  public static class Default implements com.vfi.smartpos.deviceservice.aidl.OnlineResultHandler
  {
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
     * 联机应答数据处理回调 | the call back to process online response<br/>
     * @param result - 处理结果 | the result
     * <ul>
     * <li>ONLINE_RESULT_TC(0) - 联机成功 | online result TC (success) </li>
     * <li>ONLINE_RESULT_AAC(1) - 联机拒绝 | online result AAC (refuse) </li>
     * <li>ONLINE_RESULT_OFFLINE_TC(101) - 联机失败，脱机成功 | online false, offline success</li>
     * <li>ONLINE_RESULT_SCRIPT_NOT_EXECUTE(102) - 脚本未执行 | the script not execute</li>
     * <li>ONLINE_RESULT_SCRIPT_EXECUTE_FAIL(103) - 脚本执行失败 | failure while execute script</li>
     * <li>ONLINE_RESULT_NO_SCRIPT(104) - 联机失败，未下送脚本 | online failure, not send the script</li>
     * <li>ONLINE_RESULT_TOO_MANY_SCRIPT(105) - 联机失败，脚本超过1个 | online failure, more than one script</li>
     * <li>ONLINE_RESULT_TERMINATE(106) - 联机失败，交易终止(GAC返回非9000，要提示交易终止,0x8F) | online failure, transaction terminate. return transaction terminate while GAC is not 9000, 0x8F </li>
     * <li>ONLINE_RESULT_ERROR(107) - 联机失败，EMV内核错误 | online failure, error in EMV</li>
     * <li>ONLINE_RESULT_OTHER_ERROR(110) - 其他错误 | other error</li>
     * </ul>
     * @param data - 结果数据 | the result date
     * <ul>
     * <li>TC_DATA(String) - 交易结果TLV数据 | the TC data in TLV format</li>
     * <li>SCRIPT_DATA(String) - 脚本结果TLV数据 | the script data in TLV format</li>
     * <li>REVERSAL_DATA(String) - 冲正TLV数据  | the reversal data in TLV format</li>
     * </ul>
     */
    @Override public void onProccessResult(int result, android.os.Bundle data) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.vfi.smartpos.deviceservice.aidl.OnlineResultHandler
  {
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.vfi.smartpos.deviceservice.aidl.OnlineResultHandler interface,
     * generating a proxy if needed.
     */
    public static com.vfi.smartpos.deviceservice.aidl.OnlineResultHandler asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.vfi.smartpos.deviceservice.aidl.OnlineResultHandler))) {
        return ((com.vfi.smartpos.deviceservice.aidl.OnlineResultHandler)iin);
      }
      return new com.vfi.smartpos.deviceservice.aidl.OnlineResultHandler.Stub.Proxy(obj);
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
        case TRANSACTION_onProccessResult:
        {
          int _arg0;
          _arg0 = data.readInt();
          android.os.Bundle _arg1;
          _arg1 = _Parcel.readTypedObject(data, android.os.Bundle.CREATOR);
          this.onProccessResult(_arg0, _arg1);
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
    private static class Proxy implements com.vfi.smartpos.deviceservice.aidl.OnlineResultHandler
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
       * 联机应答数据处理回调 | the call back to process online response<br/>
       * @param result - 处理结果 | the result
       * <ul>
       * <li>ONLINE_RESULT_TC(0) - 联机成功 | online result TC (success) </li>
       * <li>ONLINE_RESULT_AAC(1) - 联机拒绝 | online result AAC (refuse) </li>
       * <li>ONLINE_RESULT_OFFLINE_TC(101) - 联机失败，脱机成功 | online false, offline success</li>
       * <li>ONLINE_RESULT_SCRIPT_NOT_EXECUTE(102) - 脚本未执行 | the script not execute</li>
       * <li>ONLINE_RESULT_SCRIPT_EXECUTE_FAIL(103) - 脚本执行失败 | failure while execute script</li>
       * <li>ONLINE_RESULT_NO_SCRIPT(104) - 联机失败，未下送脚本 | online failure, not send the script</li>
       * <li>ONLINE_RESULT_TOO_MANY_SCRIPT(105) - 联机失败，脚本超过1个 | online failure, more than one script</li>
       * <li>ONLINE_RESULT_TERMINATE(106) - 联机失败，交易终止(GAC返回非9000，要提示交易终止,0x8F) | online failure, transaction terminate. return transaction terminate while GAC is not 9000, 0x8F </li>
       * <li>ONLINE_RESULT_ERROR(107) - 联机失败，EMV内核错误 | online failure, error in EMV</li>
       * <li>ONLINE_RESULT_OTHER_ERROR(110) - 其他错误 | other error</li>
       * </ul>
       * @param data - 结果数据 | the result date
       * <ul>
       * <li>TC_DATA(String) - 交易结果TLV数据 | the TC data in TLV format</li>
       * <li>SCRIPT_DATA(String) - 脚本结果TLV数据 | the script data in TLV format</li>
       * <li>REVERSAL_DATA(String) - 冲正TLV数据  | the reversal data in TLV format</li>
       * </ul>
       */
      @Override public void onProccessResult(int result, android.os.Bundle data) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(result);
          _Parcel.writeTypedObject(_data, data, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onProccessResult, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
    }
    static final int TRANSACTION_onProccessResult = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
  }
  public static final java.lang.String DESCRIPTOR = "com.vfi.smartpos.deviceservice.aidl.OnlineResultHandler";
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
   * 联机应答数据处理回调 | the call back to process online response<br/>
   * @param result - 处理结果 | the result
   * <ul>
   * <li>ONLINE_RESULT_TC(0) - 联机成功 | online result TC (success) </li>
   * <li>ONLINE_RESULT_AAC(1) - 联机拒绝 | online result AAC (refuse) </li>
   * <li>ONLINE_RESULT_OFFLINE_TC(101) - 联机失败，脱机成功 | online false, offline success</li>
   * <li>ONLINE_RESULT_SCRIPT_NOT_EXECUTE(102) - 脚本未执行 | the script not execute</li>
   * <li>ONLINE_RESULT_SCRIPT_EXECUTE_FAIL(103) - 脚本执行失败 | failure while execute script</li>
   * <li>ONLINE_RESULT_NO_SCRIPT(104) - 联机失败，未下送脚本 | online failure, not send the script</li>
   * <li>ONLINE_RESULT_TOO_MANY_SCRIPT(105) - 联机失败，脚本超过1个 | online failure, more than one script</li>
   * <li>ONLINE_RESULT_TERMINATE(106) - 联机失败，交易终止(GAC返回非9000，要提示交易终止,0x8F) | online failure, transaction terminate. return transaction terminate while GAC is not 9000, 0x8F </li>
   * <li>ONLINE_RESULT_ERROR(107) - 联机失败，EMV内核错误 | online failure, error in EMV</li>
   * <li>ONLINE_RESULT_OTHER_ERROR(110) - 其他错误 | other error</li>
   * </ul>
   * @param data - 结果数据 | the result date
   * <ul>
   * <li>TC_DATA(String) - 交易结果TLV数据 | the TC data in TLV format</li>
   * <li>SCRIPT_DATA(String) - 脚本结果TLV数据 | the script data in TLV format</li>
   * <li>REVERSAL_DATA(String) - 冲正TLV数据  | the reversal data in TLV format</li>
   * </ul>
   */
  public void onProccessResult(int result, android.os.Bundle data) throws android.os.RemoteException;
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
