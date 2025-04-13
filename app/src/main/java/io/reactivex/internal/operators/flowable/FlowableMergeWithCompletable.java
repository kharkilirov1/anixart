package io.reactivex.internal.operators.flowable;

import io.reactivex.CompletableObserver;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.HalfSerializer;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableMergeWithCompletable<T> extends AbstractFlowableWithUpstream<T, T> {

    public static final class MergeWithSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {

        /* renamed from: b */
        public final Subscriber<? super T> f60328b;

        /* renamed from: c */
        public final AtomicReference<Subscription> f60329c = new AtomicReference<>();

        /* renamed from: d */
        public final OtherObserver f60330d = new OtherObserver(this);

        /* renamed from: e */
        public final AtomicThrowable f60331e = new AtomicThrowable();

        /* renamed from: f */
        public final AtomicLong f60332f = new AtomicLong();

        /* renamed from: g */
        public volatile boolean f60333g;

        /* renamed from: h */
        public volatile boolean f60334h;

        public static final class OtherObserver extends AtomicReference<Disposable> implements CompletableObserver {

            /* renamed from: b */
            public final MergeWithSubscriber<?> f60335b;

            public OtherObserver(MergeWithSubscriber<?> mergeWithSubscriber) {
                this.f60335b = mergeWithSubscriber;
            }

            @Override // io.reactivex.CompletableObserver
            /* renamed from: a */
            public void mo31347a(Disposable disposable) {
                DisposableHelper.m31413e(this, disposable);
            }

            @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
            public void onComplete() {
                MergeWithSubscriber<?> mergeWithSubscriber = this.f60335b;
                mergeWithSubscriber.f60334h = true;
                if (mergeWithSubscriber.f60333g) {
                    HalfSerializer.m31823b(mergeWithSubscriber.f60328b, mergeWithSubscriber, mergeWithSubscriber.f60331e);
                }
            }

            @Override // io.reactivex.CompletableObserver
            public void onError(Throwable th) {
                MergeWithSubscriber<?> mergeWithSubscriber = this.f60335b;
                SubscriptionHelper.m31797a(mergeWithSubscriber.f60329c);
                HalfSerializer.m31825d(mergeWithSubscriber.f60328b, th, mergeWithSubscriber, mergeWithSubscriber.f60331e);
            }
        }

        public MergeWithSubscriber(Subscriber<? super T> subscriber) {
            this.f60328b = subscriber;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            SubscriptionHelper.m31797a(this.f60329c);
            DisposableHelper.m31409a(this.f60330d);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        /* renamed from: d */
        public void mo31352d(Subscription subscription) {
            SubscriptionHelper.m31799c(this.f60329c, this.f60332f, subscription);
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f60333g = true;
            if (this.f60334h) {
                HalfSerializer.m31823b(this.f60328b, this, this.f60331e);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            SubscriptionHelper.m31797a(this.f60329c);
            HalfSerializer.m31825d(this.f60328b, th, this, this.f60331e);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t) {
            HalfSerializer.m31827f(this.f60328b, t, this, this.f60331e);
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j2) {
            SubscriptionHelper.m31798b(this.f60329c, this.f60332f, j2);
        }
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        MergeWithSubscriber mergeWithSubscriber = new MergeWithSubscriber(subscriber);
        subscriber.mo31352d(mergeWithSubscriber);
        this.f59782c.m31349b(mergeWithSubscriber);
        throw null;
    }
}
