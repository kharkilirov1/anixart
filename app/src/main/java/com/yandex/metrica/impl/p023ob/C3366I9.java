package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.p023ob.AbstractC3632T1;

/* renamed from: com.yandex.metrica.impl.ob.I9 */
/* loaded from: classes2.dex */
public class C3366I9 extends AbstractC3341H9 implements InterfaceC3549Ph {

    /* renamed from: c */
    public static final C4444ye f43098c = new C4444ye("LOCATION_TRACKING_ENABLED", null);

    /* renamed from: d */
    public static final C4444ye f43099d = new C4444ye("PREF_KEY_OFFSET", null);

    /* renamed from: e */
    public static final C4444ye f43100e = new C4444ye("UNCHECKED_TIME", null);

    /* renamed from: f */
    public static final C4444ye f43101f = new C4444ye("STATISTICS_RESTRICTED_IN_MAIN", null);

    /* renamed from: g */
    public static final C4444ye f43102g;

    /* renamed from: h */
    public static final C4444ye f43103h;

    /* renamed from: i */
    public static final C4444ye f43104i;

    /* renamed from: j */
    public static final C4444ye f43105j;

    /* renamed from: k */
    public static final C4444ye f43106k;

    /* renamed from: l */
    public static final C4444ye f43107l;

    /* renamed from: m */
    public static final C4444ye f43108m;

    /* renamed from: n */
    private static final C4444ye f43109n;

    /* renamed from: o */
    public static final C4444ye f43110o;

    /* renamed from: p */
    public static final C4444ye f43111p;

    /* renamed from: q */
    public static final C4444ye f43112q;

    /* renamed from: r */
    public static final C4444ye f43113r;

    /* renamed from: s */
    public static final C4444ye f43114s;

    /* renamed from: t */
    public static final C4444ye f43115t;

    /* renamed from: u */
    public static final C4444ye f43116u;

    /* renamed from: v */
    public static final C4444ye f43117v;

    static {
        new C4444ye("SDKFCE", null);
        new C4444ye("FST", null);
        new C4444ye("LSST", null);
        new C4444ye("FSDKFCO", null);
        new C4444ye("SRSDKFC", null);
        new C4444ye("LSDKFCAT", null);
        f43102g = new C4444ye("LAST_IDENTITY_LIGHT_SEND_TIME", null);
        f43103h = new C4444ye("NEXT_REPORT_SEND_ATTEMPT_NUMBER", null);
        f43104i = new C4444ye("NEXT_LOCATION_SEND_ATTEMPT_NUMBER", null);
        f43105j = new C4444ye("NEXT_STARTUP_SEND_ATTEMPT_NUMBER", null);
        f43106k = new C4444ye("LAST_REPORT_SEND_ATTEMPT_TIME", null);
        f43107l = new C4444ye("LAST_LOCATION_SEND_ATTEMPT_TIME", null);
        f43108m = new C4444ye("LAST_STARTUP_SEND_ATTEMPT_TIME", null);
        f43109n = new C4444ye("LAST_MIGRATION_VERSION", null);
        f43110o = new C4444ye("LAST_WIFI_SCANNING_ATTEMPT_TIME", null);
        f43111p = new C4444ye("LAST_LBS_SCANNING_ATTEMPT_TIME", null);
        f43112q = new C4444ye("LAST_GPS_SCANNING_ATTEMPT_TIME", null);
        f43113r = new C4444ye("LAST_FUSED_SCANNING_ATTEMPT_TIME", null);
        f43114s = new C4444ye("SATELLITE_PRELOAD_INFO_CHECKED", null);
        f43115t = new C4444ye("SATELLITE_CLIDS_CHECKED", null);
        f43116u = new C4444ye("CERTIFICATE_REQUEST_ETAG", null);
        f43117v = new C4444ye("CERTIFICATE_REQUEST_NEXT_ATTEMPT_TIME", null);
    }

    public C3366I9(InterfaceC4464z8 interfaceC4464z8) {
        super(interfaceC4464z8);
    }

    @Deprecated
    /* renamed from: a */
    public int m18274a(int i2) {
        return m18215a(f43109n.m21201a(), i2);
    }

    /* renamed from: b */
    public long m18282b(int i2) {
        return m18216a(f43099d.m21201a(), i2);
    }

    /* renamed from: c */
    public C3366I9 m18289c(boolean z) {
        return (C3366I9) m18224b(f43100e.m21201a(), z);
    }

    /* renamed from: d */
    public void m18291d(boolean z) {
        m18224b(f43098c.m21201a(), z).m18227c();
    }

    @Nullable
    /* renamed from: e */
    public Boolean m18293e() {
        C4444ye c4444ye = f43101f;
        if (m18225b(c4444ye.m21201a())) {
            return Boolean.valueOf(m18219a(c4444ye.m21201a(), true));
        }
        return null;
    }

    /* renamed from: f */
    public boolean m18295f() {
        return m18219a(f43098c.m21201a(), false);
    }

    /* renamed from: g */
    public C3366I9 m18297g(long j2) {
        return (C3366I9) m18221b(f43113r.m21201a(), j2);
    }

