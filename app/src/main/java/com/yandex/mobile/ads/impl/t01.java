package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Settings;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class t01 {

    /* renamed from: a */
    private int f54915a;

    /* renamed from: b */
    @NotNull
    private final int[] f54916b = new int[10];

    /* renamed from: a */
    public final int m28428a() {
        if ((this.f54915a & 2) != 0) {
            return this.f54916b[1];
        }
        return -1;
    }

    /* renamed from: b */
    public final int m28432b() {
        return (this.f54915a & 128) != 0 ? this.f54916b[7] : Settings.DEFAULT_INITIAL_WINDOW_SIZE;
    }

    /* renamed from: c */
    public final boolean m28435c(int i2) {
        return ((1 << i2) & this.f54915a) != 0;
    }

    /* renamed from: d */
    public final int m28436d() {
        return Integer.bitCount(this.f54915a);
    }

    @NotNull
    /* renamed from: a */
    public final void m28430a(int i2, int i3) {
        if (i2 >= 0) {
            int[] iArr = this.f54916b;
            if (i2 >= iArr.length) {
                return;
            }
            this.f54915a = (1 << i2) | this.f54915a;
            iArr[i2] = i3;
        }
    }

    /* renamed from: b */
    public final int m28433b(int i2) {
        return (this.f54915a & 32) != 0 ? this.f54916b[5] : i2;
    }

    /* renamed from: c */
    public final int m28434c() {
        if ((this.f54915a & 16) != 0) {
            return this.f54916b[4];
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: a */
    public final int m28429a(int i2) {
        return this.f54916b[i2];
    }

    /* renamed from: a */
    public final void m28431a(@NotNull t01 other) {
        Intrinsics.m32179h(other, "other");
        for (int i2 = 0; i2 < 10; i2++) {
            if (other.m28435c(i2)) {
                m28430a(i2, other.f54916b[i2]);
            }
        }
    }
}
