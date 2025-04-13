package com.google.firebase.firestore.remote;

import io.grpc.Metadata;
import io.grpc.Status;

/* loaded from: classes2.dex */
interface IncomingStreamObserver<RespT> {
    /* renamed from: a */
    void mo12481a(Metadata metadata);

    /* renamed from: b */
    void mo12482b(Status status);

    void onNext(RespT respt);
}
