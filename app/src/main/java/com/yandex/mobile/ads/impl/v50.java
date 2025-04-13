package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAdBinder;
import com.yandex.mobile.ads.instream.player.content.VideoPlayer;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class v50 {

    /* renamed from: a */
    @NotNull
    private final InstreamAdBinder f55750a;

    /* renamed from: b */
    @NotNull
    private final u50 f55751b;

    public v50(@NotNull InstreamAdBinder instreamAdBinder) {
        Intrinsics.m32179h(instreamAdBinder, "instreamAdBinder");
        this.f55750a = instreamAdBinder;
        this.f55751b = u50.f55399c.m28903a();
    }

    /* renamed from: a */
    public final void m29182a(@NotNull VideoPlayer player) {
        Intrinsics.m32179h(player, "player");
        InstreamAdBinder m28900a = this.f55751b.m28900a(player);
        if (Intrinsics.m32174c(this.f55750a, m28900a)) {
            return;
        }
        if (m28900a != null) {
            m28900a.invalidateVideoPlayer();
        }
        this.f55751b.m28901a(player, this.f55750a);
    }

    /* renamed from: b */
    public final void m29183b(@NotNull VideoPlayer player) {
        Intrinsics.m32179h(player, "player");
        this.f55751b.m28902b(player);
    }
}
