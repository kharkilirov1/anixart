package io.grpc;

import com.google.common.base.MoreObjects;
import javax.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class PartialForwardingClientCall<ReqT, RespT> extends ClientCall<ReqT, RespT> {
    @Override // io.grpc.ClientCall
    /* renamed from: a */
    public void mo30812a(@Nullable String str, @Nullable Throwable th) {
        mo12488g().mo30812a(str, th);
    }

    @Override // io.grpc.ClientCall
    /* renamed from: b */
    public void mo12487b() {
        mo12488g().mo12487b();
    }

    @Override // io.grpc.ClientCall
    /* renamed from: c */
    public void mo30813c(int i2) {
        mo12488g().mo30813c(i2);
    }

    @Override // io.grpc.ClientCall
    /* renamed from: e */
    public void mo30815e(boolean z) {
        mo12488g().mo30815e(z);
    }

    /* renamed from: g */
    public abstract ClientCall<?, ?> mo12488g();

    public String toString() {
        MoreObjects.ToStringHelper m11166b = MoreObjects.m11166b(this);
        m11166b.m11171e("delegate", mo12488g());
        return m11166b.toString();
    }
}
