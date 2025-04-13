package com.yandex.mobile.ads.impl;

import androidx.annotation.GuardedBy;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class p61 {

    /* renamed from: a */
    @GuardedBy
    private long f53394a;

    /* renamed from: b */
    @GuardedBy
    private long f53395b;

    /* renamed from: c */
    @GuardedBy
    private long f53396c;

    /* renamed from: d */
    private final ThreadLocal<Long> f53397d = new ThreadLocal<>();

    public p61(long j2) {
        m27175c(j2);
    }

    /* renamed from: a */
    public final synchronized long m27170a() {
        long j2;
        j2 = this.f53394a;
        if (j2 == Long.MAX_VALUE || j2 == 9223372036854775806L) {
            j2 = -9223372036854775807L;
        }
        return j2;
    }

    /* renamed from: b */
    public final synchronized long m27172b() {
        long j2;
        j2 = this.f53396c;
        return j2 != -9223372036854775807L ? j2 + this.f53395b : m27170a();
    }

    /* renamed from: c */
    public final synchronized long m27174c() {
        return this.f53395b;
    }

    /* renamed from: a */
    public final synchronized long m27171a(long j2) {
        if (j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f53395b == -9223372036854775807L) {
            long j3 = this.f53394a;
            if (j3 == 9223372036854775806L) {
                Long l2 = this.f53397d.get();
                Objects.requireNonNull(l2);
                j3 = l2.longValue();
            }
            this.f53395b = j3 - j2;
            notifyAll();
        }
        this.f53396c = j2;
        return j2 + this.f53395b;
    }

    /* renamed from: c */
    public final synchronized void m27175c(long j2) {
        this.f53394a = j2;
        this.f53395b = j2 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f53396c = -9223372036854775807L;
    }

    /* renamed from: b */
    public final synchronized long m27173b(long j2) {
        if (j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j3 = this.f53396c;
        if (j3 != -9223372036854775807L) {
            long j4 = (j3 * 90000) / 1000000;
            long j5 = (4294967296L + j4) / 8589934592L;
            long j6 = ((j5 - 1) * 8589934592L) + j2;
            j2 += j5 * 8589934592L;
            if (Math.abs(j6 - j4) < Math.abs(j2 - j4)) {
                j2 = j6;
            }
        }
        return m27171a((j2 * 1000000) / 90000);
    }
}
