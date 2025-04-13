package io.grpc.internal;

import com.google.common.base.Preconditions;
import io.grpc.internal.BackoffPolicy;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class ExponentialBackoffPolicy implements BackoffPolicy {

    /* renamed from: a */
    public Random f58639a = new Random();

    /* renamed from: b */
    public long f58640b = TimeUnit.SECONDS.toNanos(1);

    /* renamed from: c */
    public long f58641c = TimeUnit.MINUTES.toNanos(2);

    /* renamed from: d */
    public double f58642d = 1.6d;

    /* renamed from: e */
    public double f58643e = 0.2d;

    /* renamed from: f */
    public long f58644f = this.f58640b;

    public static final class Provider implements BackoffPolicy.Provider {
        @Override // io.grpc.internal.BackoffPolicy.Provider
        public BackoffPolicy get() {
            return new ExponentialBackoffPolicy();
        }
    }

    @Override // io.grpc.internal.BackoffPolicy
    /* renamed from: a */
    public long mo31038a() {
        long j2 = this.f58644f;
        double d = j2;
        this.f58644f = Math.min((long) (this.f58642d * d), this.f58641c);
        double d2 = this.f58643e;
        double d3 = (-d2) * d;
        double d4 = d2 * d;
        Preconditions.m11178b(d4 >= d3);
        return j2 + ((long) ((this.f58639a.nextDouble() * (d4 - d3)) + d3));
    }
}
