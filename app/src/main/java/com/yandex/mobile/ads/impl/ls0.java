package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Player;

/* loaded from: classes3.dex */
public final class ls0 implements ss0, ar0 {

    /* renamed from: a */
    @NonNull
    private final ss0 f52519a;

    /* renamed from: b */
    @NonNull
    private oq0 f52520b = oq0.f53308c;

    /* renamed from: c */
    @Nullable
    private C6042xu f52521c;

    public ls0(@NonNull ss0 ss0Var) {
        this.f52519a = ss0Var;
    }

    @Override // com.yandex.mobile.ads.impl.ss0
    @NonNull
    /* renamed from: a */
    public final oq0 mo24583a() {
        ss0 ss0Var = this.f52521c;
        if (ss0Var == null) {
            ss0Var = this.f52519a;
        }
        oq0 mo24583a = ss0Var.mo24583a();
        this.f52520b = mo24583a;
        return mo24583a;
    }

    @Override // com.yandex.mobile.ads.impl.ar0
    /* renamed from: a */
    public final void mo22617a(@Nullable Player player) {
        this.f52521c = player == null ? new C6042xu(this.f52520b) : null;
    }
}
