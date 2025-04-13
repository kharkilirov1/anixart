package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.yandex.metrica.impl.ob.N0 */
/* loaded from: classes2.dex */
public enum EnumC3482N0 {
    UNKNOWN(0),
    FIRST_OCCURRENCE(1),
    NON_FIRST_OCCURENCE(2);


    /* renamed from: a */
    public final int f43453a;

    EnumC3482N0(int i2) {
        this.f43453a = i2;
    }

    @NonNull
    /* renamed from: a */
    public static EnumC3482N0 m18604a(@Nullable Integer num) {
        if (num != null) {
            EnumC3482N0[] values = values();
            for (int i2 = 0; i2 < 3; i2++) {
                EnumC3482N0 enumC3482N0 = values[i2];
                if (enumC3482N0.f43453a == num.intValue()) {
                    return enumC3482N0;
                }
            }
        }
        return UNKNOWN;
    }
}
