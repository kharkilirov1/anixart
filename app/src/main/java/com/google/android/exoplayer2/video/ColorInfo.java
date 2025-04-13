package com.google.android.exoplayer2.video;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.trackselection.C1136a;
import java.util.Arrays;
import org.checkerframework.dataflow.qual.Pure;

/* loaded from: classes.dex */
public final class ColorInfo implements Bundleable {

    /* renamed from: g */
    public static final Bundleable.Creator<ColorInfo> f14760g = C1136a.f14040g;

    /* renamed from: b */
    public final int f14761b;

    /* renamed from: c */
    public final int f14762c;

    /* renamed from: d */
    public final int f14763d;

    /* renamed from: e */
    @Nullable
    public final byte[] f14764e;

    /* renamed from: f */
    public int f14765f;

    public ColorInfo(int i2, int i3, int i4, @Nullable byte[] bArr) {
        this.f14761b = i2;
        this.f14762c = i3;
        this.f14763d = i4;
        this.f14764e = bArr;
    }

    @Pure
    /* renamed from: b */
    public static int m7764b(int i2) {
        if (i2 == 1) {
            return 1;
        }
        if (i2 != 9) {
            return (i2 == 4 || i2 == 5 || i2 == 6 || i2 == 7) ? 2 : -1;
        }
        return 6;
    }

    @Pure
    /* renamed from: c */
    public static int m7765c(int i2) {
        if (i2 == 1) {
            return 3;
        }
        if (i2 == 16) {
            return 6;
        }
        if (i2 != 18) {
            return (i2 == 6 || i2 == 7) ? 3 : -1;
        }
        return 7;
    }

    /* renamed from: d */
    public static String m7766d(int i2) {
        return Integer.toString(i2, 36);
    }

    @Override // com.google.android.exoplayer2.Bundleable
    /* renamed from: a */
    public Bundle mo5679a() {
        Bundle bundle = new Bundle();
        bundle.putInt(m7766d(0), this.f14761b);
        bundle.putInt(m7766d(1), this.f14762c);
        bundle.putInt(m7766d(2), this.f14763d);
        bundle.putByteArray(m7766d(3), this.f14764e);
        return bundle;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ColorInfo.class != obj.getClass()) {
            return false;
        }
        ColorInfo colorInfo = (ColorInfo) obj;
        return this.f14761b == colorInfo.f14761b && this.f14762c == colorInfo.f14762c && this.f14763d == colorInfo.f14763d && Arrays.equals(this.f14764e, colorInfo.f14764e);
    }

    public int hashCode() {
        if (this.f14765f == 0) {
            this.f14765f = Arrays.hashCode(this.f14764e) + ((((((527 + this.f14761b) * 31) + this.f14762c) * 31) + this.f14763d) * 31);
        }
        return this.f14765f;
    }

    public String toString() {
        int i2 = this.f14761b;
        int i3 = this.f14762c;
        int i4 = this.f14763d;
        boolean z = this.f14764e != null;
        StringBuilder m4120s = C0576a.m4120s(55, "ColorInfo(", i2, ", ", i3);
        m4120s.append(", ");
        m4120s.append(i4);
        m4120s.append(", ");
        m4120s.append(z);
        m4120s.append(")");
        return m4120s.toString();
    }
}
