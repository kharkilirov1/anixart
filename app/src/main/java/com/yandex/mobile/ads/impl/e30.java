package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class e30 implements sb1 {

    /* renamed from: a */
    @NotNull
    private final vb1 f49795a = new vb1();

    /* renamed from: b */
    @NotNull
    private final wb1 f49796b = new wb1();

    /* renamed from: c */
    @NotNull
    private final xb1 f49797c = new xb1();

    /* renamed from: d */
    @Nullable
    private ub1 f49798d;

    /* renamed from: a */
    public final void m24001a(@Nullable qb1 qb1Var) {
        if (qb1Var != null) {
            Objects.requireNonNull(this.f49796b);
            if (!(qb1Var.m27669a() != null)) {
                return;
            }
        }
        this.f49798d = null;
    }

    @Override // com.yandex.mobile.ads.impl.sb1
    /* renamed from: a */
    public final void mo24003a(@NotNull VideoAd videoAd) {
        Intrinsics.m32179h(videoAd, "videoAd");
    }

    @Override // com.yandex.mobile.ads.impl.sb1
    public final void onAdClicked(@NotNull VideoAd videoAd) {
        Intrinsics.m32179h(videoAd, "videoAd");
    }

    @Override // com.yandex.mobile.ads.impl.sb1
    public final void onAdCompleted(@NotNull VideoAd videoAd) {
        Intrinsics.m32179h(videoAd, "videoAd");
    }

    @Override // com.yandex.mobile.ads.impl.sb1
    public final void onAdError(@NotNull VideoAd videoAd) {
        Intrinsics.m32179h(videoAd, "videoAd");
    }

    @Override // com.yandex.mobile.ads.impl.sb1
    public final void onAdPaused(@NotNull VideoAd videoAd) {
        Intrinsics.m32179h(videoAd, "videoAd");
    }

    @Override // com.yandex.mobile.ads.impl.sb1
    public final void onAdResumed(@NotNull VideoAd videoAd) {
        Intrinsics.m32179h(videoAd, "videoAd");
    }

    @Override // com.yandex.mobile.ads.impl.sb1
    public final void onAdSkipped(@NotNull VideoAd videoAd) {
        Intrinsics.m32179h(videoAd, "videoAd");
    }

    @Override // com.yandex.mobile.ads.impl.sb1
    public final void onAdStarted(@NotNull VideoAd videoAd) {
        Intrinsics.m32179h(videoAd, "videoAd");
    }

    @Override // com.yandex.mobile.ads.impl.sb1
    public final void onAdStopped(@NotNull VideoAd videoAd) {
        Intrinsics.m32179h(videoAd, "videoAd");
    }

    @Override // com.yandex.mobile.ads.impl.sb1
    public final void onVolumeChanged(@NotNull VideoAd videoAd, float f2) {
        Intrinsics.m32179h(videoAd, "videoAd");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
    
        if ((r0.getParent() != null) == false) goto L18;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m24002a(@org.jetbrains.annotations.Nullable com.yandex.mobile.ads.impl.rb1 r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L55
            com.yandex.mobile.ads.impl.xb1 r0 = r4.f49797c
            java.util.Objects.requireNonNull(r0)
            com.yandex.mobile.ads.video.playback.view.VideoAdControlsContainer r0 = r5.m27900e()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r1.add(r0)
            android.widget.TextView r2 = r5.m27899d()
            r1.add(r2)
            android.view.View r2 = r5.m27897b()
            r1.add(r2)
            android.view.View r2 = r5.m27896a()
            r1.add(r2)
            android.view.View r5 = r5.m27898c()
            r1.add(r5)
            java.util.Iterator r5 = r1.iterator()
        L33:
            boolean r1 = r5.hasNext()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L43
            java.lang.Object r1 = r5.next()
            if (r1 != 0) goto L33
            r5 = 1
            goto L44
        L43:
            r5 = 0
        L44:
            if (r5 != 0) goto L52
            android.view.ViewParent r5 = r0.getParent()
            if (r5 == 0) goto L4e
            r5 = 1
            goto L4f
        L4e:
            r5 = 0
        L4f:
            if (r5 != 0) goto L52
            goto L53
        L52:
            r2 = 0
        L53:
            if (r2 == 0) goto L58
        L55:
            r5 = 0
            r4.f49798d = r5
        L58:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.e30.m24002a(com.yandex.mobile.ads.impl.rb1):void");
    }

    @Override // com.yandex.mobile.ads.impl.sb1
    /* renamed from: a */
    public final void mo24000a(@NotNull l30 videoAdCreativePlayback) {
        Intrinsics.m32179h(videoAdCreativePlayback, "videoAdCreativePlayback");
        ub1 ub1Var = this.f49798d;
        if (ub1Var != null) {
            videoAdCreativePlayback.m26337a(ub1Var);
        }
    }
}
