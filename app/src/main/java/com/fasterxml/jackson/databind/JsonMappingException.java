package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import okhttp3.HttpUrl;
import p000a.C0000a;

/* loaded from: classes.dex */
public class JsonMappingException extends JsonProcessingException {
    public static final int MAX_REFS_TO_LIST = 1000;
    private static final long serialVersionUID = 1;
    public LinkedList<Reference> _path;
    public transient Closeable _processor;

    @Deprecated
    public JsonMappingException(String str) {
        super(str);
    }

    public static JsonMappingException from(JsonParser jsonParser, String str) {
        return new JsonMappingException(jsonParser, str);
    }

    public static JsonMappingException fromUnexpectedIOE(IOException iOException) {
        return new JsonMappingException((Closeable) null, String.format("Unexpected IOException (of type %s): %s", iOException.getClass().getName(), ClassUtil.exceptionMessage(iOException)));
    }

    public static JsonMappingException wrapWithPath(Throwable th, Object obj, String str) {
        return wrapWithPath(th, new Reference(obj, str));
    }

    public void _appendPathDesc(StringBuilder sb) {
        LinkedList<Reference> linkedList = this._path;
        if (linkedList == null) {
            return;
        }
        Iterator<Reference> it = linkedList.iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append("->");
            }
        }
    }

    public String _buildMessage() {
        String message = super.getMessage();
        if (this._path == null) {
            return message;
        }
        StringBuilder sb = message == null ? new StringBuilder() : new StringBuilder(message);
        sb.append(" (through reference chain: ");
        StringBuilder pathReference = getPathReference(sb);
        pathReference.append(')');
        return pathReference.toString();
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return _buildMessage();
    }

    @Override // com.fasterxml.jackson.core.JsonProcessingException, java.lang.Throwable
    public String getMessage() {
        return _buildMessage();
    }

    public List<Reference> getPath() {
        LinkedList<Reference> linkedList = this._path;
        return linkedList == null ? Collections.emptyList() : Collections.unmodifiableList(linkedList);
    }

    public String getPathReference() {
        return getPathReference(new StringBuilder()).toString();
    }

    @Override // com.fasterxml.jackson.core.JsonProcessingException
    @JsonIgnore
    public Object getProcessor() {
        return this._processor;
    }

    public void prependPath(Object obj, String str) {
        prependPath(new Reference(obj, str));
    }

    @Override // com.fasterxml.jackson.core.JsonProcessingException, java.lang.Throwable
    public String toString() {
        return getClass().getName() + ": " + getMessage();
    }

    public static class Reference implements Serializable {
        private static final long serialVersionUID = 2;
        public String _desc;
        public String _fieldName;
        public transient Object _from;
        public int _index;

        public Reference() {
            this._index = -1;
        }

        public String getDescription() {
            if (this._desc == null) {
                StringBuilder sb = new StringBuilder();
                Object obj = this._from;
                if (obj != null) {
                    Class<?> cls = obj instanceof Class ? (Class) obj : obj.getClass();
                    int i2 = 0;
                    while (cls.isArray()) {
                        cls = cls.getComponentType();
                        i2++;
                    }
                    sb.append(cls.getName());
                    while (true) {
                        i2--;
                        if (i2 < 0) {
                            break;
                        }
                        sb.append(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
                    }
                } else {
                    sb.append("UNKNOWN");
                }
                sb.append('[');
                if (this._fieldName != null) {
                    sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
                    sb.append(this._fieldName);
                    sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
                } else {
                    int i3 = this._index;
                    if (i3 >= 0) {
                        sb.append(i3);
                    } else {
                        sb.append('?');
                    }
                }
                sb.append(']');
                this._desc = sb.toString();
            }
            return this._desc;
        }

        public String getFieldName() {
            return this._fieldName;
        }

        @JsonIgnore
        public Object getFrom() {
            return this._from;
        }

        public int getIndex() {
            return this._index;
        }

        public void setDescription(String str) {
            this._desc = str;
        }

        public void setFieldName(String str) {
            this._fieldName = str;
        }

        public void setIndex(int i2) {
            this._index = i2;
        }

        public String toString() {
            return getDescription();
        }

        public Object writeReplace() {
            getDescription();
            return this;
        }

        public Reference(Object obj) {
            this._index = -1;
            this._from = obj;
        }

        public Reference(Object obj, String str) {
            this._index = -1;
            this._from = obj;
            Objects.requireNonNull(str, "Cannot pass null fieldName");
            this._fieldName = str;
        }

        public Reference(Object obj, int i2) {
            this._index = -1;
            this._from = obj;
            this._index = i2;
        }
    }

    @Deprecated
    public JsonMappingException(String str, Throwable th) {
        super(str, th);
    }

    public static JsonMappingException from(JsonParser jsonParser, String str, Throwable th) {
        return new JsonMappingException(jsonParser, str, th);
    }

    public static JsonMappingException wrapWithPath(Throwable th, Object obj, int i2) {
        return wrapWithPath(th, new Reference(obj, i2));
    }

    public StringBuilder getPathReference(StringBuilder sb) {
        _appendPathDesc(sb);
        return sb;
    }

    @Deprecated
    public JsonMappingException(String str, JsonLocation jsonLocation) {
        super(str, jsonLocation);
    }

    public static JsonMappingException from(JsonGenerator jsonGenerator, String str) {
        return new JsonMappingException(jsonGenerator, str, (Throwable) null);
    }

    public static JsonMappingException wrapWithPath(Throwable th, Reference reference) {
        JsonMappingException jsonMappingException;
        if (th instanceof JsonMappingException) {
            jsonMappingException = (JsonMappingException) th;
        } else {
            String exceptionMessage = ClassUtil.exceptionMessage(th);
            if (exceptionMessage == null || exceptionMessage.length() == 0) {
                StringBuilder m24u = C0000a.m24u("(was ");
                m24u.append(th.getClass().getName());
                m24u.append(")");
                exceptionMessage = m24u.toString();
            }
            Closeable closeable = null;
            if (th instanceof JsonProcessingException) {
                Object processor = ((JsonProcessingException) th).getProcessor();
                if (processor instanceof Closeable) {
                    closeable = (Closeable) processor;
                }
            }
            jsonMappingException = new JsonMappingException(closeable, exceptionMessage, th);
        }
        jsonMappingException.prependPath(reference);
        return jsonMappingException;
    }

    public void prependPath(Object obj, int i2) {
        prependPath(new Reference(obj, i2));
    }

    @Deprecated
    public JsonMappingException(String str, JsonLocation jsonLocation, Throwable th) {
        super(str, jsonLocation, th);
    }

    public static JsonMappingException from(JsonGenerator jsonGenerator, String str, Throwable th) {
        return new JsonMappingException(jsonGenerator, str, th);
    }

    public JsonMappingException(Closeable closeable, String str) {
        super(str);
        this._processor = closeable;
        if (closeable instanceof JsonParser) {
            this._location = ((JsonParser) closeable).getTokenLocation();
        }
    }

    public static JsonMappingException from(DeserializationContext deserializationContext, String str) {
        return new JsonMappingException(deserializationContext.getParser(), str);
    }

    public void prependPath(Reference reference) {
        if (this._path == null) {
            this._path = new LinkedList<>();
        }
        if (this._path.size() < 1000) {
            this._path.addFirst(reference);
        }
    }

    public static JsonMappingException from(DeserializationContext deserializationContext, String str, Throwable th) {
        return new JsonMappingException(deserializationContext.getParser(), str, th);
    }

    public static JsonMappingException from(SerializerProvider serializerProvider, String str) {
        return new JsonMappingException(serializerProvider.getGenerator(), str);
    }

    public static JsonMappingException from(SerializerProvider serializerProvider, String str, Throwable th) {
        return new JsonMappingException(serializerProvider.getGenerator(), str, th);
    }

    public JsonMappingException(Closeable closeable, String str, Throwable th) {
        super(str, th);
        this._processor = closeable;
        if (closeable instanceof JsonParser) {
            this._location = ((JsonParser) closeable).getTokenLocation();
        }
    }

    public JsonMappingException(Closeable closeable, String str, JsonLocation jsonLocation) {
        super(str, jsonLocation);
        this._processor = closeable;
    }
}
