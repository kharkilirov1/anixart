package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.player.p025ad.InstreamAdPlayer;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class v30 {

    /* renamed from: a */
    @NotNull
    private final y81 f55744a;

    /* renamed from: b */
    @NotNull
    private final s30 f55745b;

    public v30(@NotNull y81 unifiedInstreamAdBinder) {
        Intrinsics.m32179h(unifiedInstreamAdBinder, "unifiedInstreamAdBinder");
        this.f55744a = unifiedInstreamAdBinder;
        this.f55745b = s30.f54491c.m28061a();
    }

    /* renamed from: a */
    public final void m29179a(@NotNull InstreamAdPlayer player) {
        Intrinsics.m32179h(player, "player");
        y81 m28058a = this.f55745b.m28058a(player);
        if (Intrinsics.m32174c(this.f55744a, m28058a)) {
            return;
        }
        if (m28058a != null) {
            m28058a.invalidateAdPlayer();
        }
        this.f55745b.m28059a(player, this.f55744a);
    }

    /* renamed from: b */
    public final void m29180b(@NotNull InstreamAdPlayer player) {
        Intrinsics.m32179h(player, "player");
        this.f55745b.m28060b(player);
    }
}
