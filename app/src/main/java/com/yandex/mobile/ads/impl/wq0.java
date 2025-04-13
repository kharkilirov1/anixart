package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;

/* loaded from: classes3.dex */
public final class wq0 {

    /* renamed from: a */
    @NonNull
    private final Player f56229a;

    /* renamed from: b */
    @NonNull
    private final zq0 f56230b;

    public wq0(@NonNull Player player, @NonNull zq0 zq0Var) {
        this.f56229a = player;
        this.f56230b = zq0Var;
    }

    /* renamed from: a */
    public final long m29531a() {
        Timeline m30283b = this.f56230b.m30283b();
        return this.f56229a.getContentPosition() - (m30283b.m5991s() ? 0L : m30283b.m5987h(0, this.f56230b.m30280a()).m5997f());
    }
}
