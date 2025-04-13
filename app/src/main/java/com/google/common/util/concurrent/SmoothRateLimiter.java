package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import java.util.concurrent.TimeUnit;

@GwtIncompatible
/* loaded from: classes2.dex */
abstract class SmoothRateLimiter extends RateLimiter {

    public static final class SmoothBursty extends SmoothRateLimiter {
    }

    public static final class SmoothWarmingUp extends SmoothRateLimiter {
    }

    @Override // com.google.common.util.concurrent.RateLimiter
    /* renamed from: a */
    public final double mo12206a() {
        return TimeUnit.SECONDS.toMicros(1L) / 0.0d;
    }
}
