package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class BeanDeserializer extends BeanDeserializerBase {
    private static final long serialVersionUID = 1;
    private volatile transient NameTransformer _currentlyTransforming;
    public transient Exception _nullFromCreator;

    /* renamed from: com.fasterxml.jackson.databind.deser.BeanDeserializer$1 */
    public static /* synthetic */ class C08431 {
        public static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$core$JsonToken;

        static {
            int[] iArr = new int[JsonToken.values().length];
            $SwitchMap$com$fasterxml$jackson$core$JsonToken = iArr;
            try {
                iArr[JsonToken.VALUE_STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_NUMBER_INT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_NUMBER_FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_EMBEDDED_OBJECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_TRUE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_FALSE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_NULL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.START_ARRAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.FIELD_NAME.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.END_OBJECT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public static class BeanReferring extends ReadableObjectId.Referring {
        private Object _bean;
        private final DeserializationContext _context;
        private final SettableBeanProperty _prop;

        public BeanReferring(DeserializationContext deserializationContext, UnresolvedForwardReference unresolvedForwardReference, JavaType javaType, PropertyValueBuffer propertyValueBuffer, SettableBeanProperty settableBeanProperty) {
            super(unresolvedForwardReference, javaType);
            this._context = deserializationContext;
            this._prop = settableBeanProperty;
        }

        @Override // com.fasterxml.jackson.databind.deser.impl.ReadableObjectId.Referring
        public void handleResolvedForwardReference(Object obj, Object obj2) throws IOException {
            if (this._bean == null) {
                DeserializationContext deserializationContext = this._context;
                SettableBeanProperty settableBeanProperty = this._prop;
                deserializationContext.reportInputMismatch(settableBeanProperty, "Cannot resolve ObjectId forward reference using property '%s' (of type %s): Bean not yet resolved", settableBeanProperty.getName(), this._prop.getDeclaringClass().getName());
            }
            this._prop.set(this._bean, obj2);
        }

        public void setBean(Object obj) {
            this._bean = obj;
        }
    }

    public BeanDeserializer(BeanDeserializerBuilder beanDeserializerBuilder, BeanDescription beanDescription, BeanPropertyMap beanPropertyMap, Map<String, SettableBeanProperty> map, HashSet<String> hashSet, boolean z, boolean z2) {
        super(beanDeserializerBuilder, beanDescription, beanPropertyMap, map, hashSet, z, z2);
    }

    private BeanReferring handleUnresolvedReference(DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty, PropertyValueBuffer propertyValueBuffer, UnresolvedForwardReference unresolvedForwardReference) throws JsonMappingException {
        BeanReferring beanReferring = new BeanReferring(deserializationContext, unresolvedForwardReference, settableBeanProperty.getType(), propertyValueBuffer, settableBeanProperty);
        unresolvedForwardReference.getRoid().appendReferring(beanReferring);
        return beanReferring;
    }

    private final Object vanillaDeserialize(JsonParser jsonParser, DeserializationContext deserializationContext, JsonToken jsonToken) throws IOException {
        Object createUsingDefault = this._valueInstantiator.createUsingDefault(deserializationContext);
        jsonParser.setCurrentValue(createUsingDefault);
        if (jsonParser.hasTokenId(5)) {
            String currentName = jsonParser.getCurrentName();
            do {
                jsonParser.nextToken();
                SettableBeanProperty find = this._beanProperties.find(currentName);
                if (find != null) {
                    try {
                        find.deserializeAndSet(jsonParser, deserializationContext, createUsingDefault);
                    } catch (Exception e2) {
                        wrapAndThrow(e2, createUsingDefault, currentName, deserializationContext);
                    }
                } else {
                    handleUnknownVanilla(jsonParser, deserializationContext, createUsingDefault, currentName);
                }
                currentName = jsonParser.nextFieldName();
            } while (currentName != null);
        }
        return createUsingDefault;
    }

    public Exception _creatorReturnedNullException() {
        if (this._nullFromCreator == null) {
            this._nullFromCreator = new NullPointerException("JSON Creator returned null");
        }
        return this._nullFromCreator;
    }

    public final Object _deserializeOther(JsonParser jsonParser, DeserializationContext deserializationContext, JsonToken jsonToken) throws IOException {
        if (jsonToken != null) {
            switch (C08431.$SwitchMap$com$fasterxml$jackson$core$JsonToken[jsonToken.ordinal()]) {
                case 1:
                    return deserializeFromString(jsonParser, deserializationContext);
                case 2:
                    return deserializeFromNumber(jsonParser, deserializationContext);
                case 3:
                    return deserializeFromDouble(jsonParser, deserializationContext);
                case 4:
                    return deserializeFromEmbedded(jsonParser, deserializationContext);
                case 5:
                case 6:
                    return deserializeFromBoolean(jsonParser, deserializationContext);
                case 7:
                    return deserializeFromNull(jsonParser, deserializationContext);
                case 8:
                    return deserializeFromArray(jsonParser, deserializationContext);
                case 9:
                case 10:
                    return this._vanillaProcessing ? vanillaDeserialize(jsonParser, deserializationContext, jsonToken) : this._objectIdReader != null ? deserializeWithObjectId(jsonParser, deserializationContext) : deserializeFromObject(jsonParser, deserializationContext);
            }
        }
        return deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public Object _deserializeUsingPropertyBased(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object obj;
        Object wrapInstantiationProblem;
        PropertyBasedCreator propertyBasedCreator = this._propertyBasedCreator;
        PropertyValueBuffer startBuilding = propertyBasedCreator.startBuilding(jsonParser, deserializationContext, this._objectIdReader);
        Class<?> activeView = this._needViewProcesing ? deserializationContext.getActiveView() : null;
        JsonToken currentToken = jsonParser.getCurrentToken();
        ArrayList arrayList = null;
        TokenBuffer tokenBuffer = null;
        while (currentToken == JsonToken.FIELD_NAME) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            if (!startBuilding.readIdProperty(currentName)) {
                SettableBeanProperty findCreatorProperty = propertyBasedCreator.findCreatorProperty(currentName);
                if (findCreatorProperty == null) {
                    SettableBeanProperty find = this._beanProperties.find(currentName);
                    if (find != null) {
                        try {
                            startBuilding.bufferProperty(find, _deserializeWithErrorWrapping(jsonParser, deserializationContext, find));
                        } catch (UnresolvedForwardReference e2) {
                            BeanReferring handleUnresolvedReference = handleUnresolvedReference(deserializationContext, find, startBuilding, e2);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(handleUnresolvedReference);
                        }
                    } else {
                        Set<String> set = this._ignorableProps;
                        if (set == null || !set.contains(currentName)) {
                            SettableAnyProperty settableAnyProperty = this._anySetter;
                            if (settableAnyProperty != null) {
                                try {
                                    startBuilding.bufferAnyProperty(settableAnyProperty, currentName, settableAnyProperty.deserialize(jsonParser, deserializationContext));
                                } catch (Exception e3) {
                                    wrapAndThrow(e3, this._beanType.getRawClass(), currentName, deserializationContext);
                                }
                            } else {
                                if (tokenBuffer == null) {
                                    tokenBuffer = new TokenBuffer(jsonParser, deserializationContext);
                                }
                                tokenBuffer.writeFieldName(currentName);
                                tokenBuffer.copyCurrentStructure(jsonParser);
                            }
                        } else {
                            handleIgnoredProperty(jsonParser, deserializationContext, handledType(), currentName);
                        }
                    }
                } else if (activeView != null && !findCreatorProperty.visibleInView(activeView)) {
                    jsonParser.skipChildren();
                } else if (startBuilding.assignParameter(findCreatorProperty, _deserializeWithErrorWrapping(jsonParser, deserializationContext, findCreatorProperty))) {
                    jsonParser.nextToken();
                    try {
                        wrapInstantiationProblem = propertyBasedCreator.build(deserializationContext, startBuilding);
                    } catch (Exception e4) {
                        wrapInstantiationProblem = wrapInstantiationProblem(e4, deserializationContext);
                    }
                    if (wrapInstantiationProblem == null) {
                        return deserializationContext.handleInstantiationProblem(handledType(), null, _creatorReturnedNullException());
                    }
                    jsonParser.setCurrentValue(wrapInstantiationProblem);
                    if (wrapInstantiationProblem.getClass() != this._beanType.getRawClass()) {
                        return handlePolymorphic(jsonParser, deserializationContext, wrapInstantiationProblem, tokenBuffer);
                    }
                    if (tokenBuffer != null) {
                        wrapInstantiationProblem = handleUnknownProperties(deserializationContext, wrapInstantiationProblem, tokenBuffer);
                    }
                    return deserialize(jsonParser, deserializationContext, wrapInstantiationProblem);
                }
            }
            currentToken = jsonParser.nextToken();
        }
        try {
            obj = propertyBasedCreator.build(deserializationContext, startBuilding);
        } catch (Exception e5) {
            wrapInstantiationProblem(e5, deserializationContext);
            obj = null;
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((BeanReferring) it.next()).setBean(obj);
            }
        }
        return tokenBuffer != null ? obj.getClass() != this._beanType.getRawClass() ? handlePolymorphic(null, deserializationContext, obj, tokenBuffer) : handleUnknownProperties(deserializationContext, obj, tokenBuffer) : obj;
    }

    public final Object _deserializeWithErrorWrapping(JsonParser jsonParser, DeserializationContext deserializationContext, SettableBeanProperty settableBeanProperty) throws IOException {
        try {
            return settableBeanProperty.deserialize(jsonParser, deserializationContext);
        } catch (Exception e2) {
            wrapAndThrow(e2, this._beanType.getRawClass(), settableBeanProperty.getName(), deserializationContext);
            return null;
        }
    }

    @Deprecated
    public Object _missingToken(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        throw deserializationContext.endOfInputException(handledType());
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase asArrayDeserializer() {
        return new BeanAsArrayDeserializer(this, this._beanProperties.getPropertiesInInsertionOrder());
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (!jsonParser.isExpectedStartObjectToken()) {
            return _deserializeOther(jsonParser, deserializationContext, jsonParser.getCurrentToken());
        }
        if (this._vanillaProcessing) {
            return vanillaDeserialize(jsonParser, deserializationContext, jsonParser.nextToken());
        }
        jsonParser.nextToken();
        return this._objectIdReader != null ? deserializeWithObjectId(jsonParser, deserializationContext) : deserializeFromObject(jsonParser, deserializationContext);
    }

    public Object deserializeFromNull(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (!jsonParser.requiresCustomCodec()) {
            return deserializationContext.handleUnexpectedToken(getValueType(deserializationContext), jsonParser);
        }
        TokenBuffer tokenBuffer = new TokenBuffer(jsonParser, deserializationContext);
        tokenBuffer.writeEndObject();
        JsonParser asParser = tokenBuffer.asParser(jsonParser);
        asParser.nextToken();
        Object vanillaDeserialize = this._vanillaProcessing ? vanillaDeserialize(asParser, deserializationContext, JsonToken.END_OBJECT) : deserializeFromObject(asParser, deserializationContext);
        asParser.close();
        return vanillaDeserialize;
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public Object deserializeFromObject(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Class<?> activeView;
        Object objectId;
        ObjectIdReader objectIdReader = this._objectIdReader;
        if (objectIdReader != null && objectIdReader.maySerializeAsObject() && jsonParser.hasTokenId(5) && this._objectIdReader.isValidReferencePropertyName(jsonParser.getCurrentName(), jsonParser)) {
            return deserializeFromObjectId(jsonParser, deserializationContext);
        }
        if (this._nonStandardCreation) {
            if (this._unwrappedPropertyHandler != null) {
                return deserializeWithUnwrapped(jsonParser, deserializationContext);
            }
            if (this._externalTypeIdHandler != null) {
                return deserializeWithExternalTypeId(jsonParser, deserializationContext);
            }
            Object deserializeFromObjectUsingNonDefault = deserializeFromObjectUsingNonDefault(jsonParser, deserializationContext);
            if (this._injectables != null) {
                injectValues(deserializationContext, deserializeFromObjectUsingNonDefault);
            }
            return deserializeFromObjectUsingNonDefault;
        }
        Object createUsingDefault = this._valueInstantiator.createUsingDefault(deserializationContext);
        jsonParser.setCurrentValue(createUsingDefault);
        if (jsonParser.canReadObjectId() && (objectId = jsonParser.getObjectId()) != null) {
            _handleTypedObjectId(jsonParser, deserializationContext, createUsingDefault, objectId);
        }
        if (this._injectables != null) {
            injectValues(deserializationContext, createUsingDefault);
        }
        if (this._needViewProcesing && (activeView = deserializationContext.getActiveView()) != null) {
            return deserializeWithView(jsonParser, deserializationContext, createUsingDefault, activeView);
        }
        if (jsonParser.hasTokenId(5)) {
            String currentName = jsonParser.getCurrentName();
            do {
                jsonParser.nextToken();
                SettableBeanProperty find = this._beanProperties.find(currentName);
                if (find != null) {
                    try {
                        find.deserializeAndSet(jsonParser, deserializationContext, createUsingDefault);
                    } catch (Exception e2) {
                        wrapAndThrow(e2, createUsingDefault, currentName, deserializationContext);
                    }
                } else {
                    handleUnknownVanilla(jsonParser, deserializationContext, createUsingDefault, currentName);
                }
                currentName = jsonParser.nextFieldName();
            } while (currentName != null);
        }
        return createUsingDefault;
    }

    public Object deserializeUsingPropertyBasedWithExternalTypeId(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        ExternalTypeHandler start = this._externalTypeIdHandler.start();
        PropertyBasedCreator propertyBasedCreator = this._propertyBasedCreator;
        PropertyValueBuffer startBuilding = propertyBasedCreator.startBuilding(jsonParser, deserializationContext, this._objectIdReader);
        TokenBuffer tokenBuffer = new TokenBuffer(jsonParser, deserializationContext);
        tokenBuffer.writeStartObject();
        JsonToken currentToken = jsonParser.getCurrentToken();
        while (currentToken == JsonToken.FIELD_NAME) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            SettableBeanProperty findCreatorProperty = propertyBasedCreator.findCreatorProperty(currentName);
            if (findCreatorProperty != null) {
                if (!start.handlePropertyValue(jsonParser, deserializationContext, currentName, null) && startBuilding.assignParameter(findCreatorProperty, _deserializeWithErrorWrapping(jsonParser, deserializationContext, findCreatorProperty))) {
                    JsonToken nextToken = jsonParser.nextToken();
                    try {
                        Object build = propertyBasedCreator.build(deserializationContext, startBuilding);
                        while (nextToken == JsonToken.FIELD_NAME) {
                            jsonParser.nextToken();
                            tokenBuffer.copyCurrentStructure(jsonParser);
                            nextToken = jsonParser.nextToken();
                        }
                        if (build.getClass() == this._beanType.getRawClass()) {
                            return start.complete(jsonParser, deserializationContext, build);
                        }
                        JavaType javaType = this._beanType;
                        return deserializationContext.reportBadDefinition(javaType, String.format("Cannot create polymorphic instances with external type ids (%s -> %s)", javaType, build.getClass()));
                    } catch (Exception e2) {
                        wrapAndThrow(e2, this._beanType.getRawClass(), currentName, deserializationContext);
                    }
                }
            } else if (!startBuilding.readIdProperty(currentName)) {
                SettableBeanProperty find = this._beanProperties.find(currentName);
                if (find != null) {
                    startBuilding.bufferProperty(find, find.deserialize(jsonParser, deserializationContext));
                } else if (!start.handlePropertyValue(jsonParser, deserializationContext, currentName, null)) {
                    Set<String> set = this._ignorableProps;
                    if (set == null || !set.contains(currentName)) {
                        SettableAnyProperty settableAnyProperty = this._anySetter;
                        if (settableAnyProperty != null) {
                            startBuilding.bufferAnyProperty(settableAnyProperty, currentName, settableAnyProperty.deserialize(jsonParser, deserializationContext));
                        }
                    } else {
                        handleIgnoredProperty(jsonParser, deserializationContext, handledType(), currentName);
                    }
                }
            }
            currentToken = jsonParser.nextToken();
        }
        tokenBuffer.writeEndObject();
        try {
            return start.complete(jsonParser, deserializationContext, startBuilding, propertyBasedCreator);
        } catch (Exception e3) {
            return wrapInstantiationProblem(e3, deserializationContext);
        }
    }

    public Object deserializeUsingPropertyBasedWithUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        Object wrapInstantiationProblem;
        PropertyBasedCreator propertyBasedCreator = this._propertyBasedCreator;
        PropertyValueBuffer startBuilding = propertyBasedCreator.startBuilding(jsonParser, deserializationContext, this._objectIdReader);
        TokenBuffer tokenBuffer = new TokenBuffer(jsonParser, deserializationContext);
        tokenBuffer.writeStartObject();
        JsonToken currentToken = jsonParser.getCurrentToken();
        while (currentToken == JsonToken.FIELD_NAME) {
            String currentName = jsonParser.getCurrentName();
            jsonParser.nextToken();
            SettableBeanProperty findCreatorProperty = propertyBasedCreator.findCreatorProperty(currentName);
            if (findCreatorProperty != null) {
                if (startBuilding.assignParameter(findCreatorProperty, _deserializeWithErrorWrapping(jsonParser, deserializationContext, findCreatorProperty))) {
                    JsonToken nextToken = jsonParser.nextToken();
                    try {
                        wrapInstantiationProblem = propertyBasedCreator.build(deserializationContext, startBuilding);
                    } catch (Exception e2) {
                        wrapInstantiationProblem = wrapInstantiationProblem(e2, deserializationContext);
                    }
                    jsonParser.setCurrentValue(wrapInstantiationProblem);
                    while (nextToken == JsonToken.FIELD_NAME) {
                        tokenBuffer.copyCurrentStructure(jsonParser);
                        nextToken = jsonParser.nextToken();
                    }
                    JsonToken jsonToken = JsonToken.END_OBJECT;
                    if (nextToken != jsonToken) {
                        deserializationContext.reportWrongTokenException(this, jsonToken, "Attempted to unwrap '%s' value", handledType().getName());
                    }
                    tokenBuffer.writeEndObject();
                    if (wrapInstantiationProblem.getClass() == this._beanType.getRawClass()) {
                        return this._unwrappedPropertyHandler.processUnwrapped(jsonParser, deserializationContext, wrapInstantiationProblem, tokenBuffer);
                    }
                    deserializationContext.reportInputMismatch(findCreatorProperty, "Cannot create polymorphic instances with unwrapped values", new Object[0]);
                    return null;
                }
            } else if (!startBuilding.readIdProperty(currentName)) {
                SettableBeanProperty find = this._beanProperties.find(currentName);
                if (find != null) {
                    startBuilding.bufferProperty(find, _deserializeWithErrorWrapping(jsonParser, deserializationContext, find));
                } else {
                    Set<String> set = this._ignorableProps;
                    if (set != null && set.contains(currentName)) {
                        handleIgnoredProperty(jsonParser, deserializationContext, handledType(), currentName);
                    } else if (this._anySetter == null) {
                        tokenBuffer.writeFieldName(currentName);
                        tokenBuffer.copyCurrentStructure(jsonParser);
                    } else {
                        TokenBuffer asCopyOfValue = TokenBuffer.asCopyOfValue(jsonParser);
                        tokenBuffer.writeFieldName(currentName);
                        tokenBuffer.append(asCopyOfValue);
                        try {
                            SettableAnyProperty settableAnyProperty = this._anySetter;
                            startBuilding.bufferAnyProperty(settableAnyProperty, currentName, settableAnyProperty.deserialize(asCopyOfValue.asParserOnFirstToken(), deserializationContext));
                        } catch (Exception e3) {
                            wrapAndThrow(e3, this._beanType.getRawClass(), currentName, deserializationContext);
                        }
                    }
                }
            }
            currentToken = jsonParser.nextToken();
        }
        try {
            return this._unwrappedPropertyHandler.processUnwrapped(jsonParser, deserializationContext, propertyBasedCreator.build(deserializationContext, startBuilding), tokenBuffer);
        } catch (Exception e4) {
            wrapInstantiationProblem(e4, deserializationContext);
            return null;
        }
    }

    public Object deserializeWithExternalTypeId(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (this._propertyBasedCreator != null) {
            return deserializeUsingPropertyBasedWithExternalTypeId(jsonParser, deserializationContext);
        }
        JsonDeserializer<Object> jsonDeserializer = this._delegateDeserializer;
        return jsonDeserializer != null ? this._valueInstantiator.createUsingDelegate(deserializationContext, jsonDeserializer.deserialize(jsonParser, deserializationContext)) : deserializeWithExternalTypeId(jsonParser, deserializationContext, this._valueInstantiator.createUsingDefault(deserializationContext));
    }

    public Object deserializeWithUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonDeserializer<Object> jsonDeserializer = this._delegateDeserializer;
        if (jsonDeserializer != null) {
            return this._valueInstantiator.createUsingDelegate(deserializationContext, jsonDeserializer.deserialize(jsonParser, deserializationContext));
        }
        if (this._propertyBasedCreator != null) {
            return deserializeUsingPropertyBasedWithUnwrapped(jsonParser, deserializationContext);
        }
        TokenBuffer tokenBuffer = new TokenBuffer(jsonParser, deserializationContext);
        tokenBuffer.writeStartObject();
        Object createUsingDefault = this._valueInstantiator.createUsingDefault(deserializationContext);
        jsonParser.setCurrentValue(createUsingDefault);
        if (this._injectables != null) {
            injectValues(deserializationContext, createUsingDefault);
        }
        Class<?> activeView = this._needViewProcesing ? deserializationContext.getActiveView() : null;
        String currentName = jsonParser.hasTokenId(5) ? jsonParser.getCurrentName() : null;
        while (currentName != null) {
            jsonParser.nextToken();
            SettableBeanProperty find = this._beanProperties.find(currentName);
            if (find == null) {
                Set<String> set = this._ignorableProps;
                if (set != null && set.contains(currentName)) {
                    handleIgnoredProperty(jsonParser, deserializationContext, createUsingDefault, currentName);
                } else if (this._anySetter == null) {
                    tokenBuffer.writeFieldName(currentName);
                    tokenBuffer.copyCurrentStructure(jsonParser);
                } else {
                    TokenBuffer asCopyOfValue = TokenBuffer.asCopyOfValue(jsonParser);
                    tokenBuffer.writeFieldName(currentName);
                    tokenBuffer.append(asCopyOfValue);
                    try {
                        this._anySetter.deserializeAndSet(asCopyOfValue.asParserOnFirstToken(), deserializationContext, createUsingDefault, currentName);
                    } catch (Exception e2) {
                        wrapAndThrow(e2, createUsingDefault, currentName, deserializationContext);
                    }
                }
            } else if (activeView == null || find.visibleInView(activeView)) {
                try {
                    find.deserializeAndSet(jsonParser, deserializationContext, createUsingDefault);
                } catch (Exception e3) {
                    wrapAndThrow(e3, createUsingDefault, currentName, deserializationContext);
                }
            } else {
                jsonParser.skipChildren();
            }
            currentName = jsonParser.nextFieldName();
        }
        tokenBuffer.writeEndObject();
        this._unwrappedPropertyHandler.processUnwrapped(jsonParser, deserializationContext, createUsingDefault, tokenBuffer);
        return createUsingDefault;
    }

    public final Object deserializeWithView(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, Class<?> cls) throws IOException {
        if (jsonParser.hasTokenId(5)) {
            String currentName = jsonParser.getCurrentName();
            do {
                jsonParser.nextToken();
                SettableBeanProperty find = this._beanProperties.find(currentName);
                if (find == null) {
                    handleUnknownVanilla(jsonParser, deserializationContext, obj, currentName);
                } else if (find.visibleInView(cls)) {
                    try {
                        find.deserializeAndSet(jsonParser, deserializationContext, obj);
                    } catch (Exception e2) {
                        wrapAndThrow(e2, obj, currentName, deserializationContext);
                    }
                } else {
                    jsonParser.skipChildren();
                }
                currentName = jsonParser.nextFieldName();
            } while (currentName != null);
        }
        return obj;
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase, com.fasterxml.jackson.databind.JsonDeserializer
    public JsonDeserializer<Object> unwrappingDeserializer(NameTransformer nameTransformer) {
        if (getClass() != BeanDeserializer.class || this._currentlyTransforming == nameTransformer) {
            return this;
        }
        this._currentlyTransforming = nameTransformer;
        try {
            return new BeanDeserializer(this, nameTransformer);
        } finally {
            this._currentlyTransforming = null;
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializerBase withBeanProperties(BeanPropertyMap beanPropertyMap) {
        return new BeanDeserializer(this, beanPropertyMap);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public /* bridge */ /* synthetic */ BeanDeserializerBase withIgnorableProperties(Set set) {
        return withIgnorableProperties((Set<String>) set);
    }

    public BeanDeserializer(BeanDeserializerBase beanDeserializerBase) {
        super(beanDeserializerBase, beanDeserializerBase._ignoreAllUnknown);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializer withIgnorableProperties(Set<String> set) {
        return new BeanDeserializer(this, set);
    }

    @Override // com.fasterxml.jackson.databind.deser.BeanDeserializerBase
    public BeanDeserializer withObjectIdReader(ObjectIdReader objectIdReader) {
        return new BeanDeserializer(this, objectIdReader);
    }

    public BeanDeserializer(BeanDeserializerBase beanDeserializerBase, boolean z) {
        super(beanDeserializerBase, z);
    }

    public BeanDeserializer(BeanDeserializerBase beanDeserializerBase, NameTransformer nameTransformer) {
        super(beanDeserializerBase, nameTransformer);
    }

    public BeanDeserializer(BeanDeserializerBase beanDeserializerBase, ObjectIdReader objectIdReader) {
        super(beanDeserializerBase, objectIdReader);
    }

    public BeanDeserializer(BeanDeserializerBase beanDeserializerBase, Set<String> set) {
        super(beanDeserializerBase, set);
    }

    public BeanDeserializer(BeanDeserializerBase beanDeserializerBase, BeanPropertyMap beanPropertyMap) {
        super(beanDeserializerBase, beanPropertyMap);
    }

    public Object deserializeWithExternalTypeId(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        Class<?> activeView = this._needViewProcesing ? deserializationContext.getActiveView() : null;
        ExternalTypeHandler start = this._externalTypeIdHandler.start();
        JsonToken currentToken = jsonParser.getCurrentToken();
        while (currentToken == JsonToken.FIELD_NAME) {
            String currentName = jsonParser.getCurrentName();
            JsonToken nextToken = jsonParser.nextToken();
            SettableBeanProperty find = this._beanProperties.find(currentName);
            if (find != null) {
                if (nextToken.isScalarValue()) {
                    start.handleTypePropertyValue(jsonParser, deserializationContext, currentName, obj);
                }
                if (activeView != null && !find.visibleInView(activeView)) {
                    jsonParser.skipChildren();
                } else {
                    try {
                        find.deserializeAndSet(jsonParser, deserializationContext, obj);
                    } catch (Exception e2) {
                        wrapAndThrow(e2, obj, currentName, deserializationContext);
                    }
                }
            } else {
                Set<String> set = this._ignorableProps;
                if (set != null && set.contains(currentName)) {
                    handleIgnoredProperty(jsonParser, deserializationContext, obj, currentName);
                } else if (!start.handlePropertyValue(jsonParser, deserializationContext, currentName, obj)) {
                    SettableAnyProperty settableAnyProperty = this._anySetter;
                    if (settableAnyProperty != null) {
                        try {
                            settableAnyProperty.deserializeAndSet(jsonParser, deserializationContext, obj, currentName);
                        } catch (Exception e3) {
                            wrapAndThrow(e3, obj, currentName, deserializationContext);
                        }
                    } else {
                        handleUnknownProperty(jsonParser, deserializationContext, obj, currentName);
                    }
                }
            }
            currentToken = jsonParser.nextToken();
        }
        return start.complete(jsonParser, deserializationContext, obj);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        String currentName;
        Class<?> activeView;
        jsonParser.setCurrentValue(obj);
        if (this._injectables != null) {
            injectValues(deserializationContext, obj);
        }
        if (this._unwrappedPropertyHandler != null) {
            return deserializeWithUnwrapped(jsonParser, deserializationContext, obj);
        }
        if (this._externalTypeIdHandler != null) {
            return deserializeWithExternalTypeId(jsonParser, deserializationContext, obj);
        }
        if (jsonParser.isExpectedStartObjectToken()) {
            currentName = jsonParser.nextFieldName();
            if (currentName == null) {
                return obj;
            }
        } else {
            if (jsonParser.hasTokenId(5)) {
                currentName = jsonParser.getCurrentName();
            }
            return obj;
        }
        if (this._needViewProcesing && (activeView = deserializationContext.getActiveView()) != null) {
            return deserializeWithView(jsonParser, deserializationContext, obj, activeView);
        }
        do {
            jsonParser.nextToken();
            SettableBeanProperty find = this._beanProperties.find(currentName);
            if (find != null) {
                try {
                    find.deserializeAndSet(jsonParser, deserializationContext, obj);
                } catch (Exception e2) {
                    wrapAndThrow(e2, obj, currentName, deserializationContext);
                }
            } else {
                handleUnknownVanilla(jsonParser, deserializationContext, obj, currentName);
            }
            currentName = jsonParser.nextFieldName();
        } while (currentName != null);
        return obj;
    }

    public Object deserializeWithUnwrapped(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        JsonToken currentToken = jsonParser.getCurrentToken();
        if (currentToken == JsonToken.START_OBJECT) {
            currentToken = jsonParser.nextToken();
        }
        TokenBuffer tokenBuffer = new TokenBuffer(jsonParser, deserializationContext);
        tokenBuffer.writeStartObject();
        Class<?> activeView = this._needViewProcesing ? deserializationContext.getActiveView() : null;
        while (currentToken == JsonToken.FIELD_NAME) {
            String currentName = jsonParser.getCurrentName();
            SettableBeanProperty find = this._beanProperties.find(currentName);
            jsonParser.nextToken();
            if (find != null) {
                if (activeView != null && !find.visibleInView(activeView)) {
                    jsonParser.skipChildren();
                } else {
                    try {
                        find.deserializeAndSet(jsonParser, deserializationContext, obj);
                    } catch (Exception e2) {
                        wrapAndThrow(e2, obj, currentName, deserializationContext);
                    }
                }
            } else {
                Set<String> set = this._ignorableProps;
                if (set != null && set.contains(currentName)) {
                    handleIgnoredProperty(jsonParser, deserializationContext, obj, currentName);
                } else if (this._anySetter == null) {
                    tokenBuffer.writeFieldName(currentName);
                    tokenBuffer.copyCurrentStructure(jsonParser);
                } else {
                    TokenBuffer asCopyOfValue = TokenBuffer.asCopyOfValue(jsonParser);
                    tokenBuffer.writeFieldName(currentName);
                    tokenBuffer.append(asCopyOfValue);
                    try {
                        this._anySetter.deserializeAndSet(asCopyOfValue.asParserOnFirstToken(), deserializationContext, obj, currentName);
                    } catch (Exception e3) {
                        wrapAndThrow(e3, obj, currentName, deserializationContext);
                    }
                }
            }
            currentToken = jsonParser.nextToken();
        }
        tokenBuffer.writeEndObject();
        this._unwrappedPropertyHandler.processUnwrapped(jsonParser, deserializationContext, obj, tokenBuffer);
        return obj;
    }
}
