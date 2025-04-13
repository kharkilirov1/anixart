package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class e20 {

    /* renamed from: a */
    @NotNull
    private final b20 f49780a = new b20();

    /* renamed from: a */
    public final void m23989a(@NotNull kh0 nativeAdBlock, @NotNull Map<String, Bitmap> images) {
        Intrinsics.m32179h(nativeAdBlock, "nativeAdBlock");
        Intrinsics.m32179h(images, "images");
        Iterator<eh0> it = nativeAdBlock.m26128c().m27736d().iterator();
        while (it.hasNext()) {
            List<C5276ja<?>> m24163b = it.next().m24163b();
            if (m24163b != null && (!m24163b.isEmpty())) {
                m23990a(m24163b, images);
            }
        }
    }

    /* renamed from: a */
    public final void m23990a(@NotNull List<? extends C5276ja<?>> assets, @NotNull Map<String, Bitmap> images) {
        List<z10> m25863a;
        Intrinsics.m32179h(assets, "assets");
        Intrinsics.m32179h(images, "images");
        for (C5276ja<?> c5276ja : assets) {
            Object m25826d = c5276ja.m25826d();
            String m25825c = c5276ja.m25825c();
            Intrinsics.m32178g(m25825c, "asset.type");
            if (Intrinsics.m32174c(m25825c, "media") && (m25826d instanceof jc0) && (m25863a = ((jc0) m25826d).m25863a()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : m25863a) {
                    z10 imageValue = (z10) obj;
                    b20 b20Var = this.f49780a;
                    Intrinsics.m32178g(imageValue, "imageValue");
                    Objects.requireNonNull(b20Var);
                    if (b20.m22711a(imageValue, images)) {
                        arrayList.add(obj);
                    }
                }
                m25863a.retainAll(arrayList);
            }
        }
    }
}
