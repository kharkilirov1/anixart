package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.nativeads.MediaView;

/* loaded from: classes3.dex */
public final class cl1 extends nc0 {

    /* renamed from: c */
    @NonNull
    private final eg1<sl0, ob1> f49300c;

    public cl1(@NonNull MediaView mediaView, @NonNull zf1 zf1Var, @NonNull C5101g2 c5101g2) {
        super(mediaView, c5101g2);
        this.f49300c = new eg1<>(zf1Var);
    }

    @Override // com.yandex.mobile.ads.impl.dg1
    /* renamed from: a */
    public final void mo22387a(@NonNull MediaView mediaView) {
        this.f49300c.m24149a();
        super.mo22387a((cl1) mediaView);
    }

    @Override // com.yandex.mobile.ads.impl.nc0
    /* renamed from: a */
    public final void mo22543a(@NonNull jc0 jc0Var) {
    }

    @Override // com.yandex.mobile.ads.impl.nc0, com.yandex.mobile.ads.impl.dg1
    /* renamed from: b */
    public final void mo22389b(@NonNull MediaView mediaView, @NonNull jc0 jc0Var) {
        jc0 jc0Var2 = jc0Var;
        super.mo22389b(mediaView, jc0Var2);
        ob1 m25865c = jc0Var2.m25865c();
        if (m25865c != null) {
            this.f49300c.m24153b(m25865c);
        }
    }

    @Override // com.yandex.mobile.ads.impl.nc0
    @NonNull
    /* renamed from: c */
    public final int mo22545c() {
        return 2;
    }

    @Override // com.yandex.mobile.ads.impl.dg1
    /* renamed from: a */
    public final void mo22499a(@NonNull C5276ja c5276ja, @NonNull gg1 gg1Var, @Nullable jc0 jc0Var) {
        jc0 jc0Var2 = jc0Var;
        this.f49300c.m24150a(c5276ja, gg1Var, jc0Var2 != null ? jc0Var2.m25865c() : null);
    }

    @Override // com.yandex.mobile.ads.impl.dg1
    /* renamed from: b, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final boolean mo22388a(@NonNull MediaView mediaView, @NonNull jc0 jc0Var) {
        if (jc0Var.m25865c() != null) {
            return this.f49300c.m24151a(jc0Var.m25865c());
        }
        return false;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.yandex.mobile.ads.impl.nc0
    /* renamed from: a */
    public final void mo22389b(@NonNull MediaView mediaView, @NonNull jc0 jc0Var) {
        super.mo22389b(mediaView, jc0Var);
        ob1 m25865c = jc0Var.m25865c();
        if (m25865c != null) {
            this.f49300c.m24153b(m25865c);
        }
    }

    @Override // com.yandex.mobile.ads.impl.dg1
    /* renamed from: a */
    public final void mo23312a() {
        this.f49300c.m24152b();
    }
}
