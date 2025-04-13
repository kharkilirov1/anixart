package com.google.gson;

/* loaded from: classes2.dex */
public final class JsonNull extends JsonElement {

    /* renamed from: a */
    public static final JsonNull f23667a = new JsonNull();

    @Deprecated
    public JsonNull() {
    }

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof JsonNull);
    }

    public int hashCode() {
        return JsonNull.class.hashCode();
    }
}
