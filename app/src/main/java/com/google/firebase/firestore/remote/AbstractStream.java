package com.google.firebase.firestore.remote;

import androidx.annotation.VisibleForTesting;
import com.google.firebase.firestore.remote.Stream;
import com.google.firebase.firestore.remote.Stream.StreamCallback;
import io.grpc.Metadata;
import io.grpc.Status;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
abstract class AbstractStream<ReqT, RespT, CallbackT extends Stream.StreamCallback> implements Stream<CallbackT> {

    /* renamed from: a */
    public static final /* synthetic */ int f22923a = 0;

    public class CloseGuardedRunner {

        /* renamed from: a */
        public final /* synthetic */ AbstractStream f22924a;
    }

    @VisibleForTesting
    public class IdleTimeoutRunnable implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            int i2 = AbstractStream.f22923a;
            Objects.requireNonNull(null);
            throw null;
        }
    }

    public class StreamObserver implements IncomingStreamObserver<RespT> {

        /* renamed from: a */
        public final AbstractStream<ReqT, RespT, CallbackT>.CloseGuardedRunner f22925a;

        @Override // com.google.firebase.firestore.remote.IncomingStreamObserver
        /* renamed from: a */
        public void mo12481a(Metadata metadata) {
            AbstractStream abstractStream = this.f22925a.f22924a;
            int i2 = AbstractStream.f22923a;
            Objects.requireNonNull(abstractStream);
            throw null;
        }

        @Override // com.google.firebase.firestore.remote.IncomingStreamObserver
        /* renamed from: b */
        public void mo12482b(Status status) {
            AbstractStream abstractStream = this.f22925a.f22924a;
            int i2 = AbstractStream.f22923a;
            Objects.requireNonNull(abstractStream);
            throw null;
        }

        @Override // com.google.firebase.firestore.remote.IncomingStreamObserver
        public void onNext(RespT respt) {
            AbstractStream abstractStream = this.f22925a.f22924a;
            int i2 = AbstractStream.f22923a;
            Objects.requireNonNull(abstractStream);
            throw null;
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        timeUnit.toMillis(1L);
        TimeUnit timeUnit2 = TimeUnit.MINUTES;
        timeUnit2.toMillis(1L);
        timeUnit2.toMillis(1L);
        timeUnit.toMillis(10L);
        timeUnit.toMillis(10L);
    }
}
