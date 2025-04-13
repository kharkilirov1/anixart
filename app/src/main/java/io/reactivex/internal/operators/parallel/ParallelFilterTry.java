package io.reactivex.internal.operators.parallel;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.parallel.ParallelFailureHandling;
import io.reactivex.parallel.ParallelFlowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class ParallelFilterTry<T> extends ParallelFlowable<T> {

    /* renamed from: io.reactivex.internal.operators.parallel.ParallelFilterTry$1 */
    public static /* synthetic */ class C65141 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f62339a;

        static {
            int[] iArr = new int[ParallelFailureHandling.values().length];
            f62339a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f62339a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f62339a[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static abstract class BaseFilterSubscriber<T> implements ConditionalSubscriber<T>, Subscription {

        /* renamed from: b */
        public final Predicate<? super T> f62340b;

        /* renamed from: c */
        public final BiFunction<? super Long, ? super Throwable, ParallelFailureHandling> f62341c;

        /* renamed from: d */
        public Subscription f62342d;

        /* renamed from: e */
        public boolean f62343e;

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f62342d.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (mo31428E(t) || this.f62343e) {
                return;
            }
            this.f62342d.request(1L);
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j2) {
            this.f62342d.request(j2);
        }
    }

    public static final class ParallelFilterConditionalSubscriber<T> extends BaseFilterSubscriber<T> {

        /* renamed from: f */
        public final ConditionalSubscriber<? super T> f62344f;

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        /* renamed from: E */
        public boolean mo31428E(T t) {
            if (!this.f62343e) {
                long j2 = 0;
                while (true) {
                    try {
                        return this.f62340b.mo31407b(t) && this.f62344f.mo31428E(t);
                    } catch (Throwable th) {
                        Exceptions.m31402a(th);
                        try {
                            j2++;
                            ParallelFailureHandling apply = this.f62341c.apply(Long.valueOf(j2), th);
                            Objects.requireNonNull(apply, "The errorHandler returned a null item");
                            int ordinal = apply.ordinal();
                            if (ordinal == 0) {
                                this.f62342d.cancel();
                                onComplete();
                                return false;
                            }
                            if (ordinal == 2) {
                                break;
                            }
                            if (ordinal != 3) {
                                this.f62342d.cancel();
                                onError(th);
                                break;
                            }
                            return false;
                        } catch (Throwable th2) {
                            Exceptions.m31402a(th2);
                            this.f62342d.cancel();
                            onError(new CompositeException(th, th2));
                        }
                    }
                }
                return false;
            }
            return false;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f62342d, subscription)) {
                this.f62342d = subscription;
                this.f62344f.mo31352d(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f62343e) {
                return;
            }
            this.f62343e = true;
            this.f62344f.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.f62343e) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f62343e = true;
                this.f62344f.onError(th);
            }
        }
    }

    public static final class ParallelFilterSubscriber<T> extends BaseFilterSubscriber<T> {

        /* renamed from: f */
        public final Subscriber<? super T> f62345f;

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        /* renamed from: E */
        public boolean mo31428E(T t) {
            if (!this.f62343e) {
                long j2 = 0;
                while (true) {
                    try {
                        if (!this.f62340b.mo31407b(t)) {
                            return false;
                        }
                        this.f62345f.onNext(t);
                        return true;
                    } catch (Throwable th) {
                        Exceptions.m31402a(th);
                        try {
                            j2++;
                            ParallelFailureHandling apply = this.f62341c.apply(Long.valueOf(j2), th);
                            Objects.requireNonNull(apply, "The errorHandler returned a null item");
                            int ordinal = apply.ordinal();
                            if (ordinal == 0) {
                                this.f62342d.cancel();
                                onComplete();
                                return false;
                            }
                            if (ordinal == 2) {
                                break;
                            }
                            if (ordinal != 3) {
                                this.f62342d.cancel();
                                onError(th);
                                break;
                            }
                            return false;
                        } catch (Throwable th2) {
                            Exceptions.m31402a(th2);
                            this.f62342d.cancel();
                            onError(new CompositeException(th, th2));
                        }
                    }
                }
                return false;
            }
            return false;
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f62342d, subscription)) {
                this.f62342d = subscription;
                this.f62345f.mo31352d(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (this.f62343e) {
                return;
            }
            this.f62343e = true;
            this.f62345f.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (this.f62343e) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f62343e = true;
                this.f62345f.onError(th);
            }
        }
    }
}