    /* renamed from: h */
    public C3366I9 m18299h(long j2) {
        return (C3366I9) m18221b(f43112q.m21201a(), j2);
    }

    /* renamed from: i */
    public C3366I9 m18301i(long j2) {
        return (C3366I9) m18221b(f43102g.m21201a(), j2);
    }

    /* renamed from: j */
    public C3366I9 m18302j(long j2) {
        return (C3366I9) m18221b(f43111p.m21201a(), j2);
    }

    /* renamed from: k */
    public C3366I9 m18304k(long j2) {
        return (C3366I9) m18221b(f43110o.m21201a(), j2);
    }

    /* renamed from: l */
    public C3366I9 m18306l(long j2) {
        return (C3366I9) m18221b(f43099d.m21201a(), j2);
    }

    /* renamed from: a */
    public boolean m18281a(boolean z) {
        return m18219a(f43100e.m21201a(), z);
    }

    /* renamed from: b */
    public C3366I9 m18286b(boolean z) {
        return (C3366I9) m18224b(f43101f.m21201a(), z);
    }

    /* renamed from: c */
    public long m18288c(long j2) {
        return m18216a(f43112q.m21201a(), j2);
    }

    /* renamed from: d */
    public long m18290d(long j2) {
        return m18216a(f43102g.m21201a(), j2);
    }

    /* renamed from: f */
    public long m18294f(long j2) {
        return m18216a(f43110o.m21201a(), j2);
    }

    /* renamed from: g */
    public C3366I9 m18296g() {
        return (C3366I9) m18224b(f43115t.m21201a(), true);
    }

    /* renamed from: h */
    public C3366I9 m18298h() {
        return (C3366I9) m18224b(f43114s.m21201a(), true);
    }

    @NonNull
    @Deprecated
    /* renamed from: i */
    public C3366I9 m18300i() {
        return (C3366I9) m18230e(f43109n.m21201a());
    }

    /* renamed from: j */
    public boolean m18303j() {
        return m18219a(f43114s.m21201a(), false);
    }

    /* renamed from: k */
    public boolean m18305k() {
        return m18219a(f43115t.m21201a(), false);
    }

    /* renamed from: a */
    public int m18275a(@NonNull AbstractC3632T1.a aVar, int i2) {
        C4444ye m18273b = m18273b(aVar);
        return m18273b == null ? i2 : m18215a(m18273b.m21201a(), i2);
    }

    /* renamed from: b */
    public C3366I9 m18284b(@NonNull AbstractC3632T1.a aVar, int i2) {
        C4444ye m18273b = m18273b(aVar);
        return m18273b != null ? (C3366I9) m18220b(m18273b.m21201a(), i2) : this;
    }

    /* renamed from: e */
    public long m18292e(long j2) {
        return m18216a(f43111p.m21201a(), j2);
    }

    /* renamed from: a */
    public long m18277a(@NonNull AbstractC3632T1.a aVar, long j2) {
        C4444ye m18272a = m18272a(aVar);
        return m18272a == null ? j2 : m18216a(m18272a.m21201a(), j2);
    }

    /* renamed from: b */
    public C3366I9 m18285b(@NonNull AbstractC3632T1.a aVar, long j2) {
        C4444ye m18272a = m18272a(aVar);
        return m18272a != null ? (C3366I9) m18221b(m18272a.m21201a(), j2) : this;
    }

    @NonNull
    /* renamed from: a */
    public C3366I9 m18278a(@NonNull String str, @NonNull String str2, @Nullable String str3) {
        return (C3366I9) m18222b(new C4444ye("LAST_SOCKET_REPORT_TIMES_" + str + "_" + str2, null).m21201a(), str3);
    }

    /* renamed from: b */
    public long m18283b(long j2) {
        return m18216a(f43113r.m21201a(), j2);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3549Ph
    @Nullable
    /* renamed from: b */
    public String mo18287b() {
        return m18217a(f43116u.m21201a(), (String) null);
    }

    /* renamed from: b */
    private C4444ye m18273b(@NonNull AbstractC3632T1.a aVar) {
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            return f43103h;
        }
        if (ordinal == 1) {
            return f43104i;
        }
        if (ordinal != 2) {
            return null;
        }
        return f43105j;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3549Ph
    @NonNull
    /* renamed from: a */
    public InterfaceC3549Ph mo18280a(@NonNull String str) {
        return (InterfaceC3549Ph) m18222b(f43116u.m21201a(), str);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3549Ph
    /* renamed from: a */
    public long mo18276a() {
        return m18216a(f43117v.m21201a(), 0L);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3549Ph
    @NonNull
    /* renamed from: a */
    public InterfaceC3549Ph mo18279a(long j2) {
        return (InterfaceC3549Ph) m18221b(f43117v.m21201a(), j2);
    }

    /* renamed from: a */
    private C4444ye m18272a(@NonNull AbstractC3632T1.a aVar) {
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            return f43106k;
        }
        if (ordinal == 1) {
            return f43107l;
        }
        if (ordinal != 2) {
            return null;
        }
        return f43108m;
    }
}
