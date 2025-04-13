package io.reactivex.rxkotlin;

import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: completable.kt */
@Metadata(m31882bv = {1, 0, 2}, m31883d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m31884d2 = {"<anonymous>", "Lio/reactivex/Completable;", "it", "apply"}, m31885k = 3, m31886mv = {1, 1, 11})
/* loaded from: classes3.dex */
final class CompletableKt$mergeAllCompletables$2<T, R> implements Function<Completable, CompletableSource> {
    @Override // io.reactivex.functions.Function
    public CompletableSource apply(Completable completable) {
        Completable it = completable;
        Intrinsics.m32180i(it, "it");
        return it;
    }
}
