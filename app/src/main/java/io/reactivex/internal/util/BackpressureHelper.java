package io.reactivex.internal.util;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import p000a.C0000a;

/* loaded from: classes3.dex */
public final class BackpressureHelper {
    public BackpressureHelper() {
        throw new IllegalStateException("No instances!");
    }

    /* renamed from: a */
    public static long m31808a(AtomicLong atomicLong, long j2) {
        long j3;
        do {
            j3 = atomicLong.get();
            if (j3 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(j3, m31810c(j3, j2)));
        return j3;
    }

    /* renamed from: b */
    public static long m31809b(AtomicLong atomicLong, long j2) {
        long j3;
        do {
            j3 = atomicLong.get();
            if (j3 == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            if (j3 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(j3, m31810c(j3, j2)));
        return j3;
    }

    /* renamed from: c */
    public static long m31810c(long j2, long j3) {
        long j4 = j2 + j3;
        if (j4 < 0) {
            return Long.MAX_VALUE;
        }
        return j4;
    }

    /* renamed from: d */
    public static long m31811d(long j2, long j3) {
        long j4 = j2 * j3;
        if (((j2 | j3) >>> 31) == 0 || j4 / j2 == j3) {
            return j4;
        }
        return Long.MAX_VALUE;
    }

    /* renamed from: e */
    public static long m31812e(AtomicLong atomicLong, long j2) {
        long j3;
        long j4;
        do {
            j3 = atomicLong.get();
            if (j3 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            j4 = j3 - j2;
            if (j4 < 0) {
                RxJavaPlugins.m31848b(new IllegalStateException(C0000a.m11h("More produced than requested: ", j4)));
                j4 = 0;
            }
        } while (!atomicLong.compareAndSet(j3, j4));
        return j4;
    }

    /* renamed from: f */
    public static long m31813f(AtomicLong atomicLong, long j2) {
        long j3;
        long j4;
        do {
            j3 = atomicLong.get();
            if (j3 == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            if (j3 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            j4 = j3 - j2;
            if (j4 < 0) {
                RxJavaPlugins.m31848b(new IllegalStateException(C0000a.m11h("More produced than requested: ", j4)));
                j4 = 0;
            }
        } while (!atomicLong.compareAndSet(j3, j4));
        return j4;
    }
}
