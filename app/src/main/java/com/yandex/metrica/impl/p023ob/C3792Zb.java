package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Zb */
/* loaded from: classes2.dex */
public final class C3792Zb {

    /* renamed from: a */
    private final String f44642a;

    /* renamed from: b */
    private final int f44643b;

    /* renamed from: c */
    private final boolean f44644c;

    public C3792Zb(@NonNull JSONObject jSONObject) throws JSONException {
        this.f44642a = jSONObject.getString("name");
        this.f44644c = jSONObject.getBoolean("required");
        this.f44643b = jSONObject.optInt("version", -1);
    }

    /* renamed from: a */
    public JSONObject m19507a() throws JSONException {
        JSONObject put = new JSONObject().put("name", this.f44642a).put("required", this.f44644c);
        int i2 = this.f44643b;
        if (i2 != -1) {
            put.put("version", i2);
        }
        return put;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3792Zb.class != obj.getClass()) {
            return false;
        }
        C3792Zb c3792Zb = (C3792Zb) obj;
        if (this.f44643b != c3792Zb.f44643b || this.f44644c != c3792Zb.f44644c) {
            return false;
        }
        String str = this.f44642a;
        String str2 = c3792Zb.f44642a;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public int hashCode() {
        String str = this.f44642a;
        return ((((str != null ? str.hashCode() : 0) * 31) + this.f44643b) * 31) + (this.f44644c ? 1 : 0);
    }

    public C3792Zb(String str, int i2, boolean z) {
        this.f44642a = str;
        this.f44643b = i2;
        this.f44644c = z;
    }
}
