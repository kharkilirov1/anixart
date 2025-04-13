package io.reactivex.internal.operators.flowable;

import io.reactivex.annotations.Nullable;
import io.reactivex.functions.Function;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber;
import io.reactivex.internal.subscribers.BasicFuseableSubscriber;
import java.util.Objects;
import org.reactivestreams.Subscriber;

/* loaded from: classes3.dex */
public final class FlowableMap<T, U> extends AbstractFlowableWithUpstream<T, U> {

    /* renamed from: d */
    public final Function<? super T, ? extends U> f60320d;

    public static final class MapConditionalSubscriber<T, U> extends BasicFuseableConditionalSubscriber<T, U> {

        /* renamed from: g */
        public final Function<? super T, ? extends U> f60321g;

        public MapConditionalSubscriber(ConditionalSubscriber<? super U> conditionalSubscriber, Function<? super T, ? extends U> function) {
            super(conditionalSubscriber);
            this.f60321g = function;
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        /* renamed from: E */
        public boolean mo31428E(T t) {
            if (this.f62722e) {
                return false;
            }
            try {
                U apply = this.f60321g.apply(t);
                Objects.requireNonNull(apply, "The mapper function returned a null value.");
                return this.f62719b.mo31428E(apply);
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
            if (this.f62722e) {
                return;
            }
            if (this.f62723f != 0) {
                this.f62719b.onNext(null);
                return;
            }
            try {
                U apply = this.f60321g.apply(t);
                Objects.requireNonNull(apply, "The mapper function returned a null value.");
                this.f62719b.onNext(apply);
            } catch (Throwable th) {
                m31776a(th);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public U poll() throws Exception {
            T poll = this.f62721d.poll();
            if (poll == null) {
                return null;
            }
            U apply = this.f60321g.apply(poll);
            Objects.requireNonNull(apply, "The mapper function returned a null value.");
            return apply;
        }
    }

    public static final class MapSubscriber<T, U> extends BasicFuseableSubscriber<T, U> {

        /* renamed from: g */
        public final Function<? super T, ? extends U> f60322g;

        public MapSubscriber(Subscriber<? super U> subscriber, Function<? super T, ? extends U> function) {
            super(subscriber);
            this.f60322g = function;
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
            if (this.f62728f != 0) {
                this.f62724b.onNext(null);
                return;
            }
            try {
                U apply = this.f60322g.apply(t);
                Objects.requireNonNull(apply, "The mapper function returned a null value.");
                this.f62724b.onNext(apply);
            } catch (Throwable th) {
                m31778a(th);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public U poll() throws Exception {
            T poll = this.f62726d.poll();
            if (poll == null) {
                return null;
            }
            U apply = this.f60322g.apply(poll);
            Objects.requireNonNull(apply, "The mapper function returned a null value.");
            return apply;
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super U> subscriber) {
        if (subscriber instanceof ConditionalSubscriber) {
            this.f59782c.m31349b(new MapConditionalSubscriber((ConditionalSubscriber) subscriber, this.f60320d));
        } else {
            this.f59782c.m31349b(new MapSubscriber(subscriber, this.f60320d));
        }
    }
}
