package io.grpc.internal;

import io.grpc.Attributes;
import io.grpc.Metadata;
import io.grpc.Status;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public interface ServerStream extends Stream {
    /* renamed from: a */
    void mo30994a(Status status);

    /* renamed from: d */
    void mo30995d(Metadata metadata);

    /* renamed from: f */
    Attributes mo30996f();

    /* renamed from: j */
    void mo30997j(Status status, Metadata metadata);

    @Nullable
    /* renamed from: l */
    String mo30998l();
}
