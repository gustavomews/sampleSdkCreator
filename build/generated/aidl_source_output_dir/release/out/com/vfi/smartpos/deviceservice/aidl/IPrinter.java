/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.vfi.smartpos.deviceservice.aidl;
/**
 * <p>The printer object to print strings, barcode, QR code, image
 * @author Kai.L@verifone.cn, Chao.L@verifone.cn
 */
public interface IPrinter extends android.os.IInterface
{
  /** Default implementation for IPrinter. */
  public static class Default implements com.vfi.smartpos.deviceservice.aidl.IPrinter
  {
    /**
     * <p> get printer status
     * 
     * @return the status:
     * <ul>
     * <li>ERROR_NONE(0x00) - normal</li>
     * <li>ERROR_PAPERENDED(0xF0) - Paper out</li>
     * <li>ERROR_NOCONTENT(0xF1) - no content</li>
     * <li>ERROR_HARDERR(0xF2) - printer error</li>
     * <li>ERROR_OVERHEAT(0xF3) - over heat</li>
     * <li>ERROR_NOBM(0xF6) - no black mark</li>
     * <li>ERROR_BUSY(0xF7) - printer is busy</li>
     * <li>ERROR_MOTORERR(0xFB) - moto error</li>
     * <li>ERROR_LOWVOL(0xE1) - battery low</li>
     * <li>ERROR_NOTTF(0xE2) - no ttf</li>
     * <li>ERROR_BITMAP_TOOWIDE(0xE3) - width of bitmap too wide</li>
     * </ul>
     * @since 1.x.x
     */
    @Override public int getStatus() throws android.os.RemoteException
    {
      return 0;
    }
    /**
     * <p> Set the gray level of printing
     * 
     * @param gray the value from 0 to 7
     * @since 1.x.x
     */
    @Override public void setGray(int gray) throws android.os.RemoteException
    {
    }
    /**
     * <p> Add text string to print
     * @param format set text format, the key of format param as follow:
     * <ul>
     *   <li>{@code int}font</li>
     *   <li>{@code String}fontStyle; sustom font type by passing /xxxx/abc.ttf, default is using /system/fonts/fzzdx.ttf if not set</li>
     *   <li>{@code boolean}bold; {code true}:bold, @{code false}:normal</li>
     *   <li>{@code int}align; {code 0}:left, @{code 1}:center, @{code 2}:right</li>
     *   <li>{@code boolean}newline; {code true}:new line after prin, @{code false}:normal</li>
     *   <li>{@code float}scale_w; (descrption: multiple Width)</li>
     *   <li>{@code float}scale_h; (descrption: multiple Height)</li>
     * </ul>
     * <p> the key of font format as follow:
     * <ul>
     *   <li>0(description:small(size16))
     *   <li>1(description:normal(size24))
     *   <li>2(description:normal_bigger(size24 double height & bold))
     *   <li>3(description:large(size32))
     *   <li>4(description:large_bigger(size32 double height & bold))
     *   <li>5(description:huge(size48))
     *   <li>6(description:normal_wide(size24 double width & bold))
     *   <li>7(description:large_wide(size32 double width & bold)))
     * </ul>
     * <p><pre>{@code
     *      Bundle bundle = new Bundle;
     *      bundle.putBoolean("bold", true);
     *      bundle.putBoolean("newline", true);
     *      bundle.putInt("font", 1);
     *      bundle.putInt("align", 1);
     *      bundle.putFloat("scale_w", 100.0f);
     *      bundle.putFloat("scale_h", 100.0f);
     * }
     * </pre>
     * @param text the text string want to print
     * @since 1.x.x
     */
    @Override public void addText(android.os.Bundle format, java.lang.String text) throws android.os.RemoteException
    {
    }
    /**
     * <p> Add text strings to print.
     * 
     * @param format set text format, the key of format param as follow:
     * <ul>
     *   <li>{@code int}fontSize</li>
     *   <li>{@code boolean}bold; {code true}:bold, @{code false}:normal</li>
     *   <li>{@code String}fontStyle</li>
     * </ul>
     * <p> the key of fontSize format as follow:
     * <ul>
     *   <li>0(description:small(size16))
     *   <li>1(description:normal(size24))
     *   <li>2(description:normal_bigger(size24 double height & bold))
     *   <li>3(description:large(size32))
     * </ul>
     * <p> the key of fontStyle format as follow:
     * <ul>
     *   <li>/xxxx/xx.ttf(absolute path, custom font by user)</li>
     * </ul>
     * <p><pre>{@code
     *      Bundle bundle = new Bundle;
     *      bundle.putBoolean("bold", true);
     *      bundle.putInt("fontSize", 1);
     * }
     * </pre>
     * 
     * @param lString the left justifying String
     * @param mString the middle(center) justifying String
     * @param rString the right justifying String
     * @param mode - {@code 0} : the left & right justifying divide the width equally, {code 1} : the left & right justifying divide the width flexiable
     * @since 1.x.x
     */
    @Override public void addTextInLine(android.os.Bundle format, java.lang.String lString, java.lang.String mString, java.lang.String rString, int mode) throws android.os.RemoteException
    {
    }
    /**
     * <p> Add barcode to print(CodeType Code128)
     * @param format set bar format, the key of format param as follow:
     * <ul>
     *   <li>align(description: {@code 0}:left, {@code 1}:center, {@code 2}:right)</li>
     *   <li>height(description: the height of barcode)</li>
     *   <li>barCodeType, refer to below:</li>
     *    <pre>
     *         public enum BarcodeFormat {
     *             AZTEC,
     *             CODABAR,
     *             CODE_39,
     *             CODE_93,
     *             CODE_128,
     *             DATA_MATRIX,
     *             EAN_8,
     *             EAN_13,
     *             ITF,
     *             MAXICODE(not support),
     *             PDF_417,
     *             QR_CODE(not support),
     *             RSS_14(not support),
     *             RSS_EXPANDED,
     *             UPC_A,
     *             UPC_E,
     *             UPC_EAN_EXTENSION(not support);
     *        }
     *        Default: "BarcodeFormat.CODE_128.ordinal()"
     *   </pre>
     * </ul>
     * @param barcode - the barcode string
     * @since 1.x.x
     */
    @Override public void addBarCode(android.os.Bundle format, java.lang.String barcode) throws android.os.RemoteException
    {
    }
    /**
     * <p> add a QR code to print
     * @param format set qr code format, the key of format param as follow:
     * <ul>
     *   <li>{@code int}offset (description:the offset from the left)</li>
     *   <li>{@code int}expectedHeight (description:the expected height & width of the QR code. The actual size should multiple of the minimun pixel size of QR code)</li>
     * </ul>
     * @param qrCode the string of the QR code
     * @since 1.x.x
     */
    @Override public void addQrCode(android.os.Bundle format, java.lang.String qrCode) throws android.os.RemoteException
    {
    }
    /**
     * <p> add multi-QR codes to print
     * 
     * @param qrCodes {@link QrCodeContent}
     * @since 1.x.x
     */
    @Override public void addQrCodesInLine(java.util.List<com.vfi.smartpos.deviceservice.aidl.QrCodeContent> qrCodes) throws android.os.RemoteException
    {
    }
    /**
     * <p> Add an image to print
     * @param format set image format, the key of format param as follow:
     * <ul>
     *    <li>{@code int}offset (description:the offset from left)</li>
     *    <li>@code int}width (description:the width of the image want to print.(MAX = 384))</li>
     *    <li>@code int}height (description:the height want to print)</li>
     *    <li>@code int}gray (description:set pixcel gray to pint(0~255 default = 128))</li>
     * </ul>
     * @param imageData the image byte buffer
     * @since 1.x.x
     */
    @Override public void addImage(android.os.Bundle format, byte[] imageData) throws android.os.RemoteException
    {
    }
    /**
     * <p> Feed the paper
     * 
     * @param lines lines should > 1 && lines <= 50<BR>The lines should be the actual lines+1 because the current line need be counted.
     * @since 1.x.x
     */
    @Override public void feedLine(int lines) throws android.os.RemoteException
    {
    }
    /**
     * <p> Start print
     * 
     * @param listener {@link PrinterListener}the call back listener to tell the print result.
     * @since 1.x.x
     */
    @Override public void startPrint(com.vfi.smartpos.deviceservice.aidl.PrinterListener listener) throws android.os.RemoteException
    {
    }
    /**
     * <p> Start print remain the cache
     * 
     * @param listener {@link PrinterListener}the call back listener to tell the print result.
     * @since 1.x.x
     */
    @Override public void startSaveCachePrint(com.vfi.smartpos.deviceservice.aidl.PrinterListener listener) throws android.os.RemoteException
    {
    }
    /**
     * <p> Set the line space
     * 
     * @param space - the lines of space : 0~50
     * @since 1.x.x
     */
    @Override public void setLineSpace(int space) throws android.os.RemoteException
    {
    }
    /**
     * <p> add some print in emv progress, <b>not end of emv process</b>
     * 
     * @param listener the call back listener to tell the print result
     * @since 1.x.x
     */
    @Override public void startPrintInEmv(com.vfi.smartpos.deviceservice.aidl.PrinterListener listener) throws android.os.RemoteException
    {
    }
    /**
     * <p> clear printer cache
     * 
     * @return {@code 1} : sucessed; {@code 0} : failed
     * @since 1.x.x
     */
    @Override public int cleanCache() throws android.os.RemoteException
    {
      return 0;
    }
    /**
     * <p> Add an image to print
     * 
     * @param format set bitmap format, the key of format param as follow:
     * <ul>
     *    <li>{@code int}offset (descriptionthe offset from left)</li>
     *    <li>{@code int}width (descriptionthe width of the image want to print.(MAX = 384))</li>
     *    <li>{@code int}height (descriptionthe height want to print)</li>
     *    <li>{@code int}gray (descriptionset pixcel gray to pint(0~255 default = 128))</li>
     * </ul>
     * @param imageData descriptionthe image buffer.
     * @since 2.x.x
     */
    @Override public void addBmpImage(android.os.Bundle format, android.graphics.Bitmap image) throws android.os.RemoteException
    {
    }
    /**
     * <p> Add screen capture to print
     * @param format set screen capture format, the key of format param as follow:
     * <ul>
     *    <li>{@code int}offset (descriptionthe offset from left)</li>
     *    <li>{@code int}width (descriptionthe width want to print.(MAX = 384))</li>
     *    <li>{@code int}height (descriptionthe height want to print)</li>
     *    <li>{@code int}gray (descriptionset pixcel gray to pint(0~255 default = 128))</li>
     * </ul>
     * @since 2.x.x
     */
    @Override public void addScreenCapture(android.os.Bundle format) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.vfi.smartpos.deviceservice.aidl.IPrinter
  {
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.vfi.smartpos.deviceservice.aidl.IPrinter interface,
     * generating a proxy if needed.
     */
    public static com.vfi.smartpos.deviceservice.aidl.IPrinter asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.vfi.smartpos.deviceservice.aidl.IPrinter))) {
        return ((com.vfi.smartpos.deviceservice.aidl.IPrinter)iin);
      }
      return new com.vfi.smartpos.deviceservice.aidl.IPrinter.Stub.Proxy(obj);
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
        case TRANSACTION_getStatus:
        {
          int _result = this.getStatus();
          reply.writeNoException();
          reply.writeInt(_result);
          break;
        }
        case TRANSACTION_setGray:
        {
          int _arg0;
          _arg0 = data.readInt();
          this.setGray(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_addText:
        {
          android.os.Bundle _arg0;
          _arg0 = _Parcel.readTypedObject(data, android.os.Bundle.CREATOR);
          java.lang.String _arg1;
          _arg1 = data.readString();
          this.addText(_arg0, _arg1);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_addTextInLine:
        {
          android.os.Bundle _arg0;
          _arg0 = _Parcel.readTypedObject(data, android.os.Bundle.CREATOR);
          java.lang.String _arg1;
          _arg1 = data.readString();
          java.lang.String _arg2;
          _arg2 = data.readString();
          java.lang.String _arg3;
          _arg3 = data.readString();
          int _arg4;
          _arg4 = data.readInt();
          this.addTextInLine(_arg0, _arg1, _arg2, _arg3, _arg4);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_addBarCode:
        {
          android.os.Bundle _arg0;
          _arg0 = _Parcel.readTypedObject(data, android.os.Bundle.CREATOR);
          java.lang.String _arg1;
          _arg1 = data.readString();
          this.addBarCode(_arg0, _arg1);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_addQrCode:
        {
          android.os.Bundle _arg0;
          _arg0 = _Parcel.readTypedObject(data, android.os.Bundle.CREATOR);
          java.lang.String _arg1;
          _arg1 = data.readString();
          this.addQrCode(_arg0, _arg1);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_addQrCodesInLine:
        {
          java.util.List<com.vfi.smartpos.deviceservice.aidl.QrCodeContent> _arg0;
          _arg0 = data.createTypedArrayList(com.vfi.smartpos.deviceservice.aidl.QrCodeContent.CREATOR);
          this.addQrCodesInLine(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_addImage:
        {
          android.os.Bundle _arg0;
          _arg0 = _Parcel.readTypedObject(data, android.os.Bundle.CREATOR);
          byte[] _arg1;
          _arg1 = data.createByteArray();
          this.addImage(_arg0, _arg1);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_feedLine:
        {
          int _arg0;
          _arg0 = data.readInt();
          this.feedLine(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_startPrint:
        {
          com.vfi.smartpos.deviceservice.aidl.PrinterListener _arg0;
          _arg0 = com.vfi.smartpos.deviceservice.aidl.PrinterListener.Stub.asInterface(data.readStrongBinder());
          this.startPrint(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_startSaveCachePrint:
        {
          com.vfi.smartpos.deviceservice.aidl.PrinterListener _arg0;
          _arg0 = com.vfi.smartpos.deviceservice.aidl.PrinterListener.Stub.asInterface(data.readStrongBinder());
          this.startSaveCachePrint(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_setLineSpace:
        {
          int _arg0;
          _arg0 = data.readInt();
          this.setLineSpace(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_startPrintInEmv:
        {
          com.vfi.smartpos.deviceservice.aidl.PrinterListener _arg0;
          _arg0 = com.vfi.smartpos.deviceservice.aidl.PrinterListener.Stub.asInterface(data.readStrongBinder());
          this.startPrintInEmv(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_cleanCache:
        {
          int _result = this.cleanCache();
          reply.writeNoException();
          reply.writeInt(_result);
          break;
        }
        case TRANSACTION_addBmpImage:
        {
          android.os.Bundle _arg0;
          _arg0 = _Parcel.readTypedObject(data, android.os.Bundle.CREATOR);
          android.graphics.Bitmap _arg1;
          _arg1 = _Parcel.readTypedObject(data, android.graphics.Bitmap.CREATOR);
          this.addBmpImage(_arg0, _arg1);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_addScreenCapture:
        {
          android.os.Bundle _arg0;
          _arg0 = _Parcel.readTypedObject(data, android.os.Bundle.CREATOR);
          this.addScreenCapture(_arg0);
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
    private static class Proxy implements com.vfi.smartpos.deviceservice.aidl.IPrinter
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
       * <p> get printer status
       * 
       * @return the status:
       * <ul>
       * <li>ERROR_NONE(0x00) - normal</li>
       * <li>ERROR_PAPERENDED(0xF0) - Paper out</li>
       * <li>ERROR_NOCONTENT(0xF1) - no content</li>
       * <li>ERROR_HARDERR(0xF2) - printer error</li>
       * <li>ERROR_OVERHEAT(0xF3) - over heat</li>
       * <li>ERROR_NOBM(0xF6) - no black mark</li>
       * <li>ERROR_BUSY(0xF7) - printer is busy</li>
       * <li>ERROR_MOTORERR(0xFB) - moto error</li>
       * <li>ERROR_LOWVOL(0xE1) - battery low</li>
       * <li>ERROR_NOTTF(0xE2) - no ttf</li>
       * <li>ERROR_BITMAP_TOOWIDE(0xE3) - width of bitmap too wide</li>
       * </ul>
       * @since 1.x.x
       */
      @Override public int getStatus() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getStatus, _data, _reply, 0);
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
       * <p> Set the gray level of printing
       * 
       * @param gray the value from 0 to 7
       * @since 1.x.x
       */
      @Override public void setGray(int gray) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(gray);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setGray, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * <p> Add text string to print
       * @param format set text format, the key of format param as follow:
       * <ul>
       *   <li>{@code int}font</li>
       *   <li>{@code String}fontStyle; sustom font type by passing /xxxx/abc.ttf, default is using /system/fonts/fzzdx.ttf if not set</li>
       *   <li>{@code boolean}bold; {code true}:bold, @{code false}:normal</li>
       *   <li>{@code int}align; {code 0}:left, @{code 1}:center, @{code 2}:right</li>
       *   <li>{@code boolean}newline; {code true}:new line after prin, @{code false}:normal</li>
       *   <li>{@code float}scale_w; (descrption: multiple Width)</li>
       *   <li>{@code float}scale_h; (descrption: multiple Height)</li>
       * </ul>
       * <p> the key of font format as follow:
       * <ul>
       *   <li>0(description:small(size16))
       *   <li>1(description:normal(size24))
       *   <li>2(description:normal_bigger(size24 double height & bold))
       *   <li>3(description:large(size32))
       *   <li>4(description:large_bigger(size32 double height & bold))
       *   <li>5(description:huge(size48))
       *   <li>6(description:normal_wide(size24 double width & bold))
       *   <li>7(description:large_wide(size32 double width & bold)))
       * </ul>
       * <p><pre>{@code
       *      Bundle bundle = new Bundle;
       *      bundle.putBoolean("bold", true);
       *      bundle.putBoolean("newline", true);
       *      bundle.putInt("font", 1);
       *      bundle.putInt("align", 1);
       *      bundle.putFloat("scale_w", 100.0f);
       *      bundle.putFloat("scale_h", 100.0f);
       * }
       * </pre>
       * @param text the text string want to print
       * @since 1.x.x
       */
      @Override public void addText(android.os.Bundle format, java.lang.String text) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _Parcel.writeTypedObject(_data, format, 0);
          _data.writeString(text);
          boolean _status = mRemote.transact(Stub.TRANSACTION_addText, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * <p> Add text strings to print.
       * 
       * @param format set text format, the key of format param as follow:
       * <ul>
       *   <li>{@code int}fontSize</li>
       *   <li>{@code boolean}bold; {code true}:bold, @{code false}:normal</li>
       *   <li>{@code String}fontStyle</li>
       * </ul>
       * <p> the key of fontSize format as follow:
       * <ul>
       *   <li>0(description:small(size16))
       *   <li>1(description:normal(size24))
       *   <li>2(description:normal_bigger(size24 double height & bold))
       *   <li>3(description:large(size32))
       * </ul>
       * <p> the key of fontStyle format as follow:
       * <ul>
       *   <li>/xxxx/xx.ttf(absolute path, custom font by user)</li>
       * </ul>
       * <p><pre>{@code
       *      Bundle bundle = new Bundle;
       *      bundle.putBoolean("bold", true);
       *      bundle.putInt("fontSize", 1);
       * }
       * </pre>
       * 
       * @param lString the left justifying String
       * @param mString the middle(center) justifying String
       * @param rString the right justifying String
       * @param mode - {@code 0} : the left & right justifying divide the width equally, {code 1} : the left & right justifying divide the width flexiable
       * @since 1.x.x
       */
      @Override public void addTextInLine(android.os.Bundle format, java.lang.String lString, java.lang.String mString, java.lang.String rString, int mode) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _Parcel.writeTypedObject(_data, format, 0);
          _data.writeString(lString);
          _data.writeString(mString);
          _data.writeString(rString);
          _data.writeInt(mode);
          boolean _status = mRemote.transact(Stub.TRANSACTION_addTextInLine, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * <p> Add barcode to print(CodeType Code128)
       * @param format set bar format, the key of format param as follow:
       * <ul>
       *   <li>align(description: {@code 0}:left, {@code 1}:center, {@code 2}:right)</li>
       *   <li>height(description: the height of barcode)</li>
       *   <li>barCodeType, refer to below:</li>
       *    <pre>
       *         public enum BarcodeFormat {
       *             AZTEC,
       *             CODABAR,
       *             CODE_39,
       *             CODE_93,
       *             CODE_128,
       *             DATA_MATRIX,
       *             EAN_8,
       *             EAN_13,
       *             ITF,
       *             MAXICODE(not support),
       *             PDF_417,
       *             QR_CODE(not support),
       *             RSS_14(not support),
       *             RSS_EXPANDED,
       *             UPC_A,
       *             UPC_E,
       *             UPC_EAN_EXTENSION(not support);
       *        }
       *        Default: "BarcodeFormat.CODE_128.ordinal()"
       *   </pre>
       * </ul>
       * @param barcode - the barcode string
       * @since 1.x.x
       */
      @Override public void addBarCode(android.os.Bundle format, java.lang.String barcode) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _Parcel.writeTypedObject(_data, format, 0);
          _data.writeString(barcode);
          boolean _status = mRemote.transact(Stub.TRANSACTION_addBarCode, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * <p> add a QR code to print
       * @param format set qr code format, the key of format param as follow:
       * <ul>
       *   <li>{@code int}offset (description:the offset from the left)</li>
       *   <li>{@code int}expectedHeight (description:the expected height & width of the QR code. The actual size should multiple of the minimun pixel size of QR code)</li>
       * </ul>
       * @param qrCode the string of the QR code
       * @since 1.x.x
       */
      @Override public void addQrCode(android.os.Bundle format, java.lang.String qrCode) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _Parcel.writeTypedObject(_data, format, 0);
          _data.writeString(qrCode);
          boolean _status = mRemote.transact(Stub.TRANSACTION_addQrCode, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * <p> add multi-QR codes to print
       * 
       * @param qrCodes {@link QrCodeContent}
       * @since 1.x.x
       */
      @Override public void addQrCodesInLine(java.util.List<com.vfi.smartpos.deviceservice.aidl.QrCodeContent> qrCodes) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedList(qrCodes);
          boolean _status = mRemote.transact(Stub.TRANSACTION_addQrCodesInLine, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * <p> Add an image to print
       * @param format set image format, the key of format param as follow:
       * <ul>
       *    <li>{@code int}offset (description:the offset from left)</li>
       *    <li>@code int}width (description:the width of the image want to print.(MAX = 384))</li>
       *    <li>@code int}height (description:the height want to print)</li>
       *    <li>@code int}gray (description:set pixcel gray to pint(0~255 default = 128))</li>
       * </ul>
       * @param imageData the image byte buffer
       * @since 1.x.x
       */
      @Override public void addImage(android.os.Bundle format, byte[] imageData) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _Parcel.writeTypedObject(_data, format, 0);
          _data.writeByteArray(imageData);
          boolean _status = mRemote.transact(Stub.TRANSACTION_addImage, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * <p> Feed the paper
       * 
       * @param lines lines should > 1 && lines <= 50<BR>The lines should be the actual lines+1 because the current line need be counted.
       * @since 1.x.x
       */
      @Override public void feedLine(int lines) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(lines);
          boolean _status = mRemote.transact(Stub.TRANSACTION_feedLine, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * <p> Start print
       * 
       * @param listener {@link PrinterListener}the call back listener to tell the print result.
       * @since 1.x.x
       */
      @Override public void startPrint(com.vfi.smartpos.deviceservice.aidl.PrinterListener listener) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongInterface(listener);
          boolean _status = mRemote.transact(Stub.TRANSACTION_startPrint, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * <p> Start print remain the cache
       * 
       * @param listener {@link PrinterListener}the call back listener to tell the print result.
       * @since 1.x.x
       */
      @Override public void startSaveCachePrint(com.vfi.smartpos.deviceservice.aidl.PrinterListener listener) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongInterface(listener);
          boolean _status = mRemote.transact(Stub.TRANSACTION_startSaveCachePrint, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * <p> Set the line space
       * 
       * @param space - the lines of space : 0~50
       * @since 1.x.x
       */
      @Override public void setLineSpace(int space) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(space);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setLineSpace, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * <p> add some print in emv progress, <b>not end of emv process</b>
       * 
       * @param listener the call back listener to tell the print result
       * @since 1.x.x
       */
      @Override public void startPrintInEmv(com.vfi.smartpos.deviceservice.aidl.PrinterListener listener) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongInterface(listener);
          boolean _status = mRemote.transact(Stub.TRANSACTION_startPrintInEmv, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * <p> clear printer cache
       * 
       * @return {@code 1} : sucessed; {@code 0} : failed
       * @since 1.x.x
       */
      @Override public int cleanCache() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_cleanCache, _data, _reply, 0);
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
       * <p> Add an image to print
       * 
       * @param format set bitmap format, the key of format param as follow:
       * <ul>
       *    <li>{@code int}offset (descriptionthe offset from left)</li>
       *    <li>{@code int}width (descriptionthe width of the image want to print.(MAX = 384))</li>
       *    <li>{@code int}height (descriptionthe height want to print)</li>
       *    <li>{@code int}gray (descriptionset pixcel gray to pint(0~255 default = 128))</li>
       * </ul>
       * @param imageData descriptionthe image buffer.
       * @since 2.x.x
       */
      @Override public void addBmpImage(android.os.Bundle format, android.graphics.Bitmap image) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _Parcel.writeTypedObject(_data, format, 0);
          _Parcel.writeTypedObject(_data, image, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_addBmpImage, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**
       * <p> Add screen capture to print
       * @param format set screen capture format, the key of format param as follow:
       * <ul>
       *    <li>{@code int}offset (descriptionthe offset from left)</li>
       *    <li>{@code int}width (descriptionthe width want to print.(MAX = 384))</li>
       *    <li>{@code int}height (descriptionthe height want to print)</li>
       *    <li>{@code int}gray (descriptionset pixcel gray to pint(0~255 default = 128))</li>
       * </ul>
       * @since 2.x.x
       */
      @Override public void addScreenCapture(android.os.Bundle format) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _Parcel.writeTypedObject(_data, format, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_addScreenCapture, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
    }
    static final int TRANSACTION_getStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_setGray = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_addText = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_addTextInLine = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_addBarCode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_addQrCode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_addQrCodesInLine = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_addImage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_feedLine = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    static final int TRANSACTION_startPrint = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
    static final int TRANSACTION_startSaveCachePrint = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
    static final int TRANSACTION_setLineSpace = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
    static final int TRANSACTION_startPrintInEmv = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
    static final int TRANSACTION_cleanCache = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
    static final int TRANSACTION_addBmpImage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
    static final int TRANSACTION_addScreenCapture = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
  }
  public static final java.lang.String DESCRIPTOR = "com.vfi.smartpos.deviceservice.aidl.IPrinter";
  /**
   * <p> get printer status
   * 
   * @return the status:
   * <ul>
   * <li>ERROR_NONE(0x00) - normal</li>
   * <li>ERROR_PAPERENDED(0xF0) - Paper out</li>
   * <li>ERROR_NOCONTENT(0xF1) - no content</li>
   * <li>ERROR_HARDERR(0xF2) - printer error</li>
   * <li>ERROR_OVERHEAT(0xF3) - over heat</li>
   * <li>ERROR_NOBM(0xF6) - no black mark</li>
   * <li>ERROR_BUSY(0xF7) - printer is busy</li>
   * <li>ERROR_MOTORERR(0xFB) - moto error</li>
   * <li>ERROR_LOWVOL(0xE1) - battery low</li>
   * <li>ERROR_NOTTF(0xE2) - no ttf</li>
   * <li>ERROR_BITMAP_TOOWIDE(0xE3) - width of bitmap too wide</li>
   * </ul>
   * @since 1.x.x
   */
  public int getStatus() throws android.os.RemoteException;
  /**
   * <p> Set the gray level of printing
   * 
   * @param gray the value from 0 to 7
   * @since 1.x.x
   */
  public void setGray(int gray) throws android.os.RemoteException;
  /**
   * <p> Add text string to print
   * @param format set text format, the key of format param as follow:
   * <ul>
   *   <li>{@code int}font</li>
   *   <li>{@code String}fontStyle; sustom font type by passing /xxxx/abc.ttf, default is using /system/fonts/fzzdx.ttf if not set</li>
   *   <li>{@code boolean}bold; {code true}:bold, @{code false}:normal</li>
   *   <li>{@code int}align; {code 0}:left, @{code 1}:center, @{code 2}:right</li>
   *   <li>{@code boolean}newline; {code true}:new line after prin, @{code false}:normal</li>
   *   <li>{@code float}scale_w; (descrption: multiple Width)</li>
   *   <li>{@code float}scale_h; (descrption: multiple Height)</li>
   * </ul>
   * <p> the key of font format as follow:
   * <ul>
   *   <li>0(description:small(size16))
   *   <li>1(description:normal(size24))
   *   <li>2(description:normal_bigger(size24 double height & bold))
   *   <li>3(description:large(size32))
   *   <li>4(description:large_bigger(size32 double height & bold))
   *   <li>5(description:huge(size48))
   *   <li>6(description:normal_wide(size24 double width & bold))
   *   <li>7(description:large_wide(size32 double width & bold)))
   * </ul>
   * <p><pre>{@code
   *      Bundle bundle = new Bundle;
   *      bundle.putBoolean("bold", true);
   *      bundle.putBoolean("newline", true);
   *      bundle.putInt("font", 1);
   *      bundle.putInt("align", 1);
   *      bundle.putFloat("scale_w", 100.0f);
   *      bundle.putFloat("scale_h", 100.0f);
   * }
   * </pre>
   * @param text the text string want to print
   * @since 1.x.x
   */
  public void addText(android.os.Bundle format, java.lang.String text) throws android.os.RemoteException;
  /**
   * <p> Add text strings to print.
   * 
   * @param format set text format, the key of format param as follow:
   * <ul>
   *   <li>{@code int}fontSize</li>
   *   <li>{@code boolean}bold; {code true}:bold, @{code false}:normal</li>
   *   <li>{@code String}fontStyle</li>
   * </ul>
   * <p> the key of fontSize format as follow:
   * <ul>
   *   <li>0(description:small(size16))
   *   <li>1(description:normal(size24))
   *   <li>2(description:normal_bigger(size24 double height & bold))
   *   <li>3(description:large(size32))
   * </ul>
   * <p> the key of fontStyle format as follow:
   * <ul>
   *   <li>/xxxx/xx.ttf(absolute path, custom font by user)</li>
   * </ul>
   * <p><pre>{@code
   *      Bundle bundle = new Bundle;
   *      bundle.putBoolean("bold", true);
   *      bundle.putInt("fontSize", 1);
   * }
   * </pre>
   * 
   * @param lString the left justifying String
   * @param mString the middle(center) justifying String
   * @param rString the right justifying String
   * @param mode - {@code 0} : the left & right justifying divide the width equally, {code 1} : the left & right justifying divide the width flexiable
   * @since 1.x.x
   */
  public void addTextInLine(android.os.Bundle format, java.lang.String lString, java.lang.String mString, java.lang.String rString, int mode) throws android.os.RemoteException;
  /**
   * <p> Add barcode to print(CodeType Code128)
   * @param format set bar format, the key of format param as follow:
   * <ul>
   *   <li>align(description: {@code 0}:left, {@code 1}:center, {@code 2}:right)</li>
   *   <li>height(description: the height of barcode)</li>
   *   <li>barCodeType, refer to below:</li>
   *    <pre>
   *         public enum BarcodeFormat {
   *             AZTEC,
   *             CODABAR,
   *             CODE_39,
   *             CODE_93,
   *             CODE_128,
   *             DATA_MATRIX,
   *             EAN_8,
   *             EAN_13,
   *             ITF,
   *             MAXICODE(not support),
   *             PDF_417,
   *             QR_CODE(not support),
   *             RSS_14(not support),
   *             RSS_EXPANDED,
   *             UPC_A,
   *             UPC_E,
   *             UPC_EAN_EXTENSION(not support);
   *        }
   *        Default: "BarcodeFormat.CODE_128.ordinal()"
   *   </pre>
   * </ul>
   * @param barcode - the barcode string
   * @since 1.x.x
   */
  public void addBarCode(android.os.Bundle format, java.lang.String barcode) throws android.os.RemoteException;
  /**
   * <p> add a QR code to print
   * @param format set qr code format, the key of format param as follow:
   * <ul>
   *   <li>{@code int}offset (description:the offset from the left)</li>
   *   <li>{@code int}expectedHeight (description:the expected height & width of the QR code. The actual size should multiple of the minimun pixel size of QR code)</li>
   * </ul>
   * @param qrCode the string of the QR code
   * @since 1.x.x
   */
  public void addQrCode(android.os.Bundle format, java.lang.String qrCode) throws android.os.RemoteException;
  /**
   * <p> add multi-QR codes to print
   * 
   * @param qrCodes {@link QrCodeContent}
   * @since 1.x.x
   */
  public void addQrCodesInLine(java.util.List<com.vfi.smartpos.deviceservice.aidl.QrCodeContent> qrCodes) throws android.os.RemoteException;
  /**
   * <p> Add an image to print
   * @param format set image format, the key of format param as follow:
   * <ul>
   *    <li>{@code int}offset (description:the offset from left)</li>
   *    <li>@code int}width (description:the width of the image want to print.(MAX = 384))</li>
   *    <li>@code int}height (description:the height want to print)</li>
   *    <li>@code int}gray (description:set pixcel gray to pint(0~255 default = 128))</li>
   * </ul>
   * @param imageData the image byte buffer
   * @since 1.x.x
   */
  public void addImage(android.os.Bundle format, byte[] imageData) throws android.os.RemoteException;
  /**
   * <p> Feed the paper
   * 
   * @param lines lines should > 1 && lines <= 50<BR>The lines should be the actual lines+1 because the current line need be counted.
   * @since 1.x.x
   */
  public void feedLine(int lines) throws android.os.RemoteException;
  /**
   * <p> Start print
   * 
   * @param listener {@link PrinterListener}the call back listener to tell the print result.
   * @since 1.x.x
   */
  public void startPrint(com.vfi.smartpos.deviceservice.aidl.PrinterListener listener) throws android.os.RemoteException;
  /**
   * <p> Start print remain the cache
   * 
   * @param listener {@link PrinterListener}the call back listener to tell the print result.
   * @since 1.x.x
   */
  public void startSaveCachePrint(com.vfi.smartpos.deviceservice.aidl.PrinterListener listener) throws android.os.RemoteException;
  /**
   * <p> Set the line space
   * 
   * @param space - the lines of space : 0~50
   * @since 1.x.x
   */
  public void setLineSpace(int space) throws android.os.RemoteException;
  /**
   * <p> add some print in emv progress, <b>not end of emv process</b>
   * 
   * @param listener the call back listener to tell the print result
   * @since 1.x.x
   */
  public void startPrintInEmv(com.vfi.smartpos.deviceservice.aidl.PrinterListener listener) throws android.os.RemoteException;
  /**
   * <p> clear printer cache
   * 
   * @return {@code 1} : sucessed; {@code 0} : failed
   * @since 1.x.x
   */
  public int cleanCache() throws android.os.RemoteException;
  /**
   * <p> Add an image to print
   * 
   * @param format set bitmap format, the key of format param as follow:
   * <ul>
   *    <li>{@code int}offset (descriptionthe offset from left)</li>
   *    <li>{@code int}width (descriptionthe width of the image want to print.(MAX = 384))</li>
   *    <li>{@code int}height (descriptionthe height want to print)</li>
   *    <li>{@code int}gray (descriptionset pixcel gray to pint(0~255 default = 128))</li>
   * </ul>
   * @param imageData descriptionthe image buffer.
   * @since 2.x.x
   */
  public void addBmpImage(android.os.Bundle format, android.graphics.Bitmap image) throws android.os.RemoteException;
  /**
   * <p> Add screen capture to print
   * @param format set screen capture format, the key of format param as follow:
   * <ul>
   *    <li>{@code int}offset (descriptionthe offset from left)</li>
   *    <li>{@code int}width (descriptionthe width want to print.(MAX = 384))</li>
   *    <li>{@code int}height (descriptionthe height want to print)</li>
   *    <li>{@code int}gray (descriptionset pixcel gray to pint(0~255 default = 128))</li>
   * </ul>
   * @since 2.x.x
   */
  public void addScreenCapture(android.os.Bundle format) throws android.os.RemoteException;
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
