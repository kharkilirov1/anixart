package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class j61<V> {

    /* renamed from: a */
    private long[] f51520a;

    /* renamed from: b */
    private V[] f51521b;

    /* renamed from: c */
    private int f51522c;

    /* renamed from: d */
    private int f51523d;

    public j61() {
        this(0);
    }

    /* renamed from: b */
    private static Object[] m25805b() {
        return new Object[10];
    }

    /* renamed from: a */
    public final synchronized void m25807a() {
        this.f51522c = 0;
        this.f51523d = 0;
        Arrays.fill(this.f51521b, (Object) null);
    }

    @Nullable
    /* renamed from: b */
    public final synchronized V m25809b(long j2) {
        V v;
        v = null;
        while (true) {
            int i2 = this.f51523d;
            if (i2 <= 0 || j2 - this.f51520a[this.f51522c] < 0) {
                break;
            }
            C5220ia.m25476b(i2 > 0);
            V[] vArr = this.f51521b;
            int i3 = this.f51522c;
            V v2 = vArr[i3];
            vArr[i3] = null;
            this.f51522c = (i3 + 1) % vArr.length;
            this.f51523d--;
            v = v2;
        }
        return v;
    }

    @Nullable
    /* renamed from: c */
    public final synchronized V m25810c() {
        V v;
        int i2 = this.f51523d;
        v = null;
        if (i2 != 0) {
            C5220ia.m25476b(i2 > 0);
            V[] vArr = this.f51521b;
            int i3 = this.f51522c;
            V v2 = vArr[i3];
            vArr[i3] = null;
            this.f51522c = (i3 + 1) % vArr.length;
            this.f51523d--;
            v = v2;
        }
        return v;
    }

    /* renamed from: d */
    public final synchronized int m25811d() {
        return this.f51523d;
    }

    public j61(int i2) {
        this.f51520a = new long[10];
        this.f51521b = (V[]) m25805b();
    }

    @Nullable
    /* renamed from: a */
    public final synchronized V m25806a(long j2) {
        V v;
        long j3 = Long.MAX_VALUE;
        v = null;
        while (true) {
            int i2 = this.f51523d;
            if (i2 <= 0) {
                break;
            }
            long j4 = j2 - this.f51520a[this.f51522c];
            if (j4 < 0 && (-j4) >= j3) {
                break;
            }
            C5220ia.m25476b(i2 > 0);
            V[] vArr = this.f51521b;
            int i3 = this.f51522c;
            V v2 = vArr[i3];
            vArr[i3] = null;
            this.f51522c = (i3 + 1) % vArr.length;
            this.f51523d--;
            v = v2;
            j3 = j4;
        }
        return v;
    }

    /* renamed from: a */
    public final synchronized void m25808a(Object obj, long j2) {
        if (this.f51523d > 0) {
            if (j2 <= this.f51520a[((this.f51522c + r0) - 1) % this.f51521b.length]) {
                m25807a();
            }
        }
        int length = this.f51521b.length;
        if (this.f51523d >= length) {
            int i2 = length * 2;
            long[] jArr = new long[i2];
            V[] vArr = (V[]) new Object[i2];
            int i3 = this.f51522c;
            int i4 = length - i3;
            System.arraycopy(this.f51520a, i3, jArr, 0, i4);
            System.arraycopy(this.f51521b, this.f51522c, vArr, 0, i4);
            int i5 = this.f51522c;
            if (i5 > 0) {
                System.arraycopy(this.f51520a, 0, jArr, i4, i5);
                System.arraycopy(this.f51521b, 0, vArr, i4, this.f51522c);
            }
            this.f51520a = jArr;
            this.f51521b = vArr;
            this.f51522c = 0;
        }
        int i6 = this.f51522c;
        int i7 = this.f51523d;
        Object[] objArr = (V[]) this.f51521b;
        int length2 = (i6 + i7) % objArr.length;
        this.f51520a[length2] = j2;
        objArr[length2] = obj;
        this.f51523d = i7 + 1;
    }
}
