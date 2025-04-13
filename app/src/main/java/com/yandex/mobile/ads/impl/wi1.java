package com.yandex.mobile.ads.impl;

import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class wi1 {

    /* renamed from: a */
    public static final /* synthetic */ int f56139a = 0;

    static {
        Pattern.compile("^NOTE([ \t].*)?$");
    }

    /* renamed from: a */
    public static void m29485a(ap0 ap0Var) throws ep0 {
        int m22588d = ap0Var.m22588d();
        String m22597j = ap0Var.m22597j();
        if (m22597j != null && m22597j.startsWith("WEBVTT")) {
            return;
        }
        ap0Var.m22591e(m22588d);
        throw ep0.m24225a("Expected WEBVTT. Got " + ap0Var.m22597j(), (Exception) null);
    }

    /* renamed from: a */
    public static long m29484a(String str) throws NumberFormatException {
        int i2 = s91.f54530a;
        String[] split = str.split("\\.", 2);
        long j2 = 0;
        for (String str2 : split[0].split(":", -1)) {
            j2 = (j2 * 60) + Long.parseLong(str2);
        }
        long j3 = j2 * 1000;
        if (split.length == 2) {
            j3 += Long.parseLong(split[1]);
        }
        return j3 * 1000;
    }
}
