package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.yandex.metrica.impl.ob.mn */
/* loaded from: classes2.dex */
public enum EnumC4141mn {
    NONE(0),
    EXTERNALLY_ENCRYPTED_EVENT_CRYPTER(1),
    AES_VALUE_ENCRYPTION(2);


    /* renamed from: a */
    private final int f45963a;

    EnumC4141mn(int i2) {
        this.f45963a = i2;
    }

    /* renamed from: a */
    public int m20405a() {
        return this.f45963a;
    }

    @NonNull
    /* renamed from: a */
    public static EnumC4141mn m20404a(@Nullable Integer num) {
        if (num != null) {
            EnumC4141mn[] values = values();
            for (int i2 = 0; i2 < 3; i2++) {
                EnumC4141mn enumC4141mn = values[i2];
                if (enumC4141mn.f45963a == num.intValue()) {
                    return enumC4141mn;
                }
            }
        }
        return NONE;
    }
}
