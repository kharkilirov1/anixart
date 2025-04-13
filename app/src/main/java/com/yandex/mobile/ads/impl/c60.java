package com.yandex.mobile.ads.impl;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
final class c60 {

    /* renamed from: a */
    private int f49092a = 0;

    /* renamed from: b */
    private int f49093b = -1;

    /* renamed from: c */
    private int f49094c = 0;

    /* renamed from: d */
    private int[] f49095d = new int[16];

    /* renamed from: e */
    private int f49096e = 15;

    /* renamed from: a */
    public final void m23028a(int i2) {
        int i3 = this.f49094c;
        int[] iArr = this.f49095d;
        if (i3 == iArr.length) {
            int length = iArr.length << 1;
            if (length < 0) {
                throw new IllegalStateException();
            }
            int[] iArr2 = new int[length];
            int length2 = iArr.length;
            int i4 = this.f49092a;
            int i5 = length2 - i4;
            System.arraycopy(iArr, i4, iArr2, 0, i5);
            System.arraycopy(this.f49095d, 0, iArr2, i5, i4);
            this.f49092a = 0;
            this.f49093b = this.f49094c - 1;
            this.f49095d = iArr2;
            this.f49096e = length - 1;
        }
        int i6 = (this.f49093b + 1) & this.f49096e;
        this.f49093b = i6;
        this.f49095d[i6] = i2;
        this.f49094c++;
    }

    /* renamed from: b */
    public final boolean m23029b() {
        return this.f49094c == 0;
    }

    /* renamed from: c */
    public final int m23030c() {
        int i2 = this.f49094c;
        if (i2 == 0) {
            throw new NoSuchElementException();
        }
        int[] iArr = this.f49095d;
        int i3 = this.f49092a;
        int i4 = iArr[i3];
        this.f49092a = (i3 + 1) & this.f49096e;
        this.f49094c = i2 - 1;
        return i4;
    }

    /* renamed from: a */
    public final void m23027a() {
        this.f49092a = 0;
        this.f49093b = -1;
        this.f49094c = 0;
    }
}
