package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.InterfaceC5589pf;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class pp0 extends ut0 {

    /* renamed from: c */
    public static final InterfaceC5589pf.a<pp0> f53611c = jp1.f51706q;

    /* renamed from: b */
    private final float f53612b;

    public pp0() {
        this.f53612b = -1.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static pp0 m27363b(Bundle bundle) {
        C5220ia.m25473a(bundle.getInt(Integer.toString(0, 36), -1) == 1);
        float f2 = bundle.getFloat(Integer.toString(1, 36), -1.0f);
        return f2 == -1.0f ? new pp0() : new pp0(f2);
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof pp0) && this.f53612b == ((pp0) obj).f53612b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f53612b)});
    }

    public pp0(@FloatRange float f2) {
        C5220ia.m25472a("percent must be in the range of [0, 100]", f2 >= 0.0f && f2 <= 100.0f);
        this.f53612b = f2;
    }
}
