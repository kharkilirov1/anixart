package com.google.android.exoplayer2.extractor.p008ts;

import com.google.android.exoplayer2.util.Assertions;
import java.util.Arrays;

/* loaded from: classes.dex */
final class NalUnitTargetBuffer {

    /* renamed from: a */
    public final int f11640a;

    /* renamed from: b */
    public boolean f11641b;

    /* renamed from: c */
    public boolean f11642c;

    /* renamed from: d */
    public byte[] f11643d;

    /* renamed from: e */
    public int f11644e;

    public NalUnitTargetBuffer(int i2, int i3) {
        this.f11640a = i2;
        byte[] bArr = new byte[i3 + 3];
        this.f11643d = bArr;
        bArr[2] = 1;
    }

    /* renamed from: a */
    public void m6572a(byte[] bArr, int i2, int i3) {
        if (this.f11641b) {
            int i4 = i3 - i2;
            byte[] bArr2 = this.f11643d;
            int length = bArr2.length;
            int i5 = this.f11644e;
            if (length < i5 + i4) {
                this.f11643d = Arrays.copyOf(bArr2, (i5 + i4) * 2);
            }
            System.arraycopy(bArr, i2, this.f11643d, this.f11644e, i4);
            this.f11644e += i4;
        }
    }

    /* renamed from: b */
    public boolean m6573b(int i2) {
        if (!this.f11641b) {
            return false;
        }
        this.f11644e -= i2;
        this.f11641b = false;
        this.f11642c = true;
        return true;
    }

    /* renamed from: c */
    public void m6574c() {
        this.f11641b = false;
        this.f11642c = false;
    }

    /* renamed from: d */
    public void m6575d(int i2) {
        Assertions.m7516d(!this.f11641b);
        boolean z = i2 == this.f11640a;
        this.f11641b = z;
        if (z) {
            this.f11644e = 3;
            this.f11642c = false;
        }
    }
}
