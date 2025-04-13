package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.internal.fuseable.HasUpstreamPublisher;
import java.util.Objects;

/* loaded from: classes3.dex */
abstract class AbstractFlowableWithUpstream<T, R> extends Flowable<R> implements HasUpstreamPublisher<T> {

    /* renamed from: c */
    public final Flowable<T> f59782c;

    public AbstractFlowableWithUpstream(Flowable<T> flowable) {
        Objects.requireNonNull(flowable, "source is null");
        this.f59782c = flowable;
    }
}
