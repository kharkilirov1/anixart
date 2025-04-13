package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.base.ParserBase;
import com.fasterxml.jackson.core.p006io.CharTypes;
import com.fasterxml.jackson.core.p006io.IOContext;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.TextBuffer;
import com.yandex.mobile.ads.C4632R;
import java.io.DataInput;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.util.Arrays;
import kotlin.KotlinVersion;
import p000a.C0000a;

/* loaded from: classes.dex */
public class UTF8DataInputJsonParser extends ParserBase {
    public static final byte BYTE_LF = 10;
    public DataInput _inputData;
    public int _nextByte;
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

    public UTF8DataInputJsonParser(IOContext iOContext, int i2, DataInput dataInput, ObjectCodec objectCodec, ByteQuadsCanonicalizer byteQuadsCanonicalizer, int i3) {
        super(iOContext, i2);
        this._quadBuffer = new int[16];
        this._nextByte = -1;
        this._objectCodec = objectCodec;
        this._symbols = byteQuadsCanonicalizer;
        this._inputData = dataInput;
        this._nextByte = i3;
    }

    private final void _checkMatchEnd(String str, int i2, int i3) throws IOException {
        char _decodeCharForError = (char) _decodeCharForError(i3);
        if (Character.isJavaIdentifierPart(_decodeCharForError)) {
            _reportInvalidToken(_decodeCharForError, str.substring(0, i2));
        }
    }

    private void _closeScope(int i2) throws JsonParseException {
        if (i2 == 93) {
            if (!this._parsingContext.inArray()) {
                _reportMismatchedEndMarker(i2, '}');
            }
            this._parsingContext = this._parsingContext.clearAndGetParent();
            this._currToken = JsonToken.END_ARRAY;
        }
        if (i2 == 125) {
            if (!this._parsingContext.inObject()) {
                _reportMismatchedEndMarker(i2, ']');
            }
            this._parsingContext = this._parsingContext.clearAndGetParent();
            this._currToken = JsonToken.END_OBJECT;
        }
    }

    private final int _decodeUtf8_2(int i2) throws IOException {
        int readUnsignedByte = this._inputData.readUnsignedByte();
        if ((readUnsignedByte & 192) != 128) {
            _reportInvalidOther(readUnsignedByte & KotlinVersion.MAX_COMPONENT_VALUE);
        }
        return ((i2 & 31) << 6) | (readUnsignedByte & 63);
    }

    private final int _decodeUtf8_3(int i2) throws IOException {
        int i3 = i2 & 15;
        int readUnsignedByte = this._inputData.readUnsignedByte();
        if ((readUnsignedByte & 192) != 128) {
            _reportInvalidOther(readUnsignedByte & KotlinVersion.MAX_COMPONENT_VALUE);
        }
        int i4 = (i3 << 6) | (readUnsignedByte & 63);
        int readUnsignedByte2 = this._inputData.readUnsignedByte();
        if ((readUnsignedByte2 & 192) != 128) {
            _reportInvalidOther(readUnsignedByte2 & KotlinVersion.MAX_COMPONENT_VALUE);
        }
        return (i4 << 6) | (readUnsignedByte2 & 63);
    }

    private final int _decodeUtf8_4(int i2) throws IOException {
        int readUnsignedByte = this._inputData.readUnsignedByte();
        if ((readUnsignedByte & 192) != 128) {
            _reportInvalidOther(readUnsignedByte & KotlinVersion.MAX_COMPONENT_VALUE);
        }
        int i3 = ((i2 & 7) << 6) | (readUnsignedByte & 63);
        int readUnsignedByte2 = this._inputData.readUnsignedByte();
        if ((readUnsignedByte2 & 192) != 128) {
            _reportInvalidOther(readUnsignedByte2 & KotlinVersion.MAX_COMPONENT_VALUE);
        }
        int i4 = (i3 << 6) | (readUnsignedByte2 & 63);
        int readUnsignedByte3 = this._inputData.readUnsignedByte();
        if ((readUnsignedByte3 & 192) != 128) {
            _reportInvalidOther(readUnsignedByte3 & KotlinVersion.MAX_COMPONENT_VALUE);
        }
        return ((i4 << 6) | (readUnsignedByte3 & 63)) - TextBuffer.MAX_SEGMENT_LEN;
    }

    private String _finishAndReturnString() throws IOException {
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int[] iArr = _icUTF8;
        int length = emptyAndGetCurrentSegment.length;
        int i2 = 0;
        while (true) {
            int readUnsignedByte = this._inputData.readUnsignedByte();
            if (iArr[readUnsignedByte] != 0) {
                if (readUnsignedByte == 34) {
                    return this._textBuffer.setCurrentAndReturn(i2);
                }
                _finishString2(emptyAndGetCurrentSegment, i2, readUnsignedByte);
                return this._textBuffer.contentsAsString();
            }
            int i3 = i2 + 1;
            emptyAndGetCurrentSegment[i2] = (char) readUnsignedByte;
            if (i3 >= length) {
                _finishString2(emptyAndGetCurrentSegment, i3, this._inputData.readUnsignedByte());
                return this._textBuffer.contentsAsString();
            }
            i2 = i3;
        }
    }

    private final void _finishString2(char[] cArr, int i2, int i3) throws IOException {
        int[] iArr = _icUTF8;
        int length = cArr.length;
        while (true) {
            int i4 = 0;
            if (iArr[i3] == 0) {
                if (i2 >= length) {
                    cArr = this._textBuffer.finishCurrentSegment();
                    length = cArr.length;
                    i2 = 0;
                }
                cArr[i2] = (char) i3;
                i3 = this._inputData.readUnsignedByte();
                i2++;
            } else {
                if (i3 == 34) {
                    this._textBuffer.setCurrentLength(i2);
                    return;
                }
                int i5 = iArr[i3];
                if (i5 == 1) {
                    i3 = _decodeEscaped();
                } else if (i5 == 2) {
                    i3 = _decodeUtf8_2(i3);
                } else if (i5 == 3) {
                    i3 = _decodeUtf8_3(i3);
                } else if (i5 == 4) {
                    int _decodeUtf8_4 = _decodeUtf8_4(i3);
                    int i6 = i2 + 1;
                    cArr[i2] = (char) (55296 | (_decodeUtf8_4 >> 10));
                    if (i6 >= cArr.length) {
                        cArr = this._textBuffer.finishCurrentSegment();
                        length = cArr.length;
                        i2 = 0;
                    } else {
                        i2 = i6;
                    }
                    i3 = (_decodeUtf8_4 & 1023) | 56320;
                } else if (i3 < 32) {
                    _throwUnquotedSpace(i3, "string value");
                } else {
                    _reportInvalidChar(i3);
                }
                if (i2 >= cArr.length) {
                    cArr = this._textBuffer.finishCurrentSegment();
                    length = cArr.length;
                } else {
                    i4 = i2;
                }
                i2 = i4 + 1;
                cArr[i4] = (char) i3;
                i3 = this._inputData.readUnsignedByte();
            }
        }
    }

