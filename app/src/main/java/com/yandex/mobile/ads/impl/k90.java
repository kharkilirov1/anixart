package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.instream.InstreamAdBreak;
import com.yandex.mobile.ads.instream.InstreamAdBreakEventListener;
import com.yandex.mobile.ads.instream.inroll.Inroll;
import com.yandex.mobile.ads.instream.pauseroll.Pauseroll;
import com.yandex.mobile.ads.instream.player.p025ad.InstreamAdPlayer;
import com.yandex.mobile.ads.instream.player.p025ad.InstreamAdView;
import com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener;

/* loaded from: classes3.dex */
public final class k90 implements Inroll, Pauseroll, y81 {

    /* renamed from: a */
    @NonNull
    private final m50 f51916a;

    /* renamed from: b */
    @NonNull
    private final n90 f51917b;

    /* renamed from: c */
    @NonNull
    private final r90 f51918c;

    /* renamed from: d */
    @NonNull
    private final xc1 f51919d;

    /* renamed from: e */
    @NonNull
    private final v30 f51920e;

    /* renamed from: f */
    @Nullable
    private m90 f51921f;

    /* renamed from: g */
    @Nullable
    private InstreamAdPlayer f51922g;

    public k90(@NonNull Context context, @NonNull m50 m50Var, @NonNull C5898v1 c5898v1) {
        this.f51916a = m50Var;
        r90 r90Var = new r90();
        this.f51918c = r90Var;
        this.f51917b = new n90(context, m50Var, c5898v1, r90Var);
        this.f51919d = new xc1();
        this.f51920e = new v30(this);
    }

    @Override // com.yandex.mobile.ads.instream.inroll.Inroll, com.yandex.mobile.ads.instream.pauseroll.Pauseroll
    @NonNull
    public final InstreamAdBreak getInstreamAdBreak() {
        return this.f51916a;
    }

    @Override // com.yandex.mobile.ads.instream.inroll.Inroll, com.yandex.mobile.ads.instream.pauseroll.Pauseroll
    public final void invalidate() {
        m90 m90Var = this.f51921f;
        if (m90Var != null) {
            m90Var.m26593a();
        }
        InstreamAdPlayer instreamAdPlayer = this.f51922g;
        if (instreamAdPlayer != null) {
            this.f51920e.m29180b(instreamAdPlayer);
        }
        this.f51921f = null;
        this.f51922g = null;
    }

    @Override // com.yandex.mobile.ads.impl.y81
    public final void invalidateAdPlayer() {
        m90 m90Var = this.f51921f;
        if (m90Var != null) {
            m90Var.m26593a();
        }
        InstreamAdPlayer instreamAdPlayer = this.f51922g;
        if (instreamAdPlayer != null) {
            this.f51920e.m29180b(instreamAdPlayer);
        }
        this.f51921f = null;
        this.f51922g = null;
    }

    @Override // com.yandex.mobile.ads.instream.inroll.Inroll, com.yandex.mobile.ads.instream.pauseroll.Pauseroll
    public final void pause() {
        m90 m90Var = this.f51921f;
        if (m90Var != null) {
            m90Var.m26596b();
        }
    }

    @Override // com.yandex.mobile.ads.instream.inroll.Inroll, com.yandex.mobile.ads.instream.pauseroll.Pauseroll
    public final void play(@NonNull InstreamAdView instreamAdView) {
        m90 m90Var = this.f51921f;
        if (m90Var != null) {
            m90Var.m26595a(instreamAdView);
        }
    }

    @Override // com.yandex.mobile.ads.instream.inroll.Inroll, com.yandex.mobile.ads.instream.pauseroll.Pauseroll
    public final void prepare(@NonNull InstreamAdPlayer instreamAdPlayer) {
        m90 m90Var = this.f51921f;
        if (m90Var != null) {
            m90Var.m26593a();
        }
        InstreamAdPlayer instreamAdPlayer2 = this.f51922g;
        if (instreamAdPlayer2 != null) {
            this.f51920e.m29180b(instreamAdPlayer2);
        }
        this.f51921f = null;
        this.f51922g = instreamAdPlayer;
        this.f51920e.m29179a(instreamAdPlayer);
        m90 m26824a = this.f51917b.m26824a(instreamAdPlayer);
        this.f51921f = m26824a;
        m26824a.m26594a(this.f51919d);
        this.f51921f.m26597c();
    }

    @Override // com.yandex.mobile.ads.instream.inroll.Inroll, com.yandex.mobile.ads.instream.pauseroll.Pauseroll
    public final void resume() {
        m90 m90Var = this.f51921f;
        if (m90Var != null) {
            m90Var.m26598d();
        }
    }

    @Override // com.yandex.mobile.ads.instream.inroll.Inroll, com.yandex.mobile.ads.instream.pauseroll.Pauseroll
    public final void setListener(@Nullable InstreamAdBreakEventListener instreamAdBreakEventListener) {
        this.f51918c.m27881a(instreamAdBreakEventListener);
    }

    @Override // com.yandex.mobile.ads.instream.inroll.Inroll, com.yandex.mobile.ads.instream.pauseroll.Pauseroll
    public final void setVideoAdPlaybackListener(@Nullable VideoAdPlaybackListener videoAdPlaybackListener) {
        this.f51919d.m29737a(videoAdPlaybackListener);
    }
}
