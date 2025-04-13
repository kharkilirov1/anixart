package com.p017vk.api.sdk.utils;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* compiled from: ExponentialBackoff.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/vk/api/sdk/utils/ExponentialBackoff;", "", "Companion", "libapi-sdk-core_release"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public class ExponentialBackoff {

    /* renamed from: a */
    public final Random f30781a;

    /* renamed from: b */
    public long f30782b;

    /* renamed from: c */
    public int f30783c;

    /* renamed from: d */
    public final long f30784d;

    /* renamed from: e */
    public final long f30785e;

    /* renamed from: f */
    public final float f30786f;

    /* renamed from: g */
    public final float f30787g;

    /* compiled from: ExponentialBackoff.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/vk/api/sdk/utils/ExponentialBackoff$Companion;", "", "libapi-sdk-core_release"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class Companion {
    }

    public ExponentialBackoff() {
        this(0L, 0L, 0.0f, 0.0f, 15);
    }

    public ExponentialBackoff(long j2, long j3, float f2, float f3, int i2) {
        j2 = (i2 & 1) != 0 ? TimeUnit.MILLISECONDS.toMillis(100L) : j2;
        j3 = (i2 & 2) != 0 ? TimeUnit.MINUTES.toMillis(5L) : j3;
        f2 = (i2 & 4) != 0 ? 2.0f : f2;
        f3 = (i2 & 8) != 0 ? 0.1f : f3;
        this.f30784d = j2;
        this.f30785e = j3;
        this.f30786f = f2;
        this.f30787g = f3;
        this.f30781a = new Random(System.currentTimeMillis());
        this.f30782b = j2;
    }

    /* renamed from: a */
    public final void m16533a() {
        long min = (long) Math.min(this.f30782b * this.f30786f, this.f30785e);
        this.f30782b = min;
        this.f30782b = min + ((long) (this.f30781a.nextGaussian() * min * this.f30787g));
        this.f30783c++;
    }
}
