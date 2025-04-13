package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.util.Assertions;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class VorbisBitArray {

    /* renamed from: a */
    public final byte[] f10890a;

    /* renamed from: b */
    public final int f10891b;

    /* renamed from: c */
    public int f10892c;

    /* renamed from: d */
    public int f10893d;

    public VorbisBitArray(byte[] bArr) {
        this.f10890a = bArr;
        this.f10891b = bArr.length;
    }

    /* renamed from: a */
    public boolean m6428a() {
        boolean z = (((this.f10890a[this.f10892c] & 255) >> this.f10893d) & 1) == 1;
        m6430c(1);
        return z;
    }

    /* renamed from: b */
    public int m6429b(int i2) {
        int i3 = this.f10892c;
        int min = Math.min(i2, 8 - this.f10893d);
        int i4 = i3 + 1;
        int i5 = ((this.f10890a[i3] & 255) >> this.f10893d) & (KotlinVersion.MAX_COMPONENT_VALUE >> (8 - min));
        while (min < i2) {
            i5 |= (this.f10890a[i4] & 255) << min;
            min += 8;
            i4++;
        }
        int i6 = i5 & ((-1) >>> (32 - i2));
        m6430c(i2);
        return i6;
    }

    /* renamed from: c */
    public void m6430c(int i2) {
        int i3;
        int i4 = i2 / 8;
        int i5 = this.f10892c + i4;
        this.f10892c = i5;
        int i6 = (i2 - (i4 * 8)) + this.f10893d;
        this.f10893d = i6;
        boolean z = true;
        if (i6 > 7) {
            this.f10892c = i5 + 1;
            this.f10893d = i6 - 8;
        }
        int i7 = this.f10892c;
        if (i7 < 0 || (i7 >= (i3 = this.f10891b) && (i7 != i3 || this.f10893d != 0))) {
            z = false;
        }
        Assertions.m7516d(z);
    }
}
