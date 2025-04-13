package io.grpc.internal;

import com.google.common.base.Preconditions;
import io.grpc.Attributes;
import io.grpc.Metadata;
import io.grpc.Status;
import io.grpc.internal.AbstractStream;
import io.grpc.internal.MessageFramer;
import java.util.Objects;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public abstract class AbstractServerStream extends AbstractStream implements ServerStream, MessageFramer.Sink {

    /* renamed from: a */
    public boolean f58415a;

    public interface Sink {
        /* renamed from: a */
        void m31022a(Status status);

        /* renamed from: d */
        void m31023d(Metadata metadata);

        /* renamed from: e */
        void m31024e(@Nullable WritableBuffer writableBuffer, boolean z, int i2);
    }

    public static abstract class TransportState extends AbstractStream.TransportState {

        /* renamed from: h */
        public ServerStreamListener f58416h;

        /* renamed from: io.grpc.internal.AbstractServerStream$TransportState$1 */
        class RunnableC63291 implements Runnable {
            @Override // java.lang.Runnable
            public void run() {
                TransportState.m31025i(null, null);
                throw null;
            }
        }

        /* renamed from: io.grpc.internal.AbstractServerStream$TransportState$2 */
        class RunnableC63302 implements Runnable {
            @Override // java.lang.Runnable
            public void run() {
                TransportState.m31025i(null, Status.f58278e);
                throw null;
            }
        }

        /* renamed from: i */
        public static void m31025i(TransportState transportState, Status status) {
            Objects.requireNonNull(null);
            throw null;
        }

        @Override // io.grpc.internal.MessageDeframer.Listener
        /* renamed from: b */
        public void mo31013b(boolean z) {
        }

        @Override // io.grpc.internal.AbstractStream.TransportState
        /* renamed from: g */
        public StreamListener mo31014g() {
            return this.f58416h;
        }
    }

    @Override // io.grpc.internal.ServerStream
    /* renamed from: a */
    public final void mo30994a(Status status) {
        m31020x().m31022a(status);
    }

    @Override // io.grpc.internal.AbstractStream, io.grpc.internal.Stream
    /* renamed from: b */
    public final boolean mo30979b() {
        return super.mo30979b();
    }

    @Override // io.grpc.internal.ServerStream
    /* renamed from: d */
    public final void mo30995d(Metadata metadata) {
        m31020x().m31023d(metadata);
    }

    @Override // io.grpc.internal.ServerStream
    /* renamed from: f */
    public Attributes mo30996f() {
        return Attributes.f58053b;
    }

    @Override // io.grpc.internal.ServerStream
    /* renamed from: j */
    public final void mo30997j(Status status, Metadata metadata) {
        Preconditions.m11187k(status, "status");
        Preconditions.m11187k(metadata, "trailers");
        if (this.f58415a) {
            return;
        }
        this.f58415a = true;
        throw null;
    }

    @Override // io.grpc.internal.ServerStream
    /* renamed from: l */
    public String mo30998l() {
        return null;
    }

    @Override // io.grpc.internal.MessageFramer.Sink
    /* renamed from: t */
    public final void mo31001t(WritableBuffer writableBuffer, boolean z, boolean z2, int i2) {
        Sink m31020x = m31020x();
        if (z) {
            z2 = false;
        }
        m31020x.m31024e(writableBuffer, z2, i2);
    }

    @Override // io.grpc.internal.AbstractStream
    /* renamed from: v */
    public /* bridge */ /* synthetic */ Framer mo31002v() {
        return null;
    }

    /* renamed from: x */
    public abstract Sink m31020x();

    @Override // io.grpc.internal.AbstractStream
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public abstract TransportState mo31003w();
}
