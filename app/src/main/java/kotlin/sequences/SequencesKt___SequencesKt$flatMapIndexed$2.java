package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: _Sequences.kt */
@Metadata(m31885k = 3, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class SequencesKt___SequencesKt$flatMapIndexed$2 extends FunctionReferenceImpl implements Function1<Sequence<Object>, Iterator<Object>> {
    static {
        new SequencesKt___SequencesKt$flatMapIndexed$2();
    }

    public SequencesKt___SequencesKt$flatMapIndexed$2() {
        super(1, Sequence.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public Iterator<Object> invoke(Sequence<Object> sequence) {
        Sequence<Object> p0 = sequence;
        Intrinsics.m32179h(p0, "p0");
        return p0.iterator();
    }
}
