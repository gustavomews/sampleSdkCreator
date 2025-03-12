/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.vfi.smartpos.deviceservice.aidl.key_manager;
/**
 * the object of Dukpt
 * @author Kai.L@verifone.cn, Chao.L@verifone.cn
 */
public interface IDukpt extends android.os.IInterface
{
  /** Default implementation for IDukpt. */
  public static class Default implements com.vfi.smartpos.deviceservice.aidl.key_manager.IDukpt
  {
    /**
     * load the DUKPT key
     * 
     * @param keyId the id (index 0~99)
     * @param ksn the key serial number
     * @param key the key
     * @param checkValue the check value (default NULL)
     * @param extend - extend param
     * <ul>
     *     <li>isPlainKey(boolean) default value is true(key is plain key), value is false means the key is a encrypt key that encrypt by TEK</li>
     *     <li>TEKIndex(int) index of TEK,if isPlainKey is false, need to set this paramater</li>
     *     <li>KSNAutoIncrease(boolean) default value is true, if value is false, application use increaseKSN() to  increase KSN manually</li>
     * </ul>
     * @return true on success, false on failure
     * @since 2.x.x
     */
    @Override public boolean loadDukptKey(int keyId, byte[] ksn, byte[] key, byte[] checkValue, android.os.Bundle extend) throws android.os.RemoteException
    {
      return false;
    }
    /**
     *  increase ksn
     * @param index keyID(0~99)
     * @return current ksn
     * @since 2.x.x
     */
    @Override public byte[] increaseKSN(int index) throws android.os.RemoteException
    {
      return null;
    }
    /**
     * calcute the MAC with given type
     * 
     * @param keyId the index of dukpt key(0~4)
     * @param type Calculation mode <BR>
     *     |---0x00-MAC X99;<BR>
     *     |---0x01-MAC X919;<BR>
     *     |---0x02-ECB (CUP standard ECB algorithm);<BR>
     *     |---0x03-MAC 9606;<BR>
     *     |---0x04-CBC MAC calculation;<BR>
     * @param CBCInitVec - CBC initial vector. fixed length 8, can be null, default 8 bytes 0x00
     * @param data the source date
     * @param desType encrypt type<BR>
     *     |--0x00-des<BR>
     *     |--0x01-3des<BR>
     *     |--0x02-sm4<BR>
     *     |--0x03-aes<BR>
     * @param extend - extend param
     * <ul>
     *     <li>variantRequestKey(boolean) true-Message Authentication, request or both ways; false-Message Authentication, response(default)</li>
     * </ul>
     * @return the mac value, null means failure
     * @since 2.x.x
     */
    @Override public byte[] calculateMAC(int keyId, int type, byte[] CBCInitVec, byte[] data, int desType, android.os.Bundle extend) throws android.os.RemoteException
    {
      return null;
    }
    /**
     * @brief encrypt data
     * @param encryptType<BR>
     *    |---TYPE_DES - 0x00 DES Type<BR>
     *    |---TYPE_3DES - 0x01 3DES Type<BR>
     *    |---TYPE_SM4 - 0x02 SM4 Type<BR>
     *    |---TYPE_AES - 0x03 AES Type<BR>
     * @param algorithmModel<BR>
     *     |--0x01 CBC encrypt<BR>
     *     |--0x02 ECB encrypt<BR>
     *     |--0x03 CBC decrypt<BR>
     *     |--0x04 ECB decrypt<BR>
     * @param data the source date
     * @param initVec cbc init vector
     * @param extend - extend param
     * <ul>
     *     <li style="text-decoration:line-through;"">variantRequestKey(boolean) true-Data Encryption request or both ways; false-Data Encryption response(default)</li>
     *     <li>dukptDispersionType(byte)</li> <BR>
     *           |---0x00 Data Encryption request or both ways<BR>
     *           |---0x01 Data Encryption response (default)<BR>
     *           |---0x02 Customize, use Pin Variant constant<BR>
     * </ul>
     * @return the encrypted data, null means failure
     * @since 2.x.x
     */
    @Override public byte[] calculateData(int keyId, int encryptType, int algorithmModel, byte[] data, byte[] initVec, android.os.Bundle extend) throws android.os.RemoteException
    {
      return null;
    }
    /**
     * get the current KSN
     * 
     * @param index keyID(0~99)
     * @return the current dukpt ksn
     * @since 2.x.x
     */
    @Override public byte[] getDukptKsn(int keyIdx) throws android.os.RemoteException
    {
      return null;
    }
    /**
     * get the last error
     * 
     * @return the description of the last error
     * @since 2.x.x
     */
    @Override public java.lang.String getLastError() throws android.os.RemoteException
    {
      return null;
    }
    /**
     * get dukpt config file for debug(just support debug version service)
     * @param savePath
     * @return true-success false-failed
     * @since 2.x.x
     */
    @Override public boolean getDukptCFG(java.lang.String savePath) throws android.os.RemoteException
    {
      return false;
    }
    /**
     * set dukpt config file
     * @param keyData
     * <ul>
     *     <li>keyId(int)</li>
     *     <li><b style="text-decoration:line-through;">ksn(String) optional, keep current value if not set</b></li> // ksn(String) parameter was removed
     *     <li>autoIncrease(boolean) optional, keep current value if not set</li>
     * </ul>
     * @return true-success false-failed
     * @since 2.6.0.0
     */
    @Override public boolean setDukptCFG(android.os.Bundle keyData) throws android.os.RemoteException
    {
      return false;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.vfi.smartpos.deviceservice.aidl.key_manager.IDukpt
  {
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.vfi.smartpos.deviceservice.aidl.key_manager.IDukpt interface,
     * generating a proxy if needed.
     */
    public static com.vfi.smartpos.deviceservice.aidl.key_manager.IDukpt asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.vfi.smartpos.deviceservice.aidl.key_manager.IDukpt))) {
        return ((com.vfi.smartpos.deviceservice.aidl.key_manager.IDukpt)iin);
      }
      return new com.vfi.smartpos.deviceservice.aidl.key_manager.IDukpt.Stub.Proxy(obj);
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
        case TRANSACTION_loadDukptKey:
        {
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          byte[] _arg2;
          _arg2 = data.createByteArray();
          byte[] _arg3;
          _arg3 = data.createByteArray();
          android.os.Bundle _arg4;
          _arg4 = _Parcel.readTypedObject(data, android.os.Bundle.CREATOR);
          boolean _result = this.loadDukptKey(_arg0, _arg1, _arg2, _arg3, _arg4);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        case TRANSACTION_increaseKSN:
        {
          int _arg0;
          _arg0 = data.readInt();
          byte[] _result = this.increaseKSN(_arg0);
          reply.writeNoException();
          reply.writeByteArray(_result);
          break;
        }
        case TRANSACTION_calculateMAC:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          byte[] _arg2;
          _arg2 = data.createByteArray();
          byte[] _arg3;
          _arg3 = data.createByteArray();
          int _arg4;
          _arg4 = data.readInt();
          android.os.Bundle _arg5;
          _arg5 = _Parcel.readTypedObject(data, android.os.Bundle.CREATOR);
          byte[] _result = this.calculateMAC(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
          reply.writeNoException();
          reply.writeByteArray(_result);
          break;
        }
        case TRANSACTION_calculateData:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          byte[] _arg3;
          _arg3 = data.createByteArray();
          byte[] _arg4;
          _arg4 = data.createByteArray();
          android.os.Bundle _arg5;
          _arg5 = _Parcel.readTypedObject(data, android.os.Bundle.CREATOR);
          byte[] _result = this.calculateData(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
          reply.writeNoException();
          reply.writeByteArray(_result);
          break;
        }
        case TRANSACTION_getDukptKsn:
        {
          int _arg0;
          _arg0 = data.readInt();
          byte[] _result = this.getDukptKsn(_arg0);
          reply.writeNoException();
          reply.writeByteArray(_result);
          break;
        }
        case TRANSACTION_getLastError:
        {
          java.lang.String _result = this.getLastError();
          reply.writeNoException();
          reply.writeString(_result);
          break;
        }
        case TRANSACTION_getDukptCFG:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          boolean _result = this.getDukptCFG(_arg0);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        case TRANSACTION_setDukptCFG:
        {
          android.os.Bundle _arg0;
          _arg0 = _Parcel.readTypedObject(data, android.os.Bundle.CREATOR);
          boolean _result = this.setDukptCFG(_arg0);
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
    private static class Proxy implements com.vfi.smartpos.deviceservice.aidl.key_manager.IDukpt
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
       * load the DUKPT key
       * 
       * @param keyId the id (index 0~99)
       * @param ksn the key serial number
       * @param key the key
       * @param checkValue the check value (default NULL)
       * @param extend - extend param
       * <ul>
       *     <li>isPlainKey(boolean) default value is true(key is plain key), value is false means the key is a encrypt key that encrypt by TEK</li>
       *     <li>TEKIndex(int) index of TEK,if isPlainKey is false, need to set this paramater</li>
       *     <li>KSNAutoIncrease(boolean) default value is true, if value is false, application use increaseKSN() to  increase KSN manually</li>
       * </ul>
       * @return true on success, false on failure
       * @since 2.x.x
       */
      @Override public boolean loadDukptKey(int keyId, byte[] ksn, byte[] key, byte[] checkValue, android.os.Bundle extend) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keyId);
          _data.writeByteArray(ksn);
          _data.writeByteArray(key);
          _data.writeByteArray(checkValue);
          _Parcel.writeTypedObject(_data, extend, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_loadDukptKey, _data, _reply, 0);
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
       *  increase ksn
       * @param index keyID(0~99)
       * @return current ksn
       * @since 2.x.x
       */
      @Override public byte[] increaseKSN(int index) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        byte[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(index);
          boolean _status = mRemote.transact(Stub.TRANSACTION_increaseKSN, _data, _reply, 0);
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
       * calcute the MAC with given type
       * 
       * @param keyId the index of dukpt key(0~4)
       * @param type Calculation mode <BR>
       *     |---0x00-MAC X99;<BR>
       *     |---0x01-MAC X919;<BR>
       *     |---0x02-ECB (CUP standard ECB algorithm);<BR>
       *     |---0x03-MAC 9606;<BR>
       *     |---0x04-CBC MAC calculation;<BR>
       * @param CBCInitVec - CBC initial vector. fixed length 8, can be null, default 8 bytes 0x00
       * @param data the source date
       * @param desType encrypt type<BR>
       *     |--0x00-des<BR>
       *     |--0x01-3des<BR>
       *     |--0x02-sm4<BR>
       *     |--0x03-aes<BR>
       * @param extend - extend param
       * <ul>
       *     <li>variantRequestKey(boolean) true-Message Authentication, request or both ways; false-Message Authentication, response(default)</li>
       * </ul>
       * @return the mac value, null means failure
       * @since 2.x.x
       */
      @Override public byte[] calculateMAC(int keyId, int type, byte[] CBCInitVec, byte[] data, int desType, android.os.Bundle extend) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        byte[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keyId);
          _data.writeInt(type);
          _data.writeByteArray(CBCInitVec);
          _data.writeByteArray(data);
          _data.writeInt(desType);
          _Parcel.writeTypedObject(_data, extend, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_calculateMAC, _data, _reply, 0);
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
       * @brief encrypt data
       * @param encryptType<BR>
       *    |---TYPE_DES - 0x00 DES Type<BR>
       *    |---TYPE_3DES - 0x01 3DES Type<BR>
       *    |---TYPE_SM4 - 0x02 SM4 Type<BR>
       *    |---TYPE_AES - 0x03 AES Type<BR>
       * @param algorithmModel<BR>
       *     |--0x01 CBC encrypt<BR>
       *     |--0x02 ECB encrypt<BR>
       *     |--0x03 CBC decrypt<BR>
       *     |--0x04 ECB decrypt<BR>
       * @param data the source date
       * @param initVec cbc init vector
       * @param extend - extend param
       * <ul>
       *     <li style="text-decoration:line-through;"">variantRequestKey(boolean) true-Data Encryption request or both ways; false-Data Encryption response(default)</li>
       *     <li>dukptDispersionType(byte)</li> <BR>
       *           |---0x00 Data Encryption request or both ways<BR>
       *           |---0x01 Data Encryption response (default)<BR>
       *           |---0x02 Customize, use Pin Variant constant<BR>
       * </ul>
       * @return the encrypted data, null means failure
       * @since 2.x.x
       */
      @Override public byte[] calculateData(int keyId, int encryptType, int algorithmModel, byte[] data, byte[] initVec, android.os.Bundle extend) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        byte[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keyId);
          _data.writeInt(encryptType);
          _data.writeInt(algorithmModel);
          _data.writeByteArray(data);
          _data.writeByteArray(initVec);
          _Parcel.writeTypedObject(_data, extend, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_calculateData, _data, _reply, 0);
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
       * get the current KSN
       * 
       * @param index keyID(0~99)
       * @return the current dukpt ksn
       * @since 2.x.x
       */
      @Override public byte[] getDukptKsn(int keyIdx) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        byte[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keyIdx);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getDukptKsn, _data, _reply, 0);
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
       * get the last error
       * 
       * @return the description of the last error
       * @since 2.x.x
       */
      @Override public java.lang.String getLastError() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getLastError, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readString();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * get dukpt config file for debug(just support debug version service)
       * @param savePath
       * @return true-success false-failed
       * @since 2.x.x
       */
      @Override public boolean getDukptCFG(java.lang.String savePath) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(savePath);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getDukptCFG, _data, _reply, 0);
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
       * set dukpt config file
       * @param keyData
       * <ul>
       *     <li>keyId(int)</li>
       *     <li><b style="text-decoration:line-through;">ksn(String) optional, keep current value if not set</b></li> // ksn(String) parameter was removed
       *     <li>autoIncrease(boolean) optional, keep current value if not set</li>
       * </ul>
       * @return true-success false-failed
       * @since 2.6.0.0
       */
      @Override public boolean setDukptCFG(android.os.Bundle keyData) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _Parcel.writeTypedObject(_data, keyData, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setDukptCFG, _data, _reply, 0);
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
    static final int TRANSACTION_loadDukptKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_increaseKSN = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_calculateMAC = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_calculateData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_getDukptKsn = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_getLastError = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_getDukptCFG = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_setDukptCFG = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
  }
  public static final java.lang.String DESCRIPTOR = "com.vfi.smartpos.deviceservice.aidl.key_manager.IDukpt";
  /**
   * load the DUKPT key
   * 
   * @param keyId the id (index 0~99)
   * @param ksn the key serial number
   * @param key the key
   * @param checkValue the check value (default NULL)
   * @param extend - extend param
   * <ul>
   *     <li>isPlainKey(boolean) default value is true(key is plain key), value is false means the key is a encrypt key that encrypt by TEK</li>
   *     <li>TEKIndex(int) index of TEK,if isPlainKey is false, need to set this paramater</li>
   *     <li>KSNAutoIncrease(boolean) default value is true, if value is false, application use increaseKSN() to  increase KSN manually</li>
   * </ul>
   * @return true on success, false on failure
   * @since 2.x.x
   */
  public boolean loadDukptKey(int keyId, byte[] ksn, byte[] key, byte[] checkValue, android.os.Bundle extend) throws android.os.RemoteException;
  /**
   *  increase ksn
   * @param index keyID(0~99)
   * @return current ksn
   * @since 2.x.x
   */
  public byte[] increaseKSN(int index) throws android.os.RemoteException;
  /**
   * calcute the MAC with given type
   * 
   * @param keyId the index of dukpt key(0~4)
   * @param type Calculation mode <BR>
   *     |---0x00-MAC X99;<BR>
   *     |---0x01-MAC X919;<BR>
   *     |---0x02-ECB (CUP standard ECB algorithm);<BR>
   *     |---0x03-MAC 9606;<BR>
   *     |---0x04-CBC MAC calculation;<BR>
   * @param CBCInitVec - CBC initial vector. fixed length 8, can be null, default 8 bytes 0x00
   * @param data the source date
   * @param desType encrypt type<BR>
   *     |--0x00-des<BR>
   *     |--0x01-3des<BR>
   *     |--0x02-sm4<BR>
   *     |--0x03-aes<BR>
   * @param extend - extend param
   * <ul>
   *     <li>variantRequestKey(boolean) true-Message Authentication, request or both ways; false-Message Authentication, response(default)</li>
   * </ul>
   * @return the mac value, null means failure
   * @since 2.x.x
   */
  public byte[] calculateMAC(int keyId, int type, byte[] CBCInitVec, byte[] data, int desType, android.os.Bundle extend) throws android.os.RemoteException;
  /**
   * @brief encrypt data
   * @param encryptType<BR>
   *    |---TYPE_DES - 0x00 DES Type<BR>
   *    |---TYPE_3DES - 0x01 3DES Type<BR>
   *    |---TYPE_SM4 - 0x02 SM4 Type<BR>
   *    |---TYPE_AES - 0x03 AES Type<BR>
   * @param algorithmModel<BR>
   *     |--0x01 CBC encrypt<BR>
   *     |--0x02 ECB encrypt<BR>
   *     |--0x03 CBC decrypt<BR>
   *     |--0x04 ECB decrypt<BR>
   * @param data the source date
   * @param initVec cbc init vector
   * @param extend - extend param
   * <ul>
   *     <li style="text-decoration:line-through;"">variantRequestKey(boolean) true-Data Encryption request or both ways; false-Data Encryption response(default)</li>
   *     <li>dukptDispersionType(byte)</li> <BR>
   *           |---0x00 Data Encryption request or both ways<BR>
   *           |---0x01 Data Encryption response (default)<BR>
   *           |---0x02 Customize, use Pin Variant constant<BR>
   * </ul>
   * @return the encrypted data, null means failure
   * @since 2.x.x
   */
  public byte[] calculateData(int keyId, int encryptType, int algorithmModel, byte[] data, byte[] initVec, android.os.Bundle extend) throws android.os.RemoteException;
  /**
   * get the current KSN
   * 
   * @param index keyID(0~99)
   * @return the current dukpt ksn
   * @since 2.x.x
   */
  public byte[] getDukptKsn(int keyIdx) throws android.os.RemoteException;
  /**
   * get the last error
   * 
   * @return the description of the last error
   * @since 2.x.x
   */
  public java.lang.String getLastError() throws android.os.RemoteException;
  /**
   * get dukpt config file for debug(just support debug version service)
   * @param savePath
   * @return true-success false-failed
   * @since 2.x.x
   */
  public boolean getDukptCFG(java.lang.String savePath) throws android.os.RemoteException;
  /**
   * set dukpt config file
   * @param keyData
   * <ul>
   *     <li>keyId(int)</li>
   *     <li><b style="text-decoration:line-through;">ksn(String) optional, keep current value if not set</b></li> // ksn(String) parameter was removed
   *     <li>autoIncrease(boolean) optional, keep current value if not set</li>
   * </ul>
   * @return true-success false-failed
   * @since 2.6.0.0
   */
  public boolean setDukptCFG(android.os.Bundle keyData) throws android.os.RemoteException;
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
