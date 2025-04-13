package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.List;
import java.util.Objects;

/* renamed from: com.yandex.metrica.impl.ob.yh */
/* loaded from: classes2.dex */
public class C4447yh {

    /* renamed from: a */
    @NonNull
    private C3566Q9 f47024a;

    /* renamed from: b */
    @NonNull
    private C3274Eh f47025b;

    /* renamed from: c */
    @NonNull
    private C3504Nm f47026c;

    /* renamed from: d */
    @NonNull
    private C3324Gh f47027d;

    /* renamed from: e */
    @NonNull
    private a f47028e;

    /* renamed from: com.yandex.metrica.impl.ob.yh$a */
    public interface a {
    }

    public C4447yh(@NonNull C3566Q9 c3566q9, @NonNull a aVar) {
        this(c3566q9, aVar, new C3504Nm(), new C3324Gh(c3566q9));
    }

    /* renamed from: a */
    public void m21229a(@NonNull C3274Eh c3274Eh) {
        this.f47024a.m18781a(c3274Eh);
        this.f47025b = c3274Eh;
        this.f47027d.m18171a();
        C3199Bh c3199Bh = (C3199Bh) this.f47028e;
        c3199Bh.f42628a.m17978b();
        c3199Bh.f42628a.f42732h = false;
    }

    @VisibleForTesting
    public C4447yh(@NonNull C3566Q9 c3566q9, @NonNull a aVar, @NonNull C3504Nm c3504Nm, @NonNull C3324Gh c3324Gh) {
        this.f47024a = c3566q9;
        this.f47025b = (C3274Eh) c3566q9.m18782b();
        this.f47026c = c3504Nm;
        this.f47027d = c3324Gh;
        this.f47028e = aVar;
    }

    /* renamed from: a */
    public void m21228a() {
        C3274Eh c3274Eh = this.f47025b;
        List<C3349Hh> list = c3274Eh.f42810a;
        String str = c3274Eh.f42811b;
        Objects.requireNonNull(this.f47026c);
        C3274Eh c3274Eh2 = new C3274Eh(list, str, System.currentTimeMillis(), true, true);
        this.f47024a.m18781a(c3274Eh2);
        this.f47025b = c3274Eh2;
        C3199Bh c3199Bh = (C3199Bh) this.f47028e;
        c3199Bh.f42628a.m17978b();
        c3199Bh.f42628a.f42732h = false;
    }
}
