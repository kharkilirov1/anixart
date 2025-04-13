package io.reactivex.internal.operators.flowable;

import io.reactivex.annotations.Nullable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber;
import io.reactivex.internal.subscribers.BasicFuseableSubscriber;
import org.reactivestreams.Subscriber;

/* loaded from: classes3.dex */
public final class FlowableDoAfterNext<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class DoAfterConditionalSubscriber<T> extends BasicFuseableConditionalSubscriber<T, T> {

        /* renamed from: g */
        public final Consumer<? super T> f60072g;

        public DoAfterConditionalSubscriber(ConditionalSubscriber<? super T> conditionalSubscriber, Consumer<? super T> consumer) {
            super(conditionalSubscriber);
            this.f60072g = null;
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        /* renamed from: E */
        public boolean mo31428E(T t) {
            boolean mo31428E = this.f62719b.mo31428E(t);
            try {
                this.f60072g.accept(t);
            } catch (Throwable th) {
                m31776a(th);
            }
            return mo31428E;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        /* renamed from: F */
        public int mo31420F(int i2) {
            return m31777b(i2);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            this.f62719b.onNext(t);
            if (this.f62723f == 0) {
                try {
                    this.f60072g.accept(t);
                } catch (Throwable th) {
                    m31776a(th);
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() throws Exception {
            T poll = this.f62721d.poll();
            if (poll != null) {
                this.f60072g.accept(poll);
            }
            return poll;
        }
    }

    public static final class DoAfterSubscriber<T> extends BasicFuseableSubscriber<T, T> {

        /* renamed from: g */
        public final Consumer<? super T> f60073g;

        public DoAfterSubscriber(Subscriber<? super T> subscriber, Consumer<? super T> consumer) {
            super(subscriber);
            this.f60073g = null;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        /* renamed from: F */
        public int mo31420F(int i2) {
            return m31779b(i2);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.f62727e) {
                return;
            }
            this.f62724b.onNext(t);
            if (this.f62728f == 0) {
                try {
                    this.f60073g.accept(t);
                } catch (Throwable th) {
                    m31778a(th);
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() throws Exception {
            T poll = this.f62726d.poll();
            if (poll != null) {
                this.f60073g.accept(poll);
            }
            return poll;
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        if (subscriber instanceof ConditionalSubscriber) {
            this.f59782c.m31349b(new DoAfterConditionalSubscriber((ConditionalSubscriber) subscriber, null));
        } else {
            this.f59782c.m31349b(new DoAfterSubscriber(subscriber, null));
        }
    }
}
