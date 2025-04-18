package com.fasterxml.jackson.core.json.async;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.base.ParserBase;
import com.fasterxml.jackson.core.json.JsonReadContext;
import com.fasterxml.jackson.core.p006io.IOContext;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import p000a.C0000a;

/* loaded from: classes.dex */
public abstract class NonBlockingJsonParserBase extends ParserBase {
    public static final int MAJOR_ARRAY_ELEMENT_FIRST = 5;
    public static final int MAJOR_ARRAY_ELEMENT_NEXT = 6;
    public static final int MAJOR_CLOSED = 7;
    public static final int MAJOR_INITIAL = 0;
    public static final int MAJOR_OBJECT_FIELD_FIRST = 2;
    public static final int MAJOR_OBJECT_FIELD_NEXT = 3;
    public static final int MAJOR_OBJECT_VALUE = 4;
    public static final int MAJOR_ROOT = 1;
    public static final int MINOR_COMMENT_C = 53;
    public static final int MINOR_COMMENT_CLOSING_ASTERISK = 52;
    public static final int MINOR_COMMENT_CPP = 54;
    public static final int MINOR_COMMENT_LEADING_SLASH = 51;
    public static final int MINOR_COMMENT_YAML = 55;
    public static final int MINOR_FIELD_APOS_NAME = 9;
    public static final int MINOR_FIELD_LEADING_COMMA = 5;
    public static final int MINOR_FIELD_LEADING_WS = 4;
    public static final int MINOR_FIELD_NAME = 7;
    public static final int MINOR_FIELD_NAME_ESCAPE = 8;
    public static final int MINOR_FIELD_UNQUOTED_NAME = 10;
    public static final int MINOR_NUMBER_EXPONENT_DIGITS = 32;
    public static final int MINOR_NUMBER_EXPONENT_MARKER = 31;
    public static final int MINOR_NUMBER_FRACTION_DIGITS = 30;
    public static final int MINOR_NUMBER_INTEGER_DIGITS = 26;
    public static final int MINOR_NUMBER_MINUS = 23;
    public static final int MINOR_NUMBER_MINUSZERO = 25;
    public static final int MINOR_NUMBER_ZERO = 24;
    public static final int MINOR_ROOT_BOM = 1;
    public static final int MINOR_ROOT_GOT_SEPARATOR = 3;
    public static final int MINOR_ROOT_NEED_SEPARATOR = 2;
    public static final int MINOR_VALUE_APOS_STRING = 45;
    public static final int MINOR_VALUE_EXPECTING_COLON = 14;
    public static final int MINOR_VALUE_EXPECTING_COMMA = 13;
    public static final int MINOR_VALUE_LEADING_WS = 12;
    public static final int MINOR_VALUE_STRING = 40;
    public static final int MINOR_VALUE_STRING_ESCAPE = 41;
    public static final int MINOR_VALUE_STRING_UTF8_2 = 42;
    public static final int MINOR_VALUE_STRING_UTF8_3 = 43;
    public static final int MINOR_VALUE_STRING_UTF8_4 = 44;
    public static final int MINOR_VALUE_TOKEN_ERROR = 50;
    public static final int MINOR_VALUE_TOKEN_FALSE = 18;
    public static final int MINOR_VALUE_TOKEN_NON_STD = 19;
    public static final int MINOR_VALUE_TOKEN_NULL = 16;
    public static final int MINOR_VALUE_TOKEN_TRUE = 17;
    public static final int MINOR_VALUE_WS_AFTER_COMMA = 15;
    public static final int NON_STD_TOKEN_INFINITY = 1;
    public static final int NON_STD_TOKEN_MINUS_INFINITY = 3;
    public static final int NON_STD_TOKEN_NAN = 0;
    public static final int NON_STD_TOKEN_PLUS_INFINITY = 2;
    public int _currBufferStart;
    public int _currInputRowAlt;
    public boolean _endOfInput;
    public int _majorState;
    public int _majorStateAfterValue;
    public int _minorState;
    public int _minorStateAfterSplit;
    public int _nonStdTokenType;
    public int _pending32;
    public int _pendingBytes;
    public int _quad1;
    public int[] _quadBuffer;
    public int _quadLength;
    public int _quoted32;
    public int _quotedDigits;
    public final ByteQuadsCanonicalizer _symbols;
    public static final String[] NON_STD_TOKENS = {"NaN", "Infinity", "+Infinity", "-Infinity"};
    public static final double[] NON_STD_TOKEN_VALUES = {Double.NaN, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY};

    public NonBlockingJsonParserBase(IOContext iOContext, int i2, ByteQuadsCanonicalizer byteQuadsCanonicalizer) {
        super(iOContext, i2);
        this._quadBuffer = new int[8];
        this._endOfInput = false;
        this._currBufferStart = 0;
        this._currInputRowAlt = 1;
        this._symbols = byteQuadsCanonicalizer;
        this._currToken = null;
        this._majorState = 0;
        this._majorStateAfterValue = 1;
    }

