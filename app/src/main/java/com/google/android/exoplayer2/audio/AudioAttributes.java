package com.google.android.exoplayer2.audio;

import android.media.AudioAttributes;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.util.Util;

/* loaded from: classes.dex */
public final class AudioAttributes implements Bundleable {

    /* renamed from: g */
    public static final AudioAttributes f10284g;

    /* renamed from: b */
    public final int f10285b;

    /* renamed from: c */
    public final int f10286c;

    /* renamed from: d */
    public final int f10287d;

    /* renamed from: e */
    public final int f10288e;

    /* renamed from: f */
    @Nullable
    public android.media.AudioAttributes f10289f;

    public static final class Builder {

        /* renamed from: a */
        public int f10290a = 0;

        /* renamed from: b */
        public int f10291b = 0;

        /* renamed from: c */
        public int f10292c = 1;

        /* renamed from: d */
        public int f10293d = 1;
    }

    static {
        Builder builder = new Builder();
        f10284g = new AudioAttributes(builder.f10290a, builder.f10291b, builder.f10292c, builder.f10293d, null);
    }

    public AudioAttributes(int i2, int i3, int i4, int i5, C09681 c09681) {
        this.f10285b = i2;
        this.f10286c = i3;
        this.f10287d = i4;
        this.f10288e = i5;
    }

    /* renamed from: c */
    public static String m6107c(int i2) {
        return Integer.toString(i2, 36);
    }

    @Override // com.google.android.exoplayer2.Bundleable
    /* renamed from: a */
    public Bundle mo5679a() {
        Bundle bundle = new Bundle();
        bundle.putInt(m6107c(0), this.f10285b);
        bundle.putInt(m6107c(1), this.f10286c);
        bundle.putInt(m6107c(2), this.f10287d);
        bundle.putInt(m6107c(3), this.f10288e);
        return bundle;
    }

    @RequiresApi
    /* renamed from: b */
    public android.media.AudioAttributes m6108b() {
        if (this.f10289f == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f10285b).setFlags(this.f10286c).setUsage(this.f10287d);
            if (Util.f14736a >= 29) {
                usage.setAllowedCapturePolicy(this.f10288e);
            }
            this.f10289f = usage.build();
        }
        return this.f10289f;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AudioAttributes.class != obj.getClass()) {
            return false;
        }
        AudioAttributes audioAttributes = (AudioAttributes) obj;
        return this.f10285b == audioAttributes.f10285b && this.f10286c == audioAttributes.f10286c && this.f10287d == audioAttributes.f10287d && this.f10288e == audioAttributes.f10288e;
    }

    public int hashCode() {
        return ((((((527 + this.f10285b) * 31) + this.f10286c) * 31) + this.f10287d) * 31) + this.f10288e;
    }
}
