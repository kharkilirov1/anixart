package kotlin.collections;

import java.util.List;
import kotlin.Metadata;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* compiled from: ReversedViews.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlin/collections/ReversedList;", "T", "Lkotlin/collections/AbstractMutableList;", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
final class ReversedList<T> extends AbstractMutableList<T> {

    /* renamed from: b */
    @NotNull
    public final List<T> f63152b;

    public ReversedList(@NotNull List<T> list) {
        this.f63152b = list;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i2, T t) {
        List<T> list = this.f63152b;
        if (new IntRange(0, size()).m32232d(i2)) {
            list.add(size() - i2, t);
            return;
        }
        StringBuilder m25v = C0000a.m25v("Position index ", i2, " must be in range [");
        m25v.append(new IntRange(0, size()));
        m25v.append("].");
        throw new IndexOutOfBoundsException(m25v.toString());
    }

    @Override // kotlin.collections.AbstractMutableList
    /* renamed from: b */
    public int mo31911b() {
        return this.f63152b.size();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f63152b.clear();
    }

    @Override // kotlin.collections.AbstractMutableList
    /* renamed from: d */
    public T mo31912d(int i2) {
        return this.f63152b.remove(CollectionsKt__ReversedViewsKt.m32051b(this, i2));
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int i2) {
        return this.f63152b.get(CollectionsKt__ReversedViewsKt.m32051b(this, i2));
    }

    @Override // java.util.AbstractList, java.util.List
    public T set(int i2, T t) {
        return this.f63152b.set(CollectionsKt__ReversedViewsKt.m32051b(this, i2), t);
    }
}
