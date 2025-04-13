package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;

/* loaded from: classes3.dex */
public final class qq0 {

    /* renamed from: a */
    @NonNull
    private final C6104z3 f54126a;

    /* renamed from: b */
    @NonNull
    private final m80 f54127b;

    /* renamed from: c */
    @NonNull
    private final xq0 f54128c;

    public qq0(@NonNull C6104z3 c6104z3, @NonNull sr0 sr0Var, @NonNull je1 je1Var, @NonNull xq0 xq0Var) {
        this.f54126a = c6104z3;
        this.f54128c = xq0Var;
        this.f54127b = new m80(sr0Var, je1Var);
    }

    /* renamed from: a */
    private boolean m27775a(@NonNull Player player, int i2) {
        if (i2 == 2 && !player.isPlayingAd()) {
            AdPlaybackState m30045a = this.f54126a.m30045a();
            int m26587a = this.f54127b.m26587a(m30045a);
            if (m26587a == -1) {
                return false;
            }
            AdPlaybackState.AdGroup m6925b = m30045a.m6925b(m26587a);
            int i3 = m6925b.f12610c;
            if (i3 != -1 && i3 != 0 && m6925b.f12612e[0] != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public final void m27776b(@NonNull Player player, int i2) {
        if (m27775a(player, i2)) {
            this.f54128c.m29782a(player.getPlayWhenReady(), i2);
        }
    }
}
