package io.grpc.internal;

import com.google.common.base.MoreObjects;
import io.grpc.Compressor;
import io.grpc.Deadline;
import io.grpc.DecompressorRegistry;
import io.grpc.Status;
import java.io.InputStream;

/* loaded from: classes3.dex */
abstract class ForwardingClientStream implements ClientStream {
    @Override // io.grpc.internal.ClientStream
    /* renamed from: a */
    public void mo30978a(Status status) {
        mo31086t().mo30978a(status);
    }

    @Override // io.grpc.internal.Stream
    /* renamed from: b */
    public boolean mo30979b() {
        return mo31086t().mo30979b();
    }

    @Override // io.grpc.internal.Stream
    /* renamed from: c */
    public void mo30980c(boolean z) {
        mo31086t().mo30980c(z);
    }

    @Override // io.grpc.internal.Stream
    /* renamed from: e */
    public void mo30981e(Compressor compressor) {
        mo31086t().mo30981e(compressor);
    }

    @Override // io.grpc.internal.Stream
    public void flush() {
        mo31086t().flush();
    }

    @Override // io.grpc.internal.Stream
    /* renamed from: g */
    public void mo30982g(int i2) {
        mo31086t().mo30982g(i2);
    }

    @Override // io.grpc.internal.ClientStream
    /* renamed from: h */
    public void mo30983h(int i2) {
        mo31086t().mo30983h(i2);
    }

    @Override // io.grpc.internal.ClientStream
    /* renamed from: i */
    public void mo30984i(int i2) {
        mo31086t().mo30984i(i2);
    }

    @Override // io.grpc.internal.ClientStream
    /* renamed from: k */
    public void mo30985k(DecompressorRegistry decompressorRegistry) {
        mo31086t().mo30985k(decompressorRegistry);
    }

    @Override // io.grpc.internal.ClientStream
    /* renamed from: m */
    public void mo30986m(String str) {
        mo31086t().mo30986m(str);
    }

    @Override // io.grpc.internal.ClientStream
    /* renamed from: n */
    public void mo30987n(InsightBuilder insightBuilder) {
        mo31086t().mo30987n(insightBuilder);
    }

    @Override // io.grpc.internal.ClientStream
    /* renamed from: o */
    public void mo30988o() {
        mo31086t().mo30988o();
    }

    @Override // io.grpc.internal.ClientStream
    /* renamed from: p */
    public void mo30989p(Deadline deadline) {
        mo31086t().mo30989p(deadline);
    }

    @Override // io.grpc.internal.ClientStream
    /* renamed from: q */
    public void mo30976q(ClientStreamListener clientStreamListener) {
        mo31086t().mo30976q(clientStreamListener);
    }

    @Override // io.grpc.internal.Stream
    /* renamed from: r */
    public void mo30990r(InputStream inputStream) {
        mo31086t().mo30990r(inputStream);
    }

    @Override // io.grpc.internal.Stream
    /* renamed from: s */
    public void mo30991s() {
        mo31086t().mo30991s();
    }

    /* renamed from: t */
    public abstract ClientStream mo31086t();

    public String toString() {
        MoreObjects.ToStringHelper m11166b = MoreObjects.m11166b(this);
        m11166b.m11171e("delegate", mo31086t());
        return m11166b.toString();
    }

    @Override // io.grpc.internal.ClientStream
    /* renamed from: u */
    public void mo30993u(boolean z) {
        mo31086t().mo30993u(z);
    }
}
