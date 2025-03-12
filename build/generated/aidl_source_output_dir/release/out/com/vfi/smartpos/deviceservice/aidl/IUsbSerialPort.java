/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.vfi.smartpos.deviceservice.aidl;
/**
 * <p> the usb-serial device(such as X9, C520H) connect with OTG cable
 * 
 * Insert the OTG cable to X9, connect the X9 or C520 to the OTG cable with micro-usb cable
 */
public interface IUsbSerialPort extends android.os.IInterface
{
  /** Default implementation for IUsbSerialPort. */
  public static class Default implements com.vfi.smartpos.deviceservice.aidl.IUsbSerialPort
  {
    /**
     * <p> check if usb-serial device available
     * 
     * @return true for available, false for no device available
     * @since 1.x.x
     */
    @Override public boolean isUsbSerialConnect() throws android.os.RemoteException
    {
      return false;
    }
    /**
     * <p> read buffer
     * 
     * @param buffer the buffer
     * @param timeout timeout in milliseconds
     * @return the buffer length read, -1 for failure
     * @since 1.x.x
     */
    @Override public int read(byte[] buffer, int timeout) throws android.os.RemoteException
    {
      return 0;
    }
    /**
     * @brief write data
     * 
     * @param data the buffer want write
     * @since 1.x.x
     */
    @Override public void write(byte[] data) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.vfi.smartpos.deviceservice.aidl.IUsbSerialPort
  {
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.vfi.smartpos.deviceservice.aidl.IUsbSerialPort interface,
     * generating a proxy if needed.
     */
    public static com.vfi.smartpos.deviceservice.aidl.IUsbSerialPort asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.vfi.smartpos.deviceservice.aidl.IUsbSerialPort))) {
        return ((com.vfi.smartpos.deviceservice.aidl.IUsbSerialPort)iin);
      }
      return new com.vfi.smartpos.deviceservice.aidl.IUsbSerialPort.Stub.Proxy(obj);
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
        case TRANSACTION_isUsbSerialConnect:
        {
          boolean _result = this.isUsbSerialConnect();
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        case TRANSACTION_read:
        {
          byte[] _arg0;
          _arg0 = data.createByteArray();
          int _arg1;
          _arg1 = data.readInt();
          int _result = this.read(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg0);
          break;
        }
        case TRANSACTION_write:
        {
          byte[] _arg0;
          _arg0 = data.createByteArray();
          this.write(_arg0);
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
    private static class Proxy implements com.vfi.smartpos.deviceservice.aidl.IUsbSerialPort
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
       * <p> check if usb-serial device available
       * 
       * @return true for available, false for no device available
       * @since 1.x.x
       */
      @Override public boolean isUsbSerialConnect() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_isUsbSerialConnect, _data, _reply, 0);
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
       * <p> read buffer
       * 
       * @param buffer the buffer
       * @param timeout timeout in milliseconds
       * @return the buffer length read, -1 for failure
       * @since 1.x.x
       */
      @Override public int read(byte[] buffer, int timeout) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(buffer);
          _data.writeInt(timeout);
          boolean _status = mRemote.transact(Stub.TRANSACTION_read, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(buffer);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * @brief write data
       * 
       * @param data the buffer want write
       * @since 1.x.x
       */
      @Override public void write(byte[] data) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(data);
          boolean _status = mRemote.transact(Stub.TRANSACTION_write, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
    }
    static final int TRANSACTION_isUsbSerialConnect = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_read = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_write = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
  }
  public static final java.lang.String DESCRIPTOR = "com.vfi.smartpos.deviceservice.aidl.IUsbSerialPort";
  /**
   * <p> check if usb-serial device available
   * 
   * @return true for available, false for no device available
   * @since 1.x.x
   */
  public boolean isUsbSerialConnect() throws android.os.RemoteException;
  /**
   * <p> read buffer
   * 
   * @param buffer the buffer
   * @param timeout timeout in milliseconds
   * @return the buffer length read, -1 for failure
   * @since 1.x.x
   */
  public int read(byte[] buffer, int timeout) throws android.os.RemoteException;
  /**
   * @brief write data
   * 
   * @param data the buffer want write
   * @since 1.x.x
   */
  public void write(byte[] data) throws android.os.RemoteException;
}
