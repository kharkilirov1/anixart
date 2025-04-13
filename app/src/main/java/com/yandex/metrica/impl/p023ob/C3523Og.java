package com.yandex.metrica.impl.p023ob;

import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.metrica.impl.ob.Og */
/* loaded from: classes2.dex */
public final class C3523Og {

    /* renamed from: a */
    private final Lazy f43564a = LazyKt.m31881b(new c());

    /* renamed from: b */
    private final Lazy f43565b = LazyKt.m31881b(new b());

    /* renamed from: c */
    private final Lazy f43566c = LazyKt.m31881b(new d());

    /* renamed from: d */
    private final List<C3298Fg> f43567d = new ArrayList();

    /* renamed from: e */
    private final C3672Ug f43568e;

    /* renamed from: f */
    private final C3772Yg f43569f;

    /* renamed from: g */
    private final C3373Ig f43570g;

    /* renamed from: h */
    private final C3797Zg f43571h;

    /* renamed from: com.yandex.metrica.impl.ob.Og$a */
    public interface a {
        @WorkerThread
        /* renamed from: a */
        void mo18678a();
    }

    /* renamed from: com.yandex.metrica.impl.ob.Og$b */
    public static final class b extends Lambda implements Function0<C3548Pg> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public C3548Pg invoke() {
            return new C3548Pg(this);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Og$c */
    public static final class c extends Lambda implements Function0<C3573Qg> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public C3573Qg invoke() {
            return new C3573Qg(this);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Og$d */
    public static final class d extends Lambda implements Function0<C3597Rg> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public C3597Rg invoke() {
            return new C3597Rg(this);
        }
    }

    @VisibleForTesting
    public C3523Og(@NotNull C3672Ug c3672Ug, @NotNull C3772Yg c3772Yg, @NotNull C3373Ig c3373Ig, @NotNull C3797Zg c3797Zg) {
        this.f43568e = c3672Ug;
        this.f43569f = c3772Yg;
        this.f43570g = c3373Ig;
        this.f43571h = c3797Zg;
    }

    /* renamed from: b */
    public static final a m18674b(C3523Og c3523Og) {
        return (a) c3523Og.f43565b.getValue();
    }

    /* renamed from: c */
    public static final a m18675c(C3523Og c3523Og) {
        return (a) c3523Og.f43564a.getValue();
    }

    /* renamed from: a */
    public static final void m18673a(C3523Og c3523Og, C3298Fg c3298Fg, a aVar) {
        c3523Og.f43567d.add(c3298Fg);
        if (c3523Og.f43571h.m19521a(c3298Fg)) {
            c3523Og.f43568e.m19246a(c3298Fg);
        } else {
            aVar.mo18678a();
        }
    }

    /* renamed from: b */
    public final void m18677b() {
        this.f43569f.m19479a((InterfaceC3747Xg) this.f43566c.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final void m18671a() {
        List<C3298Fg> list = this.f43567d;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (this.f43571h.m19522b((C3298Fg) obj)) {
                arrayList.add(obj);
            }
        }
        this.f43568e.m19246a(this.f43571h.m19520a(CollectionsKt.m32042s(arrayList)));
    }
}
