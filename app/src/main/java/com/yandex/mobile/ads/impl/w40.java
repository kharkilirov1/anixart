package com.yandex.mobile.ads.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class w40 {

    /* renamed from: a */
    @NotNull
    private final q10 f56006a;

    /* renamed from: b */
    @NotNull
    private final C5724s3 f56007b;

    /* renamed from: c */
    @NotNull
    private final C4912cb f56008c;

    /* renamed from: d */
    @NotNull
    private final e20 f56009d;

    /* renamed from: e */
    @NotNull
    private final C5135gl f56010e;

    /* renamed from: f */
    @NotNull
    private final g20 f56011f;

    /* renamed from: com.yandex.mobile.ads.impl.w40$a */
    public interface InterfaceC5957a {
    }

    public w40(@NotNull q10 imageLoadManager, @NotNull C5724s3 adLoadingPhasesManager) {
        Intrinsics.m32179h(imageLoadManager, "imageLoadManager");
        Intrinsics.m32179h(adLoadingPhasesManager, "adLoadingPhasesManager");
        this.f56006a = imageLoadManager;
        this.f56007b = adLoadingPhasesManager;
        this.f56008c = new C4912cb();
        this.f56009d = new e20();
        this.f56010e = new C5135gl();
        this.f56011f = new g20();
    }

    /* renamed from: a */
    public final void m29378a(@NotNull hc1 videoAdInfo, @NotNull w10 imageProvider, @NotNull j50 loadListener) {
        HashSet m24798a;
        Intrinsics.m32179h(videoAdInfo, "videoAdInfo");
        Intrinsics.m32179h(imageProvider, "imageProvider");
        Intrinsics.m32179h(loadListener, "loadListener");
        C5135gl c5135gl = this.f56010e;
        C5083fl m25116a = videoAdInfo.m25116a();
        Intrinsics.m32178g(m25116a, "videoAdInfo.creative");
        Objects.requireNonNull(c5135gl);
        List m24919a = C5135gl.m24919a(m25116a);
        m24798a = this.f56011f.m24798a(m24919a, (a80) null);
        this.f56007b.m28055b(EnumC5668r3.f54175h);
        this.f56006a.m27596a(m24798a, new x40(this, m24919a, imageProvider, loadListener, videoAdInfo));
    }
}
