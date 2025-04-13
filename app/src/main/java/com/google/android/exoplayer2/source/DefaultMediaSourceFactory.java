package com.google.android.exoplayer2.source;

import android.content.Context;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.drm.DrmSessionManagerProvider;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.SingleSampleMediaSource;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DefaultDataSource;
import com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class DefaultMediaSourceFactory implements MediaSourceFactory {

    /* renamed from: a */
    public final DataSource.Factory f12290a;

    /* renamed from: b */
    public final DelegateFactoryLoader f12291b;

    /* renamed from: c */
    @Nullable
    public LoadErrorHandlingPolicy f12292c;

    /* renamed from: d */
    public long f12293d;

    /* renamed from: e */
    public long f12294e;

    /* renamed from: f */
    public long f12295f;

    /* renamed from: g */
    public float f12296g;

    /* renamed from: h */
    public float f12297h;

    public interface AdsLoaderProvider {
    }

    public static final class DelegateFactoryLoader {

        /* renamed from: a */
        public final DataSource.Factory f12298a;

        /* renamed from: b */
        public final ExtractorsFactory f12299b;

        /* renamed from: c */
        public final Map<Integer, Supplier<MediaSourceFactory>> f12300c = new HashMap();

        /* renamed from: d */
        public final Set<Integer> f12301d = new HashSet();

        /* renamed from: e */
        public final Map<Integer, MediaSourceFactory> f12302e = new HashMap();

        /* renamed from: f */
        @Nullable
        public HttpDataSource.Factory f12303f;

        /* renamed from: g */
        @Nullable
        public String f12304g;

        /* renamed from: h */
        @Nullable
        public DrmSessionManager f12305h;

        /* renamed from: i */
        @Nullable
        public DrmSessionManagerProvider f12306i;

        /* renamed from: j */
        @Nullable
        public LoadErrorHandlingPolicy f12307j;

        /* renamed from: k */
        @Nullable
        public List<StreamKey> f12308k;

        public DelegateFactoryLoader(DataSource.Factory factory, ExtractorsFactory extractorsFactory) {
            this.f12298a = factory;
            this.f12299b = extractorsFactory;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0079  */
        @androidx.annotation.Nullable
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.google.common.base.Supplier<com.google.android.exoplayer2.source.MediaSourceFactory> m6817a(int r6) {
            /*
                r5 = this;
                java.lang.Class<com.google.android.exoplayer2.source.MediaSourceFactory> r0 = com.google.android.exoplayer2.source.MediaSourceFactory.class
                java.util.Map<java.lang.Integer, com.google.common.base.Supplier<com.google.android.exoplayer2.source.MediaSourceFactory>> r1 = r5.f12300c
                java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
                boolean r1 = r1.containsKey(r2)
                if (r1 == 0) goto L1b
                java.util.Map<java.lang.Integer, com.google.common.base.Supplier<com.google.android.exoplayer2.source.MediaSourceFactory>> r0 = r5.f12300c
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                java.lang.Object r6 = r0.get(r6)
                com.google.common.base.Supplier r6 = (com.google.common.base.Supplier) r6
                return r6
            L1b:
                r1 = 0
                r2 = 0
                if (r6 == 0) goto L60
                r3 = 1
                if (r6 == r3) goto L4f
                r4 = 2
                if (r6 == r4) goto L43
                r4 = 3
                if (r6 == r4) goto L33
                r0 = 4
                if (r6 == r0) goto L2c
                goto L6e
            L2c:
                com.google.android.exoplayer2.source.e r0 = new com.google.android.exoplayer2.source.e     // Catch: java.lang.ClassNotFoundException -> L6d
                r0.<init>()     // Catch: java.lang.ClassNotFoundException -> L6d
                r1 = r0
                goto L6e
            L33:
                java.lang.String r3 = "com.google.android.exoplayer2.source.rtsp.RtspMediaSource$Factory"
                java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.ClassNotFoundException -> L6d
                java.lang.Class r0 = r3.asSubclass(r0)     // Catch: java.lang.ClassNotFoundException -> L6d
                com.google.android.exoplayer2.source.e r3 = new com.google.android.exoplayer2.source.e     // Catch: java.lang.ClassNotFoundException -> L6d
                r3.<init>()     // Catch: java.lang.ClassNotFoundException -> L6d
                goto L6b
            L43:
                java.lang.Class<com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory> r2 = com.google.android.exoplayer2.source.hls.HlsMediaSource.Factory.class
                java.lang.Class r0 = r2.asSubclass(r0)     // Catch: java.lang.ClassNotFoundException -> L6d
                com.google.android.exoplayer2.source.d r2 = new com.google.android.exoplayer2.source.d     // Catch: java.lang.ClassNotFoundException -> L6d
                r2.<init>(r5)     // Catch: java.lang.ClassNotFoundException -> L6d
                goto L5e
            L4f:
                java.lang.String r2 = "com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource$Factory"
                java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.ClassNotFoundException -> L6d
                java.lang.Class r0 = r2.asSubclass(r0)     // Catch: java.lang.ClassNotFoundException -> L6d
                com.google.android.exoplayer2.source.d r2 = new com.google.android.exoplayer2.source.d     // Catch: java.lang.ClassNotFoundException -> L6d
                r2.<init>(r5)     // Catch: java.lang.ClassNotFoundException -> L6d
            L5e:
                r1 = r2
                goto L6e
            L60:
                java.lang.Class<com.google.android.exoplayer2.source.dash.DashMediaSource$Factory> r3 = com.google.android.exoplayer2.source.dash.DashMediaSource.Factory.class
                java.lang.Class r0 = r3.asSubclass(r0)     // Catch: java.lang.ClassNotFoundException -> L6d
                com.google.android.exoplayer2.source.d r3 = new com.google.android.exoplayer2.source.d     // Catch: java.lang.ClassNotFoundException -> L6d
                r3.<init>(r5)     // Catch: java.lang.ClassNotFoundException -> L6d
            L6b:
                r1 = r3
                goto L6e
            L6d:
            L6e:
                java.util.Map<java.lang.Integer, com.google.common.base.Supplier<com.google.android.exoplayer2.source.MediaSourceFactory>> r0 = r5.f12300c
                java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
                r0.put(r2, r1)
                if (r1 == 0) goto L82
                java.util.Set<java.lang.Integer> r0 = r5.f12301d
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                r0.add(r6)
            L82:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.DefaultMediaSourceFactory.DelegateFactoryLoader.m6817a(int):com.google.common.base.Supplier");
        }
    }

    public static final class UnknownSubtitlesExtractor implements Extractor {

        /* renamed from: a */
        public final Format f12309a;

        public UnknownSubtitlesExtractor(Format format) {
            this.f12309a = format;
        }

        @Override // com.google.android.exoplayer2.extractor.Extractor
        /* renamed from: b */
        public void mo6401b(ExtractorOutput extractorOutput) {
            TrackOutput mo6392b = extractorOutput.mo6392b(0, 3);
            extractorOutput.mo6393d(new SeekMap.Unseekable(-9223372036854775807L, 0L));
            extractorOutput.mo6394h();
            Format.Builder m5829b = this.f12309a.m5829b();
            m5829b.f9687k = "text/x-unknown";
            m5829b.f9684h = this.f12309a.f9659m;
            mo6392b.mo6399e(m5829b.m5833a());
        }

        @Override // com.google.android.exoplayer2.extractor.Extractor
        /* renamed from: c */
        public void mo6402c(long j2, long j3) {
        }

        @Override // com.google.android.exoplayer2.extractor.Extractor
        /* renamed from: e */
        public boolean mo6403e(ExtractorInput extractorInput) {
            return true;
        }

        @Override // com.google.android.exoplayer2.extractor.Extractor
        /* renamed from: g */
        public int mo6404g(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
            return extractorInput.mo6381g(Integer.MAX_VALUE) == -1 ? -1 : 0;
        }

        @Override // com.google.android.exoplayer2.extractor.Extractor
        public void release() {
        }
    }

    public DefaultMediaSourceFactory(Context context, ExtractorsFactory extractorsFactory) {
        DefaultDataSource.Factory factory = new DefaultDataSource.Factory(context);
        this.f12290a = factory;
        this.f12291b = new DelegateFactoryLoader(factory, extractorsFactory);
        this.f12293d = -9223372036854775807L;
        this.f12294e = -9223372036854775807L;
        this.f12295f = -9223372036854775807L;
        this.f12296g = -3.4028235E38f;
        this.f12297h = -3.4028235E38f;
    }

    /* renamed from: h */
    public static MediaSourceFactory m6809h(Class cls, DataSource.Factory factory) {
        try {
            return (MediaSourceFactory) cls.getConstructor(DataSource.Factory.class).newInstance(factory);
        } catch (Exception e2) {
            throw new IllegalStateException(e2);
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceFactory
    @Deprecated
    /* renamed from: a */
    public MediaSourceFactory mo6810a(@Nullable String str) {
        DelegateFactoryLoader delegateFactoryLoader = this.f12291b;
        delegateFactoryLoader.f12304g = str;
        Iterator<MediaSourceFactory> it = delegateFactoryLoader.f12302e.values().iterator();
        while (it.hasNext()) {
            it.next().mo6810a(str);
        }
        return this;
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceFactory
    @Deprecated
    /* renamed from: b */
    public MediaSourceFactory mo6811b(@Nullable List list) {
        DelegateFactoryLoader delegateFactoryLoader = this.f12291b;
        delegateFactoryLoader.f12308k = list;
        Iterator<MediaSourceFactory> it = delegateFactoryLoader.f12302e.values().iterator();
        while (it.hasNext()) {
            it.next().mo6811b(list);
        }
        return this;
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceFactory
    /* renamed from: c */
    public MediaSource mo6812c(MediaItem mediaItem) {
        MediaItem mediaItem2 = mediaItem;
        Objects.requireNonNull(mediaItem2.f9714c);
        MediaItem.LocalConfiguration localConfiguration = mediaItem2.f9714c;
        int m7710I = Util.m7710I(localConfiguration.f9770a, localConfiguration.f9771b);
        DelegateFactoryLoader delegateFactoryLoader = this.f12291b;
        MediaSourceFactory mediaSourceFactory = delegateFactoryLoader.f12302e.get(Integer.valueOf(m7710I));
        if (mediaSourceFactory == null) {
            Supplier<MediaSourceFactory> m6817a = delegateFactoryLoader.m6817a(m7710I);
            if (m6817a == null) {
                mediaSourceFactory = null;
            } else {
                mediaSourceFactory = m6817a.get();
                HttpDataSource.Factory factory = delegateFactoryLoader.f12303f;
                if (factory != null) {
                    mediaSourceFactory.mo6813d(factory);
                }
                String str = delegateFactoryLoader.f12304g;
                if (str != null) {
                    mediaSourceFactory.mo6810a(str);
                }
                DrmSessionManager drmSessionManager = delegateFactoryLoader.f12305h;
                if (drmSessionManager != null) {
                    mediaSourceFactory.mo6814e(drmSessionManager);
                }
                DrmSessionManagerProvider drmSessionManagerProvider = delegateFactoryLoader.f12306i;
                if (drmSessionManagerProvider != null) {
                    mediaSourceFactory.mo6815f(drmSessionManagerProvider);
                }
                LoadErrorHandlingPolicy loadErrorHandlingPolicy = delegateFactoryLoader.f12307j;
                if (loadErrorHandlingPolicy != null) {
                    mediaSourceFactory.mo6816g(loadErrorHandlingPolicy);
                }
                List<StreamKey> list = delegateFactoryLoader.f12308k;
                if (list != null) {
                    mediaSourceFactory.mo6811b(list);
                }
                delegateFactoryLoader.f12302e.put(Integer.valueOf(m7710I), mediaSourceFactory);
            }
        }
        StringBuilder sb = new StringBuilder(68);
        sb.append("No suitable media source factory found for content type: ");
        sb.append(m7710I);
        Assertions.m7519g(mediaSourceFactory, sb.toString());
        MediaItem.LiveConfiguration.Builder m5844b = mediaItem2.f9715d.m5844b();
        MediaItem.LiveConfiguration liveConfiguration = mediaItem2.f9715d;
        if (liveConfiguration.f9760b == -9223372036854775807L) {
            m5844b.f9765a = this.f12293d;
        }
        if (liveConfiguration.f9763e == -3.4028235E38f) {
            m5844b.f9768d = this.f12296g;
        }
        if (liveConfiguration.f9764f == -3.4028235E38f) {
            m5844b.f9769e = this.f12297h;
        }
        if (liveConfiguration.f9761c == -9223372036854775807L) {
            m5844b.f9766b = this.f12294e;
        }
        if (liveConfiguration.f9762d == -9223372036854775807L) {
            m5844b.f9767c = this.f12295f;
        }
        MediaItem.LiveConfiguration m5845a = m5844b.m5845a();
        if (!m5845a.equals(mediaItem2.f9715d)) {
            MediaItem.Builder m5838b = mediaItem.m5838b();
            m5838b.f9729l = m5845a.m5844b();
            mediaItem2 = m5838b.m5839a();
        }
        MediaSource mo6812c = mediaSourceFactory.mo6812c(mediaItem2);
        ImmutableList<MediaItem.SubtitleConfiguration> immutableList = mediaItem2.f9714c.f9776g;
        if (!immutableList.isEmpty()) {
            MediaSource[] mediaSourceArr = new MediaSource[immutableList.size() + 1];
            int i2 = 0;
            mediaSourceArr[0] = mo6812c;
            while (i2 < immutableList.size()) {
                SingleSampleMediaSource.Factory factory2 = new SingleSampleMediaSource.Factory(this.f12290a);
                LoadErrorHandlingPolicy loadErrorHandlingPolicy2 = this.f12292c;
                if (loadErrorHandlingPolicy2 == null) {
                    loadErrorHandlingPolicy2 = new DefaultLoadErrorHandlingPolicy();
                }
                factory2.f12583b = loadErrorHandlingPolicy2;
                int i3 = i2 + 1;
                mediaSourceArr[i3] = new SingleSampleMediaSource(null, immutableList.get(i2), factory2.f12582a, -9223372036854775807L, factory2.f12583b, factory2.f12584c, null, null);
                i2 = i3;
            }
            mo6812c = new MergingMediaSource(mediaSourceArr);
        }
        MediaSource mediaSource = mo6812c;
        MediaItem.ClippingConfiguration clippingConfiguration = mediaItem2.f9717f;
        long j2 = clippingConfiguration.f9731b;
        if (j2 != 0 || clippingConfiguration.f9732c != Long.MIN_VALUE || clippingConfiguration.f9734e) {
            long m7717P = Util.m7717P(j2);
            long m7717P2 = Util.m7717P(mediaItem2.f9717f.f9732c);
            MediaItem.ClippingConfiguration clippingConfiguration2 = mediaItem2.f9717f;
            mediaSource = new ClippingMediaSource(mediaSource, m7717P, m7717P2, !clippingConfiguration2.f9735f, clippingConfiguration2.f9733d, clippingConfiguration2.f9734e);
        }
        Objects.requireNonNull(mediaItem2.f9714c);
        if (mediaItem2.f9714c.f9773d != null) {
            Log.w("DefaultMediaSourceFactory", "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
        }
        return mediaSource;
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceFactory
    @Deprecated
    /* renamed from: d */
    public MediaSourceFactory mo6813d(@Nullable HttpDataSource.Factory factory) {
        DelegateFactoryLoader delegateFactoryLoader = this.f12291b;
        delegateFactoryLoader.f12303f = factory;
        Iterator<MediaSourceFactory> it = delegateFactoryLoader.f12302e.values().iterator();
        while (it.hasNext()) {
            it.next().mo6813d(factory);
        }
        return this;
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceFactory
    @Deprecated
    /* renamed from: e */
    public MediaSourceFactory mo6814e(@Nullable DrmSessionManager drmSessionManager) {
        DelegateFactoryLoader delegateFactoryLoader = this.f12291b;
        delegateFactoryLoader.f12305h = drmSessionManager;
        Iterator<MediaSourceFactory> it = delegateFactoryLoader.f12302e.values().iterator();
        while (it.hasNext()) {
            it.next().mo6814e(drmSessionManager);
        }
        return this;
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceFactory
    /* renamed from: f */
    public MediaSourceFactory mo6815f(@Nullable DrmSessionManagerProvider drmSessionManagerProvider) {
        DelegateFactoryLoader delegateFactoryLoader = this.f12291b;
        delegateFactoryLoader.f12306i = drmSessionManagerProvider;
        Iterator<MediaSourceFactory> it = delegateFactoryLoader.f12302e.values().iterator();
        while (it.hasNext()) {
            it.next().mo6815f(drmSessionManagerProvider);
        }
        return this;
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceFactory
    /* renamed from: g */
    public MediaSourceFactory mo6816g(@Nullable LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
        this.f12292c = loadErrorHandlingPolicy;
        DelegateFactoryLoader delegateFactoryLoader = this.f12291b;
        delegateFactoryLoader.f12307j = loadErrorHandlingPolicy;
        Iterator<MediaSourceFactory> it = delegateFactoryLoader.f12302e.values().iterator();
        while (it.hasNext()) {
            it.next().mo6816g(loadErrorHandlingPolicy);
        }
        return this;
    }
}
