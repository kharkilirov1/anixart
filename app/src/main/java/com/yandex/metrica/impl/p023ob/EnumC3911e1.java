package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.yandex.metrica.impl.ob.e1 */
/* loaded from: classes2.dex */
public enum EnumC3911e1 {
    OK("OK"),
    IDENTIFIER_PROVIDER_UNAVAILABLE("IDENTIFIER_PROVIDER_UNAVAILABLE"),
    INVALID_ADV_ID("INVALID_ADV_ID"),
    NO_STARTUP("NO_STARTUP"),
    FEATURE_DISABLED("FEATURE_DISABLED"),
    UNKNOWN("UNKNOWN");


    /* renamed from: a */
    private final String f44984a;

    EnumC3911e1(String str) {
        this.f44984a = str;
    }

    /* renamed from: a */
    public String m19779a() {
        return this.f44984a;
    }

    @NonNull
    /* renamed from: a */
    public static EnumC3911e1 m19778a(@Nullable String str) {
        EnumC3911e1[] values = values();
        for (int i2 = 0; i2 < 6; i2++) {
            EnumC3911e1 enumC3911e1 = values[i2];
            if (enumC3911e1.f44984a.equals(str)) {
                return enumC3911e1;
            }
        }
        return UNKNOWN;
    }
}
