package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.um */
/* loaded from: classes3.dex */
public final class C5873um {

    /* renamed from: a */
    public final String f55562a;

    /* renamed from: b */
    public final C5606pv f55563b;

    /* renamed from: c */
    public final C5606pv f55564c;

    /* renamed from: d */
    public final int f55565d;

    /* renamed from: e */
    public final int f55566e;

    public C5873um(String str, C5606pv c5606pv, C5606pv c5606pv2, int i2, int i3) {
        C5220ia.m25473a(i2 == 0 || i3 == 0);
        this.f55562a = C5220ia.m25470a(str);
        this.f55563b = (C5606pv) C5220ia.m25469a(c5606pv);
        this.f55564c = (C5606pv) C5220ia.m25469a(c5606pv2);
        this.f55565d = i2;
        this.f55566e = i3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5873um.class != obj.getClass()) {
            return false;
        }
        C5873um c5873um = (C5873um) obj;
        return this.f55565d == c5873um.f55565d && this.f55566e == c5873um.f55566e && this.f55562a.equals(c5873um.f55562a) && this.f55563b.equals(c5873um.f55563b) && this.f55564c.equals(c5873um.f55564c);
    }

    public final int hashCode() {
        return this.f55564c.hashCode() + ((this.f55563b.hashCode() + o11.m26984a(this.f55562a, (((this.f55565d + 527) * 31) + this.f55566e) * 31, 31)) * 31);
    }
}
