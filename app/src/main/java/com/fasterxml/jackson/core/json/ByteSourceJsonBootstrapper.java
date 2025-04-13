package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.format.InputAccessor;
import com.fasterxml.jackson.core.format.MatchStrength;
import com.fasterxml.jackson.core.p006io.IOContext;
import com.fasterxml.jackson.core.p006io.MergedStream;
import com.fasterxml.jackson.core.p006io.UTF32Reader;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import java.io.ByteArrayInputStream;
import java.io.CharConversionException;
import java.io.DataInput;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import kotlin.KotlinVersion;
import p000a.C0000a;

/* loaded from: classes.dex */
public final class ByteSourceJsonBootstrapper {
    public static final byte UTF8_BOM_1 = -17;
    public static final byte UTF8_BOM_2 = -69;
    public static final byte UTF8_BOM_3 = -65;
    private boolean _bigEndian;
    private final boolean _bufferRecyclable;
    private int _bytesPerChar;
    private final IOContext _context;
    private final InputStream _in;
    private final byte[] _inputBuffer;
    private int _inputEnd;
    private int _inputPtr;

    public ByteSourceJsonBootstrapper(IOContext iOContext, InputStream inputStream) {
        this._bigEndian = true;
        this._context = iOContext;
        this._in = inputStream;
        this._inputBuffer = iOContext.allocReadIOBuffer();
        this._inputPtr = 0;
        this._inputEnd = 0;
        this._bufferRecyclable = true;
    }

    private boolean checkUTF16(int i2) {
        if ((65280 & i2) == 0) {
            this._bigEndian = true;
        } else {
            if ((i2 & KotlinVersion.MAX_COMPONENT_VALUE) != 0) {
                return false;
            }
            this._bigEndian = false;
        }
        this._bytesPerChar = 2;
        return true;
    }

    private boolean checkUTF32(int i2) throws IOException {
        if ((i2 >> 8) == 0) {
            this._bigEndian = true;
        } else if ((16777215 & i2) == 0) {
            this._bigEndian = false;
        } else if (((-16711681) & i2) == 0) {
            reportWeirdUCS4("3412");
        } else {
            if ((i2 & (-65281)) != 0) {
                return false;
            }
            reportWeirdUCS4("2143");
        }
        this._bytesPerChar = 4;
        return true;
    }

    private boolean handleBOM(int i2) throws IOException {
        if (i2 == -16842752) {
            reportWeirdUCS4("3412");
        } else {
            if (i2 == -131072) {
                this._inputPtr += 4;
                this._bytesPerChar = 4;
                this._bigEndian = false;
                return true;
            }
            if (i2 == 65279) {
                this._bigEndian = true;
                this._inputPtr += 4;
                this._bytesPerChar = 4;
                return true;
            }
            if (i2 == 65534) {
                reportWeirdUCS4("2143");
            }
        }
        int i3 = i2 >>> 16;
        if (i3 == 65279) {
            this._inputPtr += 2;
            this._bytesPerChar = 2;
            this._bigEndian = true;
            return true;
        }
        if (i3 == 65534) {
            this._inputPtr += 2;
            this._bytesPerChar = 2;
            this._bigEndian = false;
            return true;
        }
        if ((i2 >>> 8) != 15711167) {
            return false;
        }
        this._inputPtr += 3;
        this._bytesPerChar = 1;
        this._bigEndian = true;
        return true;
    }

    public static MatchStrength hasJSONFormat(InputAccessor inputAccessor) throws IOException {
        if (!inputAccessor.hasMoreBytes()) {
            return MatchStrength.INCONCLUSIVE;
        }
        byte nextByte = inputAccessor.nextByte();
        if (nextByte == -17) {
            if (!inputAccessor.hasMoreBytes()) {
                return MatchStrength.INCONCLUSIVE;
            }
            if (inputAccessor.nextByte() != -69) {
                return MatchStrength.NO_MATCH;
            }
            if (!inputAccessor.hasMoreBytes()) {
                return MatchStrength.INCONCLUSIVE;
            }
            if (inputAccessor.nextByte() != -65) {
                return MatchStrength.NO_MATCH;
            }
            if (!inputAccessor.hasMoreBytes()) {
                return MatchStrength.INCONCLUSIVE;
            }
            nextByte = inputAccessor.nextByte();
        }
        int skipSpace = skipSpace(inputAccessor, nextByte);
        if (skipSpace < 0) {
            return MatchStrength.INCONCLUSIVE;
        }
        if (skipSpace == 123) {
            int skipSpace2 = skipSpace(inputAccessor);
            return skipSpace2 < 0 ? MatchStrength.INCONCLUSIVE : (skipSpace2 == 34 || skipSpace2 == 125) ? MatchStrength.SOLID_MATCH : MatchStrength.NO_MATCH;
        }
        if (skipSpace == 91) {
            int skipSpace3 = skipSpace(inputAccessor);
            return skipSpace3 < 0 ? MatchStrength.INCONCLUSIVE : (skipSpace3 == 93 || skipSpace3 == 91) ? MatchStrength.SOLID_MATCH : MatchStrength.SOLID_MATCH;
        }
        MatchStrength matchStrength = MatchStrength.WEAK_MATCH;
        if (skipSpace == 34) {
            return matchStrength;
        }
        if (skipSpace <= 57 && skipSpace >= 48) {
            return matchStrength;
        }
        if (skipSpace != 45) {
            return skipSpace == 110 ? tryMatch(inputAccessor, "ull", matchStrength) : skipSpace == 116 ? tryMatch(inputAccessor, "rue", matchStrength) : skipSpace == 102 ? tryMatch(inputAccessor, "alse", matchStrength) : MatchStrength.NO_MATCH;
        }
        int skipSpace4 = skipSpace(inputAccessor);
        return skipSpace4 < 0 ? MatchStrength.INCONCLUSIVE : (skipSpace4 > 57 || skipSpace4 < 48) ? MatchStrength.NO_MATCH : matchStrength;
    }

