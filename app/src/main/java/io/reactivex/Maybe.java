package io.reactivex;

import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.exceptions.Exceptions;
import java.util.Objects;

/* loaded from: classes3.dex */
public abstract class Maybe<T> implements MaybeSource<T> {
    @Override // io.reactivex.MaybeSource
    @SchedulerSupport
    /* renamed from: b */
    public final void mo31353b(MaybeObserver<? super T> maybeObserver) {
        Objects.requireNonNull(maybeObserver, "observer is null");
        try {
            mo31354c(maybeObserver);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            Exceptions.m31402a(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* renamed from: c */
    public abstract void mo31354c(MaybeObserver<? super T> maybeObserver);
}
