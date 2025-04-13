package kotlin.sequences;

import kotlin.Metadata;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: _Sequences.kt */
@Metadata(m31883d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m31884d2 = {"<anonymous>", "T", "it", "Lkotlin/collections/IndexedValue;", "invoke", "(Lkotlin/collections/IndexedValue;)Ljava/lang/Object;"}, m31885k = 3, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes3.dex */
final class SequencesKt___SequencesKt$filterIndexed$2 extends Lambda implements Function1<IndexedValue<Object>, Object> {
    static {
        new SequencesKt___SequencesKt$filterIndexed$2();
    }

    public SequencesKt___SequencesKt$filterIndexed$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(IndexedValue<Object> indexedValue) {
        IndexedValue<Object> it = indexedValue;
        Intrinsics.m32179h(it, "it");
        return it.f63148b;
    }
}
