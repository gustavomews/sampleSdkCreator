/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.vfi.smartpos.deviceservice.aidl;
/**
 * <p> the object of serial port for serial communication
 * 
 * @see IDeviceService#getSerialPort
 * 
 * @author: baoxl
 */
public interface ISerialPort extends android.os.IInterface
{
  /** Default implementation for ISerialPort. */
  public static class Default implements com.vfi.smartpos.deviceservice.aidl.ISerialPort
  {
    /**
     * <p> open serial port
     * 
     * @return {@code true} : success, {@code false} : fail
     * @since 1.x.x
     */
    @Override public boolean open() throws android.os.RemoteException
    {
      return false;
    }
    /**
     * <p> close serial port
     * 
     * @return {@code true} : success, {@code false} : fail
     * @since 1.x.x
     */
    @Override public boolean close() throws android.os.RemoteException
    {
      return false;
    }
    /**
     * <p> initialize serial port
     * 
     * @param bps the bps
     * <ul>
     * <li>1200 </li><BR>
     * <li>2400 </li><BR>
     * <li>4800 </li><BR>
     * <li>9600 </li><BR>
     * <li>14400 </li><BR>
     * <li>19200 </li><BR>
     * <li>28800 </li><BR>
     * <li>38400 </li><BR>
     * <li>57600 </li><BR>
     * <li>115200 </li><BR>
     * </ul>
     * @param par
     * <ul>
     * <li>0 - no check</li><BR>
     * <li>1 - odd</li><BR>
     * <li>2 - even</li><BR>
     * </ul>
     * @param dbs
     * @return {@code true} : success, {@code false} : fail
     * @since 1.x.x
     */
    @Override public boolean init(int bps, int par, int dbs) throws android.os.RemoteException
    {
      return false;
    }
    /**
     * @brief read data
     * 
     * @param buffer the buffer
     * @param timeout the timeout in millisecond
     * @return the length read, or -1 on failure
     * @since 1.x.x
     */
    @Override public int read(byte[] buffer, int expectLen, int timeout) throws android.os.RemoteException
    {
      return 0;
    }
    /**
     * <p> write data
     * 
     * @param data	the data buffer
     * @param timeout	the timeout in millisecond
     * @return the length wrote, or -1 on failure
     * @since 1.x.x
     */
    @Override public int write(byte[] data, int timeout) throws android.os.RemoteException
    {
      return 0;
    }
    /**
     * <p> clean up the input(read) buffer
     * 
     * @return {@code true} : success, {@code false} : fail
     * @since 1.x.x
     */
    @Override public boolean clearInputBuffer() throws android.os.RemoteException
    {
      return false;
    }
    /**
     * <p> check if there is data in buffer
     * 
     * @param {@code true}: check input(read) buffer, {@code false}: check output(write) buffer
     * @return {@code true}: data available,  {@code false}: no data available
     * @since 1.x.x
     */
    @Override public boolean isBufferEmpty(boolean input) throws android.os.RemoteException
    {
      return false;
    }
    @Override public int writeEx(byte[] data, int timeout, android.os.Bundle bundle) throws android.os.RemoteException
    {
      return 0;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.vfi.smartpos.deviceservice.aidl.ISerialPort
  {
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.vfi.smartpos.deviceservice.aidl.ISerialPort interface,
     * generating a proxy if needed.
     */
    public static com.vfi.smartpos.deviceservice.aidl.ISerialPort asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.vfi.smartpos.deviceservice.aidl.ISerialPort))) {
        return ((com.vfi.smartpos.deviceservice.aidl.ISerialPort)iin);
      }
      return new com.vfi.smartpos.deviceservice.aidl.ISerialPort.Stub.Proxy(obj);
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
        case TRANSACTION_open:
        {
          boolean _result = this.open();
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        case TRANSACTION_close:
        {
          boolean _result = this.close();
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        case TRANSACTION_init:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          boolean _result = this.init(_arg0, _arg1, _arg2);
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
          int _arg2;
          _arg2 = data.readInt();
          int _result = this.read(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg0);
          break;
        }
        case TRANSACTION_write:
        {
          byte[] _arg0;
          _arg0 = data.createByteArray();
          int _arg1;
          _arg1 = data.readInt();
          int _result = this.write(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          break;
        }
        case TRANSACTION_clearInputBuffer:
        {
          boolean _result = this.clearInputBuffer();
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        case TRANSACTION_isBufferEmpty:
        {
          boolean _arg0;
          _arg0 = (0!=data.readInt());
          boolean _result = this.isBufferEmpty(_arg0);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        case TRANSACTION_writeEx:
        {
          byte[] _arg0;
          _arg0 = data.createByteArray();
          int _arg1;
          _arg1 = data.readInt();
          android.os.Bundle _arg2;
          _arg2 = _Parcel.readTypedObject(data, android.os.Bundle.CREATOR);
          int _result = this.writeEx(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(_result);
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static class Proxy implements com.vfi.smartpos.deviceservice.aidl.ISerialPort
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
       * <p> open serial port
       * 
       * @return {@code true} : success, {@code false} : fail
       * @since 1.x.x
       */
      @Override public boolean open() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_open, _data, _reply, 0);
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
       * <p> close serial port
       * 
       * @return {@code true} : success, {@code false} : fail
       * @since 1.x.x
       */
      @Override public boolean close() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_close, _data, _reply, 0);
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
       * <p> initialize serial port
       * 
       * @param bps the bps
       * <ul>
       * <li>1200 </li><BR>
       * <li>2400 </li><BR>
       * <li>4800 </li><BR>
       * <li>9600 </li><BR>
       * <li>14400 </li><BR>
       * <li>19200 </li><BR>
       * <li>28800 </li><BR>
       * <li>38400 </li><BR>
       * <li>57600 </li><BR>
       * <li>115200 </li><BR>
       * </ul>
       * @param par
       * <ul>
       * <li>0 - no check</li><BR>
       * <li>1 - odd</li><BR>
       * <li>2 - even</li><BR>
       * </ul>
       * @param dbs
       * @return {@code true} : success, {@code false} : fail
       * @since 1.x.x
       */
      @Override public boolean init(int bps, int par, int dbs) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(bps);
          _data.writeInt(par);
          _data.writeInt(dbs);
          boolean _status = mRemote.transact(Stub.TRANSACTION_init, _data, _reply, 0);
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
       * @brief read data
       * 
       * @param buffer the buffer
       * @param timeout the timeout in millisecond
       * @return the length read, or -1 on failure
       * @since 1.x.x
       */
      @Override public int read(byte[] buffer, int expectLen, int timeout) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(buffer);
          _data.writeInt(expectLen);
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
       * <p> write data
       * 
       * @param data	the data buffer
       * @param timeout	the timeout in millisecond
       * @return the length wrote, or -1 on failure
       * @since 1.x.x
       */
      @Override public int write(byte[] data, int timeout) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(data);
          _data.writeInt(timeout);
          boolean _status = mRemote.transact(Stub.TRANSACTION_write, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * <p> clean up the input(read) buffer
       * 
       * @return {@code true} : success, {@code false} : fail
       * @since 1.x.x
       */
      @Override public boolean clearInputBuffer() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_clearInputBuffer, _data, _reply, 0);
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
       * <p> check if there is data in buffer
       * 
       * @param {@code true}: check input(read) buffer, {@code false}: check output(write) buffer
       * @return {@code true}: data available,  {@code false}: no data available
       * @since 1.x.x
       */
      @Override public boolean isBufferEmpty(boolean input) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(((input)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_isBufferEmpty, _data, _reply, 0);
          _reply.readException();
          _result = (0!=_reply.readInt());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public int writeEx(byte[] data, int timeout, android.os.Bundle bundle) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(data);
          _data.writeInt(timeout);
          _Parcel.writeTypedObject(_data, bundle, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_writeEx, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
    }
    static final int TRANSACTION_open = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_close = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_init = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_read = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_write = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_clearInputBuffer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_isBufferEmpty = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_writeEx = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
  }
  public static final java.lang.String DESCRIPTOR = "com.vfi.smartpos.deviceservice.aidl.ISerialPort";
  /**
   * <p> open serial port
   * 
   * @return {@code true} : success, {@code false} : fail
   * @since 1.x.x
   */
  public boolean open() throws android.os.RemoteException;
  /**
   * <p> close serial port
   * 
   * @return {@code true} : success, {@code false} : fail
   * @since 1.x.x
   */
  public boolean close() throws android.os.RemoteException;
  /**
   * <p> initialize serial port
   * 
   * @param bps the bps
   * <ul>
   * <li>1200 </li><BR>
   * <li>2400 </li><BR>
   * <li>4800 </li><BR>
   * <li>9600 </li><BR>
   * <li>14400 </li><BR>
   * <li>19200 </li><BR>
   * <li>28800 </li><BR>
   * <li>38400 </li><BR>
   * <li>57600 </li><BR>
   * <li>115200 </li><BR>
   * </ul>
   * @param par
   * <ul>
   * <li>0 - no check</li><BR>
   * <li>1 - odd</li><BR>
   * <li>2 - even</li><BR>
   * </ul>
   * @param dbs
   * @return {@code true} : success, {@code false} : fail
   * @since 1.x.x
   */
  public boolean init(int bps, int par, int dbs) throws android.os.RemoteException;
  /**
   * @brief read data
   * 
   * @param buffer the buffer
   * @param timeout the timeout in millisecond
   * @return the length read, or -1 on failure
   * @since 1.x.x
   */
  public int read(byte[] buffer, int expectLen, int timeout) throws android.os.RemoteException;
  /**
   * <p> write data
   * 
   * @param data	the data buffer
   * @param timeout	the timeout in millisecond
   * @return the length wrote, or -1 on failure
   * @since 1.x.x
   */
  public int write(byte[] data, int timeout) throws android.os.RemoteException;
  /**
   * <p> clean up the input(read) buffer
   * 
   * @return {@code true} : success, {@code false} : fail
   * @since 1.x.x
   */
  public boolean clearInputBuffer() throws android.os.RemoteException;
  /**
   * <p> check if there is data in buffer
   * 
   * @param {@code true}: check input(read) buffer, {@code false}: check output(write) buffer
   * @return {@code true}: data available,  {@code false}: no data available
   * @since 1.x.x
   */
  public boolean isBufferEmpty(boolean input) throws android.os.RemoteException;
  public int writeEx(byte[] data, int timeout, android.os.Bundle bundle) throws android.os.RemoteException;
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
