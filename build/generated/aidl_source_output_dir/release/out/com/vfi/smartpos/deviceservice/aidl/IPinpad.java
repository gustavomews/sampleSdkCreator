/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.vfi.smartpos.deviceservice.aidl;
/**
 * the object of PIN pad
 * download keys, data encrypt, pin input
 * @author Kai.L@verifone.cn, Chao.L@verifone.cn
 */
public interface IPinpad extends android.os.IInterface
{
  /** Default implementation for IPinpad. */
  public static class Default implements com.vfi.smartpos.deviceservice.aidl.IPinpad
  {
    /**
     * Check if Key is exists (just support ECB key)
     * 
     * @param keyType
     * <ul>
     * <li>0 MASTER(main) key</li>
     * <li>1 MAC key</li>
     * <li>2 PIN(work) key</li>
     * <li>3 TD key</li>
     * <li>4 (SM) MASTER key</li>
     * <li>5 (SM) MAC key</li>
     * <li>6 (SM) PIN key</li>
     * <li>7 (SM) TD key</li>
     * <li>8 (AES) MASTER key</li>
     * <li>9 (AES) MAC key</li>
     * <li>10 (AES) PIN key</li>
     * <li>11 (AES) TD key</li>
     * <li>12 dukpt key</li>
     * <li>13 TEK</li>
     * <li>14 (SM)TEK</li>
     * <li>15 (AES)TEK</li>
     * </ul>
     * @param keyId the id (dukpt index 0~4, other 0~99) of the key
     * @return true for exist, false for not exists
     * @since 1.x.x
     */
    @Override public boolean isKeyExist(int keyType, int keyId) throws android.os.RemoteException
    {
      return false;
    }
    /**
     * load plain TEK key(algorithm = 2, 3des plain key default)
     * 
     * TEK is the transfer key to encrypt master key
     * @param keyId the id (index) , from 0 to 99
     * @param the key
     * @param checkValue the check value
     * @return true on success, false on failure
     * @since 1.x.x
     * @deprecated pls use {@see #loadTEKEX} instead.
     */
    @Override public boolean loadTEK(int keyId, byte[] key, byte[] checkValue) throws android.os.RemoteException
    {
      return false;
    }
    /**
     * load TEK key with Algorithm Type (ECB default)
     * 
     * TEK is the transfer key to encrypt master key
     * @param keyId the id (index, 0 to 99)
     * @param key the key
     * @param algorithmType 1-3des encrypted key <BR>2-3des plain key <BR>3-SM4 encrypte key <BR>4-SM4 plain key <BR>5-AES encrypted key <BR>6-AES plain key
     * @param checkValue the check value
     * @return true on success, false on failure
     * @since 1.x.x
     * @deprecated pls use {@see #loadTEKEX} instead.
     */
    @Override public boolean loadTEKWithAlgorithmType(int keyId, byte[] key, byte algorithmType, byte[] checkValue) throws android.os.RemoteException
    {
      return false;
    }
    /**
     * load the encrypted master key (3des ECB algorithm, decrypt TEK index = 0)
     * 
     * @param keyId the id (index, 0 to 99)
     * @param key the encrypted key
     * @param checkValue check value (default NULL)
     * @return true on success, false on failure
     * @since 1.x.x
     * @deprecated pls use {@see #loadEncryptMainKeyEX} instead.
     */
    @Override public boolean loadEncryptMainKey(int keyId, byte[] key, byte[] checkValue) throws android.os.RemoteException
    {
      return false;
    }
    /**
     * load the encrypted master key given Algorithm Type (ECB, decrypt TEK index = 0)
     * 
     * @param keyId the id (index, 0 to 99)
     * @param key the encrypted key(encrypt by TEK)
     * @param algorithmType 1-3des algorithm <BR>3-SM4 algorithm <BR>5-AES algorithm
     * @param checkValue -  check value (default NULL)
     * @return true on success, false on failure
     * @since 1.x.x
     * @deprecated pls use {@see #loadEncryptMainKeyEX} instead.
     */
    @Override public boolean loadEncryptMainKeyWithAlgorithmType(int keyId, byte[] key, int algorithmType, byte[] checkValue) throws android.os.RemoteException
    {
      return false;
    }
    /**
     * load the plain master key(3des ECB algorithm default)
     * 
     * @param keyId the id (index)
     * @param key the key
     * @param checkValue the check value (default NULL)
     * @return true on success, false on failure
     * @since 1.x.x
     */
    @Override public boolean loadMainKey(int keyId, byte[] key, byte[] checkValue) throws android.os.RemoteException
    {
      return false;
    }
    /**
     * load the plain master key given the algorithm Type (support ECB\CBC)
     * 
     * @param keyId the id (index)
     * @param key the key
     * @param algorithmType
     * 0x02-3des ecb algorithm<BR> 0x04-SM4 ecb algorithm<BR> 0x06-AES ecb algorithm<BR>
     * 0x82-3des cbc algorithm<BR> 0x84-SM4 cbc algorithm<BR> 0x86-AES cbc algorithm<BR>
     * @param checkValue the check value (default NULL)
     * @return true on success, false on failure
     * @since 1.x.x
     */
    @Override public boolean loadMainKeyWithAlgorithmType(int keyId, byte[] key, int algorithmType, byte[] checkValue) throws android.os.RemoteException
    {
      return false;
    }
    /**
     * load the encrypt DUKPT key(decrypt TEK index = 0)
     * 
     * @param keyId the id (index 0~99)
     * @param ksn the key serial number
     * @param key the key
     * @param checkValue the check value (default NULL)
     * @return true on success, false on failure
     * @since 1.x.x
     * @deprecated pls use {@see com.vfi.smartpos.deviceservice.aidl.key_manager.IDukpt#loadDukptKey} instead.
     */
    @Override public boolean loadDukptKey(int keyId, byte[] ksn, byte[] key, byte[] checkValue) throws android.os.RemoteException
    {
      return false;
    }
    /**
     * load the work key (3DES ECB, decrypt by master key)
     * 
     * @param keyType select the workkey type: 1-MAC key, 2-PIN key, 3-TD key
     * @param mkId the id of master key for decrypt work key
     * @param keyId set the workkey id (index 0~99)
     * @param key the key (16bytes)
     * @param checkValue check value (null for none)
     * @return true on success, false on failure
     * @since 1.x.x
     * @deprecated pls use {@see #loadWorkKeyEX} instead.
     */
    @Override public boolean loadWorkKey(int keyType, int mkId, int wkId, byte[] key, byte[] checkValue) throws android.os.RemoteException
    {
      return false;
    }
    /**
     * load the work key given decrypt type
     * 
     * @param keyType select the workkey type<BR>
     *     |---1-MAC key, 2-PIN key, 3-TD key<BR>
     *     |---5-(SM4)MAC key, 6-(SM4)PIN key, 7-(SM4)TD key<BR>
     *     |---9-(AES)MAC key, 10-(AES)PIN key, 11-(AES)TD key<BR>
     * @param mkId the id of master key for decrypt work key
     * @param wkId set the workkey id (index 0~99)
     * @param decKeyType select decrypt key type<BR>
     *     |---0-3DES master key<BR>
     *     |---1-transport key<BR>
     *     |---2-SM4 master key<BR>
     *     |---3-AES master key<BR>
     * @param encrypt key
     * @param checkValue check value (null for none)
     * @return true on success, false on failure
     * @since 1.x.x
     * @deprecated pls use {@see #loadWorkKeyEX} instead.
     */
    @Override public boolean loadWorkKeyWithDecryptType(int keyType, int mkId, int wkId, int decKeyType, byte[] key, byte[] checkValue) throws android.os.RemoteException
    {
      return false;
    }
    /**
     * calcuate the MAC (3des default & X919)
     * 
     * @param keyId the index of MAC KEY
     * @param data the source date
     * @return the mac value, null means failure
     * @since 1.x.x
     * @deprecated pls use {@see #calcMACWithCalType} instead.
     */
    @Override public byte[] calcMAC(int keyId, byte[] data) throws android.os.RemoteException
    {
      return null;
    }
    /**
     * calcute the MAC with given type
     * 
     * @param keyId the index of MAC KEY(0~99) or dukpt key(0~4)
     * @param type Calculation mode 0x00-MAC X99; 0x01-MAC X919; 0x02-ECB (CUP standard ECB algorithm); 0x03-MAC 9606; 0x04-CBC MAC calculation
     * @param CBCInitVec - CBC initial vector. fixed length 8, can be null, default 8 bytes 0x00
     * @param data the source date
     * @param desType encrypt type<BR>
     * <b style="text-decoration:line-through;">|--0x00-des</b><BR>
     * |--0x01-3des<BR>
     * |--0x02-sm4<BR>
     * |--0x03-aes<BR>
     * @param dukptRequest true means the keyId is dukpt key id
     * @return the mac value, null means failure
     * @since 1.x.x
     */
    @Override public byte[] calcMACWithCalType(int keyId, int type, byte[] CBCInitVec, byte[] data, int desType, boolean dukptRequest) throws android.os.RemoteException
    {
      return null;
    }
    /**
     * encrypt the trace date(3des algorithm default)
     * 
     * @param mode mode , 0 for ECB, 1 for CBC
     * @param keyId the id of TDK
     * @param trkData the track date
     * @return @return the encrypted track data, null means failure
     * @since 1.x.x
     * @deprecated pls use {@see #encryptTrackDataWithAlgorithmType} instead.
     */
    @Override public byte[] encryptTrackData(int mode, int keyId, byte[] trkData) throws android.os.RemoteException
    {
      return null;
    }
    /**
     * encrypt the trace date given algorithm type
     * 
     * @param mode mode , 0 for ECB, 1 for CBC
     * @param keyId the id of TDK(0~99) or dukpt key(0~4)
     * @param AlgorithmType algorithmType type 0x01-3des 0x02-SM4 0x03-AES
     * @param trkData the track date
     * @param dukptRequest if true, the keyId is dukpt key id
     * @return the encrypted track data, null means failure
     * @since 1.x.x
     */
    @Override public byte[] encryptTrackDataWithAlgorithmType(int mode, int keyId, int algorithmType, byte[] trkData, boolean dukptRequest) throws android.os.RemoteException
    {
      return null;
    }
    /**
     * start PIN input
     * 
     * @param keyId the index of PIN KEY(0~99) or dukpt key (0~4)
     * @param param the parameter
     * <ul>
     * <li>pinLimit(byte[]) the valid length(s) array of the PIN (such as {0,4,5,6} means the valid length is 0, 4 ~6)</li>
     * <li>timeout(int) the timeout, second</li>
     * <li>isOnline(boolean) is a online PIN</li>
     * <li>promptString(String) the prompt string</li>
     * <li>pan(String) the pan for encrypt online PIN</li>
     * <li>desType(int) calculate type<BR>
     *   |----0x01 MK/SK + 3DES (default)<BR>
     *   |----0x02 MK/SK + AES<BR>
     *   |----0x03 MK/SK + SM4<BR>
     *   |----0x04 DUKPT + 3DES<BR>
     * </li>
     * <li>numbersFont(String) - url of numbers ttf font (value "" is android system fonts)</li>
     * <li>promptsFont(String) - url of prompt ttf font(value "" is android system fonts)</li>
     * <li>otherFont(String) - url of other ttf font(confirm button & backspace button)(value "" is android system fonts)</li>
     * <li>displayKeyValue(byte[]) - custom the sequence key number of pinpad</li>
     * <li>random(byte[]) - random number participation in pinblock calculation(default not set)</li>
     * <li>notificatePinLenError(boolean) - Notification password is not long enough(default false)</li>
     * <li>pinFormatType(int) - default is format0, 0-format0, 1-format1, 2-format2, 3-format3, 4-format4</li>
     * <li>dispersionType(int) - default is 0(DES112), 0-DES112, 1-DES168, 2-AES128, 3-AES192, 4-AES256</li>
     * </ul>
     * @param listener the call back listener
     * @param globalParam - set global display (if set null, 0~9 are Arabic numerals and confirm/backspace button are english display)
     * <ul>
     *     <li>Display_One(String)</li>
     *     <li>Display_Two(String)</li>
     *     <li>Display_Three(String)</li>
     *     <li>Display_Four(String)</li>
     *     <li>Display_Five(String)</li>
     *     <li>Display_Six(String)</li>
     *     <li>Display_Seven(String)</li>
     *     <li>Display_Eight(String)</li>
     *     <li>Display_Nine(String)</li>
     *     <li>Display_Zero(String)</li>
     *     <li>Display_Confirm(String)</li>
     *     <li>Display_BackSpace(String)</li>
     * </ul>
     * @return
     * @since 1.x.x
     */
    @Override public void startPinInput(int keyId, android.os.Bundle param, android.os.Bundle globleParam, com.vfi.smartpos.deviceservice.aidl.PinInputListener listener) throws android.os.RemoteException
    {
    }
    /**
     * submit the pin input
     * @since 1.x.x
     */
    @Override public void submitPinInput() throws android.os.RemoteException
    {
    }
    /**
     * stop the pin input
     * @since 1.x.x
     * @deprecated pls clicked cannel button on UI page
     */
    @Override public void stopPinInput() throws android.os.RemoteException
    {
    }
    /**
     * get the last error
     * @return the description of the last error
     * @since 1.x.x
     */
    @Override public java.lang.String getLastError() throws android.os.RemoteException
    {
      return null;
    }
    /**
     * same the "calculateData"
     * @since 1.x.x
     * @deprecated See {@see #calculateDataEx}
     */
    @Override public byte[] colculateData(int mode, int desType, byte[] key, byte[] data) throws android.os.RemoteException
    {
      return null;
    }
    /**
     * DUKPT encrypt
     * 
     * @param desType the type of encrypt
     * <ul>
     * <li>TYPE_DES - 0x00 DES Type </li>
     * <li>TYPE_3DES - 0x01 3DES Type </li>
     * <li>TYPE_SM4 - 0x02 SM4 Type</li>
     * <li>TYPE_AES - 0x03 AES Type</li>
     * </ul>
     * @param algorithm the type of algorithm 0x01-CBC 0x02-ECB
     * @param keyid - index of key (0~4)
     * @param data - the source date
     * @param CBCInitVec - CBC initial vector. fixed length 8, can be null, default 8 bytes 0x00
     * @since 1.x.x
     * @deprecated pls use {@see com.vfi.smartpos.deviceservice.aidl.key_manager.IDukpt#calculateData} instead.
     */
    @Override public byte[] dukptEncryptData(int destype, int algorithm, int keyid, byte[] data, byte[] CBCInitVec) throws android.os.RemoteException
    {
      return null;
    }
    /**
     * save the plain key(just support 3des, )
     * 
     * @param keyType the key type 1 for MAC ，2 for PIN ，3 for TD
     * @param keyId the index of KEY
     * @param key the source key
     * @since 1.x.x
     * @deprecated
     */
    @Override public boolean savePlainKey(int keyType, int keyId, byte[] key) throws android.os.RemoteException
    {
      return false;
    }
    /**
     * get the current KSN
     * 
     * @return the current dukpt ksn
     * @since 1.x.x
     * @deprecated pls use {@see com.vfi.smartpos.deviceservice.aidl.key_manager.IDukpt#getDukptKsn} instead.
     */
    @Override public byte[] getDukptKsn() throws android.os.RemoteException
    {
      return null;
    }
    /**
     * get the SM2 public key & private key
     * 
     * @return bundle
     * <ul>
     *     <li>publicKey(string)</li>
     *     <li>privateKey(string)</li>
     * </ul>
     * @since 1.x.x
     * @deprecated
     */
    @Override public android.os.Bundle generateSM2KeyPair() throws android.os.RemoteException
    {
      return null;
    }
    /**
     * Get SM3 data summary
     * 
     * @data - data;
     * @return byte[] summary
     * @since 1.x.x
     * @deprecated
     */
    @Override public byte[] getSM3Summary(byte[] data) throws android.os.RemoteException
    {
      return null;
    }
    /**
     * get the SM2 sign
     * 
     * @param bundle
     * <ul>
     *     <li>prikey(byte[])</li> - the private key
     *     <li>data(byte[])</li> - the data want to sign
     * </ul>
     * @return calculate resule;
     * @since 1.x.x
     * @deprecated
     */
    @Override public byte[] getSM2Sign(android.os.Bundle bundle) throws android.os.RemoteException
    {
      return null;
    }
    /**
     * Get the checkValue of key
     * 
     * @keyIndex - the index of key
     * @keyType - type of key<BR>
     *     0x01 data encryption key;<BR>
     *     0x02 PIN working key<BR>
     *     0x03 MAC key;<BR>
     *     0x04 transfer key<BR>
     *     0x05 Main key<BR>
     *     0x11 data encryption key(SM4)<BR>
     *     0x12 PIN working key(SM4)<BR>
     *     0x13 MAC key(SM4)<BR>
     *     0x14 sm4transport key(SM4)<BR>
     *     0x15 master key(SM4)<BR>
     *     0x21 DATA key(AES)<BR>
     *     0x22 PIN key(AES)<BR>
     *     0x23 MAC key(AES)<BR>
     *     0x24 AES transmission key<BR>
     *     0x25 AES master key<BR>
     *  @return the check value of the key
     * @since 1.x.x
     */
    @Override public byte[] getKeyKCV(int keyIndex, int keyType) throws android.os.RemoteException
    {
      return null;
    }
    /**
     * App custom pinpad ui interface
     * 
     * @keyId - pinkey id (the id is the loadWorkKey(pin) id);
     * @param - parameter
     * <ul>
     *     <li>pinLimit(byte[]) the valid length(s) array of the PIN (such as 0,4,5,6 means the valid length is 0, 4 ~6)</li>
     *     <li>timeout(int) the timeout, second</li>
     *     <li>isOnline(boolean) - is a online PIN</li>
     *     <li>pan(String) - the pan for encrypt online PIN</li>
     *     <li>desType(int) - calculate type <BR>
     *       |----0x01 MK/SK + 3DES (default)<BR>
     *       |----0x02 MK/SK + AES<BR>
     *       |----0x03 MK/SK + SM4<BR>
     *       |----0x04 DUKPT + 3DES<BR>
     *     </li>
     *     <li>displayKeyValue(byte[]) - custom the sequence key number of pinpad</li>
     *     <li>random(byte[]) - random number participation in pinblock calculation(default not set)</li>
     *     <li>pinFormatType(int) - default is format0, 0-format0, 1-format1, 2-format2, 3-format3, 4-format4</li>
     *     <li>dispersionType(int) - default is 0(DES112), 0-DES112, 1-DES168, 2-AES128, 3-AES192, 4-AES256</li>
     * </ul>
     * @pinKeyInfos - the list of PinKeyCoorInfo
     * @listener - listener of PinInputListener
     * @return  map<String String> - the value of 0~9 key to display
     * @since 2.x.x
     */
    @Override public java.util.Map initPinInputCustomView(int keyId, android.os.Bundle param, java.util.List<com.vfi.smartpos.deviceservice.aidl.PinKeyCoorInfo> pinKeyInfos, com.vfi.smartpos.deviceservice.aidl.PinInputListener listener) throws android.os.RemoteException
    {
      return null;
    }
    /**
     * Execute this interface to activate pinpad.
     * 
     * If you get Map<string string>, you should traversal the map to get the value of key to display.
     * @since 2.x.x
     */
    @Override public void startPinInputCustomView() throws android.os.RemoteException
    {
    }
    /**
     * stop custom pinpad
     * 
     * @since 2.x.x
     */
    @Override public void endPinInputCustomView() throws android.os.RemoteException
    {
    }
    /**
     * encrypt or decrypt data
     * 
     * @param mode the mode of encrypt or decrypt
     * <ul>
     * <li>0x00 MK/SK ECB encrypt </li>
     * <li>0x01 MK/SK ECB decrypt </li>
     * <li>0x02 MK/SK CBC encrypt </li>
     * <li>0x03 MK/SK CBC decrypt </li>
     * </ul>
     * @param desType the type of encrypt or decrypt
     * <ul>
     * <li>TYPE_DES - 0x00 DES Type  </li>
     * <li>TYPE_3DES - 0x01 3DES Type(EBC)  </li>
     * <li style="text-decoration:line-through;">TYPE_SM4 - 0x02 SM4 Type </li>
     * <li style="text-decoration:line-through;">TYPE_AES - 0x03 AES Type </li>
     * <li>TYPE_SM2_PUBKEY - 0x04 SM2 Type(use public key) </li>
     * <li>TYPE_SM2_PRIVKEY - 0x05 SM2 Type(use private key) </li>
     * <li>TYPE_3DES - 0x06 3DES Type(CBC, initVec = 00000000) </li>
     * </ul>
     * @param key the source key
     * @param data the source date
     * 
     * @return the encrypted or decrypted data, null means failure
     * @since 1.x.x
     * @deprecated pls use {#calculateDataEx} instead.
     */
    @Override public byte[] calculateData(int mode, int desType, byte[] key, byte[] data) throws android.os.RemoteException
    {
      return null;
    }
    /**
     * encrypt or decrypt data
     * 
     * @param mode the mode of encrypt or decrypt
     * <ul>
     * <li>0x00 MK/SK ECB encrypt </li>
     * <li>0x01 MK/SK ECB decrypt </li>
     * <li>0x02 MK/SK CBC encrypt </li>
     * <li>0x03 MK/SK CBC decrypt </li>
     * </ul>
     * @param desType the type of encrypt or decrypt
     * <ul>
     * <li>TYPE_DES - 0x00 DES Type </li>
     * <li>TYPE_3DES - 0x01 3DES Type(EBC) </li>
     * <li>TYPE_SM4 - 0x02 SM4 Type </li>
     * <li>TYPE_AES - 0x03 AES Type</li>
     * <li style="text-decoration:line-through;">TYPE_SM2_PUBKEY - 0x04 SM2 Type(use public key) </li>
     * <li style="text-decoration:line-through;">TYPE_SM2_PRIVKEY - 0x05 SM2 Type(use private key) </li>
     * <li style="text-decoration:line-through;">TYPE_3DES - 0x06 3DES Type(CBC) NOTICE: WorkKey(TD) id = 60 will be occupied, so user app should not use 60 index of TD </li>
     * </ul>
     * @param key the source key
     * @param data the source date
     * @param initVec 3des cbc init vector
     * 
     * @return the encrypted or decrypted data, null means failure
     * @since 1.x.x
     */
    @Override public byte[] calculateDataEx(int mode, int desType, byte[] key, byte[] data, byte[] initVec) throws android.os.RemoteException
    {
      return null;
    }
    /**
     * encrypt pinblock from cardnumber & passwd
     * 
     * @param pinKeyId the index of PIN KEY(0~99)
     * @param desType calculate type <BR>
     *   |----0x01 MK/SK + 3DES (default)<BR>
     *   |----0x02 MK/SK + AES<BR>
     *   |----0x03 MK/SK + SM4<BR>
     *   |----0x04 DUKPT + 3DES<BR>
     * @param cardNumber - card number (ascii type, such as "1234", you should input byte[4] = "31 32 33 34")
     * @param passws- plain password (String type, such as "1234", you should input String = "1234")
     * @since 1.x.x
     */
    @Override public byte[] encryptPinFormat0(int pinKeyId, int desType, byte[] cardNumber, java.lang.String passwd) throws android.os.RemoteException
    {
      return null;
    }
    /**
     * encrypt data or decrypt data by data key
     * 
     * @param keyId - data key index(0~99)
     * @param encAlg- encryption algorithm<BR>
     *     |---0x01 3DES<BR>
     *     |---0x02 SM4<BR>
     *     |---0x03 AES<BR>
     * @param encMode - encryption mode of operation<BR>
     *     |--0x01 ECB<BR>
     *     |--0x02 CBC<BR>
     * @param encFlag - encryption flag<BR>
     *     |--0x00 encrypt<BR>
     *     |--0x01 decrypt<BR>
     * @param data - data
     * @param initVec - init vec，default set null;
     * @return the result of encrypt data or decrypt data;
     * @since 1.x.x
     */
    @Override public byte[] calculateByDataKey(int keyId, int encAlg, int encMode, int encFlag, byte[] data, byte[] initVec) throws android.os.RemoteException
    {
      return null;
    }
    /**
     * load the encrypted master key given Algorithm Type
     * 
     * @param keyId the id (index, 0 to 99)
     * @param key the encrypted key
     * @param algorithmType 0x01-3des algorithm<BR> 0x03-SM4 algorithm<BR> 0x05-AES algorithm<BR> 0x81-3des(cbc)<BR> 0x83-SM4(cbc)<BR> 0x85-AES(cbc)<BR>
     * @param check value (default NULL)
     * @param extend - extend param
     * <ul>
     *     <li>isCBCType(boolean) judge the mk encrypt mode whether is CBC mode(default false)</li>
     *     <li>initVec(byte[]) cbc initVec(default 16byte 0)</li>
     *     <li>isMasterEncMasterMode(boolean) master key can encrypt master key, if pos has loaded Master key</li>
     *     <li>decryptKeyIndex(int) (index 0 to 99)Decrypt key index. Will use the KeyId if not set and after that the last key will be overwritten.</li>
     * </ul>
     * @return true for success, false for failure
     * @since 1.x.x
     */
    @Override public boolean loadEncryptMainKeyEX(int keyId, byte[] key, int algorithmType, byte[] checkValue, android.os.Bundle extend) throws android.os.RemoteException
    {
      return false;
    }
    /**
     * load the work key given decrypt type
     * 
     * @param keyType select the workkey type<BR>
     *     |---1-MAC key, 2-PIN key, 3-TD key<BR>
     *     |---5-(SM4)MAC key, 6-(SM4)PIN key, 7-(SM4)TD key<BR>
     *     |---9-(AES)MAC key, 10-(AES)PIN key, 11-(AES)TD key<BR>
     * @param mkId the id of master key for decrypt work key
     * @param wkId set the workkey id (index 0~99)
     * @param decKeyType select decrypt key type<BR>
     *     |---0x00-3DES master key<BR>
     *     |---0x01-transport key<BR>
     *     |---0x02-SM4 master key<BR>
     *     |---0x03-AES master key<BR>
     *     |---0x04-SM4 transport key<BR>
     *     |---0x05-AES transport key<BR>
     *     |---0x80-CBC 3DES master key<BR>
     *     |---0x81-CBC transport key<BR>
     *     |---0x82-CBC SM4 master key<BR>
     *     |---0x83-CBC AES master key<BR>
     *     |---0x84-CBC SM4 transport key<BR>
     *     |---0x85-CBC AES transport key<BR>
     * @param encrypt key
     * @param checkValue check value (null for none)
     * @param extend - extend param
     * <ul>
     *     <li>isCBCType(boolean) judge the mk encrypt mode whether is CBC mode(default false)</li>
     *     <li>initVec(byte[]) cbc initVec(default 16byte 0)</li>
     * </ul>
     * @return true on success, false on failure
     * @since 1.x.x
     */
    @Override public boolean loadWorkKeyEX(int keyType, int mkId, int wkId, int decKeyType, byte[] key, byte[] checkValue, android.os.Bundle extend) throws android.os.RemoteException
    {
      return false;
    }
    /**
     * clear MK & WK(k21 version > 169)
     * 
     * @param keyId clear key id
     * @param keyType
     * <ul>
     * <li> 0x00-DES MK</li>
     * <li> 0x01-SM4 MK</li>
     * <li> 0x02-AES MK</li>
     * <li> 0x10-DES PIN</li>
     * <li> 0x11-SM4 PIN</li>
     * <li> 0x12-AES PIN</li>
     * <li> 0x20-DES MAC</li>
     * <li> 0x21-SM4 MAC</li>
     * <li> 0x22-AES MAC</li>
     * <li> 0x30-DES DATA</li>
     * <li> 0x31-SM4 DATA</li>
     * <li> 0x32-AES DATA</li>
     * <li> 0x40-DES DUKPT</li>
     * <li> 0x41-AES DUKPT</li>
     * <li> 0x50-DES TEK</li>
     * <li> 0x51-AES TEK</li>
     * </ul>
     * @since 1.x.x
     */
    @Override public boolean clearKey(int keyId, int keyType) throws android.os.RemoteException
    {
      return false;
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
     *     <li>loadPlainKey(boolean) load plain key or encrypt key</li>
     *     <li>TEKIndex(int) index of TEK,if isPlainKey is false, need to set this paramater</li>
     * </ul>
     * @return true on success, false on failure
     * @since 1.x.x
     * @deprecated pls use {@see com.vfi.smartpos.deviceservice.aidl.key_manager.IDukpt#loadDukptKey} instead.
     */
    @Override public boolean loadDukptKeyEX(int keyId, byte[] ksn, byte[] key, byte[] checkValue, android.os.Bundle extend) throws android.os.RemoteException
    {
      return false;
    }
    /**
     * load TEK key with Algorithm Type given
     * 
     * TEK is the transfer key to encrypt master key
     * @param keyId the id (index, 0 to 99)
     * @param key the key
     * @param algorithmType<BR>
     *     |---0x01-3des encrypted key <BR>
     *     |---0x02-3des plain key <BR>
     *     |---0x03-SM4 encrypte key <BR>
     *     |---0x04-SM4 plain key <BR>
     *     |---0x05-AES encrypted key <BR>
     *     |---0x06-AES plain key
     *     |---0x81-CBC 3des encrypted key <BR>
     *     |---0x82-CBC 3des plain key <BR>
     *     |---0x83-CBC SM4 encrypte key <BR>
     *     |---0x84-CBC SM4 plain key <BR>
     *     |---0x85-CBC AES encrypted key <BR>
     *     |---0x86-CBC AES plain key
     * @param checkValue the check value
     * @param extend - extend param
     * <ul>
     *     <li>isCBCType(boolean) judge the mk encrypt mode whether is CBC mode(default false)</li>
     *     <li>initVec(byte[]) cbc initVec(default 16byte 0)</li>
     * </ul>
     * @return true on success, false on failure
     * @since 1.x.x
     */
    @Override public boolean loadTEKEX(int keyId, byte[] key, byte algorithmType, byte[] checkValue, android.os.Bundle extend) throws android.os.RemoteException
    {
      return false;
    }
    /**
     * encrypt data or decrypt data by data key
     * 
     * @param keyId - data key index(0~99)
     * @param keyType - key type
     *     |---0x01 data key<BR>
     *     |---0x02 mac key<BR>
     *     |---0x03 pin key<BR>
     * @param encAlg- encryption algorithm<BR>
     *     |---0x01 3DES<BR>
     *     |---0x02 SM4<BR>
     *     |---0x03 AES<BR>
     * @param encMode - encryption mode of operation<BR>
     *     |--0x01 ECB<BR>
     *     |--0x02 CBC<BR>
     * @param encFlag - encryption flag<BR>
     *     |--0x00 encrypt<BR>
     *     |--0x01 decrypt<BR>
     * @param data - data
     * @param extend - extend param
     * <ul>
     *     <li>initVec(byte[]) cbc initVec(default null)</li>
     * </ul>
     * @return the result of encrypt data or decrypt data;
     * @since 2.x.x
     */
    @Override public byte[] calculateByWorkKey(int keyId, int keyType, int encAlg, int encMode, int encFlag, byte[] data, android.os.Bundle extend) throws android.os.RemoteException
    {
      return null;
    }
    /**
     * calculate by MSKey
     * 
     * @param keyId - data key index(0~99)
     * @param keyType - key type
     *     |---0x01 3DES master key<BR>
     *     |---0x02 SM4 master key<BR>
     *     |---0x03 AES master key<BR>
     * @param algorithmMode - encryption algorithm<BR>
     *     |---0x00 encrypt ECB<BR>
     *     |---0x01 decrypt ECB<BR>
     *     |---0x02 encrypt CBC<BR>
     *     |---0x03 decrypt CBC<BR>
     * @param data - data
     * @param extend - extend param
     * <ul>
     *     <li>initVec(byte[]) cbc initVec(default null if not set)</li>
     * </ul>
     * @return the result of encrypt data or decrypt data;
     * @since 2.x.x
     */
    @Override public byte[] calculateByMSKey(int keyId, int keyType, int algorithmMode, byte[] data, android.os.Bundle extend) throws android.os.RemoteException
    {
      return null;
    }
    /**
     * get random data
     * 
     * @param length - length of random data(1~255)
     * @return result of random data;
     * @since 2.x.x
     */
    @Override public byte[] getRandom(byte length) throws android.os.RemoteException
    {
      return null;
    }
    /**
     * inject PIN key event direct
     * 
     * @param type  see PinType
     * enum PinType {
     * PINPAD_BUTTON_TYPE_DIGIT,
     * PINPAD_BUTTON_TYPE_CLEAR,  //means to clear all characters entered so far
     * PINPAD_BUTTON_TYPE_CONFIRM,
     * PINPAD_BUTTON_TYPE_CANCEL,
     * PINPAD_BUTTON_TYPE_BACKSPACE; //clears only one character
     * }
     * 
     * @param key if DIGIT type, key is 0~9, other PinType key set '' empty
     * @return 0-success, other-fail
     * @deprecated
     */
    @Override public int injectPinKey(int type, char key) throws android.os.RemoteException
    {
      return 0;
    }
    /**
     *  App custom pinpad ui interface
     * 
     * @param - parameter
     * <ul>
     *     <li>pinLimit(byte[]) the valid length(s) array of the PIN (such as 0,4,5,6 means the valid length is 0, 4 ~6)</li>
     *     <li>timeout(int) the timeout, second</li>
     *     <li>random(Boolean) - random Pin number(default is false)</li>
     * </ul>
     * @param pinKeyInfos - the list of PinKeyCoorInfo
     * @return result of start Pin
     * @deprecated
     */
    @Override public boolean startPinByInjectType(android.os.Bundle param, com.vfi.smartpos.deviceservice.aidl.PinKeyCoorInfo[] pinKeyInfos) throws android.os.RemoteException
    {
      return false;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.vfi.smartpos.deviceservice.aidl.IPinpad
  {
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.vfi.smartpos.deviceservice.aidl.IPinpad interface,
     * generating a proxy if needed.
     */
    public static com.vfi.smartpos.deviceservice.aidl.IPinpad asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.vfi.smartpos.deviceservice.aidl.IPinpad))) {
        return ((com.vfi.smartpos.deviceservice.aidl.IPinpad)iin);
      }
      return new com.vfi.smartpos.deviceservice.aidl.IPinpad.Stub.Proxy(obj);
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
        case TRANSACTION_isKeyExist:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          boolean _result = this.isKeyExist(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        case TRANSACTION_loadTEK:
        {
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          byte[] _arg2;
          _arg2 = data.createByteArray();
          boolean _result = this.loadTEK(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        case TRANSACTION_loadTEKWithAlgorithmType:
        {
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          byte _arg2;
          _arg2 = data.readByte();
          byte[] _arg3;
          _arg3 = data.createByteArray();
          boolean _result = this.loadTEKWithAlgorithmType(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        case TRANSACTION_loadEncryptMainKey:
        {
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          byte[] _arg2;
          _arg2 = data.createByteArray();
          boolean _result = this.loadEncryptMainKey(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        case TRANSACTION_loadEncryptMainKeyWithAlgorithmType:
        {
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          int _arg2;
          _arg2 = data.readInt();
          byte[] _arg3;
          _arg3 = data.createByteArray();
          boolean _result = this.loadEncryptMainKeyWithAlgorithmType(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        case TRANSACTION_loadMainKey:
        {
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          byte[] _arg2;
          _arg2 = data.createByteArray();
          boolean _result = this.loadMainKey(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        case TRANSACTION_loadMainKeyWithAlgorithmType:
        {
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          int _arg2;
          _arg2 = data.readInt();
          byte[] _arg3;
          _arg3 = data.createByteArray();
          boolean _result = this.loadMainKeyWithAlgorithmType(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
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
          boolean _result = this.loadDukptKey(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        case TRANSACTION_loadWorkKey:
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
          boolean _result = this.loadWorkKey(_arg0, _arg1, _arg2, _arg3, _arg4);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        case TRANSACTION_loadWorkKeyWithDecryptType:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          int _arg3;
          _arg3 = data.readInt();
          byte[] _arg4;
          _arg4 = data.createByteArray();
          byte[] _arg5;
          _arg5 = data.createByteArray();
          boolean _result = this.loadWorkKeyWithDecryptType(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        case TRANSACTION_calcMAC:
        {
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          byte[] _result = this.calcMAC(_arg0, _arg1);
          reply.writeNoException();
          reply.writeByteArray(_result);
          break;
        }
        case TRANSACTION_calcMACWithCalType:
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
          boolean _arg5;
          _arg5 = (0!=data.readInt());
          byte[] _result = this.calcMACWithCalType(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
          reply.writeNoException();
          reply.writeByteArray(_result);
          break;
        }
        case TRANSACTION_encryptTrackData:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          byte[] _arg2;
          _arg2 = data.createByteArray();
          byte[] _result = this.encryptTrackData(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeByteArray(_result);
          break;
        }
        case TRANSACTION_encryptTrackDataWithAlgorithmType:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          byte[] _arg3;
          _arg3 = data.createByteArray();
          boolean _arg4;
          _arg4 = (0!=data.readInt());
          byte[] _result = this.encryptTrackDataWithAlgorithmType(_arg0, _arg1, _arg2, _arg3, _arg4);
          reply.writeNoException();
          reply.writeByteArray(_result);
          break;
        }
        case TRANSACTION_startPinInput:
        {
          int _arg0;
          _arg0 = data.readInt();
          android.os.Bundle _arg1;
          _arg1 = _Parcel.readTypedObject(data, android.os.Bundle.CREATOR);
          android.os.Bundle _arg2;
          _arg2 = _Parcel.readTypedObject(data, android.os.Bundle.CREATOR);
          com.vfi.smartpos.deviceservice.aidl.PinInputListener _arg3;
          _arg3 = com.vfi.smartpos.deviceservice.aidl.PinInputListener.Stub.asInterface(data.readStrongBinder());
          this.startPinInput(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_submitPinInput:
        {
          this.submitPinInput();
          reply.writeNoException();
          break;
        }
        case TRANSACTION_stopPinInput:
        {
          this.stopPinInput();
          reply.writeNoException();
          break;
        }
        case TRANSACTION_getLastError:
        {
          java.lang.String _result = this.getLastError();
          reply.writeNoException();
          reply.writeString(_result);
          break;
        }
        case TRANSACTION_colculateData:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          byte[] _arg2;
          _arg2 = data.createByteArray();
          byte[] _arg3;
          _arg3 = data.createByteArray();
          byte[] _result = this.colculateData(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          reply.writeByteArray(_result);
          break;
        }
        case TRANSACTION_dukptEncryptData:
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
          byte[] _result = this.dukptEncryptData(_arg0, _arg1, _arg2, _arg3, _arg4);
          reply.writeNoException();
          reply.writeByteArray(_result);
          break;
        }
        case TRANSACTION_savePlainKey:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          byte[] _arg2;
          _arg2 = data.createByteArray();
          boolean _result = this.savePlainKey(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        case TRANSACTION_getDukptKsn:
        {
          byte[] _result = this.getDukptKsn();
          reply.writeNoException();
          reply.writeByteArray(_result);
          break;
        }
        case TRANSACTION_generateSM2KeyPair:
        {
          android.os.Bundle _result = this.generateSM2KeyPair();
          reply.writeNoException();
          _Parcel.writeTypedObject(reply, _result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          break;
        }
        case TRANSACTION_getSM3Summary:
        {
          byte[] _arg0;
          _arg0 = data.createByteArray();
          byte[] _result = this.getSM3Summary(_arg0);
          reply.writeNoException();
          reply.writeByteArray(_result);
          break;
        }
        case TRANSACTION_getSM2Sign:
        {
          android.os.Bundle _arg0;
          _arg0 = _Parcel.readTypedObject(data, android.os.Bundle.CREATOR);
          byte[] _result = this.getSM2Sign(_arg0);
          reply.writeNoException();
          reply.writeByteArray(_result);
          break;
        }
        case TRANSACTION_getKeyKCV:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          byte[] _result = this.getKeyKCV(_arg0, _arg1);
          reply.writeNoException();
          reply.writeByteArray(_result);
          break;
        }
        case TRANSACTION_initPinInputCustomView:
        {
          int _arg0;
          _arg0 = data.readInt();
          android.os.Bundle _arg1;
          _arg1 = _Parcel.readTypedObject(data, android.os.Bundle.CREATOR);
          java.util.List<com.vfi.smartpos.deviceservice.aidl.PinKeyCoorInfo> _arg2;
          _arg2 = data.createTypedArrayList(com.vfi.smartpos.deviceservice.aidl.PinKeyCoorInfo.CREATOR);
          com.vfi.smartpos.deviceservice.aidl.PinInputListener _arg3;
          _arg3 = com.vfi.smartpos.deviceservice.aidl.PinInputListener.Stub.asInterface(data.readStrongBinder());
          java.util.Map _result = this.initPinInputCustomView(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          reply.writeMap(_result);
          break;
        }
        case TRANSACTION_startPinInputCustomView:
        {
          this.startPinInputCustomView();
          reply.writeNoException();
          break;
        }
        case TRANSACTION_endPinInputCustomView:
        {
          this.endPinInputCustomView();
          reply.writeNoException();
          break;
        }
        case TRANSACTION_calculateData:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          byte[] _arg2;
          _arg2 = data.createByteArray();
          byte[] _arg3;
          _arg3 = data.createByteArray();
          byte[] _result = this.calculateData(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          reply.writeByteArray(_result);
          break;
        }
        case TRANSACTION_calculateDataEx:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          byte[] _arg2;
          _arg2 = data.createByteArray();
          byte[] _arg3;
          _arg3 = data.createByteArray();
          byte[] _arg4;
          _arg4 = data.createByteArray();
          byte[] _result = this.calculateDataEx(_arg0, _arg1, _arg2, _arg3, _arg4);
          reply.writeNoException();
          reply.writeByteArray(_result);
          break;
        }
        case TRANSACTION_encryptPinFormat0:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          byte[] _arg2;
          _arg2 = data.createByteArray();
          java.lang.String _arg3;
          _arg3 = data.readString();
          byte[] _result = this.encryptPinFormat0(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          reply.writeByteArray(_result);
          break;
        }
        case TRANSACTION_calculateByDataKey:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          int _arg3;
          _arg3 = data.readInt();
          byte[] _arg4;
          _arg4 = data.createByteArray();
          byte[] _arg5;
          _arg5 = data.createByteArray();
          byte[] _result = this.calculateByDataKey(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
          reply.writeNoException();
          reply.writeByteArray(_result);
          break;
        }
        case TRANSACTION_loadEncryptMainKeyEX:
        {
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          int _arg2;
          _arg2 = data.readInt();
          byte[] _arg3;
          _arg3 = data.createByteArray();
          android.os.Bundle _arg4;
          _arg4 = _Parcel.readTypedObject(data, android.os.Bundle.CREATOR);
          boolean _result = this.loadEncryptMainKeyEX(_arg0, _arg1, _arg2, _arg3, _arg4);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        case TRANSACTION_loadWorkKeyEX:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          int _arg3;
          _arg3 = data.readInt();
          byte[] _arg4;
          _arg4 = data.createByteArray();
          byte[] _arg5;
          _arg5 = data.createByteArray();
          android.os.Bundle _arg6;
          _arg6 = _Parcel.readTypedObject(data, android.os.Bundle.CREATOR);
          boolean _result = this.loadWorkKeyEX(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        case TRANSACTION_clearKey:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          boolean _result = this.clearKey(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        case TRANSACTION_loadDukptKeyEX:
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
          boolean _result = this.loadDukptKeyEX(_arg0, _arg1, _arg2, _arg3, _arg4);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        case TRANSACTION_loadTEKEX:
        {
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          byte _arg2;
          _arg2 = data.readByte();
          byte[] _arg3;
          _arg3 = data.createByteArray();
          android.os.Bundle _arg4;
          _arg4 = _Parcel.readTypedObject(data, android.os.Bundle.CREATOR);
          boolean _result = this.loadTEKEX(_arg0, _arg1, _arg2, _arg3, _arg4);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        case TRANSACTION_calculateByWorkKey:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          int _arg3;
          _arg3 = data.readInt();
          int _arg4;
          _arg4 = data.readInt();
          byte[] _arg5;
          _arg5 = data.createByteArray();
          android.os.Bundle _arg6;
          _arg6 = _Parcel.readTypedObject(data, android.os.Bundle.CREATOR);
          byte[] _result = this.calculateByWorkKey(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6);
          reply.writeNoException();
          reply.writeByteArray(_result);
          break;
        }
        case TRANSACTION_calculateByMSKey:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          byte[] _arg3;
          _arg3 = data.createByteArray();
          android.os.Bundle _arg4;
          _arg4 = _Parcel.readTypedObject(data, android.os.Bundle.CREATOR);
          byte[] _result = this.calculateByMSKey(_arg0, _arg1, _arg2, _arg3, _arg4);
          reply.writeNoException();
          reply.writeByteArray(_result);
          break;
        }
        case TRANSACTION_getRandom:
        {
          byte _arg0;
          _arg0 = data.readByte();
          byte[] _result = this.getRandom(_arg0);
          reply.writeNoException();
          reply.writeByteArray(_result);
          break;
        }
        case TRANSACTION_injectPinKey:
        {
          int _arg0;
          _arg0 = data.readInt();
          char _arg1;
          _arg1 = (char)data.readInt();
          int _result = this.injectPinKey(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          break;
        }
        case TRANSACTION_startPinByInjectType:
        {
          android.os.Bundle _arg0;
          _arg0 = _Parcel.readTypedObject(data, android.os.Bundle.CREATOR);
          com.vfi.smartpos.deviceservice.aidl.PinKeyCoorInfo[] _arg1;
          _arg1 = data.createTypedArray(com.vfi.smartpos.deviceservice.aidl.PinKeyCoorInfo.CREATOR);
          boolean _result = this.startPinByInjectType(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          reply.writeTypedArray(_arg1, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static class Proxy implements com.vfi.smartpos.deviceservice.aidl.IPinpad
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
       * Check if Key is exists (just support ECB key)
       * 
       * @param keyType
       * <ul>
       * <li>0 MASTER(main) key</li>
       * <li>1 MAC key</li>
       * <li>2 PIN(work) key</li>
       * <li>3 TD key</li>
       * <li>4 (SM) MASTER key</li>
       * <li>5 (SM) MAC key</li>
       * <li>6 (SM) PIN key</li>
       * <li>7 (SM) TD key</li>
       * <li>8 (AES) MASTER key</li>
       * <li>9 (AES) MAC key</li>
       * <li>10 (AES) PIN key</li>
       * <li>11 (AES) TD key</li>
       * <li>12 dukpt key</li>
       * <li>13 TEK</li>
       * <li>14 (SM)TEK</li>
       * <li>15 (AES)TEK</li>
       * </ul>
       * @param keyId the id (dukpt index 0~4, other 0~99) of the key
       * @return true for exist, false for not exists
       * @since 1.x.x
       */
      @Override public boolean isKeyExist(int keyType, int keyId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keyType);
          _data.writeInt(keyId);
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
       * load plain TEK key(algorithm = 2, 3des plain key default)
       * 
       * TEK is the transfer key to encrypt master key
       * @param keyId the id (index) , from 0 to 99
       * @param the key
       * @param checkValue the check value
       * @return true on success, false on failure
       * @since 1.x.x
       * @deprecated pls use {@see #loadTEKEX} instead.
       */
      @Override public boolean loadTEK(int keyId, byte[] key, byte[] checkValue) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keyId);
          _data.writeByteArray(key);
          _data.writeByteArray(checkValue);
          boolean _status = mRemote.transact(Stub.TRANSACTION_loadTEK, _data, _reply, 0);
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
       * load TEK key with Algorithm Type (ECB default)
       * 
       * TEK is the transfer key to encrypt master key
       * @param keyId the id (index, 0 to 99)
       * @param key the key
       * @param algorithmType 1-3des encrypted key <BR>2-3des plain key <BR>3-SM4 encrypte key <BR>4-SM4 plain key <BR>5-AES encrypted key <BR>6-AES plain key
       * @param checkValue the check value
       * @return true on success, false on failure
       * @since 1.x.x
       * @deprecated pls use {@see #loadTEKEX} instead.
       */
      @Override public boolean loadTEKWithAlgorithmType(int keyId, byte[] key, byte algorithmType, byte[] checkValue) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keyId);
          _data.writeByteArray(key);
          _data.writeByte(algorithmType);
          _data.writeByteArray(checkValue);
          boolean _status = mRemote.transact(Stub.TRANSACTION_loadTEKWithAlgorithmType, _data, _reply, 0);
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
       * load the encrypted master key (3des ECB algorithm, decrypt TEK index = 0)
       * 
       * @param keyId the id (index, 0 to 99)
       * @param key the encrypted key
       * @param checkValue check value (default NULL)
       * @return true on success, false on failure
       * @since 1.x.x
       * @deprecated pls use {@see #loadEncryptMainKeyEX} instead.
       */
      @Override public boolean loadEncryptMainKey(int keyId, byte[] key, byte[] checkValue) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keyId);
          _data.writeByteArray(key);
          _data.writeByteArray(checkValue);
          boolean _status = mRemote.transact(Stub.TRANSACTION_loadEncryptMainKey, _data, _reply, 0);
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
       * load the encrypted master key given Algorithm Type (ECB, decrypt TEK index = 0)
       * 
       * @param keyId the id (index, 0 to 99)
       * @param key the encrypted key(encrypt by TEK)
       * @param algorithmType 1-3des algorithm <BR>3-SM4 algorithm <BR>5-AES algorithm
       * @param checkValue -  check value (default NULL)
       * @return true on success, false on failure
       * @since 1.x.x
       * @deprecated pls use {@see #loadEncryptMainKeyEX} instead.
       */
      @Override public boolean loadEncryptMainKeyWithAlgorithmType(int keyId, byte[] key, int algorithmType, byte[] checkValue) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keyId);
          _data.writeByteArray(key);
          _data.writeInt(algorithmType);
          _data.writeByteArray(checkValue);
          boolean _status = mRemote.transact(Stub.TRANSACTION_loadEncryptMainKeyWithAlgorithmType, _data, _reply, 0);
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
       * load the plain master key(3des ECB algorithm default)
       * 
       * @param keyId the id (index)
       * @param key the key
       * @param checkValue the check value (default NULL)
       * @return true on success, false on failure
       * @since 1.x.x
       */
      @Override public boolean loadMainKey(int keyId, byte[] key, byte[] checkValue) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keyId);
          _data.writeByteArray(key);
          _data.writeByteArray(checkValue);
          boolean _status = mRemote.transact(Stub.TRANSACTION_loadMainKey, _data, _reply, 0);
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
       * load the plain master key given the algorithm Type (support ECB\CBC)
       * 
       * @param keyId the id (index)
       * @param key the key
       * @param algorithmType
       * 0x02-3des ecb algorithm<BR> 0x04-SM4 ecb algorithm<BR> 0x06-AES ecb algorithm<BR>
       * 0x82-3des cbc algorithm<BR> 0x84-SM4 cbc algorithm<BR> 0x86-AES cbc algorithm<BR>
       * @param checkValue the check value (default NULL)
       * @return true on success, false on failure
       * @since 1.x.x
       */
      @Override public boolean loadMainKeyWithAlgorithmType(int keyId, byte[] key, int algorithmType, byte[] checkValue) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keyId);
          _data.writeByteArray(key);
          _data.writeInt(algorithmType);
          _data.writeByteArray(checkValue);
          boolean _status = mRemote.transact(Stub.TRANSACTION_loadMainKeyWithAlgorithmType, _data, _reply, 0);
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
       * load the encrypt DUKPT key(decrypt TEK index = 0)
       * 
       * @param keyId the id (index 0~99)
       * @param ksn the key serial number
       * @param key the key
       * @param checkValue the check value (default NULL)
       * @return true on success, false on failure
       * @since 1.x.x
       * @deprecated pls use {@see com.vfi.smartpos.deviceservice.aidl.key_manager.IDukpt#loadDukptKey} instead.
       */
      @Override public boolean loadDukptKey(int keyId, byte[] ksn, byte[] key, byte[] checkValue) throws android.os.RemoteException
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
       * load the work key (3DES ECB, decrypt by master key)
       * 
       * @param keyType select the workkey type: 1-MAC key, 2-PIN key, 3-TD key
       * @param mkId the id of master key for decrypt work key
       * @param keyId set the workkey id (index 0~99)
       * @param key the key (16bytes)
       * @param checkValue check value (null for none)
       * @return true on success, false on failure
       * @since 1.x.x
       * @deprecated pls use {@see #loadWorkKeyEX} instead.
       */
      @Override public boolean loadWorkKey(int keyType, int mkId, int wkId, byte[] key, byte[] checkValue) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keyType);
          _data.writeInt(mkId);
          _data.writeInt(wkId);
          _data.writeByteArray(key);
          _data.writeByteArray(checkValue);
          boolean _status = mRemote.transact(Stub.TRANSACTION_loadWorkKey, _data, _reply, 0);
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
       * load the work key given decrypt type
       * 
       * @param keyType select the workkey type<BR>
       *     |---1-MAC key, 2-PIN key, 3-TD key<BR>
       *     |---5-(SM4)MAC key, 6-(SM4)PIN key, 7-(SM4)TD key<BR>
       *     |---9-(AES)MAC key, 10-(AES)PIN key, 11-(AES)TD key<BR>
       * @param mkId the id of master key for decrypt work key
       * @param wkId set the workkey id (index 0~99)
       * @param decKeyType select decrypt key type<BR>
       *     |---0-3DES master key<BR>
       *     |---1-transport key<BR>
       *     |---2-SM4 master key<BR>
       *     |---3-AES master key<BR>
       * @param encrypt key
       * @param checkValue check value (null for none)
       * @return true on success, false on failure
       * @since 1.x.x
       * @deprecated pls use {@see #loadWorkKeyEX} instead.
       */
      @Override public boolean loadWorkKeyWithDecryptType(int keyType, int mkId, int wkId, int decKeyType, byte[] key, byte[] checkValue) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keyType);
          _data.writeInt(mkId);
          _data.writeInt(wkId);
          _data.writeInt(decKeyType);
          _data.writeByteArray(key);
          _data.writeByteArray(checkValue);
          boolean _status = mRemote.transact(Stub.TRANSACTION_loadWorkKeyWithDecryptType, _data, _reply, 0);
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
       * calcuate the MAC (3des default & X919)
       * 
       * @param keyId the index of MAC KEY
       * @param data the source date
       * @return the mac value, null means failure
       * @since 1.x.x
       * @deprecated pls use {@see #calcMACWithCalType} instead.
       */
      @Override public byte[] calcMAC(int keyId, byte[] data) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        byte[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keyId);
          _data.writeByteArray(data);
          boolean _status = mRemote.transact(Stub.TRANSACTION_calcMAC, _data, _reply, 0);
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
       * @param keyId the index of MAC KEY(0~99) or dukpt key(0~4)
       * @param type Calculation mode 0x00-MAC X99; 0x01-MAC X919; 0x02-ECB (CUP standard ECB algorithm); 0x03-MAC 9606; 0x04-CBC MAC calculation
       * @param CBCInitVec - CBC initial vector. fixed length 8, can be null, default 8 bytes 0x00
       * @param data the source date
       * @param desType encrypt type<BR>
       * <b style="text-decoration:line-through;">|--0x00-des</b><BR>
       * |--0x01-3des<BR>
       * |--0x02-sm4<BR>
       * |--0x03-aes<BR>
       * @param dukptRequest true means the keyId is dukpt key id
       * @return the mac value, null means failure
       * @since 1.x.x
       */
      @Override public byte[] calcMACWithCalType(int keyId, int type, byte[] CBCInitVec, byte[] data, int desType, boolean dukptRequest) throws android.os.RemoteException
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
          _data.writeInt(((dukptRequest)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_calcMACWithCalType, _data, _reply, 0);
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
       * encrypt the trace date(3des algorithm default)
       * 
       * @param mode mode , 0 for ECB, 1 for CBC
       * @param keyId the id of TDK
       * @param trkData the track date
       * @return @return the encrypted track data, null means failure
       * @since 1.x.x
       * @deprecated pls use {@see #encryptTrackDataWithAlgorithmType} instead.
       */
      @Override public byte[] encryptTrackData(int mode, int keyId, byte[] trkData) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        byte[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(mode);
          _data.writeInt(keyId);
          _data.writeByteArray(trkData);
          boolean _status = mRemote.transact(Stub.TRANSACTION_encryptTrackData, _data, _reply, 0);
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
       * encrypt the trace date given algorithm type
       * 
       * @param mode mode , 0 for ECB, 1 for CBC
       * @param keyId the id of TDK(0~99) or dukpt key(0~4)
       * @param AlgorithmType algorithmType type 0x01-3des 0x02-SM4 0x03-AES
       * @param trkData the track date
       * @param dukptRequest if true, the keyId is dukpt key id
       * @return the encrypted track data, null means failure
       * @since 1.x.x
       */
      @Override public byte[] encryptTrackDataWithAlgorithmType(int mode, int keyId, int algorithmType, byte[] trkData, boolean dukptRequest) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        byte[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(mode);
          _data.writeInt(keyId);
          _data.writeInt(algorithmType);
          _data.writeByteArray(trkData);
          _data.writeInt(((dukptRequest)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_encryptTrackDataWithAlgorithmType, _data, _reply, 0);
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
       * start PIN input
       * 
       * @param keyId the index of PIN KEY(0~99) or dukpt key (0~4)
       * @param param the parameter
       * <ul>
       * <li>pinLimit(byte[]) the valid length(s) array of the PIN (such as {0,4,5,6} means the valid length is 0, 4 ~6)</li>
       * <li>timeout(int) the timeout, second</li>
       * <li>isOnline(boolean) is a online PIN</li>
       * <li>promptString(String) the prompt string</li>
       * <li>pan(String) the pan for encrypt online PIN</li>
       * <li>desType(int) calculate type<BR>
       *   |----0x01 MK/SK + 3DES (default)<BR>
       *   |----0x02 MK/SK + AES<BR>
       *   |----0x03 MK/SK + SM4<BR>
       *   |----0x04 DUKPT + 3DES<BR>
       * </li>
       * <li>numbersFont(String) - url of numbers ttf font (value "" is android system fonts)</li>
       * <li>promptsFont(String) - url of prompt ttf font(value "" is android system fonts)</li>
       * <li>otherFont(String) - url of other ttf font(confirm button & backspace button)(value "" is android system fonts)</li>
       * <li>displayKeyValue(byte[]) - custom the sequence key number of pinpad</li>
       * <li>random(byte[]) - random number participation in pinblock calculation(default not set)</li>
       * <li>notificatePinLenError(boolean) - Notification password is not long enough(default false)</li>
       * <li>pinFormatType(int) - default is format0, 0-format0, 1-format1, 2-format2, 3-format3, 4-format4</li>
       * <li>dispersionType(int) - default is 0(DES112), 0-DES112, 1-DES168, 2-AES128, 3-AES192, 4-AES256</li>
       * </ul>
       * @param listener the call back listener
       * @param globalParam - set global display (if set null, 0~9 are Arabic numerals and confirm/backspace button are english display)
       * <ul>
       *     <li>Display_One(String)</li>
       *     <li>Display_Two(String)</li>
       *     <li>Display_Three(String)</li>
       *     <li>Display_Four(String)</li>
       *     <li>Display_Five(String)</li>
       *     <li>Display_Six(String)</li>
       *     <li>Display_Seven(String)</li>
       *     <li>Display_Eight(String)</li>
       *     <li>Display_Nine(String)</li>
       *     <li>Display_Zero(String)</li>
       *     <li>Display_Confirm(String)</li>
       *     <li>Display_BackSpace(String)</li>
       * </ul>
       * @return
       * @since 1.x.x
       */
      @Override public void startPinInput(int keyId, android.os.Bundle param, android.os.Bundle globleParam, com.vfi.smartpos.deviceservice.aidl.PinInputListener listener) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keyId);
          _Parcel.writeTypedObject(_data, param, 0);
          _Parcel.writeTypedObject(_data, globleParam, 0);
          _data.writeStrongInterface(listener);
          boolean _status = mRemote.transact(Stub.TRANSACTION_startPinInput, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * submit the pin input
       * @since 1.x.x
       */
      @Override public void submitPinInput() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_submitPinInput, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * stop the pin input
       * @since 1.x.x
       * @deprecated pls clicked cannel button on UI page
       */
      @Override public void stopPinInput() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_stopPinInput, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * get the last error
       * @return the description of the last error
       * @since 1.x.x
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
       * same the "calculateData"
       * @since 1.x.x
       * @deprecated See {@see #calculateDataEx}
       */
      @Override public byte[] colculateData(int mode, int desType, byte[] key, byte[] data) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        byte[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(mode);
          _data.writeInt(desType);
          _data.writeByteArray(key);
          _data.writeByteArray(data);
          boolean _status = mRemote.transact(Stub.TRANSACTION_colculateData, _data, _reply, 0);
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
       * DUKPT encrypt
       * 
       * @param desType the type of encrypt
       * <ul>
       * <li>TYPE_DES - 0x00 DES Type </li>
       * <li>TYPE_3DES - 0x01 3DES Type </li>
       * <li>TYPE_SM4 - 0x02 SM4 Type</li>
       * <li>TYPE_AES - 0x03 AES Type</li>
       * </ul>
       * @param algorithm the type of algorithm 0x01-CBC 0x02-ECB
       * @param keyid - index of key (0~4)
       * @param data - the source date
       * @param CBCInitVec - CBC initial vector. fixed length 8, can be null, default 8 bytes 0x00
       * @since 1.x.x
       * @deprecated pls use {@see com.vfi.smartpos.deviceservice.aidl.key_manager.IDukpt#calculateData} instead.
       */
      @Override public byte[] dukptEncryptData(int destype, int algorithm, int keyid, byte[] data, byte[] CBCInitVec) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        byte[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(destype);
          _data.writeInt(algorithm);
          _data.writeInt(keyid);
          _data.writeByteArray(data);
          _data.writeByteArray(CBCInitVec);
          boolean _status = mRemote.transact(Stub.TRANSACTION_dukptEncryptData, _data, _reply, 0);
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
       * save the plain key(just support 3des, )
       * 
       * @param keyType the key type 1 for MAC ，2 for PIN ，3 for TD
       * @param keyId the index of KEY
       * @param key the source key
       * @since 1.x.x
       * @deprecated
       */
      @Override public boolean savePlainKey(int keyType, int keyId, byte[] key) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keyType);
          _data.writeInt(keyId);
          _data.writeByteArray(key);
          boolean _status = mRemote.transact(Stub.TRANSACTION_savePlainKey, _data, _reply, 0);
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
       * get the current KSN
       * 
       * @return the current dukpt ksn
       * @since 1.x.x
       * @deprecated pls use {@see com.vfi.smartpos.deviceservice.aidl.key_manager.IDukpt#getDukptKsn} instead.
       */
      @Override public byte[] getDukptKsn() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        byte[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
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
       * get the SM2 public key & private key
       * 
       * @return bundle
       * <ul>
       *     <li>publicKey(string)</li>
       *     <li>privateKey(string)</li>
       * </ul>
       * @since 1.x.x
       * @deprecated
       */
      @Override public android.os.Bundle generateSM2KeyPair() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.os.Bundle _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_generateSM2KeyPair, _data, _reply, 0);
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
       * Get SM3 data summary
       * 
       * @data - data;
       * @return byte[] summary
       * @since 1.x.x
       * @deprecated
       */
      @Override public byte[] getSM3Summary(byte[] data) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        byte[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(data);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getSM3Summary, _data, _reply, 0);
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
       * get the SM2 sign
       * 
       * @param bundle
       * <ul>
       *     <li>prikey(byte[])</li> - the private key
       *     <li>data(byte[])</li> - the data want to sign
       * </ul>
       * @return calculate resule;
       * @since 1.x.x
       * @deprecated
       */
      @Override public byte[] getSM2Sign(android.os.Bundle bundle) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        byte[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _Parcel.writeTypedObject(_data, bundle, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getSM2Sign, _data, _reply, 0);
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
       * Get the checkValue of key
       * 
       * @keyIndex - the index of key
       * @keyType - type of key<BR>
       *     0x01 data encryption key;<BR>
       *     0x02 PIN working key<BR>
       *     0x03 MAC key;<BR>
       *     0x04 transfer key<BR>
       *     0x05 Main key<BR>
       *     0x11 data encryption key(SM4)<BR>
       *     0x12 PIN working key(SM4)<BR>
       *     0x13 MAC key(SM4)<BR>
       *     0x14 sm4transport key(SM4)<BR>
       *     0x15 master key(SM4)<BR>
       *     0x21 DATA key(AES)<BR>
       *     0x22 PIN key(AES)<BR>
       *     0x23 MAC key(AES)<BR>
       *     0x24 AES transmission key<BR>
       *     0x25 AES master key<BR>
       *  @return the check value of the key
       * @since 1.x.x
       */
      @Override public byte[] getKeyKCV(int keyIndex, int keyType) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        byte[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keyIndex);
          _data.writeInt(keyType);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getKeyKCV, _data, _reply, 0);
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
       * App custom pinpad ui interface
       * 
       * @keyId - pinkey id (the id is the loadWorkKey(pin) id);
       * @param - parameter
       * <ul>
       *     <li>pinLimit(byte[]) the valid length(s) array of the PIN (such as 0,4,5,6 means the valid length is 0, 4 ~6)</li>
       *     <li>timeout(int) the timeout, second</li>
       *     <li>isOnline(boolean) - is a online PIN</li>
       *     <li>pan(String) - the pan for encrypt online PIN</li>
       *     <li>desType(int) - calculate type <BR>
       *       |----0x01 MK/SK + 3DES (default)<BR>
       *       |----0x02 MK/SK + AES<BR>
       *       |----0x03 MK/SK + SM4<BR>
       *       |----0x04 DUKPT + 3DES<BR>
       *     </li>
       *     <li>displayKeyValue(byte[]) - custom the sequence key number of pinpad</li>
       *     <li>random(byte[]) - random number participation in pinblock calculation(default not set)</li>
       *     <li>pinFormatType(int) - default is format0, 0-format0, 1-format1, 2-format2, 3-format3, 4-format4</li>
       *     <li>dispersionType(int) - default is 0(DES112), 0-DES112, 1-DES168, 2-AES128, 3-AES192, 4-AES256</li>
       * </ul>
       * @pinKeyInfos - the list of PinKeyCoorInfo
       * @listener - listener of PinInputListener
       * @return  map<String String> - the value of 0~9 key to display
       * @since 2.x.x
       */
      @Override public java.util.Map initPinInputCustomView(int keyId, android.os.Bundle param, java.util.List<com.vfi.smartpos.deviceservice.aidl.PinKeyCoorInfo> pinKeyInfos, com.vfi.smartpos.deviceservice.aidl.PinInputListener listener) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.util.Map _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keyId);
          _Parcel.writeTypedObject(_data, param, 0);
          _data.writeTypedList(pinKeyInfos);
          _data.writeStrongInterface(listener);
          boolean _status = mRemote.transact(Stub.TRANSACTION_initPinInputCustomView, _data, _reply, 0);
          _reply.readException();
          java.lang.ClassLoader cl = (java.lang.ClassLoader)this.getClass().getClassLoader();
          _result = _reply.readHashMap(cl);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**
       * Execute this interface to activate pinpad.
       * 
       * If you get Map<string string>, you should traversal the map to get the value of key to display.
       * @since 2.x.x
       */
      @Override public void startPinInputCustomView() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_startPinInputCustomView, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * stop custom pinpad
       * 
       * @since 2.x.x
       */
      @Override public void endPinInputCustomView() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_endPinInputCustomView, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * encrypt or decrypt data
       * 
       * @param mode the mode of encrypt or decrypt
       * <ul>
       * <li>0x00 MK/SK ECB encrypt </li>
       * <li>0x01 MK/SK ECB decrypt </li>
       * <li>0x02 MK/SK CBC encrypt </li>
       * <li>0x03 MK/SK CBC decrypt </li>
       * </ul>
       * @param desType the type of encrypt or decrypt
       * <ul>
       * <li>TYPE_DES - 0x00 DES Type  </li>
       * <li>TYPE_3DES - 0x01 3DES Type(EBC)  </li>
       * <li style="text-decoration:line-through;">TYPE_SM4 - 0x02 SM4 Type </li>
       * <li style="text-decoration:line-through;">TYPE_AES - 0x03 AES Type </li>
       * <li>TYPE_SM2_PUBKEY - 0x04 SM2 Type(use public key) </li>
       * <li>TYPE_SM2_PRIVKEY - 0x05 SM2 Type(use private key) </li>
       * <li>TYPE_3DES - 0x06 3DES Type(CBC, initVec = 00000000) </li>
       * </ul>
       * @param key the source key
       * @param data the source date
       * 
       * @return the encrypted or decrypted data, null means failure
       * @since 1.x.x
       * @deprecated pls use {#calculateDataEx} instead.
       */
      @Override public byte[] calculateData(int mode, int desType, byte[] key, byte[] data) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        byte[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(mode);
          _data.writeInt(desType);
          _data.writeByteArray(key);
          _data.writeByteArray(data);
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
       * encrypt or decrypt data
       * 
       * @param mode the mode of encrypt or decrypt
       * <ul>
       * <li>0x00 MK/SK ECB encrypt </li>
       * <li>0x01 MK/SK ECB decrypt </li>
       * <li>0x02 MK/SK CBC encrypt </li>
       * <li>0x03 MK/SK CBC decrypt </li>
       * </ul>
       * @param desType the type of encrypt or decrypt
       * <ul>
       * <li>TYPE_DES - 0x00 DES Type </li>
       * <li>TYPE_3DES - 0x01 3DES Type(EBC) </li>
       * <li>TYPE_SM4 - 0x02 SM4 Type </li>
       * <li>TYPE_AES - 0x03 AES Type</li>
       * <li style="text-decoration:line-through;">TYPE_SM2_PUBKEY - 0x04 SM2 Type(use public key) </li>
       * <li style="text-decoration:line-through;">TYPE_SM2_PRIVKEY - 0x05 SM2 Type(use private key) </li>
       * <li style="text-decoration:line-through;">TYPE_3DES - 0x06 3DES Type(CBC) NOTICE: WorkKey(TD) id = 60 will be occupied, so user app should not use 60 index of TD </li>
       * </ul>
       * @param key the source key
       * @param data the source date
       * @param initVec 3des cbc init vector
       * 
       * @return the encrypted or decrypted data, null means failure
       * @since 1.x.x
       */
      @Override public byte[] calculateDataEx(int mode, int desType, byte[] key, byte[] data, byte[] initVec) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        byte[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(mode);
          _data.writeInt(desType);
          _data.writeByteArray(key);
          _data.writeByteArray(data);
          _data.writeByteArray(initVec);
          boolean _status = mRemote.transact(Stub.TRANSACTION_calculateDataEx, _data, _reply, 0);
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
       * encrypt pinblock from cardnumber & passwd
       * 
       * @param pinKeyId the index of PIN KEY(0~99)
       * @param desType calculate type <BR>
       *   |----0x01 MK/SK + 3DES (default)<BR>
       *   |----0x02 MK/SK + AES<BR>
       *   |----0x03 MK/SK + SM4<BR>
       *   |----0x04 DUKPT + 3DES<BR>
       * @param cardNumber - card number (ascii type, such as "1234", you should input byte[4] = "31 32 33 34")
       * @param passws- plain password (String type, such as "1234", you should input String = "1234")
       * @since 1.x.x
       */
      @Override public byte[] encryptPinFormat0(int pinKeyId, int desType, byte[] cardNumber, java.lang.String passwd) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        byte[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(pinKeyId);
          _data.writeInt(desType);
          _data.writeByteArray(cardNumber);
          _data.writeString(passwd);
          boolean _status = mRemote.transact(Stub.TRANSACTION_encryptPinFormat0, _data, _reply, 0);
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
       * encrypt data or decrypt data by data key
       * 
       * @param keyId - data key index(0~99)
       * @param encAlg- encryption algorithm<BR>
       *     |---0x01 3DES<BR>
       *     |---0x02 SM4<BR>
       *     |---0x03 AES<BR>
       * @param encMode - encryption mode of operation<BR>
       *     |--0x01 ECB<BR>
       *     |--0x02 CBC<BR>
       * @param encFlag - encryption flag<BR>
       *     |--0x00 encrypt<BR>
       *     |--0x01 decrypt<BR>
       * @param data - data
       * @param initVec - init vec，default set null;
       * @return the result of encrypt data or decrypt data;
       * @since 1.x.x
       */
      @Override public byte[] calculateByDataKey(int keyId, int encAlg, int encMode, int encFlag, byte[] data, byte[] initVec) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        byte[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keyId);
          _data.writeInt(encAlg);
          _data.writeInt(encMode);
          _data.writeInt(encFlag);
          _data.writeByteArray(data);
          _data.writeByteArray(initVec);
          boolean _status = mRemote.transact(Stub.TRANSACTION_calculateByDataKey, _data, _reply, 0);
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
       * load the encrypted master key given Algorithm Type
       * 
       * @param keyId the id (index, 0 to 99)
       * @param key the encrypted key
       * @param algorithmType 0x01-3des algorithm<BR> 0x03-SM4 algorithm<BR> 0x05-AES algorithm<BR> 0x81-3des(cbc)<BR> 0x83-SM4(cbc)<BR> 0x85-AES(cbc)<BR>
       * @param check value (default NULL)
       * @param extend - extend param
       * <ul>
       *     <li>isCBCType(boolean) judge the mk encrypt mode whether is CBC mode(default false)</li>
       *     <li>initVec(byte[]) cbc initVec(default 16byte 0)</li>
       *     <li>isMasterEncMasterMode(boolean) master key can encrypt master key, if pos has loaded Master key</li>
       *     <li>decryptKeyIndex(int) (index 0 to 99)Decrypt key index. Will use the KeyId if not set and after that the last key will be overwritten.</li>
       * </ul>
       * @return true for success, false for failure
       * @since 1.x.x
       */
      @Override public boolean loadEncryptMainKeyEX(int keyId, byte[] key, int algorithmType, byte[] checkValue, android.os.Bundle extend) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keyId);
          _data.writeByteArray(key);
          _data.writeInt(algorithmType);
          _data.writeByteArray(checkValue);
          _Parcel.writeTypedObject(_data, extend, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_loadEncryptMainKeyEX, _data, _reply, 0);
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
       * load the work key given decrypt type
       * 
       * @param keyType select the workkey type<BR>
       *     |---1-MAC key, 2-PIN key, 3-TD key<BR>
       *     |---5-(SM4)MAC key, 6-(SM4)PIN key, 7-(SM4)TD key<BR>
       *     |---9-(AES)MAC key, 10-(AES)PIN key, 11-(AES)TD key<BR>
       * @param mkId the id of master key for decrypt work key
       * @param wkId set the workkey id (index 0~99)
       * @param decKeyType select decrypt key type<BR>
       *     |---0x00-3DES master key<BR>
       *     |---0x01-transport key<BR>
       *     |---0x02-SM4 master key<BR>
       *     |---0x03-AES master key<BR>
       *     |---0x04-SM4 transport key<BR>
       *     |---0x05-AES transport key<BR>
       *     |---0x80-CBC 3DES master key<BR>
       *     |---0x81-CBC transport key<BR>
       *     |---0x82-CBC SM4 master key<BR>
       *     |---0x83-CBC AES master key<BR>
       *     |---0x84-CBC SM4 transport key<BR>
       *     |---0x85-CBC AES transport key<BR>
       * @param encrypt key
       * @param checkValue check value (null for none)
       * @param extend - extend param
       * <ul>
       *     <li>isCBCType(boolean) judge the mk encrypt mode whether is CBC mode(default false)</li>
       *     <li>initVec(byte[]) cbc initVec(default 16byte 0)</li>
       * </ul>
       * @return true on success, false on failure
       * @since 1.x.x
       */
      @Override public boolean loadWorkKeyEX(int keyType, int mkId, int wkId, int decKeyType, byte[] key, byte[] checkValue, android.os.Bundle extend) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keyType);
          _data.writeInt(mkId);
          _data.writeInt(wkId);
          _data.writeInt(decKeyType);
          _data.writeByteArray(key);
          _data.writeByteArray(checkValue);
          _Parcel.writeTypedObject(_data, extend, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_loadWorkKeyEX, _data, _reply, 0);
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
       * clear MK & WK(k21 version > 169)
       * 
       * @param keyId clear key id
       * @param keyType
       * <ul>
       * <li> 0x00-DES MK</li>
       * <li> 0x01-SM4 MK</li>
       * <li> 0x02-AES MK</li>
       * <li> 0x10-DES PIN</li>
       * <li> 0x11-SM4 PIN</li>
       * <li> 0x12-AES PIN</li>
       * <li> 0x20-DES MAC</li>
       * <li> 0x21-SM4 MAC</li>
       * <li> 0x22-AES MAC</li>
       * <li> 0x30-DES DATA</li>
       * <li> 0x31-SM4 DATA</li>
       * <li> 0x32-AES DATA</li>
       * <li> 0x40-DES DUKPT</li>
       * <li> 0x41-AES DUKPT</li>
       * <li> 0x50-DES TEK</li>
       * <li> 0x51-AES TEK</li>
       * </ul>
       * @since 1.x.x
       */
      @Override public boolean clearKey(int keyId, int keyType) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keyId);
          _data.writeInt(keyType);
          boolean _status = mRemote.transact(Stub.TRANSACTION_clearKey, _data, _reply, 0);
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
       * load the DUKPT key
       * 
       * @param keyId the id (index 0~99)
       * @param ksn the key serial number
       * @param key the key
       * @param checkValue the check value (default NULL)
       * @param extend - extend param
       * <ul>
       *     <li>loadPlainKey(boolean) load plain key or encrypt key</li>
       *     <li>TEKIndex(int) index of TEK,if isPlainKey is false, need to set this paramater</li>
       * </ul>
       * @return true on success, false on failure
       * @since 1.x.x
       * @deprecated pls use {@see com.vfi.smartpos.deviceservice.aidl.key_manager.IDukpt#loadDukptKey} instead.
       */
      @Override public boolean loadDukptKeyEX(int keyId, byte[] ksn, byte[] key, byte[] checkValue, android.os.Bundle extend) throws android.os.RemoteException
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
          boolean _status = mRemote.transact(Stub.TRANSACTION_loadDukptKeyEX, _data, _reply, 0);
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
       * load TEK key with Algorithm Type given
       * 
       * TEK is the transfer key to encrypt master key
       * @param keyId the id (index, 0 to 99)
       * @param key the key
       * @param algorithmType<BR>
       *     |---0x01-3des encrypted key <BR>
       *     |---0x02-3des plain key <BR>
       *     |---0x03-SM4 encrypte key <BR>
       *     |---0x04-SM4 plain key <BR>
       *     |---0x05-AES encrypted key <BR>
       *     |---0x06-AES plain key
       *     |---0x81-CBC 3des encrypted key <BR>
       *     |---0x82-CBC 3des plain key <BR>
       *     |---0x83-CBC SM4 encrypte key <BR>
       *     |---0x84-CBC SM4 plain key <BR>
       *     |---0x85-CBC AES encrypted key <BR>
       *     |---0x86-CBC AES plain key
       * @param checkValue the check value
       * @param extend - extend param
       * <ul>
       *     <li>isCBCType(boolean) judge the mk encrypt mode whether is CBC mode(default false)</li>
       *     <li>initVec(byte[]) cbc initVec(default 16byte 0)</li>
       * </ul>
       * @return true on success, false on failure
       * @since 1.x.x
       */
      @Override public boolean loadTEKEX(int keyId, byte[] key, byte algorithmType, byte[] checkValue, android.os.Bundle extend) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keyId);
          _data.writeByteArray(key);
          _data.writeByte(algorithmType);
          _data.writeByteArray(checkValue);
          _Parcel.writeTypedObject(_data, extend, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_loadTEKEX, _data, _reply, 0);
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
       * encrypt data or decrypt data by data key
       * 
       * @param keyId - data key index(0~99)
       * @param keyType - key type
       *     |---0x01 data key<BR>
       *     |---0x02 mac key<BR>
       *     |---0x03 pin key<BR>
       * @param encAlg- encryption algorithm<BR>
       *     |---0x01 3DES<BR>
       *     |---0x02 SM4<BR>
       *     |---0x03 AES<BR>
       * @param encMode - encryption mode of operation<BR>
       *     |--0x01 ECB<BR>
       *     |--0x02 CBC<BR>
       * @param encFlag - encryption flag<BR>
       *     |--0x00 encrypt<BR>
       *     |--0x01 decrypt<BR>
       * @param data - data
       * @param extend - extend param
       * <ul>
       *     <li>initVec(byte[]) cbc initVec(default null)</li>
       * </ul>
       * @return the result of encrypt data or decrypt data;
       * @since 2.x.x
       */
      @Override public byte[] calculateByWorkKey(int keyId, int keyType, int encAlg, int encMode, int encFlag, byte[] data, android.os.Bundle extend) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        byte[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keyId);
          _data.writeInt(keyType);
          _data.writeInt(encAlg);
          _data.writeInt(encMode);
          _data.writeInt(encFlag);
          _data.writeByteArray(data);
          _Parcel.writeTypedObject(_data, extend, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_calculateByWorkKey, _data, _reply, 0);
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
       * calculate by MSKey
       * 
       * @param keyId - data key index(0~99)
       * @param keyType - key type
       *     |---0x01 3DES master key<BR>
       *     |---0x02 SM4 master key<BR>
       *     |---0x03 AES master key<BR>
       * @param algorithmMode - encryption algorithm<BR>
       *     |---0x00 encrypt ECB<BR>
       *     |---0x01 decrypt ECB<BR>
       *     |---0x02 encrypt CBC<BR>
       *     |---0x03 decrypt CBC<BR>
       * @param data - data
       * @param extend - extend param
       * <ul>
       *     <li>initVec(byte[]) cbc initVec(default null if not set)</li>
       * </ul>
       * @return the result of encrypt data or decrypt data;
       * @since 2.x.x
       */
      @Override public byte[] calculateByMSKey(int keyId, int keyType, int algorithmMode, byte[] data, android.os.Bundle extend) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        byte[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(keyId);
          _data.writeInt(keyType);
          _data.writeInt(algorithmMode);
          _data.writeByteArray(data);
          _Parcel.writeTypedObject(_data, extend, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_calculateByMSKey, _data, _reply, 0);
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
       * get random data
       * 
       * @param length - length of random data(1~255)
       * @return result of random data;
       * @since 2.x.x
       */
      @Override public byte[] getRandom(byte length) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        byte[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByte(length);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getRandom, _data, _reply, 0);
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
       * inject PIN key event direct
       * 
       * @param type  see PinType
       * enum PinType {
       * PINPAD_BUTTON_TYPE_DIGIT,
       * PINPAD_BUTTON_TYPE_CLEAR,  //means to clear all characters entered so far
       * PINPAD_BUTTON_TYPE_CONFIRM,
       * PINPAD_BUTTON_TYPE_CANCEL,
       * PINPAD_BUTTON_TYPE_BACKSPACE; //clears only one character
       * }
       * 
       * @param key if DIGIT type, key is 0~9, other PinType key set '' empty
       * @return 0-success, other-fail
       * @deprecated
       */
      @Override public int injectPinKey(int type, char key) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(type);
          _data.writeInt(((int)key));
          boolean _status = mRemote.transact(Stub.TRANSACTION_injectPinKey, _data, _reply, 0);
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
       *  App custom pinpad ui interface
       * 
       * @param - parameter
       * <ul>
       *     <li>pinLimit(byte[]) the valid length(s) array of the PIN (such as 0,4,5,6 means the valid length is 0, 4 ~6)</li>
       *     <li>timeout(int) the timeout, second</li>
       *     <li>random(Boolean) - random Pin number(default is false)</li>
       * </ul>
       * @param pinKeyInfos - the list of PinKeyCoorInfo
       * @return result of start Pin
       * @deprecated
       */
      @Override public boolean startPinByInjectType(android.os.Bundle param, com.vfi.smartpos.deviceservice.aidl.PinKeyCoorInfo[] pinKeyInfos) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _Parcel.writeTypedObject(_data, param, 0);
          _data.writeTypedArray(pinKeyInfos, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_startPinByInjectType, _data, _reply, 0);
          _reply.readException();
          _result = (0!=_reply.readInt());
          _reply.readTypedArray(pinKeyInfos, com.vfi.smartpos.deviceservice.aidl.PinKeyCoorInfo.CREATOR);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
    }
    static final int TRANSACTION_isKeyExist = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_loadTEK = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_loadTEKWithAlgorithmType = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_loadEncryptMainKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_loadEncryptMainKeyWithAlgorithmType = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_loadMainKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_loadMainKeyWithAlgorithmType = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_loadDukptKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_loadWorkKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    static final int TRANSACTION_loadWorkKeyWithDecryptType = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
    static final int TRANSACTION_calcMAC = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
    static final int TRANSACTION_calcMACWithCalType = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
    static final int TRANSACTION_encryptTrackData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
    static final int TRANSACTION_encryptTrackDataWithAlgorithmType = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
    static final int TRANSACTION_startPinInput = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
    static final int TRANSACTION_submitPinInput = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
    static final int TRANSACTION_stopPinInput = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
    static final int TRANSACTION_getLastError = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
    static final int TRANSACTION_colculateData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
    static final int TRANSACTION_dukptEncryptData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
    static final int TRANSACTION_savePlainKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
    static final int TRANSACTION_getDukptKsn = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
    static final int TRANSACTION_generateSM2KeyPair = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
    static final int TRANSACTION_getSM3Summary = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
    static final int TRANSACTION_getSM2Sign = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
    static final int TRANSACTION_getKeyKCV = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
    static final int TRANSACTION_initPinInputCustomView = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
    static final int TRANSACTION_startPinInputCustomView = (android.os.IBinder.FIRST_CALL_TRANSACTION + 27);
    static final int TRANSACTION_endPinInputCustomView = (android.os.IBinder.FIRST_CALL_TRANSACTION + 28);
    static final int TRANSACTION_calculateData = (android.os.IBinder.FIRST_CALL_TRANSACTION + 29);
    static final int TRANSACTION_calculateDataEx = (android.os.IBinder.FIRST_CALL_TRANSACTION + 30);
    static final int TRANSACTION_encryptPinFormat0 = (android.os.IBinder.FIRST_CALL_TRANSACTION + 31);
    static final int TRANSACTION_calculateByDataKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 32);
    static final int TRANSACTION_loadEncryptMainKeyEX = (android.os.IBinder.FIRST_CALL_TRANSACTION + 33);
    static final int TRANSACTION_loadWorkKeyEX = (android.os.IBinder.FIRST_CALL_TRANSACTION + 34);
    static final int TRANSACTION_clearKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 35);
    static final int TRANSACTION_loadDukptKeyEX = (android.os.IBinder.FIRST_CALL_TRANSACTION + 36);
    static final int TRANSACTION_loadTEKEX = (android.os.IBinder.FIRST_CALL_TRANSACTION + 37);
    static final int TRANSACTION_calculateByWorkKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 38);
    static final int TRANSACTION_calculateByMSKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 39);
    static final int TRANSACTION_getRandom = (android.os.IBinder.FIRST_CALL_TRANSACTION + 40);
    static final int TRANSACTION_injectPinKey = (android.os.IBinder.FIRST_CALL_TRANSACTION + 41);
    static final int TRANSACTION_startPinByInjectType = (android.os.IBinder.FIRST_CALL_TRANSACTION + 42);
  }
  public static final java.lang.String DESCRIPTOR = "com.vfi.smartpos.deviceservice.aidl.IPinpad";
  /**
   * Check if Key is exists (just support ECB key)
   * 
   * @param keyType
   * <ul>
   * <li>0 MASTER(main) key</li>
   * <li>1 MAC key</li>
   * <li>2 PIN(work) key</li>
   * <li>3 TD key</li>
   * <li>4 (SM) MASTER key</li>
   * <li>5 (SM) MAC key</li>
   * <li>6 (SM) PIN key</li>
   * <li>7 (SM) TD key</li>
   * <li>8 (AES) MASTER key</li>
   * <li>9 (AES) MAC key</li>
   * <li>10 (AES) PIN key</li>
   * <li>11 (AES) TD key</li>
   * <li>12 dukpt key</li>
   * <li>13 TEK</li>
   * <li>14 (SM)TEK</li>
   * <li>15 (AES)TEK</li>
   * </ul>
   * @param keyId the id (dukpt index 0~4, other 0~99) of the key
   * @return true for exist, false for not exists
   * @since 1.x.x
   */
  public boolean isKeyExist(int keyType, int keyId) throws android.os.RemoteException;
  /**
   * load plain TEK key(algorithm = 2, 3des plain key default)
   * 
   * TEK is the transfer key to encrypt master key
   * @param keyId the id (index) , from 0 to 99
   * @param the key
   * @param checkValue the check value
   * @return true on success, false on failure
   * @since 1.x.x
   * @deprecated pls use {@see #loadTEKEX} instead.
   */
  @Deprecated
  public boolean loadTEK(int keyId, byte[] key, byte[] checkValue) throws android.os.RemoteException;
  /**
   * load TEK key with Algorithm Type (ECB default)
   * 
   * TEK is the transfer key to encrypt master key
   * @param keyId the id (index, 0 to 99)
   * @param key the key
   * @param algorithmType 1-3des encrypted key <BR>2-3des plain key <BR>3-SM4 encrypte key <BR>4-SM4 plain key <BR>5-AES encrypted key <BR>6-AES plain key
   * @param checkValue the check value
   * @return true on success, false on failure
   * @since 1.x.x
   * @deprecated pls use {@see #loadTEKEX} instead.
   */
  @Deprecated
  public boolean loadTEKWithAlgorithmType(int keyId, byte[] key, byte algorithmType, byte[] checkValue) throws android.os.RemoteException;
  /**
   * load the encrypted master key (3des ECB algorithm, decrypt TEK index = 0)
   * 
   * @param keyId the id (index, 0 to 99)
   * @param key the encrypted key
   * @param checkValue check value (default NULL)
   * @return true on success, false on failure
   * @since 1.x.x
   * @deprecated pls use {@see #loadEncryptMainKeyEX} instead.
   */
  @Deprecated
  public boolean loadEncryptMainKey(int keyId, byte[] key, byte[] checkValue) throws android.os.RemoteException;
  /**
   * load the encrypted master key given Algorithm Type (ECB, decrypt TEK index = 0)
   * 
   * @param keyId the id (index, 0 to 99)
   * @param key the encrypted key(encrypt by TEK)
   * @param algorithmType 1-3des algorithm <BR>3-SM4 algorithm <BR>5-AES algorithm
   * @param checkValue -  check value (default NULL)
   * @return true on success, false on failure
   * @since 1.x.x
   * @deprecated pls use {@see #loadEncryptMainKeyEX} instead.
   */
  @Deprecated
  public boolean loadEncryptMainKeyWithAlgorithmType(int keyId, byte[] key, int algorithmType, byte[] checkValue) throws android.os.RemoteException;
  /**
   * load the plain master key(3des ECB algorithm default)
   * 
   * @param keyId the id (index)
   * @param key the key
   * @param checkValue the check value (default NULL)
   * @return true on success, false on failure
   * @since 1.x.x
   */
  public boolean loadMainKey(int keyId, byte[] key, byte[] checkValue) throws android.os.RemoteException;
  /**
   * load the plain master key given the algorithm Type (support ECB\CBC)
   * 
   * @param keyId the id (index)
   * @param key the key
   * @param algorithmType
   * 0x02-3des ecb algorithm<BR> 0x04-SM4 ecb algorithm<BR> 0x06-AES ecb algorithm<BR>
   * 0x82-3des cbc algorithm<BR> 0x84-SM4 cbc algorithm<BR> 0x86-AES cbc algorithm<BR>
   * @param checkValue the check value (default NULL)
   * @return true on success, false on failure
   * @since 1.x.x
   */
  public boolean loadMainKeyWithAlgorithmType(int keyId, byte[] key, int algorithmType, byte[] checkValue) throws android.os.RemoteException;
  /**
   * load the encrypt DUKPT key(decrypt TEK index = 0)
   * 
   * @param keyId the id (index 0~99)
   * @param ksn the key serial number
   * @param key the key
   * @param checkValue the check value (default NULL)
   * @return true on success, false on failure
   * @since 1.x.x
   * @deprecated pls use {@see com.vfi.smartpos.deviceservice.aidl.key_manager.IDukpt#loadDukptKey} instead.
   */
  @Deprecated
  public boolean loadDukptKey(int keyId, byte[] ksn, byte[] key, byte[] checkValue) throws android.os.RemoteException;
  /**
   * load the work key (3DES ECB, decrypt by master key)
   * 
   * @param keyType select the workkey type: 1-MAC key, 2-PIN key, 3-TD key
   * @param mkId the id of master key for decrypt work key
   * @param keyId set the workkey id (index 0~99)
   * @param key the key (16bytes)
   * @param checkValue check value (null for none)
   * @return true on success, false on failure
   * @since 1.x.x
   * @deprecated pls use {@see #loadWorkKeyEX} instead.
   */
  @Deprecated
  public boolean loadWorkKey(int keyType, int mkId, int wkId, byte[] key, byte[] checkValue) throws android.os.RemoteException;
  /**
   * load the work key given decrypt type
   * 
   * @param keyType select the workkey type<BR>
   *     |---1-MAC key, 2-PIN key, 3-TD key<BR>
   *     |---5-(SM4)MAC key, 6-(SM4)PIN key, 7-(SM4)TD key<BR>
   *     |---9-(AES)MAC key, 10-(AES)PIN key, 11-(AES)TD key<BR>
   * @param mkId the id of master key for decrypt work key
   * @param wkId set the workkey id (index 0~99)
   * @param decKeyType select decrypt key type<BR>
   *     |---0-3DES master key<BR>
   *     |---1-transport key<BR>
   *     |---2-SM4 master key<BR>
   *     |---3-AES master key<BR>
   * @param encrypt key
   * @param checkValue check value (null for none)
   * @return true on success, false on failure
   * @since 1.x.x
   * @deprecated pls use {@see #loadWorkKeyEX} instead.
   */
  @Deprecated
  public boolean loadWorkKeyWithDecryptType(int keyType, int mkId, int wkId, int decKeyType, byte[] key, byte[] checkValue) throws android.os.RemoteException;
  /**
   * calcuate the MAC (3des default & X919)
   * 
   * @param keyId the index of MAC KEY
   * @param data the source date
   * @return the mac value, null means failure
   * @since 1.x.x
   * @deprecated pls use {@see #calcMACWithCalType} instead.
   */
  @Deprecated
  public byte[] calcMAC(int keyId, byte[] data) throws android.os.RemoteException;
  /**
   * calcute the MAC with given type
   * 
   * @param keyId the index of MAC KEY(0~99) or dukpt key(0~4)
   * @param type Calculation mode 0x00-MAC X99; 0x01-MAC X919; 0x02-ECB (CUP standard ECB algorithm); 0x03-MAC 9606; 0x04-CBC MAC calculation
   * @param CBCInitVec - CBC initial vector. fixed length 8, can be null, default 8 bytes 0x00
   * @param data the source date
   * @param desType encrypt type<BR>
   * <b style="text-decoration:line-through;">|--0x00-des</b><BR>
   * |--0x01-3des<BR>
   * |--0x02-sm4<BR>
   * |--0x03-aes<BR>
   * @param dukptRequest true means the keyId is dukpt key id
   * @return the mac value, null means failure
   * @since 1.x.x
   */
  public byte[] calcMACWithCalType(int keyId, int type, byte[] CBCInitVec, byte[] data, int desType, boolean dukptRequest) throws android.os.RemoteException;
  /**
   * encrypt the trace date(3des algorithm default)
   * 
   * @param mode mode , 0 for ECB, 1 for CBC
   * @param keyId the id of TDK
   * @param trkData the track date
   * @return @return the encrypted track data, null means failure
   * @since 1.x.x
   * @deprecated pls use {@see #encryptTrackDataWithAlgorithmType} instead.
   */
  @Deprecated
  public byte[] encryptTrackData(int mode, int keyId, byte[] trkData) throws android.os.RemoteException;
  /**
   * encrypt the trace date given algorithm type
   * 
   * @param mode mode , 0 for ECB, 1 for CBC
   * @param keyId the id of TDK(0~99) or dukpt key(0~4)
   * @param AlgorithmType algorithmType type 0x01-3des 0x02-SM4 0x03-AES
   * @param trkData the track date
   * @param dukptRequest if true, the keyId is dukpt key id
   * @return the encrypted track data, null means failure
   * @since 1.x.x
   */
  public byte[] encryptTrackDataWithAlgorithmType(int mode, int keyId, int algorithmType, byte[] trkData, boolean dukptRequest) throws android.os.RemoteException;
  /**
   * start PIN input
   * 
   * @param keyId the index of PIN KEY(0~99) or dukpt key (0~4)
   * @param param the parameter
   * <ul>
   * <li>pinLimit(byte[]) the valid length(s) array of the PIN (such as {0,4,5,6} means the valid length is 0, 4 ~6)</li>
   * <li>timeout(int) the timeout, second</li>
   * <li>isOnline(boolean) is a online PIN</li>
   * <li>promptString(String) the prompt string</li>
   * <li>pan(String) the pan for encrypt online PIN</li>
   * <li>desType(int) calculate type<BR>
   *   |----0x01 MK/SK + 3DES (default)<BR>
   *   |----0x02 MK/SK + AES<BR>
   *   |----0x03 MK/SK + SM4<BR>
   *   |----0x04 DUKPT + 3DES<BR>
   * </li>
   * <li>numbersFont(String) - url of numbers ttf font (value "" is android system fonts)</li>
   * <li>promptsFont(String) - url of prompt ttf font(value "" is android system fonts)</li>
   * <li>otherFont(String) - url of other ttf font(confirm button & backspace button)(value "" is android system fonts)</li>
   * <li>displayKeyValue(byte[]) - custom the sequence key number of pinpad</li>
   * <li>random(byte[]) - random number participation in pinblock calculation(default not set)</li>
   * <li>notificatePinLenError(boolean) - Notification password is not long enough(default false)</li>
   * <li>pinFormatType(int) - default is format0, 0-format0, 1-format1, 2-format2, 3-format3, 4-format4</li>
   * <li>dispersionType(int) - default is 0(DES112), 0-DES112, 1-DES168, 2-AES128, 3-AES192, 4-AES256</li>
   * </ul>
   * @param listener the call back listener
   * @param globalParam - set global display (if set null, 0~9 are Arabic numerals and confirm/backspace button are english display)
   * <ul>
   *     <li>Display_One(String)</li>
   *     <li>Display_Two(String)</li>
   *     <li>Display_Three(String)</li>
   *     <li>Display_Four(String)</li>
   *     <li>Display_Five(String)</li>
   *     <li>Display_Six(String)</li>
   *     <li>Display_Seven(String)</li>
   *     <li>Display_Eight(String)</li>
   *     <li>Display_Nine(String)</li>
   *     <li>Display_Zero(String)</li>
   *     <li>Display_Confirm(String)</li>
   *     <li>Display_BackSpace(String)</li>
   * </ul>
   * @return
   * @since 1.x.x
   */
  public void startPinInput(int keyId, android.os.Bundle param, android.os.Bundle globleParam, com.vfi.smartpos.deviceservice.aidl.PinInputListener listener) throws android.os.RemoteException;
  /**
   * submit the pin input
   * @since 1.x.x
   */
  public void submitPinInput() throws android.os.RemoteException;
  /**
   * stop the pin input
   * @since 1.x.x
   * @deprecated pls clicked cannel button on UI page
   */
  @Deprecated
  public void stopPinInput() throws android.os.RemoteException;
  /**
   * get the last error
   * @return the description of the last error
   * @since 1.x.x
   */
  public java.lang.String getLastError() throws android.os.RemoteException;
  /**
   * same the "calculateData"
   * @since 1.x.x
   * @deprecated See {@see #calculateDataEx}
   */
  @Deprecated
  public byte[] colculateData(int mode, int desType, byte[] key, byte[] data) throws android.os.RemoteException;
  /**
   * DUKPT encrypt
   * 
   * @param desType the type of encrypt
   * <ul>
   * <li>TYPE_DES - 0x00 DES Type </li>
   * <li>TYPE_3DES - 0x01 3DES Type </li>
   * <li>TYPE_SM4 - 0x02 SM4 Type</li>
   * <li>TYPE_AES - 0x03 AES Type</li>
   * </ul>
   * @param algorithm the type of algorithm 0x01-CBC 0x02-ECB
   * @param keyid - index of key (0~4)
   * @param data - the source date
   * @param CBCInitVec - CBC initial vector. fixed length 8, can be null, default 8 bytes 0x00
   * @since 1.x.x
   * @deprecated pls use {@see com.vfi.smartpos.deviceservice.aidl.key_manager.IDukpt#calculateData} instead.
   */
  @Deprecated
  public byte[] dukptEncryptData(int destype, int algorithm, int keyid, byte[] data, byte[] CBCInitVec) throws android.os.RemoteException;
  /**
   * save the plain key(just support 3des, )
   * 
   * @param keyType the key type 1 for MAC ，2 for PIN ，3 for TD
   * @param keyId the index of KEY
   * @param key the source key
   * @since 1.x.x
   * @deprecated
   */
  @Deprecated
  public boolean savePlainKey(int keyType, int keyId, byte[] key) throws android.os.RemoteException;
  /**
   * get the current KSN
   * 
   * @return the current dukpt ksn
   * @since 1.x.x
   * @deprecated pls use {@see com.vfi.smartpos.deviceservice.aidl.key_manager.IDukpt#getDukptKsn} instead.
   */
  @Deprecated
  public byte[] getDukptKsn() throws android.os.RemoteException;
  /**
   * get the SM2 public key & private key
   * 
   * @return bundle
   * <ul>
   *     <li>publicKey(string)</li>
   *     <li>privateKey(string)</li>
   * </ul>
   * @since 1.x.x
   * @deprecated
   */
  @Deprecated
  public android.os.Bundle generateSM2KeyPair() throws android.os.RemoteException;
  /**
   * Get SM3 data summary
   * 
   * @data - data;
   * @return byte[] summary
   * @since 1.x.x
   * @deprecated
   */
  @Deprecated
  public byte[] getSM3Summary(byte[] data) throws android.os.RemoteException;
  /**
   * get the SM2 sign
   * 
   * @param bundle
   * <ul>
   *     <li>prikey(byte[])</li> - the private key
   *     <li>data(byte[])</li> - the data want to sign
   * </ul>
   * @return calculate resule;
   * @since 1.x.x
   * @deprecated
   */
  @Deprecated
  public byte[] getSM2Sign(android.os.Bundle bundle) throws android.os.RemoteException;
  /**
   * Get the checkValue of key
   * 
   * @keyIndex - the index of key
   * @keyType - type of key<BR>
   *     0x01 data encryption key;<BR>
   *     0x02 PIN working key<BR>
   *     0x03 MAC key;<BR>
   *     0x04 transfer key<BR>
   *     0x05 Main key<BR>
   *     0x11 data encryption key(SM4)<BR>
   *     0x12 PIN working key(SM4)<BR>
   *     0x13 MAC key(SM4)<BR>
   *     0x14 sm4transport key(SM4)<BR>
   *     0x15 master key(SM4)<BR>
   *     0x21 DATA key(AES)<BR>
   *     0x22 PIN key(AES)<BR>
   *     0x23 MAC key(AES)<BR>
   *     0x24 AES transmission key<BR>
   *     0x25 AES master key<BR>
   *  @return the check value of the key
   * @since 1.x.x
   */
  public byte[] getKeyKCV(int keyIndex, int keyType) throws android.os.RemoteException;
  /**
   * App custom pinpad ui interface
   * 
   * @keyId - pinkey id (the id is the loadWorkKey(pin) id);
   * @param - parameter
   * <ul>
   *     <li>pinLimit(byte[]) the valid length(s) array of the PIN (such as 0,4,5,6 means the valid length is 0, 4 ~6)</li>
   *     <li>timeout(int) the timeout, second</li>
   *     <li>isOnline(boolean) - is a online PIN</li>
   *     <li>pan(String) - the pan for encrypt online PIN</li>
   *     <li>desType(int) - calculate type <BR>
   *       |----0x01 MK/SK + 3DES (default)<BR>
   *       |----0x02 MK/SK + AES<BR>
   *       |----0x03 MK/SK + SM4<BR>
   *       |----0x04 DUKPT + 3DES<BR>
   *     </li>
   *     <li>displayKeyValue(byte[]) - custom the sequence key number of pinpad</li>
   *     <li>random(byte[]) - random number participation in pinblock calculation(default not set)</li>
   *     <li>pinFormatType(int) - default is format0, 0-format0, 1-format1, 2-format2, 3-format3, 4-format4</li>
   *     <li>dispersionType(int) - default is 0(DES112), 0-DES112, 1-DES168, 2-AES128, 3-AES192, 4-AES256</li>
   * </ul>
   * @pinKeyInfos - the list of PinKeyCoorInfo
   * @listener - listener of PinInputListener
   * @return  map<String String> - the value of 0~9 key to display
   * @since 2.x.x
   */
  public java.util.Map initPinInputCustomView(int keyId, android.os.Bundle param, java.util.List<com.vfi.smartpos.deviceservice.aidl.PinKeyCoorInfo> pinKeyInfos, com.vfi.smartpos.deviceservice.aidl.PinInputListener listener) throws android.os.RemoteException;
  /**
   * Execute this interface to activate pinpad.
   * 
   * If you get Map<string string>, you should traversal the map to get the value of key to display.
   * @since 2.x.x
   */
  public void startPinInputCustomView() throws android.os.RemoteException;
  /**
   * stop custom pinpad
   * 
   * @since 2.x.x
   */
  public void endPinInputCustomView() throws android.os.RemoteException;
  /**
   * encrypt or decrypt data
   * 
   * @param mode the mode of encrypt or decrypt
   * <ul>
   * <li>0x00 MK/SK ECB encrypt </li>
   * <li>0x01 MK/SK ECB decrypt </li>
   * <li>0x02 MK/SK CBC encrypt </li>
   * <li>0x03 MK/SK CBC decrypt </li>
   * </ul>
   * @param desType the type of encrypt or decrypt
   * <ul>
   * <li>TYPE_DES - 0x00 DES Type  </li>
   * <li>TYPE_3DES - 0x01 3DES Type(EBC)  </li>
   * <li style="text-decoration:line-through;">TYPE_SM4 - 0x02 SM4 Type </li>
   * <li style="text-decoration:line-through;">TYPE_AES - 0x03 AES Type </li>
   * <li>TYPE_SM2_PUBKEY - 0x04 SM2 Type(use public key) </li>
   * <li>TYPE_SM2_PRIVKEY - 0x05 SM2 Type(use private key) </li>
   * <li>TYPE_3DES - 0x06 3DES Type(CBC, initVec = 00000000) </li>
   * </ul>
   * @param key the source key
   * @param data the source date
   * 
   * @return the encrypted or decrypted data, null means failure
   * @since 1.x.x
   * @deprecated pls use {#calculateDataEx} instead.
   */
  @Deprecated
  public byte[] calculateData(int mode, int desType, byte[] key, byte[] data) throws android.os.RemoteException;
  /**
   * encrypt or decrypt data
   * 
   * @param mode the mode of encrypt or decrypt
   * <ul>
   * <li>0x00 MK/SK ECB encrypt </li>
   * <li>0x01 MK/SK ECB decrypt </li>
   * <li>0x02 MK/SK CBC encrypt </li>
   * <li>0x03 MK/SK CBC decrypt </li>
   * </ul>
   * @param desType the type of encrypt or decrypt
   * <ul>
   * <li>TYPE_DES - 0x00 DES Type </li>
   * <li>TYPE_3DES - 0x01 3DES Type(EBC) </li>
   * <li>TYPE_SM4 - 0x02 SM4 Type </li>
   * <li>TYPE_AES - 0x03 AES Type</li>
   * <li style="text-decoration:line-through;">TYPE_SM2_PUBKEY - 0x04 SM2 Type(use public key) </li>
   * <li style="text-decoration:line-through;">TYPE_SM2_PRIVKEY - 0x05 SM2 Type(use private key) </li>
   * <li style="text-decoration:line-through;">TYPE_3DES - 0x06 3DES Type(CBC) NOTICE: WorkKey(TD) id = 60 will be occupied, so user app should not use 60 index of TD </li>
   * </ul>
   * @param key the source key
   * @param data the source date
   * @param initVec 3des cbc init vector
   * 
   * @return the encrypted or decrypted data, null means failure
   * @since 1.x.x
   */
  public byte[] calculateDataEx(int mode, int desType, byte[] key, byte[] data, byte[] initVec) throws android.os.RemoteException;
  /**
   * encrypt pinblock from cardnumber & passwd
   * 
   * @param pinKeyId the index of PIN KEY(0~99)
   * @param desType calculate type <BR>
   *   |----0x01 MK/SK + 3DES (default)<BR>
   *   |----0x02 MK/SK + AES<BR>
   *   |----0x03 MK/SK + SM4<BR>
   *   |----0x04 DUKPT + 3DES<BR>
   * @param cardNumber - card number (ascii type, such as "1234", you should input byte[4] = "31 32 33 34")
   * @param passws- plain password (String type, such as "1234", you should input String = "1234")
   * @since 1.x.x
   */
  public byte[] encryptPinFormat0(int pinKeyId, int desType, byte[] cardNumber, java.lang.String passwd) throws android.os.RemoteException;
  /**
   * encrypt data or decrypt data by data key
   * 
   * @param keyId - data key index(0~99)
   * @param encAlg- encryption algorithm<BR>
   *     |---0x01 3DES<BR>
   *     |---0x02 SM4<BR>
   *     |---0x03 AES<BR>
   * @param encMode - encryption mode of operation<BR>
   *     |--0x01 ECB<BR>
   *     |--0x02 CBC<BR>
   * @param encFlag - encryption flag<BR>
   *     |--0x00 encrypt<BR>
   *     |--0x01 decrypt<BR>
   * @param data - data
   * @param initVec - init vec，default set null;
   * @return the result of encrypt data or decrypt data;
   * @since 1.x.x
   */
  public byte[] calculateByDataKey(int keyId, int encAlg, int encMode, int encFlag, byte[] data, byte[] initVec) throws android.os.RemoteException;
  /**
   * load the encrypted master key given Algorithm Type
   * 
   * @param keyId the id (index, 0 to 99)
   * @param key the encrypted key
   * @param algorithmType 0x01-3des algorithm<BR> 0x03-SM4 algorithm<BR> 0x05-AES algorithm<BR> 0x81-3des(cbc)<BR> 0x83-SM4(cbc)<BR> 0x85-AES(cbc)<BR>
   * @param check value (default NULL)
   * @param extend - extend param
   * <ul>
   *     <li>isCBCType(boolean) judge the mk encrypt mode whether is CBC mode(default false)</li>
   *     <li>initVec(byte[]) cbc initVec(default 16byte 0)</li>
   *     <li>isMasterEncMasterMode(boolean) master key can encrypt master key, if pos has loaded Master key</li>
   *     <li>decryptKeyIndex(int) (index 0 to 99)Decrypt key index. Will use the KeyId if not set and after that the last key will be overwritten.</li>
   * </ul>
   * @return true for success, false for failure
   * @since 1.x.x
   */
  public boolean loadEncryptMainKeyEX(int keyId, byte[] key, int algorithmType, byte[] checkValue, android.os.Bundle extend) throws android.os.RemoteException;
  /**
   * load the work key given decrypt type
   * 
   * @param keyType select the workkey type<BR>
   *     |---1-MAC key, 2-PIN key, 3-TD key<BR>
   *     |---5-(SM4)MAC key, 6-(SM4)PIN key, 7-(SM4)TD key<BR>
   *     |---9-(AES)MAC key, 10-(AES)PIN key, 11-(AES)TD key<BR>
   * @param mkId the id of master key for decrypt work key
   * @param wkId set the workkey id (index 0~99)
   * @param decKeyType select decrypt key type<BR>
   *     |---0x00-3DES master key<BR>
   *     |---0x01-transport key<BR>
   *     |---0x02-SM4 master key<BR>
   *     |---0x03-AES master key<BR>
   *     |---0x04-SM4 transport key<BR>
   *     |---0x05-AES transport key<BR>
   *     |---0x80-CBC 3DES master key<BR>
   *     |---0x81-CBC transport key<BR>
   *     |---0x82-CBC SM4 master key<BR>
   *     |---0x83-CBC AES master key<BR>
   *     |---0x84-CBC SM4 transport key<BR>
   *     |---0x85-CBC AES transport key<BR>
   * @param encrypt key
   * @param checkValue check value (null for none)
   * @param extend - extend param
   * <ul>
   *     <li>isCBCType(boolean) judge the mk encrypt mode whether is CBC mode(default false)</li>
   *     <li>initVec(byte[]) cbc initVec(default 16byte 0)</li>
   * </ul>
   * @return true on success, false on failure
   * @since 1.x.x
   */
  public boolean loadWorkKeyEX(int keyType, int mkId, int wkId, int decKeyType, byte[] key, byte[] checkValue, android.os.Bundle extend) throws android.os.RemoteException;
  /**
   * clear MK & WK(k21 version > 169)
   * 
   * @param keyId clear key id
   * @param keyType
   * <ul>
   * <li> 0x00-DES MK</li>
   * <li> 0x01-SM4 MK</li>
   * <li> 0x02-AES MK</li>
   * <li> 0x10-DES PIN</li>
   * <li> 0x11-SM4 PIN</li>
   * <li> 0x12-AES PIN</li>
   * <li> 0x20-DES MAC</li>
   * <li> 0x21-SM4 MAC</li>
   * <li> 0x22-AES MAC</li>
   * <li> 0x30-DES DATA</li>
   * <li> 0x31-SM4 DATA</li>
   * <li> 0x32-AES DATA</li>
   * <li> 0x40-DES DUKPT</li>
   * <li> 0x41-AES DUKPT</li>
   * <li> 0x50-DES TEK</li>
   * <li> 0x51-AES TEK</li>
   * </ul>
   * @since 1.x.x
   */
  public boolean clearKey(int keyId, int keyType) throws android.os.RemoteException;
  /**
   * load the DUKPT key
   * 
   * @param keyId the id (index 0~99)
   * @param ksn the key serial number
   * @param key the key
   * @param checkValue the check value (default NULL)
   * @param extend - extend param
   * <ul>
   *     <li>loadPlainKey(boolean) load plain key or encrypt key</li>
   *     <li>TEKIndex(int) index of TEK,if isPlainKey is false, need to set this paramater</li>
   * </ul>
   * @return true on success, false on failure
   * @since 1.x.x
   * @deprecated pls use {@see com.vfi.smartpos.deviceservice.aidl.key_manager.IDukpt#loadDukptKey} instead.
   */
  @Deprecated
  public boolean loadDukptKeyEX(int keyId, byte[] ksn, byte[] key, byte[] checkValue, android.os.Bundle extend) throws android.os.RemoteException;
  /**
   * load TEK key with Algorithm Type given
   * 
   * TEK is the transfer key to encrypt master key
   * @param keyId the id (index, 0 to 99)
   * @param key the key
   * @param algorithmType<BR>
   *     |---0x01-3des encrypted key <BR>
   *     |---0x02-3des plain key <BR>
   *     |---0x03-SM4 encrypte key <BR>
   *     |---0x04-SM4 plain key <BR>
   *     |---0x05-AES encrypted key <BR>
   *     |---0x06-AES plain key
   *     |---0x81-CBC 3des encrypted key <BR>
   *     |---0x82-CBC 3des plain key <BR>
   *     |---0x83-CBC SM4 encrypte key <BR>
   *     |---0x84-CBC SM4 plain key <BR>
   *     |---0x85-CBC AES encrypted key <BR>
   *     |---0x86-CBC AES plain key
   * @param checkValue the check value
   * @param extend - extend param
   * <ul>
   *     <li>isCBCType(boolean) judge the mk encrypt mode whether is CBC mode(default false)</li>
   *     <li>initVec(byte[]) cbc initVec(default 16byte 0)</li>
   * </ul>
   * @return true on success, false on failure
   * @since 1.x.x
   */
  public boolean loadTEKEX(int keyId, byte[] key, byte algorithmType, byte[] checkValue, android.os.Bundle extend) throws android.os.RemoteException;
  /**
   * encrypt data or decrypt data by data key
   * 
   * @param keyId - data key index(0~99)
   * @param keyType - key type
   *     |---0x01 data key<BR>
   *     |---0x02 mac key<BR>
   *     |---0x03 pin key<BR>
   * @param encAlg- encryption algorithm<BR>
   *     |---0x01 3DES<BR>
   *     |---0x02 SM4<BR>
   *     |---0x03 AES<BR>
   * @param encMode - encryption mode of operation<BR>
   *     |--0x01 ECB<BR>
   *     |--0x02 CBC<BR>
   * @param encFlag - encryption flag<BR>
   *     |--0x00 encrypt<BR>
   *     |--0x01 decrypt<BR>
   * @param data - data
   * @param extend - extend param
   * <ul>
   *     <li>initVec(byte[]) cbc initVec(default null)</li>
   * </ul>
   * @return the result of encrypt data or decrypt data;
   * @since 2.x.x
   */
  public byte[] calculateByWorkKey(int keyId, int keyType, int encAlg, int encMode, int encFlag, byte[] data, android.os.Bundle extend) throws android.os.RemoteException;
  /**
   * calculate by MSKey
   * 
   * @param keyId - data key index(0~99)
   * @param keyType - key type
   *     |---0x01 3DES master key<BR>
   *     |---0x02 SM4 master key<BR>
   *     |---0x03 AES master key<BR>
   * @param algorithmMode - encryption algorithm<BR>
   *     |---0x00 encrypt ECB<BR>
   *     |---0x01 decrypt ECB<BR>
   *     |---0x02 encrypt CBC<BR>
   *     |---0x03 decrypt CBC<BR>
   * @param data - data
   * @param extend - extend param
   * <ul>
   *     <li>initVec(byte[]) cbc initVec(default null if not set)</li>
   * </ul>
   * @return the result of encrypt data or decrypt data;
   * @since 2.x.x
   */
  public byte[] calculateByMSKey(int keyId, int keyType, int algorithmMode, byte[] data, android.os.Bundle extend) throws android.os.RemoteException;
  /**
   * get random data
   * 
   * @param length - length of random data(1~255)
   * @return result of random data;
   * @since 2.x.x
   */
  public byte[] getRandom(byte length) throws android.os.RemoteException;
  /**
   * inject PIN key event direct
   * 
   * @param type  see PinType
   * enum PinType {
   * PINPAD_BUTTON_TYPE_DIGIT,
   * PINPAD_BUTTON_TYPE_CLEAR,  //means to clear all characters entered so far
   * PINPAD_BUTTON_TYPE_CONFIRM,
   * PINPAD_BUTTON_TYPE_CANCEL,
   * PINPAD_BUTTON_TYPE_BACKSPACE; //clears only one character
   * }
   * 
   * @param key if DIGIT type, key is 0~9, other PinType key set '' empty
   * @return 0-success, other-fail
   * @deprecated
   */
  @Deprecated
  public int injectPinKey(int type, char key) throws android.os.RemoteException;
  /**
   *  App custom pinpad ui interface
   * 
   * @param - parameter
   * <ul>
   *     <li>pinLimit(byte[]) the valid length(s) array of the PIN (such as 0,4,5,6 means the valid length is 0, 4 ~6)</li>
   *     <li>timeout(int) the timeout, second</li>
   *     <li>random(Boolean) - random Pin number(default is false)</li>
   * </ul>
   * @param pinKeyInfos - the list of PinKeyCoorInfo
   * @return result of start Pin
   * @deprecated
   */
  @Deprecated
  public boolean startPinByInjectType(android.os.Bundle param, com.vfi.smartpos.deviceservice.aidl.PinKeyCoorInfo[] pinKeyInfos) throws android.os.RemoteException;
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
