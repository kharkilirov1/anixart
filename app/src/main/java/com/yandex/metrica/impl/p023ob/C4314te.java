package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.p023ob.C3156A;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.te */
/* loaded from: classes2.dex */
public class C4314te extends AbstractC4262re {

    /* renamed from: f */
    private C4444ye f46532f;

    /* renamed from: g */
    private C4444ye f46533g;

    /* renamed from: h */
    private C4444ye f46534h;

    /* renamed from: i */
    private C4444ye f46535i;

    /* renamed from: j */
    private C4444ye f46536j;

    /* renamed from: k */
    private C4444ye f46537k;

    /* renamed from: l */
    private C4444ye f46538l;

    /* renamed from: m */
    private C4444ye f46539m;

    /* renamed from: n */
    private C4444ye f46540n;

    /* renamed from: o */
    private C4444ye f46541o;

    /* renamed from: p */
    private C4444ye f46542p;

    /* renamed from: q */
    private C4444ye f46543q;

    /* renamed from: r */
    private C4444ye f46544r;

    /* renamed from: s */
    private C4444ye f46545s;

    /* renamed from: t */
    private C4444ye f46546t;

    /* renamed from: u */
    private static final C4444ye f46526u = new C4444ye("SESSION_SLEEP_START_", null);

    /* renamed from: v */
    private static final C4444ye f46527v = new C4444ye("SESSION_ID_", null);

    /* renamed from: w */
    private static final C4444ye f46528w = new C4444ye("SESSION_COUNTER_ID_", null);

    /* renamed from: x */
    private static final C4444ye f46529x = new C4444ye("SESSION_INIT_TIME_", null);

    /* renamed from: y */
    private static final C4444ye f46530y = new C4444ye("SESSION_ALIVE_TIME_", null);

    /* renamed from: z */
    private static final C4444ye f46531z = new C4444ye("SESSION_IS_ALIVE_REPORT_NEEDED_", null);

    /* renamed from: A */
    private static final C4444ye f46515A = new C4444ye("BG_SESSION_ID_", null);

    /* renamed from: B */
    private static final C4444ye f46516B = new C4444ye("BG_SESSION_SLEEP_START_", null);

    /* renamed from: C */
    private static final C4444ye f46517C = new C4444ye("BG_SESSION_COUNTER_ID_", null);

    /* renamed from: D */
    private static final C4444ye f46518D = new C4444ye("BG_SESSION_INIT_TIME_", null);

    /* renamed from: E */
    private static final C4444ye f46519E = new C4444ye("IDENTITY_SEND_TIME_", null);

    /* renamed from: F */
    private static final C4444ye f46520F = new C4444ye("USER_INFO_", null);

    /* renamed from: G */
    private static final C4444ye f46521G = new C4444ye("REFERRER_", null);

    /* renamed from: H */
    @Deprecated
    public static final C4444ye f46522H = new C4444ye("APP_ENVIRONMENT", null);

    /* renamed from: I */
    @Deprecated
    public static final C4444ye f46523I = new C4444ye("APP_ENVIRONMENT_REVISION", null);

    /* renamed from: J */
    private static final C4444ye f46524J = new C4444ye("APP_ENVIRONMENT_", null);

    /* renamed from: K */
    private static final C4444ye f46525K = new C4444ye("APP_ENVIRONMENT_REVISION_", null);

    public C4314te(Context context, String str) {
        super(context, str);
        this.f46532f = new C4444ye(f46526u.m21203b(), m20660c());
        this.f46533g = new C4444ye(f46527v.m21203b(), m20660c());
        this.f46534h = new C4444ye(f46528w.m21203b(), m20660c());
        this.f46535i = new C4444ye(f46529x.m21203b(), m20660c());
        this.f46536j = new C4444ye(f46530y.m21203b(), m20660c());
        this.f46537k = new C4444ye(f46531z.m21203b(), m20660c());
        this.f46538l = new C4444ye(f46515A.m21203b(), m20660c());
        this.f46539m = new C4444ye(f46516B.m21203b(), m20660c());
        this.f46540n = new C4444ye(f46517C.m21203b(), m20660c());
        this.f46541o = new C4444ye(f46518D.m21203b(), m20660c());
        this.f46542p = new C4444ye(f46519E.m21203b(), m20660c());
        this.f46543q = new C4444ye(f46520F.m21203b(), m20660c());
        this.f46544r = new C4444ye(f46521G.m21203b(), m20660c());
        this.f46545s = new C4444ye(f46524J.m21203b(), m20660c());
        this.f46546t = new C4444ye(f46525K.m21203b(), m20660c());
        m20814a(-1);
        m20816c(0);
        m20815b(0);
    }

