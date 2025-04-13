package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.p1 */
/* loaded from: classes3.dex */
final class C5562p1 {
    @NonNull
    /* renamed from: a */
    public static EnumC5778t1 m27139a(@Nullable String str) {
        EnumC5778t1 enumC5778t1 = EnumC5778t1.f54920d;
        if (str == null) {
            return enumC5778t1;
        }
        switch (str) {
            case "preroll":
                return EnumC5778t1.f54917a;
            case "postroll":
                return EnumC5778t1.f54919c;
            case "midroll":
                return EnumC5778t1.f54918b;
            default:
                return enumC5778t1;
        }
    }
}
