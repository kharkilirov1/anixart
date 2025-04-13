package com.yandex.metrica.impl.p023ob;

import com.yandex.metrica.impl.p023ob.C3535P3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.metrica.impl.ob.Q3 */
/* loaded from: classes2.dex */
public final class C3560Q3 extends AbstractC3232D0<C3535P3.a> {
    @Override // com.yandex.metrica.impl.p023ob.AbstractC3232D0
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public boolean mo17945a(@NotNull C3535P3.a aVar, @NotNull C3535P3.a aVar2) {
        if (!C3658U2.m19218b(aVar2.m18729b())) {
            if (C3658U2.m19218b(aVar.m18729b())) {
                return false;
            }
            if (aVar.mo18022a() == EnumC3257E0.APP) {
                int intValue = m17944a().m18113a(aVar.mo18022a()).intValue();
                Integer m18113a = m17944a().m18113a(aVar2.mo18022a());
                Intrinsics.m32178g(m18113a, "priorities[oldData.source]");
                if (Intrinsics.m32181j(intValue, m18113a.intValue()) < 0) {
                    return false;
                }
            } else {
                int intValue2 = m17944a().m18113a(aVar.mo18022a()).intValue();
                Integer m18113a2 = m17944a().m18113a(aVar2.mo18022a());
                Intrinsics.m32178g(m18113a2, "priorities[oldData.source]");
                if (Intrinsics.m32181j(intValue2, m18113a2.intValue()) <= 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
