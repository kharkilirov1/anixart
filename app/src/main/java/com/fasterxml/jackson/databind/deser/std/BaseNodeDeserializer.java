package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.util.RawValue;
import java.io.IOException;

/* compiled from: JsonNodeDeserializer.java */
/* loaded from: classes.dex */
abstract class BaseNodeDeserializer<T extends JsonNode> extends StdDeserializer<T> {
    public final Boolean _supportsUpdates;

    public BaseNodeDeserializer(Class<T> cls, Boolean bool) {
        super((Class<?>) cls);
        this._supportsUpdates = bool;
    }

    public final JsonNode _fromEmbedded(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory) throws IOException {
        Object embeddedObject = jsonParser.getEmbeddedObject();
        return embeddedObject == null ? jsonNodeFactory.nullNode() : embeddedObject.getClass() == byte[].class ? jsonNodeFactory.binaryNode((byte[]) embeddedObject) : embeddedObject instanceof RawValue ? jsonNodeFactory.rawValueNode((RawValue) embeddedObject) : embeddedObject instanceof JsonNode ? (JsonNode) embeddedObject : jsonNodeFactory.pojoNode(embeddedObject);
    }

    public final JsonNode _fromFloat(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory) throws IOException {
        JsonParser.NumberType numberType = jsonParser.getNumberType();
        return numberType == JsonParser.NumberType.BIG_DECIMAL ? jsonNodeFactory.numberNode(jsonParser.getDecimalValue()) : deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS) ? jsonParser.isNaN() ? jsonNodeFactory.numberNode(jsonParser.getDoubleValue()) : jsonNodeFactory.numberNode(jsonParser.getDecimalValue()) : numberType == JsonParser.NumberType.FLOAT ? jsonNodeFactory.numberNode(jsonParser.getFloatValue()) : jsonNodeFactory.numberNode(jsonParser.getDoubleValue());
    }

    public final JsonNode _fromInt(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory) throws IOException {
        int deserializationFeatures = deserializationContext.getDeserializationFeatures();
        JsonParser.NumberType numberType = (StdDeserializer.F_MASK_INT_COERCIONS & deserializationFeatures) != 0 ? DeserializationFeature.USE_BIG_INTEGER_FOR_INTS.enabledIn(deserializationFeatures) ? JsonParser.NumberType.BIG_INTEGER : DeserializationFeature.USE_LONG_FOR_INTS.enabledIn(deserializationFeatures) ? JsonParser.NumberType.LONG : jsonParser.getNumberType() : jsonParser.getNumberType();
        return numberType == JsonParser.NumberType.INT ? jsonNodeFactory.numberNode(jsonParser.getIntValue()) : numberType == JsonParser.NumberType.LONG ? jsonNodeFactory.numberNode(jsonParser.getLongValue()) : jsonNodeFactory.numberNode(jsonParser.getBigIntegerValue());
    }

    public void _handleDuplicateField(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory, String str, ObjectNode objectNode, JsonNode jsonNode, JsonNode jsonNode2) throws JsonProcessingException {
        if (deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_READING_DUP_TREE_KEY)) {
            deserializationContext.reportInputMismatch(JsonNode.class, "Duplicate field '%s' for `ObjectNode`: not allowed when `DeserializationFeature.FAIL_ON_READING_DUP_TREE_KEY` enabled", str);
        }
    }

    public final JsonNode deserializeAny(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory) throws IOException {
        int currentTokenId = jsonParser.currentTokenId();
        if (currentTokenId == 2) {
            return jsonNodeFactory.objectNode();
        }
        switch (currentTokenId) {
            case 5:
                return deserializeObjectAtName(jsonParser, deserializationContext, jsonNodeFactory);
            case 6:
                return jsonNodeFactory.textNode(jsonParser.getText());
            case 7:
                return _fromInt(jsonParser, deserializationContext, jsonNodeFactory);
            case 8:
                return _fromFloat(jsonParser, deserializationContext, jsonNodeFactory);
            case 9:
                return jsonNodeFactory.booleanNode(true);
            case 10:
                return jsonNodeFactory.booleanNode(false);
            case 11:
                return jsonNodeFactory.nullNode();
            case 12:
                return _fromEmbedded(jsonParser, deserializationContext, jsonNodeFactory);
            default:
                return (JsonNode) deserializationContext.handleUnexpectedToken(handledType(), jsonParser);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.fasterxml.jackson.databind.node.ArrayNode deserializeArray(com.fasterxml.jackson.core.JsonParser r3, com.fasterxml.jackson.databind.DeserializationContext r4, com.fasterxml.jackson.databind.node.JsonNodeFactory r5) throws java.io.IOException {
        /*
            r2 = this;
            com.fasterxml.jackson.databind.node.ArrayNode r0 = r5.arrayNode()
        L4:
            com.fasterxml.jackson.core.JsonToken r1 = r3.nextToken()
            int r1 = r1.m5359id()
            switch(r1) {
                case 1: goto L56;
                case 2: goto Lf;
                case 3: goto L4e;
                case 4: goto L4d;
                case 5: goto Lf;
                case 6: goto L41;
                case 7: goto L39;
                case 8: goto Lf;
                case 9: goto L30;
                case 10: goto L27;
                case 11: goto L1f;
                case 12: goto L17;
                default: goto Lf;
            }
        Lf:
            com.fasterxml.jackson.databind.JsonNode r1 = r2.deserializeAny(r3, r4, r5)
            r0.add(r1)
            goto L4
        L17:
            com.fasterxml.jackson.databind.JsonNode r1 = r2._fromEmbedded(r3, r4, r5)
            r0.add(r1)
            goto L4
        L1f:
            com.fasterxml.jackson.databind.node.NullNode r1 = r5.nullNode()
            r0.add(r1)
            goto L4
        L27:
            r1 = 0
            com.fasterxml.jackson.databind.node.BooleanNode r1 = r5.booleanNode(r1)
            r0.add(r1)
            goto L4
        L30:
            r1 = 1
            com.fasterxml.jackson.databind.node.BooleanNode r1 = r5.booleanNode(r1)
            r0.add(r1)
            goto L4
        L39:
            com.fasterxml.jackson.databind.JsonNode r1 = r2._fromInt(r3, r4, r5)
            r0.add(r1)
            goto L4
        L41:
            java.lang.String r1 = r3.getText()
            com.fasterxml.jackson.databind.node.TextNode r1 = r5.textNode(r1)
            r0.add(r1)
            goto L4
        L4d:
            return r0
        L4e:
            com.fasterxml.jackson.databind.node.ArrayNode r1 = r2.deserializeArray(r3, r4, r5)
            r0.add(r1)
            goto L4
        L56:
            com.fasterxml.jackson.databind.node.ObjectNode r1 = r2.deserializeObject(r3, r4, r5)
            r0.add(r1)
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer.deserializeArray(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.node.JsonNodeFactory):com.fasterxml.jackson.databind.node.ArrayNode");
    }

    public final ObjectNode deserializeObject(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory) throws IOException {
        JsonNode deserializeObject;
        ObjectNode objectNode = jsonNodeFactory.objectNode();
        String nextFieldName = jsonParser.nextFieldName();
        while (nextFieldName != null) {
            JsonToken nextToken = jsonParser.nextToken();
            if (nextToken == null) {
                nextToken = JsonToken.NOT_AVAILABLE;
            }
            int m5359id = nextToken.m5359id();
            if (m5359id == 1) {
                deserializeObject = deserializeObject(jsonParser, deserializationContext, jsonNodeFactory);
            } else if (m5359id == 3) {
                deserializeObject = deserializeArray(jsonParser, deserializationContext, jsonNodeFactory);
            } else if (m5359id == 6) {
                deserializeObject = jsonNodeFactory.textNode(jsonParser.getText());
            } else if (m5359id != 7) {
                switch (m5359id) {
                    case 9:
                        deserializeObject = jsonNodeFactory.booleanNode(true);
                        break;
                    case 10:
                        deserializeObject = jsonNodeFactory.booleanNode(false);
                        break;
                    case 11:
                        deserializeObject = jsonNodeFactory.nullNode();
                        break;
                    case 12:
                        deserializeObject = _fromEmbedded(jsonParser, deserializationContext, jsonNodeFactory);
                        break;
                    default:
                        deserializeObject = deserializeAny(jsonParser, deserializationContext, jsonNodeFactory);
                        break;
                }
            } else {
                deserializeObject = _fromInt(jsonParser, deserializationContext, jsonNodeFactory);
            }
            JsonNode jsonNode = deserializeObject;
            JsonNode replace = objectNode.replace(nextFieldName, jsonNode);
            if (replace != null) {
                _handleDuplicateField(jsonParser, deserializationContext, jsonNodeFactory, nextFieldName, objectNode, replace, jsonNode);
            }
            nextFieldName = jsonParser.nextFieldName();
        }
        return objectNode;
    }

    public final ObjectNode deserializeObjectAtName(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory) throws IOException {
        JsonNode deserializeObject;
        ObjectNode objectNode = jsonNodeFactory.objectNode();
        String currentName = jsonParser.getCurrentName();
        while (currentName != null) {
            JsonToken nextToken = jsonParser.nextToken();
            if (nextToken == null) {
                nextToken = JsonToken.NOT_AVAILABLE;
            }
            int m5359id = nextToken.m5359id();
            if (m5359id == 1) {
                deserializeObject = deserializeObject(jsonParser, deserializationContext, jsonNodeFactory);
            } else if (m5359id == 3) {
                deserializeObject = deserializeArray(jsonParser, deserializationContext, jsonNodeFactory);
            } else if (m5359id == 6) {
                deserializeObject = jsonNodeFactory.textNode(jsonParser.getText());
            } else if (m5359id != 7) {
                switch (m5359id) {
                    case 9:
                        deserializeObject = jsonNodeFactory.booleanNode(true);
                        break;
                    case 10:
                        deserializeObject = jsonNodeFactory.booleanNode(false);
                        break;
                    case 11:
                        deserializeObject = jsonNodeFactory.nullNode();
                        break;
                    case 12:
                        deserializeObject = _fromEmbedded(jsonParser, deserializationContext, jsonNodeFactory);
                        break;
                    default:
                        deserializeObject = deserializeAny(jsonParser, deserializationContext, jsonNodeFactory);
                        break;
                }
            } else {
                deserializeObject = _fromInt(jsonParser, deserializationContext, jsonNodeFactory);
            }
            JsonNode jsonNode = deserializeObject;
            JsonNode replace = objectNode.replace(currentName, jsonNode);
            if (replace != null) {
                _handleDuplicateField(jsonParser, deserializationContext, jsonNodeFactory, currentName, objectNode, replace, jsonNode);
            }
            currentName = jsonParser.nextFieldName();
        }
        return objectNode;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
        return typeDeserializer.deserializeTypedFromAny(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public boolean isCachable() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return this._supportsUpdates;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.fasterxml.jackson.databind.JsonNode updateArray(com.fasterxml.jackson.core.JsonParser r3, com.fasterxml.jackson.databind.DeserializationContext r4, com.fasterxml.jackson.databind.node.ArrayNode r5) throws java.io.IOException {
        /*
            r2 = this;
            com.fasterxml.jackson.databind.node.JsonNodeFactory r0 = r4.getNodeFactory()
        L4:
            com.fasterxml.jackson.core.JsonToken r1 = r3.nextToken()
            int r1 = r1.m5359id()
            switch(r1) {
                case 1: goto L56;
                case 2: goto Lf;
                case 3: goto L4e;
                case 4: goto L4d;
                case 5: goto Lf;
                case 6: goto L41;
                case 7: goto L39;
                case 8: goto Lf;
                case 9: goto L30;
                case 10: goto L27;
                case 11: goto L1f;
                case 12: goto L17;
                default: goto Lf;
            }
        Lf:
            com.fasterxml.jackson.databind.JsonNode r1 = r2.deserializeAny(r3, r4, r0)
            r5.add(r1)
            goto L4
        L17:
            com.fasterxml.jackson.databind.JsonNode r1 = r2._fromEmbedded(r3, r4, r0)
            r5.add(r1)
            goto L4
        L1f:
            com.fasterxml.jackson.databind.node.NullNode r1 = r0.nullNode()
            r5.add(r1)
            goto L4
        L27:
            r1 = 0
            com.fasterxml.jackson.databind.node.BooleanNode r1 = r0.booleanNode(r1)
            r5.add(r1)
            goto L4
        L30:
            r1 = 1
            com.fasterxml.jackson.databind.node.BooleanNode r1 = r0.booleanNode(r1)
            r5.add(r1)
            goto L4
        L39:
            com.fasterxml.jackson.databind.JsonNode r1 = r2._fromInt(r3, r4, r0)
            r5.add(r1)
            goto L4
        L41:
            java.lang.String r1 = r3.getText()
            com.fasterxml.jackson.databind.node.TextNode r1 = r0.textNode(r1)
            r5.add(r1)
            goto L4
        L4d:
            return r5
        L4e:
            com.fasterxml.jackson.databind.node.ArrayNode r1 = r2.deserializeArray(r3, r4, r0)
            r5.add(r1)
            goto L4
        L56:
            com.fasterxml.jackson.databind.node.ObjectNode r1 = r2.deserializeObject(r3, r4, r0)
            r5.add(r1)
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer.updateArray(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.node.ArrayNode):com.fasterxml.jackson.databind.JsonNode");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final JsonNode updateObject(JsonParser jsonParser, DeserializationContext deserializationContext, ObjectNode objectNode) throws IOException {
        String currentName;
        JsonNode deserializeObject;
        if (jsonParser.isExpectedStartObjectToken()) {
            currentName = jsonParser.nextFieldName();
        } else {
            if (!jsonParser.hasToken(JsonToken.FIELD_NAME)) {
                return (JsonNode) deserialize(jsonParser, deserializationContext);
            }
            currentName = jsonParser.getCurrentName();
        }
        while (currentName != null) {
            JsonToken nextToken = jsonParser.nextToken();
            JsonNode jsonNode = objectNode.get(currentName);
            if (jsonNode != null) {
                if (jsonNode instanceof ObjectNode) {
                    JsonNode updateObject = updateObject(jsonParser, deserializationContext, (ObjectNode) jsonNode);
                    if (updateObject != jsonNode) {
                        objectNode.set(currentName, updateObject);
                    }
                } else if (jsonNode instanceof ArrayNode) {
                    JsonNode updateArray = updateArray(jsonParser, deserializationContext, (ArrayNode) jsonNode);
                    if (updateArray != jsonNode) {
                        objectNode.set(currentName, updateArray);
                    }
                }
                currentName = jsonParser.nextFieldName();
            }
            if (nextToken == null) {
                nextToken = JsonToken.NOT_AVAILABLE;
            }
            JsonNodeFactory nodeFactory = deserializationContext.getNodeFactory();
            int m5359id = nextToken.m5359id();
            if (m5359id == 1) {
                deserializeObject = deserializeObject(jsonParser, deserializationContext, nodeFactory);
            } else if (m5359id == 3) {
                deserializeObject = deserializeArray(jsonParser, deserializationContext, nodeFactory);
            } else if (m5359id == 6) {
                deserializeObject = nodeFactory.textNode(jsonParser.getText());
            } else if (m5359id != 7) {
                switch (m5359id) {
                    case 9:
                        deserializeObject = nodeFactory.booleanNode(true);
                        break;
                    case 10:
                        deserializeObject = nodeFactory.booleanNode(false);
                        break;
                    case 11:
                        deserializeObject = nodeFactory.nullNode();
                        break;
                    case 12:
                        deserializeObject = _fromEmbedded(jsonParser, deserializationContext, nodeFactory);
                        break;
                    default:
                        deserializeObject = deserializeAny(jsonParser, deserializationContext, nodeFactory);
                        break;
                }
            } else {
                deserializeObject = _fromInt(jsonParser, deserializationContext, nodeFactory);
            }
            JsonNode jsonNode2 = deserializeObject;
            if (jsonNode != null) {
                _handleDuplicateField(jsonParser, deserializationContext, nodeFactory, currentName, objectNode, jsonNode, jsonNode2);
            }
            objectNode.set(currentName, jsonNode2);
            currentName = jsonParser.nextFieldName();
        }
        return objectNode;
    }
}
