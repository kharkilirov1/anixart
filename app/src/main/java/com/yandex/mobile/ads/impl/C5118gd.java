package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewTreeObserver;
import com.yandex.mobile.ads.banner.AbstractC4639g;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.nativeads.InterfaceC6256u;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.gd */
/* loaded from: classes3.dex */
public final class C5118gd {

    /* renamed from: a */
    @NotNull
    private final C4806ad f50548a;

    public C5118gd(@NotNull C4806ad designProvider) {
        Intrinsics.m32179h(designProvider, "designProvider");
        this.f50548a = designProvider;
    }

    @NotNull
    /* renamed from: a */
    public final C5073fd m24842a(@NotNull Context context, @NotNull AdResponse adResponse, @NotNull InterfaceC6256u nativeAdPrivate, @NotNull AbstractC4639g container, @NotNull dj0 nativeAdEventListener, @NotNull ViewTreeObserver.OnPreDrawListener preDrawListener) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(adResponse, "adResponse");
        Intrinsics.m32179h(nativeAdPrivate, "nativeAdPrivate");
        Intrinsics.m32179h(container, "container");
        Intrinsics.m32179h(nativeAdEventListener, "nativeAdEventListener");
        Intrinsics.m32179h(preDrawListener, "preDrawListener");
        C6116zc m22464a = this.f50548a.m22464a(context, nativeAdPrivate);
        return new C5073fd(new C5020ed(context, container, CollectionsKt.m31995H(m22464a != null ? m22464a.m30147a(context, adResponse, nativeAdPrivate, nativeAdEventListener) : null), preDrawListener));
    }

    public /* synthetic */ C5118gd() {
        this(new C4806ad());
    }
}
