package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
final class am0 implements InterfaceC4942cw, cm0 {

    /* renamed from: a */
    @NonNull
    private final bm0 f48603a;

    /* renamed from: b */
    @NonNull
    private final InterfaceC5748si f48604b;

    public am0(@NonNull bm0 bm0Var, @NonNull InterfaceC5748si interfaceC5748si) {
        this.f48603a = bm0Var;
        this.f48604b = interfaceC5748si;
    }

    @Override // com.yandex.mobile.ads.impl.cm0
    /* renamed from: a */
    public final void mo22546a() {
    }

    @Override // com.yandex.mobile.ads.impl.cm0
    /* renamed from: a */
    public final void mo22547a(boolean z) {
        if (z) {
            return;
        }
        this.f48604b.mo28252a();
        this.f48603a.m22866b(this);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4942cw
    public final void invalidate() {
        this.f48603a.m22866b(this);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4942cw
    public final void pause() {
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4942cw
    public final void resume() {
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4942cw
    public final void start() {
        this.f48603a.m22864a(this);
    }
}
