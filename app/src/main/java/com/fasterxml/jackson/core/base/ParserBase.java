package com.fasterxml.jackson.core.base;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.json.DupDetector;
import com.fasterxml.jackson.core.json.JsonReadContext;
import com.fasterxml.jackson.core.json.PackageVersion;
import com.fasterxml.jackson.core.p006io.IOContext;
import com.fasterxml.jackson.core.p006io.NumberInput;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.TextBuffer;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import p000a.C0000a;

/* loaded from: classes.dex */
public abstract class ParserBase extends ParserMinimalBase {
    public byte[] _binaryValue;
    public ByteArrayBuilder _byteArrayBuilder;
    public boolean _closed;
    public long _currInputProcessed;
    public int _currInputRow;
    public int _currInputRowStart;
    public int _expLength;
    public int _fractLength;
    public int _inputEnd;
    public int _inputPtr;
    public int _intLength;
    public final IOContext _ioContext;
    public boolean _nameCopied;
    public char[] _nameCopyBuffer;
    public JsonToken _nextToken;
    public int _numTypesValid;
    public BigDecimal _numberBigDecimal;
    public BigInteger _numberBigInt;
    public double _numberDouble;
    public int _numberInt;
    public long _numberLong;
    public boolean _numberNegative;
    public JsonReadContext _parsingContext;
    public final TextBuffer _textBuffer;
    public int _tokenInputCol;
    public int _tokenInputRow;
    public long _tokenInputTotal;

    public ParserBase(IOContext iOContext, int i2) {
        super(i2);
        this._currInputRow = 1;
        this._tokenInputRow = 1;
        this._numTypesValid = 0;
        this._ioContext = iOContext;
        this._textBuffer = iOContext.constructTextBuffer();
        this._parsingContext = JsonReadContext.createRootContext(JsonParser.Feature.STRICT_DUPLICATE_DETECTION.enabledIn(i2) ? DupDetector.rootDetector(this) : null);
    }

    private void _parseSlowFloat(int i2) throws IOException {
        try {
            if (i2 == 16) {
                this._numberBigDecimal = this._textBuffer.contentsAsDecimal();
                this._numTypesValid = 16;
            } else {
                this._numberDouble = this._textBuffer.contentsAsDouble();
                this._numTypesValid = 8;
            }
        } catch (NumberFormatException e2) {
            StringBuilder m24u = C0000a.m24u("Malformed numeric value (");
            m24u.append(_longNumberDesc(this._textBuffer.contentsAsString()));
            m24u.append(")");
            _wrapError(m24u.toString(), e2);
        }
    }

    private void _parseSlowInt(int i2) throws IOException {
        String contentsAsString = this._textBuffer.contentsAsString();
        try {
            int i3 = this._intLength;
            char[] textBuffer = this._textBuffer.getTextBuffer();
            int textOffset = this._textBuffer.getTextOffset();
            boolean z = this._numberNegative;
            if (z) {
                textOffset++;
            }
            if (NumberInput.inLongRange(textBuffer, textOffset, i3, z)) {
                this._numberLong = Long.parseLong(contentsAsString);
                this._numTypesValid = 2;
                return;
            }
            if (i2 == 1 || i2 == 2) {
                _reportTooLongIntegral(i2, contentsAsString);
            }
            if (i2 != 8 && i2 != 32) {
                this._numberBigInt = new BigInteger(contentsAsString);
                this._numTypesValid = 4;
                return;
            }
            this._numberDouble = NumberInput.parseDouble(contentsAsString);
            this._numTypesValid = 8;
        } catch (NumberFormatException e2) {
            StringBuilder m24u = C0000a.m24u("Malformed numeric value (");
            m24u.append(_longNumberDesc(contentsAsString));
            m24u.append(")");
            _wrapError(m24u.toString(), e2);
        }
    }

    public static int[] growArrayBy(int[] iArr, int i2) {
        return iArr == null ? new int[i2] : Arrays.copyOf(iArr, iArr.length + i2);
    }

    public void _checkStdFeatureChanges(int i2, int i3) {
        int mask = JsonParser.Feature.STRICT_DUPLICATE_DETECTION.getMask();
        if ((i3 & mask) == 0 || (i2 & mask) == 0) {
            return;
        }
        if (this._parsingContext.getDupDetector() == null) {
            this._parsingContext = this._parsingContext.withDupDetector(DupDetector.rootDetector(this));
        } else {
            this._parsingContext = this._parsingContext.withDupDetector(null);
        }
    }

