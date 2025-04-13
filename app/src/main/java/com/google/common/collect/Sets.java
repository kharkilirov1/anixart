package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Collections2;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
public final class Sets {

    /* renamed from: com.google.common.collect.Sets$1 */
    class C17551 extends SetView<Object> {

        /* renamed from: b */
        public final /* synthetic */ Set f21463b;

        /* renamed from: c */
        public final /* synthetic */ Set f21464c;

        /* renamed from: com.google.common.collect.Sets$1$1, reason: invalid class name */
        public class AnonymousClass1 extends AbstractIterator<Object> {

            /* renamed from: d */
            public final Iterator<Object> f21465d;

            /* renamed from: e */
            public final Iterator<Object> f21466e;

            public AnonymousClass1() {
                this.f21465d = C17551.this.f21463b.iterator();
                this.f21466e = C17551.this.f21464c.iterator();
            }

            @Override // com.google.common.collect.AbstractIterator
            /* renamed from: a */
            public Object mo11332a() {
                if (this.f21465d.hasNext()) {
                    return this.f21465d.next();
                }
                while (this.f21466e.hasNext()) {
                    Object next = this.f21466e.next();
                    if (!C17551.this.f21463b.contains(next)) {
                        return next;
                    }
                }
                m11333b();
                return null;
            }
        }

        @Override // com.google.common.collect.Sets.SetView
        /* renamed from: b */
        public UnmodifiableIterator<Object> iterator() {
            return new AnonymousClass1();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f21463b.contains(obj) || this.f21464c.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.f21463b.isEmpty() && this.f21464c.isEmpty();
        }

