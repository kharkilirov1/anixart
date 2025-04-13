package com.yandex.metrica.impl.p023ob;

import android.content.Context;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.ue */
/* loaded from: classes2.dex */
public class C4340ue extends AbstractC4262re {

    /* renamed from: h */
    private static final C4444ye f46604h = new C4444ye("SERVICE_API_LEVEL", null);

    /* renamed from: i */
    private static final C4444ye f46605i = new C4444ye("CLIENT_API_LEVEL", null);

    /* renamed from: f */
    private C4444ye f46606f;

    /* renamed from: g */
    private C4444ye f46607g;

    public C4340ue(Context context) {
        super(context, null);
        this.f46606f = new C4444ye(f46604h.m21203b());
        this.f46607g = new C4444ye(f46605i.m21203b());
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC4262re
    /* renamed from: d */
    public String mo20581d() {
        return "_migrationpreferences";
    }

    /* renamed from: f */
    public int m20885f() {
        return this.f46307b.getInt(this.f46606f.m21201a(), -1);
    }

    /* renamed from: g */
    public C4340ue m20886g() {
        m20657a(this.f46607g.m21201a());
        return this;
    }

    @Deprecated
    /* renamed from: h */
    public C4340ue m20887h() {
        m20657a(this.f46606f.m21201a());
        return this;
    }
}
