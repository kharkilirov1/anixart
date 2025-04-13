package io.reactivex.internal.util;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public enum HashMapSupplier implements Callable<Map<Object, Object>> {
    /* JADX INFO: Fake field, exist only in values array */
    INSTANCE;

    @Override // java.util.concurrent.Callable
    public Map<Object, Object> call() throws Exception {
        return new HashMap();
    }
}
