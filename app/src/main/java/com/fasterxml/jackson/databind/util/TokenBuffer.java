package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.fasterxml.jackson.core.json.JsonWriteContext;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.cfg.PackageVersion;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.TreeMap;
import p000a.C0000a;

/* loaded from: classes.dex */
public class TokenBuffer extends JsonGenerator {
    public static final int DEFAULT_GENERATOR_FEATURES = JsonGenerator.Feature.collectDefaults();
    public int _appendAt;
    public boolean _closed;
    public Segment _first;
    public boolean _forceBigDecimal;
    public int _generatorFeatures;
    public boolean _hasNativeId;
    public boolean _hasNativeObjectIds;
    public boolean _hasNativeTypeIds;
    public Segment _last;
    public boolean _mayHaveNativeIds;
    public ObjectCodec _objectCodec;
    public Object _objectId;
    public JsonStreamContext _parentContext;
    public Object _typeId;
    public JsonWriteContext _writeContext;

    /* renamed from: com.fasterxml.jackson.databind.util.TokenBuffer$1 */
    public static /* synthetic */ class C08841 {
        public static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType;
        public static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$core$JsonToken;

        static {
            int[] iArr = new int[JsonParser.NumberType.values().length];
            $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType = iArr;
            try {
                iArr[JsonParser.NumberType.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[JsonParser.NumberType.BIG_INTEGER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[JsonParser.NumberType.BIG_DECIMAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[JsonParser.NumberType.FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[JsonParser.NumberType.LONG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[JsonToken.values().length];
            $SwitchMap$com$fasterxml$jackson$core$JsonToken = iArr2;
            try {
                iArr2[JsonToken.START_OBJECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.END_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.START_ARRAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.END_ARRAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.FIELD_NAME.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_NUMBER_INT.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_NUMBER_FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_TRUE.ordinal()] = 9;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_FALSE.ordinal()] = 10;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_NULL.ordinal()] = 11;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_EMBEDDED_OBJECT.ordinal()] = 12;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public static final class Parser extends ParserMinimalBase {
        public transient ByteArrayBuilder _byteBuilder;
        public boolean _closed;
        public ObjectCodec _codec;
        public final boolean _hasNativeIds;
        public final boolean _hasNativeObjectIds;
        public final boolean _hasNativeTypeIds;
        public JsonLocation _location;
        public TokenBufferReadContext _parsingContext;
        public Segment _segment;
        public int _segmentPtr;

        @Deprecated
        public Parser(Segment segment, ObjectCodec objectCodec, boolean z, boolean z2) {
            this(segment, objectCodec, z, z2, null);
        }

        private final boolean _smallerThanInt(Number number) {
            return (number instanceof Short) || (number instanceof Byte);
        }

        private final boolean _smallerThanLong(Number number) {
            return (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
        }

        public final void _checkIsNumber() throws JsonParseException {
            JsonToken jsonToken = this._currToken;
            if (jsonToken == null || !jsonToken.isNumeric()) {
                StringBuilder m24u = C0000a.m24u("Current token (");
                m24u.append(this._currToken);
                m24u.append(") not numeric, cannot use numeric value accessors");
                throw _constructError(m24u.toString());
            }
        }

        public int _convertNumberToInt(Number number) throws IOException {
            if (number instanceof Long) {
                long longValue = number.longValue();
                int i2 = (int) longValue;
                if (i2 != longValue) {
                    reportOverflowInt();
                }
                return i2;
            }
            if (number instanceof BigInteger) {
                BigInteger bigInteger = (BigInteger) number;
                if (ParserMinimalBase.BI_MIN_INT.compareTo(bigInteger) > 0 || ParserMinimalBase.BI_MAX_INT.compareTo(bigInteger) < 0) {
                    reportOverflowInt();
                }
            } else {
                if ((number instanceof Double) || (number instanceof Float)) {
                    double doubleValue = number.doubleValue();
                    if (doubleValue < -2.147483648E9d || doubleValue > 2.147483647E9d) {
                        reportOverflowInt();
                    }
                    return (int) doubleValue;
                }
                if (number instanceof BigDecimal) {
                    BigDecimal bigDecimal = (BigDecimal) number;
                    if (ParserMinimalBase.BD_MIN_INT.compareTo(bigDecimal) > 0 || ParserMinimalBase.BD_MAX_INT.compareTo(bigDecimal) < 0) {
                        reportOverflowInt();
                    }
                } else {
                    _throwInternal();
                }
            }
            return number.intValue();
        }

        public long _convertNumberToLong(Number number) throws IOException {
            if (number instanceof BigInteger) {
                BigInteger bigInteger = (BigInteger) number;
                if (ParserMinimalBase.BI_MIN_LONG.compareTo(bigInteger) > 0 || ParserMinimalBase.BI_MAX_LONG.compareTo(bigInteger) < 0) {
                    reportOverflowLong();
                }
            } else {
                if ((number instanceof Double) || (number instanceof Float)) {
                    double doubleValue = number.doubleValue();
                    if (doubleValue < -9.223372036854776E18d || doubleValue > 9.223372036854776E18d) {
                        reportOverflowLong();
                    }
                    return (long) doubleValue;
                }
                if (number instanceof BigDecimal) {
                    BigDecimal bigDecimal = (BigDecimal) number;
                    if (ParserMinimalBase.BD_MIN_LONG.compareTo(bigDecimal) > 0 || ParserMinimalBase.BD_MAX_LONG.compareTo(bigDecimal) < 0) {
                        reportOverflowLong();
                    }
                } else {
                    _throwInternal();
                }
            }
            return number.longValue();
        }

        public final Object _currentObject() {
            return this._segment.get(this._segmentPtr);
        }

        @Override // com.fasterxml.jackson.core.base.ParserMinimalBase
        public void _handleEOF() throws JsonParseException {
            _throwInternal();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public boolean canReadObjectId() {
            return this._hasNativeObjectIds;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public boolean canReadTypeId() {
            return this._hasNativeTypeIds;
        }

        @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this._closed) {
                return;
            }
            this._closed = true;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public BigInteger getBigIntegerValue() throws IOException {
            Number numberValue = getNumberValue();
            return numberValue instanceof BigInteger ? (BigInteger) numberValue : getNumberType() == JsonParser.NumberType.BIG_DECIMAL ? ((BigDecimal) numberValue).toBigInteger() : BigInteger.valueOf(numberValue.longValue());
        }

        @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
        public byte[] getBinaryValue(Base64Variant base64Variant) throws IOException, JsonParseException {
            if (this._currToken == JsonToken.VALUE_EMBEDDED_OBJECT) {
                Object _currentObject = _currentObject();
                if (_currentObject instanceof byte[]) {
                    return (byte[]) _currentObject;
                }
            }
            if (this._currToken != JsonToken.VALUE_STRING) {
                StringBuilder m24u = C0000a.m24u("Current token (");
                m24u.append(this._currToken);
                m24u.append(") not VALUE_STRING (or VALUE_EMBEDDED_OBJECT with byte[]), cannot access as binary");
                throw _constructError(m24u.toString());
            }
            String text = getText();
            if (text == null) {
                return null;
            }
            ByteArrayBuilder byteArrayBuilder = this._byteBuilder;
            if (byteArrayBuilder == null) {
                byteArrayBuilder = new ByteArrayBuilder(100);
                this._byteBuilder = byteArrayBuilder;
            } else {
                byteArrayBuilder.reset();
            }
            _decodeBase64(text, byteArrayBuilder, base64Variant);
            return byteArrayBuilder.toByteArray();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public ObjectCodec getCodec() {
            return this._codec;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public JsonLocation getCurrentLocation() {
            JsonLocation jsonLocation = this._location;
            return jsonLocation == null ? JsonLocation.f8863NA : jsonLocation;
        }

        @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
        public String getCurrentName() {
            JsonToken jsonToken = this._currToken;
            return (jsonToken == JsonToken.START_OBJECT || jsonToken == JsonToken.START_ARRAY) ? this._parsingContext.getParent().getCurrentName() : this._parsingContext.getCurrentName();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public BigDecimal getDecimalValue() throws IOException {
            Number numberValue = getNumberValue();
            if (numberValue instanceof BigDecimal) {
                return (BigDecimal) numberValue;
            }
            int i2 = C08841.$SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[getNumberType().ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    return new BigDecimal((BigInteger) numberValue);
                }
                if (i2 != 5) {
                    return BigDecimal.valueOf(numberValue.doubleValue());
                }
            }
            return BigDecimal.valueOf(numberValue.longValue());
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public double getDoubleValue() throws IOException {
            return getNumberValue().doubleValue();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public Object getEmbeddedObject() {
            if (this._currToken == JsonToken.VALUE_EMBEDDED_OBJECT) {
                return _currentObject();
            }
            return null;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public float getFloatValue() throws IOException {
            return getNumberValue().floatValue();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public int getIntValue() throws IOException {
            Number numberValue = this._currToken == JsonToken.VALUE_NUMBER_INT ? (Number) _currentObject() : getNumberValue();
            return ((numberValue instanceof Integer) || _smallerThanInt(numberValue)) ? numberValue.intValue() : _convertNumberToInt(numberValue);
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public long getLongValue() throws IOException {
            Number numberValue = this._currToken == JsonToken.VALUE_NUMBER_INT ? (Number) _currentObject() : getNumberValue();
            return ((numberValue instanceof Long) || _smallerThanLong(numberValue)) ? numberValue.longValue() : _convertNumberToLong(numberValue);
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public JsonParser.NumberType getNumberType() throws IOException {
            Number numberValue = getNumberValue();
            if (numberValue instanceof Integer) {
                return JsonParser.NumberType.INT;
            }
            if (numberValue instanceof Long) {
                return JsonParser.NumberType.LONG;
            }
            if (numberValue instanceof Double) {
                return JsonParser.NumberType.DOUBLE;
            }
            if (numberValue instanceof BigDecimal) {
                return JsonParser.NumberType.BIG_DECIMAL;
            }
            if (numberValue instanceof BigInteger) {
                return JsonParser.NumberType.BIG_INTEGER;
            }
            if (numberValue instanceof Float) {
                return JsonParser.NumberType.FLOAT;
            }
            if (numberValue instanceof Short) {
                return JsonParser.NumberType.INT;
            }
            return null;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public final Number getNumberValue() throws IOException {
            _checkIsNumber();
            Object _currentObject = _currentObject();
            if (_currentObject instanceof Number) {
                return (Number) _currentObject;
            }
            if (_currentObject instanceof String) {
                String str = (String) _currentObject;
                return str.indexOf(46) >= 0 ? Double.valueOf(Double.parseDouble(str)) : Long.valueOf(Long.parseLong(str));
            }
            if (_currentObject == null) {
                return null;
            }
            StringBuilder m24u = C0000a.m24u("Internal error: entry should be a Number, but is of type ");
            m24u.append(_currentObject.getClass().getName());
            throw new IllegalStateException(m24u.toString());
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public Object getObjectId() {
            return this._segment.findObjectId(this._segmentPtr);
        }

        @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
        public JsonStreamContext getParsingContext() {
            return this._parsingContext;
        }

        @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
        public String getText() {
            JsonToken jsonToken = this._currToken;
            if (jsonToken == JsonToken.VALUE_STRING || jsonToken == JsonToken.FIELD_NAME) {
                Object _currentObject = _currentObject();
                return _currentObject instanceof String ? (String) _currentObject : ClassUtil.nullOrToString(_currentObject);
            }
            if (jsonToken == null) {
                return null;
            }
            int i2 = C08841.$SwitchMap$com$fasterxml$jackson$core$JsonToken[jsonToken.ordinal()];
            return (i2 == 7 || i2 == 8) ? ClassUtil.nullOrToString(_currentObject()) : this._currToken.asString();
        }

        @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
        public char[] getTextCharacters() {
            String text = getText();
            if (text == null) {
                return null;
            }
            return text.toCharArray();
        }

        @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
        public int getTextLength() {
            String text = getText();
            if (text == null) {
                return 0;
            }
            return text.length();
        }

        @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
        public int getTextOffset() {
            return 0;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public JsonLocation getTokenLocation() {
            return getCurrentLocation();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public Object getTypeId() {
            return this._segment.findTypeId(this._segmentPtr);
        }

        @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
        public boolean hasTextCharacters() {
            return false;
        }

        @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
        public boolean isClosed() {
            return this._closed;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public boolean isNaN() {
            if (this._currToken != JsonToken.VALUE_NUMBER_FLOAT) {
                return false;
            }
            Object _currentObject = _currentObject();
            if (_currentObject instanceof Double) {
                Double d = (Double) _currentObject;
                return d.isNaN() || d.isInfinite();
            }
            if (!(_currentObject instanceof Float)) {
                return false;
            }
            Float f2 = (Float) _currentObject;
            return f2.isNaN() || f2.isInfinite();
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public String nextFieldName() throws IOException {
            Segment segment;
            if (this._closed || (segment = this._segment) == null) {
                return null;
            }
            int i2 = this._segmentPtr + 1;
            if (i2 < 16) {
                JsonToken type = segment.type(i2);
                JsonToken jsonToken = JsonToken.FIELD_NAME;
                if (type == jsonToken) {
                    this._segmentPtr = i2;
                    this._currToken = jsonToken;
                    Object obj = this._segment.get(i2);
                    String obj2 = obj instanceof String ? (String) obj : obj.toString();
                    this._parsingContext.setCurrentName(obj2);
                    return obj2;
                }
            }
            if (nextToken() == JsonToken.FIELD_NAME) {
                return getCurrentName();
            }
            return null;
        }

        @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
        public JsonToken nextToken() throws IOException {
            Segment segment;
            if (this._closed || (segment = this._segment) == null) {
                return null;
            }
            int i2 = this._segmentPtr + 1;
            this._segmentPtr = i2;
            if (i2 >= 16) {
                this._segmentPtr = 0;
                Segment next = segment.next();
                this._segment = next;
                if (next == null) {
                    return null;
                }
            }
            JsonToken type = this._segment.type(this._segmentPtr);
            this._currToken = type;
            if (type == JsonToken.FIELD_NAME) {
                Object _currentObject = _currentObject();
                this._parsingContext.setCurrentName(_currentObject instanceof String ? (String) _currentObject : _currentObject.toString());
            } else if (type == JsonToken.START_OBJECT) {
                this._parsingContext = this._parsingContext.createChildObjectContext();
            } else if (type == JsonToken.START_ARRAY) {
                this._parsingContext = this._parsingContext.createChildArrayContext();
            } else if (type == JsonToken.END_OBJECT || type == JsonToken.END_ARRAY) {
                this._parsingContext = this._parsingContext.parentOrCopy();
            } else {
                this._parsingContext.updateForValue();
            }
            return this._currToken;
        }

        @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
        public void overrideCurrentName(String str) {
            JsonStreamContext jsonStreamContext = this._parsingContext;
            JsonToken jsonToken = this._currToken;
            if (jsonToken == JsonToken.START_OBJECT || jsonToken == JsonToken.START_ARRAY) {
                jsonStreamContext = jsonStreamContext.getParent();
            }
            if (jsonStreamContext instanceof TokenBufferReadContext) {
                try {
                    ((TokenBufferReadContext) jsonStreamContext).setCurrentName(str);
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }

        public JsonToken peekNextToken() throws IOException {
            if (this._closed) {
                return null;
            }
            Segment segment = this._segment;
            int i2 = this._segmentPtr + 1;
            if (i2 >= 16) {
                i2 = 0;
                segment = segment == null ? null : segment.next();
            }
            if (segment == null) {
                return null;
            }
            return segment.type(i2);
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public int readBinaryValue(Base64Variant base64Variant, OutputStream outputStream) throws IOException {
            byte[] binaryValue = getBinaryValue(base64Variant);
            if (binaryValue == null) {
                return 0;
            }
            outputStream.write(binaryValue, 0, binaryValue.length);
            return binaryValue.length;
        }

        @Override // com.fasterxml.jackson.core.JsonParser
        public void setCodec(ObjectCodec objectCodec) {
            this._codec = objectCodec;
        }

        public void setLocation(JsonLocation jsonLocation) {
            this._location = jsonLocation;
        }

        @Override // com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.core.Versioned
        public Version version() {
            return PackageVersion.VERSION;
        }

        public Parser(Segment segment, ObjectCodec objectCodec, boolean z, boolean z2, JsonStreamContext jsonStreamContext) {
            super(0);
            this._location = null;
            this._segment = segment;
            this._segmentPtr = -1;
            this._codec = objectCodec;
            this._parsingContext = TokenBufferReadContext.createRootContext(jsonStreamContext);
            this._hasNativeTypeIds = z;
            this._hasNativeObjectIds = z2;
            this._hasNativeIds = z | z2;
        }
    }

    public TokenBuffer(ObjectCodec objectCodec, boolean z) {
        this._hasNativeId = false;
        this._objectCodec = objectCodec;
        this._generatorFeatures = DEFAULT_GENERATOR_FEATURES;
        this._writeContext = JsonWriteContext.createRootContext(null);
        Segment segment = new Segment();
        this._last = segment;
        this._first = segment;
        this._appendAt = 0;
        this._hasNativeTypeIds = z;
        this._hasNativeObjectIds = z;
        this._mayHaveNativeIds = z | z;
    }

    private final void _appendNativeIds(StringBuilder sb) {
        Object findObjectId = this._last.findObjectId(this._appendAt - 1);
        if (findObjectId != null) {
            sb.append("[objectId=");
            sb.append(String.valueOf(findObjectId));
            sb.append(']');
        }
        Object findTypeId = this._last.findTypeId(this._appendAt - 1);
        if (findTypeId != null) {
            sb.append("[typeId=");
            sb.append(String.valueOf(findTypeId));
            sb.append(']');
        }
    }

    private final void _checkNativeIds(JsonParser jsonParser) throws IOException {
        Object typeId = jsonParser.getTypeId();
        this._typeId = typeId;
        if (typeId != null) {
            this._hasNativeId = true;
        }
        Object objectId = jsonParser.getObjectId();
        this._objectId = objectId;
        if (objectId != null) {
            this._hasNativeId = true;
        }
    }

    private void _copyBufferValue(JsonParser jsonParser, JsonToken jsonToken) throws IOException {
        if (this._mayHaveNativeIds) {
            _checkNativeIds(jsonParser);
        }
        switch (C08841.$SwitchMap$com$fasterxml$jackson$core$JsonToken[jsonToken.ordinal()]) {
            case 6:
                if (jsonParser.hasTextCharacters()) {
                    writeString(jsonParser.getTextCharacters(), jsonParser.getTextOffset(), jsonParser.getTextLength());
                    return;
                } else {
                    writeString(jsonParser.getText());
                    return;
                }
            case 7:
                int i2 = C08841.$SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[jsonParser.getNumberType().ordinal()];
                if (i2 == 1) {
                    writeNumber(jsonParser.getIntValue());
                    return;
                } else if (i2 != 2) {
                    writeNumber(jsonParser.getLongValue());
                    return;
                } else {
                    writeNumber(jsonParser.getBigIntegerValue());
                    return;
                }
            case 8:
                if (this._forceBigDecimal) {
                    writeNumber(jsonParser.getDecimalValue());
                    return;
                }
                int i3 = C08841.$SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[jsonParser.getNumberType().ordinal()];
                if (i3 == 3) {
                    writeNumber(jsonParser.getDecimalValue());
                    return;
                } else if (i3 != 4) {
                    writeNumber(jsonParser.getDoubleValue());
                    return;
                } else {
                    writeNumber(jsonParser.getFloatValue());
                    return;
                }
            case 9:
                writeBoolean(true);
                return;
            case 10:
                writeBoolean(false);
                return;
            case 11:
                writeNull();
                return;
            case 12:
                writeObject(jsonParser.getEmbeddedObject());
                return;
            default:
                throw new RuntimeException("Internal error: unexpected token: " + jsonToken);
        }
    }

    public static TokenBuffer asCopyOfValue(JsonParser jsonParser) throws IOException {
        TokenBuffer tokenBuffer = new TokenBuffer(jsonParser);
        tokenBuffer.copyCurrentStructure(jsonParser);
        return tokenBuffer;
    }

    public final void _appendEndMarker(JsonToken jsonToken) {
        Segment append = this._last.append(this._appendAt, jsonToken);
        if (append == null) {
            this._appendAt++;
        } else {
            this._last = append;
            this._appendAt = 1;
        }
    }

    public final void _appendFieldName(Object obj) {
        Segment append = this._hasNativeId ? this._last.append(this._appendAt, JsonToken.FIELD_NAME, obj, this._objectId, this._typeId) : this._last.append(this._appendAt, JsonToken.FIELD_NAME, obj);
        if (append == null) {
            this._appendAt++;
        } else {
            this._last = append;
            this._appendAt = 1;
        }
    }

    public final void _appendStartMarker(JsonToken jsonToken) {
        Segment append = this._hasNativeId ? this._last.append(this._appendAt, jsonToken, this._objectId, this._typeId) : this._last.append(this._appendAt, jsonToken);
        if (append == null) {
            this._appendAt++;
        } else {
            this._last = append;
            this._appendAt = 1;
        }
    }

    public final void _appendValue(JsonToken jsonToken) {
        this._writeContext.writeValue();
        Segment append = this._hasNativeId ? this._last.append(this._appendAt, jsonToken, this._objectId, this._typeId) : this._last.append(this._appendAt, jsonToken);
        if (append == null) {
            this._appendAt++;
        } else {
            this._last = append;
            this._appendAt = 1;
        }
    }

    public void _copyBufferContents(JsonParser jsonParser) throws IOException {
        int i2 = 1;
        while (true) {
            JsonToken nextToken = jsonParser.nextToken();
            if (nextToken == null) {
                return;
            }
            int i3 = C08841.$SwitchMap$com$fasterxml$jackson$core$JsonToken[nextToken.ordinal()];
            if (i3 == 1) {
                if (this._mayHaveNativeIds) {
                    _checkNativeIds(jsonParser);
                }
                writeStartObject();
            } else if (i3 == 2) {
                writeEndObject();
                i2--;
                if (i2 == 0) {
                    return;
                }
            } else if (i3 == 3) {
                if (this._mayHaveNativeIds) {
                    _checkNativeIds(jsonParser);
                }
                writeStartArray();
            } else if (i3 == 4) {
                writeEndArray();
                i2--;
                if (i2 == 0) {
                    return;
                }
            } else if (i3 != 5) {
                _copyBufferValue(jsonParser, nextToken);
            } else {
                if (this._mayHaveNativeIds) {
                    _checkNativeIds(jsonParser);
                }
                writeFieldName(jsonParser.getCurrentName());
            }
            i2++;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void _reportUnsupportedOperation() {
        throw new UnsupportedOperationException("Called operation not supported for TokenBuffer");
    }

    public TokenBuffer append(TokenBuffer tokenBuffer) throws IOException {
        if (!this._hasNativeTypeIds) {
            this._hasNativeTypeIds = tokenBuffer.canWriteTypeId();
        }
        if (!this._hasNativeObjectIds) {
            this._hasNativeObjectIds = tokenBuffer.canWriteObjectId();
        }
        this._mayHaveNativeIds = this._hasNativeTypeIds | this._hasNativeObjectIds;
        JsonParser asParser = tokenBuffer.asParser();
        while (asParser.nextToken() != null) {
            copyCurrentStructure(asParser);
        }
        return this;
    }

    public JsonParser asParser() {
        return asParser(this._objectCodec);
    }

    public JsonParser asParserOnFirstToken() throws IOException {
        JsonParser asParser = asParser(this._objectCodec);
        asParser.nextToken();
        return asParser;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public boolean canWriteBinaryNatively() {
        return true;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public boolean canWriteObjectId() {
        return this._hasNativeObjectIds;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public boolean canWriteTypeId() {
        return this._hasNativeTypeIds;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this._closed = true;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void copyCurrentEvent(JsonParser jsonParser) throws IOException {
        if (this._mayHaveNativeIds) {
            _checkNativeIds(jsonParser);
        }
        switch (C08841.$SwitchMap$com$fasterxml$jackson$core$JsonToken[jsonParser.currentToken().ordinal()]) {
            case 1:
                writeStartObject();
                return;
            case 2:
                writeEndObject();
                return;
            case 3:
                writeStartArray();
                return;
            case 4:
                writeEndArray();
                return;
            case 5:
                writeFieldName(jsonParser.getCurrentName());
                return;
            case 6:
                if (jsonParser.hasTextCharacters()) {
                    writeString(jsonParser.getTextCharacters(), jsonParser.getTextOffset(), jsonParser.getTextLength());
                    return;
                } else {
                    writeString(jsonParser.getText());
                    return;
                }
            case 7:
                int i2 = C08841.$SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[jsonParser.getNumberType().ordinal()];
                if (i2 == 1) {
                    writeNumber(jsonParser.getIntValue());
                    return;
                } else if (i2 != 2) {
                    writeNumber(jsonParser.getLongValue());
                    return;
                } else {
                    writeNumber(jsonParser.getBigIntegerValue());
                    return;
                }
            case 8:
                if (this._forceBigDecimal) {
                    writeNumber(jsonParser.getDecimalValue());
                    return;
                }
                int i3 = C08841.$SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[jsonParser.getNumberType().ordinal()];
                if (i3 == 3) {
                    writeNumber(jsonParser.getDecimalValue());
                    return;
                } else if (i3 != 4) {
                    writeNumber(jsonParser.getDoubleValue());
                    return;
                } else {
                    writeNumber(jsonParser.getFloatValue());
                    return;
                }
            case 9:
                writeBoolean(true);
                return;
            case 10:
                writeBoolean(false);
                return;
            case 11:
                writeNull();
                return;
            case 12:
                writeObject(jsonParser.getEmbeddedObject());
                return;
            default:
                StringBuilder m24u = C0000a.m24u("Internal error: unexpected token: ");
                m24u.append(jsonParser.currentToken());
                throw new RuntimeException(m24u.toString());
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void copyCurrentStructure(JsonParser jsonParser) throws IOException {
        JsonToken currentToken = jsonParser.currentToken();
        if (currentToken == JsonToken.FIELD_NAME) {
            if (this._mayHaveNativeIds) {
                _checkNativeIds(jsonParser);
            }
            writeFieldName(jsonParser.getCurrentName());
            currentToken = jsonParser.nextToken();
        } else if (currentToken == null) {
            throw new IllegalStateException("No token available from argument `JsonParser`");
        }
        int i2 = C08841.$SwitchMap$com$fasterxml$jackson$core$JsonToken[currentToken.ordinal()];
        if (i2 == 1) {
            if (this._mayHaveNativeIds) {
                _checkNativeIds(jsonParser);
            }
            writeStartObject();
            _copyBufferContents(jsonParser);
            return;
        }
        if (i2 == 2) {
            writeEndObject();
            return;
        }
        if (i2 != 3) {
            if (i2 != 4) {
                _copyBufferValue(jsonParser, currentToken);
                return;
            } else {
                writeEndArray();
                return;
            }
        }
        if (this._mayHaveNativeIds) {
            _checkNativeIds(jsonParser);
        }
        writeStartArray();
        _copyBufferContents(jsonParser);
    }

    public TokenBuffer deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonToken nextToken;
        if (!jsonParser.hasToken(JsonToken.FIELD_NAME)) {
            copyCurrentStructure(jsonParser);
            return this;
        }
        writeStartObject();
        do {
            copyCurrentStructure(jsonParser);
            nextToken = jsonParser.nextToken();
        } while (nextToken == JsonToken.FIELD_NAME);
        JsonToken jsonToken = JsonToken.END_OBJECT;
        if (nextToken != jsonToken) {
            deserializationContext.reportWrongTokenException(TokenBuffer.class, jsonToken, "Expected END_OBJECT after copying contents of a JsonParser into TokenBuffer, got " + nextToken, new Object[0]);
        }
        writeEndObject();
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator disable(JsonGenerator.Feature feature) {
        this._generatorFeatures = (~feature.getMask()) & this._generatorFeatures;
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator enable(JsonGenerator.Feature feature) {
        this._generatorFeatures = feature.getMask() | this._generatorFeatures;
        return this;
    }

    public JsonToken firstToken() {
        return this._first.type(0);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator, java.io.Flushable
    public void flush() throws IOException {
    }

    public TokenBuffer forceUseOfBigDecimal(boolean z) {
        this._forceBigDecimal = z;
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public ObjectCodec getCodec() {
        return this._objectCodec;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public int getFeatureMask() {
        return this._generatorFeatures;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public boolean isClosed() {
        return this._closed;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public boolean isEnabled(JsonGenerator.Feature feature) {
        return (feature.getMask() & this._generatorFeatures) != 0;
    }

    public TokenBuffer overrideParentContext(JsonStreamContext jsonStreamContext) {
        this._parentContext = jsonStreamContext;
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator overrideStdFeatures(int i2, int i3) {
        this._generatorFeatures = (i2 & i3) | (getFeatureMask() & (~i3));
        return this;
    }

    public void serialize(JsonGenerator jsonGenerator) throws IOException {
        Segment segment = this._first;
        boolean z = this._mayHaveNativeIds;
        boolean z2 = z && segment.hasIds();
        int i2 = -1;
        while (true) {
            i2++;
            if (i2 >= 16) {
                segment = segment.next();
                if (segment == null) {
                    return;
                }
                z2 = z && segment.hasIds();
                i2 = 0;
            }
            JsonToken type = segment.type(i2);
            if (type == null) {
                return;
            }
            if (z2) {
                Object findObjectId = segment.findObjectId(i2);
                if (findObjectId != null) {
                    jsonGenerator.writeObjectId(findObjectId);
                }
                Object findTypeId = segment.findTypeId(i2);
                if (findTypeId != null) {
                    jsonGenerator.writeTypeId(findTypeId);
                }
            }
            switch (C08841.$SwitchMap$com$fasterxml$jackson$core$JsonToken[type.ordinal()]) {
                case 1:
                    jsonGenerator.writeStartObject();
                    break;
                case 2:
                    jsonGenerator.writeEndObject();
                    break;
                case 3:
                    jsonGenerator.writeStartArray();
                    break;
                case 4:
                    jsonGenerator.writeEndArray();
                    break;
                case 5:
                    Object obj = segment.get(i2);
                    if (!(obj instanceof SerializableString)) {
                        jsonGenerator.writeFieldName((String) obj);
                        break;
                    } else {
                        jsonGenerator.writeFieldName((SerializableString) obj);
                        break;
                    }
                case 6:
                    Object obj2 = segment.get(i2);
                    if (!(obj2 instanceof SerializableString)) {
                        jsonGenerator.writeString((String) obj2);
                        break;
                    } else {
                        jsonGenerator.writeString((SerializableString) obj2);
                        break;
                    }
                case 7:
                    Object obj3 = segment.get(i2);
                    if (!(obj3 instanceof Integer)) {
                        if (!(obj3 instanceof BigInteger)) {
                            if (!(obj3 instanceof Long)) {
                                if (!(obj3 instanceof Short)) {
                                    jsonGenerator.writeNumber(((Number) obj3).intValue());
                                    break;
                                } else {
                                    jsonGenerator.writeNumber(((Short) obj3).shortValue());
                                    break;
                                }
                            } else {
                                jsonGenerator.writeNumber(((Long) obj3).longValue());
                                break;
                            }
                        } else {
                            jsonGenerator.writeNumber((BigInteger) obj3);
                            break;
                        }
                    } else {
                        jsonGenerator.writeNumber(((Integer) obj3).intValue());
                        break;
                    }
                case 8:
                    Object obj4 = segment.get(i2);
                    if (obj4 instanceof Double) {
                        jsonGenerator.writeNumber(((Double) obj4).doubleValue());
                        break;
                    } else if (obj4 instanceof BigDecimal) {
                        jsonGenerator.writeNumber((BigDecimal) obj4);
                        break;
                    } else if (obj4 instanceof Float) {
                        jsonGenerator.writeNumber(((Float) obj4).floatValue());
                        break;
                    } else if (obj4 == null) {
                        jsonGenerator.writeNull();
                        break;
                    } else {
                        if (!(obj4 instanceof String)) {
                            throw new JsonGenerationException(String.format("Unrecognized value type for VALUE_NUMBER_FLOAT: %s, cannot serialize", obj4.getClass().getName()), jsonGenerator);
                        }
                        jsonGenerator.writeNumber((String) obj4);
                        break;
                    }
                case 9:
                    jsonGenerator.writeBoolean(true);
                    break;
                case 10:
                    jsonGenerator.writeBoolean(false);
                    break;
                case 11:
                    jsonGenerator.writeNull();
                    break;
                case 12:
                    Object obj5 = segment.get(i2);
                    if (!(obj5 instanceof RawValue)) {
                        if (!(obj5 instanceof JsonSerializable)) {
                            jsonGenerator.writeEmbeddedObject(obj5);
                            break;
                        } else {
                            jsonGenerator.writeObject(obj5);
                            break;
                        }
                    } else {
                        ((RawValue) obj5).serialize(jsonGenerator);
                        break;
                    }
                default:
                    throw new RuntimeException("Internal error: should never end up through this code path");
            }
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator setCodec(ObjectCodec objectCodec) {
        this._objectCodec = objectCodec;
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    @Deprecated
    public JsonGenerator setFeatureMask(int i2) {
        this._generatorFeatures = i2;
        return this;
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("[TokenBuffer: ");
        JsonParser asParser = asParser();
        int i2 = 0;
        boolean z = this._hasNativeTypeIds || this._hasNativeObjectIds;
        while (true) {
            try {
                JsonToken nextToken = asParser.nextToken();
                if (nextToken == null) {
                    break;
                }
                if (z) {
                    _appendNativeIds(m24u);
                }
                if (i2 < 100) {
                    if (i2 > 0) {
                        m24u.append(", ");
                    }
                    m24u.append(nextToken.toString());
                    if (nextToken == JsonToken.FIELD_NAME) {
                        m24u.append('(');
                        m24u.append(asParser.getCurrentName());
                        m24u.append(')');
                    }
                }
                i2++;
            } catch (IOException e2) {
                throw new IllegalStateException(e2);
            }
        }
        if (i2 >= 100) {
            m24u.append(" ... (truncated ");
            m24u.append(i2 - 100);
            m24u.append(" entries)");
        }
        m24u.append(']');
        return m24u.toString();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator useDefaultPrettyPrinter() {
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.core.Versioned
    public Version version() {
        return PackageVersion.VERSION;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeBinary(Base64Variant base64Variant, byte[] bArr, int i2, int i3) throws IOException {
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        writeObject(bArr2);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeBoolean(boolean z) throws IOException {
        _appendValue(z ? JsonToken.VALUE_TRUE : JsonToken.VALUE_FALSE);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeEmbeddedObject(Object obj) throws IOException {
        _appendValue(JsonToken.VALUE_EMBEDDED_OBJECT, obj);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeEndArray() throws IOException {
        _appendEndMarker(JsonToken.END_ARRAY);
        JsonWriteContext parent = this._writeContext.getParent();
        if (parent != null) {
            this._writeContext = parent;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeEndObject() throws IOException {
        _appendEndMarker(JsonToken.END_OBJECT);
        JsonWriteContext parent = this._writeContext.getParent();
        if (parent != null) {
            this._writeContext = parent;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeFieldName(String str) throws IOException {
        this._writeContext.writeFieldName(str);
        _appendFieldName(str);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNull() throws IOException {
        _appendValue(JsonToken.VALUE_NULL);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(short s) throws IOException {
        _appendValue(JsonToken.VALUE_NUMBER_INT, Short.valueOf(s));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeObject(Object obj) throws IOException {
        if (obj == null) {
            writeNull();
            return;
        }
        if (obj.getClass() == byte[].class || (obj instanceof RawValue)) {
            _appendValue(JsonToken.VALUE_EMBEDDED_OBJECT, obj);
            return;
        }
        ObjectCodec objectCodec = this._objectCodec;
        if (objectCodec == null) {
            _appendValue(JsonToken.VALUE_EMBEDDED_OBJECT, obj);
        } else {
            objectCodec.writeValue(this, obj);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeObjectId(Object obj) {
        this._objectId = obj;
        this._hasNativeId = true;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(String str) throws IOException {
        _reportUnsupportedOperation();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRawUTF8String(byte[] bArr, int i2, int i3) throws IOException {
        _reportUnsupportedOperation();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRawValue(String str) throws IOException {
        _appendValue(JsonToken.VALUE_EMBEDDED_OBJECT, new RawValue(str));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeStartArray() throws IOException {
        this._writeContext.writeValue();
        _appendStartMarker(JsonToken.START_ARRAY);
        this._writeContext = this._writeContext.createChildArrayContext();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeStartObject() throws IOException {
        this._writeContext.writeValue();
        _appendStartMarker(JsonToken.START_OBJECT);
        this._writeContext = this._writeContext.createChildObjectContext();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeString(String str) throws IOException {
        if (str == null) {
            writeNull();
        } else {
            _appendValue(JsonToken.VALUE_STRING, str);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeTree(TreeNode treeNode) throws IOException {
        if (treeNode == null) {
            writeNull();
            return;
        }
        ObjectCodec objectCodec = this._objectCodec;
        if (objectCodec == null) {
            _appendValue(JsonToken.VALUE_EMBEDDED_OBJECT, treeNode);
        } else {
            objectCodec.writeTree(this, treeNode);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeTypeId(Object obj) {
        this._typeId = obj;
        this._hasNativeId = true;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeUTF8String(byte[] bArr, int i2, int i3) throws IOException {
        _reportUnsupportedOperation();
    }

    public static final class Segment {
        public static final int TOKENS_PER_SEGMENT = 16;
        private static final JsonToken[] TOKEN_TYPES_BY_INDEX;
        public TreeMap<Integer, Object> _nativeIds;
        public Segment _next;
        public long _tokenTypes;
        public final Object[] _tokens = new Object[16];

        static {
            JsonToken[] jsonTokenArr = new JsonToken[16];
            TOKEN_TYPES_BY_INDEX = jsonTokenArr;
            JsonToken[] values = JsonToken.values();
            System.arraycopy(values, 1, jsonTokenArr, 1, Math.min(15, values.length - 1));
        }

        private final int _objectIdIndex(int i2) {
            return i2 + i2 + 1;
        }

        private final int _typeIdIndex(int i2) {
            return i2 + i2;
        }

        private final void assignNativeIds(int i2, Object obj, Object obj2) {
            if (this._nativeIds == null) {
                this._nativeIds = new TreeMap<>();
            }
            if (obj != null) {
                this._nativeIds.put(Integer.valueOf(_objectIdIndex(i2)), obj);
            }
            if (obj2 != null) {
                this._nativeIds.put(Integer.valueOf(_typeIdIndex(i2)), obj2);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object findObjectId(int i2) {
            TreeMap<Integer, Object> treeMap = this._nativeIds;
            if (treeMap == null) {
                return null;
            }
            return treeMap.get(Integer.valueOf(_objectIdIndex(i2)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object findTypeId(int i2) {
            TreeMap<Integer, Object> treeMap = this._nativeIds;
            if (treeMap == null) {
                return null;
            }
            return treeMap.get(Integer.valueOf(_typeIdIndex(i2)));
        }

        private void set(int i2, JsonToken jsonToken) {
            long ordinal = jsonToken.ordinal();
            if (i2 > 0) {
                ordinal <<= i2 << 2;
            }
            this._tokenTypes |= ordinal;
        }

        public Segment append(int i2, JsonToken jsonToken) {
            if (i2 < 16) {
                set(i2, jsonToken);
                return null;
            }
            Segment segment = new Segment();
            this._next = segment;
            segment.set(0, jsonToken);
            return this._next;
        }

        public Object get(int i2) {
            return this._tokens[i2];
        }

        public boolean hasIds() {
            return this._nativeIds != null;
        }

        public Segment next() {
            return this._next;
        }

        public int rawType(int i2) {
            long j2 = this._tokenTypes;
            if (i2 > 0) {
                j2 >>= i2 << 2;
            }
            return ((int) j2) & 15;
        }

        public JsonToken type(int i2) {
            long j2 = this._tokenTypes;
            if (i2 > 0) {
                j2 >>= i2 << 2;
            }
            return TOKEN_TYPES_BY_INDEX[((int) j2) & 15];
        }

        private void set(int i2, JsonToken jsonToken, Object obj, Object obj2) {
            long ordinal = jsonToken.ordinal();
            if (i2 > 0) {
                ordinal <<= i2 << 2;
            }
            this._tokenTypes = ordinal | this._tokenTypes;
            assignNativeIds(i2, obj, obj2);
        }

        public Segment append(int i2, JsonToken jsonToken, Object obj, Object obj2) {
            if (i2 < 16) {
                set(i2, jsonToken, obj, obj2);
                return null;
            }
            Segment segment = new Segment();
            this._next = segment;
            segment.set(0, jsonToken, obj, obj2);
            return this._next;
        }

        private void set(int i2, JsonToken jsonToken, Object obj) {
            this._tokens[i2] = obj;
            long ordinal = jsonToken.ordinal();
            if (i2 > 0) {
                ordinal <<= i2 << 2;
            }
            this._tokenTypes |= ordinal;
        }

        private void set(int i2, JsonToken jsonToken, Object obj, Object obj2, Object obj3) {
            this._tokens[i2] = obj;
            long ordinal = jsonToken.ordinal();
            if (i2 > 0) {
                ordinal <<= i2 << 2;
            }
            this._tokenTypes = ordinal | this._tokenTypes;
            assignNativeIds(i2, obj2, obj3);
        }

        public Segment append(int i2, JsonToken jsonToken, Object obj) {
            if (i2 < 16) {
                set(i2, jsonToken, obj);
                return null;
            }
            Segment segment = new Segment();
            this._next = segment;
            segment.set(0, jsonToken, obj);
            return this._next;
        }

        public Segment append(int i2, JsonToken jsonToken, Object obj, Object obj2, Object obj3) {
            if (i2 < 16) {
                set(i2, jsonToken, obj, obj2, obj3);
                return null;
            }
            Segment segment = new Segment();
            this._next = segment;
            segment.set(0, jsonToken, obj, obj2, obj3);
            return this._next;
        }
    }

    public JsonParser asParser(ObjectCodec objectCodec) {
        return new Parser(this._first, objectCodec, this._hasNativeTypeIds, this._hasNativeObjectIds, this._parentContext);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final JsonWriteContext getOutputContext() {
        return this._writeContext;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(int i2) throws IOException {
        _appendValue(JsonToken.VALUE_NUMBER_INT, Integer.valueOf(i2));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(String str, int i2, int i3) throws IOException {
        _reportUnsupportedOperation();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRawValue(String str, int i2, int i3) throws IOException {
        if (i2 > 0 || i3 != str.length()) {
            str = str.substring(i2, i3 + i2);
        }
        _appendValue(JsonToken.VALUE_EMBEDDED_OBJECT, new RawValue(str));
    }

    public JsonParser asParser(JsonParser jsonParser) {
        Parser parser = new Parser(this._first, jsonParser.getCodec(), this._hasNativeTypeIds, this._hasNativeObjectIds, this._parentContext);
        parser.setLocation(jsonParser.getTokenLocation());
        return parser;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeFieldName(SerializableString serializableString) throws IOException {
        this._writeContext.writeFieldName(serializableString.getValue());
        _appendFieldName(serializableString);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(long j2) throws IOException {
        _appendValue(JsonToken.VALUE_NUMBER_INT, Long.valueOf(j2));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(SerializableString serializableString) throws IOException {
        _reportUnsupportedOperation();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeString(char[] cArr, int i2, int i3) throws IOException {
        writeString(new String(cArr, i2, i3));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public int writeBinary(Base64Variant base64Variant, InputStream inputStream, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(double d) throws IOException {
        _appendValue(JsonToken.VALUE_NUMBER_FLOAT, Double.valueOf(d));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(char[] cArr, int i2, int i3) throws IOException {
        _reportUnsupportedOperation();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeStartArray(int i2) throws IOException {
        this._writeContext.writeValue();
        _appendStartMarker(JsonToken.START_ARRAY);
        this._writeContext = this._writeContext.createChildArrayContext();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeStartObject(Object obj) throws IOException {
        this._writeContext.writeValue();
        _appendStartMarker(JsonToken.START_OBJECT);
        this._writeContext = this._writeContext.createChildObjectContext(obj);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeString(SerializableString serializableString) throws IOException {
        if (serializableString == null) {
            writeNull();
        } else {
            _appendValue(JsonToken.VALUE_STRING, serializableString);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(float f2) throws IOException {
        _appendValue(JsonToken.VALUE_NUMBER_FLOAT, Float.valueOf(f2));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(char c2) throws IOException {
        _reportUnsupportedOperation();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRawValue(char[] cArr, int i2, int i3) throws IOException {
        _appendValue(JsonToken.VALUE_EMBEDDED_OBJECT, new String(cArr, i2, i3));
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(BigDecimal bigDecimal) throws IOException {
        if (bigDecimal == null) {
            writeNull();
        } else {
            _appendValue(JsonToken.VALUE_NUMBER_FLOAT, bigDecimal);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeStartArray(Object obj) throws IOException {
        this._writeContext.writeValue();
        _appendStartMarker(JsonToken.START_ARRAY);
        this._writeContext = this._writeContext.createChildArrayContext();
    }

    public final void _appendValue(JsonToken jsonToken, Object obj) {
        Segment append;
        this._writeContext.writeValue();
        if (this._hasNativeId) {
            append = this._last.append(this._appendAt, jsonToken, obj, this._objectId, this._typeId);
        } else {
            append = this._last.append(this._appendAt, jsonToken, obj);
        }
        if (append == null) {
            this._appendAt++;
        } else {
            this._last = append;
            this._appendAt = 1;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(BigInteger bigInteger) throws IOException {
        if (bigInteger == null) {
            writeNull();
        } else {
            _appendValue(JsonToken.VALUE_NUMBER_INT, bigInteger);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeStartObject(Object obj, int i2) throws IOException {
        this._writeContext.writeValue();
        _appendStartMarker(JsonToken.START_OBJECT);
        this._writeContext = this._writeContext.createChildObjectContext(obj);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(String str) throws IOException {
        _appendValue(JsonToken.VALUE_NUMBER_FLOAT, str);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeStartArray(Object obj, int i2) throws IOException {
        this._writeContext.writeValue();
        _appendStartMarker(JsonToken.START_ARRAY);
        this._writeContext = this._writeContext.createChildArrayContext(obj);
    }

    public TokenBuffer(JsonParser jsonParser) {
        this(jsonParser, (DeserializationContext) null);
    }

    public TokenBuffer(JsonParser jsonParser, DeserializationContext deserializationContext) {
        this._hasNativeId = false;
        this._objectCodec = jsonParser.getCodec();
        this._parentContext = jsonParser.getParsingContext();
        this._generatorFeatures = DEFAULT_GENERATOR_FEATURES;
        this._writeContext = JsonWriteContext.createRootContext(null);
        Segment segment = new Segment();
        this._last = segment;
        this._first = segment;
        this._appendAt = 0;
        this._hasNativeTypeIds = jsonParser.canReadTypeId();
        boolean canReadObjectId = jsonParser.canReadObjectId();
        this._hasNativeObjectIds = canReadObjectId;
        this._mayHaveNativeIds = canReadObjectId | this._hasNativeTypeIds;
        this._forceBigDecimal = deserializationContext != null ? deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS) : false;
    }
}
