package io.reactivex.processors;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import org.reactivestreams.Processor;

/* loaded from: classes3.dex */
public abstract class FlowableProcessor<T> extends Flowable<T> implements Processor<T, T>, FlowableSubscriber<T> {
    @CheckReturnValue
    @NonNull
    /* renamed from: e */
    public final FlowableProcessor<T> m31853e() {
        return this instanceof SerializedProcessor ? this : new SerializedProcessor(this);
    }
}
