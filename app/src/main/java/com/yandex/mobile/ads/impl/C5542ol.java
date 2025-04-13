package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.tf1;
import com.yandex.mobile.ads.impl.uf1;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.ol */
/* loaded from: classes3.dex */
public final class C5542ol implements uf1 {

    /* renamed from: a */
    @NotNull
    private final C5083fl f53284a;

    /* renamed from: b */
    @NotNull
    private final rf1 f53285b;

    /* renamed from: c */
    @NotNull
    private final le1 f53286c;

    /* renamed from: d */
    @NotNull
    private final t50 f53287d;

    /* renamed from: e */
    private boolean f53288e;

    public C5542ol(@NotNull C5083fl creative, @NotNull rf1 eventsTracker, @NotNull le1 videoEventUrlsTracker) {
        Intrinsics.m32179h(creative, "creative");
        Intrinsics.m32179h(eventsTracker, "eventsTracker");
        Intrinsics.m32179h(videoEventUrlsTracker, "videoEventUrlsTracker");
        this.f53284a = creative;
        this.f53285b = eventsTracker;
        this.f53286c = videoEventUrlsTracker;
        this.f53287d = new t50(new C5135gl());
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    /* renamed from: a */
    public final void mo25503a(float f2) {
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    /* renamed from: a */
    public final void mo25505a(@NotNull View view, @NotNull List<fc1> list) {
        uf1.C5859a.m28990a(view, list);
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    /* renamed from: b */
    public final void mo25509b() {
        this.f53285b.m27919a(this.f53284a, "complete");
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    /* renamed from: c */
    public final void mo25510c() {
        this.f53285b.m27919a(this.f53284a, "resume");
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    /* renamed from: d */
    public final void mo25511d() {
        this.f53285b.m27919a(this.f53284a, "pause");
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    /* renamed from: e */
    public final void mo25512e() {
        this.f53285b.m27919a(this.f53284a, "skip");
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    /* renamed from: f */
    public final void mo25513f() {
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    /* renamed from: g */
    public final void mo25514g() {
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    /* renamed from: h */
    public final void mo25515h() {
        this.f53285b.m27919a(this.f53284a, "creativeView");
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    /* renamed from: i */
    public final void mo25516i() {
        this.f53285b.m27919a(new C5403ll().m26495a(this.f53284a), "creativeRenderingStart");
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    /* renamed from: j */
    public final void mo25517j() {
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    /* renamed from: k */
    public final void mo25518k() {
        this.f53288e = false;
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    /* renamed from: l */
    public final void mo25519l() {
        this.f53285b.m27919a(this.f53284a, "mute");
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    /* renamed from: m */
    public final void mo25520m() {
        if (!this.f53288e) {
            this.f53288e = true;
            this.f53285b.m27919a(this.f53284a, "start");
        }
        this.f53285b.m27919a(this.f53284a, "clickTracking");
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    /* renamed from: n */
    public final void mo25521n() {
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    /* renamed from: a */
    public final void mo25506a(@NotNull ed1 ed1Var) {
        uf1.C5859a.m28991a(ed1Var);
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    /* renamed from: a */
    public final void mo25507a(@NotNull tf1.EnumC5800a quartile) {
        String str;
        Intrinsics.m32179h(quartile, "quartile");
        int ordinal = quartile.ordinal();
        if (ordinal == 0) {
            str = "firstQuartile";
        } else if (ordinal == 1) {
            str = "midpoint";
        } else {
            if (ordinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "thirdQuartile";
        }
        this.f53285b.m27919a(this.f53284a, str);
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    /* renamed from: a */
    public final void mo25502a() {
        this.f53285b.m27919a(this.f53284a, "unmute");
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    /* renamed from: a */
    public final void mo25508a(@NotNull String assetName) {
        Intrinsics.m32179h(assetName, "assetName");
        if (!this.f53288e) {
            this.f53288e = true;
            this.f53285b.m27919a(this.f53284a, "start");
        }
        ee1 m28466a = this.f53287d.m28466a(this.f53284a, assetName);
        le1 le1Var = this.f53286c;
        List<String> m24134b = m28466a.m24134b();
        Intrinsics.m32178g(m24134b, "videoClicks.clickTrackings");
        le1Var.m26442a((List<String>) m24134b, (Map<String, String>) null);
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    /* renamed from: a */
    public final void mo25504a(long j2) {
        if (this.f53288e) {
            return;
        }
        this.f53288e = true;
        this.f53285b.m27919a(this.f53284a, "start");
    }
}
