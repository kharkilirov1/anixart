package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.Ec */
/* loaded from: classes2.dex */
public class C3269Ec {

    /* renamed from: a */
    @NonNull
    public final C4443yd f42804a;

    /* renamed from: b */
    @Nullable
    public final C3244Dc f42805b;

    public C3269Ec(@NonNull C4443yd c4443yd, @Nullable C3244Dc c3244Dc) {
        this.f42804a = c4443yd;
        this.f42805b = c3244Dc;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3269Ec.class != obj.getClass()) {
            return false;
        }
        C3269Ec c3269Ec = (C3269Ec) obj;
        if (!this.f42804a.equals(c3269Ec.f42804a)) {
            return false;
        }
        C3244Dc c3244Dc = this.f42805b;
        C3244Dc c3244Dc2 = c3269Ec.f42805b;
        return c3244Dc != null ? c3244Dc.equals(c3244Dc2) : c3244Dc2 == null;
    }

    public int hashCode() {
        int hashCode = this.f42804a.hashCode() * 31;
        C3244Dc c3244Dc = this.f42805b;
        return hashCode + (c3244Dc != null ? c3244Dc.hashCode() : 0);
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("ForcedCollectingConfig{providerAccessFlags=");
        m24u.append(this.f42804a);
        m24u.append(", arguments=");
        m24u.append(this.f42805b);
        m24u.append('}');
        return m24u.toString();
    }
}
