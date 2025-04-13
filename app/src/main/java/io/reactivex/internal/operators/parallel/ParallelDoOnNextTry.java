package io.reactivex.internal.operators.parallel;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.parallel.ParallelFailureHandling;
import io.reactivex.parallel.ParallelFlowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class ParallelDoOnNextTry<T> extends ParallelFlowable<T> {

    /* renamed from: io.reactivex.internal.operators.parallel.ParallelDoOnNextTry$1 */
    public static /* synthetic */ class C65131 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f62323a;

        static {
            int[] iArr = new int[ParallelFailureHandling.values().length];
            f62323a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f62323a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f62323a[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final class ParallelDoOnNextConditionalSubscriber<T> implements ConditionalSubscriber<T>, Subscription {

        /* renamed from: b */
        public final ConditionalSubscriber<? super T> f62324b;

        /* renamed from: c */
        public final Consumer<? super T> f62325c;

        /* renamed from: d */
        public final BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> f62326d;

        /* renamed from: e */
        public Subscription f62327e;

        /* renamed from: f */
        public boolean f62328f;

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        /* renamed from: E */
        public boolean mo31428E(T t) {
            if (this.f62328f) {
                return false;
            }
            long j2 = 0;
            while (true) {
                try {
                    this.f62325c.accept(t);
                    return this.f62324b.mo31428E(t);
                } catch (Throwable th) {
                    Exceptions.m31402a(th);
                    try {
                        j2++;
                        ParallelFailureHandling apply = this.f62326d.apply(Long.valueOf(j2), th);
                        Objects.requireNonNull(apply, "The errorHandler returned a null item");
                        int ordinal = apply.ordinal();
                        if (ordinal == 0) {
                            this.f62327e.cancel();
                            onComplete();
                            return false;
                        }
                        if (ordinal == 2) {
                            break;
                        }
                        if (ordinal != 3) {
                            this.f62327e.cancel();
                            onError(th);
                            break;
                        }
                        return false;
                    } catch (Throwable th2) {
                        Exceptions.m31402a(th2);
                        this.f62327e.cancel();
                        onError(new CompositeException(th, th2));
                        return false;
                    }
                }
            }
            return false;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f62327e.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f62327e, subscription)) {
                this.f62327e = subscription;
                this.f62324b.mo31352d(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f62328f) {
                return;
            }
            this.f62328f = true;
            this.f62324b.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.f62328f) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f62328f = true;
                this.f62324b.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (mo31428E(t) || this.f62328f) {
                return;
            }
            this.f62327e.request(1L);
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            this.f62327e.request(j2);
        }
    }

    public static final class ParallelDoOnNextSubscriber<T> implements ConditionalSubscriber<T>, Subscription {

        /* renamed from: b */
        public final Subscriber<? super T> f62329b;

        /* renamed from: c */
        public final Consumer<? super T> f62330c;

        /* renamed from: d */
        public final BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> f62331d;

        /* renamed from: e */
        public Subscription f62332e;

        /* renamed from: f */
        public boolean f62333f;

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        /* renamed from: E */
        public boolean mo31428E(T t) {
            if (this.f62333f) {
                return false;
            }
            long j2 = 0;
            while (true) {
                try {
                    this.f62330c.accept(t);
                    this.f62329b.onNext(t);
                    return true;
                } catch (Throwable th) {
                    Exceptions.m31402a(th);
                    try {
                        j2++;
                        ParallelFailureHandling apply = this.f62331d.apply(Long.valueOf(j2), th);
                        Objects.requireNonNull(apply, "The errorHandler returned a null item");
                        int ordinal = apply.ordinal();
                        if (ordinal == 0) {
                            this.f62332e.cancel();
                            onComplete();
                            return false;
                        }
                        if (ordinal == 2) {
                            break;
                        }
                        if (ordinal != 3) {
                            this.f62332e.cancel();
                            onError(th);
                            break;
                        }
                        return false;
                    } catch (Throwable th2) {
                        Exceptions.m31402a(th2);
                        this.f62332e.cancel();
                        onError(new CompositeException(th, th2));
                        return false;
                    }
                }
            }
            return false;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f62332e.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f62332e, subscription)) {
                this.f62332e = subscription;
                this.f62329b.mo31352d(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f62333f) {
                return;
            }
            this.f62333f = true;
            this.f62329b.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.f62333f) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f62333f = true;
                this.f62329b.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (mo31428E(t)) {
                return;
            }
            this.f62332e.request(1L);
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            this.f62332e.request(j2);
        }
    }
}
