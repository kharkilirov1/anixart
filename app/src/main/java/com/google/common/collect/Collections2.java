package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
public final class Collections2 {

    public static class FilteredCollection<E> extends AbstractCollection<E> {

        /* renamed from: b */
        public final Collection<E> f20877b;

        /* renamed from: c */
        public final Predicate<? super E> f20878c;

        public FilteredCollection(Collection<E> collection, Predicate<? super E> predicate) {
            this.f20877b = collection;
            this.f20878c = predicate;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(E e2) {
            Preconditions.m11178b(this.f20878c.apply(e2));
            return this.f20877b.add(e2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            Iterator<? extends E> it = collection.iterator();
            while (it.hasNext()) {
                Preconditions.m11178b(this.f20878c.apply(it.next()));
            }
            return this.f20877b.addAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            Iterables.m11703h(this.f20877b, this.f20878c);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@NullableDecl Object obj) {
            if (Collections2.m11434e(this.f20877b, obj)) {
                return this.f20878c.apply(obj);
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return Collections2.m11431b(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return !Iterables.m11697b(this.f20877b, this.f20878c);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<E> iterator() {
            return Iterators.m11710e(this.f20877b.iterator(), this.f20878c);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            return contains(obj) && this.f20877b.remove(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            Iterator<E> it = this.f20877b.iterator();
            boolean z = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.f20878c.apply(next) && collection.contains(next)) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            Iterator<E> it = this.f20877b.iterator();
            boolean z = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.f20878c.apply(next) && !collection.contains(next)) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            Iterator<E> it = this.f20877b.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                if (this.f20878c.apply(it.next())) {
                    i2++;
                }
            }
            return i2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return Lists.m11736c(iterator()).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) Lists.m11736c(iterator()).toArray(tArr);
        }
    }

    public static final class OrderedPermutationCollection<E> extends AbstractCollection<List<E>> {
        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@NullableDecl Object obj) {
            if (!(obj instanceof List)) {
                return false;
            }
            Collections2.m11430a(null, (List) obj);
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<List<E>> iterator() {
            return new OrderedPermutationIterator(null, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return 0;
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return "orderedPermutationCollection(null)";
        }
    }

    public static final class OrderedPermutationIterator<E> extends AbstractIterator<List<E>> {

        /* renamed from: d */
        @NullableDecl
        public List<E> f20879d;

        /* renamed from: e */
        public final Comparator<? super E> f20880e;

        public OrderedPermutationIterator(List<E> list, Comparator<? super E> comparator) {
            Lists.m11735b(null);
            throw null;
        }

        @Override // com.google.common.collect.AbstractIterator
        /* renamed from: a */
        public Object mo11332a() {
            List<E> list = this.f20879d;
            if (list == null) {
                m11333b();
                return null;
            }
            ImmutableList m11634y = ImmutableList.m11634y(list);
            int size = this.f20879d.size() - 2;
            while (true) {
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (this.f20880e.compare(this.f20879d.get(size), this.f20879d.get(size + 1)) < 0) {
                    break;
                }
                size--;
            }
            if (size != -1) {
                E e2 = this.f20879d.get(size);
                for (int size2 = this.f20879d.size() - 1; size2 > size; size2--) {
                    if (this.f20880e.compare(e2, this.f20879d.get(size2)) < 0) {
                        Collections.swap(this.f20879d, size, size2);
                        Collections.reverse(this.f20879d.subList(size + 1, this.f20879d.size()));
                    }
                }
                throw new AssertionError("this statement should be unreachable");
            }
            this.f20879d = null;
            return m11634y;
        }
    }

    public static final class PermutationCollection<E> extends AbstractCollection<List<E>> {
        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@NullableDecl Object obj) {
            if (!(obj instanceof List)) {
                return false;
            }
            Collections2.m11430a(null, (List) obj);
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<List<E>> iterator() {
            return new PermutationIterator(null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            throw null;
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return "permutations(null)";
        }
    }

    public static class PermutationIterator<E> extends AbstractIterator<List<E>> {

        /* renamed from: d */
        public final List<E> f20881d = new ArrayList((Collection) null);

        /* renamed from: e */
        public final int[] f20882e;

        /* renamed from: f */
        public final int[] f20883f;

        /* renamed from: g */
        public int f20884g;

        public PermutationIterator(List<E> list) {
            throw null;
        }

        @Override // com.google.common.collect.AbstractIterator
        /* renamed from: a */
        public Object mo11332a() {
            if (this.f20884g <= 0) {
                m11333b();
                return null;
            }
            ImmutableList m11634y = ImmutableList.m11634y(this.f20881d);
            int size = this.f20881d.size() - 1;
            this.f20884g = size;
            if (size == -1) {
                return m11634y;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.f20882e;
                int i3 = this.f20884g;
                int i4 = iArr[i3];
                int[] iArr2 = this.f20883f;
                int i5 = i4 + iArr2[i3];
                if (i5 < 0) {
                    iArr2[i3] = -iArr2[i3];
                    this.f20884g = i3 - 1;
                } else {
                    if (i5 != i3 + 1) {
                        Collections.swap(this.f20881d, (i3 - iArr[i3]) + i2, (i3 - i5) + i2);
                        this.f20882e[this.f20884g] = i5;
                        return m11634y;
                    }
                    if (i3 == 0) {
                        return m11634y;
                    }
                    i2++;
                    iArr2[i3] = -iArr2[i3];
                    this.f20884g = i3 - 1;
                }
            }
        }
    }

    public static class TransformedCollection<F, T> extends AbstractCollection<T> {

        /* renamed from: b */
        public final Collection<F> f20885b;

        /* renamed from: c */
        public final Function<? super F, ? extends T> f20886c;

        public TransformedCollection(Collection<F> collection, Function<? super F, ? extends T> function) {
            Objects.requireNonNull(collection);
            this.f20885b = collection;
            Objects.requireNonNull(function);
            this.f20886c = function;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            this.f20885b.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f20885b.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<T> iterator() {
            return Iterators.m11720o(this.f20885b.iterator(), this.f20886c);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f20885b.size();
        }
    }

    /* renamed from: a */
    public static boolean m11430a(List list, List list2) {
        throw null;
    }

    /* renamed from: b */
    public static boolean m11431b(Collection<?> collection, Collection<?> collection2) {
        Iterator<?> it = collection2.iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public static <E> Collection<E> m11432c(Collection<E> collection, Predicate<? super E> predicate) {
        if (collection instanceof FilteredCollection) {
            FilteredCollection filteredCollection = (FilteredCollection) collection;
            return new FilteredCollection(filteredCollection.f20877b, Predicates.m11198c(filteredCollection.f20878c, predicate));
        }
        Objects.requireNonNull(collection);
        Objects.requireNonNull(predicate);
        return new FilteredCollection(collection, predicate);
    }

    /* renamed from: d */
    public static StringBuilder m11433d(int i2) {
        CollectPreconditions.m11427b(i2, "size");
        return new StringBuilder((int) Math.min(i2 * 8, 1073741824L));
    }

    /* renamed from: e */
    public static boolean m11434e(Collection<?> collection, @NullableDecl Object obj) {
        Objects.requireNonNull(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
