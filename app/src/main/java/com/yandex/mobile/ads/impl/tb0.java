package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.yandex.mobile.ads.impl.InterfaceC5624q8;
import com.yandex.mobile.ads.impl.bc0;
import com.yandex.mobile.ads.impl.k61;
import com.yandex.mobile.ads.impl.pb0;
import java.util.HashMap;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

@RequiresApi
/* loaded from: classes3.dex */
public final class tb0 implements InterfaceC5624q8, pq0 {

    /* renamed from: A */
    private boolean f55007A;

    /* renamed from: a */
    private final Context f55008a;

    /* renamed from: b */
    private final C4878bo f55009b;

    /* renamed from: c */
    private final PlaybackSession f55010c;

    /* renamed from: i */
    @Nullable
    private String f55016i;

    /* renamed from: j */
    @Nullable
    private PlaybackMetrics.Builder f55017j;

    /* renamed from: k */
    private int f55018k;

    /* renamed from: n */
    @Nullable
    private kq0 f55021n;

    /* renamed from: o */
    @Nullable
    private C5792b f55022o;

    /* renamed from: p */
    @Nullable
    private C5792b f55023p;

    /* renamed from: q */
    @Nullable
    private C5792b f55024q;

    /* renamed from: r */
    @Nullable
    private C5606pv f55025r;

    /* renamed from: s */
    @Nullable
    private C5606pv f55026s;

    /* renamed from: t */
    @Nullable
    private C5606pv f55027t;

    /* renamed from: u */
    private boolean f55028u;

    /* renamed from: v */
    private int f55029v;

    /* renamed from: w */
    private boolean f55030w;

    /* renamed from: x */
    private int f55031x;

    /* renamed from: y */
    private int f55032y;

    /* renamed from: z */
    private int f55033z;

    /* renamed from: e */
    private final k61.C5323d f55012e = new k61.C5323d();

    /* renamed from: f */
    private final k61.C5321b f55013f = new k61.C5321b();

    /* renamed from: h */
    private final HashMap<String, Long> f55015h = new HashMap<>();

    /* renamed from: g */
    private final HashMap<String, Long> f55014g = new HashMap<>();

    /* renamed from: d */
    private final long f55011d = SystemClock.elapsedRealtime();

    /* renamed from: l */
    private int f55019l = 0;

    /* renamed from: m */
    private int f55020m = 0;

    /* renamed from: com.yandex.mobile.ads.impl.tb0$a */
    public static final class C5791a {

        /* renamed from: a */
        public final int f55034a;

        /* renamed from: b */
        public final int f55035b;

