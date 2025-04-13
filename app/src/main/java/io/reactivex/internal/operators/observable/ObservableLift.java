package io.reactivex.internal.operators.observable;

import io.reactivex.Observer;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes3.dex */
public final class ObservableLift<R, T> extends AbstractObservableWithUpstream<T, R> {
    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super R> observer) {
        try {
            throw null;
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            Exceptions.m31402a(th);
            RxJavaPlugins.m31848b(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }
}
