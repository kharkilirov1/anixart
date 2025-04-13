package io.reactivex.internal.operators.mixed;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableConcatMapCompletable<T> extends Completable {

    public static final class ConcatMapCompletableObserver<T> extends AtomicInteger implements FlowableSubscriber<T>, Disposable {

        /* renamed from: b */
        public final CompletableObserver f61180b;

        /* renamed from: c */
        public final Function<? super T, ? extends CompletableSource> f61181c = null;

        /* renamed from: d */
        public final ErrorMode f61182d = null;

        /* renamed from: e */
        public final AtomicThrowable f61183e = new AtomicThrowable();

        /* renamed from: f */
        public final ConcatMapInnerObserver f61184f = new ConcatMapInnerObserver(this);

        /* renamed from: g */
        public final int f61185g;

        /* renamed from: h */
        public final SimplePlainQueue<T> f61186h;

        /* renamed from: i */
        public Subscription f61187i;

        /* renamed from: j */
        public volatile boolean f61188j;

        /* renamed from: k */
        public volatile boolean f61189k;

        /* renamed from: l */
        public volatile boolean f61190l;

        /* renamed from: m */
        public int f61191m;

        public static final class ConcatMapInnerObserver extends AtomicReference<Disposable> implements CompletableObserver {

            /* renamed from: b */
            public final ConcatMapCompletableObserver<?> f61192b;

            public ConcatMapInnerObserver(ConcatMapCompletableObserver<?> concatMapCompletableObserver) {
                this.f61192b = concatMapCompletableObserver;
            }

            @Override // io.reactivex.CompletableObserver
            /* renamed from: a */
            public void mo31347a(Disposable disposable) {
                DisposableHelper.m31411c(this, disposable);
            }

            @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
            public void onComplete() {
                ConcatMapCompletableObserver<?> concatMapCompletableObserver = this.f61192b;
                concatMapCompletableObserver.f61188j = false;
                concatMapCompletableObserver.m31630a();
            }

            @Override // io.reactivex.CompletableObserver
            public void onError(Throwable th) {
                ConcatMapCompletableObserver<?> concatMapCompletableObserver = this.f61192b;
                if (!ExceptionHelper.m31817a(concatMapCompletableObserver.f61183e, th)) {
                    RxJavaPlugins.m31848b(th);
                    return;
                }
                if (concatMapCompletableObserver.f61182d != ErrorMode.IMMEDIATE) {
                    concatMapCompletableObserver.f61188j = false;
                    concatMapCompletableObserver.m31630a();
                    return;
                }
                concatMapCompletableObserver.f61187i.cancel();
                Throwable m31818b = ExceptionHelper.m31818b(concatMapCompletableObserver.f61183e);
                if (m31818b != ExceptionHelper.f62793a) {
                    concatMapCompletableObserver.f61180b.onError(m31818b);
                }
                if (concatMapCompletableObserver.getAndIncrement() == 0) {
                    concatMapCompletableObserver.f61186h.clear();
                }
            }
        }

        public ConcatMapCompletableObserver(CompletableObserver completableObserver, Function<? super T, ? extends CompletableSource> function, ErrorMode errorMode, int i2) {
            this.f61180b = completableObserver;
            this.f61185g = i2;
            this.f61186h = new SpscArrayQueue(i2);
        }

        /* renamed from: a */
        public void m31630a() {
            if (getAndIncrement() != 0) {
                return;
            }
            while (!this.f61190l) {
                if (!this.f61188j) {
                    if (this.f61182d == ErrorMode.BOUNDARY && this.f61183e.get() != null) {
                        this.f61186h.clear();
                        this.f61180b.onError(ExceptionHelper.m31818b(this.f61183e));
                        return;
                    }
                    boolean z = this.f61189k;
                    T poll = this.f61186h.poll();
                    boolean z2 = poll == null;
                    if (z && z2) {
                        Throwable m31818b = ExceptionHelper.m31818b(this.f61183e);
                        if (m31818b != null) {
                            this.f61180b.onError(m31818b);
                            return;
                        } else {
                            this.f61180b.onComplete();
                            return;
                        }
                    }
                    if (!z2) {
                        int i2 = this.f61185g;
                        int i3 = i2 - (i2 >> 1);
                        int i4 = this.f61191m + 1;
                        if (i4 == i3) {
                            this.f61191m = 0;
                            this.f61187i.request(i3);
                        } else {
                            this.f61191m = i4;
                        }
                        try {
                            CompletableSource apply = this.f61181c.apply(poll);
                            Objects.requireNonNull(apply, "The mapper returned a null CompletableSource");
                            CompletableSource completableSource = apply;
                            this.f61188j = true;
                            completableSource.mo31345b(this.f61184f);
                        } catch (Throwable th) {
                            Exceptions.m31402a(th);
                            this.f61186h.clear();
                            this.f61187i.cancel();
                            ExceptionHelper.m31817a(this.f61183e, th);
                            this.f61180b.onError(ExceptionHelper.m31818b(this.f61183e));
                            return;
                        }
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            this.f61186h.clear();
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f61187i, subscription)) {
                this.f61187i = subscription;
                this.f61180b.mo31347a(this);
                subscription.request(this.f61185g);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: f */
        public void mo31379f() {
            this.f61190l = true;
            this.f61187i.cancel();
            DisposableHelper.m31409a(this.f61184f);
            if (getAndIncrement() == 0) {
                this.f61186h.clear();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f61189k = true;
            m31630a();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (!ExceptionHelper.m31817a(this.f61183e, th)) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            if (this.f61182d != ErrorMode.IMMEDIATE) {
                this.f61189k = true;
                m31630a();
                return;
            }
            DisposableHelper.m31409a(this.f61184f);
            Throwable m31818b = ExceptionHelper.m31818b(this.f61183e);
            if (m31818b != ExceptionHelper.f62793a) {
                this.f61180b.onError(m31818b);
            }
            if (getAndIncrement() == 0) {
                this.f61186h.clear();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            if (this.f61186h.offer(t)) {
                m31630a();
            } else {
                this.f61187i.cancel();
                onError(new MissingBackpressureException("Queue full?!"));
            }
        }

        @Override // io.reactivex.disposables.Disposable
        /* renamed from: s */
        public boolean mo31380s() {
            return this.f61190l;
        }
    }

    @Override // io.reactivex.Completable
    /* renamed from: c */
    public void mo31346c(CompletableObserver completableObserver) {
        new ConcatMapCompletableObserver(completableObserver, null, null, 0);
        throw null;
    }
}
