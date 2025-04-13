package com.yandex.metrica.impl.p023ob;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.F9 */
/* loaded from: classes2.dex */
public class C3291F9 extends AbstractC3341H9 {

    /* renamed from: A */
    public static final C4444ye f42875A;

    /* renamed from: B */
    public static final C4444ye f42876B;

    /* renamed from: C */
    public static final C4444ye f42877C;

    /* renamed from: D */
    public static final C4444ye f42878D;

    /* renamed from: E */
    public static final C4444ye f42879E;

    /* renamed from: F */
    public static final C4444ye f42880F;

    /* renamed from: G */
    public static final C4444ye f42881G;

    /* renamed from: c */
    @Deprecated
    public static final C4444ye f42882c = new C4444ye("UUID", null);

    /* renamed from: d */
    public static final C4444ye f42883d = new C4444ye("UUID_RESULT", null);

    /* renamed from: e */
    @Deprecated
    public static final C4444ye f42884e = new C4444ye("DEVICE_ID", null);

    /* renamed from: f */
    public static final C4444ye f42885f = new C4444ye("DEVICE_ID_RESULT", null);

    /* renamed from: g */
    @Deprecated
    public static final C4444ye f42886g = new C4444ye("DEVICE_ID_HASH", null);

    /* renamed from: h */
    public static final C4444ye f42887h = new C4444ye("DEVICE_ID_HASH_RESULT", null);

    /* renamed from: i */
    @Deprecated
    public static final C4444ye f42888i = new C4444ye("AD_URL_GET", null);

    /* renamed from: j */
    public static final C4444ye f42889j = new C4444ye("AD_URL_GET_RESULT", null);

    /* renamed from: k */
    @Deprecated
    public static final C4444ye f42890k = new C4444ye("AD_URL_REPORT", null);

    /* renamed from: l */
    public static final C4444ye f42891l = new C4444ye("AD_URL_REPORT_RESULT", null);

    /* renamed from: m */
    public static final C4444ye f42892m = new C4444ye("CUSTOM_HOSTS", null);

    /* renamed from: n */
    public static final C4444ye f42893n = new C4444ye("SERVER_TIME_OFFSET", null);

    /* renamed from: o */
    @Deprecated
    public static final C4444ye f42894o = new C4444ye("CLIDS", null);

    /* renamed from: p */
    public static final C4444ye f42895p = new C4444ye("RESPONSE_CLIDS_RESULT", null);

    /* renamed from: q */
    public static final C4444ye f42896q = new C4444ye("CUSTOM_SDK_HOSTS", null);

    /* renamed from: r */
    public static final C4444ye f42897r = new C4444ye("CLIENT_CLIDS", null);

    /* renamed from: s */
    public static final C4444ye f42898s = new C4444ye("DEFERRED_DEEP_LINK_WAS_CHECKED", null);

    /* renamed from: t */
    public static final C4444ye f42899t;

    /* renamed from: u */
    public static final C4444ye f42900u;

    /* renamed from: v */
    public static final C4444ye f42901v;

    /* renamed from: w */
    public static final C4444ye f42902w;

    /* renamed from: x */
    public static final C4444ye f42903x;

    /* renamed from: y */
    public static final C4444ye f42904y;

    /* renamed from: z */
    public static final C4444ye f42905z;

    static {
        new C4444ye("DEPRECATED_NATIVE_CRASHES_CHECKED", null);
        f42899t = new C4444ye("API_LEVEL", null);
        f42900u = new C4444ye("ADS_REQUESTED_CONTEXT", null);
        f42901v = new C4444ye("CONTEXT_HISTORY", null);
        f42902w = new C4444ye("ACCESS_CONFIG", null);
        f42903x = new C4444ye("DIAGNOSTICS_CONFIGS_HOLDER", null);
        f42904y = new C4444ye("NEXT_STARTUP_TIME", null);
        f42905z = new C4444ye("LAST_UI_CONTEXT_ID", null);
        f42875A = new C4444ye("GAID", null);
        f42876B = new C4444ye("HOAID", null);
        f42877C = new C4444ye("YANDEX_ADV_ID", null);
        f42878D = new C4444ye("CLIENT_CLIDS_CHANGED_AFTER_LAST_IDENTIFIERS_UPDATE", null);
        f42879E = new C4444ye("SCREEN_INFO", null);
        f42880F = new C4444ye("SCREEN_SIZE_CHECKED_BY_DEPRECATED", null);
        f42881G = new C4444ye("FEATURES", null);
    }

