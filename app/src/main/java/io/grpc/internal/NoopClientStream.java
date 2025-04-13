package io.grpc.internal;

import io.grpc.Compressor;
import io.grpc.Deadline;
import io.grpc.DecompressorRegistry;
import io.grpc.Status;
import java.io.InputStream;
import javax.annotation.Nonnull;

/* loaded from: classes3.dex */
public class NoopClientStream implements ClientStream {

    /* renamed from: a */
    public static final NoopClientStream f58932a = new NoopClientStream();

    @Override // io.grpc.internal.ClientStream
    /* renamed from: a */
    public void mo30978a(Status status) {
    }

    @Override // io.grpc.internal.Stream
    /* renamed from: b */
    public boolean mo30979b() {
        return false;
    }

    @Override // io.grpc.internal.Stream
    /* renamed from: c */
    public void mo30980c(boolean z) {
    }

    @Override // io.grpc.internal.Stream
    /* renamed from: e */
    public void mo30981e(Compressor compressor) {
    }

    @Override // io.grpc.internal.Stream
    public void flush() {
    }

    @Override // io.grpc.internal.Stream
    /* renamed from: g */
    public void mo30982g(int i2) {
    }

    @Override // io.grpc.internal.ClientStream
    /* renamed from: h */
    public void mo30983h(int i2) {
    }

    @Override // io.grpc.internal.ClientStream
    /* renamed from: i */
    public void mo30984i(int i2) {
    }

    @Override // io.grpc.internal.ClientStream
    /* renamed from: k */
    public void mo30985k(DecompressorRegistry decompressorRegistry) {
    }

    @Override // io.grpc.internal.ClientStream
    /* renamed from: m */
    public void mo30986m(String str) {
    }

    @Override // io.grpc.internal.ClientStream
    /* renamed from: n */
    public void mo30987n(InsightBuilder insightBuilder) {
        insightBuilder.f58728a.add("noop");
    }

    @Override // io.grpc.internal.ClientStream
    /* renamed from: o */
    public void mo30988o() {
    }

    @Override // io.grpc.internal.ClientStream
    /* renamed from: p */
    public void mo30989p(@Nonnull Deadline deadline) {
    }

    @Override // io.grpc.internal.ClientStream
    /* renamed from: q */
    public void mo30976q(ClientStreamListener clientStreamListener) {
    }

    @Override // io.grpc.internal.Stream
    /* renamed from: r */
    public void mo30990r(InputStream inputStream) {
    }

    @Override // io.grpc.internal.Stream
    /* renamed from: s */
    public void mo30991s() {
    }

    @Override // io.grpc.internal.ClientStream
    /* renamed from: u */
    public void mo30993u(boolean z) {
    }
}
