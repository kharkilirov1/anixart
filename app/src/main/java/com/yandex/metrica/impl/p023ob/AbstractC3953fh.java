package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C3901dh;
import com.yandex.metrica.impl.p023ob.C3901dh.d;
import com.yandex.metrica.impl.p023ob.C4197p1;
import com.yandex.metrica.impl.p023ob.InterfaceC3875ch;

/* renamed from: com.yandex.metrica.impl.ob.fh */
/* loaded from: classes2.dex */
public abstract class AbstractC3953fh<T extends C3901dh, IA, A extends InterfaceC3875ch<IA, A>, L extends C3901dh.d<T, C3901dh.c<A>>> implements C4197p1.a {

    /* renamed from: a */
    @Nullable
    private T f45135a;

    /* renamed from: b */
    @NonNull
    private L f45136b;

    /* renamed from: c */
    @NonNull
    private C3901dh.c<A> f45137c;

    public AbstractC3953fh(@NonNull L l2, @NonNull C3575Qi c3575Qi, @NonNull A a2) {
        this.f45136b = l2;
        C4197p1.m20517a(C3532P0.m18696i().m18704f()).m20520a(this);
        m19908a((C3901dh.c) new C3901dh.c<>(c3575Qi, a2));
    }

    @Override // com.yandex.metrica.impl.p023ob.C4197p1.a
    /* renamed from: a */
    public void mo19906a() {
        synchronized (this) {
            this.f45135a = null;
        }
    }

    @NonNull
    /* renamed from: b */
    public synchronized T m19910b() {
        if (this.f45135a == null) {
            this.f45135a = (T) this.f45136b.mo18753a(this.f45137c);
        }
        return this.f45135a;
    }

    @NonNull
    @VisibleForTesting
    /* renamed from: c */
    public synchronized A m19911c() {
        return this.f45137c.f44969b;
    }

    @NonNull
    /* renamed from: d */
    public synchronized C3575Qi m19912d() {
        return this.f45137c.f44968a;
    }

    /* renamed from: e */
    public synchronized void m19913e() {
        this.f45135a = null;
    }

    /* renamed from: a */
    public synchronized void m19908a(@NonNull C3901dh.c<A> cVar) {
        this.f45137c = cVar;
    }

    /* renamed from: a */
    public synchronized void m19909a(@NonNull IA ia) {
        if (!this.f45137c.f44969b.mo19382b(ia)) {
            synchronized (this) {
                C3901dh.c<A> cVar = this.f45137c;
                C3901dh.c<A> cVar2 = new C3901dh.c<>(cVar.f44968a, cVar.f44969b.mo19381a(ia));
                synchronized (this) {
                    this.f45137c = cVar2;
                }
            }
            synchronized (this) {
                this.f45135a = null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void m19907a(@androidx.annotation.NonNull com.yandex.metrica.impl.p023ob.C3575Qi r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.yandex.metrica.impl.ob.dh$c r0 = new com.yandex.metrica.impl.ob.dh$c     // Catch: java.lang.Throwable -> L22
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L22
            com.yandex.metrica.impl.ob.dh$c<A extends com.yandex.metrica.impl.ob.ch<IA, A>> r1 = r2.f45137c     // Catch: java.lang.Throwable -> L1f
            A r1 = r1.f44969b     // Catch: java.lang.Throwable -> L1f
            com.yandex.metrica.impl.ob.ch r1 = (com.yandex.metrica.impl.p023ob.InterfaceC3875ch) r1     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L22
            r0.<init>(r3, r1)     // Catch: java.lang.Throwable -> L22
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L22
            r2.f45137c = r0     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L22
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L22
            r3 = 0
            r2.f45135a = r3     // Catch: java.lang.Throwable -> L19
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L22
            monitor-exit(r2)
            return
        L19:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L22
            throw r3     // Catch: java.lang.Throwable -> L22
        L1c:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L22
            throw r3     // Catch: java.lang.Throwable -> L22
        L1f:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L22
            throw r3     // Catch: java.lang.Throwable -> L22
        L22:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p023ob.AbstractC3953fh.m19907a(com.yandex.metrica.impl.ob.Qi):void");
    }
}
