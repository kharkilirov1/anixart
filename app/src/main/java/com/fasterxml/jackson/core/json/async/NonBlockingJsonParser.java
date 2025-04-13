package com.fasterxml.jackson.core.json.async;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.async.ByteArrayFeeder;
import com.fasterxml.jackson.core.base.ParserBase;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.fasterxml.jackson.core.p006io.CharTypes;
import com.fasterxml.jackson.core.p006io.IOContext;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.util.TextBuffer;
import com.fasterxml.jackson.core.util.VersionUtil;
import com.yandex.mobile.ads.C4632R;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.KotlinVersion;
import p000a.C0000a;

/* loaded from: classes.dex */
public class NonBlockingJsonParser extends NonBlockingJsonParserBase implements ByteArrayFeeder {
    public byte[] _inputBuffer;
    public int _origBufferLen;
    private static final int FEAT_MASK_TRAILING_COMMA = JsonParser.Feature.ALLOW_TRAILING_COMMA.getMask();
    private static final int FEAT_MASK_LEADING_ZEROS = JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS.getMask();
    private static final int FEAT_MASK_ALLOW_MISSING = JsonParser.Feature.ALLOW_MISSING_VALUES.getMask();
    private static final int FEAT_MASK_ALLOW_SINGLE_QUOTES = JsonParser.Feature.ALLOW_SINGLE_QUOTES.getMask();
    private static final int FEAT_MASK_ALLOW_UNQUOTED_NAMES = JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES.getMask();
    private static final int FEAT_MASK_ALLOW_JAVA_COMMENTS = JsonParser.Feature.ALLOW_COMMENTS.getMask();
    private static final int FEAT_MASK_ALLOW_YAML_COMMENTS = JsonParser.Feature.ALLOW_YAML_COMMENTS.getMask();
    private static final int[] _icUTF8 = CharTypes.getInputCodeUtf8();
    public static final int[] _icLatin1 = CharTypes.getInputCodeLatin1();

    public NonBlockingJsonParser(IOContext iOContext, int i2, ByteQuadsCanonicalizer byteQuadsCanonicalizer) {
        super(iOContext, i2, byteQuadsCanonicalizer);
        this._inputBuffer = ParserMinimalBase.NO_BYTES;
    }

    private final int _decodeCharEscape() throws IOException {
        return this._inputEnd - this._inputPtr < 5 ? _decodeSplitEscaped(0, -1) : _decodeFastCharEscape();
    }

    private final int _decodeFastCharEscape() throws IOException {
        byte[] bArr = this._inputBuffer;
        int i2 = this._inputPtr;
        int i3 = i2 + 1;
        this._inputPtr = i3;
        byte b = bArr[i2];
        if (b == 34 || b == 47 || b == 92) {
            return (char) b;
        }
        if (b == 98) {
            return 8;
        }
        if (b == 102) {
            return 12;
        }
        if (b == 110) {
            return 10;
        }
        if (b == 114) {
            return 13;
        }
        if (b == 116) {
            return 9;
        }
        if (b != 117) {
            return _handleUnrecognizedCharacterEscape((char) b);
        }
        this._inputPtr = i3 + 1;
        byte b2 = bArr[i3];
        int charToHex = CharTypes.charToHex(b2);
        if (charToHex >= 0) {
            byte[] bArr2 = this._inputBuffer;
            int i4 = this._inputPtr;
            this._inputPtr = i4 + 1;
            b2 = bArr2[i4];
            int charToHex2 = CharTypes.charToHex(b2);
            if (charToHex2 >= 0) {
                int i5 = (charToHex << 4) | charToHex2;
                byte[] bArr3 = this._inputBuffer;
                int i6 = this._inputPtr;
                this._inputPtr = i6 + 1;
                byte b3 = bArr3[i6];
                int charToHex3 = CharTypes.charToHex(b3);
                if (charToHex3 >= 0) {
                    int i7 = (i5 << 4) | charToHex3;
                    byte[] bArr4 = this._inputBuffer;
                    int i8 = this._inputPtr;
                    this._inputPtr = i8 + 1;
                    b3 = bArr4[i8];
                    int charToHex4 = CharTypes.charToHex(b3);
                    if (charToHex4 >= 0) {
                        return (i7 << 4) | charToHex4;
                    }
                }
                b2 = b3;
            }
        }
        _reportUnexpectedChar(b2 & 255, "expected a hex-digit for character escape sequence");
        return -1;
    }

    private int _decodeSplitEscaped(int i2, int i3) throws IOException {
        int i4 = this._inputPtr;
        int i5 = this._inputEnd;
        if (i4 >= i5) {
            this._quoted32 = i2;
            this._quotedDigits = i3;
            return -1;
        }
        byte[] bArr = this._inputBuffer;
        int i6 = i4 + 1;
        this._inputPtr = i6;
        byte b = bArr[i4];
        if (i3 == -1) {
            if (b == 34 || b == 47 || b == 92) {
                return b;
            }
            if (b == 98) {
                return 8;
            }
            if (b == 102) {
                return 12;
            }
            if (b == 110) {
                return 10;
            }
            if (b == 114) {
                return 13;
            }
            if (b == 116) {
                return 9;
            }
            if (b != 117) {
                return _handleUnrecognizedCharacterEscape((char) b);
            }
            if (i6 >= i5) {
                this._quotedDigits = 0;
                this._quoted32 = 0;
                return -1;
            }
            this._inputPtr = i6 + 1;
            b = bArr[i6];
            i3 = 0;
        }
        while (true) {
            int i7 = b & 255;
            int charToHex = CharTypes.charToHex(i7);
            if (charToHex < 0) {
                _reportUnexpectedChar(i7 & KotlinVersion.MAX_COMPONENT_VALUE, "expected a hex-digit for character escape sequence");
            }
            i2 = (i2 << 4) | charToHex;
            i3++;
            if (i3 == 4) {
                return i2;
            }
            int i8 = this._inputPtr;
            if (i8 >= this._inputEnd) {
                this._quotedDigits = i3;
                this._quoted32 = i2;
                return -1;
            }
            byte[] bArr2 = this._inputBuffer;
            this._inputPtr = i8 + 1;
            b = bArr2[i8];
        }
    }

    private final boolean _decodeSplitMultiByte(int i2, int i3, boolean z) throws IOException {
        if (i3 == 1) {
            int _decodeSplitEscaped = _decodeSplitEscaped(0, -1);
            if (_decodeSplitEscaped < 0) {
                this._minorState = 41;
                return false;
            }
            this._textBuffer.append((char) _decodeSplitEscaped);
            return true;
        }
        if (i3 == 2) {
            if (!z) {
                this._minorState = 42;
                this._pending32 = i2;
                return false;
            }
            byte[] bArr = this._inputBuffer;
            int i4 = this._inputPtr;
            this._inputPtr = i4 + 1;
            this._textBuffer.append((char) _decodeUTF8_2(i2, bArr[i4]));
            return true;
        }
        if (i3 == 3) {
            int i5 = i2 & 15;
            if (z) {
                byte[] bArr2 = this._inputBuffer;
                int i6 = this._inputPtr;
                this._inputPtr = i6 + 1;
                return _decodeSplitUTF8_3(i5, 1, bArr2[i6]);
            }
            this._minorState = 43;
            this._pending32 = i5;
            this._pendingBytes = 1;
            return false;
        }
        if (i3 != 4) {
            if (i2 < 32) {
                _throwUnquotedSpace(i2, "string value");
            } else {
                _reportInvalidChar(i2);
            }
            this._textBuffer.append((char) i2);
            return true;
        }
        int i7 = i2 & 7;
        if (z) {
            byte[] bArr3 = this._inputBuffer;
            int i8 = this._inputPtr;
            this._inputPtr = i8 + 1;
            return _decodeSplitUTF8_4(i7, 1, bArr3[i8]);
        }
        this._pending32 = i7;
        this._pendingBytes = 1;
        this._minorState = 44;
        return false;
    }

    private final boolean _decodeSplitUTF8_3(int i2, int i3, int i4) throws IOException {
        if (i3 == 1) {
            if ((i4 & 192) != 128) {
                _reportInvalidOther(i4 & KotlinVersion.MAX_COMPONENT_VALUE, this._inputPtr);
            }
            i2 = (i2 << 6) | (i4 & 63);
            int i5 = this._inputPtr;
            if (i5 >= this._inputEnd) {
                this._minorState = 43;
                this._pending32 = i2;
                this._pendingBytes = 2;
                return false;
            }
            byte[] bArr = this._inputBuffer;
            this._inputPtr = i5 + 1;
            i4 = bArr[i5];
        }
        if ((i4 & 192) != 128) {
            _reportInvalidOther(i4 & KotlinVersion.MAX_COMPONENT_VALUE, this._inputPtr);
        }
        this._textBuffer.append((char) ((i2 << 6) | (i4 & 63)));
        return true;
    }

    private final boolean _decodeSplitUTF8_4(int i2, int i3, int i4) throws IOException {
        if (i3 == 1) {
            if ((i4 & 192) != 128) {
                _reportInvalidOther(i4 & KotlinVersion.MAX_COMPONENT_VALUE, this._inputPtr);
            }
            i2 = (i2 << 6) | (i4 & 63);
            int i5 = this._inputPtr;
            if (i5 >= this._inputEnd) {
                this._minorState = 44;
                this._pending32 = i2;
                this._pendingBytes = 2;
                return false;
            }
            byte[] bArr = this._inputBuffer;
            this._inputPtr = i5 + 1;
            i4 = bArr[i5];
            i3 = 2;
        }
        if (i3 == 2) {
            if ((i4 & 192) != 128) {
                _reportInvalidOther(i4 & KotlinVersion.MAX_COMPONENT_VALUE, this._inputPtr);
            }
            i2 = (i2 << 6) | (i4 & 63);
            int i6 = this._inputPtr;
            if (i6 >= this._inputEnd) {
                this._minorState = 44;
                this._pending32 = i2;
                this._pendingBytes = 3;
                return false;
            }
            byte[] bArr2 = this._inputBuffer;
            this._inputPtr = i6 + 1;
            i4 = bArr2[i6];
        }
        if ((i4 & 192) != 128) {
            _reportInvalidOther(i4 & KotlinVersion.MAX_COMPONENT_VALUE, this._inputPtr);
        }
        int i7 = ((i2 << 6) | (i4 & 63)) - TextBuffer.MAX_SEGMENT_LEN;
        this._textBuffer.append((char) (55296 | (i7 >> 10)));
        this._textBuffer.append((char) ((i7 & 1023) | 56320));
        return true;
    }

    private final int _decodeUTF8_2(int i2, int i3) throws IOException {
        if ((i3 & 192) != 128) {
            _reportInvalidOther(i3 & KotlinVersion.MAX_COMPONENT_VALUE, this._inputPtr);
        }
        return ((i2 & 31) << 6) | (i3 & 63);
    }

    private final int _decodeUTF8_3(int i2, int i3, int i4) throws IOException {
        int i5 = i2 & 15;
        if ((i3 & 192) != 128) {
            _reportInvalidOther(i3 & KotlinVersion.MAX_COMPONENT_VALUE, this._inputPtr);
        }
        int i6 = (i5 << 6) | (i3 & 63);
        if ((i4 & 192) != 128) {
            _reportInvalidOther(i4 & KotlinVersion.MAX_COMPONENT_VALUE, this._inputPtr);
        }
        return (i6 << 6) | (i4 & 63);
    }

