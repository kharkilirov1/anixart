package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
final class l41 implements InterfaceC6019xa<String> {
    @Override // com.yandex.mobile.ads.impl.InterfaceC6019xa
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo26351a(@NonNull String str) {
        return a2(str);
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    public static boolean a2(@NonNull String str) {
        return !(TextUtils.isEmpty(str) || "null".equals(str));
    }
}
