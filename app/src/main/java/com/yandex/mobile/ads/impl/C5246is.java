package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.yandex.mobile.ads.embedded.guava.collect.AbstractC4698p;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.impl.C5354ks;
import com.yandex.mobile.ads.impl.C5532ob;
import com.yandex.mobile.ads.impl.C5682rb;
import com.yandex.mobile.ads.impl.InterfaceC5090fs;
import com.yandex.mobile.ads.impl.bc0;
import com.yandex.mobile.ads.impl.ec0;
import com.yandex.mobile.ads.impl.f80;
import com.yandex.mobile.ads.impl.j41;
import com.yandex.mobile.ads.impl.k61;
import com.yandex.mobile.ads.impl.l31;
import com.yandex.mobile.ads.impl.rq0;
import com.yandex.mobile.ads.impl.sb0;
import com.yandex.mobile.ads.impl.vq0;
import com.yandex.mobile.ads.impl.x01;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* renamed from: com.yandex.mobile.ads.impl.is */
/* loaded from: classes3.dex */
final class C5246is extends AbstractC5021ee implements InterfaceC5090fs {

    /* renamed from: A */
    private int f51377A;

    /* renamed from: B */
    private int f51378B;

    /* renamed from: C */
    private boolean f51379C;

    /* renamed from: D */
    private int f51380D;

    /* renamed from: E */
    private f01 f51381E;

    /* renamed from: F */
    private x01 f51382F;

    /* renamed from: G */
    private rq0.C5705a f51383G;

    /* renamed from: H */
    private sb0 f51384H;

    /* renamed from: I */
    @Nullable
    private AudioTrack f51385I;

    /* renamed from: J */
    @Nullable
    private Object f51386J;

    /* renamed from: K */
    @Nullable
    private Surface f51387K;

    /* renamed from: L */
    @Nullable
    private TextureView f51388L;

    /* renamed from: M */
    private int f51389M;

    /* renamed from: N */
    private int f51390N;

    /* renamed from: O */
    private int f51391O;

    /* renamed from: P */
    private int f51392P;

    /* renamed from: Q */
    private C5481nb f51393Q;

    /* renamed from: R */
    private float f51394R;

    /* renamed from: S */
    private boolean f51395S;

    /* renamed from: T */
    private boolean f51396T;

    /* renamed from: U */
    private boolean f51397U;

    /* renamed from: V */
    private C5875uo f51398V;

    /* renamed from: W */
    private sb0 f51399W;

    /* renamed from: X */
    private lq0 f51400X;

    /* renamed from: Y */
    private int f51401Y;

    /* renamed from: Z */
    private long f51402Z;

    /* renamed from: b */
    public final e71 f51403b;

    /* renamed from: c */
    public final rq0.C5705a f51404c;

    /* renamed from: d */
    private final C4813ak f51405d;

    /* renamed from: e */
    private final rq0 f51406e;

    /* renamed from: f */
    private final cv0[] f51407f;

    /* renamed from: g */
    private final d71 f51408g;

    /* renamed from: h */
    private final InterfaceC4944cy f51409h;

    /* renamed from: i */
    private final C5354ks f51410i;

    /* renamed from: j */
    private final f80<rq0.InterfaceC5706b> f51411j;

    /* renamed from: k */
    private final CopyOnWriteArraySet<InterfaceC5090fs.a> f51412k;

    /* renamed from: l */
    private final k61.C5321b f51413l;

    /* renamed from: m */
    private final ArrayList f51414m;

    /* renamed from: n */
    private final boolean f51415n;

    /* renamed from: o */
    private final bc0.InterfaceC4857a f51416o;

    /* renamed from: p */
    private final InterfaceC5569p8 f51417p;

    /* renamed from: q */
    private final Looper f51418q;

    /* renamed from: r */
    private final InterfaceC5793tc f51419r;

    /* renamed from: s */
    private final f51 f51420s;

    /* renamed from: t */
    private final b f51421t;

    /* renamed from: u */
    private final C5532ob f51422u;

    /* renamed from: v */
    private final C5682rb f51423v;

    /* renamed from: w */
    private final j41 f51424w;

    /* renamed from: x */
    private final di1 f51425x;

    /* renamed from: y */
    private final zi1 f51426y;

    /* renamed from: z */
    private final long f51427z;

