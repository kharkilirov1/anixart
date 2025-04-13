package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.InterfaceC5589pf;
import java.util.Arrays;

/* renamed from: com.yandex.mobile.ads.impl.jy */
/* loaded from: classes3.dex */
public final class C5309jy extends ut0 {

    /* renamed from: d */
    public static final InterfaceC5589pf.a<C5309jy> f51778d = jp1.f51692c;

    /* renamed from: b */
    private final boolean f51779b;

    /* renamed from: c */
    private final boolean f51780c;

    public C5309jy() {
        this.f51779b = false;
        this.f51780c = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static C5309jy m25996b(Bundle bundle) {
        C5220ia.m25473a(bundle.getInt(Integer.toString(0, 36), -1) == 0);
        return bundle.getBoolean(Integer.toString(1, 36), false) ? new C5309jy(bundle.getBoolean(Integer.toString(2, 36), false)) : new C5309jy();
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C5309jy)) {
            return false;
        }
        C5309jy c5309jy = (C5309jy) obj;
        return this.f51780c == c5309jy.f51780c && this.f51779b == c5309jy.f51779b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f51779b), Boolean.valueOf(this.f51780c)});
    }

    public C5309jy(boolean z) {
        this.f51779b = true;
        this.f51780c = z;
    }
}
