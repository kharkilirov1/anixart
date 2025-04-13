package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.c3 */
/* loaded from: classes3.dex */
public final class C4901c3 {

    /* renamed from: a */
    @NotNull
    private final C4839b3 f49076a;

    public C4901c3(@NotNull Context context, @NotNull m50 adBreak, @NotNull t30 adPlayerController, @NotNull w10 imageProvider, @NotNull i40 adViewsHolderManager, @NotNull sc1<VideoAd> playbackEventsListener) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(adBreak, "adBreak");
        Intrinsics.m32179h(adPlayerController, "adPlayerController");
        Intrinsics.m32179h(imageProvider, "imageProvider");
        Intrinsics.m32179h(adViewsHolderManager, "adViewsHolderManager");
        Intrinsics.m32179h(playbackEventsListener, "playbackEventsListener");
        EnumC5778t1 m27139a = C5562p1.m27139a(adBreak.m26569a().m26980c());
        Intrinsics.m32178g(m27139a, "adBreakPositionConverter.convert(adBreakId)");
        this.f49076a = new C4839b3(context, adBreak, m27139a, imageProvider, adPlayerController, adViewsHolderManager, playbackEventsListener);
    }

    @NotNull
    /* renamed from: a */
    public final ArrayList m23014a(@NotNull List videoAdInfoList) {
        Intrinsics.m32179h(videoAdInfoList, "videoAdInfoList");
        ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(videoAdInfoList, 10));
        Iterator it = videoAdInfoList.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f49076a.m22714a((hc1) it.next()));
        }
        return arrayList;
    }
}
