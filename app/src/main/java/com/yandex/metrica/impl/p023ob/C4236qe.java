package com.yandex.metrica.impl.p023ob;

import android.content.Context;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.qe */
/* loaded from: classes2.dex */
public class C4236qe extends AbstractC4262re {

    /* renamed from: j */
    public static final /* synthetic */ int f46233j = 0;

    /* renamed from: f */
    private final C4444ye f46234f;

    /* renamed from: g */
    private final C4444ye f46235g;

    /* renamed from: h */
    private final C4444ye f46236h;

    /* renamed from: i */
    private final C4444ye f46237i;

    public C4236qe(Context context, String str) {
        super(context, str);
        this.f46234f = new C4444ye("init_event_pref_key", m20660c());
        this.f46235g = new C4444ye("init_event_pref_key");
        this.f46236h = new C4444ye("first_event_pref_key", m20660c());
        this.f46237i = new C4444ye("fitst_event_description_key", m20660c());
    }

    /* renamed from: a */
    private void m20578a(C4444ye c4444ye) {
        this.f46307b.edit().remove(c4444ye.m21201a()).apply();
    }

    @Deprecated
    /* renamed from: b */
    public String m20579b(String str) {
        return this.f46307b.getString(this.f46235g.m21201a(), null);
    }

    /* renamed from: c */
    public String m20580c(String str) {
        return this.f46307b.getString(this.f46236h.m21201a(), null);
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC4262re
    /* renamed from: d */
    public String mo20581d() {
        return "_initpreferences";
    }

    /* renamed from: d */
    public String m20582d(String str) {
        return this.f46307b.getString(this.f46234f.m21201a(), null);
    }

    @Deprecated
    /* renamed from: f */
    public void m20583f() {
        m20578a(this.f46235g);
    }

    /* renamed from: g */
    public void m20584g() {
        m20578a(this.f46237i);
    }

    /* renamed from: h */
    public void m20585h() {
        m20578a(this.f46236h);
    }

    /* renamed from: i */
    public void m20586i() {
        m20578a(this.f46234f);
    }

    /* renamed from: j */
    public void m20587j() {
        m20658a(this.f46234f.m21201a(), "DONE").m20659b();
    }
}
