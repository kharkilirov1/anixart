package com.google.android.exoplayer2;

import com.google.android.exoplayer2.ExoPlayerImplInternal;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.google.android.exoplayer2.e */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1001e implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f10760b;

    /* renamed from: c */
    public final /* synthetic */ Object f10761c;

    /* renamed from: d */
    public final /* synthetic */ Object f10762d;

    public /* synthetic */ RunnableC1001e(Object obj, Object obj2, int i2) {
        this.f10760b = i2;
        this.f10761c = obj;
        this.f10762d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j2;
        boolean z;
        long j3;
        switch (this.f10760b) {
            case 0:
                ExoPlayerImpl exoPlayerImpl = (ExoPlayerImpl) this.f10761c;
                ExoPlayerImplInternal.PlaybackInfoUpdate playbackInfoUpdate = (ExoPlayerImplInternal.PlaybackInfoUpdate) this.f10762d;
                int i2 = exoPlayerImpl.f9561w - playbackInfoUpdate.f9623c;
                exoPlayerImpl.f9561w = i2;
                boolean z2 = true;
                if (playbackInfoUpdate.f9624d) {
                    exoPlayerImpl.f9562x = playbackInfoUpdate.f9625e;
                    exoPlayerImpl.f9563y = true;
                }
                if (playbackInfoUpdate.f9626f) {
                    exoPlayerImpl.f9564z = playbackInfoUpdate.f9627g;
                }
                if (i2 == 0) {
                    Timeline timeline = playbackInfoUpdate.f9622b.f9929a;
                    if (!exoPlayerImpl.f9537E.f9929a.m5991s() && timeline.m5991s()) {
                        exoPlayerImpl.f9538F = -1;
                        exoPlayerImpl.f9539G = 0L;
                    }
                    if (!timeline.m5991s()) {
                        List asList = Arrays.asList(((PlaylistTimeline) timeline).f9980j);
                        Assertions.m7516d(asList.size() == exoPlayerImpl.f9550l.size());
                        for (int i3 = 0; i3 < asList.size(); i3++) {
                            exoPlayerImpl.f9550l.get(i3).f9566b = (Timeline) asList.get(i3);
                        }
                    }
                    long j4 = -9223372036854775807L;
                    if (exoPlayerImpl.f9563y) {
                        if (playbackInfoUpdate.f9622b.f9930b.equals(exoPlayerImpl.f9537E.f9930b) && playbackInfoUpdate.f9622b.f9932d == exoPlayerImpl.f9537E.f9947s) {
                            z2 = false;
                        }
                        if (z2) {
                            if (timeline.m5991s() || playbackInfoUpdate.f9622b.f9930b.m6828a()) {
                                j3 = playbackInfoUpdate.f9622b.f9932d;
                            } else {
                                PlaybackInfo playbackInfo = playbackInfoUpdate.f9622b;
                                j3 = exoPlayerImpl.m5725c0(timeline, playbackInfo.f9930b, playbackInfo.f9932d);
                            }
                            j4 = j3;
                        }
                        j2 = j4;
                        z = z2;
                    } else {
                        j2 = -9223372036854775807L;
                        z = false;
                    }
                    exoPlayerImpl.f9563y = false;
                    exoPlayerImpl.m5735i0(playbackInfoUpdate.f9622b, 1, exoPlayerImpl.f9564z, false, z, exoPlayerImpl.f9562x, j2, -1);
                    return;
                }
                return;
            default:
                ExoPlayerImplInternal exoPlayerImplInternal = (ExoPlayerImplInternal) this.f10761c;
                PlayerMessage playerMessage = (PlayerMessage) this.f10762d;
                Objects.requireNonNull(exoPlayerImplInternal);
                try {
                    exoPlayerImplInternal.m5789h(playerMessage);
                    return;
                } catch (ExoPlaybackException e2) {
                    Log.m7585b("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e2);
                    throw new RuntimeException(e2);
                }
        }
    }
}
