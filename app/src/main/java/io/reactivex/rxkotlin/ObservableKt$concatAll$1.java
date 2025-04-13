package io.reactivex.rxkotlin;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: observable.kt */
@Metadata(m31882bv = {1, 0, 2}, m31883d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001H\n¢\u0006\u0002\b\u0005"}, m31884d2 = {"<anonymous>", "Lio/reactivex/Observable;", "T", "", "it", "apply"}, m31885k = 3, m31886mv = {1, 1, 11})
/* loaded from: classes3.dex */
final class ObservableKt$concatAll$1<T, R> implements Function<T, ObservableSource<? extends R>> {
    @Override // io.reactivex.functions.Function
    public Object apply(Object obj) {
        Observable it = (Observable) obj;
        Intrinsics.m32180i(it, "it");
        return it;
    }
}
