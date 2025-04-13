package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.p023ob.C3156A;
import java.util.Collections;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.G9 */
/* loaded from: classes2.dex */
public class C3316G9 extends AbstractC3341H9 {

    /* renamed from: c */
    private static final C4444ye f42982c = new C4444ye("IDENTITY_SEND_TIME", null);

    /* renamed from: d */
    private static final C4444ye f42983d = new C4444ye("PERMISSIONS_CHECK_TIME", null);

    /* renamed from: e */
    private static final C4444ye f42984e = new C4444ye("USER_INFO", null);

    /* renamed from: f */
    private static final C4444ye f42985f = new C4444ye("PROFILE_ID", null);

    /* renamed from: g */
    private static final C4444ye f42986g = new C4444ye("APP_ENVIRONMENT", null);

    /* renamed from: h */
    private static final C4444ye f42987h = new C4444ye("APP_ENVIRONMENT_REVISION", null);

    /* renamed from: i */
    private static final C4444ye f42988i = new C4444ye("LAST_MIGRATION_VERSION", null);

    /* renamed from: j */
    private static final C4444ye f42989j = new C4444ye("LAST_APP_VERSION_WITH_FEATURES", null);

    /* renamed from: k */
    private static final C4444ye f42990k = new C4444ye("APPLICATION_FEATURES", null);

    /* renamed from: l */
    private static final C4444ye f42991l = new C4444ye("LAST_STAT_SENDING_DISABLED_REPORTING_TIMESTAMP", null);

    /* renamed from: m */
    private static final C4444ye f42992m = new C4444ye("CERTIFICATES_SHA1_FINGERPRINTS", null);

    /* renamed from: n */
    public static final C4444ye f42993n = new C4444ye("DEPRECATED_NATIVE_CRASHES_CHECKED", null);

    /* renamed from: o */
    private static final C4444ye f42994o = new C4444ye("REFERRER_HANDLED", null);

    public C3316G9(InterfaceC4464z8 interfaceC4464z8) {
        super(interfaceC4464z8);
    }

    /* renamed from: a */
    public C3316G9 m18133a(C3156A.a aVar) {
        synchronized (this) {
            m18222b(f42986g.m21201a(), aVar.f42518a);
            m18221b(f42987h.m21201a(), aVar.f42519b);
        }
        return this;
    }

    /* renamed from: b */
    public long m18135b(long j2) {
        return m18216a(f42982c.m21201a(), j2);
    }

    /* renamed from: c */
    public C3316G9 m18136c(long j2) {
        return (C3316G9) m18221b(f42982c.m21201a(), j2);
    }

    /* renamed from: d */
    public C3316G9 m18138d(long j2) {
        return (C3316G9) m18221b(f42991l.m21201a(), j2);
    }

    /* renamed from: e */
    public C3156A.a m18139e() {
        C3156A.a aVar;
        synchronized (this) {
            aVar = new C3156A.a(m18217a(f42986g.m21201a(), "{}"), m18216a(f42987h.m21201a(), 0L));
        }
        return aVar;
    }

    /* renamed from: f */
    public String m18141f() {
        return m18217a(f42990k.m21201a(), "");
    }

    /* renamed from: g */
    public C3316G9 m18143g(String str) {
        return (C3316G9) m18222b(f42990k.m21201a(), str);
    }

    /* renamed from: h */
    public int m18145h() {
        return m18215a(f42989j.m21201a(), -1);
    }

    /* renamed from: i */
    public C3316G9 m18147i(String str) {
        return (C3316G9) m18222b(f42984e.m21201a(), str);
    }

    /* renamed from: j */
    public long m18149j() {
        return m18216a(f42991l.m21201a(), 0L);
    }

    /* renamed from: k */
    public long m18150k() {
        return m18216a(f42983d.m21201a(), 0L);
    }

    @Nullable
    /* renamed from: l */
    public String m18151l() {
        return m18228d(f42985f.m21201a());
    }

    /* renamed from: m */
    public String m18152m() {
        return m18217a(f42984e.m21201a(), (String) null);
    }

    /* renamed from: n */
    public boolean m18153n() {
        return m18219a(f42993n.m21201a(), false);
    }

    /* renamed from: o */
    public C3316G9 m18154o() {
        return (C3316G9) m18224b(f42993n.m21201a(), true);
    }

    @NonNull
    @Deprecated
    /* renamed from: p */
    public C3316G9 m18155p() {
        return (C3316G9) m18224b(f42994o.m21201a(), true);
    }

    @NonNull
    @Deprecated
    /* renamed from: q */
    public C3316G9 m18156q() {
        return (C3316G9) m18230e(f42988i.m21201a());
    }

    @NonNull
    @Deprecated
    /* renamed from: r */
    public C3316G9 m18157r() {
        return (C3316G9) m18230e(f42994o.m21201a());
    }

    @Nullable
    @Deprecated
    /* renamed from: s */
    public Boolean m18158s() {
        C4444ye c4444ye = f42994o;
        if (m18225b(c4444ye.m21201a())) {
            return Boolean.valueOf(m18219a(c4444ye.m21201a(), false));
        }
        return null;
    }

    /* renamed from: c */
    public C3316G9 m18137c(String str, String str2) {
        return (C3316G9) m18222b(new C4444ye("SESSION_", str).m21201a(), str2);
    }

    /* renamed from: f */
    public String m18142f(String str) {
        return m18217a(new C4444ye("SESSION_", str).m21201a(), "");
    }

    @NonNull
    /* renamed from: g */
    public List<String> m18144g() {
        return m18218a(f42992m.m21201a(), Collections.emptyList());
    }

    /* renamed from: h */
    public C3316G9 m18146h(@Nullable String str) {
        return (C3316G9) m18222b(f42985f.m21201a(), str);
    }

    @Nullable
    @Deprecated
    /* renamed from: i */
    public Integer m18148i() {
        C4444ye c4444ye = f42988i;
        if (m18225b(c4444ye.m21201a())) {
            return Integer.valueOf((int) m18216a(c4444ye.m21201a(), 0L));
        }
        return null;
    }

    /* renamed from: a */
    public C3316G9 m18132a(int i2) {
        return (C3316G9) m18220b(f42989j.m21201a(), i2);
    }

    /* renamed from: a */
    public C3316G9 m18134a(List<String> list) {
        return (C3316G9) m18223b(f42992m.m21201a(), list);
    }

    /* renamed from: e */
    public C3316G9 m18140e(long j2) {
        return (C3316G9) m18221b(f42983d.m21201a(), j2);
    }
}
