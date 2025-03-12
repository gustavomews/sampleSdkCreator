/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.vfi.smartpos.deviceservice.aidl.key_manager;
/**
 * Created by RuoYi
 * @since >= 3.x.x
 */
public interface IRSA extends android.os.IInterface
{
  /** Default implementation for IRSA. */
  public static class Default implements com.vfi.smartpos.deviceservice.aidl.key_manager.IRSA
  {
    /**
     * generate RSA Key Pair
     * 
     * @param params parameters (list)
     * <ul>
     * <li>keyIndex(int) (0~99) index of saved RSA key pair</li>
     * <li>keyLength(int) length of the key(only support 1024(default) and 2048)</li>
     * <li>returnPublicKeyFormat(int) 0 - PEM format  1 - DER format(default) 2 - Private format( Format {'modulus':'xxxxx','exponent':'xxxxx'} )</li>
     * </ul>
     * 
     * @return result
     * <ul>
     * <li>isSuccess(boolean) true - success ; false - failed</li>
     * <li>publicKey(byte[]) public key data (1 - DER format);   Example code: result.getByteArray("publicKey");</li>
     * <li>publicKey(String) public key data (0 - PEM format(Base64) or 2 - private format);    Example code: result.getString("publicKey");</li>
     * </ul>
     * 
     * @since 3.x.x
     */
    @Override public android.os.Bundle generateRSAKeyPair(android.os.Bundle params) throws android.os.RemoteException
    {
      return null;
    }
    /**
     * Encrypting data with RSA algorithm
     * 
     * @param params parameters (list)
     * <ul>
     * <li>keyIndex(int) (0~99) index of RSA key</li>
     * <li>data(byte[]) Encrypt data</li>
     * <li>paddingType(String) Support padding type is NoPadding/PKCS1Padding/OAEPPadding  , default use PKCS1Padding</li>
     * </ul>
     * 
     * @return result
     * <ul>
     * <li>isSuccess(boolean) true - success ; false - failed</li>
     * <li>encryptedData(byte[]) Encrypted data</li>
     * </ul>
     * 
     * @since 3.x.x
     */
    @Override public android.os.Bundle RSAEncryption(android.os.Bundle params) throws android.os.RemoteException
    {
      return null;
    }
    /**
     * Decrypting data with RSA algorithm
     * 
     * @param params parameters (list)
     * <ul>
     * <li>keyIndex(int) (0~99) index of RSA key</li>
     * <li>encryptedData(byte[]) Encrypted data</li>
     * <li>paddingType(String) Support padding type is NoPadding/PKCS1Padding , default use PKCS1Padding  Note:OAEPPadding not support</li>
     * </ul>
     * 
     * @return result
     * <ul>
     * <li>isSuccess(boolean) true - success ; false - failed</li>
     * <li>data(byte[]) decrypted data</li>
     * </ul>
     * 
     * @since 3.x.x
     */
    @Override public android.os.Bundle RSADecryption(android.os.Bundle params) throws android.os.RemoteException
    {
      return null;
    }
    /**
     * Delete RSA key
     * 
     * @param params parameters (list)
     * <ul>
     * <li>keyIndex(int) (0~99) index of RSA key</li>
     * </ul>
     * 
     * @return (boolean)  true - delete success; false - delete failed
     * 
     * @since 3.x.x
     */
    @Override public boolean deleteRSAKey(android.os.Bundle params) throws android.os.RemoteException
    {
      return false;
    }
    /**
     * Get RSA Public key
     * 
     * @param params parameters (list)
     * <ul>
     * <li>keyIndex(int) (0~99) index of RSA key</li>
     * <li>returnPublicKeyFormat(int) 0 - PEM format  1 - DER format(default) 2 - Private format( Format {'modulus':'xxxxx','exponent':'xxxxx'} )</li>
     * </ul>
     * 
     * @return result
     * <ul>
     * <li>isSuccess(boolean) true - success ; false - failed</li>
     * <li>publicKey(byte[]) public key data (1 - DER format)</li>
     * <li>publicKey(String) public key data (0 - PEM format(Base64) or 2 - private format)</li>
     * </ul>
     * 
     * @since 3.x.x
     */
    @Override public android.os.Bundle getPublicKey(android.os.Bundle params) throws android.os.RemoteException
    {
      return null;
    }
    /**
     * Save RSA Public key
     * 
     * @param params parameters (list)
     * <ul>
     * <li>keyIndex(int) (0~99) index of RSA key</li>
     * <li>modulus(String) Hex format RSA public key modulus</li>
     * <li>exponent(String) Hex format RSA public key exponent</li>
     * </ul>
     * 
     * @return (boolean)  true - save success; false - save failed
     * 
     * @since 3.x.x
     */
    @Override public boolean savePublicKey(android.os.Bundle params) throws android.os.RemoteException
    {
      return false;
    }
    /**
     * Save RSA Private key
     * 
     * @param params parameters (list)
     * <ul>
     * <li>keyIndex(int) (0~99) index of RSA key</li>
     * <li>modulus(String) Hex format RSA public key modulus</li>
     * <li>publicExponent(String) Hex format RSA public key exponent</li>
     * <li>privateExponent(String) Hex format RSA private key exponent</li>
     * <li>prime1(String) Hex format RSA private key prime1</li>
     * <li>prime2(String) Hex format RSA private key prime2</li>
     * <li>exponent1(String) Hex format RSA private key exponent1</li>
     * <li>exponent2(String) Hex format RSA private key exponent2</li>
     * <li>coefficient(String) Hex format RSA private key coefficient</li>
     * </ul>
     * 
     * @return (boolean)  true - save success; false - save failed
     * 
     * @since 3.x.x
     */
    @Override public boolean savePrivateKey(android.os.Bundle params) throws android.os.RemoteException
    {
      return false;
    }
    /**
     * Signing data with RSA algorithm
     * 
     * @param params parameters (list)
     * <ul>
     * <li>keyIndex(int) (0~99) index of RSA key</li>
     * <li>keyLength(int) length of the key(only support 1024(default) and 2048)</li>
     * <li>hashAlgorithm(String) support algorithms  MD5/SHA1/SHA224/SHA256/SHA384/SHA512 default is SHA1</li>
     * <li>isHashData(Boolean) true - payment application calculate hash (Note: android aidl max parameter length limit is 1Mbit) ;  false - this interface will calculate hash ;   default false</li>
     * <li>data(byte[]) sign data</li>
     * </ul>
     * 
     * @return result
     * <ul>
     * <li>isSuccess(boolean) true - success ; false - failed</li>
     * <li>signature(byte[]) signature</li>
     * </ul>
     * 
     * @since 3.x.x
     */
    @Override public android.os.Bundle RSASign(android.os.Bundle params) throws android.os.RemoteException
    {
      return null;
    }
    /**
     * verify data with RSA algorithm
     * 
     * @param params parameters (list)
     * <ul>
     * <li>keyIndex(int) (0~99) index of RSA key</li>
     * <li>hashAlgorithm(String) support algorithms  MD5/SHA1/SHA224/SHA256/SHA384/SHA512 default is SHA1</li>
     * <li>data(byte[]) data  Note: data limit is 1 Mbit, if over this limit please do RSA Verify in application</li>
     * <li>signature(byte[]) signature</li>
     * </ul>
     * 
     * @return result
     * <ul>
     * <li>isSuccess(boolean) true - verify success ; false - verify failed</li>
     * </ul>
     * 
     * @since 3.x.x
     */
    @Override public android.os.Bundle RSAVerify(android.os.Bundle params) throws android.os.RemoteException
    {
      return null;
    }
    /**
     * Check if exist key
     * 
     * @param params parameters (list)
     * <ul>
     * <li>keyIndex(int) (0~99) index of RSA key</li>
     * <li>keyType(int) 0 - check RSA public key  ;  1 - check RSA private key (Not support)  default is 0</li>
     * </ul>
     * 
     * @return result
     * <ul>
     * <li>isSuccess(boolean) true - exist ; false - not exist</li>
     * </ul>
     * 
     * @since 3.x.x
     */
    @Override public boolean isKeyExist(android.os.Bundle params) throws android.os.RemoteException
    {
      return false;
    }
    /**
     * Save Certification
     * 
     * @param params parameters (list)
     * <ul>
     * <li>keyIndex(int) (0~99) index of Certification RSA public key</li>
     * <li>data(byte[]) certification data, Code example: x509Certificate.getEncoded() </li>
     * </ul>
     * 
     * @return result
     * <ul>
     * <li>isSuccess(boolean) true - success ; false - failed</li>
     * </ul>
     * 
     * @since 3.x.x
     */
    @Override public boolean saveCertificate(android.os.Bundle params) throws android.os.RemoteException
    {
      return false;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.vfi.smartpos.deviceservice.aidl.key_manager.IRSA
  {
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.vfi.smartpos.deviceservice.aidl.key_manager.IRSA interface,
     * generating a proxy if needed.
     */
    public static com.vfi.smartpos.deviceservice.aidl.key_manager.IRSA asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.vfi.smartpos.deviceservice.aidl.key_manager.IRSA))) {
        return ((com.vfi.smartpos.deviceservice.aidl.key_manager.IRSA)iin);
      }
      return new com.vfi.smartpos.deviceservice.aidl.key_manager.IRSA.Stub.Proxy(obj);
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
        case TRANSACTION_generateRSAKeyPair:
        {
          android.os.Bundle _arg0;
          _arg0 = _Parcel.readTypedObject(data, android.os.Bundle.CREATOR);
          android.os.Bundle _result = this.generateRSAKeyPair(_arg0);
          reply.writeNoException();
          _Parcel.writeTypedObject(reply, _result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          break;
        }
        case TRANSACTION_RSAEncryption:
        {
          android.os.Bundle _arg0;
          _arg0 = _Parcel.readTypedObject(data, android.os.Bundle.CREATOR);
          android.os.Bundle _result = this.RSAEncryption(_arg0);
          reply.writeNoException();
          _Parcel.writeTypedObject(reply, _result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          break;
        }
        case TRANSACTION_RSADecryption:
        {
          android.os.Bundle _arg0;
          _arg0 = _Parcel.readTypedObject(data, android.os.Bundle.CREATOR);
          android.os.Bundle _result = this.RSADecryption(_arg0);
          reply.writeNoException();
          _Parcel.writeTypedObject(reply, _result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          break;
        }
        case TRANSACTION_deleteRSAKey:
        {
          android.os.Bundle _arg0;
          _arg0 = _Parcel.readTypedObject(data, android.os.Bundle.CREATOR);
          boolean _result = this.deleteRSAKey(_arg0);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        case TRANSACTION_getPublicKey:
        {
          android.os.Bundle _arg0;
          _arg0 = _Parcel.readTypedObject(data, android.os.Bundle.CREATOR);
          android.os.Bundle _result = this.getPublicKey(_arg0);
          reply.writeNoException();
          _Parcel.writeTypedObject(reply, _result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          break;
        }
        case TRANSACTION_savePublicKey:
        {
          android.os.Bundle _arg0;
          _arg0 = _Parcel.readTypedObject(data, android.os.Bundle.CREATOR);
          boolean _result = this.savePublicKey(_arg0);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        case TRANSACTION_savePrivateKey:
        {
          android.os.Bundle _arg0;
          _arg0 = _Parcel.readTypedObject(data, android.os.Bundle.CREATOR);
          boolean _result = this.savePrivateKey(_arg0);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        case TRANSACTION_RSASign:
        {
          android.os.Bundle _arg0;
          _arg0 = _Parcel.readTypedObject(data, android.os.Bundle.CREATOR);
          android.os.Bundle _result = this.RSASign(_arg0);
          reply.writeNoException();
          _Parcel.writeTypedObject(reply, _result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          break;
        }
        case TRANSACTION_RSAVerify:
        {
          android.os.Bundle _arg0;
          _arg0 = _Parcel.readTypedObject(data, android.os.Bundle.CREATOR);
          android.os.Bundle _result = this.RSAVerify(_arg0);
          reply.writeNoException();
          _Parcel.writeTypedObject(reply, _result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          break;
        }
        case TRANSACTION_isKeyExist:
        {
          android.os.Bundle _arg0;
          _arg0 = _Parcel.readTypedObject(data, android.os.Bundle.CREATOR);
          boolean _result = this.isKeyExist(_arg0);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        case TRANSACTION_saveCertificate:
        {
          android.os.Bundle _arg0;
          _arg0 = _Parcel.readTypedObject(data, android.os.Bundle.CREATOR);
          boolean _result = this.saveCertificate(_arg0);
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
    private static class Proxy implements com.vfi.smartpos.deviceservice.aidl.key_manager.IRSA
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
       * generate RSA Key Pair
       * 
       * @param params parameters (list)
       * <ul>
       * <li>keyIndex(int) (0~99) index of saved RSA key pair</li>
       * <li>keyLength(int) length of the key(only support 1024(default) and 2048)</li>
       * <li>returnPublicKeyFormat(int) 0 - PEM format  1 - DER format(default) 2 - Private format( Format {'modulus':'xxxxx','exponent':'xxxxx'} )</li>
       * </ul>
       * 
       * @return result
       * <ul>
       * <li>isSuccess(boolean) true - success ; false - failed</li>
       * <li>publicKey(byte[]) public key data (1 - DER format);   Example code: result.getByteArray("publicKey");</li>
       * <li>publicKey(String) public key data (0 - PEM format(Base64) or 2 - private format);    Example code: result.getString("publicKey");</li>
       * </ul>
       * 
       * @since 3.x.x
       */
      @Override public android.os.Bundle generateRSAKeyPair(android.os.Bundle params) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.os.Bundle _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _Parcel.writeTypedObject(_data, params, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_generateRSAKeyPair, _data, _reply, 0);
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
       * Encrypting data with RSA algorithm
       * 
       * @param params parameters (list)
       * <ul>
       * <li>keyIndex(int) (0~99) index of RSA key</li>
       * <li>data(byte[]) Encrypt data</li>
       * <li>paddingType(String) Support padding type is NoPadding/PKCS1Padding/OAEPPadding  , default use PKCS1Padding</li>
       * </ul>
       * 
       * @return result
       * <ul>
       * <li>isSuccess(boolean) true - success ; false - failed</li>
       * <li>encryptedData(byte[]) Encrypted data</li>
       * </ul>
       * 
       * @since 3.x.x
       */
      @Override public android.os.Bundle RSAEncryption(android.os.Bundle params) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.os.Bundle _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _Parcel.writeTypedObject(_data, params, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_RSAEncryption, _data, _reply, 0);
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
       * Decrypting data with RSA algorithm
       * 
       * @param params parameters (list)
       * <ul>
       * <li>keyIndex(int) (0~99) index of RSA key</li>
       * <li>encryptedData(byte[]) Encrypted data</li>
       * <li>paddingType(String) Support padding type is NoPadding/PKCS1Padding , default use PKCS1Padding  Note:OAEPPadding not support</li>
       * </ul>
       * 
       * @return result
       * <ul>
       * <li>isSuccess(boolean) true - success ; false - failed</li>
       * <li>data(byte[]) decrypted data</li>
       * </ul>
       * 
       * @since 3.x.x
       */
      @Override public android.os.Bundle RSADecryption(android.os.Bundle params) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.os.Bundle _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _Parcel.writeTypedObject(_data, params, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_RSADecryption, _data, _reply, 0);
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
       * Delete RSA key
       * 
       * @param params parameters (list)
       * <ul>
       * <li>keyIndex(int) (0~99) index of RSA key</li>
       * </ul>
       * 
       * @return (boolean)  true - delete success; false - delete failed
       * 
       * @since 3.x.x
       */
      @Override public boolean deleteRSAKey(android.os.Bundle params) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _Parcel.writeTypedObject(_data, params, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_deleteRSAKey, _data, _reply, 0);
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
       * Get RSA Public key
       * 
       * @param params parameters (list)
       * <ul>
       * <li>keyIndex(int) (0~99) index of RSA key</li>
       * <li>returnPublicKeyFormat(int) 0 - PEM format  1 - DER format(default) 2 - Private format( Format {'modulus':'xxxxx','exponent':'xxxxx'} )</li>
       * </ul>
       * 
       * @return result
       * <ul>
       * <li>isSuccess(boolean) true - success ; false - failed</li>
       * <li>publicKey(byte[]) public key data (1 - DER format)</li>
       * <li>publicKey(String) public key data (0 - PEM format(Base64) or 2 - private format)</li>
       * </ul>
       * 
       * @since 3.x.x
       */
      @Override public android.os.Bundle getPublicKey(android.os.Bundle params) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.os.Bundle _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _Parcel.writeTypedObject(_data, params, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getPublicKey, _data, _reply, 0);
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
       * Save RSA Public key
       * 
       * @param params parameters (list)
       * <ul>
       * <li>keyIndex(int) (0~99) index of RSA key</li>
       * <li>modulus(String) Hex format RSA public key modulus</li>
       * <li>exponent(String) Hex format RSA public key exponent</li>
       * </ul>
       * 
       * @return (boolean)  true - save success; false - save failed
       * 
       * @since 3.x.x
       */
      @Override public boolean savePublicKey(android.os.Bundle params) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _Parcel.writeTypedObject(_data, params, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_savePublicKey, _data, _reply, 0);
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
       * Save RSA Private key
       * 
       * @param params parameters (list)
       * <ul>
       * <li>keyIndex(int) (0~99) index of RSA key</li>
       * <li>modulus(String) Hex format RSA public key modulus</li>
       * <li>publicExponent(String) Hex format RSA public key exponent</li>
       * <li>privateExponent(String) Hex format RSA private key exponent</li>
       * <li>prime1(String) Hex format RSA private key prime1</li>
       * <li>prime2(String) Hex format RSA private key prime2</li>
       * <li>exponent1(String) Hex format RSA private key exponent1</li>
       * <li>exponent2(String) Hex format RSA private key exponent2</li>
       * <li>coefficient(String) Hex format RSA private key coefficient</li>
       * </ul>
       * 
       * @return (boolean)  true - save success; false - save failed
       * 
       * @since 3.x.x
       */
      @Override public boolean savePrivateKey(android.os.Bundle params) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _Parcel.writeTypedObject(_data, params, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_savePrivateKey, _data, _reply, 0);
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
       * Signing data with RSA algorithm
       * 
       * @param params parameters (list)
       * <ul>
       * <li>keyIndex(int) (0~99) index of RSA key</li>
       * <li>keyLength(int) length of the key(only support 1024(default) and 2048)</li>
       * <li>hashAlgorithm(String) support algorithms  MD5/SHA1/SHA224/SHA256/SHA384/SHA512 default is SHA1</li>
       * <li>isHashData(Boolean) true - payment application calculate hash (Note: android aidl max parameter length limit is 1Mbit) ;  false - this interface will calculate hash ;   default false</li>
       * <li>data(byte[]) sign data</li>
       * </ul>
       * 
       * @return result
       * <ul>
       * <li>isSuccess(boolean) true - success ; false - failed</li>
       * <li>signature(byte[]) signature</li>
       * </ul>
       * 
       * @since 3.x.x
       */
      @Override public android.os.Bundle RSASign(android.os.Bundle params) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.os.Bundle _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _Parcel.writeTypedObject(_data, params, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_RSASign, _data, _reply, 0);
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
       * verify data with RSA algorithm
       * 
       * @param params parameters (list)
       * <ul>
       * <li>keyIndex(int) (0~99) index of RSA key</li>
       * <li>hashAlgorithm(String) support algorithms  MD5/SHA1/SHA224/SHA256/SHA384/SHA512 default is SHA1</li>
       * <li>data(byte[]) data  Note: data limit is 1 Mbit, if over this limit please do RSA Verify in application</li>
       * <li>signature(byte[]) signature</li>
       * </ul>
       * 
       * @return result
       * <ul>
       * <li>isSuccess(boolean) true - verify success ; false - verify failed</li>
       * </ul>
       * 
       * @since 3.x.x
       */
      @Override public android.os.Bundle RSAVerify(android.os.Bundle params) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.os.Bundle _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _Parcel.writeTypedObject(_data, params, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_RSAVerify, _data, _reply, 0);
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
       * Check if exist key
       * 
       * @param params parameters (list)
       * <ul>
       * <li>keyIndex(int) (0~99) index of RSA key</li>
       * <li>keyType(int) 0 - check RSA public key  ;  1 - check RSA private key (Not support)  default is 0</li>
       * </ul>
       * 
       * @return result
       * <ul>
       * <li>isSuccess(boolean) true - exist ; false - not exist</li>
       * </ul>
       * 
       * @since 3.x.x
       */
      @Override public boolean isKeyExist(android.os.Bundle params) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _Parcel.writeTypedObject(_data, params, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_isKeyExist, _data, _reply, 0);
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
       * Save Certification
       * 
       * @param params parameters (list)
       * <ul>
       * <li>keyIndex(int) (0~99) index of Certification RSA public key</li>
       * <li>data(byte[]) certification data, Code example: x509Certificate.getEncoded() </li>
       * </ul>
       * 
       * @return result
       * <ul>
       * <li>isSuccess(boolean) true - success ; false - failed</li>
       * </ul>
       * 
       * @since 3.x.x
       */
      @Override public boolean saveCertificate(android.os.Bundle params) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _Parcel.writeTypedObject(_data, params, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_saveCertificate, _data, _reply, 0);
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
    static final int TRANSACTION_generateRSAKeyPair = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_RSAEncryption = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_RSADecryption = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_deleteRSAKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_getPublicKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_savePublicKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_savePrivateKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_RSASign = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_RSAVerify = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    static final int TRANSACTION_isKeyExist = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
    static final int TRANSACTION_saveCertificate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
  }
  public static final java.lang.String DESCRIPTOR = "com.vfi.smartpos.deviceservice.aidl.key_manager.IRSA";
  /**
   * generate RSA Key Pair
   * 
   * @param params parameters (list)
   * <ul>
   * <li>keyIndex(int) (0~99) index of saved RSA key pair</li>
   * <li>keyLength(int) length of the key(only support 1024(default) and 2048)</li>
   * <li>returnPublicKeyFormat(int) 0 - PEM format  1 - DER format(default) 2 - Private format( Format {'modulus':'xxxxx','exponent':'xxxxx'} )</li>
   * </ul>
   * 
   * @return result
   * <ul>
   * <li>isSuccess(boolean) true - success ; false - failed</li>
   * <li>publicKey(byte[]) public key data (1 - DER format);   Example code: result.getByteArray("publicKey");</li>
   * <li>publicKey(String) public key data (0 - PEM format(Base64) or 2 - private format);    Example code: result.getString("publicKey");</li>
   * </ul>
   * 
   * @since 3.x.x
   */
  public android.os.Bundle generateRSAKeyPair(android.os.Bundle params) throws android.os.RemoteException;
  /**
   * Encrypting data with RSA algorithm
   * 
   * @param params parameters (list)
   * <ul>
   * <li>keyIndex(int) (0~99) index of RSA key</li>
   * <li>data(byte[]) Encrypt data</li>
   * <li>paddingType(String) Support padding type is NoPadding/PKCS1Padding/OAEPPadding  , default use PKCS1Padding</li>
   * </ul>
   * 
   * @return result
   * <ul>
   * <li>isSuccess(boolean) true - success ; false - failed</li>
   * <li>encryptedData(byte[]) Encrypted data</li>
   * </ul>
   * 
   * @since 3.x.x
   */
  public android.os.Bundle RSAEncryption(android.os.Bundle params) throws android.os.RemoteException;
  /**
   * Decrypting data with RSA algorithm
   * 
   * @param params parameters (list)
   * <ul>
   * <li>keyIndex(int) (0~99) index of RSA key</li>
   * <li>encryptedData(byte[]) Encrypted data</li>
   * <li>paddingType(String) Support padding type is NoPadding/PKCS1Padding , default use PKCS1Padding  Note:OAEPPadding not support</li>
   * </ul>
   * 
   * @return result
   * <ul>
   * <li>isSuccess(boolean) true - success ; false - failed</li>
   * <li>data(byte[]) decrypted data</li>
   * </ul>
   * 
   * @since 3.x.x
   */
  public android.os.Bundle RSADecryption(android.os.Bundle params) throws android.os.RemoteException;
  /**
   * Delete RSA key
   * 
   * @param params parameters (list)
   * <ul>
   * <li>keyIndex(int) (0~99) index of RSA key</li>
   * </ul>
   * 
   * @return (boolean)  true - delete success; false - delete failed
   * 
   * @since 3.x.x
   */
  public boolean deleteRSAKey(android.os.Bundle params) throws android.os.RemoteException;
  /**
   * Get RSA Public key
   * 
   * @param params parameters (list)
   * <ul>
   * <li>keyIndex(int) (0~99) index of RSA key</li>
   * <li>returnPublicKeyFormat(int) 0 - PEM format  1 - DER format(default) 2 - Private format( Format {'modulus':'xxxxx','exponent':'xxxxx'} )</li>
   * </ul>
   * 
   * @return result
   * <ul>
   * <li>isSuccess(boolean) true - success ; false - failed</li>
   * <li>publicKey(byte[]) public key data (1 - DER format)</li>
   * <li>publicKey(String) public key data (0 - PEM format(Base64) or 2 - private format)</li>
   * </ul>
   * 
   * @since 3.x.x
   */
  public android.os.Bundle getPublicKey(android.os.Bundle params) throws android.os.RemoteException;
  /**
   * Save RSA Public key
   * 
   * @param params parameters (list)
   * <ul>
   * <li>keyIndex(int) (0~99) index of RSA key</li>
   * <li>modulus(String) Hex format RSA public key modulus</li>
   * <li>exponent(String) Hex format RSA public key exponent</li>
   * </ul>
   * 
   * @return (boolean)  true - save success; false - save failed
   * 
   * @since 3.x.x
   */
  public boolean savePublicKey(android.os.Bundle params) throws android.os.RemoteException;
  /**
   * Save RSA Private key
   * 
   * @param params parameters (list)
   * <ul>
   * <li>keyIndex(int) (0~99) index of RSA key</li>
   * <li>modulus(String) Hex format RSA public key modulus</li>
   * <li>publicExponent(String) Hex format RSA public key exponent</li>
   * <li>privateExponent(String) Hex format RSA private key exponent</li>
   * <li>prime1(String) Hex format RSA private key prime1</li>
   * <li>prime2(String) Hex format RSA private key prime2</li>
   * <li>exponent1(String) Hex format RSA private key exponent1</li>
   * <li>exponent2(String) Hex format RSA private key exponent2</li>
   * <li>coefficient(String) Hex format RSA private key coefficient</li>
   * </ul>
   * 
   * @return (boolean)  true - save success; false - save failed
   * 
   * @since 3.x.x
   */
  public boolean savePrivateKey(android.os.Bundle params) throws android.os.RemoteException;
  /**
   * Signing data with RSA algorithm
   * 
   * @param params parameters (list)
   * <ul>
   * <li>keyIndex(int) (0~99) index of RSA key</li>
   * <li>keyLength(int) length of the key(only support 1024(default) and 2048)</li>
   * <li>hashAlgorithm(String) support algorithms  MD5/SHA1/SHA224/SHA256/SHA384/SHA512 default is SHA1</li>
   * <li>isHashData(Boolean) true - payment application calculate hash (Note: android aidl max parameter length limit is 1Mbit) ;  false - this interface will calculate hash ;   default false</li>
   * <li>data(byte[]) sign data</li>
   * </ul>
   * 
   * @return result
   * <ul>
   * <li>isSuccess(boolean) true - success ; false - failed</li>
   * <li>signature(byte[]) signature</li>
   * </ul>
   * 
   * @since 3.x.x
   */
  public android.os.Bundle RSASign(android.os.Bundle params) throws android.os.RemoteException;
  /**
   * verify data with RSA algorithm
   * 
   * @param params parameters (list)
   * <ul>
   * <li>keyIndex(int) (0~99) index of RSA key</li>
   * <li>hashAlgorithm(String) support algorithms  MD5/SHA1/SHA224/SHA256/SHA384/SHA512 default is SHA1</li>
   * <li>data(byte[]) data  Note: data limit is 1 Mbit, if over this limit please do RSA Verify in application</li>
   * <li>signature(byte[]) signature</li>
   * </ul>
   * 
   * @return result
   * <ul>
   * <li>isSuccess(boolean) true - verify success ; false - verify failed</li>
   * </ul>
   * 
   * @since 3.x.x
   */
  public android.os.Bundle RSAVerify(android.os.Bundle params) throws android.os.RemoteException;
  /**
   * Check if exist key
   * 
   * @param params parameters (list)
   * <ul>
   * <li>keyIndex(int) (0~99) index of RSA key</li>
   * <li>keyType(int) 0 - check RSA public key  ;  1 - check RSA private key (Not support)  default is 0</li>
   * </ul>
   * 
   * @return result
   * <ul>
   * <li>isSuccess(boolean) true - exist ; false - not exist</li>
   * </ul>
   * 
   * @since 3.x.x
   */
  public boolean isKeyExist(android.os.Bundle params) throws android.os.RemoteException;
  /**
   * Save Certification
   * 
   * @param params parameters (list)
   * <ul>
   * <li>keyIndex(int) (0~99) index of Certification RSA public key</li>
   * <li>data(byte[]) certification data, Code example: x509Certificate.getEncoded() </li>
   * </ul>
   * 
   * @return result
   * <ul>
   * <li>isSuccess(boolean) true - success ; false - failed</li>
   * </ul>
   * 
   * @since 3.x.x
   */
  public boolean saveCertificate(android.os.Bundle params) throws android.os.RemoteException;
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
