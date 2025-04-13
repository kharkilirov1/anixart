package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.nativeads.C6264w;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.zs */
/* loaded from: classes3.dex */
public final class C6138zs {

    /* renamed from: a */
    @Nullable
    private final List<C5276ja<?>> f57303a;

    public C6138zs(@Nullable List<C5276ja<?>> list) {
        this.f57303a = list;
    }

    @NonNull
    /* renamed from: a */
    public final ArrayList m30292a(@NonNull C6264w c6264w) {
        InterfaceC5330ka m30749a;
        ArrayList arrayList = new ArrayList();
        for (C5276ja<?> c5276ja : this.f57303a) {
            if (!c5276ja.m25828f() && ((m30749a = c6264w.m30749a(c5276ja)) == null || !m30749a.mo23912b())) {
                arrayList.add(c5276ja.m25824b());
            }
        }
        return arrayList;
    }
}
