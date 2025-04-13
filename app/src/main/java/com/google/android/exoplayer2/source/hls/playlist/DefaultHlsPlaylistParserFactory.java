package com.google.android.exoplayer2.source.hls.playlist;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.ParsingLoadable;

/* loaded from: classes.dex */
public final class DefaultHlsPlaylistParserFactory implements HlsPlaylistParserFactory {
    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParserFactory
    /* renamed from: a */
    public ParsingLoadable.Parser<HlsPlaylist> mo7127a(HlsMasterPlaylist hlsMasterPlaylist, @Nullable HlsMediaPlaylist hlsMediaPlaylist) {
        return new HlsPlaylistParser(hlsMasterPlaylist, hlsMediaPlaylist);
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParserFactory
    /* renamed from: b */
    public ParsingLoadable.Parser<HlsPlaylist> mo7128b() {
        return new HlsPlaylistParser();
    }
}
