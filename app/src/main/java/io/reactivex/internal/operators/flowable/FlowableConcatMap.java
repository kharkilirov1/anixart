package io.reactivex.internal.operators.flowable;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableConcatMap<T, R> extends AbstractFlowableWithUpstream<T, R> {

    /* renamed from: io.reactivex.internal.operators.flowable.FlowableConcatMap$1 */
    public static /* synthetic */ class C65101 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f59958a;

        static {
            int[] iArr = new int[ErrorMode.values().length];
            f59958a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f59958a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static abstract class BaseConcatMapSubscriber<T, R> extends AtomicInteger implements FlowableSubscriber<T>, ConcatMapSupport<R>, Subscription {

        /* renamed from: b */
        public final ConcatMapInner<R> f59959b;

        /* renamed from: c */
        public final Function<? super T, ? extends Publisher<? extends R>> f59960c;

        /* renamed from: d */
        public final int f59961d;

        /* renamed from: e */
        public final int f59962e;

        /* renamed from: f */
        public Subscription f59963f;

        /* renamed from: g */
        public int f59964g;

        /* renamed from: h */
        public SimpleQueue<T> f59965h;

        /* renamed from: i */
        public volatile boolean f59966i;

        /* renamed from: j */
        public volatile boolean f59967j;

        /* renamed from: k */
        public final AtomicThrowable f59968k;

        /* renamed from: l */
        public volatile boolean f59969l;

        /* renamed from: m */
        public int f59970m;

        /* renamed from: a */
        public abstract void mo31465a();

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public final void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f59963f, subscription)) {
                this.f59963f = subscription;
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int mo31420F = queueSubscription.mo31420F(7);
                    if (mo31420F == 1) {
                        this.f59970m = mo31420F;
                        this.f59965h = queueSubscription;
                        this.f59966i = true;
                        mo31467f();
                        mo31465a();
                        return;
                    }
                    if (mo31420F == 2) {
                        this.f59970m = mo31420F;
                        this.f59965h = queueSubscription;
                        mo31467f();
                        subscription.request(this.f59961d);
                        return;
                    }
                }
                this.f59965h = new SpscArrayQueue(this.f59961d);
                mo31467f();
                subscription.request(this.f59961d);
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport
        /* renamed from: e */
        public final void mo31466e() {
            this.f59969l = false;
            mo31465a();
        }

        /* renamed from: f */
        public abstract void mo31467f();

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f59966i = true;
            mo31465a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t) {
            if (this.f59970m == 2 || this.f59965h.offer(t)) {
                mo31465a();
            } else {
                this.f59963f.cancel();
                onError(new IllegalStateException("Queue full?!"));
            }
        }
    }

    public static final class ConcatMapDelayed<T, R> extends BaseConcatMapSubscriber<T, R> {

        /* renamed from: n */
        public final Subscriber<? super R> f59971n;

        /* renamed from: o */
        public final boolean f59972o;

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber
        /* renamed from: a */
        public void mo31465a() {
            if (getAndIncrement() == 0) {
                while (!this.f59967j) {
                    if (!this.f59969l) {
                        boolean z = this.f59966i;
                        if (z && !this.f59972o && this.f59968k.get() != null) {
                            this.f59971n.onError(ExceptionHelper.m31818b(this.f59968k));
                            return;
                        }
                        try {
                            T poll = this.f59965h.poll();
                            boolean z2 = poll == null;
                            if (z && z2) {
                                Throwable m31818b = ExceptionHelper.m31818b(this.f59968k);
                                if (m31818b != null) {
                                    this.f59971n.onError(m31818b);
                                    return;
                                } else {
                                    this.f59971n.onComplete();
                                    return;
                                }
                            }
                            if (!z2) {
                                try {
                                    Publisher<? extends R> apply = this.f59960c.apply(poll);
                                    Objects.requireNonNull(apply, "The mapper returned a null Publisher");
                                    Publisher<? extends R> publisher = apply;
                                    if (this.f59970m != 1) {
                                        int i2 = this.f59964g + 1;
                                        if (i2 == this.f59962e) {
                                            this.f59964g = 0;
                                            this.f59963f.request(i2);
                                        } else {
                                            this.f59964g = i2;
                                        }
                                    }
                                    if (publisher instanceof Callable) {
                                        try {
                                            Object call = ((Callable) publisher).call();
                                            if (call == null) {
                                                continue;
                                            } else if (this.f59959b.f62778i) {
                                                this.f59971n.onNext(call);
                                            } else {
                                                this.f59969l = true;
                                                ConcatMapInner<R> concatMapInner = this.f59959b;
                                                concatMapInner.m31796g(new WeakScalarSubscription(call, concatMapInner));
                                            }
                                        } catch (Throwable th) {
                                            Exceptions.m31402a(th);
                                            this.f59963f.cancel();
                                            ExceptionHelper.m31817a(this.f59968k, th);
                                            this.f59971n.onError(ExceptionHelper.m31818b(this.f59968k));
                                            return;
                                        }
                                    } else {
                                        this.f59969l = true;
                                        publisher.mo31351g(this.f59959b);
                                    }
                                } catch (Throwable th2) {
                                    Exceptions.m31402a(th2);
                                    this.f59963f.cancel();
                                    ExceptionHelper.m31817a(this.f59968k, th2);
                                    this.f59971n.onError(ExceptionHelper.m31818b(this.f59968k));
                                    return;
                                }
                            }
                        } catch (Throwable th3) {
                            Exceptions.m31402a(th3);
                            this.f59963f.cancel();
                            ExceptionHelper.m31817a(this.f59968k, th3);
                            this.f59971n.onError(ExceptionHelper.m31818b(this.f59968k));
                            return;
                        }
                    }
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport
        /* renamed from: b */
        public void mo31468b(Throwable th) {
            if (!ExceptionHelper.m31817a(this.f59968k, th)) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            if (!this.f59972o) {
                this.f59963f.cancel();
                this.f59966i = true;
            }
            this.f59969l = false;
            mo31465a();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport
        /* renamed from: c */
        public void mo31469c(R r) {
            this.f59971n.onNext(r);
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.f59967j) {
                return;
            }
            this.f59967j = true;
            this.f59959b.cancel();
            this.f59963f.cancel();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber
        /* renamed from: f */
        public void mo31467f() {
            this.f59971n.mo31352d(this);
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (!ExceptionHelper.m31817a(this.f59968k, th)) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f59966i = true;
                mo31465a();
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            this.f59959b.request(j2);
        }
    }

    public static final class ConcatMapImmediate<T, R> extends BaseConcatMapSubscriber<T, R> {

        /* renamed from: n */
        public final Subscriber<? super R> f59973n;

        /* renamed from: o */
        public final AtomicInteger f59974o;

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber
        /* renamed from: a */
        public void mo31465a() {
            if (this.f59974o.getAndIncrement() == 0) {
                while (!this.f59967j) {
                    if (!this.f59969l) {
                        boolean z = this.f59966i;
                        try {
                            T poll = this.f59965h.poll();
                            boolean z2 = poll == null;
                            if (z && z2) {
                                this.f59973n.onComplete();
                                return;
                            }
                            if (!z2) {
                                try {
                                    Publisher<? extends R> apply = this.f59960c.apply(poll);
                                    Objects.requireNonNull(apply, "The mapper returned a null Publisher");
                                    Publisher<? extends R> publisher = apply;
                                    if (this.f59970m != 1) {
                                        int i2 = this.f59964g + 1;
                                        if (i2 == this.f59962e) {
                                            this.f59964g = 0;
                                            this.f59963f.request(i2);
                                        } else {
                                            this.f59964g = i2;
                                        }
                                    }
                                    if (publisher instanceof Callable) {
                                        try {
                                            Object call = ((Callable) publisher).call();
                                            if (call == null) {
                                                continue;
                                            } else if (!this.f59959b.f62778i) {
                                                this.f59969l = true;
                                                ConcatMapInner<R> concatMapInner = this.f59959b;
                                                concatMapInner.m31796g(new WeakScalarSubscription(call, concatMapInner));
                                            } else if (get() == 0 && compareAndSet(0, 1)) {
                                                this.f59973n.onNext(call);
                                                if (!compareAndSet(1, 0)) {
                                                    this.f59973n.onError(ExceptionHelper.m31818b(this.f59968k));
                                                    return;
                                                }
                                            }
                                        } catch (Throwable th) {
                                            Exceptions.m31402a(th);
                                            this.f59963f.cancel();
                                            ExceptionHelper.m31817a(this.f59968k, th);
                                            this.f59973n.onError(ExceptionHelper.m31818b(this.f59968k));
                                            return;
                                        }
                                    } else {
                                        this.f59969l = true;
                                        publisher.mo31351g(this.f59959b);
                                    }
                                } catch (Throwable th2) {
                                    Exceptions.m31402a(th2);
                                    this.f59963f.cancel();
                                    ExceptionHelper.m31817a(this.f59968k, th2);
                                    this.f59973n.onError(ExceptionHelper.m31818b(this.f59968k));
                                    return;
                                }
                            }
                        } catch (Throwable th3) {
                            Exceptions.m31402a(th3);
                            this.f59963f.cancel();
                            ExceptionHelper.m31817a(this.f59968k, th3);
                            this.f59973n.onError(ExceptionHelper.m31818b(this.f59968k));
                            return;
                        }
                    }
                    if (this.f59974o.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport
        /* renamed from: b */
        public void mo31468b(Throwable th) {
            if (!ExceptionHelper.m31817a(this.f59968k, th)) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            this.f59963f.cancel();
            if (getAndIncrement() == 0) {
                this.f59973n.onError(ExceptionHelper.m31818b(this.f59968k));
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.ConcatMapSupport
        /* renamed from: c */
        public void mo31469c(R r) {
            if (get() == 0 && compareAndSet(0, 1)) {
                this.f59973n.onNext(r);
                if (compareAndSet(1, 0)) {
                    return;
                }
                this.f59973n.onError(ExceptionHelper.m31818b(this.f59968k));
            }
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.f59967j) {
                return;
            }
            this.f59967j = true;
            this.f59959b.cancel();
            this.f59963f.cancel();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableConcatMap.BaseConcatMapSubscriber
        /* renamed from: f */
        public void mo31467f() {
            this.f59973n.mo31352d(this);
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (!ExceptionHelper.m31817a(this.f59968k, th)) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            this.f59959b.cancel();
            if (getAndIncrement() == 0) {
                this.f59973n.onError(ExceptionHelper.m31818b(this.f59968k));
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            this.f59959b.request(j2);
        }
    }

    public static final class ConcatMapInner<R> extends SubscriptionArbiter implements FlowableSubscriber<R> {

        /* renamed from: j */
        public final ConcatMapSupport<R> f59975j;

        /* renamed from: k */
        public long f59976k;

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            m31796g(subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            long j2 = this.f59976k;
            if (j2 != 0) {
                this.f59976k = 0L;
                m31795f(j2);
            }
            this.f59975j.mo31466e();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            long j2 = this.f59976k;
            if (j2 != 0) {
                this.f59976k = 0L;
                m31795f(j2);
            }
            this.f59975j.mo31468b(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(R r) {
            this.f59976k++;
            this.f59975j.mo31469c(r);
        }
    }

    public interface ConcatMapSupport<T> {
        /* renamed from: b */
        void mo31468b(Throwable th);

        /* renamed from: c */
        void mo31469c(T t);

        /* renamed from: e */
        void mo31466e();
    }

    public static final class WeakScalarSubscription<T> implements Subscription {

        /* renamed from: b */
        public final Subscriber<? super T> f59977b;

        /* renamed from: c */
        public final T f59978c;

        /* renamed from: d */
        public boolean f59979d;

        public WeakScalarSubscription(T t, Subscriber<? super T> subscriber) {
            this.f59978c = t;
            this.f59977b = subscriber;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            if (j2 <= 0 || this.f59979d) {
                return;
            }
            this.f59979d = true;
            Subscriber<? super T> subscriber = this.f59977b;
            subscriber.onNext(this.f59978c);
            subscriber.onComplete();
        }
    }

    /* renamed from: e */
    public static <T, R> Subscriber<T> m31464e(Subscriber<? super R> subscriber, Function<? super T, ? extends Publisher<? extends R>> function, int i2, ErrorMode errorMode) {
        throw null;
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super R> subscriber) {
        if (FlowableScalarXMap.m31578a(this.f59782c, subscriber, null)) {
            return;
        }
        m31464e(subscriber, null, 0, null);
        throw null;
    }
}
