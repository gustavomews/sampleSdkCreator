/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.vfi.smartpos.deviceservice.aidl;
/** <p> Device service, get each service interface (object) in this interface */
public interface IDeviceService extends android.os.IInterface
{
  /** Default implementation for IDeviceService. */
  public static class Default implements com.vfi.smartpos.deviceservice.aidl.IDeviceService
  {
    /**
     * <p> get the IBeeper interface object for Beeper.
     * 
     * @return {@link com.vfi.smartpos.deviceservice.aidl.IBeeper}
     * @since 1.x.x
     */
    @Override public com.vfi.smartpos.deviceservice.aidl.IBeeper getBeeper() throws android.os.RemoteException
    {
      return null;
    }
    /**
     * <p> get the ILed interface object for Led.
     * 
     * @return {@link com.vfi.smartpos.deviceservice.aidl.ILed}
     * @since 1.x.x
     */
    @Override public com.vfi.smartpos.deviceservice.aidl.ILed getLed() throws android.os.RemoteException
    {
      return null;
    }
    /**
     * <p> get the ISerialPort interface object for Serial Port.
     * 
     * @param {@code String} deviceType
     * <p> the key of deviceType param is as follow:
     * <ul>
     *   <li>"rs232"(description:the port via build in serial chip micro USB cable (one side is micro USB connect to terminal, another side is 9 pin interface connect to COM port in PC.))</li>
     *   <li>"usb-rs232"(description:the port via micro USB cable）</li>
     * </ul>
     * 
     * <p>special device type</p>
     * <ul>
     *   <li><B>Type1:</B>set VID (and PID) directly or only VID, such as "usb2rs232-11CA-0204", "usb2rs232-11CA".
     *   <li>"usb2rs232-VF-RS232"(same as "usb2rs232-11CA-0204"), (description:definied in @{link com.verifone.smartpos.devicemanager.util.SerialPortChart.VF_RS232})</li>
     *   <li>"usb2rs232-VF-V34Modem"(same as "usb2rs232-11CA-0205"), (description:definied in @{link com.verifone.smartpos.devicemanager.util.SerialPortChart.VF_V34Modem})</li>
     *   <li>"usb2rs232-VF-C680DongleModem"(same as "usb2rs232-11CA-0240"), (description:definied in @{link com.verifone.smartpos.devicemanager.util.SerialPortChart.VF_C680DongleModem})</li>
     *   <li>"usb2rs232-Z-TEK"(same as "usb2rs232-0403-6001"), (description:definied in @{link com.verifone.smartpos.devicemanager.util.SerialPortChart.Z_TEK})</li>
     * </ul>
     * 
     * <p>For given driver ftdi, cdc, ch34, cp21, proli to load a device</P>
     * <ul>
     *   <li><B>type2:</B> usb2rs232-VIP-PID-Driver</li>
     *   <li>usb2rs232-0403-6001-ftdi</li>
     * </ul>
     * 
     * <p>For given slot to load a device in case of there're same Devices attached</p>
     * <ul>
     *   <li><B>Type3:</B> Slot started from 0</li>
     *   <li>usb2rs232-VIP-PID-Slot</li>
     *   <li>usb2rs232-VIP-PID-Driver-Slot</li>
     *   <li>usb2rs232-11CA-0204-1</li>
     *   <li>usb2rs232-0403-6001-ftdi-1</li>
     * </ul>
     * 
     * <p>For given Production Name to load a device in case of there're same (VID, PID) Devices attached</p>
     * <ul>
     *   <li><B>Type4:</B> Such as Verifone RS232 devices: VeriFone USB to UART Bridge, VeriFone USB to UART Dongle, VeriFone USB UART</li>
     *   <li>usb2rs232-VIP-PID-ProdName</li>
     *   <li>usb2rs232-VIP-PID-Driver-ProdName</li>
     *   <li>usb2rs232-11CA-0204-Bridge</li>
     *   <li>usb2rs232-11CA-0204-Dongle</li>
     * </ul>
     * 
     * <p>For given Name of port on terminal's pedestal</p>
     * <ul>
     *   <li><B>Type5:</B> There are 2 serial ports on terminal with pedestal</li>
     *   <li>pedestal-rs232</li>
     *   <li>pedestal-pinpad</li>
     * </ul>
     * 
     * <p>For given Name of port on wireless base</p>
     * <ul>
     *   <li><B>Type6:</B> There are 2 serial ports on wireless base</li>
     *   <li>wireless-rs232</li>
     *   <li>wireless-pinpad</li>
     * </ul>
     * 
     * @return {@link com.vfi.smartpos.deviceservice.aidl.ISerialPort}
     * @since 1.x.x
     */
    @Override public com.vfi.smartpos.deviceservice.aidl.ISerialPort getSerialPort(java.lang.String deviceType) throws android.os.RemoteException
    {
      return null;
    }
    /**
     * <p> get the IScanner interface object for scanner
     * 
     * @param cameraId 1:set front scanner, 0:set rear scanner
     * @return {@link com.vfi.smartpos.deviceservice.aidl.IScanner}
     * @since 1.x.x
     */
    @Override public com.vfi.smartpos.deviceservice.aidl.IScanner getScanner(int cameraId) throws android.os.RemoteException
    {
      return null;
    }
    /**
     * <p> get the IMagCardReader interface object for magnetic card reader
     * 
     * @return {@link com.vfi.smartpos.deviceservice.aidl.IMagCardReader}
     * @since 1.x.x
     */
    @Override public com.vfi.smartpos.deviceservice.aidl.IMagCardReader getMagCardReader() throws android.os.RemoteException
    {
      return null;
    }
    /**
     * <p> get the IInsertCardReader interface object for smart card and PSAM card
     * 
     * @param slotNo slotNo value as follow:
     * <ul>
     *     <li>{@code 0}:IC card slot</li>
     *     <li>{@code 1}:SAM1 card slot</li>
     *     <li>{@code 2}:SAM2 card slot</li>
     * </ul>
     * @return {@link com.vfi.smartpos.deviceservice.aidl.IInsertCardReader}
     * @since 1.x.x
     */
    @Override public com.vfi.smartpos.deviceservice.aidl.IInsertCardReader getInsertCardReader(int slotNo) throws android.os.RemoteException
    {
      return null;
    }
    /**
     * <p> get the IRFCardReader interface object for CTLS card
     * 
     * @return {@link com.vfi.smartpos.deviceservice.aidl.IRFCardReader}
     * @since 1.x.x
     */
    @Override public com.vfi.smartpos.deviceservice.aidl.IRFCardReader getRFCardReader() throws android.os.RemoteException
    {
      return null;
    }
    /**
     * <p>kapId get IPinpad interface object for Pinpad
     * 
     * @param kapId : the index refer the keys set
     * @return {@link com.vfi.smartpos.deviceservice.aidl.IPinpad}
     * @since 1.x.x
     */
    @Override public com.vfi.smartpos.deviceservice.aidl.IPinpad getPinpad(int kapId) throws android.os.RemoteException
    {
      return null;
    }
    /**
     * <p> get IPrinter interface object for printer
     * 
     * @return {@link com.vfi.smartpos.deviceservice.aidl.IPrinter}
     * @since 1.x.x
     */
    @Override public com.vfi.smartpos.deviceservice.aidl.IPrinter getPrinter() throws android.os.RemoteException
    {
      return null;
    }
    /**
     * <p> get IPBOC interface object for PBOC or EMV
     * 
     * @return {@link com.vfi.smartpos.deviceservice.aidl.IPBOC}
     * @since 1.x.x
     * @deprecated  please use IEMV to instead, {@see com.vfi.smartpos.deviceservice.aidl.IEMV}
     */
    @Override public com.vfi.smartpos.deviceservice.aidl.IPBOC getPBOC() throws android.os.RemoteException
    {
      return null;
    }
    /**
     * <p> get IDeviceInfo interface object for device information
     * 
     * @return {@link com.vfi.smartpos.deviceservice.aidl.IDeviceInfo}
     * @since 1.x.x
     */
    @Override public com.vfi.smartpos.deviceservice.aidl.IDeviceInfo getDeviceInfo() throws android.os.RemoteException
    {
      return null;
    }
    /**
     * <p>  get IExternalSerialPort interface object for external serial port
     * 
     * @return {@link com.vfi.smartpos.deviceservice.aidl.IExternalSerialPort}
     * @since 1.x.x
     */
    @Override public com.vfi.smartpos.deviceservice.aidl.IExternalSerialPort getExternalSerialPort() throws android.os.RemoteException
    {
      return null;
    }
    /**
     * <p> get the usb-serial device(such as X9, C520H) connect with OTG cable
     * 
     * @return {@link com.vfi.smartpos.deviceservice.aidl.IUsbSerialPort}
     * @since 1.x.x
     */
    @Override public com.vfi.smartpos.deviceservice.aidl.IUsbSerialPort getUsbSerialPort() throws android.os.RemoteException
    {
      return null;
    }
    /**
     * <p>slotNo slotNo value as follow:
     * <ul>
     *     <li>{@code 0}:IC card slot</li>
     *     <li>{@code 1}:SAM1 card slot</li>
     *     <li>{@code 2}:SAM2 card slot</li>
     * </ul>
     * @return {@link com.vfi.smartpos.deviceservice.aidl.ISmartCardReader}
     * @since 1.x.x
     */
    @Override public com.vfi.smartpos.deviceservice.aidl.ISmartCardReader getSmartCardReader(int slotNo) throws android.os.RemoteException
    {
      return null;
    }
    /**
     * <p> get IEMV interface object.
     * 
     * @return {@link com.vfi.smartpos.deviceservice.aidl.IEMV}
     * @since 2.0.0
     */
    @Override public com.vfi.smartpos.deviceservice.aidl.IEMV getEMV() throws android.os.RemoteException
    {
      return null;
    }
    /**
     * <p> get IDukpt interface object.
     * 
     * @return {@link com.vfi.smartpos.deviceservice.aidl.IDukpt}
     * @since 2.0.0
     */
    @Override public com.vfi.smartpos.deviceservice.aidl.key_manager.IDukpt getDUKPT() throws android.os.RemoteException
    {
      return null;
    }
    /**
     * <p> get IFelica interface object
     * 
     * @return {@link com.vfi.smartpos.deviceservice.aidl.IFelica}
     * @since 2.1.23.1
     */
    @Override public com.vfi.smartpos.deviceservice.aidl.card_reader.IFelica getFelica() throws android.os.RemoteException
    {
      return null;
    }
    /**
     * <p> get IUtils interface object
     * 
     * @return {@link com.vfi.smartpos.deviceservice.aidl.IUtils}
     * @since 2.4.3.1
     */
    @Override public com.vfi.smartpos.deviceservice.aidl.utils.IUtils getUtils() throws android.os.RemoteException
    {
      return null;
    }
    /**
     * <p> get ISmartCardReaderEx interface object for logic card, such as AT24\AT88\SLE44
     * 
     * @return {@link com.vfi.smartpos.deviceservice.aidl.ISmartCardReaderEx}
     * @since 3.4.2.rc3
     */
    @Override public com.vfi.smartpos.deviceservice.aidl.ISmartCardReaderEx getSmartCardReaderEx() throws android.os.RemoteException
    {
      return null;
    }
    /**
     * <p> get IKLD interface object
     * 
     * @return {@link com.vfi.smartpos.deviceservice.aidl.IKLD}
     * @since 3.3.2.rc3
     */
    @Override public com.vfi.smartpos.deviceservice.aidl.key_manager.IKLD getIKLD() throws android.os.RemoteException
    {
      return null;
    }
    /**
     * <p> get INtagCard interface object
     * 
     * @return {@link com.vfi.smartpos.deviceservice.aidl.INtagCard}
     * @since 3.2.2.rc3
     */
    @Override public com.vfi.smartpos.deviceservice.aidl.card_reader.INtagCard getNtag() throws android.os.RemoteException
    {
      return null;
    }
    /**
     * <p> get ICode interface object
     * 
     * @return {@link com.vfi.smartpos.deviceservice.aidl.IICodeCard}
     * @since 3.6.0
     */
    @Override public com.vfi.smartpos.deviceservice.aidl.card_reader.IICodeCard getICode() throws android.os.RemoteException
    {
      return null;
    }
    /**
     * <p> get UltraLightCard interface object
     * Note: SP begin to support from V1.0.11(202111161359).vfuup
     * 
     * @return {@link com.vfi.smartpos.deviceservice.aidl.IUltraLightCard}
     * @since 3.11.0
     */
    @Override public com.vfi.smartpos.deviceservice.aidl.card_reader.IUltraLightCard getUtrlLightManager() throws android.os.RemoteException
    {
      return null;
    }
    /**
     * <p> get IRSA interface object
     * 
     * @return {@link com.vfi.smartpos.deviceservice.aidl.IRSA}
     * @since 3.6.3.rc0213
     */
    @Override public com.vfi.smartpos.deviceservice.aidl.key_manager.IRSA getIRSA() throws android.os.RemoteException
    {
      return null;
    }
    /**
     * <p> get UltraLightCardEV1 interface object
     * Note: SP begin to support from V1.0.11(202111161359).vfuup
     * 
     * @return {@link com.vfi.smartpos.deviceservice.aidl.IUltraLightEV1Card}
     * @since 3.11.0
     */
    @Override public com.vfi.smartpos.deviceservice.aidl.card_reader.IUltraLightCardEV1 getUtrlLightEV1Manager() throws android.os.RemoteException
    {
      return null;
    }
    /**
     * <p> get UltraLightCCard interface object
     * Note: SP begin to support from V1.0.11(202111161359).vfuup
     * 
     * @return {@link com.vfi.smartpos.deviceservice.aidl.IUltraLightCCard}
     * @since 3.11.0
     */
    @Override public com.vfi.smartpos.deviceservice.aidl.card_reader.IUltraLightCardC getUtrlLightCManager() throws android.os.RemoteException
    {
      return null;
    }
    /**
     * <p> get UltraLightCard interface object
     * Note: SP begin to support from V1.0.11(202111161359).vfuup
     * 
     * @return {@link com.vfi.smartpos.deviceservice.aidl.IUltraLightNANOCard}
     * @since 3.11.0
     */
    @Override public com.vfi.smartpos.deviceservice.aidl.card_reader.IUltraLightCardNano getUtrlLightNanoManager() throws android.os.RemoteException
    {
      return null;
    }
    @Override public com.vfi.smartpos.deviceservice.aidl.IWirelessBaseHelper getWirelessBaseHelper() throws android.os.RemoteException
    {
      return null;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.vfi.smartpos.deviceservice.aidl.IDeviceService
  {
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.vfi.smartpos.deviceservice.aidl.IDeviceService interface,
     * generating a proxy if needed.
     */
    public static com.vfi.smartpos.deviceservice.aidl.IDeviceService asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.vfi.smartpos.deviceservice.aidl.IDeviceService))) {
        return ((com.vfi.smartpos.deviceservice.aidl.IDeviceService)iin);
      }
      return new com.vfi.smartpos.deviceservice.aidl.IDeviceService.Stub.Proxy(obj);
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
        case TRANSACTION_getBeeper:
        {
          com.vfi.smartpos.deviceservice.aidl.IBeeper _result = this.getBeeper();
          reply.writeNoException();
          reply.writeStrongInterface(_result);
          break;
        }
        case TRANSACTION_getLed:
        {
          com.vfi.smartpos.deviceservice.aidl.ILed _result = this.getLed();
          reply.writeNoException();
          reply.writeStrongInterface(_result);
          break;
        }
        case TRANSACTION_getSerialPort:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          com.vfi.smartpos.deviceservice.aidl.ISerialPort _result = this.getSerialPort(_arg0);
          reply.writeNoException();
          reply.writeStrongInterface(_result);
          break;
        }
        case TRANSACTION_getScanner:
        {
          int _arg0;
          _arg0 = data.readInt();
          com.vfi.smartpos.deviceservice.aidl.IScanner _result = this.getScanner(_arg0);
          reply.writeNoException();
          reply.writeStrongInterface(_result);
          break;
        }
        case TRANSACTION_getMagCardReader:
        {
          com.vfi.smartpos.deviceservice.aidl.IMagCardReader _result = this.getMagCardReader();
          reply.writeNoException();
          reply.writeStrongInterface(_result);
          break;
        }
        case TRANSACTION_getInsertCardReader:
        {
          int _arg0;
          _arg0 = data.readInt();
          com.vfi.smartpos.deviceservice.aidl.IInsertCardReader _result = this.getInsertCardReader(_arg0);
          reply.writeNoException();
          reply.writeStrongInterface(_result);
          break;
        }
        case TRANSACTION_getRFCardReader:
        {
          com.vfi.smartpos.deviceservice.aidl.IRFCardReader _result = this.getRFCardReader();
          reply.writeNoException();
          reply.writeStrongInterface(_result);
          break;
        }
        case TRANSACTION_getPinpad:
        {
          int _arg0;
          _arg0 = data.readInt();
          com.vfi.smartpos.deviceservice.aidl.IPinpad _result = this.getPinpad(_arg0);
          reply.writeNoException();
          reply.writeStrongInterface(_result);
          break;
        }
        case TRANSACTION_getPrinter:
        {
          com.vfi.smartpos.deviceservice.aidl.IPrinter _result = this.getPrinter();
          reply.writeNoException();
          reply.writeStrongInterface(_result);
          break;
        }
        case TRANSACTION_getPBOC:
        {
          com.vfi.smartpos.deviceservice.aidl.IPBOC _result = this.getPBOC();
          reply.writeNoException();
          reply.writeStrongInterface(_result);
          break;
        }
        case TRANSACTION_getDeviceInfo:
        {
          com.vfi.smartpos.deviceservice.aidl.IDeviceInfo _result = this.getDeviceInfo();
          reply.writeNoException();
          reply.writeStrongInterface(_result);
          break;
        }
        case TRANSACTION_getExternalSerialPort:
        {
          com.vfi.smartpos.deviceservice.aidl.IExternalSerialPort _result = this.getExternalSerialPort();
          reply.writeNoException();
          reply.writeStrongInterface(_result);
          break;
        }
        case TRANSACTION_getUsbSerialPort:
        {
          com.vfi.smartpos.deviceservice.aidl.IUsbSerialPort _result = this.getUsbSerialPort();
          reply.writeNoException();
          reply.writeStrongInterface(_result);
          break;
        }
        case TRANSACTION_getSmartCardReader:
        {
          int _arg0;
          _arg0 = data.readInt();
          com.vfi.smartpos.deviceservice.aidl.ISmartCardReader _result = this.getSmartCardReader(_arg0);
          reply.writeNoException();
          reply.writeStrongInterface(_result);
          break;
        }
        case TRANSACTION_getEMV:
        {
          com.vfi.smartpos.deviceservice.aidl.IEMV _result = this.getEMV();
          reply.writeNoException();
          reply.writeStrongInterface(_result);
          break;
        }
        case TRANSACTION_getDUKPT:
        {
          com.vfi.smartpos.deviceservice.aidl.key_manager.IDukpt _result = this.getDUKPT();
          reply.writeNoException();
          reply.writeStrongInterface(_result);
          break;
        }
        case TRANSACTION_getFelica:
        {
          com.vfi.smartpos.deviceservice.aidl.card_reader.IFelica _result = this.getFelica();
          reply.writeNoException();
          reply.writeStrongInterface(_result);
          break;
        }
        case TRANSACTION_getUtils:
        {
          com.vfi.smartpos.deviceservice.aidl.utils.IUtils _result = this.getUtils();
          reply.writeNoException();
          reply.writeStrongInterface(_result);
          break;
        }
        case TRANSACTION_getSmartCardReaderEx:
        {
          com.vfi.smartpos.deviceservice.aidl.ISmartCardReaderEx _result = this.getSmartCardReaderEx();
          reply.writeNoException();
          reply.writeStrongInterface(_result);
          break;
        }
        case TRANSACTION_getIKLD:
        {
          com.vfi.smartpos.deviceservice.aidl.key_manager.IKLD _result = this.getIKLD();
          reply.writeNoException();
          reply.writeStrongInterface(_result);
          break;
        }
        case TRANSACTION_getNtag:
        {
          com.vfi.smartpos.deviceservice.aidl.card_reader.INtagCard _result = this.getNtag();
          reply.writeNoException();
          reply.writeStrongInterface(_result);
          break;
        }
        case TRANSACTION_getICode:
        {
          com.vfi.smartpos.deviceservice.aidl.card_reader.IICodeCard _result = this.getICode();
          reply.writeNoException();
          reply.writeStrongInterface(_result);
          break;
        }
        case TRANSACTION_getUtrlLightManager:
        {
          com.vfi.smartpos.deviceservice.aidl.card_reader.IUltraLightCard _result = this.getUtrlLightManager();
          reply.writeNoException();
          reply.writeStrongInterface(_result);
          break;
        }
        case TRANSACTION_getIRSA:
        {
          com.vfi.smartpos.deviceservice.aidl.key_manager.IRSA _result = this.getIRSA();
          reply.writeNoException();
          reply.writeStrongInterface(_result);
          break;
        }
        case TRANSACTION_getUtrlLightEV1Manager:
        {
          com.vfi.smartpos.deviceservice.aidl.card_reader.IUltraLightCardEV1 _result = this.getUtrlLightEV1Manager();
          reply.writeNoException();
          reply.writeStrongInterface(_result);
          break;
        }
        case TRANSACTION_getUtrlLightCManager:
        {
          com.vfi.smartpos.deviceservice.aidl.card_reader.IUltraLightCardC _result = this.getUtrlLightCManager();
          reply.writeNoException();
          reply.writeStrongInterface(_result);
          break;
        }
        case TRANSACTION_getUtrlLightNanoManager:
        {
          com.vfi.smartpos.deviceservice.aidl.card_reader.IUltraLightCardNano _result = this.getUtrlLightNanoManager();
          reply.writeNoException();
          reply.writeStrongInterface(_result);
          break;
        }
        case TRANSACTION_getWirelessBaseHelper:
        {
          com.vfi.smartpos.deviceservice.aidl.IWirelessBaseHelper _result = this.getWirelessBaseHelper();
          reply.writeNoException();
          reply.writeStrongInterface(_result);
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static class Proxy implements com.vfi.smartpos.deviceservice.aidl.IDeviceService
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
       * <p> get the IBeeper interface object for Beeper.
       * 
       * @return {@link com.vfi.smartpos.deviceservice.aidl.IBeeper}
       * @since 1.x.x
       */
      @Override public com.vfi.smartpos.deviceservice.aidl.IBeeper getBeeper() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        com.vfi.smartpos.deviceservice.aidl.IBeeper _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getBeeper, _data, _reply, 0);
          _reply.readException();
          _result = com.vfi.smartpos.deviceservice.aidl.IBeeper.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * <p> get the ILed interface object for Led.
       * 
       * @return {@link com.vfi.smartpos.deviceservice.aidl.ILed}
       * @since 1.x.x
       */
      @Override public com.vfi.smartpos.deviceservice.aidl.ILed getLed() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        com.vfi.smartpos.deviceservice.aidl.ILed _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getLed, _data, _reply, 0);
          _reply.readException();
          _result = com.vfi.smartpos.deviceservice.aidl.ILed.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * <p> get the ISerialPort interface object for Serial Port.
       * 
       * @param {@code String} deviceType
       * <p> the key of deviceType param is as follow:
       * <ul>
       *   <li>"rs232"(description:the port via build in serial chip micro USB cable (one side is micro USB connect to terminal, another side is 9 pin interface connect to COM port in PC.))</li>
       *   <li>"usb-rs232"(description:the port via micro USB cable）</li>
       * </ul>
       * 
       * <p>special device type</p>
       * <ul>
       *   <li><B>Type1:</B>set VID (and PID) directly or only VID, such as "usb2rs232-11CA-0204", "usb2rs232-11CA".
       *   <li>"usb2rs232-VF-RS232"(same as "usb2rs232-11CA-0204"), (description:definied in @{link com.verifone.smartpos.devicemanager.util.SerialPortChart.VF_RS232})</li>
       *   <li>"usb2rs232-VF-V34Modem"(same as "usb2rs232-11CA-0205"), (description:definied in @{link com.verifone.smartpos.devicemanager.util.SerialPortChart.VF_V34Modem})</li>
       *   <li>"usb2rs232-VF-C680DongleModem"(same as "usb2rs232-11CA-0240"), (description:definied in @{link com.verifone.smartpos.devicemanager.util.SerialPortChart.VF_C680DongleModem})</li>
       *   <li>"usb2rs232-Z-TEK"(same as "usb2rs232-0403-6001"), (description:definied in @{link com.verifone.smartpos.devicemanager.util.SerialPortChart.Z_TEK})</li>
       * </ul>
       * 
       * <p>For given driver ftdi, cdc, ch34, cp21, proli to load a device</P>
       * <ul>
       *   <li><B>type2:</B> usb2rs232-VIP-PID-Driver</li>
       *   <li>usb2rs232-0403-6001-ftdi</li>
       * </ul>
       * 
       * <p>For given slot to load a device in case of there're same Devices attached</p>
       * <ul>
       *   <li><B>Type3:</B> Slot started from 0</li>
       *   <li>usb2rs232-VIP-PID-Slot</li>
       *   <li>usb2rs232-VIP-PID-Driver-Slot</li>
       *   <li>usb2rs232-11CA-0204-1</li>
       *   <li>usb2rs232-0403-6001-ftdi-1</li>
       * </ul>
       * 
       * <p>For given Production Name to load a device in case of there're same (VID, PID) Devices attached</p>
       * <ul>
       *   <li><B>Type4:</B> Such as Verifone RS232 devices: VeriFone USB to UART Bridge, VeriFone USB to UART Dongle, VeriFone USB UART</li>
       *   <li>usb2rs232-VIP-PID-ProdName</li>
       *   <li>usb2rs232-VIP-PID-Driver-ProdName</li>
       *   <li>usb2rs232-11CA-0204-Bridge</li>
       *   <li>usb2rs232-11CA-0204-Dongle</li>
       * </ul>
       * 
       * <p>For given Name of port on terminal's pedestal</p>
       * <ul>
       *   <li><B>Type5:</B> There are 2 serial ports on terminal with pedestal</li>
       *   <li>pedestal-rs232</li>
       *   <li>pedestal-pinpad</li>
       * </ul>
       * 
       * <p>For given Name of port on wireless base</p>
       * <ul>
       *   <li><B>Type6:</B> There are 2 serial ports on wireless base</li>
       *   <li>wireless-rs232</li>
       *   <li>wireless-pinpad</li>
       * </ul>
       * 
       * @return {@link com.vfi.smartpos.deviceservice.aidl.ISerialPort}
       * @since 1.x.x
       */
      @Override public com.vfi.smartpos.deviceservice.aidl.ISerialPort getSerialPort(java.lang.String deviceType) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        com.vfi.smartpos.deviceservice.aidl.ISerialPort _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(deviceType);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getSerialPort, _data, _reply, 0);
          _reply.readException();
          _result = com.vfi.smartpos.deviceservice.aidl.ISerialPort.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * <p> get the IScanner interface object for scanner
       * 
       * @param cameraId 1:set front scanner, 0:set rear scanner
       * @return {@link com.vfi.smartpos.deviceservice.aidl.IScanner}
       * @since 1.x.x
       */
      @Override public com.vfi.smartpos.deviceservice.aidl.IScanner getScanner(int cameraId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        com.vfi.smartpos.deviceservice.aidl.IScanner _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(cameraId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getScanner, _data, _reply, 0);
          _reply.readException();
          _result = com.vfi.smartpos.deviceservice.aidl.IScanner.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * <p> get the IMagCardReader interface object for magnetic card reader
       * 
       * @return {@link com.vfi.smartpos.deviceservice.aidl.IMagCardReader}
       * @since 1.x.x
       */
      @Override public com.vfi.smartpos.deviceservice.aidl.IMagCardReader getMagCardReader() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        com.vfi.smartpos.deviceservice.aidl.IMagCardReader _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getMagCardReader, _data, _reply, 0);
          _reply.readException();
          _result = com.vfi.smartpos.deviceservice.aidl.IMagCardReader.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * <p> get the IInsertCardReader interface object for smart card and PSAM card
       * 
       * @param slotNo slotNo value as follow:
       * <ul>
       *     <li>{@code 0}:IC card slot</li>
       *     <li>{@code 1}:SAM1 card slot</li>
       *     <li>{@code 2}:SAM2 card slot</li>
       * </ul>
       * @return {@link com.vfi.smartpos.deviceservice.aidl.IInsertCardReader}
       * @since 1.x.x
       */
      @Override public com.vfi.smartpos.deviceservice.aidl.IInsertCardReader getInsertCardReader(int slotNo) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        com.vfi.smartpos.deviceservice.aidl.IInsertCardReader _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(slotNo);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getInsertCardReader, _data, _reply, 0);
          _reply.readException();
          _result = com.vfi.smartpos.deviceservice.aidl.IInsertCardReader.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * <p> get the IRFCardReader interface object for CTLS card
       * 
       * @return {@link com.vfi.smartpos.deviceservice.aidl.IRFCardReader}
       * @since 1.x.x
       */
      @Override public com.vfi.smartpos.deviceservice.aidl.IRFCardReader getRFCardReader() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        com.vfi.smartpos.deviceservice.aidl.IRFCardReader _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getRFCardReader, _data, _reply, 0);
          _reply.readException();
          _result = com.vfi.smartpos.deviceservice.aidl.IRFCardReader.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * <p>kapId get IPinpad interface object for Pinpad
       * 
       * @param kapId : the index refer the keys set
       * @return {@link com.vfi.smartpos.deviceservice.aidl.IPinpad}
       * @since 1.x.x
       */
      @Override public com.vfi.smartpos.deviceservice.aidl.IPinpad getPinpad(int kapId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        com.vfi.smartpos.deviceservice.aidl.IPinpad _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(kapId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getPinpad, _data, _reply, 0);
          _reply.readException();
          _result = com.vfi.smartpos.deviceservice.aidl.IPinpad.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * <p> get IPrinter interface object for printer
       * 
       * @return {@link com.vfi.smartpos.deviceservice.aidl.IPrinter}
       * @since 1.x.x
       */
      @Override public com.vfi.smartpos.deviceservice.aidl.IPrinter getPrinter() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        com.vfi.smartpos.deviceservice.aidl.IPrinter _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getPrinter, _data, _reply, 0);
          _reply.readException();
          _result = com.vfi.smartpos.deviceservice.aidl.IPrinter.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * <p> get IPBOC interface object for PBOC or EMV
       * 
       * @return {@link com.vfi.smartpos.deviceservice.aidl.IPBOC}
       * @since 1.x.x
       * @deprecated  please use IEMV to instead, {@see com.vfi.smartpos.deviceservice.aidl.IEMV}
       */
      @Override public com.vfi.smartpos.deviceservice.aidl.IPBOC getPBOC() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        com.vfi.smartpos.deviceservice.aidl.IPBOC _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getPBOC, _data, _reply, 0);
          _reply.readException();
          _result = com.vfi.smartpos.deviceservice.aidl.IPBOC.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * <p> get IDeviceInfo interface object for device information
       * 
       * @return {@link com.vfi.smartpos.deviceservice.aidl.IDeviceInfo}
       * @since 1.x.x
       */
      @Override public com.vfi.smartpos.deviceservice.aidl.IDeviceInfo getDeviceInfo() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        com.vfi.smartpos.deviceservice.aidl.IDeviceInfo _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getDeviceInfo, _data, _reply, 0);
          _reply.readException();
          _result = com.vfi.smartpos.deviceservice.aidl.IDeviceInfo.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * <p>  get IExternalSerialPort interface object for external serial port
       * 
       * @return {@link com.vfi.smartpos.deviceservice.aidl.IExternalSerialPort}
       * @since 1.x.x
       */
      @Override public com.vfi.smartpos.deviceservice.aidl.IExternalSerialPort getExternalSerialPort() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        com.vfi.smartpos.deviceservice.aidl.IExternalSerialPort _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getExternalSerialPort, _data, _reply, 0);
          _reply.readException();
          _result = com.vfi.smartpos.deviceservice.aidl.IExternalSerialPort.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * <p> get the usb-serial device(such as X9, C520H) connect with OTG cable
       * 
       * @return {@link com.vfi.smartpos.deviceservice.aidl.IUsbSerialPort}
       * @since 1.x.x
       */
      @Override public com.vfi.smartpos.deviceservice.aidl.IUsbSerialPort getUsbSerialPort() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        com.vfi.smartpos.deviceservice.aidl.IUsbSerialPort _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getUsbSerialPort, _data, _reply, 0);
          _reply.readException();
          _result = com.vfi.smartpos.deviceservice.aidl.IUsbSerialPort.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * <p>slotNo slotNo value as follow:
       * <ul>
       *     <li>{@code 0}:IC card slot</li>
       *     <li>{@code 1}:SAM1 card slot</li>
       *     <li>{@code 2}:SAM2 card slot</li>
       * </ul>
       * @return {@link com.vfi.smartpos.deviceservice.aidl.ISmartCardReader}
       * @since 1.x.x
       */
      @Override public com.vfi.smartpos.deviceservice.aidl.ISmartCardReader getSmartCardReader(int slotNo) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        com.vfi.smartpos.deviceservice.aidl.ISmartCardReader _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(slotNo);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getSmartCardReader, _data, _reply, 0);
          _reply.readException();
          _result = com.vfi.smartpos.deviceservice.aidl.ISmartCardReader.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * <p> get IEMV interface object.
       * 
       * @return {@link com.vfi.smartpos.deviceservice.aidl.IEMV}
       * @since 2.0.0
       */
      @Override public com.vfi.smartpos.deviceservice.aidl.IEMV getEMV() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        com.vfi.smartpos.deviceservice.aidl.IEMV _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getEMV, _data, _reply, 0);
          _reply.readException();
          _result = com.vfi.smartpos.deviceservice.aidl.IEMV.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * <p> get IDukpt interface object.
       * 
       * @return {@link com.vfi.smartpos.deviceservice.aidl.IDukpt}
       * @since 2.0.0
       */
      @Override public com.vfi.smartpos.deviceservice.aidl.key_manager.IDukpt getDUKPT() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        com.vfi.smartpos.deviceservice.aidl.key_manager.IDukpt _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getDUKPT, _data, _reply, 0);
          _reply.readException();
          _result = com.vfi.smartpos.deviceservice.aidl.key_manager.IDukpt.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * <p> get IFelica interface object
       * 
       * @return {@link com.vfi.smartpos.deviceservice.aidl.IFelica}
       * @since 2.1.23.1
       */
      @Override public com.vfi.smartpos.deviceservice.aidl.card_reader.IFelica getFelica() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        com.vfi.smartpos.deviceservice.aidl.card_reader.IFelica _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getFelica, _data, _reply, 0);
          _reply.readException();
          _result = com.vfi.smartpos.deviceservice.aidl.card_reader.IFelica.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * <p> get IUtils interface object
       * 
       * @return {@link com.vfi.smartpos.deviceservice.aidl.IUtils}
       * @since 2.4.3.1
       */
      @Override public com.vfi.smartpos.deviceservice.aidl.utils.IUtils getUtils() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        com.vfi.smartpos.deviceservice.aidl.utils.IUtils _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getUtils, _data, _reply, 0);
          _reply.readException();
          _result = com.vfi.smartpos.deviceservice.aidl.utils.IUtils.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * <p> get ISmartCardReaderEx interface object for logic card, such as AT24\AT88\SLE44
       * 
       * @return {@link com.vfi.smartpos.deviceservice.aidl.ISmartCardReaderEx}
       * @since 3.4.2.rc3
       */
      @Override public com.vfi.smartpos.deviceservice.aidl.ISmartCardReaderEx getSmartCardReaderEx() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        com.vfi.smartpos.deviceservice.aidl.ISmartCardReaderEx _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getSmartCardReaderEx, _data, _reply, 0);
          _reply.readException();
          _result = com.vfi.smartpos.deviceservice.aidl.ISmartCardReaderEx.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * <p> get IKLD interface object
       * 
       * @return {@link com.vfi.smartpos.deviceservice.aidl.IKLD}
       * @since 3.3.2.rc3
       */
      @Override public com.vfi.smartpos.deviceservice.aidl.key_manager.IKLD getIKLD() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        com.vfi.smartpos.deviceservice.aidl.key_manager.IKLD _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getIKLD, _data, _reply, 0);
          _reply.readException();
          _result = com.vfi.smartpos.deviceservice.aidl.key_manager.IKLD.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * <p> get INtagCard interface object
       * 
       * @return {@link com.vfi.smartpos.deviceservice.aidl.INtagCard}
       * @since 3.2.2.rc3
       */
      @Override public com.vfi.smartpos.deviceservice.aidl.card_reader.INtagCard getNtag() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        com.vfi.smartpos.deviceservice.aidl.card_reader.INtagCard _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getNtag, _data, _reply, 0);
          _reply.readException();
          _result = com.vfi.smartpos.deviceservice.aidl.card_reader.INtagCard.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * <p> get ICode interface object
       * 
       * @return {@link com.vfi.smartpos.deviceservice.aidl.IICodeCard}
       * @since 3.6.0
       */
      @Override public com.vfi.smartpos.deviceservice.aidl.card_reader.IICodeCard getICode() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        com.vfi.smartpos.deviceservice.aidl.card_reader.IICodeCard _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getICode, _data, _reply, 0);
          _reply.readException();
          _result = com.vfi.smartpos.deviceservice.aidl.card_reader.IICodeCard.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * <p> get UltraLightCard interface object
       * Note: SP begin to support from V1.0.11(202111161359).vfuup
       * 
       * @return {@link com.vfi.smartpos.deviceservice.aidl.IUltraLightCard}
       * @since 3.11.0
       */
      @Override public com.vfi.smartpos.deviceservice.aidl.card_reader.IUltraLightCard getUtrlLightManager() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        com.vfi.smartpos.deviceservice.aidl.card_reader.IUltraLightCard _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getUtrlLightManager, _data, _reply, 0);
          _reply.readException();
          _result = com.vfi.smartpos.deviceservice.aidl.card_reader.IUltraLightCard.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * <p> get IRSA interface object
       * 
       * @return {@link com.vfi.smartpos.deviceservice.aidl.IRSA}
       * @since 3.6.3.rc0213
       */
      @Override public com.vfi.smartpos.deviceservice.aidl.key_manager.IRSA getIRSA() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        com.vfi.smartpos.deviceservice.aidl.key_manager.IRSA _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getIRSA, _data, _reply, 0);
          _reply.readException();
          _result = com.vfi.smartpos.deviceservice.aidl.key_manager.IRSA.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * <p> get UltraLightCardEV1 interface object
       * Note: SP begin to support from V1.0.11(202111161359).vfuup
       * 
       * @return {@link com.vfi.smartpos.deviceservice.aidl.IUltraLightEV1Card}
       * @since 3.11.0
       */
      @Override public com.vfi.smartpos.deviceservice.aidl.card_reader.IUltraLightCardEV1 getUtrlLightEV1Manager() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        com.vfi.smartpos.deviceservice.aidl.card_reader.IUltraLightCardEV1 _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getUtrlLightEV1Manager, _data, _reply, 0);
          _reply.readException();
          _result = com.vfi.smartpos.deviceservice.aidl.card_reader.IUltraLightCardEV1.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * <p> get UltraLightCCard interface object
       * Note: SP begin to support from V1.0.11(202111161359).vfuup
       * 
       * @return {@link com.vfi.smartpos.deviceservice.aidl.IUltraLightCCard}
       * @since 3.11.0
       */
      @Override public com.vfi.smartpos.deviceservice.aidl.card_reader.IUltraLightCardC getUtrlLightCManager() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        com.vfi.smartpos.deviceservice.aidl.card_reader.IUltraLightCardC _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getUtrlLightCManager, _data, _reply, 0);
          _reply.readException();
          _result = com.vfi.smartpos.deviceservice.aidl.card_reader.IUltraLightCardC.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * <p> get UltraLightCard interface object
       * Note: SP begin to support from V1.0.11(202111161359).vfuup
       * 
       * @return {@link com.vfi.smartpos.deviceservice.aidl.IUltraLightNANOCard}
       * @since 3.11.0
       */
      @Override public com.vfi.smartpos.deviceservice.aidl.card_reader.IUltraLightCardNano getUtrlLightNanoManager() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        com.vfi.smartpos.deviceservice.aidl.card_reader.IUltraLightCardNano _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getUtrlLightNanoManager, _data, _reply, 0);
          _reply.readException();
          _result = com.vfi.smartpos.deviceservice.aidl.card_reader.IUltraLightCardNano.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public com.vfi.smartpos.deviceservice.aidl.IWirelessBaseHelper getWirelessBaseHelper() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        com.vfi.smartpos.deviceservice.aidl.IWirelessBaseHelper _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getWirelessBaseHelper, _data, _reply, 0);
          _reply.readException();
          _result = com.vfi.smartpos.deviceservice.aidl.IWirelessBaseHelper.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
    }
    static final int TRANSACTION_getBeeper = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_getLed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_getSerialPort = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_getScanner = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_getMagCardReader = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_getInsertCardReader = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_getRFCardReader = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_getPinpad = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_getPrinter = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    static final int TRANSACTION_getPBOC = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
    static final int TRANSACTION_getDeviceInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
    static final int TRANSACTION_getExternalSerialPort = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
    static final int TRANSACTION_getUsbSerialPort = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
    static final int TRANSACTION_getSmartCardReader = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
    static final int TRANSACTION_getEMV = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
    static final int TRANSACTION_getDUKPT = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
    static final int TRANSACTION_getFelica = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
    static final int TRANSACTION_getUtils = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
    static final int TRANSACTION_getSmartCardReaderEx = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
    static final int TRANSACTION_getIKLD = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
    static final int TRANSACTION_getNtag = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
    static final int TRANSACTION_getICode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
    static final int TRANSACTION_getUtrlLightManager = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
    static final int TRANSACTION_getIRSA = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
    static final int TRANSACTION_getUtrlLightEV1Manager = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
    static final int TRANSACTION_getUtrlLightCManager = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
    static final int TRANSACTION_getUtrlLightNanoManager = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
    static final int TRANSACTION_getWirelessBaseHelper = (android.os.IBinder.FIRST_CALL_TRANSACTION + 27);
  }
  public static final java.lang.String DESCRIPTOR = "com.vfi.smartpos.deviceservice.aidl.IDeviceService";
  /**
   * <p> get the IBeeper interface object for Beeper.
   * 
   * @return {@link com.vfi.smartpos.deviceservice.aidl.IBeeper}
   * @since 1.x.x
   */
  public com.vfi.smartpos.deviceservice.aidl.IBeeper getBeeper() throws android.os.RemoteException;
  /**
   * <p> get the ILed interface object for Led.
   * 
   * @return {@link com.vfi.smartpos.deviceservice.aidl.ILed}
   * @since 1.x.x
   */
  public com.vfi.smartpos.deviceservice.aidl.ILed getLed() throws android.os.RemoteException;
  /**
   * <p> get the ISerialPort interface object for Serial Port.
   * 
   * @param {@code String} deviceType
   * <p> the key of deviceType param is as follow:
   * <ul>
   *   <li>"rs232"(description:the port via build in serial chip micro USB cable (one side is micro USB connect to terminal, another side is 9 pin interface connect to COM port in PC.))</li>
   *   <li>"usb-rs232"(description:the port via micro USB cable）</li>
   * </ul>
   * 
   * <p>special device type</p>
   * <ul>
   *   <li><B>Type1:</B>set VID (and PID) directly or only VID, such as "usb2rs232-11CA-0204", "usb2rs232-11CA".
   *   <li>"usb2rs232-VF-RS232"(same as "usb2rs232-11CA-0204"), (description:definied in @{link com.verifone.smartpos.devicemanager.util.SerialPortChart.VF_RS232})</li>
   *   <li>"usb2rs232-VF-V34Modem"(same as "usb2rs232-11CA-0205"), (description:definied in @{link com.verifone.smartpos.devicemanager.util.SerialPortChart.VF_V34Modem})</li>
   *   <li>"usb2rs232-VF-C680DongleModem"(same as "usb2rs232-11CA-0240"), (description:definied in @{link com.verifone.smartpos.devicemanager.util.SerialPortChart.VF_C680DongleModem})</li>
   *   <li>"usb2rs232-Z-TEK"(same as "usb2rs232-0403-6001"), (description:definied in @{link com.verifone.smartpos.devicemanager.util.SerialPortChart.Z_TEK})</li>
   * </ul>
   * 
   * <p>For given driver ftdi, cdc, ch34, cp21, proli to load a device</P>
   * <ul>
   *   <li><B>type2:</B> usb2rs232-VIP-PID-Driver</li>
   *   <li>usb2rs232-0403-6001-ftdi</li>
   * </ul>
   * 
   * <p>For given slot to load a device in case of there're same Devices attached</p>
   * <ul>
   *   <li><B>Type3:</B> Slot started from 0</li>
   *   <li>usb2rs232-VIP-PID-Slot</li>
   *   <li>usb2rs232-VIP-PID-Driver-Slot</li>
   *   <li>usb2rs232-11CA-0204-1</li>
   *   <li>usb2rs232-0403-6001-ftdi-1</li>
   * </ul>
   * 
   * <p>For given Production Name to load a device in case of there're same (VID, PID) Devices attached</p>
   * <ul>
   *   <li><B>Type4:</B> Such as Verifone RS232 devices: VeriFone USB to UART Bridge, VeriFone USB to UART Dongle, VeriFone USB UART</li>
   *   <li>usb2rs232-VIP-PID-ProdName</li>
   *   <li>usb2rs232-VIP-PID-Driver-ProdName</li>
   *   <li>usb2rs232-11CA-0204-Bridge</li>
   *   <li>usb2rs232-11CA-0204-Dongle</li>
   * </ul>
   * 
   * <p>For given Name of port on terminal's pedestal</p>
   * <ul>
   *   <li><B>Type5:</B> There are 2 serial ports on terminal with pedestal</li>
   *   <li>pedestal-rs232</li>
   *   <li>pedestal-pinpad</li>
   * </ul>
   * 
   * <p>For given Name of port on wireless base</p>
   * <ul>
   *   <li><B>Type6:</B> There are 2 serial ports on wireless base</li>
   *   <li>wireless-rs232</li>
   *   <li>wireless-pinpad</li>
   * </ul>
   * 
   * @return {@link com.vfi.smartpos.deviceservice.aidl.ISerialPort}
   * @since 1.x.x
   */
  public com.vfi.smartpos.deviceservice.aidl.ISerialPort getSerialPort(java.lang.String deviceType) throws android.os.RemoteException;
  /**
   * <p> get the IScanner interface object for scanner
   * 
   * @param cameraId 1:set front scanner, 0:set rear scanner
   * @return {@link com.vfi.smartpos.deviceservice.aidl.IScanner}
   * @since 1.x.x
   */
  public com.vfi.smartpos.deviceservice.aidl.IScanner getScanner(int cameraId) throws android.os.RemoteException;
  /**
   * <p> get the IMagCardReader interface object for magnetic card reader
   * 
   * @return {@link com.vfi.smartpos.deviceservice.aidl.IMagCardReader}
   * @since 1.x.x
   */
  public com.vfi.smartpos.deviceservice.aidl.IMagCardReader getMagCardReader() throws android.os.RemoteException;
  /**
   * <p> get the IInsertCardReader interface object for smart card and PSAM card
   * 
   * @param slotNo slotNo value as follow:
   * <ul>
   *     <li>{@code 0}:IC card slot</li>
   *     <li>{@code 1}:SAM1 card slot</li>
   *     <li>{@code 2}:SAM2 card slot</li>
   * </ul>
   * @return {@link com.vfi.smartpos.deviceservice.aidl.IInsertCardReader}
   * @since 1.x.x
   */
  public com.vfi.smartpos.deviceservice.aidl.IInsertCardReader getInsertCardReader(int slotNo) throws android.os.RemoteException;
  /**
   * <p> get the IRFCardReader interface object for CTLS card
   * 
   * @return {@link com.vfi.smartpos.deviceservice.aidl.IRFCardReader}
   * @since 1.x.x
   */
  public com.vfi.smartpos.deviceservice.aidl.IRFCardReader getRFCardReader() throws android.os.RemoteException;
  /**
   * <p>kapId get IPinpad interface object for Pinpad
   * 
   * @param kapId : the index refer the keys set
   * @return {@link com.vfi.smartpos.deviceservice.aidl.IPinpad}
   * @since 1.x.x
   */
  public com.vfi.smartpos.deviceservice.aidl.IPinpad getPinpad(int kapId) throws android.os.RemoteException;
  /**
   * <p> get IPrinter interface object for printer
   * 
   * @return {@link com.vfi.smartpos.deviceservice.aidl.IPrinter}
   * @since 1.x.x
   */
  public com.vfi.smartpos.deviceservice.aidl.IPrinter getPrinter() throws android.os.RemoteException;
  /**
   * <p> get IPBOC interface object for PBOC or EMV
   * 
   * @return {@link com.vfi.smartpos.deviceservice.aidl.IPBOC}
   * @since 1.x.x
   * @deprecated  please use IEMV to instead, {@see com.vfi.smartpos.deviceservice.aidl.IEMV}
   */
  @Deprecated
  public com.vfi.smartpos.deviceservice.aidl.IPBOC getPBOC() throws android.os.RemoteException;
  /**
   * <p> get IDeviceInfo interface object for device information
   * 
   * @return {@link com.vfi.smartpos.deviceservice.aidl.IDeviceInfo}
   * @since 1.x.x
   */
  public com.vfi.smartpos.deviceservice.aidl.IDeviceInfo getDeviceInfo() throws android.os.RemoteException;
  /**
   * <p>  get IExternalSerialPort interface object for external serial port
   * 
   * @return {@link com.vfi.smartpos.deviceservice.aidl.IExternalSerialPort}
   * @since 1.x.x
   */
  public com.vfi.smartpos.deviceservice.aidl.IExternalSerialPort getExternalSerialPort() throws android.os.RemoteException;
  /**
   * <p> get the usb-serial device(such as X9, C520H) connect with OTG cable
   * 
   * @return {@link com.vfi.smartpos.deviceservice.aidl.IUsbSerialPort}
   * @since 1.x.x
   */
  public com.vfi.smartpos.deviceservice.aidl.IUsbSerialPort getUsbSerialPort() throws android.os.RemoteException;
  /**
   * <p>slotNo slotNo value as follow:
   * <ul>
   *     <li>{@code 0}:IC card slot</li>
   *     <li>{@code 1}:SAM1 card slot</li>
   *     <li>{@code 2}:SAM2 card slot</li>
   * </ul>
   * @return {@link com.vfi.smartpos.deviceservice.aidl.ISmartCardReader}
   * @since 1.x.x
   */
  public com.vfi.smartpos.deviceservice.aidl.ISmartCardReader getSmartCardReader(int slotNo) throws android.os.RemoteException;
  /**
   * <p> get IEMV interface object.
   * 
   * @return {@link com.vfi.smartpos.deviceservice.aidl.IEMV}
   * @since 2.0.0
   */
  public com.vfi.smartpos.deviceservice.aidl.IEMV getEMV() throws android.os.RemoteException;
  /**
   * <p> get IDukpt interface object.
   * 
   * @return {@link com.vfi.smartpos.deviceservice.aidl.IDukpt}
   * @since 2.0.0
   */
  public com.vfi.smartpos.deviceservice.aidl.key_manager.IDukpt getDUKPT() throws android.os.RemoteException;
  /**
   * <p> get IFelica interface object
   * 
   * @return {@link com.vfi.smartpos.deviceservice.aidl.IFelica}
   * @since 2.1.23.1
   */
  public com.vfi.smartpos.deviceservice.aidl.card_reader.IFelica getFelica() throws android.os.RemoteException;
  /**
   * <p> get IUtils interface object
   * 
   * @return {@link com.vfi.smartpos.deviceservice.aidl.IUtils}
   * @since 2.4.3.1
   */
  public com.vfi.smartpos.deviceservice.aidl.utils.IUtils getUtils() throws android.os.RemoteException;
  /**
   * <p> get ISmartCardReaderEx interface object for logic card, such as AT24\AT88\SLE44
   * 
   * @return {@link com.vfi.smartpos.deviceservice.aidl.ISmartCardReaderEx}
   * @since 3.4.2.rc3
   */
  public com.vfi.smartpos.deviceservice.aidl.ISmartCardReaderEx getSmartCardReaderEx() throws android.os.RemoteException;
  /**
   * <p> get IKLD interface object
   * 
   * @return {@link com.vfi.smartpos.deviceservice.aidl.IKLD}
   * @since 3.3.2.rc3
   */
  public com.vfi.smartpos.deviceservice.aidl.key_manager.IKLD getIKLD() throws android.os.RemoteException;
  /**
   * <p> get INtagCard interface object
   * 
   * @return {@link com.vfi.smartpos.deviceservice.aidl.INtagCard}
   * @since 3.2.2.rc3
   */
  public com.vfi.smartpos.deviceservice.aidl.card_reader.INtagCard getNtag() throws android.os.RemoteException;
  /**
   * <p> get ICode interface object
   * 
   * @return {@link com.vfi.smartpos.deviceservice.aidl.IICodeCard}
   * @since 3.6.0
   */
  public com.vfi.smartpos.deviceservice.aidl.card_reader.IICodeCard getICode() throws android.os.RemoteException;
  /**
   * <p> get UltraLightCard interface object
   * Note: SP begin to support from V1.0.11(202111161359).vfuup
   * 
   * @return {@link com.vfi.smartpos.deviceservice.aidl.IUltraLightCard}
   * @since 3.11.0
   */
  public com.vfi.smartpos.deviceservice.aidl.card_reader.IUltraLightCard getUtrlLightManager() throws android.os.RemoteException;
  /**
   * <p> get IRSA interface object
   * 
   * @return {@link com.vfi.smartpos.deviceservice.aidl.IRSA}
   * @since 3.6.3.rc0213
   */
  public com.vfi.smartpos.deviceservice.aidl.key_manager.IRSA getIRSA() throws android.os.RemoteException;
  /**
   * <p> get UltraLightCardEV1 interface object
   * Note: SP begin to support from V1.0.11(202111161359).vfuup
   * 
   * @return {@link com.vfi.smartpos.deviceservice.aidl.IUltraLightEV1Card}
   * @since 3.11.0
   */
  public com.vfi.smartpos.deviceservice.aidl.card_reader.IUltraLightCardEV1 getUtrlLightEV1Manager() throws android.os.RemoteException;
  /**
   * <p> get UltraLightCCard interface object
   * Note: SP begin to support from V1.0.11(202111161359).vfuup
   * 
   * @return {@link com.vfi.smartpos.deviceservice.aidl.IUltraLightCCard}
   * @since 3.11.0
   */
  public com.vfi.smartpos.deviceservice.aidl.card_reader.IUltraLightCardC getUtrlLightCManager() throws android.os.RemoteException;
  /**
   * <p> get UltraLightCard interface object
   * Note: SP begin to support from V1.0.11(202111161359).vfuup
   * 
   * @return {@link com.vfi.smartpos.deviceservice.aidl.IUltraLightNANOCard}
   * @since 3.11.0
   */
  public com.vfi.smartpos.deviceservice.aidl.card_reader.IUltraLightCardNano getUtrlLightNanoManager() throws android.os.RemoteException;
  public com.vfi.smartpos.deviceservice.aidl.IWirelessBaseHelper getWirelessBaseHelper() throws android.os.RemoteException;
}
