package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import java.io.IOException;

/* loaded from: classes.dex */
public class StackTraceElementDeserializer extends StdScalarDeserializer<StackTraceElement> {
    private static final long serialVersionUID = 1;

    public StackTraceElementDeserializer() {
        super((Class<?>) StackTraceElement.class);
    }

    @Deprecated
    public StackTraceElement constructValue(DeserializationContext deserializationContext, String str, String str2, String str3, int i2, String str4, String str5) {
        return constructValue(deserializationContext, str, str2, str3, i2, str4, str5, null);
    }

    public StackTraceElement constructValue(DeserializationContext deserializationContext, String str, String str2, String str3, int i2, String str4, String str5, String str6) {
        return new StackTraceElement(str, str2, str3, i2);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public StackTraceElement deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonToken currentToken = jsonParser.currentToken();
        if (currentToken != JsonToken.START_OBJECT) {
            if (currentToken != JsonToken.START_ARRAY || !deserializationContext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                return (StackTraceElement) deserializationContext.handleUnexpectedToken(this._valueClass, jsonParser);
            }
            jsonParser.nextToken();
            StackTraceElement deserialize = deserialize(jsonParser, deserializationContext);
            if (jsonParser.nextToken() != JsonToken.END_ARRAY) {
                handleMissingEndArrayForSingle(jsonParser, deserializationContext);
            }
            return deserialize;
        }
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = "";
        String str5 = str4;
        String str6 = str5;
        int i2 = -1;
        while (true) {
            JsonToken nextValue = jsonParser.nextValue();
            if (nextValue == JsonToken.END_OBJECT) {
                return constructValue(deserializationContext, str4, str5, str6, i2, str, str2, str3);
            }
            String currentName = jsonParser.getCurrentName();
            if ("className".equals(currentName)) {
                str4 = jsonParser.getText();
            } else if ("classLoaderName".equals(currentName)) {
                str3 = jsonParser.getText();
            } else if ("fileName".equals(currentName)) {
                str6 = jsonParser.getText();
            } else if ("lineNumber".equals(currentName)) {
                i2 = nextValue.isNumeric() ? jsonParser.getIntValue() : _parseIntPrimitive(jsonParser, deserializationContext);
            } else if ("methodName".equals(currentName)) {
                str5 = jsonParser.getText();
            } else if (!"nativeMethod".equals(currentName)) {
                if ("moduleName".equals(currentName)) {
                    str = jsonParser.getText();
                } else if ("moduleVersion".equals(currentName)) {
                    str2 = jsonParser.getText();
                } else if (!"declaringClass".equals(currentName) && !"format".equals(currentName)) {
                    handleUnknownProperty(jsonParser, deserializationContext, this._valueClass, currentName);
                }
            }
            jsonParser.skipChildren();
        }
    }
}
