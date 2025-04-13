package com.google.android.exoplayer2.util;

import androidx.room.util.C0576a;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class LongArray {

    /* renamed from: a */
    public int f14652a;

    /* renamed from: b */
    public long[] f14653b = new long[32];

    /* renamed from: a */
    public void m7589a(long j2) {
        int i2 = this.f14652a;
        long[] jArr = this.f14653b;
        if (i2 == jArr.length) {
            this.f14653b = Arrays.copyOf(jArr, i2 * 2);
        }
        long[] jArr2 = this.f14653b;
        int i3 = this.f14652a;
        this.f14652a = i3 + 1;
        jArr2[i3] = j2;
    }

    /* renamed from: b */
    public long m7590b(int i2) {
        if (i2 < 0 || i2 >= this.f14652a) {
            throw new IndexOutOfBoundsException(C0576a.m4112k(46, "Invalid index ", i2, ", size is ", this.f14652a));
        }
        return this.f14653b[i2];
    }
}
