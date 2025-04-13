package com.google.android.exoplayer2;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;

/* loaded from: classes.dex */
public final class SeekParameters {

    /* renamed from: c */
    public static final SeekParameters f9986c;

    /* renamed from: a */
    public final long f9987a;

    /* renamed from: b */
    public final long f9988b;

    static {
        SeekParameters seekParameters = new SeekParameters(0L, 0L);
        new SeekParameters(Long.MAX_VALUE, Long.MAX_VALUE);
        new SeekParameters(Long.MAX_VALUE, 0L);
        new SeekParameters(0L, Long.MAX_VALUE);
        f9986c = seekParameters;
    }

    public SeekParameters(long j2, long j3) {
        Assertions.m7513a(j2 >= 0);
        Assertions.m7513a(j3 >= 0);
        this.f9987a = j2;
        this.f9988b = j3;
    }

    /* renamed from: a */
    public long m5939a(long j2, long j3, long j4) {
        long j5 = this.f9987a;
        if (j5 == 0 && this.f9988b == 0) {
            return j2;
        }
        int i2 = Util.f14736a;
        long j6 = j2 - j5;
        long j7 = ((j5 ^ j2) & (j2 ^ j6)) >= 0 ? j6 : Long.MIN_VALUE;
        long j8 = this.f9988b;
        long j9 = j2 + j8;
        long j10 = ((j8 ^ j9) & (j2 ^ j9)) >= 0 ? j9 : Long.MAX_VALUE;
        boolean z = false;
        boolean z2 = j7 <= j3 && j3 <= j10;
        if (j7 <= j4 && j4 <= j10) {
            z = true;
        }
        return (z2 && z) ? Math.abs(j3 - j2) <= Math.abs(j4 - j2) ? j3 : j4 : z2 ? j3 : z ? j4 : j7;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SeekParameters.class != obj.getClass()) {
            return false;
        }
        SeekParameters seekParameters = (SeekParameters) obj;
        return this.f9987a == seekParameters.f9987a && this.f9988b == seekParameters.f9988b;
    }

    public int hashCode() {
        return (((int) this.f9987a) * 31) + ((int) this.f9988b);
    }
}
