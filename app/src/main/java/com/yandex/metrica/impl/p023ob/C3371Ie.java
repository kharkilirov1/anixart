package com.yandex.metrica.impl.p023ob;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.Ie */
/* loaded from: classes2.dex */
public final class C3371Ie extends AbstractC3232D0<C3446Le> {
    @Override // com.yandex.metrica.impl.p023ob.AbstractC3232D0
    /* renamed from: a */
    public boolean mo17945a(C3446Le c3446Le, C3446Le c3446Le2) {
        C3446Le c3446Le3 = c3446Le;
        C3446Le c3446Le4 = c3446Le2;
        if (c3446Le3.f43333c) {
            if (c3446Le4.f43333c) {
                int intValue = m17944a().m18113a(c3446Le3.f43335e).intValue();
                Integer m18113a = m17944a().m18113a(c3446Le4.f43335e);
                Intrinsics.m32178g(m18113a, "priorities[oldData.source]");
                if (Intrinsics.m32181j(intValue, m18113a.intValue()) > 0) {
                }
            }
            return true;
        }
        return false;
    }
}
