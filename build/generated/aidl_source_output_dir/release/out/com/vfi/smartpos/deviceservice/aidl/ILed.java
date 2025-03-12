/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.vfi.smartpos.deviceservice.aidl;
/**
 * the object of LED
 * @author kai.l@verifone.cn
 */
public interface ILed extends android.os.IInterface
{
  /** Default implementation for ILed. */
  public static class Default implements com.vfi.smartpos.deviceservice.aidl.ILed
  {
    /**
     * turn on the led
     * @param led
     * <ul>
     * <li> 1 - the blue</li>
     * <li> 2 - the yellow</li>
     * <li> 3 - the green</li>
     * <li> 4 - the red</li>
     * </ul>
     * @since 1.x.x
     */
    @Override public void turnOn(int led) throws android.os.RemoteException
    {
    }
    /**
     * turn off the led
     * @param led
     * <ul>
     * <li> 1 - the blue</li>
     * <li> 2 - the yellow</li>
     * <li> 3 - the green</li>
     * <li> 4 - the red</li>
     * </ul>
     * @since 1.x.x
     */
    @Override public void turnOff(int led) throws android.os.RemoteException
    {
    }
    /**
     * control led
     * @param led 0x01-blue, 0x02-green, 0x04-yellow, 0x08-red
     * @param status status 0-close 1-open
     * @since 1.x.x
     */
    @Override public void ledControl(byte led, byte status) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.vfi.smartpos.deviceservice.aidl.ILed
  {
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.vfi.smartpos.deviceservice.aidl.ILed interface,
     * generating a proxy if needed.
     */
    public static com.vfi.smartpos.deviceservice.aidl.ILed asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.vfi.smartpos.deviceservice.aidl.ILed))) {
        return ((com.vfi.smartpos.deviceservice.aidl.ILed)iin);
      }
      return new com.vfi.smartpos.deviceservice.aidl.ILed.Stub.Proxy(obj);
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
        case TRANSACTION_turnOn:
        {
          int _arg0;
          _arg0 = data.readInt();
          this.turnOn(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_turnOff:
        {
          int _arg0;
          _arg0 = data.readInt();
          this.turnOff(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_ledControl:
        {
          byte _arg0;
          _arg0 = data.readByte();
          byte _arg1;
          _arg1 = data.readByte();
          this.ledControl(_arg0, _arg1);
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
    private static class Proxy implements com.vfi.smartpos.deviceservice.aidl.ILed
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
       * turn on the led
       * @param led
       * <ul>
       * <li> 1 - the blue</li>
       * <li> 2 - the yellow</li>
       * <li> 3 - the green</li>
       * <li> 4 - the red</li>
       * </ul>
       * @since 1.x.x
       */
      @Override public void turnOn(int led) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(led);
          boolean _status = mRemote.transact(Stub.TRANSACTION_turnOn, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * turn off the led
       * @param led
       * <ul>
       * <li> 1 - the blue</li>
       * <li> 2 - the yellow</li>
       * <li> 3 - the green</li>
       * <li> 4 - the red</li>
       * </ul>
       * @since 1.x.x
       */
      @Override public void turnOff(int led) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(led);
          boolean _status = mRemote.transact(Stub.TRANSACTION_turnOff, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * control led
       * @param led 0x01-blue, 0x02-green, 0x04-yellow, 0x08-red
       * @param status status 0-close 1-open
       * @since 1.x.x
       */
      @Override public void ledControl(byte led, byte status) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByte(led);
          _data.writeByte(status);
          boolean _status = mRemote.transact(Stub.TRANSACTION_ledControl, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
    }
    static final int TRANSACTION_turnOn = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_turnOff = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_ledControl = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
  }
  public static final java.lang.String DESCRIPTOR = "com.vfi.smartpos.deviceservice.aidl.ILed";
  /**
   * turn on the led
   * @param led
   * <ul>
   * <li> 1 - the blue</li>
   * <li> 2 - the yellow</li>
   * <li> 3 - the green</li>
   * <li> 4 - the red</li>
   * </ul>
   * @since 1.x.x
   */
  public void turnOn(int led) throws android.os.RemoteException;
  /**
   * turn off the led
   * @param led
   * <ul>
   * <li> 1 - the blue</li>
   * <li> 2 - the yellow</li>
   * <li> 3 - the green</li>
   * <li> 4 - the red</li>
   * </ul>
   * @since 1.x.x
   */
  public void turnOff(int led) throws android.os.RemoteException;
  /**
   * control led
   * @param led 0x01-blue, 0x02-green, 0x04-yellow, 0x08-red
   * @param status status 0-close 1-open
   * @since 1.x.x
   */
  public void ledControl(byte led, byte status) throws android.os.RemoteException;
}
