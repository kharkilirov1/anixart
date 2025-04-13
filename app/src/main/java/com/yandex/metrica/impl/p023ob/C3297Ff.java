package com.yandex.metrica.impl.p023ob;

import android.util.SparseArray;

/* renamed from: com.yandex.metrica.impl.ob.Ff */
/* loaded from: classes2.dex */
public class C3297Ff {

    /* renamed from: a */
    private static SparseArray<String> f42908a;

    static {
        SparseArray<String> sparseArray = new SparseArray<>();
        f42908a = sparseArray;
        sparseArray.put(0, "String");
        f42908a.put(1, "Number");
        f42908a.put(2, "Counter");
    }

    /* renamed from: a */
    public static String m18100a(int i2) {
        return f42908a.get(i2);
    }
}
