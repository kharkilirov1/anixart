package com.yandex.mobile.ads.impl;

import android.view.View;
import com.swiftsoft.anixartd.network.Response;
import com.yandex.mobile.ads.impl.tf1;
import com.yandex.mobile.ads.impl.uf1;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ud1 implements uf1 {

    /* renamed from: a */
    @NotNull
    private final pb1 f55481a;

    /* renamed from: b */
    @NotNull
    private final rf1 f55482b;

    public ud1(@NotNull pb1 videoAd, @NotNull rf1 eventsTracker) {
        Intrinsics.m32179h(videoAd, "videoAd");
        Intrinsics.m32179h(eventsTracker, "eventsTracker");
        this.f55481a = videoAd;
        this.f55482b = eventsTracker;
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    /* renamed from: a */
    public final void mo25502a() {
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    /* renamed from: a */
    public final void mo25503a(float f2) {
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    /* renamed from: a */
    public final void mo25504a(long j2) {
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    /* renamed from: a */
    public final void mo25505a(@NotNull View view, @NotNull List<fc1> list) {
        uf1.C5859a.m28990a(view, list);
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    /* renamed from: b */
    public final void mo25509b() {
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    /* renamed from: c */
    public final void mo25510c() {
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    /* renamed from: d */
    public final void mo25511d() {
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    /* renamed from: e */
    public final void mo25512e() {
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
        this.f55482b.m27919a(this.f55481a, "render_impression");
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    /* renamed from: i */
    public final void mo25516i() {
        this.f55482b.m27919a(ec1.m24111a(this.f55481a), "renderingStart");
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    /* renamed from: j */
    public final void mo25517j() {
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    /* renamed from: k */
    public final void mo25518k() {
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    /* renamed from: l */
    public final void mo25519l() {
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    /* renamed from: m */
    public final void mo25520m() {
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    /* renamed from: n */
    public final void mo25521n() {
        this.f55482b.m27919a(this.f55481a, "impression");
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    /* renamed from: a */
    public final void mo25508a(@NotNull String str) {
        uf1.C5859a.m28993a(str);
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    /* renamed from: a */
    public final void mo25507a(@NotNull tf1.EnumC5800a enumC5800a) {
        uf1.C5859a.m28992a(enumC5800a);
    }

    @Override // com.yandex.mobile.ads.impl.tf1
    /* renamed from: a */
    public final void mo25506a(@NotNull ed1 error) {
        int i2;
        Intrinsics.m32179h(error, "error");
        switch (C5782t5.m28463a(error.m24128a())) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 10:
            case 11:
            case 25:
            case 26:
                i2 = 405;
                break;
            case 7:
                i2 = Response.BANNED;
                break;
            case 8:
            case 12:
            case 28:
                i2 = 900;
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 20:
            case 21:
            case 22:
            case 24:
            case 27:
                i2 = 400;
                break;
            case 19:
                i2 = 401;
                break;
            case 23:
                i2 = Response.PERM_BANNED;
                break;
            case 29:
                i2 = 901;
                break;
            case 30:
                i2 = 902;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        this.f55482b.m27920a(this.f55481a, "error", MapsKt.m32063h(new Pair("[ERRORCODE]", String.valueOf(i2))));
    }
}
