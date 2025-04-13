package com.google.android.exoplayer2;

import android.os.Bundle;
import androidx.annotation.Nullable;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* loaded from: classes.dex */
public final class DeviceInfo implements Bundleable {

    /* renamed from: b */
    public final int f9503b;

    /* renamed from: c */
    public final int f9504c;

    /* renamed from: d */
    public final int f9505d;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface PlaybackType {
    }

    static {
        C1026l c1026l = C1026l.f11801d;
    }

    public DeviceInfo(int i2, int i3, int i4) {
        this.f9503b = i2;
        this.f9504c = i3;
        this.f9505d = i4;
    }

    /* renamed from: b */
    public static String m5700b(int i2) {
        return Integer.toString(i2, 36);
    }

    @Override // com.google.android.exoplayer2.Bundleable
    /* renamed from: a */
    public Bundle mo5679a() {
        Bundle bundle = new Bundle();
        bundle.putInt(m5700b(0), this.f9503b);
        bundle.putInt(m5700b(1), this.f9504c);
        bundle.putInt(m5700b(2), this.f9505d);
        return bundle;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceInfo)) {
            return false;
        }
        DeviceInfo deviceInfo = (DeviceInfo) obj;
        return this.f9503b == deviceInfo.f9503b && this.f9504c == deviceInfo.f9504c && this.f9505d == deviceInfo.f9505d;
    }

    public int hashCode() {
        return ((((527 + this.f9503b) * 31) + this.f9504c) * 31) + this.f9505d;
    }
}