        @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new AnonymousClass1();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            int size = this.f21463b.size();
            Iterator it = this.f21464c.iterator();
            while (it.hasNext()) {
                if (!this.f21463b.contains(it.next())) {
                    size++;
                }
            }
            return size;
        }
    }

    /* renamed from: com.google.common.collect.Sets$4 */
    class C17584 extends SetView<Object> {

        /* renamed from: com.google.common.collect.Sets$4$1, reason: invalid class name */
        public class AnonymousClass1 extends AbstractIterator<Object> {

            /* renamed from: d */
            public final /* synthetic */ Iterator f21476d;

            /* renamed from: e */
            public final /* synthetic */ Iterator f21477e;

            /* renamed from: f */
            public final /* synthetic */ C17584 f21478f;

            @Override // com.google.common.collect.AbstractIterator
            /* renamed from: a */
            public Object mo11332a() {
                if (this.f21476d.hasNext()) {
                    this.f21476d.next();
                    Objects.requireNonNull(this.f21478f);
                    throw null;
                }
                if (!this.f21477e.hasNext()) {
                    m11333b();
                    return null;
                }
                this.f21477e.next();
                Objects.requireNonNull(this.f21478f);
                throw null;
            }
        }

        @Override // com.google.common.collect.Sets.SetView
        /* renamed from: b */
        public UnmodifiableIterator<Object> iterator() {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            throw null;
        }

        @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            throw null;
        }
    }

    /* renamed from: com.google.common.collect.Sets$5 */
    class C17595 extends AbstractSet<Set<Object>> {

        /* renamed from: com.google.common.collect.Sets$5$1, reason: invalid class name */
        public class AnonymousClass1 extends AbstractIterator<Set<Object>> {

            /* renamed from: com.google.common.collect.Sets$5$1$1, reason: invalid class name and collision with other inner class name */
            class C69921 extends AbstractSet<Object> {

                /* renamed from: b */
                public final /* synthetic */ BitSet f21480b;

                /* renamed from: c */
                public final /* synthetic */ AnonymousClass1 f21481c;

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean contains(@NullableDecl Object obj) {
                    Objects.requireNonNull(C17595.this);
                    throw null;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public Iterator<Object> iterator() {
                    return new AbstractIterator<Object>() { // from class: com.google.common.collect.Sets.5.1.1.1

                        /* renamed from: d */
                        public int f21482d = -1;

                        @Override // com.google.common.collect.AbstractIterator
                        /* renamed from: a */
                        public Object mo11332a() {
                            int nextSetBit = C69921.this.f21480b.nextSetBit(this.f21482d + 1);
                            this.f21482d = nextSetBit;
                            if (nextSetBit == -1) {
                                m11333b();
                                return null;
                            }
                            Objects.requireNonNull(C17595.this);
                            throw null;
                        }
                    };
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public int size() {
                    Objects.requireNonNull(C17595.this);
                    return 0;
                }
            }

            public AnonymousClass1() {
                throw null;
            }

            @Override // com.google.common.collect.AbstractIterator
            /* renamed from: a */
            public Set<Object> mo11332a() {
                throw null;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            if ((obj instanceof Set) && ((Set) obj).size() == 0) {
                throw null;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Set<Object>> iterator() {
            new AnonymousClass1();
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            throw null;
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            throw null;
        }
    }

    public static final class CartesianSet<E> extends ForwardingCollection<List<E>> implements Set<List<E>> {

        /* renamed from: com.google.common.collect.Sets$CartesianSet$1 */
        class C17601 extends ImmutableList<List<Object>> {
            @Override // java.util.List
            public Object get(int i2) {
                throw null;
            }

            @Override // com.google.common.collect.ImmutableCollection
            /* renamed from: r */
            public boolean mo11425r() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                throw null;
            }
        }

        @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        /* renamed from: G */
        public /* bridge */ /* synthetic */ Object mo11329H() {
            return null;
        }

        @Override // com.google.common.collect.ForwardingCollection
        /* renamed from: H */
        public Collection<List<E>> mo11329H() {
            return null;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            if (!(obj instanceof List)) {
                return false;
            }
            ((List) obj).size();
            throw null;
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof CartesianSet)) {
                return super.equals(obj);
            }
            Objects.requireNonNull((CartesianSet) obj);
            throw null;
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            size();
            throw null;
        }
    }

    @GwtIncompatible
    public static class DescendingSet<E> extends ForwardingNavigableSet<E> {
        @Override // com.google.common.collect.ForwardingNavigableSet, com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        /* renamed from: G */
        public /* bridge */ /* synthetic */ Object mo11329H() {
            return null;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection
        /* renamed from: H */
        public /* bridge */ /* synthetic */ Collection mo11329H() {
            return null;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet
        /* renamed from: K */
        public /* bridge */ /* synthetic */ Set mo11329H() {
            return null;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, com.google.common.collect.ForwardingSortedSet
        /* renamed from: M */
        public /* bridge */ /* synthetic */ SortedSet mo7455G() {
            return null;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet
        /* renamed from: O */
        public NavigableSet<E> mo11329H() {
            return null;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public E ceiling(E e2) {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public Comparator<? super E> comparator() {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public Iterator<E> descendingIterator() {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            return null;
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public E first() {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public E floor(E e2) {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public SortedSet<E> headSet(E e2) {
            return headSet(e2, false);
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public E higher(E e2) {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public E last() {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public E lower(E e2) {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public E pollFirst() {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public E pollLast() {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public SortedSet<E> subSet(E e2, E e3) {
            return subSet(e2, true, e3, false);
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public SortedSet<E> tailSet(E e2) {
            return tailSet(e2, true);
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) ObjectArrays.m11830d(this, tArr);
        }

        @Override // com.google.common.collect.ForwardingObject
        public String toString() {
            return m11560J();
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public NavigableSet<E> headSet(E e2, boolean z) {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public NavigableSet<E> subSet(E e2, boolean z, E e3, boolean z2) {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public NavigableSet<E> tailSet(E e2, boolean z) {
            throw null;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return m11559I();
        }
    }

    @GwtIncompatible
    public static class FilteredNavigableSet<E> extends FilteredSortedSet<E> implements NavigableSet<E> {
        public FilteredNavigableSet(NavigableSet<E> navigableSet, Predicate<? super E> predicate) {
            super(navigableSet, predicate);
        }

        @Override // java.util.NavigableSet
        public E ceiling(E e2) {
            NavigableSet<E> tailSet = ((NavigableSet) this.f20877b).tailSet(e2, true);
            return (E) Iterators.m11712g(tailSet.iterator(), this.f20878c, null);
        }

        @Override // java.util.NavigableSet
        public Iterator<E> descendingIterator() {
            return Iterators.m11710e(((NavigableSet) this.f20877b).descendingIterator(), this.f20878c);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            return Sets.m11885c(((NavigableSet) this.f20877b).descendingSet(), this.f20878c);
        }

        @Override // java.util.NavigableSet
        @NullableDecl
        public E floor(E e2) {
            return (E) Iterators.m11712g(((NavigableSet) this.f20877b).headSet(e2, true).descendingIterator(), this.f20878c, null);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> headSet(E e2, boolean z) {
            return Sets.m11885c(((NavigableSet) this.f20877b).headSet(e2, z), this.f20878c);
        }

        @Override // java.util.NavigableSet
        public E higher(E e2) {
            NavigableSet<E> tailSet = ((NavigableSet) this.f20877b).tailSet(e2, false);
            return (E) Iterators.m11712g(tailSet.iterator(), this.f20878c, null);
        }

        @Override // com.google.common.collect.Sets.FilteredSortedSet, java.util.SortedSet
        public E last() {
            return (E) Iterators.m11711f(((NavigableSet) this.f20877b).descendingIterator(), this.f20878c);
        }

        @Override // java.util.NavigableSet
        @NullableDecl
        public E lower(E e2) {
            return (E) Iterators.m11712g(((NavigableSet) this.f20877b).headSet(e2, false).descendingIterator(), this.f20878c, null);
        }

        @Override // java.util.NavigableSet
        public E pollFirst() {
            return (E) Iterables.m11702g((NavigableSet) this.f20877b, this.f20878c);
        }

        @Override // java.util.NavigableSet
        public E pollLast() {
            return (E) Iterables.m11702g(((NavigableSet) this.f20877b).descendingSet(), this.f20878c);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> subSet(E e2, boolean z, E e3, boolean z2) {
            return Sets.m11885c(((NavigableSet) this.f20877b).subSet(e2, z, e3, z2), this.f20878c);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> tailSet(E e2, boolean z) {
            return Sets.m11885c(((NavigableSet) this.f20877b).tailSet(e2, z), this.f20878c);
        }
    }

    public static class FilteredSet<E> extends Collections2.FilteredCollection<E> implements Set<E> {
        public FilteredSet(Set<E> set, Predicate<? super E> predicate) {
            super(set, predicate);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(@NullableDecl Object obj) {
            return Sets.m11884b(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return Sets.m11887e(this);
        }
    }

    public static class FilteredSortedSet<E> extends FilteredSet<E> implements SortedSet<E> {
        public FilteredSortedSet(SortedSet<E> sortedSet, Predicate<? super E> predicate) {
            super(sortedSet, predicate);
        }

        @Override // java.util.SortedSet
        public Comparator<? super E> comparator() {
            return ((SortedSet) this.f20877b).comparator();
        }

        @Override // java.util.SortedSet
        public E first() {
            return (E) Iterators.m11711f(this.f20877b.iterator(), this.f20878c);
        }

        @Override // java.util.SortedSet
        public SortedSet<E> headSet(E e2) {
            return new FilteredSortedSet(((SortedSet) this.f20877b).headSet(e2), this.f20878c);
        }

        public E last() {
            SortedSet sortedSet = (SortedSet) this.f20877b;
            while (true) {
                E e2 = (Object) sortedSet.last();
                if (this.f20878c.apply(e2)) {
                    return e2;
                }
                sortedSet = sortedSet.headSet(e2);
            }
        }

        @Override // java.util.SortedSet
        public SortedSet<E> subSet(E e2, E e3) {
            return new FilteredSortedSet(((SortedSet) this.f20877b).subSet(e2, e3), this.f20878c);
        }

        @Override // java.util.SortedSet
        public SortedSet<E> tailSet(E e2) {
            return new FilteredSortedSet(((SortedSet) this.f20877b).tailSet(e2), this.f20878c);
        }
    }

    public static abstract class ImprovedAbstractSet<E> extends AbstractSet<E> {
        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return Sets.m11891i(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            Objects.requireNonNull(collection);
            return super.retainAll(collection);
        }
    }

    public static final class PowerSet<E> extends AbstractSet<Set<E>> {

        /* renamed from: com.google.common.collect.Sets$PowerSet$1 */
        public class C17611 extends AbstractIndexedListIterator<Set<E>> {

            /* renamed from: d */
            public final /* synthetic */ PowerSet f21484d;

            @Override // com.google.common.collect.AbstractIndexedListIterator
            /* renamed from: a */
            public Object mo11331a(int i2) {
                Objects.requireNonNull(this.f21484d);
                return new SubSet(null, i2);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            if (!(obj instanceof Set)) {
                return false;
            }
            throw null;
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof PowerSet)) {
                return super.equals(obj);
            }
            throw null;
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Set<E>> iterator() {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            throw null;
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return "powerSet(null)";
        }
    }

    public static abstract class SetView<E> extends AbstractSet<E> {
        public SetView() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        @Deprecated
        public final boolean add(E e2) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        @Deprecated
        public final boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public abstract UnmodifiableIterator<E> iterator();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        @Deprecated
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        @Deprecated
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        @Deprecated
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public SetView(C17551 c17551) {
        }
    }

    public static final class SubSet<E> extends AbstractSet<E> {

        /* renamed from: b */
        public final ImmutableMap<E, Integer> f21485b = null;

        /* renamed from: c */
        public final int f21486c;

        public SubSet(ImmutableMap<E, Integer> immutableMap, int i2) {
            this.f21486c = i2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            Integer num = this.f21485b.get(obj);
            if (num != null) {
                if (((1 << num.intValue()) & this.f21486c) != 0) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return new UnmodifiableIterator<E>(this) { // from class: com.google.common.collect.Sets.SubSet.1

                /* renamed from: b */
                public final ImmutableList<E> f21487b;

                /* renamed from: c */
                public int f21488c;

                {
                    this.f21487b = this.f21485b.keySet().mo11543b();
                    this.f21488c = this.f21486c;
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    return this.f21488c != 0;
                }

                @Override // java.util.Iterator
                public E next() {
                    int numberOfTrailingZeros = Integer.numberOfTrailingZeros(this.f21488c);
                    if (numberOfTrailingZeros == 32) {
                        throw new NoSuchElementException();
                    }
                    this.f21488c &= ~(1 << numberOfTrailingZeros);
                    return this.f21487b.get(numberOfTrailingZeros);
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return Integer.bitCount(this.f21486c);
        }
    }

    public static final class UnmodifiableNavigableSet<E> extends ForwardingSortedSet<E> implements NavigableSet<E>, Serializable {

        /* renamed from: b */
        public final NavigableSet<E> f21489b;

        /* renamed from: c */
        public final SortedSet<E> f21490c;

        /* renamed from: d */
        @NullableDecl
        public transient UnmodifiableNavigableSet<E> f21491d;

        public UnmodifiableNavigableSet(NavigableSet<E> navigableSet) {
            Objects.requireNonNull(navigableSet);
            this.f21489b = navigableSet;
            this.f21490c = Collections.unmodifiableSortedSet(navigableSet);
        }

        @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        /* renamed from: G */
        public Object mo11329H() {
            return this.f21490c;
        }

        @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection
        /* renamed from: H */
        public Collection mo11329H() {
            return this.f21490c;
        }

        @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet
        /* renamed from: K */
        public Set mo11329H() {
            return this.f21490c;
        }

        @Override // com.google.common.collect.ForwardingSortedSet
        /* renamed from: M */
        public SortedSet<E> mo7455G() {
            return this.f21490c;
        }

        @Override // java.util.NavigableSet
        public E ceiling(E e2) {
            return this.f21489b.ceiling(e2);
        }

        @Override // java.util.NavigableSet
        public Iterator<E> descendingIterator() {
            return Iterators.m11721p(this.f21489b.descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            UnmodifiableNavigableSet<E> unmodifiableNavigableSet = this.f21491d;
            if (unmodifiableNavigableSet != null) {
                return unmodifiableNavigableSet;
            }
            UnmodifiableNavigableSet<E> unmodifiableNavigableSet2 = new UnmodifiableNavigableSet<>(this.f21489b.descendingSet());
            this.f21491d = unmodifiableNavigableSet2;
            unmodifiableNavigableSet2.f21491d = this;
            return unmodifiableNavigableSet2;
        }

        @Override // java.util.NavigableSet
        public E floor(E e2) {
            return this.f21489b.floor(e2);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> headSet(E e2, boolean z) {
            return Sets.m11893k(this.f21489b.headSet(e2, z));
        }

        @Override // java.util.NavigableSet
        public E higher(E e2) {
            return this.f21489b.higher(e2);
        }

        @Override // java.util.NavigableSet
        public E lower(E e2) {
            return this.f21489b.lower(e2);
        }

        @Override // java.util.NavigableSet
        public E pollFirst() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableSet
        public E pollLast() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> subSet(E e2, boolean z, E e3, boolean z2) {
            return Sets.m11893k(this.f21489b.subSet(e2, z, e3, z2));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> tailSet(E e2, boolean z) {
            return Sets.m11893k(this.f21489b.tailSet(e2, z));
        }
    }

    /* renamed from: a */
    public static <E> SetView<E> m11883a(final Set<E> set, final Set<?> set2) {
        Preconditions.m11187k(set, "set1");
        return new SetView<E>() { // from class: com.google.common.collect.Sets.3

            /* renamed from: com.google.common.collect.Sets$3$1, reason: invalid class name */
            public class AnonymousClass1 extends AbstractIterator<E> {

                /* renamed from: d */
                public final Iterator<E> f21474d;

                public AnonymousClass1() {
                    this.f21474d = set.iterator();
                }

                @Override // com.google.common.collect.AbstractIterator
                /* renamed from: a */
                public E mo11332a() {
                    while (this.f21474d.hasNext()) {
                        E next = this.f21474d.next();
                        if (!set2.contains(next)) {
                            return next;
                        }
                    }
                    m11333b();
                    return null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(null);
            }

            @Override // com.google.common.collect.Sets.SetView
            /* renamed from: b */
            public UnmodifiableIterator<E> iterator() {
                return new AnonymousClass1();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return set.contains(obj) && !set2.contains(obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean isEmpty() {
                return set2.containsAll(set);
            }

            @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator iterator() {
                return new AnonymousClass1();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                Iterator<E> it = set.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    if (!set2.contains(it.next())) {
                        i2++;
                    }
                }
                return i2;
            }
        };
    }

    /* renamed from: b */
    public static boolean m11884b(Set<?> set, @NullableDecl Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @GwtIncompatible
    /* renamed from: c */
    public static <E> NavigableSet<E> m11885c(NavigableSet<E> navigableSet, Predicate<? super E> predicate) {
        if (navigableSet instanceof FilteredSet) {
            FilteredSet filteredSet = (FilteredSet) navigableSet;
            return new FilteredNavigableSet((NavigableSet) filteredSet.f20877b, Predicates.m11198c(filteredSet.f20878c, predicate));
        }
        Objects.requireNonNull(navigableSet);
        Objects.requireNonNull(predicate);
        return new FilteredNavigableSet(navigableSet, predicate);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public static <E> Set<E> m11886d(Set<E> set, Predicate<? super E> predicate) {
        if (!(set instanceof SortedSet)) {
            if (set instanceof FilteredSet) {
                FilteredSet filteredSet = (FilteredSet) set;
                return new FilteredSet((Set) filteredSet.f20877b, Predicates.m11198c(filteredSet.f20878c, predicate));
            }
            Objects.requireNonNull(set);
            Objects.requireNonNull(predicate);
            return new FilteredSet(set, predicate);
        }
        SortedSet sortedSet = (SortedSet) set;
        if (sortedSet instanceof FilteredSet) {
            FilteredSet filteredSet2 = (FilteredSet) sortedSet;
            return new FilteredSortedSet((SortedSet) filteredSet2.f20877b, Predicates.m11198c(filteredSet2.f20878c, predicate));
        }
        Objects.requireNonNull(sortedSet);
        Objects.requireNonNull(predicate);
        return new FilteredSortedSet(sortedSet, predicate);
    }

    /* renamed from: e */
    public static int m11887e(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i2 = ~(~(i2 + (next != null ? next.hashCode() : 0)));
        }
        return i2;
    }

    /* renamed from: f */
    public static <E> SetView<E> m11888f(final Set<E> set, final Set<?> set2) {
        Preconditions.m11187k(set, "set1");
        Preconditions.m11187k(set2, "set2");
        return new SetView<E>() { // from class: com.google.common.collect.Sets.2

            /* renamed from: com.google.common.collect.Sets$2$1, reason: invalid class name */
            public class AnonymousClass1 extends AbstractIterator<E> {

                /* renamed from: d */
                public final Iterator<E> f21470d;

                public AnonymousClass1() {
                    this.f21470d = set.iterator();
                }

                @Override // com.google.common.collect.AbstractIterator
                /* renamed from: a */
                public E mo11332a() {
                    while (this.f21470d.hasNext()) {
                        E next = this.f21470d.next();
                        if (set2.contains(next)) {
                            return next;
                        }
                    }
                    m11333b();
                    return null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(null);
            }

            @Override // com.google.common.collect.Sets.SetView
            /* renamed from: b */
            public UnmodifiableIterator<E> iterator() {
                return new AnonymousClass1();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return set.contains(obj) && set2.contains(obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean containsAll(Collection<?> collection) {
                return set.containsAll(collection) && set2.containsAll(collection);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean isEmpty() {
                return Collections.disjoint(set2, set);
            }

            @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator iterator() {
                return new AnonymousClass1();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                Iterator<E> it = set.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    if (set2.contains(it.next())) {
                        i2++;
                    }
                }
                return i2;
            }
        };
    }

    /* renamed from: g */
    public static <E> HashSet<E> m11889g(int i2) {
        return new HashSet<>(Maps.m11787d(i2));
    }

    /* renamed from: h */
    public static <E> Set<E> m11890h() {
        return Collections.newSetFromMap(new IdentityHashMap());
    }

    /* renamed from: i */
    public static boolean m11891i(Set<?> set, Collection<?> collection) {
        Objects.requireNonNull(collection);
        if (collection instanceof Multiset) {
            collection = ((Multiset) collection).mo11389l();
        }
        return (!(collection instanceof Set) || collection.size() <= set.size()) ? m11892j(set, collection.iterator()) : Iterators.m11717l(set.iterator(), collection);
    }

    /* renamed from: j */
    public static boolean m11892j(Set<?> set, Iterator<?> it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }

    /* renamed from: k */
    public static <E> NavigableSet<E> m11893k(NavigableSet<E> navigableSet) {
        return ((navigableSet instanceof ImmutableCollection) || (navigableSet instanceof UnmodifiableNavigableSet)) ? navigableSet : new UnmodifiableNavigableSet(navigableSet);
    }
}
