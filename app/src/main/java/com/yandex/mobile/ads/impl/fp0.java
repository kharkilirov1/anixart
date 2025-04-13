package com.yandex.mobile.ads.impl;

import android.text.TextUtils;

/* loaded from: classes3.dex */
public final class fp0 {

    /* renamed from: a */
    private final String f50403a = "Yandex";

    /* renamed from: b */
    private final String f50404b;

    private fp0(String str) {
        this.f50404b = str;
    }

    /* renamed from: a */
    public static fp0 m24720a(String str) {
        if (TextUtils.isEmpty("Yandex")) {
            throw new IllegalArgumentException("Name is null or empty");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Version is null or empty");
        }
        return new fp0(str);
    }

    /* renamed from: a */
    public final String m24721a() {
        return this.f50403a;
    }

    /* renamed from: b */
    public final String m24722b() {
        return this.f50404b;
    }
}
