package com.yandex.metrica.impl.p023ob;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.yandex.metrica.impl.p023ob.C3599Ri;
import com.yandex.metrica.impl.p023ob.C4082kg;
import com.yandex.metrica.impl.p023ob.C4292si;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.J9 */
/* loaded from: classes2.dex */
public class C3391J9 extends AbstractC3341H9 {

    /* renamed from: c */
    private C4444ye f43218c;

    /* renamed from: d */
    private C4444ye f43219d;

    /* renamed from: e */
    private C4444ye f43220e;

    /* renamed from: f */
    private C4444ye f43221f;

    /* renamed from: g */
    private C4444ye f43222g;

    /* renamed from: h */
    @Deprecated
    private C4444ye f43223h;

    /* renamed from: i */
    private C4444ye f43224i;

    /* renamed from: j */
    @Deprecated
    private C4444ye f43225j;

    /* renamed from: k */
    private C4444ye f43226k;

    /* renamed from: l */
    private C4444ye f43227l;

    /* renamed from: m */
    private C4444ye f43228m;

    /* renamed from: n */
    private C4444ye f43229n;

    /* renamed from: o */
    private C4444ye f43230o;

    /* renamed from: p */
    private C4444ye f43231p;

    /* renamed from: q */
    private C4444ye f43232q;

    /* renamed from: r */
    private C4444ye f43233r;

    /* renamed from: s */
    private C4444ye f43234s;

    /* renamed from: t */
    private C4444ye f43235t;

    /* renamed from: u */
    private C4444ye f43236u;

    /* renamed from: v */
    private C4444ye f43237v;

    /* renamed from: w */
    public static final C4444ye f43214w = new C4444ye("PREF_KEY_UID_", null);

    /* renamed from: x */
    private static final C4444ye f43215x = new C4444ye("PREF_KEY_HOST_URL_", null);

    /* renamed from: y */
    private static final C4444ye f43216y = new C4444ye("PREF_KEY_HOST_URLS_FROM_STARTUP", null);

    /* renamed from: z */
    private static final C4444ye f43217z = new C4444ye("PREF_KEY_HOST_URLS_FROM_CLIENT", null);

    /* renamed from: A */
    @Deprecated
    private static final C4444ye f43197A = new C4444ye("PREF_KEY_REPORT_URL_", null);

    /* renamed from: B */
    private static final C4444ye f43198B = new C4444ye("PREF_KEY_REPORT_URLS_", null);

    /* renamed from: C */
    @Deprecated
    private static final C4444ye f43199C = new C4444ye("PREF_L_URL", null);

    /* renamed from: D */
    private static final C4444ye f43200D = new C4444ye("PREF_L_URLS", null);

    /* renamed from: E */
    private static final C4444ye f43201E = new C4444ye("PREF_KEY_GET_AD_URL", null);

    /* renamed from: F */
    private static final C4444ye f43202F = new C4444ye("PREF_KEY_REPORT_AD_URL", null);

    /* renamed from: G */
    private static final C4444ye f43203G = new C4444ye("PREF_KEY_STARTUP_OBTAIN_TIME_", null);

    /* renamed from: H */
    private static final C4444ye f43204H = new C4444ye("PREF_KEY_STARTUP_ENCODED_CLIDS_", null);

    /* renamed from: I */
    public static final C4444ye f43205I = new C4444ye("PREF_KEY_DEVICE_ID_", null);

    /* renamed from: J */
    private static final C4444ye f43206J = new C4444ye("STARTUP_CLIDS_MATCH_WITH_APP_CLIDS_", null);

    /* renamed from: K */
    @Deprecated
    private static final C4444ye f43207K = new C4444ye("PREF_KEY_PINNING_UPDATE_URL", null);

    /* renamed from: L */
    private static final C4444ye f43208L = new C4444ye("PREF_KEY_EASY_COLLECTING_ENABLED_", null);

    /* renamed from: M */
    private static final C4444ye f43209M = new C4444ye("PREF_KEY_COLLECTING_PACKAGE_INFO_ENABLED_", null);

    /* renamed from: N */
    private static final C4444ye f43210N = new C4444ye("PREF_KEY_PERMISSIONS_COLLECTING_ENABLED_", null);

