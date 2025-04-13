package com.google.android.exoplayer2.decoder;

/* loaded from: classes.dex */
public abstract class Buffer {

    /* renamed from: b */
    public int f10580b;

    /* renamed from: e */
    public final void m6238e(int i2) {
        this.f10580b = i2 | this.f10580b;
    }

    /* renamed from: f */
    public final boolean m6239f(int i2) {
        return (this.f10580b & i2) == i2;
    }

    /* renamed from: h */
    public final boolean m6240h() {
        return m6239f(268435456);
    }

    /* renamed from: i */
    public final boolean m6241i() {
        return m6239f(Integer.MIN_VALUE);
    }

    /* renamed from: j */
    public final boolean m6242j() {
        return m6239f(4);
    }

    /* renamed from: k */
    public final boolean m6243k() {
        return m6239f(1);
    }
}
