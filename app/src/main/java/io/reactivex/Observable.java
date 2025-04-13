package io.reactivex;

import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function6;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.LambdaObserver;
import io.reactivex.internal.operators.observable.ObservableCombineLatest;
import io.reactivex.internal.operators.observable.ObservableDoOnEach;
import io.reactivex.internal.operators.observable.ObservableDoOnLifecycle;
import io.reactivex.internal.operators.observable.ObservableEmpty;
import io.reactivex.internal.operators.observable.ObservableObserveOn;
import io.reactivex.internal.operators.observable.ObservableSubscribeOn;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;

/* loaded from: classes3.dex */
public abstract class Observable<T> implements ObservableSource<T> {

    /* renamed from: io.reactivex.Observable$1 */
    public static /* synthetic */ class C65061 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f59572a;

        static {
            int[] iArr = new int[BackpressureStrategy.values().length];
            f59572a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f59572a[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f59572a[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f59572a[1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @SchedulerSupport
    @CheckReturnValue
    @NonNull
    /* renamed from: d */
    public static <T1, T2, T3, T4, T5, T6, R> Observable<R> m31361d(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, ObservableSource<? extends T3> observableSource3, ObservableSource<? extends T4> observableSource4, ObservableSource<? extends T5> observableSource5, ObservableSource<? extends T6> observableSource6, Function6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> function6) {
        return m31363f(Functions.m31424d(function6), Flowable.f59569b, observableSource, observableSource2, observableSource3, observableSource4, observableSource5, observableSource6);
    }

    @SchedulerSupport
    @CheckReturnValue
    @NonNull
    /* renamed from: e */
    public static <T1, T2, R> Observable<R> m31362e(ObservableSource<? extends T1> observableSource, ObservableSource<? extends T2> observableSource2, BiFunction<? super T1, ? super T2, ? extends R> biFunction) {
        return m31363f(Functions.m31422b(biFunction), Flowable.f59569b, observableSource, observableSource2);
    }

    @SchedulerSupport
    @CheckReturnValue
    /* renamed from: f */
    public static <T, R> Observable<R> m31363f(Function<? super Object[], ? extends R> function, int i2, ObservableSource<? extends T>... observableSourceArr) {
        if (observableSourceArr.length == 0) {
            return (Observable<R>) ObservableEmpty.f61634b;
        }
        ObjectHelper.m31427c(i2, "bufferSize");
        return new ObservableCombineLatest(observableSourceArr, null, function, i2 << 1, false);
    }

    @Override // io.reactivex.ObservableSource
    @SchedulerSupport
    /* renamed from: c */
    public final void mo31364c(Observer<? super T> observer) {
        Objects.requireNonNull(observer, "observer is null");
        try {
            mo31371m(observer);
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

    @SchedulerSupport
    @CheckReturnValue
    /* renamed from: g */
    public final Observable<T> m31365g(Action action) {
        Consumer<? super T> consumer = Functions.f59622c;
        return m31366h(consumer, consumer, Functions.f59621b, action);
    }

    @SchedulerSupport
    @CheckReturnValue
    /* renamed from: h */
    public final Observable<T> m31366h(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, Action action2) {
        return new ObservableDoOnEach(this, consumer, consumer2, action, action2);
    }

    @SchedulerSupport
    @CheckReturnValue
    /* renamed from: i */
    public final Observable<T> m31367i(Consumer<? super Disposable> consumer) {
        return new ObservableDoOnLifecycle(this, consumer, Functions.f59621b);
    }

    @SchedulerSupport
    @CheckReturnValue
    /* renamed from: j */
    public final Observable<T> m31368j(Action action) {
        return m31366h(Functions.f59622c, Functions.m31421a(action), action, Functions.f59621b);
    }

    @SchedulerSupport
    @CheckReturnValue
    /* renamed from: k */
    public final Observable<T> m31369k(Scheduler scheduler) {
        int i2 = Flowable.f59569b;
        ObjectHelper.m31427c(i2, "bufferSize");
        return new ObservableObserveOn(this, scheduler, false, i2);
    }

    @SchedulerSupport
    @CheckReturnValue
    /* renamed from: l */
    public final Disposable m31370l(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, Consumer<? super Disposable> consumer3) {
        Objects.requireNonNull(consumer, "onNext is null");
        Objects.requireNonNull(consumer2, "onError is null");
        LambdaObserver lambdaObserver = new LambdaObserver(consumer, consumer2, action, consumer3);
        mo31364c(lambdaObserver);
        return lambdaObserver;
    }

    /* renamed from: m */
    public abstract void mo31371m(Observer<? super T> observer);

    @SchedulerSupport
    @CheckReturnValue
    /* renamed from: n */
    public final Observable<T> m31372n(Scheduler scheduler) {
        Objects.requireNonNull(scheduler, "scheduler is null");
        return new ObservableSubscribeOn(this, scheduler);
    }
}
