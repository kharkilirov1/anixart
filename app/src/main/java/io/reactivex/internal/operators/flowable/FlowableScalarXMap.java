package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.subscriptions.EmptySubscription;
import java.util.concurrent.Callable;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

/* loaded from: classes3.dex */
public final class FlowableScalarXMap {

    public static final class ScalarXMapFlowable<T, R> extends Flowable<R> {
        @Override // io.reactivex.Flowable
        /* renamed from: c */
        public void mo31350c(Subscriber<? super R> subscriber) {
            try {
                throw null;
            } catch (Throwable th) {
                subscriber.mo31352d(EmptySubscription.INSTANCE);
                subscriber.onError(th);
            }
        }
    }

    public FlowableScalarXMap() {
        throw new IllegalStateException("No instances!");
    }

    /* renamed from: a */
    public static <T, R> boolean m31578a(Publisher<T> publisher, Subscriber<? super R> subscriber, Function<? super T, ? extends Publisher<? extends R>> function) {
        EmptySubscription emptySubscription = EmptySubscription.INSTANCE;
        if (!(publisher instanceof Callable)) {
            return false;
        }
        try {
            if (((Callable) publisher).call() == null) {
                subscriber.mo31352d(emptySubscription);
                subscriber.onComplete();
                return true;
            }
            try {
                throw null;
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                subscriber.mo31352d(emptySubscription);
                subscriber.onError(th);
                return true;
            }
        } catch (Throwable th2) {
            Exceptions.m31402a(th2);
            subscriber.mo31352d(emptySubscription);
            subscriber.onError(th2);
            return true;
        }
    }
}
