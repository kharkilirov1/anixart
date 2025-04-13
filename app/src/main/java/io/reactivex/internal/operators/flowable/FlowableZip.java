package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableZip<T, R> extends Flowable<R> {

    /* renamed from: c */
    public final Publisher<? extends T>[] f60932c;

    /* renamed from: d */
    public final Iterable<? extends Publisher<? extends T>> f60933d;

    /* renamed from: e */
    public final Function<? super Object[], ? extends R> f60934e;

    /* renamed from: f */
    public final int f60935f;

    /* renamed from: g */
    public final boolean f60936g;

    public static final class ZipCoordinator<T, R> extends AtomicInteger implements Subscription {

        /* renamed from: b */
        public final Subscriber<? super R> f60937b;

        /* renamed from: c */
        public final ZipSubscriber<T, R>[] f60938c;

        /* renamed from: d */
        public final Function<? super Object[], ? extends R> f60939d;

        /* renamed from: e */
        public final AtomicLong f60940e;

        /* renamed from: f */
        public final AtomicThrowable f60941f;

        /* renamed from: g */
        public final boolean f60942g;

        /* renamed from: h */
        public volatile boolean f60943h;

        /* renamed from: i */
        public final Object[] f60944i;

        public ZipCoordinator(Subscriber<? super R> subscriber, Function<? super Object[], ? extends R> function, int i2, int i3, boolean z) {
            this.f60937b = subscriber;
            this.f60939d = function;
            this.f60942g = z;
            ZipSubscriber<T, R>[] zipSubscriberArr = new ZipSubscriber[i2];
            for (int i4 = 0; i4 < i2; i4++) {
                zipSubscriberArr[i4] = new ZipSubscriber<>(this, i3);
            }
            this.f60944i = new Object[i2];
            this.f60938c = zipSubscriberArr;
            this.f60940e = new AtomicLong();
            this.f60941f = new AtomicThrowable();
        }

        /* renamed from: a */
        public void m31609a() {
            for (ZipSubscriber<T, R> zipSubscriber : this.f60938c) {
                SubscriptionHelper.m31797a(zipSubscriber);
            }
        }

        /* renamed from: b */
        public void m31610b() {
            boolean z;
            T poll;
            boolean z2;
            if (getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super R> subscriber = this.f60937b;
            ZipSubscriber<T, R>[] zipSubscriberArr = this.f60938c;
            int length = zipSubscriberArr.length;
            Object[] objArr = this.f60944i;
            int i2 = 1;
            do {
                long j2 = this.f60940e.get();
                long j3 = 0;
                while (j2 != j3) {
                    if (this.f60943h) {
                        return;
                    }
                    if (!this.f60942g && this.f60941f.get() != null) {
                        m31609a();
                        subscriber.onError(ExceptionHelper.m31818b(this.f60941f));
                        return;
                    }
                    boolean z3 = false;
                    for (int i3 = 0; i3 < length; i3++) {
                        ZipSubscriber<T, R> zipSubscriber = zipSubscriberArr[i3];
                        if (objArr[i3] == null) {
                            try {
                                z = zipSubscriber.f60950g;
                                SimpleQueue<T> simpleQueue = zipSubscriber.f60948e;
                                poll = simpleQueue != null ? simpleQueue.poll() : null;
                                z2 = poll == null;
                            } catch (Throwable th) {
                                Exceptions.m31402a(th);
                                ExceptionHelper.m31817a(this.f60941f, th);
                                if (!this.f60942g) {
                                    m31609a();
                                    subscriber.onError(ExceptionHelper.m31818b(this.f60941f));
                                    return;
                                }
                            }
                            if (z && z2) {
                                m31609a();
                                if (this.f60941f.get() != null) {
                                    subscriber.onError(ExceptionHelper.m31818b(this.f60941f));
                                    return;
                                } else {
                                    subscriber.onComplete();
                                    return;
                                }
                            }
                            if (!z2) {
                                objArr[i3] = poll;
                            }
                            z3 = true;
                        }
                    }
                    if (z3) {
                        break;
                    }
                    try {
                        R apply = this.f60939d.apply(objArr.clone());
                        Objects.requireNonNull(apply, "The zipper returned a null value");
                        subscriber.onNext(apply);
                        j3++;
                        Arrays.fill(objArr, (Object) null);
                    } catch (Throwable th2) {
                        Exceptions.m31402a(th2);
                        m31609a();
                        ExceptionHelper.m31817a(this.f60941f, th2);
                        subscriber.onError(ExceptionHelper.m31818b(this.f60941f));
                        return;
                    }
                }
                if (j2 == j3) {
                    if (this.f60943h) {
                        return;
                    }
                    if (!this.f60942g && this.f60941f.get() != null) {
                        m31609a();
                        subscriber.onError(ExceptionHelper.m31818b(this.f60941f));
                        return;
                    }
                    for (int i4 = 0; i4 < length; i4++) {
                        ZipSubscriber<T, R> zipSubscriber2 = zipSubscriberArr[i4];
                        if (objArr[i4] == null) {
                            try {
                                boolean z4 = zipSubscriber2.f60950g;
                                SimpleQueue<T> simpleQueue2 = zipSubscriber2.f60948e;
                                T poll2 = simpleQueue2 != null ? simpleQueue2.poll() : null;
                                boolean z5 = poll2 == null;
                                if (z4 && z5) {
                                    m31609a();
                                    if (this.f60941f.get() != null) {
                                        subscriber.onError(ExceptionHelper.m31818b(this.f60941f));
                                        return;
                                    } else {
                                        subscriber.onComplete();
                                        return;
                                    }
                                }
                                if (!z5) {
                                    objArr[i4] = poll2;
                                }
                            } catch (Throwable th3) {
                                Exceptions.m31402a(th3);
                                ExceptionHelper.m31817a(this.f60941f, th3);
                                if (!this.f60942g) {
                                    m31609a();
                                    subscriber.onError(ExceptionHelper.m31818b(this.f60941f));
                                    return;
                                }
                            }
                        }
                    }
                }
                if (j3 != 0) {
                    for (ZipSubscriber<T, R> zipSubscriber3 : zipSubscriberArr) {
                        zipSubscriber3.request(j3);
                    }
                    if (j2 != Long.MAX_VALUE) {
                        this.f60940e.addAndGet(-j3);
                    }
                }
                i2 = addAndGet(-i2);
            } while (i2 != 0);
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            if (this.f60943h) {
                return;
            }
            this.f60943h = true;
            m31609a();
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            if (SubscriptionHelper.m31803h(j2)) {
                BackpressureHelper.m31808a(this.f60940e, j2);
                m31610b();
            }
        }
    }

    public static final class ZipSubscriber<T, R> extends AtomicReference<Subscription> implements FlowableSubscriber<T>, Subscription {

        /* renamed from: b */
        public final ZipCoordinator<T, R> f60945b;

        /* renamed from: c */
        public final int f60946c;

        /* renamed from: d */
        public final int f60947d;

        /* renamed from: e */
        public SimpleQueue<T> f60948e;

        /* renamed from: f */
        public long f60949f;

        /* renamed from: g */
        public volatile boolean f60950g;

        /* renamed from: h */
        public int f60951h;

        public ZipSubscriber(ZipCoordinator<T, R> zipCoordinator, int i2) {
            this.f60945b = zipCoordinator;
            this.f60946c = i2;
            this.f60947d = i2 - (i2 >> 2);
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            SubscriptionHelper.m31797a(this);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31801e(this, subscription)) {
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int mo31420F = queueSubscription.mo31420F(7);
                    if (mo31420F == 1) {
                        this.f60951h = mo31420F;
                        this.f60948e = queueSubscription;
                        this.f60950g = true;
                        this.f60945b.m31610b();
                        return;
                    }
                    if (mo31420F == 2) {
                        this.f60951h = mo31420F;
                        this.f60948e = queueSubscription;
                        subscription.request(this.f60946c);
                        return;
                    }
                }
                this.f60948e = new SpscArrayQueue(this.f60946c);
                subscription.request(this.f60946c);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f60950g = true;
            this.f60945b.m31610b();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            ZipCoordinator<T, R> zipCoordinator = this.f60945b;
            if (!ExceptionHelper.m31817a(zipCoordinator.f60941f, th)) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f60950g = true;
                zipCoordinator.m31610b();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.f60951h != 2) {
                this.f60948e.offer(t);
            }
            this.f60945b.m31610b();
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            if (this.f60951h != 1) {
                long j3 = this.f60949f + j2;
                if (j3 < this.f60947d) {
                    this.f60949f = j3;
                } else {
                    this.f60949f = 0L;
                    get().request(j3);
                }
            }
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super R> subscriber) {
        int length;
        Publisher<? extends T>[] publisherArr = this.f60932c;
        if (publisherArr == null) {
            publisherArr = new Publisher[8];
            length = 0;
            for (Publisher<? extends T> publisher : this.f60933d) {
                if (length == publisherArr.length) {
                    Publisher<? extends T>[] publisherArr2 = new Publisher[(length >> 2) + length];
                    System.arraycopy(publisherArr, 0, publisherArr2, 0, length);
                    publisherArr = publisherArr2;
                }
                publisherArr[length] = publisher;
                length++;
            }
        } else {
            length = publisherArr.length;
        }
        int i2 = length;
        if (i2 == 0) {
            subscriber.mo31352d(EmptySubscription.INSTANCE);
            subscriber.onComplete();
            return;
        }
        ZipCoordinator zipCoordinator = new ZipCoordinator(subscriber, this.f60934e, i2, this.f60935f, this.f60936g);
        subscriber.mo31352d(zipCoordinator);
        ZipSubscriber<T, R>[] zipSubscriberArr = zipCoordinator.f60938c;
        for (int i3 = 0; i3 < i2 && !zipCoordinator.f60943h; i3++) {
            if (!zipCoordinator.f60942g && zipCoordinator.f60941f.get() != null) {
                return;
            }
            publisherArr[i3].mo31351g(zipSubscriberArr[i3]);
        }
    }
}
