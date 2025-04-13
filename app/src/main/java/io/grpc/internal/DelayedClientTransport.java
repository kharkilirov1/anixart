package io.grpc.internal;

import io.grpc.ClientStreamTracer;
import io.grpc.InternalLogId;
import io.grpc.LoadBalancer;
import io.grpc.Status;
import java.util.Objects;

/* loaded from: classes3.dex */
final class DelayedClientTransport implements ManagedClientTransport {

    /* renamed from: io.grpc.internal.DelayedClientTransport$1 */
    class RunnableC63641 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            throw null;
        }
    }

    /* renamed from: io.grpc.internal.DelayedClientTransport$2 */
    class RunnableC63652 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            throw null;
        }
    }

    /* renamed from: io.grpc.internal.DelayedClientTransport$3 */
    class RunnableC63663 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            throw null;
        }
    }

    /* renamed from: io.grpc.internal.DelayedClientTransport$4 */
    public class RunnableC63674 implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ DelayedClientTransport f58573b;

        @Override // java.lang.Runnable
        public void run() {
            Objects.requireNonNull(this.f58573b);
            throw null;
        }
    }

    public class PendingStream extends DelayedStream {

        /* renamed from: j */
        public final LoadBalancer.PickSubchannelArgs f58574j;

        /* renamed from: k */
        public final ClientStreamTracer[] f58575k;

        /* renamed from: l */
        public final /* synthetic */ DelayedClientTransport f58576l;

        @Override // io.grpc.internal.DelayedStream, io.grpc.internal.ClientStream
        /* renamed from: a */
        public void mo30978a(Status status) {
            super.mo30978a(status);
            Objects.requireNonNull(this.f58576l);
            throw null;
        }

        @Override // io.grpc.internal.DelayedStream, io.grpc.internal.ClientStream
        /* renamed from: n */
        public void mo30987n(InsightBuilder insightBuilder) {
            if (this.f58574j.mo30886a().m30804b()) {
                insightBuilder.f58728a.add("wait_for_ready");
            }
            super.mo30987n(insightBuilder);
        }

        @Override // io.grpc.internal.DelayedStream
        /* renamed from: x */
        public void mo31079x(Status status) {
            for (ClientStreamTracer clientStreamTracer : this.f58575k) {
                clientStreamTracer.mo30958i(status);
            }
        }
    }

    @Override // io.grpc.internal.ManagedClientTransport
    /* renamed from: a */
    public final void mo30968a(Status status) {
        throw null;
    }

    @Override // io.grpc.internal.ManagedClientTransport
    /* renamed from: b */
    public final void mo30969b(Status status) {
        throw null;
    }

    @Override // io.grpc.InternalWithLogId
    /* renamed from: e */
    public InternalLogId mo30881e() {
        return null;
    }
}
