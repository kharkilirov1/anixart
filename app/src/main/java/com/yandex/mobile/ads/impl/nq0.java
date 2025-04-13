package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class nq0 implements InterfaceC5589pf {

    /* renamed from: d */
    public static final nq0 f53071d = new nq0(1.0f, 1.0f);

    /* renamed from: a */
    public final float f53072a;

    /* renamed from: b */
    public final float f53073b;

    /* renamed from: c */
    private final int f53074c;

    static {
        jp1 jp1Var = jp1.f51700k;
    }

    public nq0(@FloatRange float f2, @FloatRange float f3) {
        C5220ia.m25473a(f2 > 0.0f);
        C5220ia.m25473a(f3 > 0.0f);
        this.f53072a = f2;
        this.f53073b = f3;
        this.f53074c = Math.round(f2 * 1000.0f);
    }

    /* renamed from: a */
    public final long m26940a(long j2) {
        return j2 * this.f53074c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || nq0.class != obj.getClass()) {
            return false;
        }
        nq0 nq0Var = (nq0) obj;
        return this.f53072a == nq0Var.f53072a && this.f53073b == nq0Var.f53073b;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f53073b) + ((Float.floatToRawIntBits(this.f53072a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f53072a), Float.valueOf(this.f53073b)};
        int i2 = s91.f54530a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static nq0 m26938a(Bundle bundle) {
        return new nq0(bundle.getFloat(Integer.toString(0, 36), 1.0f), bundle.getFloat(Integer.toString(1, 36), 1.0f));
    }
}
