package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableUsing<T, D> extends Flowable<T> {

    public static final class UsingSubscriber<T, D> extends AtomicBoolean implements FlowableSubscriber<T>, Subscription {

        /* renamed from: b */
        public final Subscriber<? super T> f60794b;

        /* renamed from: c */
        public final D f60795c;

        /* renamed from: d */
        public final Consumer<? super D> f60796d;

        /* renamed from: e */
        public final boolean f60797e;

        /* renamed from: f */
        public Subscription f60798f;

        /* renamed from: a */
        public void m31597a() {
            if (compareAndSet(false, true)) {
                try {
                    this.f60796d.accept(this.f60795c);
                } catch (Throwable th) {
                    Exceptions.m31402a(th);
                    RxJavaPlugins.m31848b(th);
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            m31597a();
            this.f60798f.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f60798f, subscription)) {
                this.f60798f = subscription;
                this.f60794b.mo31352d(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (!this.f60797e) {
                this.f60794b.onComplete();
                this.f60798f.cancel();
                m31597a();
                return;
            }
            if (compareAndSet(false, true)) {
                try {
                    this.f60796d.accept(this.f60795c);
                } catch (Throwable th) {
                    Exceptions.m31402a(th);
                    this.f60794b.onError(th);
                    return;
                }
            }
            this.f60798f.cancel();
            this.f60794b.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (!this.f60797e) {
                this.f60794b.onError(th);
                this.f60798f.cancel();
                m31597a();
                return;
            }
            Throwable th2 = null;
            if (compareAndSet(false, true)) {
                try {
                    this.f60796d.accept(this.f60795c);
                } catch (Throwable th3) {
                    th2 = th3;
                    Exceptions.m31402a(th2);
                }
            }
            this.f60798f.cancel();
            if (th2 != null) {
                this.f60794b.onError(new CompositeException(th, th2));
            } else {
                this.f60794b.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            this.f60794b.onNext(t);
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            this.f60798f.request(j2);
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
