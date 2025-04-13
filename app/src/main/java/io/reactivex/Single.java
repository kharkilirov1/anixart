package io.reactivex;

import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.exceptions.Exceptions;
import java.util.Objects;

/* loaded from: classes3.dex */
public abstract class Single<T> implements SingleSource<T> {
    @Override // io.reactivex.SingleSource
    @SchedulerSupport
    /* renamed from: b */
    public final void mo31385b(SingleObserver<? super T> singleObserver) {
        Objects.requireNonNull(singleObserver, "observer is null");
        try {
            mo31386c(singleObserver);
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
    public abstract void mo31386c(@NonNull SingleObserver<? super T> singleObserver);
}