    private final int _decodeUTF8_4(int i2, int i3, int i4, int i5) throws IOException {
        if ((i3 & 192) != 128) {
            _reportInvalidOther(i3 & KotlinVersion.MAX_COMPONENT_VALUE, this._inputPtr);
        }
        int i6 = ((i2 & 7) << 6) | (i3 & 63);
        if ((i4 & 192) != 128) {
            _reportInvalidOther(i4 & KotlinVersion.MAX_COMPONENT_VALUE, this._inputPtr);
        }
        int i7 = (i6 << 6) | (i4 & 63);
        if ((i5 & 192) != 128) {
            _reportInvalidOther(i5 & KotlinVersion.MAX_COMPONENT_VALUE, this._inputPtr);
        }
        return ((i7 << 6) | (i5 & 63)) - TextBuffer.MAX_SEGMENT_LEN;
    }

    private final String _fastParseName() throws IOException {
        byte[] bArr = this._inputBuffer;
        int[] iArr = _icLatin1;
        int i2 = this._inputPtr;
        int i3 = i2 + 1;
        int i4 = bArr[i2] & 255;
        if (iArr[i4] != 0) {
            if (i4 != 34) {
                return null;
            }
            this._inputPtr = i3;
            return "";
        }
        int i5 = i3 + 1;
        int i6 = bArr[i3] & 255;
        if (iArr[i6] != 0) {
            if (i6 != 34) {
                return null;
            }
            this._inputPtr = i5;
            return _findName(i4, 1);
        }
        int i7 = (i4 << 8) | i6;
        int i8 = i5 + 1;
        int i9 = bArr[i5] & 255;
        if (iArr[i9] != 0) {
            if (i9 != 34) {
                return null;
            }
            this._inputPtr = i8;
            return _findName(i7, 2);
        }
        int i10 = (i7 << 8) | i9;
        int i11 = i8 + 1;
        int i12 = bArr[i8] & 255;
        if (iArr[i12] != 0) {
            if (i12 != 34) {
                return null;
            }
            this._inputPtr = i11;
            return _findName(i10, 3);
        }
        int i13 = (i10 << 8) | i12;
        int i14 = i11 + 1;
        int i15 = bArr[i11] & 255;
        if (iArr[i15] == 0) {
            this._quad1 = i13;
            return _parseMediumName(i14, i15);
        }
        if (i15 != 34) {
            return null;
        }
        this._inputPtr = i14;
        return _findName(i13, 4);
    }

    private JsonToken _finishAposName(int i2, int i3, int i4) throws IOException {
        int[] iArr = this._quadBuffer;
        int[] iArr2 = _icLatin1;
        while (true) {
            int i5 = this._inputPtr;
            if (i5 >= this._inputEnd) {
                this._quadLength = i2;
                this._pending32 = i3;
                this._pendingBytes = i4;
                this._minorState = 9;
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this._currToken = jsonToken;
                return jsonToken;
            }
            byte[] bArr = this._inputBuffer;
            this._inputPtr = i5 + 1;
            int i6 = bArr[i5] & 255;
            if (i6 == 39) {
                if (i4 > 0) {
                    if (i2 >= iArr.length) {
                        iArr = ParserBase.growArrayBy(iArr, iArr.length);
                        this._quadBuffer = iArr;
                    }
                    iArr[i2] = NonBlockingJsonParserBase._padLastQuad(i3, i4);
                    i2++;
                } else if (i2 == 0) {
                    return _fieldComplete("");
                }
                String findName = this._symbols.findName(iArr, i2);
                if (findName == null) {
                    findName = _addName(iArr, i2, i4);
                }
                return _fieldComplete(findName);
            }
            if (i6 != 34 && iArr2[i6] != 0) {
                if (i6 != 92) {
                    _throwUnquotedSpace(i6, "name");
                } else {
                    i6 = _decodeCharEscape();
                    if (i6 < 0) {
                        this._minorState = 8;
                        this._minorStateAfterSplit = 9;
                        this._quadLength = i2;
                        this._pending32 = i3;
                        this._pendingBytes = i4;
                        JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
                        this._currToken = jsonToken2;
                        return jsonToken2;
                    }
                }
                if (i6 > 127) {
                    int i7 = 0;
                    if (i4 >= 4) {
                        if (i2 >= iArr.length) {
                            int[] growArrayBy = ParserBase.growArrayBy(iArr, iArr.length);
                            this._quadBuffer = growArrayBy;
                            iArr = growArrayBy;
                        }
                        iArr[i2] = i3;
                        i2++;
                        i3 = 0;
                        i4 = 0;
                    }
                    if (i6 < 2048) {
                        i3 = (i3 << 8) | (i6 >> 6) | 192;
                        i4++;
                    } else {
                        int i8 = (i3 << 8) | (i6 >> 12) | 224;
                        int i9 = i4 + 1;
                        if (i9 >= 4) {
                            if (i2 >= iArr.length) {
                                int[] growArrayBy2 = ParserBase.growArrayBy(iArr, iArr.length);
                                this._quadBuffer = growArrayBy2;
                                iArr = growArrayBy2;
                            }
                            iArr[i2] = i8;
                            i2++;
                            i9 = 0;
                        } else {
                            i7 = i8;
                        }
                        i3 = (i7 << 8) | ((i6 >> 6) & 63) | 128;
                        i4 = i9 + 1;
                    }
                    i6 = (i6 & 63) | 128;
                }
            }
            if (i4 < 4) {
                i4++;
                i3 = (i3 << 8) | i6;
            } else {
                if (i2 >= iArr.length) {
                    iArr = ParserBase.growArrayBy(iArr, iArr.length);
                    this._quadBuffer = iArr;
                }
                iArr[i2] = i3;
                i2++;
                i3 = i6;
                i4 = 1;
            }
        }
    }

    private final JsonToken _finishAposString() throws IOException {
        int i2;
        int[] iArr = _icUTF8;
        byte[] bArr = this._inputBuffer;
        char[] bufferWithoutReset = this._textBuffer.getBufferWithoutReset();
        int currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
        int i3 = this._inputPtr;
        int i4 = this._inputEnd - 5;
        while (i3 < this._inputEnd) {
            int i5 = 0;
            if (currentSegmentSize >= bufferWithoutReset.length) {
                bufferWithoutReset = this._textBuffer.finishCurrentSegment();
                currentSegmentSize = 0;
            }
            int min = Math.min(this._inputEnd, (bufferWithoutReset.length - currentSegmentSize) + i3);
            while (true) {
                if (i3 < min) {
                    int i6 = i3 + 1;
                    int i7 = bArr[i3] & 255;
                    if (iArr[i7] == 0 || i7 == 34) {
                        if (i7 == 39) {
                            this._inputPtr = i6;
                            this._textBuffer.setCurrentLength(currentSegmentSize);
                            return _valueComplete(JsonToken.VALUE_STRING);
                        }
                        bufferWithoutReset[currentSegmentSize] = (char) i7;
                        i3 = i6;
                        currentSegmentSize++;
                    } else if (i6 >= i4) {
                        this._inputPtr = i6;
                        this._textBuffer.setCurrentLength(currentSegmentSize);
                        if (!_decodeSplitMultiByte(i7, iArr[i7], i6 < this._inputEnd)) {
                            this._minorStateAfterSplit = 45;
                            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                            this._currToken = jsonToken;
                            return jsonToken;
                        }
                        bufferWithoutReset = this._textBuffer.getBufferWithoutReset();
                        currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
                        i3 = this._inputPtr;
                    } else {
                        int i8 = iArr[i7];
                        if (i8 == 1) {
                            this._inputPtr = i6;
                            i7 = _decodeFastCharEscape();
                            i2 = this._inputPtr;
                        } else if (i8 == 2) {
                            i7 = _decodeUTF8_2(i7, this._inputBuffer[i6]);
                            i2 = i6 + 1;
                        } else if (i8 == 3) {
                            byte[] bArr2 = this._inputBuffer;
                            int i9 = i6 + 1;
                            i7 = _decodeUTF8_3(i7, bArr2[i6], bArr2[i9]);
                            i2 = i9 + 1;
                        } else if (i8 != 4) {
                            if (i7 < 32) {
                                _throwUnquotedSpace(i7, "string value");
                            } else {
                                _reportInvalidChar(i7);
                            }
                            i2 = i6;
                        } else {
                            byte[] bArr3 = this._inputBuffer;
                            int i10 = i6 + 1;
                            int i11 = i10 + 1;
                            int i12 = i11 + 1;
                            int _decodeUTF8_4 = _decodeUTF8_4(i7, bArr3[i6], bArr3[i10], bArr3[i11]);
                            int i13 = currentSegmentSize + 1;
                            bufferWithoutReset[currentSegmentSize] = (char) (55296 | (_decodeUTF8_4 >> 10));
                            if (i13 >= bufferWithoutReset.length) {
                                bufferWithoutReset = this._textBuffer.finishCurrentSegment();
                                currentSegmentSize = 0;
                            } else {
                                currentSegmentSize = i13;
                            }
                            i7 = (_decodeUTF8_4 & 1023) | 56320;
                            i2 = i12;
                        }
                        if (currentSegmentSize >= bufferWithoutReset.length) {
                            bufferWithoutReset = this._textBuffer.finishCurrentSegment();
                        } else {
                            i5 = currentSegmentSize;
                        }
                        currentSegmentSize = i5 + 1;
                        bufferWithoutReset[i5] = (char) i7;
                        i3 = i2;
                    }
                }
            }
        }
        this._inputPtr = i3;
        this._minorState = 45;
        this._textBuffer.setCurrentLength(currentSegmentSize);
        JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
        this._currToken = jsonToken2;
        return jsonToken2;
    }

