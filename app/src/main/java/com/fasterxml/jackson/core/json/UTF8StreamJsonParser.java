package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.base.ParserBase;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.fasterxml.jackson.core.p006io.CharTypes;
import com.fasterxml.jackson.core.p006io.IOContext;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.TextBuffer;
import com.yandex.mobile.ads.C4632R;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import p000a.C0000a;

/* loaded from: classes.dex */
public class UTF8StreamJsonParser extends ParserBase {
    public static final byte BYTE_LF = 10;
    public boolean _bufferRecyclable;
    public byte[] _inputBuffer;
    public InputStream _inputStream;
    public int _nameStartCol;
    public int _nameStartOffset;
    public int _nameStartRow;
    public ObjectCodec _objectCodec;
    private int _quad1;
    public int[] _quadBuffer;
    public final ByteQuadsCanonicalizer _symbols;
    public boolean _tokenIncomplete;
    private static final int FEAT_MASK_TRAILING_COMMA = JsonParser.Feature.ALLOW_TRAILING_COMMA.getMask();
    private static final int FEAT_MASK_LEADING_ZEROS = JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS.getMask();
    private static final int FEAT_MASK_NON_NUM_NUMBERS = JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS.getMask();
    private static final int FEAT_MASK_ALLOW_MISSING = JsonParser.Feature.ALLOW_MISSING_VALUES.getMask();
    private static final int FEAT_MASK_ALLOW_SINGLE_QUOTES = JsonParser.Feature.ALLOW_SINGLE_QUOTES.getMask();
    private static final int FEAT_MASK_ALLOW_UNQUOTED_NAMES = JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES.getMask();
    private static final int FEAT_MASK_ALLOW_JAVA_COMMENTS = JsonParser.Feature.ALLOW_COMMENTS.getMask();
    private static final int FEAT_MASK_ALLOW_YAML_COMMENTS = JsonParser.Feature.ALLOW_YAML_COMMENTS.getMask();
    private static final int[] _icUTF8 = CharTypes.getInputCodeUtf8();
    public static final int[] _icLatin1 = CharTypes.getInputCodeLatin1();

    @Deprecated
    public UTF8StreamJsonParser(IOContext iOContext, int i2, InputStream inputStream, ObjectCodec objectCodec, ByteQuadsCanonicalizer byteQuadsCanonicalizer, byte[] bArr, int i3, int i4, boolean z) {
        this(iOContext, i2, inputStream, objectCodec, byteQuadsCanonicalizer, bArr, i3, i4, 0, z);
    }

    private final void _checkMatchEnd(String str, int i2, int i3) throws IOException {
        if (Character.isJavaIdentifierPart((char) _decodeCharForError(i3))) {
            _reportInvalidToken(str.substring(0, i2));
        }
    }

    private final void _closeArrayScope() throws JsonParseException {
        _updateLocation();
        if (!this._parsingContext.inArray()) {
            _reportMismatchedEndMarker(93, '}');
        }
        this._parsingContext = this._parsingContext.clearAndGetParent();
    }

    private final void _closeObjectScope() throws JsonParseException {
        _updateLocation();
        if (!this._parsingContext.inObject()) {
            _reportMismatchedEndMarker(125, ']');
        }
        this._parsingContext = this._parsingContext.clearAndGetParent();
    }

    private final JsonToken _closeScope(int i2) throws JsonParseException {
        if (i2 == 125) {
            _closeObjectScope();
            JsonToken jsonToken = JsonToken.END_OBJECT;
            this._currToken = jsonToken;
            return jsonToken;
        }
        _closeArrayScope();
        JsonToken jsonToken2 = JsonToken.END_ARRAY;
        this._currToken = jsonToken2;
        return jsonToken2;
    }

    private final int _decodeUtf8_2(int i2) throws IOException {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i3 = this._inputPtr;
        int i4 = i3 + 1;
        this._inputPtr = i4;
        byte b = bArr[i3];
        if ((b & 192) != 128) {
            _reportInvalidOther(b & 255, i4);
        }
        return ((i2 & 31) << 6) | (b & 63);
    }

    private final int _decodeUtf8_3(int i2) throws IOException {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        int i3 = i2 & 15;
        byte[] bArr = this._inputBuffer;
        int i4 = this._inputPtr;
        int i5 = i4 + 1;
        this._inputPtr = i5;
        byte b = bArr[i4];
        if ((b & 192) != 128) {
            _reportInvalidOther(b & 255, i5);
        }
        int i6 = (i3 << 6) | (b & 63);
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr2 = this._inputBuffer;
        int i7 = this._inputPtr;
        int i8 = i7 + 1;
        this._inputPtr = i8;
        byte b2 = bArr2[i7];
        if ((b2 & 192) != 128) {
            _reportInvalidOther(b2 & 255, i8);
        }
        return (i6 << 6) | (b2 & 63);
    }

    private final int _decodeUtf8_3fast(int i2) throws IOException {
        int i3 = i2 & 15;
        byte[] bArr = this._inputBuffer;
        int i4 = this._inputPtr;
        int i5 = i4 + 1;
        this._inputPtr = i5;
        byte b = bArr[i4];
        if ((b & 192) != 128) {
            _reportInvalidOther(b & 255, i5);
        }
        int i6 = (i3 << 6) | (b & 63);
        byte[] bArr2 = this._inputBuffer;
        int i7 = this._inputPtr;
        int i8 = i7 + 1;
        this._inputPtr = i8;
        byte b2 = bArr2[i7];
        if ((b2 & 192) != 128) {
            _reportInvalidOther(b2 & 255, i8);
        }
        return (i6 << 6) | (b2 & 63);
    }

    private final int _decodeUtf8_4(int i2) throws IOException {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i3 = this._inputPtr;
        int i4 = i3 + 1;
        this._inputPtr = i4;
        byte b = bArr[i3];
        if ((b & 192) != 128) {
            _reportInvalidOther(b & 255, i4);
        }
        int i5 = ((i2 & 7) << 6) | (b & 63);
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr2 = this._inputBuffer;
        int i6 = this._inputPtr;
        int i7 = i6 + 1;
        this._inputPtr = i7;
        byte b2 = bArr2[i6];
        if ((b2 & 192) != 128) {
            _reportInvalidOther(b2 & 255, i7);
        }
        int i8 = (i5 << 6) | (b2 & 63);
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr3 = this._inputBuffer;
        int i9 = this._inputPtr;
        int i10 = i9 + 1;
        this._inputPtr = i10;
        byte b3 = bArr3[i9];
        if ((b3 & 192) != 128) {
            _reportInvalidOther(b3 & 255, i10);
        }
        return ((i8 << 6) | (b3 & 63)) - TextBuffer.MAX_SEGMENT_LEN;
    }

    private final void _finishString2(char[] cArr, int i2) throws IOException {
        int[] iArr = _icUTF8;
        byte[] bArr = this._inputBuffer;
        while (true) {
            int i3 = this._inputPtr;
            if (i3 >= this._inputEnd) {
                _loadMoreGuaranteed();
                i3 = this._inputPtr;
            }
            int i4 = 0;
            if (i2 >= cArr.length) {
                cArr = this._textBuffer.finishCurrentSegment();
                i2 = 0;
            }
            int min = Math.min(this._inputEnd, (cArr.length - i2) + i3);
            while (true) {
                if (i3 >= min) {
                    this._inputPtr = i3;
                    break;
                }
                int i5 = i3 + 1;
                int i6 = bArr[i3] & 255;
                if (iArr[i6] != 0) {
                    this._inputPtr = i5;
                    if (i6 == 34) {
                        this._textBuffer.setCurrentLength(i2);
                        return;
                    }
                    int i7 = iArr[i6];
                    if (i7 == 1) {
                        i6 = _decodeEscaped();
                    } else if (i7 == 2) {
                        i6 = _decodeUtf8_2(i6);
                    } else if (i7 == 3) {
                        i6 = this._inputEnd - i5 >= 2 ? _decodeUtf8_3fast(i6) : _decodeUtf8_3(i6);
                    } else if (i7 == 4) {
                        int _decodeUtf8_4 = _decodeUtf8_4(i6);
                        int i8 = i2 + 1;
                        cArr[i2] = (char) (55296 | (_decodeUtf8_4 >> 10));
                        if (i8 >= cArr.length) {
                            cArr = this._textBuffer.finishCurrentSegment();
                            i2 = 0;
                        } else {
                            i2 = i8;
                        }
                        i6 = (_decodeUtf8_4 & 1023) | 56320;
                    } else if (i6 < 32) {
                        _throwUnquotedSpace(i6, "string value");
                    } else {
                        _reportInvalidChar(i6);
                    }
                    if (i2 >= cArr.length) {
                        cArr = this._textBuffer.finishCurrentSegment();
                    } else {
                        i4 = i2;
                    }
                    i2 = i4 + 1;
                    cArr[i4] = (char) i6;
                } else {
                    cArr[i2] = (char) i6;
                    i3 = i5;
                    i2++;
                }
            }
        }
    }

    private final boolean _isNextTokenNameMaybe(int i2, SerializableString serializableString) throws IOException {
        JsonToken _parseNegNumber;
        String _parseName = _parseName(i2);
        this._parsingContext.setCurrentName(_parseName);
        boolean equals = _parseName.equals(serializableString.getValue());
        this._currToken = JsonToken.FIELD_NAME;
        int _skipColon = _skipColon();
        _updateLocation();
        if (_skipColon == 34) {
            this._tokenIncomplete = true;
            this._nextToken = JsonToken.VALUE_STRING;
            return equals;
        }
        if (_skipColon == 45) {
            _parseNegNumber = _parseNegNumber();
        } else if (_skipColon == 91) {
            _parseNegNumber = JsonToken.START_ARRAY;
        } else if (_skipColon == 102) {
            _matchFalse();
            _parseNegNumber = JsonToken.VALUE_FALSE;
        } else if (_skipColon == 110) {
            _matchNull();
            _parseNegNumber = JsonToken.VALUE_NULL;
        } else if (_skipColon == 116) {
            _matchTrue();
            _parseNegNumber = JsonToken.VALUE_TRUE;
        } else if (_skipColon != 123) {
            switch (_skipColon) {
                case 48:
                case C4632R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case C4632R.styleable.AppCompatTheme_colorError /* 56 */:
                case 57:
                    _parseNegNumber = _parsePosNumber(_skipColon);
                    break;
                default:
                    _parseNegNumber = _handleUnexpectedValue(_skipColon);
                    break;
            }
        } else {
            _parseNegNumber = JsonToken.START_OBJECT;
        }
        this._nextToken = _parseNegNumber;
        return equals;
    }

    private final void _isNextTokenNameYes(int i2) throws IOException {
        this._currToken = JsonToken.FIELD_NAME;
        _updateLocation();
        if (i2 == 34) {
            this._tokenIncomplete = true;
            this._nextToken = JsonToken.VALUE_STRING;
            return;
        }
        if (i2 == 45) {
            this._nextToken = _parseNegNumber();
            return;
        }
        if (i2 == 91) {
            this._nextToken = JsonToken.START_ARRAY;
            return;
        }
        if (i2 == 102) {
            _matchFalse();
            this._nextToken = JsonToken.VALUE_FALSE;
            return;
        }
        if (i2 == 110) {
            _matchNull();
            this._nextToken = JsonToken.VALUE_NULL;
            return;
        }
        if (i2 == 116) {
            _matchTrue();
            this._nextToken = JsonToken.VALUE_TRUE;
        } else {
            if (i2 == 123) {
                this._nextToken = JsonToken.START_OBJECT;
                return;
            }
            switch (i2) {
                case 48:
                case C4632R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case C4632R.styleable.AppCompatTheme_colorError /* 56 */:
                case 57:
                    this._nextToken = _parsePosNumber(i2);
                    break;
                default:
                    this._nextToken = _handleUnexpectedValue(i2);
                    break;
            }
        }
    }

    private final void _matchToken2(String str, int i2) throws IOException {
        int i3;
        int i4;
        int length = str.length();
        do {
            if ((this._inputPtr >= this._inputEnd && !_loadMore()) || this._inputBuffer[this._inputPtr] != str.charAt(i2)) {
                _reportInvalidToken(str.substring(0, i2));
            }
            i3 = this._inputPtr + 1;
            this._inputPtr = i3;
            i2++;
        } while (i2 < length);
        if ((i3 < this._inputEnd || _loadMore()) && (i4 = this._inputBuffer[this._inputPtr] & 255) >= 48 && i4 != 93 && i4 != 125) {
            _checkMatchEnd(str, i2, i4);
        }
    }

    private final JsonToken _nextAfterName() {
        this._nameCopied = false;
        JsonToken jsonToken = this._nextToken;
        this._nextToken = null;
        if (jsonToken == JsonToken.START_ARRAY) {
            this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
        } else if (jsonToken == JsonToken.START_OBJECT) {
            this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
        }
        this._currToken = jsonToken;
        return jsonToken;
    }

