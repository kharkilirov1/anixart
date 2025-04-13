package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Objects;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Maps;
import com.google.j2objc.annotations.Weak;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
final class FilteredMultimapValues<K, V> extends AbstractCollection<V> {

    /* renamed from: b */
    @Weak
    public final FilteredMultimap<K, V> f20979b;

    public FilteredMultimapValues(FilteredMultimap<K, V> filteredMultimap) {
        this.f20979b = filteredMultimap;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f20979b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(@NullableDecl Object obj) {
        return this.f20979b.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<V> iterator() {
        return new Maps.C17092(this.f20979b.mo11345b().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(@NullableDecl Object obj) {
        Predicate<? super Map.Entry<K, V>> mo11549f = this.f20979b.mo11549f();
        Iterator<Map.Entry<K, V>> it = this.f20979b.mo11550s().mo11345b().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (mo11549f.apply(next) && Objects.m11173a(next.getValue(), obj)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        return Iterables.m11703h(this.f20979b.mo11550s().mo11345b(), Predicates.m11198c(this.f20979b.mo11549f(), Predicates.m11199d(Predicates.m11201f(collection), Maps.EntryFunction.VALUE)));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        return Iterables.m11703h(this.f20979b.mo11550s().mo11345b(), Predicates.m11198c(this.f20979b.mo11549f(), Predicates.m11199d(Predicates.m11203h(Predicates.m11201f(collection)), Maps.EntryFunction.VALUE)));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.f20979b.size();
    }
}
