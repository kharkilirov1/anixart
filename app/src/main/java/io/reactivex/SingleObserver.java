package io.reactivex;

import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;

/* loaded from: classes3.dex */
public interface SingleObserver<T> {
    /* renamed from: a */
    void mo31388a(@NonNull Disposable disposable);

    void onError(@NonNull Throwable th);

    void onSuccess(@NonNull T t);
}
