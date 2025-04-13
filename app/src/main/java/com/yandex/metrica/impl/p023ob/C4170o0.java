package com.yandex.metrica.impl.p023ob;

import android.content.ContentValues;

/* renamed from: com.yandex.metrica.impl.ob.o0 */
/* loaded from: classes2.dex */
class C4170o0 implements InterfaceC3202Bk {

    /* renamed from: a */
    public final /* synthetic */ C4222q0 f46025a;

    public C4170o0(C4222q0 c4222q0) {
        this.f46025a = c4222q0;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3202Bk
    /* renamed from: a */
    public void mo17805a(C3177Ak c3177Ak) {
        ContentValues contentValues;
        ContentValues contentValues2;
        C3700Vj m17840b = c3177Ak.m17840b();
        if (m17840b != null) {
            contentValues2 = this.f46025a.f46219f;
            contentValues2.put("cellular_connection_type", m17840b.m19308m());
        }
        contentValues = this.f46025a.f46219f;
        contentValues.put("call_state", Integer.valueOf(c3177Ak.m17839a()));
    }
}
