package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: com.yandex.metrica.impl.ob.Sk */
/* loaded from: classes2.dex */
public class C3626Sk {

    /* renamed from: a */
    @NonNull
    private final Map<Float, Integer> f44023a = new HashMap();

    public C3626Sk(@NonNull TreeSet<Float> treeSet) {
        Iterator<Float> it = treeSet.descendingSet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            this.f44023a.put(it.next(), Integer.valueOf(i2));
            i2++;
        }
    }

    /* renamed from: a */
    public void m19106a(@NonNull C3278El c3278El) {
        c3278El.f42840s = this.f44023a.get(c3278El.f42834m);
    }
}
