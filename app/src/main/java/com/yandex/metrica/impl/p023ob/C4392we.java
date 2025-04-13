package com.yandex.metrica.impl.p023ob;

import android.content.Context;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.we */
/* loaded from: classes2.dex */
public class C4392we extends AbstractC4262re {

    /* renamed from: f */
    private C4444ye f46884f;

    /* renamed from: g */
    private C4444ye f46885g;

    /* renamed from: h */
    private C4444ye f46886h;

    /* renamed from: i */
    private C4444ye f46887i;

    /* renamed from: j */
    private C4444ye f46888j;

    /* renamed from: k */
    private C4444ye f46889k;

    /* renamed from: l */
    private C4444ye f46890l;

    /* renamed from: m */
    private C4444ye f46891m;

    /* renamed from: n */
    private C4444ye f46892n;

    /* renamed from: o */
    private C4444ye f46893o;

    /* renamed from: p */
    public static final C4444ye f46873p = new C4444ye("PREF_KEY_DEVICE_ID_", null);

    /* renamed from: q */
    public static final C4444ye f46874q = new C4444ye("PREF_KEY_UID_", null);

    /* renamed from: r */
    private static final C4444ye f46875r = new C4444ye("PREF_KEY_HOST_URL_", null);

    /* renamed from: s */
    private static final C4444ye f46876s = new C4444ye("PREF_KEY_REPORT_URL_", null);

    /* renamed from: t */
    private static final C4444ye f46877t = new C4444ye("PREF_KEY_GET_AD_URL", null);

    /* renamed from: u */
    private static final C4444ye f46878u = new C4444ye("PREF_KEY_REPORT_AD_URL", null);

    /* renamed from: v */
    private static final C4444ye f46879v = new C4444ye("PREF_KEY_STARTUP_OBTAIN_TIME_", null);

    /* renamed from: w */
    private static final C4444ye f46880w = new C4444ye("PREF_KEY_STARTUP_ENCODED_CLIDS_", null);

    /* renamed from: x */
    private static final C4444ye f46881x = new C4444ye("PREF_KEY_DISTRIBUTION_REFERRER_", null);

    /* renamed from: y */
    public static final C4444ye f46882y = new C4444ye("STARTUP_CLIDS_MATCH_WITH_APP_CLIDS_", null);

    /* renamed from: z */
    public static final C4444ye f46883z = new C4444ye("PREF_KEY_PINNING_UPDATE_URL", null);

    /* renamed from: A */
    private static final C4444ye f46872A = new C4444ye("PREF_KEY_EASY_COLLECTING_ENABLED_", null);

    public C4392we(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public long m21099a(long j2) {
        return this.f46307b.getLong(this.f46890l.m21201a(), j2);
    }

    /* renamed from: b */
    public String m21100b(String str) {
        return this.f46307b.getString(this.f46884f.m21201a(), null);
    }

    /* renamed from: c */
    public String m21101c(String str) {
        return this.f46307b.getString(this.f46891m.m21201a(), null);
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC4262re
    /* renamed from: d */
    public String mo20581d() {
        return "_startupserviceinfopreferences";
    }

    /* renamed from: d */
    public String m21102d(String str) {
        return this.f46307b.getString(this.f46888j.m21201a(), null);
    }

    /* renamed from: e */
    public String m21103e(String str) {
        return this.f46307b.getString(this.f46886h.m21201a(), null);
    }

    /* renamed from: f */
    public String m21104f(String str) {
        return this.f46307b.getString(this.f46889k.m21201a(), null);
    }

    /* renamed from: g */
    public String m21106g(String str) {
        return this.f46307b.getString(this.f46887i.m21201a(), null);
    }

    /* renamed from: h */
    public String m21107h(String str) {
        return this.f46307b.getString(this.f46885g.m21201a(), null);
    }

    /* renamed from: i */
    public C4392we m21108i(String str) {
        return (C4392we) m20658a(this.f46884f.m21201a(), str);
    }

    /* renamed from: j */
    public C4392we m21109j(String str) {
        return (C4392we) m20658a(this.f46885g.m21201a(), str);
    }

    public C4392we(Context context, String str) {
        super(context, str);
        this.f46884f = new C4444ye(f46873p.m21203b());
        this.f46885g = new C4444ye(f46874q.m21203b(), m20660c());
        this.f46886h = new C4444ye(f46875r.m21203b(), m20660c());
        this.f46887i = new C4444ye(f46876s.m21203b(), m20660c());
        this.f46888j = new C4444ye(f46877t.m21203b(), m20660c());
        this.f46889k = new C4444ye(f46878u.m21203b(), m20660c());
        this.f46890l = new C4444ye(f46879v.m21203b(), m20660c());
        this.f46891m = new C4444ye(f46880w.m21203b(), m20660c());
        this.f46892n = new C4444ye(f46881x.m21203b(), m20660c());
        this.f46893o = new C4444ye(f46872A.m21203b(), m20660c());
    }

    /* renamed from: b */
    public static void m21098b(Context context) {
        C4013i.m20029a(context, "_startupserviceinfopreferences").edit().remove(f46873p.m21203b()).apply();
    }

    /* renamed from: f */
    public void m21105f() {
        m20657a(this.f46884f.m21201a()).m20657a(this.f46885g.m21201a()).m20657a(this.f46886h.m21201a()).m20657a(this.f46887i.m21201a()).m20657a(this.f46888j.m21201a()).m20657a(this.f46889k.m21201a()).m20657a(this.f46890l.m21201a()).m20657a(this.f46893o.m21201a()).m20657a(this.f46891m.m21201a()).m20657a(this.f46892n.m21203b()).m20657a(f46882y.m21203b()).m20657a(f46883z.m21203b()).m20659b();
    }
}
