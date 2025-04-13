package io.reactivex.internal.util;

import io.reactivex.functions.BiFunction;
import java.util.List;

/* loaded from: classes3.dex */
public enum ListAddBiConsumer implements BiFunction<List, Object, List> {
    /* JADX INFO: Fake field, exist only in values array */
    INSTANCE;

    @Override // io.reactivex.functions.BiFunction
    public List apply(List list, Object obj) throws Exception {
        List list2 = list;
        list2.add(obj);
        return list2;
    }
}
