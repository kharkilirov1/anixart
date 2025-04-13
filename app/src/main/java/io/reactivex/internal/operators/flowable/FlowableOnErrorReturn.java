package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.subscribers.SinglePostCompleteSubscriber;
import java.util.Objects;
import org.reactivestreams.Subscriber;

/* loaded from: classes3.dex */
public final class FlowableOnErrorReturn<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class OnErrorReturnSubscriber<T> extends SinglePostCompleteSubscriber<T, T> {

        /* renamed from: f */
        public final Function<? super Throwable, ? extends T> f60431f;

        public OnErrorReturnSubscriber(Subscriber<? super T> subscriber, Function<? super Throwable, ? extends T> function) {
            super(subscriber);
            this.f60431f = null;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f62751b.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            try {
                T apply = this.f60431f.apply(th);
                Objects.requireNonNull(apply, "The valueSupplier returned a null value");
                m31788b(apply);
            } catch (Throwable th2) {
                Exceptions.m31402a(th2);
                this.f62751b.onError(new CompositeException(th, th2));
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            this.f62754e++;
            this.f62751b.onNext(t);
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        this.f59782c.m31349b(new OnErrorReturnSubscriber(subscriber, null));
    }
}
