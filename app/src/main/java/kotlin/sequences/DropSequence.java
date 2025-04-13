package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Sequences.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, m31884d2 = {"Lkotlin/sequences/DropSequence;", "T", "Lkotlin/sequences/Sequence;", "Lkotlin/sequences/DropTakeSequence;", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class DropSequence<T> implements Sequence<T>, DropTakeSequence<T> {

    /* renamed from: a */
    @NotNull
    public final Sequence<T> f66679a;

    /* renamed from: b */
    public final int f66680b;

    /* JADX WARN: Multi-variable type inference failed */
    public DropSequence(@NotNull Sequence<? extends T> sequence, int i2) {
        Intrinsics.m32179h(sequence, "sequence");
        this.f66679a = sequence;
        this.f66680b = i2;
        if (i2 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i2 + '.').toString());
    }

    @Override // kotlin.sequences.DropTakeSequence
    @NotNull
    /* renamed from: a */
    public Sequence<T> mo33822a(int i2) {
        int i3 = this.f66680b + i2;
        return i3 < 0 ? new DropSequence(this, i2) : new DropSequence(this.f66679a, i3);
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<T> iterator() {
        return new DropSequence$iterator$1(this);
    }
}
