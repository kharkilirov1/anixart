package io.reactivex.internal.util;

import io.reactivex.functions.BiFunction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class MergerBiFunction<T> implements BiFunction<List<T>, List<T>, List<T>> {
    @Override // io.reactivex.functions.BiFunction
    public Object apply(Object obj, Object obj2) throws Exception {
        List list = (List) obj;
        List list2 = (List) obj2;
        int size = list2.size() + list.size();
        if (size == 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(size);
        Iterator it = list.iterator();
        Iterator it2 = list2.iterator();
        Object next = it.hasNext() ? it.next() : null;
        Object next2 = it2.hasNext() ? it2.next() : null;
        if (next != null && next2 != null) {
            throw null;
        }
        if (next != null) {
            arrayList.add(next);
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        } else {
            arrayList.add(next2);
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
        }
        return arrayList;
    }
}
