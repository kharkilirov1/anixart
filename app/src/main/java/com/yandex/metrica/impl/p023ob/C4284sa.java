package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C4082kg;

/* renamed from: com.yandex.metrica.impl.ob.sa */
/* loaded from: classes2.dex */
public class C4284sa implements InterfaceC3920ea {

    /* renamed from: a */
    @NonNull
    private final C4258ra f46356a;

    /* renamed from: b */
    @NonNull
    private final C4310ta f46357b;

    public C4284sa() {
        this(new C4258ra(), new C4310ta());
    }

    @VisibleForTesting
    public C4284sa(@NonNull C4258ra c4258ra, @NonNull C4310ta c4310ta) {
        this.f46356a = c4258ra;
        this.f46357b = c4310ta;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4082kg.k mo17818b(@NonNull C3718Wc c3718Wc) {
        C4082kg.k kVar = new C4082kg.k();
        kVar.f45718b = this.f46356a.mo17818b(c3718Wc.f44376a);
        kVar.f45719c = this.f46357b.mo17818b(c3718Wc.f44377b);
        return kVar;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3718Wc mo17817a(@NonNull C4082kg.k kVar) {
        C4258ra c4258ra = this.f46356a;
        C4082kg.k.a aVar = kVar.f45718b;
        C4082kg.k.a aVar2 = new C4082kg.k.a();
        if (aVar == null) {
            aVar = aVar2;
        }
        C3668Uc mo17817a = c4258ra.mo17817a(aVar);
        C4310ta c4310ta = this.f46357b;
        C4082kg.k.b bVar = kVar.f45719c;
        C4082kg.k.b bVar2 = new C4082kg.k.b();
        if (bVar == null) {
            bVar = bVar2;
        }
        return new C3718Wc(mo17817a, c4310ta.mo17817a(bVar));
    }
}
