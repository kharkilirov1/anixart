package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;

/* renamed from: com.yandex.metrica.impl.ob.I0 */
/* loaded from: classes2.dex */
public enum EnumC3357I0 {
    NATIVE(0),
    JS(1);


    /* renamed from: a */
    public final int f43080a;

    EnumC3357I0(int i2) {
        this.f43080a = i2;
    }

    @NonNull
    /* renamed from: a */
    public static EnumC3357I0 m18242a(int i2) {
        EnumC3357I0[] values = values();
        for (int i3 = 0; i3 < 2; i3++) {
            EnumC3357I0 enumC3357I0 = values[i3];
            if (enumC3357I0.f43080a == i2) {
                return enumC3357I0;
            }
        }
        return NATIVE;
    }
}
