package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C4082kg;

/* renamed from: com.yandex.metrica.impl.ob.Ka */
/* loaded from: classes2.dex */
public class C3417Ka implements InterfaceC3920ea<C3854bm, C4082kg.v> {

    /* renamed from: a */
    @NonNull
    private final C3367Ia f43273a;

    public C3417Ka() {
        this(new C3367Ia());
    }

    @VisibleForTesting
    public C3417Ka(@NonNull C3367Ia c3367Ia) {
        this.f43273a = c3367Ia;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4082kg.v mo17818b(@NonNull C3854bm c3854bm) {
        C4082kg.v vVar = new C4082kg.v();
        vVar.f45801b = c3854bm.f44841a;
        vVar.f45802c = c3854bm.f44842b;
        vVar.f45803d = c3854bm.f44843c;
        vVar.f45804e = c3854bm.f44844d;
        vVar.f45805f = c3854bm.f44845e;
        vVar.f45806g = c3854bm.f44846f;
        vVar.f45807h = c3854bm.f44847g;
        vVar.f45808i = this.f43273a.mo17818b(c3854bm.f44848h);
        return vVar;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public C3854bm mo17817a(@NonNull C4082kg.v vVar) {
        return new C3854bm(vVar.f45801b, vVar.f45802c, vVar.f45803d, vVar.f45804e, vVar.f45805f, vVar.f45806g, vVar.f45807h, this.f43273a.mo17817a(vVar.f45808i));
    }
}
