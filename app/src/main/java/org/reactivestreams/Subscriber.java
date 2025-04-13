package org.reactivestreams;

/* loaded from: classes3.dex */
public interface Subscriber<T> {
    /* renamed from: d */
    void mo31352d(Subscription subscription);

    void onComplete();

    void onError(Throwable th);

    void onNext(T t);
}
