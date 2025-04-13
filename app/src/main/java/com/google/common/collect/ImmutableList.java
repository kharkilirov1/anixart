package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
public abstract class ImmutableList<E> extends ImmutableCollection<E> implements List<E>, RandomAccess {

    /* renamed from: c */
    public static final UnmodifiableListIterator<Object> f21033c = new Itr(RegularImmutableList.f21423f, 0);

    public static final class Builder<E> extends ImmutableCollection.ArrayBasedBuilder<E> {
        public Builder() {
            super(4);
        }

        @CanIgnoreReturnValue
        /* renamed from: d */
        public Builder<E> m11640d(E e2) {
            super.m11622b(e2);
            return this;
        }

        /* renamed from: e */
        public ImmutableList<E> m11641e() {
            this.f21030c = true;
            return ImmutableList.m11632u(this.f21028a, this.f21029b);
        }
    }

    public static class Itr<E> extends AbstractIndexedListIterator<E> {

        /* renamed from: d */
        public final ImmutableList<E> f21034d;

        public Itr(ImmutableList<E> immutableList, int i2) {
            super(immutableList.size(), i2);
            this.f21034d = immutableList;
        }

        @Override // com.google.common.collect.AbstractIndexedListIterator
        /* renamed from: a */
        public E mo11331a(int i2) {
            return this.f21034d.get(i2);
        }
    }

    public static class ReverseImmutableList<E> extends ImmutableList<E> {

        /* renamed from: d */
        public final transient ImmutableList<E> f21035d;

        public ReverseImmutableList(ImmutableList<E> immutableList) {
            this.f21035d = immutableList;
        }

