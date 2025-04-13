package com.yandex.mobile.ads.impl;

/* renamed from: com.yandex.mobile.ads.impl.dh */
/* loaded from: classes3.dex */
public final class C4971dh {
    /* renamed from: a */
    public static void m23882a(long j2, ap0 ap0Var, y61[] y61VarArr) {
        int i2;
        while (true) {
            if (ap0Var.m22579a() <= 1) {
                return;
            }
            int i3 = 0;
            while (true) {
                if (ap0Var.m22579a() == 0) {
                    i2 = -1;
                    break;
                }
                int m22607t = ap0Var.m22607t();
                i3 += m22607t;
                if (m22607t != 255) {
                    i2 = i3;
                    break;
                }
            }
            int i4 = 0;
            while (true) {
                if (ap0Var.m22579a() == 0) {
                    i4 = -1;
                    break;
                }
                int m22607t2 = ap0Var.m22607t();
                i4 += m22607t2;
                if (m22607t2 != 255) {
                    break;
                }
            }
            int m22588d = ap0Var.m22588d() + i4;
            if (i4 == -1 || i4 > ap0Var.m22579a()) {
                d90.m23842d("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                m22588d = ap0Var.m22590e();
            } else if (i2 == 4 && i4 >= 8) {
                int m22607t3 = ap0Var.m22607t();
                int m22613z = ap0Var.m22613z();
                int m22595h = m22613z == 49 ? ap0Var.m22595h() : 0;
                int m22607t4 = ap0Var.m22607t();
                if (m22613z == 47) {
                    ap0Var.m22593f(1);
                }
                boolean z = m22607t3 == 181 && (m22613z == 49 || m22613z == 47) && m22607t4 == 3;
                if (m22613z == 49) {
                    z &= m22595h == 1195456820;
                }
                if (z) {
                    m23883b(j2, ap0Var, y61VarArr);
                }
            }
            ap0Var.m22591e(m22588d);
        }
    }

    /* renamed from: b */
    public static void m23883b(long j2, ap0 ap0Var, y61[] y61VarArr) {
        int m22607t = ap0Var.m22607t();
        if ((m22607t & 64) != 0) {
            ap0Var.m22593f(1);
            int i2 = (m22607t & 31) * 3;
            int m22588d = ap0Var.m22588d();
            for (y61 y61Var : y61VarArr) {
                ap0Var.m22591e(m22588d);
                y61Var.mo28345a(i2, ap0Var);
                if (j2 != -9223372036854775807L) {
                    y61Var.mo28346a(j2, 1, i2, 0, null);
                }
            }
        }
    }
}
