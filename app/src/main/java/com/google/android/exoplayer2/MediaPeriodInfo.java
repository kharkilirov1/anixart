package com.google.android.exoplayer2;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;

/* loaded from: classes.dex */
final class MediaPeriodInfo {

    /* renamed from: a */
    public final MediaSource.MediaPeriodId f9872a;

    /* renamed from: b */
    public final long f9873b;

    /* renamed from: c */
    public final long f9874c;

    /* renamed from: d */
    public final long f9875d;

    /* renamed from: e */
    public final long f9876e;

    /* renamed from: f */
    public final boolean f9877f;

    /* renamed from: g */
    public final boolean f9878g;

    /* renamed from: h */
    public final boolean f9879h;

    /* renamed from: i */
    public final boolean f9880i;

    public MediaPeriodInfo(MediaSource.MediaPeriodId mediaPeriodId, long j2, long j3, long j4, long j5, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = false;
        Assertions.m7513a(!z4 || z2);
        Assertions.m7513a(!z3 || z2);
        if (!z || (!z2 && !z3 && !z4)) {
            z5 = true;
        }
        Assertions.m7513a(z5);
        this.f9872a = mediaPeriodId;
        this.f9873b = j2;
        this.f9874c = j3;
        this.f9875d = j4;
        this.f9876e = j5;
        this.f9877f = z;
        this.f9878g = z2;
        this.f9879h = z3;
        this.f9880i = z4;
    }

    /* renamed from: a */
    public MediaPeriodInfo m5860a(long j2) {
        return j2 == this.f9874c ? this : new MediaPeriodInfo(this.f9872a, this.f9873b, j2, this.f9875d, this.f9876e, this.f9877f, this.f9878g, this.f9879h, this.f9880i);
    }

    /* renamed from: b */
    public MediaPeriodInfo m5861b(long j2) {
        return j2 == this.f9873b ? this : new MediaPeriodInfo(this.f9872a, j2, this.f9874c, this.f9875d, this.f9876e, this.f9877f, this.f9878g, this.f9879h, this.f9880i);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MediaPeriodInfo.class != obj.getClass()) {
            return false;
        }
        MediaPeriodInfo mediaPeriodInfo = (MediaPeriodInfo) obj;
        return this.f9873b == mediaPeriodInfo.f9873b && this.f9874c == mediaPeriodInfo.f9874c && this.f9875d == mediaPeriodInfo.f9875d && this.f9876e == mediaPeriodInfo.f9876e && this.f9877f == mediaPeriodInfo.f9877f && this.f9878g == mediaPeriodInfo.f9878g && this.f9879h == mediaPeriodInfo.f9879h && this.f9880i == mediaPeriodInfo.f9880i && Util.m7728a(this.f9872a, mediaPeriodInfo.f9872a);
    }

    public int hashCode() {
        return ((((((((((((((((this.f9872a.hashCode() + 527) * 31) + ((int) this.f9873b)) * 31) + ((int) this.f9874c)) * 31) + ((int) this.f9875d)) * 31) + ((int) this.f9876e)) * 31) + (this.f9877f ? 1 : 0)) * 31) + (this.f9878g ? 1 : 0)) * 31) + (this.f9879h ? 1 : 0)) * 31) + (this.f9880i ? 1 : 0);
    }
}
