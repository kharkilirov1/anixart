package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

/* compiled from: _Sequences.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m31884d2 = {"kotlin/sequences/SequencesKt___SequencesKt$minus$1", "Lkotlin/sequences/Sequence;", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class SequencesKt___SequencesKt$minus$1 implements Sequence<Object> {
    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<Object> iterator() {
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        final Object obj = null;
        return ((FilteringSequence) SequencesKt.m33841i(null, new Function1<Object, Boolean>(obj) { // from class: kotlin.sequences.SequencesKt___SequencesKt$minus$1$iterator$1

            /* renamed from: c */
            public final /* synthetic */ Object f66741c = null;

            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(Object obj2) {
                boolean z = true;
                if (!Ref.BooleanRef.this.f63347b && Intrinsics.m32174c(obj2, this.f66741c)) {
                    Ref.BooleanRef.this.f63347b = true;
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        })).iterator();
    }
}
