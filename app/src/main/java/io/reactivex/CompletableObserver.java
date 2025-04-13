package io.reactivex;

import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;

/* loaded from: classes3.dex */
public interface CompletableObserver {
    /* renamed from: a */
    void mo31347a(@NonNull Disposable disposable);

    void onComplete();

    void onError(@NonNull Throwable th);
}
