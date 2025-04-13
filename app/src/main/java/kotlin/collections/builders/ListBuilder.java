package kotlin.collections.builders;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.collections.AbstractMutableList;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableListIterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ListBuilder.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\u00060\u0006j\u0002`\u0007:\u0001\b¨\u0006\t"}, m31884d2 = {"Lkotlin/collections/builders/ListBuilder;", "E", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lkotlin/collections/AbstractMutableList;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Itr", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class ListBuilder<E> extends AbstractMutableList<E> implements RandomAccess, Serializable {

    /* renamed from: b */
    @NotNull
    public E[] f63175b;

    /* renamed from: c */
    public int f63176c;

    /* renamed from: d */
    public int f63177d;

    /* renamed from: e */
    public boolean f63178e;

    /* renamed from: f */
    @Nullable
    public final ListBuilder<E> f63179f;

    /* renamed from: g */
    @Nullable
    public final ListBuilder<E> f63180g;

    /* compiled from: ListBuilder.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlin/collections/builders/ListBuilder$Itr;", "E", "", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Itr<E> implements ListIterator<E>, KMutableListIterator {

        /* renamed from: b */
        @NotNull
        public final ListBuilder<E> f63181b;

        /* renamed from: c */
        public int f63182c;

        /* renamed from: d */
        public int f63183d = -1;

        public Itr(@NotNull ListBuilder<E> listBuilder, int i2) {
            this.f63181b = listBuilder;
            this.f63182c = i2;
        }

        @Override // java.util.ListIterator
        public void add(E e2) {
            ListBuilder<E> listBuilder = this.f63181b;
            int i2 = this.f63182c;
            this.f63182c = i2 + 1;
            listBuilder.add(i2, e2);
            this.f63183d = -1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f63182c < this.f63181b.f63177d;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f63182c > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public E next() {
            int i2 = this.f63182c;
            ListBuilder<E> listBuilder = this.f63181b;
            if (i2 >= listBuilder.f63177d) {
                throw new NoSuchElementException();
            }
            this.f63182c = i2 + 1;
            this.f63183d = i2;
            return listBuilder.f63175b[listBuilder.f63176c + i2];
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f63182c;
        }

        @Override // java.util.ListIterator
        public E previous() {
            int i2 = this.f63182c;
            if (i2 <= 0) {
                throw new NoSuchElementException();
            }
            int i3 = i2 - 1;
            this.f63182c = i3;
            this.f63183d = i3;
            ListBuilder<E> listBuilder = this.f63181b;
            return listBuilder.f63175b[listBuilder.f63176c + i3];
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f63182c - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            int i2 = this.f63183d;
            if (!(i2 != -1)) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
            }
            this.f63181b.mo31912d(i2);
            this.f63182c = this.f63183d;
            this.f63183d = -1;
        }

        @Override // java.util.ListIterator
        public void set(E e2) {
            int i2 = this.f63183d;
            if (!(i2 != -1)) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
            }
            this.f63181b.set(i2, e2);
        }
    }

    public ListBuilder(E[] eArr, int i2, int i3, boolean z, ListBuilder<E> listBuilder, ListBuilder<E> listBuilder2) {
        this.f63175b = eArr;
        this.f63176c = i2;
        this.f63177d = i3;
        this.f63178e = z;
        this.f63179f = listBuilder;
        this.f63180g = listBuilder2;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e2) {
        m32086r();
        m32085g(this.f63176c + this.f63177d, e2);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(@NotNull Collection<? extends E> elements) {
        Intrinsics.m32179h(elements, "elements");
        m32086r();
        int size = elements.size();
        m32084f(this.f63176c + this.f63177d, elements, size);
        return size > 0;
    }

    @Override // kotlin.collections.AbstractMutableList
    /* renamed from: b, reason: from getter */
    public int getF63177d() {
        return this.f63177d;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        m32086r();
        m32089u(this.f63176c, this.f63177d);
    }

    @Override // kotlin.collections.AbstractMutableList
    /* renamed from: d */
    public E mo31912d(int i2) {
        m32086r();
        AbstractList.f63114b.m31905a(i2, this.f63177d);
        return m32088t(this.f63176c + i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = 1
            if (r9 == r8) goto L30
            boolean r2 = r9 instanceof java.util.List
            if (r2 == 0) goto L31
            java.util.List r9 = (java.util.List) r9
            E[] r2 = r8.f63175b
            int r3 = r8.f63176c
            int r4 = r8.f63177d
            int r5 = r9.size()
            if (r4 == r5) goto L17
            goto L28
        L17:
            r5 = 0
        L18:
            if (r5 >= r4) goto L2d
            int r6 = r3 + r5
            r6 = r2[r6]
            java.lang.Object r7 = r9.get(r5)
            boolean r6 = kotlin.jvm.internal.Intrinsics.m32174c(r6, r7)
            if (r6 != 0) goto L2a
        L28:
            r9 = 0
            goto L2e
        L2a:
            int r5 = r5 + 1
            goto L18
        L2d:
            r9 = 1
        L2e:
            if (r9 == 0) goto L31
        L30:
            r0 = 1
        L31:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.builders.ListBuilder.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final void m32084f(int i2, Collection<? extends E> collection, int i3) {
        ListBuilder<E> listBuilder = this.f63179f;
        if (listBuilder != null) {
            listBuilder.m32084f(i2, collection, i3);
            this.f63175b = this.f63179f.f63175b;
            this.f63177d += i3;
        } else {
            m32087s(i2, i3);
            Iterator<? extends E> it = collection.iterator();
            for (int i4 = 0; i4 < i3; i4++) {
                this.f63175b[i2 + i4] = it.next();
            }
        }
    }

    /* renamed from: g */
    public final void m32085g(int i2, E e2) {
        ListBuilder<E> listBuilder = this.f63179f;
        if (listBuilder == null) {
            m32087s(i2, 1);
            this.f63175b[i2] = e2;
        } else {
            listBuilder.m32085g(i2, e2);
            this.f63175b = this.f63179f.f63175b;
            this.f63177d++;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i2) {
        AbstractList.f63114b.m31905a(i2, this.f63177d);
        return this.f63175b[this.f63176c + i2];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        E[] eArr = this.f63175b;
        int i2 = this.f63176c;
        int i3 = this.f63177d;
        int i4 = 1;
        for (int i5 = 0; i5 < i3; i5++) {
            E e2 = eArr[i2 + i5];
            i4 = (i4 * 31) + (e2 != null ? e2.hashCode() : 0);
        }
        return i4;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        for (int i2 = 0; i2 < this.f63177d; i2++) {
            if (Intrinsics.m32174c(this.f63175b[this.f63176c + i2], obj)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.f63177d == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @NotNull
    public Iterator<E> iterator() {
        return new Itr(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        for (int i2 = this.f63177d - 1; i2 >= 0; i2--) {
            if (Intrinsics.m32174c(this.f63175b[this.f63176c + i2], obj)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public ListIterator<E> listIterator() {
        return new Itr(this, 0);
    }

    /* renamed from: r */
    public final void m32086r() {
        ListBuilder<E> listBuilder;
        if (this.f63178e || ((listBuilder = this.f63180g) != null && listBuilder.f63178e)) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        m32086r();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            mo31912d(indexOf);
        }
        return indexOf >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.m32179h(elements, "elements");
        m32086r();
        return m32090x(this.f63176c, this.f63177d, elements, false) > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.m32179h(elements, "elements");
        m32086r();
        return m32090x(this.f63176c, this.f63177d, elements, true) > 0;
    }

    /* renamed from: s */
    public final void m32087s(int i2, int i3) {
        int i4 = this.f63177d + i3;
        if (this.f63179f != null) {
            throw new IllegalStateException();
        }
        if (i4 < 0) {
            throw new OutOfMemoryError();
        }
        E[] eArr = this.f63175b;
        if (i4 > eArr.length) {
            this.f63175b = (E[]) ListBuilderKt.m32092b(this.f63175b, ArrayDeque.f63130e.m31924a(eArr.length, i4));
        }
        E[] eArr2 = this.f63175b;
        ArraysKt.m31968r(eArr2, eArr2, i2 + i3, i2, this.f63176c + this.f63177d);
        this.f63177d += i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i2, E e2) {
        m32086r();
        AbstractList.f63114b.m31905a(i2, this.f63177d);
        E[] eArr = this.f63175b;
        int i3 = this.f63176c;
        E e3 = eArr[i3 + i2];
        eArr[i3 + i2] = e2;
        return e3;
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public List<E> subList(int i2, int i3) {
        AbstractList.f63114b.m31907c(i2, i3, this.f63177d);
        E[] eArr = this.f63175b;
        int i4 = this.f63176c + i2;
        int i5 = i3 - i2;
        boolean z = this.f63178e;
        ListBuilder<E> listBuilder = this.f63180g;
        return new ListBuilder(eArr, i4, i5, z, this, listBuilder == null ? this : listBuilder);
    }

    /* renamed from: t */
    public final E m32088t(int i2) {
        ListBuilder<E> listBuilder = this.f63179f;
        if (listBuilder != null) {
            this.f63177d--;
            return listBuilder.m32088t(i2);
        }
        E[] eArr = this.f63175b;
        E e2 = eArr[i2];
        ArraysKt.m31968r(eArr, eArr, i2, i2 + 1, this.f63176c + this.f63177d);
        ListBuilderKt.m32093c(this.f63175b, (this.f63176c + this.f63177d) - 1);
        this.f63177d--;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public <T> T[] toArray(@NotNull T[] destination) {
        Intrinsics.m32179h(destination, "destination");
        int length = destination.length;
        int i2 = this.f63177d;
        if (length < i2) {
            E[] eArr = this.f63175b;
            int i3 = this.f63176c;
            T[] tArr = (T[]) Arrays.copyOfRange(eArr, i3, i2 + i3, destination.getClass());
            Intrinsics.m32178g(tArr, "copyOfRange(array, offse…h, destination.javaClass)");
            return tArr;
        }
        E[] eArr2 = this.f63175b;
        Intrinsics.m32177f(eArr2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.builders.ListBuilder.toArray>");
        int i4 = this.f63176c;
        ArraysKt.m31968r(eArr2, destination, 0, i4, this.f63177d + i4);
        int length2 = destination.length;
        int i5 = this.f63177d;
        if (length2 > i5) {
            destination[i5] = null;
        }
        return destination;
    }

    @Override // java.util.AbstractCollection
    @NotNull
    public String toString() {
        E[] eArr = this.f63175b;
        int i2 = this.f63176c;
        int i3 = this.f63177d;
        StringBuilder sb = new StringBuilder((i3 * 3) + 2);
        sb.append("[");
        for (int i4 = 0; i4 < i3; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            sb.append(eArr[i2 + i4]);
        }
        sb.append("]");
        String sb2 = sb.toString();
        Intrinsics.m32178g(sb2, "sb.toString()");
        return sb2;
    }

    /* renamed from: u */
    public final void m32089u(int i2, int i3) {
        ListBuilder<E> listBuilder = this.f63179f;
        if (listBuilder != null) {
            listBuilder.m32089u(i2, i3);
        } else {
            E[] eArr = this.f63175b;
            ArraysKt.m31968r(eArr, eArr, i2, i2 + i3, this.f63177d);
            E[] eArr2 = this.f63175b;
            int i4 = this.f63177d;
            ListBuilderKt.m32094d(eArr2, i4 - i3, i4);
        }
        this.f63177d -= i3;
    }

    /* renamed from: x */
    public final int m32090x(int i2, int i3, Collection<? extends E> collection, boolean z) {
        ListBuilder<E> listBuilder = this.f63179f;
        if (listBuilder != null) {
            int m32090x = listBuilder.m32090x(i2, i3, collection, z);
            this.f63177d -= m32090x;
            return m32090x;
        }
        int i4 = 0;
        int i5 = 0;
        while (i4 < i3) {
            int i6 = i2 + i4;
            if (collection.contains(this.f63175b[i6]) == z) {
                E[] eArr = this.f63175b;
                i4++;
                eArr[i5 + i2] = eArr[i6];
                i5++;
            } else {
                i4++;
            }
        }
        int i7 = i3 - i5;
        E[] eArr2 = this.f63175b;
        ArraysKt.m31968r(eArr2, eArr2, i2 + i5, i3 + i2, this.f63177d);
        E[] eArr3 = this.f63175b;
        int i8 = this.f63177d;
        ListBuilderKt.m32094d(eArr3, i8 - i7, i8);
        this.f63177d -= i7;
        return i7;
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public ListIterator<E> listIterator(int i2) {
        AbstractList.f63114b.m31906b(i2, this.f63177d);
        return new Itr(this, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i2, E e2) {
        m32086r();
        AbstractList.f63114b.m31906b(i2, this.f63177d);
        m32085g(this.f63176c + i2, e2);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i2, @NotNull Collection<? extends E> elements) {
        Intrinsics.m32179h(elements, "elements");
        m32086r();
        AbstractList.f63114b.m31906b(i2, this.f63177d);
        int size = elements.size();
        m32084f(this.f63176c + i2, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public Object[] toArray() {
        E[] eArr = this.f63175b;
        int i2 = this.f63176c;
        return ArraysKt.m31972v(eArr, i2, this.f63177d + i2);
    }

    public ListBuilder() {
        this(10);
    }

    public ListBuilder(int i2) {
        this.f63175b = (E[]) ListBuilderKt.m32091a(i2);
        this.f63176c = 0;
        this.f63177d = 0;
        this.f63178e = false;
        this.f63179f = null;
        this.f63180g = null;
    }
}
