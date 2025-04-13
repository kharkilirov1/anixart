package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.subscribers.SinglePostCompleteSubscriber;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.reactivestreams.Subscriber;

/* loaded from: classes3.dex */
public final class FlowableMapNotification<T, R> extends AbstractFlowableWithUpstream<T, R> {

    public static final class MapNotificationSubscriber<T, R> extends SinglePostCompleteSubscriber<T, R> {

        /* renamed from: f */
        public final Function<? super T, ? extends R> f60323f;

        /* renamed from: g */
        public final Function<? super Throwable, ? extends R> f60324g;

        /* renamed from: h */
        public final Callable<? extends R> f60325h;

        public MapNotificationSubscriber(Subscriber<? super R> subscriber, Function<? super T, ? extends R> function, Function<? super Throwable, ? extends R> function2, Callable<? extends R> callable) {
            super(subscriber);
            this.f60323f = null;
            this.f60324g = null;
            this.f60325h = null;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            try {
                R call = this.f60325h.call();
                Objects.requireNonNull(call, "The onComplete publisher returned is null");
                m31788b(call);
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f62751b.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            try {
                R apply = this.f60324g.apply(th);
                Objects.requireNonNull(apply, "The onError publisher returned is null");
                m31788b(apply);
            } catch (Throwable th2) {
                Exceptions.m31402a(th2);
                this.f62751b.onError(new CompositeException(th, th2));
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            try {
                R apply = this.f60323f.apply(t);
                Objects.requireNonNull(apply, "The onNext publisher returned is null");
                this.f62754e++;
                this.f62751b.onNext(apply);
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f62751b.onError(th);
            }
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super R> subscriber) {
        this.f59782c.m31349b(new MapNotificationSubscriber(subscriber, null, null, null));
    }
}
