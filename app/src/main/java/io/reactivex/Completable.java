package io.reactivex;

import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;

/* loaded from: classes3.dex */
public abstract class Completable implements CompletableSource {
    @Override // io.reactivex.CompletableSource
    @SchedulerSupport
    /* renamed from: b */
    public final void mo31345b(CompletableObserver completableObserver) {
        Objects.requireNonNull(completableObserver, "observer is null");
        try {
            mo31346c(completableObserver);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            Exceptions.m31402a(th);
            RxJavaPlugins.m31848b(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* renamed from: c */
    public abstract void mo31346c(CompletableObserver completableObserver);
}
