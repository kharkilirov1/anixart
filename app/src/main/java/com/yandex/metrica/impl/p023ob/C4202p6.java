package com.yandex.metrica.impl.p023ob;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.room.util.C0576a;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONObject;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.p6 */
/* loaded from: classes2.dex */
public class C4202p6 {

    /* renamed from: a */
    private final C3940f4 f46102a;

    /* renamed from: b */
    private final InterfaceC4410x6 f46103b;

    /* renamed from: c */
    private final C4254r6 f46104c;

    /* renamed from: d */
    private long f46105d;

    /* renamed from: e */
    private long f46106e;

    /* renamed from: f */
    private AtomicLong f46107f;

    /* renamed from: g */
    private boolean f46108g;

    /* renamed from: h */
    private volatile a f46109h;

    /* renamed from: i */
    private long f46110i;

    /* renamed from: j */
    private long f46111j;

    /* renamed from: k */
    private C3504Nm f46112k;

    /* renamed from: com.yandex.metrica.impl.ob.p6$a */
    public static class a {

        /* renamed from: a */
        private final String f46113a;

        /* renamed from: b */
        private final String f46114b;

        /* renamed from: c */
        private final String f46115c;

        /* renamed from: d */
        private final String f46116d;

        /* renamed from: e */
        private final String f46117e;

        /* renamed from: f */
        private final int f46118f;

        /* renamed from: g */
        private final int f46119g;

        public a(JSONObject jSONObject) {
            this.f46113a = jSONObject.optString("analyticsSdkVersionName", null);
            this.f46114b = jSONObject.optString("kitBuildNumber", null);
            this.f46115c = jSONObject.optString("appVer", null);
            this.f46116d = jSONObject.optString("appBuild", null);
            this.f46117e = jSONObject.optString("osVer", null);
            this.f46118f = jSONObject.optInt("osApiLev", -1);
            this.f46119g = jSONObject.optInt("attribution_id", 0);
        }

        /* renamed from: a */
        public boolean m20541a(C4057jh c4057jh) {
            Objects.requireNonNull(c4057jh);
            return TextUtils.equals("5.0.0", this.f46113a) && TextUtils.equals("45001354", this.f46114b) && TextUtils.equals(c4057jh.m19750f(), this.f46115c) && TextUtils.equals(c4057jh.m19742b(), this.f46116d) && TextUtils.equals(c4057jh.m19760p(), this.f46117e) && this.f46118f == c4057jh.m19759o() && this.f46119g == c4057jh.m20098D();
        }

        public String toString() {
            StringBuilder m24u = C0000a.m24u("SessionRequestParams{mKitVersionName='");
            C0576a.m4100A(m24u, this.f46113a, '\'', ", mKitBuildNumber='");
            C0576a.m4100A(m24u, this.f46114b, '\'', ", mAppVersion='");
            C0576a.m4100A(m24u, this.f46115c, '\'', ", mAppBuild='");
            C0576a.m4100A(m24u, this.f46116d, '\'', ", mOsVersion='");
            C0576a.m4100A(m24u, this.f46117e, '\'', ", mApiLevel=");
            m24u.append(this.f46118f);
            m24u.append(", mAttributionId=");
            return C0000a.m17n(m24u, this.f46119g, '}');
        }
    }

    public C4202p6(C3940f4 c3940f4, InterfaceC4410x6 interfaceC4410x6, C4254r6 c4254r6, C3504Nm c3504Nm) {
        this.f46102a = c3940f4;
        this.f46103b = interfaceC4410x6;
        this.f46104c = c4254r6;
        this.f46112k = c3504Nm;
        m20529g();
    }

    /* renamed from: g */
    private void m20529g() {
        C4254r6 c4254r6 = this.f46104c;
        Objects.requireNonNull(this.f46112k);
        this.f46106e = c4254r6.m20623a(SystemClock.elapsedRealtime());
        this.f46105d = this.f46104c.m20627c(-1L);
        this.f46107f = new AtomicLong(this.f46104c.m20626b(0L));
        this.f46108g = this.f46104c.m20625a(true);
        long m20629e = this.f46104c.m20629e(0L);
        this.f46110i = m20629e;
        this.f46111j = this.f46104c.m20628d(m20629e - this.f46106e);
    }

