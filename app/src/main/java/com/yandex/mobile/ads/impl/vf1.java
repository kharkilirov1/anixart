package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.tf1;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class vf1 implements tf1 {

    /* renamed from: a */
    @NotNull
    private final tf1 f55813a;

    /* renamed from: b */
    private boolean f55814b;

    /* renamed from: c */
    private boolean f55815c;

    public vf1(@NotNull C6079yj videoTracker) {
        Intrinsics.m32179h(videoTracker, "videoTracker");
        this.f55813a = videoTracker;
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    /* renamed from: a */
    public final void mo25502a() {
        this.f55813a.mo25502a();
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    /* renamed from: a */
    public final void mo25503a(float f2) {
        this.f55813a.mo25503a(f2);
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    /* renamed from: a */
    public final void mo25504a(long j2) {
        this.f55813a.mo25504a(j2);
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    /* renamed from: a */
    public final void mo25505a(@NotNull View view, @NotNull List<fc1> friendlyOverlays) {
        Intrinsics.m32179h(view, "view");
        Intrinsics.m32179h(friendlyOverlays, "friendlyOverlays");
        this.f55813a.mo25505a(view, friendlyOverlays);
        this.f55814b = false;
        this.f55815c = false;
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    /* renamed from: a */
    public final void mo25507a(@NotNull tf1.EnumC5800a quartile) {
        Intrinsics.m32179h(quartile, "quartile");
        this.f55813a.mo25507a(quartile);
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    /* renamed from: b */
    public final void mo25509b() {
        this.f55813a.mo25509b();
        mo25518k();
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    /* renamed from: c */
    public final void mo25510c() {
        this.f55813a.mo25510c();
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    /* renamed from: d */
    public final void mo25511d() {
        this.f55813a.mo25511d();
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    /* renamed from: e */
    public final void mo25512e() {
        this.f55813a.mo25512e();
        mo25518k();
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    /* renamed from: f */
    public final void mo25513f() {
        this.f55813a.mo25513f();
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    /* renamed from: g */
    public final void mo25514g() {
        this.f55813a.mo25514g();
        mo25518k();
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    /* renamed from: h */
    public final void mo25515h() {
        if (this.f55814b) {
            return;
        }
        this.f55814b = true;
        this.f55813a.mo25515h();
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    /* renamed from: i */
    public final void mo25516i() {
        this.f55813a.mo25516i();
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    /* renamed from: j */
    public final void mo25517j() {
        this.f55813a.mo25517j();
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    /* renamed from: k */
    public final void mo25518k() {
        this.f55813a.mo25518k();
        this.f55814b = false;
        this.f55815c = false;
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    /* renamed from: l */
    public final void mo25519l() {
        this.f55813a.mo25519l();
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    /* renamed from: m */
    public final void mo25520m() {
        this.f55813a.mo25520m();
        mo25515h();
        mo25521n();
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    /* renamed from: n */
    public final void mo25521n() {
        if (this.f55815c) {
            return;
        }
        this.f55815c = true;
        this.f55813a.mo25521n();
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    /* renamed from: a */
    public final void mo25508a(@NotNull String assetName) {
        Intrinsics.m32179h(assetName, "assetName");
        this.f55813a.mo25508a(assetName);
        mo25515h();
        mo25521n();
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    /* renamed from: a */
    public final void mo25506a(@NotNull ed1 error) {
        Intrinsics.m32179h(error, "error");
        this.f55813a.mo25506a(error);
        mo25518k();
    }
}
