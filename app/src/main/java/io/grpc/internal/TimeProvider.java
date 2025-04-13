package io.grpc.internal;

import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public interface TimeProvider {

    /* renamed from: a */
    public static final TimeProvider f59164a = new TimeProvider() { // from class: io.grpc.internal.TimeProvider.1
        @Override // io.grpc.internal.TimeProvider
        /* renamed from: a */
        public long mo31206a() {
            return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        }
    };

    /* renamed from: a */
    long mo31206a();
}
