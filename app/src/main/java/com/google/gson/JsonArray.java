package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class JsonArray extends JsonElement implements Iterable<JsonElement> {

    /* renamed from: b */
    public final List<JsonElement> f23666b = new ArrayList();

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof JsonArray) && ((JsonArray) obj).f23666b.equals(this.f23666b));
    }

    @Override // com.google.gson.JsonElement
    /* renamed from: f */
    public long mo12840f() {
        if (this.f23666b.size() == 1) {
            return this.f23666b.get(0).mo12840f();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.JsonElement
    /* renamed from: g */
    public String mo12841g() {
        if (this.f23666b.size() == 1) {
            return this.f23666b.get(0).mo12841g();
        }
        throw new IllegalStateException();
    }

    public int hashCode() {
        return this.f23666b.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator<JsonElement> iterator() {
        return this.f23666b.iterator();
    }
}