    private final JsonToken _finishBOM(int i2) throws IOException {
        while (true) {
            int i3 = this._inputPtr;
            if (i3 >= this._inputEnd) {
                this._pending32 = i2;
                this._minorState = 1;
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this._currToken = jsonToken;
                return jsonToken;
            }
            byte[] bArr = this._inputBuffer;
            this._inputPtr = i3 + 1;
            int i4 = bArr[i3] & 255;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        this._currInputProcessed -= 3;
                        return _startDocument(i4);
                    }
                } else if (i4 != 191) {
                    _reportError("Unexpected byte 0x%02x following 0xEF 0xBB; should get 0xBF as third byte of UTF-8 BOM", Integer.valueOf(i4));
                }
            } else if (i4 != 187) {
                _reportError("Unexpected byte 0x%02x following 0xEF; should get 0xBB as second byte UTF-8 BOM", Integer.valueOf(i4));
            }
            i2++;
        }
    }

    private final JsonToken _finishCComment(int i2, boolean z) throws IOException {
        while (true) {
            int i3 = this._inputPtr;
            if (i3 >= this._inputEnd) {
                this._minorState = z ? 52 : 53;
                this._pending32 = i2;
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this._currToken = jsonToken;
                return jsonToken;
            }
            byte[] bArr = this._inputBuffer;
            int i4 = i3 + 1;
            this._inputPtr = i4;
            int i5 = bArr[i3] & 255;
            if (i5 < 32) {
                if (i5 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = i4;
                } else if (i5 == 13) {
                    this._currInputRowAlt++;
                    this._currInputRowStart = i4;
                } else if (i5 != 9) {
                    _throwInvalidSpace(i5);
                }
            } else if (i5 == 42) {
                z = true;
            } else if (i5 == 47 && z) {
                return _startAfterComment(i2);
            }
            z = false;
        }
    }

    private final JsonToken _finishCppComment(int i2) throws IOException {
        while (true) {
            int i3 = this._inputPtr;
            if (i3 >= this._inputEnd) {
                this._minorState = 54;
                this._pending32 = i2;
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this._currToken = jsonToken;
                return jsonToken;
            }
            byte[] bArr = this._inputBuffer;
            int i4 = i3 + 1;
            this._inputPtr = i4;
            int i5 = bArr[i3] & 255;
            if (i5 < 32) {
                if (i5 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = i4;
                    break;
                }
                if (i5 == 13) {
                    this._currInputRowAlt++;
                    this._currInputRowStart = i4;
                    break;
                }
                if (i5 != 9) {
                    _throwInvalidSpace(i5);
                }
            }
        }
        return _startAfterComment(i2);
    }

    private final JsonToken _finishHashComment(int i2) throws IOException {
        if ((this._features & FEAT_MASK_ALLOW_YAML_COMMENTS) == 0) {
            _reportUnexpectedChar(35, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_YAML_COMMENTS' not enabled for parser)");
        }
        while (true) {
            int i3 = this._inputPtr;
            if (i3 >= this._inputEnd) {
                this._minorState = 55;
                this._pending32 = i2;
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this._currToken = jsonToken;
                return jsonToken;
            }
            byte[] bArr = this._inputBuffer;
            int i4 = i3 + 1;
            this._inputPtr = i4;
            int i5 = bArr[i3] & 255;
            if (i5 < 32) {
                if (i5 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = i4;
                    break;
                }
                if (i5 == 13) {
                    this._currInputRowAlt++;
                    this._currInputRowStart = i4;
                    break;
                }
                if (i5 != 9) {
                    _throwInvalidSpace(i5);
                }
            }
        }
        return _startAfterComment(i2);
    }

    private final JsonToken _finishRegularString() throws IOException {
        int i2;
        int[] iArr = _icUTF8;
        byte[] bArr = this._inputBuffer;
        char[] bufferWithoutReset = this._textBuffer.getBufferWithoutReset();
        int currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
        int i3 = this._inputPtr;
        int i4 = this._inputEnd - 5;
        while (i3 < this._inputEnd) {
            int i5 = 0;
            if (currentSegmentSize >= bufferWithoutReset.length) {
                bufferWithoutReset = this._textBuffer.finishCurrentSegment();
                currentSegmentSize = 0;
            }
            int min = Math.min(this._inputEnd, (bufferWithoutReset.length - currentSegmentSize) + i3);
            while (true) {
                if (i3 < min) {
                    int i6 = i3 + 1;
                    int i7 = bArr[i3] & 255;
                    if (iArr[i7] == 0) {
                        bufferWithoutReset[currentSegmentSize] = (char) i7;
                        i3 = i6;
                        currentSegmentSize++;
                    } else {
                        if (i7 == 34) {
                            this._inputPtr = i6;
                            this._textBuffer.setCurrentLength(currentSegmentSize);
                            return _valueComplete(JsonToken.VALUE_STRING);
                        }
                        if (i6 >= i4) {
                            this._inputPtr = i6;
                            this._textBuffer.setCurrentLength(currentSegmentSize);
                            if (!_decodeSplitMultiByte(i7, iArr[i7], i6 < this._inputEnd)) {
                                this._minorStateAfterSplit = 40;
                                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                                this._currToken = jsonToken;
                                return jsonToken;
                            }
                            bufferWithoutReset = this._textBuffer.getBufferWithoutReset();
                            currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
                            i3 = this._inputPtr;
                        } else {
                            int i8 = iArr[i7];
                            if (i8 == 1) {
                                this._inputPtr = i6;
                                i7 = _decodeFastCharEscape();
                                i2 = this._inputPtr;
                            } else if (i8 == 2) {
                                i7 = _decodeUTF8_2(i7, this._inputBuffer[i6]);
                                i2 = i6 + 1;
                            } else if (i8 == 3) {
                                byte[] bArr2 = this._inputBuffer;
                                int i9 = i6 + 1;
                                i7 = _decodeUTF8_3(i7, bArr2[i6], bArr2[i9]);
                                i2 = i9 + 1;
                            } else if (i8 != 4) {
                                if (i7 < 32) {
                                    _throwUnquotedSpace(i7, "string value");
                                } else {
                                    _reportInvalidChar(i7);
                                }
                                i2 = i6;
                            } else {
                                byte[] bArr3 = this._inputBuffer;
                                int i10 = i6 + 1;
                                int i11 = i10 + 1;
                                int i12 = i11 + 1;
                                int _decodeUTF8_4 = _decodeUTF8_4(i7, bArr3[i6], bArr3[i10], bArr3[i11]);
                                int i13 = currentSegmentSize + 1;
                                bufferWithoutReset[currentSegmentSize] = (char) (55296 | (_decodeUTF8_4 >> 10));
                                if (i13 >= bufferWithoutReset.length) {
                                    bufferWithoutReset = this._textBuffer.finishCurrentSegment();
                                    currentSegmentSize = 0;
                                } else {
                                    currentSegmentSize = i13;
                                }
                                i7 = (_decodeUTF8_4 & 1023) | 56320;
                                i2 = i12;
                            }
                            if (currentSegmentSize >= bufferWithoutReset.length) {
                                bufferWithoutReset = this._textBuffer.finishCurrentSegment();
                            } else {
                                i5 = currentSegmentSize;
                            }
                            currentSegmentSize = i5 + 1;
                            bufferWithoutReset[i5] = (char) i7;
                            i3 = i2;
                        }
                    }
                }
            }
        }
        this._inputPtr = i3;
        this._minorState = 40;
        this._textBuffer.setCurrentLength(currentSegmentSize);
        JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
        this._currToken = jsonToken2;
        return jsonToken2;
    }

    private JsonToken _finishUnquotedName(int i2, int i3, int i4) throws IOException {
        int[] iArr = this._quadBuffer;
        int[] inputCodeUtf8JsNames = CharTypes.getInputCodeUtf8JsNames();
        while (true) {
            int i5 = this._inputPtr;
            if (i5 >= this._inputEnd) {
                this._quadLength = i2;
                this._pending32 = i3;
                this._pendingBytes = i4;
                this._minorState = 10;
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this._currToken = jsonToken;
                return jsonToken;
            }
            int i6 = this._inputBuffer[i5] & 255;
            if (inputCodeUtf8JsNames[i6] != 0) {
                if (i4 > 0) {
                    if (i2 >= iArr.length) {
                        iArr = ParserBase.growArrayBy(iArr, iArr.length);
                        this._quadBuffer = iArr;
                    }
                    iArr[i2] = i3;
                    i2++;
                }
                String findName = this._symbols.findName(iArr, i2);
                if (findName == null) {
                    findName = _addName(iArr, i2, i4);
                }
                return _fieldComplete(findName);
            }
            this._inputPtr = i5 + 1;
            if (i4 < 4) {
                i4++;
                i3 = (i3 << 8) | i6;
            } else {
                if (i2 >= iArr.length) {
                    iArr = ParserBase.growArrayBy(iArr, iArr.length);
                    this._quadBuffer = iArr;
                }
                iArr[i2] = i3;
                i2++;
                i3 = i6;
                i4 = 1;
            }
        }
    }

    private JsonToken _handleOddName(int i2) throws IOException {
        if (i2 != 35) {
            if (i2 != 39) {
                if (i2 == 47) {
                    return _startSlashComment(4);
                }
                if (i2 == 93) {
                    return _closeArrayScope();
                }
            } else if ((this._features & FEAT_MASK_ALLOW_SINGLE_QUOTES) != 0) {
                return _finishAposName(0, 0, 0);
            }
        } else if ((this._features & FEAT_MASK_ALLOW_YAML_COMMENTS) != 0) {
            return _finishHashComment(4);
        }
        if ((this._features & FEAT_MASK_ALLOW_UNQUOTED_NAMES) == 0) {
            _reportUnexpectedChar((char) i2, "was expecting double-quote to start field name");
        }
        if (CharTypes.getInputCodeUtf8JsNames()[i2] != 0) {
            _reportUnexpectedChar(i2, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        return _finishUnquotedName(0, i2, 1);
    }

    private final JsonToken _parseEscapedName(int i2, int i3, int i4) throws IOException {
        int i5;
        int[] iArr = this._quadBuffer;
        int[] iArr2 = _icLatin1;
        while (true) {
            int i6 = this._inputPtr;
            if (i6 >= this._inputEnd) {
                this._quadLength = i2;
                this._pending32 = i3;
                this._pendingBytes = i4;
                this._minorState = 7;
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this._currToken = jsonToken;
                return jsonToken;
            }
            byte[] bArr = this._inputBuffer;
            this._inputPtr = i6 + 1;
            int i7 = bArr[i6] & 255;
            if (iArr2[i7] == 0) {
                if (i4 < 4) {
                    i4++;
                    i3 = (i3 << 8) | i7;
                } else {
                    if (i2 >= iArr.length) {
                        int[] growArrayBy = ParserBase.growArrayBy(iArr, iArr.length);
                        this._quadBuffer = growArrayBy;
                        iArr = growArrayBy;
                    }
                    i5 = i2 + 1;
                    iArr[i2] = i3;
                    i2 = i5;
                    i3 = i7;
                    i4 = 1;
                }
            } else {
                if (i7 == 34) {
                    if (i4 > 0) {
                        if (i2 >= iArr.length) {
                            iArr = ParserBase.growArrayBy(iArr, iArr.length);
                            this._quadBuffer = iArr;
                        }
                        iArr[i2] = NonBlockingJsonParserBase._padLastQuad(i3, i4);
                        i2++;
                    } else if (i2 == 0) {
                        return _fieldComplete("");
                    }
                    String findName = this._symbols.findName(iArr, i2);
                    if (findName == null) {
                        findName = _addName(iArr, i2, i4);
                    }
                    return _fieldComplete(findName);
                }
                if (i7 != 92) {
                    _throwUnquotedSpace(i7, "name");
                } else {
                    i7 = _decodeCharEscape();
                    if (i7 < 0) {
                        this._minorState = 8;
                        this._minorStateAfterSplit = 7;
                        this._quadLength = i2;
                        this._pending32 = i3;
                        this._pendingBytes = i4;
                        JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
                        this._currToken = jsonToken2;
                        return jsonToken2;
                    }
                }
                if (i2 >= iArr.length) {
                    iArr = ParserBase.growArrayBy(iArr, iArr.length);
                    this._quadBuffer = iArr;
                }
                if (i7 > 127) {
                    int i8 = 0;
                    if (i4 >= 4) {
                        iArr[i2] = i3;
                        i2++;
                        i3 = 0;
                        i4 = 0;
                    }
                    if (i7 < 2048) {
                        i3 = (i3 << 8) | (i7 >> 6) | 192;
                        i4++;
                    } else {
                        int i9 = (i3 << 8) | (i7 >> 12) | 224;
                        int i10 = i4 + 1;
                        if (i10 >= 4) {
                            iArr[i2] = i9;
                            i2++;
                            i10 = 0;
                        } else {
                            i8 = i9;
                        }
                        i3 = (i8 << 8) | ((i7 >> 6) & 63) | 128;
                        i4 = i10 + 1;
                    }
                    i7 = (i7 & 63) | 128;
                }
                if (i4 < 4) {
                    i4++;
                    i3 = (i3 << 8) | i7;
                } else {
                    i5 = i2 + 1;
                    iArr[i2] = i3;
                    i2 = i5;
                    i3 = i7;
                    i4 = 1;
                }
            }
        }
    }

    private final String _parseMediumName(int i2, int i3) throws IOException {
        byte[] bArr = this._inputBuffer;
        int[] iArr = _icLatin1;
        int i4 = i2 + 1;
        int i5 = bArr[i2] & 255;
        if (iArr[i5] != 0) {
            if (i5 != 34) {
                return null;
            }
            this._inputPtr = i4;
            return _findName(this._quad1, i3, 1);
        }
        int i6 = i5 | (i3 << 8);
        int i7 = i4 + 1;
        int i8 = bArr[i4] & 255;
        if (iArr[i8] != 0) {
            if (i8 != 34) {
                return null;
            }
            this._inputPtr = i7;
            return _findName(this._quad1, i6, 2);
        }
        int i9 = (i6 << 8) | i8;
        int i10 = i7 + 1;
        int i11 = bArr[i7] & 255;
        if (iArr[i11] != 0) {
            if (i11 != 34) {
                return null;
            }
            this._inputPtr = i10;
            return _findName(this._quad1, i9, 3);
        }
        int i12 = (i9 << 8) | i11;
        int i13 = i10 + 1;
        int i14 = bArr[i10] & 255;
        if (iArr[i14] == 0) {
            return _parseMediumName2(i13, i14, i12);
        }
        if (i14 != 34) {
            return null;
        }
        this._inputPtr = i13;
        return _findName(this._quad1, i12, 4);
    }

    private final String _parseMediumName2(int i2, int i3, int i4) throws IOException {
        byte[] bArr = this._inputBuffer;
        int[] iArr = _icLatin1;
        int i5 = i2 + 1;
        int i6 = bArr[i2] & 255;
        if (iArr[i6] != 0) {
            if (i6 != 34) {
                return null;
            }
            this._inputPtr = i5;
            return _findName(this._quad1, i4, i3, 1);
        }
        int i7 = i6 | (i3 << 8);
        int i8 = i5 + 1;
        int i9 = bArr[i5] & 255;
        if (iArr[i9] != 0) {
            if (i9 != 34) {
                return null;
            }
            this._inputPtr = i8;
            return _findName(this._quad1, i4, i7, 2);
        }
        int i10 = (i7 << 8) | i9;
        int i11 = i8 + 1;
        int i12 = bArr[i8] & 255;
        if (iArr[i12] != 0) {
            if (i12 != 34) {
                return null;
            }
            this._inputPtr = i11;
            return _findName(this._quad1, i4, i10, 3);
        }
        int i13 = (i10 << 8) | i12;
        int i14 = i11 + 1;
        if ((bArr[i11] & 255) != 34) {
            return null;
        }
        this._inputPtr = i14;
        return _findName(this._quad1, i4, i13, 4);
    }

    private final int _skipWS(int i2) throws IOException {
        do {
            if (i2 != 32) {
                if (i2 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = this._inputPtr;
                } else if (i2 == 13) {
                    this._currInputRowAlt++;
                    this._currInputRowStart = this._inputPtr;
                } else if (i2 != 9) {
                    _throwInvalidSpace(i2);
                }
            }
            int i3 = this._inputPtr;
            if (i3 >= this._inputEnd) {
                this._currToken = JsonToken.NOT_AVAILABLE;
                return 0;
            }
            byte[] bArr = this._inputBuffer;
            this._inputPtr = i3 + 1;
            i2 = bArr[i3] & 255;
        } while (i2 <= 32);
        return i2;
    }

    private final JsonToken _startAfterComment(int i2) throws IOException {
        int i3 = this._inputPtr;
        if (i3 >= this._inputEnd) {
            this._minorState = i2;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this._currToken = jsonToken;
            return jsonToken;
        }
        byte[] bArr = this._inputBuffer;
        this._inputPtr = i3 + 1;
        int i4 = bArr[i3] & 255;
        if (i2 == 4) {
            return _startFieldName(i4);
        }
        if (i2 == 5) {
            return _startFieldNameAfterComma(i4);
        }
        switch (i2) {
            case 12:
                return _startValue(i4);
            case 13:
                return _startValueExpectComma(i4);
            case 14:
                return _startValueExpectColon(i4);
            case 15:
                return _startValueAfterComma(i4);
            default:
                VersionUtil.throwInternal();
                return null;
        }
    }

    private final JsonToken _startDocument(int i2) throws IOException {
        int i3 = i2 & KotlinVersion.MAX_COMPONENT_VALUE;
        if (i3 == 239 && this._minorState != 1) {
            return _finishBOM(1);
        }
        while (i3 <= 32) {
            if (i3 != 32) {
                if (i3 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = this._inputPtr;
                } else if (i3 == 13) {
                    this._currInputRowAlt++;
                    this._currInputRowStart = this._inputPtr;
                } else if (i3 != 9) {
                    _throwInvalidSpace(i3);
                }
            }
            int i4 = this._inputPtr;
            if (i4 >= this._inputEnd) {
                this._minorState = 3;
                if (this._closed) {
                    return null;
                }
                return this._endOfInput ? _eofAsNextToken() : JsonToken.NOT_AVAILABLE;
            }
            byte[] bArr = this._inputBuffer;
            this._inputPtr = i4 + 1;
            i3 = bArr[i4] & 255;
        }
        return _startValue(i3);
    }

    private final JsonToken _startFieldName(int i2) throws IOException {
        String _fastParseName;
        if (i2 > 32 || (i2 = _skipWS(i2)) > 0) {
            _updateTokenLocation();
            return i2 != 34 ? i2 == 125 ? _closeObjectScope() : _handleOddName(i2) : (this._inputPtr + 13 > this._inputEnd || (_fastParseName = _fastParseName()) == null) ? _parseEscapedName(0, 0, 0) : _fieldComplete(_fastParseName);
        }
        this._minorState = 4;
        return this._currToken;
    }

    private final JsonToken _startFieldNameAfterComma(int i2) throws IOException {
        String _fastParseName;
        if (i2 <= 32 && (i2 = _skipWS(i2)) <= 0) {
            this._minorState = 5;
            return this._currToken;
        }
        if (i2 != 44) {
            if (i2 == 125) {
                return _closeObjectScope();
            }
            if (i2 == 35) {
                return _finishHashComment(5);
            }
            if (i2 == 47) {
                return _startSlashComment(5);
            }
            StringBuilder m24u = C0000a.m24u("was expecting comma to separate ");
            m24u.append(this._parsingContext.typeDesc());
            m24u.append(" entries");
            _reportUnexpectedChar(i2, m24u.toString());
        }
        int i3 = this._inputPtr;
        if (i3 >= this._inputEnd) {
            this._minorState = 4;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this._currToken = jsonToken;
            return jsonToken;
        }
        int i4 = this._inputBuffer[i3];
        this._inputPtr = i3 + 1;
        if (i4 > 32 || (i4 = _skipWS(i4)) > 0) {
            _updateTokenLocation();
            return i4 != 34 ? (i4 != 125 || (this._features & FEAT_MASK_TRAILING_COMMA) == 0) ? _handleOddName(i4) : _closeObjectScope() : (this._inputPtr + 13 > this._inputEnd || (_fastParseName = _fastParseName()) == null) ? _parseEscapedName(0, 0, 0) : _fieldComplete(_fastParseName);
        }
        this._minorState = 4;
        return this._currToken;
    }

    private final JsonToken _startSlashComment(int i2) throws IOException {
        if ((this._features & FEAT_MASK_ALLOW_JAVA_COMMENTS) == 0) {
            _reportUnexpectedChar(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        int i3 = this._inputPtr;
        if (i3 >= this._inputEnd) {
            this._pending32 = i2;
            this._minorState = 51;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this._currToken = jsonToken;
            return jsonToken;
        }
        byte[] bArr = this._inputBuffer;
        this._inputPtr = i3 + 1;
        byte b = bArr[i3];
        if (b == 42) {
            return _finishCComment(i2, false);
        }
        if (b == 47) {
            return _finishCppComment(i2);
        }
        _reportUnexpectedChar(b & 255, "was expecting either '*' or '/' for a comment");
        return null;
    }

    private final JsonToken _startValue(int i2) throws IOException {
        if (i2 <= 32 && (i2 = _skipWS(i2)) <= 0) {
            this._minorState = 12;
            return this._currToken;
        }
        _updateTokenLocation();
        this._parsingContext.expectComma();
        if (i2 == 34) {
            return _startString();
        }
        if (i2 == 35) {
            return _finishHashComment(12);
        }
        if (i2 == 45) {
            return _startNegativeNumber();
        }
        if (i2 == 91) {
            return _startArrayScope();
        }
        if (i2 == 93) {
            return _closeArrayScope();
        }
        if (i2 == 102) {
            return _startFalseToken();
        }
        if (i2 == 110) {
            return _startNullToken();
        }
        if (i2 == 116) {
            return _startTrueToken();
        }
        if (i2 == 123) {
            return _startObjectScope();
        }
        if (i2 == 125) {
            return _closeObjectScope();
        }
        switch (i2) {
            case 47:
                return _startSlashComment(12);
            case 48:
                return _startNumberLeadingZero();
            case C4632R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case C4632R.styleable.AppCompatTheme_colorError /* 56 */:
            case 57:
                return _startPositiveNumber(i2);
            default:
                return _startUnexpectedValue(false, i2);
        }
    }

    private final JsonToken _startValueAfterComma(int i2) throws IOException {
        if (i2 <= 32 && (i2 = _skipWS(i2)) <= 0) {
            this._minorState = 15;
            return this._currToken;
        }
        _updateTokenLocation();
        if (i2 == 34) {
            return _startString();
        }
        if (i2 == 35) {
            return _finishHashComment(15);
        }
        if (i2 == 45) {
            return _startNegativeNumber();
        }
        if (i2 == 91) {
            return _startArrayScope();
        }
        if (i2 != 93) {
            if (i2 == 102) {
                return _startFalseToken();
            }
            if (i2 == 110) {
                return _startNullToken();
            }
            if (i2 == 116) {
                return _startTrueToken();
            }
            if (i2 == 123) {
                return _startObjectScope();
            }
            if (i2 != 125) {
                switch (i2) {
                    case 47:
                        return _startSlashComment(15);
                    case 48:
                        return _startNumberLeadingZero();
                    case C4632R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case C4632R.styleable.AppCompatTheme_colorError /* 56 */:
                    case 57:
                        return _startPositiveNumber(i2);
                }
            }
            if ((this._features & FEAT_MASK_TRAILING_COMMA) != 0) {
                return _closeObjectScope();
            }
        } else if ((this._features & FEAT_MASK_TRAILING_COMMA) != 0) {
            return _closeArrayScope();
        }
        return _startUnexpectedValue(true, i2);
    }

    private final JsonToken _startValueExpectColon(int i2) throws IOException {
        if (i2 <= 32 && (i2 = _skipWS(i2)) <= 0) {
            this._minorState = 14;
            return this._currToken;
        }
        if (i2 != 58) {
            if (i2 == 47) {
                return _startSlashComment(14);
            }
            if (i2 == 35) {
                return _finishHashComment(14);
            }
            _reportUnexpectedChar(i2, "was expecting a colon to separate field name and value");
        }
        int i3 = this._inputPtr;
        if (i3 >= this._inputEnd) {
            this._minorState = 12;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this._currToken = jsonToken;
            return jsonToken;
        }
        int i4 = this._inputBuffer[i3];
        this._inputPtr = i3 + 1;
        if (i4 <= 32 && (i4 = _skipWS(i4)) <= 0) {
            this._minorState = 12;
            return this._currToken;
        }
        _updateTokenLocation();
        if (i4 == 34) {
            return _startString();
        }
        if (i4 == 35) {
            return _finishHashComment(12);
        }
        if (i4 == 45) {
            return _startNegativeNumber();
        }
        if (i4 == 91) {
            return _startArrayScope();
        }
        if (i4 == 102) {
            return _startFalseToken();
        }
        if (i4 == 110) {
            return _startNullToken();
        }
        if (i4 == 116) {
            return _startTrueToken();
        }
        if (i4 == 123) {
            return _startObjectScope();
        }
        switch (i4) {
            case 47:
                return _startSlashComment(12);
            case 48:
                return _startNumberLeadingZero();
            case C4632R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case C4632R.styleable.AppCompatTheme_colorError /* 56 */:
            case 57:
                return _startPositiveNumber(i4);
            default:
                return _startUnexpectedValue(false, i4);
        }
    }

    private final JsonToken _startValueExpectComma(int i2) throws IOException {
        if (i2 <= 32 && (i2 = _skipWS(i2)) <= 0) {
            this._minorState = 13;
            return this._currToken;
        }
        if (i2 != 44) {
            if (i2 == 93) {
                return _closeArrayScope();
            }
            if (i2 == 125) {
                return _closeObjectScope();
            }
            if (i2 == 47) {
                return _startSlashComment(13);
            }
            if (i2 == 35) {
                return _finishHashComment(13);
            }
            StringBuilder m24u = C0000a.m24u("was expecting comma to separate ");
            m24u.append(this._parsingContext.typeDesc());
            m24u.append(" entries");
            _reportUnexpectedChar(i2, m24u.toString());
        }
        this._parsingContext.expectComma();
        int i3 = this._inputPtr;
        if (i3 >= this._inputEnd) {
            this._minorState = 15;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this._currToken = jsonToken;
            return jsonToken;
        }
        int i4 = this._inputBuffer[i3];
        this._inputPtr = i3 + 1;
        if (i4 <= 32 && (i4 = _skipWS(i4)) <= 0) {
            this._minorState = 15;
            return this._currToken;
        }
        _updateTokenLocation();
        if (i4 == 34) {
            return _startString();
        }
        if (i4 == 35) {
            return _finishHashComment(15);
        }
        if (i4 == 45) {
            return _startNegativeNumber();
        }
        if (i4 == 91) {
            return _startArrayScope();
        }
        if (i4 != 93) {
            if (i4 == 102) {
                return _startFalseToken();
            }
            if (i4 == 110) {
                return _startNullToken();
            }
            if (i4 == 116) {
                return _startTrueToken();
            }
            if (i4 == 123) {
                return _startObjectScope();
            }
            if (i4 != 125) {
                switch (i4) {
                    case 47:
                        return _startSlashComment(15);
                    case 48:
                        return _startNumberLeadingZero();
                    case C4632R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case C4632R.styleable.AppCompatTheme_colorError /* 56 */:
                    case 57:
                        return _startPositiveNumber(i4);
                }
            }
            if ((this._features & FEAT_MASK_TRAILING_COMMA) != 0) {
                return _closeObjectScope();
            }
        } else if ((this._features & FEAT_MASK_TRAILING_COMMA) != 0) {
            return _closeArrayScope();
        }
        return _startUnexpectedValue(true, i4);
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public char _decodeEscaped() throws IOException {
        VersionUtil.throwInternal();
        return ' ';
    }

    public JsonToken _finishErrorToken() throws IOException {
        do {
            int i2 = this._inputPtr;
            if (i2 >= this._inputEnd) {
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this._currToken = jsonToken;
                return jsonToken;
            }
            byte[] bArr = this._inputBuffer;
            this._inputPtr = i2 + 1;
            char c2 = (char) bArr[i2];
            if (!Character.isJavaIdentifierPart(c2)) {
                break;
            }
            this._textBuffer.append(c2);
        } while (this._textBuffer.size() < 256);
        return _reportErrorToken(this._textBuffer.contentsAsString());
    }

    public JsonToken _finishErrorTokenWithEOF() throws IOException {
        return _reportErrorToken(this._textBuffer.contentsAsString());
    }

    public final JsonToken _finishFieldWithEscape() throws IOException {
        int i2;
        int i3;
        int _decodeSplitEscaped = _decodeSplitEscaped(this._quoted32, this._quotedDigits);
        if (_decodeSplitEscaped < 0) {
            this._minorState = 8;
            return JsonToken.NOT_AVAILABLE;
        }
        int i4 = this._quadLength;
        int[] iArr = this._quadBuffer;
        if (i4 >= iArr.length) {
            this._quadBuffer = ParserBase.growArrayBy(iArr, 32);
        }
        int i5 = this._pending32;
        int i6 = this._pendingBytes;
        int i7 = 1;
        if (_decodeSplitEscaped > 127) {
            int i8 = 0;
            if (i6 >= 4) {
                int[] iArr2 = this._quadBuffer;
                int i9 = this._quadLength;
                this._quadLength = i9 + 1;
                iArr2[i9] = i5;
                i5 = 0;
                i6 = 0;
            }
            if (_decodeSplitEscaped < 2048) {
                i2 = i5 << 8;
                i3 = (_decodeSplitEscaped >> 6) | 192;
            } else {
                int i10 = (i5 << 8) | (_decodeSplitEscaped >> 12) | 224;
                i6++;
                if (i6 >= 4) {
                    int[] iArr3 = this._quadBuffer;
                    int i11 = this._quadLength;
                    this._quadLength = i11 + 1;
                    iArr3[i11] = i10;
                    i6 = 0;
                } else {
                    i8 = i10;
                }
                i2 = i8 << 8;
                i3 = ((_decodeSplitEscaped >> 6) & 63) | 128;
            }
            i5 = i2 | i3;
            i6++;
            _decodeSplitEscaped = (_decodeSplitEscaped & 63) | 128;
        }
        if (i6 < 4) {
            i7 = 1 + i6;
            _decodeSplitEscaped |= i5 << 8;
        } else {
            int[] iArr4 = this._quadBuffer;
            int i12 = this._quadLength;
            this._quadLength = i12 + 1;
            iArr4[i12] = i5;
        }
        return this._minorStateAfterSplit == 9 ? _finishAposName(this._quadLength, _decodeSplitEscaped, i7) : _parseEscapedName(this._quadLength, _decodeSplitEscaped, i7);
    }

    public JsonToken _finishFloatExponent(boolean z, int i2) throws IOException {
        if (z) {
            this._minorState = 32;
            if (i2 == 45 || i2 == 43) {
                this._textBuffer.append((char) i2);
                int i3 = this._inputPtr;
                if (i3 >= this._inputEnd) {
                    this._minorState = 32;
                    this._expLength = 0;
                    return JsonToken.NOT_AVAILABLE;
                }
                byte[] bArr = this._inputBuffer;
                this._inputPtr = i3 + 1;
                i2 = bArr[i3];
            }
        }
        char[] bufferWithoutReset = this._textBuffer.getBufferWithoutReset();
        int currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
        int i4 = this._expLength;
        while (i2 >= 48 && i2 <= 57) {
            i4++;
            if (currentSegmentSize >= bufferWithoutReset.length) {
                bufferWithoutReset = this._textBuffer.expandCurrentSegment();
            }
            int i5 = currentSegmentSize + 1;
            bufferWithoutReset[currentSegmentSize] = (char) i2;
            int i6 = this._inputPtr;
            if (i6 >= this._inputEnd) {
                this._textBuffer.setCurrentLength(i5);
                this._expLength = i4;
                return JsonToken.NOT_AVAILABLE;
            }
            byte[] bArr2 = this._inputBuffer;
            this._inputPtr = i6 + 1;
            i2 = bArr2[i6];
            currentSegmentSize = i5;
        }
        int i7 = i2 & KotlinVersion.MAX_COMPONENT_VALUE;
        if (i4 == 0) {
            reportUnexpectedNumberChar(i7, "Exponent indicator not followed by a digit");
        }
        this._inputPtr--;
        this._textBuffer.setCurrentLength(currentSegmentSize);
        this._expLength = i4;
        return _valueComplete(JsonToken.VALUE_NUMBER_FLOAT);
    }

    public JsonToken _finishFloatFraction() throws IOException {
        byte b;
        int i2 = this._fractLength;
        char[] bufferWithoutReset = this._textBuffer.getBufferWithoutReset();
        int currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
        while (true) {
            byte[] bArr = this._inputBuffer;
            int i3 = this._inputPtr;
            this._inputPtr = i3 + 1;
            b = bArr[i3];
            if (b < 48 || b > 57) {
                break;
            }
            i2++;
            if (currentSegmentSize >= bufferWithoutReset.length) {
                bufferWithoutReset = this._textBuffer.expandCurrentSegment();
            }
            int i4 = currentSegmentSize + 1;
            bufferWithoutReset[currentSegmentSize] = (char) b;
            if (this._inputPtr >= this._inputEnd) {
                this._textBuffer.setCurrentLength(i4);
                this._fractLength = i2;
                return JsonToken.NOT_AVAILABLE;
            }
            currentSegmentSize = i4;
        }
        if (i2 == 0) {
            reportUnexpectedNumberChar(b, "Decimal point not followed by a digit");
        }
        this._fractLength = i2;
        this._textBuffer.setCurrentLength(currentSegmentSize);
        if (b != 101 && b != 69) {
            this._inputPtr--;
            this._textBuffer.setCurrentLength(currentSegmentSize);
            this._expLength = 0;
            return _valueComplete(JsonToken.VALUE_NUMBER_FLOAT);
        }
        this._textBuffer.append((char) b);
        this._expLength = 0;
        int i5 = this._inputPtr;
        if (i5 >= this._inputEnd) {
            this._minorState = 31;
            return JsonToken.NOT_AVAILABLE;
        }
        this._minorState = 32;
        byte[] bArr2 = this._inputBuffer;
        this._inputPtr = i5 + 1;
        return _finishFloatExponent(true, bArr2[i5] & 255);
    }

    public JsonToken _finishKeywordToken(String str, int i2, JsonToken jsonToken) throws IOException {
        int length = str.length();
        while (true) {
            int i3 = this._inputPtr;
            if (i3 >= this._inputEnd) {
                this._pending32 = i2;
                JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
                this._currToken = jsonToken2;
                return jsonToken2;
            }
            byte b = this._inputBuffer[i3];
            if (i2 == length) {
                if (b < 48 || b == 93 || b == 125) {
                    return _valueComplete(jsonToken);
                }
            } else {
                if (b != str.charAt(i2)) {
                    break;
                }
                i2++;
                this._inputPtr++;
            }
        }
        this._minorState = 50;
        this._textBuffer.resetWithCopy(str, 0, i2);
        return _finishErrorToken();
    }

    public JsonToken _finishKeywordTokenWithEOF(String str, int i2, JsonToken jsonToken) throws IOException {
        if (i2 == str.length()) {
            this._currToken = jsonToken;
            return jsonToken;
        }
        this._textBuffer.resetWithCopy(str, 0, i2);
        return _finishErrorTokenWithEOF();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        r4._minorState = 50;
        r4._textBuffer.resetWithCopy(r0, 0, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0046, code lost:
    
        return _finishErrorToken();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.fasterxml.jackson.core.JsonToken _finishNonStdToken(int r5, int r6) throws java.io.IOException {
        /*
            r4 = this;
            java.lang.String r0 = r4._nonStdToken(r5)
            int r1 = r0.length()
        L8:
            int r2 = r4._inputPtr
            int r3 = r4._inputEnd
            if (r2 < r3) goto L1b
            r4._nonStdTokenType = r5
            r4._pending32 = r6
            r5 = 19
            r4._minorState = r5
            com.fasterxml.jackson.core.JsonToken r5 = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE
            r4._currToken = r5
            return r5
        L1b:
            byte[] r3 = r4._inputBuffer
            r2 = r3[r2]
            if (r6 != r1) goto L32
            r1 = 48
            if (r2 < r1) goto L2d
            r1 = 93
            if (r2 == r1) goto L2d
            r1 = 125(0x7d, float:1.75E-43)
            if (r2 != r1) goto L38
        L2d:
            com.fasterxml.jackson.core.JsonToken r5 = r4._valueNonStdNumberComplete(r5)
            return r5
        L32:
            char r3 = r0.charAt(r6)
            if (r2 == r3) goto L47
        L38:
            r5 = 50
            r4._minorState = r5
            com.fasterxml.jackson.core.util.TextBuffer r5 = r4._textBuffer
            r1 = 0
            r5.resetWithCopy(r0, r1, r6)
            com.fasterxml.jackson.core.JsonToken r5 = r4._finishErrorToken()
            return r5
        L47:
            int r6 = r6 + 1
            int r2 = r4._inputPtr
            int r2 = r2 + 1
            r4._inputPtr = r2
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.async.NonBlockingJsonParser._finishNonStdToken(int, int):com.fasterxml.jackson.core.JsonToken");
    }

    public JsonToken _finishNonStdTokenWithEOF(int i2, int i3) throws IOException {
        String _nonStdToken = _nonStdToken(i2);
        if (i3 == _nonStdToken.length()) {
            return _valueNonStdNumberComplete(i2);
        }
        this._textBuffer.resetWithCopy(_nonStdToken, 0, i3);
        return _finishErrorTokenWithEOF();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0042, code lost:
    
        r4._intLength = r0 + r6;
        r4._textBuffer.setCurrentLength(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0050, code lost:
    
        return _valueComplete(com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.fasterxml.jackson.core.JsonToken _finishNumberIntegralPart(char[] r5, int r6) throws java.io.IOException {
        /*
            r4 = this;
            boolean r0 = r4._numberNegative
            if (r0 == 0) goto L6
            r0 = -1
            goto L7
        L6:
            r0 = 0
        L7:
            int r1 = r4._inputPtr
            int r2 = r4._inputEnd
            if (r1 < r2) goto L1b
            r5 = 26
            r4._minorState = r5
            com.fasterxml.jackson.core.util.TextBuffer r5 = r4._textBuffer
            r5.setCurrentLength(r6)
            com.fasterxml.jackson.core.JsonToken r5 = com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE
            r4._currToken = r5
            return r5
        L1b:
            byte[] r2 = r4._inputBuffer
            r2 = r2[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 48
            if (r2 >= r3) goto L35
            r3 = 46
            if (r2 != r3) goto L42
            int r0 = r0 + r6
            r4._intLength = r0
            int r1 = r1 + 1
            r4._inputPtr = r1
            com.fasterxml.jackson.core.JsonToken r5 = r4._startFloat(r5, r6, r2)
            return r5
        L35:
            r3 = 57
            if (r2 <= r3) goto L5d
            r3 = 101(0x65, float:1.42E-43)
            if (r2 == r3) goto L51
            r3 = 69
            if (r2 != r3) goto L42
            goto L51
        L42:
            int r0 = r0 + r6
            r4._intLength = r0
            com.fasterxml.jackson.core.util.TextBuffer r5 = r4._textBuffer
            r5.setCurrentLength(r6)
            com.fasterxml.jackson.core.JsonToken r5 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT
            com.fasterxml.jackson.core.JsonToken r5 = r4._valueComplete(r5)
            return r5
        L51:
            int r0 = r0 + r6
            r4._intLength = r0
            int r1 = r1 + 1
            r4._inputPtr = r1
            com.fasterxml.jackson.core.JsonToken r5 = r4._startFloat(r5, r6, r2)
            return r5
        L5d:
            int r1 = r1 + 1
            r4._inputPtr = r1
            int r1 = r5.length
            if (r6 < r1) goto L6a
            com.fasterxml.jackson.core.util.TextBuffer r5 = r4._textBuffer
            char[] r5 = r5.expandCurrentSegment()
        L6a:
            int r1 = r6 + 1
            char r2 = (char) r2
            r5[r6] = r2
            r6 = r1
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.async.NonBlockingJsonParser._finishNumberIntegralPart(char[], int):com.fasterxml.jackson.core.JsonToken");
    }

    public JsonToken _finishNumberLeadingNegZeroes() throws IOException {
        int i2;
        do {
            int i3 = this._inputPtr;
            if (i3 >= this._inputEnd) {
                this._minorState = 25;
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this._currToken = jsonToken;
                return jsonToken;
            }
            byte[] bArr = this._inputBuffer;
            this._inputPtr = i3 + 1;
            i2 = bArr[i3] & 255;
            if (i2 < 48) {
                if (i2 == 46) {
                    char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
                    emptyAndGetCurrentSegment[0] = '-';
                    emptyAndGetCurrentSegment[1] = '0';
                    this._intLength = 1;
                    return _startFloat(emptyAndGetCurrentSegment, 2, i2);
                }
            } else if (i2 > 57) {
                if (i2 == 101 || i2 == 69) {
                    char[] emptyAndGetCurrentSegment2 = this._textBuffer.emptyAndGetCurrentSegment();
                    emptyAndGetCurrentSegment2[0] = '-';
                    emptyAndGetCurrentSegment2[1] = '0';
                    this._intLength = 1;
                    return _startFloat(emptyAndGetCurrentSegment2, 2, i2);
                }
                if (i2 != 93 && i2 != 125) {
                    reportUnexpectedNumberChar(i2, "expected digit (0-9), decimal point (.) or exponent indicator (e/E) to follow '0'");
                }
            } else if ((this._features & FEAT_MASK_LEADING_ZEROS) == 0) {
                reportInvalidNumber("Leading zeroes not allowed");
            }
            this._inputPtr--;
            return _valueCompleteInt(0, "0");
        } while (i2 == 48);
        char[] emptyAndGetCurrentSegment3 = this._textBuffer.emptyAndGetCurrentSegment();
        emptyAndGetCurrentSegment3[0] = '-';
        emptyAndGetCurrentSegment3[1] = (char) i2;
        this._intLength = 1;
        return _finishNumberIntegralPart(emptyAndGetCurrentSegment3, 2);
    }

    public JsonToken _finishNumberLeadingZeroes() throws IOException {
        int i2;
        do {
            int i3 = this._inputPtr;
            if (i3 >= this._inputEnd) {
                this._minorState = 24;
                JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
                this._currToken = jsonToken;
                return jsonToken;
            }
            byte[] bArr = this._inputBuffer;
            this._inputPtr = i3 + 1;
            i2 = bArr[i3] & 255;
            if (i2 < 48) {
                if (i2 == 46) {
                    char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
                    emptyAndGetCurrentSegment[0] = '0';
                    this._intLength = 1;
                    return _startFloat(emptyAndGetCurrentSegment, 1, i2);
                }
            } else if (i2 > 57) {
                if (i2 == 101 || i2 == 69) {
                    char[] emptyAndGetCurrentSegment2 = this._textBuffer.emptyAndGetCurrentSegment();
                    emptyAndGetCurrentSegment2[0] = '0';
                    this._intLength = 1;
                    return _startFloat(emptyAndGetCurrentSegment2, 1, i2);
                }
                if (i2 != 93 && i2 != 125) {
                    reportUnexpectedNumberChar(i2, "expected digit (0-9), decimal point (.) or exponent indicator (e/E) to follow '0'");
                }
            } else if ((this._features & FEAT_MASK_LEADING_ZEROS) == 0) {
                reportInvalidNumber("Leading zeroes not allowed");
            }
            this._inputPtr--;
            return _valueCompleteInt(0, "0");
        } while (i2 == 48);
        char[] emptyAndGetCurrentSegment3 = this._textBuffer.emptyAndGetCurrentSegment();
        emptyAndGetCurrentSegment3[0] = (char) i2;
        this._intLength = 1;
        return _finishNumberIntegralPart(emptyAndGetCurrentSegment3, 1);
    }

    public JsonToken _finishNumberMinus(int i2) throws IOException {
        if (i2 <= 48) {
            if (i2 == 48) {
                return _finishNumberLeadingNegZeroes();
            }
            reportUnexpectedNumberChar(i2, "expected digit (0-9) to follow minus sign, for valid numeric value");
        } else if (i2 > 57) {
            if (i2 == 73) {
                return _finishNonStdToken(3, 2);
            }
            reportUnexpectedNumberChar(i2, "expected digit (0-9) to follow minus sign, for valid numeric value");
        }
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        emptyAndGetCurrentSegment[0] = '-';
        emptyAndGetCurrentSegment[1] = (char) i2;
        this._intLength = 1;
        return _finishNumberIntegralPart(emptyAndGetCurrentSegment, 2);
    }

    public final JsonToken _finishToken() throws IOException {
        int i2 = this._minorState;
        if (i2 == 1) {
            return _finishBOM(this._pending32);
        }
        if (i2 == 4) {
            byte[] bArr = this._inputBuffer;
            int i3 = this._inputPtr;
            this._inputPtr = i3 + 1;
            return _startFieldName(bArr[i3] & 255);
        }
        if (i2 == 5) {
            byte[] bArr2 = this._inputBuffer;
            int i4 = this._inputPtr;
            this._inputPtr = i4 + 1;
            return _startFieldNameAfterComma(bArr2[i4] & 255);
        }
        switch (i2) {
            case 7:
                return _parseEscapedName(this._quadLength, this._pending32, this._pendingBytes);
            case 8:
                return _finishFieldWithEscape();
            case 9:
                return _finishAposName(this._quadLength, this._pending32, this._pendingBytes);
            case 10:
                return _finishUnquotedName(this._quadLength, this._pending32, this._pendingBytes);
            default:
                switch (i2) {
                    case 12:
                        byte[] bArr3 = this._inputBuffer;
                        int i5 = this._inputPtr;
                        this._inputPtr = i5 + 1;
                        return _startValue(bArr3[i5] & 255);
                    case 13:
                        byte[] bArr4 = this._inputBuffer;
                        int i6 = this._inputPtr;
                        this._inputPtr = i6 + 1;
                        return _startValueExpectComma(bArr4[i6] & 255);
                    case 14:
                        byte[] bArr5 = this._inputBuffer;
                        int i7 = this._inputPtr;
                        this._inputPtr = i7 + 1;
                        return _startValueExpectColon(bArr5[i7] & 255);
                    case 15:
                        byte[] bArr6 = this._inputBuffer;
                        int i8 = this._inputPtr;
                        this._inputPtr = i8 + 1;
                        return _startValueAfterComma(bArr6[i8] & 255);
                    case 16:
                        return _finishKeywordToken("null", this._pending32, JsonToken.VALUE_NULL);
                    case 17:
                        return _finishKeywordToken("true", this._pending32, JsonToken.VALUE_TRUE);
                    case 18:
                        return _finishKeywordToken("false", this._pending32, JsonToken.VALUE_FALSE);
                    case 19:
                        return _finishNonStdToken(this._nonStdTokenType, this._pending32);
                    default:
                        switch (i2) {
                            case 23:
                                byte[] bArr7 = this._inputBuffer;
                                int i9 = this._inputPtr;
                                this._inputPtr = i9 + 1;
                                return _finishNumberMinus(bArr7[i9] & 255);
                            case 24:
                                return _finishNumberLeadingZeroes();
                            case 25:
                                return _finishNumberLeadingNegZeroes();
                            case 26:
                                return _finishNumberIntegralPart(this._textBuffer.getBufferWithoutReset(), this._textBuffer.getCurrentSegmentSize());
                            default:
                                switch (i2) {
                                    case 30:
                                        return _finishFloatFraction();
                                    case 31:
                                        byte[] bArr8 = this._inputBuffer;
                                        int i10 = this._inputPtr;
                                        this._inputPtr = i10 + 1;
                                        return _finishFloatExponent(true, bArr8[i10] & 255);
                                    case 32:
                                        byte[] bArr9 = this._inputBuffer;
                                        int i11 = this._inputPtr;
                                        this._inputPtr = i11 + 1;
                                        return _finishFloatExponent(false, bArr9[i11] & 255);
                                    default:
                                        switch (i2) {
                                            case 40:
                                                return _finishRegularString();
                                            case 41:
                                                int _decodeSplitEscaped = _decodeSplitEscaped(this._quoted32, this._quotedDigits);
                                                if (_decodeSplitEscaped < 0) {
                                                    return JsonToken.NOT_AVAILABLE;
                                                }
                                                this._textBuffer.append((char) _decodeSplitEscaped);
                                                return this._minorStateAfterSplit == 45 ? _finishAposString() : _finishRegularString();
                                            case 42:
                                                TextBuffer textBuffer = this._textBuffer;
                                                int i12 = this._pending32;
                                                byte[] bArr10 = this._inputBuffer;
                                                int i13 = this._inputPtr;
                                                this._inputPtr = i13 + 1;
                                                textBuffer.append((char) _decodeUTF8_2(i12, bArr10[i13]));
                                                return this._minorStateAfterSplit == 45 ? _finishAposString() : _finishRegularString();
                                            case 43:
                                                int i14 = this._pending32;
                                                int i15 = this._pendingBytes;
                                                byte[] bArr11 = this._inputBuffer;
                                                int i16 = this._inputPtr;
                                                this._inputPtr = i16 + 1;
                                                return !_decodeSplitUTF8_3(i14, i15, bArr11[i16]) ? JsonToken.NOT_AVAILABLE : this._minorStateAfterSplit == 45 ? _finishAposString() : _finishRegularString();
                                            case 44:
                                                int i17 = this._pending32;
                                                int i18 = this._pendingBytes;
                                                byte[] bArr12 = this._inputBuffer;
                                                int i19 = this._inputPtr;
                                                this._inputPtr = i19 + 1;
                                                return !_decodeSplitUTF8_4(i17, i18, bArr12[i19]) ? JsonToken.NOT_AVAILABLE : this._minorStateAfterSplit == 45 ? _finishAposString() : _finishRegularString();
                                            case 45:
                                                return _finishAposString();
                                            default:
                                                switch (i2) {
                                                    case 50:
                                                        return _finishErrorToken();
                                                    case 51:
                                                        return _startSlashComment(this._pending32);
                                                    case 52:
                                                        return _finishCComment(this._pending32, true);
                                                    case 53:
                                                        return _finishCComment(this._pending32, false);
                                                    case 54:
                                                        return _finishCppComment(this._pending32);
                                                    case 55:
                                                        return _finishHashComment(this._pending32);
                                                    default:
                                                        VersionUtil.throwInternal();
                                                        return null;
                                                }
                                        }
                                }
                        }
                }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final JsonToken _finishTokenWithEOF() throws IOException {
        JsonToken jsonToken = this._currToken;
        int i2 = this._minorState;
        if (i2 == 3) {
            return _eofAsNextToken();
        }
        if (i2 == 12) {
            return _eofAsNextToken();
        }
        if (i2 == 50) {
            return _finishErrorTokenWithEOF();
        }
        switch (i2) {
            case 16:
                return _finishKeywordTokenWithEOF("null", this._pending32, JsonToken.VALUE_NULL);
            case 17:
                return _finishKeywordTokenWithEOF("true", this._pending32, JsonToken.VALUE_TRUE);
            case 18:
                return _finishKeywordTokenWithEOF("false", this._pending32, JsonToken.VALUE_FALSE);
            case 19:
                return _finishNonStdTokenWithEOF(this._nonStdTokenType, this._pending32);
            default:
                switch (i2) {
                    case 24:
                    case 25:
                        return _valueCompleteInt(0, "0");
                    case 26:
                        int currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
                        if (this._numberNegative) {
                            currentSegmentSize--;
                        }
                        this._intLength = currentSegmentSize;
                        return _valueComplete(JsonToken.VALUE_NUMBER_INT);
                    default:
                        switch (i2) {
                            case 30:
                                this._expLength = 0;
                                return _valueComplete(JsonToken.VALUE_NUMBER_FLOAT);
                            case 31:
                                _reportInvalidEOF(": was expecting fraction after exponent marker", JsonToken.VALUE_NUMBER_FLOAT);
                                _reportInvalidEOF(": was expecting closing '*/' for comment", JsonToken.NOT_AVAILABLE);
                                return _eofAsNextToken();
                            case 32:
                                return _valueComplete(JsonToken.VALUE_NUMBER_FLOAT);
                            default:
                                switch (i2) {
                                    case 52:
                                    case 53:
                                        _reportInvalidEOF(": was expecting closing '*/' for comment", JsonToken.NOT_AVAILABLE);
                                        break;
                                    case 54:
                                    case 55:
                                        break;
                                    default:
                                        _reportInvalidEOF(C0000a.m18o(C0000a.m24u(": was expecting rest of token (internal state: "), this._minorState, ")"), this._currToken);
                                        return jsonToken;
                                }
                                return _eofAsNextToken();
                        }
                }
        }
    }

    public JsonToken _reportErrorToken(String str) throws IOException {
        _reportError("Unrecognized token '%s': was expecting %s", this._textBuffer.contentsAsString(), _validJsonTokenList());
        return JsonToken.NOT_AVAILABLE;
    }

    public JsonToken _startAposString() throws IOException {
        int i2 = this._inputPtr;
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int[] iArr = _icUTF8;
        int min = Math.min(this._inputEnd, emptyAndGetCurrentSegment.length + i2);
        byte[] bArr = this._inputBuffer;
        int i3 = 0;
        while (i2 < min) {
            int i4 = bArr[i2] & 255;
            if (i4 == 39) {
                this._inputPtr = i2 + 1;
                this._textBuffer.setCurrentLength(i3);
                return _valueComplete(JsonToken.VALUE_STRING);
            }
            if (iArr[i4] != 0) {
                break;
            }
            i2++;
            emptyAndGetCurrentSegment[i3] = (char) i4;
            i3++;
        }
        this._textBuffer.setCurrentLength(i3);
        this._inputPtr = i2;
        return _finishAposString();
    }

    public JsonToken _startFalseToken() throws IOException {
        int i2;
        int i3 = this._inputPtr;
        if (i3 + 4 < this._inputEnd) {
            byte[] bArr = this._inputBuffer;
            int i4 = i3 + 1;
            if (bArr[i3] == 97) {
                int i5 = i4 + 1;
                if (bArr[i4] == 108) {
                    int i6 = i5 + 1;
                    if (bArr[i5] == 115) {
                        int i7 = i6 + 1;
                        if (bArr[i6] == 101 && ((i2 = bArr[i7] & 255) < 48 || i2 == 93 || i2 == 125)) {
                            this._inputPtr = i7;
                            return _valueComplete(JsonToken.VALUE_FALSE);
                        }
                    }
                }
            }
        }
        this._minorState = 18;
        return _finishKeywordToken("false", 1, JsonToken.VALUE_FALSE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
    
        r2 = r2 & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
    
        if (r9 != 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
    
        reportUnexpectedNumberChar(r2, "Decimal point not followed by a digit");
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f9  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00ec -> B:49:0x00c3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.fasterxml.jackson.core.JsonToken _startFloat(char[] r7, int r8, int r9) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.async.NonBlockingJsonParser._startFloat(char[], int, int):com.fasterxml.jackson.core.JsonToken");
    }

    public JsonToken _startNegativeNumber() throws IOException {
        this._numberNegative = true;
        int i2 = this._inputPtr;
        if (i2 >= this._inputEnd) {
            this._minorState = 23;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this._currToken = jsonToken;
            return jsonToken;
        }
        byte[] bArr = this._inputBuffer;
        this._inputPtr = i2 + 1;
        int i3 = bArr[i2] & 255;
        int i4 = 2;
        if (i3 <= 48) {
            if (i3 == 48) {
                return _finishNumberLeadingNegZeroes();
            }
            reportUnexpectedNumberChar(i3, "expected digit (0-9) to follow minus sign, for valid numeric value");
        } else if (i3 > 57) {
            if (i3 == 73) {
                return _finishNonStdToken(3, 2);
            }
            reportUnexpectedNumberChar(i3, "expected digit (0-9) to follow minus sign, for valid numeric value");
        }
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        emptyAndGetCurrentSegment[0] = '-';
        emptyAndGetCurrentSegment[1] = (char) i3;
        int i5 = this._inputPtr;
        if (i5 >= this._inputEnd) {
            this._minorState = 26;
            this._textBuffer.setCurrentLength(2);
            this._intLength = 1;
            JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
            this._currToken = jsonToken2;
            return jsonToken2;
        }
        int i6 = this._inputBuffer[i5];
        while (true) {
            if (i6 < 48) {
                if (i6 == 46) {
                    this._intLength = i4 - 1;
                    this._inputPtr++;
                    return _startFloat(emptyAndGetCurrentSegment, i4, i6);
                }
            } else if (i6 <= 57) {
                if (i4 >= emptyAndGetCurrentSegment.length) {
                    emptyAndGetCurrentSegment = this._textBuffer.expandCurrentSegment();
                }
                int i7 = i4 + 1;
                emptyAndGetCurrentSegment[i4] = (char) i6;
                int i8 = this._inputPtr + 1;
                this._inputPtr = i8;
                if (i8 >= this._inputEnd) {
                    this._minorState = 26;
                    this._textBuffer.setCurrentLength(i7);
                    JsonToken jsonToken3 = JsonToken.NOT_AVAILABLE;
                    this._currToken = jsonToken3;
                    return jsonToken3;
                }
                i6 = this._inputBuffer[i8] & 255;
                i4 = i7;
            } else if (i6 == 101 || i6 == 69) {
                this._intLength = i4 - 1;
                this._inputPtr++;
                return _startFloat(emptyAndGetCurrentSegment, i4, i6);
            }
        }
        this._intLength = i4 - 1;
        this._textBuffer.setCurrentLength(i4);
        return _valueComplete(JsonToken.VALUE_NUMBER_INT);
    }

    public JsonToken _startNullToken() throws IOException {
        int i2;
        int i3 = this._inputPtr;
        if (i3 + 3 < this._inputEnd) {
            byte[] bArr = this._inputBuffer;
            int i4 = i3 + 1;
            if (bArr[i3] == 117) {
                int i5 = i4 + 1;
                if (bArr[i4] == 108) {
                    int i6 = i5 + 1;
                    if (bArr[i5] == 108 && ((i2 = bArr[i6] & 255) < 48 || i2 == 93 || i2 == 125)) {
                        this._inputPtr = i6;
                        return _valueComplete(JsonToken.VALUE_NULL);
                    }
                }
            }
        }
        this._minorState = 16;
        return _finishKeywordToken("null", 1, JsonToken.VALUE_NULL);
    }

    public JsonToken _startNumberLeadingZero() throws IOException {
        int i2 = this._inputPtr;
        if (i2 >= this._inputEnd) {
            this._minorState = 24;
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this._currToken = jsonToken;
            return jsonToken;
        }
        int i3 = i2 + 1;
        int i4 = this._inputBuffer[i2] & 255;
        if (i4 < 48) {
            if (i4 == 46) {
                this._inputPtr = i3;
                this._intLength = 1;
                char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
                emptyAndGetCurrentSegment[0] = '0';
                return _startFloat(emptyAndGetCurrentSegment, 1, i4);
            }
        } else {
            if (i4 <= 57) {
                return _finishNumberLeadingZeroes();
            }
            if (i4 == 101 || i4 == 69) {
                this._inputPtr = i3;
                this._intLength = 1;
                char[] emptyAndGetCurrentSegment2 = this._textBuffer.emptyAndGetCurrentSegment();
                emptyAndGetCurrentSegment2[0] = '0';
                return _startFloat(emptyAndGetCurrentSegment2, 1, i4);
            }
            if (i4 != 93 && i4 != 125) {
                reportUnexpectedNumberChar(i4, "expected digit (0-9), decimal point (.) or exponent indicator (e/E) to follow '0'");
            }
        }
        return _valueCompleteInt(0, "0");
    }

    public JsonToken _startPositiveNumber(int i2) throws IOException {
        this._numberNegative = false;
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        emptyAndGetCurrentSegment[0] = (char) i2;
        int i3 = this._inputPtr;
        if (i3 >= this._inputEnd) {
            this._minorState = 26;
            this._textBuffer.setCurrentLength(1);
            JsonToken jsonToken = JsonToken.NOT_AVAILABLE;
            this._currToken = jsonToken;
            return jsonToken;
        }
        int i4 = this._inputBuffer[i3] & 255;
        int i5 = 1;
        while (true) {
            if (i4 < 48) {
                if (i4 == 46) {
                    this._intLength = i5;
                    this._inputPtr++;
                    return _startFloat(emptyAndGetCurrentSegment, i5, i4);
                }
            } else if (i4 <= 57) {
                if (i5 >= emptyAndGetCurrentSegment.length) {
                    emptyAndGetCurrentSegment = this._textBuffer.expandCurrentSegment();
                }
                int i6 = i5 + 1;
                emptyAndGetCurrentSegment[i5] = (char) i4;
                int i7 = this._inputPtr + 1;
                this._inputPtr = i7;
                if (i7 >= this._inputEnd) {
                    this._minorState = 26;
                    this._textBuffer.setCurrentLength(i6);
                    JsonToken jsonToken2 = JsonToken.NOT_AVAILABLE;
                    this._currToken = jsonToken2;
                    return jsonToken2;
                }
                i4 = this._inputBuffer[i7] & 255;
                i5 = i6;
            } else if (i4 == 101 || i4 == 69) {
                this._intLength = i5;
                this._inputPtr++;
                return _startFloat(emptyAndGetCurrentSegment, i5, i4);
            }
        }
        this._intLength = i5;
        this._textBuffer.setCurrentLength(i5);
        return _valueComplete(JsonToken.VALUE_NUMBER_INT);
    }

    public JsonToken _startString() throws IOException {
        int i2 = this._inputPtr;
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int[] iArr = _icUTF8;
        int min = Math.min(this._inputEnd, emptyAndGetCurrentSegment.length + i2);
        byte[] bArr = this._inputBuffer;
        int i3 = 0;
        while (true) {
            if (i2 >= min) {
                break;
            }
            int i4 = bArr[i2] & 255;
            if (iArr[i4] == 0) {
                i2++;
                emptyAndGetCurrentSegment[i3] = (char) i4;
                i3++;
            } else if (i4 == 34) {
                this._inputPtr = i2 + 1;
                this._textBuffer.setCurrentLength(i3);
                return _valueComplete(JsonToken.VALUE_STRING);
            }
        }
        this._textBuffer.setCurrentLength(i3);
        this._inputPtr = i2;
        return _finishRegularString();
    }

    public JsonToken _startTrueToken() throws IOException {
        int i2;
        int i3 = this._inputPtr;
        if (i3 + 3 < this._inputEnd) {
            byte[] bArr = this._inputBuffer;
            int i4 = i3 + 1;
            if (bArr[i3] == 114) {
                int i5 = i4 + 1;
                if (bArr[i4] == 117) {
                    int i6 = i5 + 1;
                    if (bArr[i5] == 101 && ((i2 = bArr[i6] & 255) < 48 || i2 == 93 || i2 == 125)) {
                        this._inputPtr = i6;
                        return _valueComplete(JsonToken.VALUE_TRUE);
                    }
                }
            }
        }
        this._minorState = 17;
        return _finishKeywordToken("true", 1, JsonToken.VALUE_TRUE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001b, code lost:
    
        if (r4 != 44) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if ((r2._features & com.fasterxml.jackson.core.json.async.NonBlockingJsonParser.FEAT_MASK_ALLOW_MISSING) == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
    
        r2._inputPtr--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
    
        return _valueComplete(com.fasterxml.jackson.core.JsonToken.VALUE_NULL);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x002a, code lost:
    
        if (r2._parsingContext.inArray() == false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.fasterxml.jackson.core.JsonToken _startUnexpectedValue(boolean r3, int r4) throws java.io.IOException {
        /*
            r2 = this;
            r3 = 39
            if (r4 == r3) goto L4b
            r3 = 73
            r0 = 1
            if (r4 == r3) goto L46
            r3 = 78
            if (r4 == r3) goto L40
            r3 = 93
            if (r4 == r3) goto L24
            r3 = 125(0x7d, float:1.75E-43)
            if (r4 == r3) goto L57
            r3 = 43
            if (r4 == r3) goto L1e
            r3 = 44
            if (r4 == r3) goto L2d
            goto L57
        L1e:
            r3 = 2
            com.fasterxml.jackson.core.JsonToken r3 = r2._finishNonStdToken(r3, r0)
            return r3
        L24:
            com.fasterxml.jackson.core.json.JsonReadContext r3 = r2._parsingContext
            boolean r3 = r3.inArray()
            if (r3 != 0) goto L2d
            goto L57
        L2d:
            int r3 = r2._features
            int r1 = com.fasterxml.jackson.core.json.async.NonBlockingJsonParser.FEAT_MASK_ALLOW_MISSING
            r3 = r3 & r1
            if (r3 == 0) goto L57
            int r3 = r2._inputPtr
            int r3 = r3 - r0
            r2._inputPtr = r3
            com.fasterxml.jackson.core.JsonToken r3 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            com.fasterxml.jackson.core.JsonToken r3 = r2._valueComplete(r3)
            return r3
        L40:
            r3 = 0
            com.fasterxml.jackson.core.JsonToken r3 = r2._finishNonStdToken(r3, r0)
            return r3
        L46:
            com.fasterxml.jackson.core.JsonToken r3 = r2._finishNonStdToken(r0, r0)
            return r3
        L4b:
            int r3 = r2._features
            int r0 = com.fasterxml.jackson.core.json.async.NonBlockingJsonParser.FEAT_MASK_ALLOW_SINGLE_QUOTES
            r3 = r3 & r0
            if (r3 == 0) goto L57
            com.fasterxml.jackson.core.JsonToken r3 = r2._startAposString()
            return r3
        L57:
            java.lang.String r3 = "expected a valid value "
            java.lang.StringBuilder r3 = p000a.C0000a.m24u(r3)
            java.lang.String r0 = r2._validJsonValueList()
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2._reportUnexpectedChar(r4, r3)
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.async.NonBlockingJsonParser._startUnexpectedValue(boolean, int):com.fasterxml.jackson.core.JsonToken");
    }

    @Override // com.fasterxml.jackson.core.async.NonBlockingInputFeeder
    public void endOfInput() {
        this._endOfInput = true;
    }

    @Override // com.fasterxml.jackson.core.async.ByteArrayFeeder
    public void feedInput(byte[] bArr, int i2, int i3) throws IOException {
        int i4 = this._inputPtr;
        int i5 = this._inputEnd;
        if (i4 < i5) {
            _reportError("Still have %d undecoded bytes, should not call 'feedInput'", Integer.valueOf(i5 - i4));
        }
        if (i3 < i2) {
            _reportError("Input end (%d) may not be before start (%d)", Integer.valueOf(i3), Integer.valueOf(i2));
        }
        if (this._endOfInput) {
            _reportError("Already closed, can not feed more input");
        }
        this._currInputProcessed += this._origBufferLen;
        this._currInputRowStart = i2 - (this._inputEnd - this._currInputRowStart);
        this._currBufferStart = i2;
        this._inputBuffer = bArr;
        this._inputPtr = i2;
        this._inputEnd = i3;
        this._origBufferLen = i3 - i2;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public ByteArrayFeeder getNonBlockingInputFeeder() {
        return this;
    }

    @Override // com.fasterxml.jackson.core.async.NonBlockingInputFeeder
    public final boolean needMoreInput() {
        return this._inputPtr >= this._inputEnd && !this._endOfInput;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public JsonToken nextToken() throws IOException {
        int i2 = this._inputPtr;
        if (i2 >= this._inputEnd) {
            if (this._closed) {
                return null;
            }
            return this._endOfInput ? this._currToken == JsonToken.NOT_AVAILABLE ? _finishTokenWithEOF() : _eofAsNextToken() : JsonToken.NOT_AVAILABLE;
        }
        if (this._currToken == JsonToken.NOT_AVAILABLE) {
            return _finishToken();
        }
        this._numTypesValid = 0;
        this._tokenInputTotal = this._currInputProcessed + i2;
        this._binaryValue = null;
        byte[] bArr = this._inputBuffer;
        this._inputPtr = i2 + 1;
        int i3 = bArr[i2] & 255;
        switch (this._majorState) {
            case 0:
                return _startDocument(i3);
            case 1:
                return _startValue(i3);
            case 2:
                return _startFieldName(i3);
            case 3:
                return _startFieldNameAfterComma(i3);
            case 4:
                return _startValueExpectColon(i3);
            case 5:
                return _startValue(i3);
            case 6:
                return _startValueExpectComma(i3);
            default:
                VersionUtil.throwInternal();
                return null;
        }
    }

    @Override // com.fasterxml.jackson.core.json.async.NonBlockingJsonParserBase, com.fasterxml.jackson.core.JsonParser
    public int releaseBuffered(OutputStream outputStream) throws IOException {
        int i2 = this._inputEnd;
        int i3 = this._inputPtr;
        int i4 = i2 - i3;
        if (i4 > 0) {
            outputStream.write(this._inputBuffer, i3, i4);
        }
        return i4;
    }
}
