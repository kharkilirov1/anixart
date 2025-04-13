package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
abstract class AbstractMultiset<E> extends AbstractCollection<E> implements Multiset<E> {

    /* renamed from: b */
    @NullableDecl
    @LazyInit
    public transient Set<E> f20844b;

    /* renamed from: c */
    @NullableDecl
    @LazyInit
    public transient Set<Multiset.Entry<E>> f20845c;

    public class ElementSet extends Multisets.ElementSet<E> {
        public ElementSet() {
        }

        @Override // com.google.common.collect.Multisets.ElementSet
        /* renamed from: e */
        public Multiset<E> mo11390e() {
            return AbstractMultiset.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return AbstractMultiset.this.mo11379f();
        }
    }

    public class EntrySet extends Multisets.EntrySet<E> {
        public EntrySet() {
        }

        @Override // com.google.common.collect.Multisets.EntrySet
        /* renamed from: e */
        public Multiset<E> mo11391e() {
            return AbstractMultiset.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Multiset.Entry<E>> iterator() {
            return AbstractMultiset.this.mo11380g();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return AbstractMultiset.this.mo11378e();
        }
    }

    @CanIgnoreReturnValue
    /* renamed from: X */
    public int mo11376X(@NullableDecl E e2, int i2) {
        CollectPreconditions.m11427b(i2, "count");
        int mo11383s0 = mo11383s0(e2);
        int i3 = i2 - mo11383s0;
        if (i3 > 0) {
            mo11382p(e2, i3);
        } else if (i3 < 0) {
            mo11381o(e2, -i3);
        }
        return mo11383s0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    public final boolean add(@NullableDecl E e2) {
        mo11382p(e2, 1);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    public final boolean addAll(Collection<? extends E> collection) {
        Objects.requireNonNull(collection);
        if (!(collection instanceof Multiset)) {
            if (collection.isEmpty()) {
                return false;
            }
            return Iterators.m11706a(this, collection.iterator());
        }
        Multiset multiset = (Multiset) collection;
        if (multiset instanceof AbstractMapBasedMultiset) {
            AbstractMapBasedMultiset abstractMapBasedMultiset = (AbstractMapBasedMultiset) multiset;
            if (abstractMapBasedMultiset.isEmpty()) {
                return false;
            }
            for (int mo11835c = abstractMapBasedMultiset.f20830d.mo11835c(); mo11835c >= 0; mo11835c = abstractMapBasedMultiset.f20830d.mo11844m(mo11835c)) {
                mo11382p(abstractMapBasedMultiset.f20830d.m11837f(mo11835c), abstractMapBasedMultiset.f20830d.m11838g(mo11835c));
            }
        } else {
            if (multiset.isEmpty()) {
                return false;
            }
            for (Multiset.Entry<E> entry : multiset.entrySet()) {
                mo11382p(entry.mo11547b(), entry.getCount());
            }
        }
        return true;
    }

    /* renamed from: b */
    public Set<E> mo11387b() {
        return new ElementSet();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public boolean contains(@NullableDecl Object obj) {
        return mo11383s0(obj) > 0;
    }

    /* renamed from: d */
    public Set<Multiset.Entry<E>> mo11388d() {
        return new EntrySet();
    }

    @CanIgnoreReturnValue
    /* renamed from: d0 */
    public boolean mo11377d0(@NullableDecl E e2, int i2, int i3) {
        CollectPreconditions.m11427b(i2, "oldCount");
        CollectPreconditions.m11427b(i3, "newCount");
        if (mo11383s0(e2) != i2) {
            return false;
        }
        mo11376X(e2, i3);
        return true;
    }

    /* renamed from: e */
    public abstract int mo11378e();

    @Override // com.google.common.collect.Multiset
    public Set<Multiset.Entry<E>> entrySet() {
        Set<Multiset.Entry<E>> set = this.f20845c;
        if (set != null) {
            return set;
        }
        Set<Multiset.Entry<E>> mo11388d = mo11388d();
        this.f20845c = mo11388d;
        return mo11388d;
    }

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public final boolean equals(@NullableDecl Object obj) {
        return Multisets.m11821a(this, obj);
    }

    /* renamed from: f */
    public abstract Iterator<E> mo11379f();

    /* renamed from: g */
    public abstract Iterator<Multiset.Entry<E>> mo11380g();

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return entrySet().isEmpty();
    }

    @Override // com.google.common.collect.Multiset
    /* renamed from: l */
    public Set<E> mo11389l() {
        Set<E> set = this.f20844b;
        if (set != null) {
            return set;
        }
        Set<E> mo11387b = mo11387b();
        this.f20844b = mo11387b;
        return mo11387b;
    }

    @CanIgnoreReturnValue
    /* renamed from: o */
    public int mo11381o(@NullableDecl Object obj, int i2) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    /* renamed from: p */
    public int mo11382p(@NullableDecl E e2, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public final boolean remove(@NullableDecl Object obj) {
        return mo11381o(obj, 1) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    public final boolean removeAll(Collection<?> collection) {
        if (collection instanceof Multiset) {
            collection = ((Multiset) collection).mo11389l();
        }
        return mo11389l().removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    public final boolean retainAll(Collection<?> collection) {
        Objects.requireNonNull(collection);
        if (collection instanceof Multiset) {
            collection = ((Multiset) collection).mo11389l();
        }
        return mo11389l().retainAll(collection);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return entrySet().toString();
    }
}
