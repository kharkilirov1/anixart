package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.Ug */
/* loaded from: classes2.dex */
public class C3672Ug {

    /* renamed from: a */
    private final Set<C3697Vg> f44173a;

    /* renamed from: b */
    @Nullable
    private C3298Fg f44174b;

    /* renamed from: c */
    private boolean f44175c;

    /* renamed from: d */
    @NonNull
    private final C3340H8 f44176d;

    /* renamed from: e */
    @NonNull
    private final Context f44177e;

    /* renamed from: com.yandex.metrica.impl.ob.Ug$a */
    public interface a {
        /* renamed from: a */
        void mo19249a(@Nullable C3298Fg c3298Fg);
    }

    @WorkerThread
    public C3672Ug(@NonNull Context context) {
        this(context, C3532P0.m18696i().m18722y().m18440a());
    }

    /* renamed from: a */
    public synchronized void m19246a(@Nullable C3298Fg c3298Fg) {
        this.f44174b = c3298Fg;
        this.f44175c = true;
        this.f44176d.m18204a(c3298Fg);
        this.f44176d.m18207a(true);
        C3298Fg c3298Fg2 = this.f44174b;
        synchronized (this) {
            Iterator<C3697Vg> it = this.f44173a.iterator();
            while (it.hasNext()) {
                it.next().m19294a(c3298Fg2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public void m19248b() {
        if (this.f44175c) {
            return;
        }
        Context context = this.f44177e;
        C3532P0 m18696i = C3532P0.m18696i();
        Intrinsics.m32178g(m18696i, "GlobalServiceLocator.getInstance()");
        C4479zn m18716s = m18696i.m18716s();
        Intrinsics.m32178g(m18716s, "GlobalServiceLocator.get…).serviceExecutorProvider");
        new C3523Og(this, new C3772Yg(context, m18716s.m21316b()), new C3373Ig(context), new C3797Zg(context, null, 0 == true ? 1 : 0, 6)).m18677b();
    }

    @VisibleForTesting
    public C3672Ug(@NonNull Context context, @NonNull C3340H8 c3340h8) {
        this.f44173a = new HashSet();
        this.f44177e = context;
        this.f44176d = c3340h8;
        this.f44174b = c3340h8.m18213g();
        this.f44175c = c3340h8.m18214h();
    }

    @Nullable
    /* renamed from: a */
    public C3298Fg m19245a() {
        return this.f44174b;
    }

    /* renamed from: a */
    public synchronized void m19247a(@NonNull C3697Vg c3697Vg) {
        this.f44173a.add(c3697Vg);
        if (this.f44175c) {
            c3697Vg.m19294a(this.f44174b);
        }
    }
}