    /* renamed from: O */
    private static final C4444ye f43211O = new C4444ye("PREF_KEY_FEATURES_COLLECTING_ENABLED_", null);

    /* renamed from: P */
    private static final C4444ye f43212P = new C4444ye("SOCKET_CONFIG_", null);

    /* renamed from: Q */
    private static final C4444ye f43213Q = new C4444ye("LAST_STARTUP_REQUEST_CLIDS", null);

    public C3391J9(InterfaceC4464z8 interfaceC4464z8, String str) {
        super(interfaceC4464z8, str);
        this.f43218c = new C4444ye(f43205I.m21203b());
        this.f43219d = m18226c(f43214w.m21203b());
        this.f43220e = m18226c(f43215x.m21203b());
        this.f43221f = m18226c(f43216y.m21203b());
        this.f43222g = m18226c(f43217z.m21203b());
        this.f43223h = m18226c(f43197A.m21203b());
        this.f43224i = m18226c(f43198B.m21203b());
        this.f43225j = m18226c(f43199C.m21203b());
        this.f43226k = m18226c(f43200D.m21203b());
        this.f43227l = m18226c(f43201E.m21203b());
        this.f43228m = m18226c(f43202F.m21203b());
        this.f43229n = m18226c(f43203G.m21203b());
        this.f43230o = m18226c(f43204H.m21203b());
        this.f43231p = m18226c(f43206J.m21203b());
        this.f43232q = m18226c(f43208L.m21203b());
        this.f43233r = m18226c(f43209M.m21203b());
        this.f43234s = m18226c(f43210N.m21203b());
        this.f43235t = m18226c(f43211O.m21203b());
        this.f43237v = m18226c(f43213Q.m21203b());
        this.f43236u = m18226c(f43212P.m21203b());
    }

    /* renamed from: a */
    public C3391J9 m18392a(List<String> list) {
        return (C3391J9) m18222b(this.f43226k.m21201a(), C4452ym.m21261c(list));
    }

    /* renamed from: b */
    public C3391J9 m18395b(List<String> list) {
        return (C3391J9) m18222b(this.f43224i.m21201a(), C4452ym.m21261c(list));
    }

    /* renamed from: e */
    public void m18396e() {
        m18230e(f43207K.m21201a());
        m18230e(this.f43218c.m21201a());
        m18230e(this.f43227l.m21201a());
        m18230e(this.f43233r.m21201a());
        m18230e(this.f43232q.m21201a());
        m18230e(this.f43230o.m21201a());
        m18230e(this.f43235t.m21201a());
        m18230e(this.f43220e.m21201a());
        m18230e(this.f43222g.m21201a());
        m18230e(this.f43221f.m21201a());
        m18230e(this.f43237v.m21201a());
        m18230e(this.f43225j.m21201a());
        m18230e(this.f43226k.m21201a());
        m18230e(this.f43229n.m21201a());
        m18230e(this.f43234s.m21201a());
        m18230e(this.f43228m.m21201a());
        m18230e(this.f43223h.m21201a());
        m18230e(this.f43224i.m21201a());
        m18230e(this.f43236u.m21201a());
        m18230e(this.f43231p.m21201a());
        m18230e(this.f43219d.m21201a());
        m18230e(m18226c(new C4444ye("PREF_KEY_DISTRIBUTION_REFERRER_", null).m21203b()).m21201a());
        m18227c();
    }

