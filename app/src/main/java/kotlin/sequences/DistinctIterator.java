package kotlin.sequences;

import java.util.HashSet;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractIterator;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: Sequences.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, m31884d2 = {"Lkotlin/sequences/DistinctIterator;", "T", "K", "Lkotlin/collections/AbstractIterator;", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
final class DistinctIterator<T, K> extends AbstractIterator<T> {

    /* renamed from: d */
    @NotNull
    public final Iterator<T> f66676d;

    /* renamed from: e */
    @NotNull
    public final Function1<T, K> f66677e;

    /* renamed from: f */
    @NotNull
    public final HashSet<K> f66678f;

    @Override // kotlin.collections.AbstractIterator
    /* renamed from: a */
    public void mo16754a() {
        while (this.f66676d.hasNext()) {
            T next = this.f66676d.next();
            if (this.f66678f.add(this.f66677e.invoke(next))) {
                m31904c(next);
                return;
            }
        }
        m31903b();
    }
}
