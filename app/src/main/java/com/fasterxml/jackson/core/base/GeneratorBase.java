package com.fasterxml.jackson.core.base;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.json.DupDetector;
import com.fasterxml.jackson.core.json.JsonWriteContext;
import com.fasterxml.jackson.core.json.PackageVersion;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.core.util.TextBuffer;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import p000a.C0000a;

/* loaded from: classes.dex */
public abstract class GeneratorBase extends JsonGenerator {
    public static final int DERIVED_FEATURES_MASK = (JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.getMask() | JsonGenerator.Feature.ESCAPE_NON_ASCII.getMask()) | JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION.getMask();
    public static final int MAX_BIG_DECIMAL_SCALE = 9999;
    public static final int SURR1_FIRST = 55296;
    public static final int SURR1_LAST = 56319;
    public static final int SURR2_FIRST = 56320;
    public static final int SURR2_LAST = 57343;
    public static final String WRITE_BINARY = "write a binary value";
    public static final String WRITE_BOOLEAN = "write a boolean value";
    public static final String WRITE_NULL = "write a null";
    public static final String WRITE_NUMBER = "write a number";
    public static final String WRITE_RAW = "write a raw (unencoded) value";
    public static final String WRITE_STRING = "write a string";
    public boolean _cfgNumbersAsStrings;
    public boolean _closed;
    public int _features;
    public ObjectCodec _objectCodec;
    public JsonWriteContext _writeContext;

    public GeneratorBase(int i2, ObjectCodec objectCodec) {
        this._features = i2;
        this._objectCodec = objectCodec;
        this._writeContext = JsonWriteContext.createRootContext(JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION.enabledIn(i2) ? DupDetector.rootDetector(this) : null);
        this._cfgNumbersAsStrings = JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.enabledIn(i2);
    }

    public String _asString(BigDecimal bigDecimal) throws IOException {
        if (!JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN.enabledIn(this._features)) {
            return bigDecimal.toString();
        }
        int scale = bigDecimal.scale();
        if (scale < -9999 || scale > 9999) {
            _reportError(String.format("Attempt to write plain `java.math.BigDecimal` (see JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN) with illegal scale (%d): needs to be between [-%d, %d]", Integer.valueOf(scale), 9999, 9999));
        }
        return bigDecimal.toPlainString();
    }

    public void _checkStdFeatureChanges(int i2, int i3) {
        if ((DERIVED_FEATURES_MASK & i3) == 0) {
            return;
        }
        this._cfgNumbersAsStrings = JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.enabledIn(i2);
        JsonGenerator.Feature feature = JsonGenerator.Feature.ESCAPE_NON_ASCII;
        if (feature.enabledIn(i3)) {
            if (feature.enabledIn(i2)) {
                setHighestNonEscapedChar(127);
            } else {
                setHighestNonEscapedChar(0);
            }
        }
        JsonGenerator.Feature feature2 = JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
        if (feature2.enabledIn(i3)) {
            if (!feature2.enabledIn(i2)) {
                this._writeContext = this._writeContext.withDupDetector(null);
            } else if (this._writeContext.getDupDetector() == null) {
                this._writeContext = this._writeContext.withDupDetector(DupDetector.rootDetector(this));
            }
        }
    }

    public PrettyPrinter _constructDefaultPrettyPrinter() {
        return new DefaultPrettyPrinter();
    }

    public final int _decodeSurrogate(int i2, int i3) throws IOException {
        if (i3 < 56320 || i3 > 57343) {
            StringBuilder m24u = C0000a.m24u("Incomplete surrogate pair: first char 0x");
            m24u.append(Integer.toHexString(i2));
            m24u.append(", second 0x");
            m24u.append(Integer.toHexString(i3));
            _reportError(m24u.toString());
        }
        return (i3 - 56320) + ((i2 - 55296) << 10) + TextBuffer.MAX_SEGMENT_LEN;
    }

    public abstract void _releaseBuffers();

    public abstract void _verifyValueWrite(String str) throws IOException;

