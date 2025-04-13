package com.yandex.mobile.ads.instream.inroll;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.instream.InstreamAdBreak;
import com.yandex.mobile.ads.instream.InstreamAdBreakEventListener;
import com.yandex.mobile.ads.instream.player.p025ad.InstreamAdPlayer;
import com.yandex.mobile.ads.instream.player.p025ad.InstreamAdView;
import com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener;

@MainThread
/* loaded from: classes3.dex */
public interface Inroll {
    @NonNull
    InstreamAdBreak getInstreamAdBreak();

    void invalidate();

    void pause();

    void play(@NonNull InstreamAdView instreamAdView);

    void prepare(@NonNull InstreamAdPlayer instreamAdPlayer);

    void resume();

    void setListener(@Nullable InstreamAdBreakEventListener instreamAdBreakEventListener);

    void setVideoAdPlaybackListener(@Nullable VideoAdPlaybackListener videoAdPlaybackListener);
}
