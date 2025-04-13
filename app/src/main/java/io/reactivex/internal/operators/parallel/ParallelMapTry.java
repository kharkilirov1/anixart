package io.reactivex.internal.operators.parallel;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.parallel.ParallelFailureHandling;
import io.reactivex.parallel.ParallelFlowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class ParallelMapTry<T, R> extends ParallelFlowable<R> {

    /* renamed from: io.reactivex.internal.operators.parallel.ParallelMapTry$1 */
    public static /* synthetic */ class C65151 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f62382a;

        static {
            int[] iArr = new int[ParallelFailureHandling.values().length];
            f62382a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f62382a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f62382a[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final class ParallelMapTryConditionalSubscriber<T, R> implements ConditionalSubscriber<T>, Subscription {

        /* renamed from: b */
        public final ConditionalSubscriber<? super R> f62383b;

        /* renamed from: c */
        public final Function<? super T, ? extends R> f62384c;

        /* renamed from: d */
        public final BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> f62385d;

        /* renamed from: e */
        public Subscription f62386e;

        /* renamed from: f */
        public boolean f62387f;

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        /* renamed from: E */
        public boolean mo31428E(T t) {
            if (this.f62387f) {
                return false;
            }
            long j2 = 0;
            while (true) {
                try {
                    R apply = this.f62384c.apply(t);
                    Objects.requireNonNull(apply, "The mapper returned a null value");
                    return this.f62383b.mo31428E(apply);
                } catch (Throwable th) {
                    Exceptions.m31402a(th);
                    try {
                        j2++;
                        ParallelFailureHandling apply2 = this.f62385d.apply(Long.valueOf(j2), th);
                        Objects.requireNonNull(apply2, "The errorHandler returned a null item");
                        int ordinal = apply2.ordinal();
                        if (ordinal == 0) {
                            this.f62386e.cancel();
                            onComplete();
                            return false;
                        }
                        if (ordinal == 2) {
                            break;
                        }
                        if (ordinal != 3) {
                            this.f62386e.cancel();
                            onError(th);
                            break;
                        }
                        return false;
                    } catch (Throwable th2) {
                        Exceptions.m31402a(th2);
                        this.f62386e.cancel();
                        onError(new CompositeException(th, th2));
                        return false;
                    }
                }
            }
            return false;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f62386e.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f62386e, subscription)) {
                this.f62386e = subscription;
                this.f62383b.mo31352d(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f62387f) {
                return;
            }
            this.f62387f = true;
            this.f62383b.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.f62387f) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f62387f = true;
                this.f62383b.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (mo31428E(t) || this.f62387f) {
                return;
            }
            this.f62386e.request(1L);
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            this.f62386e.request(j2);
        }
    }

    public static final class ParallelMapTrySubscriber<T, R> implements ConditionalSubscriber<T>, Subscription {

        /* renamed from: b */
        public final Subscriber<? super R> f62388b;

        /* renamed from: c */
        public final Function<? super T, ? extends R> f62389c;

        /* renamed from: d */
        public final BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> f62390d;

        /* renamed from: e */
        public Subscription f62391e;

        /* renamed from: f */
        public boolean f62392f;

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        /* renamed from: E */
        public boolean mo31428E(T t) {
            if (this.f62392f) {
                return false;
            }
            long j2 = 0;
            while (true) {
                try {
                    R apply = this.f62389c.apply(t);
                    Objects.requireNonNull(apply, "The mapper returned a null value");
                    this.f62388b.onNext(apply);
                    return true;
                } catch (Throwable th) {
                    Exceptions.m31402a(th);
                    try {
                        j2++;
                        ParallelFailureHandling apply2 = this.f62390d.apply(Long.valueOf(j2), th);
                        Objects.requireNonNull(apply2, "The errorHandler returned a null item");
                        int ordinal = apply2.ordinal();
                        if (ordinal == 0) {
                            this.f62391e.cancel();
                            onComplete();
                            return false;
                        }
                        if (ordinal == 2) {
                            break;
                        }
                        if (ordinal != 3) {
                            this.f62391e.cancel();
                            onError(th);
                            break;
                        }
                        return false;
                    } catch (Throwable th2) {
                        Exceptions.m31402a(th2);
                        this.f62391e.cancel();
                        onError(new CompositeException(th, th2));
                        return false;
                    }
                }
            }
            return false;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f62391e.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f62391e, subscription)) {
                this.f62391e = subscription;
                this.f62388b.mo31352d(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f62392f) {
                return;
            }
            this.f62392f = true;
            this.f62388b.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.f62392f) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f62392f = true;
                this.f62388b.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (mo31428E(t) || this.f62392f) {
                return;
            }
            this.f62391e.request(1L);
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            this.f62391e.request(j2);
        }
    }
}
