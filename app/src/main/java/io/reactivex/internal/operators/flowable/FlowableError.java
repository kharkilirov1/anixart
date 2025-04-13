package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscriptions.EmptySubscription;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.reactivestreams.Subscriber;

/* loaded from: classes3.dex */
public final class FlowableError<T> extends Flowable<T> {

    /* renamed from: c */
    public final Callable<? extends Throwable> f60114c;

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        try {
            Throwable call = this.f60114c.call();
            Objects.requireNonNull(call, "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
            th = call;
        } catch (Throwable th) {
            th = th;
            Exceptions.m31402a(th);
        }
        subscriber.mo31352d(EmptySubscription.INSTANCE);
        subscriber.onError(th);
    }
}
