package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeSource;
import io.reactivex.functions.Function;
import org.reactivestreams.Publisher;

/* loaded from: classes3.dex */
public enum MaybeToPublisher implements Function<MaybeSource<Object>, Publisher<Object>> {
    /* JADX INFO: Fake field, exist only in values array */
    INSTANCE;

    @Override // io.reactivex.functions.Function
    public Publisher<Object> apply(MaybeSource<Object> maybeSource) throws Exception {
        return new MaybeToFlowable(maybeSource);
    }
}
