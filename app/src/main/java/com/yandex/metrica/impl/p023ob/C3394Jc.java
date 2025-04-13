package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.Jc */
/* loaded from: classes2.dex */
public class C3394Jc {

    /* renamed from: a */
    @NonNull
    public final C4443yd f43242a;

    /* renamed from: b */
    @Nullable
    public final C3344Hc f43243b;

    public C3394Jc(@NonNull C4443yd c4443yd, @Nullable C3344Hc c3344Hc) {
        this.f43242a = c4443yd;
        this.f43243b = c3344Hc;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3394Jc.class != obj.getClass()) {
            return false;
        }
        C3394Jc c3394Jc = (C3394Jc) obj;
        if (!this.f43242a.equals(c3394Jc.f43242a)) {
            return false;
        }
        C3344Hc c3344Hc = this.f43243b;
        C3344Hc c3344Hc2 = c3394Jc.f43243b;
        return c3344Hc != null ? c3344Hc.equals(c3344Hc2) : c3344Hc2 == null;
    }

    public int hashCode() {
        int hashCode = this.f43242a.hashCode() * 31;
        C3344Hc c3344Hc = this.f43243b;
        return hashCode + (c3344Hc != null ? c3344Hc.hashCode() : 0);
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("GplCollectingConfig{providerAccessFlags=");
        m24u.append(this.f43242a);
        m24u.append(", arguments=");
        m24u.append(this.f43243b);
        m24u.append('}');
        return m24u.toString();
    }
}
