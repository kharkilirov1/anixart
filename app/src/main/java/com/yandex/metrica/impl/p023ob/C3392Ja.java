package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C4082kg;

/* renamed from: com.yandex.metrica.impl.ob.Ja */
/* loaded from: classes2.dex */
public class C3392Ja implements InterfaceC3920ea<C3428Kl, C4082kg.u> {

    /* renamed from: a */
    @NonNull
    private final C3367Ia f43238a;

    public C3392Ja() {
        this(new C3367Ia());
    }

    @VisibleForTesting
    public C3392Ja(@NonNull C3367Ia c3367Ia) {
        this.f43238a = c3367Ia;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4082kg.u mo17818b(@NonNull C3428Kl c3428Kl) {
        C4082kg.u uVar = new C4082kg.u();
        uVar.f45785b = c3428Kl.f43285a;
        uVar.f45786c = c3428Kl.f43286b;
        uVar.f45787d = c3428Kl.f43287c;
        uVar.f45788e = c3428Kl.f43288d;
        uVar.f45793j = c3428Kl.f43289e;
        uVar.f45794k = c3428Kl.f43290f;
        uVar.f45795l = c3428Kl.f43291g;
        uVar.f45796m = c3428Kl.f43292h;
        uVar.f45798o = c3428Kl.f43293i;
        uVar.f45799p = c3428Kl.f43294j;
        uVar.f45789f = c3428Kl.f43295k;
        uVar.f45790g = c3428Kl.f43296l;
        uVar.f45791h = c3428Kl.f43297m;
        uVar.f45792i = c3428Kl.f43298n;
        uVar.f45800q = c3428Kl.f43299o;
        uVar.f45797n = this.f43238a.mo17818b(c3428Kl.f43300p);
        return uVar;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public C3428Kl mo17817a(@NonNull C4082kg.u uVar) {
        return new C3428Kl(uVar.f45785b, uVar.f45786c, uVar.f45787d, uVar.f45788e, uVar.f45793j, uVar.f45794k, uVar.f45795l, uVar.f45796m, uVar.f45798o, uVar.f45799p, uVar.f45789f, uVar.f45790g, uVar.f45791h, uVar.f45792i, uVar.f45800q, this.f43238a.mo17817a(uVar.f45797n));
    }
}
