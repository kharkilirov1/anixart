package io.grpc.stub;

import com.google.common.base.MoreObjects;
import com.google.common.util.concurrent.AbstractFuture;
import io.grpc.CallOptions;
import io.grpc.ClientCall;
import io.grpc.Metadata;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Logger;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public final class ClientCalls {

    public static final class BlockingResponseStream<T> implements Iterator<T> {

        public final class QueuingListener extends StartableListener<T> {
            @Override // io.grpc.ClientCall.Listener
            /* renamed from: a */
            public void mo12483a(Status status, Metadata metadata) {
                if (status.m30945e()) {
                    Objects.requireNonNull(null);
                    throw null;
                }
                Objects.requireNonNull(null);
                throw null;
            }

            @Override // io.grpc.ClientCall.Listener
            /* renamed from: b */
            public void mo12484b(Metadata metadata) {
            }

            @Override // io.grpc.ClientCall.Listener
            /* renamed from: c */
            public void mo12485c(T t) {
                Objects.requireNonNull(null);
                throw null;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            throw null;
        }

        @Override // java.util.Iterator
        public T next() {
            throw null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static final class CallToStreamObserverAdapter<ReqT> extends ClientCallStreamObserver<ReqT> {
        @Override // io.grpc.stub.StreamObserver
        /* renamed from: a */
        public void mo31322a() {
            throw null;
        }

        @Override // io.grpc.stub.StreamObserver
        public void onError(Throwable th) {
            throw null;
        }

        @Override // io.grpc.stub.StreamObserver
        public void onNext(ReqT reqt) {
            throw null;
        }
    }

    public static final class GrpcFuture<RespT> extends AbstractFuture<RespT> {
        @Override // com.google.common.util.concurrent.AbstractFuture
        /* renamed from: j */
        public void mo12146j() {
            throw null;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture
        /* renamed from: l */
        public String mo12135l() {
            MoreObjects.ToStringHelper m11166b = MoreObjects.m11166b(this);
            m11166b.m11171e("clientCall", null);
            return m11166b.toString();
        }

        @Override // com.google.common.util.concurrent.AbstractFuture
        /* renamed from: n */
        public boolean mo12149n(@Nullable RespT respt) {
            return super.mo12149n(respt);
        }

        @Override // com.google.common.util.concurrent.AbstractFuture
        /* renamed from: o */
        public boolean mo12150o(Throwable th) {
            return super.mo12150o(th);
        }
    }

    public static abstract class StartableListener<T> extends ClientCall.Listener<T> {
    }

    public static final class StreamObserverToCallListenerAdapter<ReqT, RespT> extends StartableListener<RespT> {

        /* renamed from: a */
        public boolean f59489a;

        @Override // io.grpc.ClientCall.Listener
        /* renamed from: a */
        public void mo12483a(Status status, Metadata metadata) {
            if (status.m30945e()) {
                throw null;
            }
            new StatusRuntimeException(status, metadata);
            throw null;
        }

        @Override // io.grpc.ClientCall.Listener
        /* renamed from: b */
        public void mo12484b(Metadata metadata) {
        }

        @Override // io.grpc.ClientCall.Listener
        /* renamed from: c */
        public void mo12485c(RespT respt) {
            if (this.f59489a) {
                Objects.requireNonNull(null);
                throw null;
            }
            this.f59489a = true;
            throw null;
        }

        @Override // io.grpc.ClientCall.Listener
        /* renamed from: d */
        public void mo12486d() {
            Objects.requireNonNull(null);
            throw null;
        }
    }

    public enum StubType {
        BLOCKING,
        FUTURE,
        ASYNC
    }

    public static final class ThreadlessExecutor extends ConcurrentLinkedQueue<Runnable> implements Executor {

        /* renamed from: c */
        public static final Logger f59494c = Logger.getLogger(ThreadlessExecutor.class.getName());

        /* renamed from: b */
        public volatile Thread f59495b;

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            add(runnable);
            LockSupport.unpark(this.f59495b);
        }
    }

    public static final class UnaryStreamToFuture<RespT> extends StartableListener<RespT> {

        /* renamed from: a */
        public RespT f59496a;

        @Override // io.grpc.ClientCall.Listener
        /* renamed from: a */
        public void mo12483a(Status status, Metadata metadata) {
            if (!status.m30945e()) {
                new StatusRuntimeException(status, metadata);
                throw null;
            }
            if (this.f59496a != null) {
                throw null;
            }
            new StatusRuntimeException(Status.f58286m.m30947g("No value received for unary call"), metadata);
            throw null;
        }

        @Override // io.grpc.ClientCall.Listener
        /* renamed from: b */
        public void mo12484b(Metadata metadata) {
        }

        @Override // io.grpc.ClientCall.Listener
        /* renamed from: c */
        public void mo12485c(RespT respt) {
            if (this.f59496a != null) {
                throw new StatusRuntimeException(Status.f58286m.m30947g("More than one value received for unary call"));
            }
            this.f59496a = respt;
        }
    }

    static {
        Logger.getLogger(ClientCalls.class.getName());
        CallOptions.Key.m30808a("internal-stub-type");
    }
}
