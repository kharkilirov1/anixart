package com.yandex.mobile.ads.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
final class jr0 extends AbstractC4995e {

    /* renamed from: e */
    private final int f51718e;

    /* renamed from: f */
    private final int f51719f;

    /* renamed from: g */
    private final int[] f51720g;

    /* renamed from: h */
    private final int[] f51721h;

    /* renamed from: i */
    private final k61[] f51722i;

    /* renamed from: j */
    private final Object[] f51723j;

    /* renamed from: k */
    private final HashMap<Object, Integer> f51724k;

    public jr0(List list, x01 x01Var) {
        super(x01Var);
        int size = list.size();
        this.f51720g = new int[size];
        this.f51721h = new int[size];
        this.f51722i = new k61[size];
        this.f51723j = new Object[size];
        this.f51724k = new HashMap<>();
        Iterator it = list.iterator();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (it.hasNext()) {
            dc0 dc0Var = (dc0) it.next();
            this.f51722i[i4] = dc0Var.mo23867b();
            this.f51721h[i4] = i2;
            this.f51720g[i4] = i3;
            i2 += this.f51722i[i4].mo25935b();
            i3 += this.f51722i[i4].mo25934a();
            this.f51723j[i4] = dc0Var.mo23866a();
            this.f51724k.put(this.f51723j[i4], Integer.valueOf(i4));
            i4++;
        }
        this.f51718e = i2;
        this.f51719f = i3;
    }

    @Override // com.yandex.mobile.ads.impl.k61
    /* renamed from: a */
    public final int mo25934a() {
        return this.f51719f;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC4995e
    /* renamed from: b */
    public final int mo23976b(int i2) {
        return s91.m28094a(this.f51720g, i2 + 1, false, false);
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC4995e
    /* renamed from: c */
    public final int mo23980c(int i2) {
        return s91.m28094a(this.f51721h, i2 + 1, false, false);
    }

    /* renamed from: d */
    public final List<k61> m25936d() {
        return Arrays.asList(this.f51722i);
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC4995e
    /* renamed from: e */
    public final int mo23982e(int i2) {
        return this.f51720g[i2];
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC4995e
    /* renamed from: f */
    public final int mo23983f(int i2) {
        return this.f51721h[i2];
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC4995e
    /* renamed from: g */
    public final k61 mo23984g(int i2) {
        return this.f51722i[i2];
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC4995e
    /* renamed from: b */
    public final int mo23978b(Object obj) {
        Integer num = this.f51724k.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC4995e
    /* renamed from: d */
    public final Object mo23981d(int i2) {
        return this.f51723j[i2];
    }

    @Override // com.yandex.mobile.ads.impl.k61
    /* renamed from: b */
    public final int mo25935b() {
        return this.f51718e;
    }
}