    private final JsonToken _nextTokenNotInObject(int i2) throws IOException {
        if (i2 == 34) {
            this._tokenIncomplete = true;
            JsonToken jsonToken = JsonToken.VALUE_STRING;
            this._currToken = jsonToken;
            return jsonToken;
        }
        if (i2 == 45) {
            JsonToken _parseNegNumber = _parseNegNumber();
            this._currToken = _parseNegNumber;
            return _parseNegNumber;
        }
        if (i2 == 91) {
            this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
            JsonToken jsonToken2 = JsonToken.START_ARRAY;
            this._currToken = jsonToken2;
            return jsonToken2;
        }
        if (i2 == 102) {
            _matchFalse();
            JsonToken jsonToken3 = JsonToken.VALUE_FALSE;
            this._currToken = jsonToken3;
            return jsonToken3;
        }
        if (i2 == 110) {
            _matchNull();
            JsonToken jsonToken4 = JsonToken.VALUE_NULL;
            this._currToken = jsonToken4;
            return jsonToken4;
        }
        if (i2 == 116) {
            _matchTrue();
            JsonToken jsonToken5 = JsonToken.VALUE_TRUE;
            this._currToken = jsonToken5;
            return jsonToken5;
        }
        if (i2 == 123) {
            this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
            JsonToken jsonToken6 = JsonToken.START_OBJECT;
            this._currToken = jsonToken6;
            return jsonToken6;
        }
        switch (i2) {
            case 48:
            case C4632R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case C4632R.styleable.AppCompatTheme_colorError /* 56 */:
            case 57:
                JsonToken _parsePosNumber = _parsePosNumber(i2);
                this._currToken = _parsePosNumber;
                return _parsePosNumber;
            default:
                JsonToken _handleUnexpectedValue = _handleUnexpectedValue(i2);
                this._currToken = _handleUnexpectedValue;
                return _handleUnexpectedValue;
        }
    }

    private static final int _padLastQuad(int i2, int i3) {
        return i3 == 4 ? i2 : i2 | ((-1) << (i3 << 3));
    }

