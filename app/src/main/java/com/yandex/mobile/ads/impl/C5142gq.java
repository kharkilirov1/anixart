package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.gq */
/* loaded from: classes3.dex */
public final class C5142gq {

    /* renamed from: a */
    public final String f50701a;

    private C5142gq(String str) {
        this.f50701a = str;
    }

    @Nullable
    /* renamed from: a */
    public static C5142gq m24957a(ap0 ap0Var) {
        String str;
        ap0Var.m22593f(2);
        int m22607t = ap0Var.m22607t();
        int i2 = m22607t >> 1;
        int m22607t2 = ((ap0Var.m22607t() >> 3) & 31) | ((m22607t & 1) << 5);
        if (i2 == 4 || i2 == 5 || i2 == 7) {
            str = "dvhe";
        } else if (i2 == 8) {
            str = "hev1";
        } else {
            if (i2 != 9) {
                return null;
            }
            str = "avc3";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".0");
        sb.append(i2);
        sb.append(m22607t2 >= 10 ? "." : ".0");
        sb.append(m22607t2);
        return new C5142gq(sb.toString());
    }
}
