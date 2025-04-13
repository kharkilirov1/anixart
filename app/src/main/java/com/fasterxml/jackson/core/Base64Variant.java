package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import java.io.Serializable;
import java.util.Arrays;
import p000a.C0000a;

/* loaded from: classes.dex */
public final class Base64Variant implements Serializable {
    public static final int BASE64_VALUE_INVALID = -1;
    public static final int BASE64_VALUE_PADDING = -2;
    private static final int INT_SPACE = 32;
    public static final char PADDING_CHAR_NONE = 0;
    private static final long serialVersionUID = 1;
    private final transient int[] _asciiToBase64;
    private final transient byte[] _base64ToAsciiB;
    private final transient char[] _base64ToAsciiC;
    private final transient int _maxLineLength;
    public final String _name;
    private final transient char _paddingChar;
    private final transient boolean _usesPadding;

    public Base64Variant(String str, String str2, boolean z, char c2, int i2) {
        int[] iArr = new int[128];
        this._asciiToBase64 = iArr;
        char[] cArr = new char[64];
        this._base64ToAsciiC = cArr;
        this._base64ToAsciiB = new byte[64];
        this._name = str;
        this._usesPadding = z;
        this._paddingChar = c2;
        this._maxLineLength = i2;
        int length = str2.length();
        if (length != 64) {
            throw new IllegalArgumentException(C0000a.m8e("Base64Alphabet length must be exactly 64 (was ", length, ")"));
        }
        str2.getChars(0, length, cArr, 0);
        Arrays.fill(iArr, -1);
        for (int i3 = 0; i3 < length; i3++) {
            char c3 = this._base64ToAsciiC[i3];
            this._base64ToAsciiB[i3] = (byte) c3;
            this._asciiToBase64[c3] = i3;
        }
        if (z) {
            this._asciiToBase64[c2] = -2;
        }
    }

    public void _reportBase64EOF() throws IllegalArgumentException {
        throw new IllegalArgumentException(missingPaddingMessage());
    }

    public void _reportInvalidBase64(char c2, int i2, String str) throws IllegalArgumentException {
        String sb;
        if (c2 <= ' ') {
            StringBuilder m24u = C0000a.m24u("Illegal white space character (code 0x");
            m24u.append(Integer.toHexString(c2));
            m24u.append(") as character #");
            m24u.append(i2 + 1);
            m24u.append(" of 4-char base64 unit: can only used between units");
            sb = m24u.toString();
        } else if (usesPaddingChar(c2)) {
            StringBuilder m24u2 = C0000a.m24u("Unexpected padding character ('");
            m24u2.append(getPaddingChar());
            m24u2.append("') as character #");
            m24u2.append(i2 + 1);
            m24u2.append(" of 4-char base64 unit: padding only legal as 3rd or 4th character");
            sb = m24u2.toString();
        } else if (!Character.isDefined(c2) || Character.isISOControl(c2)) {
            StringBuilder m24u3 = C0000a.m24u("Illegal character (code 0x");
            m24u3.append(Integer.toHexString(c2));
            m24u3.append(") in base64 content");
            sb = m24u3.toString();
        } else {
            sb = "Illegal character '" + c2 + "' (code 0x" + Integer.toHexString(c2) + ") in base64 content";
        }
        if (str != null) {
            sb = C0000a.m16m(sb, ": ", str);
        }
        throw new IllegalArgumentException(sb);
    }

    public byte[] decode(String str) throws IllegalArgumentException {
        ByteArrayBuilder byteArrayBuilder = new ByteArrayBuilder();
        decode(str, byteArrayBuilder);
        return byteArrayBuilder.toByteArray();
    }

    public int decodeBase64Byte(byte b) {
        if (b < 0) {
            return -1;
        }
        return this._asciiToBase64[b];
    }

    public int decodeBase64Char(char c2) {
        if (c2 <= 127) {
            return this._asciiToBase64[c2];
        }
        return -1;
    }

    public String encode(byte[] bArr) {
        return encode(bArr, false);
    }

    public byte encodeBase64BitsAsByte(int i2) {
        return this._base64ToAsciiB[i2];
    }

    public char encodeBase64BitsAsChar(int i2) {
        return this._base64ToAsciiC[i2];
    }

    public int encodeBase64Chunk(int i2, char[] cArr, int i3) {
        int i4 = i3 + 1;
        char[] cArr2 = this._base64ToAsciiC;
        cArr[i3] = cArr2[(i2 >> 18) & 63];
        int i5 = i4 + 1;
        cArr[i4] = cArr2[(i2 >> 12) & 63];
        int i6 = i5 + 1;
        cArr[i5] = cArr2[(i2 >> 6) & 63];
        int i7 = i6 + 1;
        cArr[i6] = cArr2[i2 & 63];
        return i7;
    }

