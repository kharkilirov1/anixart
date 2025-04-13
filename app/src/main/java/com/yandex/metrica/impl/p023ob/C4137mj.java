package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.p023ob.C4082kg;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.mj */
/* loaded from: classes2.dex */
public class C4137mj {

    /* renamed from: a */
    private static final Map<String, Integer> f45958a = Collections.unmodifiableMap(new a());

    /* renamed from: com.yandex.metrica.impl.ob.mj$a */
    public class a extends HashMap<String, Integer> {
        public a() {
            put("BACKGROUND", 0);
            put("FOREGROUND", 2);
            put("VISIBLE", 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01db  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m20403a(@androidx.annotation.NonNull com.yandex.metrica.impl.p023ob.C4371vj r17, @androidx.annotation.NonNull org.json.JSONObject r18) {
        /*
            Method dump skipped, instructions count: 880
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p023ob.C4137mj.m20403a(com.yandex.metrica.impl.ob.vj, org.json.JSONObject):void");
    }

    @NonNull
    /* renamed from: a */
    private static C4082kg.k.a.C7004a m20402a(@Nullable JSONObject jSONObject, boolean z) {
        C4082kg.k.a.C7004a c7004a = new C4082kg.k.a.C7004a();
        Boolean m21251b = C4452ym.m21251b(jSONObject, "last_known_enabled");
        Boolean valueOf = Boolean.valueOf(c7004a.f45737b);
        if (m21251b == null) {
            m21251b = valueOf;
        }
        c7004a.f45737b = m21251b.booleanValue();
        Boolean m21251b2 = C4452ym.m21251b(jSONObject, "scanning_enabled");
        Boolean valueOf2 = Boolean.valueOf(z);
        if (m21251b2 == null) {
            m21251b2 = valueOf2;
        }
        boolean booleanValue = m21251b2.booleanValue();
        c7004a.f45738c = booleanValue;
        if (jSONObject != null && booleanValue) {
            C4082kg.k.a.C7004a.C7005a c7005a = new C4082kg.k.a.C7004a.C7005a();
            Long m21264d = C4452ym.m21264d(jSONObject, "duration_seconds");
            Long valueOf3 = Long.valueOf(c7005a.f45740b);
            if (m21264d == null) {
                m21264d = valueOf3;
            }
            c7005a.f45740b = m21264d.longValue();
            Long m21264d2 = C4452ym.m21264d(jSONObject, "interval_seconds");
            Long valueOf4 = Long.valueOf(c7005a.f45741c);
            if (m21264d2 == null) {
                m21264d2 = valueOf4;
            }
            c7005a.f45741c = m21264d2.longValue();
            c7004a.f45739d = c7005a;
        }
        return c7004a;
    }
}
