package io.grpc.internal;

/* loaded from: classes3.dex */
final class LongCounterFactory {
    /* renamed from: a */
    public static LongCounter m31137a() {
        return ReflectionLongAdderCounter.f58966f == null ? new ReflectionLongAdderCounter() : new AtomicLongCounter();
    }
}