    private final JsonToken _parseFloat(char[] cArr, int i2, int i3, boolean z, int i4) throws IOException {
        int i5;
        boolean z2;
        int i6 = 0;
        if (i3 == 46) {
            if (i2 >= cArr.length) {
                cArr = this._textBuffer.finishCurrentSegment();
                i2 = 0;
            }
            cArr[i2] = (char) i3;
            i2++;
            i5 = 0;
            while (true) {
                if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                    z2 = true;
                    break;
                }
                byte[] bArr = this._inputBuffer;
                int i7 = this._inputPtr;
                this._inputPtr = i7 + 1;
                i3 = bArr[i7] & 255;
                if (i3 < 48 || i3 > 57) {
                    break;
                }
                i5++;
                if (i2 >= cArr.length) {
                    cArr = this._textBuffer.finishCurrentSegment();
                    i2 = 0;
                }
                cArr[i2] = (char) i3;
                i2++;
            }
            z2 = false;
            if (i5 == 0) {
                reportUnexpectedNumberChar(i3, "Decimal point not followed by a digit");
            }
        } else {
            i5 = 0;
            z2 = false;
        }
        if (i3 == 101 || i3 == 69) {
            if (i2 >= cArr.length) {
                cArr = this._textBuffer.finishCurrentSegment();
                i2 = 0;
            }
            int i8 = i2 + 1;
            cArr[i2] = (char) i3;
            if (this._inputPtr >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            byte[] bArr2 = this._inputBuffer;
            int i9 = this._inputPtr;
            this._inputPtr = i9 + 1;
            int i10 = bArr2[i9] & 255;
            if (i10 == 45 || i10 == 43) {
                if (i8 >= cArr.length) {
                    cArr = this._textBuffer.finishCurrentSegment();
                    i8 = 0;
                }
                int i11 = i8 + 1;
                cArr[i8] = (char) i10;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr3 = this._inputBuffer;
                int i12 = this._inputPtr;
                this._inputPtr = i12 + 1;
                i10 = bArr3[i12] & 255;
                i8 = i11;
            }
            i3 = i10;
            int i13 = 0;
            while (i3 >= 48 && i3 <= 57) {
                i13++;
                if (i8 >= cArr.length) {
                    cArr = this._textBuffer.finishCurrentSegment();
                    i8 = 0;
                }
                int i14 = i8 + 1;
                cArr[i8] = (char) i3;
                if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                    i6 = i13;
                    i2 = i14;
                    z2 = true;
                    break;
                }
                byte[] bArr4 = this._inputBuffer;
                int i15 = this._inputPtr;
                this._inputPtr = i15 + 1;
                i3 = bArr4[i15] & 255;
                i8 = i14;
            }
            i6 = i13;
            i2 = i8;
            if (i6 == 0) {
                reportUnexpectedNumberChar(i3, "Exponent indicator not followed by a digit");
            }
        }
        if (!z2) {
            this._inputPtr--;
            if (this._parsingContext.inRoot()) {
                _verifyRootSpace(i3);
            }
        }
        this._textBuffer.setCurrentLength(i2);
        return resetFloat(z, i4, i5, i6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0044, code lost:
    
        if (r3 == 46) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (r3 == 101) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004c, code lost:
    
        if (r3 != 69) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004f, code lost:
    
        r6._inputPtr = r10 - 1;
        r6._textBuffer.setCurrentLength(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        if (r6._parsingContext.inRoot() == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        _verifyRootSpace(r6._inputBuffer[r6._inputPtr] & 255);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006f, code lost:
    
        return resetInt(r9, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0076, code lost:
    
        return _parseFloat(r1, r2, r3, r9, r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.fasterxml.jackson.core.JsonToken _parseNumber2(char[] r7, int r8, boolean r9, int r10) throws java.io.IOException {
        /*
            r6 = this;
            r1 = r7
            r2 = r8
            r5 = r10
        L3:
            int r7 = r6._inputPtr
            int r8 = r6._inputEnd
            if (r7 < r8) goto L19
            boolean r7 = r6._loadMore()
            if (r7 != 0) goto L19
            com.fasterxml.jackson.core.util.TextBuffer r7 = r6._textBuffer
            r7.setCurrentLength(r2)
            com.fasterxml.jackson.core.JsonToken r7 = r6.resetInt(r9, r5)
            return r7
        L19:
            byte[] r7 = r6._inputBuffer
            int r8 = r6._inputPtr
            int r10 = r8 + 1
            r6._inputPtr = r10
            r7 = r7[r8]
            r3 = r7 & 255(0xff, float:3.57E-43)
            r7 = 57
            if (r3 > r7) goto L42
            r7 = 48
            if (r3 >= r7) goto L2e
            goto L42
        L2e:
            int r7 = r1.length
            if (r2 < r7) goto L39
            com.fasterxml.jackson.core.util.TextBuffer r7 = r6._textBuffer
            char[] r7 = r7.finishCurrentSegment()
            r2 = 0
            r1 = r7
        L39:
            int r7 = r2 + 1
            char r8 = (char) r3
            r1[r2] = r8
            int r5 = r5 + 1
            r2 = r7
            goto L3
        L42:
            r7 = 46
            if (r3 == r7) goto L70
            r7 = 101(0x65, float:1.42E-43)
            if (r3 == r7) goto L70
            r7 = 69
            if (r3 != r7) goto L4f
            goto L70
        L4f:
            int r10 = r10 + (-1)
            r6._inputPtr = r10
            com.fasterxml.jackson.core.util.TextBuffer r7 = r6._textBuffer
            r7.setCurrentLength(r2)
            com.fasterxml.jackson.core.json.JsonReadContext r7 = r6._parsingContext
            boolean r7 = r7.inRoot()
            if (r7 == 0) goto L6b
            byte[] r7 = r6._inputBuffer
            int r8 = r6._inputPtr
            r7 = r7[r8]
            r7 = r7 & 255(0xff, float:3.57E-43)
            r6._verifyRootSpace(r7)
        L6b:
            com.fasterxml.jackson.core.JsonToken r7 = r6.resetInt(r9, r5)
            return r7
        L70:
            r0 = r6
            r4 = r9
            com.fasterxml.jackson.core.JsonToken r7 = r0._parseFloat(r1, r2, r3, r4, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8StreamJsonParser._parseNumber2(char[], int, boolean, int):com.fasterxml.jackson.core.JsonToken");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0043, code lost:
    
        _reportInvalidEOF(" in a comment", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0049, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void _skipCComment() throws java.io.IOException {
        /*
            r5 = this;
            int[] r0 = com.fasterxml.jackson.core.p006io.CharTypes.getInputCodeComment()
        L4:
            int r1 = r5._inputPtr
            int r2 = r5._inputEnd
            if (r1 < r2) goto L10
            boolean r1 = r5._loadMore()
            if (r1 == 0) goto L43
        L10:
            byte[] r1 = r5._inputBuffer
            int r2 = r5._inputPtr
            int r3 = r2 + 1
            r5._inputPtr = r3
            r1 = r1[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = r0[r1]
            if (r2 == 0) goto L4
            r4 = 2
            if (r2 == r4) goto L6e
            r4 = 3
            if (r2 == r4) goto L6a
            r4 = 4
            if (r2 == r4) goto L66
            r4 = 10
            if (r2 == r4) goto L5d
            r4 = 13
            if (r2 == r4) goto L59
            r4 = 42
            if (r2 == r4) goto L39
            r5._reportInvalidChar(r1)
            goto L4
        L39:
            int r1 = r5._inputEnd
            if (r3 < r1) goto L4a
            boolean r1 = r5._loadMore()
            if (r1 != 0) goto L4a
        L43:
            r0 = 0
            java.lang.String r1 = " in a comment"
            r5._reportInvalidEOF(r1, r0)
            return
        L4a:
            byte[] r1 = r5._inputBuffer
            int r2 = r5._inputPtr
            r1 = r1[r2]
            r3 = 47
            if (r1 != r3) goto L4
            int r2 = r2 + 1
            r5._inputPtr = r2
            return
        L59:
            r5._skipCR()
            goto L4
        L5d:
            int r1 = r5._currInputRow
            int r1 = r1 + 1
            r5._currInputRow = r1
            r5._currInputRowStart = r3
            goto L4
        L66:
            r5._skipUtf8_4(r1)
            goto L4
        L6a:
            r5._skipUtf8_3()
            goto L4
        L6e:
            r5._skipUtf8_2()
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8StreamJsonParser._skipCComment():void");
    }

    private final int _skipColon() throws IOException {
        int i2 = this._inputPtr;
        if (i2 + 4 >= this._inputEnd) {
            return _skipColon2(false);
        }
        byte[] bArr = this._inputBuffer;
        byte b = bArr[i2];
        if (b == 58) {
            int i3 = i2 + 1;
            this._inputPtr = i3;
            byte b2 = bArr[i3];
            if (b2 > 32) {
                if (b2 == 47 || b2 == 35) {
                    return _skipColon2(true);
                }
                this._inputPtr = i3 + 1;
                return b2;
            }
            if (b2 == 32 || b2 == 9) {
                int i4 = i3 + 1;
                this._inputPtr = i4;
                byte b3 = bArr[i4];
                if (b3 > 32) {
                    if (b3 == 47 || b3 == 35) {
                        return _skipColon2(true);
                    }
                    this._inputPtr = i4 + 1;
                    return b3;
                }
            }
            return _skipColon2(true);
        }
        if (b == 32 || b == 9) {
            int i5 = i2 + 1;
            this._inputPtr = i5;
            b = bArr[i5];
        }
        if (b != 58) {
            return _skipColon2(false);
        }
        int i6 = this._inputPtr + 1;
        this._inputPtr = i6;
        byte b4 = bArr[i6];
        if (b4 > 32) {
            if (b4 == 47 || b4 == 35) {
                return _skipColon2(true);
            }
            this._inputPtr = i6 + 1;
            return b4;
        }
        if (b4 == 32 || b4 == 9) {
            int i7 = i6 + 1;
            this._inputPtr = i7;
            byte b5 = bArr[i7];
            if (b5 > 32) {
                if (b5 == 47 || b5 == 35) {
                    return _skipColon2(true);
                }
                this._inputPtr = i7 + 1;
                return b5;
            }
        }
        return _skipColon2(true);
    }

    private final int _skipColon2(boolean z) throws IOException {
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                StringBuilder m24u = C0000a.m24u(" within/between ");
                m24u.append(this._parsingContext.typeDesc());
                m24u.append(" entries");
                _reportInvalidEOF(m24u.toString(), null);
                return -1;
            }
            byte[] bArr = this._inputBuffer;
            int i2 = this._inputPtr;
            int i3 = i2 + 1;
            this._inputPtr = i3;
            int i4 = bArr[i2] & 255;
            if (i4 > 32) {
                if (i4 == 47) {
                    _skipComment();
                } else if (i4 != 35 || !_skipYAMLComment()) {
                    if (z) {
                        return i4;
                    }
                    if (i4 != 58) {
                        _reportUnexpectedChar(i4, "was expecting a colon to separate field name and value");
                    }
                    z = true;
                }
            } else if (i4 != 32) {
                if (i4 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = i3;
                } else if (i4 == 13) {
                    _skipCR();
                } else if (i4 != 9) {
                    _throwInvalidSpace(i4);
                }
            }
        }
    }

    private final int _skipColonFast(int i2) throws IOException {
        byte[] bArr = this._inputBuffer;
        int i3 = i2 + 1;
        byte b = bArr[i2];
        if (b == 58) {
            int i4 = i3 + 1;
            byte b2 = bArr[i3];
            if (b2 > 32) {
                if (b2 != 47 && b2 != 35) {
                    this._inputPtr = i4;
                    return b2;
                }
            } else if (b2 == 32 || b2 == 9) {
                int i5 = i4 + 1;
                byte b3 = bArr[i4];
                if (b3 > 32 && b3 != 47 && b3 != 35) {
                    this._inputPtr = i5;
                    return b3;
                }
                i4 = i5;
            }
            this._inputPtr = i4 - 1;
            return _skipColon2(true);
        }
        if (b == 32 || b == 9) {
            int i6 = i3 + 1;
            byte b4 = bArr[i3];
            i3 = i6;
            b = b4;
        }
        if (b != 58) {
            this._inputPtr = i3 - 1;
            return _skipColon2(false);
        }
        int i7 = i3 + 1;
        byte b5 = bArr[i3];
        if (b5 > 32) {
            if (b5 != 47 && b5 != 35) {
                this._inputPtr = i7;
                return b5;
            }
        } else if (b5 == 32 || b5 == 9) {
            int i8 = i7 + 1;
            byte b6 = bArr[i7];
            if (b6 > 32 && b6 != 47 && b6 != 35) {
                this._inputPtr = i8;
                return b6;
            }
            i7 = i8;
        }
        this._inputPtr = i7 - 1;
        return _skipColon2(true);
    }

    private final void _skipComment() throws IOException {
        if ((this._features & FEAT_MASK_ALLOW_JAVA_COMMENTS) == 0) {
            _reportUnexpectedChar(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            _reportInvalidEOF(" in a comment", null);
        }
        byte[] bArr = this._inputBuffer;
        int i2 = this._inputPtr;
        this._inputPtr = i2 + 1;
        int i3 = bArr[i2] & 255;
        if (i3 == 47) {
            _skipLine();
        } else if (i3 == 42) {
            _skipCComment();
        } else {
            _reportUnexpectedChar(i3, "was expecting either '*' or '/' for a comment");
        }
    }

    private final void _skipLine() throws IOException {
        int[] inputCodeComment = CharTypes.getInputCodeComment();
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                return;
            }
            byte[] bArr = this._inputBuffer;
            int i2 = this._inputPtr;
            int i3 = i2 + 1;
            this._inputPtr = i3;
            int i4 = bArr[i2] & 255;
            int i5 = inputCodeComment[i4];
            if (i5 != 0) {
                if (i5 == 2) {
                    _skipUtf8_2();
                } else if (i5 == 3) {
                    _skipUtf8_3();
                } else if (i5 == 4) {
                    _skipUtf8_4(i4);
                } else if (i5 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = i3;
                    return;
                } else if (i5 == 13) {
                    _skipCR();
                    return;
                } else if (i5 != 42 && i5 < 0) {
                    _reportInvalidChar(i4);
                }
            }
        }
    }

    private final void _skipUtf8_2() throws IOException {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i2 = this._inputPtr;
        int i3 = i2 + 1;
        this._inputPtr = i3;
        byte b = bArr[i2];
        if ((b & 192) != 128) {
            _reportInvalidOther(b & 255, i3);
        }
    }

    private final void _skipUtf8_3() throws IOException {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i2 = this._inputPtr;
        int i3 = i2 + 1;
        this._inputPtr = i3;
        byte b = bArr[i2];
        if ((b & 192) != 128) {
            _reportInvalidOther(b & 255, i3);
        }
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr2 = this._inputBuffer;
        int i4 = this._inputPtr;
        int i5 = i4 + 1;
        this._inputPtr = i5;
        byte b2 = bArr2[i4];
        if ((b2 & 192) != 128) {
            _reportInvalidOther(b2 & 255, i5);
        }
    }

    private final void _skipUtf8_4(int i2) throws IOException {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i3 = this._inputPtr;
        int i4 = i3 + 1;
        this._inputPtr = i4;
        byte b = bArr[i3];
        if ((b & 192) != 128) {
            _reportInvalidOther(b & 255, i4);
        }
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr2 = this._inputBuffer;
        int i5 = this._inputPtr;
        int i6 = i5 + 1;
        this._inputPtr = i6;
        byte b2 = bArr2[i5];
        if ((b2 & 192) != 128) {
            _reportInvalidOther(b2 & 255, i6);
        }
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr3 = this._inputBuffer;
        int i7 = this._inputPtr;
        int i8 = i7 + 1;
        this._inputPtr = i8;
        byte b3 = bArr3[i7];
        if ((b3 & 192) != 128) {
            _reportInvalidOther(b3 & 255, i8);
        }
    }

    private final int _skipWS() throws IOException {
        while (true) {
            int i2 = this._inputPtr;
            if (i2 >= this._inputEnd) {
                return _skipWS2();
            }
            byte[] bArr = this._inputBuffer;
            int i3 = i2 + 1;
            this._inputPtr = i3;
            int i4 = bArr[i2] & 255;
            if (i4 > 32) {
                if (i4 != 47 && i4 != 35) {
                    return i4;
                }
                this._inputPtr = i3 - 1;
                return _skipWS2();
            }
            if (i4 != 32) {
                if (i4 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = i3;
                } else if (i4 == 13) {
                    _skipCR();
                } else if (i4 != 9) {
                    _throwInvalidSpace(i4);
                }
            }
        }
    }

    private final int _skipWS2() throws IOException {
        int i2;
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                StringBuilder m24u = C0000a.m24u("Unexpected end-of-input within/between ");
                m24u.append(this._parsingContext.typeDesc());
                m24u.append(" entries");
                throw _constructError(m24u.toString());
            }
            byte[] bArr = this._inputBuffer;
            int i3 = this._inputPtr;
            int i4 = i3 + 1;
            this._inputPtr = i4;
            i2 = bArr[i3] & 255;
            if (i2 > 32) {
                if (i2 == 47) {
                    _skipComment();
                } else if (i2 != 35 || !_skipYAMLComment()) {
                    break;
                }
            } else if (i2 != 32) {
                if (i2 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = i4;
                } else if (i2 == 13) {
                    _skipCR();
                } else if (i2 != 9) {
                    _throwInvalidSpace(i2);
                }
            }
        }
        return i2;
    }

    private final int _skipWSOrEnd() throws IOException {
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            return _eofAsNextChar();
        }
        byte[] bArr = this._inputBuffer;
        int i2 = this._inputPtr;
        int i3 = i2 + 1;
        this._inputPtr = i3;
        int i4 = bArr[i2] & 255;
        if (i4 > 32) {
            if (i4 != 47 && i4 != 35) {
                return i4;
            }
            this._inputPtr = i3 - 1;
            return _skipWSOrEnd2();
        }
        if (i4 != 32) {
            if (i4 == 10) {
                this._currInputRow++;
                this._currInputRowStart = i3;
            } else if (i4 == 13) {
                _skipCR();
            } else if (i4 != 9) {
                _throwInvalidSpace(i4);
            }
        }
        while (true) {
            int i5 = this._inputPtr;
            if (i5 >= this._inputEnd) {
                return _skipWSOrEnd2();
            }
            byte[] bArr2 = this._inputBuffer;
            int i6 = i5 + 1;
            this._inputPtr = i6;
            int i7 = bArr2[i5] & 255;
            if (i7 > 32) {
                if (i7 != 47 && i7 != 35) {
                    return i7;
                }
                this._inputPtr = i6 - 1;
                return _skipWSOrEnd2();
            }
            if (i7 != 32) {
                if (i7 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = i6;
                } else if (i7 == 13) {
                    _skipCR();
                } else if (i7 != 9) {
                    _throwInvalidSpace(i7);
                }
            }
        }
    }

    private final int _skipWSOrEnd2() throws IOException {
        int i2;
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                return _eofAsNextChar();
            }
            byte[] bArr = this._inputBuffer;
            int i3 = this._inputPtr;
            int i4 = i3 + 1;
            this._inputPtr = i4;
            i2 = bArr[i3] & 255;
            if (i2 > 32) {
                if (i2 == 47) {
                    _skipComment();
                } else if (i2 != 35 || !_skipYAMLComment()) {
                    break;
                }
            } else if (i2 != 32) {
                if (i2 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = i4;
                } else if (i2 == 13) {
                    _skipCR();
                } else if (i2 != 9) {
                    _throwInvalidSpace(i2);
                }
            }
        }
        return i2;
    }

    private final boolean _skipYAMLComment() throws IOException {
        if ((this._features & FEAT_MASK_ALLOW_YAML_COMMENTS) == 0) {
            return false;
        }
        _skipLine();
        return true;
    }

    private final void _updateLocation() {
        this._tokenInputRow = this._currInputRow;
        int i2 = this._inputPtr;
        this._tokenInputTotal = this._currInputProcessed + i2;
        this._tokenInputCol = i2 - this._currInputRowStart;
    }

    private final void _updateNameLocation() {
        this._nameStartRow = this._currInputRow;
        int i2 = this._inputPtr;
        this._nameStartOffset = i2;
        this._nameStartCol = i2 - this._currInputRowStart;
    }

    private final int _verifyNoLeadingZeroes() throws IOException {
        int i2;
        if ((this._inputPtr >= this._inputEnd && !_loadMore()) || (i2 = this._inputBuffer[this._inputPtr] & 255) < 48 || i2 > 57) {
            return 48;
        }
        if ((this._features & FEAT_MASK_LEADING_ZEROS) == 0) {
            reportInvalidNumber("Leading zeroes not allowed");
        }
        this._inputPtr++;
        if (i2 == 48) {
            do {
                if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                    break;
                }
                byte[] bArr = this._inputBuffer;
                int i3 = this._inputPtr;
                i2 = bArr[i3] & 255;
                if (i2 < 48 || i2 > 57) {
                    return 48;
                }
                this._inputPtr = i3 + 1;
            } while (i2 == 48);
        }
        return i2;
    }

    private final void _verifyRootSpace(int i2) throws IOException {
        int i3 = this._inputPtr + 1;
        this._inputPtr = i3;
        if (i2 != 9) {
            if (i2 == 10) {
                this._currInputRow++;
                this._currInputRowStart = i3;
            } else if (i2 == 13) {
                _skipCR();
            } else if (i2 != 32) {
                _reportMissingRootWS(i2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String addName(int[] r17, int r18, int r19) throws com.fasterxml.jackson.core.JsonParseException {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8StreamJsonParser.addName(int[], int, int):java.lang.String");
    }

    private final String findName(int i2, int i3) throws JsonParseException {
        int _padLastQuad = _padLastQuad(i2, i3);
        String findName = this._symbols.findName(_padLastQuad);
        if (findName != null) {
            return findName;
        }
        int[] iArr = this._quadBuffer;
        iArr[0] = _padLastQuad;
        return addName(iArr, 1, i3);
    }

    private int nextByte() throws IOException {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i2 = this._inputPtr;
        this._inputPtr = i2 + 1;
        return bArr[i2] & 255;
    }

    private final String parseName(int i2, int i3, int i4) throws IOException {
        return parseEscapedName(this._quadBuffer, 0, i2, i3, i4);
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public void _closeInput() throws IOException {
        if (this._inputStream != null) {
            if (this._ioContext.isResourceManaged() || isEnabled(JsonParser.Feature.AUTO_CLOSE_SOURCE)) {
                this._inputStream.close();
            }
            this._inputStream = null;
        }
    }

    public final byte[] _decodeBase64(Base64Variant base64Variant) throws IOException {
        ByteArrayBuilder _getByteArrayBuilder = _getByteArrayBuilder();
        while (true) {
            if (this._inputPtr >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            byte[] bArr = this._inputBuffer;
            int i2 = this._inputPtr;
            this._inputPtr = i2 + 1;
            int i3 = bArr[i2] & 255;
            if (i3 > 32) {
                int decodeBase64Char = base64Variant.decodeBase64Char(i3);
                if (decodeBase64Char < 0) {
                    if (i3 == 34) {
                        return _getByteArrayBuilder.toByteArray();
                    }
                    decodeBase64Char = _decodeBase64Escape(base64Variant, i3, 0);
                    if (decodeBase64Char < 0) {
                        continue;
                    }
                }
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr2 = this._inputBuffer;
                int i4 = this._inputPtr;
                this._inputPtr = i4 + 1;
                int i5 = bArr2[i4] & 255;
                int decodeBase64Char2 = base64Variant.decodeBase64Char(i5);
                if (decodeBase64Char2 < 0) {
                    decodeBase64Char2 = _decodeBase64Escape(base64Variant, i5, 1);
                }
                int i6 = (decodeBase64Char << 6) | decodeBase64Char2;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr3 = this._inputBuffer;
                int i7 = this._inputPtr;
                this._inputPtr = i7 + 1;
                int i8 = bArr3[i7] & 255;
                int decodeBase64Char3 = base64Variant.decodeBase64Char(i8);
                if (decodeBase64Char3 < 0) {
                    if (decodeBase64Char3 != -2) {
                        if (i8 == 34) {
                            _getByteArrayBuilder.append(i6 >> 4);
                            if (base64Variant.usesPadding()) {
                                this._inputPtr--;
                                _handleBase64MissingPadding(base64Variant);
                            }
                            return _getByteArrayBuilder.toByteArray();
                        }
                        decodeBase64Char3 = _decodeBase64Escape(base64Variant, i8, 2);
                    }
                    if (decodeBase64Char3 == -2) {
                        if (this._inputPtr >= this._inputEnd) {
                            _loadMoreGuaranteed();
                        }
                        byte[] bArr4 = this._inputBuffer;
                        int i9 = this._inputPtr;
                        this._inputPtr = i9 + 1;
                        int i10 = bArr4[i9] & 255;
                        if (!base64Variant.usesPaddingChar(i10) && _decodeBase64Escape(base64Variant, i10, 3) != -2) {
                            StringBuilder m24u = C0000a.m24u("expected padding character '");
                            m24u.append(base64Variant.getPaddingChar());
                            m24u.append("'");
                            throw reportInvalidBase64Char(base64Variant, i10, 3, m24u.toString());
                        }
                        _getByteArrayBuilder.append(i6 >> 4);
                    }
                }
                int i11 = (i6 << 6) | decodeBase64Char3;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr5 = this._inputBuffer;
                int i12 = this._inputPtr;
                this._inputPtr = i12 + 1;
                int i13 = bArr5[i12] & 255;
                int decodeBase64Char4 = base64Variant.decodeBase64Char(i13);
                if (decodeBase64Char4 < 0) {
                    if (decodeBase64Char4 != -2) {
                        if (i13 == 34) {
                            _getByteArrayBuilder.appendTwoBytes(i11 >> 2);
                            if (base64Variant.usesPadding()) {
                                this._inputPtr--;
                                _handleBase64MissingPadding(base64Variant);
                            }
                            return _getByteArrayBuilder.toByteArray();
                        }
                        decodeBase64Char4 = _decodeBase64Escape(base64Variant, i13, 3);
                    }
                    if (decodeBase64Char4 == -2) {
                        _getByteArrayBuilder.appendTwoBytes(i11 >> 2);
                    }
                }
                _getByteArrayBuilder.appendThreeBytes((i11 << 6) | decodeBase64Char4);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int _decodeCharForError(int r7) throws java.io.IOException {
        /*
            r6 = this;
            r7 = r7 & 255(0xff, float:3.57E-43)
            r0 = 127(0x7f, float:1.78E-43)
            if (r7 <= r0) goto L68
            r0 = r7 & 224(0xe0, float:3.14E-43)
            r1 = 2
            r2 = 1
            r3 = 192(0xc0, float:2.69E-43)
            if (r0 != r3) goto L12
            r7 = r7 & 31
        L10:
            r0 = 1
            goto L2c
        L12:
            r0 = r7 & 240(0xf0, float:3.36E-43)
            r3 = 224(0xe0, float:3.14E-43)
            if (r0 != r3) goto L1c
            r7 = r7 & 15
            r0 = 2
            goto L2c
        L1c:
            r0 = r7 & 248(0xf8, float:3.48E-43)
            r3 = 240(0xf0, float:3.36E-43)
            if (r0 != r3) goto L26
            r7 = r7 & 7
            r0 = 3
            goto L2c
        L26:
            r0 = r7 & 255(0xff, float:3.57E-43)
            r6._reportInvalidInitial(r0)
            goto L10
        L2c:
            int r3 = r6.nextByte()
            r4 = r3 & 192(0xc0, float:2.69E-43)
            r5 = 128(0x80, float:1.8E-43)
            if (r4 == r5) goto L3b
            r4 = r3 & 255(0xff, float:3.57E-43)
            r6._reportInvalidOther(r4)
        L3b:
            int r7 = r7 << 6
            r3 = r3 & 63
            r7 = r7 | r3
            if (r0 <= r2) goto L68
            int r2 = r6.nextByte()
            r3 = r2 & 192(0xc0, float:2.69E-43)
            if (r3 == r5) goto L4f
            r3 = r2 & 255(0xff, float:3.57E-43)
            r6._reportInvalidOther(r3)
        L4f:
            int r7 = r7 << 6
            r2 = r2 & 63
            r7 = r7 | r2
            if (r0 <= r1) goto L68
            int r0 = r6.nextByte()
            r1 = r0 & 192(0xc0, float:2.69E-43)
            if (r1 == r5) goto L63
            r1 = r0 & 255(0xff, float:3.57E-43)
            r6._reportInvalidOther(r1)
        L63:
            int r7 = r7 << 6
            r0 = r0 & 63
            r7 = r7 | r0
        L68:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8StreamJsonParser._decodeCharForError(int):int");
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public char _decodeEscaped() throws IOException {
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            _reportInvalidEOF(" in character escape sequence", JsonToken.VALUE_STRING);
        }
        byte[] bArr = this._inputBuffer;
        int i2 = this._inputPtr;
        this._inputPtr = i2 + 1;
        byte b = bArr[i2];
        if (b == 34 || b == 47 || b == 92) {
            return (char) b;
        }
        if (b == 98) {
            return '\b';
        }
        if (b == 102) {
            return '\f';
        }
        if (b == 110) {
            return '\n';
        }
        if (b == 114) {
            return '\r';
        }
        if (b == 116) {
            return '\t';
        }
        if (b != 117) {
            return _handleUnrecognizedCharacterEscape((char) _decodeCharForError(b));
        }
        int i3 = 0;
        for (int i4 = 0; i4 < 4; i4++) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(" in character escape sequence", JsonToken.VALUE_STRING);
            }
            byte[] bArr2 = this._inputBuffer;
            int i5 = this._inputPtr;
            this._inputPtr = i5 + 1;
            byte b2 = bArr2[i5];
            int charToHex = CharTypes.charToHex(b2);
            if (charToHex < 0) {
                _reportUnexpectedChar(b2 & 255, "expected a hex-digit for character escape sequence");
            }
            i3 = (i3 << 4) | charToHex;
        }
        return (char) i3;
    }

    public String _finishAndReturnString() throws IOException {
        int i2 = this._inputPtr;
        if (i2 >= this._inputEnd) {
            _loadMoreGuaranteed();
            i2 = this._inputPtr;
        }
        int i3 = 0;
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int[] iArr = _icUTF8;
        int min = Math.min(this._inputEnd, emptyAndGetCurrentSegment.length + i2);
        byte[] bArr = this._inputBuffer;
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
                return this._textBuffer.setCurrentAndReturn(i3);
            }
        }
        this._inputPtr = i2;
        _finishString2(emptyAndGetCurrentSegment, i3);
        return this._textBuffer.contentsAsString();
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public void _finishString() throws IOException {
        int i2 = this._inputPtr;
        if (i2 >= this._inputEnd) {
            _loadMoreGuaranteed();
            i2 = this._inputPtr;
        }
        int i3 = 0;
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int[] iArr = _icUTF8;
        int min = Math.min(this._inputEnd, emptyAndGetCurrentSegment.length + i2);
        byte[] bArr = this._inputBuffer;
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
                return;
            }
        }
        this._inputPtr = i2;
        _finishString2(emptyAndGetCurrentSegment, i3);
    }

    public final String _getText2(JsonToken jsonToken) {
        if (jsonToken == null) {
            return null;
        }
        int m5359id = jsonToken.m5359id();
        return m5359id != 5 ? (m5359id == 6 || m5359id == 7 || m5359id == 8) ? this._textBuffer.contentsAsString() : jsonToken.asString() : this._parsingContext.getCurrentName();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
    
        if (r6 != 39) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        r5 = r1[r6];
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
    
        if (r5 == 1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
    
        if (r5 == 2) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
    
        if (r5 == 3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005b, code lost:
    
        if (r5 == 4) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005f, code lost:
    
        if (r6 >= 32) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0061, code lost:
    
        _throwUnquotedSpace(r6, "string value");
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0066, code lost:
    
        _reportInvalidChar(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a5, code lost:
    
        if (r4 < r0.length) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a7, code lost:
    
        r0 = r10._textBuffer.finishCurrentSegment();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ae, code lost:
    
        r0[r4] = (char) r6;
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006a, code lost:
    
        r5 = _decodeUtf8_4(r6);
        r6 = r4 + 1;
        r0[r4] = (char) (55296 | (r5 >> 10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007a, code lost:
    
        if (r6 < r0.length) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007c, code lost:
    
        r0 = r10._textBuffer.finishCurrentSegment();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0085, code lost:
    
        r6 = 56320 | (r5 & 1023);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0084, code lost:
    
        r4 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008f, code lost:
    
        if ((r10._inputEnd - r7) < 2) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0091, code lost:
    
        r6 = _decodeUtf8_3fast(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0096, code lost:
    
        r6 = _decodeUtf8_3(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009b, code lost:
    
        r6 = _decodeUtf8_2(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a0, code lost:
    
        r6 = _decodeEscaped();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0047, code lost:
    
        r10._textBuffer.setCurrentLength(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x004e, code lost:
    
        return com.fasterxml.jackson.core.JsonToken.VALUE_STRING;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.fasterxml.jackson.core.JsonToken _handleApos() throws java.io.IOException {
        /*
            r10 = this;
            com.fasterxml.jackson.core.util.TextBuffer r0 = r10._textBuffer
            char[] r0 = r0.emptyAndGetCurrentSegment()
            int[] r1 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser._icUTF8
            byte[] r2 = r10._inputBuffer
            r3 = 0
            r4 = 0
        Lc:
            int r5 = r10._inputPtr
            int r6 = r10._inputEnd
            if (r5 < r6) goto L15
            r10._loadMoreGuaranteed()
        L15:
            int r5 = r0.length
            if (r4 < r5) goto L1f
            com.fasterxml.jackson.core.util.TextBuffer r0 = r10._textBuffer
            char[] r0 = r0.finishCurrentSegment()
            r4 = 0
        L1f:
            int r5 = r10._inputEnd
            int r6 = r10._inputPtr
            int r7 = r0.length
            int r7 = r7 - r4
            int r7 = r7 + r6
            if (r7 >= r5) goto L29
            r5 = r7
        L29:
            int r6 = r10._inputPtr
            if (r6 >= r5) goto Lc
            int r7 = r6 + 1
            r10._inputPtr = r7
            r6 = r2[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r8 = 39
            if (r6 == r8) goto L45
            r9 = r1[r6]
            if (r9 == 0) goto L3e
            goto L45
        L3e:
            int r7 = r4 + 1
            char r6 = (char) r6
            r0[r4] = r6
            r4 = r7
            goto L29
        L45:
            if (r6 != r8) goto L4f
            com.fasterxml.jackson.core.util.TextBuffer r0 = r10._textBuffer
            r0.setCurrentLength(r4)
            com.fasterxml.jackson.core.JsonToken r0 = com.fasterxml.jackson.core.JsonToken.VALUE_STRING
            return r0
        L4f:
            r5 = r1[r6]
            r8 = 1
            if (r5 == r8) goto La0
            r8 = 2
            if (r5 == r8) goto L9b
            r9 = 3
            if (r5 == r9) goto L8c
            r7 = 4
            if (r5 == r7) goto L6a
            r5 = 32
            if (r6 >= r5) goto L66
            java.lang.String r5 = "string value"
            r10._throwUnquotedSpace(r6, r5)
        L66:
            r10._reportInvalidChar(r6)
            goto La4
        L6a:
            int r5 = r10._decodeUtf8_4(r6)
            int r6 = r4 + 1
            r7 = 55296(0xd800, float:7.7486E-41)
            int r8 = r5 >> 10
            r7 = r7 | r8
            char r7 = (char) r7
            r0[r4] = r7
            int r4 = r0.length
            if (r6 < r4) goto L84
            com.fasterxml.jackson.core.util.TextBuffer r0 = r10._textBuffer
            char[] r0 = r0.finishCurrentSegment()
            r4 = 0
            goto L85
        L84:
            r4 = r6
        L85:
            r6 = 56320(0xdc00, float:7.8921E-41)
            r5 = r5 & 1023(0x3ff, float:1.434E-42)
            r6 = r6 | r5
            goto La4
        L8c:
            int r5 = r10._inputEnd
            int r5 = r5 - r7
            if (r5 < r8) goto L96
            int r6 = r10._decodeUtf8_3fast(r6)
            goto La4
        L96:
            int r6 = r10._decodeUtf8_3(r6)
            goto La4
        L9b:
            int r6 = r10._decodeUtf8_2(r6)
            goto La4
        La0:
            char r6 = r10._decodeEscaped()
        La4:
            int r5 = r0.length
            if (r4 < r5) goto Lae
            com.fasterxml.jackson.core.util.TextBuffer r0 = r10._textBuffer
            char[] r0 = r0.finishCurrentSegment()
            r4 = 0
        Lae:
            int r5 = r4 + 1
            char r6 = (char) r6
            r0[r4] = r6
            r4 = r5
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8StreamJsonParser._handleApos():com.fasterxml.jackson.core.JsonToken");
    }

    public JsonToken _handleInvalidNumberStart(int i2, boolean z) throws IOException {
        String str;
        while (i2 == 73) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOFInValue(JsonToken.VALUE_NUMBER_FLOAT);
            }
            byte[] bArr = this._inputBuffer;
            int i3 = this._inputPtr;
            this._inputPtr = i3 + 1;
            i2 = bArr[i3];
            if (i2 != 78) {
                if (i2 != 110) {
                    break;
                }
                str = z ? "-Infinity" : "+Infinity";
            } else {
                str = z ? "-INF" : "+INF";
            }
            _matchToken(str, 3);
            if ((this._features & FEAT_MASK_NON_NUM_NUMBERS) != 0) {
                return resetAsNaN(str, z ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY);
            }
            _reportError("Non-standard token '%s': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow", str);
        }
        reportUnexpectedNumberChar(i2, "expected digit (0-9) to follow minus sign, for valid numeric value");
        return null;
    }

    public String _handleOddName(int i2) throws IOException {
        if (i2 == 39 && (this._features & FEAT_MASK_ALLOW_SINGLE_QUOTES) != 0) {
            return _parseAposName();
        }
        if ((this._features & FEAT_MASK_ALLOW_UNQUOTED_NAMES) == 0) {
            _reportUnexpectedChar((char) _decodeCharForError(i2), "was expecting double-quote to start field name");
        }
        int[] inputCodeUtf8JsNames = CharTypes.getInputCodeUtf8JsNames();
        if (inputCodeUtf8JsNames[i2] != 0) {
            _reportUnexpectedChar(i2, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        int[] iArr = this._quadBuffer;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i3 < 4) {
                i3++;
                i5 = i2 | (i5 << 8);
            } else {
                if (i4 >= iArr.length) {
                    iArr = ParserBase.growArrayBy(iArr, iArr.length);
                    this._quadBuffer = iArr;
                }
                iArr[i4] = i5;
                i5 = i2;
                i4++;
                i3 = 1;
            }
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(" in field name", JsonToken.FIELD_NAME);
            }
            byte[] bArr = this._inputBuffer;
            int i6 = this._inputPtr;
            i2 = bArr[i6] & 255;
            if (inputCodeUtf8JsNames[i2] != 0) {
                break;
            }
            this._inputPtr = i6 + 1;
        }
        if (i3 > 0) {
            if (i4 >= iArr.length) {
                int[] growArrayBy = ParserBase.growArrayBy(iArr, iArr.length);
                this._quadBuffer = growArrayBy;
                iArr = growArrayBy;
            }
            iArr[i4] = i5;
            i4++;
        }
        String findName = this._symbols.findName(iArr, i4);
        return findName == null ? addName(iArr, i4, i3) : findName;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001b, code lost:
    
        if (r4 != 44) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        if ((r3._features & com.fasterxml.jackson.core.json.UTF8StreamJsonParser.FEAT_MASK_ALLOW_MISSING) == 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        r3._inputPtr--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
    
        return com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0048, code lost:
    
        if (r3._parsingContext.inArray() == false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.fasterxml.jackson.core.JsonToken _handleUnexpectedValue(int r4) throws java.io.IOException {
        /*
            r3 = this;
            r0 = 39
            if (r4 == r0) goto L92
            r0 = 73
            r1 = 1
            if (r4 == r0) goto L79
            r0 = 78
            if (r4 == r0) goto L60
            r0 = 93
            if (r4 == r0) goto L42
            r0 = 125(0x7d, float:1.75E-43)
            if (r4 == r0) goto L5a
            r0 = 43
            if (r4 == r0) goto L1f
            r0 = 44
            if (r4 == r0) goto L4b
            goto L9e
        L1f:
            int r4 = r3._inputPtr
            int r0 = r3._inputEnd
            if (r4 < r0) goto L30
            boolean r4 = r3._loadMore()
            if (r4 != 0) goto L30
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT
            r3._reportInvalidEOFInValue(r4)
        L30:
            byte[] r4 = r3._inputBuffer
            int r0 = r3._inputPtr
            int r1 = r0 + 1
            r3._inputPtr = r1
            r4 = r4[r0]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r0 = 0
            com.fasterxml.jackson.core.JsonToken r4 = r3._handleInvalidNumberStart(r4, r0)
            return r4
        L42:
            com.fasterxml.jackson.core.json.JsonReadContext r0 = r3._parsingContext
            boolean r0 = r0.inArray()
            if (r0 != 0) goto L4b
            goto L9e
        L4b:
            int r0 = r3._features
            int r2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.FEAT_MASK_ALLOW_MISSING
            r0 = r0 & r2
            if (r0 == 0) goto L5a
            int r4 = r3._inputPtr
            int r4 = r4 - r1
            r3._inputPtr = r4
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            return r4
        L5a:
            java.lang.String r0 = "expected a value"
            r3._reportUnexpectedChar(r4, r0)
            goto L92
        L60:
            java.lang.String r0 = "NaN"
            r3._matchToken(r0, r1)
            int r1 = r3._features
            int r2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.FEAT_MASK_NON_NUM_NUMBERS
            r1 = r1 & r2
            if (r1 == 0) goto L73
            r1 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            com.fasterxml.jackson.core.JsonToken r4 = r3.resetAsNaN(r0, r1)
            return r4
        L73:
            java.lang.String r0 = "Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"
            r3._reportError(r0)
            goto L9e
        L79:
            java.lang.String r0 = "Infinity"
            r3._matchToken(r0, r1)
            int r1 = r3._features
            int r2 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.FEAT_MASK_NON_NUM_NUMBERS
            r1 = r1 & r2
            if (r1 == 0) goto L8c
            r1 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            com.fasterxml.jackson.core.JsonToken r4 = r3.resetAsNaN(r0, r1)
            return r4
        L8c:
            java.lang.String r0 = "Non-standard token 'Infinity': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"
            r3._reportError(r0)
            goto L9e
        L92:
            int r0 = r3._features
            int r1 = com.fasterxml.jackson.core.json.UTF8StreamJsonParser.FEAT_MASK_ALLOW_SINGLE_QUOTES
            r0 = r0 & r1
            if (r0 == 0) goto L9e
            com.fasterxml.jackson.core.JsonToken r4 = r3._handleApos()
            return r4
        L9e:
            boolean r0 = java.lang.Character.isJavaIdentifierStart(r4)
            if (r0 == 0) goto Lb9
            java.lang.String r0 = ""
            java.lang.StringBuilder r0 = p000a.C0000a.m24u(r0)
            char r1 = (char) r4
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = r3._validJsonTokenList()
            r3._reportInvalidToken(r0, r1)
        Lb9:
            java.lang.String r0 = "expected a valid value "
            java.lang.StringBuilder r0 = p000a.C0000a.m24u(r0)
            java.lang.String r1 = r3._validJsonValueList()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3._reportUnexpectedChar(r4, r0)
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8StreamJsonParser._handleUnexpectedValue(int):com.fasterxml.jackson.core.JsonToken");
    }

    public final boolean _loadMore() throws IOException {
        byte[] bArr;
        int length;
        int i2 = this._inputEnd;
        InputStream inputStream = this._inputStream;
        if (inputStream == null || (length = (bArr = this._inputBuffer).length) == 0) {
            return false;
        }
        int read = inputStream.read(bArr, 0, length);
        if (read <= 0) {
            _closeInput();
            if (read == 0) {
                throw new IOException(C0000a.m18o(C0000a.m24u("InputStream.read() returned 0 characters when trying to read "), this._inputBuffer.length, " bytes"));
            }
            return false;
        }
        this._inputPtr = 0;
        this._inputEnd = read;
        this._currInputProcessed += read;
        this._currInputRowStart -= read;
        this._nameStartOffset -= i2;
        return true;
    }

    public void _loadMoreGuaranteed() throws IOException {
        if (_loadMore()) {
            return;
        }
        _reportInvalidEOF();
    }

    public final void _matchFalse() throws IOException {
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
                            return;
                        }
                    }
                }
            }
        }
        _matchToken2("false", 1);
    }

    public final void _matchNull() throws IOException {
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
                        return;
                    }
                }
            }
        }
        _matchToken2("null", 1);
    }

    public final void _matchToken(String str, int i2) throws IOException {
        int i3;
        int length = str.length();
        if (this._inputPtr + length >= this._inputEnd) {
            _matchToken2(str, i2);
            return;
        }
        do {
            if (this._inputBuffer[this._inputPtr] != str.charAt(i2)) {
                _reportInvalidToken(str.substring(0, i2));
            }
            i3 = this._inputPtr + 1;
            this._inputPtr = i3;
            i2++;
        } while (i2 < length);
        int i4 = this._inputBuffer[i3] & 255;
        if (i4 < 48 || i4 == 93 || i4 == 125) {
            return;
        }
        _checkMatchEnd(str, i2, i4);
    }

    public final void _matchTrue() throws IOException {
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
                        return;
                    }
                }
            }
        }
        _matchToken2("true", 1);
    }

    public String _parseAposName() throws IOException {
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            _reportInvalidEOF(": was expecting closing ''' for field name", JsonToken.FIELD_NAME);
        }
        byte[] bArr = this._inputBuffer;
        int i2 = this._inputPtr;
        this._inputPtr = i2 + 1;
        int i3 = bArr[i2] & 255;
        if (i3 == 39) {
            return "";
        }
        int[] iArr = this._quadBuffer;
        int[] iArr2 = _icLatin1;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i3 != 39) {
            if (iArr2[i3] != 0 && i3 != 34) {
                if (i3 != 92) {
                    _throwUnquotedSpace(i3, "name");
                } else {
                    i3 = _decodeEscaped();
                }
                if (i3 > 127) {
                    if (i4 >= 4) {
                        if (i5 >= iArr.length) {
                            iArr = ParserBase.growArrayBy(iArr, iArr.length);
                            this._quadBuffer = iArr;
                        }
                        iArr[i5] = i6;
                        i5++;
                        i4 = 0;
                        i6 = 0;
                    }
                    if (i3 < 2048) {
                        i6 = (i6 << 8) | (i3 >> 6) | 192;
                        i4++;
                    } else {
                        int i7 = (i6 << 8) | (i3 >> 12) | 224;
                        int i8 = i4 + 1;
                        if (i8 >= 4) {
                            if (i5 >= iArr.length) {
                                iArr = ParserBase.growArrayBy(iArr, iArr.length);
                                this._quadBuffer = iArr;
                            }
                            iArr[i5] = i7;
                            i5++;
                            i8 = 0;
                            i7 = 0;
                        }
                        i6 = (i7 << 8) | ((i3 >> 6) & 63) | 128;
                        i4 = i8 + 1;
                    }
                    i3 = (i3 & 63) | 128;
                }
            }
            if (i4 < 4) {
                i4++;
                i6 = i3 | (i6 << 8);
            } else {
                if (i5 >= iArr.length) {
                    iArr = ParserBase.growArrayBy(iArr, iArr.length);
                    this._quadBuffer = iArr;
                }
                iArr[i5] = i6;
                i6 = i3;
                i5++;
                i4 = 1;
            }
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(" in field name", JsonToken.FIELD_NAME);
            }
            byte[] bArr2 = this._inputBuffer;
            int i9 = this._inputPtr;
            this._inputPtr = i9 + 1;
            i3 = bArr2[i9] & 255;
        }
        if (i4 > 0) {
            if (i5 >= iArr.length) {
                int[] growArrayBy = ParserBase.growArrayBy(iArr, iArr.length);
                this._quadBuffer = growArrayBy;
                iArr = growArrayBy;
            }
            iArr[i5] = _padLastQuad(i6, i4);
            i5++;
        }
        String findName = this._symbols.findName(iArr, i5);
        return findName == null ? addName(iArr, i5, i4) : findName;
    }

    public final String _parseName(int i2) throws IOException {
        if (i2 != 34) {
            return _handleOddName(i2);
        }
        int i3 = this._inputPtr;
        if (i3 + 13 > this._inputEnd) {
            return slowParseName();
        }
        byte[] bArr = this._inputBuffer;
        int[] iArr = _icLatin1;
        int i4 = i3 + 1;
        this._inputPtr = i4;
        int i5 = bArr[i3] & 255;
        if (iArr[i5] != 0) {
            return i5 == 34 ? "" : parseName(0, i5, 0);
        }
        int i6 = i4 + 1;
        this._inputPtr = i6;
        int i7 = bArr[i4] & 255;
        if (iArr[i7] != 0) {
            return i7 == 34 ? findName(i5, 1) : parseName(i5, i7, 1);
        }
        int i8 = (i5 << 8) | i7;
        int i9 = i6 + 1;
        this._inputPtr = i9;
        int i10 = bArr[i6] & 255;
        if (iArr[i10] != 0) {
            return i10 == 34 ? findName(i8, 2) : parseName(i8, i10, 2);
        }
        int i11 = (i8 << 8) | i10;
        int i12 = i9 + 1;
        this._inputPtr = i12;
        int i13 = bArr[i9] & 255;
        if (iArr[i13] != 0) {
            return i13 == 34 ? findName(i11, 3) : parseName(i11, i13, 3);
        }
        int i14 = (i11 << 8) | i13;
        this._inputPtr = i12 + 1;
        int i15 = bArr[i12] & 255;
        if (iArr[i15] != 0) {
            return i15 == 34 ? findName(i14, 4) : parseName(i14, i15, 4);
        }
        this._quad1 = i14;
        return parseMediumName(i15);
    }

    public JsonToken _parseNegNumber() throws IOException {
        int i2;
        int i3;
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        emptyAndGetCurrentSegment[0] = '-';
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i4 = this._inputPtr;
        this._inputPtr = i4 + 1;
        int i5 = bArr[i4] & 255;
        if (i5 <= 48) {
            if (i5 != 48) {
                return _handleInvalidNumberStart(i5, true);
            }
            i5 = _verifyNoLeadingZeroes();
        } else if (i5 > 57) {
            return _handleInvalidNumberStart(i5, true);
        }
        int i6 = 2;
        emptyAndGetCurrentSegment[1] = (char) i5;
        int min = Math.min(this._inputEnd, (this._inputPtr + emptyAndGetCurrentSegment.length) - 2);
        int i7 = 1;
        while (true) {
            int i8 = this._inputPtr;
            if (i8 >= min) {
                return _parseNumber2(emptyAndGetCurrentSegment, i6, true, i7);
            }
            byte[] bArr2 = this._inputBuffer;
            i2 = i8 + 1;
            this._inputPtr = i2;
            i3 = bArr2[i8] & 255;
            if (i3 < 48 || i3 > 57) {
                break;
            }
            i7++;
            emptyAndGetCurrentSegment[i6] = (char) i3;
            i6++;
        }
        if (i3 == 46 || i3 == 101 || i3 == 69) {
            return _parseFloat(emptyAndGetCurrentSegment, i6, i3, true, i7);
        }
        this._inputPtr = i2 - 1;
        this._textBuffer.setCurrentLength(i6);
        if (this._parsingContext.inRoot()) {
            _verifyRootSpace(i3);
        }
        return resetInt(true, i7);
    }

    public JsonToken _parsePosNumber(int i2) throws IOException {
        int i3;
        int i4;
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        if (i2 == 48) {
            i2 = _verifyNoLeadingZeroes();
        }
        emptyAndGetCurrentSegment[0] = (char) i2;
        int min = Math.min(this._inputEnd, (this._inputPtr + emptyAndGetCurrentSegment.length) - 1);
        int i5 = 1;
        int i6 = 1;
        while (true) {
            int i7 = this._inputPtr;
            if (i7 >= min) {
                return _parseNumber2(emptyAndGetCurrentSegment, i5, false, i6);
            }
            byte[] bArr = this._inputBuffer;
            i3 = i7 + 1;
            this._inputPtr = i3;
            i4 = bArr[i7] & 255;
            if (i4 < 48 || i4 > 57) {
                break;
            }
            i6++;
            emptyAndGetCurrentSegment[i5] = (char) i4;
            i5++;
        }
        if (i4 == 46 || i4 == 101 || i4 == 69) {
            return _parseFloat(emptyAndGetCurrentSegment, i5, i4, false, i6);
        }
        this._inputPtr = i3 - 1;
        this._textBuffer.setCurrentLength(i5);
        if (this._parsingContext.inRoot()) {
            _verifyRootSpace(i4);
        }
        return resetInt(false, i6);
    }

    public int _readBinary(Base64Variant base64Variant, OutputStream outputStream, byte[] bArr) throws IOException {
        int i2 = 3;
        int length = bArr.length - 3;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (this._inputPtr >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            byte[] bArr2 = this._inputBuffer;
            int i5 = this._inputPtr;
            this._inputPtr = i5 + 1;
            int i6 = bArr2[i5] & 255;
            if (i6 > 32) {
                int decodeBase64Char = base64Variant.decodeBase64Char(i6);
                if (decodeBase64Char < 0) {
                    if (i6 == 34) {
                        break;
                    }
                    decodeBase64Char = _decodeBase64Escape(base64Variant, i6, 0);
                    if (decodeBase64Char < 0) {
                    }
                }
                if (i3 > length) {
                    i4 += i3;
                    outputStream.write(bArr, 0, i3);
                    i3 = 0;
                }
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr3 = this._inputBuffer;
                int i7 = this._inputPtr;
                this._inputPtr = i7 + 1;
                int i8 = bArr3[i7] & 255;
                int decodeBase64Char2 = base64Variant.decodeBase64Char(i8);
                if (decodeBase64Char2 < 0) {
                    decodeBase64Char2 = _decodeBase64Escape(base64Variant, i8, 1);
                }
                int i9 = (decodeBase64Char << 6) | decodeBase64Char2;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr4 = this._inputBuffer;
                int i10 = this._inputPtr;
                this._inputPtr = i10 + 1;
                int i11 = bArr4[i10] & 255;
                int decodeBase64Char3 = base64Variant.decodeBase64Char(i11);
                if (decodeBase64Char3 < 0) {
                    if (decodeBase64Char3 != -2) {
                        if (i11 == 34) {
                            int i12 = i3 + 1;
                            bArr[i3] = (byte) (i9 >> 4);
                            if (base64Variant.usesPadding()) {
                                this._inputPtr--;
                                _handleBase64MissingPadding(base64Variant);
                            }
                            i3 = i12;
                        } else {
                            decodeBase64Char3 = _decodeBase64Escape(base64Variant, i11, 2);
                        }
                    }
                    if (decodeBase64Char3 == -2) {
                        if (this._inputPtr >= this._inputEnd) {
                            _loadMoreGuaranteed();
                        }
                        byte[] bArr5 = this._inputBuffer;
                        int i13 = this._inputPtr;
                        this._inputPtr = i13 + 1;
                        int i14 = bArr5[i13] & 255;
                        if (!base64Variant.usesPaddingChar(i14) && _decodeBase64Escape(base64Variant, i14, i2) != -2) {
                            StringBuilder m24u = C0000a.m24u("expected padding character '");
                            m24u.append(base64Variant.getPaddingChar());
                            m24u.append("'");
                            throw reportInvalidBase64Char(base64Variant, i14, i2, m24u.toString());
                        }
                        bArr[i3] = (byte) (i9 >> 4);
                        i3++;
                    }
                }
                int i15 = (i9 << 6) | decodeBase64Char3;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr6 = this._inputBuffer;
                int i16 = this._inputPtr;
                this._inputPtr = i16 + 1;
                int i17 = bArr6[i16] & 255;
                int decodeBase64Char4 = base64Variant.decodeBase64Char(i17);
                if (decodeBase64Char4 < 0) {
                    if (decodeBase64Char4 != -2) {
                        if (i17 == 34) {
                            int i18 = i15 >> 2;
                            int i19 = i3 + 1;
                            bArr[i3] = (byte) (i18 >> 8);
                            i3 = i19 + 1;
                            bArr[i19] = (byte) i18;
                            if (base64Variant.usesPadding()) {
                                this._inputPtr--;
                                _handleBase64MissingPadding(base64Variant);
                            }
                        } else {
                            decodeBase64Char4 = _decodeBase64Escape(base64Variant, i17, 3);
                        }
                    }
                    if (decodeBase64Char4 == -2) {
                        int i20 = i15 >> 2;
                        int i21 = i3 + 1;
                        bArr[i3] = (byte) (i20 >> 8);
                        i3 = i21 + 1;
                        bArr[i21] = (byte) i20;
                    }
                }
                int i22 = (i15 << 6) | decodeBase64Char4;
                int i23 = i3 + 1;
                bArr[i3] = (byte) (i22 >> 16);
                int i24 = i23 + 1;
                bArr[i23] = (byte) (i22 >> 8);
                bArr[i24] = (byte) i22;
                i3 = i24 + 1;
            }
            i2 = 3;
        }
        this._tokenIncomplete = false;
        if (i3 <= 0) {
            return i4;
        }
        int i25 = i4 + i3;
        outputStream.write(bArr, 0, i3);
        return i25;
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public void _releaseBuffers() throws IOException {
        byte[] bArr;
        super._releaseBuffers();
        this._symbols.release();
        if (!this._bufferRecyclable || (bArr = this._inputBuffer) == null) {
            return;
        }
        this._inputBuffer = ParserMinimalBase.NO_BYTES;
        this._ioContext.releaseReadIOBuffer(bArr);
    }

    public void _reportInvalidChar(int i2) throws JsonParseException {
        if (i2 < 32) {
            _throwInvalidSpace(i2);
        }
        _reportInvalidInitial(i2);
    }

    public void _reportInvalidInitial(int i2) throws JsonParseException {
        StringBuilder m24u = C0000a.m24u("Invalid UTF-8 start byte 0x");
        m24u.append(Integer.toHexString(i2));
        _reportError(m24u.toString());
    }

    public void _reportInvalidOther(int i2) throws JsonParseException {
        StringBuilder m24u = C0000a.m24u("Invalid UTF-8 middle byte 0x");
        m24u.append(Integer.toHexString(i2));
        _reportError(m24u.toString());
    }

    public void _reportInvalidToken(String str, int i2) throws IOException {
        this._inputPtr = i2;
        _reportInvalidToken(str, _validJsonTokenList());
    }

    public final void _skipCR() throws IOException {
        if (this._inputPtr < this._inputEnd || _loadMore()) {
            byte[] bArr = this._inputBuffer;
            int i2 = this._inputPtr;
            if (bArr[i2] == 10) {
                this._inputPtr = i2 + 1;
            }
        }
        this._currInputRow++;
        this._currInputRowStart = this._inputPtr;
    }

    public void _skipString() throws IOException {
        this._tokenIncomplete = false;
        int[] iArr = _icUTF8;
        byte[] bArr = this._inputBuffer;
        while (true) {
            int i2 = this._inputPtr;
            int i3 = this._inputEnd;
            if (i2 >= i3) {
                _loadMoreGuaranteed();
                i2 = this._inputPtr;
                i3 = this._inputEnd;
            }
            while (true) {
                if (i2 >= i3) {
                    this._inputPtr = i2;
                    break;
                }
                int i4 = i2 + 1;
                int i5 = bArr[i2] & 255;
                if (iArr[i5] != 0) {
                    this._inputPtr = i4;
                    if (i5 == 34) {
                        return;
                    }
                    int i6 = iArr[i5];
                    if (i6 == 1) {
                        _decodeEscaped();
                    } else if (i6 == 2) {
                        _skipUtf8_2();
                    } else if (i6 == 3) {
                        _skipUtf8_3();
                    } else if (i6 == 4) {
                        _skipUtf8_4(i5);
                    } else if (i5 < 32) {
                        _throwUnquotedSpace(i5, "string value");
                    } else {
                        _reportInvalidChar(i5);
                    }
                } else {
                    i2 = i4;
                }
            }
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public void finishToken() throws IOException {
        if (this._tokenIncomplete) {
            this._tokenIncomplete = false;
            _finishString();
        }
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase, com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public byte[] getBinaryValue(Base64Variant base64Variant) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.VALUE_STRING && (jsonToken != JsonToken.VALUE_EMBEDDED_OBJECT || this._binaryValue == null)) {
            StringBuilder m24u = C0000a.m24u("Current token (");
            m24u.append(this._currToken);
            m24u.append(") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
            _reportError(m24u.toString());
        }
        if (this._tokenIncomplete) {
            try {
                this._binaryValue = _decodeBase64(base64Variant);
                this._tokenIncomplete = false;
            } catch (IllegalArgumentException e2) {
                throw _constructError("Failed to decode VALUE_STRING as base64 (" + base64Variant + "): " + e2.getMessage());
            }
        } else if (this._binaryValue == null) {
            ByteArrayBuilder _getByteArrayBuilder = _getByteArrayBuilder();
            _decodeBase64(getText(), _getByteArrayBuilder, base64Variant);
            this._binaryValue = _getByteArrayBuilder.toByteArray();
        }
        return this._binaryValue;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public ObjectCodec getCodec() {
        return this._objectCodec;
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase, com.fasterxml.jackson.core.JsonParser
    public JsonLocation getCurrentLocation() {
        return new JsonLocation(_getSourceReference(), this._currInputProcessed + this._inputPtr, -1L, this._currInputRow, (this._inputPtr - this._currInputRowStart) + 1);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Object getInputSource() {
        return this._inputStream;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public String getText() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.VALUE_STRING) {
            return _getText2(jsonToken);
        }
        if (!this._tokenIncomplete) {
            return this._textBuffer.contentsAsString();
        }
        this._tokenIncomplete = false;
        return _finishAndReturnString();
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public char[] getTextCharacters() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == null) {
            return null;
        }
        int m5359id = jsonToken.m5359id();
        if (m5359id != 5) {
            if (m5359id != 6) {
                if (m5359id != 7 && m5359id != 8) {
                    return this._currToken.asCharArray();
                }
            } else if (this._tokenIncomplete) {
                this._tokenIncomplete = false;
                _finishString();
            }
            return this._textBuffer.getTextBuffer();
        }
        if (!this._nameCopied) {
            String currentName = this._parsingContext.getCurrentName();
            int length = currentName.length();
            char[] cArr = this._nameCopyBuffer;
            if (cArr == null) {
                this._nameCopyBuffer = this._ioContext.allocNameCopyBuffer(length);
            } else if (cArr.length < length) {
                this._nameCopyBuffer = new char[length];
            }
            currentName.getChars(0, length, this._nameCopyBuffer, 0);
            this._nameCopied = true;
        }
        return this._nameCopyBuffer;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public int getTextLength() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == null) {
            return 0;
        }
        int m5359id = jsonToken.m5359id();
        if (m5359id == 5) {
            return this._parsingContext.getCurrentName().length();
        }
        if (m5359id != 6) {
            if (m5359id != 7 && m5359id != 8) {
                return this._currToken.asCharArray().length;
            }
        } else if (this._tokenIncomplete) {
            this._tokenIncomplete = false;
            _finishString();
        }
        return this._textBuffer.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0011, code lost:
    
        if (r0 != 8) goto L16;
     */
    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int getTextOffset() throws java.io.IOException {
        /*
            r3 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r3._currToken
            r1 = 0
            if (r0 == 0) goto L24
            int r0 = r0.m5359id()
            r2 = 6
            if (r0 == r2) goto L14
            r2 = 7
            if (r0 == r2) goto L1d
            r2 = 8
            if (r0 == r2) goto L1d
            goto L24
        L14:
            boolean r0 = r3._tokenIncomplete
            if (r0 == 0) goto L1d
            r3._tokenIncomplete = r1
            r3._finishString()
        L1d:
            com.fasterxml.jackson.core.util.TextBuffer r0 = r3._textBuffer
            int r0 = r0.getTextOffset()
            return r0
        L24:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8StreamJsonParser.getTextOffset():int");
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase, com.fasterxml.jackson.core.JsonParser
    public JsonLocation getTokenLocation() {
        if (this._currToken != JsonToken.FIELD_NAME) {
            return new JsonLocation(_getSourceReference(), this._tokenInputTotal - 1, -1L, this._tokenInputRow, this._tokenInputCol);
        }
        return new JsonLocation(_getSourceReference(), this._currInputProcessed + (this._nameStartOffset - 1), -1L, this._nameStartRow, this._nameStartCol);
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public int getValueAsInt() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.VALUE_NUMBER_INT && jsonToken != JsonToken.VALUE_NUMBER_FLOAT) {
            return super.getValueAsInt(0);
        }
        int i2 = this._numTypesValid;
        if ((i2 & 1) == 0) {
            if (i2 == 0) {
                return _parseIntValue();
            }
            if ((i2 & 1) == 0) {
                convertNumberToInt();
            }
        }
        return this._numberInt;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public String getValueAsString() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.VALUE_STRING) {
            return jsonToken == JsonToken.FIELD_NAME ? getCurrentName() : super.getValueAsString(null);
        }
        if (!this._tokenIncomplete) {
            return this._textBuffer.contentsAsString();
        }
        this._tokenIncomplete = false;
        return _finishAndReturnString();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Boolean nextBooleanValue() throws IOException {
        if (this._currToken != JsonToken.FIELD_NAME) {
            JsonToken nextToken = nextToken();
            if (nextToken == JsonToken.VALUE_TRUE) {
                return Boolean.TRUE;
            }
            if (nextToken == JsonToken.VALUE_FALSE) {
                return Boolean.FALSE;
            }
            return null;
        }
        this._nameCopied = false;
        JsonToken jsonToken = this._nextToken;
        this._nextToken = null;
        this._currToken = jsonToken;
        if (jsonToken == JsonToken.VALUE_TRUE) {
            return Boolean.TRUE;
        }
        if (jsonToken == JsonToken.VALUE_FALSE) {
            return Boolean.FALSE;
        }
        if (jsonToken == JsonToken.START_ARRAY) {
            this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
        } else if (jsonToken == JsonToken.START_OBJECT) {
            this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
        }
        return null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean nextFieldName(SerializableString serializableString) throws IOException {
        int i2 = 0;
        this._numTypesValid = 0;
        if (this._currToken == JsonToken.FIELD_NAME) {
            _nextAfterName();
            return false;
        }
        if (this._tokenIncomplete) {
            _skipString();
        }
        int _skipWSOrEnd = _skipWSOrEnd();
        if (_skipWSOrEnd < 0) {
            close();
            this._currToken = null;
            return false;
        }
        this._binaryValue = null;
        if (_skipWSOrEnd == 93) {
            _closeArrayScope();
            this._currToken = JsonToken.END_ARRAY;
            return false;
        }
        if (_skipWSOrEnd == 125) {
            _closeObjectScope();
            this._currToken = JsonToken.END_OBJECT;
            return false;
        }
        if (this._parsingContext.expectComma()) {
            if (_skipWSOrEnd != 44) {
                StringBuilder m24u = C0000a.m24u("was expecting comma to separate ");
                m24u.append(this._parsingContext.typeDesc());
                m24u.append(" entries");
                _reportUnexpectedChar(_skipWSOrEnd, m24u.toString());
            }
            _skipWSOrEnd = _skipWS();
            if ((this._features & FEAT_MASK_TRAILING_COMMA) != 0 && (_skipWSOrEnd == 93 || _skipWSOrEnd == 125)) {
                _closeScope(_skipWSOrEnd);
                return false;
            }
        }
        if (!this._parsingContext.inObject()) {
            _updateLocation();
            _nextTokenNotInObject(_skipWSOrEnd);
            return false;
        }
        _updateNameLocation();
        if (_skipWSOrEnd == 34) {
            byte[] asQuotedUTF8 = serializableString.asQuotedUTF8();
            int length = asQuotedUTF8.length;
            int i3 = this._inputPtr;
            if (i3 + length + 4 < this._inputEnd) {
                int i4 = length + i3;
                if (this._inputBuffer[i4] == 34) {
                    while (i3 != i4) {
                        if (asQuotedUTF8[i2] == this._inputBuffer[i3]) {
                            i2++;
                            i3++;
                        }
                    }
                    this._parsingContext.setCurrentName(serializableString.getValue());
                    _isNextTokenNameYes(_skipColonFast(i3 + 1));
                    return true;
                }
            }
        }
        return _isNextTokenNameMaybe(_skipWSOrEnd, serializableString);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int nextIntValue(int i2) throws IOException {
        if (this._currToken != JsonToken.FIELD_NAME) {
            return nextToken() == JsonToken.VALUE_NUMBER_INT ? getIntValue() : i2;
        }
        this._nameCopied = false;
        JsonToken jsonToken = this._nextToken;
        this._nextToken = null;
        this._currToken = jsonToken;
        if (jsonToken == JsonToken.VALUE_NUMBER_INT) {
            return getIntValue();
        }
        if (jsonToken == JsonToken.START_ARRAY) {
            this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
        } else if (jsonToken == JsonToken.START_OBJECT) {
            this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
        }
        return i2;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public long nextLongValue(long j2) throws IOException {
        if (this._currToken != JsonToken.FIELD_NAME) {
            return nextToken() == JsonToken.VALUE_NUMBER_INT ? getLongValue() : j2;
        }
        this._nameCopied = false;
        JsonToken jsonToken = this._nextToken;
        this._nextToken = null;
        this._currToken = jsonToken;
        if (jsonToken == JsonToken.VALUE_NUMBER_INT) {
            return getLongValue();
        }
        if (jsonToken == JsonToken.START_ARRAY) {
            this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
        } else if (jsonToken == JsonToken.START_OBJECT) {
            this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
        }
        return j2;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String nextTextValue() throws IOException {
        if (this._currToken != JsonToken.FIELD_NAME) {
            if (nextToken() == JsonToken.VALUE_STRING) {
                return getText();
            }
            return null;
        }
        this._nameCopied = false;
        JsonToken jsonToken = this._nextToken;
        this._nextToken = null;
        this._currToken = jsonToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (!this._tokenIncomplete) {
                return this._textBuffer.contentsAsString();
            }
            this._tokenIncomplete = false;
            return _finishAndReturnString();
        }
        if (jsonToken == JsonToken.START_ARRAY) {
            this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
        } else if (jsonToken == JsonToken.START_OBJECT) {
            this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
        }
        return null;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public JsonToken nextToken() throws IOException {
        JsonToken _parseNegNumber;
        JsonToken jsonToken = this._currToken;
        JsonToken jsonToken2 = JsonToken.FIELD_NAME;
        if (jsonToken == jsonToken2) {
            return _nextAfterName();
        }
        this._numTypesValid = 0;
        if (this._tokenIncomplete) {
            _skipString();
        }
        int _skipWSOrEnd = _skipWSOrEnd();
        if (_skipWSOrEnd < 0) {
            close();
            this._currToken = null;
            return null;
        }
        this._binaryValue = null;
        if (_skipWSOrEnd == 93) {
            _closeArrayScope();
            JsonToken jsonToken3 = JsonToken.END_ARRAY;
            this._currToken = jsonToken3;
            return jsonToken3;
        }
        if (_skipWSOrEnd == 125) {
            _closeObjectScope();
            JsonToken jsonToken4 = JsonToken.END_OBJECT;
            this._currToken = jsonToken4;
            return jsonToken4;
        }
        if (this._parsingContext.expectComma()) {
            if (_skipWSOrEnd != 44) {
                StringBuilder m24u = C0000a.m24u("was expecting comma to separate ");
                m24u.append(this._parsingContext.typeDesc());
                m24u.append(" entries");
                _reportUnexpectedChar(_skipWSOrEnd, m24u.toString());
            }
            _skipWSOrEnd = _skipWS();
            if ((this._features & FEAT_MASK_TRAILING_COMMA) != 0 && (_skipWSOrEnd == 93 || _skipWSOrEnd == 125)) {
                return _closeScope(_skipWSOrEnd);
            }
        }
        if (!this._parsingContext.inObject()) {
            _updateLocation();
            return _nextTokenNotInObject(_skipWSOrEnd);
        }
        _updateNameLocation();
        this._parsingContext.setCurrentName(_parseName(_skipWSOrEnd));
        this._currToken = jsonToken2;
        int _skipColon = _skipColon();
        _updateLocation();
        if (_skipColon == 34) {
            this._tokenIncomplete = true;
            this._nextToken = JsonToken.VALUE_STRING;
            return this._currToken;
        }
        if (_skipColon == 45) {
            _parseNegNumber = _parseNegNumber();
        } else if (_skipColon == 91) {
            _parseNegNumber = JsonToken.START_ARRAY;
        } else if (_skipColon == 102) {
            _matchFalse();
            _parseNegNumber = JsonToken.VALUE_FALSE;
        } else if (_skipColon == 110) {
            _matchNull();
            _parseNegNumber = JsonToken.VALUE_NULL;
        } else if (_skipColon == 116) {
            _matchTrue();
            _parseNegNumber = JsonToken.VALUE_TRUE;
        } else if (_skipColon != 123) {
            switch (_skipColon) {
                case 48:
                case C4632R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case C4632R.styleable.AppCompatTheme_colorError /* 56 */:
                case 57:
                    _parseNegNumber = _parsePosNumber(_skipColon);
                    break;
                default:
                    _parseNegNumber = _handleUnexpectedValue(_skipColon);
                    break;
            }
        } else {
            _parseNegNumber = JsonToken.START_OBJECT;
        }
        this._nextToken = _parseNegNumber;
        return this._currToken;
    }

    public final String parseEscapedName(int[] iArr, int i2, int i3, int i4, int i5) throws IOException {
        int[] iArr2 = _icLatin1;
        while (true) {
            if (iArr2[i4] != 0) {
                if (i4 == 34) {
                    break;
                }
                if (i4 != 92) {
                    _throwUnquotedSpace(i4, "name");
                } else {
                    i4 = _decodeEscaped();
                }
                if (i4 > 127) {
                    int i6 = 0;
                    if (i5 >= 4) {
                        if (i2 >= iArr.length) {
                            iArr = ParserBase.growArrayBy(iArr, iArr.length);
                            this._quadBuffer = iArr;
                        }
                        iArr[i2] = i3;
                        i2++;
                        i3 = 0;
                        i5 = 0;
                    }
                    if (i4 < 2048) {
                        i3 = (i3 << 8) | (i4 >> 6) | 192;
                        i5++;
                    } else {
                        int i7 = (i3 << 8) | (i4 >> 12) | 224;
                        int i8 = i5 + 1;
                        if (i8 >= 4) {
                            if (i2 >= iArr.length) {
                                iArr = ParserBase.growArrayBy(iArr, iArr.length);
                                this._quadBuffer = iArr;
                            }
                            iArr[i2] = i7;
                            i2++;
                            i8 = 0;
                        } else {
                            i6 = i7;
                        }
                        i3 = (i6 << 8) | ((i4 >> 6) & 63) | 128;
                        i5 = i8 + 1;
                    }
                    i4 = (i4 & 63) | 128;
                }
            }
            if (i5 < 4) {
                i5++;
                i3 = (i3 << 8) | i4;
            } else {
                if (i2 >= iArr.length) {
                    iArr = ParserBase.growArrayBy(iArr, iArr.length);
                    this._quadBuffer = iArr;
                }
                iArr[i2] = i3;
                i3 = i4;
                i2++;
                i5 = 1;
            }
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(" in field name", JsonToken.FIELD_NAME);
            }
            byte[] bArr = this._inputBuffer;
            int i9 = this._inputPtr;
            this._inputPtr = i9 + 1;
            i4 = bArr[i9] & 255;
        }
        if (i5 > 0) {
            if (i2 >= iArr.length) {
                iArr = ParserBase.growArrayBy(iArr, iArr.length);
                this._quadBuffer = iArr;
            }
            iArr[i2] = _padLastQuad(i3, i5);
            i2++;
        }
        String findName = this._symbols.findName(iArr, i2);
        return findName == null ? addName(iArr, i2, i5) : findName;
    }

    public final String parseLongName(int i2, int i3, int i4) throws IOException {
        int[] iArr = this._quadBuffer;
        iArr[0] = this._quad1;
        iArr[1] = i3;
        iArr[2] = i4;
        byte[] bArr = this._inputBuffer;
        int[] iArr2 = _icLatin1;
        int i5 = i2;
        int i6 = 3;
        while (true) {
            int i7 = this._inputPtr;
            if (i7 + 4 > this._inputEnd) {
                return parseEscapedName(this._quadBuffer, i6, 0, i5, 0);
            }
            int i8 = i7 + 1;
            this._inputPtr = i8;
            int i9 = bArr[i7] & 255;
            if (iArr2[i9] != 0) {
                return i9 == 34 ? findName(this._quadBuffer, i6, i5, 1) : parseEscapedName(this._quadBuffer, i6, i5, i9, 1);
            }
            int i10 = (i5 << 8) | i9;
            int i11 = i8 + 1;
            this._inputPtr = i11;
            int i12 = bArr[i8] & 255;
            if (iArr2[i12] != 0) {
                return i12 == 34 ? findName(this._quadBuffer, i6, i10, 2) : parseEscapedName(this._quadBuffer, i6, i10, i12, 2);
            }
            int i13 = (i10 << 8) | i12;
            int i14 = i11 + 1;
            this._inputPtr = i14;
            int i15 = bArr[i11] & 255;
            if (iArr2[i15] != 0) {
                return i15 == 34 ? findName(this._quadBuffer, i6, i13, 3) : parseEscapedName(this._quadBuffer, i6, i13, i15, 3);
            }
            int i16 = (i13 << 8) | i15;
            this._inputPtr = i14 + 1;
            int i17 = bArr[i14] & 255;
            if (iArr2[i17] != 0) {
                return i17 == 34 ? findName(this._quadBuffer, i6, i16, 4) : parseEscapedName(this._quadBuffer, i6, i16, i17, 4);
            }
            int[] iArr3 = this._quadBuffer;
            if (i6 >= iArr3.length) {
                this._quadBuffer = ParserBase.growArrayBy(iArr3, i6);
            }
            this._quadBuffer[i6] = i16;
            i5 = i17;
            i6++;
        }
    }

    public final String parseMediumName(int i2) throws IOException {
        byte[] bArr = this._inputBuffer;
        int[] iArr = _icLatin1;
        int i3 = this._inputPtr;
        int i4 = i3 + 1;
        this._inputPtr = i4;
        int i5 = bArr[i3] & 255;
        if (iArr[i5] != 0) {
            return i5 == 34 ? findName(this._quad1, i2, 1) : parseName(this._quad1, i2, i5, 1);
        }
        int i6 = (i2 << 8) | i5;
        int i7 = i4 + 1;
        this._inputPtr = i7;
        int i8 = bArr[i4] & 255;
        if (iArr[i8] != 0) {
            return i8 == 34 ? findName(this._quad1, i6, 2) : parseName(this._quad1, i6, i8, 2);
        }
        int i9 = (i6 << 8) | i8;
        int i10 = i7 + 1;
        this._inputPtr = i10;
        int i11 = bArr[i7] & 255;
        if (iArr[i11] != 0) {
            return i11 == 34 ? findName(this._quad1, i9, 3) : parseName(this._quad1, i9, i11, 3);
        }
        int i12 = (i9 << 8) | i11;
        this._inputPtr = i10 + 1;
        int i13 = bArr[i10] & 255;
        return iArr[i13] != 0 ? i13 == 34 ? findName(this._quad1, i12, 4) : parseName(this._quad1, i12, i13, 4) : parseMediumName2(i13, i12);
    }

    public final String parseMediumName2(int i2, int i3) throws IOException {
        byte[] bArr = this._inputBuffer;
        int[] iArr = _icLatin1;
        int i4 = this._inputPtr;
        int i5 = i4 + 1;
        this._inputPtr = i5;
        int i6 = bArr[i4] & 255;
        if (iArr[i6] != 0) {
            return i6 == 34 ? findName(this._quad1, i3, i2, 1) : parseName(this._quad1, i3, i2, i6, 1);
        }
        int i7 = (i2 << 8) | i6;
        int i8 = i5 + 1;
        this._inputPtr = i8;
        int i9 = bArr[i5] & 255;
        if (iArr[i9] != 0) {
            return i9 == 34 ? findName(this._quad1, i3, i7, 2) : parseName(this._quad1, i3, i7, i9, 2);
        }
        int i10 = (i7 << 8) | i9;
        int i11 = i8 + 1;
        this._inputPtr = i11;
        int i12 = bArr[i8] & 255;
        if (iArr[i12] != 0) {
            return i12 == 34 ? findName(this._quad1, i3, i10, 3) : parseName(this._quad1, i3, i10, i12, 3);
        }
        int i13 = (i10 << 8) | i12;
        this._inputPtr = i11 + 1;
        int i14 = bArr[i11] & 255;
        return iArr[i14] != 0 ? i14 == 34 ? findName(this._quad1, i3, i13, 4) : parseName(this._quad1, i3, i13, i14, 4) : parseLongName(i14, i3, i13);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int readBinaryValue(Base64Variant base64Variant, OutputStream outputStream) throws IOException {
        if (!this._tokenIncomplete || this._currToken != JsonToken.VALUE_STRING) {
            byte[] binaryValue = getBinaryValue(base64Variant);
            outputStream.write(binaryValue);
            return binaryValue.length;
        }
        byte[] allocBase64Buffer = this._ioContext.allocBase64Buffer();
        try {
            return _readBinary(base64Variant, outputStream, allocBase64Buffer);
        } finally {
            this._ioContext.releaseBase64Buffer(allocBase64Buffer);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int releaseBuffered(OutputStream outputStream) throws IOException {
        int i2 = this._inputEnd;
        int i3 = this._inputPtr;
        int i4 = i2 - i3;
        if (i4 < 1) {
            return 0;
        }
        outputStream.write(this._inputBuffer, i3, i4);
        return i4;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public void setCodec(ObjectCodec objectCodec) {
        this._objectCodec = objectCodec;
    }

    public String slowParseName() throws IOException {
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            _reportInvalidEOF(": was expecting closing '\"' for name", JsonToken.FIELD_NAME);
        }
        byte[] bArr = this._inputBuffer;
        int i2 = this._inputPtr;
        this._inputPtr = i2 + 1;
        int i3 = bArr[i2] & 255;
        return i3 == 34 ? "" : parseEscapedName(this._quadBuffer, 0, 0, i3, 0);
    }

    public UTF8StreamJsonParser(IOContext iOContext, int i2, InputStream inputStream, ObjectCodec objectCodec, ByteQuadsCanonicalizer byteQuadsCanonicalizer, byte[] bArr, int i3, int i4, int i5, boolean z) {
        super(iOContext, i2);
        this._quadBuffer = new int[16];
        this._inputStream = inputStream;
        this._objectCodec = objectCodec;
        this._symbols = byteQuadsCanonicalizer;
        this._inputBuffer = bArr;
        this._inputPtr = i3;
        this._inputEnd = i4;
        this._currInputRowStart = i3 - i5;
        this._currInputProcessed = (-i3) + i5;
        this._bufferRecyclable = z;
    }

    private final String parseName(int i2, int i3, int i4, int i5) throws IOException {
        int[] iArr = this._quadBuffer;
        iArr[0] = i2;
        return parseEscapedName(iArr, 1, i3, i4, i5);
    }

    public void _reportInvalidOther(int i2, int i3) throws JsonParseException {
        this._inputPtr = i3;
        _reportInvalidOther(i2);
    }

    public void _reportInvalidToken(String str) throws IOException {
        _reportInvalidToken(str, _validJsonTokenList());
    }

    private final String parseName(int i2, int i3, int i4, int i5, int i6) throws IOException {
        int[] iArr = this._quadBuffer;
        iArr[0] = i2;
        iArr[1] = i3;
        return parseEscapedName(iArr, 2, i4, i5, i6);
    }

    public void _reportInvalidToken(String str, String str2) throws IOException {
        StringBuilder sb = new StringBuilder(str);
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                break;
            }
            byte[] bArr = this._inputBuffer;
            int i2 = this._inputPtr;
            this._inputPtr = i2 + 1;
            char _decodeCharForError = (char) _decodeCharForError(bArr[i2]);
            if (!Character.isJavaIdentifierPart(_decodeCharForError)) {
                break;
            }
            sb.append(_decodeCharForError);
            if (sb.length() >= 256) {
                sb.append("...");
                break;
            }
        }
        _reportError("Unrecognized token '%s': was expecting %s", sb, str2);
    }

    private final String findName(int i2, int i3, int i4) throws JsonParseException {
        int _padLastQuad = _padLastQuad(i3, i4);
        String findName = this._symbols.findName(i2, _padLastQuad);
        if (findName != null) {
            return findName;
        }
        int[] iArr = this._quadBuffer;
        iArr[0] = i2;
        iArr[1] = _padLastQuad;
        return addName(iArr, 2, i4);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int getText(Writer writer) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (this._tokenIncomplete) {
                this._tokenIncomplete = false;
                _finishString();
            }
            return this._textBuffer.contentsToWriter(writer);
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            String currentName = this._parsingContext.getCurrentName();
            writer.write(currentName);
            return currentName.length();
        }
        if (jsonToken == null) {
            return 0;
        }
        if (jsonToken.isNumeric()) {
            return this._textBuffer.contentsToWriter(writer);
        }
        char[] asCharArray = jsonToken.asCharArray();
        writer.write(asCharArray);
        return asCharArray.length;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public int getValueAsInt(int i2) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.VALUE_NUMBER_INT && jsonToken != JsonToken.VALUE_NUMBER_FLOAT) {
            return super.getValueAsInt(i2);
        }
        int i3 = this._numTypesValid;
        if ((i3 & 1) == 0) {
            if (i3 == 0) {
                return _parseIntValue();
            }
            if ((i3 & 1) == 0) {
                convertNumberToInt();
            }
        }
        return this._numberInt;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public String getValueAsString(String str) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (this._tokenIncomplete) {
                this._tokenIncomplete = false;
                return _finishAndReturnString();
            }
            return this._textBuffer.contentsAsString();
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return getCurrentName();
        }
        return super.getValueAsString(str);
    }

    private final String findName(int i2, int i3, int i4, int i5) throws JsonParseException {
        int _padLastQuad = _padLastQuad(i4, i5);
        String findName = this._symbols.findName(i2, i3, _padLastQuad);
        if (findName != null) {
            return findName;
        }
        int[] iArr = this._quadBuffer;
        iArr[0] = i2;
        iArr[1] = i3;
        iArr[2] = _padLastQuad(_padLastQuad, i5);
        return addName(iArr, 3, i5);
    }

    private final String findName(int[] iArr, int i2, int i3, int i4) throws JsonParseException {
        if (i2 >= iArr.length) {
            iArr = ParserBase.growArrayBy(iArr, iArr.length);
            this._quadBuffer = iArr;
        }
        int i5 = i2 + 1;
        iArr[i2] = _padLastQuad(i3, i4);
        String findName = this._symbols.findName(iArr, i5);
        return findName == null ? addName(iArr, i5, i4) : findName;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String nextFieldName() throws IOException {
        JsonToken _parseNegNumber;
        this._numTypesValid = 0;
        JsonToken jsonToken = this._currToken;
        JsonToken jsonToken2 = JsonToken.FIELD_NAME;
        if (jsonToken == jsonToken2) {
            _nextAfterName();
            return null;
        }
        if (this._tokenIncomplete) {
            _skipString();
        }
        int _skipWSOrEnd = _skipWSOrEnd();
        if (_skipWSOrEnd < 0) {
            close();
            this._currToken = null;
            return null;
        }
        this._binaryValue = null;
        if (_skipWSOrEnd == 93) {
            _closeArrayScope();
            this._currToken = JsonToken.END_ARRAY;
            return null;
        }
        if (_skipWSOrEnd == 125) {
            _closeObjectScope();
            this._currToken = JsonToken.END_OBJECT;
            return null;
        }
        if (this._parsingContext.expectComma()) {
            if (_skipWSOrEnd != 44) {
                StringBuilder m24u = C0000a.m24u("was expecting comma to separate ");
                m24u.append(this._parsingContext.typeDesc());
                m24u.append(" entries");
                _reportUnexpectedChar(_skipWSOrEnd, m24u.toString());
            }
            _skipWSOrEnd = _skipWS();
            if ((this._features & FEAT_MASK_TRAILING_COMMA) != 0 && (_skipWSOrEnd == 93 || _skipWSOrEnd == 125)) {
                _closeScope(_skipWSOrEnd);
                return null;
            }
        }
        if (!this._parsingContext.inObject()) {
            _updateLocation();
            _nextTokenNotInObject(_skipWSOrEnd);
            return null;
        }
        _updateNameLocation();
        String _parseName = _parseName(_skipWSOrEnd);
        this._parsingContext.setCurrentName(_parseName);
        this._currToken = jsonToken2;
        int _skipColon = _skipColon();
        _updateLocation();
        if (_skipColon == 34) {
            this._tokenIncomplete = true;
            this._nextToken = JsonToken.VALUE_STRING;
            return _parseName;
        }
        if (_skipColon == 45) {
            _parseNegNumber = _parseNegNumber();
        } else if (_skipColon == 91) {
            _parseNegNumber = JsonToken.START_ARRAY;
        } else if (_skipColon == 102) {
            _matchFalse();
            _parseNegNumber = JsonToken.VALUE_FALSE;
        } else if (_skipColon == 110) {
            _matchNull();
            _parseNegNumber = JsonToken.VALUE_NULL;
        } else if (_skipColon == 116) {
            _matchTrue();
            _parseNegNumber = JsonToken.VALUE_TRUE;
        } else if (_skipColon != 123) {
            switch (_skipColon) {
                case 48:
                case C4632R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case C4632R.styleable.AppCompatTheme_colorError /* 56 */:
                case 57:
                    _parseNegNumber = _parsePosNumber(_skipColon);
                    break;
                default:
                    _parseNegNumber = _handleUnexpectedValue(_skipColon);
                    break;
            }
        } else {
            _parseNegNumber = JsonToken.START_OBJECT;
        }
        this._nextToken = _parseNegNumber;
        return _parseName;
    }
}
