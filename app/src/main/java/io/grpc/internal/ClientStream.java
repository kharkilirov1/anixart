package io.grpc.internal;

import io.grpc.Attributes;
import io.grpc.Deadline;
import io.grpc.DecompressorRegistry;
import io.grpc.Status;
import javax.annotation.Nonnull;

/* loaded from: classes3.dex */
public interface ClientStream extends Stream {
    /* renamed from: a */
    void mo30978a(Status status);

    /* renamed from: f */
    Attributes mo31060f();

    /* renamed from: h */
    void mo30983h(int i2);

    /* renamed from: i */
    void mo30984i(int i2);

    /* renamed from: k */
    void mo30985k(DecompressorRegistry decompressorRegistry);

    /* renamed from: m */
    void mo30986m(String str);

    /* renamed from: n */
    void mo30987n(InsightBuilder insightBuilder);

    /* renamed from: o */
    void mo30988o();

    /* renamed from: p */
    void mo30989p(@Nonnull Deadline deadline);

    /* renamed from: q */
    void mo30976q(ClientStreamListener clientStreamListener);

    /* renamed from: u */
    void mo30993u(boolean z);
}
