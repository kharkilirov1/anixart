package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.nativeads.C6264w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class av0 {

    /* renamed from: a */
    @NotNull
    private final List<C5276ja> f48659a;

    /* JADX WARN: Multi-variable type inference failed */
    public av0(@NotNull List<? extends C5276ja> assets) {
        Intrinsics.m32179h(assets, "assets");
        this.f48659a = assets;
    }

    @NotNull
    /* renamed from: a */
    public final ArrayList m22630a(@NotNull C6264w viewAdapter) {
        Intrinsics.m32179h(viewAdapter, "viewAdapter");
        List<C5276ja> list = this.f48659a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            InterfaceC5330ka m30749a = viewAdapter.m30749a((C5276ja) obj);
            if (m30749a != null ? m30749a.mo23912b() : false) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.m32032m(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C5276ja) it.next()).m25824b());
        }
        return arrayList2;
    }
}
