package io.reactivex.internal.operators.parallel;

import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.parallel.ParallelFlowable;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class ParallelFilter<T> extends ParallelFlowable<T> {

    public static abstract class BaseFilterSubscriber<T> implements ConditionalSubscriber<T>, Subscription {

        /* renamed from: b */
        public final Predicate<? super T> f62334b;

        /* renamed from: c */
        public Subscription f62335c;

        /* renamed from: d */
        public boolean f62336d;

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f62335c.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (mo31428E(t) || this.f62336d) {
                return;
            }
            this.f62335c.request(1L);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j2) {
            this.f62335c.request(j2);
        }
    }

    public static final class ParallelFilterConditionalSubscriber<T> extends BaseFilterSubscriber<T> {

        /* renamed from: e */
        public final ConditionalSubscriber<? super T> f62337e;

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        /* renamed from: E */
        public boolean mo31428E(T t) {
            if (!this.f62336d) {
                try {
                    if (this.f62334b.mo31407b(t)) {
                        return this.f62337e.mo31428E(t);
                    }
                } catch (Throwable th) {
                    Exceptions.m31402a(th);
                    this.f62335c.cancel();
                    onError(th);
                }
            }
            return false;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f62335c, subscription)) {
                this.f62335c = subscription;
                this.f62337e.mo31352d(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f62336d) {
                return;
            }
            this.f62336d = true;
            this.f62337e.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.f62336d) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f62336d = true;
                this.f62337e.onError(th);
            }
        }
    }

    public static final class ParallelFilterSubscriber<T> extends BaseFilterSubscriber<T> {

        /* renamed from: e */
        public final Subscriber<? super T> f62338e;

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        /* renamed from: E */
        public boolean mo31428E(T t) {
            if (!this.f62336d) {
                try {
                    if (this.f62334b.mo31407b(t)) {
                        this.f62338e.onNext(t);
                        return true;
                    }
                } catch (Throwable th) {
                    Exceptions.m31402a(th);
                    this.f62335c.cancel();
                    onError(th);
                }
            }
            return false;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f62335c, subscription)) {
                this.f62335c = subscription;
                this.f62338e.mo31352d(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f62336d) {
                return;
            }
            this.f62336d = true;
            this.f62338e.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.f62336d) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f62336d = true;
                this.f62338e.onError(th);
            }
        }
    }
}
