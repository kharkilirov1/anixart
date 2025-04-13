package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* loaded from: classes3.dex */
public final class zg1 implements e70 {

    /* renamed from: a */
    private final boolean f57182a;

    public zg1(boolean z) {
        this.f57182a = m30187a(z);
    }

    @VisibleForTesting
    /* renamed from: a */
    public static boolean m30187a(boolean z) {
        return z;
    }

    @Override // com.yandex.mobile.ads.impl.e70
    @NonNull
    /* renamed from: a */
    public final String mo23814a() {
        return String.format("viewable: %s", Boolean.valueOf(this.f57182a));
    }
}
