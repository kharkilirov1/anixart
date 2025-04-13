package com.yandex.mobile.ads.impl;

import android.util.Pair;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import java.io.IOException;

/* loaded from: classes3.dex */
final class ii1 {

    /* renamed from: com.yandex.mobile.ads.impl.ii1$a */
    public static final class C5231a {

        /* renamed from: a */
        public final int f51307a;

        /* renamed from: b */
        public final long f51308b;

        private C5231a(int i2, long j2) {
            this.f51307a = i2;
            this.f51308b = j2;
        }

        /* renamed from: a */
        public static C5231a m25547a(C5598pn c5598pn, ap0 ap0Var) throws IOException {
            c5598pn.mo26764b(ap0Var.m22587c(), 0, 8, false);
            ap0Var.m22591e(0);
            return new C5231a(ap0Var.m22595h(), ap0Var.m22601n());
        }
    }

    /* renamed from: a */
    public static boolean m25544a(C5598pn c5598pn) throws IOException {
        ap0 ap0Var = new ap0(8);
        int i2 = C5231a.m25547a(c5598pn, ap0Var).f51307a;
        if (i2 != 1380533830 && i2 != 1380333108) {
            return false;
        }
        c5598pn.mo26764b(ap0Var.m22587c(), 0, 4, false);
        ap0Var.m22591e(0);
        int m22595h = ap0Var.m22595h();
        if (m22595h == 1463899717) {
            return true;
        }
        d90.m23839b("WavHeaderReader", "Unsupported form type: " + m22595h);
        return false;
    }

    /* renamed from: b */
    public static hi1 m25545b(C5598pn c5598pn) throws IOException {
        byte[] bArr;
        ap0 ap0Var = new ap0(16);
        C5231a m25543a = m25543a(1718449184, c5598pn, ap0Var);
        C5220ia.m25476b(m25543a.f51308b >= 16);
        c5598pn.mo26764b(ap0Var.m22587c(), 0, 16, false);
        ap0Var.m22591e(0);
        int m22602o = ap0Var.m22602o();
        int m22602o2 = ap0Var.m22602o();
        int m22598k = ap0Var.m22598k();
        if (m22598k < 0) {
            throw new IllegalStateException(k60.m26036a("Top bit not zero: ", m22598k));
        }
        int m22598k2 = ap0Var.m22598k();
        if (m22598k2 < 0) {
            throw new IllegalStateException(k60.m26036a("Top bit not zero: ", m22598k2));
        }
        int m22602o3 = ap0Var.m22602o();
        int m22602o4 = ap0Var.m22602o();
        int i2 = ((int) m25543a.f51308b) - 16;
        if (i2 > 0) {
            byte[] bArr2 = new byte[i2];
            c5598pn.mo26764b(bArr2, 0, i2, false);
            bArr = bArr2;
        } else {
            bArr = s91.f54535f;
        }
        c5598pn.mo26760a((int) (c5598pn.mo22718e() - c5598pn.getPosition()));
        return new hi1(m22602o, m22602o2, m22598k, m22602o3, m22602o4, bArr);
    }

    /* renamed from: c */
    public static Pair m25546c(C5598pn c5598pn) throws IOException {
        c5598pn.mo26765c();
        C5231a m25543a = m25543a(1684108385, c5598pn, new ap0(8));
        c5598pn.mo26760a(8);
        return Pair.create(Long.valueOf(c5598pn.getPosition()), Long.valueOf(m25543a.f51308b));
    }

    /* renamed from: a */
    private static C5231a m25543a(int i2, C5598pn c5598pn, ap0 ap0Var) throws IOException {
        C5231a m25547a = C5231a.m25547a(c5598pn, ap0Var);
        while (m25547a.f51307a != i2) {
            StringBuilder m26356a = l60.m26356a("Ignoring unknown WAV chunk: ");
            m26356a.append(m25547a.f51307a);
            d90.m23842d("WavHeaderReader", m26356a.toString());
            long j2 = m25547a.f51308b + 8;
            if (j2 <= ParserMinimalBase.MAX_INT_L) {
                c5598pn.mo26760a((int) j2);
                m25547a = C5231a.m25547a(c5598pn, ap0Var);
            } else {
                StringBuilder m26356a2 = l60.m26356a("Chunk is too large (~2GB+) to skip; id: ");
                m26356a2.append(m25547a.f51307a);
                throw ep0.m24224a(m26356a2.toString());
            }
        }
        return m25547a;
    }
}