    @Override // com.fasterxml.jackson.core.JsonGenerator, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this._closed = true;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator disable(JsonGenerator.Feature feature) {
        int mask = feature.getMask();
        this._features &= ~mask;
        if ((mask & DERIVED_FEATURES_MASK) != 0) {
            if (feature == JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS) {
                this._cfgNumbersAsStrings = false;
            } else if (feature == JsonGenerator.Feature.ESCAPE_NON_ASCII) {
                setHighestNonEscapedChar(0);
            } else if (feature == JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION) {
                this._writeContext = this._writeContext.withDupDetector(null);
            }
        }
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator enable(JsonGenerator.Feature feature) {
        int mask = feature.getMask();
        this._features |= mask;
        if ((mask & DERIVED_FEATURES_MASK) != 0) {
            if (feature == JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS) {
                this._cfgNumbersAsStrings = true;
            } else if (feature == JsonGenerator.Feature.ESCAPE_NON_ASCII) {
                setHighestNonEscapedChar(127);
            } else if (feature == JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION && this._writeContext.getDupDetector() == null) {
                this._writeContext = this._writeContext.withDupDetector(DupDetector.rootDetector(this));
            }
        }
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator, java.io.Flushable
    public abstract void flush() throws IOException;

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public ObjectCodec getCodec() {
        return this._objectCodec;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public Object getCurrentValue() {
        return this._writeContext.getCurrentValue();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public int getFeatureMask() {
        return this._features;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonStreamContext getOutputContext() {
        return this._writeContext;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public boolean isClosed() {
        return this._closed;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final boolean isEnabled(JsonGenerator.Feature feature) {
        return (feature.getMask() & this._features) != 0;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator overrideStdFeatures(int i2, int i3) {
        int i4 = this._features;
        int i5 = (i2 & i3) | ((~i3) & i4);
        int i6 = i4 ^ i5;
        if (i6 != 0) {
            this._features = i5;
            _checkStdFeatureChanges(i5, i6);
        }
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator setCodec(ObjectCodec objectCodec) {
        this._objectCodec = objectCodec;
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void setCurrentValue(Object obj) {
        JsonWriteContext jsonWriteContext = this._writeContext;
        if (jsonWriteContext != null) {
            jsonWriteContext.setCurrentValue(obj);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    @Deprecated
    public JsonGenerator setFeatureMask(int i2) {
        int i3 = this._features ^ i2;
        this._features = i2;
        if (i3 != 0) {
            _checkStdFeatureChanges(i2, i3);
        }
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator useDefaultPrettyPrinter() {
        return getPrettyPrinter() != null ? this : setPrettyPrinter(_constructDefaultPrettyPrinter());
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator, com.fasterxml.jackson.core.Versioned
    public Version version() {
        return PackageVersion.VERSION;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public int writeBinary(Base64Variant base64Variant, InputStream inputStream, int i2) throws IOException {
        _reportUnsupportedOperation();
        return 0;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeFieldName(SerializableString serializableString) throws IOException {
        writeFieldName(serializableString.getValue());
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeObject(Object obj) throws IOException {
        if (obj == null) {
            writeNull();
            return;
        }
        ObjectCodec objectCodec = this._objectCodec;
        if (objectCodec != null) {
            objectCodec.writeValue(this, obj);
        } else {
            _writeSimpleObject(obj);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRawValue(String str) throws IOException {
        _verifyValueWrite("write raw value");
        writeRaw(str);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeStartObject(Object obj) throws IOException {
        writeStartObject();
        if (obj != null) {
            setCurrentValue(obj);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeString(SerializableString serializableString) throws IOException {
        writeString(serializableString.getValue());
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeTree(TreeNode treeNode) throws IOException {
        if (treeNode == null) {
            writeNull();
            return;
        }
        ObjectCodec objectCodec = this._objectCodec;
        if (objectCodec == null) {
            throw new IllegalStateException("No ObjectCodec defined");
        }
        objectCodec.writeValue(this, treeNode);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRawValue(String str, int i2, int i3) throws IOException {
        _verifyValueWrite("write raw value");
        writeRaw(str, i2, i3);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRawValue(char[] cArr, int i2, int i3) throws IOException {
        _verifyValueWrite("write raw value");
        writeRaw(cArr, i2, i3);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRawValue(SerializableString serializableString) throws IOException {
        _verifyValueWrite("write raw value");
        writeRaw(serializableString);
    }

    public GeneratorBase(int i2, ObjectCodec objectCodec, JsonWriteContext jsonWriteContext) {
        this._features = i2;
        this._objectCodec = objectCodec;
        this._writeContext = jsonWriteContext;
        this._cfgNumbersAsStrings = JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.enabledIn(i2);
    }
}
