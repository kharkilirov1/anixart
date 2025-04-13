package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: AbstractList.kt */
@SinceKotlin
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0004\u0004\u0005\u0006\u0007¨\u0006\b"}, m31884d2 = {"Lkotlin/collections/AbstractList;", "E", "Lkotlin/collections/AbstractCollection;", "", "Companion", "IteratorImpl", "ListIteratorImpl", "SubList", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public abstract class AbstractList<E> extends AbstractCollection<E> implements List<E> {

    /* renamed from: b */
    @NotNull
    public static final Companion f63114b = new Companion(null);

    /* compiled from: AbstractList.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/collections/AbstractList$Companion;", "", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        /* renamed from: a */
        public final void m31905a(int i2, int i3) {
            if (i2 < 0 || i2 >= i3) {
                throw new IndexOutOfBoundsException(C0000a.m9f("index: ", i2, ", size: ", i3));
            }
        }

        /* renamed from: b */
        public final void m31906b(int i2, int i3) {
            if (i2 < 0 || i2 > i3) {
                throw new IndexOutOfBoundsException(C0000a.m9f("index: ", i2, ", size: ", i3));
            }
        }

        /* renamed from: c */
        public final void m31907c(int i2, int i3, int i4) {
            if (i2 < 0 || i3 > i4) {
                StringBuilder m26w = C0000a.m26w("fromIndex: ", i2, ", toIndex: ", i3, ", size: ");
                m26w.append(i4);
                throw new IndexOutOfBoundsException(m26w.toString());
            }
            if (i2 > i3) {
                throw new IllegalArgumentException(C0000a.m9f("fromIndex: ", i2, " > toIndex: ", i3));
            }
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: AbstractList.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0000\b\u0092\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/collections/AbstractList$IteratorImpl;", "", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
    public class IteratorImpl implements Iterator<E>, KMappedMarker {

        /* renamed from: b */
        public int f63115b;

        public IteratorImpl() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f63115b < AbstractList.this.size();
        }

        @Override // java.util.Iterator
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            AbstractList<E> abstractList = AbstractList.this;
            int i2 = this.f63115b;
            this.f63115b = i2 + 1;
            return abstractList.get(i2);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* compiled from: AbstractList.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010*\n\u0000\b\u0092\u0004\u0018\u00002\f0\u0001R\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, m31884d2 = {"Lkotlin/collections/AbstractList$ListIteratorImpl;", "Lkotlin/collections/AbstractList$IteratorImpl;", "Lkotlin/collections/AbstractList;", "", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
    public class ListIteratorImpl extends AbstractList<E>.IteratorImpl implements ListIterator<E> {
        public ListIteratorImpl(int i2) {
            super();
            AbstractList.f63114b.m31906b(i2, AbstractList.this.size());
            this.f63115b = i2;
        }

        @Override // java.util.ListIterator
        public void add(E e2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f63115b > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f63115b;
        }

        @Override // java.util.ListIterator
        public E previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            AbstractList<E> abstractList = AbstractList.this;
            int i2 = this.f63115b - 1;
            this.f63115b = i2;
            return abstractList.get(i2);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f63115b - 1;
        }

        @Override // java.util.ListIterator
        public void set(E e2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* compiled from: AbstractList.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, m31884d2 = {"Lkotlin/collections/AbstractList$SubList;", "E", "Lkotlin/collections/AbstractList;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class SubList<E> extends AbstractList<E> implements RandomAccess {

        /* renamed from: c */
        @NotNull
        public final AbstractList<E> f63118c;

        /* renamed from: d */
        public final int f63119d;

        /* renamed from: e */
        public int f63120e;

        /* JADX WARN: Multi-variable type inference failed */
        public SubList(@NotNull AbstractList<? extends E> abstractList, int i2, int i3) {
            this.f63118c = abstractList;
            this.f63119d = i2;
            AbstractList.f63114b.m31907c(i2, i3, abstractList.size());
            this.f63120e = i3 - i2;
        }

        @Override // kotlin.collections.AbstractCollection
        /* renamed from: b, reason: from getter */
        public int getF63120e() {
            return this.f63120e;
        }

        @Override // kotlin.collections.AbstractList, java.util.List
        public E get(int i2) {
            AbstractList.f63114b.m31905a(i2, this.f63120e);
            return this.f63118c.get(this.f63119d + i2);
        }
    }

    @Override // java.util.List
    public void add(int i2, E e2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i2, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection other = (Collection) obj;
        Intrinsics.m32179h(other, "other");
        if (size() == other.size()) {
            Iterator<E> it = other.iterator();
            Iterator<E> it2 = iterator();
            while (it2.hasNext()) {
                if (!Intrinsics.m32174c(it2.next(), it.next())) {
                }
            }
            return true;
        }
        return false;
    }

    public abstract E get(int i2);

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        Iterator<E> it = iterator();
        int i2 = 1;
        while (it.hasNext()) {
            E next = it.next();
            i2 = (i2 * 31) + (next != null ? next.hashCode() : 0);
        }
        return i2;
    }

    @Override // java.util.List
    public int indexOf(E e2) {
        Iterator<E> it = iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (Intrinsics.m32174c(it.next(), e2)) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    @NotNull
    public Iterator<E> iterator() {
        return new IteratorImpl();
    }

    @Override // java.util.List
    public int lastIndexOf(E e2) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (Intrinsics.m32174c(listIterator.previous(), e2)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    @NotNull
    public ListIterator<E> listIterator() {
        return new ListIteratorImpl(0);
    }

    @Override // java.util.List
    public E remove(int i2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public E set(int i2, E e2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @NotNull
    public List<E> subList(int i2, int i3) {
        return new SubList(this, i2, i3);
    }

    @Override // java.util.List
    @NotNull
    public ListIterator<E> listIterator(int i2) {
        return new ListIteratorImpl(i2);
    }
}
