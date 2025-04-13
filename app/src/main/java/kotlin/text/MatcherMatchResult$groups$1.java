package kotlin.text;

import java.util.Iterator;
import java.util.regex.Matcher;
import kotlin.Metadata;
import kotlin.collections.AbstractCollection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import kotlin.sequences.TransformingSequence;
import kotlin.sequences.TransformingSequence$iterator$1;
import org.jetbrains.annotations.NotNull;

/* compiled from: Regex.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¨\u0006\u0004"}, m31884d2 = {"kotlin/text/MatcherMatchResult$groups$1", "Lkotlin/text/MatchNamedGroupCollection;", "Lkotlin/collections/AbstractCollection;", "Lkotlin/text/MatchGroup;", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class MatcherMatchResult$groups$1 extends AbstractCollection<MatchGroup> implements MatchNamedGroupCollection {

    /* renamed from: b */
    public final /* synthetic */ MatcherMatchResult f66875b;

    @Override // kotlin.collections.AbstractCollection
    /* renamed from: b */
    public int getF63156f() {
        return this.f66875b.f66871a.groupCount() + 1;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof MatchGroup) {
            return super.contains((MatchGroup) obj);
        }
        return false;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<MatchGroup> iterator() {
        return new TransformingSequence$iterator$1((TransformingSequence) SequencesKt.m33852t(CollectionsKt.m32028k(new IntRange(0, getF63156f() - 1)), new Function1<Integer, MatchGroup>() { // from class: kotlin.text.MatcherMatchResult$groups$1$iterator$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public MatchGroup invoke(Integer num) {
                int intValue = num.intValue();
                MatcherMatchResult$groups$1 matcherMatchResult$groups$1 = MatcherMatchResult$groups$1.this;
                Matcher matcher = matcherMatchResult$groups$1.f66875b.f66871a;
                IntRange m32243j = RangesKt.m32243j(matcher.start(intValue), matcher.end(intValue));
                if (m32243j.m32233f().intValue() < 0) {
                    return null;
                }
                String group = matcherMatchResult$groups$1.f66875b.f66871a.group(intValue);
                Intrinsics.m32178g(group, "matchResult.group(index)");
                return new MatchGroup(group, m32243j);
            }
        }));
    }
}
