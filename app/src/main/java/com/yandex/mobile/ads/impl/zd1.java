package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class zd1 {
    /* renamed from: a */
    public static void m30152a(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException(um1.m29049a("AdBreak", " not set!"));
        }
    }

    /* renamed from: a */
    public static Long m30151a(@Nullable String str) {
        if (str != null) {
            try {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss", Locale.US);
                return Long.valueOf(simpleDateFormat.parse(str).getTime() - simpleDateFormat.parse("00:00:00").getTime());
            } catch (ParseException e2) {
                n60.m26808a(e2, e2.toString(), new Object[0]);
            }
        }
        return null;
    }
}
