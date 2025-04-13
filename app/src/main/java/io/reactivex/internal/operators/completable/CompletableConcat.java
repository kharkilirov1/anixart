package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class CompletableConcat extends Completable {

    public static final class CompletableConcatSubscriber extends AtomicInteger implements FlowableSubscriber<CompletableSource>, Disposable {

        /* renamed from: b */
        public final CompletableObserver f59687b;

        /* renamed from: c */
        public final int f59688c;

        /* renamed from: d */
        public final int f59689d;

        /* renamed from: e */
        public final ConcatInnerObserver f59690e = new ConcatInnerObserver(this);

        /* renamed from: f */
        public final AtomicBoolean f59691f = new AtomicBoolean();

        /* renamed from: g */
        public int f59692g;

        /* renamed from: h */
        public int f59693h;

        /* renamed from: i */
        public SimpleQueue<CompletableSource> f59694i;

        /* renamed from: j */
        public Subscription f59695j;

        /* renamed from: k */
        public volatile boolean f59696k;

        /* renamed from: l */
        public volatile boolean f59697l;

        public static final class ConcatInnerObserver extends AtomicReference<Disposable> implements CompletableObserver {

            /* renamed from: b */
            public final CompletableConcatSubscriber f59698b;

            public ConcatInnerObserver(CompletableConcatSubscriber completableConcatSubscriber) {
                this.f59698b = completableConcatSubscriber;
            }

            @Override // io.reactivex.CompletableObserver
            /* renamed from: a */
            public void mo31347a(Disposable disposable) {
                DisposableHelper.m31411c(this, disposable);
            }

            @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
            public void onComplete() {
                CompletableConcatSubscriber completableConcatSubscriber = this.f59698b;
                completableConcatSubscriber.f59697l = false;
                completableConcatSubscriber.m31445a();
            }

            @Override // io.reactivex.CompletableObserver
            public void onError(Throwable th) {
                this.f59698b.m31446b(th);
            }
        }

        public CompletableConcatSubscriber(CompletableObserver completableObserver, int i2) {
            this.f59687b = completableObserver;
            this.f59688c = i2;
            this.f59689d = i2 - (i2 >> 2);
        }

        /* renamed from: a */
        public void m31445a() {
            if (getAndIncrement() != 0) {
                return;
            }
            while (!mo31380s()) {
                if (!this.f59697l) {
                    boolean z = this.f59696k;
                    try {
                        CompletableSource poll = this.f59694i.poll();
                        boolean z2 = poll == null;
                        if (z && z2) {
                            if (this.f59691f.compareAndSet(false, true)) {
                                this.f59687b.onComplete();
                                return;
                            }
                            return;
                        } else if (!z2) {
                            this.f59697l = true;
                            poll.mo31345b(this.f59690e);
                            if (this.f59692g != 1) {
                                int i2 = this.f59693h + 1;
                                if (i2 == this.f59689d) {
                                    this.f59693h = 0;
                                    this.f59695j.request(i2);
                                } else {
                                    this.f59693h = i2;
                                }
                            }
                        }
                    } catch (Throwable th) {
                        Exceptions.m31402a(th);
                        m31446b(th);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }

        /* renamed from: b */
        public void m31446b(Throwable th) {
            if (!this.f59691f.compareAndSet(false, true)) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f59695j.cancel();
                this.f59687b.onError(th);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f59695j, subscription)) {
                this.f59695j = subscription;
                int i2 = this.f59688c;
                long j2 = i2 == Integer.MAX_VALUE ? Long.MAX_VALUE : i2;
                if (subscription instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) subscription;
                    int mo31420F = queueSubscription.mo31420F(3);
                    if (mo31420F == 1) {
                        this.f59692g = mo31420F;
                        this.f59694i = queueSubscription;
                        this.f59696k = true;
                        this.f59687b.mo31347a(this);
                        m31445a();
                        return;
                    }
                    if (mo31420F == 2) {
                        this.f59692g = mo31420F;
                        this.f59694i = queueSubscription;
                        this.f59687b.mo31347a(this);
                        subscription.request(j2);
                        return;
                    }
                }
                if (this.f59688c == Integer.MAX_VALUE) {
                    this.f59694i = new SpscLinkedArrayQueue(Flowable.f59569b);
                } else {
                    this.f59694i = new SpscArrayQueue(this.f59688c);
                }
                this.f59687b.mo31347a(this);
                subscription.request(j2);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f59695j.cancel();
            DisposableHelper.m31409a(this.f59690e);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f59696k = true;
            m31445a();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (!this.f59691f.compareAndSet(false, true)) {
                RxJavaPlugins.m31848b(th);
            } else {
                DisposableHelper.m31409a(this.f59690e);
                this.f59687b.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            CompletableSource completableSource = (CompletableSource) obj;
            if (this.f59692g != 0 || this.f59694i.offer(completableSource)) {
                m31445a();
            } else {
                onError(new MissingBackpressureException());
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return DisposableHelper.m31410b(this.f59690e.get());
        }
    }

    @Override // io.reactivex.Completable
    /* renamed from: c */
    public void mo31346c(CompletableObserver completableObserver) {
        new CompletableConcatSubscriber(completableObserver, 0);
        throw null;
    }
}
