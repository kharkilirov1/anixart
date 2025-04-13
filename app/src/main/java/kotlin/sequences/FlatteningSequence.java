package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Sequences.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004¨\u0006\u0005"}, m31884d2 = {"Lkotlin/sequences/FlatteningSequence;", "T", "R", "E", "Lkotlin/sequences/Sequence;", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class FlatteningSequence<T, R, E> implements Sequence<E> {

    /* renamed from: a */
    @NotNull
    public final Sequence<T> f66691a;

    /* renamed from: b */
    @NotNull
    public final Function1<T, R> f66692b;

    /* renamed from: c */
    @NotNull
    public final Function1<R, Iterator<E>> f66693c;

    /* JADX WARN: Multi-variable type inference failed */
    public FlatteningSequence(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends R> transformer, @NotNull Function1<? super R, ? extends Iterator<? extends E>> iterator) {
        Intrinsics.m32179h(sequence, "sequence");
        Intrinsics.m32179h(transformer, "transformer");
        Intrinsics.m32179h(iterator, "iterator");
        this.f66691a = sequence;
        this.f66692b = transformer;
        this.f66693c = iterator;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<E> iterator() {
        return new FlatteningSequence$iterator$1(this);
    }
}
