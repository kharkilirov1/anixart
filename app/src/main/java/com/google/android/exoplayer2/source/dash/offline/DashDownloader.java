package com.google.android.exoplayer2.source.dash.offline;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.extractor.ChunkIndex;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor;
import com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor;
import com.google.android.exoplayer2.offline.SegmentDownloader;
import com.google.android.exoplayer2.source.chunk.BundledChunkExtractor;
import com.google.android.exoplayer2.source.dash.DashUtil;
import com.google.android.exoplayer2.source.dash.manifest.DashManifest;
import com.google.android.exoplayer2.source.dash.manifest.DashManifestParser;
import com.google.android.exoplayer2.source.dash.manifest.RangedUri;
import com.google.android.exoplayer2.source.dash.manifest.Representation;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.cache.CacheDataSource;
import com.google.android.exoplayer2.util.RunnableFutureTask;
import java.io.IOException;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class DashDownloader extends SegmentDownloader<DashManifest> {

    /* renamed from: com.google.android.exoplayer2.source.dash.offline.DashDownloader$1 */
    class C11051 extends RunnableFutureTask<ChunkIndex, IOException> {

        /* renamed from: i */
        public final /* synthetic */ DataSource f13014i;

        /* renamed from: j */
        public final /* synthetic */ int f13015j;

        /* renamed from: k */
        public final /* synthetic */ Representation f13016k;

        @Override // com.google.android.exoplayer2.util.RunnableFutureTask
        /* renamed from: b */
        public ChunkIndex mo6754b() throws Exception {
            DataSource dataSource = this.f13014i;
            int i2 = this.f13015j;
            Representation representation = this.f13016k;
            if (representation.f12980g == null) {
                return null;
            }
            Format format = representation.f12974a;
            String str = format.f9658l;
            Extractor matroskaExtractor = str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm")) ? new MatroskaExtractor(0) : new FragmentedMp4Extractor(0, null, null, Collections.emptyList(), null);
            BundledChunkExtractor bundledChunkExtractor = new BundledChunkExtractor(matroskaExtractor, i2, format);
            try {
                RangedUri rangedUri = representation.f12980g;
                Objects.requireNonNull(rangedUri);
                RangedUri mo7071m = representation.mo7071m();
                if (mo7071m != null) {
                    RangedUri m7068a = rangedUri.m7068a(mo7071m, representation.f12975b.get(0).f12923a);
                    if (m7068a == null) {
                        DashUtil.m7025b(dataSource, representation, 0, bundledChunkExtractor, rangedUri);
                    } else {
                        mo7071m = m7068a;
                    }
                    DashUtil.m7025b(dataSource, representation, 0, bundledChunkExtractor, mo7071m);
                }
                matroskaExtractor.release();
                SeekMap seekMap = bundledChunkExtractor.f12689i;
                if (seekMap instanceof ChunkIndex) {
                    return (ChunkIndex) seekMap;
                }
                return null;
            } catch (Throwable th) {
                bundledChunkExtractor.f12682b.release();
                throw th;
            }
        }
    }

    public DashDownloader(MediaItem mediaItem, CacheDataSource.Factory factory, Executor executor) {
        super(mediaItem, new DashManifestParser(), factory, executor);
        throw null;
    }
}