        @Override // com.google.common.collect.ImmutableList
        /* renamed from: G */
        public ImmutableList<E> mo11638G() {
            return this.f21035d;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public ImmutableList<E> subList(int i2, int i3) {
            Preconditions.m11190n(i2, i3, size());
            return this.f21035d.subList(size() - i3, size() - i2).mo11638G();
        }

        /* renamed from: J */
        public final int m11642J(int i2) {
            return (size() - 1) - i2;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            return this.f21035d.contains(obj);
        }

        @Override // java.util.List
        public E get(int i2) {
            Preconditions.m11186j(i2, size());
            return this.f21035d.get((size() - 1) - i2);
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public int indexOf(@NullableDecl Object obj) {
            int lastIndexOf = this.f21035d.lastIndexOf(obj);
            if (lastIndexOf >= 0) {
                return m11642J(lastIndexOf);
            }
            return -1;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
        public Iterator iterator() {
            return listIterator();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public int lastIndexOf(@NullableDecl Object obj) {
            int indexOf = this.f21035d.indexOf(obj);
            if (indexOf >= 0) {
                return m11642J(indexOf);
            }
            return -1;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return listIterator();
        }

        @Override // com.google.common.collect.ImmutableCollection
        /* renamed from: r */
        public boolean mo11425r() {
            return this.f21035d.mo11425r();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f21035d.size();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i2) {
            return listIterator(i2);
        }
    }

    public static class SerializedForm implements Serializable {
    }

    public class SubList extends ImmutableList<E> {

        /* renamed from: d */
        public final transient int f21036d;

        /* renamed from: e */
        public final transient int f21037e;

        public SubList(int i2, int i3) {
            this.f21036d = i2;
            this.f21037e = i3;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        /* renamed from: I */
        public ImmutableList<E> subList(int i2, int i3) {
            Preconditions.m11190n(i2, i3, this.f21037e);
            ImmutableList immutableList = ImmutableList.this;
            int i4 = this.f21036d;
            return immutableList.subList(i2 + i4, i3 + i4);
        }

        @Override // com.google.common.collect.ImmutableCollection
        /* renamed from: e */
        public Object[] mo11619e() {
            return ImmutableList.this.mo11619e();
        }

        @Override // com.google.common.collect.ImmutableCollection
        /* renamed from: f */
        public int mo11620f() {
            return ImmutableList.this.mo11621g() + this.f21036d + this.f21037e;
        }

        @Override // com.google.common.collect.ImmutableCollection
        /* renamed from: g */
        public int mo11621g() {
            return ImmutableList.this.mo11621g() + this.f21036d;
        }

        @Override // java.util.List
        public E get(int i2) {
            Preconditions.m11186j(i2, this.f21037e);
            return ImmutableList.this.get(i2 + this.f21036d);
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
        public Iterator iterator() {
            return listIterator();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return listIterator();
        }

        @Override // com.google.common.collect.ImmutableCollection
        /* renamed from: r */
        public boolean mo11425r() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f21037e;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i2) {
            return listIterator(i2);
        }
    }

    /* renamed from: D */
    public static <E> ImmutableList<E> m11627D() {
        return (ImmutableList<E>) RegularImmutableList.f21423f;
    }

    /* renamed from: E */
    public static <E> ImmutableList<E> m11628E(E e2) {
        return m11633x(e2);
    }

    /* renamed from: F */
    public static <E> ImmutableList<E> m11629F(E e2, E e3, E e4, E e5, E e6) {
        return m11633x(e2, e3, e4, e5, e6);
    }

    /* renamed from: H */
    public static <E> ImmutableList<E> m11630H(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        Object[] array = (iterable instanceof Collection ? (Collection) iterable : Lists.m11736c(iterable.iterator())).toArray();
        int length = array.length;
        for (int i2 = 0; i2 < length; i2++) {
            ObjectArrays.m11827a(array[i2], i2);
        }
        Arrays.sort(array, comparator);
        return m11632u(array, array.length);
    }

    /* renamed from: t */
    public static <E> ImmutableList<E> m11631t(Object[] objArr) {
        return m11632u(objArr, objArr.length);
    }

    /* renamed from: u */
    public static <E> ImmutableList<E> m11632u(Object[] objArr, int i2) {
        return i2 == 0 ? (ImmutableList<E>) RegularImmutableList.f21423f : new RegularImmutableList(objArr, i2);
    }

    /* renamed from: x */
    public static <E> ImmutableList<E> m11633x(Object... objArr) {
        int length = objArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            ObjectArrays.m11827a(objArr[i2], i2);
        }
        return m11632u(objArr, objArr.length);
    }

    /* renamed from: y */
    public static <E> ImmutableList<E> m11634y(Collection<? extends E> collection) {
        if (!(collection instanceof ImmutableCollection)) {
            return m11633x(collection.toArray());
        }
        ImmutableList<E> mo11543b = ((ImmutableCollection) collection).mo11543b();
        return mo11543b.mo11425r() ? m11631t(mo11543b.toArray()) : mo11543b;
    }

    /* renamed from: z */
    public static <E> ImmutableList<E> m11635z(E[] eArr) {
        return eArr.length == 0 ? (ImmutableList<E>) RegularImmutableList.f21423f : m11633x((Object[]) eArr.clone());
    }

    @Override // java.util.List
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public UnmodifiableListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public UnmodifiableListIterator<E> listIterator(int i2) {
        Preconditions.m11189m(i2, size());
        return isEmpty() ? (UnmodifiableListIterator<E>) f21033c : new Itr(this, i2);
    }

    /* renamed from: G */
    public ImmutableList<E> mo11638G() {
        return size() <= 1 ? this : new ReverseImmutableList(this);
    }

    @Override // java.util.List
    /* renamed from: I */
    public ImmutableList<E> subList(int i2, int i3) {
        Preconditions.m11190n(i2, i3, size());
        int i4 = i3 - i2;
        return i4 == size() ? this : i4 == 0 ? (ImmutableList<E>) RegularImmutableList.f21423f : new SubList(i2, i4);
    }

    @Override // java.util.List
    @DoNotCall
    @Deprecated
    public final void add(int i2, E e2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @CanIgnoreReturnValue
    @DoNotCall
    @Deprecated
    public final boolean addAll(int i2, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* renamed from: b */
    public final ImmutableList<E> mo11543b() {
        return this;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@NullableDecl Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* renamed from: d */
    public int mo11618d(Object[] objArr, int i2) {
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            objArr[i2 + i3] = get(i3);
        }
        return i2 + size;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(@NullableDecl Object obj) {
        if (obj != this) {
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            int size = size();
            if (size != list.size()) {
                return false;
            }
            if (!(list instanceof RandomAccess)) {
                Iterator<E> it = iterator();
                Iterator<E> it2 = list.iterator();
                while (it.hasNext()) {
                    if (!it2.hasNext() || !Objects.m11173a(it.next(), it2.next())) {
                        return false;
                    }
                }
                return !it2.hasNext();
            }
            for (int i2 = 0; i2 < size; i2++) {
                if (!Objects.m11173a(get(i2), list.get(i2))) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i2 = 1;
        for (int i3 = 0; i3 < size; i3++) {
            i2 = ~(~(get(i3).hashCode() + (i2 * 31)));
        }
        return i2;
    }

    @Override // java.util.List
    public int indexOf(@NullableDecl Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (obj.equals(get(i2))) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(@NullableDecl Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    @CanIgnoreReturnValue
    @DoNotCall
    @Deprecated
    public final E remove(int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* renamed from: s */
    public UnmodifiableIterator<E> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    @CanIgnoreReturnValue
    @DoNotCall
    @Deprecated
    public final E set(int i2, E e2) {
        throw new UnsupportedOperationException();
    }
}