    public C3291F9(InterfaceC4464z8 interfaceC4464z8) {
        super(interfaceC4464z8);
    }

    @NonNull
    /* renamed from: a */
    public C3291F9 m18040a(@Nullable C3963g1 c3963g1) {
        return m18036a(f42889j.m21201a(), c3963g1);
    }

    /* renamed from: b */
    public boolean m18048b(boolean z) {
        return m18219a(f42878D.m21201a(), z);
    }

    @NonNull
    /* renamed from: c */
    public C3291F9 m18050c(@Nullable C3963g1 c3963g1) {
        return m18036a(f42896q.m21201a(), c3963g1);
    }

    /* renamed from: d */
    public long m18052d(long j2) {
        return m18216a(f42893n.m21203b(), j2);
    }

    @NonNull
    /* renamed from: e */
    public C3963g1 m18057e() {
        return m18037h(f42889j.m21201a());
    }

    @NonNull
    /* renamed from: f */
    public C3963g1 m18060f() {
        return m18037h(f42891l.m21201a());
    }

    @Deprecated
    /* renamed from: g */
    public String m18064g(String str) {
        return m18217a(f42890k.m21201a(), (String) null);
    }

    /* renamed from: h */
    public List<String> m18068h() {
        String m18217a = m18217a(f42892m.m21201a(), (String) null);
        if (TextUtils.isEmpty(m18217a)) {
            return null;
        }
        return C4452ym.m21263c(m18217a);
    }

    @NonNull
    /* renamed from: i */
    public C3963g1 m18070i() {
        return m18037h(f42896q.m21201a());
    }

    @NonNull
    /* renamed from: j */
    public C3963g1 m18073j() {
        return m18037h(f42887h.m21201a());
    }

    @NonNull
    /* renamed from: k */
    public C3963g1 m18075k() {
        return m18037h(f42885f.m21201a());
    }

    @Deprecated
    /* renamed from: l */
    public String m18078l(String str) {
        return m18217a(f42886g.m21201a(), (String) null);
    }

    @NonNull
    /* renamed from: m */
    public C4422xi m18079m() {
        String m18217a = m18217a(f42881G.m21201a(), (String) null);
        try {
            if (!TextUtils.isEmpty(m18217a)) {
                JSONObject jSONObject = new JSONObject(m18217a);
                return new C4422xi(C4452ym.m21251b(jSONObject, "libSslEnabled"), EnumC3911e1.m19778a(C4452ym.m21267e(jSONObject, "STATUS")), C4452ym.m21267e(jSONObject, "ERROR_EXPLANATION"));
            }
        } catch (Throwable unused) {
        }
        return new C4422xi(null, EnumC3911e1.UNKNOWN, null);
    }

    @NonNull
    /* renamed from: n */
    public C3963g1 m18082n() {
        return m18037h(f42875A.m21201a());
    }

    @NonNull
    /* renamed from: o */
    public C3963g1 m18084o() {
        return m18037h(f42876B.m21201a());
    }

    @Deprecated
    /* renamed from: p */
    public C3291F9 m18086p(String str) {
        return (C3291F9) m18222b(f42894o.m21201a(), str);
    }

    @NonNull
    /* renamed from: q */
    public C3963g1 m18088q() {
        return m18037h(f42895p.m21201a());
    }

    @Deprecated
    /* renamed from: r */
    public C3291F9 m18089r(String str) {
        return (C3291F9) m18222b(f42884e.m21201a(), str);
    }

