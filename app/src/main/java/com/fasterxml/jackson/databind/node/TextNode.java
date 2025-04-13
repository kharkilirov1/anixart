package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.p006io.CharTypes;
import com.fasterxml.jackson.core.p006io.NumberInput;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import java.io.IOException;

/* loaded from: classes.dex */
public class TextNode extends ValueNode {
    public static final TextNode EMPTY_STRING_NODE = new TextNode("");
    private static final long serialVersionUID = 2;
    public final String _value;

    public TextNode(String str) {
        this._value = str;
    }

    @Deprecated
    public static void appendQuoted(StringBuilder sb, String str) {
        sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
        CharTypes.appendQuoted(sb, str);
        sb.append(JsonFactory.DEFAULT_QUOTE_CHAR);
    }

    public static TextNode valueOf(String str) {
        if (str == null) {
            return null;
        }
        return str.length() == 0 ? EMPTY_STRING_NODE : new TextNode(str);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean asBoolean(boolean z) {
        String str = this._value;
        if (str == null) {
            return z;
        }
        String trim = str.trim();
        if ("true".equals(trim)) {
            return true;
        }
        if ("false".equals(trim)) {
            return false;
        }
        return z;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public double asDouble(double d) {
        return NumberInput.parseAsDouble(this._value, d);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public int asInt(int i2) {
        return NumberInput.parseAsInt(this._value, i2);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public long asLong(long j2) {
        return NumberInput.parseAsLong(this._value, j2);
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public String asText() {
        return this._value;
    }

    @Override // com.fasterxml.jackson.databind.node.ValueNode, com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.core.TreeNode
    public JsonToken asToken() {
        return JsonToken.VALUE_STRING;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public byte[] binaryValue() throws IOException {
        return getBinaryValue(Base64Variants.getDefaultVariant());
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof TextNode)) {
            return ((TextNode) obj)._value.equals(this._value);
        }
        return false;
    }

    public byte[] getBinaryValue(Base64Variant base64Variant) throws IOException {
        String trim = this._value.trim();
        ByteArrayBuilder byteArrayBuilder = new ByteArrayBuilder(((trim.length() * 3) >> 2) + 4);
        try {
            base64Variant.decode(trim, byteArrayBuilder);
            return byteArrayBuilder.toByteArray();
        } catch (IllegalArgumentException e2) {
            throw InvalidFormatException.from(null, String.format("Cannot access contents of TextNode as binary due to broken Base64 encoding: %s", e2.getMessage()), trim, byte[].class);
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public JsonNodeType getNodeType() {
        return JsonNodeType.STRING;
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode
    public int hashCode() {
        return this._value.hashCode();
    }

    @Override // com.fasterxml.jackson.databind.node.BaseJsonNode, com.fasterxml.jackson.databind.JsonSerializable
    public final void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        String str = this._value;
        if (str == null) {
            jsonGenerator.writeNull();
        } else {
            jsonGenerator.writeString(str);
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public String textValue() {
        return this._value;
    }

    @Override // com.fasterxml.jackson.databind.JsonNode
    public String asText(String str) {
        String str2 = this._value;
        return str2 == null ? str : str2;
    }
}
