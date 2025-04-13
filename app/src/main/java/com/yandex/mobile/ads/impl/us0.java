package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.exo.drm.InterfaceC4719f;
import com.yandex.mobile.ads.exo.drm.InterfaceC4720g;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.exo.metadata.icy.IcyHeaders;
import com.yandex.mobile.ads.impl.C5192hm;
import com.yandex.mobile.ads.impl.C5606pv;
import com.yandex.mobile.ads.impl.b10;
import com.yandex.mobile.ads.impl.cc0;
import com.yandex.mobile.ads.impl.e01;
import com.yandex.mobile.ads.impl.l80;
import com.yandex.mobile.ads.impl.ty0;
import com.yandex.mobile.ads.impl.vb0;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* loaded from: classes3.dex */
final class us0 implements vb0, InterfaceC5509nt, l80.InterfaceC5382a<C5882a>, l80.InterfaceC5386e, ty0.InterfaceC5827c {

    /* renamed from: N */
    private static final Map<String, String> f55621N;

    /* renamed from: O */
    private static final C5606pv f55622O;

    /* renamed from: B */
    private boolean f55624B;

    /* renamed from: D */
    private boolean f55626D;

    /* renamed from: E */
    private boolean f55627E;

    /* renamed from: F */
    private int f55628F;

    /* renamed from: G */
    private boolean f55629G;

    /* renamed from: H */
    private long f55630H;

    /* renamed from: J */
    private boolean f55632J;

    /* renamed from: K */
    private int f55633K;

    /* renamed from: L */
    private boolean f55634L;

    /* renamed from: M */
    private boolean f55635M;

    /* renamed from: b */
    private final Uri f55636b;

    /* renamed from: c */
    private final InterfaceC4978dm f55637c;

    /* renamed from: d */
    private final InterfaceC4720g f55638d;

    /* renamed from: e */
    private final i80 f55639e;

    /* renamed from: f */
    private final cc0.C4914a f55640f;

    /* renamed from: g */
    private final InterfaceC4719f.a f55641g;

    /* renamed from: h */
    private final InterfaceC5883b f55642h;

    /* renamed from: i */
    private final InterfaceC5476n8 f55643i;

    /* renamed from: j */
    @Nullable
    private final String f55644j;

    /* renamed from: k */
    private final long f55645k;

    /* renamed from: m */
    private final ts0 f55647m;

    /* renamed from: r */
    @Nullable
    private vb0.InterfaceC5910a f55652r;

    /* renamed from: s */
    @Nullable
    private IcyHeaders f55653s;

    /* renamed from: v */
    private boolean f55656v;

    /* renamed from: w */
    private boolean f55657w;

    /* renamed from: x */
    private boolean f55658x;

    /* renamed from: y */
    private C5886e f55659y;

    /* renamed from: z */
    private e01 f55660z;

    /* renamed from: l */
    private final l80 f55646l = new l80("ProgressiveMediaPeriod");

    /* renamed from: n */
    private final C4813ak f55648n = new C4813ak();

    /* renamed from: o */
    private final Runnable f55649o = new iq1(this, 1);

    /* renamed from: p */
    private final Runnable f55650p = new iq1(this, 2);

    /* renamed from: q */
    private final Handler f55651q = s91.m28098a();

    /* renamed from: u */
    private C5885d[] f55655u = new C5885d[0];

    /* renamed from: t */
    private ty0[] f55654t = new ty0[0];

    /* renamed from: I */
    private long f55631I = -9223372036854775807L;

    /* renamed from: A */
    private long f55623A = -9223372036854775807L;

    /* renamed from: C */
    private int f55625C = 1;

    /* renamed from: com.yandex.mobile.ads.impl.us0$a */
    public final class C5882a implements l80.InterfaceC5385d, b10.InterfaceC4837a {

        /* renamed from: b */
        private final Uri f55662b;

        /* renamed from: c */
        private final d41 f55663c;

        /* renamed from: d */
        private final ts0 f55664d;

        /* renamed from: e */
        private final InterfaceC5509nt f55665e;

        /* renamed from: f */
        private final C4813ak f55666f;

        /* renamed from: h */
        private volatile boolean f55668h;

        /* renamed from: j */
        private long f55670j;

        /* renamed from: l */
        @Nullable
        private ty0 f55672l;

        /* renamed from: m */
        private boolean f55673m;

        /* renamed from: g */
        private final qr0 f55667g = new qr0();

        /* renamed from: i */
        private boolean f55669i = true;

        /* renamed from: a */
        private final long f55661a = j80.m25816a();

        /* renamed from: k */
        private C5192hm f55671k = m29130a(0);

