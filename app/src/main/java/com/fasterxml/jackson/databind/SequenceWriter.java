package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.Versioned;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.cfg.PackageVersion;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public class SequenceWriter implements Versioned, Closeable, Flushable {
    public final boolean _cfgCloseCloseable;
    public final boolean _cfgFlush;
    public final boolean _closeGenerator;
    public boolean _closed;
    public final SerializationConfig _config;
    public PropertySerializerMap _dynamicSerializers;
    public final JsonGenerator _generator;
    public boolean _openArray;
    public final DefaultSerializerProvider _provider;
    public final JsonSerializer<Object> _rootSerializer;
    public final TypeSerializer _typeSerializer;

    public SequenceWriter(DefaultSerializerProvider defaultSerializerProvider, JsonGenerator jsonGenerator, boolean z, ObjectWriter.Prefetch prefetch) throws IOException {
        this._provider = defaultSerializerProvider;
        this._generator = jsonGenerator;
        this._closeGenerator = z;
        this._rootSerializer = prefetch.getValueSerializer();
        this._typeSerializer = prefetch.getTypeSerializer();
        SerializationConfig config = defaultSerializerProvider.getConfig();
        this._config = config;
        this._cfgFlush = config.isEnabled(SerializationFeature.FLUSH_AFTER_WRITE_VALUE);
        this._cfgCloseCloseable = config.isEnabled(SerializationFeature.CLOSE_CLOSEABLE);
        this._dynamicSerializers = PropertySerializerMap.emptyForRootValues();
    }

    private final JsonSerializer<Object> _findAndAddDynamic(Class<?> cls) throws JsonMappingException {
        TypeSerializer typeSerializer = this._typeSerializer;
        PropertySerializerMap.SerializerAndMapResult findAndAddRootValueSerializer = typeSerializer == null ? this._dynamicSerializers.findAndAddRootValueSerializer(cls, this._provider) : this._dynamicSerializers.addSerializer(cls, new TypeWrappedSerializer(typeSerializer, this._provider.findValueSerializer(cls, (BeanProperty) null)));
        this._dynamicSerializers = findAndAddRootValueSerializer.map;
        return findAndAddRootValueSerializer.serializer;
    }

    public SequenceWriter _writeCloseableValue(Object obj) throws IOException {
        Closeable closeable = (Closeable) obj;
        try {
            JsonSerializer<Object> jsonSerializer = this._rootSerializer;
            if (jsonSerializer == null) {
                Class<?> cls = obj.getClass();
                JsonSerializer<Object> serializerFor = this._dynamicSerializers.serializerFor(cls);
                jsonSerializer = serializerFor == null ? _findAndAddDynamic(cls) : serializerFor;
            }
            this._provider.serializeValue(this._generator, obj, null, jsonSerializer);
            if (this._cfgFlush) {
                this._generator.flush();
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            closeable.close();
            return this;
        } catch (Throwable th2) {
            th = th2;
            closeable = null;
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException unused) {
                }
            }
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this._closed) {
            return;
        }
        this._closed = true;
        if (this._openArray) {
            this._openArray = false;
            this._generator.writeEndArray();
        }
        if (this._closeGenerator) {
            this._generator.close();
        }
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this._closed) {
            return;
        }
        this._generator.flush();
    }

    public SequenceWriter init(boolean z) throws IOException {
        if (z) {
            this._generator.writeStartArray();
            this._openArray = true;
        }
        return this;
    }

    @Override // com.fasterxml.jackson.core.Versioned
    public Version version() {
        return PackageVersion.VERSION;
    }

    public SequenceWriter write(Object obj) throws IOException {
        if (obj == null) {
            this._provider.serializeValue(this._generator, null);
            return this;
        }
        if (this._cfgCloseCloseable && (obj instanceof Closeable)) {
            return _writeCloseableValue(obj);
        }
        JsonSerializer<Object> jsonSerializer = this._rootSerializer;
        if (jsonSerializer == null) {
            Class<?> cls = obj.getClass();
            JsonSerializer<Object> serializerFor = this._dynamicSerializers.serializerFor(cls);
            jsonSerializer = serializerFor == null ? _findAndAddDynamic(cls) : serializerFor;
        }
        this._provider.serializeValue(this._generator, obj, null, jsonSerializer);
        if (this._cfgFlush) {
            this._generator.flush();
        }
        return this;
    }

    public SequenceWriter writeAll(Object[] objArr) throws IOException {
        for (Object obj : objArr) {
            write(obj);
        }
        return this;
    }

    public <C extends Collection<?>> SequenceWriter writeAll(C c2) throws IOException {
        Iterator it = c2.iterator();
        while (it.hasNext()) {
            write(it.next());
        }
        return this;
    }

    public SequenceWriter writeAll(Iterable<?> iterable) throws IOException {
        Iterator<?> it = iterable.iterator();
        while (it.hasNext()) {
            write(it.next());
        }
        return this;
    }

    private final JsonSerializer<Object> _findAndAddDynamic(JavaType javaType) throws JsonMappingException {
        PropertySerializerMap.SerializerAndMapResult addSerializer;
        TypeSerializer typeSerializer = this._typeSerializer;
        if (typeSerializer == null) {
            addSerializer = this._dynamicSerializers.findAndAddRootValueSerializer(javaType, this._provider);
        } else {
            addSerializer = this._dynamicSerializers.addSerializer(javaType, new TypeWrappedSerializer(typeSerializer, this._provider.findValueSerializer(javaType, (BeanProperty) null)));
        }
        this._dynamicSerializers = addSerializer.map;
        return addSerializer.serializer;
    }

    public SequenceWriter write(Object obj, JavaType javaType) throws IOException {
        if (obj == null) {
            this._provider.serializeValue(this._generator, null);
            return this;
        }
        if (this._cfgCloseCloseable && (obj instanceof Closeable)) {
            return _writeCloseableValue(obj, javaType);
        }
        JsonSerializer<Object> serializerFor = this._dynamicSerializers.serializerFor(javaType.getRawClass());
        if (serializerFor == null) {
            serializerFor = _findAndAddDynamic(javaType);
        }
        this._provider.serializeValue(this._generator, obj, javaType, serializerFor);
        if (this._cfgFlush) {
            this._generator.flush();
        }
        return this;
    }

    public SequenceWriter _writeCloseableValue(Object obj, JavaType javaType) throws IOException {
        Closeable closeable = (Closeable) obj;
        try {
            JsonSerializer<Object> serializerFor = this._dynamicSerializers.serializerFor(javaType.getRawClass());
            if (serializerFor == null) {
                serializerFor = _findAndAddDynamic(javaType);
            }
            this._provider.serializeValue(this._generator, obj, javaType, serializerFor);
            if (this._cfgFlush) {
                this._generator.flush();
            }
            try {
                closeable.close();
                return this;
            } catch (Throwable th) {
                closeable = null;
                th = th;
                if (closeable != null) {
                    try {
                        closeable.close();
                    } catch (IOException unused) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