    private void reportWeirdUCS4(String str) throws IOException {
        throw new CharConversionException(C0000a.m16m("Unsupported UCS-4 endianness (", str, ") detected"));
    }

    private static int skipSpace(InputAccessor inputAccessor) throws IOException {
        if (inputAccessor.hasMoreBytes()) {
            return skipSpace(inputAccessor, inputAccessor.nextByte());
        }
        return -1;
    }

    public static int skipUTF8BOM(DataInput dataInput) throws IOException {
        int readUnsignedByte = dataInput.readUnsignedByte();
        if (readUnsignedByte != 239) {
            return readUnsignedByte;
        }
        int readUnsignedByte2 = dataInput.readUnsignedByte();
        if (readUnsignedByte2 != 187) {
            StringBuilder m24u = C0000a.m24u("Unexpected byte 0x");
            m24u.append(Integer.toHexString(readUnsignedByte2));
            m24u.append(" following 0xEF; should get 0xBB as part of UTF-8 BOM");
            throw new IOException(m24u.toString());
        }
        int readUnsignedByte3 = dataInput.readUnsignedByte();
        if (readUnsignedByte3 == 191) {
            return dataInput.readUnsignedByte();
        }
        StringBuilder m24u2 = C0000a.m24u("Unexpected byte 0x");
        m24u2.append(Integer.toHexString(readUnsignedByte3));
        m24u2.append(" following 0xEF 0xBB; should get 0xBF as part of UTF-8 BOM");
        throw new IOException(m24u2.toString());
    }

