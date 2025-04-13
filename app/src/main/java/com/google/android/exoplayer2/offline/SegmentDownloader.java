package com.google.android.exoplayer2.offline;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.offline.Downloader;
import com.google.android.exoplayer2.offline.FilterableManifest;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import com.google.android.exoplayer2.upstream.cache.CacheDataSource;
import com.google.android.exoplayer2.upstream.cache.CacheWriter;
import com.google.android.exoplayer2.util.RunnableFutureTask;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class SegmentDownloader<M extends FilterableManifest<M>> implements Downloader {

    /* renamed from: a */
    public final ParsingLoadable.Parser<M> f12192a;

    /* renamed from: b */
    public final CacheDataSource.Factory f12193b;

    /* renamed from: c */
    public final Executor f12194c;

    /* renamed from: com.google.android.exoplayer2.offline.SegmentDownloader$1 */
    class C10771 extends RunnableFutureTask<FilterableManifest<Object>, IOException> {

        /* renamed from: i */
        public final /* synthetic */ DataSource f12195i;

        /* renamed from: j */
        public final /* synthetic */ DataSpec f12196j;

        /* renamed from: k */
        public final /* synthetic */ SegmentDownloader f12197k;

        @Override // com.google.android.exoplayer2.util.RunnableFutureTask
        /* renamed from: b */
        public FilterableManifest<Object> mo6754b() throws Exception {
            ParsingLoadable parsingLoadable = new ParsingLoadable(this.f12195i, this.f12196j, 4, this.f12197k.f12192a);
            parsingLoadable.mo6865a();
            T t = parsingLoadable.f14496f;
            Objects.requireNonNull(t);
            return (FilterableManifest) t;
        }
    }

    public static final class ProgressNotifier implements CacheWriter.ProgressListener {

        /* renamed from: a */
        public final Downloader.ProgressListener f12198a;

        /* renamed from: b */
        public final long f12199b;

        /* renamed from: c */
        public final int f12200c;

        /* renamed from: d */
        public long f12201d;

        /* renamed from: e */
        public int f12202e;

        @Override // com.google.android.exoplayer2.upstream.cache.CacheWriter.ProgressListener
        /* renamed from: a */
        public void mo6756a(long j2, long j3, long j4) {
            long j5 = this.f12201d + j4;
            this.f12201d = j5;
            this.f12198a.mo6746a(this.f12199b, j5, m6757b());
        }

        /* renamed from: b */
        public final float m6757b() {
            long j2 = this.f12199b;
            if (j2 != -1 && j2 != 0) {
                return (this.f12201d * 100.0f) / j2;
            }
            int i2 = this.f12200c;
            if (i2 != 0) {
                return (this.f12202e * 100.0f) / i2;
            }
            return -1.0f;
        }
    }

    public static class Segment implements Comparable<Segment> {

        /* renamed from: b */
        public final long f12203b;

        @Override // java.lang.Comparable
        public int compareTo(Segment segment) {
            return Util.m7739h(this.f12203b, segment.f12203b);
        }
    }

    public static final class SegmentDownloadRunnable extends RunnableFutureTask<Void, IOException> {

        /* renamed from: i */
        @Nullable
        public final ProgressNotifier f12204i;

        /* renamed from: j */
        public final CacheWriter f12205j;

        @Override // com.google.android.exoplayer2.util.RunnableFutureTask
        /* renamed from: a */
        public void mo6753a() {
            this.f12205j.f14593j = true;
        }

        @Override // com.google.android.exoplayer2.util.RunnableFutureTask
        /* renamed from: b */
        public Void mo6754b() throws Exception {
            this.f12205j.m7503a();
            ProgressNotifier progressNotifier = this.f12204i;
            if (progressNotifier == null) {
                return null;
            }
            progressNotifier.f12202e++;
            progressNotifier.f12198a.mo6746a(progressNotifier.f12199b, progressNotifier.f12201d, progressNotifier.m6757b());
            return null;
        }
    }

    public SegmentDownloader(MediaItem mediaItem, ParsingLoadable.Parser<M> parser, CacheDataSource.Factory factory, Executor executor) {
        Objects.requireNonNull(mediaItem.f9714c);
        m6755b(mediaItem.f9714c.f9770a);
        this.f12192a = parser;
        new ArrayList(mediaItem.f9714c.f9774e);
        this.f12193b = factory;
        this.f12194c = executor;
        Objects.requireNonNull(factory);
        Objects.requireNonNull(null);
        throw null;
    }

    /* renamed from: b */
    public static DataSpec m6755b(Uri uri) {
        DataSpec.Builder builder = new DataSpec.Builder();
        builder.f14372a = uri;
        builder.f14380i = 1;
        return builder.m7438a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:?, code lost:
    
        throw null;
     */
    @Override // com.google.android.exoplayer2.offline.Downloader
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo6750a(@androidx.annotation.Nullable com.google.android.exoplayer2.offline.Downloader.ProgressListener r2) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r1 = this;
            java.util.ArrayDeque r2 = new java.util.ArrayDeque
            r2.<init>()
            java.util.ArrayDeque r2 = new java.util.ArrayDeque
            r2.<init>()
            r2 = 0
            com.google.android.exoplayer2.upstream.cache.CacheDataSource$Factory r0 = r1.f12193b     // Catch: java.lang.Throwable -> L14
            java.util.Objects.requireNonNull(r0)     // Catch: java.lang.Throwable -> L14
            java.util.Objects.requireNonNull(r2)     // Catch: java.lang.Throwable -> L14
            throw r2     // Catch: java.lang.Throwable -> L14
        L14:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.offline.SegmentDownloader.mo6750a(com.google.android.exoplayer2.offline.Downloader$ProgressListener):void");
    }

    @Override // com.google.android.exoplayer2.offline.Downloader
    public final void remove() {
        Objects.requireNonNull(this.f12193b);
        Objects.requireNonNull(null);
        throw null;
    }
}
