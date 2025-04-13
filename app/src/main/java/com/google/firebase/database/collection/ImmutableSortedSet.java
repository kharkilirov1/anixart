package com.google.firebase.database.collection;

import com.google.android.exoplayer2.trackselection.C1136a;
import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.database.collection.RBTreeSortedMap;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public class ImmutableSortedSet<T> implements Iterable<T> {

    /* renamed from: b */
    public final ImmutableSortedMap<T, Void> f22544b;

    public static class WrappedEntryIterator<T> implements Iterator<T> {

        /* renamed from: b */
        public final Iterator<Map.Entry<T, Void>> f22545b;

        public WrappedEntryIterator(Iterator<Map.Entry<T, Void>> it) {
            this.f22545b = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f22545b.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            return this.f22545b.next().getKey();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f22545b.remove();
        }
    }

    public ImmutableSortedSet(List<T> list, Comparator<T> comparator) {
        ImmutableSortedMap<T, Void> m12356b;
        Map emptyMap = Collections.emptyMap();
        ImmutableSortedMap.Builder.KeyTranslator keyTranslator = ImmutableSortedMap.Builder.f22541a;
        if (list.size() < 25) {
            Collections.sort(list, comparator);
            int size = list.size();
            Object[] objArr = new Object[size];
            Object[] objArr2 = new Object[size];
            int i2 = 0;
            for (T t : list) {
                objArr[i2] = t;
                Objects.requireNonNull((C1136a) keyTranslator);
                ImmutableSortedMap.Builder.KeyTranslator keyTranslator2 = ImmutableSortedMap.Builder.f22541a;
                objArr2[i2] = emptyMap.get(t);
                i2++;
            }
            m12356b = new ArraySortedMap<>(comparator, objArr, objArr2);
        } else {
            m12356b = RBTreeSortedMap.Builder.m12356b(list, emptyMap, keyTranslator, comparator);
        }
        this.f22544b = m12356b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ImmutableSortedSet) {
            return this.f22544b.equals(((ImmutableSortedSet) obj).f22544b);
        }
        return false;
    }

    public int hashCode() {
        return this.f22544b.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return new WrappedEntryIterator(this.f22544b.iterator());
    }

    public int size() {
        return this.f22544b.size();
    }
}
