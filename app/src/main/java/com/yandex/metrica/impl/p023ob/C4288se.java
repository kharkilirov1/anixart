package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import java.util.Map;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.se */
/* loaded from: classes2.dex */
public class C4288se extends AbstractC4262re {

    /* renamed from: l */
    private static final C4444ye f46361l = new C4444ye("UUID", null);

    /* renamed from: m */
    private static final C4444ye f46362m = new C4444ye("DEVICEID_3", null);

    /* renamed from: n */
    private static final C4444ye f46363n = new C4444ye("AD_URL_GET", null);

    /* renamed from: o */
    private static final C4444ye f46364o = new C4444ye("AD_URL_REPORT", null);

    /* renamed from: p */
    private static final C4444ye f46365p = new C4444ye("HOST_URL", null);

    /* renamed from: q */
    private static final C4444ye f46366q = new C4444ye("SERVER_TIME_OFFSET", null);

    /* renamed from: r */
    private static final C4444ye f46367r = new C4444ye("CLIDS", null);

    /* renamed from: f */
    private C4444ye f46368f;

    /* renamed from: g */
    private C4444ye f46369g;

    /* renamed from: h */
    private C4444ye f46370h;

    /* renamed from: i */
    private C4444ye f46371i;

    /* renamed from: j */
    private C4444ye f46372j;

    /* renamed from: k */
    private C4444ye f46373k;

    public C4288se(Context context) {
        super(context, null);
        this.f46368f = new C4444ye(f46361l.m21203b());
        this.f46369g = new C4444ye(f46362m.m21203b());
        this.f46370h = new C4444ye(f46363n.m21203b());
        this.f46371i = new C4444ye(f46364o.m21203b());
        new C4444ye(f46365p.m21203b());
        this.f46372j = new C4444ye(f46366q.m21203b());
        this.f46373k = new C4444ye(f46367r.m21203b());
    }

    /* renamed from: a */
    public long m20692a(long j2) {
        return this.f46307b.getLong(this.f46372j.m21203b(), j2);
    }

    /* renamed from: b */
    public String m20693b(String str) {
        return this.f46307b.getString(this.f46370h.m21201a(), null);
    }

    /* renamed from: c */
    public String m20694c(String str) {
        return this.f46307b.getString(this.f46371i.m21201a(), null);
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC4262re
    /* renamed from: d */
    public String mo20581d() {
        return "_startupinfopreferences";
    }

    /* renamed from: d */
    public String m20695d(String str) {
        return this.f46307b.getString(this.f46373k.m21201a(), null);
    }

    /* renamed from: e */
    public String m20696e(String str) {
        return this.f46307b.getString(this.f46369g.m21201a(), null);
    }

    /* renamed from: f */
    public String m20698f(String str) {
        return this.f46307b.getString(this.f46368f.m21201a(), null);
    }

    /* renamed from: g */
    public Map<String, ?> m20699g() {
        return this.f46307b.getAll();
    }

    /* renamed from: f */
    public C4288se m20697f() {
        return (C4288se) m20661e();
    }
}
