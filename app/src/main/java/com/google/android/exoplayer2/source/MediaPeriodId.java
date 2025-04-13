package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public class MediaPeriodId {

    /* renamed from: a */
    public final Object f12356a;

    /* renamed from: b */
    public final int f12357b;

    /* renamed from: c */
    public final int f12358c;

    /* renamed from: d */
    public final long f12359d;

    /* renamed from: e */
    public final int f12360e;

    public MediaPeriodId(MediaPeriodId mediaPeriodId) {
        this.f12356a = mediaPeriodId.f12356a;
        this.f12357b = mediaPeriodId.f12357b;
        this.f12358c = mediaPeriodId.f12358c;
        this.f12359d = mediaPeriodId.f12359d;
        this.f12360e = mediaPeriodId.f12360e;
    }

    /* renamed from: a */
    public boolean m6828a() {
        return this.f12357b != -1;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaPeriodId)) {
            return false;
        }
        MediaPeriodId mediaPeriodId = (MediaPeriodId) obj;
        return this.f12356a.equals(mediaPeriodId.f12356a) && this.f12357b == mediaPeriodId.f12357b && this.f12358c == mediaPeriodId.f12358c && this.f12359d == mediaPeriodId.f12359d && this.f12360e == mediaPeriodId.f12360e;
    }

    public int hashCode() {
        return ((((((((this.f12356a.hashCode() + 527) * 31) + this.f12357b) * 31) + this.f12358c) * 31) + ((int) this.f12359d)) * 31) + this.f12360e;
    }

    public MediaPeriodId(Object obj) {
        this.f12356a = obj;
        this.f12357b = -1;
        this.f12358c = -1;
        this.f12359d = -1L;
        this.f12360e = -1;
    }

    public MediaPeriodId(Object obj, int i2, int i3, long j2) {
        this.f12356a = obj;
        this.f12357b = i2;
        this.f12358c = i3;
        this.f12359d = j2;
        this.f12360e = -1;
    }

    public MediaPeriodId(Object obj, int i2, int i3, long j2, int i4) {
        this.f12356a = obj;
        this.f12357b = i2;
        this.f12358c = i3;
        this.f12359d = j2;
        this.f12360e = i4;
    }

    public MediaPeriodId(Object obj, long j2) {
        this.f12356a = obj;
        this.f12357b = -1;
        this.f12358c = -1;
        this.f12359d = j2;
        this.f12360e = -1;
    }

    public MediaPeriodId(Object obj, long j2, int i2) {
        this.f12356a = obj;
        this.f12357b = -1;
        this.f12358c = -1;
        this.f12359d = j2;
        this.f12360e = i2;
    }
}
