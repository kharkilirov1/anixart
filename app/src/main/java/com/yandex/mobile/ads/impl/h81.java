package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class h81 {
    /* renamed from: a */
    public static long m25084a(int i2, int i3, ap0 ap0Var) {
        ap0Var.m22591e(i2);
        if (ap0Var.m22579a() < 5) {
            return -9223372036854775807L;
        }
        int m22595h = ap0Var.m22595h();
        if ((8388608 & m22595h) != 0 || ((2096896 & m22595h) >> 8) != i3) {
            return -9223372036854775807L;
        }
        if (((m22595h & 32) != 0) && ap0Var.m22607t() >= 7 && ap0Var.m22579a() >= 7) {
            if ((ap0Var.m22607t() & 16) == 16) {
                ap0Var.m22583a(new byte[6], 0, 6);
                return ((r0[3] & 255) << 1) | ((r0[0] & 255) << 25) | ((r0[1] & 255) << 17) | ((r0[2] & 255) << 9) | ((r0[4] & 255) >> 7);
            }
        }
        return -9223372036854775807L;
    }
}
