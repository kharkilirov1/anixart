package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAdBinder;
import com.yandex.mobile.ads.instream.player.content.VideoPlayer;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class u50 {

    /* renamed from: c */
    @NotNull
    public static final C5844a f55399c = new C5844a(0);

    /* renamed from: d */
    @Nullable
    private static volatile u50 f55400d;

    /* renamed from: a */
    @NotNull
    private final Object f55401a;

    /* renamed from: b */
    @NotNull
    private final WeakHashMap<VideoPlayer, InstreamAdBinder> f55402b;

    /* renamed from: com.yandex.mobile.ads.impl.u50$a */
    public static final class C5844a {
        private C5844a() {
        }

        public /* synthetic */ C5844a(int i2) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final u50 m28903a() {
            u50 u50Var = u50.f55400d;
            if (u50Var == null) {
                synchronized (this) {
                    u50Var = u50.f55400d;
                    if (u50Var == null) {
                        u50Var = new u50(0);
                        u50.f55400d = u50Var;
                    }
                }
            }
            return u50Var;
        }
    }

    private u50() {
        this.f55401a = new Object();
        this.f55402b = new WeakHashMap<>();
    }

    public /* synthetic */ u50(int i2) {
        this();
    }

    /* renamed from: b */
    public final void m28902b(@NotNull VideoPlayer videoPlayer) {
        Intrinsics.m32179h(videoPlayer, "videoPlayer");
        synchronized (this.f55401a) {
            this.f55402b.remove(videoPlayer);
        }
    }

    @Nullable
    /* renamed from: a */
    public final InstreamAdBinder m28900a(@NotNull VideoPlayer videoPlayer) {
        InstreamAdBinder instreamAdBinder;
        Intrinsics.m32179h(videoPlayer, "videoPlayer");
        synchronized (this.f55401a) {
            instreamAdBinder = this.f55402b.get(videoPlayer);
        }
        return instreamAdBinder;
    }

    /* renamed from: a */
    public final void m28901a(@NotNull VideoPlayer videoPlayer, @NotNull InstreamAdBinder adBinder) {
        Intrinsics.m32179h(videoPlayer, "videoPlayer");
        Intrinsics.m32179h(adBinder, "adBinder");
        synchronized (this.f55401a) {
            this.f55402b.put(videoPlayer, adBinder);
        }
    }
}
