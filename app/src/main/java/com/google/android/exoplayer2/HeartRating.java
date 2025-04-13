package com.google.android.exoplayer2;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Bundleable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class HeartRating extends Rating {

    /* renamed from: e */
    public static final Bundleable.Creator<HeartRating> f9708e = C1026l.f11805h;

    /* renamed from: c */
    public final boolean f9709c;

    /* renamed from: d */
    public final boolean f9710d;

    public HeartRating() {
        this.f9709c = false;
        this.f9710d = false;
    }

    /* renamed from: b */
    public static String m5836b(int i2) {
        return Integer.toString(i2, 36);
    }

    @Override // com.google.android.exoplayer2.Bundleable
    /* renamed from: a */
    public Bundle mo5679a() {
        Bundle bundle = new Bundle();
        bundle.putInt(m5836b(0), 0);
        bundle.putBoolean(m5836b(1), this.f9709c);
        bundle.putBoolean(m5836b(2), this.f9710d);
        return bundle;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof HeartRating)) {
            return false;
        }
        HeartRating heartRating = (HeartRating) obj;
        return this.f9710d == heartRating.f9710d && this.f9709c == heartRating.f9709c;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f9709c), Boolean.valueOf(this.f9710d)});
    }

    public HeartRating(boolean z) {
        this.f9709c = true;
        this.f9710d = z;
    }
}
