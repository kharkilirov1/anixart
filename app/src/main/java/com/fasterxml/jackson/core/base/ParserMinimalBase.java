package com.fasterxml.jackson.core.base;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.exc.InputCoercionException;
import com.fasterxml.jackson.core.p006io.JsonEOFException;
import com.fasterxml.jackson.core.p006io.NumberInput;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.VersionUtil;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import p000a.C0000a;

/* loaded from: classes.dex */
public abstract class ParserMinimalBase extends JsonParser {
    public static final BigDecimal BD_MAX_INT;
    public static final BigDecimal BD_MAX_LONG;
    public static final BigDecimal BD_MIN_INT;
    public static final BigDecimal BD_MIN_LONG;
    public static final BigInteger BI_MAX_INT;
    public static final BigInteger BI_MAX_LONG;
    public static final BigInteger BI_MIN_INT;
    public static final BigInteger BI_MIN_LONG;
    public static final char CHAR_NULL = 0;
    public static final int INT_0 = 48;
    public static final int INT_9 = 57;
    public static final int INT_APOS = 39;
    public static final int INT_ASTERISK = 42;
    public static final int INT_BACKSLASH = 92;
    public static final int INT_COLON = 58;
    public static final int INT_COMMA = 44;
    public static final int INT_CR = 13;
    public static final int INT_E = 69;
    public static final int INT_HASH = 35;
    public static final int INT_LBRACKET = 91;
    public static final int INT_LCURLY = 123;
    public static final int INT_LF = 10;
    public static final int INT_MINUS = 45;
    public static final int INT_PERIOD = 46;
    public static final int INT_PLUS = 43;
    public static final int INT_QUOTE = 34;
    public static final int INT_RBRACKET = 93;
    public static final int INT_RCURLY = 125;
    public static final int INT_SLASH = 47;
    public static final int INT_SPACE = 32;
    public static final int INT_TAB = 9;
    public static final int INT_e = 101;
    public static final int MAX_ERROR_TOKEN_LENGTH = 256;
    public static final double MAX_INT_D = 2.147483647E9d;
    public static final long MAX_INT_L = 2147483647L;
    public static final double MAX_LONG_D = 9.223372036854776E18d;
    public static final double MIN_INT_D = -2.147483648E9d;
    public static final long MIN_INT_L = -2147483648L;
    public static final double MIN_LONG_D = -9.223372036854776E18d;
    public static final byte[] NO_BYTES = new byte[0];
    public static final int[] NO_INTS = new int[0];
    public static final int NR_BIGDECIMAL = 16;
    public static final int NR_BIGINT = 4;
    public static final int NR_DOUBLE = 8;
    public static final int NR_FLOAT = 32;
    public static final int NR_INT = 1;
    public static final int NR_LONG = 2;
    public static final int NR_UNKNOWN = 0;
    public JsonToken _currToken;
    public JsonToken _lastClearedToken;

    static {
        BigInteger valueOf = BigInteger.valueOf(MIN_INT_L);
        BI_MIN_INT = valueOf;
        BigInteger valueOf2 = BigInteger.valueOf(MAX_INT_L);
        BI_MAX_INT = valueOf2;
        BigInteger valueOf3 = BigInteger.valueOf(Long.MIN_VALUE);
        BI_MIN_LONG = valueOf3;
        BigInteger valueOf4 = BigInteger.valueOf(Long.MAX_VALUE);
        BI_MAX_LONG = valueOf4;
        BD_MIN_LONG = new BigDecimal(valueOf3);
        BD_MAX_LONG = new BigDecimal(valueOf4);
        BD_MIN_INT = new BigDecimal(valueOf);
        BD_MAX_INT = new BigDecimal(valueOf2);
    }

    public ParserMinimalBase() {
    }

