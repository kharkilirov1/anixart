package com.yandex.metrica.impl.p023ob;

import android.content.Context;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.xe */
/* loaded from: classes2.dex */
public class C4418xe extends AbstractC4262re {

    /* renamed from: f */
    private C4444ye f46941f;

    public C4418xe(Context context, String str) {
        super(context, null);
        this.f46941f = new C4444ye("LOCATION_TRACKING_ENABLED");
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC4262re
    /* renamed from: d */
    public String mo20581d() {
        return "_serviceproviderspreferences";
    }

    /* renamed from: f */
    public boolean m21147f() {
        return this.f46307b.getBoolean(this.f46941f.m21201a(), false);
    }

    /* renamed from: g */
    public void m21148g() {
        m20657a(this.f46941f.m21201a()).m20659b();
    }
}
