/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.vfi.smartpos.deviceservice.aidl;
/**
 * Created by Simon on 2019/3/25.
 * @since >= 2.0.9
 */
public interface ISmartCardReaderEx extends android.os.IInterface
{
  /** Default implementation for ISmartCardReaderEx. */
  public static class Default implements com.vfi.smartpos.deviceservice.aidl.ISmartCardReaderEx
  {
    /**
     * @param listener, the callback listener for result
     * @param timeout, the timeout in second(s)
     * @since >= 2.0.9
     * @see SmartCardExSearchListener
     * @see #powerUp() for search card success
     */
    @Override public void search(com.vfi.smartpos.deviceservice.aidl.SmartCardExSearchListener listener, int timeout) throws android.os.RemoteException
    {
    }
    /** @since >= 2.0.9 */
    @Override public void stopSearch() throws android.os.RemoteException
    {
    }
    /**
     * @return true for success, false for failure
     * @brief power up the card
     * @since >= 2.0.9
     * @see #powerDown()
     */
    @Override public boolean powerUp() throws android.os.RemoteException
    {
      return false;
    }
    /**
     * @return true for success, false for failure
     * @brief power down the card
     * @since >= 2.0.9
     * @see #powerUp()
     */
    @Override public boolean powerDown() throws android.os.RemoteException
    {
      return false;
    }
    /**
     * @param areaType, refer the com/vfi/smartpos/deviceservice/constdefine/ConstISmartCardReaderEx.java for defines
     * @param credentials, the password, new byte[]{0xff,0xff,0xff}
     * @return true for success
     * @since >= 2.0.9
     * @see ConstISmartCardReaderEx.AreaType
     * @see #certificationRemove(byte, byte[])
     */
    @Override public boolean certificationLoad(byte areaType, byte[] credentials) throws android.os.RemoteException
    {
      return false;
    }
    /**
     * @param areaType, refer the com/vfi/smartpos/deviceservice/constdefine/ConstISmartCardReaderEx.java for defines
     * @param credentials, set new password, new byte[]{0xff,0xff,0xff}
     * @return true for success
     * @since >= 2.0.9
     * @see ConstISmartCardReaderEx.CommType
     * @see #certificationLoad(byte, byte[])
     */
    @Override public boolean certificationRemove(byte areaType, byte[] credentials) throws android.os.RemoteException
    {
      return false;
    }
    /**
     * @param areaType, refer the com/vfi/smartpos/deviceservice/constdefine/ConstISmartCardReaderEx.java for defines
     * @param offset
     * @param length
     * @return null for errors, others for data
     * @since >= 2.0.9
     * @see ConstISmartCardReaderEx.AreaType
     * @see #write(byte, int, byte[])
     */
    @Override public byte[] read(byte areaType, int offset, int length) throws android.os.RemoteException
    {
      return null;
    }
    /**
     * @param areaType, refer the com/vfi/smartpos/deviceservice/constdefine/ConstISmartCardReaderEx.java for defines
     * @param offset
     * @param data
     * @return
     * @since >= 2.0.9
     * @see ConstISmartCardReaderEx.AreaType
     * @see #read(byte, int, int)
     */
    @Override public boolean write(byte areaType, int offset, byte[] data) throws android.os.RemoteException
    {
      return false;
    }
    /**
     * @param commType, refer the com/vfi/smartpos/deviceservice/constdefine/ConstISmartCardReaderEx.java, class ConstISmartCardReaderEx.CommType for defines
     * @param areaType, refer the com/vfi/smartpos/deviceservice/constdefine/ConstISmartCardReaderEx.java, class ConstISmartCardReaderEx.AreaType for defines
     * @param offset
     * @param length
     * @param data
     * @return Bundle, code for success or error refer the com/vfi/smartpos/deviceservice/constdefine/ConstISmartCardReaderEx.java, class ConstISmartCardReaderEx.communicate.returnCode for defines
     * response for response from communication
     * @since >= 2.0.9
     * @see ConstISmartCardReaderEx.CommType
     * @see ConstISmartCardReaderEx.AreaType
     * @see ConstISmartCardReaderEx.communicate.returnCode
     */
    @Override public android.os.Bundle communicate(byte commType, byte areaType, int offset, int length, byte[] data) throws android.os.RemoteException
    {
      return null;
    }
    /**
     * check logic card status
     * @return 0x00-card not exist, 0x01-card exist
     * @since 3.11.3
     */
    @Override public byte checkLogicCardStatus() throws android.os.RemoteException
    {
      return 0;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.vfi.smartpos.deviceservice.aidl.ISmartCardReaderEx
  {
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.vfi.smartpos.deviceservice.aidl.ISmartCardReaderEx interface,
     * generating a proxy if needed.
     */
    public static com.vfi.smartpos.deviceservice.aidl.ISmartCardReaderEx asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.vfi.smartpos.deviceservice.aidl.ISmartCardReaderEx))) {
        return ((com.vfi.smartpos.deviceservice.aidl.ISmartCardReaderEx)iin);
      }
      return new com.vfi.smartpos.deviceservice.aidl.ISmartCardReaderEx.Stub.Proxy(obj);
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
        case TRANSACTION_search:
        {
          com.vfi.smartpos.deviceservice.aidl.SmartCardExSearchListener _arg0;
          _arg0 = com.vfi.smartpos.deviceservice.aidl.SmartCardExSearchListener.Stub.asInterface(data.readStrongBinder());
          int _arg1;
          _arg1 = data.readInt();
          this.search(_arg0, _arg1);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_stopSearch:
        {
          this.stopSearch();
          reply.writeNoException();
          break;
        }
        case TRANSACTION_powerUp:
        {
          boolean _result = this.powerUp();
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        case TRANSACTION_powerDown:
        {
          boolean _result = this.powerDown();
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        case TRANSACTION_certificationLoad:
        {
          byte _arg0;
          _arg0 = data.readByte();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          boolean _result = this.certificationLoad(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        case TRANSACTION_certificationRemove:
        {
          byte _arg0;
          _arg0 = data.readByte();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          boolean _result = this.certificationRemove(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        case TRANSACTION_read:
        {
          byte _arg0;
          _arg0 = data.readByte();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          byte[] _result = this.read(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeByteArray(_result);
          break;
        }
        case TRANSACTION_write:
        {
          byte _arg0;
          _arg0 = data.readByte();
          int _arg1;
          _arg1 = data.readInt();
          byte[] _arg2;
          _arg2 = data.createByteArray();
          boolean _result = this.write(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        case TRANSACTION_communicate:
        {
          byte _arg0;
          _arg0 = data.readByte();
          byte _arg1;
          _arg1 = data.readByte();
          int _arg2;
          _arg2 = data.readInt();
          int _arg3;
          _arg3 = data.readInt();
          byte[] _arg4;
          _arg4 = data.createByteArray();
          android.os.Bundle _result = this.communicate(_arg0, _arg1, _arg2, _arg3, _arg4);
          reply.writeNoException();
          _Parcel.writeTypedObject(reply, _result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          break;
        }
        case TRANSACTION_checkLogicCardStatus:
        {
          byte _result = this.checkLogicCardStatus();
          reply.writeNoException();
          reply.writeByte(_result);
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static class Proxy implements com.vfi.smartpos.deviceservice.aidl.ISmartCardReaderEx
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
       * @param listener, the callback listener for result
       * @param timeout, the timeout in second(s)
       * @since >= 2.0.9
       * @see SmartCardExSearchListener
       * @see #powerUp() for search card success
       */
      @Override public void search(com.vfi.smartpos.deviceservice.aidl.SmartCardExSearchListener listener, int timeout) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongInterface(listener);
          _data.writeInt(timeout);
          boolean _status = mRemote.transact(Stub.TRANSACTION_search, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /** @since >= 2.0.9 */
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
       * @return true for success, false for failure
       * @brief power up the card
       * @since >= 2.0.9
       * @see #powerDown()
       */
      @Override public boolean powerUp() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_powerUp, _data, _reply, 0);
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
       * @return true for success, false for failure
       * @brief power down the card
       * @since >= 2.0.9
       * @see #powerUp()
       */
      @Override public boolean powerDown() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_powerDown, _data, _reply, 0);
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
       * @param areaType, refer the com/vfi/smartpos/deviceservice/constdefine/ConstISmartCardReaderEx.java for defines
       * @param credentials, the password, new byte[]{0xff,0xff,0xff}
       * @return true for success
       * @since >= 2.0.9
       * @see ConstISmartCardReaderEx.AreaType
       * @see #certificationRemove(byte, byte[])
       */
      @Override public boolean certificationLoad(byte areaType, byte[] credentials) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByte(areaType);
          _data.writeByteArray(credentials);
          boolean _status = mRemote.transact(Stub.TRANSACTION_certificationLoad, _data, _reply, 0);
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
       * @param areaType, refer the com/vfi/smartpos/deviceservice/constdefine/ConstISmartCardReaderEx.java for defines
       * @param credentials, set new password, new byte[]{0xff,0xff,0xff}
       * @return true for success
       * @since >= 2.0.9
       * @see ConstISmartCardReaderEx.CommType
       * @see #certificationLoad(byte, byte[])
       */
      @Override public boolean certificationRemove(byte areaType, byte[] credentials) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByte(areaType);
          _data.writeByteArray(credentials);
          boolean _status = mRemote.transact(Stub.TRANSACTION_certificationRemove, _data, _reply, 0);
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
       * @param areaType, refer the com/vfi/smartpos/deviceservice/constdefine/ConstISmartCardReaderEx.java for defines
       * @param offset
       * @param length
       * @return null for errors, others for data
       * @since >= 2.0.9
       * @see ConstISmartCardReaderEx.AreaType
       * @see #write(byte, int, byte[])
       */
      @Override public byte[] read(byte areaType, int offset, int length) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        byte[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByte(areaType);
          _data.writeInt(offset);
          _data.writeInt(length);
          boolean _status = mRemote.transact(Stub.TRANSACTION_read, _data, _reply, 0);
          _reply.readException();
          _result = _reply.createByteArray();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * @param areaType, refer the com/vfi/smartpos/deviceservice/constdefine/ConstISmartCardReaderEx.java for defines
       * @param offset
       * @param data
       * @return
       * @since >= 2.0.9
       * @see ConstISmartCardReaderEx.AreaType
       * @see #read(byte, int, int)
       */
      @Override public boolean write(byte areaType, int offset, byte[] data) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByte(areaType);
          _data.writeInt(offset);
          _data.writeByteArray(data);
          boolean _status = mRemote.transact(Stub.TRANSACTION_write, _data, _reply, 0);
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
       * @param commType, refer the com/vfi/smartpos/deviceservice/constdefine/ConstISmartCardReaderEx.java, class ConstISmartCardReaderEx.CommType for defines
       * @param areaType, refer the com/vfi/smartpos/deviceservice/constdefine/ConstISmartCardReaderEx.java, class ConstISmartCardReaderEx.AreaType for defines
       * @param offset
       * @param length
       * @param data
       * @return Bundle, code for success or error refer the com/vfi/smartpos/deviceservice/constdefine/ConstISmartCardReaderEx.java, class ConstISmartCardReaderEx.communicate.returnCode for defines
       * response for response from communication
       * @since >= 2.0.9
       * @see ConstISmartCardReaderEx.CommType
       * @see ConstISmartCardReaderEx.AreaType
       * @see ConstISmartCardReaderEx.communicate.returnCode
       */
      @Override public android.os.Bundle communicate(byte commType, byte areaType, int offset, int length, byte[] data) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.os.Bundle _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByte(commType);
          _data.writeByte(areaType);
          _data.writeInt(offset);
          _data.writeInt(length);
          _data.writeByteArray(data);
          boolean _status = mRemote.transact(Stub.TRANSACTION_communicate, _data, _reply, 0);
          _reply.readException();
          _result = _Parcel.readTypedObject(_reply, android.os.Bundle.CREATOR);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * check logic card status
       * @return 0x00-card not exist, 0x01-card exist
       * @since 3.11.3
       */
      @Override public byte checkLogicCardStatus() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        byte _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_checkLogicCardStatus, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readByte();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
    }
    static final int TRANSACTION_search = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_stopSearch = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_powerUp = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_powerDown = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_certificationLoad = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_certificationRemove = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_read = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_write = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_communicate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    static final int TRANSACTION_checkLogicCardStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
  }
  public static final java.lang.String DESCRIPTOR = "com.vfi.smartpos.deviceservice.aidl.ISmartCardReaderEx";
  /**
   * @param listener, the callback listener for result
   * @param timeout, the timeout in second(s)
   * @since >= 2.0.9
   * @see SmartCardExSearchListener
   * @see #powerUp() for search card success
   */
  public void search(com.vfi.smartpos.deviceservice.aidl.SmartCardExSearchListener listener, int timeout) throws android.os.RemoteException;
  /** @since >= 2.0.9 */
  public void stopSearch() throws android.os.RemoteException;
  /**
   * @return true for success, false for failure
   * @brief power up the card
   * @since >= 2.0.9
   * @see #powerDown()
   */
  public boolean powerUp() throws android.os.RemoteException;
  /**
   * @return true for success, false for failure
   * @brief power down the card
   * @since >= 2.0.9
   * @see #powerUp()
   */
  public boolean powerDown() throws android.os.RemoteException;
  /**
   * @param areaType, refer the com/vfi/smartpos/deviceservice/constdefine/ConstISmartCardReaderEx.java for defines
   * @param credentials, the password, new byte[]{0xff,0xff,0xff}
   * @return true for success
   * @since >= 2.0.9
   * @see ConstISmartCardReaderEx.AreaType
   * @see #certificationRemove(byte, byte[])
   */
  public boolean certificationLoad(byte areaType, byte[] credentials) throws android.os.RemoteException;
  /**
   * @param areaType, refer the com/vfi/smartpos/deviceservice/constdefine/ConstISmartCardReaderEx.java for defines
   * @param credentials, set new password, new byte[]{0xff,0xff,0xff}
   * @return true for success
   * @since >= 2.0.9
   * @see ConstISmartCardReaderEx.CommType
   * @see #certificationLoad(byte, byte[])
   */
  public boolean certificationRemove(byte areaType, byte[] credentials) throws android.os.RemoteException;
  /**
   * @param areaType, refer the com/vfi/smartpos/deviceservice/constdefine/ConstISmartCardReaderEx.java for defines
   * @param offset
   * @param length
   * @return null for errors, others for data
   * @since >= 2.0.9
   * @see ConstISmartCardReaderEx.AreaType
   * @see #write(byte, int, byte[])
   */
  public byte[] read(byte areaType, int offset, int length) throws android.os.RemoteException;
  /**
   * @param areaType, refer the com/vfi/smartpos/deviceservice/constdefine/ConstISmartCardReaderEx.java for defines
   * @param offset
   * @param data
   * @return
   * @since >= 2.0.9
   * @see ConstISmartCardReaderEx.AreaType
   * @see #read(byte, int, int)
   */
  public boolean write(byte areaType, int offset, byte[] data) throws android.os.RemoteException;
  /**
   * @param commType, refer the com/vfi/smartpos/deviceservice/constdefine/ConstISmartCardReaderEx.java, class ConstISmartCardReaderEx.CommType for defines
   * @param areaType, refer the com/vfi/smartpos/deviceservice/constdefine/ConstISmartCardReaderEx.java, class ConstISmartCardReaderEx.AreaType for defines
   * @param offset
   * @param length
   * @param data
   * @return Bundle, code for success or error refer the com/vfi/smartpos/deviceservice/constdefine/ConstISmartCardReaderEx.java, class ConstISmartCardReaderEx.communicate.returnCode for defines
   * response for response from communication
   * @since >= 2.0.9
   * @see ConstISmartCardReaderEx.CommType
   * @see ConstISmartCardReaderEx.AreaType
   * @see ConstISmartCardReaderEx.communicate.returnCode
   */
  public android.os.Bundle communicate(byte commType, byte areaType, int offset, int length, byte[] data) throws android.os.RemoteException;
  /**
   * check logic card status
   * @return 0x00-card not exist, 0x01-card exist
   * @since 3.11.3
   */
  public byte checkLogicCardStatus() throws android.os.RemoteException;
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
