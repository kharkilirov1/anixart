package io.reactivex.parallel;

import io.reactivex.functions.BiFunction;

/* loaded from: classes3.dex */
public enum ParallelFailureHandling implements BiFunction<Long, Throwable, ParallelFailureHandling> {
    /* JADX INFO: Fake field, exist only in values array */
    STOP,
    /* JADX INFO: Fake field, exist only in values array */
    ERROR,
    /* JADX INFO: Fake field, exist only in values array */
    SKIP,
    /* JADX INFO: Fake field, exist only in values array */
    RETRY;

    @Override // io.reactivex.functions.BiFunction
    public ParallelFailureHandling apply(Long l2, Throwable th) throws Exception {
        return this;
    }
}
