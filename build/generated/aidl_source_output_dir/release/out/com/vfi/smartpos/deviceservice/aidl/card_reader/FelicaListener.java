/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.vfi.smartpos.deviceservice.aidl.card_reader;
public interface FelicaListener extends android.os.IInterface
{
  /** Default implementation for FelicaListener. */
  public static class Default implements com.vfi.smartpos.deviceservice.aidl.card_reader.FelicaListener
  {
    /**
     * Felica search card result
     * 
     * @param ret 0-success 1-timeout -1-failed
     * @param felicaInfos list of felica data;
     * @since 3.x.x
     */
    @Override public void onSearchResult(int ret, java.util.List<com.vfi.smartpos.deviceservice.aidl.card_reader.FelicaInfomation> felicaInfos) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.vfi.smartpos.deviceservice.aidl.card_reader.FelicaListener
  {
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.vfi.smartpos.deviceservice.aidl.card_reader.FelicaListener interface,
     * generating a proxy if needed.
     */
    public static com.vfi.smartpos.deviceservice.aidl.card_reader.FelicaListener asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.vfi.smartpos.deviceservice.aidl.card_reader.FelicaListener))) {
        return ((com.vfi.smartpos.deviceservice.aidl.card_reader.FelicaListener)iin);
      }
      return new com.vfi.smartpos.deviceservice.aidl.card_reader.FelicaListener.Stub.Proxy(obj);
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
        case TRANSACTION_onSearchResult:
        {
          int _arg0;
          _arg0 = data.readInt();
          java.util.List<com.vfi.smartpos.deviceservice.aidl.card_reader.FelicaInfomation> _arg1;
          _arg1 = data.createTypedArrayList(com.vfi.smartpos.deviceservice.aidl.card_reader.FelicaInfomation.CREATOR);
          this.onSearchResult(_arg0, _arg1);
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
    private static class Proxy implements com.vfi.smartpos.deviceservice.aidl.card_reader.FelicaListener
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
       * Felica search card result
       * 
       * @param ret 0-success 1-timeout -1-failed
       * @param felicaInfos list of felica data;
       * @since 3.x.x
       */
      @Override public void onSearchResult(int ret, java.util.List<com.vfi.smartpos.deviceservice.aidl.card_reader.FelicaInfomation> felicaInfos) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(ret);
          _data.writeTypedList(felicaInfos);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onSearchResult, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
    }
    static final int TRANSACTION_onSearchResult = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
  }
  public static final java.lang.String DESCRIPTOR = "com.vfi.smartpos.deviceservice.aidl.card_reader.FelicaListener";
  /**
   * Felica search card result
   * 
   * @param ret 0-success 1-timeout -1-failed
   * @param felicaInfos list of felica data;
   * @since 3.x.x
   */
  public void onSearchResult(int ret, java.util.List<com.vfi.smartpos.deviceservice.aidl.card_reader.FelicaInfomation> felicaInfos) throws android.os.RemoteException;
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
