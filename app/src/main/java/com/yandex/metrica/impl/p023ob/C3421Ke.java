package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;

/* renamed from: com.yandex.metrica.impl.ob.Ke */
/* loaded from: classes2.dex */
public class C3421Ke implements InterfaceC3920ea<EnumC3257E0, Integer> {
    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer mo17818b(@NonNull EnumC3257E0 enumC3257E0) {
        int ordinal = enumC3257E0.ordinal();
        if (ordinal == 1) {
            return 1;
        }
        if (ordinal != 2) {
            return ordinal != 3 ? 0 : 2;
        }
        return 3;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public EnumC3257E0 mo17817a(@NonNull Integer num) {
        int intValue = num.intValue();
        if (intValue == 1) {
            return EnumC3257E0.APP;
        }
        if (intValue == 2) {
            return EnumC3257E0.RETAIL;
        }
        if (intValue != 3) {
            return EnumC3257E0.UNDEFINED;
        }
        return EnumC3257E0.SATELLITE;
    }
}