    public abstract void _closeInput() throws IOException;

    public final int _decodeBase64Escape(Base64Variant base64Variant, int i2, int i3) throws IOException {
        if (i2 != 92) {
            throw reportInvalidBase64Char(base64Variant, i2, i3);
        }
        char _decodeEscaped = _decodeEscaped();
        if (_decodeEscaped <= ' ' && i3 == 0) {
            return -1;
        }
        int decodeBase64Char = base64Variant.decodeBase64Char((int) _decodeEscaped);
        if (decodeBase64Char >= 0 || decodeBase64Char == -2) {
            return decodeBase64Char;
        }
        throw reportInvalidBase64Char(base64Variant, _decodeEscaped, i3);
    }

    public char _decodeEscaped() throws IOException {
        throw new UnsupportedOperationException();
    }

    public final int _eofAsNextChar() throws JsonParseException {
        _handleEOF();
        return -1;
    }

    public void _finishString() throws IOException {
    }

    public ByteArrayBuilder _getByteArrayBuilder() {
        ByteArrayBuilder byteArrayBuilder = this._byteArrayBuilder;
        if (byteArrayBuilder == null) {
            this._byteArrayBuilder = new ByteArrayBuilder();
        } else {
            byteArrayBuilder.reset();
        }
        return this._byteArrayBuilder;
    }

    public Object _getSourceReference() {
        if (JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION.enabledIn(this._features)) {
            return this._ioContext.getSourceReference();
        }
        return null;
    }

