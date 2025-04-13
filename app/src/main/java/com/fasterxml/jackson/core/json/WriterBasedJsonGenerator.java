package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.base.GeneratorBase;
import com.fasterxml.jackson.core.p006io.CharTypes;
import com.fasterxml.jackson.core.p006io.IOContext;
import com.fasterxml.jackson.core.p006io.NumberOutput;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import kotlin.KotlinVersion;
import p000a.C0000a;

/* loaded from: classes.dex */
public class WriterBasedJsonGenerator extends JsonGeneratorImpl {
    public static final char[] HEX_CHARS = CharTypes.copyHexChars();
    public static final int SHORT_WRITE = 32;
    public char[] _copyBuffer;
    public SerializableString _currentEscape;
    public char[] _entityBuffer;
    public char[] _outputBuffer;
    public int _outputEnd;
    public int _outputHead;
    public int _outputTail;
    public char _quoteChar;
    public final Writer _writer;

    @Deprecated
    public WriterBasedJsonGenerator(IOContext iOContext, int i2, ObjectCodec objectCodec, Writer writer) {
        this(iOContext, i2, objectCodec, writer, JsonFactory.DEFAULT_QUOTE_CHAR);
    }

    private char[] _allocateCopyBuffer() {
        if (this._copyBuffer == null) {
            this._copyBuffer = this._ioContext.allocNameCopyBuffer(2000);
        }
        return this._copyBuffer;
    }

    private char[] _allocateEntityBuffer() {
        char[] cArr = {'\\', 0, '\\', 'u', '0', '0', 0, 0, '\\', 'u', 0, 0, 0, 0};
        this._entityBuffer = cArr;
        return cArr;
    }

    private void _appendCharacterEscape(char c2, int i2) throws IOException, JsonGenerationException {
        String value;
        int i3;
        if (i2 >= 0) {
            if (this._outputTail + 2 > this._outputEnd) {
                _flushBuffer();
            }
            char[] cArr = this._outputBuffer;
            int i4 = this._outputTail;
            int i5 = i4 + 1;
            this._outputTail = i5;
            cArr[i4] = '\\';
            this._outputTail = i5 + 1;
            cArr[i5] = (char) i2;
            return;
        }
        if (i2 == -2) {
            SerializableString serializableString = this._currentEscape;
            if (serializableString == null) {
                value = this._characterEscapes.getEscapeSequence(c2).getValue();
            } else {
                value = serializableString.getValue();
                this._currentEscape = null;
            }
            int length = value.length();
            if (this._outputTail + length > this._outputEnd) {
                _flushBuffer();
                if (length > this._outputEnd) {
                    this._writer.write(value);
                    return;
                }
            }
            value.getChars(0, length, this._outputBuffer, this._outputTail);
            this._outputTail += length;
            return;
        }
        if (this._outputTail + 5 >= this._outputEnd) {
            _flushBuffer();
        }
        int i6 = this._outputTail;
        char[] cArr2 = this._outputBuffer;
        int i7 = i6 + 1;
        cArr2[i6] = '\\';
        int i8 = i7 + 1;
        cArr2[i7] = 'u';
        if (c2 > 255) {
            int i9 = 255 & (c2 >> '\b');
            int i10 = i8 + 1;
            char[] cArr3 = HEX_CHARS;
            cArr2[i8] = cArr3[i9 >> 4];
            i3 = i10 + 1;
            cArr2[i10] = cArr3[i9 & 15];
            c2 = (char) (c2 & 255);
        } else {
            int i11 = i8 + 1;
            cArr2[i8] = '0';
            i3 = i11 + 1;
            cArr2[i11] = '0';
        }
        int i12 = i3 + 1;
        char[] cArr4 = HEX_CHARS;
        cArr2[i3] = cArr4[c2 >> 4];
        cArr2[i12] = cArr4[c2 & 15];
        this._outputTail = i12 + 1;
    }

    private void _prependOrWriteCharacterEscape(char c2, int i2) throws IOException, JsonGenerationException {
        String value;
        int i3;
        if (i2 >= 0) {
            int i4 = this._outputTail;
            if (i4 >= 2) {
                int i5 = i4 - 2;
                this._outputHead = i5;
                char[] cArr = this._outputBuffer;
                cArr[i5] = '\\';
                cArr[i5 + 1] = (char) i2;
                return;
            }
            char[] cArr2 = this._entityBuffer;
            if (cArr2 == null) {
                cArr2 = _allocateEntityBuffer();
            }
            this._outputHead = this._outputTail;
            cArr2[1] = (char) i2;
            this._writer.write(cArr2, 0, 2);
            return;
        }
        if (i2 == -2) {
            SerializableString serializableString = this._currentEscape;
            if (serializableString == null) {
                value = this._characterEscapes.getEscapeSequence(c2).getValue();
            } else {
                value = serializableString.getValue();
                this._currentEscape = null;
            }
            int length = value.length();
            int i6 = this._outputTail;
            if (i6 < length) {
                this._outputHead = i6;
                this._writer.write(value);
                return;
            } else {
                int i7 = i6 - length;
                this._outputHead = i7;
                value.getChars(0, length, this._outputBuffer, i7);
                return;
            }
        }
        int i8 = this._outputTail;
        if (i8 < 6) {
            char[] cArr3 = this._entityBuffer;
            if (cArr3 == null) {
                cArr3 = _allocateEntityBuffer();
            }
            this._outputHead = this._outputTail;
            if (c2 <= 255) {
                char[] cArr4 = HEX_CHARS;
                cArr3[6] = cArr4[c2 >> 4];
                cArr3[7] = cArr4[c2 & 15];
                this._writer.write(cArr3, 2, 6);
                return;
            }
            int i9 = (c2 >> '\b') & KotlinVersion.MAX_COMPONENT_VALUE;
            int i10 = c2 & 255;
            char[] cArr5 = HEX_CHARS;
            cArr3[10] = cArr5[i9 >> 4];
            cArr3[11] = cArr5[i9 & 15];
            cArr3[12] = cArr5[i10 >> 4];
            cArr3[13] = cArr5[i10 & 15];
            this._writer.write(cArr3, 8, 6);
            return;
        }
        char[] cArr6 = this._outputBuffer;
        int i11 = i8 - 6;
        this._outputHead = i11;
        cArr6[i11] = '\\';
        int i12 = i11 + 1;
        cArr6[i12] = 'u';
        if (c2 > 255) {
            int i13 = (c2 >> '\b') & KotlinVersion.MAX_COMPONENT_VALUE;
            int i14 = i12 + 1;
            char[] cArr7 = HEX_CHARS;
            cArr6[i14] = cArr7[i13 >> 4];
            i3 = i14 + 1;
            cArr6[i3] = cArr7[i13 & 15];
            c2 = (char) (c2 & 255);
        } else {
            int i15 = i12 + 1;
            cArr6[i15] = '0';
            i3 = i15 + 1;
            cArr6[i3] = '0';
        }
        int i16 = i3 + 1;
        char[] cArr8 = HEX_CHARS;
        cArr6[i16] = cArr8[c2 >> 4];
        cArr6[i16 + 1] = cArr8[c2 & 15];
    }