        public C5882a(Uri uri, InterfaceC4978dm interfaceC4978dm, ts0 ts0Var, InterfaceC5509nt interfaceC5509nt, C4813ak c4813ak) {
            this.f55662b = uri;
            this.f55663c = new d41(interfaceC4978dm);
            this.f55664d = ts0Var;
            this.f55665e = interfaceC5509nt;
            this.f55666f = c4813ak;
        }

        @Override // com.yandex.mobile.ads.impl.l80.InterfaceC5385d
        /* renamed from: a */
        public final void mo26381a() throws IOException {
            int i2 = 0;
            while (i2 == 0 && !this.f55668h) {
                try {
                    long j2 = this.f55667g.f54129a;
                    C5192hm m29130a = m29130a(j2);
                    this.f55671k = m29130a;
                    long mo22487a = this.f55663c.mo22487a(m29130a);
                    if (mo22487a != -1) {
                        mo22487a += j2;
                        us0.this.m29119j();
                    }
                    long j3 = mo22487a;
                    us0.this.f55653s = IcyHeaders.m22253a(this.f55663c.mo22489b());
                    InterfaceC4978dm interfaceC4978dm = this.f55663c;
                    if (us0.this.f55653s != null && us0.this.f55653s.f48084f != -1) {
                        interfaceC4978dm = new b10(this.f55663c, us0.this.f55653s.f48084f, this);
                        ty0 m29126f = us0.this.m29126f();
                        this.f55672l = m29126f;
                        m29126f.mo28347a(us0.f55622O);
                    }
                    InterfaceC4978dm interfaceC4978dm2 = interfaceC4978dm;
                    long j4 = j2;
                    ((C5687rf) this.f55664d).m27916a(interfaceC4978dm2, this.f55662b, this.f55663c.mo22489b(), j2, j3, this.f55665e);
                    if (us0.this.f55653s != null) {
                        ((C5687rf) this.f55664d).m27914a();
                    }
                    if (this.f55669i) {
                        ((C5687rf) this.f55664d).m27915a(j4, this.f55670j);
                        this.f55669i = false;
                    }
                    while (true) {
                        long j5 = j4;
                        while (i2 == 0 && !this.f55668h) {
                            try {
                                this.f55666f.m22531a();
                                i2 = ((C5687rf) this.f55664d).m27913a(this.f55667g);
                                j4 = ((C5687rf) this.f55664d).m27917b();
                                if (j4 > us0.this.f55645k + j5) {
                                    break;
                                }
                            } catch (InterruptedException unused) {
                                throw new InterruptedIOException();
                            }
                        }
                        this.f55666f.m22534c();
                        us0.this.f55651q.post(us0.this.f55650p);
                    }
                    if (i2 == 1) {
                        i2 = 0;
                    } else if (((C5687rf) this.f55664d).m27917b() != -1) {
                        this.f55667g.f54129a = ((C5687rf) this.f55664d).m27917b();
                    }
                    C5137gm.m24939a(this.f55663c);
                } catch (Throwable th) {
                    if (i2 != 1 && ((C5687rf) this.f55664d).m27917b() != -1) {
                        this.f55667g.f54129a = ((C5687rf) this.f55664d).m27917b();
                    }
                    C5137gm.m24939a(this.f55663c);
                    throw th;
                }
            }
        }

        @Override // com.yandex.mobile.ads.impl.l80.InterfaceC5385d
        /* renamed from: b */
        public final void mo26382b() {
            this.f55668h = true;
        }

        /* renamed from: a */
        public final void m29135a(ap0 ap0Var) {
            long max;
            if (!this.f55673m) {
                max = this.f55670j;
            } else {
                max = Math.max(us0.m29106c(us0.this), this.f55670j);
            }
            int m22579a = ap0Var.m22579a();
            ty0 ty0Var = this.f55672l;
            Objects.requireNonNull(ty0Var);
            ty0Var.mo28349b(m22579a, ap0Var);
            ty0Var.mo28346a(max, 1, m22579a, 0, null);
            this.f55673m = true;
        }

        /* renamed from: a */
        private C5192hm m29130a(long j2) {
            return new C5192hm.a().m25240a(this.f55662b).m25246b(j2).m25241a(us0.this.f55644j).m25238a(6).m25242a(us0.f55621N).m25244a();
        }

