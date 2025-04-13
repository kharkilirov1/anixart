package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class pk0 {

    /* renamed from: a */
    @NotNull
    private final lc0 f53571a = new lc0();

    /* renamed from: a */
    public final boolean m27336a(@NotNull kh0 nativeAdBlock) {
        Intrinsics.m32179h(nativeAdBlock, "nativeAdBlock");
        List<eh0> m27736d = nativeAdBlock.m26128c().m27736d();
        Intrinsics.m32178g(m27736d, "nativeAdBlock.nativeAdResponse.nativeAds");
        ArrayList arrayList = new ArrayList();
        for (eh0 eh0Var : m27736d) {
            Objects.requireNonNull(this.f53571a);
            HashSet m26426a = lc0.m26426a(eh0Var);
            Intrinsics.m32178g(m26426a, "mediaValuesProvider.getMediaValues(nativeAd)");
            CollectionsKt.m32020g(arrayList, m26426a);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ob1 m25865c = ((jc0) it.next()).m25865c();
            List<hc1<il0>> m27066b = m25865c != null ? m25865c.m27066b() : null;
            if (m27066b == null) {
                m27066b = EmptyList.f63144b;
            }
            CollectionsKt.m32020g(arrayList2, m27066b);
        }
        if (!arrayList2.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Intrinsics.m32178g(((hc1) it2.next()).m25120e().m27265d(), "videoAdInfo.vastVideoAd.adVerifications");
                if (!r0.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }
}
