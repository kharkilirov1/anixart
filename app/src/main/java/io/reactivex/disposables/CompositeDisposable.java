package io.reactivex.disposables;

import io.reactivex.annotations.NonNull;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableContainer;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.OpenHashSet;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class CompositeDisposable implements Disposable, DisposableContainer {

    /* renamed from: b */
    public OpenHashSet<Disposable> f59604b;

    /* renamed from: c */
    public volatile boolean f59605c;

    @Override // io.reactivex.internal.disposables.DisposableContainer
    /* renamed from: a */
    public boolean mo31392a(@NonNull Disposable disposable) {
        if (!mo31394c(disposable)) {
            return false;
        }
        disposable.mo31379f();
        return true;
    }

    @Override // io.reactivex.internal.disposables.DisposableContainer
    /* renamed from: b */
    public boolean mo31393b(@NonNull Disposable disposable) {
        Objects.requireNonNull(disposable, "disposable is null");
        if (!this.f59605c) {
            synchronized (this) {
                if (!this.f59605c) {
                    OpenHashSet<Disposable> openHashSet = this.f59604b;
                    if (openHashSet == null) {
                        openHashSet = new OpenHashSet<>();
                        this.f59604b = openHashSet;
                    }
                    openHashSet.m31838a(disposable);
                    return true;
                }
            }
        }
        disposable.mo31379f();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0049 A[Catch: all -> 0x004d, DONT_GENERATE, TryCatch #0 {, blocks: (B:7:0x000c, B:9:0x0010, B:11:0x0012, B:13:0x0016, B:18:0x0049, B:20:0x002a, B:22:0x0030, B:24:0x0035, B:26:0x003c, B:29:0x0042, B:33:0x004b), top: B:6:0x000c }] */
    @Override // io.reactivex.internal.disposables.DisposableContainer
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo31394c(@io.reactivex.annotations.NonNull io.reactivex.disposables.Disposable r8) {
        /*
            r7 = this;
            java.lang.String r0 = "disposables is null"
            java.util.Objects.requireNonNull(r8, r0)
            boolean r0 = r7.f59605c
            r1 = 0
            if (r0 == 0) goto Lb
            return r1
        Lb:
            monitor-enter(r7)
            boolean r0 = r7.f59605c     // Catch: java.lang.Throwable -> L4d
            if (r0 == 0) goto L12
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L4d
            return r1
        L12:
            io.reactivex.internal.util.OpenHashSet<io.reactivex.disposables.Disposable> r0 = r7.f59604b     // Catch: java.lang.Throwable -> L4d
            if (r0 == 0) goto L4b
            T[] r2 = r0.f62805e     // Catch: java.lang.Throwable -> L4d
            int r3 = r0.f62802b     // Catch: java.lang.Throwable -> L4d
            int r4 = r8.hashCode()     // Catch: java.lang.Throwable -> L4d
            int r4 = io.reactivex.internal.util.OpenHashSet.m31837b(r4)     // Catch: java.lang.Throwable -> L4d
            r4 = r4 & r3
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L4d
            r6 = 1
            if (r5 != 0) goto L2a
        L28:
            r8 = 0
            goto L46
        L2a:
            boolean r5 = r5.equals(r8)     // Catch: java.lang.Throwable -> L4d
            if (r5 == 0) goto L35
            r0.m31839c(r4, r2, r3)     // Catch: java.lang.Throwable -> L4d
        L33:
            r8 = 1
            goto L46
        L35:
            int r4 = r4 + r6
            r4 = r4 & r3
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L4d
            if (r5 != 0) goto L3c
            goto L28
        L3c:
            boolean r5 = r5.equals(r8)     // Catch: java.lang.Throwable -> L4d
            if (r5 == 0) goto L35
            r0.m31839c(r4, r2, r3)     // Catch: java.lang.Throwable -> L4d
            goto L33
        L46:
            if (r8 != 0) goto L49
            goto L4b
        L49:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L4d
            return r6
        L4b:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L4d
            return r1
        L4d:
            r8 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L4d
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.disposables.CompositeDisposable.mo31394c(io.reactivex.disposables.Disposable):boolean");
    }

    /* renamed from: d */
    public void m31395d(OpenHashSet<Disposable> openHashSet) {
        if (openHashSet == null) {
            return;
        }
        ArrayList arrayList = null;
        for (Disposable disposable : openHashSet.f62805e) {
            if (disposable instanceof Disposable) {
                try {
                    disposable.mo31379f();
                } catch (Throwable th) {
                    Exceptions.m31402a(th);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
                }
            }
        }
        if (arrayList != null) {
            if (arrayList.size() != 1) {
                throw new CompositeException(arrayList);
            }
            throw ExceptionHelper.m31821e((Throwable) arrayList.get(0));
        }
    }

    /* renamed from: e */
    public int m31396e() {
        if (this.f59605c) {
            return 0;
        }
        synchronized (this) {
            if (this.f59605c) {
                return 0;
            }
            OpenHashSet<Disposable> openHashSet = this.f59604b;
            return openHashSet != null ? openHashSet.f62803c : 0;
        }
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: f */
    public void mo31379f() {
        if (this.f59605c) {
            return;
        }
        synchronized (this) {
            if (this.f59605c) {
                return;
            }
            this.f59605c = true;
            OpenHashSet<Disposable> openHashSet = this.f59604b;
            this.f59604b = null;
            m31395d(openHashSet);
        }
    }

    @Override // io.reactivex.disposables.Disposable
    /* renamed from: s */
    public boolean mo31380s() {
        return this.f59605c;
    }
}
