package com.google.android.exoplayer2;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Timeline;

/* loaded from: classes.dex */
public abstract class BasePlayer implements Player {

    /* renamed from: a */
    public final Timeline.Window f9442a = new Timeline.Window();

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: A */
    public final boolean mo5632A(int i2) {
        return mo5732g().f9953b.f14637a.get(i2);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: G */
    public final void mo5633G() {
        if (getCurrentTimeline().m5991s() || isPlayingAd()) {
            return;
        }
        if (m5637M()) {
            int m5642c = m5642c();
            if (m5642c != -1) {
                mo5728e(m5642c, -9223372036854775807L);
                return;
            }
            return;
        }
        if (m5639O() && isCurrentMediaItemDynamic()) {
            mo5728e(getCurrentMediaItemIndex(), -9223372036854775807L);
        }
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: H */
    public final void mo5634H() {
        m5641Q(mo5744v());
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: I */
    public final void mo5635I() {
        m5641Q(-mo5715K());
    }

    /* renamed from: L */
    public final int m5636L() {
        Timeline currentTimeline = getCurrentTimeline();
        if (currentTimeline.m5991s()) {
            return -1;
        }
        int currentMediaItemIndex = getCurrentMediaItemIndex();
        int mo5742r = mo5742r();
        if (mo5742r == 1) {
            mo5742r = 0;
        }
        return currentTimeline.mo5614n(currentMediaItemIndex, mo5742r, mo5712E());
    }

    /* renamed from: M */
    public final boolean m5637M() {
        return m5642c() != -1;
    }

    /* renamed from: N */
    public final boolean m5638N() {
        return m5636L() != -1;
    }

    /* renamed from: O */
    public final boolean m5639O() {
        Timeline currentTimeline = getCurrentTimeline();
        return !currentTimeline.m5991s() && currentTimeline.m5990p(getCurrentMediaItemIndex(), this.f9442a).m6004d();
    }

    /* renamed from: P */
    public final boolean m5640P() {
        Timeline currentTimeline = getCurrentTimeline();
        return !currentTimeline.m5991s() && currentTimeline.m5990p(getCurrentMediaItemIndex(), this.f9442a).f10071i;
    }

    /* renamed from: Q */
    public final void m5641Q(long j2) {
        long currentPosition = getCurrentPosition() + j2;
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            currentPosition = Math.min(currentPosition, duration);
        }
        mo5643h(Math.max(currentPosition, 0L));
    }

    /* renamed from: c */
    public final int m5642c() {
        Timeline currentTimeline = getCurrentTimeline();
        if (currentTimeline.m5991s()) {
            return -1;
        }
        int currentMediaItemIndex = getCurrentMediaItemIndex();
        int mo5742r = mo5742r();
        if (mo5742r == 1) {
            mo5742r = 0;
        }
        return currentTimeline.mo5611g(currentMediaItemIndex, mo5742r, mo5712E());
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: h */
    public final void mo5643h(long j2) {
        mo5728e(getCurrentMediaItemIndex(), j2);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: i */
    public final void mo5644i() {
        mo5743s(0, Integer.MAX_VALUE);
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean isCurrentMediaItemDynamic() {
        Timeline currentTimeline = getCurrentTimeline();
        return !currentTimeline.m5991s() && currentTimeline.m5990p(getCurrentMediaItemIndex(), this.f9442a).f10072j;
    }

    @Override // com.google.android.exoplayer2.Player
    @Nullable
    /* renamed from: j */
    public final MediaItem mo5645j() {
        Timeline currentTimeline = getCurrentTimeline();
        if (currentTimeline.m5991s()) {
            return null;
        }
        return currentTimeline.m5990p(getCurrentMediaItemIndex(), this.f9442a).f10066d;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: m */
    public final long mo5646m() {
        Timeline currentTimeline = getCurrentTimeline();
        if (currentTimeline.m5991s()) {
            return -9223372036854775807L;
        }
        return currentTimeline.m5990p(getCurrentMediaItemIndex(), this.f9442a).m6003c();
    }

    @Override // com.google.android.exoplayer2.Player
    public final void pause() {
        setPlayWhenReady(false);
    }

    @Override // com.google.android.exoplayer2.Player
    public final void play() {
        setPlayWhenReady(true);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: t */
    public final void mo5647t() {
        int m5636L;
        if (getCurrentTimeline().m5991s() || isPlayingAd()) {
            return;
        }
        boolean m5638N = m5638N();
        if (m5639O() && !m5640P()) {
            if (!m5638N || (m5636L = m5636L()) == -1) {
                return;
            }
            mo5728e(m5636L, -9223372036854775807L);
            return;
        }
        if (!m5638N || getCurrentPosition() > mo5737l()) {
            mo5643h(0L);
            return;
        }
        int m5636L2 = m5636L();
        if (m5636L2 != -1) {
            mo5728e(m5636L2, -9223372036854775807L);
        }
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: u */
    public final void mo5648u(int i2) {
        mo5728e(i2, -9223372036854775807L);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: y */
    public final boolean mo5649y() {
        return getPlaybackState() == 3 && getPlayWhenReady() && getPlaybackSuppressionReason() == 0;
    }
}
