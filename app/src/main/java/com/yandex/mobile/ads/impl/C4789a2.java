package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import com.yandex.mobile.ads.instream.InstreamAdBreakPosition;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.yandex.mobile.ads.impl.a2 */
/* loaded from: classes3.dex */
final class C4789a2 {
    @NonNull
    /* renamed from: a */
    public static ArrayList m22362a(@NonNull String str, @NonNull ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m50 m50Var = (m50) it.next();
            if (m22363a(m50Var, str)) {
                arrayList2.add(m50Var);
            }
        }
        return arrayList2;
    }

    /* renamed from: a */
    private static boolean m22363a(@NonNull m50 m50Var, @NonNull String str) {
        if (!m50Var.getType().equals(str)) {
            return false;
        }
        return InstreamAdBreakPosition.Type.POSITION.equals(m50Var.getAdBreakPosition().getPositionType());
    }
}
