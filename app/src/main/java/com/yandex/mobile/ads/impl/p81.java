package com.yandex.mobile.ads.impl;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
final class p81 implements w41 {

    /* renamed from: a */
    private final l81 f53403a;

    /* renamed from: b */
    private final long[] f53404b;

    /* renamed from: c */
    private final Map<String, o81> f53405c;

    /* renamed from: d */
    private final Map<String, m81> f53406d;

    /* renamed from: e */
    private final Map<String, String> f53407e;

    public p81(l81 l81Var, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.f53403a = l81Var;
        this.f53406d = hashMap2;
        this.f53407e = hashMap3;
        this.f53405c = Collections.unmodifiableMap(hashMap);
        this.f53404b = l81Var.m26395b();
    }

    @Override // com.yandex.mobile.ads.impl.w41
    /* renamed from: a */
    public final int mo22723a(long j2) {
        int m28095a = s91.m28095a(this.f53404b, j2, false);
        if (m28095a < this.f53404b.length) {
            return m28095a;
        }
        return -1;
    }

    @Override // com.yandex.mobile.ads.impl.w41
    /* renamed from: b */
    public final List<C5751sl> mo22726b(long j2) {
        return this.f53403a.m26392a(j2, this.f53405c, this.f53406d, this.f53407e);
    }

    @Override // com.yandex.mobile.ads.impl.w41
    /* renamed from: a */
    public final int mo22722a() {
        return this.f53404b.length;
    }

    @Override // com.yandex.mobile.ads.impl.w41
    /* renamed from: a */
    public final long mo22724a(int i2) {
        return this.f53404b[i2];
    }
}
