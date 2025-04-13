package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class dn0 extends AbstractC5681ra<String, String> {

    /* renamed from: a */
    @NonNull
    private final hx0 f49685a = new hx0();

    @Override // com.yandex.mobile.ads.impl.AbstractC5681ra
    @NonNull
    /* renamed from: a */
    public final C5276ja mo22364a(@NonNull Object obj, @NonNull String str) {
        String str2 = (String) obj;
        if ("review_count".equals(str)) {
            try {
                str2 = this.f49685a.m25379a(str2);
            } catch (ni0 unused) {
            }
        }
        return new C5276ja(str, "string", str2, null, false, false);
    }
}
