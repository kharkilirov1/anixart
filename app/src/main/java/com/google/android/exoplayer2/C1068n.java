package com.google.android.exoplayer2;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.trackselection.TrackSelectionParameters;
import com.google.android.exoplayer2.util.FlagSet;
import com.google.android.exoplayer2.util.ListenerSet;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.exoplayer2.n */
/* loaded from: classes.dex */
public final /* synthetic */ class C1068n implements ListenerSet.Event, ListenerSet.IterationFinishedEvent {

    /* renamed from: b */
    public final /* synthetic */ int f12141b;

    /* renamed from: c */
    public final /* synthetic */ Object f12142c;

    public /* synthetic */ C1068n(Object obj, int i2) {
        this.f12141b = i2;
        this.f12142c = obj;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.IterationFinishedEvent
    /* renamed from: e */
    public void mo5568e(Object obj, FlagSet flagSet) {
        Player player = (Player) this.f12142c;
        int i2 = ExoPlayerImpl.f9532H;
        ((Player.EventListener) obj).onEvents(player, new Player.Events(flagSet));
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public void invoke(Object obj) {
        switch (this.f12141b) {
            case 0:
                MediaMetadata mediaMetadata = (MediaMetadata) this.f12142c;
                int i2 = ExoPlayerImpl.f9532H;
                ((Player.EventListener) obj).onMediaMetadataChanged(mediaMetadata);
                break;
            default:
                TrackSelectionParameters trackSelectionParameters = (TrackSelectionParameters) this.f12142c;
                int i3 = ExoPlayerImpl.f9532H;
                ((Player.EventListener) obj).onTrackSelectionParametersChanged(trackSelectionParameters);
                break;
        }
    }
}
