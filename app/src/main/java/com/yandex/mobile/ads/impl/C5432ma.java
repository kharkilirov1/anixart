package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.TextView;
import com.yandex.mobile.ads.nativeads.C6201b0;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.ma */
/* loaded from: classes3.dex */
public final class C5432ma {

    /* renamed from: a */
    @NotNull
    private final C6201b0 f52613a;

    /* renamed from: b */
    @NotNull
    private final C5390la f52614b;

    /* renamed from: c */
    @NotNull
    private final List<C5276ja<?>> f52615c;

    /* JADX WARN: Multi-variable type inference failed */
    public C5432ma(@NotNull C6201b0 nativeAdViewProvider, @NotNull C5390la assetAdapterCreator, @NotNull List<? extends C5276ja<?>> assets) {
        Intrinsics.m32179h(nativeAdViewProvider, "nativeAdViewProvider");
        Intrinsics.m32179h(assetAdapterCreator, "assetAdapterCreator");
        Intrinsics.m32179h(assets, "assets");
        this.f52613a = nativeAdViewProvider;
        this.f52614b = assetAdapterCreator;
        this.f52615c = assets;
    }

    @NotNull
    /* renamed from: a */
    public final HashMap m26599a() {
        HashMap hashMap = new HashMap();
        C5390la c5390la = this.f52614b;
        TextView m30506e = this.f52613a.m30506e();
        Objects.requireNonNull(c5390la);
        hashMap.put("close_button", C5390la.m26400a(m30506e));
        hashMap.put("feedback", this.f52614b.m26403a(this.f52613a.m30509h()));
        hashMap.put("media", this.f52614b.m26404a(this.f52613a.m30511j(), this.f52613a.m30512k()));
        C5390la c5390la2 = this.f52614b;
        View m30515n = this.f52613a.m30515n();
        Objects.requireNonNull(c5390la2);
        hashMap.put("rating", C5390la.m26401b(m30515n));
        for (C5276ja<?> c5276ja : this.f52615c) {
            View m30501a = this.f52613a.m30501a(c5276ja.m25824b());
            if (m30501a != null && !hashMap.containsKey(c5276ja.m25824b())) {
                C5390la c5390la3 = this.f52614b;
                String m25825c = c5276ja.m25825c();
                Intrinsics.m32178g(m25825c, "asset.type");
                InterfaceC5330ka<?> m26402a = c5390la3.m26402a(m30501a, m25825c);
                if (m26402a == null) {
                    Objects.requireNonNull(this.f52614b);
                    m26402a = C5390la.m26399a(m30501a);
                }
                String m25824b = c5276ja.m25824b();
                Intrinsics.m32178g(m25824b, "asset.name");
                hashMap.put(m25824b, m26402a);
            }
        }
        LinkedHashMap m30503b = this.f52613a.m30503b();
        Intrinsics.m32178g(m30503b, "nativeAdViewProvider.assetViews");
        for (Map.Entry entry : m30503b.entrySet()) {
            String assetName = (String) entry.getKey();
            View view = (View) ((WeakReference) entry.getValue()).get();
            if (view != null && !hashMap.containsKey(assetName)) {
                Intrinsics.m32178g(assetName, "assetName");
                Objects.requireNonNull(this.f52614b);
                hashMap.put(assetName, C5390la.m26399a(view));
            }
        }
        return hashMap;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C5432ma(@org.jetbrains.annotations.NotNull com.yandex.mobile.ads.nativeads.C6201b0 r2, @org.jetbrains.annotations.NotNull com.yandex.mobile.ads.impl.w10 r3, @org.jetbrains.annotations.NotNull com.yandex.mobile.ads.impl.oc0 r4, @org.jetbrains.annotations.NotNull com.yandex.mobile.ads.impl.zj0 r5, @org.jetbrains.annotations.NotNull com.yandex.mobile.ads.impl.nj0 r6, @org.jetbrains.annotations.NotNull com.yandex.mobile.ads.impl.zl0 r7) {
        /*
            r1 = this;
            java.lang.String r0 = "nativeAdViewProvider"
            kotlin.jvm.internal.Intrinsics.m32179h(r2, r0)
            java.lang.String r0 = "imageProvider"
            kotlin.jvm.internal.Intrinsics.m32179h(r3, r0)
            java.lang.String r0 = "mediaViewAdapterCreator"
            kotlin.jvm.internal.Intrinsics.m32179h(r4, r0)
            java.lang.String r0 = "nativeMediaContent"
            kotlin.jvm.internal.Intrinsics.m32179h(r5, r0)
            java.lang.String r0 = "nativeForcePauseObserver"
            kotlin.jvm.internal.Intrinsics.m32179h(r6, r0)
            java.lang.String r0 = "nativeVisualBlock"
            kotlin.jvm.internal.Intrinsics.m32179h(r7, r0)
            com.yandex.mobile.ads.impl.la r0 = new com.yandex.mobile.ads.impl.la
            r0.<init>(r3, r4, r5, r6)
            java.util.List r3 = r7.m30212b()
            java.lang.String r4 = "nativeVisualBlock.assets"
            kotlin.jvm.internal.Intrinsics.m32178g(r3, r4)
            r1.<init>(r2, r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C5432ma.<init>(com.yandex.mobile.ads.nativeads.b0, com.yandex.mobile.ads.impl.w10, com.yandex.mobile.ads.impl.oc0, com.yandex.mobile.ads.impl.zj0, com.yandex.mobile.ads.impl.nj0, com.yandex.mobile.ads.impl.zl0):void");
    }
}
