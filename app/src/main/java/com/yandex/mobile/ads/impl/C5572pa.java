package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.nativeads.AbstractC6202c;
import com.yandex.mobile.ads.nativeads.C6264w;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.pa */
/* loaded from: classes3.dex */
public final class C5572pa {

    /* renamed from: a */
    @NotNull
    private final LinkedHashMap f53413a;

    public C5572pa(@NotNull AbstractC6202c clickListenerFactory, @NotNull List<? extends C5276ja<?>> assets, @NotNull C4953d2 adClickHandler, @NotNull C6264w<View> viewAdapter, @NotNull bv0 renderedTimer, @NotNull l20 impressionEventsObservable, @Nullable a80 a80Var) {
        Intrinsics.m32179h(clickListenerFactory, "clickListenerFactory");
        Intrinsics.m32179h(assets, "assets");
        Intrinsics.m32179h(adClickHandler, "adClickHandler");
        Intrinsics.m32179h(viewAdapter, "viewAdapter");
        Intrinsics.m32179h(renderedTimer, "renderedTimer");
        Intrinsics.m32179h(impressionEventsObservable, "impressionEventsObservable");
        int m32062g = MapsKt.m32062g(CollectionsKt.m32032m(assets, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(m32062g < 16 ? 16 : m32062g);
        Iterator<T> it = assets.iterator();
        while (it.hasNext()) {
            C5276ja c5276ja = (C5276ja) it.next();
            String m25824b = c5276ja.m25824b();
            a80 m25823a = c5276ja.m25823a();
            linkedHashMap.put(m25824b, clickListenerFactory.mo30537a(impressionEventsObservable, renderedTimer, adClickHandler, viewAdapter, c5276ja, m25823a == null ? a80Var : m25823a));
        }
        this.f53413a = linkedHashMap;
    }

    /* renamed from: a */
    public final void m27197a(@NotNull View view, @NotNull String assetName) {
        Intrinsics.m32179h(view, "view");
        Intrinsics.m32179h(assetName, "assetName");
        View.OnClickListener onClickListener = (View.OnClickListener) this.f53413a.get(assetName);
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }
}
