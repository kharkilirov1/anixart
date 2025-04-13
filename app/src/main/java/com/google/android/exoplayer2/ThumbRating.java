package com.google.android.exoplayer2;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Bundleable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ThumbRating extends Rating {

    /* renamed from: e */
    public static final Bundleable.Creator<ThumbRating> f10044e = C1026l.f11815r;

    /* renamed from: c */
    public final boolean f10045c;

    /* renamed from: d */
    public final boolean f10046d;

    public ThumbRating() {
        this.f10045c = false;
        this.f10046d = false;
    }

    /* renamed from: b */
    public static String m5983b(int i2) {
        return Integer.toString(i2, 36);
    }

    @Override // com.google.android.exoplayer2.Bundleable
    /* renamed from: a */
    public Bundle mo5679a() {
        Bundle bundle = new Bundle();
        bundle.putInt(m5983b(0), 3);
        bundle.putBoolean(m5983b(1), this.f10045c);
        bundle.putBoolean(m5983b(2), this.f10046d);
        return bundle;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof ThumbRating)) {
            return false;
        }
        ThumbRating thumbRating = (ThumbRating) obj;
        return this.f10046d == thumbRating.f10046d && this.f10045c == thumbRating.f10045c;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f10045c), Boolean.valueOf(this.f10046d)});
    }

    public ThumbRating(boolean z) {
        this.f10045c = true;
        this.f10046d = z;
    }
}
