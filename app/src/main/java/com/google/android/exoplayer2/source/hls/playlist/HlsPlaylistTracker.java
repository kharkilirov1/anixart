package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.hls.HlsDataSourceFactory;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import java.io.IOException;

/* loaded from: classes.dex */
public interface HlsPlaylistTracker {

    public interface Factory {
        /* renamed from: b */
        HlsPlaylistTracker mo6097b(HlsDataSourceFactory hlsDataSourceFactory, LoadErrorHandlingPolicy loadErrorHandlingPolicy, HlsPlaylistParserFactory hlsPlaylistParserFactory);
    }

    public interface PlaylistEventListener {
        /* renamed from: b */
        void mo7100b();

        /* renamed from: d */
        boolean mo7101d(Uri uri, LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo, boolean z);
    }

    public static final class PlaylistResetException extends IOException {
        public PlaylistResetException(Uri uri) {
        }
    }

    public static final class PlaylistStuckException extends IOException {
        public PlaylistStuckException(Uri uri) {
        }
    }

    public interface PrimaryPlaylistListener {
        /* renamed from: d */
        void mo7105d(HlsMediaPlaylist hlsMediaPlaylist);
    }

    /* renamed from: a */
    boolean mo7131a(Uri uri);

    /* renamed from: b */
    void mo7132b(PlaylistEventListener playlistEventListener);

    /* renamed from: c */
    void mo7133c(Uri uri) throws IOException;

    /* renamed from: d */
    long mo7134d();

    /* renamed from: e */
    boolean mo7135e();

    /* renamed from: h */
    boolean mo7136h(Uri uri, long j2);

    @Nullable
    /* renamed from: i */
    HlsMasterPlaylist mo7137i();

    /* renamed from: j */
    void mo7138j(Uri uri, MediaSourceEventListener.EventDispatcher eventDispatcher, PrimaryPlaylistListener primaryPlaylistListener);

    /* renamed from: k */
    void mo7139k() throws IOException;

    /* renamed from: l */
    void mo7140l(Uri uri);

    /* renamed from: m */
    void mo7141m(PlaylistEventListener playlistEventListener);

    @Nullable
    /* renamed from: n */
    HlsMediaPlaylist mo7142n(Uri uri, boolean z);

    void stop();
}
