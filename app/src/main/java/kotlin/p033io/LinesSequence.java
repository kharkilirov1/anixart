package kotlin.p033io;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* compiled from: ReadWrite.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m31884d2 = {"Lkotlin/io/LinesSequence;", "Lkotlin/sequences/Sequence;", "", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
final class LinesSequence implements Sequence<String> {
    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<String> iterator() {
        return new LinesSequence$iterator$1(this);
    }
}
