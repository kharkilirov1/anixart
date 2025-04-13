package io.grpc;

import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public abstract class ClientCall<ReqT, RespT> {

    public static abstract class Listener<T> {
        /* renamed from: a */
        public void mo12483a(Status status, Metadata metadata) {
        }

        /* renamed from: b */
        public void mo12484b(Metadata metadata) {
        }

        /* renamed from: c */
        public void mo12485c(T t) {
        }

        /* renamed from: d */
        public void mo12486d() {
        }
    }

    /* renamed from: a */
    public abstract void mo30812a(@Nullable String str, @Nullable Throwable th);

    /* renamed from: b */
    public abstract void mo12487b();

    /* renamed from: c */
    public abstract void mo30813c(int i2);

    /* renamed from: d */
    public abstract void mo30814d(ReqT reqt);

    @ExperimentalApi
    /* renamed from: e */
    public void mo30815e(boolean z) {
    }

    /* renamed from: f */
    public abstract void mo30816f(Listener<RespT> listener, Metadata metadata);
}
