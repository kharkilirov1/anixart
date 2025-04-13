package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Player;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.yandex.mobile.ads.impl.ps */
/* loaded from: classes3.dex */
public final class C5603ps {

    /* renamed from: a */
    @NonNull
    private final HashSet f53640a = new HashSet();

    /* renamed from: b */
    @Nullable
    private Player f53641b;

    /* renamed from: a */
    public final void m27371a(@NonNull ls0 ls0Var) {
        this.f53640a.add(ls0Var);
    }

    /* renamed from: b */
    public final boolean m27372b() {
        return this.f53641b != null;
    }

    /* renamed from: a */
    public final void m27370a(@Nullable Player player) {
        this.f53641b = player;
        Iterator it = this.f53640a.iterator();
        while (it.hasNext()) {
            ((ar0) it.next()).mo22617a(player);
        }
    }

    @Nullable
    /* renamed from: a */
    public final Player m27369a() {
        return this.f53641b;
    }
}
