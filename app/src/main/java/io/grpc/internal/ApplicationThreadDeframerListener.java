package io.grpc.internal;

import com.google.common.base.Preconditions;
import io.grpc.internal.MessageDeframer;
import io.grpc.internal.StreamListener;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: classes3.dex */
final class ApplicationThreadDeframerListener implements MessageDeframer.Listener {

    /* renamed from: a */
    public final TransportExecutor f58440a;

    /* renamed from: b */
    public final MessageDeframer.Listener f58441b;

    /* renamed from: c */
    public final Queue<InputStream> f58442c = new ArrayDeque();

    /* renamed from: io.grpc.internal.ApplicationThreadDeframerListener$3 */
    public class RunnableC63383 implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ Throwable f58447b;

        public RunnableC63383(Throwable th) {
            this.f58447b = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            ApplicationThreadDeframerListener.this.f58441b.mo31035d(this.f58447b);
        }
    }

    public interface TransportExecutor {
        /* renamed from: e */
        void mo31036e(Runnable runnable);
    }

    public ApplicationThreadDeframerListener(MessageDeframer.Listener listener, TransportExecutor transportExecutor) {
        this.f58441b = listener;
        Preconditions.m11187k(transportExecutor, "transportExecutor");
        this.f58440a = transportExecutor;
    }

    @Override // io.grpc.internal.MessageDeframer.Listener
    /* renamed from: a */
    public void mo31026a(StreamListener.MessageProducer messageProducer) {
        while (true) {
            InputStream next = messageProducer.next();
            if (next == null) {
                return;
            } else {
                this.f58442c.add(next);
            }
        }
    }

    @Override // io.grpc.internal.MessageDeframer.Listener
    /* renamed from: b */
    public void mo31013b(final boolean z) {
        this.f58440a.mo31036e(new Runnable() { // from class: io.grpc.internal.ApplicationThreadDeframerListener.2
            @Override // java.lang.Runnable
            public void run() {
                ApplicationThreadDeframerListener.this.f58441b.mo31013b(z);
            }
        });
    }

    @Override // io.grpc.internal.MessageDeframer.Listener
    /* renamed from: c */
    public void mo31034c(final int i2) {
        this.f58440a.mo31036e(new Runnable() { // from class: io.grpc.internal.ApplicationThreadDeframerListener.1
            @Override // java.lang.Runnable
            public void run() {
                ApplicationThreadDeframerListener.this.f58441b.mo31034c(i2);
            }
        });
    }

    @Override // io.grpc.internal.MessageDeframer.Listener
    /* renamed from: d */
    public void mo31035d(Throwable th) {
        this.f58440a.mo31036e(new RunnableC63383(th));
    }
}
