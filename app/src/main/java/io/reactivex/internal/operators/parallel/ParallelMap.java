package io.reactivex.internal.operators.parallel;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.parallel.ParallelFlowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class ParallelMap<T, R> extends ParallelFlowable<R> {

    public static final class ParallelMapConditionalSubscriber<T, R> implements ConditionalSubscriber<T>, Subscription {

        /* renamed from: b */
        public final ConditionalSubscriber<? super R> f62374b;

        /* renamed from: c */
        public final Function<? super T, ? extends R> f62375c;

        /* renamed from: d */
        public Subscription f62376d;

        /* renamed from: e */
        public boolean f62377e;

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        /* renamed from: E */
        public boolean mo31428E(T t) {
            if (this.f62377e) {
                return false;
            }
            try {
                R apply = this.f62375c.apply(t);
                Objects.requireNonNull(apply, "The mapper returned a null value");
                return this.f62374b.mo31428E(apply);
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f62376d.cancel();
                onError(th);
                return false;
            }
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f62376d.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f62376d, subscription)) {
                this.f62376d = subscription;
                this.f62374b.mo31352d(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f62377e) {
                return;
            }
            this.f62377e = true;
            this.f62374b.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.f62377e) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f62377e = true;
                this.f62374b.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.f62377e) {
                return;
            }
            try {
                R apply = this.f62375c.apply(t);
                Objects.requireNonNull(apply, "The mapper returned a null value");
                this.f62374b.onNext(apply);
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f62376d.cancel();
                onError(th);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            this.f62376d.request(j2);
        }
    }

    public static final class ParallelMapSubscriber<T, R> implements FlowableSubscriber<T>, Subscription {

        /* renamed from: b */
        public final Subscriber<? super R> f62378b;

        /* renamed from: c */
        public final Function<? super T, ? extends R> f62379c;

        /* renamed from: d */
        public Subscription f62380d;

        /* renamed from: e */
        public boolean f62381e;

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f62380d.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f62380d, subscription)) {
                this.f62380d = subscription;
                this.f62378b.mo31352d(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f62381e) {
                return;
            }
            this.f62381e = true;
            this.f62378b.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.f62381e) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f62381e = true;
                this.f62378b.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.f62381e) {
                return;
            }
            try {
                R apply = this.f62379c.apply(t);
                Objects.requireNonNull(apply, "The mapper returned a null value");
                this.f62378b.onNext(apply);
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f62380d.cancel();
                onError(th);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            this.f62380d.request(j2);
        }
    }
}