    public static String _ascii(byte[] bArr) {
        try {
            return new String(bArr, "US-ASCII");
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static byte[] _asciiBytes(String str) {
        byte[] bArr = new byte[str.length()];
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            bArr[i2] = (byte) str.charAt(i2);
        }
        return bArr;
    }

    public static final String _getCharDesc(int i2) {
        char c2 = (char) i2;
        if (Character.isISOControl(c2)) {
            return C0000a.m8e("(CTRL-CHAR, code ", i2, ")");
        }
        if (i2 <= 255) {
            return "'" + c2 + "' (code " + i2 + ")";
        }
        return "'" + c2 + "' (code " + i2 + " / 0x" + Integer.toHexString(i2) + ")";
    }

    public final JsonParseException _constructError(String str, Throwable th) {
        return new JsonParseException(this, str, th);
    }

    public void _decodeBase64(String str, ByteArrayBuilder byteArrayBuilder, Base64Variant base64Variant) throws IOException {
        try {
            base64Variant.decode(str, byteArrayBuilder);
        } catch (IllegalArgumentException e2) {
            _reportError(e2.getMessage());
        }
    }

    public abstract void _handleEOF() throws JsonParseException;

    public boolean _hasTextualNull(String str) {
        return "null".equals(str);
    }

    public String _longIntegerDesc(String str) {
        int length = str.length();
        if (length < 1000) {
            return str;
        }
        if (str.startsWith("-")) {
            length--;
        }
        return String.format("[Integer with %d digits]", Integer.valueOf(length));
    }

    public String _longNumberDesc(String str) {
        int length = str.length();
        if (length < 1000) {
            return str;
        }
        if (str.startsWith("-")) {
            length--;
        }
        return String.format("[number with %d characters]", Integer.valueOf(length));
    }

    public final void _reportError(String str) throws JsonParseException {
        throw _constructError(str);
    }

    public void _reportInputCoercion(String str, JsonToken jsonToken, Class<?> cls) throws InputCoercionException {
        throw new InputCoercionException(this, str, jsonToken, cls);
    }

    public void _reportInvalidEOF() throws JsonParseException {
        StringBuilder m24u = C0000a.m24u(" in ");
        m24u.append(this._currToken);
        _reportInvalidEOF(m24u.toString(), this._currToken);
    }

    public void _reportInvalidEOFInValue(JsonToken jsonToken) throws JsonParseException {
        _reportInvalidEOF(jsonToken == JsonToken.VALUE_STRING ? " in a String value" : (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) ? " in a Number value" : " in a value", jsonToken);
    }

    public void _reportMissingRootWS(int i2) throws JsonParseException {
        _reportUnexpectedChar(i2, "Expected space separating root-level values");
    }

    public void _reportUnexpectedChar(int i2, String str) throws JsonParseException {
        if (i2 < 0) {
            _reportInvalidEOF();
        }
        String format = String.format("Unexpected character (%s)", _getCharDesc(i2));
        if (str != null) {
            format = C0000a.m16m(format, ": ", str);
        }
        _reportError(format);
    }

    public final void _throwInternal() {
        VersionUtil.throwInternal();
    }

    public void _throwInvalidSpace(int i2) throws JsonParseException {
        StringBuilder m24u = C0000a.m24u("Illegal character (");
        m24u.append(_getCharDesc((char) i2));
        m24u.append("): only regular white space (\\r, \\n, \\t) is allowed between tokens");
        _reportError(m24u.toString());
    }

    public final void _wrapError(String str, Throwable th) throws JsonParseException {
        throw _constructError(str, th);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public void clearCurrentToken() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != null) {
            this._lastClearedToken = jsonToken;
            this._currToken = null;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser, java.io.Closeable, java.lang.AutoCloseable
    public abstract void close() throws IOException;

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonToken currentToken() {
        return this._currToken;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int currentTokenId() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == null) {
            return 0;
        }
        return jsonToken.m5359id();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public abstract byte[] getBinaryValue(Base64Variant base64Variant) throws IOException;

    @Override // com.fasterxml.jackson.core.JsonParser
    public abstract String getCurrentName() throws IOException;

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonToken getCurrentToken() {
        return this._currToken;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int getCurrentTokenId() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == null) {
            return 0;
        }
        return jsonToken.m5359id();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonToken getLastClearedToken() {
        return this._lastClearedToken;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public abstract JsonStreamContext getParsingContext();

    @Override // com.fasterxml.jackson.core.JsonParser
    public abstract String getText() throws IOException;

    @Override // com.fasterxml.jackson.core.JsonParser
    public abstract char[] getTextCharacters() throws IOException;

    @Override // com.fasterxml.jackson.core.JsonParser
    public abstract int getTextLength() throws IOException;

    @Override // com.fasterxml.jackson.core.JsonParser
    public abstract int getTextOffset() throws IOException;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean getValueAsBoolean(boolean z) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != null) {
            switch (jsonToken.m5359id()) {
                case 6:
                    String trim = getText().trim();
                    if ("true".equals(trim)) {
                        return true;
                    }
                    if ("false".equals(trim) || _hasTextualNull(trim)) {
                        return false;
                    }
                    break;
                case 7:
                    return getIntValue() != 0;
                case 9:
                    return true;
                case 10:
                case 11:
                    return false;
                case 12:
                    Object embeddedObject = getEmbeddedObject();
                    if (embeddedObject instanceof Boolean) {
                        return ((Boolean) embeddedObject).booleanValue();
                    }
                    break;
            }
        }
        return z;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public double getValueAsDouble(double d) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == null) {
            return d;
        }
        switch (jsonToken.m5359id()) {
            case 6:
                String text = getText();
                if (_hasTextualNull(text)) {
                    return 0.0d;
                }
                return NumberInput.parseAsDouble(text, d);
            case 7:
            case 8:
                return getDoubleValue();
            case 9:
                return 1.0d;
            case 10:
            case 11:
                return 0.0d;
            case 12:
                Object embeddedObject = getEmbeddedObject();
                return embeddedObject instanceof Number ? ((Number) embeddedObject).doubleValue() : d;
            default:
                return d;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int getValueAsInt() throws IOException {
        JsonToken jsonToken = this._currToken;
        return (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) ? getIntValue() : getValueAsInt(0);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public long getValueAsLong() throws IOException {
        JsonToken jsonToken = this._currToken;
        return (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) ? getLongValue() : getValueAsLong(0L);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String getValueAsString() throws IOException {
        JsonToken jsonToken = this._currToken;
        return jsonToken == JsonToken.VALUE_STRING ? getText() : jsonToken == JsonToken.FIELD_NAME ? getCurrentName() : getValueAsString(null);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean hasCurrentToken() {
        return this._currToken != null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public abstract boolean hasTextCharacters();

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean hasToken(JsonToken jsonToken) {
        return this._currToken == jsonToken;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean hasTokenId(int i2) {
        JsonToken jsonToken = this._currToken;
        return jsonToken == null ? i2 == 0 : jsonToken.m5359id() == i2;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public abstract boolean isClosed();

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean isExpectedStartArrayToken() {
        return this._currToken == JsonToken.START_ARRAY;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean isExpectedStartObjectToken() {
        return this._currToken == JsonToken.START_OBJECT;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public abstract JsonToken nextToken() throws IOException;

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonToken nextValue() throws IOException {
        JsonToken nextToken = nextToken();
        return nextToken == JsonToken.FIELD_NAME ? nextToken() : nextToken;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public abstract void overrideCurrentName(String str);

    public void reportInvalidNumber(String str) throws JsonParseException {
        _reportError("Invalid numeric value: " + str);
    }

    public void reportOverflowInt() throws IOException {
        reportOverflowInt(getText());
    }

    public void reportOverflowLong() throws IOException {
        reportOverflowLong(getText());
    }

    public void reportUnexpectedNumberChar(int i2, String str) throws JsonParseException {
        String format = String.format("Unexpected character (%s) in numeric value", _getCharDesc(i2));
        if (str != null) {
            format = C0000a.m16m(format, ": ", str);
        }
        _reportError(format);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser skipChildren() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.START_OBJECT && jsonToken != JsonToken.START_ARRAY) {
            return this;
        }
        int i2 = 1;
        while (true) {
            JsonToken nextToken = nextToken();
            if (nextToken == null) {
                _handleEOF();
                return this;
            }
            if (nextToken.isStructStart()) {
                i2++;
            } else if (nextToken.isStructEnd()) {
                i2--;
                if (i2 == 0) {
                    return this;
                }
            } else if (nextToken == JsonToken.NOT_AVAILABLE) {
                _reportError("Not enough content available for `skipChildren()`: non-blocking parser? (%s)", getClass().getName());
            }
        }
    }

    public ParserMinimalBase(int i2) {
        super(i2);
    }

    public final void _reportError(String str, Object obj) throws JsonParseException {
        throw _constructError(String.format(str, obj));
    }

    public void _reportInvalidEOF(String str, JsonToken jsonToken) throws JsonParseException {
        throw new JsonEOFException(this, jsonToken, C0000a.m14k("Unexpected end-of-input", str));
    }

    public void reportOverflowInt(String str) throws IOException {
        reportOverflowInt(str, JsonToken.VALUE_NUMBER_INT);
    }

    public void reportOverflowLong(String str) throws IOException {
        reportOverflowLong(str, JsonToken.VALUE_NUMBER_INT);
    }

    public final void _reportError(String str, Object obj, Object obj2) throws JsonParseException {
        throw _constructError(String.format(str, obj, obj2));
    }

    @Deprecated
    public void _reportInvalidEOF(String str) throws JsonParseException {
        throw new JsonEOFException(this, null, C0000a.m14k("Unexpected end-of-input", str));
    }

    public void reportOverflowInt(String str, JsonToken jsonToken) throws IOException {
        _reportInputCoercion(String.format("Numeric value (%s) out of range of int (%d - %s)", _longIntegerDesc(str), Integer.MIN_VALUE, Integer.MAX_VALUE), jsonToken, Integer.TYPE);
    }

    public void reportOverflowLong(String str, JsonToken jsonToken) throws IOException {
        _reportInputCoercion(String.format("Numeric value (%s) out of range of long (%d - %s)", _longIntegerDesc(str), Long.MIN_VALUE, Long.MAX_VALUE), jsonToken, Long.TYPE);
    }

    @Deprecated
    public void _reportInvalidEOFInValue() throws JsonParseException {
        _reportInvalidEOF(" in a value");
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int getValueAsInt(int i2) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) {
            return getIntValue();
        }
        if (jsonToken == null) {
            return i2;
        }
        int m5359id = jsonToken.m5359id();
        if (m5359id != 6) {
            switch (m5359id) {
                case 9:
                    return 1;
                case 10:
                case 11:
                    return 0;
                case 12:
                    Object embeddedObject = getEmbeddedObject();
                    return embeddedObject instanceof Number ? ((Number) embeddedObject).intValue() : i2;
                default:
                    return i2;
            }
        }
        String text = getText();
        if (_hasTextualNull(text)) {
            return 0;
        }
        return NumberInput.parseAsInt(text, i2);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public long getValueAsLong(long j2) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) {
            return getLongValue();
        }
        if (jsonToken == null) {
            return j2;
        }
        int m5359id = jsonToken.m5359id();
        if (m5359id != 6) {
            switch (m5359id) {
                case 9:
                    return 1L;
                case 10:
                case 11:
                    return 0L;
                case 12:
                    Object embeddedObject = getEmbeddedObject();
                    return embeddedObject instanceof Number ? ((Number) embeddedObject).longValue() : j2;
                default:
                    return j2;
            }
        }
        String text = getText();
        if (_hasTextualNull(text)) {
            return 0L;
        }
        return NumberInput.parseAsLong(text, j2);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String getValueAsString(String str) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            return getText();
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return getCurrentName();
        }
        return (jsonToken == null || jsonToken == JsonToken.VALUE_NULL || !jsonToken.isScalarValue()) ? str : getText();
    }
}
