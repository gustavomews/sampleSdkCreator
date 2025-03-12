/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.vfi.smartpos.deviceservice.aidl;
/**
 * the object of beeper
 * @author Kai.L@verifone.cn, Chao.L@verifone.cn
 */
public interface IBeeper extends android.os.IInterface
{
  /** Default implementation for IBeeper. */
  public static class Default implements com.vfi.smartpos.deviceservice.aidl.IBeeper
  {
    /**
     * start beep
     * <p>Will not beep if setting with 0. It's a non-block method.<br>
     * @param msec the period of beeping, millisecond.
     * @since 1.x.x
     */
    @Override public void startBeep(int msec) throws android.os.RemoteException
    {
    }
    /**
     * stop beep
     * <p>beep will stop after stopBeep be called.<br>
     * @since 1.x.x
     */
    @Override public void stopBeep() throws android.os.RemoteException
    {
    }
    /**
     * @brief  start beep
     * 
     * Will not beep if setting with 0.
     * It's a non-block method.
     * @param msec the period of beeping, millisecond(200 is minimum).
     * @param bundle
     * <ul>
     * <li>HZ(int) the hz of beeping, default value is 850(scope:20~20000)</li>
     * </ul>
     * @since 1.x.x
     */
    @Override public void startBeepWithConfig(int msec, android.os.Bundle bunble) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.vfi.smartpos.deviceservice.aidl.IBeeper
  {
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.vfi.smartpos.deviceservice.aidl.IBeeper interface,
     * generating a proxy if needed.
     */
    public static com.vfi.smartpos.deviceservice.aidl.IBeeper asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.vfi.smartpos.deviceservice.aidl.IBeeper))) {
        return ((com.vfi.smartpos.deviceservice.aidl.IBeeper)iin);
      }
      return new com.vfi.smartpos.deviceservice.aidl.IBeeper.Stub.Proxy(obj);
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
        case TRANSACTION_startBeep:
        {
          int _arg0;
          _arg0 = data.readInt();
          this.startBeep(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_stopBeep:
        {
          this.stopBeep();
          reply.writeNoException();
          break;
        }
        case TRANSACTION_startBeepWithConfig:
        {
          int _arg0;
          _arg0 = data.readInt();
          android.os.Bundle _arg1;
          _arg1 = _Parcel.readTypedObject(data, android.os.Bundle.CREATOR);
          this.startBeepWithConfig(_arg0, _arg1);
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
    private static class Proxy implements com.vfi.smartpos.deviceservice.aidl.IBeeper
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
       * start beep
       * <p>Will not beep if setting with 0. It's a non-block method.<br>
       * @param msec the period of beeping, millisecond.
       * @since 1.x.x
       */
      @Override public void startBeep(int msec) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(msec);
          boolean _status = mRemote.transact(Stub.TRANSACTION_startBeep, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * stop beep
       * <p>beep will stop after stopBeep be called.<br>
       * @since 1.x.x
       */
      @Override public void stopBeep() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_stopBeep, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * @brief  start beep
       * 
       * Will not beep if setting with 0.
       * It's a non-block method.
       * @param msec the period of beeping, millisecond(200 is minimum).
       * @param bundle
       * <ul>
       * <li>HZ(int) the hz of beeping, default value is 850(scope:20~20000)</li>
       * </ul>
       * @since 1.x.x
       */
      @Override public void startBeepWithConfig(int msec, android.os.Bundle bunble) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(msec);
          _Parcel.writeTypedObject(_data, bunble, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_startBeepWithConfig, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
    }
    static final int TRANSACTION_startBeep = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_stopBeep = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_startBeepWithConfig = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
  }
  public static final java.lang.String DESCRIPTOR = "com.vfi.smartpos.deviceservice.aidl.IBeeper";
  /**
   * start beep
   * <p>Will not beep if setting with 0. It's a non-block method.<br>
   * @param msec the period of beeping, millisecond.
   * @since 1.x.x
   */
  public void startBeep(int msec) throws android.os.RemoteException;
  /**
   * stop beep
   * <p>beep will stop after stopBeep be called.<br>
   * @since 1.x.x
   */
  public void stopBeep() throws android.os.RemoteException;
  /**
   * @brief  start beep
   * 
   * Will not beep if setting with 0.
   * It's a non-block method.
   * @param msec the period of beeping, millisecond(200 is minimum).
   * @param bundle
   * <ul>
   * <li>HZ(int) the hz of beeping, default value is 850(scope:20~20000)</li>
   * </ul>
   * @since 1.x.x
   */
  public void startBeepWithConfig(int msec, android.os.Bundle bunble) throws android.os.RemoteException;
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
