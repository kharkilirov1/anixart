package com.google.android.exoplayer2.source.dash;

import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.core.view.inputmethod.C0273a;
import com.google.android.exoplayer2.ExoPlayerLibraryInfo;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManagerProvider;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.drm.DrmSessionManagerProvider;
import com.google.android.exoplayer2.offline.FilteringManifestParser;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.BaseMediaSource;
import com.google.android.exoplayer2.source.CompositeSequenceableLoaderFactory;
import com.google.android.exoplayer2.source.DefaultCompositeSequenceableLoaderFactory;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.MediaSourceFactory;
import com.google.android.exoplayer2.source.chunk.ChunkSampleStream;
import com.google.android.exoplayer2.source.dash.DashChunkSource;
import com.google.android.exoplayer2.source.dash.DefaultDashChunkSource;
import com.google.android.exoplayer2.source.dash.PlayerEmsgHandler;
import com.google.android.exoplayer2.source.dash.manifest.DashManifest;
import com.google.android.exoplayer2.source.dash.manifest.DashManifestParser;
import com.google.android.exoplayer2.source.dash.manifest.Period;
import com.google.android.exoplayer2.source.dash.manifest.UtcTimingElement;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.LoaderErrorThrower;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import com.google.android.exoplayer2.upstream.StatsDataSource;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Charsets;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class DashMediaSource extends BaseMediaSource {

    /* renamed from: P */
    public static final /* synthetic */ int f12804P = 0;

    /* renamed from: A */
    public Loader f12805A;

    /* renamed from: B */
    @Nullable
    public TransferListener f12806B;

    /* renamed from: C */
    public IOException f12807C;

    /* renamed from: D */
    public Handler f12808D;

    /* renamed from: E */
    public MediaItem.LiveConfiguration f12809E;

    /* renamed from: F */
    public Uri f12810F;

    /* renamed from: G */
    public Uri f12811G;

    /* renamed from: H */
    public DashManifest f12812H;

    /* renamed from: I */
    public boolean f12813I;

    /* renamed from: J */
    public long f12814J;

    /* renamed from: K */
    public long f12815K;

    /* renamed from: L */
    public long f12816L;

    /* renamed from: M */
    public int f12817M;

    /* renamed from: N */
    public long f12818N;

    /* renamed from: O */
    public int f12819O;

    /* renamed from: h */
    public final MediaItem f12820h;

    /* renamed from: i */
    public final boolean f12821i;

    /* renamed from: j */
    public final DataSource.Factory f12822j;

    /* renamed from: k */
    public final DashChunkSource.Factory f12823k;

    /* renamed from: l */
    public final CompositeSequenceableLoaderFactory f12824l;

    /* renamed from: m */
    public final DrmSessionManager f12825m;

    /* renamed from: n */
    public final LoadErrorHandlingPolicy f12826n;

    /* renamed from: o */
    public final BaseUrlExclusionList f12827o;

    /* renamed from: p */
    public final long f12828p;

    /* renamed from: q */
    public final MediaSourceEventListener.EventDispatcher f12829q;

    /* renamed from: r */
    public final ParsingLoadable.Parser<? extends DashManifest> f12830r;

    /* renamed from: s */
    public final ManifestCallback f12831s;

    /* renamed from: t */
    public final Object f12832t;

    /* renamed from: u */
    public final SparseArray<DashMediaPeriod> f12833u;

    /* renamed from: v */
    public final Runnable f12834v;

    /* renamed from: w */
    public final Runnable f12835w;

    /* renamed from: x */
    public final PlayerEmsgHandler.PlayerEmsgCallback f12836x;

    /* renamed from: y */
    public final LoaderErrorThrower f12837y;

    /* renamed from: z */
    public DataSource f12838z;

    public static final class DashTimeline extends Timeline {

        /* renamed from: c */
        public final long f12840c;

        /* renamed from: d */
        public final long f12841d;

        /* renamed from: e */
        public final long f12842e;

        /* renamed from: f */
        public final int f12843f;

        /* renamed from: g */
        public final long f12844g;

        /* renamed from: h */
        public final long f12845h;

        /* renamed from: i */
        public final long f12846i;

        /* renamed from: j */
        public final DashManifest f12847j;

        /* renamed from: k */
        public final MediaItem f12848k;

        /* renamed from: l */
        @Nullable
        public final MediaItem.LiveConfiguration f12849l;

        public DashTimeline(long j2, long j3, long j4, int i2, long j5, long j6, long j7, DashManifest dashManifest, MediaItem mediaItem, @Nullable MediaItem.LiveConfiguration liveConfiguration) {
            Assertions.m7516d(dashManifest.f12930d == (liveConfiguration != null));
            this.f12840c = j2;
            this.f12841d = j3;
            this.f12842e = j4;
            this.f12843f = i2;
            this.f12844g = j5;
            this.f12845h = j6;
            this.f12846i = j7;
            this.f12847j = dashManifest;
            this.f12848k = mediaItem;
            this.f12849l = liveConfiguration;
        }

        /* renamed from: u */
        public static boolean m7008u(DashManifest dashManifest) {
            return dashManifest.f12930d && dashManifest.f12931e != -9223372036854775807L && dashManifest.f12928b == -9223372036854775807L;
        }

        @Override // com.google.android.exoplayer2.Timeline
        /* renamed from: d */
        public int mo5609d(Object obj) {
            int intValue;
            if ((obj instanceof Integer) && (intValue = ((Integer) obj).intValue() - this.f12843f) >= 0 && intValue < mo5936k()) {
                return intValue;
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.Timeline
        /* renamed from: i */
        public Timeline.Period mo5612i(int i2, Timeline.Period period, boolean z) {
            Assertions.m7515c(i2, 0, mo5936k());
            period.m5999i(z ? this.f12847j.f12939m.get(i2).f12961a : null, z ? Integer.valueOf(this.f12843f + i2) : null, 0, Util.m7717P(this.f12847j.m7041d(i2)), Util.m7717P(this.f12847j.f12939m.get(i2).f12962b - this.f12847j.m7039b(0).f12962b) - this.f12844g);
            return period;
        }

        @Override // com.google.android.exoplayer2.Timeline
        /* renamed from: k */
        public int mo5936k() {
            return this.f12847j.m7040c();
        }

        @Override // com.google.android.exoplayer2.Timeline
        /* renamed from: o */
        public Object mo5615o(int i2) {
            Assertions.m7515c(i2, 0, mo5936k());
            return Integer.valueOf(this.f12843f + i2);
        }

        @Override // com.google.android.exoplayer2.Timeline
        /* renamed from: q */
        public Timeline.Window mo5616q(int i2, Timeline.Window window, long j2) {
            DashSegmentIndex mo7070l;
            Assertions.m7515c(i2, 0, 1);
            long j3 = this.f12846i;
            if (m7008u(this.f12847j)) {
                if (j2 > 0) {
                    j3 += j2;
                    if (j3 > this.f12845h) {
                        j3 = -9223372036854775807L;
                    }
                }
                long j4 = this.f12844g + j3;
                long m7042e = this.f12847j.m7042e(0);
                int i3 = 0;
                while (i3 < this.f12847j.m7040c() - 1 && j4 >= m7042e) {
                    j4 -= m7042e;
                    i3++;
                    m7042e = this.f12847j.m7042e(i3);
                }
                Period m7039b = this.f12847j.m7039b(i3);
                int size = m7039b.f12963c.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size) {
                        i4 = -1;
                        break;
                    }
                    if (m7039b.f12963c.get(i4).f12918b == 2) {
                        break;
                    }
                    i4++;
                }
                if (i4 != -1 && (mo7070l = m7039b.f12963c.get(i4).f12919c.get(0).mo7070l()) != null && mo7070l.mo7022i(m7042e) != 0) {
                    j3 = (mo7070l.mo7014a(mo7070l.mo7019f(j4, m7042e)) + j3) - j4;
                }
            }
            long j5 = j3;
            Object obj = Timeline.Window.f10060s;
            MediaItem mediaItem = this.f12848k;
            DashManifest dashManifest = this.f12847j;
            window.m6005f(obj, mediaItem, dashManifest, this.f12840c, this.f12841d, this.f12842e, true, m7008u(dashManifest), this.f12849l, j5, this.f12845h, 0, mo5936k() - 1, this.f12844g);
            return window;
        }

        @Override // com.google.android.exoplayer2.Timeline
        /* renamed from: r */
        public int mo5937r() {
            return 1;
        }
    }

    public final class DefaultPlayerEmsgCallback implements PlayerEmsgHandler.PlayerEmsgCallback {
        public DefaultPlayerEmsgCallback(C11011 c11011) {
        }

        @Override // com.google.android.exoplayer2.source.dash.PlayerEmsgHandler.PlayerEmsgCallback
        /* renamed from: a */
        public void mo7009a() {
            DashMediaSource dashMediaSource = DashMediaSource.this;
            dashMediaSource.f12808D.removeCallbacks(dashMediaSource.f12835w);
            dashMediaSource.m7005Q();
        }

        @Override // com.google.android.exoplayer2.source.dash.PlayerEmsgHandler.PlayerEmsgCallback
        /* renamed from: b */
        public void mo7010b(long j2) {
            DashMediaSource dashMediaSource = DashMediaSource.this;
            long j3 = dashMediaSource.f12818N;
            if (j3 == -9223372036854775807L || j3 < j2) {
                dashMediaSource.f12818N = j2;
            }
        }
    }

    public static final class Factory implements MediaSourceFactory {

        /* renamed from: a */
        public final DashChunkSource.Factory f12851a;

        /* renamed from: b */
        @Nullable
        public final DataSource.Factory f12852b;

        /* renamed from: c */
        public boolean f12853c;

        /* renamed from: d */
        public DrmSessionManagerProvider f12854d = new DefaultDrmSessionManagerProvider();

        /* renamed from: f */
        public LoadErrorHandlingPolicy f12856f = new DefaultLoadErrorHandlingPolicy();

        /* renamed from: g */
        public long f12857g = -9223372036854775807L;

        /* renamed from: h */
        public long f12858h = 30000;

        /* renamed from: e */
        public CompositeSequenceableLoaderFactory f12855e = new DefaultCompositeSequenceableLoaderFactory();

        /* renamed from: i */
        public List<StreamKey> f12859i = Collections.emptyList();

        public Factory(DataSource.Factory factory) {
            this.f12851a = new DefaultDashChunkSource.Factory(factory);
            this.f12852b = factory;
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        @Deprecated
        /* renamed from: a */
        public MediaSourceFactory mo6810a(@Nullable String str) {
            if (!this.f12853c) {
                ((DefaultDrmSessionManagerProvider) this.f12854d).f10707f = str;
            }
            return this;
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        @Deprecated
        /* renamed from: b */
        public MediaSourceFactory mo6811b(@Nullable List list) {
            if (list == null) {
                list = Collections.emptyList();
            }
            this.f12859i = list;
            return this;
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        @Deprecated
        /* renamed from: d */
        public MediaSourceFactory mo6813d(@Nullable HttpDataSource.Factory factory) {
            if (!this.f12853c) {
                ((DefaultDrmSessionManagerProvider) this.f12854d).f10706e = factory;
            }
            return this;
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        @Deprecated
        /* renamed from: e */
        public MediaSourceFactory mo6814e(@Nullable DrmSessionManager drmSessionManager) {
            if (drmSessionManager == null) {
                m7012i(null);
            } else {
                m7012i(new C0273a(drmSessionManager, 6));
            }
            return this;
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        /* renamed from: f */
        public /* bridge */ /* synthetic */ MediaSourceFactory mo6815f(@Nullable DrmSessionManagerProvider drmSessionManagerProvider) {
            m7012i(drmSessionManagerProvider);
            return this;
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        /* renamed from: g */
        public MediaSourceFactory mo6816g(@Nullable LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            if (loadErrorHandlingPolicy == null) {
                loadErrorHandlingPolicy = new DefaultLoadErrorHandlingPolicy();
            }
            this.f12856f = loadErrorHandlingPolicy;
            return this;
        }

        @Override // com.google.android.exoplayer2.source.MediaSourceFactory
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public DashMediaSource mo6812c(MediaItem mediaItem) {
            MediaItem mediaItem2 = mediaItem;
            Objects.requireNonNull(mediaItem2.f9714c);
            ParsingLoadable.Parser dashManifestParser = new DashManifestParser();
            List<StreamKey> list = mediaItem2.f9714c.f9774e.isEmpty() ? this.f12859i : mediaItem2.f9714c.f9774e;
            ParsingLoadable.Parser filteringManifestParser = !list.isEmpty() ? new FilteringManifestParser(dashManifestParser, list) : dashManifestParser;
            MediaItem.LocalConfiguration localConfiguration = mediaItem2.f9714c;
            Object obj = localConfiguration.f9777h;
            boolean z = false;
            boolean z2 = localConfiguration.f9774e.isEmpty() && !list.isEmpty();
            if (mediaItem2.f9715d.f9760b == -9223372036854775807L && this.f12857g != -9223372036854775807L) {
                z = true;
            }
            if (z2 || z) {
                MediaItem.Builder m5838b = mediaItem.m5838b();
                if (z2) {
                    m5838b.m5840b(list);
                }
                if (z) {
                    MediaItem.LiveConfiguration.Builder m5844b = mediaItem2.f9715d.m5844b();
                    m5844b.f9765a = this.f12857g;
                    m5838b.f9729l = m5844b.m5845a().m5844b();
                }
                mediaItem2 = m5838b.m5839a();
            }
            MediaItem mediaItem3 = mediaItem2;
            return new DashMediaSource(mediaItem3, null, this.f12852b, filteringManifestParser, this.f12851a, this.f12855e, this.f12854d.mo2562b(mediaItem3), this.f12856f, this.f12858h, null);
        }

        /* renamed from: i */
        public Factory m7012i(@Nullable DrmSessionManagerProvider drmSessionManagerProvider) {
            if (drmSessionManagerProvider != null) {
                this.f12854d = drmSessionManagerProvider;
                this.f12853c = true;
            } else {
                this.f12854d = new DefaultDrmSessionManagerProvider();
                this.f12853c = false;
            }
            return this;
        }
    }

    public static final class Iso8601Parser implements ParsingLoadable.Parser<Long> {

        /* renamed from: a */
        public static final Pattern f12860a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

        @Override // com.google.android.exoplayer2.upstream.ParsingLoadable.Parser
        /* renamed from: a */
        public Long mo6752a(Uri uri, InputStream inputStream) throws IOException {
            String readLine = new BufferedReader(new InputStreamReader(inputStream, Charsets.f20504c)).readLine();
            try {
                Matcher matcher = f12860a.matcher(readLine);
                if (!matcher.matches()) {
                    String valueOf = String.valueOf(readLine);
                    throw ParserException.m5908b(valueOf.length() != 0 ? "Couldn't parse timestamp: ".concat(valueOf) : new String("Couldn't parse timestamp: "), null);
                }
                String group = matcher.group(1);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                long time = simpleDateFormat.parse(group).getTime();
                if (!"Z".equals(matcher.group(2))) {
                    long j2 = "+".equals(matcher.group(4)) ? 1L : -1L;
                    long parseLong = Long.parseLong(matcher.group(5));
                    String group2 = matcher.group(7);
                    time -= ((((parseLong * 60) + (TextUtils.isEmpty(group2) ? 0L : Long.parseLong(group2))) * 60) * 1000) * j2;
                }
                return Long.valueOf(time);
            } catch (ParseException e2) {
                throw ParserException.m5908b(null, e2);
            }
        }
    }

    public final class ManifestCallback implements Loader.Callback<ParsingLoadable<DashManifest>> {
        public ManifestCallback(C11011 c11011) {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        /* renamed from: f */
        public void mo6852f(ParsingLoadable<DashManifest> parsingLoadable, long j2, long j3, boolean z) {
            DashMediaSource.this.m6999K(parsingLoadable, j2, j3);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00d5  */
        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        /* renamed from: g */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo6853g(com.google.android.exoplayer2.upstream.ParsingLoadable<com.google.android.exoplayer2.source.dash.manifest.DashManifest> r20, long r21, long r23) {
            /*
                Method dump skipped, instructions count: 428
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.DashMediaSource.ManifestCallback.mo6853g(com.google.android.exoplayer2.upstream.Loader$Loadable, long, long):void");
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        /* renamed from: o */
        public Loader.LoadErrorAction mo6858o(ParsingLoadable<DashManifest> parsingLoadable, long j2, long j3, IOException iOException, int i2) {
            ParsingLoadable<DashManifest> parsingLoadable2 = parsingLoadable;
            DashMediaSource dashMediaSource = DashMediaSource.this;
            Objects.requireNonNull(dashMediaSource);
            long j4 = parsingLoadable2.f14491a;
            DataSpec dataSpec = parsingLoadable2.f14492b;
            StatsDataSource statsDataSource = parsingLoadable2.f14494d;
            LoadEventInfo loadEventInfo = new LoadEventInfo(j4, dataSpec, statsDataSource.f14522c, statsDataSource.f14523d, j2, j3, statsDataSource.f14521b);
            long mo7457a = dashMediaSource.f12826n.mo7457a(new LoadErrorHandlingPolicy.LoadErrorInfo(loadEventInfo, new MediaLoadData(parsingLoadable2.f14493c), iOException, i2));
            Loader.LoadErrorAction m7469c = mo7457a == -9223372036854775807L ? Loader.f14474f : Loader.m7469c(false, mo7457a);
            boolean z = !m7469c.m7476a();
            dashMediaSource.f12829q.m6841l(loadEventInfo, parsingLoadable2.f14493c, iOException, z);
            if (z) {
                dashMediaSource.f12826n.mo7459c(parsingLoadable2.f14491a);
            }
            return m7469c;
        }
    }

    public final class ManifestLoadErrorThrower implements LoaderErrorThrower {
        public ManifestLoadErrorThrower() {
        }

        @Override // com.google.android.exoplayer2.upstream.LoaderErrorThrower
        /* renamed from: a */
        public void mo7013a() throws IOException {
            DashMediaSource.this.f12805A.m7473f(Integer.MIN_VALUE);
            IOException iOException = DashMediaSource.this.f12807C;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    public final class UtcTimestampCallback implements Loader.Callback<ParsingLoadable<Long>> {
        public UtcTimestampCallback(C11011 c11011) {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        /* renamed from: f */
        public void mo6852f(ParsingLoadable<Long> parsingLoadable, long j2, long j3, boolean z) {
            DashMediaSource.this.m6999K(parsingLoadable, j2, j3);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        /* renamed from: g */
        public void mo6853g(ParsingLoadable<Long> parsingLoadable, long j2, long j3) {
            ParsingLoadable<Long> parsingLoadable2 = parsingLoadable;
            DashMediaSource dashMediaSource = DashMediaSource.this;
            Objects.requireNonNull(dashMediaSource);
            long j4 = parsingLoadable2.f14491a;
            DataSpec dataSpec = parsingLoadable2.f14492b;
            StatsDataSource statsDataSource = parsingLoadable2.f14494d;
            LoadEventInfo loadEventInfo = new LoadEventInfo(j4, dataSpec, statsDataSource.f14522c, statsDataSource.f14523d, j2, j3, statsDataSource.f14521b);
            dashMediaSource.f12826n.mo7459c(j4);
            dashMediaSource.f12829q.m6837h(loadEventInfo, parsingLoadable2.f14493c);
            dashMediaSource.m7001M(parsingLoadable2.f14496f.longValue() - j2);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        /* renamed from: o */
        public Loader.LoadErrorAction mo6858o(ParsingLoadable<Long> parsingLoadable, long j2, long j3, IOException iOException, int i2) {
            ParsingLoadable<Long> parsingLoadable2 = parsingLoadable;
            DashMediaSource dashMediaSource = DashMediaSource.this;
            MediaSourceEventListener.EventDispatcher eventDispatcher = dashMediaSource.f12829q;
            long j4 = parsingLoadable2.f14491a;
            DataSpec dataSpec = parsingLoadable2.f14492b;
            StatsDataSource statsDataSource = parsingLoadable2.f14494d;
            eventDispatcher.m6841l(new LoadEventInfo(j4, dataSpec, statsDataSource.f14522c, statsDataSource.f14523d, j2, j3, statsDataSource.f14521b), parsingLoadable2.f14493c, iOException, true);
            dashMediaSource.f12826n.mo7459c(parsingLoadable2.f14491a);
            dashMediaSource.m7000L(iOException);
            return Loader.f14473e;
        }
    }

    public static final class XsDateTimeParser implements ParsingLoadable.Parser<Long> {
        public XsDateTimeParser() {
        }

        @Override // com.google.android.exoplayer2.upstream.ParsingLoadable.Parser
        /* renamed from: a */
        public Long mo6752a(Uri uri, InputStream inputStream) throws IOException {
            return Long.valueOf(Util.m7720S(new BufferedReader(new InputStreamReader(inputStream)).readLine()));
        }

        public XsDateTimeParser(C11011 c11011) {
        }
    }

    static {
        ExoPlayerLibraryInfo.m5824a("goog.exo.dash");
    }

    public DashMediaSource(MediaItem mediaItem, DashManifest dashManifest, DataSource.Factory factory, ParsingLoadable.Parser parser, DashChunkSource.Factory factory2, CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory, DrmSessionManager drmSessionManager, LoadErrorHandlingPolicy loadErrorHandlingPolicy, long j2, C11011 c11011) {
        this.f12820h = mediaItem;
        this.f12809E = mediaItem.f9715d;
        MediaItem.LocalConfiguration localConfiguration = mediaItem.f9714c;
        Objects.requireNonNull(localConfiguration);
        this.f12810F = localConfiguration.f9770a;
        this.f12811G = mediaItem.f9714c.f9770a;
        this.f12812H = null;
        this.f12822j = factory;
        this.f12830r = parser;
        this.f12823k = factory2;
        this.f12825m = drmSessionManager;
        this.f12826n = loadErrorHandlingPolicy;
        this.f12828p = j2;
        this.f12824l = compositeSequenceableLoaderFactory;
        this.f12827o = new BaseUrlExclusionList();
        final int i2 = 0;
        this.f12821i = false;
        this.f12829q = m6780y(null);
        this.f12832t = new Object();
        this.f12833u = new SparseArray<>();
        this.f12836x = new DefaultPlayerEmsgCallback(null);
        this.f12818N = -9223372036854775807L;
        this.f12816L = -9223372036854775807L;
        this.f12831s = new ManifestCallback(null);
        this.f12837y = new ManifestLoadErrorThrower();
        this.f12834v = new Runnable(this) { // from class: com.google.android.exoplayer2.source.dash.a

            /* renamed from: c */
            public final /* synthetic */ DashMediaSource f12916c;

            {
                this.f12916c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        DashMediaSource dashMediaSource = this.f12916c;
                        int i3 = DashMediaSource.f12804P;
                        dashMediaSource.m7005Q();
                        break;
                    default:
                        DashMediaSource dashMediaSource2 = this.f12916c;
                        int i4 = DashMediaSource.f12804P;
                        dashMediaSource2.m7002N(false);
                        break;
                }
            }
        };
        final int i3 = 1;
        this.f12835w = new Runnable(this) { // from class: com.google.android.exoplayer2.source.dash.a

            /* renamed from: c */
            public final /* synthetic */ DashMediaSource f12916c;

            {
                this.f12916c = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i3) {
                    case 0:
                        DashMediaSource dashMediaSource = this.f12916c;
                        int i32 = DashMediaSource.f12804P;
                        dashMediaSource.m7005Q();
                        break;
                    default:
                        DashMediaSource dashMediaSource2 = this.f12916c;
                        int i4 = DashMediaSource.f12804P;
                        dashMediaSource2.m7002N(false);
                        break;
                }
            }
        };
    }

    /* renamed from: J */
    public static boolean m6998J(Period period) {
        for (int i2 = 0; i2 < period.f12963c.size(); i2++) {
            int i3 = period.f12963c.get(i2).f12918b;
            if (i3 == 1 || i3 == 2) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    /* renamed from: E */
    public void mo6766E(@Nullable TransferListener transferListener) {
        this.f12806B = transferListener;
        this.f12825m.prepare();
        if (this.f12821i) {
            m7002N(false);
            return;
        }
        this.f12838z = this.f12822j.mo6355a();
        this.f12805A = new Loader("DashMediaSource");
        this.f12808D = Util.m7744m();
        m7005Q();
    }

    @Override // com.google.android.exoplayer2.source.BaseMediaSource
    /* renamed from: I */
    public void mo6768I() {
        this.f12813I = false;
        this.f12838z = null;
        Loader loader = this.f12805A;
        if (loader != null) {
            loader.m7474g(null);
            this.f12805A = null;
        }
        this.f12814J = 0L;
        this.f12815K = 0L;
        this.f12812H = this.f12821i ? this.f12812H : null;
        this.f12810F = this.f12811G;
        this.f12807C = null;
        Handler handler = this.f12808D;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f12808D = null;
        }
        this.f12816L = -9223372036854775807L;
        this.f12817M = 0;
        this.f12818N = -9223372036854775807L;
        this.f12819O = 0;
        this.f12833u.clear();
        BaseUrlExclusionList baseUrlExclusionList = this.f12827o;
        baseUrlExclusionList.f12768a.clear();
        baseUrlExclusionList.f12769b.clear();
        baseUrlExclusionList.f12770c.clear();
        this.f12825m.release();
    }

    /* renamed from: K */
    public void m6999K(ParsingLoadable<?> parsingLoadable, long j2, long j3) {
        long j4 = parsingLoadable.f14491a;
        DataSpec dataSpec = parsingLoadable.f14492b;
        StatsDataSource statsDataSource = parsingLoadable.f14494d;
        LoadEventInfo loadEventInfo = new LoadEventInfo(j4, dataSpec, statsDataSource.f14522c, statsDataSource.f14523d, j2, j3, statsDataSource.f14521b);
        this.f12826n.mo7459c(j4);
        this.f12829q.m6834e(loadEventInfo, parsingLoadable.f14493c);
    }

    /* renamed from: L */
    public final void m7000L(IOException iOException) {
        Log.m7585b("DashMediaSource", "Failed to resolve time offset.", iOException);
        m7002N(true);
    }

    /* renamed from: M */
    public final void m7001M(long j2) {
        this.f12816L = j2;
        m7002N(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0255, code lost:
    
        if (r3 != (-9223372036854775807L)) goto L108;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:190:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0201  */
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m7002N(boolean r39) {
        /*
            Method dump skipped, instructions count: 1118
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.DashMediaSource.m7002N(boolean):void");
    }

    /* renamed from: O */
    public final void m7003O(UtcTimingElement utcTimingElement, ParsingLoadable.Parser<Long> parser) {
        m7004P(new ParsingLoadable(this.f12838z, Uri.parse(utcTimingElement.f13013b), 5, parser), new UtcTimestampCallback(null), 1);
    }

    /* renamed from: P */
    public final <T> void m7004P(ParsingLoadable<T> parsingLoadable, Loader.Callback<ParsingLoadable<T>> callback, int i2) {
        this.f12829q.m6843n(new LoadEventInfo(parsingLoadable.f14491a, parsingLoadable.f14492b, this.f12805A.m7475h(parsingLoadable, callback, i2)), parsingLoadable.f14493c);
    }

    /* renamed from: Q */
    public final void m7005Q() {
        Uri uri;
        this.f12808D.removeCallbacks(this.f12834v);
        if (this.f12805A.m7471d()) {
            return;
        }
        if (this.f12805A.m7472e()) {
            this.f12813I = true;
            return;
        }
        synchronized (this.f12832t) {
            uri = this.f12810F;
        }
        this.f12813I = false;
        m7004P(new ParsingLoadable(this.f12838z, uri, 4, this.f12830r), this.f12831s, this.f12826n.mo7460d(4));
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    /* renamed from: a */
    public MediaPeriod mo6797a(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j2) {
        int intValue = ((Integer) mediaPeriodId.f12356a).intValue() - this.f12819O;
        MediaSourceEventListener.EventDispatcher m6848s = this.f12230d.m6848s(0, mediaPeriodId, this.f12812H.m7039b(intValue).f12962b);
        DrmSessionEventListener.EventDispatcher m6308i = this.f12231e.m6308i(0, mediaPeriodId);
        int i2 = this.f12819O + intValue;
        DashMediaPeriod dashMediaPeriod = new DashMediaPeriod(i2, this.f12812H, this.f12827o, intValue, this.f12823k, this.f12806B, this.f12825m, m6308i, this.f12826n, m6848s, this.f12816L, this.f12837y, allocator, this.f12824l, this.f12836x);
        this.f12833u.put(i2, dashMediaPeriod);
        return dashMediaPeriod;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaItem getMediaItem() {
        return this.f12820h;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        this.f12837y.mo7013a();
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    /* renamed from: s */
    public void mo6798s(MediaPeriod mediaPeriod) {
        DashMediaPeriod dashMediaPeriod = (DashMediaPeriod) mediaPeriod;
        PlayerEmsgHandler playerEmsgHandler = dashMediaPeriod.f12786n;
        playerEmsgHandler.f12907k = true;
        playerEmsgHandler.f12901e.removeCallbacksAndMessages(null);
        for (ChunkSampleStream<DashChunkSource> chunkSampleStream : dashMediaPeriod.f12791s) {
            chunkSampleStream.m6971r(dashMediaPeriod);
        }
        dashMediaPeriod.f12790r = null;
        this.f12833u.remove(dashMediaPeriod.f12774b);
    }
}