        /* renamed from: a */
        public static void m29131a(C5882a c5882a, long j2, long j3) {
            c5882a.f55667g.f54129a = j2;
            c5882a.f55670j = j3;
            c5882a.f55669i = true;
            c5882a.f55673m = false;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.us0$b */
    public interface InterfaceC5883b {
    }

    /* renamed from: com.yandex.mobile.ads.impl.us0$c */
    public final class C5884c implements uy0 {

        /* renamed from: a */
        private final int f55675a;

        public C5884c(int i2) {
            this.f55675a = i2;
        }

        @Override // com.yandex.mobile.ads.impl.uy0
        /* renamed from: d */
        public final boolean mo23275d() {
            return us0.this.m29124a(this.f55675a);
        }

        @Override // com.yandex.mobile.ads.impl.uy0
        /* renamed from: a */
        public final void mo23273a() throws IOException {
            us0.this.m29125c(this.f55675a);
        }

        @Override // com.yandex.mobile.ads.impl.uy0
        /* renamed from: a */
        public final int mo23272a(C5658qv c5658qv, C5752sm c5752sm, int i2) {
            return us0.this.m29123a(this.f55675a, c5658qv, c5752sm, i2);
        }

        @Override // com.yandex.mobile.ads.impl.uy0
        /* renamed from: a */
        public final int mo23271a(long j2) {
            return us0.this.m29122a(this.f55675a, j2);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.us0$d */
    public static final class C5885d {

        /* renamed from: a */
        public final int f55677a;

        /* renamed from: b */
        public final boolean f55678b;

        public C5885d(boolean z, int i2) {
            this.f55677a = i2;
            this.f55678b = z;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C5885d.class != obj.getClass()) {
                return false;
            }
            C5885d c5885d = (C5885d) obj;
            return this.f55677a == c5885d.f55677a && this.f55678b == c5885d.f55678b;
        }

        public final int hashCode() {
            return (this.f55677a * 31) + (this.f55678b ? 1 : 0);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.us0$e */
    public static final class C5886e {

        /* renamed from: a */
        public final x61 f55679a;

        /* renamed from: b */
        public final boolean[] f55680b;

        /* renamed from: c */
        public final boolean[] f55681c;

        /* renamed from: d */
        public final boolean[] f55682d;

        public C5886e(x61 x61Var, boolean[] zArr) {
            this.f55679a = x61Var;
            this.f55680b = zArr;
            int i2 = x61Var.f56385a;
            this.f55681c = new boolean[i2];
            this.f55682d = new boolean[i2];
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        f55621N = Collections.unmodifiableMap(hashMap);
        f55622O = new C5606pv.a().m27555c("icy").m27561f("application/x-icy").m27550a();
    }

    public us0(Uri uri, InterfaceC4978dm interfaceC4978dm, ts0 ts0Var, InterfaceC4720g interfaceC4720g, InterfaceC4719f.a aVar, i80 i80Var, cc0.C4914a c4914a, InterfaceC5883b interfaceC5883b, InterfaceC5476n8 interfaceC5476n8, @Nullable String str, int i2) {
        this.f55636b = uri;
        this.f55637c = interfaceC4978dm;
        this.f55638d = interfaceC4720g;
        this.f55641g = aVar;
        this.f55639e = i80Var;
        this.f55640f = c4914a;
        this.f55642h = interfaceC5883b;
        this.f55643i = interfaceC5476n8;
        this.f55644j = str;
        this.f55645k = i2;
        this.f55647m = ts0Var;
    }

    /* renamed from: c */
    public static /* synthetic */ long m29106c(us0 us0Var) {
        return us0Var.m29098a(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m29115h() {
        this.f55629G = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public void m29117i() {
        if (this.f55635M || this.f55657w || !this.f55656v || this.f55660z == null) {
            return;
        }
        for (ty0 ty0Var : this.f55654t) {
            if (ty0Var.m28785d() == null) {
                return;
            }
        }
        this.f55648n.m22534c();
        int length = this.f55654t.length;
        w61[] w61VarArr = new w61[length];
        boolean[] zArr = new boolean[length];
        for (int i2 = 0; i2 < length; i2++) {
            C5606pv m28785d = this.f55654t[i2].m28785d();
            Objects.requireNonNull(m28785d);
            String str = m28785d.f53820l;
            boolean m25142b = he0.m25142b(str);
            boolean z = m25142b || he0.m25144d(str);
            zArr[i2] = z;
            this.f55658x = z | this.f55658x;
            IcyHeaders icyHeaders = this.f55653s;
            if (icyHeaders != null) {
                if (m25142b || this.f55655u[i2].f55678b) {
                    Metadata metadata = m28785d.f53818j;
                    m28785d = m28785d.m27508a().m27545a(metadata == null ? new Metadata(icyHeaders) : metadata.m22236a(icyHeaders)).m27550a();
                }
                if (m25142b && m28785d.f53814f == -1 && m28785d.f53815g == -1 && icyHeaders.f48079a != -1) {
                    m28785d = m28785d.m27508a().m27552b(icyHeaders.f48079a).m27550a();
                }
            }
            w61VarArr[i2] = new w61(Integer.toString(i2), m28785d.m27508a().m27556d(this.f55638d.mo22135a(m28785d)).m27550a());
        }
        this.f55659y = new C5886e(new x61(w61VarArr), zArr);
        this.f55657w = true;
        vb0.InterfaceC5910a interfaceC5910a = this.f55652r;
        Objects.requireNonNull(interfaceC5910a);
        interfaceC5910a.mo29210a((vb0) this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public void m29119j() {
        this.f55651q.post(new iq1(this, 0));
    }

    /* renamed from: m */
    private void m29121m() {
        C5882a c5882a = new C5882a(this.f55636b, this.f55637c, this.f55647m, this, this.f55648n);
        if (this.f55657w) {
            C5220ia.m25476b(this.f55631I != -9223372036854775807L);
            long j2 = this.f55623A;
            if (j2 != -9223372036854775807L && this.f55631I > j2) {
                this.f55634L = true;
                this.f55631I = -9223372036854775807L;
                return;
            }
            e01 e01Var = this.f55660z;
            Objects.requireNonNull(e01Var);
            C5882a.m29131a(c5882a, e01Var.mo22565b(this.f55631I).f49774a.f50469b, this.f55631I);
            for (ty0 ty0Var : this.f55654t) {
                ty0Var.m28777a(this.f55631I);
            }
            this.f55631I = -9223372036854775807L;
        }
        int i2 = 0;
        for (ty0 ty0Var2 : this.f55654t) {
            i2 += ty0Var2.m28787e();
        }
        this.f55633K = i2;
        this.f55640f.m23216b(new j80(c5882a.f55661a, c5882a.f55671k, this.f55646l.m26365a(c5882a, this, this.f55639e.mo25458a(this.f55625C))), null, c5882a.f55670j, this.f55623A);
    }

    @Override // com.yandex.mobile.ads.impl.vb0
    public final boolean continueLoading(long j2) {
        if (this.f55634L || this.f55646l.m26370c() || this.f55632J) {
            return false;
        }
        if (this.f55657w && this.f55628F == 0) {
            return false;
        }
        boolean m22536e = this.f55648n.m22536e();
        if (this.f55646l.m26371d()) {
            return m22536e;
        }
        m29121m();
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.vb0
    public final void discardBuffer(long j2, boolean z) {
        m29110e();
        if (this.f55631I != -9223372036854775807L) {
            return;
        }
        boolean[] zArr = this.f55659y.f55681c;
        int length = this.f55654t.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.f55654t[i2].m28778a(j2, z, zArr[i2]);
        }
    }

    @Override // com.yandex.mobile.ads.impl.vb0
    public final long getBufferedPositionUs() {
        long j2;
        m29110e();
        if (this.f55634L || this.f55628F == 0) {
            return Long.MIN_VALUE;
        }
        long j3 = this.f55631I;
        if (j3 != -9223372036854775807L) {
            return j3;
        }
        if (this.f55658x) {
            int length = this.f55654t.length;
            j2 = Long.MAX_VALUE;
            for (int i2 = 0; i2 < length; i2++) {
                C5886e c5886e = this.f55659y;
                if (c5886e.f55680b[i2] && c5886e.f55681c[i2] && !this.f55654t[i2].m28788f()) {
                    j2 = Math.min(j2, this.f55654t[i2].m28781b());
                }
            }
        } else {
            j2 = Long.MAX_VALUE;
        }
        if (j2 == Long.MAX_VALUE) {
            j2 = m29098a(false);
        }
        return j2 == Long.MIN_VALUE ? this.f55630H : j2;
    }

    @Override // com.yandex.mobile.ads.impl.vb0
    public final long getNextLoadPositionUs() {
        return getBufferedPositionUs();
    }

    @Override // com.yandex.mobile.ads.impl.vb0
    public final x61 getTrackGroups() {
        m29110e();
        return this.f55659y.f55679a;
    }

    @Override // com.yandex.mobile.ads.impl.vb0
    public final boolean isLoading() {
        return this.f55646l.m26371d() && this.f55648n.m22535d();
    }

    /* renamed from: k */
    public final void m29127k() {
        this.f55651q.post(this.f55649o);
    }

    /* renamed from: l */
    public final void m29128l() {
        if (this.f55657w) {
            for (ty0 ty0Var : this.f55654t) {
                ty0Var.m28790h();
            }
        }
        this.f55646l.m26368a(this);
        this.f55651q.removeCallbacksAndMessages(null);
        this.f55652r = null;
        this.f55635M = true;
    }

    @Override // com.yandex.mobile.ads.impl.vb0
    public final void maybeThrowPrepareError() throws IOException {
        this.f55646l.m26367a(this.f55639e.mo25458a(this.f55625C));
        if (this.f55634L && !this.f55657w) {
            throw ep0.m24225a("Loading finished before preparation is complete.", (Exception) null);
        }
    }

    @Override // com.yandex.mobile.ads.impl.vb0
    public final long readDiscontinuity() {
        if (!this.f55627E) {
            return -9223372036854775807L;
        }
        if (!this.f55634L) {
            int i2 = 0;
            for (ty0 ty0Var : this.f55654t) {
                i2 += ty0Var.m28787e();
            }
            if (i2 <= this.f55633K) {
                return -9223372036854775807L;
            }
        }
        this.f55627E = false;
        return this.f55630H;
    }

    @Override // com.yandex.mobile.ads.impl.vb0
    public final void reevaluateBuffer(long j2) {
    }

    @Override // com.yandex.mobile.ads.impl.vb0
    public final long seekToUs(long j2) {
        m29110e();
        boolean[] zArr = this.f55659y.f55680b;
        if (!this.f55660z.mo22566b()) {
            j2 = 0;
        }
        this.f55627E = false;
        this.f55630H = j2;
        boolean z = true;
        if (this.f55631I != -9223372036854775807L) {
            this.f55631I = j2;
            return j2;
        }
        if (this.f55625C != 7) {
            int length = this.f55654t.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (!this.f55654t[i2].m28783b(j2, false) && (zArr[i2] || !this.f55658x)) {
                    z = false;
                    break;
                }
            }
            if (z) {
                return j2;
            }
        }
        this.f55632J = false;
        this.f55631I = j2;
        this.f55634L = false;
        if (this.f55646l.m26371d()) {
            for (ty0 ty0Var : this.f55654t) {
                ty0Var.m28776a();
            }
            this.f55646l.m26366a();
        } else {
            this.f55646l.m26369b();
            for (ty0 ty0Var2 : this.f55654t) {
                ty0Var2.m28782b(false);
            }
        }
        return j2;
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    /* renamed from: e */
    private void m29110e() {
        C5220ia.m25476b(this.f55657w);
        Objects.requireNonNull(this.f55659y);
        Objects.requireNonNull(this.f55660z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public void m29114g() {
        if (this.f55635M) {
            return;
        }
        vb0.InterfaceC5910a interfaceC5910a = this.f55652r;
        Objects.requireNonNull(interfaceC5910a);
        interfaceC5910a.mo23268a((vb0.InterfaceC5910a) this);
    }

    @Override // com.yandex.mobile.ads.impl.l80.InterfaceC5386e
    /* renamed from: b */
    public final void mo26383b() {
        for (ty0 ty0Var : this.f55654t) {
            ty0Var.m28791i();
        }
        ((C5687rf) this.f55647m).m27918c();
    }

    /* renamed from: f */
    public final ty0 m29126f() {
        return m29099a(new C5885d(true, 0));
    }

    @Override // com.yandex.mobile.ads.impl.l80.InterfaceC5382a
    /* renamed from: a */
    public final void mo26374a(C5882a c5882a, long j2, long j3, boolean z) {
        C5882a c5882a2 = c5882a;
        d41 d41Var = c5882a2.f55663c;
        long unused = c5882a2.f55661a;
        C5192hm unused2 = c5882a2.f55671k;
        Objects.requireNonNull(d41Var);
        j80 j80Var = new j80();
        i80 i80Var = this.f55639e;
        long unused3 = c5882a2.f55661a;
        Objects.requireNonNull(i80Var);
        this.f55640f.m23211a(j80Var, c5882a2.f55670j, this.f55623A);
        if (z) {
            return;
        }
        for (ty0 ty0Var : this.f55654t) {
            ty0Var.m28782b(false);
        }
        if (this.f55628F > 0) {
            vb0.InterfaceC5910a interfaceC5910a = this.f55652r;
            Objects.requireNonNull(interfaceC5910a);
            interfaceC5910a.mo23268a((vb0.InterfaceC5910a) this);
        }
    }

    /* renamed from: c */
    public final void m29125c(int i2) throws IOException {
        this.f55654t[i2].m28789g();
        this.f55646l.m26367a(this.f55639e.mo25458a(this.f55625C));
    }

    /* renamed from: b */
    private void m29104b(int i2) {
        m29110e();
        boolean[] zArr = this.f55659y.f55680b;
        if (this.f55632J && zArr[i2] && !this.f55654t[i2].m28780a(false)) {
            this.f55631I = 0L;
            this.f55632J = false;
            this.f55627E = true;
            this.f55630H = 0L;
            this.f55633K = 0;
            for (ty0 ty0Var : this.f55654t) {
                ty0Var.m28782b(false);
            }
            vb0.InterfaceC5910a interfaceC5910a = this.f55652r;
            Objects.requireNonNull(interfaceC5910a);
            interfaceC5910a.mo23268a((vb0.InterfaceC5910a) this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m29105b(e01 e01Var) {
        this.f55660z = this.f55653s == null ? e01Var : new e01.C4998b(-9223372036854775807L, 0L);
        this.f55623A = e01Var.mo22567c();
        boolean z = !this.f55629G && e01Var.mo22567c() == -9223372036854775807L;
        this.f55624B = z;
        this.f55625C = z ? 7 : 1;
        ((ws0) this.f55642h).m29559a(this.f55623A, e01Var.mo22566b(), this.f55624B);
        if (this.f55657w) {
            return;
        }
        m29117i();
    }

    @Override // com.yandex.mobile.ads.impl.l80.InterfaceC5382a
    /* renamed from: a */
    public final void mo26373a(C5882a c5882a, long j2, long j3) {
        e01 e01Var;
        C5882a c5882a2 = c5882a;
        if (this.f55623A == -9223372036854775807L && (e01Var = this.f55660z) != null) {
            boolean mo22566b = e01Var.mo22566b();
            long m29098a = m29098a(true);
            long j4 = m29098a == Long.MIN_VALUE ? 0L : m29098a + 10000;
            this.f55623A = j4;
            ((ws0) this.f55642h).m29559a(j4, mo22566b, this.f55624B);
        }
        d41 d41Var = c5882a2.f55663c;
        long unused = c5882a2.f55661a;
        C5192hm unused2 = c5882a2.f55671k;
        Objects.requireNonNull(d41Var);
        j80 j80Var = new j80();
        i80 i80Var = this.f55639e;
        long unused3 = c5882a2.f55661a;
        Objects.requireNonNull(i80Var);
        this.f55640f.m23212a(j80Var, (C5606pv) null, c5882a2.f55670j, this.f55623A);
        this.f55634L = true;
        vb0.InterfaceC5910a interfaceC5910a = this.f55652r;
        Objects.requireNonNull(interfaceC5910a);
        interfaceC5910a.mo23268a((vb0.InterfaceC5910a) this);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ab  */
    @Override // com.yandex.mobile.ads.impl.l80.InterfaceC5382a
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.yandex.mobile.ads.impl.l80.C5383b mo26372a(com.yandex.mobile.ads.impl.us0.C5882a r17, long r18, long r20, java.io.IOException r22, int r23) {
        /*
            Method dump skipped, instructions count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.us0.mo26372a(com.yandex.mobile.ads.impl.l80$d, long, long, java.io.IOException, int):com.yandex.mobile.ads.impl.l80$b");
    }

    @Override // com.yandex.mobile.ads.impl.vb0
    /* renamed from: a */
    public final void mo23269a(vb0.InterfaceC5910a interfaceC5910a, long j2) {
        this.f55652r = interfaceC5910a;
        this.f55648n.m22536e();
        m29121m();
    }

    @Override // com.yandex.mobile.ads.impl.vb0
    /* renamed from: a */
    public final long mo23266a(InterfaceC5939vs[] interfaceC5939vsArr, boolean[] zArr, uy0[] uy0VarArr, boolean[] zArr2, long j2) {
        InterfaceC5939vs interfaceC5939vs;
        m29110e();
        C5886e c5886e = this.f55659y;
        x61 x61Var = c5886e.f55679a;
        boolean[] zArr3 = c5886e.f55681c;
        int i2 = this.f55628F;
        int i3 = 0;
        for (int i4 = 0; i4 < interfaceC5939vsArr.length; i4++) {
            uy0 uy0Var = uy0VarArr[i4];
            if (uy0Var != null && (interfaceC5939vsArr[i4] == null || !zArr[i4])) {
                int i5 = ((C5884c) uy0Var).f55675a;
                C5220ia.m25476b(zArr3[i5]);
                this.f55628F--;
                zArr3[i5] = false;
                uy0VarArr[i4] = null;
            }
        }
        boolean z = !this.f55626D ? j2 == 0 : i2 != 0;
        for (int i6 = 0; i6 < interfaceC5939vsArr.length; i6++) {
            if (uy0VarArr[i6] == null && (interfaceC5939vs = interfaceC5939vsArr[i6]) != null) {
                C5220ia.m25476b(interfaceC5939vs.length() == 1);
                C5220ia.m25476b(interfaceC5939vs.mo22395b(0) == 0);
                int m29681a = x61Var.m29681a(interfaceC5939vs.mo22394a());
                C5220ia.m25476b(!zArr3[m29681a]);
                this.f55628F++;
                zArr3[m29681a] = true;
                uy0VarArr[i6] = new C5884c(m29681a);
                zArr2[i6] = true;
                if (!z) {
                    ty0 ty0Var = this.f55654t[m29681a];
                    z = (ty0Var.m28783b(j2, true) || ty0Var.m28784c() == 0) ? false : true;
                }
            }
        }
        if (this.f55628F == 0) {
            this.f55632J = false;
            this.f55627E = false;
            if (this.f55646l.m26371d()) {
                ty0[] ty0VarArr = this.f55654t;
                int length = ty0VarArr.length;
                while (i3 < length) {
                    ty0VarArr[i3].m28776a();
                    i3++;
                }
                this.f55646l.m26366a();
            } else {
                for (ty0 ty0Var2 : this.f55654t) {
                    ty0Var2.m28782b(false);
                }
            }
        } else if (z) {
            j2 = seekToUs(j2);
            while (i3 < uy0VarArr.length) {
                if (uy0VarArr[i3] != null) {
                    zArr2[i3] = true;
                }
                i3++;
            }
        }
        this.f55626D = true;
        return j2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x007e, code lost:
    
        if (java.lang.Math.abs(r7 - r20) <= java.lang.Math.abs(r9 - r20)) goto L36;
     */
    @Override // com.yandex.mobile.ads.impl.vb0
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long mo23265a(long r20, com.yandex.mobile.ads.impl.f01 r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r3 = r22
            r19.m29110e()
            com.yandex.mobile.ads.impl.e01 r4 = r0.f55660z
            boolean r4 = r4.mo22566b()
            r5 = 0
            if (r4 != 0) goto L14
            return r5
        L14:
            com.yandex.mobile.ads.impl.e01 r4 = r0.f55660z
            com.yandex.mobile.ads.impl.e01$a r4 = r4.mo22565b(r1)
            com.yandex.mobile.ads.impl.g01 r7 = r4.f49774a
            long r7 = r7.f50468a
            com.yandex.mobile.ads.impl.g01 r4 = r4.f49775b
            long r9 = r4.f50468a
            long r11 = r3.f50083a
            int r4 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r4 != 0) goto L30
            long r13 = r3.f50084b
            int r4 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r4 != 0) goto L30
            r13 = r1
            goto L88
        L30:
            r13 = -9223372036854775808
            int r4 = com.yandex.mobile.ads.impl.s91.f54530a
            long r15 = r1 - r11
            long r11 = r11 ^ r1
            long r17 = r1 ^ r15
            long r11 = r11 & r17
            int r4 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r4 >= 0) goto L40
            goto L41
        L40:
            r13 = r15
        L41:
            long r3 = r3.f50084b
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r15 = r1 + r3
            long r17 = r1 ^ r15
            long r3 = r3 ^ r15
            long r3 = r17 & r3
            int r17 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r17 >= 0) goto L54
            goto L55
        L54:
            r11 = r15
        L55:
            r3 = 1
            r4 = 0
            int r5 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r5 > 0) goto L61
            int r5 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r5 > 0) goto L61
            r5 = 1
            goto L62
        L61:
            r5 = 0
        L62:
            int r6 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r6 > 0) goto L6b
            int r6 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r6 > 0) goto L6b
            goto L6c
        L6b:
            r3 = 0
        L6c:
            if (r5 == 0) goto L81
            if (r3 == 0) goto L81
            long r3 = r7 - r1
            long r3 = java.lang.Math.abs(r3)
            long r1 = r9 - r1
            long r1 = java.lang.Math.abs(r1)
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 > 0) goto L87
            goto L83
        L81:
            if (r5 == 0) goto L85
        L83:
            r13 = r7
            goto L88
        L85:
            if (r3 == 0) goto L88
        L87:
            r13 = r9
        L88:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.us0.mo23265a(long, com.yandex.mobile.ads.impl.f01):long");
    }

    /* renamed from: a */
    public final boolean m29124a(int i2) {
        boolean z;
        if (!this.f55627E) {
            if (!(this.f55631I != -9223372036854775807L)) {
                z = false;
                return !z && this.f55654t[i2].m28780a(this.f55634L);
            }
        }
        z = true;
        if (z) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001e  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m29123a(int r9, com.yandex.mobile.ads.impl.C5658qv r10, com.yandex.mobile.ads.impl.C5752sm r11, int r12) {
        /*
            r8 = this;
            boolean r0 = r8.f55627E
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L19
            long r3 = r8.f55631I
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L13
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            if (r0 == 0) goto L17
            goto L19
        L17:
            r0 = 0
            goto L1a
        L19:
            r0 = 1
        L1a:
            r3 = -3
            if (r0 == 0) goto L1e
            return r3
        L1e:
            r8.m29110e()
            com.yandex.mobile.ads.impl.us0$e r0 = r8.f55659y
            boolean[] r4 = r0.f55682d
            boolean r5 = r4[r9]
            if (r5 != 0) goto L42
            com.yandex.mobile.ads.impl.x61 r0 = r0.f55679a
            com.yandex.mobile.ads.impl.w61 r0 = r0.m29682a(r9)
            com.yandex.mobile.ads.impl.pv r0 = r0.m29393a(r1)
            com.yandex.mobile.ads.impl.cc0$a r1 = r8.f55640f
            java.lang.String r5 = r0.f53820l
            int r5 = com.yandex.mobile.ads.impl.he0.m25138a(r5)
            long r6 = r8.f55630H
            r1.m23207a(r5, r0, r6)
            r4[r9] = r2
        L42:
            com.yandex.mobile.ads.impl.ty0[] r0 = r8.f55654t
            r0 = r0[r9]
            boolean r1 = r8.f55634L
            int r10 = r0.m28775a(r10, r11, r12, r1)
            if (r10 != r3) goto L51
            r8.m29104b(r9)
        L51:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.us0.m29123a(int, com.yandex.mobile.ads.impl.qv, com.yandex.mobile.ads.impl.sm, int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c A[RETURN] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m29122a(int r8, long r9) {
        /*
            r7 = this;
            boolean r0 = r7.f55627E
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L19
            long r3 = r7.f55631I
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L13
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            if (r0 == 0) goto L17
            goto L19
        L17:
            r0 = 0
            goto L1a
        L19:
            r0 = 1
        L1a:
            if (r0 == 0) goto L1d
            return r2
        L1d:
            r7.m29110e()
            com.yandex.mobile.ads.impl.us0$e r0 = r7.f55659y
            boolean[] r3 = r0.f55682d
            boolean r4 = r3[r8]
            if (r4 != 0) goto L41
            com.yandex.mobile.ads.impl.x61 r0 = r0.f55679a
            com.yandex.mobile.ads.impl.w61 r0 = r0.m29682a(r8)
            com.yandex.mobile.ads.impl.pv r0 = r0.m29393a(r2)
            com.yandex.mobile.ads.impl.cc0$a r2 = r7.f55640f
            java.lang.String r4 = r0.f53820l
            int r4 = com.yandex.mobile.ads.impl.he0.m25138a(r4)
            long r5 = r7.f55630H
            r2.m23207a(r4, r0, r5)
            r3[r8] = r1
        L41:
            com.yandex.mobile.ads.impl.ty0[] r0 = r7.f55654t
            r0 = r0[r8]
            boolean r1 = r7.f55634L
            int r9 = r0.m28774a(r9, r1)
            r0.m28786d(r9)
            if (r9 != 0) goto L53
            r7.m29104b(r8)
        L53:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.us0.m29122a(int, long):int");
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5509nt
    /* renamed from: a */
    public final y61 mo23022a(int i2, int i3) {
        return m29099a(new C5885d(false, i2));
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5509nt
    /* renamed from: a */
    public final void mo23023a() {
        this.f55656v = true;
        this.f55651q.post(this.f55649o);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5509nt
    /* renamed from: a */
    public final void mo23024a(e01 e01Var) {
        this.f55651q.post(new hn1(this, e01Var, 6));
    }

    /* renamed from: a */
    private ty0 m29099a(C5885d c5885d) {
        int length = this.f55654t.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (c5885d.equals(this.f55655u[i2])) {
                return this.f55654t[i2];
            }
        }
        InterfaceC5476n8 interfaceC5476n8 = this.f55643i;
        InterfaceC4720g interfaceC4720g = this.f55638d;
        InterfaceC4719f.a aVar = this.f55641g;
        Objects.requireNonNull(interfaceC4720g);
        Objects.requireNonNull(aVar);
        ty0 ty0Var = new ty0(interfaceC5476n8, interfaceC4720g, aVar);
        ty0Var.m28779a(this);
        int i3 = length + 1;
        C5885d[] c5885dArr = (C5885d[]) Arrays.copyOf(this.f55655u, i3);
        c5885dArr[length] = c5885d;
        int i4 = s91.f54530a;
        this.f55655u = c5885dArr;
        ty0[] ty0VarArr = (ty0[]) Arrays.copyOf(this.f55654t, i3);
        ty0VarArr[length] = ty0Var;
        this.f55654t = ty0VarArr;
        return ty0Var;
    }

    /* renamed from: a */
    private long m29098a(boolean z) {
        int i2;
        long j2 = Long.MIN_VALUE;
        while (i2 < this.f55654t.length) {
            if (!z) {
                C5886e c5886e = this.f55659y;
                Objects.requireNonNull(c5886e);
                i2 = c5886e.f55681c[i2] ? 0 : i2 + 1;
            }
            j2 = Math.max(j2, this.f55654t[i2].m28781b());
        }
        return j2;
    }
}
