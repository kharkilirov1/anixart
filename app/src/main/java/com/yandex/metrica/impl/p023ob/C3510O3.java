package com.yandex.metrica.impl.p023ob;

import com.yandex.metrica.impl.p023ob.C3535P3;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.O3 */
/* loaded from: classes2.dex */
public final class C3510O3 implements InterfaceC3936f0<Map<String, ? extends String>> {
    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3936f0, kotlin.jvm.functions.Function1
    public Boolean invoke(Object obj) {
        C3532P0 m18696i = C3532P0.m18696i();
        Intrinsics.m32178g(m18696i, "GlobalServiceLocator.getInstance()");
        return Boolean.valueOf(m18696i.m18703e().m17847b(new C3535P3.a((Map) obj, EnumC3257E0.RETAIL)));
    }
}
