package com.fasterxml.jackson.core.p006io;

import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import p000a.C0000a;

/* loaded from: classes.dex */
public class UTF32Reader extends Reader {
    public static final int LAST_VALID_UNICODE_CHAR = 1114111;

    /* renamed from: NC */
    public static final char f8869NC = 0;
    public final boolean _bigEndian;
    public byte[] _buffer;
    public int _byteCount;
    public int _charCount;
    public final IOContext _context;
    public InputStream _in;
    public int _length;
    public final boolean _managedBuffers;
    public int _ptr;
    public char _surrogate = 0;
    public char[] _tmpBuf;

    public UTF32Reader(IOContext iOContext, InputStream inputStream, byte[] bArr, int i2, int i3, boolean z) {
        this._context = iOContext;
        this._in = inputStream;
        this._buffer = bArr;
        this._ptr = i2;
        this._length = i3;
        this._bigEndian = z;
        this._managedBuffers = inputStream != null;
    }

    private void freeBuffers() {
        byte[] bArr = this._buffer;
        if (bArr != null) {
            this._buffer = null;
            this._context.releaseReadIOBuffer(bArr);
        }
    }

    private boolean loadMore(int i2) throws IOException {
        int read;
        this._byteCount = (this._length - i2) + this._byteCount;
        if (i2 > 0) {
            int i3 = this._ptr;
            if (i3 > 0) {
                byte[] bArr = this._buffer;
                System.arraycopy(bArr, i3, bArr, 0, i2);
                this._ptr = 0;
            }
            this._length = i2;
        } else {
            this._ptr = 0;
            InputStream inputStream = this._in;
            int read2 = inputStream == null ? -1 : inputStream.read(this._buffer);
            if (read2 < 1) {
                this._length = 0;
                if (read2 < 0) {
                    if (this._managedBuffers) {
                        freeBuffers();
                    }
                    return false;
                }
                reportStrangeStream();
            }
            this._length = read2;
        }
        while (true) {
            int i4 = this._length;
            if (i4 >= 4) {
                return true;
            }
            InputStream inputStream2 = this._in;
            if (inputStream2 == null) {
                read = -1;
            } else {
                byte[] bArr2 = this._buffer;
                read = inputStream2.read(bArr2, i4, bArr2.length - i4);
            }
            if (read < 1) {
                if (read < 0) {
                    if (this._managedBuffers) {
                        freeBuffers();
                    }
                    reportUnexpectedEOF(this._length, 4);
                }
                reportStrangeStream();
            }
            this._length += read;
        }
    }

    private void reportBounds(char[] cArr, int i2, int i3) throws IOException {
        throw new ArrayIndexOutOfBoundsException(C0000a.m18o(C0000a.m26w("read(buf,", i2, ",", i3, "), cbuf["), cArr.length, "]"));
    }

    private void reportInvalid(int i2, int i3, String str) throws IOException {
        int i4 = (this._byteCount + this._ptr) - 1;
        int i5 = this._charCount + i3;
        StringBuilder m24u = C0000a.m24u("Invalid UTF-32 character 0x");
        m24u.append(Integer.toHexString(i2));
        m24u.append(str);
        m24u.append(" at char #");
        m24u.append(i5);
        m24u.append(", byte #");
        throw new CharConversionException(C0000a.m18o(m24u, i4, ")"));
    }

    private void reportStrangeStream() throws IOException {
        throw new IOException("Strange I/O stream, returned 0 bytes on read");
    }

    private void reportUnexpectedEOF(int i2, int i3) throws IOException {
        int i4 = this._byteCount + i2;
        int i5 = this._charCount;
        StringBuilder m26w = C0000a.m26w("Unexpected EOF in the middle of a 4-byte UTF-32 char: got ", i2, ", needed ", i3, ", at char #");
        m26w.append(i5);
        m26w.append(", byte #");
        m26w.append(i4);
        m26w.append(")");
        throw new CharConversionException(m26w.toString());
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = this._in;
        if (inputStream != null) {
            this._in = null;
            freeBuffers();
            inputStream.close();
        }
    }

    @Override // java.io.Reader
    public int read() throws IOException {
        if (this._tmpBuf == null) {
            this._tmpBuf = new char[1];
        }
        if (read(this._tmpBuf, 0, 1) < 1) {
            return -1;
        }
        return this._tmpBuf[0];
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i2, int i3) throws IOException {
        int i4;
        int i5;
        int i6;
        int i7;
        if (this._buffer == null) {
            return -1;
        }
        if (i3 < 1) {
            return i3;
        }
        if (i2 < 0 || i2 + i3 > cArr.length) {
            reportBounds(cArr, i2, i3);
        }
        int i8 = i3 + i2;
        char c2 = this._surrogate;
        if (c2 != 0) {
            i4 = i2 + 1;
            cArr[i2] = c2;
            this._surrogate = (char) 0;
        } else {
            int i9 = this._length - this._ptr;
            if (i9 < 4 && !loadMore(i9)) {
                if (i9 == 0) {
                    return -1;
                }
                reportUnexpectedEOF(this._length - this._ptr, 4);
            }
            i4 = i2;
        }
        int i10 = this._length - 4;
        while (i4 < i8) {
            int i11 = this._ptr;
            if (this._bigEndian) {
                byte[] bArr = this._buffer;
                i5 = (bArr[i11] << 8) | (bArr[i11 + 1] & 255);
                i6 = (bArr[i11 + 3] & 255) | ((bArr[i11 + 2] & 255) << 8);
            } else {
                byte[] bArr2 = this._buffer;
                int i12 = (bArr2[i11] & 255) | ((bArr2[i11 + 1] & 255) << 8);
                i5 = (bArr2[i11 + 3] << 8) | (bArr2[i11 + 2] & 255);
                i6 = i12;
            }
            this._ptr = i11 + 4;
            if (i5 != 0) {
                int i13 = 65535 & i5;
                int i14 = i6 | ((i13 - 1) << 16);
                if (i13 > 16) {
                    reportInvalid(i14, i4 - i2, String.format(" (above 0x%08x)", Integer.valueOf(LAST_VALID_UNICODE_CHAR)));
                }
                i7 = i4 + 1;
                cArr[i4] = (char) ((i14 >> 10) + 55296);
                int i15 = 56320 | (i14 & 1023);
                if (i7 >= i8) {
                    this._surrogate = (char) i14;
                    i4 = i7;
                    break;
                }
                i6 = i15;
                i4 = i7;
            }
            i7 = i4 + 1;
            cArr[i4] = (char) i6;
            if (this._ptr > i10) {
                i4 = i7;
                break;
            }
            i4 = i7;
        }
        int i16 = i4 - i2;
        this._charCount += i16;
        return i16;
    }
}
