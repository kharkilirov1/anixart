package com.google.android.exoplayer2.util;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class TimedValueQueue<V> {

    /* renamed from: a */
    public long[] f14728a = new long[10];

    /* renamed from: b */
    public V[] f14729b = (V[]) new Object[10];

    /* renamed from: c */
    public int f14730c;

    /* renamed from: d */
    public int f14731d;

    /* renamed from: a */
    public synchronized void m7685a(long j2, V v) {
        if (this.f14731d > 0) {
            if (j2 <= this.f14728a[((this.f14730c + r0) - 1) % this.f14729b.length]) {
                m7686b();
            }
        }
        m7687c();
        int i2 = this.f14730c;
        int i3 = this.f14731d;
        V[] vArr = this.f14729b;
        int length = (i2 + i3) % vArr.length;
        this.f14728a[length] = j2;
        vArr[length] = v;
        this.f14731d = i3 + 1;
    }

    /* renamed from: b */
    public synchronized void m7686b() {
        this.f14730c = 0;
        this.f14731d = 0;
        Arrays.fill(this.f14729b, (Object) null);
    }

    /* renamed from: c */
    public final void m7687c() {
        int length = this.f14729b.length;
        if (this.f14731d < length) {
            return;
        }
        int i2 = length * 2;
        long[] jArr = new long[i2];
        V[] vArr = (V[]) new Object[i2];
        int i3 = this.f14730c;
        int i4 = length - i3;
        System.arraycopy(this.f14728a, i3, jArr, 0, i4);
        System.arraycopy(this.f14729b, this.f14730c, vArr, 0, i4);
        int i5 = this.f14730c;
        if (i5 > 0) {
            System.arraycopy(this.f14728a, 0, jArr, i4, i5);
            System.arraycopy(this.f14729b, 0, vArr, i4, this.f14730c);
        }
        this.f14728a = jArr;
        this.f14729b = vArr;
        this.f14730c = 0;
    }

    @Nullable
    /* renamed from: d */
    public final V m7688d(long j2, boolean z) {
        V v = null;
        long j3 = Long.MAX_VALUE;
        while (this.f14731d > 0) {
            long j4 = j2 - this.f14728a[this.f14730c];
            if (j4 < 0 && (z || (-j4) >= j3)) {
                break;
            }
            v = m7690f();
            j3 = j4;
        }
        return v;
    }

    @Nullable
    /* renamed from: e */
    public synchronized V m7689e(long j2) {
        return m7688d(j2, true);
    }

    @Nullable
    /* renamed from: f */
    public final V m7690f() {
        Assertions.m7516d(this.f14731d > 0);
        V[] vArr = this.f14729b;
        int i2 = this.f14730c;
        V v = vArr[i2];
        vArr[i2] = null;
        this.f14730c = (i2 + 1) % vArr.length;
        this.f14731d--;
        return v;
    }
}
