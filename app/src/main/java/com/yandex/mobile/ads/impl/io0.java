package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.video.models.p026ad.JavaScriptResource;
import java.net.MalformedURLException;
import java.net.URL;

/* loaded from: classes3.dex */
public final class io0 {
    @NonNull
    /* renamed from: a */
    public static gb1 m25585a(@NonNull ab1 ab1Var) throws cb1, IllegalArgumentException {
        JavaScriptResource m22452b = ab1Var.m22452b();
        if (m22452b == null || !m22452b.m30763c().equals("omid")) {
            throw new cb1(ab1Var, 2);
        }
        try {
            URL url = new URL(m22452b.m30764d());
            String m22454d = ab1Var.m22454d();
            String m22453c = ab1Var.m22453c();
            return TextUtils.isEmpty(m22453c) ? gb1.m24836a(url) : gb1.m24835a(m22454d, url, m22453c);
        } catch (MalformedURLException unused) {
            throw new cb1(ab1Var, 3);
        }
    }
}
