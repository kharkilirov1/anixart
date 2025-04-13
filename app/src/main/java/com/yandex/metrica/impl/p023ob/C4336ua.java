package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C4082kg;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.ua */
/* loaded from: classes2.dex */
public class C4336ua implements InterfaceC3920ea {

    /* renamed from: a */
    @NonNull
    private final C4232qa f46595a;

    public C4336ua() {
        this(new C4232qa());
    }

    @VisibleForTesting
    public C4336ua(@NonNull C4232qa c4232qa) {
        this.f46595a = c4232qa;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4082kg.y mo17818b(@NonNull C3270Ed c3270Ed) {
        C4082kg.y yVar = new C4082kg.y();
        yVar.f45814b = c3270Ed.f42806a;
        yVar.f45815c = c3270Ed.f42807b;
        List<C3494Nc> list = c3270Ed.f42808c;
        yVar.f45816d = list == null ? new C4082kg.y.a[0] : this.f46595a.mo17818b(list);
        return yVar;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3270Ed mo17817a(@NonNull C4082kg.y yVar) {
        return new C3270Ed(yVar.f45814b, yVar.f45815c, C3658U2.m19215a((Object[]) yVar.f45816d) ? null : this.f46595a.mo17817a(yVar.f45816d));
    }
}
