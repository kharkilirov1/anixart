package com.google.android.exoplayer2.util;

import androidx.annotation.GuardedBy;
import java.util.Objects;

/* loaded from: classes.dex */
public final class TimestampAdjuster {

    /* renamed from: a */
    @GuardedBy
    public long f14732a;

    /* renamed from: b */
    @GuardedBy
    public long f14733b;

    /* renamed from: c */
    @GuardedBy
    public long f14734c;

    /* renamed from: d */
    public final ThreadLocal<Long> f14735d = new ThreadLocal<>();

    public TimestampAdjuster(long j2) {
        m7695e(j2);
    }

    /* renamed from: a */
    public synchronized long m7691a(long j2) {
        if (j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f14733b == -9223372036854775807L) {
            long j3 = this.f14732a;
            if (j3 == 9223372036854775806L) {
                Long l2 = this.f14735d.get();
                Objects.requireNonNull(l2);
                j3 = l2.longValue();
            }
            this.f14733b = j3 - j2;
            notifyAll();
        }
        this.f14734c = j2;
        return j2 + this.f14733b;
    }

    /* renamed from: b */
    public synchronized long m7692b(long j2) {
        if (j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j3 = this.f14734c;
        if (j3 != -9223372036854775807L) {
            long j4 = (j3 * 90000) / 1000000;
            long j5 = (4294967296L + j4) / 8589934592L;
            long j6 = ((j5 - 1) * 8589934592L) + j2;
            j2 += j5 * 8589934592L;
            if (Math.abs(j6 - j4) < Math.abs(j2 - j4)) {
                j2 = j6;
            }
        }
        return m7691a((j2 * 1000000) / 90000);
    }

    /* renamed from: c */
    public synchronized long m7693c() {
        long j2;
        j2 = this.f14732a;
        if (j2 == Long.MAX_VALUE || j2 == 9223372036854775806L) {
            j2 = -9223372036854775807L;
        }
        return j2;
    }

    /* renamed from: d */
    public synchronized long m7694d() {
        return this.f14733b;
    }

    /* renamed from: e */
    public synchronized void m7695e(long j2) {
        this.f14732a = j2;
        this.f14733b = j2 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f14734c = -9223372036854775807L;
    }
}
