package com.yandex.mobile.ads.impl;

import java.nio.ByteBuffer;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.impl.uf */
/* loaded from: classes3.dex */
final class C5858uf {

    /* renamed from: a */
    private long f55487a;

    /* renamed from: b */
    private long f55488b;

    /* renamed from: c */
    private boolean f55489c;

    /* renamed from: a */
    public final void m28989a() {
        this.f55487a = 0L;
        this.f55488b = 0L;
        this.f55489c = false;
    }

    /* renamed from: a */
    public final long m28988a(C5606pv c5606pv, C5752sm c5752sm) {
        if (this.f55488b == 0) {
            this.f55487a = c5752sm.f54759e;
        }
        if (this.f55489c) {
            return c5752sm.f54759e;
        }
        ByteBuffer byteBuffer = c5752sm.f54757c;
        Objects.requireNonNull(byteBuffer);
        int i2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            i2 = (i2 << 8) | (byteBuffer.get(i3) & 255);
        }
        int m24576c = ff0.m24576c(i2);
        if (m24576c == -1) {
            this.f55489c = true;
            this.f55488b = 0L;
            this.f55487a = c5752sm.f54759e;
            d90.m23842d("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
            return c5752sm.f54759e;
        }
        long max = Math.max(0L, ((this.f55488b - 529) * 1000000) / c5606pv.f53834z) + this.f55487a;
        this.f55488b += m24576c;
        return max;
    }

    /* renamed from: a */
    public final long m28987a(C5606pv c5606pv) {
        return Math.max(0L, ((this.f55488b - 529) * 1000000) / c5606pv.f53834z) + this.f55487a;
    }
}
