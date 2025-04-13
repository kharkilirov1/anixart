package io.reactivex.internal.operators.flowable;

import io.reactivex.annotations.Nullable;
import io.reactivex.functions.BiPredicate;
import io.reactivex.functions.Function;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber;
import io.reactivex.internal.subscribers.BasicFuseableSubscriber;
import org.reactivestreams.Subscriber;

/* loaded from: classes3.dex */
public final class FlowableDistinctUntilChanged<T, K> extends AbstractFlowableWithUpstream<T, T> {

    public static final class DistinctUntilChangedConditionalSubscriber<T, K> extends BasicFuseableConditionalSubscriber<T, T> {

        /* renamed from: g */
        public final Function<? super T, K> f60064g;

        /* renamed from: h */
        public final BiPredicate<? super K, ? super K> f60065h;

        /* renamed from: i */
        public K f60066i;

        /* renamed from: j */
        public boolean f60067j;

        public DistinctUntilChangedConditionalSubscriber(ConditionalSubscriber<? super T> conditionalSubscriber, Function<? super T, K> function, BiPredicate<? super K, ? super K> biPredicate) {
            super(conditionalSubscriber);
            this.f60064g = null;
            this.f60065h = null;
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        /* renamed from: E */
        public boolean mo31428E(T t) {
            if (this.f62722e) {
                return false;
            }
            if (this.f62723f != 0) {
                return this.f62719b.mo31428E(t);
            }
            try {
                K apply = this.f60064g.apply(t);
                if (this.f60067j) {
                    boolean mo31404a = this.f60065h.mo31404a(this.f60066i, apply);
                    this.f60066i = apply;
                    if (mo31404a) {
                        return false;
                    }
                } else {
                    this.f60067j = true;
                    this.f60066i = apply;
                }
                this.f62719b.onNext(t);
                return true;
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
            while (true) {
                T poll = this.f62721d.poll();
                if (poll == null) {
                    return null;
                }
                K apply = this.f60064g.apply(poll);
                if (!this.f60067j) {
                    this.f60067j = true;
                    this.f60066i = apply;
                    return poll;
                }
                if (!this.f60065h.mo31404a(this.f60066i, apply)) {
                    this.f60066i = apply;
                    return poll;
                }
                this.f60066i = apply;
                if (this.f62723f != 1) {
                    this.f62720c.request(1L);
                }
            }
        }
    }

    public static final class DistinctUntilChangedSubscriber<T, K> extends BasicFuseableSubscriber<T, T> implements ConditionalSubscriber<T> {

        /* renamed from: g */
        public final Function<? super T, K> f60068g;

        /* renamed from: h */
        public final BiPredicate<? super K, ? super K> f60069h;

        /* renamed from: i */
        public K f60070i;

        /* renamed from: j */
        public boolean f60071j;

        public DistinctUntilChangedSubscriber(Subscriber<? super T> subscriber, Function<? super T, K> function, BiPredicate<? super K, ? super K> biPredicate) {
            super(subscriber);
            this.f60068g = null;
            this.f60069h = null;
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        /* renamed from: E */
        public boolean mo31428E(T t) {
            if (this.f62727e) {
                return false;
            }
            if (this.f62728f != 0) {
                this.f62724b.onNext(t);
                return true;
            }
            try {
                K apply = this.f60068g.apply(t);
                if (this.f60071j) {
                    boolean mo31404a = this.f60069h.mo31404a(this.f60070i, apply);
                    this.f60070i = apply;
                    if (mo31404a) {
                        return false;
                    }
                } else {
                    this.f60071j = true;
                    this.f60070i = apply;
                }
                this.f62724b.onNext(t);
                return true;
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
            while (true) {
                T poll = this.f62726d.poll();
                if (poll == null) {
                    return null;
                }
                K apply = this.f60068g.apply(poll);
                if (!this.f60071j) {
                    this.f60071j = true;
                    this.f60070i = apply;
                    return poll;
                }
                if (!this.f60069h.mo31404a(this.f60070i, apply)) {
                    this.f60070i = apply;
                    return poll;
                }
                this.f60070i = apply;
                if (this.f62728f != 1) {
                    this.f62725c.request(1L);
                }
            }
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        if (subscriber instanceof ConditionalSubscriber) {
            this.f59782c.m31349b(new DistinctUntilChangedConditionalSubscriber((ConditionalSubscriber) subscriber, null, null));
        } else {
            this.f59782c.m31349b(new DistinctUntilChangedSubscriber(subscriber, null, null));
        }
    }
}
