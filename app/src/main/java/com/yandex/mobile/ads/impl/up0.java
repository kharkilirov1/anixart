package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.C5751sl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import java.util.zip.Inflater;
import kotlin.KotlinVersion;

/* loaded from: classes3.dex */
public final class up0 extends i11 {

    /* renamed from: m */
    private final ap0 f55602m = new ap0();

    /* renamed from: n */
    private final ap0 f55603n = new ap0();

    /* renamed from: o */
    private final C5877a f55604o = new C5877a();

    /* renamed from: p */
    @Nullable
    private Inflater f55605p;

    @Override // com.yandex.mobile.ads.impl.i11
    /* renamed from: a */
    public final w41 mo23247a(byte[] bArr, int i2, boolean z) throws y41 {
        this.f55602m.m22582a(i2, bArr);
        ap0 ap0Var = this.f55602m;
        if (ap0Var.m22579a() > 0 && ap0Var.m22594g() == 120) {
            if (this.f55605p == null) {
                this.f55605p = new Inflater();
            }
            if (s91.m28111a(ap0Var, this.f55603n, this.f55605p)) {
                ap0Var.m22582a(this.f55603n.m22590e(), this.f55603n.m22587c());
            }
        }
        this.f55604o.m29066b();
        ArrayList arrayList = new ArrayList();
        while (this.f55602m.m22579a() >= 3) {
            ap0 ap0Var2 = this.f55602m;
            C5877a c5877a = this.f55604o;
            int m22590e = ap0Var2.m22590e();
            int m22607t = ap0Var2.m22607t();
            int m22613z = ap0Var2.m22613z();
            int m22588d = ap0Var2.m22588d() + m22613z;
            C5751sl c5751sl = null;
            if (m22588d > m22590e) {
                ap0Var2.m22591e(m22590e);
            } else {
                if (m22607t != 128) {
                    switch (m22607t) {
                        case 20:
                            C5877a.m29062a(c5877a, ap0Var2, m22613z);
                            break;
                        case 21:
                            C5877a.m29063b(c5877a, ap0Var2, m22613z);
                            break;
                        case 22:
                            C5877a.m29064c(c5877a, ap0Var2, m22613z);
                            break;
                    }
                } else {
                    c5751sl = c5877a.m29065a();
                    c5877a.m29066b();
                }
                ap0Var2.m22591e(m22588d);
            }
            if (c5751sl != null) {
                arrayList.add(c5751sl);
            }
        }
        return new vp0(Collections.unmodifiableList(arrayList));
    }

    /* renamed from: com.yandex.mobile.ads.impl.up0$a */
    public static final class C5877a {

        /* renamed from: a */
        private final ap0 f55606a = new ap0();

        /* renamed from: b */
        private final int[] f55607b = new int[256];

        /* renamed from: c */
        private boolean f55608c;

        /* renamed from: d */
        private int f55609d;

        /* renamed from: e */
        private int f55610e;

        /* renamed from: f */
        private int f55611f;

        /* renamed from: g */
        private int f55612g;

        /* renamed from: h */
        private int f55613h;

        /* renamed from: i */
        private int f55614i;

        /* renamed from: a */
        public static void m29062a(C5877a c5877a, ap0 ap0Var, int i2) {
            Objects.requireNonNull(c5877a);
            if (i2 % 5 != 2) {
                return;
            }
            ap0Var.m22593f(2);
            Arrays.fill(c5877a.f55607b, 0);
            int i3 = i2 / 5;
            for (int i4 = 0; i4 < i3; i4++) {
                int m22607t = ap0Var.m22607t();
                int m22607t2 = ap0Var.m22607t();
                int m22607t3 = ap0Var.m22607t();
                int m22607t4 = ap0Var.m22607t();
                int m22607t5 = ap0Var.m22607t();
                double d = m22607t2;
                double d2 = m22607t3 - 128;
                int i5 = (int) ((1.402d * d2) + d);
                double d3 = m22607t4 - 128;
                int i6 = (int) ((d - (0.34414d * d3)) - (d2 * 0.71414d));
                int i7 = (int) ((d3 * 1.772d) + d);
                int[] iArr = c5877a.f55607b;
                int i8 = s91.f54530a;
                iArr[m22607t] = (Math.max(0, Math.min(i6, KotlinVersion.MAX_COMPONENT_VALUE)) << 8) | (m22607t5 << 24) | (Math.max(0, Math.min(i5, KotlinVersion.MAX_COMPONENT_VALUE)) << 16) | Math.max(0, Math.min(i7, KotlinVersion.MAX_COMPONENT_VALUE));
            }
            c5877a.f55608c = true;
        }