    public void _handleBase64MissingPadding(Base64Variant base64Variant) throws IOException {
        _reportError(base64Variant.missingPaddingMessage());
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase
    public void _handleEOF() throws JsonParseException {
        if (this._parsingContext.inRoot()) {
            return;
        }
        _reportInvalidEOF(String.format(": expected close marker for %s (start marker at %s)", this._parsingContext.inArray() ? "Array" : "Object", this._parsingContext.getStartLocation(_getSourceReference())), null);
    }

    public char _handleUnrecognizedCharacterEscape(char c2) throws JsonProcessingException {
        if (isEnabled(JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER)) {
            return c2;
        }
        if (c2 == '\'' && isEnabled(JsonParser.Feature.ALLOW_SINGLE_QUOTES)) {
            return c2;
        }
        StringBuilder m24u = C0000a.m24u("Unrecognized character escape ");
        m24u.append(ParserMinimalBase._getCharDesc(c2));
        _reportError(m24u.toString());
        return c2;
    }

    public int _parseIntValue() throws IOException {
        if (this._currToken != JsonToken.VALUE_NUMBER_INT || this._intLength > 9) {
            _parseNumericValue(1);
            if ((this._numTypesValid & 1) == 0) {
                convertNumberToInt();
            }
            return this._numberInt;
        }
        int contentsAsInt = this._textBuffer.contentsAsInt(this._numberNegative);
        this._numberInt = contentsAsInt;
        this._numTypesValid = 1;
        return contentsAsInt;
    }

    public void _parseNumericValue(int i2) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.VALUE_NUMBER_INT) {
            if (jsonToken == JsonToken.VALUE_NUMBER_FLOAT) {
                _parseSlowFloat(i2);
                return;
            } else {
                _reportError("Current token (%s) not numeric, can not use numeric value accessors", jsonToken);
                return;
            }
        }
        int i3 = this._intLength;
        if (i3 <= 9) {
            this._numberInt = this._textBuffer.contentsAsInt(this._numberNegative);
            this._numTypesValid = 1;
            return;
        }
        if (i3 > 18) {
            _parseSlowInt(i2);
            return;
        }
        long contentsAsLong = this._textBuffer.contentsAsLong(this._numberNegative);
        if (i3 == 10) {
            if (this._numberNegative) {
                if (contentsAsLong >= ParserMinimalBase.MIN_INT_L) {
                    this._numberInt = (int) contentsAsLong;
                    this._numTypesValid = 1;
                    return;
                }
            } else if (contentsAsLong <= ParserMinimalBase.MAX_INT_L) {
                this._numberInt = (int) contentsAsLong;
                this._numTypesValid = 1;
                return;
            }
        }
        this._numberLong = contentsAsLong;
        this._numTypesValid = 2;
    }

    public void _releaseBuffers() throws IOException {
        this._textBuffer.releaseBuffers();
        char[] cArr = this._nameCopyBuffer;
        if (cArr != null) {
            this._nameCopyBuffer = null;
            this._ioContext.releaseNameCopyBuffer(cArr);
        }
    }

    public void _reportMismatchedEndMarker(int i2, char c2) throws JsonParseException {
        JsonReadContext parsingContext = getParsingContext();
        _reportError(String.format("Unexpected close marker '%s': expected '%c' (for %s starting at %s)", Character.valueOf((char) i2), Character.valueOf(c2), parsingContext.typeDesc(), parsingContext.getStartLocation(_getSourceReference())));
    }

    public void _reportTooLongIntegral(int i2, String str) throws IOException {
        if (i2 == 1) {
            reportOverflowInt(str);
        } else {
            reportOverflowLong(str);
        }
    }

    public void _throwUnquotedSpace(int i2, String str) throws JsonParseException {
        if (!isEnabled(JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS) || i2 > 32) {
            StringBuilder m24u = C0000a.m24u("Illegal unquoted character (");
            m24u.append(ParserMinimalBase._getCharDesc((char) i2));
            m24u.append("): has to be escaped using backslash to be included in ");
            m24u.append(str);
            _reportError(m24u.toString());
        }
    }

    public String _validJsonTokenList() throws IOException {
        return _validJsonValueList();
    }

    public String _validJsonValueList() throws IOException {
        return isEnabled(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS) ? "(JSON String, Number (or 'NaN'/'INF'/'+INF'), Array, Object or token 'null', 'true' or 'false')" : "(JSON String, Number, Array, Object or token 'null', 'true' or 'false')";
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this._closed) {
            return;
        }
        this._inputPtr = Math.max(this._inputPtr, this._inputEnd);
        this._closed = true;
        try {
            _closeInput();
        } finally {
            _releaseBuffers();
        }
    }

    public void convertNumberToBigDecimal() throws IOException {
        int i2 = this._numTypesValid;
        if ((i2 & 8) != 0) {
            this._numberBigDecimal = NumberInput.parseBigDecimal(getText());
        } else if ((i2 & 4) != 0) {
            this._numberBigDecimal = new BigDecimal(this._numberBigInt);
        } else if ((i2 & 2) != 0) {
            this._numberBigDecimal = BigDecimal.valueOf(this._numberLong);
        } else if ((i2 & 1) != 0) {
            this._numberBigDecimal = BigDecimal.valueOf(this._numberInt);
        } else {
            _throwInternal();
        }
        this._numTypesValid |= 16;
    }

    public void convertNumberToBigInteger() throws IOException {
        int i2 = this._numTypesValid;
        if ((i2 & 16) != 0) {
            this._numberBigInt = this._numberBigDecimal.toBigInteger();
        } else if ((i2 & 2) != 0) {
            this._numberBigInt = BigInteger.valueOf(this._numberLong);
        } else if ((i2 & 1) != 0) {
            this._numberBigInt = BigInteger.valueOf(this._numberInt);
        } else if ((i2 & 8) != 0) {
            this._numberBigInt = BigDecimal.valueOf(this._numberDouble).toBigInteger();
        } else {
            _throwInternal();
        }
        this._numTypesValid |= 4;
    }

    public void convertNumberToDouble() throws IOException {
        int i2 = this._numTypesValid;
        if ((i2 & 16) != 0) {
            this._numberDouble = this._numberBigDecimal.doubleValue();
        } else if ((i2 & 4) != 0) {
            this._numberDouble = this._numberBigInt.doubleValue();
        } else if ((i2 & 2) != 0) {
            this._numberDouble = this._numberLong;
        } else if ((i2 & 1) != 0) {
            this._numberDouble = this._numberInt;
        } else {
            _throwInternal();
        }
        this._numTypesValid |= 8;
    }

    public void convertNumberToInt() throws IOException {
        int i2 = this._numTypesValid;
        if ((i2 & 2) != 0) {
            long j2 = this._numberLong;
            int i3 = (int) j2;
            if (i3 != j2) {
                reportOverflowInt(getText(), currentToken());
            }
            this._numberInt = i3;
        } else if ((i2 & 4) != 0) {
            if (ParserMinimalBase.BI_MIN_INT.compareTo(this._numberBigInt) > 0 || ParserMinimalBase.BI_MAX_INT.compareTo(this._numberBigInt) < 0) {
                reportOverflowInt();
            }
            this._numberInt = this._numberBigInt.intValue();
        } else if ((i2 & 8) != 0) {
            double d = this._numberDouble;
            if (d < -2.147483648E9d || d > 2.147483647E9d) {
                reportOverflowInt();
            }
            this._numberInt = (int) this._numberDouble;
        } else if ((i2 & 16) != 0) {
            if (ParserMinimalBase.BD_MIN_INT.compareTo(this._numberBigDecimal) > 0 || ParserMinimalBase.BD_MAX_INT.compareTo(this._numberBigDecimal) < 0) {
                reportOverflowInt();
            }
            this._numberInt = this._numberBigDecimal.intValue();
        } else {
            _throwInternal();
        }
        this._numTypesValid |= 1;
    }

    public void convertNumberToLong() throws IOException {
        int i2 = this._numTypesValid;
        if ((i2 & 1) != 0) {
            this._numberLong = this._numberInt;
        } else if ((i2 & 4) != 0) {
            if (ParserMinimalBase.BI_MIN_LONG.compareTo(this._numberBigInt) > 0 || ParserMinimalBase.BI_MAX_LONG.compareTo(this._numberBigInt) < 0) {
                reportOverflowLong();
            }
            this._numberLong = this._numberBigInt.longValue();
        } else if ((i2 & 8) != 0) {
            double d = this._numberDouble;
            if (d < -9.223372036854776E18d || d > 9.223372036854776E18d) {
                reportOverflowLong();
            }
            this._numberLong = (long) this._numberDouble;
        } else if ((i2 & 16) != 0) {
            if (ParserMinimalBase.BD_MIN_LONG.compareTo(this._numberBigDecimal) > 0 || ParserMinimalBase.BD_MAX_LONG.compareTo(this._numberBigDecimal) < 0) {
                reportOverflowLong();
            }
            this._numberLong = this._numberBigDecimal.longValue();
        } else {
            _throwInternal();
        }
        this._numTypesValid |= 2;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser disable(JsonParser.Feature feature) {
        this._features &= ~feature.getMask();
        if (feature == JsonParser.Feature.STRICT_DUPLICATE_DETECTION) {
            this._parsingContext = this._parsingContext.withDupDetector(null);
        }
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser enable(JsonParser.Feature feature) {
        this._features |= feature.getMask();
        if (feature == JsonParser.Feature.STRICT_DUPLICATE_DETECTION && this._parsingContext.getDupDetector() == null) {
            this._parsingContext = this._parsingContext.withDupDetector(DupDetector.rootDetector(this));
        }
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public BigInteger getBigIntegerValue() throws IOException {
        int i2 = this._numTypesValid;
        if ((i2 & 4) == 0) {
            if (i2 == 0) {
                _parseNumericValue(4);
            }
            if ((this._numTypesValid & 4) == 0) {
                convertNumberToBigInteger();
            }
        }
        return this._numberBigInt;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public byte[] getBinaryValue(Base64Variant base64Variant) throws IOException {
        if (this._binaryValue == null) {
            if (this._currToken != JsonToken.VALUE_STRING) {
                StringBuilder m24u = C0000a.m24u("Current token (");
                m24u.append(this._currToken);
                m24u.append(") not VALUE_STRING, can not access as binary");
                _reportError(m24u.toString());
            }
            ByteArrayBuilder _getByteArrayBuilder = _getByteArrayBuilder();
            _decodeBase64(getText(), _getByteArrayBuilder, base64Variant);
            this._binaryValue = _getByteArrayBuilder.toByteArray();
        }
        return this._binaryValue;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonLocation getCurrentLocation() {
        return new JsonLocation(_getSourceReference(), -1L, this._inputPtr + this._currInputProcessed, this._currInputRow, (this._inputPtr - this._currInputRowStart) + 1);
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public String getCurrentName() throws IOException {
        JsonReadContext parent;
        JsonToken jsonToken = this._currToken;
        return ((jsonToken == JsonToken.START_OBJECT || jsonToken == JsonToken.START_ARRAY) && (parent = this._parsingContext.getParent()) != null) ? parent.getCurrentName() : this._parsingContext.getCurrentName();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Object getCurrentValue() {
        return this._parsingContext.getCurrentValue();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public BigDecimal getDecimalValue() throws IOException {
        int i2 = this._numTypesValid;
        if ((i2 & 16) == 0) {
            if (i2 == 0) {
                _parseNumericValue(16);
            }
            if ((this._numTypesValid & 16) == 0) {
                convertNumberToBigDecimal();
            }
        }
        return this._numberBigDecimal;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public double getDoubleValue() throws IOException {
        int i2 = this._numTypesValid;
        if ((i2 & 8) == 0) {
            if (i2 == 0) {
                _parseNumericValue(8);
            }
            if ((this._numTypesValid & 8) == 0) {
                convertNumberToDouble();
            }
        }
        return this._numberDouble;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public float getFloatValue() throws IOException {
        return (float) getDoubleValue();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int getIntValue() throws IOException {
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

    @Override // com.fasterxml.jackson.core.JsonParser
    public long getLongValue() throws IOException {
        int i2 = this._numTypesValid;
        if ((i2 & 2) == 0) {
            if (i2 == 0) {
                _parseNumericValue(2);
            }
            if ((this._numTypesValid & 2) == 0) {
                convertNumberToLong();
            }
        }
        return this._numberLong;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser.NumberType getNumberType() throws IOException {
        if (this._numTypesValid == 0) {
            _parseNumericValue(0);
        }
        if (this._currToken != JsonToken.VALUE_NUMBER_INT) {
            return (this._numTypesValid & 16) != 0 ? JsonParser.NumberType.BIG_DECIMAL : JsonParser.NumberType.DOUBLE;
        }
        int i2 = this._numTypesValid;
        return (i2 & 1) != 0 ? JsonParser.NumberType.INT : (i2 & 2) != 0 ? JsonParser.NumberType.LONG : JsonParser.NumberType.BIG_INTEGER;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Number getNumberValue() throws IOException {
        if (this._numTypesValid == 0) {
            _parseNumericValue(0);
        }
        if (this._currToken == JsonToken.VALUE_NUMBER_INT) {
            int i2 = this._numTypesValid;
            return (i2 & 1) != 0 ? Integer.valueOf(this._numberInt) : (i2 & 2) != 0 ? Long.valueOf(this._numberLong) : (i2 & 4) != 0 ? this._numberBigInt : this._numberBigDecimal;
        }
        int i3 = this._numTypesValid;
        if ((i3 & 16) != 0) {
            return this._numberBigDecimal;
        }
        if ((i3 & 8) == 0) {
            _throwInternal();
        }
        return Double.valueOf(this._numberDouble);
    }

    public long getTokenCharacterOffset() {
        return this._tokenInputTotal;
    }

    public int getTokenColumnNr() {
        int i2 = this._tokenInputCol;
        return i2 < 0 ? i2 : i2 + 1;
    }

    public int getTokenLineNr() {
        return this._tokenInputRow;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonLocation getTokenLocation() {
        return new JsonLocation(_getSourceReference(), -1L, getTokenCharacterOffset(), getTokenLineNr(), getTokenColumnNr());
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public boolean hasTextCharacters() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            return true;
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return this._nameCopied;
        }
        return false;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public boolean isClosed() {
        return this._closed;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean isNaN() {
        if (this._currToken != JsonToken.VALUE_NUMBER_FLOAT || (this._numTypesValid & 8) == 0) {
            return false;
        }
        double d = this._numberDouble;
        return Double.isNaN(d) || Double.isInfinite(d);
    }

    @Deprecated
    public boolean loadMore() throws IOException {
        return false;
    }

    @Deprecated
    public void loadMoreGuaranteed() throws IOException {
        if (loadMore()) {
            return;
        }
        _reportInvalidEOF();
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public void overrideCurrentName(String str) {
        JsonReadContext jsonReadContext = this._parsingContext;
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.START_OBJECT || jsonToken == JsonToken.START_ARRAY) {
            jsonReadContext = jsonReadContext.getParent();
        }
        try {
            jsonReadContext.setCurrentName(str);
        } catch (IOException e2) {
            throw new IllegalStateException(e2);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser overrideStdFeatures(int i2, int i3) {
        int i4 = this._features;
        int i5 = (i2 & i3) | ((~i3) & i4);
        int i6 = i4 ^ i5;
        if (i6 != 0) {
            this._features = i5;
            _checkStdFeatureChanges(i5, i6);
        }
        return this;
    }

    public IllegalArgumentException reportInvalidBase64Char(Base64Variant base64Variant, int i2, int i3) throws IllegalArgumentException {
        return reportInvalidBase64Char(base64Variant, i2, i3, null);
    }

    public final JsonToken reset(boolean z, int i2, int i3, int i4) {
        return (i3 >= 1 || i4 >= 1) ? resetFloat(z, i2, i3, i4) : resetInt(z, i2);
    }

    public final JsonToken resetAsNaN(String str, double d) {
        this._textBuffer.resetWithString(str);
        this._numberDouble = d;
        this._numTypesValid = 8;
        return JsonToken.VALUE_NUMBER_FLOAT;
    }

    public final JsonToken resetFloat(boolean z, int i2, int i3, int i4) {
        this._numberNegative = z;
        this._intLength = i2;
        this._fractLength = i3;
        this._expLength = i4;
        this._numTypesValid = 0;
        return JsonToken.VALUE_NUMBER_FLOAT;
    }

    public final JsonToken resetInt(boolean z, int i2) {
        this._numberNegative = z;
        this._intLength = i2;
        this._fractLength = 0;
        this._expLength = 0;
        this._numTypesValid = 0;
        return JsonToken.VALUE_NUMBER_INT;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public void setCurrentValue(Object obj) {
        this._parsingContext.setCurrentValue(obj);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    @Deprecated
    public JsonParser setFeatureMask(int i2) {
        int i3 = this._features ^ i2;
        if (i3 != 0) {
            this._features = i2;
            _checkStdFeatureChanges(i2, i3);
        }
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.core.Versioned
    public Version version() {
        return PackageVersion.VERSION;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public JsonReadContext getParsingContext() {
        return this._parsingContext;
    }

    public IllegalArgumentException reportInvalidBase64Char(Base64Variant base64Variant, int i2, int i3, String str) throws IllegalArgumentException {
        String sb;
        if (i2 <= 32) {
            sb = String.format("Illegal white space character (code 0x%s) as character #%d of 4-char base64 unit: can only used between units", Integer.toHexString(i2), Integer.valueOf(i3 + 1));
        } else if (base64Variant.usesPaddingChar(i2)) {
            StringBuilder m24u = C0000a.m24u("Unexpected padding character ('");
            m24u.append(base64Variant.getPaddingChar());
            m24u.append("') as character #");
            m24u.append(i3 + 1);
            m24u.append(" of 4-char base64 unit: padding only legal as 3rd or 4th character");
            sb = m24u.toString();
        } else if (!Character.isDefined(i2) || Character.isISOControl(i2)) {
            StringBuilder m24u2 = C0000a.m24u("Illegal character (code 0x");
            m24u2.append(Integer.toHexString(i2));
            m24u2.append(") in base64 content");
            sb = m24u2.toString();
        } else {
            StringBuilder m24u3 = C0000a.m24u("Illegal character '");
            m24u3.append((char) i2);
            m24u3.append("' (code 0x");
            m24u3.append(Integer.toHexString(i2));
            m24u3.append(") in base64 content");
            sb = m24u3.toString();
        }
        if (str != null) {
            sb = C0000a.m16m(sb, ": ", str);
        }
        return new IllegalArgumentException(sb);
    }

    public final int _decodeBase64Escape(Base64Variant base64Variant, char c2, int i2) throws IOException {
        if (c2 == '\\') {
            char _decodeEscaped = _decodeEscaped();
            if (_decodeEscaped <= ' ' && i2 == 0) {
                return -1;
            }
            int decodeBase64Char = base64Variant.decodeBase64Char(_decodeEscaped);
            if (decodeBase64Char >= 0 || (decodeBase64Char == -2 && i2 >= 2)) {
                return decodeBase64Char;
            }
            throw reportInvalidBase64Char(base64Variant, _decodeEscaped, i2);
        }
        throw reportInvalidBase64Char(base64Variant, c2, i2);
    }
}
