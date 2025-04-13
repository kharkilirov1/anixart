package io.grpc.internal;

import io.grpc.Decompressor;
import io.grpc.internal.MessageDeframer;
import io.grpc.internal.StreamListener;
import io.perfmark.Impl;
import io.perfmark.PerfMark;
import java.io.Closeable;
import java.io.InputStream;
import java.util.Objects;

/* loaded from: classes3.dex */
final class MigratingThreadDeframer implements ThreadOptimizedDeframer {

    /* renamed from: io.grpc.internal.MigratingThreadDeframer$1 */
    class RunnableC64341 implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ MigratingThreadDeframer f58926b;

        @Override // java.lang.Runnable
        public void run() {
            try {
                Objects.requireNonNull(this.f58926b);
                Objects.requireNonNull(this.f58926b);
                throw null;
            } finally {
                Objects.requireNonNull(PerfMark.f59566a);
            }
        }
    }

    /* renamed from: io.grpc.internal.MigratingThreadDeframer$1CloseOp, reason: invalid class name */
    public class C1CloseOp implements InterfaceC6436Op {
    }

    /* renamed from: io.grpc.internal.MigratingThreadDeframer$1CloseWhenCompleteOp, reason: invalid class name */
    public class C1CloseWhenCompleteOp implements InterfaceC6436Op {
    }

    /* renamed from: io.grpc.internal.MigratingThreadDeframer$1DeframeOp, reason: invalid class name */
    public class C1DeframeOp implements InterfaceC6436Op, Closeable {

        /* renamed from: b */
        public final /* synthetic */ ReadableBuffer f58927b;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f58927b.close();
        }
    }

    /* renamed from: io.grpc.internal.MigratingThreadDeframer$1RequestAgainOp, reason: invalid class name */
    class C1RequestAgainOp implements InterfaceC6436Op {
    }

    /* renamed from: io.grpc.internal.MigratingThreadDeframer$1RequestOp, reason: invalid class name */
    public class C1RequestOp implements InterfaceC6436Op {

        /* renamed from: b */
        public final /* synthetic */ int f58928b;

        /* renamed from: c */
        public final /* synthetic */ MigratingThreadDeframer f58929c;

        /* renamed from: io.grpc.internal.MigratingThreadDeframer$1RequestOp$1 */
        class RunnableC64351 implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ C1RequestOp f58930b;

            @Override // java.lang.Runnable
            public void run() {
                Impl impl = PerfMark.f59566a;
                Objects.requireNonNull(impl);
                Objects.requireNonNull(impl);
                try {
                    C1RequestOp c1RequestOp = this.f58930b;
                    MigratingThreadDeframer migratingThreadDeframer = c1RequestOp.f58929c;
                    int i2 = c1RequestOp.f58928b;
                    Objects.requireNonNull(migratingThreadDeframer);
                    throw null;
                } catch (Throwable th) {
                    Objects.requireNonNull(PerfMark.f59566a);
                    throw th;
                }
            }
        }
    }

    public class DeframeMessageProducer implements StreamListener.MessageProducer, Closeable {
        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            Objects.requireNonNull(null);
            throw null;
        }

        @Override // io.grpc.internal.StreamListener.MessageProducer
        public InputStream next() {
            Objects.requireNonNull(null);
            throw null;
        }
    }

    public static class MigratingDeframerListener extends ForwardingDeframerListener {

        /* renamed from: a */
        public MessageDeframer.Listener f58931a;

        @Override // io.grpc.internal.ForwardingDeframerListener
        /* renamed from: e */
        public MessageDeframer.Listener mo31089e() {
            return this.f58931a;
        }
    }

    /* renamed from: io.grpc.internal.MigratingThreadDeframer$Op */
    public interface InterfaceC6436Op {
    }

    @Override // io.grpc.internal.Deframer
    public void close() {
        throw null;
    }

    @Override // io.grpc.internal.Deframer
    /* renamed from: g */
    public void mo31029g(int i2) {
        throw null;
    }

    @Override // io.grpc.internal.Deframer
    /* renamed from: h */
    public void mo31030h(int i2) {
        throw null;
    }

    @Override // io.grpc.internal.Deframer
    /* renamed from: i */
    public void mo31031i() {
        throw null;
    }

    @Override // io.grpc.internal.Deframer
    /* renamed from: j */
    public void mo31032j(Decompressor decompressor) {
        throw null;
    }

    @Override // io.grpc.internal.Deframer
    /* renamed from: k */
    public void mo31033k(ReadableBuffer readableBuffer) {
        throw null;
    }
}
