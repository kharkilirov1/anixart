package com.yandex.metrica.impl.p023ob;

import com.yandex.metrica.impl.p023ob.C4082kg;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.metrica.impl.ob.ja */
/* loaded from: classes2.dex */
public final class C4050ja implements InterfaceC3920ea<C4344ui, C4082kg.h> {
    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4082kg.h mo17818b(@NotNull C4344ui c4344ui) {
        C4082kg.h hVar = new C4082kg.h();
        hVar.f45686b = c4344ui.m20894c();
        hVar.f45687c = c4344ui.m20893b();
        hVar.f45688d = c4344ui.m20892a();
        hVar.f45690f = c4344ui.m20896e();
        hVar.f45689e = c4344ui.m20895d();
        return hVar;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NotNull
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public C4344ui mo17817a(@NotNull C4082kg.h hVar) {
        String str = hVar.f45686b;
        Intrinsics.m32178g(str, "nano.url");
        return new C4344ui(str, hVar.f45687c, hVar.f45688d, hVar.f45689e, hVar.f45690f);
    }
}
