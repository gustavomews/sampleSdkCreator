/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.verifone.baseconnect;
// Declare any non-default types here with import statements
public interface BaseServiceConnection extends android.os.IInterface
{
  /** Default implementation for BaseServiceConnection. */
  public static class Default implements com.verifone.baseconnect.BaseServiceConnection
  {
    /** 获取底座设备信息 */
    @Override public int getBaseInfo(byte[] info) throws android.os.RemoteException
    {
      return 0;
    }
    //int 结果大于0为info数组长度，失败为负数
    /** 获取本地保存的信息。 */
    @Override public int getSavedInfo(com.verifone.baseconnect.SavedInfo info) throws android.os.RemoteException
    {
      return 0;
    }
    /** 底座绑定 */
    @Override public void bindBase(com.verifone.baseconnect.BindInfo info, com.verifone.baseconnect.StateListener listener) throws android.os.RemoteException
    {
    }
    /** 底座解绑 */
    @Override public int unbindBase() throws android.os.RemoteException
    {
      return 0;
    }
    /** 升级底座设备的固件 */
    @Override public void updateTerminal(java.lang.String filePath, com.verifone.baseconnect.UpdateListener listener) throws android.os.RemoteException
    {
    }
    /**  获取连接状态 */
    @Override public int getConnectState() throws android.os.RemoteException
    {
      return 0;
    }
    /**  连接或断开连接操作 */
    @Override public void connectBase(int operation, com.verifone.baseconnect.StateListener listener) throws android.os.RemoteException
    {
    }
    /** 释放监听状态 */
    @Override public void realeaseListener() throws android.os.RemoteException
    {
    }
    /** 设置设备属性信息 */
    @Override public int setBaseInfo(byte[] info) throws android.os.RemoteException
    {
      return 0;
    }
    /** 底座设备重启 */
    @Override public int restartBase() throws android.os.RemoteException
    {
      return 0;
    }
    /** 获取挂载结果 */
    @Override public byte getAttachResult() throws android.os.RemoteException
    {
      return 0;
    }
    /** 设置底座状态监听 */
    @Override public void setBaseStateListener(com.verifone.baseconnect.StateListener listener) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.verifone.baseconnect.BaseServiceConnection
  {
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.verifone.baseconnect.BaseServiceConnection interface,
     * generating a proxy if needed.
     */
    public static com.verifone.baseconnect.BaseServiceConnection asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.verifone.baseconnect.BaseServiceConnection))) {
        return ((com.verifone.baseconnect.BaseServiceConnection)iin);
      }
      return new com.verifone.baseconnect.BaseServiceConnection.Stub.Proxy(obj);
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
        case TRANSACTION_getBaseInfo:
        {
          byte[] _arg0;
          int _arg0_length = data.readInt();
          if (_arg0_length < 0) {
            _arg0 = null;
          } else {
            _arg0 = new byte[_arg0_length];
          }
          int _result = this.getBaseInfo(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          reply.writeByteArray(_arg0);
          break;
        }
        case TRANSACTION_getSavedInfo:
        {
          com.verifone.baseconnect.SavedInfo _arg0;
          _arg0 = new com.verifone.baseconnect.SavedInfo();
          int _result = this.getSavedInfo(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          _Parcel.writeTypedObject(reply, _arg0, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          break;
        }
        case TRANSACTION_bindBase:
        {
          com.verifone.baseconnect.BindInfo _arg0;
          _arg0 = _Parcel.readTypedObject(data, com.verifone.baseconnect.BindInfo.CREATOR);
          com.verifone.baseconnect.StateListener _arg1;
          _arg1 = com.verifone.baseconnect.StateListener.Stub.asInterface(data.readStrongBinder());
          this.bindBase(_arg0, _arg1);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_unbindBase:
        {
          int _result = this.unbindBase();
          reply.writeNoException();
          reply.writeInt(_result);
          break;
        }
        case TRANSACTION_updateTerminal:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          com.verifone.baseconnect.UpdateListener _arg1;
          _arg1 = com.verifone.baseconnect.UpdateListener.Stub.asInterface(data.readStrongBinder());
          this.updateTerminal(_arg0, _arg1);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_getConnectState:
        {
          int _result = this.getConnectState();
          reply.writeNoException();
          reply.writeInt(_result);
          break;
        }
        case TRANSACTION_connectBase:
        {
          int _arg0;
          _arg0 = data.readInt();
          com.verifone.baseconnect.StateListener _arg1;
          _arg1 = com.verifone.baseconnect.StateListener.Stub.asInterface(data.readStrongBinder());
          this.connectBase(_arg0, _arg1);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_realeaseListener:
        {
          this.realeaseListener();
          reply.writeNoException();
          break;
        }
        case TRANSACTION_setBaseInfo:
        {
          byte[] _arg0;
          _arg0 = data.createByteArray();
          int _result = this.setBaseInfo(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          break;
        }
        case TRANSACTION_restartBase:
        {
          int _result = this.restartBase();
          reply.writeNoException();
          reply.writeInt(_result);
          break;
        }
        case TRANSACTION_getAttachResult:
        {
          byte _result = this.getAttachResult();
          reply.writeNoException();
          reply.writeByte(_result);
          break;
        }
        case TRANSACTION_setBaseStateListener:
        {
          com.verifone.baseconnect.StateListener _arg0;
          _arg0 = com.verifone.baseconnect.StateListener.Stub.asInterface(data.readStrongBinder());
          this.setBaseStateListener(_arg0);
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
    private static class Proxy implements com.verifone.baseconnect.BaseServiceConnection
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
      /** 获取底座设备信息 */
      @Override public int getBaseInfo(byte[] info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((info==null)) {
            _data.writeInt(-1);
          }
          else {
            _data.writeInt(info.length);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_getBaseInfo, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readInt();
          _reply.readByteArray(info);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      //int 结果大于0为info数组长度，失败为负数
      /** 获取本地保存的信息。 */
      @Override public int getSavedInfo(com.verifone.baseconnect.SavedInfo info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getSavedInfo, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readInt();
          if ((0!=_reply.readInt())) {
            info.readFromParcel(_reply);
          }
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /** 底座绑定 */
      @Override public void bindBase(com.verifone.baseconnect.BindInfo info, com.verifone.baseconnect.StateListener listener) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _Parcel.writeTypedObject(_data, info, 0);
          _data.writeStrongInterface(listener);
          boolean _status = mRemote.transact(Stub.TRANSACTION_bindBase, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /** 底座解绑 */
      @Override public int unbindBase() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_unbindBase, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /** 升级底座设备的固件 */
      @Override public void updateTerminal(java.lang.String filePath, com.verifone.baseconnect.UpdateListener listener) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(filePath);
          _data.writeStrongInterface(listener);
          boolean _status = mRemote.transact(Stub.TRANSACTION_updateTerminal, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**  获取连接状态 */
      @Override public int getConnectState() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getConnectState, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**  连接或断开连接操作 */
      @Override public void connectBase(int operation, com.verifone.baseconnect.StateListener listener) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(operation);
          _data.writeStrongInterface(listener);
          boolean _status = mRemote.transact(Stub.TRANSACTION_connectBase, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /** 释放监听状态 */
      @Override public void realeaseListener() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_realeaseListener, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /** 设置设备属性信息 */
      @Override public int setBaseInfo(byte[] info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(info);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setBaseInfo, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /** 底座设备重启 */
      @Override public int restartBase() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_restartBase, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /** 获取挂载结果 */
      @Override public byte getAttachResult() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        byte _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getAttachResult, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readByte();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /** 设置底座状态监听 */
      @Override public void setBaseStateListener(com.verifone.baseconnect.StateListener listener) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongInterface(listener);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setBaseStateListener, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
    }
    static final int TRANSACTION_getBaseInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_getSavedInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_bindBase = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_unbindBase = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_updateTerminal = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_getConnectState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_connectBase = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_realeaseListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_setBaseInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    static final int TRANSACTION_restartBase = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
    static final int TRANSACTION_getAttachResult = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
    static final int TRANSACTION_setBaseStateListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
  }
  public static final java.lang.String DESCRIPTOR = "com.verifone.baseconnect.BaseServiceConnection";
  /** 获取底座设备信息 */
  public int getBaseInfo(byte[] info) throws android.os.RemoteException;
  //int 结果大于0为info数组长度，失败为负数
  /** 获取本地保存的信息。 */
  public int getSavedInfo(com.verifone.baseconnect.SavedInfo info) throws android.os.RemoteException;
  /** 底座绑定 */
  public void bindBase(com.verifone.baseconnect.BindInfo info, com.verifone.baseconnect.StateListener listener) throws android.os.RemoteException;
  /** 底座解绑 */
  public int unbindBase() throws android.os.RemoteException;
  /** 升级底座设备的固件 */
  public void updateTerminal(java.lang.String filePath, com.verifone.baseconnect.UpdateListener listener) throws android.os.RemoteException;
  /**  获取连接状态 */
  public int getConnectState() throws android.os.RemoteException;
  /**  连接或断开连接操作 */
  public void connectBase(int operation, com.verifone.baseconnect.StateListener listener) throws android.os.RemoteException;
  /** 释放监听状态 */
  public void realeaseListener() throws android.os.RemoteException;
  /** 设置设备属性信息 */
  public int setBaseInfo(byte[] info) throws android.os.RemoteException;
  /** 底座设备重启 */
  public int restartBase() throws android.os.RemoteException;
  /** 获取挂载结果 */
  public byte getAttachResult() throws android.os.RemoteException;
  /** 设置底座状态监听 */
  public void setBaseStateListener(com.verifone.baseconnect.StateListener listener) throws android.os.RemoteException;
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
