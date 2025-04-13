package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
final class h60 {
    @NonNull
    /* renamed from: a */
    public static g60 m25068a(@NonNull ok0 ok0Var, @NonNull List list) {
        int i2;
        if (list.isEmpty()) {
            i2 = 50;
        } else {
            int m29163c = ((v01) list.get(0)).m29163c();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                m29163c = Math.max(m29163c, ((v01) it.next()).m29163c());
            }
            i2 = m29163c;
        }
        return new g60(ok0Var, i2);
    }
}
