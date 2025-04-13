package com.yandex.mobile.ads.impl;

import java.util.Arrays;
import p000a.C0000a;

/* loaded from: classes3.dex */
public final class e90 {

    /* renamed from: a */
    private int f49848a;

    /* renamed from: b */
    private long[] f49849b;

    public e90() {
        this(0);
    }

    /* renamed from: a */
    public final void m24047a(long j2) {
        int i2 = this.f49848a;
        long[] jArr = this.f49849b;
        if (i2 == jArr.length) {
            this.f49849b = Arrays.copyOf(jArr, i2 * 2);
        }
        long[] jArr2 = this.f49849b;
        int i3 = this.f49848a;
        this.f49848a = i3 + 1;
        jArr2[i3] = j2;
    }

    /* renamed from: b */
    public final long[] m24048b() {
        return Arrays.copyOf(this.f49849b, this.f49848a);
    }

    public e90(int i2) {
        this.f49849b = new long[32];
    }

    /* renamed from: a */
    public final long m24046a(int i2) {
        if (i2 >= 0 && i2 < this.f49848a) {
            return this.f49849b[i2];
        }
        StringBuilder m25v = C0000a.m25v("Invalid index ", i2, ", size is ");
        m25v.append(this.f49848a);
        throw new IndexOutOfBoundsException(m25v.toString());
    }

    /* renamed from: a */
    public final int m24045a() {
        return this.f49848a;
    }
}