    @Deprecated
    /* renamed from: s */
    public C3291F9 m18091s(String str) {
        return (C3291F9) m18222b(f42882c.m21201a(), str);
    }

    @NonNull
    /* renamed from: t */
    public C3963g1 m18093t() {
        return m18037h(f42883d.m21201a());
    }

    @NonNull
    /* renamed from: u */
    public C3963g1 m18094u() {
        return m18037h(f42877C.m21201a());
    }

    /* renamed from: v */
    public boolean m18095v() {
        return m18219a(f42898s.m21201a(), false);
    }

    /* renamed from: w */
    public boolean m18096w() {
        return m18219a(f42880F.m21201a(), false);
    }

    /* renamed from: x */
    public C3291F9 m18097x() {
        return (C3291F9) m18224b(f42898s.m21201a(), true);
    }

    /* renamed from: y */
    public void m18098y() {
        m18224b(f42880F.m21201a(), true);
    }

    @NonNull
    /* renamed from: a */
    public C3291F9 m18041a(@NonNull C4422xi c4422xi) {
        String m21201a = f42881G.m21201a();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("libSslEnabled", c4422xi.m21157b()).put("STATUS", c4422xi.m21158c().m19779a()).putOpt("ERROR_EXPLANATION", c4422xi.m21156a());
        } catch (Throwable unused) {
        }
        return (C3291F9) m18222b(m21201a, jSONObject.toString());
    }

    /* renamed from: b */
    public long m18045b(long j2) {
        return m18216a(f42899t.m21201a(), j2);
    }

    /* renamed from: c */
    public C3291F9 m18051c(boolean z) {
        return (C3291F9) m18224b(f42900u.m21201a(), z);
    }

    @NonNull
    /* renamed from: d */
    public C3291F9 m18053d(@Nullable C3963g1 c3963g1) {
        return m18036a(f42887h.m21201a(), c3963g1);
    }

    @NonNull
    /* renamed from: e */
    public C3291F9 m18056e(@Nullable C3963g1 c3963g1) {
        return m18036a(f42885f.m21201a(), c3963g1);
    }

    @Deprecated
    /* renamed from: f */
    public String m18061f(String str) {
        return m18217a(f42888i.m21201a(), (String) null);
    }

    @NonNull
    /* renamed from: g */
    public C3291F9 m18063g(@Nullable C3963g1 c3963g1) {
        return m18036a(f42876B.m21201a(), c3963g1);
    }

    @Deprecated
    /* renamed from: i */
    public String m18071i(String str) {
        return m18217a(f42894o.m21201a(), (String) null);
    }

    @NonNull
    /* renamed from: j */
    public C3291F9 m18072j(@Nullable C3963g1 c3963g1) {
        return m18036a(f42877C.m21201a(), c3963g1);
    }

    @Deprecated
    /* renamed from: k */
    public String m18076k(String str) {
        return m18217a(f42884e.m21201a(), (String) null);
    }

    @NonNull
    /* renamed from: l */
    public C3741Xa m18077l() {
        C3741Xa c3741Xa = null;
        try {
            String m18217a = m18217a(f42903x.m21201a(), (String) null);
            if (m18217a != null) {
                c3741Xa = C4452ym.m21234a(new JSONObject(m18217a));
            }
        } catch (Throwable unused) {
        }
        return c3741Xa == null ? new C3741Xa() : c3741Xa;
    }

    @Deprecated
    /* renamed from: n */
    public C3291F9 m18081n(String str) {
        return (C3291F9) m18222b(f42888i.m21201a(), str);
    }

    @Deprecated
    /* renamed from: o */
    public C3291F9 m18083o(String str) {
        return (C3291F9) m18222b(f42890k.m21201a(), str);
    }

    @NonNull
    /* renamed from: p */
    public long m18085p() {
        return m18216a(f42904y.m21201a(), 0L);
    }

    /* renamed from: q */
    public C3291F9 m18087q(@Nullable String str) {
        return (C3291F9) m18222b(f42897r.m21201a(), str);
    }

    @Nullable
    /* renamed from: r */
    public C4380w2 m18090r() {
        return C4452ym.m21270f(m18228d(f42879E.m21201a()));
    }

    @Nullable
    /* renamed from: s */
    public C3378Il m18092s() {
        try {
            String m18217a = m18217a(f42902w.m21201a(), (String) null);
            if (m18217a != null) {
                return C4452ym.m21259c(new JSONObject(m18217a));
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @NonNull
    /* renamed from: b */
    public C3291F9 m18046b(@Nullable C3963g1 c3963g1) {
        return m18036a(f42891l.m21201a(), c3963g1);
    }

    /* renamed from: c */
    public long m18049c(long j2) {
        return m18216a(f42905z.m21201a(), j2);
    }

    /* renamed from: d */
    public C3291F9 m18054d(boolean z) {
        return (C3291F9) m18224b(f42878D.m21201a(), z);
    }

    /* renamed from: e */
    public C3291F9 m18055e(long j2) {
        return (C3291F9) m18221b(f42899t.m21201a(), j2);
    }

    @NonNull
    /* renamed from: f */
    public C3291F9 m18059f(@Nullable C3963g1 c3963g1) {
        return m18036a(f42875A.m21201a(), c3963g1);
    }

    @NonNull
    /* renamed from: g */
    public List<String> m18065g() {
        LinkedList linkedList = new LinkedList();
        List<String> m18218a = m18218a(f42901v.m21201a(), linkedList);
        return m18218a == null ? linkedList : m18218a;
    }

    @NonNull
    /* renamed from: h */
    public C3291F9 m18067h(@Nullable C3963g1 c3963g1) {
        return m18036a(f42895p.m21201a(), c3963g1);
    }

    @NonNull
    /* renamed from: i */
    public C3291F9 m18069i(@Nullable C3963g1 c3963g1) {
        return m18036a(f42883d.m21201a(), c3963g1);
    }

    @Nullable
    /* renamed from: j */
    public String m18074j(@Nullable String str) {
        return m18217a(f42897r.m21201a(), (String) null);
    }

    /* renamed from: b */
    public C3291F9 m18047b(List<String> list) {
        return (C3291F9) m18222b(f42892m.m21201a(), C4452ym.m21261c(list));
    }

    /* renamed from: f */
    public C3291F9 m18058f(long j2) {
        return (C3291F9) m18221b(f42905z.m21201a(), j2);
    }

    /* renamed from: h */
    public C3291F9 m18066h(long j2) {
        return (C3291F9) m18221b(f42893n.m21201a(), j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    @androidx.annotation.NonNull
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.yandex.metrica.impl.p023ob.C3963g1 m18037h(@androidx.annotation.NonNull java.lang.String r6) {
        /*
            r5 = this;
            r0 = 0
            java.lang.String r6 = r5.m18217a(r6, r0)     // Catch: java.lang.Throwable -> L28
            if (r6 == 0) goto L28
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L28
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L28
            com.yandex.metrica.impl.ob.g1 r6 = new com.yandex.metrica.impl.ob.g1     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = "ID"
            java.lang.String r2 = com.yandex.metrica.impl.p023ob.C4452ym.m21267e(r1, r2)     // Catch: java.lang.Throwable -> L28
            java.lang.String r3 = "STATUS"
            java.lang.String r3 = com.yandex.metrica.impl.p023ob.C4452ym.m21267e(r1, r3)     // Catch: java.lang.Throwable -> L28
            com.yandex.metrica.impl.ob.e1 r3 = com.yandex.metrica.impl.p023ob.EnumC3911e1.m19778a(r3)     // Catch: java.lang.Throwable -> L28
            java.lang.String r4 = "ERROR_EXPLANATION"
            java.lang.String r1 = com.yandex.metrica.impl.p023ob.C4452ym.m21267e(r1, r4)     // Catch: java.lang.Throwable -> L28
            r6.<init>(r2, r3, r1)     // Catch: java.lang.Throwable -> L28
            goto L29
        L28:
            r6 = r0
        L29:
            if (r6 != 0) goto L34
            com.yandex.metrica.impl.ob.g1 r6 = new com.yandex.metrica.impl.ob.g1
            com.yandex.metrica.impl.ob.e1 r1 = com.yandex.metrica.impl.p023ob.EnumC3911e1.UNKNOWN
            java.lang.String r2 = "no identifier in preferences"
            r6.<init>(r0, r1, r2)
        L34:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p023ob.C3291F9.m18037h(java.lang.String):com.yandex.metrica.impl.ob.g1");
    }

    @NonNull
    /* renamed from: g */
    public C3291F9 m18062g(long j2) {
        return (C3291F9) m18221b(f42904y.m21201a(), j2);
    }

    @Deprecated
    /* renamed from: m */
    public String m18080m(String str) {
        return m18217a(f42882c.m21201a(), (String) null);
    }

    /* renamed from: a */
    public boolean m18044a(boolean z) {
        return m18219a(f42900u.m21201a(), z);
    }

    /* renamed from: a */
    public C3291F9 m18042a(@NonNull List<String> list) {
        return (C3291F9) m18223b(f42901v.m21201a(), list);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000e  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.yandex.metrica.impl.p023ob.C3291F9 m18038a(@androidx.annotation.Nullable com.yandex.metrica.impl.p023ob.C3378Il r2) {
        /*
            r1 = this;
            if (r2 == 0) goto Lb
            org.json.JSONObject r2 = com.yandex.metrica.impl.p023ob.C4452ym.m21244a(r2)     // Catch: java.lang.Throwable -> Lb
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Lb
            goto Lc
        Lb:
            r2 = 0
        Lc:
            if (r2 == 0) goto L17
            com.yandex.metrica.impl.ob.ye r0 = com.yandex.metrica.impl.p023ob.C3291F9.f42902w
            java.lang.String r0 = r0.m21201a()
            r1.m18222b(r0, r2)
        L17:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p023ob.C3291F9.m18038a(com.yandex.metrica.impl.ob.Il):com.yandex.metrica.impl.ob.F9");
    }

    /* renamed from: a */
    public C3291F9 m18039a(@NonNull C3741Xa c3741Xa) {
        return (C3291F9) m18222b(f42903x.m21201a(), C4452ym.m21248a(c3741Xa).toString());
    }

    /* renamed from: a */
    public void m18043a(@Nullable C4380w2 c4380w2) {
        m18222b(f42879E.m21201a(), C4452ym.m21238a(c4380w2));
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x002a  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.yandex.metrica.impl.p023ob.C3291F9 m18036a(@androidx.annotation.NonNull java.lang.String r5, @androidx.annotation.Nullable com.yandex.metrica.impl.p023ob.C3963g1 r6) {
        /*
            r4 = this;
            if (r6 == 0) goto L27
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L27
            r0.<init>()     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = "ID"
            java.lang.String r2 = r6.f45155a     // Catch: java.lang.Throwable -> L22
            org.json.JSONObject r1 = r0.put(r1, r2)     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = "STATUS"
            com.yandex.metrica.impl.ob.e1 r3 = r6.f45156b     // Catch: java.lang.Throwable -> L22
            java.lang.String r3 = r3.m19779a()     // Catch: java.lang.Throwable -> L22
            org.json.JSONObject r1 = r1.put(r2, r3)     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = "ERROR_EXPLANATION"
            java.lang.String r6 = r6.f45157c     // Catch: java.lang.Throwable -> L22
            r1.put(r2, r6)     // Catch: java.lang.Throwable -> L22
        L22:
            java.lang.String r6 = r0.toString()     // Catch: java.lang.Throwable -> L27
            goto L28
        L27:
            r6 = 0
        L28:
            if (r6 == 0) goto L2d
            r4.m18222b(r5, r6)
        L2d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p023ob.C3291F9.m18036a(java.lang.String, com.yandex.metrica.impl.ob.g1):com.yandex.metrica.impl.ob.F9");
    }
}
