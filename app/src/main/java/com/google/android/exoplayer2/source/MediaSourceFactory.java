package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.drm.DrmSessionManagerProvider;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import java.util.List;

/* loaded from: classes.dex */
public interface MediaSourceFactory {

    /* renamed from: com.google.android.exoplayer2.source.MediaSourceFactory$1 */
    public class C10861 implements MediaSourceFactory {
        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        @Deprecated
        /* renamed from: a */
        public MediaSourceFactory mo6810a(@Nullable String str) {
            return this;
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        /* renamed from: b */
        public MediaSourceFactory mo6811b(List list) {
            return this;
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        /* renamed from: c */
        public MediaSource mo6812c(MediaItem mediaItem) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        @Deprecated
        /* renamed from: d */
        public MediaSourceFactory mo6813d(@Nullable HttpDataSource.Factory factory) {
            return this;
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        @Deprecated
        /* renamed from: e */
        public MediaSourceFactory mo6814e(@Nullable DrmSessionManager drmSessionManager) {
            return this;
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        /* renamed from: f */
        public MediaSourceFactory mo6815f(@Nullable DrmSessionManagerProvider drmSessionManagerProvider) {
            return this;
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        /* renamed from: g */
        public MediaSourceFactory mo6816g(@Nullable LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            return this;
        }
    }

    @Deprecated
    /* renamed from: a */
    MediaSourceFactory mo6810a(@Nullable String str);

    @Deprecated
    /* renamed from: b */
    MediaSourceFactory mo6811b(@Nullable List<StreamKey> list);

    /* renamed from: c */
    MediaSource mo6812c(MediaItem mediaItem);

    @Deprecated
    /* renamed from: d */
    MediaSourceFactory mo6813d(@Nullable HttpDataSource.Factory factory);

    @Deprecated
    /* renamed from: e */
    MediaSourceFactory mo6814e(@Nullable DrmSessionManager drmSessionManager);

    /* renamed from: f */
    MediaSourceFactory mo6815f(@Nullable DrmSessionManagerProvider drmSessionManagerProvider);

    /* renamed from: g */
    MediaSourceFactory mo6816g(@Nullable LoadErrorHandlingPolicy loadErrorHandlingPolicy);
}
