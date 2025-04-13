package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonPointer;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.util.RawValue;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import p000a.C0000a;

/* loaded from: classes.dex */
public class ArrayNode extends ContainerNode<ArrayNode> {
    private static final long serialVersionUID = 1;
    private final List<JsonNode> _children;

    public ArrayNode(JsonNodeFactory jsonNodeFactory) {
        super(jsonNodeFactory);
        this._children = new ArrayList();
    }

    public ArrayNode _add(JsonNode jsonNode) {
        this._children.add(jsonNode);
        return this;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public JsonNode _at(JsonPointer jsonPointer) {
        return get(jsonPointer.getMatchingIndex());
    }

    public boolean _childrenEqual(ArrayNode arrayNode) {
        return this._children.equals(arrayNode._children);
    }

    public ArrayNode _insert(int i2, JsonNode jsonNode) {
        if (i2 < 0) {
            this._children.add(0, jsonNode);
        } else if (i2 >= this._children.size()) {
            this._children.add(jsonNode);
        } else {
            this._children.add(i2, jsonNode);
        }
        return this;
    }

    public ArrayNode add(JsonNode jsonNode) {
        if (jsonNode == null) {
            jsonNode = nullNode();
        }
        _add(jsonNode);
        return this;
    }

    public ArrayNode addAll(ArrayNode arrayNode) {
        this._children.addAll(arrayNode._children);
        return this;
    }

    public ArrayNode addArray() {
        ArrayNode arrayNode = arrayNode();
        _add(arrayNode);
        return arrayNode;
    }

    public ArrayNode addNull() {
        _add(nullNode());
        return this;
    }

    public ObjectNode addObject() {
        ObjectNode objectNode = objectNode();
        _add(objectNode);
        return objectNode;
    }

    public ArrayNode addPOJO(Object obj) {
        if (obj == null) {
            addNull();
        } else {
            _add(pojoNode(obj));
        }
        return this;
    }

    public ArrayNode addRawValue(RawValue rawValue) {
        if (rawValue == null) {
            addNull();
        } else {
            _add(rawValueNode(rawValue));
        }
        return this;
    }

    @Override // com.fasterxml.jackson.databind.node.ContainerNode, com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.core.TreeNode
    public JsonToken asToken() {
        return JsonToken.START_ARRAY;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public Iterator<JsonNode> elements() {
        return this._children.iterator();
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean equals(Comparator<JsonNode> comparator, JsonNode jsonNode) {
        if (!(jsonNode instanceof ArrayNode)) {
            return false;
        }
        ArrayNode arrayNode = (ArrayNode) jsonNode;
        int size = this._children.size();
        if (arrayNode.size() != size) {
            return false;
        }
        List<JsonNode> list = this._children;
        List<JsonNode> list2 = arrayNode._children;
        for (int i2 = 0; i2 < size; i2++) {
            if (!list.get(i2).equals(comparator, list2.get(i2))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public List<JsonNode> findParents(String str, List<JsonNode> list) {
        Iterator<JsonNode> it = this._children.iterator();
        while (it.hasNext()) {
            list = it.next().findParents(str, list);
        }
        return list;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public JsonNode findValue(String str) {
        Iterator<JsonNode> it = this._children.iterator();
        while (it.hasNext()) {
            JsonNode findValue = it.next().findValue(str);
            if (findValue != null) {
                return findValue;
            }
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public List<JsonNode> findValues(String str, List<JsonNode> list) {
        Iterator<JsonNode> it = this._children.iterator();
        while (it.hasNext()) {
            list = it.next().findValues(str, list);
        }
        return list;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public List<String> findValuesAsText(String str, List<String> list) {
        Iterator<JsonNode> it = this._children.iterator();
        while (it.hasNext()) {
            list = it.next().findValuesAsText(str, list);
        }
        return list;
    }

    @Override // com.fasterxml.jackson.databind.node.ContainerNode, com.fasterxml.jackson.databind.JsonNode, com.fasterxml.jackson.core.TreeNode
    public JsonNode get(String str) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public JsonNodeType getNodeType() {
        return JsonNodeType.ARRAY;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode
    public int hashCode() {
        return this._children.hashCode();
    }

    public ArrayNode insert(int i2, JsonNode jsonNode) {
        if (jsonNode == null) {
            jsonNode = nullNode();
        }
        _insert(i2, jsonNode);
        return this;
    }

    public ArrayNode insertArray(int i2) {
        ArrayNode arrayNode = arrayNode();
        _insert(i2, arrayNode);
        return arrayNode;
    }

    public ArrayNode insertNull(int i2) {
        _insert(i2, nullNode());
        return this;
    }

    public ObjectNode insertObject(int i2) {
        ObjectNode objectNode = objectNode();
        _insert(i2, objectNode);
        return objectNode;
    }

    public ArrayNode insertPOJO(int i2, Object obj) {
        return obj == null ? insertNull(i2) : _insert(i2, pojoNode(obj));
    }

    @Override // com.fasterxml.jackson.databind.JsonNode, com.fasterxml.jackson.core.TreeNode
    public boolean isArray() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializable.Base
    public boolean isEmpty(SerializerProvider serializerProvider) {
        return this._children.isEmpty();
    }

    public JsonNode remove(int i2) {
        if (i2 < 0 || i2 >= this._children.size()) {
            return null;
        }
        return this._children.remove(i2);
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.JsonNode
    public JsonNode required(int i2) {
        return (i2 < 0 || i2 >= this._children.size()) ? (JsonNode) _reportRequiredViolation("No value at index #%d [0, %d) of `ArrayNode`", Integer.valueOf(i2), Integer.valueOf(this._children.size())) : this._children.get(i2);
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.JsonSerializable
    public void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        List<JsonNode> list = this._children;
        int size = list.size();
        jsonGenerator.writeStartArray(this, size);
        for (int i2 = 0; i2 < size; i2++) {
            ((BaseJsonNode) list.get(i2)).serialize(jsonGenerator, serializerProvider);
        }
        jsonGenerator.writeEndArray();
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.JsonSerializable
    public void serializeWithType(JsonGenerator jsonGenerator, SerializerProvider serializerProvider, TypeSerializer typeSerializer) throws IOException {
        WritableTypeId writeTypePrefix = typeSerializer.writeTypePrefix(jsonGenerator, typeSerializer.typeId(this, JsonToken.START_ARRAY));
        Iterator<JsonNode> it = this._children.iterator();
        while (it.hasNext()) {
            ((BaseJsonNode) it.next()).serialize(jsonGenerator, serializerProvider);
        }
        typeSerializer.writeTypeSuffix(jsonGenerator, writeTypePrefix);
    }

    public JsonNode set(int i2, JsonNode jsonNode) {
        if (jsonNode == null) {
            jsonNode = nullNode();
        }
        if (i2 >= 0 && i2 < this._children.size()) {
            return this._children.set(i2, jsonNode);
        }
        StringBuilder m25v = C0000a.m25v("Illegal index ", i2, ", array size ");
        m25v.append(size());
        throw new IndexOutOfBoundsException(m25v.toString());
    }

    @Override // com.fasterxml.jackson.databind.node.ContainerNode, com.fasterxml.jackson.databind.JsonNode, com.fasterxml.jackson.core.TreeNode
    public int size() {
        return this._children.size();
    }

    public ArrayNode addAll(Collection<? extends JsonNode> collection) {
        Iterator<? extends JsonNode> it = collection.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
        return this;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public ArrayNode deepCopy() {
        ArrayNode arrayNode = new ArrayNode(this._nodeFactory);
        Iterator<JsonNode> it = this._children.iterator();
        while (it.hasNext()) {
            arrayNode._children.add(it.next().deepCopy());
        }
        return arrayNode;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public ObjectNode findParent(String str) {
        Iterator<JsonNode> it = this._children.iterator();
        while (it.hasNext()) {
            JsonNode findParent = it.next().findParent(str);
            if (findParent != null) {
                return (ObjectNode) findParent;
            }
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean isEmpty() {
        return this._children.isEmpty();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.fasterxml.jackson.databind.node.ContainerNode
    public ArrayNode removeAll() {
        this._children.clear();
        return this;
    }

    public ArrayNode(JsonNodeFactory jsonNodeFactory, int i2) {
        super(jsonNodeFactory);
        this._children = new ArrayList(i2);
    }

    public ArrayNode add(int i2) {
        _add(numberNode(i2));
        return this;
    }

    @Override // com.fasterxml.jackson.databind.node.ContainerNode, com.fasterxml.jackson.databind.JsonNode, com.fasterxml.jackson.core.TreeNode
    public JsonNode get(int i2) {
        if (i2 < 0 || i2 >= this._children.size()) {
            return null;
        }
        return this._children.get(i2);
    }

    public ArrayNode insert(int i2, int i3) {
        _insert(i2, numberNode(i3));
        return this;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode, com.fasterxml.jackson.core.TreeNode
    public JsonNode path(String str) {
        return MissingNode.getInstance();
    }

    public ArrayNode add(Integer num) {
        if (num == null) {
            return addNull();
        }
        return _add(numberNode(num.intValue()));
    }

    public ArrayNode insert(int i2, Integer num) {
        if (num == null) {
            insertNull(i2);
        } else {
            _insert(i2, numberNode(num.intValue()));
        }
        return this;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode, com.fasterxml.jackson.core.TreeNode
    public JsonNode path(int i2) {
        if (i2 >= 0 && i2 < this._children.size()) {
            return this._children.get(i2);
        }
        return MissingNode.getInstance();
    }

    public ArrayNode(JsonNodeFactory jsonNodeFactory, List<JsonNode> list) {
        super(jsonNodeFactory);
        this._children = list;
    }

    public ArrayNode add(long j2) {
        return _add(numberNode(j2));
    }

    public ArrayNode insert(int i2, long j2) {
        return _insert(i2, numberNode(j2));
    }

    public ArrayNode add(Long l2) {
        if (l2 == null) {
            return addNull();
        }
        return _add(numberNode(l2.longValue()));
    }

    public ArrayNode insert(int i2, Long l2) {
        if (l2 == null) {
            return insertNull(i2);
        }
        return _insert(i2, numberNode(l2.longValue()));
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ArrayNode)) {
            return this._children.equals(((ArrayNode) obj)._children);
        }
        return false;
    }

    public ArrayNode add(float f2) {
        return _add(numberNode(f2));
    }

    public ArrayNode insert(int i2, float f2) {
        return _insert(i2, numberNode(f2));
    }

    public ArrayNode add(Float f2) {
        if (f2 == null) {
            return addNull();
        }
        return _add(numberNode(f2.floatValue()));
    }

    public ArrayNode insert(int i2, Float f2) {
        if (f2 == null) {
            return insertNull(i2);
        }
        return _insert(i2, numberNode(f2.floatValue()));
    }

    public ArrayNode add(double d) {
        return _add(numberNode(d));
    }

    public ArrayNode insert(int i2, double d) {
        return _insert(i2, numberNode(d));
    }

    public ArrayNode add(Double d) {
        if (d == null) {
            return addNull();
        }
        return _add(numberNode(d.doubleValue()));
    }

    public ArrayNode insert(int i2, Double d) {
        if (d == null) {
            return insertNull(i2);
        }
        return _insert(i2, numberNode(d.doubleValue()));
    }

    public ArrayNode add(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return addNull();
        }
        return _add(numberNode(bigDecimal));
    }

    public ArrayNode insert(int i2, BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return insertNull(i2);
        }
        return _insert(i2, numberNode(bigDecimal));
    }

    public ArrayNode add(BigInteger bigInteger) {
        if (bigInteger == null) {
            return addNull();
        }
        return _add(numberNode(bigInteger));
    }

    public ArrayNode insert(int i2, BigInteger bigInteger) {
        if (bigInteger == null) {
            return insertNull(i2);
        }
        return _insert(i2, numberNode(bigInteger));
    }

    public ArrayNode add(String str) {
        if (str == null) {
            return addNull();
        }
        return _add(textNode(str));
    }

    public ArrayNode insert(int i2, String str) {
        if (str == null) {
            return insertNull(i2);
        }
        return _insert(i2, textNode(str));
    }

    public ArrayNode add(boolean z) {
        return _add(booleanNode(z));
    }

    public ArrayNode insert(int i2, boolean z) {
        return _insert(i2, booleanNode(z));
    }

    public ArrayNode add(Boolean bool) {
        if (bool == null) {
            return addNull();
        }
        return _add(booleanNode(bool.booleanValue()));
    }

    public ArrayNode insert(int i2, Boolean bool) {
        if (bool == null) {
            return insertNull(i2);
        }
        return _insert(i2, booleanNode(bool.booleanValue()));
    }

    public ArrayNode add(byte[] bArr) {
        if (bArr == null) {
            return addNull();
        }
        return _add(binaryNode(bArr));
    }

    public ArrayNode insert(int i2, byte[] bArr) {
        if (bArr == null) {
            return insertNull(i2);
        }
        return _insert(i2, binaryNode(bArr));
    }
}
