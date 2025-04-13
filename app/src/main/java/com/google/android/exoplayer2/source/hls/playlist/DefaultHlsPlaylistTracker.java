package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.analytics.C0954j;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.hls.HlsDataSourceFactory;
import com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker;
import com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist;
import com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import com.google.android.exoplayer2.upstream.StatsDataSource;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class DefaultHlsPlaylistTracker implements HlsPlaylistTracker, Loader.Callback<ParsingLoadable<HlsPlaylist>> {

    /* renamed from: q */
    public static final HlsPlaylistTracker.Factory f13245q = C0954j.f10231x;

    /* renamed from: b */
    public final HlsDataSourceFactory f13246b;

    /* renamed from: c */
    public final HlsPlaylistParserFactory f13247c;

    /* renamed from: d */
    public final LoadErrorHandlingPolicy f13248d;

    /* renamed from: h */
    @Nullable
    public MediaSourceEventListener.EventDispatcher f13252h;

    /* renamed from: i */
    @Nullable
    public Loader f13253i;

    /* renamed from: j */
    @Nullable
    public Handler f13254j;

    /* renamed from: k */
    @Nullable
    public HlsPlaylistTracker.PrimaryPlaylistListener f13255k;

    /* renamed from: l */
    @Nullable
    public HlsMasterPlaylist f13256l;

    /* renamed from: m */
    @Nullable
    public Uri f13257m;

    /* renamed from: n */
    @Nullable
    public HlsMediaPlaylist f13258n;

    /* renamed from: o */
    public boolean f13259o;

    /* renamed from: g */
    public final double f13251g = 3.5d;

    /* renamed from: f */
    public final CopyOnWriteArrayList<HlsPlaylistTracker.PlaylistEventListener> f13250f = new CopyOnWriteArrayList<>();

    /* renamed from: e */
    public final HashMap<Uri, MediaPlaylistBundle> f13249e = new HashMap<>();

    /* renamed from: p */
    public long f13260p = -9223372036854775807L;

    public class FirstPrimaryMediaPlaylistListener implements HlsPlaylistTracker.PlaylistEventListener {
        public FirstPrimaryMediaPlaylistListener(C11191 c11191) {
        }

        @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.PlaylistEventListener
        /* renamed from: b */
        public void mo7100b() {
            DefaultHlsPlaylistTracker.this.f13250f.remove(this);
        }

        @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.PlaylistEventListener
        /* renamed from: d */
        public boolean mo7101d(Uri uri, LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo, boolean z) {
            MediaPlaylistBundle mediaPlaylistBundle;
            if (DefaultHlsPlaylistTracker.this.f13258n == null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                HlsMasterPlaylist hlsMasterPlaylist = DefaultHlsPlaylistTracker.this.f13256l;
                int i2 = Util.f14736a;
                List<HlsMasterPlaylist.Variant> list = hlsMasterPlaylist.f13277e;
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    MediaPlaylistBundle mediaPlaylistBundle2 = DefaultHlsPlaylistTracker.this.f13249e.get(list.get(i4).f13289a);
                    if (mediaPlaylistBundle2 != null && elapsedRealtime < mediaPlaylistBundle2.f13269i) {
                        i3++;
                    }
                }
                LoadErrorHandlingPolicy.FallbackSelection mo7458b = DefaultHlsPlaylistTracker.this.f13248d.mo7458b(new LoadErrorHandlingPolicy.FallbackOptions(1, 0, DefaultHlsPlaylistTracker.this.f13256l.f13277e.size(), i3), loadErrorInfo);
                if (mo7458b != null && mo7458b.f14468a == 2 && (mediaPlaylistBundle = DefaultHlsPlaylistTracker.this.f13249e.get(uri)) != null) {
                    MediaPlaylistBundle.m7144a(mediaPlaylistBundle, mo7458b.f14469b);
                }
            }
            return false;
        }
    }

    public final class MediaPlaylistBundle implements Loader.Callback<ParsingLoadable<HlsPlaylist>> {

        /* renamed from: b */
        public final Uri f13262b;

        /* renamed from: c */
        public final Loader f13263c = new Loader("DefaultHlsPlaylistTracker:MediaPlaylist");

        /* renamed from: d */
        public final DataSource f13264d;

        /* renamed from: e */
        @Nullable
        public HlsMediaPlaylist f13265e;

        /* renamed from: f */
        public long f13266f;

        /* renamed from: g */
        public long f13267g;

        /* renamed from: h */
        public long f13268h;

        /* renamed from: i */
        public long f13269i;

        /* renamed from: j */
        public boolean f13270j;

        /* renamed from: k */
        @Nullable
        public IOException f13271k;

        public MediaPlaylistBundle(Uri uri) {
            this.f13262b = uri;
            this.f13264d = DefaultHlsPlaylistTracker.this.f13246b.mo7088a(4);
        }

        /* renamed from: a */
        public static boolean m7144a(MediaPlaylistBundle mediaPlaylistBundle, long j2) {
            boolean z;
            mediaPlaylistBundle.f13269i = SystemClock.elapsedRealtime() + j2;
            if (mediaPlaylistBundle.f13262b.equals(DefaultHlsPlaylistTracker.this.f13257m)) {
                DefaultHlsPlaylistTracker defaultHlsPlaylistTracker = DefaultHlsPlaylistTracker.this;
                List<HlsMasterPlaylist.Variant> list = defaultHlsPlaylistTracker.f13256l.f13277e;
                int size = list.size();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = false;
                        break;
                    }
                    MediaPlaylistBundle mediaPlaylistBundle2 = defaultHlsPlaylistTracker.f13249e.get(list.get(i2).f13289a);
                    Objects.requireNonNull(mediaPlaylistBundle2);
                    if (elapsedRealtime > mediaPlaylistBundle2.f13269i) {
                        Uri uri = mediaPlaylistBundle2.f13262b;
                        defaultHlsPlaylistTracker.f13257m = uri;
                        mediaPlaylistBundle2.m7146c(defaultHlsPlaylistTracker.m7143r(uri));
                        z = true;
                        break;
                    }
                    i2++;
                }
                if (!z) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        public final void m7145b(Uri uri) {
            DefaultHlsPlaylistTracker defaultHlsPlaylistTracker = DefaultHlsPlaylistTracker.this;
            ParsingLoadable parsingLoadable = new ParsingLoadable(this.f13264d, uri, 4, defaultHlsPlaylistTracker.f13247c.mo7127a(defaultHlsPlaylistTracker.f13256l, this.f13265e));
            DefaultHlsPlaylistTracker.this.f13252h.m6843n(new LoadEventInfo(parsingLoadable.f14491a, parsingLoadable.f14492b, this.f13263c.m7475h(parsingLoadable, this, DefaultHlsPlaylistTracker.this.f13248d.mo7460d(parsingLoadable.f14493c))), parsingLoadable.f14493c);
        }

        /* renamed from: c */
        public final void m7146c(final Uri uri) {
            this.f13269i = 0L;
            if (this.f13270j || this.f13263c.m7472e() || this.f13263c.m7471d()) {
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = this.f13268h;
            if (elapsedRealtime >= j2) {
                m7145b(uri);
            } else {
                this.f13270j = true;
                DefaultHlsPlaylistTracker.this.f13254j.postDelayed(new Runnable() { // from class: com.google.android.exoplayer2.source.hls.playlist.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        DefaultHlsPlaylistTracker.MediaPlaylistBundle mediaPlaylistBundle = DefaultHlsPlaylistTracker.MediaPlaylistBundle.this;
                        Uri uri2 = uri;
                        mediaPlaylistBundle.f13270j = false;
                        mediaPlaylistBundle.m7145b(uri2);
                    }
                }, j2 - elapsedRealtime);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x015b  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x01f3  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0225  */
        /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:78:0x01ff  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0195  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x00b1  */
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void m7147d(com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist r38, com.google.android.exoplayer2.source.LoadEventInfo r39) {
            /*
                Method dump skipped, instructions count: 676
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.playlist.DefaultHlsPlaylistTracker.MediaPlaylistBundle.m7147d(com.google.android.exoplayer2.source.hls.playlist.HlsMediaPlaylist, com.google.android.exoplayer2.source.LoadEventInfo):void");
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        /* renamed from: f */
        public void mo6852f(ParsingLoadable<HlsPlaylist> parsingLoadable, long j2, long j3, boolean z) {
            ParsingLoadable<HlsPlaylist> parsingLoadable2 = parsingLoadable;
            long j4 = parsingLoadable2.f14491a;
            DataSpec dataSpec = parsingLoadable2.f14492b;
            StatsDataSource statsDataSource = parsingLoadable2.f14494d;
            LoadEventInfo loadEventInfo = new LoadEventInfo(j4, dataSpec, statsDataSource.f14522c, statsDataSource.f14523d, j2, j3, statsDataSource.f14521b);
            DefaultHlsPlaylistTracker.this.f13248d.mo7459c(j4);
            DefaultHlsPlaylistTracker.this.f13252h.m6834e(loadEventInfo, 4);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        /* renamed from: g */
        public void mo6853g(ParsingLoadable<HlsPlaylist> parsingLoadable, long j2, long j3) {
            ParsingLoadable<HlsPlaylist> parsingLoadable2 = parsingLoadable;
            HlsPlaylist hlsPlaylist = parsingLoadable2.f14496f;
            long j4 = parsingLoadable2.f14491a;
            DataSpec dataSpec = parsingLoadable2.f14492b;
            StatsDataSource statsDataSource = parsingLoadable2.f14494d;
            LoadEventInfo loadEventInfo = new LoadEventInfo(j4, dataSpec, statsDataSource.f14522c, statsDataSource.f14523d, j2, j3, statsDataSource.f14521b);
            if (hlsPlaylist instanceof HlsMediaPlaylist) {
                m7147d((HlsMediaPlaylist) hlsPlaylist, loadEventInfo);
                DefaultHlsPlaylistTracker.this.f13252h.m6837h(loadEventInfo, 4);
            } else {
                ParserException m5908b = ParserException.m5908b("Loaded playlist has unexpected type.", null);
                this.f13271k = m5908b;
                DefaultHlsPlaylistTracker.this.f13252h.m6841l(loadEventInfo, 4, m5908b, true);
            }
            DefaultHlsPlaylistTracker.this.f13248d.mo7459c(parsingLoadable2.f14491a);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        /* renamed from: o */
        public Loader.LoadErrorAction mo6858o(ParsingLoadable<HlsPlaylist> parsingLoadable, long j2, long j3, IOException iOException, int i2) {
            Loader.LoadErrorAction loadErrorAction;
            ParsingLoadable<HlsPlaylist> parsingLoadable2 = parsingLoadable;
            long j4 = parsingLoadable2.f14491a;
            DataSpec dataSpec = parsingLoadable2.f14492b;
            StatsDataSource statsDataSource = parsingLoadable2.f14494d;
            Uri uri = statsDataSource.f14522c;
            LoadEventInfo loadEventInfo = new LoadEventInfo(j4, dataSpec, uri, statsDataSource.f14523d, j2, j3, statsDataSource.f14521b);
            boolean z = iOException instanceof HlsPlaylistParser.DeltaUpdateException;
            if ((uri.getQueryParameter("_HLS_msn") != null) || z) {
                int i3 = iOException instanceof HttpDataSource.InvalidResponseCodeException ? ((HttpDataSource.InvalidResponseCodeException) iOException).f14458d : Integer.MAX_VALUE;
                if (z || i3 == 400 || i3 == 503) {
                    this.f13268h = SystemClock.elapsedRealtime();
                    m7146c(this.f13262b);
                    MediaSourceEventListener.EventDispatcher eventDispatcher = DefaultHlsPlaylistTracker.this.f13252h;
                    int i4 = Util.f14736a;
                    eventDispatcher.m6841l(loadEventInfo, parsingLoadable2.f14493c, iOException, true);
                    return Loader.f14473e;
                }
            }
            LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo = new LoadErrorHandlingPolicy.LoadErrorInfo(loadEventInfo, new MediaLoadData(parsingLoadable2.f14493c), iOException, i2);
            if (DefaultHlsPlaylistTracker.m7129p(DefaultHlsPlaylistTracker.this, this.f13262b, loadErrorInfo, false)) {
                long mo7457a = DefaultHlsPlaylistTracker.this.f13248d.mo7457a(loadErrorInfo);
                loadErrorAction = mo7457a != -9223372036854775807L ? Loader.m7469c(false, mo7457a) : Loader.f14474f;
            } else {
                loadErrorAction = Loader.f14473e;
            }
            boolean m7476a = true ^ loadErrorAction.m7476a();
            DefaultHlsPlaylistTracker.this.f13252h.m6841l(loadEventInfo, parsingLoadable2.f14493c, iOException, m7476a);
            if (!m7476a) {
                return loadErrorAction;
            }
            DefaultHlsPlaylistTracker.this.f13248d.mo7459c(parsingLoadable2.f14491a);
            return loadErrorAction;
        }
    }

    public DefaultHlsPlaylistTracker(HlsDataSourceFactory hlsDataSourceFactory, LoadErrorHandlingPolicy loadErrorHandlingPolicy, HlsPlaylistParserFactory hlsPlaylistParserFactory) {
        this.f13246b = hlsDataSourceFactory;
        this.f13247c = hlsPlaylistParserFactory;
        this.f13248d = loadErrorHandlingPolicy;
    }

    /* renamed from: p */
    public static boolean m7129p(DefaultHlsPlaylistTracker defaultHlsPlaylistTracker, Uri uri, LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo, boolean z) {
        Iterator<HlsPlaylistTracker.PlaylistEventListener> it = defaultHlsPlaylistTracker.f13250f.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            z2 |= !it.next().mo7101d(uri, loadErrorInfo, z);
        }
        return z2;
    }

    /* renamed from: q */
    public static HlsMediaPlaylist.Segment m7130q(HlsMediaPlaylist hlsMediaPlaylist, HlsMediaPlaylist hlsMediaPlaylist2) {
        int i2 = (int) (hlsMediaPlaylist2.f13302k - hlsMediaPlaylist.f13302k);
        List<HlsMediaPlaylist.Segment> list = hlsMediaPlaylist.f13309r;
        if (i2 < list.size()) {
            return list.get(i2);
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    /* renamed from: a */
    public boolean mo7131a(Uri uri) {
        int i2;
        MediaPlaylistBundle mediaPlaylistBundle = this.f13249e.get(uri);
        if (mediaPlaylistBundle.f13265e == null) {
            return false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long max = Math.max(30000L, Util.m7735d0(mediaPlaylistBundle.f13265e.f13312u));
        HlsMediaPlaylist hlsMediaPlaylist = mediaPlaylistBundle.f13265e;
        return hlsMediaPlaylist.f13306o || (i2 = hlsMediaPlaylist.f13295d) == 2 || i2 == 1 || mediaPlaylistBundle.f13266f + max > elapsedRealtime;
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    /* renamed from: b */
    public void mo7132b(HlsPlaylistTracker.PlaylistEventListener playlistEventListener) {
        this.f13250f.remove(playlistEventListener);
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    /* renamed from: c */
    public void mo7133c(Uri uri) throws IOException {
        MediaPlaylistBundle mediaPlaylistBundle = this.f13249e.get(uri);
        mediaPlaylistBundle.f13263c.m7473f(Integer.MIN_VALUE);
        IOException iOException = mediaPlaylistBundle.f13271k;
        if (iOException != null) {
            throw iOException;
        }
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    /* renamed from: d */
    public long mo7134d() {
        return this.f13260p;
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    /* renamed from: e */
    public boolean mo7135e() {
        return this.f13259o;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    /* renamed from: f */
    public void mo6852f(ParsingLoadable<HlsPlaylist> parsingLoadable, long j2, long j3, boolean z) {
        ParsingLoadable<HlsPlaylist> parsingLoadable2 = parsingLoadable;
        long j4 = parsingLoadable2.f14491a;
        DataSpec dataSpec = parsingLoadable2.f14492b;
        StatsDataSource statsDataSource = parsingLoadable2.f14494d;
        LoadEventInfo loadEventInfo = new LoadEventInfo(j4, dataSpec, statsDataSource.f14522c, statsDataSource.f14523d, j2, j3, statsDataSource.f14521b);
        this.f13248d.mo7459c(j4);
        this.f13252h.m6834e(loadEventInfo, 4);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    /* renamed from: g */
    public void mo6853g(ParsingLoadable<HlsPlaylist> parsingLoadable, long j2, long j3) {
        HlsMasterPlaylist hlsMasterPlaylist;
        ParsingLoadable<HlsPlaylist> parsingLoadable2 = parsingLoadable;
        HlsPlaylist hlsPlaylist = parsingLoadable2.f14496f;
        boolean z = hlsPlaylist instanceof HlsMediaPlaylist;
        if (z) {
            String str = hlsPlaylist.f13337a;
            HlsMasterPlaylist hlsMasterPlaylist2 = HlsMasterPlaylist.f13275n;
            Uri parse = Uri.parse(str);
            Format.Builder builder = new Format.Builder();
            builder.f9677a = "0";
            builder.f9686j = "application/x-mpegURL";
            hlsMasterPlaylist = new HlsMasterPlaylist("", Collections.emptyList(), Collections.singletonList(new HlsMasterPlaylist.Variant(parse, builder.m5833a(), null, null, null, null)), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, false, Collections.emptyMap(), Collections.emptyList());
        } else {
            hlsMasterPlaylist = (HlsMasterPlaylist) hlsPlaylist;
        }
        this.f13256l = hlsMasterPlaylist;
        this.f13257m = hlsMasterPlaylist.f13277e.get(0).f13289a;
        this.f13250f.add(new FirstPrimaryMediaPlaylistListener(null));
        List<Uri> list = hlsMasterPlaylist.f13276d;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Uri uri = list.get(i2);
            this.f13249e.put(uri, new MediaPlaylistBundle(uri));
        }
        long j4 = parsingLoadable2.f14491a;
        DataSpec dataSpec = parsingLoadable2.f14492b;
        StatsDataSource statsDataSource = parsingLoadable2.f14494d;
        LoadEventInfo loadEventInfo = new LoadEventInfo(j4, dataSpec, statsDataSource.f14522c, statsDataSource.f14523d, j2, j3, statsDataSource.f14521b);
        MediaPlaylistBundle mediaPlaylistBundle = this.f13249e.get(this.f13257m);
        if (z) {
            mediaPlaylistBundle.m7147d((HlsMediaPlaylist) hlsPlaylist, loadEventInfo);
        } else {
            mediaPlaylistBundle.m7146c(mediaPlaylistBundle.f13262b);
        }
        this.f13248d.mo7459c(parsingLoadable2.f14491a);
        this.f13252h.m6837h(loadEventInfo, 4);
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    /* renamed from: h */
    public boolean mo7136h(Uri uri, long j2) {
        if (this.f13249e.get(uri) != null) {
            return !MediaPlaylistBundle.m7144a(r2, j2);
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    @Nullable
    /* renamed from: i */
    public HlsMasterPlaylist mo7137i() {
        return this.f13256l;
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    /* renamed from: j */
    public void mo7138j(Uri uri, MediaSourceEventListener.EventDispatcher eventDispatcher, HlsPlaylistTracker.PrimaryPlaylistListener primaryPlaylistListener) {
        this.f13254j = Util.m7744m();
        this.f13252h = eventDispatcher;
        this.f13255k = primaryPlaylistListener;
        ParsingLoadable parsingLoadable = new ParsingLoadable(this.f13246b.mo7088a(4), uri, 4, this.f13247c.mo7128b());
        Assertions.m7516d(this.f13253i == null);
        Loader loader = new Loader("DefaultHlsPlaylistTracker:MasterPlaylist");
        this.f13253i = loader;
        eventDispatcher.m6843n(new LoadEventInfo(parsingLoadable.f14491a, parsingLoadable.f14492b, loader.m7475h(parsingLoadable, this, this.f13248d.mo7460d(parsingLoadable.f14493c))), parsingLoadable.f14493c);
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    /* renamed from: k */
    public void mo7139k() throws IOException {
        Loader loader = this.f13253i;
        if (loader != null) {
            loader.m7473f(Integer.MIN_VALUE);
        }
        Uri uri = this.f13257m;
        if (uri != null) {
            mo7133c(uri);
        }
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    /* renamed from: l */
    public void mo7140l(Uri uri) {
        MediaPlaylistBundle mediaPlaylistBundle = this.f13249e.get(uri);
        mediaPlaylistBundle.m7146c(mediaPlaylistBundle.f13262b);
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    /* renamed from: m */
    public void mo7141m(HlsPlaylistTracker.PlaylistEventListener playlistEventListener) {
        this.f13250f.add(playlistEventListener);
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    @Nullable
    /* renamed from: n */
    public HlsMediaPlaylist mo7142n(Uri uri, boolean z) {
        HlsMediaPlaylist hlsMediaPlaylist;
        HlsMediaPlaylist hlsMediaPlaylist2 = this.f13249e.get(uri).f13265e;
        if (hlsMediaPlaylist2 != null && z && !uri.equals(this.f13257m)) {
            List<HlsMasterPlaylist.Variant> list = this.f13256l.f13277e;
            boolean z2 = false;
            int i2 = 0;
            while (true) {
                if (i2 >= list.size()) {
                    break;
                }
                if (uri.equals(list.get(i2).f13289a)) {
                    z2 = true;
                    break;
                }
                i2++;
            }
            if (z2 && ((hlsMediaPlaylist = this.f13258n) == null || !hlsMediaPlaylist.f13306o)) {
                this.f13257m = uri;
                MediaPlaylistBundle mediaPlaylistBundle = this.f13249e.get(uri);
                HlsMediaPlaylist hlsMediaPlaylist3 = mediaPlaylistBundle.f13265e;
                if (hlsMediaPlaylist3 == null || !hlsMediaPlaylist3.f13306o) {
                    mediaPlaylistBundle.m7146c(m7143r(uri));
                } else {
                    this.f13258n = hlsMediaPlaylist3;
                    this.f13255k.mo7105d(hlsMediaPlaylist3);
                }
            }
        }
        return hlsMediaPlaylist2;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    /* renamed from: o */
    public Loader.LoadErrorAction mo6858o(ParsingLoadable<HlsPlaylist> parsingLoadable, long j2, long j3, IOException iOException, int i2) {
        ParsingLoadable<HlsPlaylist> parsingLoadable2 = parsingLoadable;
        long j4 = parsingLoadable2.f14491a;
        DataSpec dataSpec = parsingLoadable2.f14492b;
        StatsDataSource statsDataSource = parsingLoadable2.f14494d;
        LoadEventInfo loadEventInfo = new LoadEventInfo(j4, dataSpec, statsDataSource.f14522c, statsDataSource.f14523d, j2, j3, statsDataSource.f14521b);
        long mo7457a = this.f13248d.mo7457a(new LoadErrorHandlingPolicy.LoadErrorInfo(loadEventInfo, new MediaLoadData(parsingLoadable2.f14493c), iOException, i2));
        boolean z = mo7457a == -9223372036854775807L;
        this.f13252h.m6841l(loadEventInfo, parsingLoadable2.f14493c, iOException, z);
        if (z) {
            this.f13248d.mo7459c(parsingLoadable2.f14491a);
        }
        return z ? Loader.f14474f : Loader.m7469c(false, mo7457a);
    }

    /* renamed from: r */
    public final Uri m7143r(Uri uri) {
        HlsMediaPlaylist.RenditionReport renditionReport;
        HlsMediaPlaylist hlsMediaPlaylist = this.f13258n;
        if (hlsMediaPlaylist == null || !hlsMediaPlaylist.f13313v.f13336e || (renditionReport = hlsMediaPlaylist.f13311t.get(uri)) == null) {
            return uri;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(renditionReport.f13317b));
        int i2 = renditionReport.f13318c;
        if (i2 != -1) {
            buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i2));
        }
        return buildUpon.build();
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void stop() {
        this.f13257m = null;
        this.f13258n = null;
        this.f13256l = null;
        this.f13260p = -9223372036854775807L;
        this.f13253i.m7474g(null);
        this.f13253i = null;
        Iterator<MediaPlaylistBundle> it = this.f13249e.values().iterator();
        while (it.hasNext()) {
            it.next().f13263c.m7474g(null);
        }
        this.f13254j.removeCallbacksAndMessages(null);
        this.f13254j = null;
        this.f13249e.clear();
    }
}
