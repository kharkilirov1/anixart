package com.google.gson;

import com.google.gson.internal.LinkedTreeMap;

/* loaded from: classes2.dex */
public final class JsonObject extends JsonElement {

    /* renamed from: a */
    public final LinkedTreeMap<String, JsonElement> f23668a = new LinkedTreeMap<>(LinkedTreeMap.f23735i);

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof JsonObject) && ((JsonObject) obj).f23668a.equals(this.f23668a));
    }

    public int hashCode() {
        return this.f23668a.hashCode();
    }
}
