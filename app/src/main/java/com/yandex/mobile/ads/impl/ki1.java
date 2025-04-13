package com.yandex.mobile.ads.impl;

import com.google.firebase.auth.C2052a;
import com.yandex.mobile.ads.exo.offline.C4777b;
import com.yandex.mobile.ads.exo.offline.C4778c;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ki1 implements C4778c.c {

    /* renamed from: c */
    public static final /* synthetic */ KProperty<Object>[] f51983c = {C2052a.m12277l(ki1.class, "cacheListener", "getCacheListener()Lcom/yandex/mobile/ads/nativeads/video/cache/VideoCacheListener;", 0)};

    /* renamed from: d */
    @Deprecated
    @NotNull
    private static final List<Integer> f51984d;

    /* renamed from: e */
    @Deprecated
    @NotNull
    private static final List<Integer> f51985e;

    /* renamed from: a */
    @NotNull
    private final String f51986a;

    /* renamed from: b */
    @NotNull
    private final su0 f51987b;

    static {
        List<Integer> m31994G = CollectionsKt.m31994G(3, 4);
        f51984d = m31994G;
        f51985e = CollectionsKt.m32003P(CollectionsKt.m32003P(m31994G, 1), 5);
    }

    public ki1(@NotNull String requestId, @NotNull be1 videoCacheListener) {
        Intrinsics.m32179h(requestId, "requestId");
        Intrinsics.m32179h(videoCacheListener, "videoCacheListener");
        this.f51986a = requestId;
        this.f51987b = tu0.m28737a(videoCacheListener);
    }

    /* renamed from: a */
    private final be1 m26129a() {
        return (be1) this.f51987b.getValue(this, f51983c[0]);
    }

    @Override // com.yandex.mobile.ads.exo.offline.C4778c.c
    /* renamed from: a */
    public final void mo22309a(@NotNull C4778c downloadManager, @NotNull C4777b download) {
        be1 m26129a;
        Intrinsics.m32179h(downloadManager, "downloadManager");
        Intrinsics.m32179h(download, "download");
        if (Intrinsics.m32174c(download.f48203a.f48179a, this.f51986a)) {
            if (f51984d.contains(Integer.valueOf(download.f48204b)) && (m26129a = m26129a()) != null) {
                m26129a.mo22805a();
            }
            if (f51985e.contains(Integer.valueOf(download.f48204b))) {
                downloadManager.m22298a((C4778c.c) this);
            }
        }
    }
}
