package io.reactivex.internal.operators.flowable;

import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.FlowableSubscriber;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableFlatMapCompletable<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class FlatMapCompletableMainSubscriber<T> extends BasicIntQueueSubscription<T> implements FlowableSubscriber<T> {

        /* renamed from: b */
        public final Subscriber<? super T> f60144b;

        /* renamed from: e */
        public final boolean f60147e;

        /* renamed from: g */
        public final int f60149g;

        /* renamed from: h */
        public Subscription f60150h;

        /* renamed from: i */
        public volatile boolean f60151i;

        /* renamed from: d */
        public final Function<? super T, ? extends CompletableSource> f60146d = null;

        /* renamed from: c */
        public final AtomicThrowable f60145c = new AtomicThrowable();

        /* renamed from: f */
        public final CompositeDisposable f60148f = new CompositeDisposable();

        public final class InnerConsumer extends AtomicReference<Disposable> implements CompletableObserver, Disposable {
            public InnerConsumer() {
            }

            @Override // io.reactivex.CompletableObserver
            /* renamed from: a */
            public void mo31347a(Disposable disposable) {
                DisposableHelper.m31413e(this, disposable);
            }

            @Override // io.reactivex.disposables.Disposable
            /* renamed from: f */
            public void mo31379f() {
                DisposableHelper.m31409a(this);
            }

            @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
            public void onComplete() {
                FlatMapCompletableMainSubscriber flatMapCompletableMainSubscriber = FlatMapCompletableMainSubscriber.this;
                flatMapCompletableMainSubscriber.f60148f.mo31394c(this);
                flatMapCompletableMainSubscriber.onComplete();
            }

            @Override // io.reactivex.CompletableObserver
            public void onError(Throwable th) {
                FlatMapCompletableMainSubscriber flatMapCompletableMainSubscriber = FlatMapCompletableMainSubscriber.this;
                flatMapCompletableMainSubscriber.f60148f.mo31394c(this);
                flatMapCompletableMainSubscriber.onError(th);
            }

            @Override // io.reactivex.disposables.Disposable
            /* renamed from: s */
            public boolean mo31380s() {
                return DisposableHelper.m31410b(get());
            }
        }

        public FlatMapCompletableMainSubscriber(Subscriber<? super T> subscriber, Function<? super T, ? extends CompletableSource> function, boolean z, int i2) {
            this.f60144b = subscriber;
            this.f60147e = z;
            this.f60149g = i2;
            lazySet(1);
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        /* renamed from: F */
        public int mo31420F(int i2) {
            return i2 & 2;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f60151i = true;
            this.f60150h.cancel();
            this.f60148f.mo31379f();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            if (SubscriptionHelper.m31804i(this.f60150h, subscription)) {
                this.f60150h = subscription;
                this.f60144b.mo31352d(this);
                int i2 = this.f60149g;
                if (i2 == Integer.MAX_VALUE) {
                    subscription.request(Long.MAX_VALUE);
                } else {
                    subscription.request(i2);
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return true;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            if (decrementAndGet() != 0) {
                if (this.f60149g != Integer.MAX_VALUE) {
                    this.f60150h.request(1L);
                }
            } else {
                Throwable m31818b = ExceptionHelper.m31818b(this.f60145c);
                if (m31818b != null) {
                    this.f60144b.onError(m31818b);
                } else {
                    this.f60144b.onComplete();
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            if (!ExceptionHelper.m31817a(this.f60145c, th)) {
                RxJavaPlugins.m31848b(th);
                return;
            }
            if (!this.f60147e) {
                cancel();
                if (getAndSet(0) > 0) {
                    this.f60144b.onError(ExceptionHelper.m31818b(this.f60145c));
                    return;
                }
                return;
            }
            if (decrementAndGet() == 0) {
                this.f60144b.onError(ExceptionHelper.m31818b(this.f60145c));
            } else if (this.f60149g != Integer.MAX_VALUE) {
                this.f60150h.request(1L);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            try {
                CompletableSource apply = this.f60146d.apply(t);
                Objects.requireNonNull(apply, "The mapper returned a null CompletableSource");
                CompletableSource completableSource = apply;
                getAndIncrement();
                InnerConsumer innerConsumer = new InnerConsumer();
                if (this.f60151i || !this.f60148f.mo31393b(innerConsumer)) {
                    return;
                }
                completableSource.mo31345b(innerConsumer);
            } catch (Throwable th) {
                Exceptions.m31402a(th);
                this.f60150h.cancel();
                onError(th);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() throws Exception {
            return null;
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        this.f59782c.m31349b(new FlatMapCompletableMainSubscriber(subscriber, null, false, 0));
    }
}
