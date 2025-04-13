package io.reactivex.internal.subscriptions;

import io.reactivex.annotations.Nullable;
import org.reactivestreams.Subscriber;

/* loaded from: classes3.dex */
public class DeferredScalarSubscription<T> extends BasicIntQueueSubscription<T> {

    /* renamed from: b */
    public final Subscriber<? super T> f62765b;

    /* renamed from: c */
    public T f62766c;

    public DeferredScalarSubscription(Subscriber<? super T> subscriber) {
        this.f62765b = subscriber;
    }

    @Override // io.reactivex.internal.fuseable.QueueFuseable
    /* renamed from: F */
    public final int mo31420F(int i2) {
        if ((i2 & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }

    public void cancel() {
        set(4);
        this.f62766c = null;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final void clear() {
        lazySet(32);
        this.f62766c = null;
    }

    /* renamed from: f */
    public final void m31789f(T t) {
        int i2 = get();
        while (i2 != 8) {
            if ((i2 & (-3)) != 0) {
                return;
            }
            if (i2 == 2) {
                lazySet(3);
                Subscriber<? super T> subscriber = this.f62765b;
                subscriber.onNext(t);
                if (get() != 4) {
                    subscriber.onComplete();
                    return;
                }
                return;
            }
            this.f62766c = t;
            if (compareAndSet(0, 1)) {
                return;
            }
            i2 = get();
            if (i2 == 4) {
                this.f62766c = null;
                return;
            }
        }
        this.f62766c = t;
        lazySet(16);
        Subscriber<? super T> subscriber2 = this.f62765b;
        subscriber2.onNext(t);
        if (get() != 4) {
            subscriber2.onComplete();
        }
    }

    /* renamed from: h */
    public final boolean m31790h() {
        return get() == 4;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
        return get() != 16;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    @Nullable
    public final T poll() {
        if (get() != 16) {
            return null;
        }
        lazySet(32);
        T t = this.f62766c;
        this.f62766c = null;
        return t;
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long j2) {
        T t;
        if (SubscriptionHelper.m31803h(j2)) {
            do {
                int i2 = get();
                if ((i2 & (-2)) != 0) {
                    return;
                }
                if (i2 == 1) {
                    if (!compareAndSet(1, 3) || (t = this.f62766c) == null) {
                        return;
                    }
                    this.f62766c = null;
                    Subscriber<? super T> subscriber = this.f62765b;
                    subscriber.onNext(t);
                    if (get() != 4) {
                        subscriber.onComplete();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(0, 2));
        }
    }
}
