package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.IOException;

/* loaded from: classes.dex */
public class JsonNodeDeserializer extends BaseNodeDeserializer<JsonNode> {
    private static final JsonNodeDeserializer instance = new JsonNodeDeserializer();

    public JsonNodeDeserializer() {
        super(JsonNode.class, null);
    }

    public static JsonDeserializer<? extends JsonNode> getDeserializer(Class<?> cls) {
        return cls == ObjectNode.class ? ObjectDeserializer.getInstance() : cls == ArrayNode.class ? ArrayDeserializer.getInstance() : instance;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer, com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public /* bridge */ /* synthetic */ Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
        return super.deserializeWithType(jsonParser, deserializationContext, typeDeserializer);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public /* bridge */ /* synthetic */ boolean isCachable() {
        return super.isCachable();
    }

    @Override // com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public /* bridge */ /* synthetic */ Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return super.supportsUpdate(deserializationConfig);
    }

    public static final class ArrayDeserializer extends BaseNodeDeserializer<ArrayNode> {
        public static final ArrayDeserializer _instance = new ArrayDeserializer();
        private static final long serialVersionUID = 1;

        public ArrayDeserializer() {
            super(ArrayNode.class, Boolean.TRUE);
        }

        public static ArrayDeserializer getInstance() {
            return _instance;
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public ArrayNode deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            if (jsonParser.isExpectedStartArrayToken()) {
                return deserializeArray(jsonParser, deserializationContext, deserializationContext.getNodeFactory());
            }
            return (ArrayNode) deserializationContext.handleUnexpectedToken(ArrayNode.class, jsonParser);
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public ArrayNode deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, ArrayNode arrayNode) throws IOException {
            if (jsonParser.isExpectedStartArrayToken()) {
                return (ArrayNode) updateArray(jsonParser, deserializationContext, arrayNode);
            }
            return (ArrayNode) deserializationContext.handleUnexpectedToken(ArrayNode.class, jsonParser);
        }
    }

    public static final class ObjectDeserializer extends BaseNodeDeserializer<ObjectNode> {
        public static final ObjectDeserializer _instance = new ObjectDeserializer();
        private static final long serialVersionUID = 1;

        public ObjectDeserializer() {
            super(ObjectNode.class, Boolean.TRUE);
        }

        public static ObjectDeserializer getInstance() {
            return _instance;
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public ObjectNode deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            if (jsonParser.isExpectedStartObjectToken()) {
                return deserializeObject(jsonParser, deserializationContext, deserializationContext.getNodeFactory());
            }
            if (jsonParser.hasToken(JsonToken.FIELD_NAME)) {
                return deserializeObjectAtName(jsonParser, deserializationContext, deserializationContext.getNodeFactory());
            }
            if (jsonParser.hasToken(JsonToken.END_OBJECT)) {
                return deserializationContext.getNodeFactory().objectNode();
            }
            return (ObjectNode) deserializationContext.handleUnexpectedToken(ObjectNode.class, jsonParser);
        }

        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public ObjectNode deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, ObjectNode objectNode) throws IOException {
            if (!jsonParser.isExpectedStartObjectToken() && !jsonParser.hasToken(JsonToken.FIELD_NAME)) {
                return (ObjectNode) deserializationContext.handleUnexpectedToken(ObjectNode.class, jsonParser);
            }
            return (ObjectNode) updateObject(jsonParser, deserializationContext, objectNode);
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public JsonNode deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        int currentTokenId = jsonParser.currentTokenId();
        return currentTokenId != 1 ? currentTokenId != 3 ? deserializeAny(jsonParser, deserializationContext, deserializationContext.getNodeFactory()) : deserializeArray(jsonParser, deserializationContext, deserializationContext.getNodeFactory()) : deserializeObject(jsonParser, deserializationContext, deserializationContext.getNodeFactory());
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer, com.fasterxml.jackson.databind.deser.NullValueProvider
    public JsonNode getNullValue(DeserializationContext deserializationContext) {
        return deserializationContext.getNodeFactory().nullNode();
    }
}
