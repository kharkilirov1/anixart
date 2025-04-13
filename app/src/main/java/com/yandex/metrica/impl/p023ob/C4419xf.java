package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.p023ob.C3822ag;

/* renamed from: com.yandex.metrica.impl.ob.xf */
/* loaded from: classes2.dex */
public class C4419xf implements InterfaceC4211pf {

    /* renamed from: a */
    @NonNull
    private final C3330Gn f46942a;

    public C4419xf(@NonNull C3330Gn c3330Gn) {
        this.f46942a = c3330Gn;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4211pf
    @Nullable
    /* renamed from: a */
    public C3822ag.a mo17967a(@NonNull C3322Gf c3322Gf, @NonNull C3822ag.a aVar) {
        if (c3322Gf.m18166a() == this.f46942a.m18182a()) {
            if (c3322Gf.m18167a(aVar.f44747c, new String(aVar.f44746b)) != null) {
                c3322Gf.m18168a(aVar);
            }
        } else if (c3322Gf.m18166a() < this.f46942a.m18182a()) {
            c3322Gf.m18168a(aVar);
            c3322Gf.m18169b();
        }
        return aVar;
    }
}