    private int _readMore(InputStream inputStream, byte[] bArr, int i2, int i3, int i4) throws IOException {
        int i5 = 0;
        while (i2 < i3) {
            bArr[i5] = bArr[i2];
            i5++;
            i2++;
        }
        int min = Math.min(i4, bArr.length);
        do {
            int i6 = min - i5;
            if (i6 == 0) {
                break;
            }
            int read = inputStream.read(bArr, i5, i6);
            if (read < 0) {
                return i5;
            }
            i5 += read;
        } while (i5 < 3);
        return i5;
    }

    private final void _writeFieldNameTail(SerializableString serializableString) throws IOException {
        char[] asQuotedChars = serializableString.asQuotedChars();
        writeRaw(asQuotedChars, 0, asQuotedChars.length);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        cArr[i2] = this._quoteChar;
    }

    private void _writeLongString(String str) throws IOException {
        _flushBuffer();
        int length = str.length();
        int i2 = 0;
        while (true) {
            int i3 = this._outputEnd;
            if (i2 + i3 > length) {
                i3 = length - i2;
            }
            int i4 = i2 + i3;
            str.getChars(i2, i4, this._outputBuffer, 0);
            if (this._characterEscapes != null) {
                _writeSegmentCustom(i3);
            } else {
                int i5 = this._maximumNonEscapedChar;
                if (i5 != 0) {
                    _writeSegmentASCII(i3, i5);
                } else {
                    _writeSegment(i3);
                }
            }
            if (i4 >= length) {
                return;
            } else {
                i2 = i4;
            }
        }
    }

    private final void _writeNull() throws IOException {
        if (this._outputTail + 4 >= this._outputEnd) {
            _flushBuffer();
        }
        int i2 = this._outputTail;
        char[] cArr = this._outputBuffer;
        cArr[i2] = 'n';
        int i3 = i2 + 1;
        cArr[i3] = 'u';
        int i4 = i3 + 1;
        cArr[i4] = 'l';
        int i5 = i4 + 1;
        cArr[i5] = 'l';
        this._outputTail = i5 + 1;
    }

