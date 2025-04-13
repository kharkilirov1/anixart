package kotlin.text;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* compiled from: Strings.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m31884d2 = {"Lkotlin/text/DelimitedRangesSequence;", "Lkotlin/sequences/Sequence;", "Lkotlin/ranges/IntRange;", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
final class DelimitedRangesSequence implements Sequence<IntRange> {

    /* renamed from: a */
    @NotNull
    public final CharSequence f66858a;

    /* renamed from: b */
    public final int f66859b;

    /* renamed from: c */
    public final int f66860c;

    /* renamed from: d */
    @NotNull
    public final Function2<CharSequence, Integer, Pair<Integer, Integer>> f66861d;

    /* JADX WARN: Multi-variable type inference failed */
    public DelimitedRangesSequence(@NotNull CharSequence input, int i2, int i3, @NotNull Function2<? super CharSequence, ? super Integer, Pair<Integer, Integer>> function2) {
        Intrinsics.m32179h(input, "input");
        this.f66858a = input;
        this.f66859b = i2;
        this.f66860c = i3;
        this.f66861d = function2;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public Iterator<IntRange> iterator() {
        return new DelimitedRangesSequence$iterator$1(this);
    }
}
