package io.reactivex;

import io.reactivex.annotations.BackpressureSupport;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.operators.flowable.FlowableFromPublisher;
import io.reactivex.internal.subscribers.StrictSubscriber;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

/* loaded from: classes3.dex */
public abstract class Flowable<T> implements Publisher<T> {

    /* renamed from: b */
    public static final int f59569b = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    @SchedulerSupport
    @BackpressureSupport
    @CheckReturnValue
    @NonNull
    /* renamed from: a */
    public static <T> Flowable<T> m31348a(Publisher<? extends T> publisher) {
        if (publisher instanceof Flowable) {
            return (Flowable) publisher;
        }
        Objects.requireNonNull(publisher, "source is null");
        return new FlowableFromPublisher(publisher);
    }

    @SchedulerSupport
    @BackpressureSupport
    /* renamed from: b */
    public final void m31349b(FlowableSubscriber<? super T> flowableSubscriber) {
        Objects.requireNonNull(flowableSubscriber, "s is null");
        try {
            mo31350c(flowableSubscriber);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            Exceptions.m31402a(th);
            RxJavaPlugins.m31848b(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* renamed from: c */
    public abstract void mo31350c(Subscriber<? super T> subscriber);

    @Override // org.reactivestreams.Publisher
    @SchedulerSupport
    @BackpressureSupport
    /* renamed from: g */
    public final void mo31351g(Subscriber<? super T> subscriber) {
        if (subscriber instanceof FlowableSubscriber) {
            m31349b((FlowableSubscriber) subscriber);
        } else {
            Objects.requireNonNull(subscriber, "s is null");
            m31349b(new StrictSubscriber(subscriber));
        }
    }
}
