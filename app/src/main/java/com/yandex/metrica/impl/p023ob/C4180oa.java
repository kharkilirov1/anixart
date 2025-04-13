package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C4082kg;

/* renamed from: com.yandex.metrica.impl.ob.oa */
/* loaded from: classes2.dex */
public class C4180oa implements InterfaceC3920ea {

    /* renamed from: a */
    @NonNull
    private final C4154na f46064a;

    public C4180oa() {
        this(new C4154na());
    }

    @VisibleForTesting
    public C4180oa(@NonNull C4154na c4154na) {
        this.f46064a = c4154na;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4082kg.k.a.b mo17818b(@NonNull C3394Jc c3394Jc) {
        C4082kg.k.a.b bVar = new C4082kg.k.a.b();
        C4443yd c4443yd = c3394Jc.f43242a;
        bVar.f45742b = c4443yd.f46999a;
        bVar.f45743c = c4443yd.f47000b;
        C3344Hc c3344Hc = c3394Jc.f43243b;
        if (c3344Hc != null) {
            bVar.f45744d = this.f46064a.mo17818b(c3344Hc);
        }
        return bVar;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3394Jc mo17817a(@NonNull C4082kg.k.a.b bVar) {
        C4082kg.k.a.b.C7006a c7006a = bVar.f45744d;
        return new C3394Jc(new C4443yd(bVar.f45742b, bVar.f45743c), c7006a != null ? this.f46064a.mo17817a(c7006a) : null);
    }
}
