package io.reactivex.rxkotlin;

import io.reactivex.Observable;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.functions.BiFunction;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* compiled from: Observables.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lio/reactivex/rxkotlin/Observables;", "", "rxkotlin"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class Observables {

    /* renamed from: a */
    public static final Observables f62894a = new Observables();

    @SchedulerSupport
    @CheckReturnValue
    /* renamed from: a */
    public final <T1, T2> Observable<Pair<T1, T2>> m31860a(@NotNull Observable<T1> observable, @NotNull Observable<T2> observable2) {
        return Observable.m31362e(observable, observable2, new BiFunction<T1, T2, Pair<? extends T1, ? extends T2>>() { // from class: io.reactivex.rxkotlin.Observables$combineLatest$2
            @Override // io.reactivex.functions.BiFunction
            public Object apply(Object obj, Object obj2) {
                return new Pair(obj, obj2);
            }
        });
    }
}
