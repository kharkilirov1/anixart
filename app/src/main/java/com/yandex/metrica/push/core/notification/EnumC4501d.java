package com.yandex.metrica.push.core.notification;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.yandex.metrica.push.core.notification.d */
/* loaded from: classes2.dex */
public enum EnumC4501d {
    CLEAR("clear"),
    CLICK("click"),
    ADDITIONAL_ACTION("additional"),
    INLINE_ACTION("inline");


    /* renamed from: a */
    @NonNull
    private final String f47257a;

    EnumC4501d(String str) {
        this.f47257a = str;
    }

    @Nullable
    /* renamed from: a */
    public static EnumC4501d m21395a(@Nullable String str) {
        for (EnumC4501d enumC4501d : (EnumC4501d[]) values().clone()) {
            if (enumC4501d.f47257a.equals(str)) {
                return enumC4501d;
            }
        }
        return null;
    }

    @NonNull
    /* renamed from: a */
    public String m21396a() {
        return this.f47257a;
    }
}
