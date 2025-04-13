package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ej1 {
    @NotNull
    /* renamed from: a */
    public static wg1 m24183a(@NotNull pb1 inlineVideoAd, @NotNull pb1 wrapperVideoAd) {
        Intrinsics.m32179h(inlineVideoAd, "inlineVideoAd");
        Intrinsics.m32179h(wrapperVideoAd, "wrapperVideoAd");
        List m31994G = CollectionsKt.m31994G(inlineVideoAd, wrapperVideoAd);
        ArrayList arrayList = new ArrayList();
        Iterator it = m31994G.iterator();
        while (it.hasNext()) {
            wg1 m27274m = ((pb1) it.next()).m27274m();
            List<String> m29482a = m27274m != null ? m27274m.m29482a() : null;
            if (m29482a == null) {
                m29482a = EmptyList.f63144b;
            }
            CollectionsKt.m32020g(arrayList, m29482a);
        }
        return new wg1(arrayList);
    }
}