        /* renamed from: b */
        public static void m29063b(C5877a c5877a, ap0 ap0Var, int i2) {
            int m22610w;
            Objects.requireNonNull(c5877a);
            if (i2 < 4) {
                return;
            }
            ap0Var.m22593f(3);
            int i3 = i2 - 4;
            if ((ap0Var.m22607t() & 128) != 0) {
                if (i3 < 7 || (m22610w = ap0Var.m22610w()) < 4) {
                    return;
                }
                c5877a.f55613h = ap0Var.m22613z();
                c5877a.f55614i = ap0Var.m22613z();
                c5877a.f55606a.m22586c(m22610w - 4);
                i3 -= 7;
            }
            int m22588d = c5877a.f55606a.m22588d();
            int m22590e = c5877a.f55606a.m22590e();
            if (m22588d >= m22590e || i3 <= 0) {
                return;
            }
            int min = Math.min(i3, m22590e - m22588d);
            ap0Var.m22583a(c5877a.f55606a.m22587c(), m22588d, min);
            c5877a.f55606a.m22591e(m22588d + min);
        }

        /* renamed from: c */
        public static void m29064c(C5877a c5877a, ap0 ap0Var, int i2) {
            Objects.requireNonNull(c5877a);
            if (i2 < 19) {
                return;
            }
            c5877a.f55609d = ap0Var.m22613z();
            c5877a.f55610e = ap0Var.m22613z();
            ap0Var.m22593f(11);
            c5877a.f55611f = ap0Var.m22613z();
            c5877a.f55612g = ap0Var.m22613z();
        }

        /* renamed from: b */
        public final void m29066b() {
            this.f55609d = 0;
            this.f55610e = 0;
            this.f55611f = 0;
            this.f55612g = 0;
            this.f55613h = 0;
            this.f55614i = 0;
            this.f55606a.m22586c(0);
            this.f55608c = false;
        }

        @Nullable
        /* renamed from: a */
        public final C5751sl m29065a() {
            int i2;
            if (this.f55609d == 0 || this.f55610e == 0 || this.f55613h == 0 || this.f55614i == 0 || this.f55606a.m22590e() == 0 || this.f55606a.m22588d() != this.f55606a.m22590e() || !this.f55608c) {
                return null;
            }
            this.f55606a.m22591e(0);
            int i3 = this.f55613h * this.f55614i;
            int[] iArr = new int[i3];
            int i4 = 0;
            while (i4 < i3) {
                int m22607t = this.f55606a.m22607t();
                if (m22607t != 0) {
                    i2 = i4 + 1;
                    iArr[i4] = this.f55607b[m22607t];
                } else {
                    int m22607t2 = this.f55606a.m22607t();
                    if (m22607t2 != 0) {
                        i2 = ((m22607t2 & 64) == 0 ? m22607t2 & 63 : ((m22607t2 & 63) << 8) | this.f55606a.m22607t()) + i4;
                        Arrays.fill(iArr, i4, i2, (m22607t2 & 128) == 0 ? 0 : this.f55607b[this.f55606a.m22607t()]);
                    }
                }
                i4 = i2;
            }
            return new C5751sl.a().m28303a(Bitmap.createBitmap(iArr, this.f55613h, this.f55614i, Bitmap.Config.ARGB_8888)).m28307b(this.f55611f / this.f55609d).m28308b(0).m28302a(0, this.f55612g / this.f55610e).m28301a(0).m28316d(this.f55613h / this.f55609d).m28300a(this.f55614i / this.f55610e).m28305a();
        }
    }
}
