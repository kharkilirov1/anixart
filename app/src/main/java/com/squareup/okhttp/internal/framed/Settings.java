package com.squareup.okhttp.internal.framed;

/* loaded from: classes2.dex */
public final class Settings {

    /* renamed from: a */
    public int f25125a;

    /* renamed from: b */
    public int f25126b;

    /* renamed from: c */
    public int f25127c;

    /* renamed from: d */
    public final int[] f25128d = new int[10];

    /* renamed from: a */
    public int m13996a(int i2) {
        int i3 = 1 << i2;
        int i4 = (this.f25127c & i3) != 0 ? 2 : 0;
        return (i3 & this.f25126b) != 0 ? i4 | 1 : i4;
    }

    /* renamed from: b */
    public int m13997b(int i2) {
        return (this.f25125a & 128) != 0 ? this.f25128d[7] : i2;
    }

    /* renamed from: c */
    public boolean m13998c(int i2) {
        return ((1 << i2) & this.f25125a) != 0;
    }

    /* renamed from: d */
    public Settings m13999d(int i2, int i3, int i4) {
        int[] iArr = this.f25128d;
        if (i2 >= iArr.length) {
            return this;
        }
        int i5 = 1 << i2;
        this.f25125a |= i5;
        if ((i3 & 1) != 0) {
            this.f25126b |= i5;
        } else {
            this.f25126b &= ~i5;
        }
        if ((i3 & 2) != 0) {
            this.f25127c |= i5;
        } else {
            this.f25127c &= ~i5;
        }
        iArr[i2] = i4;
        return this;
    }
}