    private static MatchStrength tryMatch(InputAccessor inputAccessor, String str, MatchStrength matchStrength) throws IOException {
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (!inputAccessor.hasMoreBytes()) {
                return MatchStrength.INCONCLUSIVE;
            }
            if (inputAccessor.nextByte() != str.charAt(i2)) {
                return MatchStrength.NO_MATCH;
            }
        }
        return matchStrength;
    }

    public JsonParser constructParser(int i2, ObjectCodec objectCodec, ByteQuadsCanonicalizer byteQuadsCanonicalizer, CharsToNameCanonicalizer charsToNameCanonicalizer, int i3) throws IOException {
        int i4 = this._inputPtr;
        JsonEncoding detectEncoding = detectEncoding();
        int i5 = this._inputPtr - i4;
        if (detectEncoding != JsonEncoding.UTF8 || !JsonFactory.Feature.CANONICALIZE_FIELD_NAMES.enabledIn(i3)) {
            return new ReaderBasedJsonParser(this._context, i2, constructReader(), objectCodec, charsToNameCanonicalizer.makeChild(i3));
        }
        return new UTF8StreamJsonParser(this._context, i2, this._in, objectCodec, byteQuadsCanonicalizer.makeChild(i3), this._inputBuffer, this._inputPtr, this._inputEnd, i5, this._bufferRecyclable);
    }

    public Reader constructReader() throws IOException {
        JsonEncoding encoding = this._context.getEncoding();
        int bits = encoding.bits();
        if (bits != 8 && bits != 16) {
            if (bits != 32) {
                throw new RuntimeException("Internal error");
            }
            IOContext iOContext = this._context;
            return new UTF32Reader(iOContext, this._in, this._inputBuffer, this._inputPtr, this._inputEnd, iOContext.getEncoding().isBigEndian());
        }
        InputStream inputStream = this._in;
        if (inputStream == null) {
            inputStream = new ByteArrayInputStream(this._inputBuffer, this._inputPtr, this._inputEnd);
        } else if (this._inputPtr < this._inputEnd) {
            inputStream = new MergedStream(this._context, inputStream, this._inputBuffer, this._inputPtr, this._inputEnd);
        }
        return new InputStreamReader(inputStream, encoding.getJavaName());
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x005c, code lost:
    
        if (checkUTF16((r1[r5 + 1] & 255) | ((r1[r5] & 255) << 8)) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003f, code lost:
    
        if (checkUTF16(r1 >>> 16) != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.fasterxml.jackson.core.JsonEncoding detectEncoding() throws java.io.IOException {
        /*
            r8 = this;
            r0 = 4
            boolean r1 = r8.ensureLoaded(r0)
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L42
            byte[] r1 = r8._inputBuffer
            int r5 = r8._inputPtr
            r6 = r1[r5]
            int r6 = r6 << 24
            int r7 = r5 + 1
            r7 = r1[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r7 = r7 << 16
            r6 = r6 | r7
            int r7 = r5 + 2
            r7 = r1[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r7 = r7 << 8
            r6 = r6 | r7
            int r5 = r5 + 3
            r1 = r1[r5]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r1 = r1 | r6
            boolean r5 = r8.handleBOM(r1)
            if (r5 == 0) goto L32
            goto L5e
        L32:
            boolean r5 = r8.checkUTF32(r1)
            if (r5 == 0) goto L39
            goto L5e
        L39:
            int r1 = r1 >>> 16
            boolean r1 = r8.checkUTF16(r1)
            if (r1 == 0) goto L5f
            goto L5e
        L42:
            boolean r1 = r8.ensureLoaded(r2)
            if (r1 == 0) goto L5f
            byte[] r1 = r8._inputBuffer
            int r5 = r8._inputPtr
            r6 = r1[r5]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 8
            int r5 = r5 + r3
            r1 = r1[r5]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r1 = r1 | r6
            boolean r1 = r8.checkUTF16(r1)
            if (r1 == 0) goto L5f
        L5e:
            r4 = 1
        L5f:
            if (r4 != 0) goto L64
            com.fasterxml.jackson.core.JsonEncoding r0 = com.fasterxml.jackson.core.JsonEncoding.UTF8
            goto L8a
        L64:
            int r1 = r8._bytesPerChar
            if (r1 == r3) goto L88
            if (r1 == r2) goto L7e
            if (r1 != r0) goto L76
            boolean r0 = r8._bigEndian
            if (r0 == 0) goto L73
            com.fasterxml.jackson.core.JsonEncoding r0 = com.fasterxml.jackson.core.JsonEncoding.UTF32_BE
            goto L8a
        L73:
            com.fasterxml.jackson.core.JsonEncoding r0 = com.fasterxml.jackson.core.JsonEncoding.UTF32_LE
            goto L8a
        L76:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Internal error"
            r0.<init>(r1)
            throw r0
        L7e:
            boolean r0 = r8._bigEndian
            if (r0 == 0) goto L85
            com.fasterxml.jackson.core.JsonEncoding r0 = com.fasterxml.jackson.core.JsonEncoding.UTF16_BE
            goto L8a
        L85:
            com.fasterxml.jackson.core.JsonEncoding r0 = com.fasterxml.jackson.core.JsonEncoding.UTF16_LE
            goto L8a
        L88:
            com.fasterxml.jackson.core.JsonEncoding r0 = com.fasterxml.jackson.core.JsonEncoding.UTF8
        L8a:
            com.fasterxml.jackson.core.io.IOContext r1 = r8._context
            r1.setEncoding(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper.detectEncoding():com.fasterxml.jackson.core.JsonEncoding");
    }

    public boolean ensureLoaded(int i2) throws IOException {
        int read;
        int i3 = this._inputEnd - this._inputPtr;
        while (i3 < i2) {
            InputStream inputStream = this._in;
            if (inputStream == null) {
                read = -1;
            } else {
                byte[] bArr = this._inputBuffer;
                int i4 = this._inputEnd;
                read = inputStream.read(bArr, i4, bArr.length - i4);
            }
            if (read < 1) {
                return false;
            }
            this._inputEnd += read;
            i3 += read;
        }
        return true;
    }

    private static int skipSpace(InputAccessor inputAccessor, byte b) throws IOException {
        while (true) {
            int i2 = b & 255;
            if (i2 != 32 && i2 != 13 && i2 != 10 && i2 != 9) {
                return i2;
            }
            if (!inputAccessor.hasMoreBytes()) {
                return -1;
            }
            b = inputAccessor.nextByte();
        }
    }

    public ByteSourceJsonBootstrapper(IOContext iOContext, byte[] bArr, int i2, int i3) {
        this._bigEndian = true;
        this._context = iOContext;
        this._in = null;
        this._inputBuffer = bArr;
        this._inputPtr = i2;
        this._inputEnd = i2 + i3;
        this._bufferRecyclable = false;
    }
}
