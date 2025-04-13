package io.reactivex;

import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;

/* loaded from: classes3.dex */
public interface Observer<T> {
    /* renamed from: a */
    void mo31373a(@NonNull Disposable disposable);

    void onComplete();

    void onError(@NonNull Throwable th);

    void onNext(@NonNull T t);
}
