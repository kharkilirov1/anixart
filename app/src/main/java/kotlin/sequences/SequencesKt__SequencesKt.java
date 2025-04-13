package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Sequences.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"kotlin-stdlib"}, m31885k = 5, m31886mv = {1, 7, 1}, m31889xs = "kotlin/sequences/SequencesKt")
/* loaded from: classes3.dex */
class SequencesKt__SequencesKt extends SequencesKt__SequencesJVMKt {
    @NotNull
    /* renamed from: a */
    public static final <T> Sequence<T> m33859a(@NotNull Sequence<? extends Sequence<? extends T>> sequence) {
        SequencesKt__SequencesKt$flatten$1 iterator = new Function1<Sequence<? extends T>, Iterator<? extends T>>() { // from class: kotlin.sequences.SequencesKt__SequencesKt$flatten$1
            @Override // kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                Sequence it = (Sequence) obj;
                Intrinsics.m32179h(it, "it");
                return it.iterator();
            }
        };
        if (!(sequence instanceof TransformingSequence)) {
            return new FlatteningSequence(sequence, new Function1<Object, Object>() { // from class: kotlin.sequences.SequencesKt__SequencesKt$flatten$3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return obj;
                }
            }, iterator);
        }
        TransformingSequence transformingSequence = (TransformingSequence) sequence;
        Intrinsics.m32179h(iterator, "iterator");
        return new FlatteningSequence(transformingSequence.f66795a, transformingSequence.f66796b, iterator);
    }
}
