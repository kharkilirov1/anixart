package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.ch0;
import java.util.Collections;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.ky */
/* loaded from: classes3.dex */
public final class C5367ky {

    /* renamed from: a */
    public final List<byte[]> f52188a;

    /* renamed from: b */
    public final int f52189b;

    /* renamed from: c */
    public final float f52190c;

    /* renamed from: d */
    @Nullable
    public final String f52191d;

    private C5367ky(List list, int i2, float f2, @Nullable String str) {
        this.f52188a = list;
        this.f52189b = i2;
        this.f52190c = f2;
        this.f52191d = str;
    }

    /* renamed from: a */
    public static C5367ky m26298a(ap0 ap0Var) throws ep0 {
        int i2;
        try {
            ap0Var.m22593f(21);
            int m22607t = ap0Var.m22607t() & 3;
            int m22607t2 = ap0Var.m22607t();
            int m22588d = ap0Var.m22588d();
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < m22607t2; i5++) {
                ap0Var.m22593f(1);
                int m22613z = ap0Var.m22613z();
                for (int i6 = 0; i6 < m22613z; i6++) {
                    int m22613z2 = ap0Var.m22613z();
                    i4 += m22613z2 + 4;
                    ap0Var.m22593f(m22613z2);
                }
            }
            ap0Var.m22591e(m22588d);
            byte[] bArr = new byte[i4];
            float f2 = 1.0f;
            String str = null;
            int i7 = 0;
            int i8 = 0;
            while (i7 < m22607t2) {
                int m22607t3 = ap0Var.m22607t() & 127;
                int m22613z3 = ap0Var.m22613z();
                int i9 = 0;
                while (i9 < m22613z3) {
                    int m22613z4 = ap0Var.m22613z();
                    System.arraycopy(ch0.f49243a, i3, bArr, i8, 4);
                    int i10 = i8 + 4;
                    System.arraycopy(ap0Var.m22587c(), ap0Var.m22588d(), bArr, i10, m22613z4);
                    if (m22607t3 == 33 && i9 == 0) {
                        ch0.C4923a m23262a = ch0.m23262a(bArr, i10, i10 + m22613z4);
                        float f3 = m23262a.f49253g;
                        i2 = m22607t2;
                        str = C5081fj.m24607a(m23262a.f49247a, m23262a.f49248b, m23262a.f49249c, m23262a.f49250d, m23262a.f49251e, m23262a.f49252f);
                        f2 = f3;
                    } else {
                        i2 = m22607t2;
                    }
                    i8 = i10 + m22613z4;
                    ap0Var.m22593f(m22613z4);
                    i9++;
                    m22607t2 = i2;
                    i3 = 0;
                }
                i7++;
                i3 = 0;
            }
            return new C5367ky(i4 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), m22607t + 1, f2, str);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw ep0.m24225a("Error parsing HEVC config", e2);
        }
    }
}