    /* renamed from: a */
    public long m20817a(long j2) {
        return this.f46307b.getLong(this.f46541o.m21201a(), j2);
    }

    /* renamed from: b */
    public long m20820b(long j2) {
        return this.f46307b.getLong(this.f46540n.m21201a(), j2);
    }

    /* renamed from: c */
    public long m20822c(long j2) {
        return this.f46307b.getLong(this.f46538l.m21201a(), j2);
    }

    /* renamed from: d */
    public long m20823d(long j2) {
        return this.f46307b.getLong(this.f46539m.m21201a(), j2);
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC4262re
    /* renamed from: d */
    public String mo20581d() {
        return "_boundentrypreferences";
    }

    /* renamed from: e */
    public long m20824e(long j2) {
        return this.f46307b.getLong(this.f46535i.m21201a(), j2);
    }

    /* renamed from: f */
    public long m20825f(long j2) {
        return this.f46307b.getLong(this.f46534h.m21201a(), j2);
    }

    /* renamed from: g */
    public long m20827g(long j2) {
        return this.f46307b.getLong(this.f46533g.m21201a(), j2);
    }

    /* renamed from: h */
    public long m20829h(long j2) {
        return this.f46307b.getLong(this.f46532f.m21201a(), j2);
    }

    /* renamed from: i */
    public long m20831i(long j2) {
        return this.f46307b.getLong(this.f46542p.m21201a(), j2);
    }

    /* renamed from: c */
    private void m20816c(int i2) {
        C4013i.m20033a(this.f46307b, this.f46532f.m21201a(), i2);
    }

    /* renamed from: a */
    public Boolean m20819a(boolean z) {
        return Boolean.valueOf(this.f46307b.getBoolean(this.f46537k.m21201a(), z));
    }

    /* renamed from: b */
    public String m20821b(String str) {
        return this.f46307b.getString(this.f46543q.m21201a(), null);
    }

    @Nullable
    /* renamed from: f */
    public C3156A.a m20826f() {
        synchronized (this) {
            if (!this.f46307b.contains(this.f46545s.m21201a()) || !this.f46307b.contains(this.f46546t.m21201a())) {
                return null;
            }
            return new C3156A.a(this.f46307b.getString(this.f46545s.m21201a(), "{}"), this.f46307b.getLong(this.f46546t.m21201a(), 0L));
        }
    }

    /* renamed from: g */
    public boolean m20828g() {
        return this.f46307b.contains(this.f46535i.m21201a()) || this.f46307b.contains(this.f46536j.m21201a()) || this.f46307b.contains(this.f46537k.m21201a()) || this.f46307b.contains(this.f46532f.m21201a()) || this.f46307b.contains(this.f46533g.m21201a()) || this.f46307b.contains(this.f46534h.m21201a()) || this.f46307b.contains(this.f46541o.m21201a()) || this.f46307b.contains(this.f46539m.m21201a()) || this.f46307b.contains(this.f46538l.m21201a()) || this.f46307b.contains(this.f46540n.m21201a()) || this.f46307b.contains(this.f46545s.m21201a()) || this.f46307b.contains(this.f46543q.m21201a()) || this.f46307b.contains(this.f46544r.m21201a()) || this.f46307b.contains(this.f46542p.m21201a());
    }

    /* renamed from: h */
    public void m20830h() {
        this.f46307b.edit().remove(this.f46541o.m21201a()).remove(this.f46540n.m21201a()).remove(this.f46538l.m21201a()).remove(this.f46539m.m21201a()).remove(this.f46535i.m21201a()).remove(this.f46534h.m21201a()).remove(this.f46533g.m21201a()).remove(this.f46532f.m21201a()).remove(this.f46537k.m21201a()).remove(this.f46536j.m21201a()).remove(this.f46543q.m21201a()).remove(this.f46545s.m21201a()).remove(this.f46546t.m21201a()).remove(this.f46544r.m21201a()).remove(this.f46542p.m21201a()).apply();
    }

    /* renamed from: i */
    public C4314te m20832i() {
        return (C4314te) m20657a(this.f46544r.m21201a());
    }

    /* renamed from: b */
    private void m20815b(int i2) {
        C4013i.m20033a(this.f46307b, this.f46534h.m21201a(), i2);
    }

    /* renamed from: a */
    public C4314te m20818a(C3156A.a aVar) {
        synchronized (this) {
            m20658a(this.f46545s.m21201a(), aVar.f42518a);
            m20658a(this.f46546t.m21201a(), Long.valueOf(aVar.f42519b));
        }
        return this;
    }

    /* renamed from: a */
    private void m20814a(int i2) {
        C4013i.m20033a(this.f46307b, this.f46536j.m21201a(), i2);
    }
}
