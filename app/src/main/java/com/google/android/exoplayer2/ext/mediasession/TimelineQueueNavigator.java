package com.google.android.exoplayer2.ext.mediasession;

import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public abstract class TimelineQueueNavigator implements MediaSessionConnector.QueueNavigator {

    /* renamed from: a */
    public long f10780a;

    @Override // com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector.QueueNavigator
    /* renamed from: a */
    public void mo6341a(Player player) {
        player.mo5633G();
    }

    @Override // com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector.QueueNavigator
    /* renamed from: b */
    public long mo6342b(Player player) {
        Timeline currentTimeline = player.getCurrentTimeline();
        if (currentTimeline.m5991s() || player.isPlayingAd()) {
            return 0L;
        }
        currentTimeline.m5990p(player.getCurrentMediaItemIndex(), null);
        currentTimeline.mo5937r();
        if (player.mo5632A(5)) {
            throw null;
        }
        throw null;
    }

    @Override // com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector.QueueNavigator
    /* renamed from: c */
    public final long mo6343c(@Nullable Player player) {
        return this.f10780a;
    }

    @Override // com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector.QueueNavigator
    /* renamed from: d */
    public void mo6344d(Player player) {
        player.mo5647t();
    }

    @Override // com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector.QueueNavigator
    /* renamed from: e */
    public final void mo6345e(Player player) {
        if (this.f10780a == -1 || player.getCurrentTimeline().mo5937r() > 0) {
            m6349j(player);
            throw null;
        }
        if (player.getCurrentTimeline().m5991s()) {
            return;
        }
        this.f10780a = player.getCurrentMediaItemIndex();
    }

    @Override // com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector.QueueNavigator
    /* renamed from: f */
    public void mo6346f(Player player, long j2) {
        int i2;
        Timeline currentTimeline = player.getCurrentTimeline();
        if (currentTimeline.m5991s() || player.isPlayingAd() || (i2 = (int) j2) < 0 || i2 >= currentTimeline.mo5937r()) {
            return;
        }
        player.mo5648u(i2);
    }

    @Override // com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector.CommandReceiver
    /* renamed from: g */
    public boolean mo6337g(Player player, String str, @Nullable Bundle bundle, @Nullable ResultReceiver resultReceiver) {
        return false;
    }

    @Override // com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector.QueueNavigator
    /* renamed from: h */
    public final void mo6347h(Player player) {
        m6349j(player);
        throw null;
    }

    /* renamed from: i */
    public abstract MediaDescriptionCompat m6348i(Player player, int i2);

    /* renamed from: j */
    public final void m6349j(Player player) {
        Timeline currentTimeline = player.getCurrentTimeline();
        if (currentTimeline.m5991s()) {
            Collections.emptyList();
            throw null;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        int min = Math.min(0, currentTimeline.mo5937r());
        int currentMediaItemIndex = player.getCurrentMediaItemIndex();
        arrayDeque.add(new MediaSessionCompat.QueueItem(null, m6348i(player, currentMediaItemIndex), currentMediaItemIndex));
        boolean mo5712E = player.mo5712E();
        int i2 = currentMediaItemIndex;
        while (true) {
            if ((currentMediaItemIndex != -1 || i2 != -1) && arrayDeque.size() < min) {
                if (i2 != -1 && (i2 = currentTimeline.mo5611g(i2, 0, mo5712E)) != -1) {
                    arrayDeque.add(new MediaSessionCompat.QueueItem(null, m6348i(player, i2), i2));
                }
                if (currentMediaItemIndex != -1 && arrayDeque.size() < min && (currentMediaItemIndex = currentTimeline.mo5614n(currentMediaItemIndex, 0, mo5712E)) != -1) {
                    arrayDeque.addFirst(new MediaSessionCompat.QueueItem(null, m6348i(player, currentMediaItemIndex), currentMediaItemIndex));
                }
            }
        }
        new ArrayList(arrayDeque);
        throw null;
    }
}
