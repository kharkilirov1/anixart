package io.reactivex.subjects;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes3.dex */
final class SerializedSubject<T> extends Subject<T> implements AppendOnlyLinkedArrayList.NonThrowingPredicate<Object> {

    /* renamed from: b */
    public final Subject<T> f62965b;

    /* renamed from: c */
    public boolean f62966c;

    /* renamed from: d */
    public AppendOnlyLinkedArrayList<Object> f62967d;

    /* renamed from: e */
    public volatile boolean f62968e;

    public SerializedSubject(Subject<T> subject) {
        this.f62965b = subject;
    }

    @Override // io.reactivex.Observer
    /* renamed from: a */
    public void mo31373a(Disposable disposable) {
        boolean z = true;
        if (!this.f62968e) {
            synchronized (this) {
                if (!this.f62968e) {
                    if (this.f62966c) {
                        AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList = this.f62967d;
                        if (appendOnlyLinkedArrayList == null) {
                            appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList<>(4);
                            this.f62967d = appendOnlyLinkedArrayList;
                        }
                        appendOnlyLinkedArrayList.m31806b(NotificationLite.m31831d(disposable));
                        return;
                    }
                    this.f62966c = true;
                    z = false;
                }
            }
        }
        if (z) {
            disposable.mo31379f();
        } else {
            this.f62965b.mo31373a(disposable);
            m31868p();
        }
    }

    @Override // io.reactivex.internal.util.AppendOnlyLinkedArrayList.NonThrowingPredicate, io.reactivex.functions.Predicate
    /* renamed from: b */
    public boolean mo31407b(Object obj) {
        return NotificationLite.m31830c(obj, this.f62965b);
    }

    @Override // io.reactivex.Observable
    /* renamed from: m */
    public void mo31371m(Observer<? super T> observer) {
        this.f62965b.mo31364c(observer);
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        if (this.f62968e) {
            return;
        }
        synchronized (this) {
            if (this.f62968e) {
                return;
            }
            this.f62968e = true;
            if (!this.f62966c) {
                this.f62966c = true;
                this.f62965b.onComplete();
                return;
            }
            AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList = this.f62967d;
            if (appendOnlyLinkedArrayList == null) {
                appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList<>(4);
                this.f62967d = appendOnlyLinkedArrayList;
            }
            appendOnlyLinkedArrayList.m31806b(NotificationLite.COMPLETE);
        }
    }

    @Override // io.reactivex.Observer
    public void onError(Throwable th) {
        if (this.f62968e) {
            RxJavaPlugins.m31848b(th);
            return;
        }
        synchronized (this) {
            boolean z = false;
            if (this.f62968e) {
                z = true;
            } else {
                this.f62968e = true;
                if (this.f62966c) {
                    AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList = this.f62967d;
                    if (appendOnlyLinkedArrayList == null) {
                        appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList<>(4);
                        this.f62967d = appendOnlyLinkedArrayList;
                    }
                    appendOnlyLinkedArrayList.f62782b[0] = NotificationLite.m31832e(th);
                    return;
                }
                this.f62966c = true;
            }
            if (z) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f62965b.onError(th);
            }
        }
    }

    @Override // io.reactivex.Observer
    public void onNext(T t) {
        if (this.f62968e) {
            return;
        }
        synchronized (this) {
            if (this.f62968e) {
                return;
            }
            if (!this.f62966c) {
                this.f62966c = true;
                this.f62965b.onNext(t);
                m31868p();
            } else {
                AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList = this.f62967d;
                if (appendOnlyLinkedArrayList == null) {
                    appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList<>(4);
                    this.f62967d = appendOnlyLinkedArrayList;
                }
                appendOnlyLinkedArrayList.m31806b(t);
            }
        }
    }

    /* renamed from: p */
    public void m31868p() {
        AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList;
        while (true) {
            synchronized (this) {
                appendOnlyLinkedArrayList = this.f62967d;
                if (appendOnlyLinkedArrayList == null) {
                    this.f62966c = false;
                    return;
                }
                this.f62967d = null;
            }
            appendOnlyLinkedArrayList.m31807c(this);
        }
    }
}
