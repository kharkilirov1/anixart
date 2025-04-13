package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: Sequences.kt */
@Metadata(m31883d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m31884d2 = {"<anonymous>", "", "T", "it", "", "invoke"}, m31885k = 3, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes3.dex */
final class SequencesKt__SequencesKt$flatten$2 extends Lambda implements Function1<Iterable<Object>, Iterator<Object>> {
    static {
        new SequencesKt__SequencesKt$flatten$2();
    }

    public SequencesKt__SequencesKt$flatten$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public Iterator<Object> invoke(Iterable<Object> iterable) {
        Iterable<Object> it = iterable;
        Intrinsics.m32179h(it, "it");
        return it.iterator();
    }
}
