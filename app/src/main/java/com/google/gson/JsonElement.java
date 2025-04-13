package com.google.gson;

import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;

/* loaded from: classes2.dex */
public abstract class JsonElement {
    /* renamed from: b */
    public JsonArray m12843b() {
        if (this instanceof JsonArray) {
            return (JsonArray) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    /* renamed from: d */
    public JsonObject m12844d() {
        if (this instanceof JsonObject) {
            return (JsonObject) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    /* renamed from: e */
    public JsonPrimitive m12845e() {
        if (this instanceof JsonPrimitive) {
            return (JsonPrimitive) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    /* renamed from: f */
    public long mo12840f() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: g */
    public String mo12841g() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            jsonWriter.f23921g = true;
            TypeAdapters.f23825A.mo12838c(jsonWriter, this);
            return stringWriter.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }
}
