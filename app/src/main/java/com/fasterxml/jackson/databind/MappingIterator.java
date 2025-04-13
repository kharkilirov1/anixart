package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.FormatSchema;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public class MappingIterator<T> implements Iterator<T>, Closeable {
    public static final MappingIterator<?> EMPTY_ITERATOR = new MappingIterator<>(null, null, null, null, false, null);
    public static final int STATE_CLOSED = 0;
    public static final int STATE_HAS_VALUE = 3;
    public static final int STATE_MAY_HAVE_VALUE = 2;
    public static final int STATE_NEED_RESYNC = 1;
    public final boolean _closeParser;
    public final DeserializationContext _context;
    public final JsonDeserializer<T> _deserializer;
    public final JsonParser _parser;
    public final JsonStreamContext _seqContext;
    public int _state;
    public final JavaType _type;
    public final T _updatedValue;

    /* JADX WARN: Multi-variable type inference failed */
    public MappingIterator(JavaType javaType, JsonParser jsonParser, DeserializationContext deserializationContext, JsonDeserializer<?> jsonDeserializer, boolean z, Object obj) {
        this._type = javaType;
        this._parser = jsonParser;
        this._context = deserializationContext;
        this._deserializer = jsonDeserializer;
        this._closeParser = z;
        if (obj == 0) {
            this._updatedValue = null;
        } else {
            this._updatedValue = obj;
        }
        if (jsonParser == null) {
            this._seqContext = null;
            this._state = 0;
            return;
        }
        JsonStreamContext parsingContext = jsonParser.getParsingContext();
        if (z && jsonParser.isExpectedStartArrayToken()) {
            jsonParser.clearCurrentToken();
        } else {
            JsonToken currentToken = jsonParser.currentToken();
            if (currentToken == JsonToken.START_OBJECT || currentToken == JsonToken.START_ARRAY) {
                parsingContext = parsingContext.getParent();
            }
        }
        this._seqContext = parsingContext;
        this._state = 2;
    }

    public static <T> MappingIterator<T> emptyIterator() {
        return (MappingIterator<T>) EMPTY_ITERATOR;
    }

    public <R> R _handleIOException(IOException iOException) {
        throw new RuntimeException(iOException.getMessage(), iOException);
    }

    public <R> R _handleMappingException(JsonMappingException jsonMappingException) {
        throw new RuntimeJsonMappingException(jsonMappingException.getMessage(), jsonMappingException);
    }

    public void _resync() throws IOException {
        JsonParser jsonParser = this._parser;
        if (jsonParser.getParsingContext() == this._seqContext) {
            return;
        }
        while (true) {
            JsonToken nextToken = jsonParser.nextToken();
            if (nextToken == JsonToken.END_ARRAY || nextToken == JsonToken.END_OBJECT) {
                if (jsonParser.getParsingContext() == this._seqContext) {
                    jsonParser.clearCurrentToken();
                    return;
                }
            } else if (nextToken == JsonToken.START_ARRAY || nextToken == JsonToken.START_OBJECT) {
                jsonParser.skipChildren();
            } else if (nextToken == null) {
                return;
            }
        }
    }

    public <R> R _throwNoSuchElement() {
        throw new NoSuchElementException();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this._state != 0) {
            this._state = 0;
            JsonParser jsonParser = this._parser;
            if (jsonParser != null) {
                jsonParser.close();
            }
        }
    }

    public JsonLocation getCurrentLocation() {
        return this._parser.getCurrentLocation();
    }

    public JsonParser getParser() {
        return this._parser;
    }

    public FormatSchema getParserSchema() {
        return this._parser.getSchema();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        try {
            return hasNextValue();
        } catch (JsonMappingException e2) {
            return ((Boolean) _handleMappingException(e2)).booleanValue();
        } catch (IOException e3) {
            return ((Boolean) _handleIOException(e3)).booleanValue();
        }
    }

    public boolean hasNextValue() throws IOException {
        JsonToken nextToken;
        JsonParser jsonParser;
        int i2 = this._state;
        if (i2 == 0) {
            return false;
        }
        if (i2 == 1) {
            _resync();
        } else if (i2 != 2) {
            return true;
        }
        if (this._parser.currentToken() != null || ((nextToken = this._parser.nextToken()) != null && nextToken != JsonToken.END_ARRAY)) {
            this._state = 3;
            return true;
        }
        this._state = 0;
        if (this._closeParser && (jsonParser = this._parser) != null) {
            jsonParser.close();
        }
        return false;
    }

    @Override // java.util.Iterator
    public T next() {
        try {
            return nextValue();
        } catch (JsonMappingException e2) {
            return (T) _handleMappingException(e2);
        } catch (IOException e3) {
            return (T) _handleIOException(e3);
        }
    }

    public T nextValue() throws IOException {
        T t;
        int i2 = this._state;
        if (i2 == 0) {
            return (T) _throwNoSuchElement();
        }
        if ((i2 == 1 || i2 == 2) && !hasNextValue()) {
            return (T) _throwNoSuchElement();
        }
        try {
            T t2 = this._updatedValue;
            if (t2 == null) {
                t = this._deserializer.deserialize(this._parser, this._context);
            } else {
                this._deserializer.deserialize(this._parser, this._context, t2);
                t = this._updatedValue;
            }
            this._state = 2;
            this._parser.clearCurrentToken();
            return t;
        } catch (Throwable th) {
            this._state = 1;
            this._parser.clearCurrentToken();
            throw th;
        }
    }

    public List<T> readAll() throws IOException {
        return readAll((MappingIterator<T>) new ArrayList());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    public <L extends List<? super T>> L readAll(L l2) throws IOException {
        while (hasNextValue()) {
            l2.add(nextValue());
        }
        return l2;
    }

    public <C extends Collection<? super T>> C readAll(C c2) throws IOException {
        while (hasNextValue()) {
            c2.add(nextValue());
        }
        return c2;
    }
}
