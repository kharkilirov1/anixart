package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import p000a.C0000a;

/* renamed from: com.yandex.mobile.ads.impl.ey */
/* loaded from: classes3.dex */
public final class C5049ey {

    /* renamed from: a */
    private final String f50073a;

    /* renamed from: b */
    private final String f50074b;

    public C5049ey(String str, String str2) {
        this.f50073a = str;
        this.f50074b = str2;
    }

    /* renamed from: a */
    public final String m24278a() {
        return this.f50073a;
    }

    /* renamed from: b */
    public final String m24279b() {
        return this.f50074b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5049ey.class != obj.getClass()) {
            return false;
        }
        C5049ey c5049ey = (C5049ey) obj;
        return TextUtils.equals(this.f50073a, c5049ey.f50073a) && TextUtils.equals(this.f50074b, c5049ey.f50074b);
    }

    public final int hashCode() {
        return this.f50074b.hashCode() + (this.f50073a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder m26356a = l60.m26356a("Header[name=");
        m26356a.append(this.f50073a);
        m26356a.append(",value=");
        return C0000a.m20q(m26356a, this.f50074b, "]");
    }
}
