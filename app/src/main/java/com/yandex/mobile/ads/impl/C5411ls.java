package com.yandex.mobile.ads.impl;

import java.util.HashSet;

/* renamed from: com.yandex.mobile.ads.impl.ls */
/* loaded from: classes3.dex */
public final class C5411ls {

    /* renamed from: a */
    private static final HashSet<String> f52517a = new HashSet<>();

    /* renamed from: b */
    private static String f52518b = "goog.exo.core";

    /* renamed from: a */
    public static synchronized String m26525a() {
        String str;
        synchronized (C5411ls.class) {
            str = f52518b;
        }
        return str;
    }

    /* renamed from: a */
    public static synchronized void m26526a(String str) {
        synchronized (C5411ls.class) {
            if (f52517a.add(str)) {
                f52518b += ", " + str;
            }
        }
    }
}
