package com.google.android.exoplayer2.video;

import android.os.Bundle;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Bundleable;

/* loaded from: classes.dex */
public final class VideoSize implements Bundleable {

    /* renamed from: f */
    public static final VideoSize f14900f = new VideoSize(0, 0);

    /* renamed from: b */
    @IntRange
    public final int f14901b;

    /* renamed from: c */
    @IntRange
    public final int f14902c;

    /* renamed from: d */
    @IntRange
    public final int f14903d;

    /* renamed from: e */
    @FloatRange
    public final float f14904e;

    public VideoSize(@IntRange int i2, @IntRange int i3) {
        this.f14901b = i2;
        this.f14902c = i3;
        this.f14903d = 0;
        this.f14904e = 1.0f;
    }

    /* renamed from: b */
    public static String m7820b(int i2) {
        return Integer.toString(i2, 36);
    }

    @Override // com.google.android.exoplayer2.Bundleable
    /* renamed from: a */
    public Bundle mo5679a() {
        Bundle bundle = new Bundle();
        bundle.putInt(m7820b(0), this.f14901b);
        bundle.putInt(m7820b(1), this.f14902c);
        bundle.putInt(m7820b(2), this.f14903d);
        bundle.putFloat(m7820b(3), this.f14904e);
        return bundle;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoSize)) {
            return false;
        }
        VideoSize videoSize = (VideoSize) obj;
        return this.f14901b == videoSize.f14901b && this.f14902c == videoSize.f14902c && this.f14903d == videoSize.f14903d && this.f14904e == videoSize.f14904e;
    }

    public int hashCode() {
        return Float.floatToRawIntBits(this.f14904e) + ((((((217 + this.f14901b) * 31) + this.f14902c) * 31) + this.f14903d) * 31);
    }

    public VideoSize(@IntRange int i2, @IntRange int i3, @IntRange int i4, @FloatRange float f2) {
        this.f14901b = i2;
        this.f14902c = i3;
        this.f14903d = i4;
        this.f14904e = f2;
    }
}
