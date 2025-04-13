package com.yandex.mobile.ads.impl;

import java.io.IOException;

/* loaded from: classes3.dex */
final class ba1 {

    /* renamed from: d */
    private static final long[] f48806d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a */
    private final byte[] f48807a = new byte[8];

    /* renamed from: b */
    private int f48808b;

    /* renamed from: c */
    private int f48809c;

    /* renamed from: a */
    public final long m22758a(C5598pn c5598pn, boolean z, boolean z2, int i2) throws IOException {
        if (this.f48808b == 0) {
            if (!c5598pn.mo26762a(this.f48807a, 0, 1, z)) {
                return -1L;
            }
            int m22755a = m22755a(this.f48807a[0] & 255);
            this.f48809c = m22755a;
            if (m22755a == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f48808b = 1;
        }
        int i3 = this.f48809c;
        if (i3 > i2) {
            this.f48808b = 0;
            return -2L;
        }
        if (i3 != 1) {
            c5598pn.mo26762a(this.f48807a, 1, i3 - 1, false);
        }
        this.f48808b = 0;
        return m22756a(this.f48807a, this.f48809c, z2);
    }

    /* renamed from: b */
    public final void m22759b() {
        this.f48808b = 0;
        this.f48809c = 0;
    }

    /* renamed from: a */
    public final int m22757a() {
        return this.f48809c;
    }

    /* renamed from: a */
    public static int m22755a(int i2) {
        long j2;
        int i3 = 0;
        do {
            long[] jArr = f48806d;
            if (i3 >= 8) {
                return -1;
            }
            j2 = jArr[i3] & i2;
            i3++;
        } while (j2 == 0);
        return i3;
    }

    /* renamed from: a */
    public static long m22756a(byte[] bArr, int i2, boolean z) {
        long j2 = bArr[0] & 255;
        if (z) {
            j2 &= ~f48806d[i2 - 1];
        }
        for (int i3 = 1; i3 < i2; i3++) {
            j2 = (j2 << 8) | (bArr[i3] & 255);
        }
        return j2;
    }
}