    private static int[] _growArrayBy(int[] iArr, int i2) {
        return iArr == null ? new int[i2] : Arrays.copyOf(iArr, iArr.length + i2);
    }

    private final int _handleLeadingZeroes() throws IOException {
        int readUnsignedByte = this._inputData.readUnsignedByte();
        if (readUnsignedByte >= 48 && readUnsignedByte <= 57) {
            if ((this._features & FEAT_MASK_LEADING_ZEROS) == 0) {
                reportInvalidNumber("Leading zeroes not allowed");
            }
            while (readUnsignedByte == 48) {
                readUnsignedByte = this._inputData.readUnsignedByte();
            }
        }
        return readUnsignedByte;
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
            _matchToken("false", 1);
            JsonToken jsonToken3 = JsonToken.VALUE_FALSE;
            this._currToken = jsonToken3;
            return jsonToken3;
        }
        if (i2 == 110) {
            _matchToken("null", 1);
            JsonToken jsonToken4 = JsonToken.VALUE_NULL;
            this._currToken = jsonToken4;
            return jsonToken4;
        }
        if (i2 == 116) {
            _matchToken("true", 1);
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

    private final JsonToken _parseFloat(char[] cArr, int i2, int i3, boolean z, int i4) throws IOException {
        int i5;
        int i6;
        int readUnsignedByte;
        int i7 = 0;
        if (i3 == 46) {
            cArr[i2] = (char) i3;
            i2++;
            int i8 = 0;
            while (true) {
                readUnsignedByte = this._inputData.readUnsignedByte();
                if (readUnsignedByte < 48 || readUnsignedByte > 57) {
                    break;
                }
                i8++;
                if (i2 >= cArr.length) {
                    cArr = this._textBuffer.finishCurrentSegment();
                    i2 = 0;
                }
                cArr[i2] = (char) readUnsignedByte;
                i2++;
            }
            if (i8 == 0) {
                reportUnexpectedNumberChar(readUnsignedByte, "Decimal point not followed by a digit");
            }
            i5 = i8;
            i3 = readUnsignedByte;
        } else {
            i5 = 0;
        }
        if (i3 == 101 || i3 == 69) {
            if (i2 >= cArr.length) {
                cArr = this._textBuffer.finishCurrentSegment();
                i2 = 0;
            }
            int i9 = i2 + 1;
            cArr[i2] = (char) i3;
            int readUnsignedByte2 = this._inputData.readUnsignedByte();
            if (readUnsignedByte2 == 45 || readUnsignedByte2 == 43) {
                if (i9 >= cArr.length) {
                    cArr = this._textBuffer.finishCurrentSegment();
                    i9 = 0;
                }
                int i10 = i9 + 1;
                cArr[i9] = (char) readUnsignedByte2;
                i6 = 0;
                i3 = this._inputData.readUnsignedByte();
                i2 = i10;
            } else {
                i3 = readUnsignedByte2;
                i2 = i9;
                i6 = 0;
            }
            while (i3 <= 57 && i3 >= 48) {
                i6++;
                if (i2 >= cArr.length) {
                    cArr = this._textBuffer.finishCurrentSegment();
                    i2 = 0;
                }
                cArr[i2] = (char) i3;
                i3 = this._inputData.readUnsignedByte();
                i2++;
            }
            if (i6 == 0) {
                reportUnexpectedNumberChar(i3, "Exponent indicator not followed by a digit");
            }
            i7 = i6;
        }
        this._nextByte = i3;
        if (this._parsingContext.inRoot()) {
            _verifyRootSpace();
        }
        this._textBuffer.setCurrentLength(i2);
        return resetFloat(z, i4, i5, i7);
    }

    private final String _parseLongName(int i2, int i3, int i4) throws IOException {
        int[] iArr = this._quadBuffer;
        iArr[0] = this._quad1;
        iArr[1] = i3;
        iArr[2] = i4;
        int[] iArr2 = _icLatin1;
        int i5 = i2;
        int i6 = 3;
        while (true) {
            int readUnsignedByte = this._inputData.readUnsignedByte();
            if (iArr2[readUnsignedByte] != 0) {
                return readUnsignedByte == 34 ? findName(this._quadBuffer, i6, i5, 1) : parseEscapedName(this._quadBuffer, i6, i5, readUnsignedByte, 1);
            }
            int i7 = (i5 << 8) | readUnsignedByte;
            int readUnsignedByte2 = this._inputData.readUnsignedByte();
            if (iArr2[readUnsignedByte2] != 0) {
                return readUnsignedByte2 == 34 ? findName(this._quadBuffer, i6, i7, 2) : parseEscapedName(this._quadBuffer, i6, i7, readUnsignedByte2, 2);
            }
            int i8 = (i7 << 8) | readUnsignedByte2;
            int readUnsignedByte3 = this._inputData.readUnsignedByte();
            if (iArr2[readUnsignedByte3] != 0) {
                return readUnsignedByte3 == 34 ? findName(this._quadBuffer, i6, i8, 3) : parseEscapedName(this._quadBuffer, i6, i8, readUnsignedByte3, 3);
            }
            int i9 = (i8 << 8) | readUnsignedByte3;
            int readUnsignedByte4 = this._inputData.readUnsignedByte();
            if (iArr2[readUnsignedByte4] != 0) {
                return readUnsignedByte4 == 34 ? findName(this._quadBuffer, i6, i9, 4) : parseEscapedName(this._quadBuffer, i6, i9, readUnsignedByte4, 4);
            }
            int[] iArr3 = this._quadBuffer;
            if (i6 >= iArr3.length) {
                this._quadBuffer = _growArrayBy(iArr3, i6);
            }
            this._quadBuffer[i6] = i9;
            i6++;
            i5 = readUnsignedByte4;
        }
    }

    private final String _parseMediumName(int i2) throws IOException {
        int[] iArr = _icLatin1;
        int readUnsignedByte = this._inputData.readUnsignedByte();
        if (iArr[readUnsignedByte] != 0) {
            return readUnsignedByte == 34 ? findName(this._quad1, i2, 1) : parseName(this._quad1, i2, readUnsignedByte, 1);
        }
        int i3 = (i2 << 8) | readUnsignedByte;
        int readUnsignedByte2 = this._inputData.readUnsignedByte();
        if (iArr[readUnsignedByte2] != 0) {
            return readUnsignedByte2 == 34 ? findName(this._quad1, i3, 2) : parseName(this._quad1, i3, readUnsignedByte2, 2);
        }
        int i4 = (i3 << 8) | readUnsignedByte2;
        int readUnsignedByte3 = this._inputData.readUnsignedByte();
        if (iArr[readUnsignedByte3] != 0) {
            return readUnsignedByte3 == 34 ? findName(this._quad1, i4, 3) : parseName(this._quad1, i4, readUnsignedByte3, 3);
        }
        int i5 = (i4 << 8) | readUnsignedByte3;
        int readUnsignedByte4 = this._inputData.readUnsignedByte();
        return iArr[readUnsignedByte4] != 0 ? readUnsignedByte4 == 34 ? findName(this._quad1, i5, 4) : parseName(this._quad1, i5, readUnsignedByte4, 4) : _parseMediumName2(readUnsignedByte4, i5);
    }

    private final String _parseMediumName2(int i2, int i3) throws IOException {
        int[] iArr = _icLatin1;
        int readUnsignedByte = this._inputData.readUnsignedByte();
        if (iArr[readUnsignedByte] != 0) {
            return readUnsignedByte == 34 ? findName(this._quad1, i3, i2, 1) : parseName(this._quad1, i3, i2, readUnsignedByte, 1);
        }
        int i4 = (i2 << 8) | readUnsignedByte;
        int readUnsignedByte2 = this._inputData.readUnsignedByte();
        if (iArr[readUnsignedByte2] != 0) {
            return readUnsignedByte2 == 34 ? findName(this._quad1, i3, i4, 2) : parseName(this._quad1, i3, i4, readUnsignedByte2, 2);
        }
        int i5 = (i4 << 8) | readUnsignedByte2;
        int readUnsignedByte3 = this._inputData.readUnsignedByte();
        if (iArr[readUnsignedByte3] != 0) {
            return readUnsignedByte3 == 34 ? findName(this._quad1, i3, i5, 3) : parseName(this._quad1, i3, i5, readUnsignedByte3, 3);
        }
        int i6 = (i5 << 8) | readUnsignedByte3;
        int readUnsignedByte4 = this._inputData.readUnsignedByte();
        return iArr[readUnsignedByte4] != 0 ? readUnsignedByte4 == 34 ? findName(this._quad1, i3, i6, 4) : parseName(this._quad1, i3, i6, readUnsignedByte4, 4) : _parseLongName(readUnsignedByte4, i3, i6);
    }

    private void _reportInvalidOther(int i2) throws JsonParseException {
        StringBuilder m24u = C0000a.m24u("Invalid UTF-8 middle byte 0x");
        m24u.append(Integer.toHexString(i2));
        _reportError(m24u.toString());
    }

    private final void _skipCComment() throws IOException {
        int[] inputCodeComment = CharTypes.getInputCodeComment();
        int readUnsignedByte = this._inputData.readUnsignedByte();
        while (true) {
            int i2 = inputCodeComment[readUnsignedByte];
            if (i2 != 0) {
                if (i2 == 2) {
                    _skipUtf8_2();
                } else if (i2 == 3) {
                    _skipUtf8_3();
                } else if (i2 == 4) {
                    _skipUtf8_4();
                } else if (i2 == 10 || i2 == 13) {
                    this._currInputRow++;
                } else if (i2 != 42) {
                    _reportInvalidChar(readUnsignedByte);
                } else {
                    readUnsignedByte = this._inputData.readUnsignedByte();
                    if (readUnsignedByte == 47) {
                        return;
                    }
                }
            }
            readUnsignedByte = this._inputData.readUnsignedByte();
        }
    }

    private final int _skipColon() throws IOException {
        int i2 = this._nextByte;
        if (i2 < 0) {
            i2 = this._inputData.readUnsignedByte();
        } else {
            this._nextByte = -1;
        }
        if (i2 == 58) {
            int readUnsignedByte = this._inputData.readUnsignedByte();
            return readUnsignedByte > 32 ? (readUnsignedByte == 47 || readUnsignedByte == 35) ? _skipColon2(readUnsignedByte, true) : readUnsignedByte : ((readUnsignedByte == 32 || readUnsignedByte == 9) && (readUnsignedByte = this._inputData.readUnsignedByte()) > 32) ? (readUnsignedByte == 47 || readUnsignedByte == 35) ? _skipColon2(readUnsignedByte, true) : readUnsignedByte : _skipColon2(readUnsignedByte, true);
        }
        if (i2 == 32 || i2 == 9) {
            i2 = this._inputData.readUnsignedByte();
        }
        if (i2 != 58) {
            return _skipColon2(i2, false);
        }
        int readUnsignedByte2 = this._inputData.readUnsignedByte();
        return readUnsignedByte2 > 32 ? (readUnsignedByte2 == 47 || readUnsignedByte2 == 35) ? _skipColon2(readUnsignedByte2, true) : readUnsignedByte2 : ((readUnsignedByte2 == 32 || readUnsignedByte2 == 9) && (readUnsignedByte2 = this._inputData.readUnsignedByte()) > 32) ? (readUnsignedByte2 == 47 || readUnsignedByte2 == 35) ? _skipColon2(readUnsignedByte2, true) : readUnsignedByte2 : _skipColon2(readUnsignedByte2, true);
    }

    private final int _skipColon2(int i2, boolean z) throws IOException {
        while (true) {
            if (i2 > 32) {
                if (i2 == 47) {
                    _skipComment();
                } else if (i2 != 35 || !_skipYAMLComment()) {
                    if (z) {
                        return i2;
                    }
                    if (i2 != 58) {
                        _reportUnexpectedChar(i2, "was expecting a colon to separate field name and value");
                    }
                    z = true;
                }
            } else if (i2 == 13 || i2 == 10) {
                this._currInputRow++;
            }
            i2 = this._inputData.readUnsignedByte();
        }
    }

    private final void _skipComment() throws IOException {
        if ((this._features & FEAT_MASK_ALLOW_JAVA_COMMENTS) == 0) {
            _reportUnexpectedChar(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        int readUnsignedByte = this._inputData.readUnsignedByte();
        if (readUnsignedByte == 47) {
            _skipLine();
        } else if (readUnsignedByte == 42) {
            _skipCComment();
        } else {
            _reportUnexpectedChar(readUnsignedByte, "was expecting either '*' or '/' for a comment");
        }
    }

    private final void _skipLine() throws IOException {
        int[] inputCodeComment = CharTypes.getInputCodeComment();
        while (true) {
            int readUnsignedByte = this._inputData.readUnsignedByte();
            int i2 = inputCodeComment[readUnsignedByte];
            if (i2 != 0) {
                if (i2 == 2) {
                    _skipUtf8_2();
                } else if (i2 == 3) {
                    _skipUtf8_3();
                } else if (i2 == 4) {
                    _skipUtf8_4();
                } else if (i2 == 10 || i2 == 13) {
                    break;
                } else if (i2 != 42 && i2 < 0) {
                    _reportInvalidChar(readUnsignedByte);
                }
            }
        }
        this._currInputRow++;
    }

    private final void _skipUtf8_2() throws IOException {
        int readUnsignedByte = this._inputData.readUnsignedByte();
        if ((readUnsignedByte & 192) != 128) {
            _reportInvalidOther(readUnsignedByte & KotlinVersion.MAX_COMPONENT_VALUE);
        }
    }

    private final void _skipUtf8_3() throws IOException {
        int readUnsignedByte = this._inputData.readUnsignedByte();
        if ((readUnsignedByte & 192) != 128) {
            _reportInvalidOther(readUnsignedByte & KotlinVersion.MAX_COMPONENT_VALUE);
        }
        int readUnsignedByte2 = this._inputData.readUnsignedByte();
        if ((readUnsignedByte2 & 192) != 128) {
            _reportInvalidOther(readUnsignedByte2 & KotlinVersion.MAX_COMPONENT_VALUE);
        }
    }

    private final void _skipUtf8_4() throws IOException {
        int readUnsignedByte = this._inputData.readUnsignedByte();
        if ((readUnsignedByte & 192) != 128) {
            _reportInvalidOther(readUnsignedByte & KotlinVersion.MAX_COMPONENT_VALUE);
        }
        int readUnsignedByte2 = this._inputData.readUnsignedByte();
        if ((readUnsignedByte2 & 192) != 128) {
            _reportInvalidOther(readUnsignedByte2 & KotlinVersion.MAX_COMPONENT_VALUE);
        }
        int readUnsignedByte3 = this._inputData.readUnsignedByte();
        if ((readUnsignedByte3 & 192) != 128) {
            _reportInvalidOther(readUnsignedByte3 & KotlinVersion.MAX_COMPONENT_VALUE);
        }
    }

    private final int _skipWS() throws IOException {
        int i2 = this._nextByte;
        if (i2 < 0) {
            i2 = this._inputData.readUnsignedByte();
        } else {
            this._nextByte = -1;
        }
        while (i2 <= 32) {
            if (i2 == 13 || i2 == 10) {
                this._currInputRow++;
            }
            i2 = this._inputData.readUnsignedByte();
        }
        return (i2 == 47 || i2 == 35) ? _skipWSComment(i2) : i2;
    }

    private final int _skipWSComment(int i2) throws IOException {
        while (true) {
            if (i2 > 32) {
                if (i2 == 47) {
                    _skipComment();
                } else if (i2 != 35 || !_skipYAMLComment()) {
                    break;
                }
            } else if (i2 == 13 || i2 == 10) {
                this._currInputRow++;
            }
            i2 = this._inputData.readUnsignedByte();
        }
        return i2;
    }

    private final int _skipWSOrEnd() throws IOException {
        int i2 = this._nextByte;
        if (i2 < 0) {
            try {
                i2 = this._inputData.readUnsignedByte();
            } catch (EOFException unused) {
                return _eofAsNextChar();
            }
        } else {
            this._nextByte = -1;
        }
        while (i2 <= 32) {
            if (i2 == 13 || i2 == 10) {
                this._currInputRow++;
            }
            try {
                i2 = this._inputData.readUnsignedByte();
            } catch (EOFException unused2) {
                return _eofAsNextChar();
            }
        }
        return (i2 == 47 || i2 == 35) ? _skipWSComment(i2) : i2;
    }

    private final boolean _skipYAMLComment() throws IOException {
        if ((this._features & FEAT_MASK_ALLOW_YAML_COMMENTS) == 0) {
            return false;
        }
        _skipLine();
        return true;
    }

    private final void _verifyRootSpace() throws IOException {
        int i2 = this._nextByte;
        if (i2 > 32) {
            _reportMissingRootWS(i2);
            return;
        }
        this._nextByte = -1;
        if (i2 == 13 || i2 == 10) {
            this._currInputRow++;
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
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.addName(int[], int, int):java.lang.String");
    }

    private final String findName(int i2, int i3) throws JsonParseException {
        int pad = pad(i2, i3);
        String findName = this._symbols.findName(pad);
        if (findName != null) {
            return findName;
        }
        int[] iArr = this._quadBuffer;
        iArr[0] = pad;
        return addName(iArr, 1, i3);
    }

    private static final int pad(int i2, int i3) {
        return i3 == 4 ? i2 : i2 | ((-1) << (i3 << 3));
    }

    private final String parseName(int i2, int i3, int i4) throws IOException {
        return parseEscapedName(this._quadBuffer, 0, i2, i3, i4);
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public void _closeInput() throws IOException {
    }

    public final byte[] _decodeBase64(Base64Variant base64Variant) throws IOException {
        int readUnsignedByte;
        ByteArrayBuilder _getByteArrayBuilder = _getByteArrayBuilder();
        while (true) {
            int readUnsignedByte2 = this._inputData.readUnsignedByte();
            if (readUnsignedByte2 > 32) {
                int decodeBase64Char = base64Variant.decodeBase64Char(readUnsignedByte2);
                if (decodeBase64Char < 0) {
                    if (readUnsignedByte2 == 34) {
                        return _getByteArrayBuilder.toByteArray();
                    }
                    decodeBase64Char = _decodeBase64Escape(base64Variant, readUnsignedByte2, 0);
                    if (decodeBase64Char < 0) {
                        continue;
                    }
                }
                int readUnsignedByte3 = this._inputData.readUnsignedByte();
                int decodeBase64Char2 = base64Variant.decodeBase64Char(readUnsignedByte3);
                if (decodeBase64Char2 < 0) {
                    decodeBase64Char2 = _decodeBase64Escape(base64Variant, readUnsignedByte3, 1);
                }
                int i2 = (decodeBase64Char << 6) | decodeBase64Char2;
                int readUnsignedByte4 = this._inputData.readUnsignedByte();
                int decodeBase64Char3 = base64Variant.decodeBase64Char(readUnsignedByte4);
                if (decodeBase64Char3 < 0) {
                    if (decodeBase64Char3 != -2) {
                        if (readUnsignedByte4 == 34) {
                            _getByteArrayBuilder.append(i2 >> 4);
                            if (base64Variant.usesPadding()) {
                                _handleBase64MissingPadding(base64Variant);
                            }
                            return _getByteArrayBuilder.toByteArray();
                        }
                        decodeBase64Char3 = _decodeBase64Escape(base64Variant, readUnsignedByte4, 2);
                    }
                    if (decodeBase64Char3 == -2) {
                        readUnsignedByte = this._inputData.readUnsignedByte();
                        if (base64Variant.usesPaddingChar(readUnsignedByte) || (readUnsignedByte == 92 && _decodeBase64Escape(base64Variant, readUnsignedByte, 3) == -2)) {
                            _getByteArrayBuilder.append(i2 >> 4);
                        }
                    }
                }
                int i3 = (i2 << 6) | decodeBase64Char3;
                int readUnsignedByte5 = this._inputData.readUnsignedByte();
                int decodeBase64Char4 = base64Variant.decodeBase64Char(readUnsignedByte5);
                if (decodeBase64Char4 < 0) {
                    if (decodeBase64Char4 != -2) {
                        if (readUnsignedByte5 == 34) {
                            _getByteArrayBuilder.appendTwoBytes(i3 >> 2);
                            if (base64Variant.usesPadding()) {
                                _handleBase64MissingPadding(base64Variant);
                            }
                            return _getByteArrayBuilder.toByteArray();
                        }
                        decodeBase64Char4 = _decodeBase64Escape(base64Variant, readUnsignedByte5, 3);
                    }
                    if (decodeBase64Char4 == -2) {
                        _getByteArrayBuilder.appendTwoBytes(i3 >> 2);
                    }
                }
                _getByteArrayBuilder.appendThreeBytes((i3 << 6) | decodeBase64Char4);
            }
        }
        StringBuilder m24u = C0000a.m24u("expected padding character '");
        m24u.append(base64Variant.getPaddingChar());
        m24u.append("'");
        throw reportInvalidBase64Char(base64Variant, readUnsignedByte, 3, m24u.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int _decodeCharForError(int r7) throws java.io.IOException {
        /*
            r6 = this;
            r7 = r7 & 255(0xff, float:3.57E-43)
            r0 = 127(0x7f, float:1.78E-43)
            if (r7 <= r0) goto L6e
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
            java.io.DataInput r3 = r6._inputData
            int r3 = r3.readUnsignedByte()
            r4 = r3 & 192(0xc0, float:2.69E-43)
            r5 = 128(0x80, float:1.8E-43)
            if (r4 == r5) goto L3d
            r4 = r3 & 255(0xff, float:3.57E-43)
            r6._reportInvalidOther(r4)
        L3d:
            int r7 = r7 << 6
            r3 = r3 & 63
            r7 = r7 | r3
            if (r0 <= r2) goto L6e
            java.io.DataInput r2 = r6._inputData
            int r2 = r2.readUnsignedByte()
            r3 = r2 & 192(0xc0, float:2.69E-43)
            if (r3 == r5) goto L53
            r3 = r2 & 255(0xff, float:3.57E-43)
            r6._reportInvalidOther(r3)
        L53:
            int r7 = r7 << 6
            r2 = r2 & 63
            r7 = r7 | r2
            if (r0 <= r1) goto L6e
            java.io.DataInput r0 = r6._inputData
            int r0 = r0.readUnsignedByte()
            r1 = r0 & 192(0xc0, float:2.69E-43)
            if (r1 == r5) goto L69
            r1 = r0 & 255(0xff, float:3.57E-43)
            r6._reportInvalidOther(r1)
        L69:
            int r7 = r7 << 6
            r0 = r0 & 63
            r7 = r7 | r0
        L6e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._decodeCharForError(int):int");
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public char _decodeEscaped() throws IOException {
        int readUnsignedByte = this._inputData.readUnsignedByte();
        if (readUnsignedByte == 34 || readUnsignedByte == 47 || readUnsignedByte == 92) {
            return (char) readUnsignedByte;
        }
        if (readUnsignedByte == 98) {
            return '\b';
        }
        if (readUnsignedByte == 102) {
            return '\f';
        }
        if (readUnsignedByte == 110) {
            return '\n';
        }
        if (readUnsignedByte == 114) {
            return '\r';
        }
        if (readUnsignedByte == 116) {
            return '\t';
        }
        if (readUnsignedByte != 117) {
            return _handleUnrecognizedCharacterEscape((char) _decodeCharForError(readUnsignedByte));
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            int readUnsignedByte2 = this._inputData.readUnsignedByte();
            int charToHex = CharTypes.charToHex(readUnsignedByte2);
            if (charToHex < 0) {
                _reportUnexpectedChar(readUnsignedByte2, "expected a hex-digit for character escape sequence");
            }
            i2 = (i2 << 4) | charToHex;
        }
        return (char) i2;
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public void _finishString() throws IOException {
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int[] iArr = _icUTF8;
        int length = emptyAndGetCurrentSegment.length;
        int i2 = 0;
        while (true) {
            int readUnsignedByte = this._inputData.readUnsignedByte();
            if (iArr[readUnsignedByte] != 0) {
                if (readUnsignedByte == 34) {
                    this._textBuffer.setCurrentLength(i2);
                    return;
                } else {
                    _finishString2(emptyAndGetCurrentSegment, i2, readUnsignedByte);
                    return;
                }
            }
            int i3 = i2 + 1;
            emptyAndGetCurrentSegment[i2] = (char) readUnsignedByte;
            if (i3 >= length) {
                _finishString2(emptyAndGetCurrentSegment, i3, this._inputData.readUnsignedByte());
                return;
            }
            i2 = i3;
        }
    }

    public final String _getText2(JsonToken jsonToken) {
        if (jsonToken == null) {
            return null;
        }
        int m5359id = jsonToken.m5359id();
        return m5359id != 5 ? (m5359id == 6 || m5359id == 7 || m5359id == 8) ? this._textBuffer.contentsAsString() : jsonToken.asString() : this._parsingContext.getCurrentName();
    }

    public JsonToken _handleApos() throws IOException {
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int[] iArr = _icUTF8;
        int i2 = 0;
        while (true) {
            int length = emptyAndGetCurrentSegment.length;
            if (i2 >= emptyAndGetCurrentSegment.length) {
                emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                length = emptyAndGetCurrentSegment.length;
                i2 = 0;
            }
            while (true) {
                int readUnsignedByte = this._inputData.readUnsignedByte();
                if (readUnsignedByte == 39) {
                    this._textBuffer.setCurrentLength(i2);
                    return JsonToken.VALUE_STRING;
                }
                if (iArr[readUnsignedByte] != 0) {
                    int i3 = iArr[readUnsignedByte];
                    if (i3 == 1) {
                        readUnsignedByte = _decodeEscaped();
                    } else if (i3 == 2) {
                        readUnsignedByte = _decodeUtf8_2(readUnsignedByte);
                    } else if (i3 == 3) {
                        readUnsignedByte = _decodeUtf8_3(readUnsignedByte);
                    } else if (i3 != 4) {
                        if (readUnsignedByte < 32) {
                            _throwUnquotedSpace(readUnsignedByte, "string value");
                        }
                        _reportInvalidChar(readUnsignedByte);
                    } else {
                        int _decodeUtf8_4 = _decodeUtf8_4(readUnsignedByte);
                        int i4 = i2 + 1;
                        emptyAndGetCurrentSegment[i2] = (char) (55296 | (_decodeUtf8_4 >> 10));
                        if (i4 >= emptyAndGetCurrentSegment.length) {
                            emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                            i2 = 0;
                        } else {
                            i2 = i4;
                        }
                        readUnsignedByte = 56320 | (_decodeUtf8_4 & 1023);
                    }
                    if (i2 >= emptyAndGetCurrentSegment.length) {
                        emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                        i2 = 0;
                    }
                    emptyAndGetCurrentSegment[i2] = (char) readUnsignedByte;
                    i2++;
                } else {
                    int i5 = i2 + 1;
                    emptyAndGetCurrentSegment[i2] = (char) readUnsignedByte;
                    i2 = i5;
                    if (i5 >= length) {
                        break;
                    }
                }
            }
        }
    }

    public JsonToken _handleInvalidNumberStart(int i2, boolean z) throws IOException {
        String str;
        while (i2 == 73) {
            i2 = this._inputData.readUnsignedByte();
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
            _reportError("Non-standard token '" + str + "': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
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
        do {
            if (i3 < 4) {
                i3++;
                i5 = i2 | (i5 << 8);
            } else {
                if (i4 >= iArr.length) {
                    iArr = _growArrayBy(iArr, iArr.length);
                    this._quadBuffer = iArr;
                }
                iArr[i4] = i5;
                i5 = i2;
                i4++;
                i3 = 1;
            }
            i2 = this._inputData.readUnsignedByte();
        } while (inputCodeUtf8JsNames[i2] == 0);
        this._nextByte = i2;
        if (i3 > 0) {
            if (i4 >= iArr.length) {
                int[] _growArrayBy = _growArrayBy(iArr, iArr.length);
                this._quadBuffer = _growArrayBy;
                iArr = _growArrayBy;
            }
            iArr[i4] = i5;
            i4++;
        }
        String findName = this._symbols.findName(iArr, i4);
        return findName == null ? addName(iArr, i4, i3) : findName;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001b, code lost:
    
        if (r4 != 44) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
    
        if ((r3._features & com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.FEAT_MASK_ALLOW_MISSING) == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
    
        r3._nextByte = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        return com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0030, code lost:
    
        if (r3._parsingContext.inArray() == false) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.fasterxml.jackson.core.JsonToken _handleUnexpectedValue(int r4) throws java.io.IOException {
        /*
            r3 = this;
            r0 = 39
            if (r4 == r0) goto L77
            r0 = 73
            r1 = 1
            if (r4 == r0) goto L5e
            r0 = 78
            if (r4 == r0) goto L45
            r0 = 93
            if (r4 == r0) goto L2a
            r0 = 125(0x7d, float:1.75E-43)
            if (r4 == r0) goto L3f
            r0 = 43
            if (r4 == r0) goto L1e
            r0 = 44
            if (r4 == r0) goto L33
            goto L83
        L1e:
            java.io.DataInput r4 = r3._inputData
            int r4 = r4.readUnsignedByte()
            r0 = 0
            com.fasterxml.jackson.core.JsonToken r4 = r3._handleInvalidNumberStart(r4, r0)
            return r4
        L2a:
            com.fasterxml.jackson.core.json.JsonReadContext r0 = r3._parsingContext
            boolean r0 = r0.inArray()
            if (r0 != 0) goto L33
            goto L83
        L33:
            int r0 = r3._features
            int r1 = com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.FEAT_MASK_ALLOW_MISSING
            r0 = r0 & r1
            if (r0 == 0) goto L3f
            r3._nextByte = r4
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            return r4
        L3f:
            java.lang.String r0 = "expected a value"
            r3._reportUnexpectedChar(r4, r0)
            goto L77
        L45:
            java.lang.String r0 = "NaN"
            r3._matchToken(r0, r1)
            int r1 = r3._features
            int r2 = com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.FEAT_MASK_NON_NUM_NUMBERS
            r1 = r1 & r2
            if (r1 == 0) goto L58
            r1 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            com.fasterxml.jackson.core.JsonToken r4 = r3.resetAsNaN(r0, r1)
            return r4
        L58:
            java.lang.String r0 = "Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"
            r3._reportError(r0)
            goto L83
        L5e:
            java.lang.String r0 = "Infinity"
            r3._matchToken(r0, r1)
            int r1 = r3._features
            int r2 = com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.FEAT_MASK_NON_NUM_NUMBERS
            r1 = r1 & r2
            if (r1 == 0) goto L71
            r1 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            com.fasterxml.jackson.core.JsonToken r4 = r3.resetAsNaN(r0, r1)
            return r4
        L71:
            java.lang.String r0 = "Non-standard token 'Infinity': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"
            r3._reportError(r0)
            goto L83
        L77:
            int r0 = r3._features
            int r1 = com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.FEAT_MASK_ALLOW_SINGLE_QUOTES
            r0 = r0 & r1
            if (r0 == 0) goto L83
            com.fasterxml.jackson.core.JsonToken r4 = r3._handleApos()
            return r4
        L83:
            boolean r0 = java.lang.Character.isJavaIdentifierStart(r4)
            if (r0 == 0) goto L9e
            java.lang.String r0 = ""
            java.lang.StringBuilder r0 = p000a.C0000a.m24u(r0)
            char r1 = (char) r4
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = r3._validJsonTokenList()
            r3._reportInvalidToken(r4, r0, r1)
        L9e:
            java.lang.String r0 = "expected a valid value "
            java.lang.StringBuilder r0 = p000a.C0000a.m24u(r0)
            java.lang.String r1 = r3._validJsonValueList()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3._reportUnexpectedChar(r4, r0)
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._handleUnexpectedValue(int):com.fasterxml.jackson.core.JsonToken");
    }

    public final void _matchToken(String str, int i2) throws IOException {
        int length = str.length();
        do {
            int readUnsignedByte = this._inputData.readUnsignedByte();
            if (readUnsignedByte != str.charAt(i2)) {
                _reportInvalidToken(readUnsignedByte, str.substring(0, i2));
            }
            i2++;
        } while (i2 < length);
        int readUnsignedByte2 = this._inputData.readUnsignedByte();
        if (readUnsignedByte2 >= 48 && readUnsignedByte2 != 93 && readUnsignedByte2 != 125) {
            _checkMatchEnd(str, i2, readUnsignedByte2);
        }
        this._nextByte = readUnsignedByte2;
    }

    public String _parseAposName() throws IOException {
        int readUnsignedByte = this._inputData.readUnsignedByte();
        if (readUnsignedByte == 39) {
            return "";
        }
        int[] iArr = this._quadBuffer;
        int[] iArr2 = _icLatin1;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (readUnsignedByte != 39) {
            if (readUnsignedByte != 34 && iArr2[readUnsignedByte] != 0) {
                if (readUnsignedByte != 92) {
                    _throwUnquotedSpace(readUnsignedByte, "name");
                } else {
                    readUnsignedByte = _decodeEscaped();
                }
                if (readUnsignedByte > 127) {
                    if (i2 >= 4) {
                        if (i3 >= iArr.length) {
                            iArr = _growArrayBy(iArr, iArr.length);
                            this._quadBuffer = iArr;
                        }
                        iArr[i3] = i4;
                        i3++;
                        i2 = 0;
                        i4 = 0;
                    }
                    if (readUnsignedByte < 2048) {
                        i4 = (i4 << 8) | (readUnsignedByte >> 6) | 192;
                        i2++;
                    } else {
                        int i5 = (i4 << 8) | (readUnsignedByte >> 12) | 224;
                        int i6 = i2 + 1;
                        if (i6 >= 4) {
                            if (i3 >= iArr.length) {
                                iArr = _growArrayBy(iArr, iArr.length);
                                this._quadBuffer = iArr;
                            }
                            iArr[i3] = i5;
                            i3++;
                            i6 = 0;
                            i5 = 0;
                        }
                        i4 = (i5 << 8) | ((readUnsignedByte >> 6) & 63) | 128;
                        i2 = i6 + 1;
                    }
                    readUnsignedByte = (readUnsignedByte & 63) | 128;
                }
            }
            if (i2 < 4) {
                i2++;
                i4 = readUnsignedByte | (i4 << 8);
            } else {
                if (i3 >= iArr.length) {
                    iArr = _growArrayBy(iArr, iArr.length);
                    this._quadBuffer = iArr;
                }
                iArr[i3] = i4;
                i4 = readUnsignedByte;
                i3++;
                i2 = 1;
            }
            readUnsignedByte = this._inputData.readUnsignedByte();
        }
        if (i2 > 0) {
            if (i3 >= iArr.length) {
                int[] _growArrayBy = _growArrayBy(iArr, iArr.length);
                this._quadBuffer = _growArrayBy;
                iArr = _growArrayBy;
            }
            iArr[i3] = pad(i4, i2);
            i3++;
        }
        String findName = this._symbols.findName(iArr, i3);
        return findName == null ? addName(iArr, i3, i2) : findName;
    }

    public final String _parseName(int i2) throws IOException {
        if (i2 != 34) {
            return _handleOddName(i2);
        }
        int[] iArr = _icLatin1;
        int readUnsignedByte = this._inputData.readUnsignedByte();
        if (iArr[readUnsignedByte] != 0) {
            return readUnsignedByte == 34 ? "" : parseName(0, readUnsignedByte, 0);
        }
        int readUnsignedByte2 = this._inputData.readUnsignedByte();
        if (iArr[readUnsignedByte2] != 0) {
            return readUnsignedByte2 == 34 ? findName(readUnsignedByte, 1) : parseName(readUnsignedByte, readUnsignedByte2, 1);
        }
        int i3 = (readUnsignedByte << 8) | readUnsignedByte2;
        int readUnsignedByte3 = this._inputData.readUnsignedByte();
        if (iArr[readUnsignedByte3] != 0) {
            return readUnsignedByte3 == 34 ? findName(i3, 2) : parseName(i3, readUnsignedByte3, 2);
        }
        int i4 = (i3 << 8) | readUnsignedByte3;
        int readUnsignedByte4 = this._inputData.readUnsignedByte();
        if (iArr[readUnsignedByte4] != 0) {
            return readUnsignedByte4 == 34 ? findName(i4, 3) : parseName(i4, readUnsignedByte4, 3);
        }
        int i5 = (i4 << 8) | readUnsignedByte4;
        int readUnsignedByte5 = this._inputData.readUnsignedByte();
        if (iArr[readUnsignedByte5] != 0) {
            return readUnsignedByte5 == 34 ? findName(i5, 4) : parseName(i5, readUnsignedByte5, 4);
        }
        this._quad1 = i5;
        return _parseMediumName(readUnsignedByte5);
    }

    public JsonToken _parseNegNumber() throws IOException {
        int readUnsignedByte;
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        emptyAndGetCurrentSegment[0] = '-';
        int readUnsignedByte2 = this._inputData.readUnsignedByte();
        emptyAndGetCurrentSegment[1] = (char) readUnsignedByte2;
        if (readUnsignedByte2 <= 48) {
            if (readUnsignedByte2 != 48) {
                return _handleInvalidNumberStart(readUnsignedByte2, true);
            }
            readUnsignedByte = _handleLeadingZeroes();
        } else {
            if (readUnsignedByte2 > 57) {
                return _handleInvalidNumberStart(readUnsignedByte2, true);
            }
            readUnsignedByte = this._inputData.readUnsignedByte();
        }
        int i2 = 2;
        int i3 = 1;
        while (readUnsignedByte <= 57 && readUnsignedByte >= 48) {
            i3++;
            emptyAndGetCurrentSegment[i2] = (char) readUnsignedByte;
            readUnsignedByte = this._inputData.readUnsignedByte();
            i2++;
        }
        if (readUnsignedByte == 46 || readUnsignedByte == 101 || readUnsignedByte == 69) {
            return _parseFloat(emptyAndGetCurrentSegment, i2, readUnsignedByte, true, i3);
        }
        this._textBuffer.setCurrentLength(i2);
        this._nextByte = readUnsignedByte;
        if (this._parsingContext.inRoot()) {
            _verifyRootSpace();
        }
        return resetInt(true, i3);
    }

    public JsonToken _parsePosNumber(int i2) throws IOException {
        int readUnsignedByte;
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int i3 = 1;
        if (i2 == 48) {
            readUnsignedByte = _handleLeadingZeroes();
            if (readUnsignedByte > 57 || readUnsignedByte < 48) {
                emptyAndGetCurrentSegment[0] = '0';
            } else {
                i3 = 0;
            }
        } else {
            emptyAndGetCurrentSegment[0] = (char) i2;
            readUnsignedByte = this._inputData.readUnsignedByte();
        }
        int i4 = readUnsignedByte;
        int i5 = i3;
        int i6 = i5;
        while (i4 <= 57 && i4 >= 48) {
            i6++;
            emptyAndGetCurrentSegment[i5] = (char) i4;
            i4 = this._inputData.readUnsignedByte();
            i5++;
        }
        if (i4 == 46 || i4 == 101 || i4 == 69) {
            return _parseFloat(emptyAndGetCurrentSegment, i5, i4, false, i6);
        }
        this._textBuffer.setCurrentLength(i5);
        if (this._parsingContext.inRoot()) {
            _verifyRootSpace();
        } else {
            this._nextByte = i4;
        }
        return resetInt(false, i6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00cd, code lost:
    
        r11._tokenIncomplete = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00cf, code lost:
    
        if (r3 <= 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d1, code lost:
    
        r4 = r4 + r3;
        r13.write(r14, 0, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d5, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int _readBinary(com.fasterxml.jackson.core.Base64Variant r12, java.io.OutputStream r13, byte[] r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8DataInputJsonParser._readBinary(com.fasterxml.jackson.core.Base64Variant, java.io.OutputStream, byte[]):int");
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public void _releaseBuffers() throws IOException {
        super._releaseBuffers();
        this._symbols.release();
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

    public void _reportInvalidToken(int i2, String str) throws IOException {
        _reportInvalidToken(i2, str, _validJsonTokenList());
    }

    public void _skipString() throws IOException {
        this._tokenIncomplete = false;
        int[] iArr = _icUTF8;
        while (true) {
            int readUnsignedByte = this._inputData.readUnsignedByte();
            if (iArr[readUnsignedByte] != 0) {
                if (readUnsignedByte == 34) {
                    return;
                }
                int i2 = iArr[readUnsignedByte];
                if (i2 == 1) {
                    _decodeEscaped();
                } else if (i2 == 2) {
                    _skipUtf8_2();
                } else if (i2 == 3) {
                    _skipUtf8_3();
                } else if (i2 == 4) {
                    _skipUtf8_4();
                } else if (readUnsignedByte < 32) {
                    _throwUnquotedSpace(readUnsignedByte, "string value");
                } else {
                    _reportInvalidChar(readUnsignedByte);
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
        return new JsonLocation(_getSourceReference(), -1L, -1L, this._currInputRow, -1);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Object getInputSource() {
        return this._inputData;
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
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (this._tokenIncomplete) {
                this._tokenIncomplete = false;
                _finishString();
            }
            return this._textBuffer.size();
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return this._parsingContext.getCurrentName().length();
        }
        if (jsonToken != null) {
            return jsonToken.isNumeric() ? this._textBuffer.size() : this._currToken.asCharArray().length;
        }
        return 0;
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
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.UTF8DataInputJsonParser.getTextOffset():int");
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase, com.fasterxml.jackson.core.JsonParser
    public JsonLocation getTokenLocation() {
        return new JsonLocation(_getSourceReference(), -1L, -1L, this._tokenInputRow, -1);
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
        int _skipWS = _skipWS();
        this._binaryValue = null;
        this._tokenInputRow = this._currInputRow;
        if (_skipWS == 93 || _skipWS == 125) {
            _closeScope(_skipWS);
            return null;
        }
        if (this._parsingContext.expectComma()) {
            if (_skipWS != 44) {
                StringBuilder m24u = C0000a.m24u("was expecting comma to separate ");
                m24u.append(this._parsingContext.typeDesc());
                m24u.append(" entries");
                _reportUnexpectedChar(_skipWS, m24u.toString());
            }
            _skipWS = _skipWS();
            if ((this._features & FEAT_MASK_TRAILING_COMMA) != 0 && (_skipWS == 93 || _skipWS == 125)) {
                _closeScope(_skipWS);
                return null;
            }
        }
        if (!this._parsingContext.inObject()) {
            _nextTokenNotInObject(_skipWS);
            return null;
        }
        String _parseName = _parseName(_skipWS);
        this._parsingContext.setCurrentName(_parseName);
        this._currToken = jsonToken2;
        int _skipColon = _skipColon();
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
            _matchToken("false", 1);
            _parseNegNumber = JsonToken.VALUE_FALSE;
        } else if (_skipColon == 110) {
            _matchToken("null", 1);
            _parseNegNumber = JsonToken.VALUE_NULL;
        } else if (_skipColon == 116) {
            _matchToken("true", 1);
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
        if (this._closed) {
            return null;
        }
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
        this._tokenInputRow = this._currInputRow;
        if (_skipWSOrEnd == 93 || _skipWSOrEnd == 125) {
            _closeScope(_skipWSOrEnd);
            return this._currToken;
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
                return this._currToken;
            }
        }
        if (!this._parsingContext.inObject()) {
            return _nextTokenNotInObject(_skipWSOrEnd);
        }
        this._parsingContext.setCurrentName(_parseName(_skipWSOrEnd));
        this._currToken = jsonToken2;
        int _skipColon = _skipColon();
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
            _matchToken("false", 1);
            _parseNegNumber = JsonToken.VALUE_FALSE;
        } else if (_skipColon == 110) {
            _matchToken("null", 1);
            _parseNegNumber = JsonToken.VALUE_NULL;
        } else if (_skipColon == 116) {
            _matchToken("true", 1);
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
                            iArr = _growArrayBy(iArr, iArr.length);
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
                                iArr = _growArrayBy(iArr, iArr.length);
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
                    iArr = _growArrayBy(iArr, iArr.length);
                    this._quadBuffer = iArr;
                }
                iArr[i2] = i3;
                i3 = i4;
                i2++;
                i5 = 1;
            }
            i4 = this._inputData.readUnsignedByte();
        }
        if (i5 > 0) {
            if (i2 >= iArr.length) {
                iArr = _growArrayBy(iArr, iArr.length);
                this._quadBuffer = iArr;
            }
            iArr[i2] = pad(i3, i5);
            i2++;
        }
        String findName = this._symbols.findName(iArr, i2);
        return findName == null ? addName(iArr, i2, i5) : findName;
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
        return 0;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public void setCodec(ObjectCodec objectCodec) {
        this._objectCodec = objectCodec;
    }

    private final String parseName(int i2, int i3, int i4, int i5) throws IOException {
        int[] iArr = this._quadBuffer;
        iArr[0] = i2;
        return parseEscapedName(iArr, 1, i3, i4, i5);
    }

    public void _reportInvalidToken(int i2, String str, String str2) throws IOException {
        StringBuilder sb = new StringBuilder(str);
        while (true) {
            char _decodeCharForError = (char) _decodeCharForError(i2);
            if (!Character.isJavaIdentifierPart(_decodeCharForError)) {
                StringBuilder m24u = C0000a.m24u("Unrecognized token '");
                m24u.append(sb.toString());
                m24u.append("': was expecting ");
                m24u.append(str2);
                _reportError(m24u.toString());
                return;
            }
            sb.append(_decodeCharForError);
            i2 = this._inputData.readUnsignedByte();
        }
    }

    private final String parseName(int i2, int i3, int i4, int i5, int i6) throws IOException {
        int[] iArr = this._quadBuffer;
        iArr[0] = i2;
        iArr[1] = i3;
        return parseEscapedName(iArr, 2, i4, i5, i6);
    }

    private final String findName(int i2, int i3, int i4) throws JsonParseException {
        int pad = pad(i3, i4);
        String findName = this._symbols.findName(i2, pad);
        if (findName != null) {
            return findName;
        }
        int[] iArr = this._quadBuffer;
        iArr[0] = i2;
        iArr[1] = pad;
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
        int pad = pad(i4, i5);
        String findName = this._symbols.findName(i2, i3, pad);
        if (findName != null) {
            return findName;
        }
        int[] iArr = this._quadBuffer;
        iArr[0] = i2;
        iArr[1] = i3;
        iArr[2] = pad(pad, i5);
        return addName(iArr, 3, i5);
    }

    private final String findName(int[] iArr, int i2, int i3, int i4) throws JsonParseException {
        if (i2 >= iArr.length) {
            iArr = _growArrayBy(iArr, iArr.length);
            this._quadBuffer = iArr;
        }
        int i5 = i2 + 1;
        iArr[i2] = pad(i3, i4);
        String findName = this._symbols.findName(iArr, i5);
        return findName == null ? addName(iArr, i5, i4) : findName;
    }
}
