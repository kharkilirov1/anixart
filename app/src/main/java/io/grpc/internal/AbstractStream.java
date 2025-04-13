package io.grpc.internal;

import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.google.common.base.Preconditions;
import io.grpc.Compressor;
import io.grpc.internal.ApplicationThreadDeframer;
import io.grpc.internal.MessageDeframer;
import io.grpc.internal.StreamListener;
import io.perfmark.Impl;
import io.perfmark.PerfMark;
import java.io.InputStream;
import java.util.Objects;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes3.dex */
public abstract class AbstractStream implements Stream {

    public static abstract class TransportState implements ApplicationThreadDeframer.TransportExecutor, MessageDeframer.Listener {

        /* renamed from: a */
        public Deframer f58417a;

        /* renamed from: b */
        public final Object f58418b;

        /* renamed from: c */
        public final TransportTracer f58419c;

        /* renamed from: d */
        public final MessageDeframer f58420d;

        /* renamed from: e */
        @GuardedBy
        public int f58421e;

        /* renamed from: f */
        @GuardedBy
        public boolean f58422f;

        /* renamed from: g */
        @GuardedBy
        public boolean f58423g;

        @Override // io.grpc.internal.MessageDeframer.Listener
        /* renamed from: a */
        public void mo31026a(StreamListener.MessageProducer messageProducer) {
            mo31014g().mo31052a(messageProducer);
        }

        /* renamed from: f */
        public final boolean m31027f() {
            boolean z;
            synchronized (this.f58418b) {
                z = this.f58422f && this.f58421e < 32768 && !this.f58423g;
            }
            return z;
        }

        /* renamed from: g */
        public abstract StreamListener mo31014g();

        /* renamed from: h */
        public final void m31028h() {
            boolean m31027f;
            synchronized (this.f58418b) {
                m31027f = m31027f();
            }
            if (m31027f) {
                mo31014g().mo31054e();
            }
        }
    }

    @Override // io.grpc.internal.Stream
    /* renamed from: b */
    public boolean mo30979b() {
        return mo31003w().m31027f();
    }

    @Override // io.grpc.internal.Stream
    /* renamed from: c */
    public final void mo30980c(boolean z) {
        mo31002v().mo31006c(z);
    }

    @Override // io.grpc.internal.Stream
    /* renamed from: e */
    public final void mo30981e(Compressor compressor) {
        Framer mo31002v = mo31002v();
        Preconditions.m11187k(compressor, "compressor");
        mo31002v.mo31007e(compressor);
    }

    @Override // io.grpc.internal.Stream
    public final void flush() {
        if (mo31002v().isClosed()) {
            return;
        }
        mo31002v().flush();
    }

    @Override // io.grpc.internal.Stream
    /* renamed from: g */
    public final void mo30982g(int i2) {
        TransportState mo31003w = mo31003w();
        if (!(mo31003w.f58417a instanceof ThreadOptimizedDeframer)) {
            PerfMark.m31344a();
            mo31003w.mo31036e(new Runnable(Impl.f59565b, i2) { // from class: io.grpc.internal.AbstractStream.TransportState.1RequestRunnable

                /* renamed from: b */
                public final /* synthetic */ int f58424b;

                {
                    this.f58424b = i2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    Impl impl = PerfMark.f59566a;
                    Objects.requireNonNull(impl);
                    Objects.requireNonNull(impl);
                    try {
                        TransportState.this.f58417a.mo31029g(this.f58424b);
                    } catch (Throwable th) {
                        try {
                            TransportState.this.mo31035d(th);
                            impl = PerfMark.f59566a;
                        } catch (Throwable th2) {
                            Objects.requireNonNull(PerfMark.f59566a);
                            throw th2;
                        }
                    }
                    Objects.requireNonNull(impl);
                }
            });
        } else {
            try {
                mo31003w.f58417a.mo31029g(i2);
            } finally {
                Objects.requireNonNull(PerfMark.f59566a);
            }
        }
    }

    @Override // io.grpc.internal.Stream
    /* renamed from: r */
    public final void mo30990r(InputStream inputStream) {
        Preconditions.m11187k(inputStream, ThrowableDeserializer.PROP_NAME_MESSAGE);
        try {
            if (!mo31002v().isClosed()) {
                mo31002v().mo31008f(inputStream);
            }
        } finally {
            GrpcUtil.m31092c(inputStream);
        }
    }

    @Override // io.grpc.internal.Stream
    /* renamed from: s */
    public void mo30991s() {
        TransportState mo31003w = mo31003w();
        MessageDeframer messageDeframer = mo31003w.f58420d;
        messageDeframer.f58880b = mo31003w;
        mo31003w.f58417a = messageDeframer;
    }

    /* renamed from: v */
    public abstract Framer mo31002v();

    /* renamed from: w */
    public abstract TransportState mo31003w();
}
