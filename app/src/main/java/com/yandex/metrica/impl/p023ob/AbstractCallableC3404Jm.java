package com.yandex.metrica.impl.p023ob;

import androidx.annotation.Nullable;
import java.util.concurrent.Callable;

/* renamed from: com.yandex.metrica.impl.ob.Jm */
/* loaded from: classes2.dex */
public abstract class AbstractCallableC3404Jm<T> implements Callable<T> {
    /* renamed from: a */
    public abstract T mo18416a() throws Exception;

    @Override // java.util.concurrent.Callable
    @Nullable
    public T call() {
        try {
            return mo18416a();
        } catch (Throwable unused) {
            return null;
        }
    }
}
