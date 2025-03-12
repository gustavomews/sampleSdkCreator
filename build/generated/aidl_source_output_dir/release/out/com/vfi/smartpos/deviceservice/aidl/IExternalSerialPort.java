/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.vfi.smartpos.deviceservice.aidl;
/** <p> about the serial port on dock ( base ) */
public interface IExternalSerialPort extends android.os.IInterface
{
  /** Default implementation for IExternalSerialPort. */
  public static class Default implements com.vfi.smartpos.deviceservice.aidl.IExternalSerialPort
  {
    /**
     * <p> set the base Pinpad port function mode.
     * <p> The mode includes
     * <ul>
     *  <li> {@link com.vfi.smartpos.deviceservice.aidl.ExternalSerialConst.MODE_TRANSPARENT} </li>
     *  <li> {@link com.vfi.smartpos.deviceservice.aidl.ExternalSerialConst.MODE_PP1000V3_PINPAD} </li>
     *  <li> {@link com.vfi.smartpos.deviceservice.aidl.ExternalSerialConst.MODE_PP1000V3_CTLS} </li>
     * </ul>
     * <p> default mode is ExternalSerialConst.MODE_TRANSPARENT. This mode will not be lost after power off.
     * <p> Note that: because base Pinpad port has only one, when you set one mode, other mode function interfaces will not be used. unless you reset the mode.
     * 
     * @param portMode you can set ExternalSerialConst.MODE_TRANSPARENT, or ExternalSerialConst.MODE_PP1000V3_PINPAD, or ExternalSerialConst.MODE_PP1000V3_CTLS. other value will not be set but will return current pinpan port mode value.
     * @return current pinpad port mode value.
     * @since 1.x.x
     */
    @Override public int setExtPinpadPortMode(int portMode) throws android.os.RemoteException
    {
      return 0;
    }
    /**
     * <p> check if pos connects pinpad successfully?
     * 
     * @return {@code true} success. {@code false} fail.
     * @since 1.x.x
     */
    @Override public boolean isExternalConnected() throws android.os.RemoteException
    {
      return false;
    }
    /**
     * <p> open serial port and set serial port config (including baud rate, data bit, stop bit, parity bit). if the serial port has opend, return true directly.
     * 
     * @param portNum : {@link com.vfi.smartpos.deviceservice.aidl.ExternalSerialConst.PORT_PINPAD} or {@link com.vfi.smartpos.deviceservice.aidl.ExternalSerialConst.PORT_RS232}.
     * @param dataControl : set serial port config. please see {@link com.vfi.smartpos.deviceservice.aidl.ExternalSerialConst}.
     * @return {@code true} success. {@code false} fail.
     * @since 1.x.x
     */
    @Override public boolean openSerialPort(int portNum, com.vfi.smartpos.deviceservice.aidl.SerialDataControl dataControl) throws android.os.RemoteException
    {
      return false;
    }
    /**
     * <p> non-blocking write serial port data.
     * 
     * @param portNum : {@link com.vfi.smartpos.deviceservice.aidl.ExternalSerialConst.PORT_PINPAD} or {@link com.vfi.smartpos.deviceservice.aidl.ExternalSerialConst.PORT_RS232}.
     * @param writeData : transport writing data buffer
     * @param dataLength : transport writing data length
     * @return the length of the data actually sent. if return 0, means no data was sent. if return negative number, please see {@link com.vfi.smartpos.deviceservice.aidl.ExternalSerialConst}.
     * @since 1.x.x
     */
    @Override public int writeSerialPort(int portNum, byte[] writeData, int dataLength) throws android.os.RemoteException
    {
      return 0;
    }
    /**
     * <p> non-blocking read serial port data.
     * 
     * @param portNum : {@link com.vfi.smartpos.deviceservice.aidl.ExternalSerialConst.PORT_PINPAD} or {@link com.vfi.smartpos.deviceservice.aidl.ExternalSerialConst.PORT_RS232}.
     * @param readData : transport reading data buffer
     * @param dataLength : transport reading data length (the length can not be larger than the buffer size)
     * @return the length of the data actually readed; if return 0, means no data was readed. if return negative number, please see {@link com.vfi.smartpos.deviceservice.aidl.ExternalSerialConst}.
     * @since 1.x.x
     */
    @Override public int readSerialPort(int portNum, byte[] readData, int dataLength) throws android.os.RemoteException
    {
      return 0;
    }
    /**
     * <p> block writing serial port data until timeout.
     * 
     * @param portNum : {@link com.vfi.smartpos.deviceservice.aidl.ExternalSerialConst.PORT_PINPAD} or {@link com.vfi.smartpos.deviceservice.aidl.ExternalSerialConst.PORT_RS232}.
     * @param writeData : transport writing data buffer
     * @param dataLength : transport writing data length
     * @param timeoutMs : overtime time(unit is milliseconds)
     * @return the length of the data actually sent. if return 0, means no data was sent. if return negative number, please see {@link com.vfi.smartpos.deviceservice.aidl.ExternalSerialConst}.
     * @since 1.x.x
     */
    @Override public int safeWriteSerialPort(int portNum, byte[] writeData, int Length, long timeoutMs) throws android.os.RemoteException
    {
      return 0;
    }
    /**
     * <p> block reading serial port data until timeout.
     * 
     * @param portNum : {@link com.vfi.smartpos.deviceservice.aidl.ExternalSerialConst.PORT_PINPAD} or {@link com.vfi.smartpos.deviceservice.aidl.ExternalSerialConst.PORT_RS232}.
     * @param readData : transport reading data buffer
     * @param dataLength : transport reading data length (the length can not be larger than the buffer size)
     * @param timeoutMs : overtime time(unit is milliseconds)
     * @return the length of the data actually readed; if return 0, means no data was readed. if return negative number, please see {@link com.vfi.smartpos.deviceservice.aidl.ExternalSerialConst}.
     * @since 1.x.x
     */
    @Override public int safeReadSerialPort(int portNum, byte[] readData, int Length, long timeoutMs) throws android.os.RemoteException
    {
      return 0;
    }
    /**
     * <p> close serial port.
     * 
     * @param portNum : {@link com.vfi.smartpos.deviceservice.aidl.ExternalSerialConst.PORT_PINPAD} or {@link com.vfi.smartpos.deviceservice.aidl.ExternalSerialConst.PORT_RS232}.
     * @since 1.x.x
     */
    @Override public void closeSerialPort(int portNum) throws android.os.RemoteException
    {
    }
    /**
     * clear buffer
     * @param portNum
     * @return
     */
    @Override public boolean clearInputBuffer(int portNum) throws android.os.RemoteException
    {
      return false;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.vfi.smartpos.deviceservice.aidl.IExternalSerialPort
  {
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.vfi.smartpos.deviceservice.aidl.IExternalSerialPort interface,
     * generating a proxy if needed.
     */
    public static com.vfi.smartpos.deviceservice.aidl.IExternalSerialPort asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.vfi.smartpos.deviceservice.aidl.IExternalSerialPort))) {
        return ((com.vfi.smartpos.deviceservice.aidl.IExternalSerialPort)iin);
      }
      return new com.vfi.smartpos.deviceservice.aidl.IExternalSerialPort.Stub.Proxy(obj);
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
        case TRANSACTION_setExtPinpadPortMode:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _result = this.setExtPinpadPortMode(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          break;
        }
        case TRANSACTION_isExternalConnected:
        {
          boolean _result = this.isExternalConnected();
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        case TRANSACTION_openSerialPort:
        {
          int _arg0;
          _arg0 = data.readInt();
          com.vfi.smartpos.deviceservice.aidl.SerialDataControl _arg1;
          _arg1 = _Parcel.readTypedObject(data, com.vfi.smartpos.deviceservice.aidl.SerialDataControl.CREATOR);
          boolean _result = this.openSerialPort(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        case TRANSACTION_writeSerialPort:
        {
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          int _arg2;
          _arg2 = data.readInt();
          int _result = this.writeSerialPort(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(_result);
          break;
        }
        case TRANSACTION_readSerialPort:
        {
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          int _arg1_length = data.readInt();
          if (_arg1_length < 0) {
            _arg1 = null;
          } else {
            _arg1 = new byte[_arg1_length];
          }
          int _arg2;
          _arg2 = data.readInt();
          int _result = this.readSerialPort(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg1);
          break;
        }
        case TRANSACTION_safeWriteSerialPort:
        {
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          int _arg2;
          _arg2 = data.readInt();
          long _arg3;
          _arg3 = data.readLong();
          int _result = this.safeWriteSerialPort(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          reply.writeInt(_result);
          break;
        }
        case TRANSACTION_safeReadSerialPort:
        {
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          int _arg1_length = data.readInt();
          if (_arg1_length < 0) {
            _arg1 = null;
          } else {
            _arg1 = new byte[_arg1_length];
          }
          int _arg2;
          _arg2 = data.readInt();
          long _arg3;
          _arg3 = data.readLong();
          int _result = this.safeReadSerialPort(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg1);
          break;
        }
        case TRANSACTION_closeSerialPort:
        {
          int _arg0;
          _arg0 = data.readInt();
          this.closeSerialPort(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_clearInputBuffer:
        {
          int _arg0;
          _arg0 = data.readInt();
          boolean _result = this.clearInputBuffer(_arg0);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static class Proxy implements com.vfi.smartpos.deviceservice.aidl.IExternalSerialPort
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
       * <p> set the base Pinpad port function mode.
       * <p> The mode includes
       * <ul>
       *  <li> {@link com.vfi.smartpos.deviceservice.aidl.ExternalSerialConst.MODE_TRANSPARENT} </li>
       *  <li> {@link com.vfi.smartpos.deviceservice.aidl.ExternalSerialConst.MODE_PP1000V3_PINPAD} </li>
       *  <li> {@link com.vfi.smartpos.deviceservice.aidl.ExternalSerialConst.MODE_PP1000V3_CTLS} </li>
       * </ul>
       * <p> default mode is ExternalSerialConst.MODE_TRANSPARENT. This mode will not be lost after power off.
       * <p> Note that: because base Pinpad port has only one, when you set one mode, other mode function interfaces will not be used. unless you reset the mode.
       * 
       * @param portMode you can set ExternalSerialConst.MODE_TRANSPARENT, or ExternalSerialConst.MODE_PP1000V3_PINPAD, or ExternalSerialConst.MODE_PP1000V3_CTLS. other value will not be set but will return current pinpan port mode value.
       * @return current pinpad port mode value.
       * @since 1.x.x
       */
      @Override public int setExtPinpadPortMode(int portMode) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(portMode);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setExtPinpadPortMode, _data, _reply, 0);
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
       * <p> check if pos connects pinpad successfully?
       * 
       * @return {@code true} success. {@code false} fail.
       * @since 1.x.x
       */
      @Override public boolean isExternalConnected() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_isExternalConnected, _data, _reply, 0);
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
       * <p> open serial port and set serial port config (including baud rate, data bit, stop bit, parity bit). if the serial port has opend, return true directly.
       * 
       * @param portNum : {@link com.vfi.smartpos.deviceservice.aidl.ExternalSerialConst.PORT_PINPAD} or {@link com.vfi.smartpos.deviceservice.aidl.ExternalSerialConst.PORT_RS232}.
       * @param dataControl : set serial port config. please see {@link com.vfi.smartpos.deviceservice.aidl.ExternalSerialConst}.
       * @return {@code true} success. {@code false} fail.
       * @since 1.x.x
       */
      @Override public boolean openSerialPort(int portNum, com.vfi.smartpos.deviceservice.aidl.SerialDataControl dataControl) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(portNum);
          _Parcel.writeTypedObject(_data, dataControl, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_openSerialPort, _data, _reply, 0);
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
       * <p> non-blocking write serial port data.
       * 
       * @param portNum : {@link com.vfi.smartpos.deviceservice.aidl.ExternalSerialConst.PORT_PINPAD} or {@link com.vfi.smartpos.deviceservice.aidl.ExternalSerialConst.PORT_RS232}.
       * @param writeData : transport writing data buffer
       * @param dataLength : transport writing data length
       * @return the length of the data actually sent. if return 0, means no data was sent. if return negative number, please see {@link com.vfi.smartpos.deviceservice.aidl.ExternalSerialConst}.
       * @since 1.x.x
       */
      @Override public int writeSerialPort(int portNum, byte[] writeData, int dataLength) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(portNum);
          _data.writeByteArray(writeData);
          _data.writeInt(dataLength);
          boolean _status = mRemote.transact(Stub.TRANSACTION_writeSerialPort, _data, _reply, 0);
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
       * <p> non-blocking read serial port data.
       * 
       * @param portNum : {@link com.vfi.smartpos.deviceservice.aidl.ExternalSerialConst.PORT_PINPAD} or {@link com.vfi.smartpos.deviceservice.aidl.ExternalSerialConst.PORT_RS232}.
       * @param readData : transport reading data buffer
       * @param dataLength : transport reading data length (the length can not be larger than the buffer size)
       * @return the length of the data actually readed; if return 0, means no data was readed. if return negative number, please see {@link com.vfi.smartpos.deviceservice.aidl.ExternalSerialConst}.
       * @since 1.x.x
       */
      @Override public int readSerialPort(int portNum, byte[] readData, int dataLength) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(portNum);
          if ((readData==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(readData.length);
          }
          _data.writeInt(dataLength);
          boolean _status = mRemote.transact(Stub.TRANSACTION_readSerialPort, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(readData);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * <p> block writing serial port data until timeout.
       * 
       * @param portNum : {@link com.vfi.smartpos.deviceservice.aidl.ExternalSerialConst.PORT_PINPAD} or {@link com.vfi.smartpos.deviceservice.aidl.ExternalSerialConst.PORT_RS232}.
       * @param writeData : transport writing data buffer
       * @param dataLength : transport writing data length
       * @param timeoutMs : overtime time(unit is milliseconds)
       * @return the length of the data actually sent. if return 0, means no data was sent. if return negative number, please see {@link com.vfi.smartpos.deviceservice.aidl.ExternalSerialConst}.
       * @since 1.x.x
       */
      @Override public int safeWriteSerialPort(int portNum, byte[] writeData, int Length, long timeoutMs) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(portNum);
          _data.writeByteArray(writeData);
          _data.writeInt(Length);
          _data.writeLong(timeoutMs);
          boolean _status = mRemote.transact(Stub.TRANSACTION_safeWriteSerialPort, _data, _reply, 0);
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
       * <p> block reading serial port data until timeout.
       * 
       * @param portNum : {@link com.vfi.smartpos.deviceservice.aidl.ExternalSerialConst.PORT_PINPAD} or {@link com.vfi.smartpos.deviceservice.aidl.ExternalSerialConst.PORT_RS232}.
       * @param readData : transport reading data buffer
       * @param dataLength : transport reading data length (the length can not be larger than the buffer size)
       * @param timeoutMs : overtime time(unit is milliseconds)
       * @return the length of the data actually readed; if return 0, means no data was readed. if return negative number, please see {@link com.vfi.smartpos.deviceservice.aidl.ExternalSerialConst}.
       * @since 1.x.x
       */
      @Override public int safeReadSerialPort(int portNum, byte[] readData, int Length, long timeoutMs) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(portNum);
          if ((readData==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(readData.length);
          }
          _data.writeInt(Length);
          _data.writeLong(timeoutMs);
          boolean _status = mRemote.transact(Stub.TRANSACTION_safeReadSerialPort, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(readData);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * <p> close serial port.
       * 
       * @param portNum : {@link com.vfi.smartpos.deviceservice.aidl.ExternalSerialConst.PORT_PINPAD} or {@link com.vfi.smartpos.deviceservice.aidl.ExternalSerialConst.PORT_RS232}.
       * @since 1.x.x
       */
      @Override public void closeSerialPort(int portNum) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(portNum);
          boolean _status = mRemote.transact(Stub.TRANSACTION_closeSerialPort, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * clear buffer
       * @param portNum
       * @return
       */
      @Override public boolean clearInputBuffer(int portNum) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(portNum);
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
    }
    static final int TRANSACTION_setExtPinpadPortMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_isExternalConnected = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_openSerialPort = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_writeSerialPort = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_readSerialPort = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_safeWriteSerialPort = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_safeReadSerialPort = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_closeSerialPort = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_clearInputBuffer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
  }
  public static final java.lang.String DESCRIPTOR = "com.vfi.smartpos.deviceservice.aidl.IExternalSerialPort";
  /**
   * <p> set the base Pinpad port function mode.
   * <p> The mode includes
   * <ul>
   *  <li> {@link com.vfi.smartpos.deviceservice.aidl.ExternalSerialConst.MODE_TRANSPARENT} </li>
   *  <li> {@link com.vfi.smartpos.deviceservice.aidl.ExternalSerialConst.MODE_PP1000V3_PINPAD} </li>
   *  <li> {@link com.vfi.smartpos.deviceservice.aidl.ExternalSerialConst.MODE_PP1000V3_CTLS} </li>
   * </ul>
   * <p> default mode is ExternalSerialConst.MODE_TRANSPARENT. This mode will not be lost after power off.
   * <p> Note that: because base Pinpad port has only one, when you set one mode, other mode function interfaces will not be used. unless you reset the mode.
   * 
   * @param portMode you can set ExternalSerialConst.MODE_TRANSPARENT, or ExternalSerialConst.MODE_PP1000V3_PINPAD, or ExternalSerialConst.MODE_PP1000V3_CTLS. other value will not be set but will return current pinpan port mode value.
   * @return current pinpad port mode value.
   * @since 1.x.x
   */
  public int setExtPinpadPortMode(int portMode) throws android.os.RemoteException;
  /**
   * <p> check if pos connects pinpad successfully?
   * 
   * @return {@code true} success. {@code false} fail.
   * @since 1.x.x
   */
  public boolean isExternalConnected() throws android.os.RemoteException;
  /**
   * <p> open serial port and set serial port config (including baud rate, data bit, stop bit, parity bit). if the serial port has opend, return true directly.
   * 
   * @param portNum : {@link com.vfi.smartpos.deviceservice.aidl.ExternalSerialConst.PORT_PINPAD} or {@link com.vfi.smartpos.deviceservice.aidl.ExternalSerialConst.PORT_RS232}.
   * @param dataControl : set serial port config. please see {@link com.vfi.smartpos.deviceservice.aidl.ExternalSerialConst}.
   * @return {@code true} success. {@code false} fail.
   * @since 1.x.x
   */
  public boolean openSerialPort(int portNum, com.vfi.smartpos.deviceservice.aidl.SerialDataControl dataControl) throws android.os.RemoteException;
  /**
   * <p> non-blocking write serial port data.
   * 
   * @param portNum : {@link com.vfi.smartpos.deviceservice.aidl.ExternalSerialConst.PORT_PINPAD} or {@link com.vfi.smartpos.deviceservice.aidl.ExternalSerialConst.PORT_RS232}.
   * @param writeData : transport writing data buffer
   * @param dataLength : transport writing data length
   * @return the length of the data actually sent. if return 0, means no data was sent. if return negative number, please see {@link com.vfi.smartpos.deviceservice.aidl.ExternalSerialConst}.
   * @since 1.x.x
   */
  public int writeSerialPort(int portNum, byte[] writeData, int dataLength) throws android.os.RemoteException;
  /**
   * <p> non-blocking read serial port data.
   * 
   * @param portNum : {@link com.vfi.smartpos.deviceservice.aidl.ExternalSerialConst.PORT_PINPAD} or {@link com.vfi.smartpos.deviceservice.aidl.ExternalSerialConst.PORT_RS232}.
   * @param readData : transport reading data buffer
   * @param dataLength : transport reading data length (the length can not be larger than the buffer size)
   * @return the length of the data actually readed; if return 0, means no data was readed. if return negative number, please see {@link com.vfi.smartpos.deviceservice.aidl.ExternalSerialConst}.
   * @since 1.x.x
   */
  public int readSerialPort(int portNum, byte[] readData, int dataLength) throws android.os.RemoteException;
  /**
   * <p> block writing serial port data until timeout.
   * 
   * @param portNum : {@link com.vfi.smartpos.deviceservice.aidl.ExternalSerialConst.PORT_PINPAD} or {@link com.vfi.smartpos.deviceservice.aidl.ExternalSerialConst.PORT_RS232}.
   * @param writeData : transport writing data buffer
   * @param dataLength : transport writing data length
   * @param timeoutMs : overtime time(unit is milliseconds)
   * @return the length of the data actually sent. if return 0, means no data was sent. if return negative number, please see {@link com.vfi.smartpos.deviceservice.aidl.ExternalSerialConst}.
   * @since 1.x.x
   */
  public int safeWriteSerialPort(int portNum, byte[] writeData, int Length, long timeoutMs) throws android.os.RemoteException;
  /**
   * <p> block reading serial port data until timeout.
   * 
   * @param portNum : {@link com.vfi.smartpos.deviceservice.aidl.ExternalSerialConst.PORT_PINPAD} or {@link com.vfi.smartpos.deviceservice.aidl.ExternalSerialConst.PORT_RS232}.
   * @param readData : transport reading data buffer
   * @param dataLength : transport reading data length (the length can not be larger than the buffer size)
   * @param timeoutMs : overtime time(unit is milliseconds)
   * @return the length of the data actually readed; if return 0, means no data was readed. if return negative number, please see {@link com.vfi.smartpos.deviceservice.aidl.ExternalSerialConst}.
   * @since 1.x.x
   */
  public int safeReadSerialPort(int portNum, byte[] readData, int Length, long timeoutMs) throws android.os.RemoteException;
  /**
   * <p> close serial port.
   * 
   * @param portNum : {@link com.vfi.smartpos.deviceservice.aidl.ExternalSerialConst.PORT_PINPAD} or {@link com.vfi.smartpos.deviceservice.aidl.ExternalSerialConst.PORT_RS232}.
   * @since 1.x.x
   */
  public void closeSerialPort(int portNum) throws android.os.RemoteException;
  /**
   * clear buffer
   * @param portNum
   * @return
   */
  public boolean clearInputBuffer(int portNum) throws android.os.RemoteException;
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
