package com.google.android.exoplayer2.mediacodec;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class IntArrayQueue {

    /* renamed from: a */
    public int f11868a = 0;

    /* renamed from: b */
    public int f11869b = -1;

    /* renamed from: c */
    public int f11870c = 0;

    /* renamed from: d */
    public int[] f11871d = new int[16];

    /* renamed from: e */
    public int f11872e;

    public IntArrayQueue() {
        this.f11872e = r0.length - 1;
    }

    /* renamed from: a */
    public void m6635a(int i2) {
        int i3 = this.f11870c;
        int[] iArr = this.f11871d;
        if (i3 == iArr.length) {
            int length = iArr.length << 1;
            if (length < 0) {
                throw new IllegalStateException();
            }
            int[] iArr2 = new int[length];
            int length2 = iArr.length;
            int i4 = this.f11868a;
            int i5 = length2 - i4;
            System.arraycopy(iArr, i4, iArr2, 0, i5);
            System.arraycopy(this.f11871d, 0, iArr2, i5, i4);
            this.f11868a = 0;
            this.f11869b = this.f11870c - 1;
            this.f11871d = iArr2;
            this.f11872e = length - 1;
        }
        int i6 = (this.f11869b + 1) & this.f11872e;
        this.f11869b = i6;
        this.f11871d[i6] = i2;
        this.f11870c++;
    }

    /* renamed from: b */
    public int m6636b() {
        int i2 = this.f11870c;
        if (i2 == 0) {
            throw new NoSuchElementException();
        }
        int[] iArr = this.f11871d;
        int i3 = this.f11868a;
        int i4 = iArr[i3];
        this.f11868a = (i3 + 1) & this.f11872e;
        this.f11870c = i2 - 1;
        return i4;
    }
}
