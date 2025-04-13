package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class il0 implements uc1 {

    /* renamed from: a */
    @NonNull
    private final String f51342a;

    /* renamed from: b */
    private final int f51343b;

    /* renamed from: c */
    private final int f51344c;

    public il0(int i2, int i3, @NonNull String str) {
        this.f51342a = str;
        this.f51343b = i2;
        this.f51344c = i3;
    }

    public final int getAdHeight() {
        return this.f51344c;
    }

    public final int getAdWidth() {
        return this.f51343b;
    }

    @Override // com.yandex.mobile.ads.impl.uc1
    public final String getUrl() {
        return this.f51342a;
    }
}
