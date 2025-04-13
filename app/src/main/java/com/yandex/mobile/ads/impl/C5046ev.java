package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.C5147gv;
import com.yandex.mobile.ads.impl.h41;
import java.util.Arrays;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* renamed from: com.yandex.mobile.ads.impl.ev */
/* loaded from: classes3.dex */
final class C5046ev extends h41 {

    /* renamed from: n */
    @Nullable
    private C5147gv f50061n;

    /* renamed from: o */
    @Nullable
    private a f50062o;

    @Override // com.yandex.mobile.ads.impl.h41
    /* renamed from: a */
    public final void mo24269a(boolean z) {
        super.mo24269a(z);
        if (z) {
            this.f50061n = null;
            this.f50062o = null;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ev$a */
    public static final class a implements kn0 {

        /* renamed from: a */
        private C5147gv f50063a;

        /* renamed from: b */
        private C5147gv.a f50064b;

        /* renamed from: c */
        private long f50065c = -1;

        /* renamed from: d */
        private long f50066d = -1;

        public a(C5147gv c5147gv, C5147gv.a aVar) {
            this.f50063a = c5147gv;
            this.f50064b = aVar;
        }

        @Override // com.yandex.mobile.ads.impl.kn0
        /* renamed from: a */
        public final long mo22562a(C5598pn c5598pn) {
            long j2 = this.f50066d;
            if (j2 < 0) {
                return -1L;
            }
            long j3 = -(j2 + 2);
            this.f50066d = -1L;
            return j3;
        }

        /* renamed from: b */
        public final void m24271b(long j2) {
            this.f50065c = j2;
        }

        @Override // com.yandex.mobile.ads.impl.kn0
        /* renamed from: a */
        public final void mo22564a(long j2) {
            long[] jArr = this.f50064b.f50753a;
            this.f50066d = jArr[s91.m28118b(jArr, j2, true)];
        }

        @Override // com.yandex.mobile.ads.impl.kn0
        /* renamed from: a */
        public final e01 mo22563a() {
            C5220ia.m25476b(this.f50065c != -1);
            return new C5093fv(this.f50063a, this.f50065c);
        }
    }

    @Override // com.yandex.mobile.ads.impl.h41
    /* renamed from: a */
    public final long mo24268a(ap0 ap0Var) {
        int i2;
        int i3;
        int m22607t;
        int i4 = -1;
        if (!(ap0Var.m22587c()[0] == -1)) {
            return -1L;
        }
        int i5 = (ap0Var.m22587c()[2] & 255) >> 4;
        if (i5 == 6 || i5 == 7) {
            ap0Var.m22593f(4);
            ap0Var.m22578A();
        }
        switch (i5) {
            case 1:
                i4 = 192;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                i2 = i5 - 2;
                i3 = 576;
                i4 = i3 << i2;
                break;
            case 6:
                m22607t = ap0Var.m22607t();
                i4 = m22607t + 1;
                break;
            case 7:
                m22607t = ap0Var.m22613z();
                i4 = m22607t + 1;
                break;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i2 = i5 - 8;
                i3 = 256;
                i4 = i3 << i2;
                break;
        }
        ap0Var.m22591e(0);
        return i4;
    }

    @Override // com.yandex.mobile.ads.impl.h41
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* renamed from: a */
    public final boolean mo24270a(ap0 ap0Var, long j2, h41.C5163a c5163a) {
        byte[] m22587c = ap0Var.m22587c();
        C5147gv c5147gv = this.f50061n;
        if (c5147gv == null) {
            C5147gv c5147gv2 = new C5147gv(17, m22587c);
            this.f50061n = c5147gv2;
            c5163a.f50845a = c5147gv2.m24985a(Arrays.copyOfRange(m22587c, 9, ap0Var.m22590e()), null);
            return true;
        }
        byte b = m22587c[0];
        if ((b & Byte.MAX_VALUE) == 3) {
            C5147gv.a m23942a = C4989dv.m23942a(ap0Var);
            C5147gv m24983a = c5147gv.m24983a(m23942a);
            this.f50061n = m24983a;
            this.f50062o = new a(m24983a, m23942a);
            return true;
        }
        if (!(b == -1)) {
            return true;
        }
        a aVar = this.f50062o;
        if (aVar != null) {
            aVar.m24271b(j2);
            c5163a.f50846b = this.f50062o;
        }
        Objects.requireNonNull(c5163a.f50845a);
        return false;
    }
}
