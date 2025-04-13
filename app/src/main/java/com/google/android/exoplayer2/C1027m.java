package com.google.android.exoplayer2;

import com.google.android.exoplayer2.ExoPlayerImplInternal;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.util.ListenerSet;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.exoplayer2.m */
/* loaded from: classes.dex */
public final /* synthetic */ class C1027m implements ListenerSet.Event, ExoPlayerImplInternal.PlaybackInfoUpdateListener {

    /* renamed from: b */
    public final /* synthetic */ int f11820b;

    /* renamed from: c */
    public final /* synthetic */ ExoPlayerImpl f11821c;

    public /* synthetic */ C1027m(ExoPlayerImpl exoPlayerImpl, int i2) {
        this.f11820b = i2;
        this.f11821c = exoPlayerImpl;
    }

    @Override // com.google.android.exoplayer2.ExoPlayerImplInternal.PlaybackInfoUpdateListener
    /* renamed from: a */
    public void mo5823a(ExoPlayerImplInternal.PlaybackInfoUpdate playbackInfoUpdate) {
        ExoPlayerImpl exoPlayerImpl = this.f11821c;
        exoPlayerImpl.f9544f.mo7567b(new RunnableC1001e(exoPlayerImpl, playbackInfoUpdate, 0));
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
    public void invoke(Object obj) {
        switch (this.f11820b) {
            case 0:
                ((Player.EventListener) obj).onMediaMetadataChanged(this.f11821c.f9535C);
                break;
            default:
                ((Player.EventListener) obj).onAvailableCommandsChanged(this.f11821c.f9534B);
                break;
        }
    }
}
