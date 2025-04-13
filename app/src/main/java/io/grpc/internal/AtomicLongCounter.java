package io.grpc.internal;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
final class AtomicLongCounter implements LongCounter {

    /* renamed from: a */
    public final AtomicLong f58452a = new AtomicLong();

    @Override // io.grpc.internal.LongCounter
    /* renamed from: a */
    public void mo31037a(long j2) {
        this.f58452a.getAndAdd(j2);
    }
}
