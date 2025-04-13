package com.google.android.exoplayer2;

import android.os.Bundle;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.util.Assertions;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class StarRating extends Rating {

    /* renamed from: e */
    public static final Bundleable.Creator<StarRating> f10031e = C1026l.f11814q;

    /* renamed from: c */
    @IntRange
    public final int f10032c;

    /* renamed from: d */
    public final float f10033d;

    public StarRating(@IntRange int i2) {
        Assertions.m7514b(i2 > 0, "maxStars must be a positive integer");
        this.f10032c = i2;
        this.f10033d = -1.0f;
    }

    /* renamed from: b */
    public static String m5979b(int i2) {
        return Integer.toString(i2, 36);
    }

    @Override // com.google.android.exoplayer2.Bundleable
    /* renamed from: a */
    public Bundle mo5679a() {
        Bundle bundle = new Bundle();
        bundle.putInt(m5979b(0), 2);
        bundle.putInt(m5979b(1), this.f10032c);
        bundle.putFloat(m5979b(2), this.f10033d);
        return bundle;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof StarRating)) {
            return false;
        }
        StarRating starRating = (StarRating) obj;
        return this.f10032c == starRating.f10032c && this.f10033d == starRating.f10033d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f10032c), Float.valueOf(this.f10033d)});
    }

    public StarRating(@IntRange int i2, @FloatRange float f2) {
        Assertions.m7514b(i2 > 0, "maxStars must be a positive integer");
        Assertions.m7514b(f2 >= 0.0f && f2 <= ((float) i2), "starRating is out of range [0, maxStars]");
        this.f10032c = i2;
        this.f10033d = f2;
    }
}
