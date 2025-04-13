package io.reactivex.internal.operators.mixed;

import io.reactivex.CompletableObserver;
import io.reactivex.MaybeObserver;
import io.reactivex.Notification;
import io.reactivex.SingleObserver;
import io.reactivex.annotations.Experimental;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.Objects;

@Experimental
/* loaded from: classes3.dex */
public final class MaterializeSingleObserver<T> implements SingleObserver<T>, MaybeObserver<T>, CompletableObserver, Disposable {

    /* renamed from: b */
    public final SingleObserver<? super Notification<T>> f61260b;

    /* renamed from: c */
    public Disposable f61261c;

    @Override // io.reactivex.SingleObserver
    /* renamed from: a */
    public void mo31388a(Disposable disposable) {
        if (DisposableHelper.m31414h(this.f61261c, disposable)) {
            this.f61261c = disposable;
            this.f61260b.mo31388a(this);
        }
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: f */
    public void mo31379f() {
        this.f61261c.mo31379f();
    }

    @Override // io.reactivex.MaybeObserver
    public void onComplete() {
        this.f61260b.onSuccess(Notification.f59570b);
    }

    @Override // io.reactivex.SingleObserver
    public void onError(Throwable th) {
        SingleObserver<? super Notification<T>> singleObserver = this.f61260b;
        Objects.requireNonNull(th, "error is null");
        singleObserver.onSuccess(new Notification(NotificationLite.m31832e(th)));
    }

    @Override // io.reactivex.SingleObserver
    public void onSuccess(T t) {
        SingleObserver<? super Notification<T>> singleObserver = this.f61260b;
        Objects.requireNonNull(t, "value is null");
        singleObserver.onSuccess(new Notification(t));
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: s */
    public boolean mo31380s() {
        return this.f61261c.mo31380s();
    }
}
