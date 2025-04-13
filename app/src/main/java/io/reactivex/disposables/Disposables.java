package io.reactivex.disposables;

import io.reactivex.annotations.NonNull;
import io.reactivex.internal.functions.Functions;

/* loaded from: classes3.dex */
public final class Disposables {
    public Disposables() {
        throw new IllegalStateException("No instances!");
    }

    @NonNull
    /* renamed from: a */
    public static Disposable m31397a() {
        return new RunnableDisposable(Functions.f59620a);
    }

    @NonNull
    /* renamed from: b */
    public static Disposable m31398b(@NonNull Runnable runnable) {
        return new RunnableDisposable(runnable);
    }
}
