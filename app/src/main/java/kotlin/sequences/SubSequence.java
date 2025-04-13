package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* compiled from: Sequences.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, m31884d2 = {"Lkotlin/sequences/SubSequence;", "T", "Lkotlin/sequences/Sequence;", "Lkotlin/sequences/DropTakeSequence;", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class SubSequence<T> implements Sequence<T>, DropTakeSequence<T> {

    /* renamed from: a */
    @NotNull
    public final Sequence<T> f66780a;

    /* renamed from: b */
    public final int f66781b;

    /* renamed from: c */
    public final int f66782c;

    /* JADX WARN: Multi-variable type inference failed */
    public SubSequence(@NotNull Sequence<? extends T> sequence, int i2, int i3) {
        Intrinsics.m32179h(sequence, "sequence");
        this.f66780a = sequence;
        this.f66781b = i2;
        this.f66782c = i3;
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(C0000a.m7d("startIndex should be non-negative, but is ", i2).toString());
        }
        if (!(i3 >= 0)) {
            throw new IllegalArgumentException(C0000a.m7d("endIndex should be non-negative, but is ", i3).toString());
        }
        if (!(i3 >= i2)) {
            throw new IllegalArgumentException(C0000a.m9f("endIndex should be not less than startIndex, but was ", i3, " < ", i2).toString());
        }
    }

    @Override // kotlin.sequences.DropTakeSequence
    @NotNull
    /* renamed from: a */
    public Sequence<T> mo33822a(int i2) {
        int i3 = this.f66782c;
        int i4 = this.f66781b;
        return i2 >= i3 - i4 ? EmptySequence.f66683a : new SubSequence(this.f66780a, i4 + i2, i3);
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<T> iterator() {
        return new SubSequence$iterator$1(this);
    }
}
