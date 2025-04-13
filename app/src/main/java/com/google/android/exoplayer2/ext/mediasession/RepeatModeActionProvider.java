package com.google.android.exoplayer2.ext.mediasession;

import android.os.Bundle;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector;
import com.google.android.exoplayer2.util.RepeatModeUtil;
import com.swiftsoft.anixartd.C2507R;

/* loaded from: classes.dex */
public final class RepeatModeActionProvider implements MediaSessionConnector.CustomActionProvider {
    @Override // com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector.CustomActionProvider
    /* renamed from: a */
    public void mo6338a(Player player, String str, @Nullable Bundle bundle) {
        int mo5742r = player.mo5742r();
        int m7674a = RepeatModeUtil.m7674a(mo5742r, 0);
        if (mo5742r != m7674a) {
            player.mo5730f(m7674a);
        }
    }

    @Override // com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector.CustomActionProvider
    /* renamed from: b */
    public PlaybackStateCompat.CustomAction mo6339b(Player player) {
        int mo5742r = player.mo5742r();
        PlaybackStateCompat.CustomAction.Builder builder = new PlaybackStateCompat.CustomAction.Builder("ACTION_EXO_REPEAT_MODE", null, mo5742r != 1 ? mo5742r != 2 ? C2507R.drawable.exo_media_action_repeat_off : C2507R.drawable.exo_media_action_repeat_all : C2507R.drawable.exo_media_action_repeat_one);
        return new PlaybackStateCompat.CustomAction(builder.f191a, null, builder.f193c, null);
    }
}
