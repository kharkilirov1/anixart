package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.p006io.CharacterEscapes;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.core.util.VersionUtil;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p000a.C0000a;

/* loaded from: classes.dex */
public abstract class JsonGenerator implements Closeable, Flushable, Versioned {
    public PrettyPrinter _cfgPrettyPrinter;

    /* renamed from: com.fasterxml.jackson.core.JsonGenerator$1 */
    public static /* synthetic */ class C08361 {

        /* renamed from: $SwitchMap$com$fasterxml$jackson$core$type$WritableTypeId$Inclusion */
        public static final /* synthetic */ int[] f8862xa51b40dc;

        static {
            int[] iArr = new int[WritableTypeId.Inclusion.values().length];
            f8862xa51b40dc = iArr;
            try {
                iArr[WritableTypeId.Inclusion.PARENT_PROPERTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8862xa51b40dc[WritableTypeId.Inclusion.PAYLOAD_PROPERTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8862xa51b40dc[WritableTypeId.Inclusion.METADATA_PROPERTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8862xa51b40dc[WritableTypeId.Inclusion.WRAPPER_OBJECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8862xa51b40dc[WritableTypeId.Inclusion.WRAPPER_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public enum Feature {
        AUTO_CLOSE_TARGET(true),
        AUTO_CLOSE_JSON_CONTENT(true),
        FLUSH_PASSED_TO_STREAM(true),
        QUOTE_FIELD_NAMES(true),
        QUOTE_NON_NUMERIC_NUMBERS(true),
        ESCAPE_NON_ASCII(false),
        WRITE_NUMBERS_AS_STRINGS(false),
        WRITE_BIGDECIMAL_AS_PLAIN(false),
        STRICT_DUPLICATE_DETECTION(false),
        IGNORE_UNKNOWN(false);

        private final boolean _defaultState;
        private final int _mask = 1 << ordinal();

        Feature(boolean z) {
            this._defaultState = z;
        }

        public static int collectDefaults() {
            int i2 = 0;
            for (Feature feature : values()) {
                if (feature.enabledByDefault()) {
                    i2 |= feature.getMask();
                }
            }
            return i2;
        }

        public boolean enabledByDefault() {
            return this._defaultState;
        }

        public boolean enabledIn(int i2) {
            return (i2 & this._mask) != 0;
        }

        public int getMask() {
            return this._mask;
        }
    }

    public void _copyCurrentContents(JsonParser jsonParser) throws IOException {
        int i2 = 1;
        while (true) {
            JsonToken nextToken = jsonParser.nextToken();
            if (nextToken == null) {
                return;
            }
            switch (nextToken.m5359id()) {
                case 1:
                    writeStartObject();
                    break;
                case 2:
                    writeEndObject();
                    i2--;
                    if (i2 == 0) {
                        return;
                    } else {
                        continue;
                    }
                case 3:
                    writeStartArray();
                    break;
                case 4:
                    writeEndArray();
                    i2--;
                    if (i2 == 0) {
                        return;
                    } else {
                        continue;
                    }
                case 5:
                    writeFieldName(jsonParser.getCurrentName());
                    continue;
                case 6:
                    if (jsonParser.hasTextCharacters()) {
                        writeString(jsonParser.getTextCharacters(), jsonParser.getTextOffset(), jsonParser.getTextLength());
                    } else {
                        writeString(jsonParser.getText());
                        continue;
                    }
                case 7:
                    JsonParser.NumberType numberType = jsonParser.getNumberType();
                    if (numberType == JsonParser.NumberType.INT) {
                        writeNumber(jsonParser.getIntValue());
                    } else if (numberType == JsonParser.NumberType.BIG_INTEGER) {
                        writeNumber(jsonParser.getBigIntegerValue());
                    } else {
                        writeNumber(jsonParser.getLongValue());
                        continue;
                    }
                case 8:
                    JsonParser.NumberType numberType2 = jsonParser.getNumberType();
                    if (numberType2 == JsonParser.NumberType.BIG_DECIMAL) {
                        writeNumber(jsonParser.getDecimalValue());
                    } else if (numberType2 == JsonParser.NumberType.FLOAT) {
                        writeNumber(jsonParser.getFloatValue());
                    } else {
                        writeNumber(jsonParser.getDoubleValue());
                        continue;
                    }
                case 9:
                    writeBoolean(true);
                    continue;
                case 10:
                    writeBoolean(false);
                    continue;
                case 11:
                    writeNull();
                    continue;
                case 12:
                    writeObject(jsonParser.getEmbeddedObject());
                    continue;
                default:
                    throw new IllegalStateException("Internal error: unknown current token, " + nextToken);
            }
            i2++;
        }
    }

    public void _reportError(String str) throws JsonGenerationException {
        throw new JsonGenerationException(str, this);
    }

    public void _reportUnsupportedOperation() {
        StringBuilder m24u = C0000a.m24u("Operation not supported by generator of type ");
        m24u.append(getClass().getName());
        throw new UnsupportedOperationException(m24u.toString());
    }

    public final void _throwInternal() {
        VersionUtil.throwInternal();
    }

    public final void _verifyOffsets(int i2, int i3, int i4) {
        if (i3 < 0 || i3 + i4 > i2) {
            throw new IllegalArgumentException(String.format("invalid argument(s) (offset=%d, length=%d) for input array of %d element", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i2)));
        }
    }

    public void _writeSimpleObject(Object obj) throws IOException {
        if (obj == null) {
            writeNull();
            return;
        }
        if (obj instanceof String) {
            writeString((String) obj);
            return;
        }
        if (obj instanceof Number) {
            Number number = (Number) obj;
            if (number instanceof Integer) {
                writeNumber(number.intValue());
                return;
            }
            if (number instanceof Long) {
                writeNumber(number.longValue());
                return;
            }
            if (number instanceof Double) {
                writeNumber(number.doubleValue());
                return;
            }
            if (number instanceof Float) {
                writeNumber(number.floatValue());
                return;
            }
            if (number instanceof Short) {
                writeNumber(number.shortValue());
                return;
            }
            if (number instanceof Byte) {
                writeNumber(number.byteValue());
                return;
            }
            if (number instanceof BigInteger) {
                writeNumber((BigInteger) number);
                return;
            }
            if (number instanceof BigDecimal) {
                writeNumber((BigDecimal) number);
                return;
            } else if (number instanceof AtomicInteger) {
                writeNumber(((AtomicInteger) number).get());
                return;
            } else if (number instanceof AtomicLong) {
                writeNumber(((AtomicLong) number).get());
                return;
            }
        } else if (obj instanceof byte[]) {
            writeBinary((byte[]) obj);
            return;
        } else if (obj instanceof Boolean) {
            writeBoolean(((Boolean) obj).booleanValue());
            return;
        } else if (obj instanceof AtomicBoolean) {
            writeBoolean(((AtomicBoolean) obj).get());
            return;
        }
        StringBuilder m24u = C0000a.m24u("No ObjectCodec defined for the generator, can only serialize simple wrapper types (type passed ");
        m24u.append(obj.getClass().getName());
        m24u.append(")");
        throw new IllegalStateException(m24u.toString());
    }

    public boolean canOmitFields() {
        return true;
    }

    public boolean canUseSchema(FormatSchema formatSchema) {
        return false;
    }

    public boolean canWriteBinaryNatively() {
        return false;
    }

    public boolean canWriteFormattedNumbers() {
        return false;
    }

    public boolean canWriteObjectId() {
        return false;
    }

    public boolean canWriteTypeId() {
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close() throws IOException;

    public final JsonGenerator configure(Feature feature, boolean z) {
        if (z) {
            enable(feature);
        } else {
            disable(feature);
        }
        return this;
    }

    public void copyCurrentEvent(JsonParser jsonParser) throws IOException {
        JsonToken currentToken = jsonParser.currentToken();
        switch (currentToken == null ? -1 : currentToken.m5359id()) {
            case -1:
                _reportError("No current event to copy");
                return;
            case 0:
            default:
                throw new IllegalStateException("Internal error: unknown current token, " + currentToken);
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
                JsonParser.NumberType numberType = jsonParser.getNumberType();
                if (numberType == JsonParser.NumberType.INT) {
                    writeNumber(jsonParser.getIntValue());
                    return;
                } else if (numberType == JsonParser.NumberType.BIG_INTEGER) {
                    writeNumber(jsonParser.getBigIntegerValue());
                    return;
                } else {
                    writeNumber(jsonParser.getLongValue());
                    return;
                }
            case 8:
                JsonParser.NumberType numberType2 = jsonParser.getNumberType();
                if (numberType2 == JsonParser.NumberType.BIG_DECIMAL) {
                    writeNumber(jsonParser.getDecimalValue());
                    return;
                } else if (numberType2 == JsonParser.NumberType.FLOAT) {
                    writeNumber(jsonParser.getFloatValue());
                    return;
                } else {
                    writeNumber(jsonParser.getDoubleValue());
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
        }
    }

    public void copyCurrentStructure(JsonParser jsonParser) throws IOException {
        JsonToken currentToken = jsonParser.currentToken();
        int m5359id = currentToken == null ? -1 : currentToken.m5359id();
        if (m5359id == 5) {
            writeFieldName(jsonParser.getCurrentName());
            JsonToken nextToken = jsonParser.nextToken();
            m5359id = nextToken != null ? nextToken.m5359id() : -1;
        }
        if (m5359id == 1) {
            writeStartObject();
            _copyCurrentContents(jsonParser);
        } else if (m5359id != 3) {
            copyCurrentEvent(jsonParser);
        } else {
            writeStartArray();
            _copyCurrentContents(jsonParser);
        }
    }

    public abstract JsonGenerator disable(Feature feature);

    public abstract JsonGenerator enable(Feature feature);

    @Override // java.io.Flushable
    public abstract void flush() throws IOException;

    public CharacterEscapes getCharacterEscapes() {
        return null;
    }

    public abstract ObjectCodec getCodec();

    public Object getCurrentValue() {
        JsonStreamContext outputContext = getOutputContext();
        if (outputContext == null) {
            return null;
        }
        return outputContext.getCurrentValue();
    }

    public abstract int getFeatureMask();

    public int getFormatFeatures() {
        return 0;
    }

    public int getHighestEscapedChar() {
        return 0;
    }

    public int getOutputBuffered() {
        return -1;
    }

    public abstract JsonStreamContext getOutputContext();

    public Object getOutputTarget() {
        return null;
    }

    public PrettyPrinter getPrettyPrinter() {
        return this._cfgPrettyPrinter;
    }

    public FormatSchema getSchema() {
        return null;
    }

    public abstract boolean isClosed();

    public abstract boolean isEnabled(Feature feature);

    public boolean isEnabled(StreamWriteFeature streamWriteFeature) {
        return isEnabled(streamWriteFeature.mappedFeature());
    }

    public JsonGenerator overrideFormatFeatures(int i2, int i3) {
        return this;
    }

    public JsonGenerator overrideStdFeatures(int i2, int i3) {
        return setFeatureMask((i2 & i3) | (getFeatureMask() & (~i3)));
    }

    public JsonGenerator setCharacterEscapes(CharacterEscapes characterEscapes) {
        return this;
    }

    public abstract JsonGenerator setCodec(ObjectCodec objectCodec);

    public void setCurrentValue(Object obj) {
        JsonStreamContext outputContext = getOutputContext();
        if (outputContext != null) {
            outputContext.setCurrentValue(obj);
        }
    }

    @Deprecated
    public abstract JsonGenerator setFeatureMask(int i2);

    public JsonGenerator setHighestNonEscapedChar(int i2) {
        return this;
    }

    public JsonGenerator setPrettyPrinter(PrettyPrinter prettyPrinter) {
        this._cfgPrettyPrinter = prettyPrinter;
        return this;
    }

    public JsonGenerator setRootValueSeparator(SerializableString serializableString) {
        throw new UnsupportedOperationException();
    }

    public void setSchema(FormatSchema formatSchema) {
        StringBuilder m24u = C0000a.m24u("Generator of type ");
        m24u.append(getClass().getName());
        m24u.append(" does not support schema of type '");
        m24u.append(formatSchema.getSchemaType());
        m24u.append("'");
        throw new UnsupportedOperationException(m24u.toString());
    }

    public abstract JsonGenerator useDefaultPrettyPrinter();

    @Override // com.fasterxml.jackson.core.Versioned
    public abstract Version version();

    public void writeArray(int[] iArr, int i2, int i3) throws IOException {
        if (iArr == null) {
            throw new IllegalArgumentException("null array");
        }
        _verifyOffsets(iArr.length, i2, i3);
        writeStartArray(iArr, i3);
        int i4 = i3 + i2;
        while (i2 < i4) {
            writeNumber(iArr[i2]);
            i2++;
        }
        writeEndArray();
    }

    public final void writeArrayFieldStart(String str) throws IOException {
        writeFieldName(str);
        writeStartArray();
    }

    public abstract int writeBinary(Base64Variant base64Variant, InputStream inputStream, int i2) throws IOException;

    public abstract void writeBinary(Base64Variant base64Variant, byte[] bArr, int i2, int i3) throws IOException;

    public void writeBinary(byte[] bArr, int i2, int i3) throws IOException {
        writeBinary(Base64Variants.getDefaultVariant(), bArr, i2, i3);
    }

    public final void writeBinaryField(String str, byte[] bArr) throws IOException {
        writeFieldName(str);
        writeBinary(bArr);
    }

    public abstract void writeBoolean(boolean z) throws IOException;

    public final void writeBooleanField(String str, boolean z) throws IOException {
        writeFieldName(str);
        writeBoolean(z);
    }

    public void writeEmbeddedObject(Object obj) throws IOException {
        if (obj == null) {
            writeNull();
        } else if (obj instanceof byte[]) {
            writeBinary((byte[]) obj);
        } else {
            StringBuilder m24u = C0000a.m24u("No native support for writing embedded objects of type ");
            m24u.append(obj.getClass().getName());
            throw new JsonGenerationException(m24u.toString(), this);
        }
    }

    public abstract void writeEndArray() throws IOException;

    public abstract void writeEndObject() throws IOException;

    public void writeFieldId(long j2) throws IOException {
        writeFieldName(Long.toString(j2));
    }

    public abstract void writeFieldName(SerializableString serializableString) throws IOException;

    public abstract void writeFieldName(String str) throws IOException;

    public abstract void writeNull() throws IOException;

    public final void writeNullField(String str) throws IOException {
        writeFieldName(str);
        writeNull();
    }

    public abstract void writeNumber(double d) throws IOException;

    public abstract void writeNumber(float f2) throws IOException;

    public abstract void writeNumber(int i2) throws IOException;

    public abstract void writeNumber(long j2) throws IOException;

    public abstract void writeNumber(String str) throws IOException;

    public abstract void writeNumber(BigDecimal bigDecimal) throws IOException;

    public abstract void writeNumber(BigInteger bigInteger) throws IOException;

    public void writeNumber(short s) throws IOException {
        writeNumber((int) s);
    }

    public final void writeNumberField(String str, int i2) throws IOException {
        writeFieldName(str);
        writeNumber(i2);
    }

    public abstract void writeObject(Object obj) throws IOException;

    public final void writeObjectField(String str, Object obj) throws IOException {
        writeFieldName(str);
        writeObject(obj);
    }

    public final void writeObjectFieldStart(String str) throws IOException {
        writeFieldName(str);
        writeStartObject();
    }

    public void writeObjectId(Object obj) throws IOException {
        throw new JsonGenerationException("No native support for writing Object Ids", this);
    }

    public void writeObjectRef(Object obj) throws IOException {
        throw new JsonGenerationException("No native support for writing Object Ids", this);
    }

    public void writeOmittedField(String str) throws IOException {
    }

    public abstract void writeRaw(char c2) throws IOException;

    public void writeRaw(SerializableString serializableString) throws IOException {
        writeRaw(serializableString.getValue());
    }

    public abstract void writeRaw(String str) throws IOException;

    public abstract void writeRaw(String str, int i2, int i3) throws IOException;

    public abstract void writeRaw(char[] cArr, int i2, int i3) throws IOException;

    public abstract void writeRawUTF8String(byte[] bArr, int i2, int i3) throws IOException;

    public void writeRawValue(SerializableString serializableString) throws IOException {
        writeRawValue(serializableString.getValue());
    }

    public abstract void writeRawValue(String str) throws IOException;

    public abstract void writeRawValue(String str, int i2, int i3) throws IOException;

    public abstract void writeRawValue(char[] cArr, int i2, int i3) throws IOException;

    public abstract void writeStartArray() throws IOException;

    public void writeStartArray(int i2) throws IOException {
        writeStartArray();
    }

    public abstract void writeStartObject() throws IOException;

    public void writeStartObject(Object obj) throws IOException {
        writeStartObject();
        setCurrentValue(obj);
    }

    public abstract void writeString(SerializableString serializableString) throws IOException;

    public void writeString(Reader reader, int i2) throws IOException {
        _reportUnsupportedOperation();
    }

    public abstract void writeString(String str) throws IOException;

    public abstract void writeString(char[] cArr, int i2, int i3) throws IOException;

    public void writeStringField(String str, String str2) throws IOException {
        writeFieldName(str);
        writeString(str2);
    }

    public abstract void writeTree(TreeNode treeNode) throws IOException;

    public void writeTypeId(Object obj) throws IOException {
        throw new JsonGenerationException("No native support for writing Type Ids", this);
    }

    public WritableTypeId writeTypePrefix(WritableTypeId writableTypeId) throws IOException {
        Object obj = writableTypeId.f8881id;
        JsonToken jsonToken = writableTypeId.valueShape;
        if (canWriteTypeId()) {
            writableTypeId.wrapperWritten = false;
            writeTypeId(obj);
        } else {
            String valueOf = obj instanceof String ? (String) obj : String.valueOf(obj);
            writableTypeId.wrapperWritten = true;
            WritableTypeId.Inclusion inclusion = writableTypeId.include;
            if (jsonToken != JsonToken.START_OBJECT && inclusion.requiresObjectContext()) {
                inclusion = WritableTypeId.Inclusion.WRAPPER_ARRAY;
                writableTypeId.include = inclusion;
            }
            int i2 = C08361.f8862xa51b40dc[inclusion.ordinal()];
            if (i2 != 1 && i2 != 2) {
                if (i2 == 3) {
                    writeStartObject(writableTypeId.forValue);
                    writeStringField(writableTypeId.asProperty, valueOf);
                    return writableTypeId;
                }
                if (i2 != 4) {
                    writeStartArray();
                    writeString(valueOf);
                } else {
                    writeStartObject();
                    writeFieldName(valueOf);
                }
            }
        }
        if (jsonToken == JsonToken.START_OBJECT) {
            writeStartObject(writableTypeId.forValue);
        } else if (jsonToken == JsonToken.START_ARRAY) {
            writeStartArray();
        }
        return writableTypeId;
    }

    public WritableTypeId writeTypeSuffix(WritableTypeId writableTypeId) throws IOException {
        JsonToken jsonToken = writableTypeId.valueShape;
        if (jsonToken == JsonToken.START_OBJECT) {
            writeEndObject();
        } else if (jsonToken == JsonToken.START_ARRAY) {
            writeEndArray();
        }
        if (writableTypeId.wrapperWritten) {
            int i2 = C08361.f8862xa51b40dc[writableTypeId.include.ordinal()];
            if (i2 == 1) {
                Object obj = writableTypeId.f8881id;
                writeStringField(writableTypeId.asProperty, obj instanceof String ? (String) obj : String.valueOf(obj));
            } else if (i2 != 2 && i2 != 3) {
                if (i2 != 5) {
                    writeEndObject();
                } else {
                    writeEndArray();
                }
            }
        }
        return writableTypeId;
    }

    public abstract void writeUTF8String(byte[] bArr, int i2, int i3) throws IOException;

    public void writeBinary(byte[] bArr) throws IOException {
        writeBinary(Base64Variants.getDefaultVariant(), bArr, 0, bArr.length);
    }

    public void writeStartArray(Object obj) throws IOException {
        writeStartArray();
        setCurrentValue(obj);
    }

    public int writeBinary(InputStream inputStream, int i2) throws IOException {
        return writeBinary(Base64Variants.getDefaultVariant(), inputStream, i2);
    }

    public final void writeNumberField(String str, long j2) throws IOException {
        writeFieldName(str);
        writeNumber(j2);
    }

    public void writeStartObject(Object obj, int i2) throws IOException {
        writeStartObject();
        setCurrentValue(obj);
    }

    public void writeStartArray(Object obj, int i2) throws IOException {
        writeStartArray(i2);
        setCurrentValue(obj);
    }

    public final void writeNumberField(String str, double d) throws IOException {
        writeFieldName(str);
        writeNumber(d);
    }

    public void writeArray(long[] jArr, int i2, int i3) throws IOException {
        if (jArr != null) {
            _verifyOffsets(jArr.length, i2, i3);
            writeStartArray(jArr, i3);
            int i4 = i3 + i2;
            while (i2 < i4) {
                writeNumber(jArr[i2]);
                i2++;
            }
            writeEndArray();
            return;
        }
        throw new IllegalArgumentException("null array");
    }

    public final void writeNumberField(String str, float f2) throws IOException {
        writeFieldName(str);
        writeNumber(f2);
    }

    public final void writeNumberField(String str, BigDecimal bigDecimal) throws IOException {
        writeFieldName(str);
        writeNumber(bigDecimal);
    }

    public void writeArray(double[] dArr, int i2, int i3) throws IOException {
        if (dArr != null) {
            _verifyOffsets(dArr.length, i2, i3);
            writeStartArray(dArr, i3);
            int i4 = i3 + i2;
            while (i2 < i4) {
                writeNumber(dArr[i2]);
                i2++;
            }
            writeEndArray();
            return;
        }
        throw new IllegalArgumentException("null array");
    }
}
