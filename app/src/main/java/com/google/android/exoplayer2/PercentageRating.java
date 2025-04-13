package com.google.android.exoplayer2;

import android.os.Bundle;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.util.Assertions;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class PercentageRating extends Rating {

    /* renamed from: d */
    public static final Bundleable.Creator<PercentageRating> f9924d = C1026l.f11810m;

    /* renamed from: c */
    public final float f9925c;

    public PercentageRating() {
        this.f9925c = -1.0f;
    }

    /* renamed from: b */
    public static String m5910b(int i2) {
        return Integer.toString(i2, 36);
    }

    @Override // com.google.android.exoplayer2.Bundleable
    /* renamed from: a */
    public Bundle mo5679a() {
        Bundle bundle = new Bundle();
        bundle.putInt(m5910b(0), 1);
        bundle.putFloat(m5910b(1), this.f9925c);
        return bundle;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof PercentageRating) && this.f9925c == ((PercentageRating) obj).f9925c;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f9925c)});
    }

    public PercentageRating(@FloatRange float f2) {
        Assertions.m7514b(f2 >= 0.0f && f2 <= 100.0f, "percent must be in the range of [0, 100]");
        this.f9925c = f2;
    }
}
