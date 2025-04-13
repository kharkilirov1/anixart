package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class lf1 implements InterfaceC5589pf {

    /* renamed from: e */
    public static final /* synthetic */ int f52380e = 0;

    /* renamed from: a */
    @IntRange
    public final int f52381a;

    /* renamed from: b */
    @IntRange
    public final int f52382b;

    /* renamed from: c */
    @IntRange
    public final int f52383c;

    /* renamed from: d */
    @FloatRange
    public final float f52384d;

    static {
        jp1 jp1Var = jp1.f51697h;
    }

    public lf1(@IntRange int i2, @IntRange int i3, @IntRange int i4, @FloatRange float f2) {
        this.f52381a = i2;
        this.f52382b = i3;
        this.f52383c = i4;
        this.f52384d = f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static lf1 m26445a(Bundle bundle) {
        return new lf1(bundle.getInt(Integer.toString(0, 36), 0), bundle.getInt(Integer.toString(1, 36), 0), bundle.getInt(Integer.toString(2, 36), 0), bundle.getFloat(Integer.toString(3, 36), 1.0f));
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lf1)) {
            return false;
        }
        lf1 lf1Var = (lf1) obj;
        return this.f52381a == lf1Var.f52381a && this.f52382b == lf1Var.f52382b && this.f52383c == lf1Var.f52383c && this.f52384d == lf1Var.f52384d;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f52384d) + ((((((this.f52381a + 217) * 31) + this.f52382b) * 31) + this.f52383c) * 31);
    }
}
