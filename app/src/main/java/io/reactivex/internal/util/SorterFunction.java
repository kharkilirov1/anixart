package io.reactivex.internal.util;

import io.reactivex.functions.Function;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class SorterFunction<T> implements Function<List<T>, List<T>> {
    @Override // io.reactivex.functions.Function
    public Object apply(Object obj) throws Exception {
        List list = (List) obj;
        Collections.sort(list, null);
        return list;
    }
}
