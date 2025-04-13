package io.reactivex.internal.operators.flowable;

import io.reactivex.annotations.Nullable;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber;
import io.reactivex.internal.subscribers.BasicFuseableSubscriber;
import org.reactivestreams.Subscriber;

/* loaded from: classes3.dex */
public final class FlowableFilter<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class FilterConditionalSubscriber<T> extends BasicFuseableConditionalSubscriber<T, T> {

        /* renamed from: g */
        public final Predicate<? super T> f60115g;

        public FilterConditionalSubscriber(ConditionalSubscriber<? super T> conditionalSubscriber, Predicate<? super T> predicate) {
            super(conditionalSubscriber);
            this.f60115g = null;
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        /* renamed from: E */
        public boolean mo31428E(T t) {
            if (this.f62722e) {
                return false;
            }
            if (this.f62723f != 0) {
                return this.f62719b.mo31428E(null);
            }
            try {
                return this.f60115g.mo31407b(t) && this.f62719b.mo31428E(t);
            } catch (Throwable th) {
                m31776a(th);
                return true;
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        /* renamed from: F */
        public int mo31420F(int i2) {
            return m31777b(i2);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (mo31428E(t)) {
                return;
            }
            this.f62720c.request(1L);
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() throws Exception {
            QueueSubscription<T> queueSubscription = this.f62721d;
            Predicate<? super T> predicate = this.f60115g;
            while (true) {
                T poll = queueSubscription.poll();
                if (poll == null) {
                    return null;
                }
                if (predicate.mo31407b(poll)) {
                    return poll;
                }
                if (this.f62723f == 2) {
                    queueSubscription.request(1L);
                }
            }
        }
    }

    public static final class FilterSubscriber<T> extends BasicFuseableSubscriber<T, T> implements ConditionalSubscriber<T> {

        /* renamed from: g */
        public final Predicate<? super T> f60116g;

        public FilterSubscriber(Subscriber<? super T> subscriber, Predicate<? super T> predicate) {
            super(subscriber);
            this.f60116g = null;
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        /* renamed from: E */
        public boolean mo31428E(T t) {
            if (this.f62727e) {
                return false;
            }
            if (this.f62728f != 0) {
                this.f62724b.onNext(null);
                return true;
            }
            try {
                boolean mo31407b = this.f60116g.mo31407b(t);
                if (mo31407b) {
                    this.f62724b.onNext(t);
                }
                return mo31407b;
            } catch (Throwable th) {
                m31778a(th);
                return true;
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        /* renamed from: F */
        public int mo31420F(int i2) {
            return m31779b(i2);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (mo31428E(t)) {
                return;
            }
            this.f62725c.request(1L);
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() throws Exception {
            QueueSubscription<T> queueSubscription = this.f62726d;
            Predicate<? super T> predicate = this.f60116g;
            while (true) {
                T poll = queueSubscription.poll();
                if (poll == null) {
                    return null;
                }
                if (predicate.mo31407b(poll)) {
                    return poll;
                }
                if (this.f62728f == 2) {
                    queueSubscription.request(1L);
                }
            }
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        if (subscriber instanceof ConditionalSubscriber) {
            this.f59782c.m31349b(new FilterConditionalSubscriber((ConditionalSubscriber) subscriber, null));
        } else {
            this.f59782c.m31349b(new FilterSubscriber(subscriber, null));
        }
    }
}
