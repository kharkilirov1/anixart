package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class t61 {

    /* renamed from: a */
    public final int f54957a;

    /* renamed from: b */
    public final int f54958b;

    /* renamed from: c */
    public final long f54959c;

    /* renamed from: d */
    public final long f54960d;

    /* renamed from: e */
    public final long f54961e;

    /* renamed from: f */
    public final C5606pv f54962f;

    /* renamed from: g */
    public final int f54963g;

    /* renamed from: h */
    @Nullable
    public final long[] f54964h;

    /* renamed from: i */
    @Nullable
    public final long[] f54965i;

    /* renamed from: j */
    public final int f54966j;

    /* renamed from: k */
    @Nullable
    private final u61[] f54967k;

    public t61(int i2, int i3, long j2, long j3, long j4, C5606pv c5606pv, int i4, @Nullable u61[] u61VarArr, int i5, @Nullable long[] jArr, @Nullable long[] jArr2) {
        this.f54957a = i2;
        this.f54958b = i3;
        this.f54959c = j2;
        this.f54960d = j3;
        this.f54961e = j4;
        this.f54962f = c5606pv;
        this.f54963g = i4;
        this.f54967k = u61VarArr;
        this.f54966j = i5;
        this.f54964h = jArr;
        this.f54965i = jArr2;
    }

    @Nullable
    /* renamed from: a */
    public final u61 m28467a(int i2) {
        u61[] u61VarArr = this.f54967k;
        if (u61VarArr == null) {
            return null;
        }
        return u61VarArr[i2];
    }
}
