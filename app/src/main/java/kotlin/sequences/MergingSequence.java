package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Sequences.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004¨\u0006\u0005"}, m31884d2 = {"Lkotlin/sequences/MergingSequence;", "T1", "T2", "V", "Lkotlin/sequences/Sequence;", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class MergingSequence<T1, T2, V> implements Sequence<V> {

    /* renamed from: a */
    @NotNull
    public final Sequence<T1> f66703a;

    /* renamed from: b */
    @NotNull
    public final Sequence<T2> f66704b;

    /* renamed from: c */
    @NotNull
    public final Function2<T1, T2, V> f66705c;

    /* JADX WARN: Multi-variable type inference failed */
    public MergingSequence(@NotNull Sequence<? extends T1> sequence, @NotNull Sequence<? extends T2> sequence2, @NotNull Function2<? super T1, ? super T2, ? extends V> transform) {
        Intrinsics.m32179h(transform, "transform");
        this.f66703a = sequence;
        this.f66704b = sequence2;
        this.f66705c = transform;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<V> iterator() {
        return new MergingSequence$iterator$1(this);
    }
}
