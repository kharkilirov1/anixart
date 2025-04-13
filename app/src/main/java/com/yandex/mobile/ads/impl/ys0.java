package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.xs0;
import java.util.ArrayList;

/* loaded from: classes3.dex */
final class ys0 {
    @Nullable
    /* renamed from: a */
    public static xs0 m29970a(int i2, byte[] bArr) {
        ArrayList<xs0.C6039a> arrayList;
        int m22595h;
        ap0 ap0Var = new ap0(bArr);
        try {
            ap0Var.m22593f(4);
            m22595h = ap0Var.m22595h();
            ap0Var.m22591e(0);
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        if (m22595h == 1886547818) {
            ap0Var.m22593f(8);
            int m22588d = ap0Var.m22588d();
            int m22590e = ap0Var.m22590e();
            while (m22588d < m22590e) {
                int m22595h2 = ap0Var.m22595h() + m22588d;
                if (m22595h2 <= m22588d || m22595h2 > m22590e) {
                    break;
                }
                int m22595h3 = ap0Var.m22595h();
                if (m22595h3 != 2037673328 && m22595h3 != 1836279920) {
                    ap0Var.m22591e(m22595h2);
                    m22588d = m22595h2;
                }
                ap0Var.m22589d(m22595h2);
                arrayList = m29971a(ap0Var);
                break;
            }
            arrayList = null;
        } else {
            arrayList = m29971a(ap0Var);
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        if (size == 1) {
            xs0.C6039a c6039a = arrayList.get(0);
            return new xs0(c6039a, c6039a, i2);
        }
        if (size != 2) {
            return null;
        }
        return new xs0(arrayList.get(0), arrayList.get(1), i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01c6 A[SYNTHETIC] */
    @androidx.annotation.Nullable
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.ArrayList<com.yandex.mobile.ads.impl.xs0.C6039a> m29971a(com.yandex.mobile.ads.impl.ap0 r27) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ys0.m29971a(com.yandex.mobile.ads.impl.ap0):java.util.ArrayList");
    }
}
