package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.push.common.CoreConstants;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.j1 */
/* loaded from: classes2.dex */
public class C4041j1 {

    /* renamed from: com.yandex.metrica.impl.ob.j1$a */
    public static class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    @NonNull
    /* renamed from: a */
    public static String m20076a(int i2) {
        Map<String, Integer> map = C3159A2.f42525a;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue().intValue() == i2) {
                arrayList.add(entry.getKey());
            }
        }
        return arrayList.size() == 1 ? (String) arrayList.get(0) : arrayList.size() != 0 ? String.format("One of %s", arrayList) : CoreConstants.Transport.UNKNOWN;
    }

    /* renamed from: a */
    public static boolean m20077a(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
