package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class g20 {

    /* renamed from: a */
    @NotNull
    private final C5248iu f50488a = new C5248iu();

    /* renamed from: b */
    @NotNull
    private final C4964db f50489b = new C4964db();

    /* renamed from: c */
    @NotNull
    private final t21 f50490c = new t21();

    @NotNull
    /* renamed from: a */
    public final HashSet m24798a(@NotNull List assets, @Nullable a80 a80Var) {
        Object obj;
        Intrinsics.m32179h(assets, "assets");
        Objects.requireNonNull(this.f50489b);
        HashSet m23862a = C4964db.m23862a(assets);
        Intrinsics.m32178g(m23862a, "assetsImagesProvider.getAssetsImages(assets)");
        Iterator it = assets.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.m32174c(((C5276ja) obj).m25824b(), "feedback")) {
                break;
            }
        }
        Objects.requireNonNull(this.f50488a);
        ArrayList m25735a = C5248iu.m25735a((C5276ja) obj);
        Intrinsics.m32178g(m25735a, "feedbackImageProvider.ge…backImages(feedbackAsset)");
        m23862a.addAll(m25735a);
        Objects.requireNonNull(this.f50490c);
        ArrayList m28438a = t21.m28438a(assets, a80Var);
        Intrinsics.m32178g(m28438a, "socialActionImageProvide…ctionImages(assets, link)");
        m23862a.addAll(m28438a);
        return m23862a;
    }

    @NotNull
    /* renamed from: a */
    public final LinkedHashSet m24799a(@NotNull List nativeAds) {
        Intrinsics.m32179h(nativeAds, "nativeAds");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = nativeAds.iterator();
        while (it.hasNext()) {
            eh0 eh0Var = (eh0) it.next();
            List<C5276ja<?>> m24163b = eh0Var.m24163b();
            Intrinsics.m32178g(m24163b, "it.assets");
            linkedHashSet.addAll(m24798a(m24163b, eh0Var.m24172e()));
        }
        return linkedHashSet;
    }
}
