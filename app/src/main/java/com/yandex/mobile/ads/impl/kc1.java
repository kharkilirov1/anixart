package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class kc1<T> {

    /* renamed from: a */
    @NonNull
    private final vd1 f51946a = new vd1();

    /* renamed from: b */
    @NonNull
    private final wa1 f51947b;

    /* renamed from: c */
    @NonNull
    private final ic1<T> f51948c;

    public kc1(@NonNull Context context, @NonNull vc1<T> vc1Var) {
        this.f51947b = new wa1(context);
        this.f51948c = new ic1<>(vc1Var);
    }

    @NonNull
    /* renamed from: a */
    public final ArrayList m26105a(@NonNull List list) {
        Objects.requireNonNull(this.f51946a);
        ArrayList m29426a = this.f51947b.m29426a(vd1.m29217a(list));
        int size = m29426a.size();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < m29426a.size(); i2++) {
            arrayList.add(this.f51948c.m25523a((va1) m29426a.get(i2), size, i2));
        }
        return arrayList;
    }
}
