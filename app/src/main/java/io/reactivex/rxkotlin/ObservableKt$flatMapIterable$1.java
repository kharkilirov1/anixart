package io.reactivex.rxkotlin;

import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: observable.kt */
@Metadata(m31882bv = {1, 0, 2}, m31883d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001H\n¢\u0006\u0002\b\u0005"}, m31884d2 = {"<anonymous>", "", "T", "", "it", "apply"}, m31885k = 3, m31886mv = {1, 1, 11})
/* loaded from: classes3.dex */
final class ObservableKt$flatMapIterable$1 implements Function {
    @Override // io.reactivex.functions.Function
    public Object apply(Object obj) {
        Iterable it = (Iterable) obj;
        Intrinsics.m32180i(it, "it");
        return it;
    }
}
