package com.yandex.mobile.ads.impl;

import androidx.recyclerview.widget.RecyclerView;
import com.yandex.mobile.ads.impl.e01;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.yandex.mobile.ads.impl.lh */
/* loaded from: classes3.dex */
final class C5397lh {

    /* renamed from: a */
    public final y61 f52403a;

    /* renamed from: b */
    private final int f52404b;

    /* renamed from: c */
    private final int f52405c;

    /* renamed from: d */
    private final long f52406d;

    /* renamed from: e */
    private final int f52407e;

    /* renamed from: f */
    private int f52408f;

    /* renamed from: g */
    private int f52409g;

    /* renamed from: h */
    private int f52410h;

    /* renamed from: i */
    private int f52411i;

    /* renamed from: j */
    private int f52412j;

    /* renamed from: k */
    private long[] f52413k;

    /* renamed from: l */
    private int[] f52414l;

    public C5397lh(int i2, int i3, long j2, int i4, y61 y61Var) {
        boolean z = true;
        if (i3 != 1 && i3 != 2) {
            z = false;
        }
        C5220ia.m25473a(z);
        this.f52406d = j2;
        this.f52407e = i4;
        this.f52403a = y61Var;
        this.f52404b = m26456a(i2, i3 == 2 ? 1667497984 : 1651965952);
        this.f52405c = i3 == 2 ? m26456a(i2, 1650720768) : -1;
        this.f52413k = new long[RecyclerView.ViewHolder.FLAG_ADAPTER_POSITION_UNKNOWN];
        this.f52414l = new int[RecyclerView.ViewHolder.FLAG_ADAPTER_POSITION_UNKNOWN];
    }

    /* renamed from: a */
    public final void m26458a(long j2) {
        if (this.f52412j == this.f52414l.length) {
            long[] jArr = this.f52413k;
            this.f52413k = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
            int[] iArr = this.f52414l;
            this.f52414l = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
        }
        long[] jArr2 = this.f52413k;
        int i2 = this.f52412j;
        jArr2[i2] = j2;
        this.f52414l[i2] = this.f52411i;
        this.f52412j = i2 + 1;
    }

    /* renamed from: b */
    public final void m26462b() {
        this.f52411i++;
    }

    /* renamed from: c */
    public final void m26464c(long j2) {
        if (this.f52412j == 0) {
            this.f52410h = 0;
        } else {
            this.f52410h = this.f52414l[s91.m28118b(this.f52413k, j2, true)];
        }
    }

    /* renamed from: b */
    public final void m26463b(int i2) {
        this.f52408f = i2;
        this.f52409g = i2;
    }

    /* renamed from: b */
    public final e01.C4997a m26461b(long j2) {
        long j3 = 1;
        int i2 = (int) (j2 / ((this.f52406d * j3) / this.f52407e));
        int m28094a = s91.m28094a(this.f52414l, i2, true, true);
        int i3 = this.f52414l[m28094a];
        if (i3 == i2) {
            g01 g01Var = new g01(((this.f52406d * j3) / this.f52407e) * i3, this.f52413k[m28094a]);
            return new e01.C4997a(g01Var, g01Var);
        }
        long j4 = i3;
        long j5 = (this.f52406d * j3) / this.f52407e;
        long[] jArr = this.f52413k;
        g01 g01Var2 = new g01(j4 * j5, jArr[m28094a]);
        int i4 = m28094a + 1;
        if (i4 < jArr.length) {
            return new e01.C4997a(g01Var2, new g01(j5 * r0[i4], jArr[i4]));
        }
        return new e01.C4997a(g01Var2, g01Var2);
    }

    /* renamed from: a */
    public final void m26457a() {
        this.f52413k = Arrays.copyOf(this.f52413k, this.f52412j);
        this.f52414l = Arrays.copyOf(this.f52414l, this.f52412j);
    }

    /* renamed from: a */
    public final boolean m26459a(int i2) {
        return this.f52404b == i2 || this.f52405c == i2;
    }

    /* renamed from: a */
    public final boolean m26460a(C5598pn c5598pn) throws IOException {
        int i2 = this.f52409g;
        int mo28348b = i2 - this.f52403a.mo28348b(c5598pn, i2, false);
        this.f52409g = mo28348b;
        boolean z = mo28348b == 0;
        if (z) {
            if (this.f52408f > 0) {
                y61 y61Var = this.f52403a;
                int i3 = this.f52410h;
                y61Var.mo28346a((this.f52406d * i3) / this.f52407e, Arrays.binarySearch(this.f52414l, i3) >= 0 ? 1 : 0, this.f52408f, 0, null);
            }
            this.f52410h++;
        }
        return z;
    }

    /* renamed from: a */
    private static int m26456a(int i2, int i3) {
        return (((i2 % 10) + 48) << 8) | ((i2 / 10) + 48) | i3;
    }
}
