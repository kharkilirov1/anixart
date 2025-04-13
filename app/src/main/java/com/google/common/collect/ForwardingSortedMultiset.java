package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.Multiset;
import com.google.common.collect.SortedMultisets;
import java.util.Comparator;
import java.util.NavigableSet;

@Beta
@GwtCompatible
/* loaded from: classes.dex */
public abstract class ForwardingSortedMultiset<E> extends ForwardingMultiset<E> implements SortedMultiset<E> {

    public abstract class StandardDescendingMultiset extends DescendingMultiset<E> {
        @Override // com.google.common.collect.DescendingMultiset
        /* renamed from: M */
        public SortedMultiset<E> mo11403M() {
            return null;
        }
    }

    public class StandardElementSet extends SortedMultisets.NavigableElementSet<E> {
    }

    @Override // com.google.common.collect.SortedMultiset
    /* renamed from: D0 */
    public SortedMultiset<E> mo11527D0(E e2, BoundType boundType) {
        return mo11329H().mo11527D0(e2, boundType);
    }

    @Override // com.google.common.collect.ForwardingMultiset
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public abstract SortedMultiset<E> mo11329H();

    @Override // com.google.common.collect.SortedMultiset
    /* renamed from: R */
    public SortedMultiset<E> mo11399R() {
        return mo11329H().mo11399R();
    }

    @Override // com.google.common.collect.SortedMultiset, com.google.common.collect.SortedIterable
    public Comparator<? super E> comparator() {
        return mo11329H().comparator();
    }

    @Override // com.google.common.collect.SortedMultiset
    /* renamed from: f1 */
    public SortedMultiset<E> mo11400f1(E e2, BoundType boundType, E e3, BoundType boundType2) {
        return mo11329H().mo11400f1(e2, boundType, e3, boundType2);
    }

    @Override // com.google.common.collect.SortedMultiset
    public Multiset.Entry<E> firstEntry() {
        return mo11329H().firstEntry();
    }

    @Override // com.google.common.collect.SortedMultiset
    public Multiset.Entry<E> lastEntry() {
        return mo11329H().lastEntry();
    }

    @Override // com.google.common.collect.SortedMultiset
    /* renamed from: n0 */
    public SortedMultiset<E> mo11529n0(E e2, BoundType boundType) {
        return mo11329H().mo11529n0(e2, boundType);
    }

    @Override // com.google.common.collect.SortedMultiset
    public Multiset.Entry<E> pollFirstEntry() {
        return mo11329H().pollFirstEntry();
    }

    @Override // com.google.common.collect.SortedMultiset
    public Multiset.Entry<E> pollLastEntry() {
        return mo11329H().pollLastEntry();
    }

    @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
    /* renamed from: l */
    public NavigableSet<E> mo11389l() {
        return mo11329H().mo11389l();
    }
}
