package io.reactivex.internal.operators.flowable;

import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.subscribers.BasicFuseableSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Collection;
import java.util.Objects;
import org.reactivestreams.Subscriber;

/* loaded from: classes3.dex */
public final class FlowableDistinct<T, K> extends AbstractFlowableWithUpstream<T, T> {

    public static final class DistinctSubscriber<T, K> extends BasicFuseableSubscriber<T, T> {

        /* renamed from: g */
        public final Collection<? super K> f60062g;

        /* renamed from: h */
        public final Function<? super T, K> f60063h;

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        /* renamed from: F */
        public int mo31420F(int i2) {
            return m31779b(i2);
        }

        @Override // io.reactivex.internal.subscribers.BasicFuseableSubscriber, io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.f60062g.clear();
            this.f62726d.clear();
        }

        @Override // io.reactivex.internal.subscribers.BasicFuseableSubscriber, org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f62727e) {
                return;
            }
            this.f62727e = true;
            this.f60062g.clear();
            this.f62724b.onComplete();
        }

        @Override // io.reactivex.internal.subscribers.BasicFuseableSubscriber, org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.f62727e) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            this.f62727e = true;
            this.f60062g.clear();
            this.f62724b.onError(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.f62727e) {
                return;
            }
            if (this.f62728f != 0) {
                this.f62724b.onNext(null);
                return;
            }
            try {
                K apply = this.f60063h.apply(t);
                Objects.requireNonNull(apply, "The keySelector returned a null key");
                if (this.f60062g.add(apply)) {
                    this.f62724b.onNext(t);
                } else {
                    this.f62725c.request(1L);
                }
            } catch (Throwable th) {
                m31778a(th);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() throws Exception {
            T poll;
            while (true) {
                poll = this.f62726d.poll();
                if (poll == null) {
                    break;
                }
                Collection<? super K> collection = this.f60062g;
                K apply = this.f60063h.apply(poll);
                Objects.requireNonNull(apply, "The keySelector returned a null key");
                if (collection.add(apply)) {
                    break;
                }
                if (this.f62728f == 2) {
                    this.f62725c.request(1L);
                }
            }
            return poll;
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        try {
            throw null;
        } catch (Throwable th) {
            Exceptions.m31402a(th);
            subscriber.mo31352d(EmptySubscription.INSTANCE);
            subscriber.onError(th);
        }
    }
}
