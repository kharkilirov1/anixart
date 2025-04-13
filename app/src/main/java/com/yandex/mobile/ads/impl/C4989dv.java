package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.embedded.guava.collect.AbstractC4698p;
import com.yandex.mobile.ads.exo.metadata.flac.PictureFrame;
import com.yandex.mobile.ads.impl.C5147gv;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.yandex.mobile.ads.impl.dv */
/* loaded from: classes3.dex */
public final class C4989dv {

    /* renamed from: com.yandex.mobile.ads.impl.dv$a */
    public static final class a {

        /* renamed from: a */
        @Nullable
        public C5147gv f49749a;

        public a(@Nullable C5147gv c5147gv) {
            this.f49749a = c5147gv;
        }
    }

    /* renamed from: a */
    public static boolean m23943a(C5598pn c5598pn, a aVar) throws IOException {
        c5598pn.mo26765c();
        zo0 zo0Var = new zo0(4, new byte[4]);
        c5598pn.mo26764b(zo0Var.f57274a, 0, 4, false);
        boolean m30260f = zo0Var.m30260f();
        int m30252b = zo0Var.m30252b(7);
        int m30252b2 = zo0Var.m30252b(24) + 4;
        if (m30252b == 0) {
            byte[] bArr = new byte[38];
            c5598pn.mo26762a(bArr, 0, 38, false);
            aVar.f49749a = new C5147gv(4, bArr);
        } else {
            C5147gv c5147gv = aVar.f49749a;
            if (c5147gv == null) {
                throw new IllegalArgumentException();
            }
            if (m30252b == 3) {
                ap0 ap0Var = new ap0(m30252b2);
                c5598pn.mo26762a(ap0Var.m22587c(), 0, m30252b2, false);
                aVar.f49749a = c5147gv.m24983a(m23942a(ap0Var));
            } else if (m30252b == 4) {
                ap0 ap0Var2 = new ap0(m30252b2);
                c5598pn.mo26762a(ap0Var2.m22587c(), 0, m30252b2, false);
                ap0Var2.m22593f(4);
                aVar.f49749a = c5147gv.m24987b(Arrays.asList(bi1.m22837a(ap0Var2, false, false).f48885a));
            } else if (m30252b == 6) {
                ap0 ap0Var3 = new ap0(m30252b2);
                c5598pn.mo26762a(ap0Var3.m22587c(), 0, m30252b2, false);
                ap0Var3.m22593f(4);
                int m22595h = ap0Var3.m22595h();
                String m22580a = ap0Var3.m22580a(ap0Var3.m22595h(), C5285jh.f51606a);
                String m22580a2 = ap0Var3.m22580a(ap0Var3.m22595h(), C5285jh.f51608c);
                int m22595h2 = ap0Var3.m22595h();
                int m22595h3 = ap0Var3.m22595h();
                int m22595h4 = ap0Var3.m22595h();
                int m22595h5 = ap0Var3.m22595h();
                int m22595h6 = ap0Var3.m22595h();
                byte[] bArr2 = new byte[m22595h6];
                ap0Var3.m22583a(bArr2, 0, m22595h6);
                aVar.f49749a = c5147gv.m24984a(AbstractC4698p.m22048a(new PictureFrame(m22595h, m22580a, m22580a2, m22595h2, m22595h3, m22595h4, m22595h5, bArr2)));
            } else {
                c5598pn.mo26760a(m30252b2);
            }
        }
        return m30260f;
    }

    /* renamed from: a */
    public static C5147gv.a m23942a(ap0 ap0Var) {
        ap0Var.m22593f(1);
        int m22610w = ap0Var.m22610w();
        long m22588d = ap0Var.m22588d() + m22610w;
        int i2 = m22610w / 18;
        long[] jArr = new long[i2];
        long[] jArr2 = new long[i2];
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            long m22603p = ap0Var.m22603p();
            if (m22603p == -1) {
                jArr = Arrays.copyOf(jArr, i3);
                jArr2 = Arrays.copyOf(jArr2, i3);
                break;
            }
            jArr[i3] = m22603p;
            jArr2[i3] = ap0Var.m22603p();
            ap0Var.m22593f(2);
            i3++;
        }
        ap0Var.m22593f((int) (m22588d - ap0Var.m22588d()));
        return new C5147gv.a(jArr, jArr2);
    }
}
