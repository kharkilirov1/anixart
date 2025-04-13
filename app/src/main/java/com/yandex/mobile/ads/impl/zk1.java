package com.yandex.mobile.ads.impl;

import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.nativeads.MediaView;
import java.util.List;

/* loaded from: classes3.dex */
public final class zk1 extends nc0 {

    /* renamed from: c */
    @NonNull
    private final eg1<ImageView, z10> f57227c;

    public zk1(@NonNull MediaView mediaView, @NonNull h20 h20Var, @NonNull C5101g2 c5101g2) {
        super(mediaView, c5101g2);
        this.f57227c = new eg1<>(h20Var);
    }

    @Override // com.yandex.mobile.ads.impl.dg1
    /* renamed from: a */
    public final void mo22387a(@NonNull MediaView mediaView) {
        this.f57227c.m24149a();
        super.mo22387a((zk1) mediaView);
    }

    @Override // com.yandex.mobile.ads.impl.dg1
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final boolean mo22388a(@NonNull MediaView mediaView, @NonNull jc0 jc0Var) {
        List<z10> m25863a = jc0Var.m25863a();
        z10 z10Var = (m25863a == null || m25863a.isEmpty()) ? null : m25863a.get(0);
        if (z10Var != null) {
            return this.f57227c.m24151a(z10Var);
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.nc0
    @NonNull
    /* renamed from: c */
    public final int mo22545c() {
        return 4;
    }

    @Override // com.yandex.mobile.ads.impl.dg1
    /* renamed from: a */
    public final void mo22499a(@NonNull C5276ja c5276ja, @NonNull gg1 gg1Var, @Nullable jc0 jc0Var) {
        jc0 jc0Var2 = jc0Var;
        z10 z10Var = null;
        List<z10> m25863a = jc0Var2 != null ? jc0Var2.m25863a() : null;
        if (m25863a != null && !m25863a.isEmpty()) {
            z10Var = m25863a.get(0);
        }
        this.f57227c.m24150a(c5276ja, gg1Var, z10Var);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.yandex.mobile.ads.impl.nc0
    /* renamed from: a */
    public final void mo22389b(@NonNull MediaView mediaView, @NonNull jc0 jc0Var) {
        super.mo22389b(mediaView, jc0Var);
        List<z10> m25863a = jc0Var.m25863a();
        z10 z10Var = (m25863a == null || m25863a.isEmpty()) ? null : m25863a.get(0);
        if (z10Var != null) {
            this.f57227c.m24153b(z10Var);
        }
    }

    @Override // com.yandex.mobile.ads.impl.nc0
    /* renamed from: a */
    public final void mo22543a(@NonNull jc0 jc0Var) {
        List<z10> m25863a = jc0Var.m25863a();
        z10 z10Var = (m25863a == null || m25863a.isEmpty()) ? null : m25863a.get(0);
        if (z10Var != null) {
            this.f57227c.m24153b(z10Var);
        }
    }
}
