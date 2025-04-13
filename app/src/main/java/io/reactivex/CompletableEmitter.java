package io.reactivex;

import io.reactivex.annotations.NonNull;

/* loaded from: classes3.dex */
public interface CompletableEmitter {
    void onComplete();

    void onError(@NonNull Throwable th);
}