    public int encodeBase64Partial(int i2, int i3, char[] cArr, int i4) {
        int i5 = i4 + 1;
        char[] cArr2 = this._base64ToAsciiC;
        cArr[i4] = cArr2[(i2 >> 18) & 63];
        int i6 = i5 + 1;
        cArr[i5] = cArr2[(i2 >> 12) & 63];
        if (this._usesPadding) {
            int i7 = i6 + 1;
            cArr[i6] = i3 == 2 ? cArr2[(i2 >> 6) & 63] : this._paddingChar;
            int i8 = i7 + 1;
            cArr[i7] = this._paddingChar;
            return i8;
        }
        if (i3 != 2) {
            return i6;
        }
        int i9 = i6 + 1;
        cArr[i6] = cArr2[(i2 >> 6) & 63];
        return i9;
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public int getMaxLineLength() {
        return this._maxLineLength;
    }

    public String getName() {
        return this._name;
    }

    public byte getPaddingByte() {
        return (byte) this._paddingChar;
    }

    public char getPaddingChar() {
        return this._paddingChar;
    }

    public int hashCode() {
        return this._name.hashCode();
    }

    public String missingPaddingMessage() {
        return String.format("Unexpected end of base64-encoded String: base64 variant '%s' expects padding (one or more '%c' characters) at the end", getName(), Character.valueOf(getPaddingChar()));
    }

    public Object readResolve() {
        return Base64Variants.valueOf(this._name);
    }

    public String toString() {
        return this._name;
    }

    public boolean usesPadding() {
        return this._usesPadding;
    }

    public boolean usesPaddingChar(char c2) {
        return c2 == this._paddingChar;
    }

    public int decodeBase64Char(int i2) {
        if (i2 <= 127) {
            return this._asciiToBase64[i2];
        }
        return -1;
    }

    public String encode(byte[] bArr, boolean z) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder((length >> 2) + length + (length >> 3));
        if (z) {
            sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
        }
        int maxLineLength = getMaxLineLength() >> 2;
        int i2 = 0;
        int i3 = length - 3;
        while (i2 <= i3) {
            int i4 = i2 + 1;
            int i5 = i4 + 1;
            int i6 = ((bArr[i2] << 8) | (bArr[i4] & 255)) << 8;
            int i7 = i5 + 1;
            encodeBase64Chunk(sb, i6 | (bArr[i5] & 255));
            maxLineLength--;
            if (maxLineLength <= 0) {
                sb.append('\\');
                sb.append('n');
                maxLineLength = getMaxLineLength() >> 2;
            }
            i2 = i7;
        }
        int i8 = length - i2;
        if (i8 > 0) {
            int i9 = i2 + 1;
            int i10 = bArr[i2] << 16;
            if (i8 == 2) {
                i10 |= (bArr[i9] & 255) << 8;
            }
            encodeBase64Partial(sb, i10, i8);
        }
        if (z) {
            sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
        }
        return sb.toString();
    }

    public boolean usesPaddingChar(int i2) {
        return i2 == this._paddingChar;
    }

