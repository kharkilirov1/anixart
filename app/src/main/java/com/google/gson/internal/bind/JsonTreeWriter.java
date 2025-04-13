package com.google.gson.internal.bind;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class JsonTreeWriter extends JsonWriter {

    /* renamed from: p */
    public static final Writer f23779p = new Writer() { // from class: com.google.gson.internal.bind.JsonTreeWriter.1
        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i2, int i3) {
            throw new AssertionError();
        }
    };

    /* renamed from: q */
    public static final JsonPrimitive f23780q = new JsonPrimitive("closed");

    /* renamed from: m */
    public final List<JsonElement> f23781m;

    /* renamed from: n */
    public String f23782n;

    /* renamed from: o */
    public JsonElement f23783o;

    public JsonTreeWriter() {
        super(f23779p);
        this.f23781m = new ArrayList();
        this.f23783o = JsonNull.f23667a;
    }

    /* renamed from: B */
    public final JsonElement m12916B() {
        return this.f23781m.get(r0.size() - 1);
    }

    /* renamed from: C */
    public final void m12917C(JsonElement jsonElement) {
        if (this.f23782n != null) {
            if (!(jsonElement instanceof JsonNull) || this.f23924j) {
                JsonObject jsonObject = (JsonObject) m12916B();
                jsonObject.f23668a.put(this.f23782n, jsonElement);
            }
            this.f23782n = null;
            return;
        }
        if (this.f23781m.isEmpty()) {
            this.f23783o = jsonElement;
            return;
        }
        JsonElement m12916B = m12916B();
        if (!(m12916B instanceof JsonArray)) {
            throw new IllegalStateException();
        }
        ((JsonArray) m12916B).f23666b.add(jsonElement);
    }

    @Override // com.google.gson.stream.JsonWriter
    /* renamed from: b */
    public JsonWriter mo12918b() throws IOException {
        JsonArray jsonArray = new JsonArray();
        m12917C(jsonArray);
        this.f23781m.add(jsonArray);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    /* renamed from: c */
    public JsonWriter mo12919c() throws IOException {
        JsonObject jsonObject = new JsonObject();
        m12917C(jsonObject);
        this.f23781m.add(jsonObject);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.f23781m.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.f23781m.add(f23780q);
    }

    @Override // com.google.gson.stream.JsonWriter, java.io.Flushable
    public void flush() throws IOException {
    }

    @Override // com.google.gson.stream.JsonWriter
    /* renamed from: g */
    public JsonWriter mo12920g() throws IOException {
        if (this.f23781m.isEmpty() || this.f23782n != null) {
            throw new IllegalStateException();
        }
        if (!(m12916B() instanceof JsonArray)) {
            throw new IllegalStateException();
        }
        this.f23781m.remove(r0.size() - 1);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    /* renamed from: h */
    public JsonWriter mo12921h() throws IOException {
        if (this.f23781m.isEmpty() || this.f23782n != null) {
            throw new IllegalStateException();
        }
        if (!(m12916B() instanceof JsonObject)) {
            throw new IllegalStateException();
        }
        this.f23781m.remove(r0.size() - 1);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    /* renamed from: i */
    public JsonWriter mo12922i(String str) throws IOException {
        Objects.requireNonNull(str, "name == null");
        if (this.f23781m.isEmpty() || this.f23782n != null) {
            throw new IllegalStateException();
        }
        if (!(m12916B() instanceof JsonObject)) {
            throw new IllegalStateException();
        }
        this.f23782n = str;
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    /* renamed from: k */
    public JsonWriter mo12923k() throws IOException {
        m12917C(JsonNull.f23667a);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    /* renamed from: p */
    public JsonWriter mo12924p(long j2) throws IOException {
        m12917C(new JsonPrimitive(Long.valueOf(j2)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    /* renamed from: q */
    public JsonWriter mo12925q(Boolean bool) throws IOException {
        if (bool == null) {
            m12917C(JsonNull.f23667a);
            return this;
        }
        m12917C(new JsonPrimitive(bool));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    /* renamed from: u */
    public JsonWriter mo12926u(Number number) throws IOException {
        if (number == null) {
            m12917C(JsonNull.f23667a);
            return this;
        }
        if (!this.f23921g) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        m12917C(new JsonPrimitive(number));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    /* renamed from: v */
    public JsonWriter mo12927v(String str) throws IOException {
        if (str == null) {
            m12917C(JsonNull.f23667a);
            return this;
        }
        m12917C(new JsonPrimitive(str));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    /* renamed from: w */
    public JsonWriter mo12928w(boolean z) throws IOException {
        m12917C(new JsonPrimitive(Boolean.valueOf(z)));
        return this;
    }
}
