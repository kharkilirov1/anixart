package kotlin.sequences;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: _Sequences.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"kotlin-stdlib"}, m31885k = 5, m31886mv = {1, 7, 1}, m31889xs = "kotlin/sequences/SequencesKt")
/* loaded from: classes3.dex */
class SequencesKt___SequencesKt extends SequencesKt___SequencesJvmKt {
    @NotNull
    /* renamed from: b */
    public static final <T, C extends Collection<? super T>> C m33860b(@NotNull Sequence<? extends T> sequence, @NotNull C c2) {
        Iterator<? extends T> it = sequence.iterator();
        while (it.hasNext()) {
            c2.add(it.next());
        }
        return c2;
    }
}
