package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.base.AdResponse;

/* loaded from: classes3.dex */
final class bl0 implements InterfaceC4942cw, hl0 {

    /* renamed from: a */
    @NonNull
    private cl0 f48917a;

    /* renamed from: b */
    @NonNull
    private final InterfaceC5748si f48918b;

    /* renamed from: c */
    @Nullable
    private final Long f48919c;

    public bl0(@NonNull AdResponse adResponse, @NonNull cl0 cl0Var, @NonNull InterfaceC5748si interfaceC5748si) {
        this.f48917a = cl0Var;
        this.f48918b = interfaceC5748si;
        this.f48919c = adResponse.m21831u();
    }

    @Override // com.yandex.mobile.ads.impl.hl0
    /* renamed from: a */
    public final void mo22860a(long j2, long j3) {
        Long l2 = this.f48919c;
        if (l2 == null || j3 < l2.longValue()) {
            return;
        }
        this.f48918b.mo28252a();
        this.f48917a.m23311b(this);
    }

    @Override // com.yandex.mobile.ads.impl.hl0
    /* renamed from: b */
    public final void mo22861b() {
        this.f48918b.mo28252a();
        this.f48917a.m23311b(this);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4942cw
    public final void invalidate() {
        this.f48917a.m23311b(this);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4942cw
    public final void pause() {
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4942cw
    public final void resume() {
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4942cw
    public final void start() {
        this.f48917a.m23310a(this);
    }

    @Override // com.yandex.mobile.ads.impl.hl0
    /* renamed from: a */
    public final void mo22859a() {
        this.f48918b.mo28252a();
        this.f48917a.m23311b(this);
    }
}
