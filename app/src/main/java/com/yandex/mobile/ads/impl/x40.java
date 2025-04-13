package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import com.yandex.mobile.ads.impl.w40;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class x40 implements i20 {

    /* renamed from: a */
    public final /* synthetic */ w40 f56363a;

    /* renamed from: b */
    public final /* synthetic */ List<C5276ja<?>> f56364b;

    /* renamed from: c */
    public final /* synthetic */ w10 f56365c;

    /* renamed from: d */
    public final /* synthetic */ w40.InterfaceC5957a f56366d;

    /* renamed from: e */
    public final /* synthetic */ hc1<VideoAd> f56367e;

    public x40(w40 w40Var, List list, w10 w10Var, j50 j50Var, hc1 hc1Var) {
        this.f56363a = w40Var;
        this.f56364b = list;
        this.f56365c = w10Var;
        this.f56366d = j50Var;
        this.f56367e = hc1Var;
    }

    @Override // com.yandex.mobile.ads.impl.i20
    /* renamed from: a */
    public final void mo25427a(@NotNull Map<String, Bitmap> images) {
        C5724s3 c5724s3;
        C4912cb c4912cb;
        e20 e20Var;
        Intrinsics.m32179h(images, "images");
        c5724s3 = this.f56363a.f56007b;
        c5724s3.m28050a(EnumC5668r3.f54175h);
        c4912cb = this.f56363a.f56008c;
        ArrayList m23088a = c4912cb.m23088a(this.f56364b, images);
        Intrinsics.m32178g(m23088a, "assetsFilter.filterEmpty…gesAssets(assets, images)");
        e20Var = this.f56363a.f56009d;
        e20Var.m23990a(m23088a, images);
        this.f56365c.mo24879a(images);
        ((j50) this.f56366d).m25803m(this.f56367e);
    }
}
