package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.base.AdResponse;

/* loaded from: classes3.dex */
final class ol0 implements InterfaceC4942cw, hl0 {

    /* renamed from: a */
    @NonNull
    private cl0 f53289a;

    /* renamed from: b */
    @NonNull
    private nx0 f53290b;

    /* renamed from: c */
    @Nullable
    private final Long f53291c;

    public ol0(@NonNull AdResponse adResponse, @NonNull cl0 cl0Var, @NonNull nx0 nx0Var) {
        this.f53289a = cl0Var;
        this.f53290b = nx0Var;
        this.f53291c = adResponse.m21803D();
    }

    @Override // com.yandex.mobile.ads.impl.hl0
    /* renamed from: a */
    public final void mo22859a() {
    }

    @Override // com.yandex.mobile.ads.impl.hl0
    /* renamed from: a */
    public final void mo22860a(long j2, long j3) {
        Long l2 = this.f53291c;
        if (l2 == null || j3 <= l2.longValue()) {
            return;
        }
        this.f53289a.m23311b(this);
        this.f53290b.mo25995a();
    }

    @Override // com.yandex.mobile.ads.impl.hl0
    /* renamed from: b */
    public final void mo22861b() {
        this.f53289a.m23311b(this);
        this.f53290b.mo25995a();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4942cw
    public final void invalidate() {
        this.f53289a.m23311b(this);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4942cw
    public final void pause() {
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4942cw
    public final void resume() {
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4942cw
    public final void start() {
        this.f53289a.m23310a(this);
    }
}
