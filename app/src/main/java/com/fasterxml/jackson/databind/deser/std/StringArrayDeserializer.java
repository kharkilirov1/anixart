package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.AccessPattern;
import com.fasterxml.jackson.databind.util.ObjectBuffer;
import java.io.IOException;

@JacksonStdImpl
/* loaded from: classes.dex */
public final class StringArrayDeserializer extends StdDeserializer<String[]> implements ContextualDeserializer {
    private static final String[] NO_STRINGS = new String[0];
    public static final StringArrayDeserializer instance = new StringArrayDeserializer();
    private static final long serialVersionUID = 2;
    public JsonDeserializer<String> _elementDeserializer;
    public final NullValueProvider _nullProvider;
    public final boolean _skipNullValues;
    public final Boolean _unwrapSingle;

    public StringArrayDeserializer() {
        this(null, null, null);
    }

    private final String[] handleNonArray(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Boolean bool = this._unwrapSingle;
        if (bool == Boolean.TRUE || (bool == null && deserializationContext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            return new String[]{jsonParser.hasToken(JsonToken.VALUE_NULL) ? (String) this._nullProvider.getNullValue(deserializationContext) : _parseString(jsonParser, deserializationContext)};
        }
        if (jsonParser.hasToken(JsonToken.VALUE_STRING) && deserializationContext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && jsonParser.getText().length() == 0) {
            return null;
        }
        return (String[]) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
    }

    public final String[] _deserializeCustom(JsonParser jsonParser, DeserializationContext deserializationContext, String[] strArr) throws IOException {
        int length;
        Object[] resetAndStart;
        String deserialize;
        int i2;
        ObjectBuffer leaseObjectBuffer = deserializationContext.leaseObjectBuffer();
        if (strArr == null) {
            resetAndStart = leaseObjectBuffer.resetAndStart();
            length = 0;
        } else {
            length = strArr.length;
            resetAndStart = leaseObjectBuffer.resetAndStart(strArr, length);
        }
        JsonDeserializer<String> jsonDeserializer = this._elementDeserializer;
        while (true) {
            try {
            } catch (Exception e2) {
                e = e2;
            }
            try {
                if (jsonParser.nextTextValue() == null) {
                    JsonToken currentToken = jsonParser.getCurrentToken();
                    if (currentToken == JsonToken.END_ARRAY) {
                        String[] strArr2 = (String[]) leaseObjectBuffer.completeAndClearBuffer(resetAndStart, length, String.class);
                        deserializationContext.returnObjectBuffer(leaseObjectBuffer);
                        return strArr2;
                    }
                    if (currentToken != JsonToken.VALUE_NULL) {
                        deserialize = jsonDeserializer.deserialize(jsonParser, deserializationContext);
                    } else if (!this._skipNullValues) {
                        deserialize = (String) this._nullProvider.getNullValue(deserializationContext);
                    }
                } else {
                    deserialize = jsonDeserializer.deserialize(jsonParser, deserializationContext);
                }
                resetAndStart[length] = deserialize;
                length = i2;
            } catch (Exception e3) {
                e = e3;
                length = i2;
                throw JsonMappingException.wrapWithPath(e, String.class, length);
            }
            if (length >= resetAndStart.length) {
                resetAndStart = leaseObjectBuffer.appendCompletedChunk(resetAndStart);
                length = 0;
            }
            i2 = length + 1;
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
    public JsonDeserializer<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        JsonDeserializer<?> findConvertingContentDeserializer = findConvertingContentDeserializer(deserializationContext, beanProperty, this._elementDeserializer);
        JavaType constructType = deserializationContext.constructType(String.class);
        JsonDeserializer<?> findContextualValueDeserializer = findConvertingContentDeserializer == null ? deserializationContext.findContextualValueDeserializer(constructType, beanProperty) : deserializationContext.handleSecondaryContextualization(findConvertingContentDeserializer, beanProperty, constructType);
        Boolean findFormatFeature = findFormatFeature(deserializationContext, beanProperty, String[].class, JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        NullValueProvider findContentNullProvider = findContentNullProvider(deserializationContext, beanProperty, findContextualValueDeserializer);
        if (findContextualValueDeserializer != null && isDefaultDeserializer(findContextualValueDeserializer)) {
            findContextualValueDeserializer = null;
        }
        return (this._elementDeserializer == findContextualValueDeserializer && this._unwrapSingle == findFormatFeature && this._nullProvider == findContentNullProvider) ? this : new StringArrayDeserializer(findContextualValueDeserializer, findContentNullProvider, findFormatFeature);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
        return typeDeserializer.deserializeTypedFromArray(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public AccessPattern getEmptyAccessPattern() {
        return AccessPattern.CONSTANT;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return NO_STRINGS;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return Boolean.TRUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StringArrayDeserializer(JsonDeserializer<?> jsonDeserializer, NullValueProvider nullValueProvider, Boolean bool) {
        super((Class<?>) String[].class);
        this._elementDeserializer = jsonDeserializer;
        this._nullProvider = nullValueProvider;
        this._unwrapSingle = bool;
        this._skipNullValues = NullsConstantProvider.isSkipper(nullValueProvider);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public String[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String nextTextValue;
        int i2;
        if (!jsonParser.isExpectedStartArrayToken()) {
            return handleNonArray(jsonParser, deserializationContext);
        }
        if (this._elementDeserializer != null) {
            return _deserializeCustom(jsonParser, deserializationContext, null);
        }
        ObjectBuffer leaseObjectBuffer = deserializationContext.leaseObjectBuffer();
        Object[] resetAndStart = leaseObjectBuffer.resetAndStart();
        int i3 = 0;
        while (true) {
            try {
                nextTextValue = jsonParser.nextTextValue();
            } catch (Exception e2) {
                e = e2;
            }
            try {
                if (nextTextValue == null) {
                    JsonToken currentToken = jsonParser.getCurrentToken();
                    if (currentToken == JsonToken.END_ARRAY) {
                        String[] strArr = (String[]) leaseObjectBuffer.completeAndClearBuffer(resetAndStart, i3, String.class);
                        deserializationContext.returnObjectBuffer(leaseObjectBuffer);
                        return strArr;
                    }
                    if (currentToken == JsonToken.VALUE_NULL) {
                        if (!this._skipNullValues) {
                            nextTextValue = (String) this._nullProvider.getNullValue(deserializationContext);
                        }
                    } else {
                        nextTextValue = _parseString(jsonParser, deserializationContext);
                    }
                }
                resetAndStart[i3] = nextTextValue;
                i3 = i2;
            } catch (Exception e3) {
                e = e3;
                i3 = i2;
                throw JsonMappingException.wrapWithPath(e, resetAndStart, leaseObjectBuffer.bufferedSize() + i3);
            }
            if (i3 >= resetAndStart.length) {
                resetAndStart = leaseObjectBuffer.appendCompletedChunk(resetAndStart);
                i3 = 0;
            }
            i2 = i3 + 1;
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public String[] deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, String[] strArr) throws IOException {
        String nextTextValue;
        int i2;
        if (!jsonParser.isExpectedStartArrayToken()) {
            String[] handleNonArray = handleNonArray(jsonParser, deserializationContext);
            if (handleNonArray == null) {
                return strArr;
            }
            int length = strArr.length;
            String[] strArr2 = new String[handleNonArray.length + length];
            System.arraycopy(strArr, 0, strArr2, 0, length);
            System.arraycopy(handleNonArray, 0, strArr2, length, handleNonArray.length);
            return strArr2;
        }
        if (this._elementDeserializer != null) {
            return _deserializeCustom(jsonParser, deserializationContext, strArr);
        }
        ObjectBuffer leaseObjectBuffer = deserializationContext.leaseObjectBuffer();
        int length2 = strArr.length;
        Object[] resetAndStart = leaseObjectBuffer.resetAndStart(strArr, length2);
        while (true) {
            try {
                nextTextValue = jsonParser.nextTextValue();
                if (nextTextValue == null) {
                    JsonToken currentToken = jsonParser.getCurrentToken();
                    if (currentToken == JsonToken.END_ARRAY) {
                        String[] strArr3 = (String[]) leaseObjectBuffer.completeAndClearBuffer(resetAndStart, length2, String.class);
                        deserializationContext.returnObjectBuffer(leaseObjectBuffer);
                        return strArr3;
                    }
                    if (currentToken == JsonToken.VALUE_NULL) {
                        if (this._skipNullValues) {
                            return NO_STRINGS;
                        }
                        nextTextValue = (String) this._nullProvider.getNullValue(deserializationContext);
                    } else {
                        nextTextValue = _parseString(jsonParser, deserializationContext);
                    }
                }
                if (length2 >= resetAndStart.length) {
                    resetAndStart = leaseObjectBuffer.appendCompletedChunk(resetAndStart);
                    length2 = 0;
                }
                i2 = length2 + 1;
            } catch (Exception e2) {
                e = e2;
            }
            try {
                resetAndStart[length2] = nextTextValue;
                length2 = i2;
            } catch (Exception e3) {
                e = e3;
                length2 = i2;
                throw JsonMappingException.wrapWithPath(e, resetAndStart, leaseObjectBuffer.bufferedSize() + length2);
            }
        }
    }
}
