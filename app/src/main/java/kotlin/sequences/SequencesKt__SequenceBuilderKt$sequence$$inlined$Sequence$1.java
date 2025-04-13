package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* compiled from: Sequences.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m31884d2 = {"kotlin/sequences/SequencesKt__SequencesKt$Sequence$1", "Lkotlin/sequences/Sequence;", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class SequencesKt__SequenceBuilderKt$sequence$$inlined$Sequence$1 implements Sequence<Object> {

    /* renamed from: a */
    public final /* synthetic */ Function2 f66713a;

    public SequencesKt__SequenceBuilderKt$sequence$$inlined$Sequence$1(Function2 function2) {
        this.f66713a = function2;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<Object> iterator() {
        return SequencesKt.m33850r(this.f66713a);
    }
}
