package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class yf1 {
    @NotNull
    /* renamed from: a */
    public static ArrayList m29938a(@NotNull ArrayList trackingUrls) {
        Intrinsics.m32179h(trackingUrls, "trackingUrls");
        ArrayList arrayList = new ArrayList();
        Iterator it = trackingUrls.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!Intrinsics.m32174c((String) next, "about:blank")) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
