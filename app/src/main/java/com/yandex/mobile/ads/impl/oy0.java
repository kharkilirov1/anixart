package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class oy0 {
    @Nullable
    /* renamed from: a */
    public static Object m27130a(@NonNull Class cls, @Nullable Object obj) {
        try {
            if (cls.isInstance(obj)) {
                return cls.cast(obj);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
