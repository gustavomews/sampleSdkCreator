/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.vfi.smartpos.deviceservice.aidl;
/**
 * the listener while input PIN
 * @author Kai.L@verifone.cn, Chao.L@verifone.cn
 */
public interface PinInputListener extends android.os.IInterface
{
  /** Default implementation for PinInputListener. */
  public static class Default implements com.vfi.smartpos.deviceservice.aidl.PinInputListener
  {
    /**
     * on input (key press)
     * 
     * @param len the length of the PIN inputted
     * @param key the mask key
     */
    @Override public void onInput(int len, int key) throws android.os.RemoteException
    {
    }
    /**
     * on confirm the PIN
     * 
     * @param data the PIN number, null if no pin inputed
     * @param isNonePin ture if no pin inputted
     */
    @Override public void onConfirm(byte[] data, boolean isNonePin) throws android.os.RemoteException
    {
    }
    /** on cancel */
    @Override public void onCancel() throws android.os.RemoteException
    {
    }
    /**
     * on error
     * 
     * @param errorCode the error code<BR>
     * errorCode:<BR>
     * -1:input execption <BR>
     * -2:input time out <BR>
     * -3:plain text is null <BR>
     * -4:encrypt error <BR>
     * -5:cipher text is null <BR>
     * 0xff:other error <BR>
     */
    @Override public void onError(int errorCode) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.vfi.smartpos.deviceservice.aidl.PinInputListener
  {
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.vfi.smartpos.deviceservice.aidl.PinInputListener interface,
     * generating a proxy if needed.
     */
    public static com.vfi.smartpos.deviceservice.aidl.PinInputListener asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.vfi.smartpos.deviceservice.aidl.PinInputListener))) {
        return ((com.vfi.smartpos.deviceservice.aidl.PinInputListener)iin);
      }
      return new com.vfi.smartpos.deviceservice.aidl.PinInputListener.Stub.Proxy(obj);
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
        case TRANSACTION_onInput:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          this.onInput(_arg0, _arg1);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_onConfirm:
        {
          byte[] _arg0;
          _arg0 = data.createByteArray();
          boolean _arg1;
          _arg1 = (0!=data.readInt());
          this.onConfirm(_arg0, _arg1);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_onCancel:
        {
          this.onCancel();
          reply.writeNoException();
          break;
        }
        case TRANSACTION_onError:
        {
          int _arg0;
          _arg0 = data.readInt();
          this.onError(_arg0);
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
    private static class Proxy implements com.vfi.smartpos.deviceservice.aidl.PinInputListener
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
       * on input (key press)
       * 
       * @param len the length of the PIN inputted
       * @param key the mask key
       */
      @Override public void onInput(int len, int key) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(len);
          _data.writeInt(key);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onInput, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * on confirm the PIN
       * 
       * @param data the PIN number, null if no pin inputed
       * @param isNonePin ture if no pin inputted
       */
      @Override public void onConfirm(byte[] data, boolean isNonePin) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(data);
          _data.writeInt(((isNonePin)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_onConfirm, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /** on cancel */
      @Override public void onCancel() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onCancel, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * on error
       * 
       * @param errorCode the error code<BR>
       * errorCode:<BR>
       * -1:input execption <BR>
       * -2:input time out <BR>
       * -3:plain text is null <BR>
       * -4:encrypt error <BR>
       * -5:cipher text is null <BR>
       * 0xff:other error <BR>
       */
      @Override public void onError(int errorCode) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(errorCode);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onError, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
    }
    static final int TRANSACTION_onInput = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_onConfirm = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_onCancel = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_onError = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
  }
  public static final java.lang.String DESCRIPTOR = "com.vfi.smartpos.deviceservice.aidl.PinInputListener";
  /**
   * on input (key press)
   * 
   * @param len the length of the PIN inputted
   * @param key the mask key
   */
  public void onInput(int len, int key) throws android.os.RemoteException;
  /**
   * on confirm the PIN
   * 
   * @param data the PIN number, null if no pin inputed
   * @param isNonePin ture if no pin inputted
   */
  public void onConfirm(byte[] data, boolean isNonePin) throws android.os.RemoteException;
  /** on cancel */
  public void onCancel() throws android.os.RemoteException;
  /**
   * on error
   * 
   * @param errorCode the error code<BR>
   * errorCode:<BR>
   * -1:input execption <BR>
   * -2:input time out <BR>
   * -3:plain text is null <BR>
   * -4:encrypt error <BR>
   * -5:cipher text is null <BR>
   * 0xff:other error <BR>
   */
  public void onError(int errorCode) throws android.os.RemoteException;
}
