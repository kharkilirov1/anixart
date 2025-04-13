package io.reactivex.rxkotlin;

import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: observable.kt */
@Metadata(m31882bv = {1, 0, 2}, m31883d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002\"\b\b\u0001\u0010\u0003*\u00020\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m31884d2 = {"<anonymous>", "A", "", "B", "it", "Lkotlin/Pair;", "apply", "(Lkotlin/Pair;)Ljava/lang/Object;"}, m31885k = 3, m31886mv = {1, 1, 11})
/* loaded from: classes3.dex */
final class ObservableKt$toMap$1 implements Function {
    @Override // io.reactivex.functions.Function
    public Object apply(Object obj) {
        Pair it = (Pair) obj;
        Intrinsics.m32180i(it, "it");
        return it.f63055b;
    }
}
