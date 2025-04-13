package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.common.AdImpressionData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class zl0 {

    /* renamed from: a */
    @Nullable
    private final String f57229a;

    /* renamed from: b */
    private final List<C5276ja<?>> f57230b;

    /* renamed from: c */
    private final List<v01> f57231c;

    /* renamed from: d */
    @NonNull
    private final List<String> f57232d;

    /* renamed from: e */
    @Nullable
    private final AdImpressionData f57233e;

    public zl0(@Nullable List list, @NonNull ArrayList arrayList, @NonNull ArrayList arrayList2, @Nullable String str, @Nullable AdImpressionData adImpressionData) {
        this.f57230b = list;
        this.f57231c = arrayList;
        this.f57232d = arrayList2;
        this.f57229a = str;
        this.f57233e = adImpressionData;
    }

    @Nullable
    /* renamed from: a */
    public final String m30211a() {
        return this.f57229a;
    }

    @NonNull
    /* renamed from: b */
    public final List<C5276ja<?>> m30212b() {
        List<C5276ja<?>> list = this.f57230b;
        return list != null ? list : Collections.emptyList();
    }

    @Nullable
    /* renamed from: c */
    public final AdImpressionData m30213c() {
        return this.f57233e;
    }

    @NonNull
    /* renamed from: d */
    public final List<String> m30214d() {
        return this.f57232d;
    }

    @NonNull
    /* renamed from: e */
    public final List<v01> m30215e() {
        return this.f57231c;
    }
}
