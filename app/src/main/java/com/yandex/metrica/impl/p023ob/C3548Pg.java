package com.yandex.metrica.impl.p023ob;

import androidx.annotation.WorkerThread;
import com.yandex.metrica.impl.p023ob.C3523Og;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.metrica.impl.ob.Pg */
/* loaded from: classes2.dex */
public final class C3548Pg implements C3523Og.a {

    /* renamed from: a */
    public final /* synthetic */ C3523Og.b f43654a;

    /* renamed from: com.yandex.metrica.impl.ob.Pg$a */
    public static final class a implements InterfaceC3747Xg {
        public a() {
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3747Xg
        @WorkerThread
        /* renamed from: a */
        public void mo18757a(@Nullable C3298Fg c3298Fg) {
            C3523Og c3523Og = C3523Og.this;
            C3523Og.m18673a(c3523Og, c3298Fg, C3523Og.m18675c(c3523Og));
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3747Xg
        @WorkerThread
        /* renamed from: a */
        public void mo18758a(@NotNull Throwable th) {
            C3523Og c3523Og = C3523Og.this;
            C3523Og.m18673a(c3523Og, null, C3523Og.m18675c(c3523Og));
        }
    }

    public C3548Pg(C3523Og.b bVar) {
        this.f43654a = bVar;
    }

    @Override // com.yandex.metrica.impl.p023ob.C3523Og.a
    @WorkerThread
    /* renamed from: a */
    public void mo18678a() {
        C3373Ig c3373Ig;
        c3373Ig = C3523Og.this.f43570g;
        c3373Ig.m18317a(new a());
    }
}
