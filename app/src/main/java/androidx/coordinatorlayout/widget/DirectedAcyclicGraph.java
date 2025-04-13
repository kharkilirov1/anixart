package androidx.coordinatorlayout.widget;

import androidx.annotation.RestrictTo;
import androidx.collection.SimpleArrayMap;
import androidx.core.util.Pools;
import java.util.ArrayList;
import java.util.HashSet;

@RestrictTo
/* loaded from: classes.dex */
public final class DirectedAcyclicGraph<T> {

    /* renamed from: a */
    public final Pools.Pool<ArrayList<T>> f3089a = new Pools.SimplePool(10);

    /* renamed from: b */
    public final SimpleArrayMap<T, ArrayList<T>> f3090b = new SimpleArrayMap<>();

    /* renamed from: c */
    public final ArrayList<T> f3091c = new ArrayList<>();

    /* renamed from: d */
    public final HashSet<T> f3092d = new HashSet<>();

    /* renamed from: a */
    public final void m1513a(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t)) {
            return;
        }
        if (hashSet.contains(t)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(t);
        ArrayList<T> arrayList2 = this.f3090b.get(t);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                m1513a(arrayList2.get(i2), arrayList, hashSet);
            }
        }
        hashSet.remove(t);
        arrayList.add(t);
    }
}