    public static final int _padLastQuad(int i2, int i3) {
        return i3 == 4 ? i2 : i2 | ((-1) << (i3 << 3));
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
    public final java.lang.String _addName(int[] r17, int r18, int r19) throws com.fasterxml.jackson.core.JsonParseException {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.async.NonBlockingJsonParserBase._addName(int[], int, int):java.lang.String");
    }

    public final JsonToken _closeArrayScope() throws IOException {
        if (!this._parsingContext.inArray()) {
            _reportMismatchedEndMarker(93, '}');
        }
        JsonReadContext parent = this._parsingContext.getParent();
        this._parsingContext = parent;
        int i2 = parent.inObject() ? 3 : parent.inArray() ? 6 : 1;
        this._majorState = i2;
        this._majorStateAfterValue = i2;
        JsonToken jsonToken = JsonToken.END_ARRAY;
        this._currToken = jsonToken;
        return jsonToken;
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public void _closeInput() throws IOException {
        this._currBufferStart = 0;
        this._inputEnd = 0;
    }

    public final JsonToken _closeObjectScope() throws IOException {
        if (!this._parsingContext.inObject()) {
            _reportMismatchedEndMarker(125, ']');
        }
        JsonReadContext parent = this._parsingContext.getParent();
        this._parsingContext = parent;
        int i2 = parent.inObject() ? 3 : parent.inArray() ? 6 : 1;
        this._majorState = i2;
        this._majorStateAfterValue = i2;
        JsonToken jsonToken = JsonToken.END_OBJECT;
        this._currToken = jsonToken;
        return jsonToken;
    }

    public final JsonToken _eofAsNextToken() throws IOException {
        this._majorState = 7;
        if (!this._parsingContext.inRoot()) {
            _handleEOF();
        }
        close();
        this._currToken = null;
        return null;
    }

    public final JsonToken _fieldComplete(String str) throws IOException {
        this._majorState = 4;
        this._parsingContext.setCurrentName(str);
        JsonToken jsonToken = JsonToken.FIELD_NAME;
        this._currToken = jsonToken;
        return jsonToken;
    }

    public final String _findName(int i2, int i3) throws JsonParseException {
        int _padLastQuad = _padLastQuad(i2, i3);
        String findName = this._symbols.findName(_padLastQuad);
        if (findName != null) {
            return findName;
        }
        int[] iArr = this._quadBuffer;
        iArr[0] = _padLastQuad;
        return _addName(iArr, 1, i3);
    }

    public final String _getText2(JsonToken jsonToken) {
        int m5359id;
        if (jsonToken == null || (m5359id = jsonToken.m5359id()) == -1) {
            return null;
        }
        return m5359id != 5 ? (m5359id == 6 || m5359id == 7 || m5359id == 8) ? this._textBuffer.contentsAsString() : jsonToken.asString() : this._parsingContext.getCurrentName();
    }

    public final String _nonStdToken(int i2) {
        return NON_STD_TOKENS[i2];
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

    public void _reportInvalidOther(int i2, int i3) throws JsonParseException {
        this._inputPtr = i3;
        _reportInvalidOther(i2);
    }

    public final JsonToken _startArrayScope() throws IOException {
        this._parsingContext = this._parsingContext.createChildArrayContext(-1, -1);
        this._majorState = 5;
        this._majorStateAfterValue = 6;
        JsonToken jsonToken = JsonToken.START_ARRAY;
        this._currToken = jsonToken;
        return jsonToken;
    }

    public final JsonToken _startObjectScope() throws IOException {
        this._parsingContext = this._parsingContext.createChildObjectContext(-1, -1);
        this._majorState = 2;
        this._majorStateAfterValue = 3;
        JsonToken jsonToken = JsonToken.START_OBJECT;
        this._currToken = jsonToken;
        return jsonToken;
    }

    public final void _updateTokenLocation() {
        this._tokenInputRow = Math.max(this._currInputRow, this._currInputRowAlt);
        this._tokenInputCol = this._inputPtr - this._currInputRowStart;
        this._tokenInputTotal = this._currInputProcessed + (r0 - this._currBufferStart);
    }

    public final JsonToken _valueComplete(JsonToken jsonToken) throws IOException {
        this._majorState = this._majorStateAfterValue;
        this._currToken = jsonToken;
        return jsonToken;
    }

    public final JsonToken _valueCompleteInt(int i2, String str) throws IOException {
        this._textBuffer.resetWithString(str);
        this._intLength = str.length();
        this._numTypesValid = 1;
        this._numberInt = i2;
        this._majorState = this._majorStateAfterValue;
        JsonToken jsonToken = JsonToken.VALUE_NUMBER_INT;
        this._currToken = jsonToken;
        return jsonToken;
    }

    public final JsonToken _valueNonStdNumberComplete(int i2) throws IOException {
        String str = NON_STD_TOKENS[i2];
        this._textBuffer.resetWithString(str);
        if (!isEnabled(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS)) {
            _reportError("Non-standard token '%s': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow", str);
        }
        this._intLength = 0;
        this._numTypesValid = 8;
        this._numberDouble = NON_STD_TOKEN_VALUES[i2];
        this._majorState = this._majorStateAfterValue;
        JsonToken jsonToken = JsonToken.VALUE_NUMBER_FLOAT;
        this._currToken = jsonToken;
        return jsonToken;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean canParseAsync() {
        return true;
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase, com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public byte[] getBinaryValue(Base64Variant base64Variant) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.VALUE_STRING) {
            _reportError("Current token (%s) not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary", jsonToken);
        }
        if (this._binaryValue == null) {
            ByteArrayBuilder _getByteArrayBuilder = _getByteArrayBuilder();
            _decodeBase64(getText(), _getByteArrayBuilder, base64Variant);
            this._binaryValue = _getByteArrayBuilder.toByteArray();
        }
        return this._binaryValue;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public ObjectCodec getCodec() {
        return null;
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase, com.fasterxml.jackson.core.JsonParser
    public JsonLocation getCurrentLocation() {
        return new JsonLocation(_getSourceReference(), this._currInputProcessed + (this._inputPtr - this._currBufferStart), -1L, Math.max(this._currInputRow, this._currInputRowAlt), (this._inputPtr - this._currInputRowStart) + 1);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Object getEmbeddedObject() throws IOException {
        if (this._currToken == JsonToken.VALUE_EMBEDDED_OBJECT) {
            return this._binaryValue;
        }
        return null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Object getInputSource() {
        return null;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public String getText() throws IOException {
        JsonToken jsonToken = this._currToken;
        return jsonToken == JsonToken.VALUE_STRING ? this._textBuffer.contentsAsString() : _getText2(jsonToken);
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public char[] getTextCharacters() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == null) {
            return null;
        }
        int m5359id = jsonToken.m5359id();
        if (m5359id != 5) {
            return (m5359id == 6 || m5359id == 7 || m5359id == 8) ? this._textBuffer.getTextBuffer() : this._currToken.asCharArray();
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
        return m5359id != 5 ? (m5359id == 6 || m5359id == 7 || m5359id == 8) ? this._textBuffer.size() : this._currToken.asCharArray().length : this._parsingContext.getCurrentName().length();
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public int getTextOffset() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == null) {
            return 0;
        }
        int m5359id = jsonToken.m5359id();
        if (m5359id == 6 || m5359id == 7 || m5359id == 8) {
            return this._textBuffer.getTextOffset();
        }
        return 0;
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase, com.fasterxml.jackson.core.JsonParser
    public JsonLocation getTokenLocation() {
        return new JsonLocation(_getSourceReference(), this._tokenInputTotal, -1L, this._tokenInputRow, this._tokenInputCol);
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public String getValueAsString() throws IOException {
        JsonToken jsonToken = this._currToken;
        return jsonToken == JsonToken.VALUE_STRING ? this._textBuffer.contentsAsString() : jsonToken == JsonToken.FIELD_NAME ? getCurrentName() : super.getValueAsString(null);
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase, com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public boolean hasTextCharacters() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            return this._textBuffer.hasTextAsCharacters();
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return this._nameCopied;
        }
        return false;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int readBinaryValue(Base64Variant base64Variant, OutputStream outputStream) throws IOException {
        byte[] binaryValue = getBinaryValue(base64Variant);
        outputStream.write(binaryValue);
        return binaryValue.length;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public abstract int releaseBuffered(OutputStream outputStream) throws IOException;

    @Override // com.fasterxml.jackson.core.JsonParser
    public void setCodec(ObjectCodec objectCodec) {
        throw new UnsupportedOperationException("Can not use ObjectMapper with non-blocking parser");
    }

    public ByteQuadsCanonicalizer symbolTableForTests() {
        return this._symbols;
    }

    public void _reportInvalidOther(int i2) throws JsonParseException {
        StringBuilder m24u = C0000a.m24u("Invalid UTF-8 middle byte 0x");
        m24u.append(Integer.toHexString(i2));
        _reportError(m24u.toString());
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int getText(Writer writer) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
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
        if (jsonToken == JsonToken.NOT_AVAILABLE) {
            _reportError("Current token not available: can not call this method");
        }
        char[] asCharArray = jsonToken.asCharArray();
        writer.write(asCharArray);
        return asCharArray.length;
    }

    public final String _findName(int i2, int i3, int i4) throws JsonParseException {
        int _padLastQuad = _padLastQuad(i3, i4);
        String findName = this._symbols.findName(i2, _padLastQuad);
        if (findName != null) {
            return findName;
        }
        int[] iArr = this._quadBuffer;
        iArr[0] = i2;
        iArr[1] = _padLastQuad;
        return _addName(iArr, 2, i4);
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public String getValueAsString(String str) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            return this._textBuffer.contentsAsString();
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return getCurrentName();
        }
        return super.getValueAsString(str);
    }

    public final String _findName(int i2, int i3, int i4, int i5) throws JsonParseException {
        int _padLastQuad = _padLastQuad(i4, i5);
        String findName = this._symbols.findName(i2, i3, _padLastQuad);
        if (findName != null) {
            return findName;
        }
        int[] iArr = this._quadBuffer;
        iArr[0] = i2;
        iArr[1] = i3;
        iArr[2] = _padLastQuad(_padLastQuad, i5);
        return _addName(iArr, 3, i5);
    }
}
