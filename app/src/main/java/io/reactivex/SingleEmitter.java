package io.reactivex;

import io.reactivex.annotations.NonNull;

/* loaded from: classes3.dex */
public interface SingleEmitter<T> {
    /* renamed from: a */
    boolean mo31387a(@NonNull Throwable th);

    void onError(@NonNull Throwable th);

    void onSuccess(@NonNull T t);
}
