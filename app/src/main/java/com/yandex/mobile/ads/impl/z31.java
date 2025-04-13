package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.InterfaceC5589pf;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class z31 extends ut0 {

    /* renamed from: d */
    public static final InterfaceC5589pf.a<z31> f57028d = kq1.f52062g;

    /* renamed from: b */
    @IntRange
    private final int f57029b;

    /* renamed from: c */
    private final float f57030c;

    public z31(@IntRange int i2) {
        C5220ia.m25472a("maxStars must be a positive integer", i2 > 0);
        this.f57029b = i2;
        this.f57030c = -1.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static z31 m30050b(Bundle bundle) {
        C5220ia.m25473a(bundle.getInt(Integer.toString(0, 36), -1) == 2);
        int i2 = bundle.getInt(Integer.toString(1, 36), 5);
        float f2 = bundle.getFloat(Integer.toString(2, 36), -1.0f);
        return f2 == -1.0f ? new z31(i2) : new z31(i2, f2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof z31)) {
            return false;
        }
        z31 z31Var = (z31) obj;
        return this.f57029b == z31Var.f57029b && this.f57030c == z31Var.f57030c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f57029b), Float.valueOf(this.f57030c)});
    }

    public z31(@IntRange int i2, @FloatRange float f2) {
        C5220ia.m25472a("maxStars must be a positive integer", i2 > 0);
        C5220ia.m25472a("starRating is out of range [0, maxStars]", f2 >= 0.0f && f2 <= ((float) i2));
        this.f57029b = i2;
        this.f57030c = f2;
    }
}
