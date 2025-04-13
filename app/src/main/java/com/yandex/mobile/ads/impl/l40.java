package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class l40 {

    /* renamed from: a */
    @NotNull
    private final hc1<VideoAd> f52253a;

    /* renamed from: b */
    @NotNull
    private final C5135gl f52254b;

    /* renamed from: c */
    @NotNull
    private final p31 f52255c;

    /* renamed from: d */
    @NotNull
    private final C5240in f52256d;

    public l40(@NotNull Context context, @NotNull hc1<VideoAd> videoAdInfo, @NotNull C5135gl creativeAssetsProvider, @NotNull p31 sponsoredAssetProviderCreator, @NotNull C5240in callToActionAssetProvider) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(videoAdInfo, "videoAdInfo");
        Intrinsics.m32179h(creativeAssetsProvider, "creativeAssetsProvider");
        Intrinsics.m32179h(sponsoredAssetProviderCreator, "sponsoredAssetProviderCreator");
        Intrinsics.m32179h(callToActionAssetProvider, "callToActionAssetProvider");
        this.f52253a = videoAdInfo;
        this.f52254b = creativeAssetsProvider;
        this.f52255c = sponsoredAssetProviderCreator;
        this.f52256d = callToActionAssetProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* renamed from: a */
    public final List<C5276ja<?>> m26350a() {
        Object obj;
        C5083fl m25116a = this.f52253a.m25116a();
        Intrinsics.m32178g(m25116a, "videoAdInfo.creative");
        Objects.requireNonNull(this.f52254b);
        List<C5276ja<?>> m32031l0 = CollectionsKt.m32031l0(C5135gl.m24919a(m25116a));
        for (Pair pair : CollectionsKt.m31994G(new Pair("sponsored", this.f52255c.m27161a()), new Pair("call_to_action", this.f52256d))) {
            String str = (String) pair.f63055b;
            InterfaceC5037en interfaceC5037en = (InterfaceC5037en) pair.f63056c;
            ArrayList arrayList = (ArrayList) m32031l0;
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.m32174c(((C5276ja) obj).m25824b(), str)) {
                    break;
                }
            }
            if (((C5276ja) obj) == null) {
                arrayList.add(interfaceC5037en.mo24214a());
            }
        }
        return m32031l0;
    }

    public /* synthetic */ l40(Context context, hc1 hc1Var) {
        this(context, hc1Var, new C5135gl(), new p31(context, hc1Var), new C5240in(context));
    }
}
