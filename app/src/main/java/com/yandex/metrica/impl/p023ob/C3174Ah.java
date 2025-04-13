package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.p023ob.C3570Qd;
import com.yandex.metrica.impl.p023ob.C4473zh;
import java.util.List;
import java.util.Objects;

/* renamed from: com.yandex.metrica.impl.ob.Ah */
/* loaded from: classes2.dex */
class C3174Ah implements C3570Qd.a {

    /* renamed from: a */
    public final /* synthetic */ C3274Eh f42559a;

    /* renamed from: b */
    public final /* synthetic */ C4447yh f42560b;

    /* renamed from: c */
    public final /* synthetic */ C4473zh f42561c;

    public C3174Ah(C4473zh c4473zh, C3274Eh c3274Eh, C4447yh c4447yh) {
        this.f42561c = c4473zh;
        this.f42559a = c3274Eh;
        this.f42560b = c4447yh;
    }

    @Override // com.yandex.metrica.impl.p023ob.C3570Qd.a
    /* renamed from: a */
    public void mo17835a(@NonNull String str, @NonNull byte[] bArr) {
        C4473zh.b bVar;
        C3842ba c3842ba;
        C3504Nm c3504Nm;
        bVar = this.f42561c.f47122c;
        c3842ba = this.f42561c.f47123d;
        List<C3349Hh> m21305a = bVar.m21305a(c3842ba.m19648a(bArr, "af9202nao18gswqp"));
        C4447yh c4447yh = this.f42560b;
        c3504Nm = this.f42561c.f47125f;
        Objects.requireNonNull(c3504Nm);
        c4447yh.m21229a(new C3274Eh(m21305a, str, System.currentTimeMillis(), true, false));
    }

    @Override // com.yandex.metrica.impl.p023ob.C3570Qd.a
    @Nullable
    /* renamed from: b */
    public String mo17836b() {
        return this.f42559a.f42811b;
    }

    @Override // com.yandex.metrica.impl.p023ob.C3570Qd.a
    /* renamed from: c */
    public void mo17837c() {
        this.f42560b.m21228a();
    }

    @Override // com.yandex.metrica.impl.p023ob.C3570Qd.a
    /* renamed from: a */
    public void mo17834a() {
        C3504Nm c3504Nm;
        C4447yh c4447yh = this.f42560b;
        C3274Eh c3274Eh = this.f42559a;
        List<C3349Hh> list = c3274Eh.f42810a;
        String str = c3274Eh.f42811b;
        c3504Nm = this.f42561c.f47125f;
        Objects.requireNonNull(c3504Nm);
        c4447yh.m21229a(new C3274Eh(list, str, System.currentTimeMillis(), true, false));
    }
}