    @RequiresApi
    /* renamed from: com.yandex.mobile.ads.impl.is$a */
    public static final class a {
        @DoNotInline
        /* renamed from: a */
        public static uq0 m25690a(Context context, C5246is c5246is, boolean z) {
            tb0 m28568a = tb0.m28568a(context);
            if (m28568a == null) {
                d90.m23842d("ExoPlayerImpl", "MediaMetricsService unavailable.");
                return new uq0(LogSessionId.LOG_SESSION_ID_NONE);
            }
            if (z) {
                c5246is.m25686a(m28568a);
            }
            return new uq0(m28568a.m28581b());
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.is$b */
    public final class b implements hf1, InterfaceC5790tb, y51, zd0, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, l31.InterfaceC5375b, C5682rb.b, C5532ob.b, j41.InterfaceC5269a, InterfaceC5090fs.a {
        private b() {
        }

        @Override // com.yandex.mobile.ads.impl.hf1
        /* renamed from: a */
        public final void mo25154a(String str, long j2, long j3) {
            C5246is.this.f51417p.mo23462a(str, j2, j3);
        }

        @Override // com.yandex.mobile.ads.impl.hf1
        /* renamed from: b */
        public final void mo25156b(C5606pv c5606pv, @Nullable C5873um c5873um) {
            Objects.requireNonNull(C5246is.this);
            C5246is.this.f51417p.mo23469b(c5606pv, c5873um);
        }

        @Override // com.yandex.mobile.ads.impl.hf1
        /* renamed from: c */
        public final void mo25157c(C5647qm c5647qm) {
            C5246is.this.f51417p.mo23475c(c5647qm);
            Objects.requireNonNull(C5246is.this);
            Objects.requireNonNull(C5246is.this);
        }

        @Override // com.yandex.mobile.ads.impl.hf1
        /* renamed from: d */
        public final void mo25159d(C5647qm c5647qm) {
            Objects.requireNonNull(C5246is.this);
            C5246is.this.f51417p.mo23478d(c5647qm);
        }

        @Override // com.yandex.mobile.ads.impl.y51
        public final void onCues(List<C5751sl> list) {
            f80 f80Var = C5246is.this.f51411j;
            f80Var.m24342a(27, new en1(list, 6));
            f80Var.m24341a();
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC5790tb
        public final void onSkipSilenceEnabledChanged(final boolean z) {
            if (C5246is.this.f51395S == z) {
                return;
            }
            C5246is.this.f51395S = z;
            f80 f80Var = C5246is.this.f51411j;
            f80Var.m24342a(23, new f80.InterfaceC5063a() { // from class: com.yandex.mobile.ads.impl.fp1
                @Override // com.yandex.mobile.ads.impl.f80.InterfaceC5063a
                public final void invoke(Object obj) {
                    ((rq0.InterfaceC5706b) obj).onSkipSilenceEnabledChanged(z);
                }
            });
            f80Var.m24341a();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
            C5246is.m25622a(C5246is.this, surfaceTexture);
            C5246is.this.m25614a(i2, i3);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            C5246is.this.m25619a((Surface) null);
            C5246is.this.m25614a(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
            C5246is.this.m25614a(i2, i3);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
            C5246is.this.m25614a(i3, i4);
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            Objects.requireNonNull(C5246is.this);
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            Objects.requireNonNull(C5246is.this);
            C5246is.this.m25614a(0, 0);
        }

        public /* synthetic */ b(C5246is c5246is, int i2) {
            this();
        }

        @Override // com.yandex.mobile.ads.impl.hf1
        /* renamed from: a */
        public final void mo25151a(lf1 lf1Var) {
            Objects.requireNonNull(C5246is.this);
            f80 f80Var = C5246is.this.f51411j;
            f80Var.m24342a(25, new en1(lf1Var, 7));
            f80Var.m24341a();
        }

        @Override // com.yandex.mobile.ads.impl.hf1
        /* renamed from: b */
        public final void mo25155b(int i2, long j2) {
            C5246is.this.f51417p.mo23466b(i2, j2);
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC5790tb
        /* renamed from: b */
        public final void mo25717b(C5647qm c5647qm) {
            Objects.requireNonNull(C5246is.this);
            C5246is.this.f51417p.mo23470b(c5647qm);
        }

        @Override // com.yandex.mobile.ads.impl.hf1
        /* renamed from: c */
        public final void mo25158c(Exception exc) {
            C5246is.this.f51417p.mo23476c(exc);
        }

        /* renamed from: c */
        public final void m25721c() {
            C5875uo m25637b = C5246is.m25637b(C5246is.this.f51424w);
            if (m25637b.equals(C5246is.this.f51398V)) {
                return;
            }
            C5246is.this.f51398V = m25637b;
            f80 f80Var = C5246is.this.f51411j;
            f80Var.m24342a(29, new en1(m25637b, 8));
            f80Var.m24341a();
        }

        @Override // com.yandex.mobile.ads.impl.hf1
        /* renamed from: a */
        public final void mo25152a(Object obj, long j2) {
            C5246is.this.f51417p.mo23460a(obj, j2);
            if (C5246is.this.f51386J == obj) {
                f80 f80Var = C5246is.this.f51411j;
                f80Var.m24342a(26, dn1.f49690E);
                f80Var.m24341a();
            }
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC5790tb
        /* renamed from: b */
        public final void mo25720b(String str, long j2, long j3) {
            C5246is.this.f51417p.mo23473b(str, j2, j3);
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC5790tb
        /* renamed from: b */
        public final void mo25719b(String str) {
            C5246is.this.f51417p.mo23472b(str);
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC5790tb
        /* renamed from: b */
        public final void mo25718b(Exception exc) {
            C5246is.this.f51417p.mo23471b(exc);
        }

        @Override // com.yandex.mobile.ads.impl.l31.InterfaceC5375b
        /* renamed from: b */
        public final void mo25716b() {
            C5246is.this.m25619a((Surface) null);
        }

        @Override // com.yandex.mobile.ads.impl.hf1
        /* renamed from: a */
        public final void mo25153a(String str) {
            C5246is.this.f51417p.mo23461a(str);
        }

        @Override // com.yandex.mobile.ads.impl.hf1
        /* renamed from: a */
        public final void mo25150a(int i2, long j2) {
            C5246is.this.f51417p.mo23440a(i2, j2);
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC5790tb
        /* renamed from: a */
        public final void mo25711a(C5606pv c5606pv, @Nullable C5873um c5873um) {
            Objects.requireNonNull(C5246is.this);
            C5246is.this.f51417p.mo23448a(c5606pv, c5873um);
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC5790tb
        /* renamed from: a */
        public final void mo25708a(long j2) {
            C5246is.this.f51417p.mo23442a(j2);
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC5790tb
        /* renamed from: a */
        public final void mo25707a(int i2, long j2, long j3) {
            C5246is.this.f51417p.mo23441a(i2, j2, j3);
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC5790tb
        /* renamed from: a */
        public final void mo25712a(C5647qm c5647qm) {
            C5246is.this.f51417p.mo23450a(c5647qm);
            Objects.requireNonNull(C5246is.this);
            Objects.requireNonNull(C5246is.this);
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC5790tb
        /* renamed from: a */
        public final void mo25714a(Exception exc) {
            C5246is.this.f51417p.mo23459a(exc);
        }

        @Override // com.yandex.mobile.ads.impl.y51
        /* renamed from: a */
        public final void mo25713a(C5871ul c5871ul) {
            Objects.requireNonNull(C5246is.this);
            f80 f80Var = C5246is.this.f51411j;
            f80Var.m24342a(27, new en1(c5871ul, 3));
            f80Var.m24341a();
        }

        @Override // com.yandex.mobile.ads.impl.zd0
        /* renamed from: a */
        public final void mo25710a(Metadata metadata) {
            C5246is c5246is = C5246is.this;
            sb0 sb0Var = c5246is.f51399W;
            Objects.requireNonNull(sb0Var);
            int i2 = 0;
            sb0.C5738a c5738a = new sb0.C5738a(sb0Var, i2);
            for (int i3 = 0; i3 < metadata.m22237c(); i3++) {
                metadata.m22234a(i3).mo22239a(c5738a);
            }
            c5246is.f51399W = new sb0(c5738a, i2);
            sb0 m25643c = C5246is.m25643c(C5246is.this);
            if (!m25643c.equals(C5246is.this.f51384H)) {
                C5246is.this.f51384H = m25643c;
                C5246is.this.f51411j.m24342a(14, new en1(this, 4));
            }
            C5246is.this.f51411j.m24342a(28, new en1(metadata, 5));
            C5246is.this.f51411j.m24341a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m25694a(rq0.InterfaceC5706b interfaceC5706b) {
            interfaceC5706b.mo23454a(C5246is.this.f51384H);
        }

        @Override // com.yandex.mobile.ads.impl.l31.InterfaceC5375b
        /* renamed from: a */
        public final void mo25709a(Surface surface) {
            C5246is.this.m25619a(surface);
        }

        /* renamed from: a */
        public final void m25715a(final boolean z, final int i2) {
            f80 f80Var = C5246is.this.f51411j;
            f80Var.m24342a(30, new f80.InterfaceC5063a() { // from class: com.yandex.mobile.ads.impl.ep1
                @Override // com.yandex.mobile.ads.impl.f80.InterfaceC5063a
                public final void invoke(Object obj) {
                    rq0.InterfaceC5706b interfaceC5706b = (rq0.InterfaceC5706b) obj;
                    interfaceC5706b.mo23464a(z, i2);
                }
            });
            f80Var.m24341a();
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC5090fs.a
        /* renamed from: a */
        public final void mo24728a() {
            C5246is.m25659h(C5246is.this);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.is$c */
    public static final class c implements me1, InterfaceC6026xg, vq0.InterfaceC5936b {

        /* renamed from: b */
        @Nullable
        private me1 f51429b;

        /* renamed from: c */
        @Nullable
        private InterfaceC6026xg f51430c;

        /* renamed from: d */
        @Nullable
        private me1 f51431d;

        /* renamed from: e */
        @Nullable
        private InterfaceC6026xg f51432e;

        private c() {
        }

        @Override // com.yandex.mobile.ads.impl.vq0.InterfaceC5936b
        /* renamed from: a */
        public final void mo24074a(int i2, @Nullable Object obj) {
            if (i2 == 7) {
                this.f51429b = (me1) obj;
                return;
            }
            if (i2 == 8) {
                this.f51430c = (InterfaceC6026xg) obj;
                return;
            }
            if (i2 != 10000) {
                return;
            }
            l31 l31Var = (l31) obj;
            if (l31Var == null) {
                this.f51431d = null;
                this.f51432e = null;
            } else {
                this.f51431d = l31Var.m26346b();
                this.f51432e = l31Var.m26345a();
            }
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC6026xg
        /* renamed from: f */
        public final void mo25724f() {
            InterfaceC6026xg interfaceC6026xg = this.f51432e;
            if (interfaceC6026xg != null) {
                interfaceC6026xg.mo25724f();
            }
            InterfaceC6026xg interfaceC6026xg2 = this.f51430c;
            if (interfaceC6026xg2 != null) {
                interfaceC6026xg2.mo25724f();
            }
        }

        public /* synthetic */ c(int i2) {
            this();
        }

        @Override // com.yandex.mobile.ads.impl.me1
        /* renamed from: a */
        public final void mo25722a(long j2, long j3, C5606pv c5606pv, @Nullable MediaFormat mediaFormat) {
            me1 me1Var = this.f51431d;
            if (me1Var != null) {
                me1Var.mo25722a(j2, j3, c5606pv, mediaFormat);
            }
            me1 me1Var2 = this.f51429b;
            if (me1Var2 != null) {
                me1Var2.mo25722a(j2, j3, c5606pv, mediaFormat);
            }
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC6026xg
        /* renamed from: a */
        public final void mo25723a(long j2, float[] fArr) {
            InterfaceC6026xg interfaceC6026xg = this.f51432e;
            if (interfaceC6026xg != null) {
                interfaceC6026xg.mo25723a(j2, fArr);
            }
            InterfaceC6026xg interfaceC6026xg2 = this.f51430c;
            if (interfaceC6026xg2 != null) {
                interfaceC6026xg2.mo25723a(j2, fArr);
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.is$d */
    public static final class d implements dc0 {

        /* renamed from: a */
        private final Object f51433a;

        /* renamed from: b */
        private k61 f51434b;

        public d(k61 k61Var, Object obj) {
            this.f51433a = obj;
            this.f51434b = k61Var;
        }

        @Override // com.yandex.mobile.ads.impl.dc0
        /* renamed from: b */
        public final k61 mo23867b() {
            return this.f51434b;
        }

        @Override // com.yandex.mobile.ads.impl.dc0
        /* renamed from: a */
        public final Object mo23866a() {
            return this.f51433a;
        }
    }

    static {
        C5411ls.m26526a("goog.exo.exoplayer");
    }

    @SuppressLint
    public C5246is(InterfaceC5090fs.b bVar) {
        C5246is c5246is = this;
        C4813ak c4813ak = new C4813ak();
        c5246is.f51405d = c4813ak;
        try {
            d90.m23841c("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.18.1] [" + s91.f54534e + "]");
            Context applicationContext = bVar.f50419a.getApplicationContext();
            InterfaceC5569p8 apply = bVar.f50426h.apply(bVar.f50420b);
            c5246is.f51417p = apply;
            c5246is.f51393Q = bVar.f50428j;
            c5246is.f51389M = bVar.f50429k;
            int i2 = 0;
            c5246is.f51395S = false;
            c5246is.f51427z = bVar.f50434p;
            b bVar2 = new b(c5246is, i2);
            c5246is.f51421t = bVar2;
            Object cVar = new c(i2);
            Handler handler = new Handler(bVar.f50427i);
            cv0[] mo23497a = bVar.f50421c.get().mo23497a(handler, bVar2, bVar2, bVar2, bVar2);
            c5246is.f51407f = mo23497a;
            C5220ia.m25476b(mo23497a.length > 0);
            d71 d71Var = bVar.f50423e.get();
            c5246is.f51408g = d71Var;
            c5246is.f51416o = bVar.f50422d.get();
            InterfaceC5793tc interfaceC5793tc = bVar.f50425g.get();
            c5246is.f51419r = interfaceC5793tc;
            c5246is.f51415n = bVar.f50430l;
            c5246is.f51381E = bVar.f50431m;
            Looper looper = bVar.f50427i;
            c5246is.f51418q = looper;
            f51 f51Var = bVar.f50420b;
            c5246is.f51420s = f51Var;
            c5246is.f51406e = c5246is;
            c5246is.f51411j = new f80<>(looper, f51Var, new dp1(c5246is));
            c5246is.f51412k = new CopyOnWriteArraySet<>();
            c5246is.f51414m = new ArrayList();
            c5246is.f51382F = new x01.C6001a();
            e71 e71Var = new e71(new ev0[mo23497a.length], new InterfaceC5939vs[mo23497a.length], t71.f54968b, null);
            c5246is.f51403b = e71Var;
            c5246is.f51413l = new k61.C5321b();
            rq0.C5705a m27973a = new rq0.C5705a.a().m27972a(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28).m27971a(d71Var.m23828c(), 29).m27973a();
            c5246is.f51404c = m27973a;
            c5246is.f51383G = new rq0.C5705a.a().m27970a(m27973a).m27969a(4).m27969a(10).m27973a();
            c5246is.f51409h = f51Var.mo23885a(looper, null);
            dp1 dp1Var = new dp1(c5246is);
            c5246is.f51400X = lq0.m26519a(e71Var);
            apply.mo23453a(c5246is, looper);
            int i3 = s91.f54530a;
            uq0 uq0Var = i3 < 31 ? new uq0() : a.m25690a(applicationContext, c5246is, bVar.f50435q);
            h80 h80Var = bVar.f50424f.get();
            f01 f01Var = c5246is.f51381E;
            try {
                c5246is = this;
                c5246is.f51410i = new C5354ks(mo23497a, d71Var, e71Var, h80Var, interfaceC5793tc, 0, apply, f01Var, bVar.f50432n, bVar.f50433o, false, looper, f51Var, dp1Var, uq0Var);
                c5246is.f51394R = 1.0f;
                sb0 sb0Var = sb0.f54557G;
                c5246is.f51384H = sb0Var;
                c5246is.f51399W = sb0Var;
                c5246is.f51401Y = -1;
                if (i3 < 21) {
                    c5246is.f51392P = m25652f();
                } else {
                    c5246is.f51392P = s91.m28090a(applicationContext);
                }
                int i4 = C5871ul.f55553a;
                c5246is.f51396T = true;
                c5246is.mo25687b(apply);
                interfaceC5793tc.mo25256a(new Handler(looper), apply);
                c5246is.m25684a(bVar2);
                C5532ob c5532ob = new C5532ob(bVar.f50419a, handler, bVar2);
                c5246is.f51422u = c5532ob;
                c5532ob.m27063a();
                C5682rb c5682rb = new C5682rb(bVar.f50419a, handler, bVar2);
                c5246is.f51423v = c5682rb;
                c5682rb.m27893d();
                j41 j41Var = new j41(bVar.f50419a, handler, bVar2);
                c5246is.f51424w = j41Var;
                j41Var.m25796a(s91.m28125c(c5246is.f51393Q.f52896c));
                di1 di1Var = new di1(bVar.f50419a);
                c5246is.f51425x = di1Var;
                di1Var.m23893a();
                zi1 zi1Var = new zi1(bVar.f50419a);
                c5246is.f51426y = zi1Var;
                zi1Var.m30193a();
                c5246is.f51398V = m25637b(j41Var);
                int i5 = lf1.f52380e;
                d71Var.mo23825a(c5246is.f51393Q);
                c5246is.m25616a(1, 10, Integer.valueOf(c5246is.f51392P));
                c5246is.m25616a(2, 10, Integer.valueOf(c5246is.f51392P));
                c5246is.m25616a(1, 3, c5246is.f51393Q);
                c5246is.m25616a(2, 4, Integer.valueOf(c5246is.f51389M));
                c5246is.m25616a(2, 5, (Object) 0);
                c5246is.m25616a(1, 9, Boolean.valueOf(c5246is.f51395S));
                c5246is.m25616a(2, 7, cVar);
                c5246is.m25616a(6, 8, cVar);
                c4813ak.m22536e();
            } catch (Throwable th) {
                th = th;
                c5246is = this;
                c5246is.f51405d.m22536e();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: a */
    public static int m25608a(boolean z, int i2) {
        return (!z || i2 == 1) ? 1 : 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m25646c(rq0.InterfaceC5706b interfaceC5706b) {
        interfaceC5706b.mo23468b(C5043es.m24247a(new C5881us(1), 1003));
    }

    /* renamed from: h */
    private void m25658h() {
        rq0.C5705a c5705a = this.f51383G;
        rq0 rq0Var = this.f51406e;
        rq0.C5705a c5705a2 = this.f51404c;
        int i2 = s91.f54530a;
        boolean isPlayingAd = rq0Var.isPlayingAd();
        boolean isCurrentMediaItemSeekable = rq0Var.isCurrentMediaItemSeekable();
        boolean hasPreviousMediaItem = rq0Var.hasPreviousMediaItem();
        boolean hasNextMediaItem = rq0Var.hasNextMediaItem();
        boolean isCurrentMediaItemLive = rq0Var.isCurrentMediaItemLive();
        boolean isCurrentMediaItemDynamic = rq0Var.isCurrentMediaItemDynamic();
        boolean m26043c = rq0Var.getCurrentTimeline().m26043c();
        boolean z = !isPlayingAd;
        boolean z2 = false;
        rq0.C5705a.a m27971a = new rq0.C5705a.a().m27970a(c5705a2).m27971a(z, 4).m27971a(isCurrentMediaItemSeekable && !isPlayingAd, 5).m27971a(hasPreviousMediaItem && !isPlayingAd, 6).m27971a(!m26043c && (hasPreviousMediaItem || !isCurrentMediaItemLive || isCurrentMediaItemSeekable) && !isPlayingAd, 7).m27971a(hasNextMediaItem && !isPlayingAd, 8).m27971a(!m26043c && (hasNextMediaItem || (isCurrentMediaItemLive && isCurrentMediaItemDynamic)) && !isPlayingAd, 9).m27971a(z, 10).m27971a(isCurrentMediaItemSeekable && !isPlayingAd, 11);
        if (isCurrentMediaItemSeekable && !isPlayingAd) {
            z2 = true;
        }
        rq0.C5705a m27973a = m27971a.m27971a(z2, 12).m27973a();
        this.f51383G = m27973a;
        if (m27973a.equals(c5705a)) {
            return;
        }
        this.f51411j.m24342a(13, new dp1(this));
    }

    /* renamed from: e */
    public final void m25689e() {
        m25662i();
    }

    @Override // com.yandex.mobile.ads.impl.rq0
    public final long getContentPosition() {
        m25662i();
        if (!isPlayingAd()) {
            return getCurrentPosition();
        }
        lq0 lq0Var = this.f51400X;
        lq0Var.f52493a.mo23973a(lq0Var.f52494b.f56449a, this.f51413l);
        lq0 lq0Var2 = this.f51400X;
        return lq0Var2.f52495c == -9223372036854775807L ? s91.m28119b(lq0Var2.f52493a.mo23974a(getCurrentMediaItemIndex(), this.f49936a, 0L).f51876m) : s91.m28119b(this.f51413l.f51853e) + s91.m28119b(this.f51400X.f52495c);
    }

    @Override // com.yandex.mobile.ads.impl.rq0
    public final int getCurrentAdGroupIndex() {
        m25662i();
        if (isPlayingAd()) {
            return this.f51400X.f52494b.f56450b;
        }
        return -1;
    }

    @Override // com.yandex.mobile.ads.impl.rq0
    public final int getCurrentAdIndexInAdGroup() {
        m25662i();
        if (isPlayingAd()) {
            return this.f51400X.f52494b.f56451c;
        }
        return -1;
    }

    @Override // com.yandex.mobile.ads.impl.rq0
    public final int getCurrentMediaItemIndex() {
        m25662i();
        int m25642c = m25642c();
        if (m25642c == -1) {
            return 0;
        }
        return m25642c;
    }

    @Override // com.yandex.mobile.ads.impl.rq0
    public final int getCurrentPeriodIndex() {
        m25662i();
        if (this.f51400X.f52493a.m26043c()) {
            return 0;
        }
        lq0 lq0Var = this.f51400X;
        return lq0Var.f52493a.mo23970a(lq0Var.f52494b.f56449a);
    }

    @Override // com.yandex.mobile.ads.impl.rq0
    public final long getCurrentPosition() {
        long j2;
        m25662i();
        lq0 lq0Var = this.f51400X;
        if (lq0Var.f52493a.m26043c()) {
            j2 = s91.m28096a(this.f51402Z);
        } else if (lq0Var.f52494b.m29735a()) {
            j2 = lq0Var.f52510r;
        } else {
            k61 k61Var = lq0Var.f52493a;
            bc0.C4858b c4858b = lq0Var.f52494b;
            long j3 = lq0Var.f52510r;
            k61Var.mo23973a(c4858b.f56449a, this.f51413l);
            j2 = this.f51413l.f51853e + j3;
        }
        return s91.m28119b(j2);
    }

    @Override // com.yandex.mobile.ads.impl.rq0
    public final k61 getCurrentTimeline() {
        m25662i();
        return this.f51400X.f52493a;
    }

    @Override // com.yandex.mobile.ads.impl.rq0
    public final t71 getCurrentTracks() {
        m25662i();
        return this.f51400X.f52501i.f49833d;
    }

    @Override // com.yandex.mobile.ads.impl.rq0
    public final long getDuration() {
        m25662i();
        if (isPlayingAd()) {
            lq0 lq0Var = this.f51400X;
            bc0.C4858b c4858b = lq0Var.f52494b;
            lq0Var.f52493a.mo23973a(c4858b.f56449a, this.f51413l);
            return s91.m28119b(this.f51413l.m26050a(c4858b.f56450b, c4858b.f56451c));
        }
        k61 currentTimeline = getCurrentTimeline();
        if (currentTimeline.m26043c()) {
            return -9223372036854775807L;
        }
        return s91.m28119b(currentTimeline.mo23974a(getCurrentMediaItemIndex(), this.f49936a, 0L).f51877n);
    }

    @Override // com.yandex.mobile.ads.impl.rq0
    public final boolean getPlayWhenReady() {
        m25662i();
        return this.f51400X.f52504l;
    }

    @Override // com.yandex.mobile.ads.impl.rq0
    public final int getPlaybackState() {
        m25662i();
        return this.f51400X.f52497e;
    }

    @Override // com.yandex.mobile.ads.impl.rq0
    public final int getPlaybackSuppressionReason() {
        m25662i();
        return this.f51400X.f52505m;
    }

    @Override // com.yandex.mobile.ads.impl.rq0
    public final long getTotalBufferedDuration() {
        m25662i();
        return s91.m28119b(this.f51400X.f52509q);
    }

    @Override // com.yandex.mobile.ads.impl.rq0
    public final float getVolume() {
        m25662i();
        return this.f51394R;
    }

    @Override // com.yandex.mobile.ads.impl.rq0
    public final boolean isPlayingAd() {
        m25662i();
        return this.f51400X.f52494b.m29735a();
    }

    @Override // com.yandex.mobile.ads.impl.rq0
    public final void prepare() {
        m25662i();
        boolean playWhenReady = getPlayWhenReady();
        int m27890a = this.f51423v.m27890a(playWhenReady, 2);
        m25617a(m27890a, (!playWhenReady || m27890a == 1) ? 1 : 2, playWhenReady);
        lq0 lq0Var = this.f51400X;
        if (lq0Var.f52497e != 1) {
            return;
        }
        lq0 m26523a = lq0Var.m26523a((C5043es) null);
        lq0 m26520a = m26523a.m26520a(m26523a.f52493a.m26043c() ? 4 : 2);
        this.f51377A++;
        this.f51410i.m26241i();
        m25629a(m26520a, 1, 1, false, 5, -9223372036854775807L);
    }

    @Override // com.yandex.mobile.ads.impl.rq0
    public final void release() {
        AudioTrack audioTrack;
        StringBuilder m26356a = l60.m26356a("Release ");
        m26356a.append(Integer.toHexString(System.identityHashCode(this)));
        m26356a.append(" [");
        m26356a.append("ExoPlayerLib/2.18.1");
        m26356a.append("] [");
        m26356a.append(s91.f54534e);
        m26356a.append("] [");
        m26356a.append(C5411ls.m26525a());
        m26356a.append("]");
        d90.m23841c("ExoPlayerImpl", m26356a.toString());
        m25662i();
        if (s91.f54530a < 21 && (audioTrack = this.f51385I) != null) {
            audioTrack.release();
            this.f51385I = null;
        }
        this.f51422u.m27063a();
        this.f51424w.m25798c();
        this.f51425x.m23894a(false);
        this.f51426y.m30194a(false);
        this.f51423v.m27892c();
        if (!this.f51410i.m26242k()) {
            f80<rq0.InterfaceC5706b> f80Var = this.f51411j;
            f80Var.m24342a(10, dn1.f49694e);
            f80Var.m24341a();
        }
        this.f51411j.m24344b();
        this.f51409h.mo23551a();
        this.f51419r.mo25259a(this.f51417p);
        lq0 m26520a = this.f51400X.m26520a(1);
        this.f51400X = m26520a;
        lq0 m26521a = m26520a.m26521a(m26520a.f52494b);
        this.f51400X = m26521a;
        m26521a.f52508p = m26521a.f52510r;
        this.f51400X.f52509q = 0L;
        this.f51417p.release();
        this.f51408g.mo23829d();
        m25656g();
        Surface surface = this.f51387K;
        if (surface != null) {
            surface.release();
            this.f51387K = null;
        }
        int i2 = C5871ul.f55553a;
    }

    @Override // com.yandex.mobile.ads.impl.rq0
    public final void setPlayWhenReady(boolean z) {
        m25662i();
        int m27890a = this.f51423v.m27890a(z, getPlaybackState());
        int i2 = 1;
        if (z && m27890a != 1) {
            i2 = 2;
        }
        m25617a(m27890a, i2, z);
    }

    @Override // com.yandex.mobile.ads.impl.rq0
    public final void setVideoTextureView(@Nullable TextureView textureView) {
        m25662i();
        if (textureView == null) {
            m25662i();
            m25656g();
            m25619a((Surface) null);
            m25614a(0, 0);
            return;
        }
        m25656g();
        this.f51388L = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            d90.m23842d("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f51421t);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            m25619a((Surface) null);
            m25614a(0, 0);
        } else {
            Surface surface = new Surface(surfaceTexture);
            m25619a(surface);
            this.f51387K = surface;
            m25614a(textureView.getWidth(), textureView.getHeight());
        }
    }

    @Override // com.yandex.mobile.ads.impl.rq0
    public final void setVolume(float f2) {
        m25662i();
        int i2 = s91.f54530a;
        final float max = Math.max(0.0f, Math.min(f2, 1.0f));
        if (this.f51394R == max) {
            return;
        }
        this.f51394R = max;
        m25616a(1, 2, Float.valueOf(this.f51423v.m27891b() * max));
        f80<rq0.InterfaceC5706b> f80Var = this.f51411j;
        f80Var.m24342a(22, new f80.InterfaceC5063a() { // from class: com.yandex.mobile.ads.impl.bp1
            @Override // com.yandex.mobile.ads.impl.f80.InterfaceC5063a
            public final void invoke(Object obj) {
                ((rq0.InterfaceC5706b) obj).onVolumeChanged(max);
            }
        });
        f80Var.m24341a();
    }

    @Override // com.yandex.mobile.ads.impl.rq0
    public final void stop() {
        m25662i();
        m25662i();
        this.f51423v.m27890a(getPlayWhenReady(), 1);
        m25620a((C5043es) null);
        int i2 = C5871ul.f55553a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ void m25651e(lq0 lq0Var, rq0.InterfaceC5706b interfaceC5706b) {
        interfaceC5706b.onPlayerStateChanged(lq0Var.f52504l, lq0Var.f52497e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ void m25654f(lq0 lq0Var, rq0.InterfaceC5706b interfaceC5706b) {
        interfaceC5706b.onPlaybackStateChanged(lq0Var.f52497e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ void m25657g(lq0 lq0Var, rq0.InterfaceC5706b interfaceC5706b) {
        interfaceC5706b.onPlaybackSuppressionReasonChanged(lq0Var.f52505m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static /* synthetic */ void m25663i(lq0 lq0Var, rq0.InterfaceC5706b interfaceC5706b) {
        interfaceC5706b.mo23446a(lq0Var.f52506n);
    }

    /* renamed from: d */
    public final void m25688d() {
        m25662i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m25648d(lq0 lq0Var, rq0.InterfaceC5706b interfaceC5706b) {
        boolean z = lq0Var.f52499g;
        interfaceC5706b.mo23465b();
        interfaceC5706b.onIsLoadingChanged(lq0Var.f52499g);
    }

    /* renamed from: e */
    public static void m25650e(C5246is c5246is) {
        c5246is.m25616a(1, 2, Float.valueOf(c5246is.f51394R * c5246is.f51423v.m27891b()));
    }

    /* renamed from: f */
    private int m25652f() {
        AudioTrack audioTrack = this.f51385I;
        if (audioTrack != null && audioTrack.getAudioSessionId() != 0) {
            this.f51385I.release();
            this.f51385I = null;
        }
        if (this.f51385I == null) {
            this.f51385I = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
        }
        return this.f51385I.getAudioSessionId();
    }

    /* renamed from: g */
    private void m25656g() {
        TextureView textureView = this.f51388L;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f51421t) {
                d90.m23842d("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f51388L.setSurfaceTextureListener(null);
            }
            this.f51388L = null;
        }
    }

    /* renamed from: i */
    private void m25662i() {
        this.f51405d.m22533b();
        if (Thread.currentThread() != this.f51418q.getThread()) {
            Object[] objArr = {Thread.currentThread().getName(), this.f51418q.getThread().getName()};
            int i2 = s91.f54530a;
            String format = String.format(Locale.US, "Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", objArr);
            if (!this.f51396T) {
                d90.m23840b("ExoPlayerImpl", format, this.f51397U ? null : new IllegalStateException());
                this.f51397U = true;
                return;
            }
            throw new IllegalStateException(format);
        }
    }

    @Override // com.yandex.mobile.ads.impl.rq0
    /* renamed from: b */
    public final void mo25687b(rq0.InterfaceC5706b interfaceC5706b) {
        Objects.requireNonNull(interfaceC5706b);
        this.f51411j.m24343a((f80<rq0.InterfaceC5706b>) interfaceC5706b);
    }

    /* renamed from: c */
    private int m25642c() {
        if (this.f51400X.f52493a.m26043c()) {
            return this.f51401Y;
        }
        lq0 lq0Var = this.f51400X;
        return lq0Var.f52493a.mo23973a(lq0Var.f52494b.f56449a, this.f51413l).f51851c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m25639b(C5354ks.d dVar) {
        this.f51409h.mo23555a(new hn1(this, dVar, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m25649d(rq0.InterfaceC5706b interfaceC5706b) {
        interfaceC5706b.mo23451a(this.f51383G);
    }

    /* renamed from: a */
    public static void m25622a(C5246is c5246is, SurfaceTexture surfaceTexture) {
        Objects.requireNonNull(c5246is);
        Surface surface = new Surface(surfaceTexture);
        c5246is.m25619a(surface);
        c5246is.f51387K = surface;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m25641b(lq0 lq0Var, rq0.InterfaceC5706b interfaceC5706b) {
        interfaceC5706b.mo23468b(lq0Var.f52498f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m25640b(lq0 lq0Var, int i2, rq0.InterfaceC5706b interfaceC5706b) {
        interfaceC5706b.onPlayWhenReadyChanged(lq0Var.f52504l, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m25645c(lq0 lq0Var, rq0.InterfaceC5706b interfaceC5706b) {
        interfaceC5706b.mo23455a(lq0Var.f52501i.f49833d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static C5875uo m25637b(j41 j41Var) {
        return new C5875uo(0, j41Var.m25797b(), j41Var.m25795a());
    }

    /* renamed from: c */
    public static sb0 m25643c(C5246is c5246is) {
        k61 currentTimeline = c5246is.getCurrentTimeline();
        if (currentTimeline.m26043c()) {
            return c5246is.f51399W;
        }
        pb0 pb0Var = currentTimeline.mo23974a(c5246is.getCurrentMediaItemIndex(), c5246is.f49936a, 0L).f51866c;
        sb0 sb0Var = c5246is.f51399W;
        Objects.requireNonNull(sb0Var);
        int i2 = 0;
        return new sb0(new sb0.C5738a(sb0Var, i2).m28173a(pb0Var.f53431d), i2);
    }

    @Override // com.yandex.mobile.ads.impl.rq0
    /* renamed from: a */
    public final void mo25685a(rq0.InterfaceC5706b interfaceC5706b) {
        Objects.requireNonNull(interfaceC5706b);
        this.f51411j.m24345b(interfaceC5706b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m25633a(rq0.InterfaceC5706b interfaceC5706b, C5201hv c5201hv) {
        interfaceC5706b.mo23438a();
    }

    /* renamed from: a */
    public final void m25684a(InterfaceC5090fs.a aVar) {
        this.f51412k.add(aVar);
    }

    @Override // com.yandex.mobile.ads.impl.rq0
    @Nullable
    /* renamed from: a */
    public final C5043es mo25683a() {
        m25662i();
        return this.f51400X.f52498f;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5090fs
    /* renamed from: a */
    public final void mo24727a(ws0 ws0Var) {
        long j2;
        long j3;
        m25662i();
        List singletonList = Collections.singletonList(ws0Var);
        m25662i();
        m25662i();
        m25642c();
        getCurrentPosition();
        this.f51377A++;
        if (!this.f51414m.isEmpty()) {
            int size = this.f51414m.size();
            for (int i2 = size - 1; i2 >= 0; i2--) {
                this.f51414m.remove(i2);
            }
            this.f51382F = this.f51382F.mo29619c(size);
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < singletonList.size(); i3++) {
            ec0.C5018c c5018c = new ec0.C5018c((bc0) singletonList.get(i3), this.f51415n);
            arrayList.add(c5018c);
            this.f51414m.add(i3 + 0, new d(c5018c.f49921a.m29876f(), c5018c.f49922b));
        }
        this.f51382F = this.f51382F.mo29617b(arrayList.size());
        jr0 jr0Var = new jr0(this.f51414m, this.f51382F);
        if (!jr0Var.m26043c() && -1 >= jr0Var.mo25935b()) {
            throw new m10();
        }
        int mo23971a = jr0Var.mo23971a(false);
        lq0 m25611a = m25611a(this.f51400X, jr0Var, m25610a(jr0Var, mo23971a, -9223372036854775807L));
        int i4 = m25611a.f52497e;
        if (mo23971a != -1 && i4 != 1) {
            i4 = (jr0Var.m26043c() || mo23971a >= jr0Var.mo25935b()) ? 4 : 2;
        }
        lq0 m26520a = m25611a.m26520a(i4);
        this.f51410i.m26235a(mo23971a, s91.m28096a(-9223372036854775807L), this.f51382F, arrayList);
        boolean z = (this.f51400X.f52494b.f56449a.equals(m26520a.f52494b.f56449a) || this.f51400X.f52493a.m26043c()) ? false : true;
        if (m26520a.f52493a.m26043c()) {
            j3 = s91.m28096a(this.f51402Z);
        } else if (m26520a.f52494b.m29735a()) {
            j3 = m26520a.f52510r;
        } else {
            k61 k61Var = m26520a.f52493a;
            bc0.C4858b c4858b = m26520a.f52494b;
            long j4 = m26520a.f52510r;
            k61Var.mo23973a(c4858b.f56449a, this.f51413l);
            j2 = j4 + this.f51413l.f51853e;
            m25629a(m26520a, 0, 1, z, 4, j2);
        }
        j2 = j3;
        m25629a(m26520a, 0, 1, z, 4, j2);
    }

    /* renamed from: h */
    public static void m25659h(C5246is c5246is) {
        int playbackState = c5246is.getPlaybackState();
        if (playbackState != 1) {
            if (playbackState == 2 || playbackState == 3) {
                c5246is.m25662i();
                c5246is.f51425x.m23894a(c5246is.getPlayWhenReady() && !c5246is.f51400X.f52507o);
                c5246is.f51426y.m30194a(c5246is.getPlayWhenReady());
                return;
            }
            if (playbackState != 4) {
                throw new IllegalStateException();
            }
        }
        c5246is.f51425x.m23894a(false);
        c5246is.f51426y.m30194a(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static void m25660h(lq0 lq0Var, rq0.InterfaceC5706b interfaceC5706b) {
        interfaceC5706b.onIsPlayingChanged(lq0Var.f52497e == 3 && lq0Var.f52504l && lq0Var.f52505m == 0);
    }

    /* renamed from: a */
    public final void m25686a(tb0 tb0Var) {
        this.f51417p.mo23456a(tb0Var);
    }

    /* renamed from: a */
    private void m25620a(@Nullable C5043es c5043es) {
        long j2;
        long j3;
        lq0 lq0Var = this.f51400X;
        lq0 m26521a = lq0Var.m26521a(lq0Var.f52494b);
        m26521a.f52508p = m26521a.f52510r;
        m26521a.f52509q = 0L;
        lq0 m26520a = m26521a.m26520a(1);
        if (c5043es != null) {
            m26520a = m26520a.m26523a(c5043es);
        }
        lq0 lq0Var2 = m26520a;
        this.f51377A++;
        this.f51410i.m26243q();
        boolean z = lq0Var2.f52493a.m26043c() && !this.f51400X.f52493a.m26043c();
        if (lq0Var2.f52493a.m26043c()) {
            j3 = s91.m28096a(this.f51402Z);
        } else if (lq0Var2.f52494b.m29735a()) {
            j3 = lq0Var2.f52510r;
        } else {
            k61 k61Var = lq0Var2.f52493a;
            bc0.C4858b c4858b = lq0Var2.f52494b;
            long j4 = lq0Var2.f52510r;
            k61Var.mo23973a(c4858b.f56449a, this.f51413l);
            j2 = j4 + this.f51413l.f51853e;
            m25629a(lq0Var2, 0, 1, z, 4, j2);
        }
        j2 = j3;
        m25629a(lq0Var2, 0, 1, z, 4, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m25628a(C5354ks.d dVar) {
        long j2;
        boolean z;
        int i2 = this.f51377A - dVar.f52114c;
        this.f51377A = i2;
        boolean z2 = true;
        if (dVar.f52115d) {
            this.f51378B = dVar.f52116e;
            this.f51379C = true;
        }
        if (dVar.f52117f) {
            this.f51380D = dVar.f52118g;
        }
        if (i2 == 0) {
            k61 k61Var = dVar.f52113b.f52493a;
            if (!this.f51400X.f52493a.m26043c() && k61Var.m26043c()) {
                this.f51401Y = -1;
                this.f51402Z = 0L;
            }
            if (!k61Var.m26043c()) {
                List<k61> m25936d = ((jr0) k61Var).m25936d();
                C5220ia.m25476b(m25936d.size() == this.f51414m.size());
                for (int i3 = 0; i3 < m25936d.size(); i3++) {
                    ((d) this.f51414m.get(i3)).f51434b = m25936d.get(i3);
                }
            }
            long j3 = -9223372036854775807L;
            if (this.f51379C) {
                if (dVar.f52113b.f52494b.equals(this.f51400X.f52494b) && dVar.f52113b.f52496d == this.f51400X.f52510r) {
                    z2 = false;
                }
                if (z2) {
                    if (!k61Var.m26043c() && !dVar.f52113b.f52494b.m29735a()) {
                        lq0 lq0Var = dVar.f52113b;
                        bc0.C4858b c4858b = lq0Var.f52494b;
                        long j4 = lq0Var.f52496d;
                        k61Var.mo23973a(c4858b.f56449a, this.f51413l);
                        j3 = j4 + this.f51413l.f51853e;
                    } else {
                        j3 = dVar.f52113b.f52496d;
                    }
                }
                z = z2;
                j2 = j3;
            } else {
                j2 = -9223372036854775807L;
                z = false;
            }
            this.f51379C = false;
            m25629a(dVar.f52113b, 1, this.f51380D, z, this.f51378B, j2);
        }
    }

    /* renamed from: a */
    private void m25629a(final lq0 lq0Var, final int i2, final int i3, boolean z, int i4, long j2) {
        Pair pair;
        int i5;
        final pb0 pb0Var;
        int i6;
        boolean z2;
        boolean z3;
        int i7;
        Object obj;
        int i8;
        pb0 pb0Var2;
        Object obj2;
        int i9;
        long j3;
        long j4;
        long j5;
        long m25609a;
        Object obj3;
        pb0 pb0Var3;
        Object obj4;
        int i10;
        lq0 lq0Var2 = this.f51400X;
        this.f51400X = lq0Var;
        boolean z4 = !lq0Var2.f52493a.equals(lq0Var.f52493a);
        k61 k61Var = lq0Var2.f52493a;
        k61 k61Var2 = lq0Var.f52493a;
        final int i11 = 0;
        if (k61Var2.m26043c() && k61Var.m26043c()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (k61Var2.m26043c() != k61Var.m26043c()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else if (!k61Var.mo23974a(k61Var.mo23973a(lq0Var2.f52494b.f56449a, this.f51413l).f51851c, this.f49936a, 0L).f51864a.equals(k61Var2.mo23974a(k61Var2.mo23973a(lq0Var.f52494b.f56449a, this.f51413l).f51851c, this.f49936a, 0L).f51864a)) {
            if (z && i4 == 0) {
                i5 = 1;
            } else if (z && i4 == 1) {
                i5 = 2;
            } else {
                if (!z4) {
                    throw new IllegalStateException();
                }
                i5 = 3;
            }
            pair = new Pair(Boolean.TRUE, Integer.valueOf(i5));
        } else if (z && i4 == 0 && lq0Var2.f52494b.f56452d < lq0Var.f52494b.f56452d) {
            pair = new Pair(Boolean.TRUE, 0);
        } else {
            pair = new Pair(Boolean.FALSE, -1);
        }
        boolean booleanValue = ((Boolean) pair.first).booleanValue();
        int intValue = ((Integer) pair.second).intValue();
        sb0 sb0Var = this.f51384H;
        if (booleanValue) {
            pb0 pb0Var4 = !lq0Var.f52493a.m26043c() ? lq0Var.f52493a.mo23974a(lq0Var.f52493a.mo23973a(lq0Var.f52494b.f56449a, this.f51413l).f51851c, this.f49936a, 0L).f51866c : null;
            this.f51399W = sb0.f54557G;
            pb0Var = pb0Var4;
        } else {
            pb0Var = null;
        }
        if (booleanValue || !lq0Var2.f52502j.equals(lq0Var.f52502j)) {
            sb0 sb0Var2 = this.f51399W;
            Objects.requireNonNull(sb0Var2);
            sb0.C5738a c5738a = new sb0.C5738a(sb0Var2, i11);
            List<Metadata> list = lq0Var.f52502j;
            for (int i12 = 0; i12 < list.size(); i12++) {
                Metadata metadata = list.get(i12);
                for (int i13 = 0; i13 < metadata.m22237c(); i13++) {
                    metadata.m22234a(i13).mo22239a(c5738a);
                }
            }
            this.f51399W = new sb0(c5738a, i11);
            k61 currentTimeline = getCurrentTimeline();
            if (currentTimeline.m26043c()) {
                sb0Var = this.f51399W;
            } else {
                pb0 pb0Var5 = currentTimeline.mo23974a(getCurrentMediaItemIndex(), this.f49936a, 0L).f51866c;
                sb0 sb0Var3 = this.f51399W;
                Objects.requireNonNull(sb0Var3);
                sb0Var = new sb0(new sb0.C5738a(sb0Var3, i11).m28173a(pb0Var5.f53431d), i11);
            }
        }
        boolean z5 = !sb0Var.equals(this.f51384H);
        this.f51384H = sb0Var;
        boolean z6 = lq0Var2.f52504l != lq0Var.f52504l;
        boolean z7 = lq0Var2.f52497e != lq0Var.f52497e;
        if (z7 || z6) {
            int playbackState = getPlaybackState();
            if (playbackState != 1) {
                if (playbackState == 2 || playbackState == 3) {
                    m25662i();
                    this.f51425x.m23894a(getPlayWhenReady() && !this.f51400X.f52507o);
                    this.f51426y.m30194a(getPlayWhenReady());
                } else if (playbackState != 4) {
                    throw new IllegalStateException();
                }
            }
            this.f51425x.m23894a(false);
            this.f51426y.m30194a(false);
        }
        boolean z8 = lq0Var2.f52499g != lq0Var.f52499g;
        if (!lq0Var2.f52493a.equals(lq0Var.f52493a)) {
            this.f51411j.m24342a(0, new f80.InterfaceC5063a() { // from class: com.yandex.mobile.ads.impl.ap1
                @Override // com.yandex.mobile.ads.impl.f80.InterfaceC5063a
                public final void invoke(Object obj5) {
                    switch (i11) {
                        case 0:
                            C5246is.m25630a((lq0) lq0Var, i2, (rq0.InterfaceC5706b) obj5);
                            break;
                        case 1:
                            C5246is.m25640b((lq0) lq0Var, i2, (rq0.InterfaceC5706b) obj5);
                            break;
                        default:
                            ((rq0.InterfaceC5706b) obj5).mo23447a((pb0) lq0Var, i2);
                            break;
                    }
                }
            });
        }
        if (z) {
            k61.C5321b c5321b = new k61.C5321b();
            if (lq0Var2.f52493a.m26043c()) {
                i6 = intValue;
                z2 = z5;
                obj = null;
                i8 = -1;
                pb0Var2 = null;
                obj2 = null;
                i9 = -1;
            } else {
                Object obj5 = lq0Var2.f52494b.f56449a;
                lq0Var2.f52493a.mo23973a(obj5, c5321b);
                int i14 = c5321b.f51851c;
                int mo23970a = lq0Var2.f52493a.mo23970a(obj5);
                i6 = intValue;
                z2 = z5;
                obj2 = obj5;
                obj = lq0Var2.f52493a.mo23974a(i14, this.f49936a, 0L).f51864a;
                pb0Var2 = this.f49936a.f51866c;
                i8 = i14;
                i9 = mo23970a;
            }
            if (i4 == 0) {
                if (lq0Var2.f52494b.m29735a()) {
                    bc0.C4858b c4858b = lq0Var2.f52494b;
                    j5 = c5321b.m26050a(c4858b.f56450b, c4858b.f56451c);
                    m25609a = m25609a(lq0Var2);
                } else if (lq0Var2.f52494b.f56453e != -1) {
                    j5 = m25609a(this.f51400X);
                    m25609a = j5;
                } else {
                    j3 = c5321b.f51853e;
                    j4 = c5321b.f51852d;
                    j5 = j3 + j4;
                    m25609a = j5;
                }
            } else if (lq0Var2.f52494b.m29735a()) {
                j5 = lq0Var2.f52510r;
                m25609a = m25609a(lq0Var2);
            } else {
                j3 = c5321b.f51853e;
                j4 = lq0Var2.f52510r;
                j5 = j3 + j4;
                m25609a = j5;
            }
            long m28119b = s91.m28119b(j5);
            long m28119b2 = s91.m28119b(m25609a);
            bc0.C4858b c4858b2 = lq0Var2.f52494b;
            rq0.C5707c c5707c = new rq0.C5707c(obj, i8, pb0Var2, obj2, i9, m28119b, m28119b2, c4858b2.f56450b, c4858b2.f56451c);
            int currentMediaItemIndex = getCurrentMediaItemIndex();
            if (this.f51400X.f52493a.m26043c()) {
                z3 = z8;
                obj3 = null;
                pb0Var3 = null;
                obj4 = null;
                i10 = -1;
            } else {
                lq0 lq0Var3 = this.f51400X;
                Object obj6 = lq0Var3.f52494b.f56449a;
                lq0Var3.f52493a.mo23973a(obj6, this.f51413l);
                z3 = z8;
                i10 = this.f51400X.f52493a.mo23970a(obj6);
                obj3 = this.f51400X.f52493a.mo23974a(currentMediaItemIndex, this.f49936a, 0L).f51864a;
                pb0Var3 = this.f49936a.f51866c;
                obj4 = obj6;
            }
            long m28119b3 = s91.m28119b(j2);
            long m28119b4 = this.f51400X.f52494b.m29735a() ? s91.m28119b(m25609a(this.f51400X)) : m28119b3;
            bc0.C4858b c4858b3 = this.f51400X.f52494b;
            this.f51411j.m24342a(11, new yo1(i4, c5707c, new rq0.C5707c(obj3, currentMediaItemIndex, pb0Var3, obj4, i10, m28119b3, m28119b4, c4858b3.f56450b, c4858b3.f56451c)));
        } else {
            i6 = intValue;
            z2 = z5;
            z3 = z8;
        }
        if (booleanValue) {
            final int i15 = i6;
            final int i16 = 2;
            this.f51411j.m24342a(1, new f80.InterfaceC5063a() { // from class: com.yandex.mobile.ads.impl.ap1
                @Override // com.yandex.mobile.ads.impl.f80.InterfaceC5063a
                public final void invoke(Object obj52) {
                    switch (i16) {
                        case 0:
                            C5246is.m25630a((lq0) pb0Var, i15, (rq0.InterfaceC5706b) obj52);
                            break;
                        case 1:
                            C5246is.m25640b((lq0) pb0Var, i15, (rq0.InterfaceC5706b) obj52);
                            break;
                        default:
                            ((rq0.InterfaceC5706b) obj52).mo23447a((pb0) pb0Var, i15);
                            break;
                    }
                }
            });
        }
        if (lq0Var2.f52498f != lq0Var.f52498f) {
            final int i17 = 3;
            this.f51411j.m24342a(10, new f80.InterfaceC5063a() { // from class: com.yandex.mobile.ads.impl.zo1
                @Override // com.yandex.mobile.ads.impl.f80.InterfaceC5063a
                public final void invoke(Object obj7) {
                    switch (i17) {
                        case 0:
                            C5246is.m25657g(lq0Var, (rq0.InterfaceC5706b) obj7);
                            break;
                        case 1:
                            C5246is.m25660h(lq0Var, (rq0.InterfaceC5706b) obj7);
                            break;
                        case 2:
                            C5246is.m25663i(lq0Var, (rq0.InterfaceC5706b) obj7);
                            break;
                        case 3:
                            C5246is.m25631a(lq0Var, (rq0.InterfaceC5706b) obj7);
                            break;
                        case 4:
                            C5246is.m25641b(lq0Var, (rq0.InterfaceC5706b) obj7);
                            break;
                        case 5:
                            C5246is.m25645c(lq0Var, (rq0.InterfaceC5706b) obj7);
                            break;
                        case 6:
                            C5246is.m25648d(lq0Var, (rq0.InterfaceC5706b) obj7);
                            break;
                        case 7:
                            C5246is.m25651e(lq0Var, (rq0.InterfaceC5706b) obj7);
                            break;
                        default:
                            C5246is.m25654f(lq0Var, (rq0.InterfaceC5706b) obj7);
                            break;
                    }
                }
            });
            if (lq0Var.f52498f != null) {
                final int i18 = 4;
                this.f51411j.m24342a(10, new f80.InterfaceC5063a() { // from class: com.yandex.mobile.ads.impl.zo1
                    @Override // com.yandex.mobile.ads.impl.f80.InterfaceC5063a
                    public final void invoke(Object obj7) {
                        switch (i18) {
                            case 0:
                                C5246is.m25657g(lq0Var, (rq0.InterfaceC5706b) obj7);
                                break;
                            case 1:
                                C5246is.m25660h(lq0Var, (rq0.InterfaceC5706b) obj7);
                                break;
                            case 2:
                                C5246is.m25663i(lq0Var, (rq0.InterfaceC5706b) obj7);
                                break;
                            case 3:
                                C5246is.m25631a(lq0Var, (rq0.InterfaceC5706b) obj7);
                                break;
                            case 4:
                                C5246is.m25641b(lq0Var, (rq0.InterfaceC5706b) obj7);
                                break;
                            case 5:
                                C5246is.m25645c(lq0Var, (rq0.InterfaceC5706b) obj7);
                                break;
                            case 6:
                                C5246is.m25648d(lq0Var, (rq0.InterfaceC5706b) obj7);
                                break;
                            case 7:
                                C5246is.m25651e(lq0Var, (rq0.InterfaceC5706b) obj7);
                                break;
                            default:
                                C5246is.m25654f(lq0Var, (rq0.InterfaceC5706b) obj7);
                                break;
                        }
                    }
                });
            }
        }
        e71 e71Var = lq0Var2.f52501i;
        e71 e71Var2 = lq0Var.f52501i;
        final int i19 = 5;
        if (e71Var != e71Var2) {
            this.f51408g.mo23826a(e71Var2.f49834e);
            i7 = 2;
            this.f51411j.m24342a(2, new f80.InterfaceC5063a() { // from class: com.yandex.mobile.ads.impl.zo1
                @Override // com.yandex.mobile.ads.impl.f80.InterfaceC5063a
                public final void invoke(Object obj7) {
                    switch (i19) {
                        case 0:
                            C5246is.m25657g(lq0Var, (rq0.InterfaceC5706b) obj7);
                            break;
                        case 1:
                            C5246is.m25660h(lq0Var, (rq0.InterfaceC5706b) obj7);
                            break;
                        case 2:
                            C5246is.m25663i(lq0Var, (rq0.InterfaceC5706b) obj7);
                            break;
                        case 3:
                            C5246is.m25631a(lq0Var, (rq0.InterfaceC5706b) obj7);
                            break;
                        case 4:
                            C5246is.m25641b(lq0Var, (rq0.InterfaceC5706b) obj7);
                            break;
                        case 5:
                            C5246is.m25645c(lq0Var, (rq0.InterfaceC5706b) obj7);
                            break;
                        case 6:
                            C5246is.m25648d(lq0Var, (rq0.InterfaceC5706b) obj7);
                            break;
                        case 7:
                            C5246is.m25651e(lq0Var, (rq0.InterfaceC5706b) obj7);
                            break;
                        default:
                            C5246is.m25654f(lq0Var, (rq0.InterfaceC5706b) obj7);
                            break;
                    }
                }
            });
        } else {
            i7 = 2;
        }
        if (z2) {
            this.f51411j.m24342a(14, new en1(this.f51384H, i7));
        }
        final int i20 = 6;
        if (z3) {
            this.f51411j.m24342a(3, new f80.InterfaceC5063a() { // from class: com.yandex.mobile.ads.impl.zo1
                @Override // com.yandex.mobile.ads.impl.f80.InterfaceC5063a
                public final void invoke(Object obj7) {
                    switch (i20) {
                        case 0:
                            C5246is.m25657g(lq0Var, (rq0.InterfaceC5706b) obj7);
                            break;
                        case 1:
                            C5246is.m25660h(lq0Var, (rq0.InterfaceC5706b) obj7);
                            break;
                        case 2:
                            C5246is.m25663i(lq0Var, (rq0.InterfaceC5706b) obj7);
                            break;
                        case 3:
                            C5246is.m25631a(lq0Var, (rq0.InterfaceC5706b) obj7);
                            break;
                        case 4:
                            C5246is.m25641b(lq0Var, (rq0.InterfaceC5706b) obj7);
                            break;
                        case 5:
                            C5246is.m25645c(lq0Var, (rq0.InterfaceC5706b) obj7);
                            break;
                        case 6:
                            C5246is.m25648d(lq0Var, (rq0.InterfaceC5706b) obj7);
                            break;
                        case 7:
                            C5246is.m25651e(lq0Var, (rq0.InterfaceC5706b) obj7);
                            break;
                        default:
                            C5246is.m25654f(lq0Var, (rq0.InterfaceC5706b) obj7);
                            break;
                    }
                }
            });
        }
        final int i21 = 7;
        if (z7 || z6) {
            this.f51411j.m24342a(-1, new f80.InterfaceC5063a() { // from class: com.yandex.mobile.ads.impl.zo1
                @Override // com.yandex.mobile.ads.impl.f80.InterfaceC5063a
                public final void invoke(Object obj7) {
                    switch (i21) {
                        case 0:
                            C5246is.m25657g(lq0Var, (rq0.InterfaceC5706b) obj7);
                            break;
                        case 1:
                            C5246is.m25660h(lq0Var, (rq0.InterfaceC5706b) obj7);
                            break;
                        case 2:
                            C5246is.m25663i(lq0Var, (rq0.InterfaceC5706b) obj7);
                            break;
                        case 3:
                            C5246is.m25631a(lq0Var, (rq0.InterfaceC5706b) obj7);
                            break;
                        case 4:
                            C5246is.m25641b(lq0Var, (rq0.InterfaceC5706b) obj7);
                            break;
                        case 5:
                            C5246is.m25645c(lq0Var, (rq0.InterfaceC5706b) obj7);
                            break;
                        case 6:
                            C5246is.m25648d(lq0Var, (rq0.InterfaceC5706b) obj7);
                            break;
                        case 7:
                            C5246is.m25651e(lq0Var, (rq0.InterfaceC5706b) obj7);
                            break;
                        default:
                            C5246is.m25654f(lq0Var, (rq0.InterfaceC5706b) obj7);
                            break;
                    }
                }
            });
        }
        if (z7) {
            final int i22 = 8;
            this.f51411j.m24342a(4, new f80.InterfaceC5063a() { // from class: com.yandex.mobile.ads.impl.zo1
                @Override // com.yandex.mobile.ads.impl.f80.InterfaceC5063a
                public final void invoke(Object obj7) {
                    switch (i22) {
                        case 0:
                            C5246is.m25657g(lq0Var, (rq0.InterfaceC5706b) obj7);
                            break;
                        case 1:
                            C5246is.m25660h(lq0Var, (rq0.InterfaceC5706b) obj7);
                            break;
                        case 2:
                            C5246is.m25663i(lq0Var, (rq0.InterfaceC5706b) obj7);
                            break;
                        case 3:
                            C5246is.m25631a(lq0Var, (rq0.InterfaceC5706b) obj7);
                            break;
                        case 4:
                            C5246is.m25641b(lq0Var, (rq0.InterfaceC5706b) obj7);
                            break;
                        case 5:
                            C5246is.m25645c(lq0Var, (rq0.InterfaceC5706b) obj7);
                            break;
                        case 6:
                            C5246is.m25648d(lq0Var, (rq0.InterfaceC5706b) obj7);
                            break;
                        case 7:
                            C5246is.m25651e(lq0Var, (rq0.InterfaceC5706b) obj7);
                            break;
                        default:
                            C5246is.m25654f(lq0Var, (rq0.InterfaceC5706b) obj7);
                            break;
                    }
                }
            });
        }
        if (z6) {
            final int i23 = 1;
            this.f51411j.m24342a(5, new f80.InterfaceC5063a() { // from class: com.yandex.mobile.ads.impl.ap1
                @Override // com.yandex.mobile.ads.impl.f80.InterfaceC5063a
                public final void invoke(Object obj52) {
                    switch (i23) {
                        case 0:
                            C5246is.m25630a((lq0) lq0Var, i3, (rq0.InterfaceC5706b) obj52);
                            break;
                        case 1:
                            C5246is.m25640b((lq0) lq0Var, i3, (rq0.InterfaceC5706b) obj52);
                            break;
                        default:
                            ((rq0.InterfaceC5706b) obj52).mo23447a((pb0) lq0Var, i3);
                            break;
                    }
                }
            });
        }
        if (lq0Var2.f52505m != lq0Var.f52505m) {
            final int i24 = 0;
            this.f51411j.m24342a(6, new f80.InterfaceC5063a() { // from class: com.yandex.mobile.ads.impl.zo1
                @Override // com.yandex.mobile.ads.impl.f80.InterfaceC5063a
                public final void invoke(Object obj7) {
                    switch (i24) {
                        case 0:
                            C5246is.m25657g(lq0Var, (rq0.InterfaceC5706b) obj7);
                            break;
                        case 1:
                            C5246is.m25660h(lq0Var, (rq0.InterfaceC5706b) obj7);
                            break;
                        case 2:
                            C5246is.m25663i(lq0Var, (rq0.InterfaceC5706b) obj7);
                            break;
                        case 3:
                            C5246is.m25631a(lq0Var, (rq0.InterfaceC5706b) obj7);
                            break;
                        case 4:
                            C5246is.m25641b(lq0Var, (rq0.InterfaceC5706b) obj7);
                            break;
                        case 5:
                            C5246is.m25645c(lq0Var, (rq0.InterfaceC5706b) obj7);
                            break;
                        case 6:
                            C5246is.m25648d(lq0Var, (rq0.InterfaceC5706b) obj7);
                            break;
                        case 7:
                            C5246is.m25651e(lq0Var, (rq0.InterfaceC5706b) obj7);
                            break;
                        default:
                            C5246is.m25654f(lq0Var, (rq0.InterfaceC5706b) obj7);
                            break;
                    }
                }
            });
        }
        if ((lq0Var2.f52497e == 3 && lq0Var2.f52504l && lq0Var2.f52505m == 0) != (lq0Var.f52497e == 3 && lq0Var.f52504l && lq0Var.f52505m == 0)) {
            final int i25 = 1;
            this.f51411j.m24342a(7, new f80.InterfaceC5063a() { // from class: com.yandex.mobile.ads.impl.zo1
                @Override // com.yandex.mobile.ads.impl.f80.InterfaceC5063a
                public final void invoke(Object obj7) {
                    switch (i25) {
                        case 0:
                            C5246is.m25657g(lq0Var, (rq0.InterfaceC5706b) obj7);
                            break;
                        case 1:
                            C5246is.m25660h(lq0Var, (rq0.InterfaceC5706b) obj7);
                            break;
                        case 2:
                            C5246is.m25663i(lq0Var, (rq0.InterfaceC5706b) obj7);
                            break;
                        case 3:
                            C5246is.m25631a(lq0Var, (rq0.InterfaceC5706b) obj7);
                            break;
                        case 4:
                            C5246is.m25641b(lq0Var, (rq0.InterfaceC5706b) obj7);
                            break;
                        case 5:
                            C5246is.m25645c(lq0Var, (rq0.InterfaceC5706b) obj7);
                            break;
                        case 6:
                            C5246is.m25648d(lq0Var, (rq0.InterfaceC5706b) obj7);
                            break;
                        case 7:
                            C5246is.m25651e(lq0Var, (rq0.InterfaceC5706b) obj7);
                            break;
                        default:
                            C5246is.m25654f(lq0Var, (rq0.InterfaceC5706b) obj7);
                            break;
                    }
                }
            });
        }
        if (!lq0Var2.f52506n.equals(lq0Var.f52506n)) {
            final int i26 = 2;
            this.f51411j.m24342a(12, new f80.InterfaceC5063a() { // from class: com.yandex.mobile.ads.impl.zo1
                @Override // com.yandex.mobile.ads.impl.f80.InterfaceC5063a
                public final void invoke(Object obj7) {
                    switch (i26) {
                        case 0:
                            C5246is.m25657g(lq0Var, (rq0.InterfaceC5706b) obj7);
                            break;
                        case 1:
                            C5246is.m25660h(lq0Var, (rq0.InterfaceC5706b) obj7);
                            break;
                        case 2:
                            C5246is.m25663i(lq0Var, (rq0.InterfaceC5706b) obj7);
                            break;
                        case 3:
                            C5246is.m25631a(lq0Var, (rq0.InterfaceC5706b) obj7);
                            break;
                        case 4:
                            C5246is.m25641b(lq0Var, (rq0.InterfaceC5706b) obj7);
                            break;
                        case 5:
                            C5246is.m25645c(lq0Var, (rq0.InterfaceC5706b) obj7);
                            break;
                        case 6:
                            C5246is.m25648d(lq0Var, (rq0.InterfaceC5706b) obj7);
                            break;
                        case 7:
                            C5246is.m25651e(lq0Var, (rq0.InterfaceC5706b) obj7);
                            break;
                        default:
                            C5246is.m25654f(lq0Var, (rq0.InterfaceC5706b) obj7);
                            break;
                    }
                }
            });
        }
        m25658h();
        this.f51411j.m24341a();
        if (lq0Var2.f52507o != lq0Var.f52507o) {
            Iterator<InterfaceC5090fs.a> it = this.f51412k.iterator();
            while (it.hasNext()) {
                it.next().mo24728a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m25630a(lq0 lq0Var, int i2, rq0.InterfaceC5706b interfaceC5706b) {
        k61 k61Var = lq0Var.f52493a;
        interfaceC5706b.mo23439a(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m25618a(int i2, rq0.C5707c c5707c, rq0.C5707c c5707c2, rq0.InterfaceC5706b interfaceC5706b) {
        interfaceC5706b.mo23474c();
        interfaceC5706b.mo23452a(c5707c, c5707c2, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m25631a(lq0 lq0Var, rq0.InterfaceC5706b interfaceC5706b) {
        interfaceC5706b.mo23444a(lq0Var.f52498f);
    }

    /* renamed from: a */
    private static long m25609a(lq0 lq0Var) {
        k61.C5323d c5323d = new k61.C5323d();
        k61.C5321b c5321b = new k61.C5321b();
        lq0Var.f52493a.mo23973a(lq0Var.f52494b.f56449a, c5321b);
        long j2 = lq0Var.f52495c;
        if (j2 == -9223372036854775807L) {
            return lq0Var.f52493a.mo23974a(c5321b.f51851c, c5323d, 0L).f51876m;
        }
        return c5321b.f51853e + j2;
    }

    /* renamed from: a */
    private lq0 m25611a(lq0 lq0Var, k61 k61Var, @Nullable Pair<Object, Long> pair) {
        bc0.C4858b c4858b;
        e71 e71Var;
        lq0 m26522a;
        long j2;
        C5220ia.m25473a(k61Var.m26043c() || pair != null);
        k61 k61Var2 = lq0Var.f52493a;
        lq0 m26524a = lq0Var.m26524a(k61Var);
        if (k61Var.m26043c()) {
            bc0.C4858b m26518a = lq0.m26518a();
            long m28096a = s91.m28096a(this.f51402Z);
            lq0 m26521a = m26524a.m26522a(m26518a, m28096a, m28096a, m28096a, 0L, x61.f56383d, this.f51403b, AbstractC4698p.m22055i()).m26521a(m26518a);
            m26521a.f52508p = m26521a.f52510r;
            return m26521a;
        }
        Object obj = m26524a.f52494b.f56449a;
        int i2 = s91.f54530a;
        boolean z = !obj.equals(pair.first);
        bc0.C4858b c4858b2 = z ? new bc0.C4858b(pair.first) : m26524a.f52494b;
        long longValue = ((Long) pair.second).longValue();
        long m28096a2 = s91.m28096a(getContentPosition());
        if (!k61Var2.m26043c()) {
            m28096a2 -= k61Var2.mo23973a(obj, this.f51413l).f51853e;
        }
        if (z || longValue < m28096a2) {
            C5220ia.m25476b(!c4858b2.m29735a());
            x61 x61Var = z ? x61.f56383d : m26524a.f52500h;
            if (z) {
                c4858b = c4858b2;
                e71Var = this.f51403b;
            } else {
                c4858b = c4858b2;
                e71Var = m26524a.f52501i;
            }
            lq0 m26521a2 = m26524a.m26522a(c4858b, longValue, longValue, longValue, 0L, x61Var, e71Var, z ? AbstractC4698p.m22055i() : m26524a.f52502j).m26521a(c4858b);
            m26521a2.f52508p = longValue;
            return m26521a2;
        }
        if (longValue == m28096a2) {
            int mo23970a = k61Var.mo23970a(m26524a.f52503k.f56449a);
            if (mo23970a != -1 && k61Var.mo23972a(mo23970a, this.f51413l, false).f51851c == k61Var.mo23973a(c4858b2.f56449a, this.f51413l).f51851c) {
                return m26524a;
            }
            k61Var.mo23973a(c4858b2.f56449a, this.f51413l);
            if (c4858b2.m29735a()) {
                j2 = this.f51413l.m26050a(c4858b2.f56450b, c4858b2.f56451c);
            } else {
                j2 = this.f51413l.f51852d;
            }
            m26522a = m26524a.m26522a(c4858b2, m26524a.f52510r, m26524a.f52510r, m26524a.f52496d, j2 - m26524a.f52510r, m26524a.f52500h, m26524a.f52501i, m26524a.f52502j).m26521a(c4858b2);
            m26522a.f52508p = j2;
        } else {
            C5220ia.m25476b(!c4858b2.m29735a());
            long max = Math.max(0L, m26524a.f52509q - (longValue - m28096a2));
            long j3 = m26524a.f52508p;
            if (m26524a.f52503k.equals(m26524a.f52494b)) {
                j3 = longValue + max;
            }
            m26522a = m26524a.m26522a(c4858b2, longValue, longValue, longValue, max, m26524a.f52500h, m26524a.f52501i, m26524a.f52502j);
            m26522a.f52508p = j3;
        }
        return m26522a;
    }

    @Nullable
    /* renamed from: a */
    private Pair<Object, Long> m25610a(k61 k61Var, int i2, long j2) {
        if (k61Var.m26043c()) {
            this.f51401Y = i2;
            if (j2 == -9223372036854775807L) {
                j2 = 0;
            }
            this.f51402Z = j2;
            return null;
        }
        if (i2 == -1 || i2 >= k61Var.mo25935b()) {
            i2 = k61Var.mo23971a(false);
            j2 = s91.m28119b(k61Var.mo23974a(i2, this.f49936a, 0L).f51876m);
        }
        return k61Var.m26041a(this.f49936a, this.f51413l, i2, s91.m28096a(j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m25619a(@Nullable Surface surface) {
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (cv0 cv0Var : this.f51407f) {
            if (cv0Var.mo23533m() == 2) {
                int m25642c = m25642c();
                C5354ks c5354ks = this.f51410i;
                arrayList.add(new vq0(c5354ks, cv0Var, this.f51400X.f52493a, m25642c == -1 ? 0 : m25642c, this.f51420s, c5354ks.m26239d()).m29252a(1).m29253a(surface).m29259e());
            }
        }
        Object obj = this.f51386J;
        if (obj != null && obj != surface) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((vq0) it.next()).m29254a(this.f51427z);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z = true;
            }
            Object obj2 = this.f51386J;
            Surface surface2 = this.f51387K;
            if (obj2 == surface2) {
                surface2.release();
                this.f51387K = null;
            }
        }
        this.f51386J = surface;
        if (z) {
            m25620a(C5043es.m24247a(new C5881us(3), 1003));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m25614a(final int i2, final int i3) {
        if (i2 == this.f51390N && i3 == this.f51391O) {
            return;
        }
        this.f51390N = i2;
        this.f51391O = i3;
        f80<rq0.InterfaceC5706b> f80Var = this.f51411j;
        f80Var.m24342a(24, new f80.InterfaceC5063a() { // from class: com.yandex.mobile.ads.impl.cp1
            @Override // com.yandex.mobile.ads.impl.f80.InterfaceC5063a
            public final void invoke(Object obj) {
                ((rq0.InterfaceC5706b) obj).onSurfaceSizeChanged(i2, i3);
            }
        });
        f80Var.m24341a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m25617a(int i2, int i3, boolean z) {
        int i4 = 0;
        boolean z2 = z && i2 != -1;
        if (z2 && i2 != 1) {
            i4 = 1;
        }
        lq0 lq0Var = this.f51400X;
        if (lq0Var.f52504l == z2 && lq0Var.f52505m == i4) {
            return;
        }
        this.f51377A++;
        lq0 lq0Var2 = new lq0(lq0Var.f52493a, lq0Var.f52494b, lq0Var.f52495c, lq0Var.f52496d, lq0Var.f52497e, lq0Var.f52498f, lq0Var.f52499g, lq0Var.f52500h, lq0Var.f52501i, lq0Var.f52502j, lq0Var.f52503k, z2, i4, lq0Var.f52506n, lq0Var.f52508p, lq0Var.f52509q, lq0Var.f52510r, lq0Var.f52507o);
        this.f51410i.m26237a(z2, i4);
        m25629a(lq0Var2, 0, i3, false, 5, -9223372036854775807L);
    }

    /* renamed from: a */
    private void m25616a(int i2, int i3, @Nullable Object obj) {
        for (cv0 cv0Var : this.f51407f) {
            if (cv0Var.mo23533m() == i2) {
                int m25642c = m25642c();
                C5354ks c5354ks = this.f51410i;
                new vq0(c5354ks, cv0Var, this.f51400X.f52493a, m25642c == -1 ? 0 : m25642c, this.f51420s, c5354ks.m26239d()).m29252a(i3).m29253a(obj).m29259e();
            }
        }
    }
}