    @NonNull
    @Deprecated
    /* renamed from: f */
    public C3599Ri m18397f() {
        C3599Ri.b bVar;
        C3599Ri.b bVar2;
        C3275Ei c3275Ei;
        C3599Ri.b m19045j = new C3599Ri.b(new C4292si(new C4292si.a().m20745d(m18219a(this.f43232q.m21201a(), C4292si.b.f46452b)).m20754m(m18219a(this.f43233r.m21201a(), C4292si.b.f46453c)).m20755n(m18219a(this.f43234s.m21201a(), C4292si.b.f46454d)).m20747f(m18219a(this.f43235t.m21201a(), C4292si.b.f46455e)))).m19048l(m18228d(this.f43219d.m21201a())).m19031c(C4452ym.m21263c(m18228d(this.f43221f.m21201a()))).m19026b(C4452ym.m21263c(m18228d(this.f43222g.m21201a()))).m19037f(m18228d(this.f43230o.m21201a())).m19044i(C4452ym.m21263c(m18228d(this.f43224i.m21201a()))).m19036e(C4452ym.m21263c(m18228d(this.f43226k.m21201a()))).m19039g(m18228d(this.f43227l.m21201a())).m19045j(m18228d(this.f43228m.m21201a()));
        String m18228d = m18228d(this.f43236u.m21201a());
        try {
        } catch (Throwable unused) {
            bVar = m19045j;
        }
        if (TextUtils.isEmpty(m18228d)) {
            bVar2 = m19045j;
            c3275Ei = null;
            return bVar2.m19005a(c3275Ei).m19043i(m18228d(this.f43237v.m21201a())).m19032c(m18219a(this.f43231p.m21201a(), true)).m19028c(m18216a(this.f43229n.m21201a(), -1L)).m19022a();
        }
        JSONObject jSONObject = new JSONObject(m18228d);
        C4082kg.p pVar = new C4082kg.p();
        long j2 = jSONObject.getLong("seconds_to_live");
        String string = jSONObject.getString(FirebaseMessagingService.EXTRA_TOKEN);
        JSONArray jSONArray = jSONObject.getJSONArray("ports");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            arrayList.add(Integer.valueOf(jSONArray.getInt(i2)));
        }
        bVar = m19045j;
        try {
            c3275Ei = new C3275Ei(j2, string, arrayList, new ArrayList(), jSONObject.getLong("first_delay_seconds"), jSONObject.getInt("launch_delay_seconds"), jSONObject.optLong("open_event_interval_seconds", pVar.f45775h), pVar.f45776i, pVar.f45777j, pVar.f45778k);
            bVar2 = bVar;
        } catch (Throwable unused2) {
            bVar2 = bVar;
            c3275Ei = null;
            return bVar2.m19005a(c3275Ei).m19043i(m18228d(this.f43237v.m21201a())).m19032c(m18219a(this.f43231p.m21201a(), true)).m19028c(m18216a(this.f43229n.m21201a(), -1L)).m19022a();
        }
        return bVar2.m19005a(c3275Ei).m19043i(m18228d(this.f43237v.m21201a())).m19032c(m18219a(this.f43231p.m21201a(), true)).m19028c(m18216a(this.f43229n.m21201a(), -1L)).m19022a();
    }

    @Deprecated
    /* renamed from: g */
    public String m18399g(String str) {
        return m18217a(this.f43223h.m21201a(), (String) null);
    }

    @Deprecated
    /* renamed from: h */
    public C3391J9 m18400h(String str) {
        return (C3391J9) m18222b(this.f43218c.m21201a(), str);
    }

    /* renamed from: i */
    public C3391J9 m18401i(String str) {
        return (C3391J9) m18222b(this.f43230o.m21201a(), str);
    }

    /* renamed from: j */
    public C3391J9 m18402j(String str) {
        return (C3391J9) m18222b(this.f43227l.m21201a(), str);
    }

    /* renamed from: k */
    public C3391J9 m18403k(String str) {
        return (C3391J9) m18222b(this.f43220e.m21201a(), str);
    }

    /* renamed from: l */
    public C3391J9 m18404l(String str) {
        return (C3391J9) m18222b(this.f43228m.m21201a(), str);
    }

    @Deprecated
    /* renamed from: m */
    public C3391J9 m18405m(String str) {
        return (C3391J9) m18222b(this.f43223h.m21201a(), str);
    }

    /* renamed from: n */
    public C3391J9 m18406n(String str) {
        return (C3391J9) m18222b(this.f43219d.m21201a(), str);
    }

    /* renamed from: a */
    public C3391J9 m18393a(boolean z) {
        return (C3391J9) m18224b(this.f43231p.m21201a(), z);
    }

    /* renamed from: b */
    public C3391J9 m18394b(long j2) {
        return (C3391J9) m18221b(this.f43229n.m21201a(), j2);
    }

    @Deprecated
    /* renamed from: f */
    public String m18398f(String str) {
        return m18217a(this.f43225j.m21201a(), (String) null);
    }
}