    /* renamed from: a */
    public long m20530a(long j2) {
        InterfaceC4410x6 interfaceC4410x6 = this.f46103b;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(j2 - this.f46106e);
        this.f46111j = seconds;
        ((C4436y6) interfaceC4410x6).m21186b(seconds);
        return this.f46111j;
    }

    /* renamed from: b */
    public long m20532b() {
        return Math.max(this.f46110i - TimeUnit.MILLISECONDS.toSeconds(this.f46106e), this.f46111j);
    }

    /* renamed from: c */
    public long m20534c() {
        return this.f46105d;
    }

    /* renamed from: d */
    public long m20536d() {
        return this.f46111j;
    }

    /* renamed from: e */
    public long m20537e() {
        long andIncrement = this.f46107f.getAndIncrement();
        ((C4436y6) this.f46103b).m21188c(this.f46107f.get()).m21187b();
        return andIncrement;
    }

    /* renamed from: f */
    public EnumC4462z6 m20538f() {
        return this.f46104c.m20624a();
    }

    /* renamed from: h */
    public boolean m20539h() {
        return this.f46108g && this.f46105d > 0;
    }

    /* renamed from: i */
    public synchronized void m20540i() {
        ((C4436y6) this.f46103b).m21185a();
        this.f46109h = null;
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("Session{mId=");
        m24u.append(this.f46105d);
        m24u.append(", mInitTime=");
        m24u.append(this.f46106e);
        m24u.append(", mCurrentReportId=");
        m24u.append(this.f46107f);
        m24u.append(", mSessionRequestParams=");
        m24u.append(this.f46109h);
        m24u.append(", mSleepStartSeconds=");
        m24u.append(this.f46110i);
        m24u.append('}');
        return m24u.toString();
    }

    /* renamed from: b */
    public boolean m20533b(long j2) {
        boolean z = this.f46105d >= 0;
        boolean m20528a = m20528a();
        Objects.requireNonNull(this.f46112k);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = this.f46110i;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return z && m20528a && ((((timeUnit.toSeconds(elapsedRealtime) > j3 ? 1 : (timeUnit.toSeconds(elapsedRealtime) == j3 ? 0 : -1)) < 0) || ((timeUnit.toSeconds(j2) - j3) > ((long) this.f46104c.m20622a(this.f46102a.m19882m().m20109O())) ? 1 : ((timeUnit.toSeconds(j2) - j3) == ((long) this.f46104c.m20622a(this.f46102a.m19882m().m20109O())) ? 0 : -1)) >= 0 || (timeUnit.toSeconds(j2 - this.f46106e) > C4280s6.f46345b ? 1 : (timeUnit.toSeconds(j2 - this.f46106e) == C4280s6.f46345b ? 0 : -1)) >= 0) ^ true);
    }

    /* renamed from: c */
    public void m20535c(long j2) {
        InterfaceC4410x6 interfaceC4410x6 = this.f46103b;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(j2);
        this.f46110i = seconds;
        ((C4436y6) interfaceC4410x6).m21192e(seconds).m21187b();
    }

    /* renamed from: a */
    public void m20531a(boolean z) {
        if (this.f46108g != z) {
            this.f46108g = z;
            ((C4436y6) this.f46103b).m21184a(z).m21187b();
        }
    }

    /* renamed from: a */
    private boolean m20528a() {
        if (this.f46109h == null) {
            synchronized (this) {
                if (this.f46109h == null) {
                    try {
                        String asString = this.f46102a.m19878i().m20797a(this.f46105d, this.f46104c.m20624a()).getAsString("report_request_parameters");
                        if (!TextUtils.isEmpty(asString)) {
                            this.f46109h = new a(new JSONObject(asString));
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        a aVar = this.f46109h;
        if (aVar != null) {
            return aVar.m20541a(this.f46102a.m19882m());
        }
        return false;
    }
}
