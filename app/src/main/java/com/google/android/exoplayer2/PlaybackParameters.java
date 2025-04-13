package com.google.android.exoplayer2;

import android.os.Bundle;
import androidx.annotation.CheckResult;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;

/* loaded from: classes.dex */
public final class PlaybackParameters implements Bundleable {

    /* renamed from: e */
    public static final PlaybackParameters f9948e = new PlaybackParameters(1.0f, 1.0f);

    /* renamed from: b */
    public final float f9949b;

    /* renamed from: c */
    public final float f9950c;

    /* renamed from: d */
    public final int f9951d;

    public PlaybackParameters(@FloatRange float f2, @FloatRange float f3) {
        Assertions.m7513a(f2 > 0.0f);
        Assertions.m7513a(f3 > 0.0f);
        this.f9949b = f2;
        this.f9950c = f3;
        this.f9951d = Math.round(f2 * 1000.0f);
    }

    /* renamed from: b */
    public static String m5921b(int i2) {
        return Integer.toString(i2, 36);
    }

    @Override // com.google.android.exoplayer2.Bundleable
    /* renamed from: a */
    public Bundle mo5679a() {
        Bundle bundle = new Bundle();
        bundle.putFloat(m5921b(0), this.f9949b);
        bundle.putFloat(m5921b(1), this.f9950c);
        return bundle;
    }

    @CheckResult
    /* renamed from: c */
    public PlaybackParameters m5922c(@FloatRange float f2) {
        return new PlaybackParameters(f2, this.f9950c);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PlaybackParameters.class != obj.getClass()) {
            return false;
        }
        PlaybackParameters playbackParameters = (PlaybackParameters) obj;
        return this.f9949b == playbackParameters.f9949b && this.f9950c == playbackParameters.f9950c;
    }

    public int hashCode() {
        return Float.floatToRawIntBits(this.f9950c) + ((Float.floatToRawIntBits(this.f9949b) + 527) * 31);
    }

    public String toString() {
        return Util.m7747p("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f9949b), Float.valueOf(this.f9950c));
    }
}
