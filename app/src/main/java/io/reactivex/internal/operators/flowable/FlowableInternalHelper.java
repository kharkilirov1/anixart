package io.reactivex.internal.operators.flowable;

import io.reactivex.Emitter;
import io.reactivex.Flowable;
import io.reactivex.flowables.ConnectableFlowable;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;

/* loaded from: classes3.dex */
public final class FlowableInternalHelper {

    public static final class BufferedReplayCallable<T> implements Callable<ConnectableFlowable<T>> {
        @Override // java.util.concurrent.Callable
        public Object call() throws Exception {
            throw null;
        }
    }

    public static final class BufferedTimedReplay<T> implements Callable<ConnectableFlowable<T>> {
        @Override // java.util.concurrent.Callable
        public Object call() throws Exception {
            throw null;
        }
    }

    public static final class FlatMapIntoIterable<T, U> implements Function<T, Publisher<U>> {
        @Override // io.reactivex.functions.Function
        public Object apply(Object obj) throws Exception {
            throw null;
        }
    }

    public static final class FlatMapWithCombinerInner<U, R, T> implements Function<U, R> {

        /* renamed from: b */
        public final BiFunction<? super T, ? super U, ? extends R> f60281b;

        /* renamed from: c */
        public final T f60282c;

        @Override // io.reactivex.functions.Function
        public R apply(U u) throws Exception {
            return this.f60281b.apply(this.f60282c, u);
        }
    }

    public static final class FlatMapWithCombinerOuter<T, R, U> implements Function<T, Publisher<R>> {
        @Override // io.reactivex.functions.Function
        public Object apply(Object obj) throws Exception {
            throw null;
        }
    }

    public static final class ItemDelayFunction<T, U> implements Function<T, Publisher<T>> {
        @Override // io.reactivex.functions.Function
        public Object apply(Object obj) throws Exception {
            throw null;
        }
    }

    public static final class ReplayCallable<T> implements Callable<ConnectableFlowable<T>> {
        @Override // java.util.concurrent.Callable
        public Object call() throws Exception {
            throw null;
        }
    }

    public static final class ReplayFunction<T, R> implements Function<Flowable<T>, Publisher<R>> {
        @Override // io.reactivex.functions.Function
        public Object apply(Object obj) throws Exception {
            throw null;
        }
    }

    public enum RequestMax implements Consumer<Subscription> {
        /* JADX INFO: Fake field, exist only in values array */
        INSTANCE;

        @Override // io.reactivex.functions.Consumer
        public void accept(Subscription subscription) throws Exception {
            subscription.request(Long.MAX_VALUE);
        }
    }

    public static final class SimpleBiGenerator<T, S> implements BiFunction<S, Emitter<T>, S> {
        @Override // io.reactivex.functions.BiFunction
        public Object apply(Object obj, Object obj2) throws Exception {
            throw null;
        }
    }

    public static final class SimpleGenerator<T, S> implements BiFunction<S, Emitter<T>, S> {
        @Override // io.reactivex.functions.BiFunction
        public Object apply(Object obj, Object obj2) throws Exception {
            throw null;
        }
    }

    public static final class SubscriberOnComplete<T> implements Action {
        @Override // io.reactivex.functions.Action
        public void run() throws Exception {
            throw null;
        }
    }

    public static final class SubscriberOnError<T> implements Consumer<Throwable> {
        @Override // io.reactivex.functions.Consumer
        public void accept(Throwable th) throws Exception {
            throw null;
        }
    }

    public static final class SubscriberOnNext<T> implements Consumer<T> {
        @Override // io.reactivex.functions.Consumer
        public void accept(T t) throws Exception {
            throw null;
        }
    }

    public static final class TimedReplay<T> implements Callable<ConnectableFlowable<T>> {
        @Override // java.util.concurrent.Callable
        public Object call() throws Exception {
            throw null;
        }
    }

    public static final class ZipIterableFunction<T, R> implements Function<List<Publisher<? extends T>>, Publisher<? extends R>> {
        @Override // io.reactivex.functions.Function
        public Object apply(Object obj) throws Exception {
            int i2 = Flowable.f59569b;
            Objects.requireNonNull((Object) null, "zipper is null");
            throw null;
        }
    }

    public FlowableInternalHelper() {
        throw new IllegalStateException("No instances!");
    }
}
