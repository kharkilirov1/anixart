package io.reactivex.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class SerializedSubscriber<T> implements FlowableSubscriber<T>, Subscription {

    /* renamed from: b */
    public final Subscriber<? super T> f62994b;

    /* renamed from: c */
    public final boolean f62995c = false;

    /* renamed from: d */
    public Subscription f62996d;

    /* renamed from: e */
    public boolean f62997e;

    /* renamed from: f */
    public AppendOnlyLinkedArrayList<Object> f62998f;

    /* renamed from: g */
    public volatile boolean f62999g;

    public SerializedSubscriber(Subscriber<? super T> subscriber) {
        this.f62994b = subscriber;
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
        this.f62996d.cancel();
    }

    @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    /* renamed from: d */
    public void mo31352d(Subscription subscription) {
        if (SubscriptionHelper.m31804i(this.f62996d, subscription)) {
            this.f62996d = subscription;
            this.f62994b.mo31352d(this);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        if (this.f62999g) {
            return;
        }
        synchronized (this) {
            if (this.f62999g) {
                return;
            }
            if (!this.f62997e) {
                this.f62999g = true;
                this.f62997e = true;
                this.f62994b.onComplete();
            } else {
                AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList = this.f62998f;
                if (appendOnlyLinkedArrayList == null) {
                    appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList<>(4);
                    this.f62998f = appendOnlyLinkedArrayList;
                }
                appendOnlyLinkedArrayList.m31806b(NotificationLite.COMPLETE);
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th) {
        if (this.f62999g) {
            RxJavaPlugins.m31848b(th);
            return;
        }
        synchronized (this) {
            boolean z = false;
            if (this.f62999g) {
                z = true;
            } else {
                if (this.f62997e) {
                    this.f62999g = true;
                    AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList = this.f62998f;
                    if (appendOnlyLinkedArrayList == null) {
                        appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList<>(4);
                        this.f62998f = appendOnlyLinkedArrayList;
                    }
                    Object m31832e = NotificationLite.m31832e(th);
                    if (this.f62995c) {
                        appendOnlyLinkedArrayList.m31806b(m31832e);
                    } else {
                        appendOnlyLinkedArrayList.f62782b[0] = m31832e;
                    }
                    return;
                }
                this.f62999g = true;
                this.f62997e = true;
            }
            if (z) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f62994b.onError(th);
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t) {
        AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList;
        if (this.f62999g) {
            return;
        }
        if (t == null) {
            this.f62996d.cancel();
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        synchronized (this) {
            if (this.f62999g) {
                return;
            }
            if (this.f62997e) {
                AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList2 = this.f62998f;
                if (appendOnlyLinkedArrayList2 == null) {
                    appendOnlyLinkedArrayList2 = new AppendOnlyLinkedArrayList<>(4);
                    this.f62998f = appendOnlyLinkedArrayList2;
                }
                appendOnlyLinkedArrayList2.m31806b(t);
                return;
            }
            this.f62997e = true;
            this.f62994b.onNext(t);
            do {
                synchronized (this) {
                    appendOnlyLinkedArrayList = this.f62998f;
                    if (appendOnlyLinkedArrayList == null) {
                        this.f62997e = false;
                        return;
                    }
                    this.f62998f = null;
                }
            } while (!appendOnlyLinkedArrayList.m31805a(this.f62994b));
        }
    }

    @Override // org.reactivestreams.Subscription
    public void request(long j2) {
        this.f62996d.request(j2);
    }
}
