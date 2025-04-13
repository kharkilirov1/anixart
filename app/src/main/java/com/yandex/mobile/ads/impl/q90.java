package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.instream.InstreamAd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class q90 {

    /* renamed from: a */
    @NotNull
    private final C4789a2 f53983a;

    /* renamed from: b */
    @NotNull
    private final C4838b2 f53984b;

    /* renamed from: c */
    @NotNull
    private final l50 f53985c;

    /* renamed from: d */
    @NotNull
    private final l90 f53986d;

    public q90(@NotNull Context context, @NotNull InstreamAd instreamAd) {
        Intrinsics.m32179h(context, "context");
        Intrinsics.m32179h(instreamAd, "instreamAd");
        this.f53983a = new C4789a2();
        this.f53984b = new C4838b2();
        l50 m28071a = s50.m28071a(instreamAd);
        Intrinsics.m32178g(m28071a, "videoAdProvider.getInstreamVideoAd(instreamAd)");
        this.f53985c = m28071a;
        this.f53986d = new l90(context, m28071a);
    }

    @NotNull
    /* renamed from: a */
    public final ArrayList m27662a(@Nullable String str) {
        C4838b2 c4838b2 = this.f53984b;
        List<m50> adBreaks = this.f53985c.getAdBreaks();
        Objects.requireNonNull(c4838b2);
        ArrayList m22710a = C4838b2.m22710a(adBreaks);
        Intrinsics.m32178g(m22710a, "adBreaksSorter.sortAdBre…instreamVideoAd.adBreaks)");
        Objects.requireNonNull(this.f53983a);
        ArrayList m22362a = C4789a2.m22362a(str, m22710a);
        ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(m22362a, 10));
        Iterator it = m22362a.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f53986d.m26398a((m50) it.next()));
        }
        return arrayList;
    }
}