    public void decode(String str, ByteArrayBuilder byteArrayBuilder) throws IllegalArgumentException {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            char charAt = str.charAt(i2);
            if (charAt > ' ') {
                int decodeBase64Char = decodeBase64Char(charAt);
                if (decodeBase64Char < 0) {
                    _reportInvalidBase64(charAt, 0, null);
                }
                if (i3 >= length) {
                    _reportBase64EOF();
                }
                int i4 = i3 + 1;
                char charAt2 = str.charAt(i3);
                int decodeBase64Char2 = decodeBase64Char(charAt2);
                if (decodeBase64Char2 < 0) {
                    _reportInvalidBase64(charAt2, 1, null);
                }
                int i5 = (decodeBase64Char << 6) | decodeBase64Char2;
                if (i4 >= length) {
                    if (!usesPadding()) {
                        byteArrayBuilder.append(i5 >> 4);
                        return;
                    }
                    _reportBase64EOF();
                }
                int i6 = i4 + 1;
                char charAt3 = str.charAt(i4);
                int decodeBase64Char3 = decodeBase64Char(charAt3);
                if (decodeBase64Char3 < 0) {
                    if (decodeBase64Char3 != -2) {
                        _reportInvalidBase64(charAt3, 2, null);
                    }
                    if (i6 >= length) {
                        _reportBase64EOF();
                    }
                    i2 = i6 + 1;
                    char charAt4 = str.charAt(i6);
                    if (!usesPaddingChar(charAt4)) {
                        StringBuilder m24u = C0000a.m24u("expected padding character '");
                        m24u.append(getPaddingChar());
                        m24u.append("'");
                        _reportInvalidBase64(charAt4, 3, m24u.toString());
                    }
                    byteArrayBuilder.append(i5 >> 4);
                } else {
                    int i7 = (i5 << 6) | decodeBase64Char3;
                    if (i6 >= length) {
                        if (!usesPadding()) {
                            byteArrayBuilder.appendTwoBytes(i7 >> 2);
                            return;
                        }
                        _reportBase64EOF();
                    }
                    i3 = i6 + 1;
                    char charAt5 = str.charAt(i6);
                    int decodeBase64Char4 = decodeBase64Char(charAt5);
                    if (decodeBase64Char4 < 0) {
                        if (decodeBase64Char4 != -2) {
                            _reportInvalidBase64(charAt5, 3, null);
                        }
                        byteArrayBuilder.appendTwoBytes(i7 >> 2);
                    } else {
                        byteArrayBuilder.appendThreeBytes((i7 << 6) | decodeBase64Char4);
                    }
                }
            }
            i2 = i3;
        }
    }

    public void encodeBase64Chunk(StringBuilder sb, int i2) {
        sb.append(this._base64ToAsciiC[(i2 >> 18) & 63]);
        sb.append(this._base64ToAsciiC[(i2 >> 12) & 63]);
        sb.append(this._base64ToAsciiC[(i2 >> 6) & 63]);
        sb.append(this._base64ToAsciiC[i2 & 63]);
    }

    public void encodeBase64Partial(StringBuilder sb, int i2, int i3) {
        sb.append(this._base64ToAsciiC[(i2 >> 18) & 63]);
        sb.append(this._base64ToAsciiC[(i2 >> 12) & 63]);
        if (this._usesPadding) {
            sb.append(i3 == 2 ? this._base64ToAsciiC[(i2 >> 6) & 63] : this._paddingChar);
            sb.append(this._paddingChar);
        } else if (i3 == 2) {
            sb.append(this._base64ToAsciiC[(i2 >> 6) & 63]);
        }
    }

    public int encodeBase64Chunk(int i2, byte[] bArr, int i3) {
        int i4 = i3 + 1;
        byte[] bArr2 = this._base64ToAsciiB;
        bArr[i3] = bArr2[(i2 >> 18) & 63];
        int i5 = i4 + 1;
        bArr[i4] = bArr2[(i2 >> 12) & 63];
        int i6 = i5 + 1;
        bArr[i5] = bArr2[(i2 >> 6) & 63];
        int i7 = i6 + 1;
        bArr[i6] = bArr2[i2 & 63];
        return i7;
    }

    public int encodeBase64Partial(int i2, int i3, byte[] bArr, int i4) {
        int i5 = i4 + 1;
        byte[] bArr2 = this._base64ToAsciiB;
        bArr[i4] = bArr2[(i2 >> 18) & 63];
        int i6 = i5 + 1;
        bArr[i5] = bArr2[(i2 >> 12) & 63];
        if (!this._usesPadding) {
            if (i3 != 2) {
                return i6;
            }
            int i7 = i6 + 1;
            bArr[i6] = bArr2[(i2 >> 6) & 63];
            return i7;
        }
        byte b = (byte) this._paddingChar;
        int i8 = i6 + 1;
        bArr[i6] = i3 == 2 ? bArr2[(i2 >> 6) & 63] : b;
        int i9 = i8 + 1;
        bArr[i8] = b;
        return i9;
    }

    public Base64Variant(Base64Variant base64Variant, String str, int i2) {
        this(base64Variant, str, base64Variant._usesPadding, base64Variant._paddingChar, i2);
    }

    public Base64Variant(Base64Variant base64Variant, String str, boolean z, char c2, int i2) {
        int[] iArr = new int[128];
        this._asciiToBase64 = iArr;
        char[] cArr = new char[64];
        this._base64ToAsciiC = cArr;
        byte[] bArr = new byte[64];
        this._base64ToAsciiB = bArr;
        this._name = str;
        byte[] bArr2 = base64Variant._base64ToAsciiB;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        char[] cArr2 = base64Variant._base64ToAsciiC;
        System.arraycopy(cArr2, 0, cArr, 0, cArr2.length);
        int[] iArr2 = base64Variant._asciiToBase64;
        System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
        this._usesPadding = z;
        this._paddingChar = c2;
        this._maxLineLength = i2;
    }

    public String encode(byte[] bArr, boolean z, String str) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder((length >> 2) + length + (length >> 3));
        if (z) {
            sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
        }
        int maxLineLength = getMaxLineLength() >> 2;
        int i2 = 0;
        int i3 = length - 3;
        while (i2 <= i3) {
            int i4 = i2 + 1;
            int i5 = i4 + 1;
            int i6 = ((bArr[i2] << 8) | (bArr[i4] & 255)) << 8;
            int i7 = i5 + 1;
            encodeBase64Chunk(sb, i6 | (bArr[i5] & 255));
            maxLineLength--;
            if (maxLineLength <= 0) {
                sb.append(str);
                maxLineLength = getMaxLineLength() >> 2;
            }
            i2 = i7;
        }
        int i8 = length - i2;
        if (i8 > 0) {
            int i9 = i2 + 1;
            int i10 = bArr[i2] << 16;
            if (i8 == 2) {
                i10 |= (bArr[i9] & 255) << 8;
            }
            encodeBase64Partial(sb, i10, i8);
        }
        if (z) {
            sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
        }
        return sb.toString();
    }
}
