package com.yandex.mobile.ads.impl;

import kotlin.KotlinVersion;

/* loaded from: classes3.dex */
public final class yh1 {

    /* renamed from: a */
    private final byte[] f56862a;

    /* renamed from: b */
    private final int f56863b;

    /* renamed from: c */
    private int f56864c;

    /* renamed from: d */
    private int f56865d;

    public yh1(byte[] bArr) {
        this.f56862a = bArr;
        this.f56863b = bArr.length;
    }

    /* renamed from: a */
    public final int m29941a(int i2) {
        int i3 = this.f56864c;
        int min = Math.min(i2, 8 - this.f56865d);
        int i4 = i3 + 1;
        int i5 = ((this.f56862a[i3] & 255) >> this.f56865d) & (KotlinVersion.MAX_COMPONENT_VALUE >> (8 - min));
        while (min < i2) {
            i5 |= (this.f56862a[i4] & 255) << min;
            min += 8;
            i4++;
        }
        int i6 = i5 & ((-1) >>> (32 - i2));
        m29942b(i2);
        return i6;
    }

    /* renamed from: b */
    public final boolean m29943b() {
        boolean z = (((this.f56862a[this.f56864c] & 255) >> this.f56865d) & 1) == 1;
        m29942b(1);
        return z;
    }

    /* renamed from: b */
    public final void m29942b(int i2) {
        int i3;
        int i4 = i2 / 8;
        int i5 = this.f56864c + i4;
        this.f56864c = i5;
        int i6 = (i2 - (i4 * 8)) + this.f56865d;
        this.f56865d = i6;
        boolean z = true;
        if (i6 > 7) {
            this.f56864c = i5 + 1;
            this.f56865d = i6 - 8;
        }
        int i7 = this.f56864c;
        if (i7 < 0 || (i7 >= (i3 = this.f56863b) && (i7 != i3 || this.f56865d != 0))) {
            z = false;
        }
        C5220ia.m25476b(z);
    }

    /* renamed from: a */
    public final int m29940a() {
        return (this.f56864c * 8) + this.f56865d;
    }
}
