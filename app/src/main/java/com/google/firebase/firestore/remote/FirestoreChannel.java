package com.google.firebase.firestore.remote;

import com.google.firebase.firestore.util.Assert;
import io.grpc.ClientCall;
import io.grpc.ForwardingClientCall;
import io.grpc.Metadata;
import io.grpc.Status;
import java.util.Objects;

/* loaded from: classes2.dex */
public class FirestoreChannel {

    /* renamed from: a */
    public static final Metadata.Key<String> f22938a;

    /* renamed from: b */
    public static final Metadata.Key<String> f22939b;

    /* renamed from: c */
    public static final Metadata.Key<String> f22940c;

    /* renamed from: d */
    public static volatile String f22941d;

    /* renamed from: com.google.firebase.firestore.remote.FirestoreChannel$1 */
    class C21191 extends ClientCall.Listener {

        /* renamed from: a */
        public final /* synthetic */ IncomingStreamObserver f22942a;

        /* renamed from: b */
        public final /* synthetic */ ClientCall[] f22943b;

        /* renamed from: c */
        public final /* synthetic */ FirestoreChannel f22944c;

        @Override // io.grpc.ClientCall.Listener
        /* renamed from: a */
        public void mo12483a(Status status, Metadata metadata) {
            this.f22942a.mo12482b(status);
        }

        @Override // io.grpc.ClientCall.Listener
        /* renamed from: b */
        public void mo12484b(Metadata metadata) {
            this.f22942a.mo12481a(metadata);
        }

        @Override // io.grpc.ClientCall.Listener
        /* renamed from: c */
        public void mo12485c(Object obj) {
            this.f22942a.onNext(obj);
            this.f22943b[0].mo30813c(1);
        }

        @Override // io.grpc.ClientCall.Listener
        /* renamed from: d */
        public void mo12486d() {
        }
    }

    /* renamed from: com.google.firebase.firestore.remote.FirestoreChannel$2 */
    class C21202 extends ForwardingClientCall<Object, Object> {

        /* renamed from: a */
        public final /* synthetic */ ClientCall[] f22945a;

        /* renamed from: b */
        public final /* synthetic */ FirestoreChannel f22946b;

        @Override // io.grpc.PartialForwardingClientCall, io.grpc.ClientCall
        /* renamed from: b */
        public void mo12487b() {
            if (this.f22945a[0] != null) {
                super.mo12487b();
                return;
            }
            FirestoreChannel firestoreChannel = this.f22946b;
            Metadata.Key<String> key = FirestoreChannel.f22938a;
            Objects.requireNonNull(firestoreChannel);
            throw null;
        }

        @Override // io.grpc.PartialForwardingClientCall
        /* renamed from: g */
        public ClientCall<Object, Object> mo12488g() {
            Assert.m12490b(this.f22945a[0] != null, "ClientCall used before onOpen() callback", new Object[0]);
            return this.f22945a[0];
        }
    }

    /* renamed from: com.google.firebase.firestore.remote.FirestoreChannel$3 */
    class C21213 extends ClientCall.Listener {
        @Override // io.grpc.ClientCall.Listener
        /* renamed from: a */
        public void mo12483a(Status status, Metadata metadata) {
            throw null;
        }

        @Override // io.grpc.ClientCall.Listener
        /* renamed from: c */
        public void mo12485c(Object obj) {
            throw null;
        }
    }

    /* renamed from: com.google.firebase.firestore.remote.FirestoreChannel$4 */
    class C21224 extends ClientCall.Listener {
        @Override // io.grpc.ClientCall.Listener
        /* renamed from: a */
        public void mo12483a(Status status, Metadata metadata) {
            if (status.m30945e()) {
                throw null;
            }
            Metadata.Key<String> key = FirestoreChannel.f22938a;
            Objects.requireNonNull(null);
            throw null;
        }

        @Override // io.grpc.ClientCall.Listener
        /* renamed from: c */
        public void mo12485c(Object obj) {
            throw null;
        }
    }

    public static abstract class StreamingListener<T> {
    }

    static {
        Metadata.AsciiMarshaller<String> asciiMarshaller = Metadata.f58205d;
        f22938a = Metadata.Key.m30914a("x-goog-api-client", asciiMarshaller);
        f22939b = Metadata.Key.m30914a("google-cloud-resource-prefix", asciiMarshaller);
        f22940c = Metadata.Key.m30914a("x-goog-request-params", asciiMarshaller);
        f22941d = "gl-java/";
    }
}
