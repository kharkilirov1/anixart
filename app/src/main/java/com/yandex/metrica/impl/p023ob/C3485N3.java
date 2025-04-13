package com.yandex.metrica.impl.p023ob;

import android.content.ContentValues;
import java.util.HashMap;
import java.util.Map;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.N3 */
/* loaded from: classes2.dex */
public final class C3485N3 implements InterfaceC3910e0<Map<String, ? extends String>> {
    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3910e0, kotlin.jvm.functions.Function1
    public Object invoke(ContentValues contentValues) {
        String asString = contentValues.getAsString("clids");
        HashMap<String, String> m21265d = C4452ym.m21265d(asString);
        if (C4452ym.m21266d(m21265d)) {
            return m21265d;
        }
        C3184B2.m17883b(C0000a.m16m("Passed clids (", asString, ") are invalid."), new Object[0]);
        return null;
    }
}
