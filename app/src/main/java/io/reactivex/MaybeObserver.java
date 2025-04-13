package io.reactivex;

import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;

/* loaded from: classes3.dex */
public interface MaybeObserver<T> {
    /* renamed from: a */
    void mo31355a(@NonNull Disposable disposable);

    void onComplete();

    void onError(@NonNull Throwable th);

    void onSuccess(@NonNull T t);
}
