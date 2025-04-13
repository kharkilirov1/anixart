package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
public final class Lists {

    /* renamed from: com.google.common.collect.Lists$1 */
    class C16961 extends RandomAccessListWrapper<Object> {
        @Override // java.util.AbstractList, java.util.List
        public ListIterator<Object> listIterator(int i2) {
            throw null;
        }
    }

    /* renamed from: com.google.common.collect.Lists$2 */
    class C16972 extends AbstractListWrapper<Object> {
        @Override // java.util.AbstractList, java.util.List
        public ListIterator<Object> listIterator(int i2) {
            throw null;
        }
    }

    public static class AbstractListWrapper<E> extends AbstractList<E> {
        @Override // java.util.AbstractList, java.util.List
        public void add(int i2, E e2) {
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int i2, Collection<? extends E> collection) {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public E get(int i2) {
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public E remove(int i2) {
            throw null;
        }

        @Override // java.util.AbstractList, java.util.List
        public E set(int i2, E e2) {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            throw null;
        }
    }

    public static final class CharSequenceAsList extends AbstractList<Character> {
        @Override // java.util.AbstractList, java.util.List
        public Object get(int i2) {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            throw null;
        }
    }

    public static class OnePlusArrayList<E> extends AbstractList<E> implements Serializable, RandomAccess {
        @Override // java.util.AbstractList, java.util.List
        public E get(int i2) {
            Preconditions.m11186j(i2, size());
            if (i2 == 0) {
                return null;
            }
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            throw null;
        }
    }

    public static class Partition<T> extends AbstractList<List<T>> {
        @Override // java.util.AbstractList, java.util.List
        public Object get(int i2) {
            Preconditions.m11186j(i2, size());
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            throw null;
        }
    }

    public static class RandomAccessListWrapper<E> extends AbstractListWrapper<E> implements RandomAccess {
    }

    public static class RandomAccessPartition<T> extends Partition<T> implements RandomAccess {
    }

    public static class RandomAccessReverseList<T> extends ReverseList<T> implements RandomAccess {
        public RandomAccessReverseList(List<T> list) {
            super(list);
        }
    }

    public static class ReverseList<T> extends AbstractList<T> {

        /* renamed from: c */
        public static final /* synthetic */ int f21204c = 0;

        /* renamed from: b */
        public final List<T> f21205b;

        public ReverseList(List<T> list) {
            Objects.requireNonNull(list);
            this.f21205b = list;
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i2, @NullableDecl T t) {
            List<T> list = this.f21205b;
            int size = size();
            Preconditions.m11189m(i2, size);
            list.add(size - i2, t);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            this.f21205b.clear();
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int i2) {
            List<T> list = this.f21205b;
            int size = size();
            Preconditions.m11186j(i2, size);
            return list.get((size - 1) - i2);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<T> iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int i2) {
            int size = size();
            Preconditions.m11189m(i2, size);
            final ListIterator<T> listIterator = this.f21205b.listIterator(size - i2);
            return new ListIterator<T>() { // from class: com.google.common.collect.Lists.ReverseList.1

                /* renamed from: b */
                public boolean f21206b;

                @Override // java.util.ListIterator
                public void add(T t) {
                    listIterator.add(t);
                    listIterator.previous();
                    this.f21206b = false;
                }

                @Override // java.util.ListIterator, java.util.Iterator
                public boolean hasNext() {
                    return listIterator.hasPrevious();
                }

                @Override // java.util.ListIterator
                public boolean hasPrevious() {
                    return listIterator.hasNext();
                }

                @Override // java.util.ListIterator, java.util.Iterator
                public T next() {
                    if (!hasNext()) {
                        throw new NoSuchElementException();
                    }
                    this.f21206b = true;
                    return (T) listIterator.previous();
                }

                @Override // java.util.ListIterator
                public int nextIndex() {
                    ReverseList reverseList = ReverseList.this;
                    int nextIndex = listIterator.nextIndex();
                    int i3 = ReverseList.f21204c;
                    int size2 = reverseList.size();
                    Preconditions.m11189m(nextIndex, size2);
                    return size2 - nextIndex;
                }

                @Override // java.util.ListIterator
                public T previous() {
                    if (!hasPrevious()) {
                        throw new NoSuchElementException();
                    }
                    this.f21206b = true;
                    return (T) listIterator.next();
                }

                @Override // java.util.ListIterator
                public int previousIndex() {
                    return nextIndex() - 1;
                }

                @Override // java.util.ListIterator, java.util.Iterator
                public void remove() {
                    Preconditions.m11192p(this.f21206b, "no calls to next() since the last call to remove()");
                    listIterator.remove();
                    this.f21206b = false;
                }

                @Override // java.util.ListIterator
                public void set(T t) {
                    Preconditions.m11191o(this.f21206b);
                    listIterator.set(t);
                }
            };
        }

        @Override // java.util.AbstractList, java.util.List
        public T remove(int i2) {
            List<T> list = this.f21205b;
            int size = size();
            Preconditions.m11186j(i2, size);
            return list.remove((size - 1) - i2);
        }

        @Override // java.util.AbstractList
        public void removeRange(int i2, int i3) {
            subList(i2, i3).clear();
        }

        @Override // java.util.AbstractList, java.util.List
        public T set(int i2, @NullableDecl T t) {
            List<T> list = this.f21205b;
            int size = size();
            Preconditions.m11186j(i2, size);
            return list.set((size - 1) - i2, t);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f21205b.size();
        }

        @Override // java.util.AbstractList, java.util.List
        public List<T> subList(int i2, int i3) {
            Preconditions.m11190n(i2, i3, size());
            List<T> list = this.f21205b;
            int size = size();
            Preconditions.m11189m(i3, size);
            int i4 = size - i3;
            int size2 = size();
            Preconditions.m11189m(i2, size2);
            List<T> subList = list.subList(i4, size2 - i2);
            if (subList instanceof ImmutableList) {
                return ((ImmutableList) subList).mo11638G();
            }
            if (subList instanceof ReverseList) {
                return ((ReverseList) subList).f21205b;
            }
            return subList instanceof RandomAccess ? new RandomAccessReverseList<>(subList) : new ReverseList<>(subList);
        }
    }

    public static final class StringAsImmutableList extends ImmutableList<Character> {

        /* renamed from: d */
        public final String f21209d;

        public StringAsImmutableList(String str) {
            this.f21209d = str;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        /* renamed from: I */
        public ImmutableList<Character> subList(int i2, int i3) {
            Preconditions.m11190n(i2, i3, size());
            String substring = this.f21209d.substring(i2, i3);
            Objects.requireNonNull(substring);
            return new StringAsImmutableList(substring);
        }

        @Override // java.util.List
        public Object get(int i2) {
            Preconditions.m11186j(i2, size());
            return Character.valueOf(this.f21209d.charAt(i2));
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public int indexOf(@NullableDecl Object obj) {
            if (obj instanceof Character) {
                return this.f21209d.indexOf(((Character) obj).charValue());
            }
            return -1;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public int lastIndexOf(@NullableDecl Object obj) {
            if (obj instanceof Character) {
                return this.f21209d.lastIndexOf(((Character) obj).charValue());
            }
            return -1;
        }

        @Override // com.google.common.collect.ImmutableCollection
        /* renamed from: r */
        public boolean mo11425r() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f21209d.length();
        }
    }

    public static class TransformingRandomAccessList<F, T> extends AbstractList<T> implements RandomAccess, Serializable {

        /* renamed from: b */
        public final List<F> f21210b;

        /* renamed from: c */
        public final Function<? super F, ? extends T> f21211c;

        public TransformingRandomAccessList(List<F> list, Function<? super F, ? extends T> function) {
            Objects.requireNonNull(list);
            this.f21210b = list;
            Objects.requireNonNull(function);
            this.f21211c = function;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            this.f21210b.clear();
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int i2) {
            return this.f21211c.apply(this.f21210b.get(i2));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f21210b.isEmpty();
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<T> iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int i2) {
            return new TransformedListIterator<F, T>(this.f21210b.listIterator(i2)) { // from class: com.google.common.collect.Lists.TransformingRandomAccessList.1
                @Override // com.google.common.collect.TransformedIterator
                /* renamed from: a */
                public T mo11415a(F f2) {
                    return TransformingRandomAccessList.this.f21211c.apply(f2);
                }
            };
        }

        @Override // java.util.AbstractList, java.util.List
        public T remove(int i2) {
            return this.f21211c.apply(this.f21210b.remove(i2));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f21210b.size();
        }
    }

    public static class TransformingSequentialList<F, T> extends AbstractSequentialList<T> implements Serializable {

        /* renamed from: b */
        public final List<F> f21213b;

        /* renamed from: c */
        public final Function<? super F, ? extends T> f21214c;

        public TransformingSequentialList(List<F> list, Function<? super F, ? extends T> function) {
            Objects.requireNonNull(list);
            this.f21213b = list;
            Objects.requireNonNull(function);
            this.f21214c = function;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            this.f21213b.clear();
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int i2) {
            return new TransformedListIterator<F, T>(this.f21213b.listIterator(i2)) { // from class: com.google.common.collect.Lists.TransformingSequentialList.1
                @Override // com.google.common.collect.TransformedIterator
                /* renamed from: a */
                public T mo11415a(F f2) {
                    return TransformingSequentialList.this.f21214c.apply(f2);
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f21213b.size();
        }
    }

    public static class TwoPlusArrayList<E> extends AbstractList<E> implements Serializable, RandomAccess {
        @Override // java.util.AbstractList, java.util.List
        public E get(int i2) {
            if (i2 == 0 || i2 == 1) {
                return null;
            }
            Preconditions.m11186j(i2, size());
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            throw null;
        }
    }

    @VisibleForTesting
    /* renamed from: a */
    public static int m11734a(int i2) {
        CollectPreconditions.m11427b(i2, "arraySize");
        return Ints.m12084f(i2 + 5 + (i2 / 10));
    }

    @GwtCompatible
    /* renamed from: b */
    public static <E> ArrayList<E> m11735b(Iterable<? extends E> iterable) {
        Objects.requireNonNull(iterable);
        return iterable instanceof Collection ? new ArrayList<>((Collection) iterable) : m11736c(iterable.iterator());
    }

    @GwtCompatible
    /* renamed from: c */
    public static <E> ArrayList<E> m11736c(Iterator<? extends E> it) {
        ArrayList<E> arrayList = new ArrayList<>();
        Iterators.m11706a(arrayList, it);
        return arrayList;
    }

    @SafeVarargs
    @GwtCompatible
    /* renamed from: d */
    public static <E> ArrayList<E> m11737d(E... eArr) {
        Objects.requireNonNull(eArr);
        ArrayList<E> arrayList = new ArrayList<>(m11734a(eArr.length));
        Collections.addAll(arrayList, eArr);
        return arrayList;
    }

    @GwtCompatible
    /* renamed from: e */
    public static <E> ArrayList<E> m11738e(int i2) {
        CollectPreconditions.m11427b(i2, "initialArraySize");
        return new ArrayList<>(i2);
    }

    /* renamed from: f */
    public static <F, T> List<T> m11739f(List<F> list, Function<? super F, ? extends T> function) {
        return list instanceof RandomAccess ? new TransformingRandomAccessList(list, function) : new TransformingSequentialList(list, function);
    }
}
