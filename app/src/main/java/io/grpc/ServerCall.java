package io.grpc;

import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public abstract class ServerCall<ReqT, RespT> {

    public static abstract class Listener<ReqT> {
        /* renamed from: a */
        public void mo30846a() {
        }

        /* renamed from: b */
        public void mo30847b() {
        }

        /* renamed from: c */
        public void mo30848c() {
        }

        /* renamed from: d */
        public void mo30849d(ReqT reqt) {
        }

        /* renamed from: e */
        public void mo30850e() {
        }
    }

    /* renamed from: a */
    public abstract void mo30861a(Status status, Metadata metadata);

    @ExperimentalApi
    /* renamed from: b */
    public Attributes mo30862b() {
        return Attributes.f58053b;
    }

    @ExperimentalApi
    @Nullable
    /* renamed from: c */
    public String mo30863c() {
        return null;
    }

    /* renamed from: d */
    public abstract MethodDescriptor<ReqT, RespT> mo30870d();

    /* renamed from: e */
    public abstract boolean mo30864e();

    /* renamed from: f */
    public boolean mo30933f() {
        return true;
    }

    /* renamed from: g */
    public abstract void mo30865g(int i2);

    /* renamed from: h */
    public abstract void mo30866h(Metadata metadata);

    /* renamed from: i */
    public abstract void mo30867i(RespT respt);

    @ExperimentalApi
    /* renamed from: j */
    public void mo30868j(String str) {
    }

    @ExperimentalApi
    /* renamed from: k */
    public void mo30869k(boolean z) {
    }
}
