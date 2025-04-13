package io.reactivex.processors;

import io.reactivex.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
final class SerializedProcessor<T> extends FlowableProcessor<T> {

    /* renamed from: c */
    public final FlowableProcessor<T> f62877c;

    /* renamed from: d */
    public boolean f62878d;

    /* renamed from: e */
    public AppendOnlyLinkedArrayList<Object> f62879e;

    /* renamed from: f */
    public volatile boolean f62880f;

    public SerializedProcessor(FlowableProcessor<T> flowableProcessor) {
        this.f62877c = flowableProcessor;
    }

    @Override // io.reactivex.Flowable
    /* renamed from: c */
    public void mo31350c(Subscriber<? super T> subscriber) {
        this.f62877c.mo31351g(subscriber);
    }

    @Override // org.reactivestreams.Subscriber
    /* renamed from: d */
    public void mo31352d(Subscription subscription) {
        boolean z = true;
        if (!this.f62880f) {
            synchronized (this) {
                if (!this.f62880f) {
                    if (this.f62878d) {
                        AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList = this.f62879e;
                        if (appendOnlyLinkedArrayList == null) {
                            appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList<>(4);
                            this.f62879e = appendOnlyLinkedArrayList;
                        }
                        appendOnlyLinkedArrayList.m31806b(NotificationLite.m31836j(subscription));
                        return;
                    }
                    this.f62878d = true;
                    z = false;
                }
            }
        }
        if (z) {
            subscription.cancel();
        } else {
            this.f62877c.mo31352d(subscription);
            m31855h();
        }
    }

    /* renamed from: h */
    public void m31855h() {
        AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList;
        while (true) {
            synchronized (this) {
                appendOnlyLinkedArrayList = this.f62879e;
                if (appendOnlyLinkedArrayList == null) {
                    this.f62878d = false;
                    return;
                }
                this.f62879e = null;
            }
            appendOnlyLinkedArrayList.m31805a(this.f62877c);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
        if (this.f62880f) {
            return;
        }
        synchronized (this) {
            if (this.f62880f) {
                return;
            }
            this.f62880f = true;
            if (!this.f62878d) {
                this.f62878d = true;
                this.f62877c.onComplete();
                return;
            }
            AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList = this.f62879e;
            if (appendOnlyLinkedArrayList == null) {
                appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList<>(4);
                this.f62879e = appendOnlyLinkedArrayList;
            }
            appendOnlyLinkedArrayList.m31806b(NotificationLite.COMPLETE);
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(Throwable th) {
        if (this.f62880f) {
            RxJavaPlugins.m31848b(th);
            return;
        }
        synchronized (this) {
            boolean z = false;
            if (this.f62880f) {
                z = true;
            } else {
                this.f62880f = true;
                if (this.f62878d) {
                    AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList = this.f62879e;
                    if (appendOnlyLinkedArrayList == null) {
                        appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList<>(4);
                        this.f62879e = appendOnlyLinkedArrayList;
                    }
                    appendOnlyLinkedArrayList.f62782b[0] = NotificationLite.m31832e(th);
                    return;
                }
                this.f62878d = true;
            }
            if (z) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f62877c.onError(th);
            }
        }
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(T t) {
        if (this.f62880f) {
            return;
        }
        synchronized (this) {
            if (this.f62880f) {
                return;
            }
            if (!this.f62878d) {
                this.f62878d = true;
                this.f62877c.onNext(t);
                m31855h();
            } else {
                AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList = this.f62879e;
                if (appendOnlyLinkedArrayList == null) {
                    appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList<>(4);
                    this.f62879e = appendOnlyLinkedArrayList;
                }
                appendOnlyLinkedArrayList.m31806b(t);
            }
        }
    }
}
