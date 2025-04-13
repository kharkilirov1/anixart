package io.grpc.stub;

/* loaded from: classes3.dex */
public interface StreamObserver<V> {
    /* renamed from: a */
    void mo31322a();

    void onError(Throwable th);

    void onNext(V v);
}
