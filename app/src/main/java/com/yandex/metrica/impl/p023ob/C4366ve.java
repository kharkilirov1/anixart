package com.yandex.metrica.impl.p023ob;

import android.content.Context;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.ve */
/* loaded from: classes2.dex */
public class C4366ve extends AbstractC4262re {

    /* renamed from: g */
    private static final C4444ye f46705g = new C4444ye("PREF_KEY_OFFSET", null);

    /* renamed from: f */
    private C4444ye f46706f;

    public C4366ve(Context context, String str) {
        super(context, str);
        this.f46706f = new C4444ye(f46705g.m21203b(), null);
    }

    /* renamed from: a */
    public long m20940a(int i2) {
        return this.f46307b.getLong(this.f46706f.m21201a(), i2);
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC4262re
    /* renamed from: d */
    public String mo20581d() {
        return "_servertimeoffset";
    }

    /* renamed from: f */
    public void m20941f() {
        m20657a(this.f46706f.m21201a()).m20659b();
    }
}
