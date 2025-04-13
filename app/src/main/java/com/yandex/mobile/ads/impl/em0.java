package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
final class em0 implements InterfaceC4942cw, cm0 {

    /* renamed from: a */
    @NonNull
    private final bm0 f50014a;

    /* renamed from: b */
    @NonNull
    private final nx0 f50015b;

    public em0(@NonNull bm0 bm0Var, @NonNull nx0 nx0Var) {
        this.f50014a = bm0Var;
        this.f50015b = nx0Var;
    }

    @Override // com.yandex.mobile.ads.impl.cm0
    /* renamed from: a */
    public final void mo22546a() {
        this.f50014a.m22866b(this);
        this.f50015b.mo25995a();
    }

    @Override // com.yandex.mobile.ads.impl.cm0
    /* renamed from: a */
    public final void mo22547a(boolean z) {
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4942cw
    public final void invalidate() {
        this.f50014a.m22866b(this);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4942cw
    public final void pause() {
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4942cw
    public final void resume() {
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4942cw
    public final void start() {
        this.f50014a.m22864a(this);
    }
}
