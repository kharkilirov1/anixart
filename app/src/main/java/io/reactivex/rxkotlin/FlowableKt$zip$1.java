package io.reactivex.rxkotlin;

import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: flowable.kt */
@Metadata(m31882bv = {1, 0, 2}, m31883d1 = {"\u0000\u0012\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0001*\u00020\u00032*\u0010\u0004\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00030\u0003 \u0006*\u0012\u0012\u000e\b\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00030\u00030\u00050\u0005H\n¢\u0006\u0004\b\u0007\u0010\b"}, m31884d2 = {"<anonymous>", "R", "T", "", "it", "", "kotlin.jvm.PlatformType", "apply", "([Ljava/lang/Object;)Ljava/lang/Object;"}, m31885k = 3, m31886mv = {1, 1, 11})
/* loaded from: classes3.dex */
public final class FlowableKt$zip$1<T, R> implements Function<Object[], R> {
    @Override // io.reactivex.functions.Function
    public Object apply(Object[] objArr) {
        Object[] it = objArr;
        Intrinsics.m32180i(it, "it");
        List m31957g = ArraysKt.m31957g(it);
        ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(m31957g, 10));
        for (T t : m31957g) {
            if (t == null) {
                throw new TypeCastException("null cannot be cast to non-null type T");
            }
            arrayList.add(t);
        }
        throw null;
    }
}
