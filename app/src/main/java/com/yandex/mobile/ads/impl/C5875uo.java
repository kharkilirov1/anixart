package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import androidx.annotation.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.uo */
/* loaded from: classes3.dex */
public final class C5875uo implements InterfaceC5589pf {

    /* renamed from: a */
    public final int f55595a;

    /* renamed from: b */
    public final int f55596b;

    /* renamed from: c */
    public final int f55597c;

    static {
        jp1 jp1Var = jp1.f51690D;
    }

    public C5875uo(int i2, int i3, int i4) {
        this.f55595a = i2;
        this.f55596b = i3;
        this.f55597c = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static C5875uo m29059a(Bundle bundle) {
        return new C5875uo(bundle.getInt(Integer.toString(0, 36), 0), bundle.getInt(Integer.toString(1, 36), 0), bundle.getInt(Integer.toString(2, 36), 0));
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5875uo)) {
            return false;
        }
        C5875uo c5875uo = (C5875uo) obj;
        return this.f55595a == c5875uo.f55595a && this.f55596b == c5875uo.f55596b && this.f55597c == c5875uo.f55597c;
    }

    public final int hashCode() {
        return ((((this.f55595a + 527) * 31) + this.f55596b) * 31) + this.f55597c;
    }
}
