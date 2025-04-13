package io.reactivex.observers;

import io.reactivex.Observer;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;

/* loaded from: classes3.dex */
public final class SerializedObserver<T> implements Observer<T>, Disposable {

    /* renamed from: b */
    public final Observer<? super T> f62829b;

    /* renamed from: c */
    public final boolean f62830c = false;

    /* renamed from: d */
    public Disposable f62831d;

    /* renamed from: e */
    public boolean f62832e;

    /* renamed from: f */
    public AppendOnlyLinkedArrayList<Object> f62833f;

    /* renamed from: g */
    public volatile boolean f62834g;

    public SerializedObserver(@NonNull Observer<? super T> observer) {
        this.f62829b = observer;
    }

    @Override // io.reactivex.Observer
    /* renamed from: a */
    public void mo31373a(@NonNull Disposable disposable) {
        if (DisposableHelper.m31414h(this.f62831d, disposable)) {
            this.f62831d = disposable;
            this.f62829b.mo31373a(this);
        }
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: f */
    public void mo31379f() {
        this.f62831d.mo31379f();
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        if (this.f62834g) {
            return;
        }
        synchronized (this) {
            if (this.f62834g) {
                return;
            }
            if (!this.f62832e) {
                this.f62834g = true;
                this.f62832e = true;
                this.f62829b.onComplete();
            } else {
                AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList = this.f62833f;
                if (appendOnlyLinkedArrayList == null) {
                    appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList<>(4);
                    this.f62833f = appendOnlyLinkedArrayList;
                }
                appendOnlyLinkedArrayList.m31806b(NotificationLite.COMPLETE);
            }
        }
    }

    @Override // io.reactivex.Observer
    public void onError(@NonNull Throwable th) {
        if (this.f62834g) {
            RxJavaPlugins.m31848b(th);
            return;
        }
        synchronized (this) {
            boolean z = false;
            if (this.f62834g) {
                z = true;
            } else {
                if (this.f62832e) {
                    this.f62834g = true;
                    AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList = this.f62833f;
                    if (appendOnlyLinkedArrayList == null) {
                        appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList<>(4);
                        this.f62833f = appendOnlyLinkedArrayList;
                    }
                    Object m31832e = NotificationLite.m31832e(th);
                    if (this.f62830c) {
                        appendOnlyLinkedArrayList.m31806b(m31832e);
                    } else {
                        appendOnlyLinkedArrayList.f62782b[0] = m31832e;
                    }
                    return;
                }
                this.f62834g = true;
                this.f62832e = true;
            }
            if (z) {
                RxJavaPlugins.m31848b(th);
            } else {
                this.f62829b.onError(th);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0065, code lost:
    
        continue;
     */
    @Override // io.reactivex.Observer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onNext(@io.reactivex.annotations.NonNull T r7) {
        /*
            r6 = this;
            boolean r0 = r6.f62834g
            if (r0 == 0) goto L5
            return
        L5:
            if (r7 != 0) goto L17
            io.reactivex.disposables.Disposable r7 = r6.f62831d
            r7.mo31379f()
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r0 = "onNext called with null. Null values are generally not allowed in 2.x operators and sources."
            r7.<init>(r0)
            r6.onError(r7)
            return
        L17:
            monitor-enter(r6)
            boolean r0 = r6.f62834g     // Catch: java.lang.Throwable -> L70
            if (r0 == 0) goto L1e
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L70
            return
        L1e:
            boolean r0 = r6.f62832e     // Catch: java.lang.Throwable -> L70
            if (r0 == 0) goto L33
            io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> r0 = r6.f62833f     // Catch: java.lang.Throwable -> L70
            if (r0 != 0) goto L2e
            io.reactivex.internal.util.AppendOnlyLinkedArrayList r0 = new io.reactivex.internal.util.AppendOnlyLinkedArrayList     // Catch: java.lang.Throwable -> L70
            r1 = 4
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L70
            r6.f62833f = r0     // Catch: java.lang.Throwable -> L70
        L2e:
            r0.m31806b(r7)     // Catch: java.lang.Throwable -> L70
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L70
            return
        L33:
            r0 = 1
            r6.f62832e = r0     // Catch: java.lang.Throwable -> L70
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L70
            io.reactivex.Observer<? super T> r1 = r6.f62829b
            r1.onNext(r7)
        L3c:
            monitor-enter(r6)
            io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> r7 = r6.f62833f     // Catch: java.lang.Throwable -> L6d
            r1 = 0
            if (r7 != 0) goto L46
            r6.f62832e = r1     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6d
            goto L6c
        L46:
            r2 = 0
            r6.f62833f = r2     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6d
            io.reactivex.Observer<? super T> r2 = r6.f62829b
            java.lang.Object[] r3 = r7.f62782b
            int r7 = r7.f62781a
        L50:
            if (r3 == 0) goto L6a
            r4 = 0
        L53:
            if (r4 >= r7) goto L65
            r5 = r3[r4]
            if (r5 != 0) goto L5a
            goto L65
        L5a:
            boolean r5 = io.reactivex.internal.util.NotificationLite.m31830c(r5, r2)
            if (r5 == 0) goto L62
            r1 = 1
            goto L6a
        L62:
            int r4 = r4 + 1
            goto L53
        L65:
            r3 = r3[r7]
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            goto L50
        L6a:
            if (r1 == 0) goto L3c
        L6c:
            return
        L6d:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L6d
            throw r7
        L70:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L70
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.observers.SerializedObserver.onNext(java.lang.Object):void");
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: s */
    public boolean mo31380s() {
        return this.f62831d.mo31380s();
    }
}
