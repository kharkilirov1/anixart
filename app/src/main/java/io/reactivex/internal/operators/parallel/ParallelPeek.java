package io.reactivex.internal.operators.parallel;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.parallel.ParallelFlowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class ParallelPeek<T> extends ParallelFlowable<T> {

    public static final class ParallelPeekSubscriber<T> implements FlowableSubscriber<T>, Subscription {

        /* renamed from: b */
        public final Subscriber<? super T> f62393b;

        /* renamed from: c */
        public final ParallelPeek<T> f62394c;

        /* renamed from: d */
        public Subscription f62395d;

        /* renamed from: e */
        public boolean f62396e;

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            try {
                Objects.requireNonNull(this.f62394c);
                throw null;
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                RxJavaPlugins.m31848b(th);
                this.f62395d.cancel();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f62395d, subscription)) {
                this.f62395d = subscription;
                try {
                    Objects.requireNonNull(this.f62394c);
                    throw null;
                } catch (Throwable th) {
                    Exceptions.m31402a(th);
                    subscription.cancel();
                    this.f62393b.mo31352d(EmptySubscription.INSTANCE);
                    onError(th);
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f62396e) {
                return;
            }
            this.f62396e = true;
            try {
                Objects.requireNonNull(this.f62394c);
                throw null;
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f62393b.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.f62396e) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            this.f62396e = true;
            try {
                Objects.requireNonNull(this.f62394c);
                throw null;
            } finally {
                try {
                } catch (Throwable th2) {
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.f62396e) {
                return;
            }
            try {
                Objects.requireNonNull(this.f62394c);
                throw null;
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                onError(th);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            try {
                Objects.requireNonNull(this.f62394c);
                throw null;
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                RxJavaPlugins.m31848b(th);
                this.f62395d.request(j2);
            }
        }
    }
}
