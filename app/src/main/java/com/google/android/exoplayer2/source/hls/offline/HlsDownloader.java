package com.google.android.exoplayer2.source.hls.offline;

import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.offline.SegmentDownloader;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylist;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser;
import com.google.android.exoplayer2.upstream.cache.CacheDataSource;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class HlsDownloader extends SegmentDownloader<HlsPlaylist> {
    public HlsDownloader(MediaItem mediaItem, CacheDataSource.Factory factory, Executor executor) {
        super(mediaItem, new HlsPlaylistParser(), factory, executor);
        throw null;
    }
}
