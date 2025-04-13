package com.google.android.exoplayer2.source.hls.playlist;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.ParsingLoadable;

/* loaded from: classes.dex */
public interface HlsPlaylistParserFactory {
    /* renamed from: a */
    ParsingLoadable.Parser<HlsPlaylist> mo7127a(HlsMasterPlaylist hlsMasterPlaylist, @Nullable HlsMediaPlaylist hlsMediaPlaylist);

    /* renamed from: b */
    ParsingLoadable.Parser<HlsPlaylist> mo7128b();
}
