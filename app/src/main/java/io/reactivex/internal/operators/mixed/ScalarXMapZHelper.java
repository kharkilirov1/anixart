package io.reactivex.internal.operators.mixed;

import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.MaybeSource;
import io.reactivex.Observer;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;

/* loaded from: classes3.dex */
final class ScalarXMapZHelper {
    public ScalarXMapZHelper() {
        throw new IllegalStateException("No instances!");
    }

    /* renamed from: a */
    public static <T> boolean m31644a(Object obj, Function<? super T, ? extends CompletableSource> function, CompletableObserver completableObserver) {
        return false;
    }

    /* renamed from: b */
    public static <T, R> boolean m31645b(Object obj, Function<? super T, ? extends MaybeSource<? extends R>> function, Observer<? super R> observer) {
        return false;
    }

    /* renamed from: c */
    public static <T, R> boolean m31646c(Object obj, Function<? super T, ? extends SingleSource<? extends R>> function, Observer<? super R> observer) {
        return false;
    }
}
