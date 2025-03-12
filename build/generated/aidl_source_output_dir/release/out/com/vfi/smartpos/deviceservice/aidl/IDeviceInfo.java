/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.vfi.smartpos.deviceservice.aidl;
/** <p> get device information, including software and hardware information. */
public interface IDeviceInfo extends android.os.IInterface
{
  /** Default implementation for IDeviceInfo. */
  public static class Default implements com.vfi.smartpos.deviceservice.aidl.IDeviceInfo
  {
    /**
     * <p> get the serial number(SN) of the terminal.
     * @return {@code String}
     * @since 1.x.x
     */
    @Override public java.lang.String getSerialNo() throws android.os.RemoteException
    {
      return null;
    }
    /**
     * <p> get the IMSI of the terminal.
     * @return {@code String}
     * @since 1.x.x
     */
    @Override public java.lang.String getIMSI() throws android.os.RemoteException
    {
      return null;
    }
    /**
     * <p> get the IMEI of the terminal.
     * @return {@code String}
     * @since 1.x.x
     */
    @Override public java.lang.String getIMEI() throws android.os.RemoteException
    {
      return null;
    }
    /**
     * <p> get the ICCID of the SIM card which present.
     * @return {@code String}
     * @since 1.x.x
     */
    @Override public java.lang.String getICCID() throws android.os.RemoteException
    {
      return null;
    }
    /**
     * <p> get name of manufacture
     * @return {@code String}
     * @since 1.x.x
     */
    @Override public java.lang.String getManufacture() throws android.os.RemoteException
    {
      return null;
    }
    /**
     * <p> get model of the terminal
     * @return {@code String}
     * @since 1.x.x
     */
    @Override public java.lang.String getModel() throws android.os.RemoteException
    {
      return null;
    }
    /**
     * <p> get the version of the Android OS.
     * @return {@code String}
     * @since 1.x.x
     */
    @Override public java.lang.String getAndroidOSVersion() throws android.os.RemoteException
    {
      return null;
    }
    /**
     * <p> get the version of Android Kernel
     * @return {@code String}
     * @since 1.x.x
     */
    @Override public java.lang.String getAndroidKernelVersion() throws android.os.RemoteException
    {
      return null;
    }
    /**
     * <p> get the ROM version of Android.
     * @return {@code String}
     * @since 1.x.x
     */
    @Override public java.lang.String getROMVersion() throws android.os.RemoteException
    {
      return null;
    }
    /**
     * <p> get the firmare version of the terminal.
     * @return {@code String}
     * @since 1.x.x
     */
    @Override public java.lang.String getFirmwareVersion() throws android.os.RemoteException
    {
      return null;
    }
    /**
     * <p> get the hardware version
     * @return {@code String}
     * @since 1.x.x
     */
    @Override public java.lang.String getHardwareVersion() throws android.os.RemoteException
    {
      return null;
    }
    /**
     * <p> update the system time with setting
     * 
     * @param yyyyMMdd passing data param, data format is yyyyMMdd.
     * @param HHmmss passing time param, time format is HHmmss.
     * @return true:update system time success; false:update system time fail;
     * @since 1.x.x
     */
    @Override public boolean updateSystemTime(java.lang.String yyyyMMdd, java.lang.String HHmmss) throws android.os.RemoteException
    {
      return false;
    }
    /**
     * <p> set system function by bundle param.
     * Note: INSTALLERAUTOSTART function need ROM support. ROM begin to support from version V1.1.202111150949 INTLv7
     * <p><pre>{@code
     *      Bundle bundle = new Bundle();
     *      bundle.putBoolean("HOMEKEY", true);
     *      bundle.putBoolean("STATUSBARKEY", true);
     * }
     * </pre>
     * @param bundle
     * <ul>
     *     <li>key: HOMEKEY {@code String}; value: true/false @{@code boolean}; true;enable Home-Key, false:disable Home-Key</li>
     *     <li>key: STATUSBARKEY {@code String}; value: true/false @{@code boolean}; true;enable Status-Bar, false:disable Status-Bar</li>
     *     <li>key: INSTALLERAUTOSTART{@code String}; value: true/false @{@code boolean}; true(default) - usbInstaller app run automatically when OTG is connected, false - on the contrary</li>
     * </ul>
     * @return true:set system function success; false:set system function fail;
     * @since 1.x.x
     */
    @Override public boolean setSystemFunction(android.os.Bundle bundle) throws android.os.RemoteException
    {
      return false;
    }
    /**
     * <p> get the terminal UnionPay serial number.
     * 
     * @param mode, passing 0
     * @param input, passing random number for calculating the Mac value of terminal UnionPay serial number. byte array length is between 4 and 10 byte.
     * @return null if fail.
     * @deprecated
     * @since 1.x.x
     */
    @Override public com.vfi.smartpos.deviceservice.aidl.TusnData getTUSN(int mode, byte[] input) throws android.os.RemoteException
    {
      return null;
    }
    /**
     * <p> get the PN of the terminal.
     * 
     * @return {@code String}
     * @since 1.x.x
     */
    @Override public java.lang.String getPN() throws android.os.RemoteException
    {
      return null;
    }
    /**
     * <p> set power key disable or enable
     * 
     * @param status true - disable the power key, false - enable the power key
     * @return {@code String}
     * @since 1.x.x
     */
    @Override public void setPowerStatus(boolean status) throws android.os.RemoteException
    {
    }
    /**
     * <p> get the Total RAM. Unit is byte
     * 
     * @return {@code String}
     * @since 1.x.x
     */
    @Override public java.lang.String getRamTotal() throws android.os.RemoteException
    {
      return null;
    }
    /**
     * <p> get the available RAM capacity. Unit is byte.
     * 
     * @return {@code String}
     * @since 1.x.x
     */
    @Override public java.lang.String getRamAvailable() throws android.os.RemoteException
    {
      return null;
    }
    /**
     * <p> get the flash RAM capacity. Unit is byte.
     * 
     * @return {@code String}
     * @since 1.x.x
     */
    @Override public java.lang.String getRomTotal() throws android.os.RemoteException
    {
      return null;
    }
    /**
     * <p> get the available flash RAM capacity. Unit is byte.
     * 
     * @return {@code String}
     * @since 1.x.x
     */
    @Override public java.lang.String getRomAvailable() throws android.os.RemoteException
    {
      return null;
    }
    /**
     * <p> get the mobile data usage total amount. Unit is byte.
     * 
     * @return {@code String}
     * @since 1.x.x
     */
    @Override public java.lang.String getMobileDataUsageTotal() throws android.os.RemoteException
    {
      return null;
    }
    /**
     * <p> get the boot count.
     * 
     * @return {@code String}
     * @since 1.x.x
     */
    @Override public java.lang.String getBootCounts() throws android.os.RemoteException
    {
      return null;
    }
    /**
     * <p> get the print paper length. Unit is millimeter.
     * 
     * @return {@code String}
     * @since 1.x.x
     */
    @Override public java.lang.String getPrintPaperLen() throws android.os.RemoteException
    {
      return null;
    }
    /**
     * <p> get the times of magnetic card used.
     * 
     * @return {@code String}
     * @since 1.x.x
     */
    @Override public java.lang.String getMagCardUsedTimes() throws android.os.RemoteException
    {
      return null;
    }
    /**
     * <p> get the times of smart card used.
     * 
     * @return {@code String}
     * @since 1.x.x
     */
    @Override public java.lang.String getSmartCardUsedTimes() throws android.os.RemoteException
    {
      return null;
    }
    /**
     * <p> get the times of CTLS card used.
     * 
     * @return {@code String}
     * @since 1.x.x
     */
    @Override public java.lang.String getCTLSCardUsedTimes() throws android.os.RemoteException
    {
      return null;
    }
    /**
     * <p> get the Battery Temperaturd.
     * 
     * @return {@code String}
     * @since 1.x.x
     */
    @Override public java.lang.String getBatteryTemperature() throws android.os.RemoteException
    {
      return null;
    }
    /**
     * <p> get the Battery level.
     * 
     * @return {@code String}
     * @since 1.x.x
     */
    @Override public java.lang.String getBatteryLevel() throws android.os.RemoteException
    {
      return null;
    }
    /**
     * <p> get the k21 version.
     * 
     * @return {@code String}
     * @since 1.x.x
     */
    @Override public java.lang.String getK21Version() throws android.os.RemoteException
    {
      return null;
    }
    /**
     * <p> get the MEID info.
     * 
     * @return {@code String}
     * @since 1.x.x
     */
    @Override public java.lang.String getMEID() throws android.os.RemoteException
    {
      return null;
    }
    /**
     * <p> get the tampler code.
     * 
     * @return {@code String}
     * @since 1.x.x
     */
    @Override public java.lang.String getTamperCode() throws android.os.RemoteException
    {
      return null;
    }
    /**
     * <p> get the X990 Service Version.
     * 
     * @return {@code String}
     * @since 1.x.x
     */
    @Override public java.lang.String getServiceVersion() throws android.os.RemoteException
    {
      return null;
    }
    /**
     * <p> Get Kernel version.
     * 
     * @return {@code android.os.Bundle}
     * <p> The return Bundle object key: <ul>
     *    <li> @{Code String} SmartEMV</li>
     *    <li> @{Code String} Visa</li>
     *    <li> @{Code String} MasterCard</li>
     *    <li> @{Code String} JCB</li>
     *    <li> @{Code String} AMEX</li>
     *    <li> @{Code String} Discover</li>
     *    <li> @{Code String} QuickPass</li>
     *    <li> @{Code String} GemaltoPure</li>
     *    <li> @{Code String} RuPay</li>
     *    <li> @{Code String} Mir</li>
     * 
     *    <li> @{Code String} SmartEMV_Checksum_0_0_1_1</li>
     *    <li> @{Code String} Visa_Checksum_0_0_1_0</li>
     *    <li> @{Code String} MasterCard_Checksum_0_0_1_1</li>
     *    <li> @{Code String} JCB_Checksum_0_0_2_0</li>
     *    <li> @{Code String} AMEX_Checksum_0_0_2_0</li>
     *    <li> @{Code String} Discover_Checksum_0_0_1_0</li>
     *    <li> @{Code String} QuickPass_Checksum_0_0_1_0</li>
     *    <li> @{Code String} GemaltoPure_Checksum_0_0_1_0</li>
     *    <li> @{Code String} RuPay_Checksum_0_0_1_0</li>
     *    <li> @{Code String} Mir_Checksum_0_0_1_0</li>
     * 
     *    <li> @{Code String} SmartEMV_Expiration_0_0_1_1</li>
     *    <li> @{Code String} Visa_Expiration_0_0_1_0</li>
     *    <li> @{Code String} MasterCard_Expiration_0_0_1_1</li>
     *    <li> @{Code String} JCB_Expiration_0_0_2_0</li>
     *    <li> @{Code String} AMEX_Expiration_0_0_2_0</li>
     *    <li> @{Code String} Discover_Expiration_0_0_1_0</li>
     *    <li> @{Code String} QuickPass_Expiration_0_0_1_0</li>
     *    <li> @{Code String} GemaltoPure_Expiration_0_0_1_0</li>
     *    <li> @{Code String} RuPay_Expiration_0_0_1_0</li>
     *    <li> @{Code String} Mir_Expiration_0_0_1_0</li>
     * </ul>
     * <p><pre>{@code
     *     String smartEMV = bundle.getString("SmartEMV");
     *     String visa = bundle.getString("Visa");
     *     String masterCard = bundle.getString("MasterCard");
     *     String jcb = bundle.getString("JCB");
     *     String amex = bundle.getString("AMEX");
     *     String discover = bundle.getString("Discover");
     *     String quickPass = bundle.getString("QuickPass");
     *     String gemaltoPure = bundle.getString("GemaltoPure");
     * }
     * </pre>
     * @since 1.x.x
     */
    @Override public android.os.Bundle getKernelVersion() throws android.os.RemoteException
    {
      return null;
    }
    /**
     * <p> Get certificate.
     * @param mode 0 : sponsor digest; others : not support.
     * @return {@code String} if param is 0, return sponsor digest certificate. Otherwise, retuen "";
     * @since 1.x.x
     */
    @Override public java.lang.String getCertificate(int mode) throws android.os.RemoteException
    {
      return null;
    }
    /**
     * <p> Get Battery charging times.
     * @return {@code String}
     * @since 1.x.x
     */
    @Override public java.lang.String getBatteryChargingTimes() throws android.os.RemoteException
    {
      return null;
    }
    /**
     * <p> get device status
     * @param {@link android.os.Bundle}
     * <p><pre>{@code
     *      Bundle bundle = new Bundle();
     *      bundle.putString("DeviceType", "PRINTER");
     * }
     * </pre>
     * <p>the values of DeviceType:
     * <ul>
     *   <li>@{code String}"PRINTER"</li>
     *   <li>@{code String}"ICCARDREADER_SLOT1"</li>
     *   <li>@{code String}"ICCARDREADER_SLOT2"</li>
     *   <li>@{code String}"RFCARDREADER"</li>
     *   <li>@{code String}"SAMCARDREADER_SLOT1"</li>
     *   <li>@{code String}"SAMCARDREADER_SLOT2"</li>
     *   <li>@{code String}"PINPAD"</li>
     *   <li>@{code String}"CAMERA_FRONT"</li>
     *   <li>@{code String}"CAMERA_REAR"</li>
     *   <li>@{code String}"SDCARD"</li>
     * </ul>
     * @return 0:normal; -1:abnormal.
     * @since 1.x.x
     */
    @Override public int getDeviceStatus(android.os.Bundle bundle) throws android.os.RemoteException
    {
      return 0;
    }
    /**
     * <p> get button battery voltage
     * @return value of voltage
     * @since 1.x.x
     */
    @Override public java.lang.String getButtonBatteryVol() throws android.os.RemoteException
    {
      return null;
    }
    /**
     * get information of device
     * @return - the key of bundle :
     * <ul>
     *   <li>{code String}SN (description:Serial No)</li>
     *   <li>{code String}PN (description:Product No)</li>
     *   <li>{code String}IMSI</li>
     *   <li>{code String}IMEI (description:International Mobile Equipment Identity)</li>
     *   <li>{code String}MEID (description:Mobile Equipment Identifier)</li>
     *   <li>{code String}manufacture (description:get manufacture message)</li>
     *   <li>{code String}deviceModel (description:get device model)</li>
     *   <li>{code String}androidOsVer (description:get android OS version)</li>
     *   <li>{code String}androidKernalVer (description:get android kernel version)</li>
     *   <li>{code String}romVer (description:get rom version)</li>
     *   <li>{code String}firmwareVer (description:get firmware version)</li>
     *   <li>{code String}hardwareVer (description:get hardware version)</li>
     *   <li>{code String}SPVer (description:get SP version)</li>
     *   <li>{code String}VFSerivceVer (description:get VFService version)</li>
     *   <li>{code String}VRKSn (description:get VRK sn)</li>
     *   <li>{code String}SponsorID (description:get sponsor id)</li>
     * </ul>
     * @since 1.x.x
     */
    @Override public android.os.Bundle getDeviceInfo() throws android.os.RemoteException
    {
      return null;
    }
    /**
     * Get information of device
     * @param getDevInfos - key is device info that you want to get, value is extension conditions(normally is "")
     * key include:
     * <ul>
     *      <li>{code String}SN (description:Serial No)</li>
     *      <li>{code String}PN (description:Product No)</li>
     *      <li>{code String}IMSI</li>
     *      <li>{code String}IMEI (description:International Mobile Equipment Identity)</li>
     *      <li>{code String}MEID (description:Mobile Equipment Identifier)</li>
     *      <li>{code String}manufacture (description:get manufacture message)</li>
     *      <li>{code String}deviceModel (description:get device model)</li>
     *      <li>{code String}androidOsVer (description:get android OS version)</li>
     *      <li>{code String}androidKernalVer (description:get android kernel version)</li>
     *      <li>{code String}romVer (description:get rom version)</li>
     *      <li>{code String}firmwareVer (description:get firmware version)</li>
     *      <li>{code String}hardwareVer (description:get hardware version)</li>
     *      <li>{code String}SPVer (description:get SP version)</li>
     *      <li>{code String}VFSerivceVer (description:get VFService version)</li>
     *      <li>{code String}VRKSn (description:get VRK sn)</li>
     *      <li>{code String}SponsorID (description:get sponsor HashValue)</li>
     *      <li>{code String}SponsorName (description:get sponsor Name)</li>
     *      <li>{code String}bootVer(description:get Boot version)</li>
     * </ul>
     * @return bundle - return info which you search by key input getDevInfos
     * @throws RemoteException
     * @since 3.11.1
     */
    @Override public android.os.Bundle getDeviceInfoEx(android.os.Bundle extrend) throws android.os.RemoteException
    {
      return null;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.vfi.smartpos.deviceservice.aidl.IDeviceInfo
  {
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.vfi.smartpos.deviceservice.aidl.IDeviceInfo interface,
     * generating a proxy if needed.
     */
    public static com.vfi.smartpos.deviceservice.aidl.IDeviceInfo asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.vfi.smartpos.deviceservice.aidl.IDeviceInfo))) {
        return ((com.vfi.smartpos.deviceservice.aidl.IDeviceInfo)iin);
      }
      return new com.vfi.smartpos.deviceservice.aidl.IDeviceInfo.Stub.Proxy(obj);
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
        case TRANSACTION_getSerialNo:
        {
          java.lang.String _result = this.getSerialNo();
          reply.writeNoException();
          reply.writeString(_result);
          break;
        }
        case TRANSACTION_getIMSI:
        {
          java.lang.String _result = this.getIMSI();
          reply.writeNoException();
          reply.writeString(_result);
          break;
        }
        case TRANSACTION_getIMEI:
        {
          java.lang.String _result = this.getIMEI();
          reply.writeNoException();
          reply.writeString(_result);
          break;
        }
        case TRANSACTION_getICCID:
        {
          java.lang.String _result = this.getICCID();
          reply.writeNoException();
          reply.writeString(_result);
          break;
        }
        case TRANSACTION_getManufacture:
        {
          java.lang.String _result = this.getManufacture();
          reply.writeNoException();
          reply.writeString(_result);
          break;
        }
        case TRANSACTION_getModel:
        {
          java.lang.String _result = this.getModel();
          reply.writeNoException();
          reply.writeString(_result);
          break;
        }
        case TRANSACTION_getAndroidOSVersion:
        {
          java.lang.String _result = this.getAndroidOSVersion();
          reply.writeNoException();
          reply.writeString(_result);
          break;
        }
        case TRANSACTION_getAndroidKernelVersion:
        {
          java.lang.String _result = this.getAndroidKernelVersion();
          reply.writeNoException();
          reply.writeString(_result);
          break;
        }
        case TRANSACTION_getROMVersion:
        {
          java.lang.String _result = this.getROMVersion();
          reply.writeNoException();
          reply.writeString(_result);
          break;
        }
        case TRANSACTION_getFirmwareVersion:
        {
          java.lang.String _result = this.getFirmwareVersion();
          reply.writeNoException();
          reply.writeString(_result);
          break;
        }
        case TRANSACTION_getHardwareVersion:
        {
          java.lang.String _result = this.getHardwareVersion();
          reply.writeNoException();
          reply.writeString(_result);
          break;
        }
        case TRANSACTION_updateSystemTime:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          java.lang.String _arg1;
          _arg1 = data.readString();
          boolean _result = this.updateSystemTime(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        case TRANSACTION_setSystemFunction:
        {
          android.os.Bundle _arg0;
          _arg0 = _Parcel.readTypedObject(data, android.os.Bundle.CREATOR);
          boolean _result = this.setSystemFunction(_arg0);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        case TRANSACTION_getTUSN:
        {
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          com.vfi.smartpos.deviceservice.aidl.TusnData _result = this.getTUSN(_arg0, _arg1);
          reply.writeNoException();
          _Parcel.writeTypedObject(reply, _result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          break;
        }
        case TRANSACTION_getPN:
        {
          java.lang.String _result = this.getPN();
          reply.writeNoException();
          reply.writeString(_result);
          break;
        }
        case TRANSACTION_setPowerStatus:
        {
          boolean _arg0;
          _arg0 = (0!=data.readInt());
          this.setPowerStatus(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_getRamTotal:
        {
          java.lang.String _result = this.getRamTotal();
          reply.writeNoException();
          reply.writeString(_result);
          break;
        }
        case TRANSACTION_getRamAvailable:
        {
          java.lang.String _result = this.getRamAvailable();
          reply.writeNoException();
          reply.writeString(_result);
          break;
        }
        case TRANSACTION_getRomTotal:
        {
          java.lang.String _result = this.getRomTotal();
          reply.writeNoException();
          reply.writeString(_result);
          break;
        }
        case TRANSACTION_getRomAvailable:
        {
          java.lang.String _result = this.getRomAvailable();
          reply.writeNoException();
          reply.writeString(_result);
          break;
        }
        case TRANSACTION_getMobileDataUsageTotal:
        {
          java.lang.String _result = this.getMobileDataUsageTotal();
          reply.writeNoException();
          reply.writeString(_result);
          break;
        }
        case TRANSACTION_getBootCounts:
        {
          java.lang.String _result = this.getBootCounts();
          reply.writeNoException();
          reply.writeString(_result);
          break;
        }
        case TRANSACTION_getPrintPaperLen:
        {
          java.lang.String _result = this.getPrintPaperLen();
          reply.writeNoException();
          reply.writeString(_result);
          break;
        }
        case TRANSACTION_getMagCardUsedTimes:
        {
          java.lang.String _result = this.getMagCardUsedTimes();
          reply.writeNoException();
          reply.writeString(_result);
          break;
        }
        case TRANSACTION_getSmartCardUsedTimes:
        {
          java.lang.String _result = this.getSmartCardUsedTimes();
          reply.writeNoException();
          reply.writeString(_result);
          break;
        }
        case TRANSACTION_getCTLSCardUsedTimes:
        {
          java.lang.String _result = this.getCTLSCardUsedTimes();
          reply.writeNoException();
          reply.writeString(_result);
          break;
        }
        case TRANSACTION_getBatteryTemperature:
        {
          java.lang.String _result = this.getBatteryTemperature();
          reply.writeNoException();
          reply.writeString(_result);
          break;
        }
        case TRANSACTION_getBatteryLevel:
        {
          java.lang.String _result = this.getBatteryLevel();
          reply.writeNoException();
          reply.writeString(_result);
          break;
        }
        case TRANSACTION_getK21Version:
        {
          java.lang.String _result = this.getK21Version();
          reply.writeNoException();
          reply.writeString(_result);
          break;
        }
        case TRANSACTION_getMEID:
        {
          java.lang.String _result = this.getMEID();
          reply.writeNoException();
          reply.writeString(_result);
          break;
        }
        case TRANSACTION_getTamperCode:
        {
          java.lang.String _result = this.getTamperCode();
          reply.writeNoException();
          reply.writeString(_result);
          break;
        }
        case TRANSACTION_getServiceVersion:
        {
          java.lang.String _result = this.getServiceVersion();
          reply.writeNoException();
          reply.writeString(_result);
          break;
        }
        case TRANSACTION_getKernelVersion:
        {
          android.os.Bundle _result = this.getKernelVersion();
          reply.writeNoException();
          _Parcel.writeTypedObject(reply, _result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          break;
        }
        case TRANSACTION_getCertificate:
        {
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _result = this.getCertificate(_arg0);
          reply.writeNoException();
          reply.writeString(_result);
          break;
        }
        case TRANSACTION_getBatteryChargingTimes:
        {
          java.lang.String _result = this.getBatteryChargingTimes();
          reply.writeNoException();
          reply.writeString(_result);
          break;
        }
        case TRANSACTION_getDeviceStatus:
        {
          android.os.Bundle _arg0;
          _arg0 = _Parcel.readTypedObject(data, android.os.Bundle.CREATOR);
          int _result = this.getDeviceStatus(_arg0);
          reply.writeNoException();
          reply.writeInt(_result);
          break;
        }
        case TRANSACTION_getButtonBatteryVol:
        {
          java.lang.String _result = this.getButtonBatteryVol();
          reply.writeNoException();
          reply.writeString(_result);
          break;
        }
        case TRANSACTION_getDeviceInfo:
        {
          android.os.Bundle _result = this.getDeviceInfo();
          reply.writeNoException();
          _Parcel.writeTypedObject(reply, _result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          break;
        }
        case TRANSACTION_getDeviceInfoEx:
        {
          android.os.Bundle _arg0;
          _arg0 = _Parcel.readTypedObject(data, android.os.Bundle.CREATOR);
          android.os.Bundle _result = this.getDeviceInfoEx(_arg0);
          reply.writeNoException();
          _Parcel.writeTypedObject(reply, _result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static class Proxy implements com.vfi.smartpos.deviceservice.aidl.IDeviceInfo
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
       * <p> get the serial number(SN) of the terminal.
       * @return {@code String}
       * @since 1.x.x
       */
      @Override public java.lang.String getSerialNo() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getSerialNo, _data, _reply, 0);
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
       * <p> get the IMSI of the terminal.
       * @return {@code String}
       * @since 1.x.x
       */
      @Override public java.lang.String getIMSI() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getIMSI, _data, _reply, 0);
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
       * <p> get the IMEI of the terminal.
       * @return {@code String}
       * @since 1.x.x
       */
      @Override public java.lang.String getIMEI() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getIMEI, _data, _reply, 0);
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
       * <p> get the ICCID of the SIM card which present.
       * @return {@code String}
       * @since 1.x.x
       */
      @Override public java.lang.String getICCID() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getICCID, _data, _reply, 0);
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
       * <p> get name of manufacture
       * @return {@code String}
       * @since 1.x.x
       */
      @Override public java.lang.String getManufacture() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getManufacture, _data, _reply, 0);
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
       * <p> get model of the terminal
       * @return {@code String}
       * @since 1.x.x
       */
      @Override public java.lang.String getModel() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getModel, _data, _reply, 0);
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
       * <p> get the version of the Android OS.
       * @return {@code String}
       * @since 1.x.x
       */
      @Override public java.lang.String getAndroidOSVersion() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getAndroidOSVersion, _data, _reply, 0);
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
       * <p> get the version of Android Kernel
       * @return {@code String}
       * @since 1.x.x
       */
      @Override public java.lang.String getAndroidKernelVersion() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getAndroidKernelVersion, _data, _reply, 0);
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
       * <p> get the ROM version of Android.
       * @return {@code String}
       * @since 1.x.x
       */
      @Override public java.lang.String getROMVersion() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getROMVersion, _data, _reply, 0);
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
       * <p> get the firmare version of the terminal.
       * @return {@code String}
       * @since 1.x.x
       */
      @Override public java.lang.String getFirmwareVersion() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getFirmwareVersion, _data, _reply, 0);
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
       * <p> get the hardware version
       * @return {@code String}
       * @since 1.x.x
       */
      @Override public java.lang.String getHardwareVersion() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getHardwareVersion, _data, _reply, 0);
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
       * <p> update the system time with setting
       * 
       * @param yyyyMMdd passing data param, data format is yyyyMMdd.
       * @param HHmmss passing time param, time format is HHmmss.
       * @return true:update system time success; false:update system time fail;
       * @since 1.x.x
       */
      @Override public boolean updateSystemTime(java.lang.String yyyyMMdd, java.lang.String HHmmss) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(yyyyMMdd);
          _data.writeString(HHmmss);
          boolean _status = mRemote.transact(Stub.TRANSACTION_updateSystemTime, _data, _reply, 0);
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
       * <p> set system function by bundle param.
       * Note: INSTALLERAUTOSTART function need ROM support. ROM begin to support from version V1.1.202111150949 INTLv7
       * <p><pre>{@code
       *      Bundle bundle = new Bundle();
       *      bundle.putBoolean("HOMEKEY", true);
       *      bundle.putBoolean("STATUSBARKEY", true);
       * }
       * </pre>
       * @param bundle
       * <ul>
       *     <li>key: HOMEKEY {@code String}; value: true/false @{@code boolean}; true;enable Home-Key, false:disable Home-Key</li>
       *     <li>key: STATUSBARKEY {@code String}; value: true/false @{@code boolean}; true;enable Status-Bar, false:disable Status-Bar</li>
       *     <li>key: INSTALLERAUTOSTART{@code String}; value: true/false @{@code boolean}; true(default) - usbInstaller app run automatically when OTG is connected, false - on the contrary</li>
       * </ul>
       * @return true:set system function success; false:set system function fail;
       * @since 1.x.x
       */
      @Override public boolean setSystemFunction(android.os.Bundle bundle) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _Parcel.writeTypedObject(_data, bundle, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setSystemFunction, _data, _reply, 0);
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
       * <p> get the terminal UnionPay serial number.
       * 
       * @param mode, passing 0
       * @param input, passing random number for calculating the Mac value of terminal UnionPay serial number. byte array length is between 4 and 10 byte.
       * @return null if fail.
       * @deprecated
       * @since 1.x.x
       */
      @Override public com.vfi.smartpos.deviceservice.aidl.TusnData getTUSN(int mode, byte[] input) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        com.vfi.smartpos.deviceservice.aidl.TusnData _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(mode);
          _data.writeByteArray(input);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getTUSN, _data, _reply, 0);
          _reply.readException();
          _result = _Parcel.readTypedObject(_reply, com.vfi.smartpos.deviceservice.aidl.TusnData.CREATOR);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * <p> get the PN of the terminal.
       * 
       * @return {@code String}
       * @since 1.x.x
       */
      @Override public java.lang.String getPN() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getPN, _data, _reply, 0);
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
       * <p> set power key disable or enable
       * 
       * @param status true - disable the power key, false - enable the power key
       * @return {@code String}
       * @since 1.x.x
       */
      @Override public void setPowerStatus(boolean status) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(((status)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_setPowerStatus, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * <p> get the Total RAM. Unit is byte
       * 
       * @return {@code String}
       * @since 1.x.x
       */
      @Override public java.lang.String getRamTotal() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getRamTotal, _data, _reply, 0);
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
       * <p> get the available RAM capacity. Unit is byte.
       * 
       * @return {@code String}
       * @since 1.x.x
       */
      @Override public java.lang.String getRamAvailable() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getRamAvailable, _data, _reply, 0);
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
       * <p> get the flash RAM capacity. Unit is byte.
       * 
       * @return {@code String}
       * @since 1.x.x
       */
      @Override public java.lang.String getRomTotal() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getRomTotal, _data, _reply, 0);
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
       * <p> get the available flash RAM capacity. Unit is byte.
       * 
       * @return {@code String}
       * @since 1.x.x
       */
      @Override public java.lang.String getRomAvailable() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getRomAvailable, _data, _reply, 0);
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
       * <p> get the mobile data usage total amount. Unit is byte.
       * 
       * @return {@code String}
       * @since 1.x.x
       */
      @Override public java.lang.String getMobileDataUsageTotal() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getMobileDataUsageTotal, _data, _reply, 0);
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
       * <p> get the boot count.
       * 
       * @return {@code String}
       * @since 1.x.x
       */
      @Override public java.lang.String getBootCounts() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getBootCounts, _data, _reply, 0);
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
       * <p> get the print paper length. Unit is millimeter.
       * 
       * @return {@code String}
       * @since 1.x.x
       */
      @Override public java.lang.String getPrintPaperLen() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getPrintPaperLen, _data, _reply, 0);
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
       * <p> get the times of magnetic card used.
       * 
       * @return {@code String}
       * @since 1.x.x
       */
      @Override public java.lang.String getMagCardUsedTimes() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getMagCardUsedTimes, _data, _reply, 0);
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
       * <p> get the times of smart card used.
       * 
       * @return {@code String}
       * @since 1.x.x
       */
      @Override public java.lang.String getSmartCardUsedTimes() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getSmartCardUsedTimes, _data, _reply, 0);
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
       * <p> get the times of CTLS card used.
       * 
       * @return {@code String}
       * @since 1.x.x
       */
      @Override public java.lang.String getCTLSCardUsedTimes() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getCTLSCardUsedTimes, _data, _reply, 0);
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
       * <p> get the Battery Temperaturd.
       * 
       * @return {@code String}
       * @since 1.x.x
       */
      @Override public java.lang.String getBatteryTemperature() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getBatteryTemperature, _data, _reply, 0);
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
       * <p> get the Battery level.
       * 
       * @return {@code String}
       * @since 1.x.x
       */
      @Override public java.lang.String getBatteryLevel() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getBatteryLevel, _data, _reply, 0);
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
       * <p> get the k21 version.
       * 
       * @return {@code String}
       * @since 1.x.x
       */
      @Override public java.lang.String getK21Version() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getK21Version, _data, _reply, 0);
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
       * <p> get the MEID info.
       * 
       * @return {@code String}
       * @since 1.x.x
       */
      @Override public java.lang.String getMEID() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getMEID, _data, _reply, 0);
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
       * <p> get the tampler code.
       * 
       * @return {@code String}
       * @since 1.x.x
       */
      @Override public java.lang.String getTamperCode() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getTamperCode, _data, _reply, 0);
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
       * <p> get the X990 Service Version.
       * 
       * @return {@code String}
       * @since 1.x.x
       */
      @Override public java.lang.String getServiceVersion() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getServiceVersion, _data, _reply, 0);
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
       * <p> Get Kernel version.
       * 
       * @return {@code android.os.Bundle}
       * <p> The return Bundle object key: <ul>
       *    <li> @{Code String} SmartEMV</li>
       *    <li> @{Code String} Visa</li>
       *    <li> @{Code String} MasterCard</li>
       *    <li> @{Code String} JCB</li>
       *    <li> @{Code String} AMEX</li>
       *    <li> @{Code String} Discover</li>
       *    <li> @{Code String} QuickPass</li>
       *    <li> @{Code String} GemaltoPure</li>
       *    <li> @{Code String} RuPay</li>
       *    <li> @{Code String} Mir</li>
       * 
       *    <li> @{Code String} SmartEMV_Checksum_0_0_1_1</li>
       *    <li> @{Code String} Visa_Checksum_0_0_1_0</li>
       *    <li> @{Code String} MasterCard_Checksum_0_0_1_1</li>
       *    <li> @{Code String} JCB_Checksum_0_0_2_0</li>
       *    <li> @{Code String} AMEX_Checksum_0_0_2_0</li>
       *    <li> @{Code String} Discover_Checksum_0_0_1_0</li>
       *    <li> @{Code String} QuickPass_Checksum_0_0_1_0</li>
       *    <li> @{Code String} GemaltoPure_Checksum_0_0_1_0</li>
       *    <li> @{Code String} RuPay_Checksum_0_0_1_0</li>
       *    <li> @{Code String} Mir_Checksum_0_0_1_0</li>
       * 
       *    <li> @{Code String} SmartEMV_Expiration_0_0_1_1</li>
       *    <li> @{Code String} Visa_Expiration_0_0_1_0</li>
       *    <li> @{Code String} MasterCard_Expiration_0_0_1_1</li>
       *    <li> @{Code String} JCB_Expiration_0_0_2_0</li>
       *    <li> @{Code String} AMEX_Expiration_0_0_2_0</li>
       *    <li> @{Code String} Discover_Expiration_0_0_1_0</li>
       *    <li> @{Code String} QuickPass_Expiration_0_0_1_0</li>
       *    <li> @{Code String} GemaltoPure_Expiration_0_0_1_0</li>
       *    <li> @{Code String} RuPay_Expiration_0_0_1_0</li>
       *    <li> @{Code String} Mir_Expiration_0_0_1_0</li>
       * </ul>
       * <p><pre>{@code
       *     String smartEMV = bundle.getString("SmartEMV");
       *     String visa = bundle.getString("Visa");
       *     String masterCard = bundle.getString("MasterCard");
       *     String jcb = bundle.getString("JCB");
       *     String amex = bundle.getString("AMEX");
       *     String discover = bundle.getString("Discover");
       *     String quickPass = bundle.getString("QuickPass");
       *     String gemaltoPure = bundle.getString("GemaltoPure");
       * }
       * </pre>
       * @since 1.x.x
       */
      @Override public android.os.Bundle getKernelVersion() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.os.Bundle _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getKernelVersion, _data, _reply, 0);
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
       * <p> Get certificate.
       * @param mode 0 : sponsor digest; others : not support.
       * @return {@code String} if param is 0, return sponsor digest certificate. Otherwise, retuen "";
       * @since 1.x.x
       */
      @Override public java.lang.String getCertificate(int mode) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(mode);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getCertificate, _data, _reply, 0);
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
       * <p> Get Battery charging times.
       * @return {@code String}
       * @since 1.x.x
       */
      @Override public java.lang.String getBatteryChargingTimes() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getBatteryChargingTimes, _data, _reply, 0);
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
       * <p> get device status
       * @param {@link android.os.Bundle}
       * <p><pre>{@code
       *      Bundle bundle = new Bundle();
       *      bundle.putString("DeviceType", "PRINTER");
       * }
       * </pre>
       * <p>the values of DeviceType:
       * <ul>
       *   <li>@{code String}"PRINTER"</li>
       *   <li>@{code String}"ICCARDREADER_SLOT1"</li>
       *   <li>@{code String}"ICCARDREADER_SLOT2"</li>
       *   <li>@{code String}"RFCARDREADER"</li>
       *   <li>@{code String}"SAMCARDREADER_SLOT1"</li>
       *   <li>@{code String}"SAMCARDREADER_SLOT2"</li>
       *   <li>@{code String}"PINPAD"</li>
       *   <li>@{code String}"CAMERA_FRONT"</li>
       *   <li>@{code String}"CAMERA_REAR"</li>
       *   <li>@{code String}"SDCARD"</li>
       * </ul>
       * @return 0:normal; -1:abnormal.
       * @since 1.x.x
       */
      @Override public int getDeviceStatus(android.os.Bundle bundle) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _Parcel.writeTypedObject(_data, bundle, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getDeviceStatus, _data, _reply, 0);
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
       * <p> get button battery voltage
       * @return value of voltage
       * @since 1.x.x
       */
      @Override public java.lang.String getButtonBatteryVol() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getButtonBatteryVol, _data, _reply, 0);
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
       * get information of device
       * @return - the key of bundle :
       * <ul>
       *   <li>{code String}SN (description:Serial No)</li>
       *   <li>{code String}PN (description:Product No)</li>
       *   <li>{code String}IMSI</li>
       *   <li>{code String}IMEI (description:International Mobile Equipment Identity)</li>
       *   <li>{code String}MEID (description:Mobile Equipment Identifier)</li>
       *   <li>{code String}manufacture (description:get manufacture message)</li>
       *   <li>{code String}deviceModel (description:get device model)</li>
       *   <li>{code String}androidOsVer (description:get android OS version)</li>
       *   <li>{code String}androidKernalVer (description:get android kernel version)</li>
       *   <li>{code String}romVer (description:get rom version)</li>
       *   <li>{code String}firmwareVer (description:get firmware version)</li>
       *   <li>{code String}hardwareVer (description:get hardware version)</li>
       *   <li>{code String}SPVer (description:get SP version)</li>
       *   <li>{code String}VFSerivceVer (description:get VFService version)</li>
       *   <li>{code String}VRKSn (description:get VRK sn)</li>
       *   <li>{code String}SponsorID (description:get sponsor id)</li>
       * </ul>
       * @since 1.x.x
       */
      @Override public android.os.Bundle getDeviceInfo() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.os.Bundle _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getDeviceInfo, _data, _reply, 0);
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
       * Get information of device
       * @param getDevInfos - key is device info that you want to get, value is extension conditions(normally is "")
       * key include:
       * <ul>
       *      <li>{code String}SN (description:Serial No)</li>
       *      <li>{code String}PN (description:Product No)</li>
       *      <li>{code String}IMSI</li>
       *      <li>{code String}IMEI (description:International Mobile Equipment Identity)</li>
       *      <li>{code String}MEID (description:Mobile Equipment Identifier)</li>
       *      <li>{code String}manufacture (description:get manufacture message)</li>
       *      <li>{code String}deviceModel (description:get device model)</li>
       *      <li>{code String}androidOsVer (description:get android OS version)</li>
       *      <li>{code String}androidKernalVer (description:get android kernel version)</li>
       *      <li>{code String}romVer (description:get rom version)</li>
       *      <li>{code String}firmwareVer (description:get firmware version)</li>
       *      <li>{code String}hardwareVer (description:get hardware version)</li>
       *      <li>{code String}SPVer (description:get SP version)</li>
       *      <li>{code String}VFSerivceVer (description:get VFService version)</li>
       *      <li>{code String}VRKSn (description:get VRK sn)</li>
       *      <li>{code String}SponsorID (description:get sponsor HashValue)</li>
       *      <li>{code String}SponsorName (description:get sponsor Name)</li>
       *      <li>{code String}bootVer(description:get Boot version)</li>
       * </ul>
       * @return bundle - return info which you search by key input getDevInfos
       * @throws RemoteException
       * @since 3.11.1
       */
      @Override public android.os.Bundle getDeviceInfoEx(android.os.Bundle extrend) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.os.Bundle _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _Parcel.writeTypedObject(_data, extrend, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getDeviceInfoEx, _data, _reply, 0);
          _reply.readException();
          _result = _Parcel.readTypedObject(_reply, android.os.Bundle.CREATOR);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
    }
    static final int TRANSACTION_getSerialNo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_getIMSI = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_getIMEI = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_getICCID = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_getManufacture = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_getModel = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_getAndroidOSVersion = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_getAndroidKernelVersion = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_getROMVersion = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    static final int TRANSACTION_getFirmwareVersion = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
    static final int TRANSACTION_getHardwareVersion = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
    static final int TRANSACTION_updateSystemTime = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
    static final int TRANSACTION_setSystemFunction = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
    static final int TRANSACTION_getTUSN = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
    static final int TRANSACTION_getPN = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
    static final int TRANSACTION_setPowerStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
    static final int TRANSACTION_getRamTotal = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
    static final int TRANSACTION_getRamAvailable = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
    static final int TRANSACTION_getRomTotal = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
    static final int TRANSACTION_getRomAvailable = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
    static final int TRANSACTION_getMobileDataUsageTotal = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
    static final int TRANSACTION_getBootCounts = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
    static final int TRANSACTION_getPrintPaperLen = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
    static final int TRANSACTION_getMagCardUsedTimes = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
    static final int TRANSACTION_getSmartCardUsedTimes = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
    static final int TRANSACTION_getCTLSCardUsedTimes = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
    static final int TRANSACTION_getBatteryTemperature = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
    static final int TRANSACTION_getBatteryLevel = (android.os.IBinder.FIRST_CALL_TRANSACTION + 27);
    static final int TRANSACTION_getK21Version = (android.os.IBinder.FIRST_CALL_TRANSACTION + 28);
    static final int TRANSACTION_getMEID = (android.os.IBinder.FIRST_CALL_TRANSACTION + 29);
    static final int TRANSACTION_getTamperCode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 30);
    static final int TRANSACTION_getServiceVersion = (android.os.IBinder.FIRST_CALL_TRANSACTION + 31);
    static final int TRANSACTION_getKernelVersion = (android.os.IBinder.FIRST_CALL_TRANSACTION + 32);
    static final int TRANSACTION_getCertificate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 33);
    static final int TRANSACTION_getBatteryChargingTimes = (android.os.IBinder.FIRST_CALL_TRANSACTION + 34);
    static final int TRANSACTION_getDeviceStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 35);
    static final int TRANSACTION_getButtonBatteryVol = (android.os.IBinder.FIRST_CALL_TRANSACTION + 36);
    static final int TRANSACTION_getDeviceInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 37);
    static final int TRANSACTION_getDeviceInfoEx = (android.os.IBinder.FIRST_CALL_TRANSACTION + 38);
  }
  public static final java.lang.String DESCRIPTOR = "com.vfi.smartpos.deviceservice.aidl.IDeviceInfo";
  /**
   * <p> get the serial number(SN) of the terminal.
   * @return {@code String}
   * @since 1.x.x
   */
  public java.lang.String getSerialNo() throws android.os.RemoteException;
  /**
   * <p> get the IMSI of the terminal.
   * @return {@code String}
   * @since 1.x.x
   */
  public java.lang.String getIMSI() throws android.os.RemoteException;
  /**
   * <p> get the IMEI of the terminal.
   * @return {@code String}
   * @since 1.x.x
   */
  public java.lang.String getIMEI() throws android.os.RemoteException;
  /**
   * <p> get the ICCID of the SIM card which present.
   * @return {@code String}
   * @since 1.x.x
   */
  public java.lang.String getICCID() throws android.os.RemoteException;
  /**
   * <p> get name of manufacture
   * @return {@code String}
   * @since 1.x.x
   */
  public java.lang.String getManufacture() throws android.os.RemoteException;
  /**
   * <p> get model of the terminal
   * @return {@code String}
   * @since 1.x.x
   */
  public java.lang.String getModel() throws android.os.RemoteException;
  /**
   * <p> get the version of the Android OS.
   * @return {@code String}
   * @since 1.x.x
   */
  public java.lang.String getAndroidOSVersion() throws android.os.RemoteException;
  /**
   * <p> get the version of Android Kernel
   * @return {@code String}
   * @since 1.x.x
   */
  public java.lang.String getAndroidKernelVersion() throws android.os.RemoteException;
  /**
   * <p> get the ROM version of Android.
   * @return {@code String}
   * @since 1.x.x
   */
  public java.lang.String getROMVersion() throws android.os.RemoteException;
  /**
   * <p> get the firmare version of the terminal.
   * @return {@code String}
   * @since 1.x.x
   */
  public java.lang.String getFirmwareVersion() throws android.os.RemoteException;
  /**
   * <p> get the hardware version
   * @return {@code String}
   * @since 1.x.x
   */
  public java.lang.String getHardwareVersion() throws android.os.RemoteException;
  /**
   * <p> update the system time with setting
   * 
   * @param yyyyMMdd passing data param, data format is yyyyMMdd.
   * @param HHmmss passing time param, time format is HHmmss.
   * @return true:update system time success; false:update system time fail;
   * @since 1.x.x
   */
  public boolean updateSystemTime(java.lang.String yyyyMMdd, java.lang.String HHmmss) throws android.os.RemoteException;
  /**
   * <p> set system function by bundle param.
   * Note: INSTALLERAUTOSTART function need ROM support. ROM begin to support from version V1.1.202111150949 INTLv7
   * <p><pre>{@code
   *      Bundle bundle = new Bundle();
   *      bundle.putBoolean("HOMEKEY", true);
   *      bundle.putBoolean("STATUSBARKEY", true);
   * }
   * </pre>
   * @param bundle
   * <ul>
   *     <li>key: HOMEKEY {@code String}; value: true/false @{@code boolean}; true;enable Home-Key, false:disable Home-Key</li>
   *     <li>key: STATUSBARKEY {@code String}; value: true/false @{@code boolean}; true;enable Status-Bar, false:disable Status-Bar</li>
   *     <li>key: INSTALLERAUTOSTART{@code String}; value: true/false @{@code boolean}; true(default) - usbInstaller app run automatically when OTG is connected, false - on the contrary</li>
   * </ul>
   * @return true:set system function success; false:set system function fail;
   * @since 1.x.x
   */
  public boolean setSystemFunction(android.os.Bundle bundle) throws android.os.RemoteException;
  /**
   * <p> get the terminal UnionPay serial number.
   * 
   * @param mode, passing 0
   * @param input, passing random number for calculating the Mac value of terminal UnionPay serial number. byte array length is between 4 and 10 byte.
   * @return null if fail.
   * @deprecated
   * @since 1.x.x
   */
  @Deprecated
  public com.vfi.smartpos.deviceservice.aidl.TusnData getTUSN(int mode, byte[] input) throws android.os.RemoteException;
  /**
   * <p> get the PN of the terminal.
   * 
   * @return {@code String}
   * @since 1.x.x
   */
  public java.lang.String getPN() throws android.os.RemoteException;
  /**
   * <p> set power key disable or enable
   * 
   * @param status true - disable the power key, false - enable the power key
   * @return {@code String}
   * @since 1.x.x
   */
  public void setPowerStatus(boolean status) throws android.os.RemoteException;
  /**
   * <p> get the Total RAM. Unit is byte
   * 
   * @return {@code String}
   * @since 1.x.x
   */
  public java.lang.String getRamTotal() throws android.os.RemoteException;
  /**
   * <p> get the available RAM capacity. Unit is byte.
   * 
   * @return {@code String}
   * @since 1.x.x
   */
  public java.lang.String getRamAvailable() throws android.os.RemoteException;
  /**
   * <p> get the flash RAM capacity. Unit is byte.
   * 
   * @return {@code String}
   * @since 1.x.x
   */
  public java.lang.String getRomTotal() throws android.os.RemoteException;
  /**
   * <p> get the available flash RAM capacity. Unit is byte.
   * 
   * @return {@code String}
   * @since 1.x.x
   */
  public java.lang.String getRomAvailable() throws android.os.RemoteException;
  /**
   * <p> get the mobile data usage total amount. Unit is byte.
   * 
   * @return {@code String}
   * @since 1.x.x
   */
  public java.lang.String getMobileDataUsageTotal() throws android.os.RemoteException;
  /**
   * <p> get the boot count.
   * 
   * @return {@code String}
   * @since 1.x.x
   */
  public java.lang.String getBootCounts() throws android.os.RemoteException;
  /**
   * <p> get the print paper length. Unit is millimeter.
   * 
   * @return {@code String}
   * @since 1.x.x
   */
  public java.lang.String getPrintPaperLen() throws android.os.RemoteException;
  /**
   * <p> get the times of magnetic card used.
   * 
   * @return {@code String}
   * @since 1.x.x
   */
  public java.lang.String getMagCardUsedTimes() throws android.os.RemoteException;
  /**
   * <p> get the times of smart card used.
   * 
   * @return {@code String}
   * @since 1.x.x
   */
  public java.lang.String getSmartCardUsedTimes() throws android.os.RemoteException;
  /**
   * <p> get the times of CTLS card used.
   * 
   * @return {@code String}
   * @since 1.x.x
   */
  public java.lang.String getCTLSCardUsedTimes() throws android.os.RemoteException;
  /**
   * <p> get the Battery Temperaturd.
   * 
   * @return {@code String}
   * @since 1.x.x
   */
  public java.lang.String getBatteryTemperature() throws android.os.RemoteException;
  /**
   * <p> get the Battery level.
   * 
   * @return {@code String}
   * @since 1.x.x
   */
  public java.lang.String getBatteryLevel() throws android.os.RemoteException;
  /**
   * <p> get the k21 version.
   * 
   * @return {@code String}
   * @since 1.x.x
   */
  public java.lang.String getK21Version() throws android.os.RemoteException;
  /**
   * <p> get the MEID info.
   * 
   * @return {@code String}
   * @since 1.x.x
   */
  public java.lang.String getMEID() throws android.os.RemoteException;
  /**
   * <p> get the tampler code.
   * 
   * @return {@code String}
   * @since 1.x.x
   */
  public java.lang.String getTamperCode() throws android.os.RemoteException;
  /**
   * <p> get the X990 Service Version.
   * 
   * @return {@code String}
   * @since 1.x.x
   */
  public java.lang.String getServiceVersion() throws android.os.RemoteException;
  /**
   * <p> Get Kernel version.
   * 
   * @return {@code android.os.Bundle}
   * <p> The return Bundle object key: <ul>
   *    <li> @{Code String} SmartEMV</li>
   *    <li> @{Code String} Visa</li>
   *    <li> @{Code String} MasterCard</li>
   *    <li> @{Code String} JCB</li>
   *    <li> @{Code String} AMEX</li>
   *    <li> @{Code String} Discover</li>
   *    <li> @{Code String} QuickPass</li>
   *    <li> @{Code String} GemaltoPure</li>
   *    <li> @{Code String} RuPay</li>
   *    <li> @{Code String} Mir</li>
   * 
   *    <li> @{Code String} SmartEMV_Checksum_0_0_1_1</li>
   *    <li> @{Code String} Visa_Checksum_0_0_1_0</li>
   *    <li> @{Code String} MasterCard_Checksum_0_0_1_1</li>
   *    <li> @{Code String} JCB_Checksum_0_0_2_0</li>
   *    <li> @{Code String} AMEX_Checksum_0_0_2_0</li>
   *    <li> @{Code String} Discover_Checksum_0_0_1_0</li>
   *    <li> @{Code String} QuickPass_Checksum_0_0_1_0</li>
   *    <li> @{Code String} GemaltoPure_Checksum_0_0_1_0</li>
   *    <li> @{Code String} RuPay_Checksum_0_0_1_0</li>
   *    <li> @{Code String} Mir_Checksum_0_0_1_0</li>
   * 
   *    <li> @{Code String} SmartEMV_Expiration_0_0_1_1</li>
   *    <li> @{Code String} Visa_Expiration_0_0_1_0</li>
   *    <li> @{Code String} MasterCard_Expiration_0_0_1_1</li>
   *    <li> @{Code String} JCB_Expiration_0_0_2_0</li>
   *    <li> @{Code String} AMEX_Expiration_0_0_2_0</li>
   *    <li> @{Code String} Discover_Expiration_0_0_1_0</li>
   *    <li> @{Code String} QuickPass_Expiration_0_0_1_0</li>
   *    <li> @{Code String} GemaltoPure_Expiration_0_0_1_0</li>
   *    <li> @{Code String} RuPay_Expiration_0_0_1_0</li>
   *    <li> @{Code String} Mir_Expiration_0_0_1_0</li>
   * </ul>
   * <p><pre>{@code
   *     String smartEMV = bundle.getString("SmartEMV");
   *     String visa = bundle.getString("Visa");
   *     String masterCard = bundle.getString("MasterCard");
   *     String jcb = bundle.getString("JCB");
   *     String amex = bundle.getString("AMEX");
   *     String discover = bundle.getString("Discover");
   *     String quickPass = bundle.getString("QuickPass");
   *     String gemaltoPure = bundle.getString("GemaltoPure");
   * }
   * </pre>
   * @since 1.x.x
   */
  public android.os.Bundle getKernelVersion() throws android.os.RemoteException;
  /**
   * <p> Get certificate.
   * @param mode 0 : sponsor digest; others : not support.
   * @return {@code String} if param is 0, return sponsor digest certificate. Otherwise, retuen "";
   * @since 1.x.x
   */
  public java.lang.String getCertificate(int mode) throws android.os.RemoteException;
  /**
   * <p> Get Battery charging times.
   * @return {@code String}
   * @since 1.x.x
   */
  public java.lang.String getBatteryChargingTimes() throws android.os.RemoteException;
  /**
   * <p> get device status
   * @param {@link android.os.Bundle}
   * <p><pre>{@code
   *      Bundle bundle = new Bundle();
   *      bundle.putString("DeviceType", "PRINTER");
   * }
   * </pre>
   * <p>the values of DeviceType:
   * <ul>
   *   <li>@{code String}"PRINTER"</li>
   *   <li>@{code String}"ICCARDREADER_SLOT1"</li>
   *   <li>@{code String}"ICCARDREADER_SLOT2"</li>
   *   <li>@{code String}"RFCARDREADER"</li>
   *   <li>@{code String}"SAMCARDREADER_SLOT1"</li>
   *   <li>@{code String}"SAMCARDREADER_SLOT2"</li>
   *   <li>@{code String}"PINPAD"</li>
   *   <li>@{code String}"CAMERA_FRONT"</li>
   *   <li>@{code String}"CAMERA_REAR"</li>
   *   <li>@{code String}"SDCARD"</li>
   * </ul>
   * @return 0:normal; -1:abnormal.
   * @since 1.x.x
   */
  public int getDeviceStatus(android.os.Bundle bundle) throws android.os.RemoteException;
  /**
   * <p> get button battery voltage
   * @return value of voltage
   * @since 1.x.x
   */
  public java.lang.String getButtonBatteryVol() throws android.os.RemoteException;
  /**
   * get information of device
   * @return - the key of bundle :
   * <ul>
   *   <li>{code String}SN (description:Serial No)</li>
   *   <li>{code String}PN (description:Product No)</li>
   *   <li>{code String}IMSI</li>
   *   <li>{code String}IMEI (description:International Mobile Equipment Identity)</li>
   *   <li>{code String}MEID (description:Mobile Equipment Identifier)</li>
   *   <li>{code String}manufacture (description:get manufacture message)</li>
   *   <li>{code String}deviceModel (description:get device model)</li>
   *   <li>{code String}androidOsVer (description:get android OS version)</li>
   *   <li>{code String}androidKernalVer (description:get android kernel version)</li>
   *   <li>{code String}romVer (description:get rom version)</li>
   *   <li>{code String}firmwareVer (description:get firmware version)</li>
   *   <li>{code String}hardwareVer (description:get hardware version)</li>
   *   <li>{code String}SPVer (description:get SP version)</li>
   *   <li>{code String}VFSerivceVer (description:get VFService version)</li>
   *   <li>{code String}VRKSn (description:get VRK sn)</li>
   *   <li>{code String}SponsorID (description:get sponsor id)</li>
   * </ul>
   * @since 1.x.x
   */
  public android.os.Bundle getDeviceInfo() throws android.os.RemoteException;
  /**
   * Get information of device
   * @param getDevInfos - key is device info that you want to get, value is extension conditions(normally is "")
   * key include:
   * <ul>
   *      <li>{code String}SN (description:Serial No)</li>
   *      <li>{code String}PN (description:Product No)</li>
   *      <li>{code String}IMSI</li>
   *      <li>{code String}IMEI (description:International Mobile Equipment Identity)</li>
   *      <li>{code String}MEID (description:Mobile Equipment Identifier)</li>
   *      <li>{code String}manufacture (description:get manufacture message)</li>
   *      <li>{code String}deviceModel (description:get device model)</li>
   *      <li>{code String}androidOsVer (description:get android OS version)</li>
   *      <li>{code String}androidKernalVer (description:get android kernel version)</li>
   *      <li>{code String}romVer (description:get rom version)</li>
   *      <li>{code String}firmwareVer (description:get firmware version)</li>
   *      <li>{code String}hardwareVer (description:get hardware version)</li>
   *      <li>{code String}SPVer (description:get SP version)</li>
   *      <li>{code String}VFSerivceVer (description:get VFService version)</li>
   *      <li>{code String}VRKSn (description:get VRK sn)</li>
   *      <li>{code String}SponsorID (description:get sponsor HashValue)</li>
   *      <li>{code String}SponsorName (description:get sponsor Name)</li>
   *      <li>{code String}bootVer(description:get Boot version)</li>
   * </ul>
   * @return bundle - return info which you search by key input getDevInfos
   * @throws RemoteException
   * @since 3.11.1
   */
  public android.os.Bundle getDeviceInfoEx(android.os.Bundle extrend) throws android.os.RemoteException;
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