    private void _writeQuotedInt(int i2) throws IOException {
        if (this._outputTail + 13 >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i3 = this._outputTail;
        int i4 = i3 + 1;
        this._outputTail = i4;
        cArr[i3] = this._quoteChar;
        int outputInt = NumberOutput.outputInt(i2, cArr, i4);
        this._outputTail = outputInt;
        char[] cArr2 = this._outputBuffer;
        this._outputTail = outputInt + 1;
        cArr2[outputInt] = this._quoteChar;
    }

    private void _writeQuotedLong(long j2) throws IOException {
        if (this._outputTail + 23 >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i2 = this._outputTail;
        int i3 = i2 + 1;
        this._outputTail = i3;
        cArr[i2] = this._quoteChar;
        int outputLong = NumberOutput.outputLong(j2, cArr, i3);
        this._outputTail = outputLong;
        char[] cArr2 = this._outputBuffer;
        this._outputTail = outputLong + 1;
        cArr2[outputLong] = this._quoteChar;
    }

    private void _writeQuotedRaw(String str) throws IOException {
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        cArr[i2] = this._quoteChar;
        writeRaw(str);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        cArr2[i3] = this._quoteChar;
    }

    private void _writeQuotedShort(short s) throws IOException {
        if (this._outputTail + 8 >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i2 = this._outputTail;
        int i3 = i2 + 1;
        this._outputTail = i3;
        cArr[i2] = this._quoteChar;
        int outputInt = NumberOutput.outputInt(s, cArr, i3);
        this._outputTail = outputInt;
        char[] cArr2 = this._outputBuffer;
        this._outputTail = outputInt + 1;
        cArr2[outputInt] = this._quoteChar;
    }

    private void _writeSegment(int i2) throws IOException {
        char[] cArr;
        char c2;
        int[] iArr = this._outputEscapes;
        int length = iArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            do {
                cArr = this._outputBuffer;
                c2 = cArr[i3];
                if (c2 < length && iArr[c2] != 0) {
                    break;
                } else {
                    i3++;
                }
            } while (i3 < i2);
            int i5 = i3 - i4;
            if (i5 > 0) {
                this._writer.write(cArr, i4, i5);
                if (i3 >= i2) {
                    return;
                }
            }
            i3++;
            i4 = _prependOrWriteCharacterEscape(this._outputBuffer, i3, i2, c2, iArr[c2]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:? A[LOOP:1: B:3:0x000e->B:20:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[EDGE_INSN: B:9:0x0021->B:10:0x0021 BREAK  A[LOOP:1: B:3:0x000e->B:20:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void _writeSegmentASCII(int r13, int r14) throws java.io.IOException, com.fasterxml.jackson.core.JsonGenerationException {
        /*
            r12 = this;
            int[] r0 = r12._outputEscapes
            int r1 = r0.length
            int r2 = r14 + 1
            int r1 = java.lang.Math.min(r1, r2)
            r2 = 0
            r3 = 0
            r4 = 0
        Lc:
            if (r2 >= r13) goto L3a
        Le:
            char[] r5 = r12._outputBuffer
            char r10 = r5[r2]
            if (r10 >= r1) goto L19
            r4 = r0[r10]
            if (r4 == 0) goto L1d
            goto L21
        L19:
            if (r10 <= r14) goto L1d
            r4 = -1
            goto L21
        L1d:
            int r2 = r2 + 1
            if (r2 < r13) goto Le
        L21:
            int r6 = r2 - r3
            if (r6 <= 0) goto L2d
            java.io.Writer r7 = r12._writer
            r7.write(r5, r3, r6)
            if (r2 < r13) goto L2d
            goto L3a
        L2d:
            int r2 = r2 + 1
            char[] r7 = r12._outputBuffer
            r6 = r12
            r8 = r2
            r9 = r13
            r11 = r4
            int r3 = r6._prependOrWriteCharacterEscape(r7, r8, r9, r10, r11)
            goto Lc
        L3a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeSegmentASCII(int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035 A[EDGE_INSN: B:12:0x0035->B:13:0x0035 BREAK  A[LOOP:1: B:6:0x0018->B:23:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[LOOP:1: B:6:0x0018->B:23:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void _writeSegmentCustom(int r15) throws java.io.IOException, com.fasterxml.jackson.core.JsonGenerationException {
        /*
            r14 = this;
            int[] r0 = r14._outputEscapes
            int r1 = r14._maximumNonEscapedChar
            r2 = 1
            if (r1 >= r2) goto La
            r1 = 65535(0xffff, float:9.1834E-41)
        La:
            int r2 = r0.length
            int r3 = r1 + 1
            int r2 = java.lang.Math.min(r2, r3)
            com.fasterxml.jackson.core.io.CharacterEscapes r3 = r14._characterEscapes
            r4 = 0
            r5 = 0
            r6 = 0
        L16:
            if (r4 >= r15) goto L50
        L18:
            char[] r7 = r14._outputBuffer
            char r12 = r7[r4]
            if (r12 >= r2) goto L23
            r6 = r0[r12]
            if (r6 == 0) goto L31
            goto L35
        L23:
            if (r12 <= r1) goto L27
            r6 = -1
            goto L35
        L27:
            com.fasterxml.jackson.core.SerializableString r7 = r3.getEscapeSequence(r12)
            r14._currentEscape = r7
            if (r7 == 0) goto L31
            r6 = -2
            goto L35
        L31:
            int r4 = r4 + 1
            if (r4 < r15) goto L18
        L35:
            int r7 = r4 - r5
            if (r7 <= 0) goto L43
            java.io.Writer r8 = r14._writer
            char[] r9 = r14._outputBuffer
            r8.write(r9, r5, r7)
            if (r4 < r15) goto L43
            goto L50
        L43:
            int r4 = r4 + 1
            char[] r9 = r14._outputBuffer
            r8 = r14
            r10 = r4
            r11 = r15
            r13 = r6
            int r5 = r8._prependOrWriteCharacterEscape(r9, r10, r11, r12, r13)
            goto L16
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeSegmentCustom(int):void");
    }

    private void _writeString(String str) throws IOException {
        int length = str.length();
        int i2 = this._outputEnd;
        if (length > i2) {
            _writeLongString(str);
            return;
        }
        if (this._outputTail + length > i2) {
            _flushBuffer();
        }
        str.getChars(0, length, this._outputBuffer, this._outputTail);
        if (this._characterEscapes != null) {
            _writeStringCustom(length);
            return;
        }
        int i3 = this._maximumNonEscapedChar;
        if (i3 != 0) {
            _writeStringASCII(length, i3);
        } else {
            _writeString2(length);
        }
    }

    private void _writeString2(SerializableString serializableString) throws IOException {
        char[] asQuotedChars = serializableString.asQuotedChars();
        int length = asQuotedChars.length;
        if (length < 32) {
            if (length > this._outputEnd - this._outputTail) {
                _flushBuffer();
            }
            System.arraycopy(asQuotedChars, 0, this._outputBuffer, this._outputTail, length);
            this._outputTail += length;
        } else {
            _flushBuffer();
            this._writer.write(asQuotedChars, 0, length);
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        cArr[i2] = this._quoteChar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void _writeStringASCII(int r9, int r10) throws java.io.IOException, com.fasterxml.jackson.core.JsonGenerationException {
        /*
            r8 = this;
            int r0 = r8._outputTail
            int r0 = r0 + r9
            int[] r9 = r8._outputEscapes
            int r1 = r9.length
            int r2 = r10 + 1
            int r1 = java.lang.Math.min(r1, r2)
        Lc:
            int r2 = r8._outputTail
            if (r2 >= r0) goto L3a
        L10:
            char[] r2 = r8._outputBuffer
            int r3 = r8._outputTail
            char r4 = r2[r3]
            if (r4 >= r1) goto L1d
            r5 = r9[r4]
            if (r5 == 0) goto L34
            goto L20
        L1d:
            if (r4 <= r10) goto L34
            r5 = -1
        L20:
            int r6 = r8._outputHead
            int r3 = r3 - r6
            if (r3 <= 0) goto L2a
            java.io.Writer r7 = r8._writer
            r7.write(r2, r6, r3)
        L2a:
            int r2 = r8._outputTail
            int r2 = r2 + 1
            r8._outputTail = r2
            r8._prependOrWriteCharacterEscape(r4, r5)
            goto Lc
        L34:
            int r3 = r3 + 1
            r8._outputTail = r3
            if (r3 < r0) goto L10
        L3a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeStringASCII(int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void _writeStringCustom(int r12) throws java.io.IOException, com.fasterxml.jackson.core.JsonGenerationException {
        /*
            r11 = this;
            int r0 = r11._outputTail
            int r0 = r0 + r12
            int[] r12 = r11._outputEscapes
            int r1 = r11._maximumNonEscapedChar
            r2 = 1
            if (r1 >= r2) goto Ld
            r1 = 65535(0xffff, float:9.1834E-41)
        Ld:
            int r3 = r12.length
            int r4 = r1 + 1
            int r3 = java.lang.Math.min(r3, r4)
            com.fasterxml.jackson.core.io.CharacterEscapes r4 = r11._characterEscapes
        L16:
            int r5 = r11._outputTail
            if (r5 >= r0) goto L52
        L1a:
            char[] r5 = r11._outputBuffer
            int r6 = r11._outputTail
            char r5 = r5[r6]
            if (r5 >= r3) goto L27
            r6 = r12[r5]
            if (r6 == 0) goto L4b
            goto L34
        L27:
            if (r5 <= r1) goto L2b
            r6 = -1
            goto L34
        L2b:
            com.fasterxml.jackson.core.SerializableString r6 = r4.getEscapeSequence(r5)
            r11._currentEscape = r6
            if (r6 == 0) goto L4b
            r6 = -2
        L34:
            int r7 = r11._outputTail
            int r8 = r11._outputHead
            int r7 = r7 - r8
            if (r7 <= 0) goto L42
            java.io.Writer r9 = r11._writer
            char[] r10 = r11._outputBuffer
            r9.write(r10, r8, r7)
        L42:
            int r7 = r11._outputTail
            int r7 = r7 + r2
            r11._outputTail = r7
            r11._prependOrWriteCharacterEscape(r5, r6)
            goto L16
        L4b:
            int r5 = r11._outputTail
            int r5 = r5 + r2
            r11._outputTail = r5
            if (r5 < r0) goto L1a
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeStringCustom(int):void");
    }

    private void writeRawLong(String str) throws IOException {
        int i2 = this._outputEnd;
        int i3 = this._outputTail;
        int i4 = i2 - i3;
        str.getChars(0, i4, this._outputBuffer, i3);
        this._outputTail += i4;
        _flushBuffer();
        int length = str.length() - i4;
        while (true) {
            int i5 = this._outputEnd;
            if (length <= i5) {
                str.getChars(i4, i4 + length, this._outputBuffer, 0);
                this._outputHead = 0;
                this._outputTail = length;
                return;
            } else {
                int i6 = i4 + i5;
                str.getChars(i4, i6, this._outputBuffer, 0);
                this._outputHead = 0;
                this._outputTail = i5;
                _flushBuffer();
                length -= i5;
                i4 = i6;
            }
        }
    }

    public void _flushBuffer() throws IOException {
        int i2 = this._outputTail;
        int i3 = this._outputHead;
        int i4 = i2 - i3;
        if (i4 > 0) {
            this._outputHead = 0;
            this._outputTail = 0;
            this._writer.write(this._outputBuffer, i3, i4);
        }
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase
    public void _releaseBuffers() {
        char[] cArr = this._outputBuffer;
        if (cArr != null) {
            this._outputBuffer = null;
            this._ioContext.releaseConcatBuffer(cArr);
        }
        char[] cArr2 = this._copyBuffer;
        if (cArr2 != null) {
            this._copyBuffer = null;
            this._ioContext.releaseNameCopyBuffer(cArr2);
        }
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase
    public final void _verifyValueWrite(String str) throws IOException {
        char c2;
        int writeValue = this._writeContext.writeValue();
        if (this._cfgPrettyPrinter != null) {
            _verifyPrettyValueWrite(str, writeValue);
            return;
        }
        if (writeValue == 1) {
            c2 = ',';
        } else {
            if (writeValue != 2) {
                if (writeValue != 3) {
                    if (writeValue != 5) {
                        return;
                    }
                    _reportCantWriteValueExpectName(str);
                    return;
                } else {
                    SerializableString serializableString = this._rootValueSeparator;
                    if (serializableString != null) {
                        writeRaw(serializableString.getValue());
                        return;
                    }
                    return;
                }
            }
            c2 = ':';
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        cArr[i2] = c2;
    }

    public final void _writeBinary(Base64Variant base64Variant, byte[] bArr, int i2, int i3) throws IOException, JsonGenerationException {
        int i4 = i3 - 3;
        int i5 = this._outputEnd - 6;
        int maxLineLength = base64Variant.getMaxLineLength() >> 2;
        while (i2 <= i4) {
            if (this._outputTail > i5) {
                _flushBuffer();
            }
            int i6 = i2 + 1;
            int i7 = i6 + 1;
            int i8 = ((bArr[i2] << 8) | (bArr[i6] & 255)) << 8;
            int i9 = i7 + 1;
            int encodeBase64Chunk = base64Variant.encodeBase64Chunk(i8 | (bArr[i7] & 255), this._outputBuffer, this._outputTail);
            this._outputTail = encodeBase64Chunk;
            maxLineLength--;
            if (maxLineLength <= 0) {
                char[] cArr = this._outputBuffer;
                int i10 = encodeBase64Chunk + 1;
                this._outputTail = i10;
                cArr[encodeBase64Chunk] = '\\';
                this._outputTail = i10 + 1;
                cArr[i10] = 'n';
                maxLineLength = base64Variant.getMaxLineLength() >> 2;
            }
            i2 = i9;
        }
        int i11 = i3 - i2;
        if (i11 > 0) {
            if (this._outputTail > i5) {
                _flushBuffer();
            }
            int i12 = i2 + 1;
            int i13 = bArr[i2] << 16;
            if (i11 == 2) {
                i13 |= (bArr[i12] & 255) << 8;
            }
            this._outputTail = base64Variant.encodeBase64Partial(i13, i11, this._outputBuffer, this._outputTail);
        }
    }

    public final void _writeFieldName(String str, boolean z) throws IOException {
        if (this._cfgPrettyPrinter != null) {
            _writePPFieldName(str, z);
            return;
        }
        if (this._outputTail + 1 >= this._outputEnd) {
            _flushBuffer();
        }
        if (z) {
            char[] cArr = this._outputBuffer;
            int i2 = this._outputTail;
            this._outputTail = i2 + 1;
            cArr[i2] = ',';
        }
        if (this._cfgUnqNames) {
            _writeString(str);
            return;
        }
        char[] cArr2 = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        cArr2[i3] = this._quoteChar;
        _writeString(str);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr3 = this._outputBuffer;
        int i4 = this._outputTail;
        this._outputTail = i4 + 1;
        cArr3[i4] = this._quoteChar;
    }

    public final void _writePPFieldName(String str, boolean z) throws IOException {
        if (z) {
            this._cfgPrettyPrinter.writeObjectEntrySeparator(this);
        } else {
            this._cfgPrettyPrinter.beforeObjectEntries(this);
        }
        if (this._cfgUnqNames) {
            _writeString(str);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        cArr[i2] = this._quoteChar;
        _writeString(str);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        cArr2[i3] = this._quoteChar;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public boolean canWriteFormattedNumbers() {
        return true;
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        if (this._outputBuffer != null && isEnabled(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT)) {
            while (true) {
                JsonStreamContext outputContext = getOutputContext();
                if (!outputContext.inArray()) {
                    if (!outputContext.inObject()) {
                        break;
                    } else {
                        writeEndObject();
                    }
                } else {
                    writeEndArray();
                }
            }
        }
        _flushBuffer();
        this._outputHead = 0;
        this._outputTail = 0;
        if (this._writer != null) {
            if (this._ioContext.isResourceManaged() || isEnabled(JsonGenerator.Feature.AUTO_CLOSE_TARGET)) {
                this._writer.close();
            } else if (isEnabled(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
                this._writer.flush();
            }
        }
        _releaseBuffers();
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator, java.io.Flushable
    public void flush() throws IOException {
        _flushBuffer();
        if (this._writer == null || !isEnabled(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
            return;
        }
        this._writer.flush();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public int getOutputBuffered() {
        return Math.max(0, this._outputTail - this._outputHead);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public Object getOutputTarget() {
        return this._writer;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeBinary(Base64Variant base64Variant, byte[] bArr, int i2, int i3) throws IOException, JsonGenerationException {
        _verifyValueWrite(GeneratorBase.WRITE_BINARY);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i4 = this._outputTail;
        this._outputTail = i4 + 1;
        cArr[i4] = this._quoteChar;
        _writeBinary(base64Variant, bArr, i2, i3 + i2);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i5 = this._outputTail;
        this._outputTail = i5 + 1;
        cArr2[i5] = this._quoteChar;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeBoolean(boolean z) throws IOException {
        int i2;
        _verifyValueWrite(GeneratorBase.WRITE_BOOLEAN);
        if (this._outputTail + 5 >= this._outputEnd) {
            _flushBuffer();
        }
        int i3 = this._outputTail;
        char[] cArr = this._outputBuffer;
        if (z) {
            cArr[i3] = 't';
            int i4 = i3 + 1;
            cArr[i4] = 'r';
            int i5 = i4 + 1;
            cArr[i5] = 'u';
            i2 = i5 + 1;
            cArr[i2] = 'e';
        } else {
            cArr[i3] = 'f';
            int i6 = i3 + 1;
            cArr[i6] = 'a';
            int i7 = i6 + 1;
            cArr[i7] = 'l';
            int i8 = i7 + 1;
            cArr[i8] = 's';
            i2 = i8 + 1;
            cArr[i2] = 'e';
        }
        this._outputTail = i2 + 1;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeEndArray() throws IOException {
        if (!this._writeContext.inArray()) {
            StringBuilder m24u = C0000a.m24u("Current context not Array but ");
            m24u.append(this._writeContext.typeDesc());
            _reportError(m24u.toString());
        }
        PrettyPrinter prettyPrinter = this._cfgPrettyPrinter;
        if (prettyPrinter != null) {
            prettyPrinter.writeEndArray(this, this._writeContext.getEntryCount());
        } else {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            char[] cArr = this._outputBuffer;
            int i2 = this._outputTail;
            this._outputTail = i2 + 1;
            cArr[i2] = ']';
        }
        this._writeContext = this._writeContext.clearAndGetParent();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeEndObject() throws IOException {
        if (!this._writeContext.inObject()) {
            StringBuilder m24u = C0000a.m24u("Current context not Object but ");
            m24u.append(this._writeContext.typeDesc());
            _reportError(m24u.toString());
        }
        PrettyPrinter prettyPrinter = this._cfgPrettyPrinter;
        if (prettyPrinter != null) {
            prettyPrinter.writeEndObject(this, this._writeContext.getEntryCount());
        } else {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            char[] cArr = this._outputBuffer;
            int i2 = this._outputTail;
            this._outputTail = i2 + 1;
            cArr[i2] = '}';
        }
        this._writeContext = this._writeContext.clearAndGetParent();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeFieldName(String str) throws IOException {
        int writeFieldName = this._writeContext.writeFieldName(str);
        if (writeFieldName == 4) {
            _reportError("Can not write a field name, expecting a value");
        }
        _writeFieldName(str, writeFieldName == 1);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNull() throws IOException {
        _verifyValueWrite(GeneratorBase.WRITE_NULL);
        _writeNull();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(short s) throws IOException {
        _verifyValueWrite(GeneratorBase.WRITE_NUMBER);
        if (this._cfgNumbersAsStrings) {
            _writeQuotedShort(s);
            return;
        }
        if (this._outputTail + 6 >= this._outputEnd) {
            _flushBuffer();
        }
        this._outputTail = NumberOutput.outputInt(s, this._outputBuffer, this._outputTail);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(String str) throws IOException {
        int length = str.length();
        int i2 = this._outputEnd - this._outputTail;
        if (i2 == 0) {
            _flushBuffer();
            i2 = this._outputEnd - this._outputTail;
        }
        if (i2 < length) {
            writeRawLong(str);
        } else {
            str.getChars(0, length, this._outputBuffer, this._outputTail);
            this._outputTail += length;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRawUTF8String(byte[] bArr, int i2, int i3) throws IOException {
        _reportUnsupportedOperation();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeStartArray() throws IOException {
        _verifyValueWrite("start an array");
        this._writeContext = this._writeContext.createChildArrayContext();
        PrettyPrinter prettyPrinter = this._cfgPrettyPrinter;
        if (prettyPrinter != null) {
            prettyPrinter.writeStartArray(this);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        cArr[i2] = '[';
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeStartObject() throws IOException {
        _verifyValueWrite("start an object");
        this._writeContext = this._writeContext.createChildObjectContext();
        PrettyPrinter prettyPrinter = this._cfgPrettyPrinter;
        if (prettyPrinter != null) {
            prettyPrinter.writeStartObject(this);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        cArr[i2] = '{';
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeString(String str) throws IOException {
        _verifyValueWrite(GeneratorBase.WRITE_STRING);
        if (str == null) {
            _writeNull();
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        cArr[i2] = this._quoteChar;
        _writeString(str);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        cArr2[i3] = this._quoteChar;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeUTF8String(byte[] bArr, int i2, int i3) throws IOException {
        _reportUnsupportedOperation();
    }

    public WriterBasedJsonGenerator(IOContext iOContext, int i2, ObjectCodec objectCodec, Writer writer, char c2) {
        super(iOContext, i2, objectCodec);
        this._writer = writer;
        char[] allocConcatBuffer = iOContext.allocConcatBuffer();
        this._outputBuffer = allocConcatBuffer;
        this._outputEnd = allocConcatBuffer.length;
        this._quoteChar = c2;
        if (c2 != '\"') {
            this._outputEscapes = CharTypes.get7BitOutputEscapes(c2);
        }
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator
    public void writeFieldName(SerializableString serializableString) throws IOException {
        int writeFieldName = this._writeContext.writeFieldName(serializableString.getValue());
        if (writeFieldName == 4) {
            _reportError("Can not write a field name, expecting a value");
        }
        _writeFieldName(serializableString, writeFieldName == 1);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(int i2) throws IOException {
        _verifyValueWrite(GeneratorBase.WRITE_NUMBER);
        if (this._cfgNumbersAsStrings) {
            _writeQuotedInt(i2);
            return;
        }
        if (this._outputTail + 11 >= this._outputEnd) {
            _flushBuffer();
        }
        this._outputTail = NumberOutput.outputInt(i2, this._outputBuffer, this._outputTail);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(String str, int i2, int i3) throws IOException {
        int i4 = this._outputEnd - this._outputTail;
        if (i4 < i3) {
            _flushBuffer();
            i4 = this._outputEnd - this._outputTail;
        }
        if (i4 >= i3) {
            str.getChars(i2, i2 + i3, this._outputBuffer, this._outputTail);
            this._outputTail += i3;
        } else {
            writeRawLong(str.substring(i2, i3 + i2));
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeStartArray(int i2) throws IOException {
        _verifyValueWrite("start an array");
        this._writeContext = this._writeContext.createChildArrayContext();
        PrettyPrinter prettyPrinter = this._cfgPrettyPrinter;
        if (prettyPrinter != null) {
            prettyPrinter.writeStartArray(this);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        cArr[i3] = '[';
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator
    public void writeStartObject(Object obj) throws IOException {
        _verifyValueWrite("start an object");
        this._writeContext = this._writeContext.createChildObjectContext(obj);
        PrettyPrinter prettyPrinter = this._cfgPrettyPrinter;
        if (prettyPrinter != null) {
            prettyPrinter.writeStartObject(this);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        cArr[i2] = '{';
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator
    public int writeBinary(Base64Variant base64Variant, InputStream inputStream, int i2) throws IOException, JsonGenerationException {
        _verifyValueWrite(GeneratorBase.WRITE_BINARY);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        cArr[i3] = this._quoteChar;
        byte[] allocBase64Buffer = this._ioContext.allocBase64Buffer();
        try {
            if (i2 < 0) {
                i2 = _writeBinary(base64Variant, inputStream, allocBase64Buffer);
            } else {
                int _writeBinary = _writeBinary(base64Variant, inputStream, allocBase64Buffer, i2);
                if (_writeBinary > 0) {
                    _reportError("Too few bytes available: missing " + _writeBinary + " bytes (out of " + i2 + ")");
                }
            }
            this._ioContext.releaseBase64Buffer(allocBase64Buffer);
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            char[] cArr2 = this._outputBuffer;
            int i4 = this._outputTail;
            this._outputTail = i4 + 1;
            cArr2[i4] = this._quoteChar;
            return i2;
        } catch (Throwable th) {
            this._ioContext.releaseBase64Buffer(allocBase64Buffer);
            throw th;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeString(Reader reader, int i2) throws IOException {
        _verifyValueWrite(GeneratorBase.WRITE_STRING);
        if (reader == null) {
            _reportError("null reader");
        }
        int i3 = i2 >= 0 ? i2 : Integer.MAX_VALUE;
        if (this._outputTail + i2 >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i4 = this._outputTail;
        this._outputTail = i4 + 1;
        cArr[i4] = this._quoteChar;
        char[] _allocateCopyBuffer = _allocateCopyBuffer();
        while (i3 > 0) {
            int read = reader.read(_allocateCopyBuffer, 0, Math.min(i3, _allocateCopyBuffer.length));
            if (read <= 0) {
                break;
            }
            if (this._outputTail + i2 >= this._outputEnd) {
                _flushBuffer();
            }
            _writeString(_allocateCopyBuffer, 0, read);
            i3 -= read;
        }
        if (this._outputTail + i2 >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i5 = this._outputTail;
        this._outputTail = i5 + 1;
        cArr2[i5] = this._quoteChar;
        if (i3 <= 0 || i2 < 0) {
            return;
        }
        _reportError("Didn't read enough from reader");
    }

    private void _writeString(char[] cArr, int i2, int i3) throws IOException {
        if (this._characterEscapes != null) {
            _writeStringCustom(cArr, i2, i3);
            return;
        }
        int i4 = this._maximumNonEscapedChar;
        if (i4 != 0) {
            _writeStringASCII(cArr, i2, i3, i4);
            return;
        }
        int i5 = i3 + i2;
        int[] iArr = this._outputEscapes;
        int length = iArr.length;
        while (i2 < i5) {
            int i6 = i2;
            do {
                char c2 = cArr[i6];
                if (c2 < length && iArr[c2] != 0) {
                    break;
                } else {
                    i6++;
                }
            } while (i6 < i5);
            int i7 = i6 - i2;
            if (i7 < 32) {
                if (this._outputTail + i7 > this._outputEnd) {
                    _flushBuffer();
                }
                if (i7 > 0) {
                    System.arraycopy(cArr, i2, this._outputBuffer, this._outputTail, i7);
                    this._outputTail += i7;
                }
            } else {
                _flushBuffer();
                this._writer.write(cArr, i2, i7);
            }
            if (i6 >= i5) {
                return;
            }
            i2 = i6 + 1;
            char c3 = cArr[i6];
            _appendCharacterEscape(c3, iArr[c3]);
        }
    }

    private void _writeString2(int i2) throws IOException {
        int i3;
        int i4 = this._outputTail + i2;
        int[] iArr = this._outputEscapes;
        int length = iArr.length;
        while (this._outputTail < i4) {
            do {
                char[] cArr = this._outputBuffer;
                int i5 = this._outputTail;
                char c2 = cArr[i5];
                if (c2 < length && iArr[c2] != 0) {
                    int i6 = this._outputHead;
                    int i7 = i5 - i6;
                    if (i7 > 0) {
                        this._writer.write(cArr, i6, i7);
                    }
                    char[] cArr2 = this._outputBuffer;
                    int i8 = this._outputTail;
                    this._outputTail = i8 + 1;
                    char c3 = cArr2[i8];
                    _prependOrWriteCharacterEscape(c3, iArr[c3]);
                } else {
                    i3 = i5 + 1;
                    this._outputTail = i3;
                }
            } while (i3 < i4);
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f A[EDGE_INSN: B:10:0x001f->B:11:0x001f BREAK  A[LOOP:1: B:4:0x000e->B:24:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[LOOP:1: B:4:0x000e->B:24:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void _writeStringASCII(char[] r9, int r10, int r11, int r12) throws java.io.IOException, com.fasterxml.jackson.core.JsonGenerationException {
        /*
            r8 = this;
            int r11 = r11 + r10
            int[] r0 = r8._outputEscapes
            int r1 = r0.length
            int r2 = r12 + 1
            int r1 = java.lang.Math.min(r1, r2)
            r2 = 0
        Lb:
            if (r10 >= r11) goto L4f
            r3 = r10
        Le:
            char r4 = r9[r3]
            if (r4 >= r1) goto L17
            r2 = r0[r4]
            if (r2 == 0) goto L1b
            goto L1f
        L17:
            if (r4 <= r12) goto L1b
            r2 = -1
            goto L1f
        L1b:
            int r3 = r3 + 1
            if (r3 < r11) goto Le
        L1f:
            int r5 = r3 - r10
            r6 = 32
            if (r5 >= r6) goto L3e
            int r6 = r8._outputTail
            int r6 = r6 + r5
            int r7 = r8._outputEnd
            if (r6 <= r7) goto L2f
            r8._flushBuffer()
        L2f:
            if (r5 <= 0) goto L46
            char[] r6 = r8._outputBuffer
            int r7 = r8._outputTail
            java.lang.System.arraycopy(r9, r10, r6, r7, r5)
            int r10 = r8._outputTail
            int r10 = r10 + r5
            r8._outputTail = r10
            goto L46
        L3e:
            r8._flushBuffer()
            java.io.Writer r6 = r8._writer
            r6.write(r9, r10, r5)
        L46:
            if (r3 < r11) goto L49
            goto L4f
        L49:
            int r10 = r3 + 1
            r8._appendCharacterEscape(r4, r2)
            goto Lb
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeStringASCII(char[], int, int, int):void");
    }

    public final void _writePPFieldName(SerializableString serializableString, boolean z) throws IOException {
        if (z) {
            this._cfgPrettyPrinter.writeObjectEntrySeparator(this);
        } else {
            this._cfgPrettyPrinter.beforeObjectEntries(this);
        }
        char[] asQuotedChars = serializableString.asQuotedChars();
        if (this._cfgUnqNames) {
            writeRaw(asQuotedChars, 0, asQuotedChars.length);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        cArr[i2] = this._quoteChar;
        writeRaw(asQuotedChars, 0, asQuotedChars.length);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        cArr2[i3] = this._quoteChar;
    }

    public final void _writeFieldName(SerializableString serializableString, boolean z) throws IOException {
        if (this._cfgPrettyPrinter != null) {
            _writePPFieldName(serializableString, z);
            return;
        }
        if (this._outputTail + 1 >= this._outputEnd) {
            _flushBuffer();
        }
        if (z) {
            char[] cArr = this._outputBuffer;
            int i2 = this._outputTail;
            this._outputTail = i2 + 1;
            cArr[i2] = ',';
        }
        if (this._cfgUnqNames) {
            char[] asQuotedChars = serializableString.asQuotedChars();
            writeRaw(asQuotedChars, 0, asQuotedChars.length);
            return;
        }
        char[] cArr2 = this._outputBuffer;
        int i3 = this._outputTail;
        int i4 = i3 + 1;
        this._outputTail = i4;
        cArr2[i3] = this._quoteChar;
        int appendQuoted = serializableString.appendQuoted(cArr2, i4);
        if (appendQuoted < 0) {
            _writeFieldNameTail(serializableString);
            return;
        }
        int i5 = this._outputTail + appendQuoted;
        this._outputTail = i5;
        if (i5 >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr3 = this._outputBuffer;
        int i6 = this._outputTail;
        this._outputTail = i6 + 1;
        cArr3[i6] = this._quoteChar;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(long j2) throws IOException {
        _verifyValueWrite(GeneratorBase.WRITE_NUMBER);
        if (this._cfgNumbersAsStrings) {
            _writeQuotedLong(j2);
            return;
        }
        if (this._outputTail + 21 >= this._outputEnd) {
            _flushBuffer();
        }
        this._outputTail = NumberOutput.outputLong(j2, this._outputBuffer, this._outputTail);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(SerializableString serializableString) throws IOException {
        int appendUnquoted = serializableString.appendUnquoted(this._outputBuffer, this._outputTail);
        if (appendUnquoted < 0) {
            writeRaw(serializableString.getValue());
        } else {
            this._outputTail += appendUnquoted;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0033 A[EDGE_INSN: B:13:0x0033->B:14:0x0033 BREAK  A[LOOP:1: B:7:0x0018->B:27:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[LOOP:1: B:7:0x0018->B:27:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void _writeStringCustom(char[] r11, int r12, int r13) throws java.io.IOException, com.fasterxml.jackson.core.JsonGenerationException {
        /*
            r10 = this;
            int r13 = r13 + r12
            int[] r0 = r10._outputEscapes
            int r1 = r10._maximumNonEscapedChar
            r2 = 1
            if (r1 >= r2) goto Lb
            r1 = 65535(0xffff, float:9.1834E-41)
        Lb:
            int r2 = r0.length
            int r3 = r1 + 1
            int r2 = java.lang.Math.min(r2, r3)
            com.fasterxml.jackson.core.io.CharacterEscapes r3 = r10._characterEscapes
            r4 = 0
        L15:
            if (r12 >= r13) goto L63
            r5 = r12
        L18:
            char r6 = r11[r5]
            if (r6 >= r2) goto L21
            r4 = r0[r6]
            if (r4 == 0) goto L2f
            goto L33
        L21:
            if (r6 <= r1) goto L25
            r4 = -1
            goto L33
        L25:
            com.fasterxml.jackson.core.SerializableString r7 = r3.getEscapeSequence(r6)
            r10._currentEscape = r7
            if (r7 == 0) goto L2f
            r4 = -2
            goto L33
        L2f:
            int r5 = r5 + 1
            if (r5 < r13) goto L18
        L33:
            int r7 = r5 - r12
            r8 = 32
            if (r7 >= r8) goto L52
            int r8 = r10._outputTail
            int r8 = r8 + r7
            int r9 = r10._outputEnd
            if (r8 <= r9) goto L43
            r10._flushBuffer()
        L43:
            if (r7 <= 0) goto L5a
            char[] r8 = r10._outputBuffer
            int r9 = r10._outputTail
            java.lang.System.arraycopy(r11, r12, r8, r9, r7)
            int r12 = r10._outputTail
            int r12 = r12 + r7
            r10._outputTail = r12
            goto L5a
        L52:
            r10._flushBuffer()
            java.io.Writer r8 = r10._writer
            r8.write(r11, r12, r7)
        L5a:
            if (r5 < r13) goto L5d
            goto L63
        L5d:
            int r12 = r5 + 1
            r10._appendCharacterEscape(r6, r4)
            goto L15
        L63:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.WriterBasedJsonGenerator._writeStringCustom(char[], int, int):void");
    }

    public final int _writeBinary(Base64Variant base64Variant, InputStream inputStream, byte[] bArr, int i2) throws IOException, JsonGenerationException {
        int _readMore;
        int i3 = this._outputEnd - 6;
        int i4 = 2;
        int maxLineLength = base64Variant.getMaxLineLength() >> 2;
        int i5 = -3;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (i2 <= 2) {
                break;
            }
            if (i6 > i5) {
                i7 = _readMore(inputStream, bArr, i6, i7, i2);
                if (i7 < 3) {
                    i6 = 0;
                    break;
                }
                i5 = i7 - 3;
                i6 = 0;
            }
            if (this._outputTail > i3) {
                _flushBuffer();
            }
            int i8 = i6 + 1;
            int i9 = bArr[i6] << 8;
            int i10 = i8 + 1;
            i6 = i10 + 1;
            i2 -= 3;
            int encodeBase64Chunk = base64Variant.encodeBase64Chunk((((bArr[i8] & 255) | i9) << 8) | (bArr[i10] & 255), this._outputBuffer, this._outputTail);
            this._outputTail = encodeBase64Chunk;
            maxLineLength--;
            if (maxLineLength <= 0) {
                char[] cArr = this._outputBuffer;
                int i11 = encodeBase64Chunk + 1;
                this._outputTail = i11;
                cArr[encodeBase64Chunk] = '\\';
                this._outputTail = i11 + 1;
                cArr[i11] = 'n';
                maxLineLength = base64Variant.getMaxLineLength() >> 2;
            }
        }
        if (i2 <= 0 || (_readMore = _readMore(inputStream, bArr, i6, i7, i2)) <= 0) {
            return i2;
        }
        if (this._outputTail > i3) {
            _flushBuffer();
        }
        int i12 = bArr[0] << 16;
        if (1 < _readMore) {
            i12 |= (bArr[1] & 255) << 8;
        } else {
            i4 = 1;
        }
        this._outputTail = base64Variant.encodeBase64Partial(i12, i4, this._outputBuffer, this._outputTail);
        return i2 - i4;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(char[] cArr, int i2, int i3) throws IOException {
        if (i3 < 32) {
            if (i3 > this._outputEnd - this._outputTail) {
                _flushBuffer();
            }
            System.arraycopy(cArr, i2, this._outputBuffer, this._outputTail, i3);
            this._outputTail += i3;
            return;
        }
        _flushBuffer();
        this._writer.write(cArr, i2, i3);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(BigInteger bigInteger) throws IOException {
        _verifyValueWrite(GeneratorBase.WRITE_NUMBER);
        if (bigInteger == null) {
            _writeNull();
        } else if (this._cfgNumbersAsStrings) {
            _writeQuotedRaw(bigInteger.toString());
        } else {
            writeRaw(bigInteger.toString());
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(char c2) throws IOException {
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        cArr[i2] = c2;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(double d) throws IOException {
        if (!this._cfgNumbersAsStrings && (!NumberOutput.notFinite(d) || !isEnabled(JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS))) {
            _verifyValueWrite(GeneratorBase.WRITE_NUMBER);
            writeRaw(String.valueOf(d));
        } else {
            writeString(String.valueOf(d));
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeString(char[] cArr, int i2, int i3) throws IOException {
        _verifyValueWrite(GeneratorBase.WRITE_STRING);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i4 = this._outputTail;
        this._outputTail = i4 + 1;
        cArr2[i4] = this._quoteChar;
        _writeString(cArr, i2, i3);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr3 = this._outputBuffer;
        int i5 = this._outputTail;
        this._outputTail = i5 + 1;
        cArr3[i5] = this._quoteChar;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(float f2) throws IOException {
        if (!this._cfgNumbersAsStrings && (!NumberOutput.notFinite(f2) || !isEnabled(JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS))) {
            _verifyValueWrite(GeneratorBase.WRITE_NUMBER);
            writeRaw(String.valueOf(f2));
        } else {
            writeString(String.valueOf(f2));
        }
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator
    public void writeString(SerializableString serializableString) throws IOException {
        _verifyValueWrite(GeneratorBase.WRITE_STRING);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr = this._outputBuffer;
        int i2 = this._outputTail;
        int i3 = i2 + 1;
        this._outputTail = i3;
        cArr[i2] = this._quoteChar;
        int appendQuoted = serializableString.appendQuoted(cArr, i3);
        if (appendQuoted < 0) {
            _writeString2(serializableString);
            return;
        }
        int i4 = this._outputTail + appendQuoted;
        this._outputTail = i4;
        if (i4 >= this._outputEnd) {
            _flushBuffer();
        }
        char[] cArr2 = this._outputBuffer;
        int i5 = this._outputTail;
        this._outputTail = i5 + 1;
        cArr2[i5] = this._quoteChar;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(BigDecimal bigDecimal) throws IOException {
        _verifyValueWrite(GeneratorBase.WRITE_NUMBER);
        if (bigDecimal == null) {
            _writeNull();
        } else if (this._cfgNumbersAsStrings) {
            _writeQuotedRaw(_asString(bigDecimal));
        } else {
            writeRaw(_asString(bigDecimal));
        }
    }

    public final int _writeBinary(Base64Variant base64Variant, InputStream inputStream, byte[] bArr) throws IOException, JsonGenerationException {
        int i2 = this._outputEnd - 6;
        int i3 = 2;
        int maxLineLength = base64Variant.getMaxLineLength() >> 2;
        int i4 = -3;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (i5 > i4) {
                i6 = _readMore(inputStream, bArr, i5, i6, bArr.length);
                if (i6 < 3) {
                    break;
                }
                i4 = i6 - 3;
                i5 = 0;
            }
            if (this._outputTail > i2) {
                _flushBuffer();
            }
            int i8 = i5 + 1;
            int i9 = bArr[i5] << 8;
            int i10 = i8 + 1;
            i5 = i10 + 1;
            i7 += 3;
            int encodeBase64Chunk = base64Variant.encodeBase64Chunk((((bArr[i8] & 255) | i9) << 8) | (bArr[i10] & 255), this._outputBuffer, this._outputTail);
            this._outputTail = encodeBase64Chunk;
            maxLineLength--;
            if (maxLineLength <= 0) {
                char[] cArr = this._outputBuffer;
                int i11 = encodeBase64Chunk + 1;
                this._outputTail = i11;
                cArr[encodeBase64Chunk] = '\\';
                this._outputTail = i11 + 1;
                cArr[i11] = 'n';
                maxLineLength = base64Variant.getMaxLineLength() >> 2;
            }
        }
        if (i6 <= 0) {
            return i7;
        }
        if (this._outputTail > i2) {
            _flushBuffer();
        }
        int i12 = bArr[0] << 16;
        if (1 < i6) {
            i12 |= (bArr[1] & 255) << 8;
        } else {
            i3 = 1;
        }
        int i13 = i7 + i3;
        this._outputTail = base64Variant.encodeBase64Partial(i12, i3, this._outputBuffer, this._outputTail);
        return i13;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(String str) throws IOException {
        _verifyValueWrite(GeneratorBase.WRITE_NUMBER);
        if (this._cfgNumbersAsStrings) {
            _writeQuotedRaw(str);
        } else {
            writeRaw(str);
        }
    }

    private int _prependOrWriteCharacterEscape(char[] cArr, int i2, int i3, char c2, int i4) throws IOException, JsonGenerationException {
        String value;
        int i5;
        if (i4 >= 0) {
            if (i2 > 1 && i2 < i3) {
                int i6 = i2 - 2;
                cArr[i6] = '\\';
                cArr[i6 + 1] = (char) i4;
                return i6;
            }
            char[] cArr2 = this._entityBuffer;
            if (cArr2 == null) {
                cArr2 = _allocateEntityBuffer();
            }
            cArr2[1] = (char) i4;
            this._writer.write(cArr2, 0, 2);
            return i2;
        }
        if (i4 == -2) {
            SerializableString serializableString = this._currentEscape;
            if (serializableString == null) {
                value = this._characterEscapes.getEscapeSequence(c2).getValue();
            } else {
                value = serializableString.getValue();
                this._currentEscape = null;
            }
            int length = value.length();
            if (i2 >= length && i2 < i3) {
                int i7 = i2 - length;
                value.getChars(0, length, cArr, i7);
                return i7;
            }
            this._writer.write(value);
            return i2;
        }
        if (i2 > 5 && i2 < i3) {
            int i8 = i2 - 6;
            int i9 = i8 + 1;
            cArr[i8] = '\\';
            int i10 = i9 + 1;
            cArr[i9] = 'u';
            if (c2 > 255) {
                int i11 = (c2 >> '\b') & KotlinVersion.MAX_COMPONENT_VALUE;
                int i12 = i10 + 1;
                char[] cArr3 = HEX_CHARS;
                cArr[i10] = cArr3[i11 >> 4];
                i5 = i12 + 1;
                cArr[i12] = cArr3[i11 & 15];
                c2 = (char) (c2 & 255);
            } else {
                int i13 = i10 + 1;
                cArr[i10] = '0';
                i5 = i13 + 1;
                cArr[i13] = '0';
            }
            int i14 = i5 + 1;
            char[] cArr4 = HEX_CHARS;
            cArr[i5] = cArr4[c2 >> 4];
            cArr[i14] = cArr4[c2 & 15];
            return i14 - 5;
        }
        char[] cArr5 = this._entityBuffer;
        if (cArr5 == null) {
            cArr5 = _allocateEntityBuffer();
        }
        this._outputHead = this._outputTail;
        if (c2 > 255) {
            int i15 = (c2 >> '\b') & KotlinVersion.MAX_COMPONENT_VALUE;
            int i16 = c2 & 255;
            char[] cArr6 = HEX_CHARS;
            cArr5[10] = cArr6[i15 >> 4];
            cArr5[11] = cArr6[i15 & 15];
            cArr5[12] = cArr6[i16 >> 4];
            cArr5[13] = cArr6[i16 & 15];
            this._writer.write(cArr5, 8, 6);
            return i2;
        }
        char[] cArr7 = HEX_CHARS;
        cArr5[6] = cArr7[c2 >> 4];
        cArr5[7] = cArr7[c2 & 15];
        this._writer.write(cArr5, 2, 6);
        return i2;
    }
}
