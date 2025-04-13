package com.yandex.metrica.impl.p023ob;

import androidx.annotation.Nullable;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.H0 */
/* loaded from: classes2.dex */
public class C3332H0 {

    /* renamed from: a */
    private C3329Gm f43027a = new C3329Gm();

    /* renamed from: b */
    private C3455Ln f43028b;

    public C3332H0(C3455Ln c3455Ln) {
        this.f43028b = c3455Ln;
    }

    /* renamed from: a */
    public void m18184a(String str, String str2) {
        this.f43028b.m18526b(this.f43027a, str, str2);
    }

    @Nullable
    /* renamed from: a */
    public String m18183a() {
        if (this.f43027a.isEmpty()) {
            return null;
        }
        return new JSONObject(this.f43027a).toString();
    }
}