        public C5791a(int i2, int i3) {
            this.f55034a = i2;
            this.f55035b = i3;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.tb0$b */
    public static final class C5792b {

        /* renamed from: a */
        public final C5606pv f55036a;

        /* renamed from: b */
        public final int f55037b;

        /* renamed from: c */
        public final String f55038c;

        public C5792b(C5606pv c5606pv, int i2, String str) {
            this.f55036a = c5606pv;
            this.f55037b = i2;
            this.f55038c = str;
        }
    }

    private tb0(Context context, PlaybackSession playbackSession) {
        this.f55008a = context.getApplicationContext();
        this.f55010c = playbackSession;
        C4878bo c4878bo = new C4878bo();
        this.f55009b = c4878bo;
        c4878bo.m22885a(this);
    }

    @Nullable
    /* renamed from: a */
    public static tb0 m28568a(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new tb0(context, mediaMetricsManager.createPlaybackSession());
    }

    /* renamed from: b */
    public final LogSessionId m28581b() {
        return this.f55010c.getSessionId();
    }

    /* renamed from: b */
    public final void m28582b(InterfaceC5624q8.a aVar, String str) {
        bc0.C4858b c4858b = aVar.f53959d;
        if ((c4858b == null || !c4858b.m29735a()) && str.equals(this.f55016i)) {
            m28569a();
        }
        this.f55014g.remove(str);
        this.f55015h.remove(str);
    }

    /* renamed from: a */
    public final void m28577a(InterfaceC5624q8.a aVar, String str) {
        bc0.C4858b c4858b = aVar.f53959d;
        if (c4858b == null || !c4858b.m29735a()) {
            m28569a();
            this.f55016i = str;
            this.f55017j = new PlaybackMetrics.Builder().setPlayerName("ExoPlayerLib").setPlayerVersion("2.18.1");
            m28571a(aVar.f53957b, aVar.f53959d);
        }
    }

    /* renamed from: a */
    public final void m28572a(int i2) {
        if (i2 == 1) {
            this.f55028u = true;
        }
        this.f55018k = i2;
    }

    /* renamed from: a */
    public final void m28578a(C5647qm c5647qm) {
        this.f55031x += c5647qm.f54082g;
        this.f55032y += c5647qm.f54080e;
    }

    /* renamed from: a */
    public final void m28575a(InterfaceC5624q8.a aVar, int i2, long j2) {
        bc0.C4858b c4858b = aVar.f53959d;
        if (c4858b != null) {
            String m22884a = this.f55009b.m22884a(aVar.f53957b, c4858b);
            Long l2 = this.f55015h.get(m22884a);
            Long l3 = this.f55014g.get(m22884a);
            this.f55015h.put(m22884a, Long.valueOf((l2 == null ? 0L : l2.longValue()) + j2));
            this.f55014g.put(m22884a, Long.valueOf((l3 != null ? l3.longValue() : 0L) + i2));
        }
    }

    /* renamed from: a */
    public final void m28576a(InterfaceC5624q8.a aVar, rb0 rb0Var) {
        if (aVar.f53959d == null) {
            return;
        }
        C5606pv c5606pv = rb0Var.f54256c;
        Objects.requireNonNull(c5606pv);
        int i2 = rb0Var.f54257d;
        C4878bo c4878bo = this.f55009b;
        k61 k61Var = aVar.f53957b;
        bc0.C4858b c4858b = aVar.f53959d;
        Objects.requireNonNull(c4858b);
        C5792b c5792b = new C5792b(c5606pv, i2, c4878bo.m22884a(k61Var, c4858b));
        int i3 = rb0Var.f54255b;
        if (i3 != 0) {
            if (i3 == 1) {
                this.f55023p = c5792b;
                return;
            } else if (i3 != 2) {
                if (i3 != 3) {
                    return;
                }
                this.f55024q = c5792b;
                return;
            }
        }
        this.f55022o = c5792b;
    }

    /* renamed from: a */
    public final void m28574a(lf1 lf1Var) {
        C5792b c5792b = this.f55022o;
        if (c5792b != null) {
            C5606pv c5606pv = c5792b.f55036a;
            if (c5606pv.f53826r == -1) {
                this.f55022o = new C5792b(c5606pv.m27508a().m27572q(lf1Var.f52381a).m27562g(lf1Var.f52382b).m27550a(), c5792b.f55037b, c5792b.f55038c);
            }
        }
    }

    /* renamed from: a */
    public final void m28579a(rb0 rb0Var) {
        this.f55029v = rb0Var.f54254a;
    }

    /* renamed from: a */
    public final void m28573a(kq0 kq0Var) {
        this.f55021n = kq0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x05da  */
    /* JADX WARN: Removed duplicated region for block: B:172:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x051d  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m28580a(com.yandex.mobile.ads.impl.rq0 r24, com.yandex.mobile.ads.impl.InterfaceC5624q8.b r25) {
        /*
            Method dump skipped, instructions count: 1628
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.tb0.m28580a(com.yandex.mobile.ads.impl.rq0, com.yandex.mobile.ads.impl.q8$b):void");
    }

    /* renamed from: a */
    private void m28570a(int i2, long j2, @Nullable C5606pv c5606pv, int i3) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i2).setTimeSinceCreatedMillis(j2 - this.f55011d);
        if (c5606pv != null) {
            timeSinceCreatedMillis.setTrackState(1);
            int i4 = 3;
            if (i3 == 1) {
                i4 = 2;
            } else if (i3 != 2) {
                i4 = i3 != 3 ? 1 : 4;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i4);
            String str = c5606pv.f53819k;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = c5606pv.f53820l;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = c5606pv.f53817i;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i5 = c5606pv.f53816h;
            if (i5 != -1) {
                timeSinceCreatedMillis.setBitrate(i5);
            }
            int i6 = c5606pv.f53825q;
            if (i6 != -1) {
                timeSinceCreatedMillis.setWidth(i6);
            }
            int i7 = c5606pv.f53826r;
            if (i7 != -1) {
                timeSinceCreatedMillis.setHeight(i7);
            }
            int i8 = c5606pv.f53833y;
            if (i8 != -1) {
                timeSinceCreatedMillis.setChannelCount(i8);
            }
            int i9 = c5606pv.f53834z;
            if (i9 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i9);
            }
            String str4 = c5606pv.f53811c;
            if (str4 != null) {
                int i10 = s91.f54530a;
                String[] split = str4.split("-", -1);
                Pair create = Pair.create(split[0], split.length >= 2 ? split[1] : null);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f2 = c5606pv.f53827s;
            if (f2 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f2);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f55007A = true;
        this.f55010c.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    @RequiresNonNull({"metricsBuilder"})
    /* renamed from: a */
    private void m28571a(k61 k61Var, @Nullable bc0.C4858b c4858b) {
        int mo23970a;
        PlaybackMetrics.Builder builder = this.f55017j;
        if (c4858b == null || (mo23970a = k61Var.mo23970a(c4858b.f56449a)) == -1) {
            return;
        }
        int i2 = 0;
        k61Var.mo23972a(mo23970a, this.f55013f, false);
        k61Var.mo23974a(this.f55013f.f51851c, this.f55012e, 0L);
        pb0.C5581g c5581g = this.f55012e.f51866c.f53429b;
        if (c5581g != null) {
            int m28091a = s91.m28091a(c5581g.f53477a, c5581g.f53478b);
            i2 = m28091a != 0 ? m28091a != 1 ? m28091a != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i2);
        k61.C5323d c5323d = this.f55012e;
        if (c5323d.f51877n != -9223372036854775807L && !c5323d.f51875l && !c5323d.f51872i && !c5323d.m26065a()) {
            builder.setMediaDurationMillis(s91.m28119b(this.f55012e.f51877n));
        }
        builder.setPlaybackType(this.f55012e.m26065a() ? 2 : 1);
        this.f55007A = true;
    }

    /* renamed from: a */
    private void m28569a() {
        PlaybackMetrics.Builder builder = this.f55017j;
        if (builder != null && this.f55007A) {
            builder.setAudioUnderrunCount(this.f55033z);
            this.f55017j.setVideoFramesDropped(this.f55031x);
            this.f55017j.setVideoFramesPlayed(this.f55032y);
            Long l2 = this.f55014g.get(this.f55016i);
            this.f55017j.setNetworkTransferDurationMillis(l2 == null ? 0L : l2.longValue());
            Long l3 = this.f55015h.get(this.f55016i);
            this.f55017j.setNetworkBytesRead(l3 == null ? 0L : l3.longValue());
            this.f55017j.setStreamSource((l3 == null || l3.longValue() <= 0) ? 0 : 1);
            this.f55010c.reportPlaybackMetrics(this.f55017j.build());
        }
        this.f55017j = null;
        this.f55016i = null;
        this.f55033z = 0;
        this.f55031x = 0;
        this.f55032y = 0;
        this.f55025r = null;
        this.f55026s = null;
        this.f55027t = null;
        this.f55007A = false;
    }
}
