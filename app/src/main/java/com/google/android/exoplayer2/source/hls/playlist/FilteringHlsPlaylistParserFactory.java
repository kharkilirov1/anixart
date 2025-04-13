package com.google.android.exoplayer2.source.hls.playlist;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.offline.FilteringManifestParser;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import java.util.List;

/* loaded from: classes.dex */
public final class FilteringHlsPlaylistParserFactory implements HlsPlaylistParserFactory {

    /* renamed from: a */
    public final HlsPlaylistParserFactory f13273a;

    /* renamed from: b */
    public final List<StreamKey> f13274b;

    public FilteringHlsPlaylistParserFactory(HlsPlaylistParserFactory hlsPlaylistParserFactory, List<StreamKey> list) {
        this.f13273a = hlsPlaylistParserFactory;
        this.f13274b = list;
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParserFactory
    /* renamed from: a */
    public ParsingLoadable.Parser<HlsPlaylist> mo7127a(HlsMasterPlaylist hlsMasterPlaylist, @Nullable HlsMediaPlaylist hlsMediaPlaylist) {
        return new FilteringManifestParser(this.f13273a.mo7127a(hlsMasterPlaylist, hlsMediaPlaylist), this.f13274b);
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParserFactory
    /* renamed from: b */
    public ParsingLoadable.Parser<HlsPlaylist> mo7128b() {
        return new FilteringManifestParser(this.f13273a.mo7128b(), this.f13274b);
    }
}
