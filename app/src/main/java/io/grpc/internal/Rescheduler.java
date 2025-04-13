package io.grpc.internal;

import java.util.Objects;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
final class Rescheduler {

    /* renamed from: a */
    public boolean f58969a;

    /* renamed from: b */
    public ScheduledFuture<?> f58970b;

    public final class ChannelFutureRunnable implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ Rescheduler f58971b;

        @Override // java.lang.Runnable
        public void run() {
            Rescheduler rescheduler = this.f58971b;
            if (!rescheduler.f58969a) {
                rescheduler.f58970b = null;
            } else {
                Objects.requireNonNull(rescheduler);
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                throw null;
            }
        }
    }

    public final class FutureRunnable implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ Rescheduler f58972b;

        @Override // java.lang.Runnable
        public void run() {
            Objects.requireNonNull(this.f58972b);
            throw null;
        }
    }
}
