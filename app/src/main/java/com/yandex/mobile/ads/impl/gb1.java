package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import java.net.URL;

/* loaded from: classes3.dex */
public final class gb1 {

    /* renamed from: a */
    private final String f50545a;

    /* renamed from: b */
    private final URL f50546b;

    /* renamed from: c */
    private final String f50547c;

    private gb1(String str, URL url, String str2) {
        this.f50545a = str;
        this.f50546b = url;
        this.f50547c = str2;
    }

    /* renamed from: a */
    public static gb1 m24835a(String str, URL url, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("VendorKey is null or empty");
        }
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("VerificationParameters is null or empty");
        }
        return new gb1(str, url, str2);
    }

    /* renamed from: a */
    public static gb1 m24836a(URL url) {
        return new gb1(null, url, null);
    }

    /* renamed from: a */
    public final URL m24837a() {
        return this.f50546b;
    }

    /* renamed from: b */
    public final String m24838b() {
        return this.f50545a;
    }

    /* renamed from: c */
    public final String m24839c() {
        return this.f50547c;
    }
}
