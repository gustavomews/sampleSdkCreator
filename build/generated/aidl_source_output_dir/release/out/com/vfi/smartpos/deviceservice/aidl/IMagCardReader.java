/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.vfi.smartpos.deviceservice.aidl;
/**
 * the object of IMagCardReader
 * @author Kai.L@verifone.cn, Chao.L@verifone.cn
 */
public interface IMagCardReader extends android.os.IInterface
{
  /** Default implementation for IMagCardReader. */
  public static class Default implements com.vfi.smartpos.deviceservice.aidl.IMagCardReader
  {
    /**
     * search card, non-block method
     * 
     * @param timeout timeout of the search, second
     * @param listener the callback listener whild card swiped
     * @since 1.x.x
     * @see com.vfi.smartpos.deviceservice.aidl.MagCardListener
     */
    @Override public void searchCard(int timeout, com.vfi.smartpos.deviceservice.aidl.MagCardListener listener) throws android.os.RemoteException
    {
    }
    /**
     * stop search
     * 
     * @since 1.x.x
     */
    @Override public void stopSearch() throws android.os.RemoteException
    {
    }
    /**
     * default is 7, enable track1 track2 and track3
     * @param trkNum 1byte, bit0-track1, bit1-track2, bit2-track3
     * @throws RemoteException
     */
    @Override public void enableTrack(int trkNum) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.vfi.smartpos.deviceservice.aidl.IMagCardReader
  {
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.vfi.smartpos.deviceservice.aidl.IMagCardReader interface,
     * generating a proxy if needed.
     */
    public static com.vfi.smartpos.deviceservice.aidl.IMagCardReader asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.vfi.smartpos.deviceservice.aidl.IMagCardReader))) {
        return ((com.vfi.smartpos.deviceservice.aidl.IMagCardReader)iin);
      }
      return new com.vfi.smartpos.deviceservice.aidl.IMagCardReader.Stub.Proxy(obj);
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
        case TRANSACTION_searchCard:
        {
          int _arg0;
          _arg0 = data.readInt();
          com.vfi.smartpos.deviceservice.aidl.MagCardListener _arg1;
          _arg1 = com.vfi.smartpos.deviceservice.aidl.MagCardListener.Stub.asInterface(data.readStrongBinder());
          this.searchCard(_arg0, _arg1);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_stopSearch:
        {
          this.stopSearch();
          reply.writeNoException();
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
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static class Proxy implements com.vfi.smartpos.deviceservice.aidl.IMagCardReader
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
       * search card, non-block method
       * 
       * @param timeout timeout of the search, second
       * @param listener the callback listener whild card swiped
       * @since 1.x.x
       * @see com.vfi.smartpos.deviceservice.aidl.MagCardListener
       */
      @Override public void searchCard(int timeout, com.vfi.smartpos.deviceservice.aidl.MagCardListener listener) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(timeout);
          _data.writeStrongInterface(listener);
          boolean _status = mRemote.transact(Stub.TRANSACTION_searchCard, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * stop search
       * 
       * @since 1.x.x
       */
      @Override public void stopSearch() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_stopSearch, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * default is 7, enable track1 track2 and track3
       * @param trkNum 1byte, bit0-track1, bit1-track2, bit2-track3
       * @throws RemoteException
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
    }
    static final int TRANSACTION_searchCard = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_stopSearch = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_enableTrack = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
  }
  public static final java.lang.String DESCRIPTOR = "com.vfi.smartpos.deviceservice.aidl.IMagCardReader";
  /**
   * search card, non-block method
   * 
   * @param timeout timeout of the search, second
   * @param listener the callback listener whild card swiped
   * @since 1.x.x
   * @see com.vfi.smartpos.deviceservice.aidl.MagCardListener
   */
  public void searchCard(int timeout, com.vfi.smartpos.deviceservice.aidl.MagCardListener listener) throws android.os.RemoteException;
  /**
   * stop search
   * 
   * @since 1.x.x
   */
  public void stopSearch() throws android.os.RemoteException;
  /**
   * default is 7, enable track1 track2 and track3
   * @param trkNum 1byte, bit0-track1, bit1-track2, bit2-track3
   * @throws RemoteException
   */
  public void enableTrack(int trkNum) throws android.os.RemoteException;
}
