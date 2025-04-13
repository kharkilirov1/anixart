package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.Exceptions;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;

/* loaded from: classes3.dex */
public final class FlowableLift<R, T> extends AbstractFlowableWithUpstream<T, R> {
    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super R> subscriber) {
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
