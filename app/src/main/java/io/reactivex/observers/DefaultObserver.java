package io.reactivex.observers;

import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.EndConsumerHelper;
import java.util.Objects;

/* loaded from: classes3.dex */
public abstract class DefaultObserver<T> implements Observer<T> {

    /* renamed from: b */
    public Disposable f62814b;

    @Override // io.reactivex.Observer
    /* renamed from: a */
    public final void mo31373a(@NonNull Disposable disposable) {
        boolean z;
        Disposable disposable2 = this.f62814b;
        Class<?> cls = getClass();
        Objects.requireNonNull(disposable, "next is null");
        if (disposable2 != null) {
            disposable.mo31379f();
            if (disposable2 != DisposableHelper.DISPOSED) {
                EndConsumerHelper.m31814a(cls);
            }
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.f62814b = disposable;
        }
    }
}
