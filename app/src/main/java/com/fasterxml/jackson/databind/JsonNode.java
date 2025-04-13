package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonPointer;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.node.JsonNodeType;
import com.fasterxml.jackson.databind.node.MissingNode;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000a.C0000a;

/* loaded from: classes.dex */
public abstract class JsonNode extends JsonSerializable.Base implements TreeNode, Iterable<JsonNode> {

    /* renamed from: com.fasterxml.jackson.databind.JsonNode$1 */
    public static /* synthetic */ class C08371 {
        public static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$databind$node$JsonNodeType;

        static {
            int[] iArr = new int[JsonNodeType.values().length];
            $SwitchMap$com$fasterxml$jackson$databind$node$JsonNodeType = iArr;
            try {
                iArr[JsonNodeType.ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$databind$node$JsonNodeType[JsonNodeType.OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$databind$node$JsonNodeType[JsonNodeType.MISSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public abstract JsonNode _at(JsonPointer jsonPointer);

    public <T> T _reportRequiredViolation(String str, Object... objArr) {
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends JsonNode> T _this() {
        return this;
    }

    public boolean asBoolean() {
        return asBoolean(false);
    }

    public boolean asBoolean(boolean z) {
        return z;
    }

    public double asDouble() {
        return asDouble(0.0d);
    }

    public double asDouble(double d) {
        return d;
    }

    public int asInt() {
        return asInt(0);
    }

    public int asInt(int i2) {
        return i2;
    }

    public long asLong() {
        return asLong(0L);
    }

    public long asLong(long j2) {
        return j2;
    }

    public abstract String asText();

    public String asText(String str) {
        String asText = asText();
        return asText == null ? str : asText;
    }

    public BigInteger bigIntegerValue() {
        return BigInteger.ZERO;
    }

    public byte[] binaryValue() throws IOException {
        return null;
    }

    public boolean booleanValue() {
        return false;
    }

    public boolean canConvertToInt() {
        return false;
    }

    public boolean canConvertToLong() {
        return false;
    }

    public BigDecimal decimalValue() {
        return BigDecimal.ZERO;
    }

    public abstract <T extends JsonNode> T deepCopy();

    public double doubleValue() {
        return 0.0d;
    }

    public Iterator<JsonNode> elements() {
        return ClassUtil.emptyIterator();
    }

    public abstract boolean equals(Object obj);

    public boolean equals(Comparator<JsonNode> comparator, JsonNode jsonNode) {
        return comparator.compare(this, jsonNode) == 0;
    }

    @Override // com.fasterxml.jackson.core.TreeNode
    public Iterator<String> fieldNames() {
        return ClassUtil.emptyIterator();
    }

    public Iterator<Map.Entry<String, JsonNode>> fields() {
        return ClassUtil.emptyIterator();
    }

    public abstract JsonNode findParent(String str);

    public final List<JsonNode> findParents(String str) {
        List<JsonNode> findParents = findParents(str, null);
        return findParents == null ? Collections.emptyList() : findParents;
    }

    public abstract List<JsonNode> findParents(String str, List<JsonNode> list);

    public abstract JsonNode findPath(String str);

    public abstract JsonNode findValue(String str);

    public final List<JsonNode> findValues(String str) {
        List<JsonNode> findValues = findValues(str, null);
        return findValues == null ? Collections.emptyList() : findValues;
    }

    public abstract List<JsonNode> findValues(String str, List<JsonNode> list);

    public final List<String> findValuesAsText(String str) {
        List<String> findValuesAsText = findValuesAsText(str, null);
        return findValuesAsText == null ? Collections.emptyList() : findValuesAsText;
    }

    public abstract List<String> findValuesAsText(String str, List<String> list);

    public float floatValue() {
        return 0.0f;
    }

    @Override // com.fasterxml.jackson.core.TreeNode
    public abstract JsonNode get(int i2);

    @Override // com.fasterxml.jackson.core.TreeNode
    public JsonNode get(String str) {
        return null;
    }

    public abstract JsonNodeType getNodeType();

    public boolean has(String str) {
        return get(str) != null;
    }

    public boolean hasNonNull(String str) {
        JsonNode jsonNode = get(str);
        return (jsonNode == null || jsonNode.isNull()) ? false : true;
    }

    public int intValue() {
        return 0;
    }

    @Override // com.fasterxml.jackson.core.TreeNode
    public boolean isArray() {
        return false;
    }

    public boolean isBigDecimal() {
        return false;
    }

    public boolean isBigInteger() {
        return false;
    }

    public final boolean isBinary() {
        return getNodeType() == JsonNodeType.BINARY;
    }

    public final boolean isBoolean() {
        return getNodeType() == JsonNodeType.BOOLEAN;
    }

    @Override // com.fasterxml.jackson.core.TreeNode
    public final boolean isContainerNode() {
        JsonNodeType nodeType = getNodeType();
        return nodeType == JsonNodeType.OBJECT || nodeType == JsonNodeType.ARRAY;
    }

    public boolean isDouble() {
        return false;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean isFloat() {
        return false;
    }

    public boolean isFloatingPointNumber() {
        return false;
    }

    public boolean isInt() {
        return false;
    }

    public boolean isIntegralNumber() {
        return false;
    }

    public boolean isLong() {
        return false;
    }

    @Override // com.fasterxml.jackson.core.TreeNode
    public boolean isMissingNode() {
        return false;
    }

    public final boolean isNull() {
        return getNodeType() == JsonNodeType.NULL;
    }

    public final boolean isNumber() {
        return getNodeType() == JsonNodeType.NUMBER;
    }

    @Override // com.fasterxml.jackson.core.TreeNode
    public boolean isObject() {
        return false;
    }

    public final boolean isPojo() {
        return getNodeType() == JsonNodeType.POJO;
    }

    public boolean isShort() {
        return false;
    }

    public final boolean isTextual() {
        return getNodeType() == JsonNodeType.STRING;
    }

    @Override // com.fasterxml.jackson.core.TreeNode
    public final boolean isValueNode() {
        int i2 = C08371.$SwitchMap$com$fasterxml$jackson$databind$node$JsonNodeType[getNodeType().ordinal()];
        return (i2 == 1 || i2 == 2 || i2 == 3) ? false : true;
    }

    @Override // java.lang.Iterable
    public final Iterator<JsonNode> iterator() {
        return elements();
    }

    public long longValue() {
        return 0L;
    }

    public Number numberValue() {
        return null;
    }

    @Override // com.fasterxml.jackson.core.TreeNode
    public abstract JsonNode path(int i2);

    @Override // com.fasterxml.jackson.core.TreeNode
    public abstract JsonNode path(String str);

    public <T extends JsonNode> T require() throws IllegalArgumentException {
        return (T) _this();
    }

    public <T extends JsonNode> T requireNonNull() throws IllegalArgumentException {
        return (T) _this();
    }

    public JsonNode required(String str) throws IllegalArgumentException {
        return (JsonNode) _reportRequiredViolation("Node of type `%s` has no fields", getClass().getName());
    }

    public JsonNode requiredAt(String str) throws IllegalArgumentException {
        return requiredAt(JsonPointer.compile(str));
    }

    public short shortValue() {
        return (short) 0;
    }

    @Override // com.fasterxml.jackson.core.TreeNode
    public int size() {
        return 0;
    }

    public String textValue() {
        return null;
    }

    public String toPrettyString() {
        return toString();
    }

    public abstract String toString();

    public <T extends JsonNode> T with(String str) {
        StringBuilder m24u = C0000a.m24u("JsonNode not of type ObjectNode (but ");
        m24u.append(getClass().getName());
        m24u.append("), cannot call with() on it");
        throw new UnsupportedOperationException(m24u.toString());
    }

    public <T extends JsonNode> T withArray(String str) {
        StringBuilder m24u = C0000a.m24u("JsonNode not of type ObjectNode (but ");
        m24u.append(getClass().getName());
        m24u.append("), cannot call withArray() on it");
        throw new UnsupportedOperationException(m24u.toString());
    }

    public boolean has(int i2) {
        return get(i2) != null;
    }

    public JsonNode required(int i2) throws IllegalArgumentException {
        return (JsonNode) _reportRequiredViolation("Node of type `%s` has no indexed values", getClass().getName());
    }

    public final JsonNode requiredAt(JsonPointer jsonPointer) throws IllegalArgumentException {
        JsonNode jsonNode = this;
        for (JsonPointer jsonPointer2 = jsonPointer; !jsonPointer2.matches(); jsonPointer2 = jsonPointer2.tail()) {
            jsonNode = jsonNode._at(jsonPointer2);
            if (jsonNode == null) {
                _reportRequiredViolation("No node at '%s' (unmatched part: '%s')", jsonPointer, jsonPointer2);
            }
        }
        return jsonNode;
    }

    @Override // com.fasterxml.jackson.core.TreeNode
    /* renamed from: at */
    public final JsonNode mo5360at(JsonPointer jsonPointer) {
        if (jsonPointer.matches()) {
            return this;
        }
        JsonNode _at = _at(jsonPointer);
        if (_at == null) {
            return MissingNode.getInstance();
        }
        return _at.mo5360at(jsonPointer.tail());
    }

    public boolean hasNonNull(int i2) {
        JsonNode jsonNode = get(i2);
        return (jsonNode == null || jsonNode.isNull()) ? false : true;
    }

    @Override // com.fasterxml.jackson.core.TreeNode
    /* renamed from: at */
    public final JsonNode mo5361at(String str) {
        return mo5360at(JsonPointer.compile(str));
    }
}
