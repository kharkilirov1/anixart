package io.reactivex.internal.operators.observable;

import io.reactivex.Emitter;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.observables.ConnectableObservable;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class ObservableInternalHelper {

    public static final class BufferedReplayCallable<T> implements Callable<ConnectableObservable<T>> {
        @Override // java.util.concurrent.Callable
        public Object call() throws Exception {
            throw null;
        }
    }

    public static final class BufferedTimedReplayCallable<T> implements Callable<ConnectableObservable<T>> {
        @Override // java.util.concurrent.Callable
        public Object call() throws Exception {
            throw null;
        }
    }

    public static final class FlatMapIntoIterable<T, U> implements Function<T, ObservableSource<U>> {
        @Override // io.reactivex.functions.Function
        public Object apply(Object obj) throws Exception {
            throw null;
        }
    }

    public static final class FlatMapWithCombinerInner<U, R, T> implements Function<U, R> {

        /* renamed from: b */
        public final BiFunction<? super T, ? super U, ? extends R> f61763b;

        /* renamed from: c */
        public final T f61764c;

        @Override // io.reactivex.functions.Function
        public R apply(U u) throws Exception {
            return this.f61763b.apply(this.f61764c, u);
        }
    }

    public static final class FlatMapWithCombinerOuter<T, R, U> implements Function<T, ObservableSource<R>> {
        @Override // io.reactivex.functions.Function
        public Object apply(Object obj) throws Exception {
            throw null;
        }
    }

    public static final class ItemDelayFunction<T, U> implements Function<T, ObservableSource<T>> {
        @Override // io.reactivex.functions.Function
        public Object apply(Object obj) throws Exception {
            throw null;
        }
    }

    public enum MapToInt implements Function<Object, Object> {
        /* JADX INFO: Fake field, exist only in values array */
        INSTANCE;

        @Override // io.reactivex.functions.Function
        public Object apply(Object obj) throws Exception {
            return 0;
        }
    }

    public static final class ObserverOnComplete<T> implements Action {
        @Override // io.reactivex.functions.Action
        public void run() throws Exception {
            throw null;
        }
    }

    public static final class ObserverOnError<T> implements Consumer<Throwable> {
        @Override // io.reactivex.functions.Consumer
        public void accept(Throwable th) throws Exception {
            throw null;
        }
    }

    public static final class ObserverOnNext<T> implements Consumer<T> {
        @Override // io.reactivex.functions.Consumer
        public void accept(T t) throws Exception {
            throw null;
        }
    }

    public static final class ReplayCallable<T> implements Callable<ConnectableObservable<T>> {
        @Override // java.util.concurrent.Callable
        public Object call() throws Exception {
            throw null;
        }
    }

    public static final class ReplayFunction<T, R> implements Function<Observable<T>, ObservableSource<R>> {
        @Override // io.reactivex.functions.Function
        public Object apply(Object obj) throws Exception {
            throw null;
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

    public static final class TimedReplayCallable<T> implements Callable<ConnectableObservable<T>> {
        @Override // java.util.concurrent.Callable
        public Object call() throws Exception {
            throw null;
        }
    }

    public static final class ZipIterableFunction<T, R> implements Function<List<ObservableSource<? extends T>>, ObservableSource<? extends R>> {
        @Override // io.reactivex.functions.Function
        public Object apply(Object obj) throws Exception {
            int i2 = Flowable.f59569b;
            Objects.requireNonNull((Object) null, "zipper is null");
            throw null;
        }
    }

    public ObservableInternalHelper() {
        throw new IllegalStateException("No instances!");
    }
}
