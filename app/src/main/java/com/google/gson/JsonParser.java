package com.google.gson;

import com.google.gson.internal.Streams;
import com.google.gson.stream.JsonReader;

/* loaded from: classes2.dex */
public final class JsonParser {
    @Deprecated
    public JsonParser() {
    }

    /* renamed from: a */
    public static JsonElement m12846a(JsonReader jsonReader) throws JsonIOException, JsonSyntaxException {
        boolean z = jsonReader.f23889c;
        jsonReader.f23889c = true;
        try {
            try {
                try {
                    return Streams.m12891a(jsonReader);
                } catch (StackOverflowError e2) {
                    throw new JsonParseException("Failed parsing JSON source: " + jsonReader + " to Json", e2);
                }
            } catch (OutOfMemoryError e3) {
                throw new JsonParseException("Failed parsing JSON source: " + jsonReader + " to Json", e3);
            }
        } finally {
            jsonReader.f23889c = z;
        }
    }
}
