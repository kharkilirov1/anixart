package com.yandex.mobile.ads.impl;

import java.util.Arrays;

/* loaded from: classes3.dex */
final class bh0 {

    /* renamed from: a */
    private final int f48877a;

    /* renamed from: b */
    private boolean f48878b;

    /* renamed from: c */
    private boolean f48879c;

    /* renamed from: d */
    public byte[] f48880d;

    /* renamed from: e */
    public int f48881e;

    public bh0(int i2) {
        this.f48877a = i2;
        byte[] bArr = new byte[131];
        this.f48880d = bArr;
        bArr[2] = 1;
    }

    /* renamed from: a */
    public final boolean m22829a() {
        return this.f48879c;
    }

    /* renamed from: b */
    public final void m22831b() {
        this.f48878b = false;
        this.f48879c = false;
    }

    /* renamed from: a */
    public final void m22828a(byte[] bArr, int i2, int i3) {
        if (this.f48878b) {
            int i4 = i3 - i2;
            byte[] bArr2 = this.f48880d;
            int length = bArr2.length;
            int i5 = this.f48881e + i4;
            if (length < i5) {
                this.f48880d = Arrays.copyOf(bArr2, i5 * 2);
            }
            System.arraycopy(bArr, i2, this.f48880d, this.f48881e, i4);
            this.f48881e += i4;
        }
    }

    /* renamed from: b */
    public final void m22832b(int i2) {
        C5220ia.m25476b(!this.f48878b);
        boolean z = i2 == this.f48877a;
        this.f48878b = z;
        if (z) {
            this.f48881e = 3;
            this.f48879c = false;
        }
    }

    /* renamed from: a */
    public final boolean m22830a(int i2) {
        if (!this.f48878b) {
            return false;
        }
        this.f48881e -= i2;
        this.f48878b = false;
        this.f48879c = true;
        return true;
    }
}
