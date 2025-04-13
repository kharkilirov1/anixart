package io.reactivex.internal.util;

import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public enum ArrayListSupplier implements Callable<List<Object>>, Function<Object, List<Object>> {
    /* JADX INFO: Fake field, exist only in values array */
    INSTANCE;

    @Override // io.reactivex.functions.Function
    public List<Object> apply(Object obj) throws Exception {
        return new ArrayList();
    }

    @Override // java.util.concurrent.Callable
    public List<Object> call() throws Exception {
        return new ArrayList();
    }
}
