package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.sv0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class we1 implements sv0.InterfaceC5763a {

    /* renamed from: a */
    @NotNull
    private final hc1<?> f56122a;

    /* renamed from: b */
    @NotNull
    private final ag1 f56123b;

    public we1(@NotNull hc1<?> videoAdInfo, @NotNull ag1 videoViewProvider) {
        Intrinsics.m32179h(videoAdInfo, "videoAdInfo");
        Intrinsics.m32179h(videoViewProvider, "videoViewProvider");
        this.f56122a = videoAdInfo;
        this.f56123b = videoViewProvider;
    }

    @Override // com.yandex.mobile.ads.impl.sv0.InterfaceC5763a
    @NotNull
    /* renamed from: a */
    public final Map<String, Object> mo22529a() {
        tv0 tv0Var = new tv0(new LinkedHashMap());
        View view = this.f56123b.getView();
        Integer valueOf = view != null ? Integer.valueOf(view.getHeight()) : null;
        Integer valueOf2 = view != null ? Integer.valueOf(view.getWidth()) : null;
        jb0 m25117b = this.f56122a.m25117b();
        Intrinsics.m32178g(m25117b, "videoAdInfo.mediaFile");
        if (valueOf == null || valueOf.intValue() <= 0) {
            valueOf = null;
        }
        tv0Var.m28761b(valueOf, "view_container_height");
        if (valueOf2 == null || valueOf2.intValue() <= 0) {
            valueOf2 = null;
        }
        tv0Var.m28761b(valueOf2, "view_container_width");
        tv0Var.m28761b(m25117b.m25839b() > 0 ? Integer.valueOf(m25117b.m25839b()) : null, "video_height");
        tv0Var.m28761b(m25117b.m25843f() > 0 ? Integer.valueOf(m25117b.m25843f()) : null, "video_width");
        tv0Var.m28761b(m25117b.m25838a(), "video_codec");
        tv0Var.m28761b(m25117b.m25840c(), "video_mime_type");
        tv0Var.m28761b(m25117b.m25842e(), "video_vmaf");
        Map<String, Object> m28756a = tv0Var.m28756a();
        Intrinsics.m32178g(m28756a, "wrapper.reportData");
        return MapsKt.m32063h(new Pair("video_playback_info", m28756a));
    }
}
