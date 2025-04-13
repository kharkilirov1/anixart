package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.base.AdResponse;

/* loaded from: classes3.dex */
final class pl0 implements InterfaceC4942cw, hl0 {

    /* renamed from: a */
    @NonNull
    private final cl0 f53578a;

    /* renamed from: b */
    @NonNull
    private final qs0 f53579b;

    /* renamed from: c */
    @Nullable
    private final Long f53580c;

    public pl0(@NonNull AdResponse adResponse, @NonNull cl0 cl0Var, @NonNull qs0 qs0Var) {
        this.f53578a = cl0Var;
        this.f53579b = qs0Var;
        this.f53580c = adResponse.m21803D();
    }

    @Override // com.yandex.mobile.ads.impl.hl0
    /* renamed from: a */
    public final void mo22859a() {
        this.f53579b.mo26485a();
        this.f53578a.m23311b(this);
    }

    @Override // com.yandex.mobile.ads.impl.hl0
    /* renamed from: b */
    public final void mo22861b() {
        this.f53579b.mo26485a();
        this.f53578a.m23311b(this);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4942cw
    public final void invalidate() {
        this.f53578a.m23311b(this);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4942cw
    public final void pause() {
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4942cw
    public final void resume() {
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4942cw
    public final void start() {
        this.f53578a.m23310a(this);
    }

    @Override // com.yandex.mobile.ads.impl.hl0
    /* renamed from: a */
    public final void mo22860a(long j2, long j3) {
        Long l2 = this.f53580c;
        if (l2 != null) {
            j2 = Math.min(j2, l2.longValue());
        }
        if (j3 >= j2) {
            this.f53578a.m23311b(this);
            this.f53579b.mo26485a();
        } else {
            this.f53579b.mo26486a(j2, j3);
        }
    }
}
