package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: Sequences.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlin/sequences/FilteringSequence;", "T", "Lkotlin/sequences/Sequence;", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class FilteringSequence<T> implements Sequence<T> {

    /* renamed from: a */
    @NotNull
    public final Sequence<T> f66684a;

    /* renamed from: b */
    public final boolean f66685b;

    /* renamed from: c */
    @NotNull
    public final Function1<T, Boolean> f66686c;

    /* JADX WARN: Multi-variable type inference failed */
    public FilteringSequence(@NotNull Sequence<? extends T> sequence, boolean z, @NotNull Function1<? super T, Boolean> function1) {
        this.f66684a = sequence;
        this.f66685b = z;
        this.f66686c = function1;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<T> iterator() {
        return new FilteringSequence$iterator$1(this);
    }
}
