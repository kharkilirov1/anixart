package kotlin.collections;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ArrayDeque.kt */
@SinceKotlin
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lkotlin/collections/ArrayDeque;", "E", "Lkotlin/collections/AbstractMutableList;", "Companion", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
@WasExperimental
/* loaded from: classes3.dex */
public final class ArrayDeque<E> extends AbstractMutableList<E> {

    /* renamed from: e */
    @NotNull
    public static final Companion f63130e = new Companion(null);

    /* renamed from: f */
    @NotNull
    public static final Object[] f63131f = new Object[0];

    /* renamed from: b */
    public int f63132b;

    /* renamed from: c */
    @NotNull
    public Object[] f63133c = f63131f;

    /* renamed from: d */
    public int f63134d;

    /* compiled from: ArrayDeque.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\t"}, m31884d2 = {"Lkotlin/collections/ArrayDeque$Companion;", "", "", "defaultMinCapacity", "I", "", "emptyElementData", "[Ljava/lang/Object;", "maxArraySize", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        /* renamed from: a */
        public final int m31924a(int i2, int i3) {
            int i4 = i2 + (i2 >> 1);
            if (i4 - i3 < 0) {
                i4 = i3;
            }
            return i4 - 2147483639 > 0 ? i3 > 2147483639 ? Integer.MAX_VALUE : 2147483639 : i4;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e2) {
        addLast(e2);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(@NotNull Collection<? extends E> elements) {
        Intrinsics.m32179h(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        m31919r(elements.size() + getF63134d());
        m31917f(m31923x(this.f63132b + getF63134d()), elements);
        return true;
    }

    public final void addLast(E e2) {
        m31919r(getF63134d() + 1);
        this.f63133c[m31923x(this.f63132b + getF63134d())] = e2;
        this.f63134d = getF63134d() + 1;
    }

    @Override // kotlin.collections.AbstractMutableList
    /* renamed from: b, reason: from getter */
    public int getF63134d() {
        return this.f63134d;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        int m31923x = m31923x(this.f63132b + getF63134d());
        int i2 = this.f63132b;
        if (i2 < m31923x) {
            ArraysKt.m31973w(this.f63133c, null, i2, m31923x);
        } else if (!isEmpty()) {
            Object[] objArr = this.f63133c;
            ArraysKt.m31973w(objArr, null, this.f63132b, objArr.length);
            ArraysKt.m31973w(this.f63133c, null, 0, m31923x);
        }
        this.f63132b = 0;
        this.f63134d = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // kotlin.collections.AbstractMutableList
    /* renamed from: d */
    public E mo31912d(int i2) {
        AbstractList.f63114b.m31905a(i2, getF63134d());
        if (i2 == CollectionsKt.m32047x(this)) {
            return removeLast();
        }
        if (i2 == 0) {
            return removeFirst();
        }
        int m31923x = m31923x(this.f63132b + i2);
        E e2 = (E) this.f63133c[m31923x];
        if (i2 < (getF63134d() >> 1)) {
            int i3 = this.f63132b;
            if (m31923x >= i3) {
                Object[] objArr = this.f63133c;
                ArraysKt.m31968r(objArr, objArr, i3 + 1, i3, m31923x);
            } else {
                Object[] objArr2 = this.f63133c;
                ArraysKt.m31968r(objArr2, objArr2, 1, 0, m31923x);
                Object[] objArr3 = this.f63133c;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i4 = this.f63132b;
                ArraysKt.m31968r(objArr3, objArr3, i4 + 1, i4, objArr3.length - 1);
            }
            Object[] objArr4 = this.f63133c;
            int i5 = this.f63132b;
            objArr4[i5] = null;
            this.f63132b = m31920s(i5);
        } else {
            int m31923x2 = m31923x(CollectionsKt.m32047x(this) + this.f63132b);
            if (m31923x <= m31923x2) {
                Object[] objArr5 = this.f63133c;
                ArraysKt.m31968r(objArr5, objArr5, m31923x, m31923x + 1, m31923x2 + 1);
            } else {
                Object[] objArr6 = this.f63133c;
                ArraysKt.m31968r(objArr6, objArr6, m31923x, m31923x + 1, objArr6.length);
                Object[] objArr7 = this.f63133c;
                objArr7[objArr7.length - 1] = objArr7[0];
                ArraysKt.m31968r(objArr7, objArr7, 0, 1, m31923x2 + 1);
            }
            this.f63133c[m31923x2] = null;
        }
        this.f63134d = getF63134d() - 1;
        return e2;
    }

    /* renamed from: f */
    public final void m31917f(int i2, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.f63133c.length;
        while (i2 < length && it.hasNext()) {
            this.f63133c[i2] = it.next();
            i2++;
        }
        int i3 = this.f63132b;
        for (int i4 = 0; i4 < i3 && it.hasNext(); i4++) {
            this.f63133c[i4] = it.next();
        }
        this.f63134d = collection.size() + this.f63134d;
    }

    /* renamed from: g */
    public final int m31918g(int i2) {
        return i2 == 0 ? ArraysKt.m31929E(this.f63133c) : i2 - 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i2) {
        AbstractList.f63114b.m31905a(i2, getF63134d());
        return (E) this.f63133c[m31923x(this.f63132b + i2)];
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int i2;
        int m31923x = m31923x(this.f63132b + getF63134d());
        int i3 = this.f63132b;
        if (i3 < m31923x) {
            while (i3 < m31923x) {
                if (Intrinsics.m32174c(obj, this.f63133c[i3])) {
                    i2 = this.f63132b;
                } else {
                    i3++;
                }
            }
            return -1;
        }
        if (i3 < m31923x) {
            return -1;
        }
        int length = this.f63133c.length;
        while (true) {
            if (i3 >= length) {
                for (int i4 = 0; i4 < m31923x; i4++) {
                    if (Intrinsics.m32174c(obj, this.f63133c[i4])) {
                        i3 = i4 + this.f63133c.length;
                        i2 = this.f63132b;
                    }
                }
                return -1;
            }
            if (Intrinsics.m32174c(obj, this.f63133c[i3])) {
                i2 = this.f63132b;
                break;
            }
            i3++;
        }
        return i3 - i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return getF63134d() == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int m31929E;
        int i2;
        int m31923x = m31923x(this.f63132b + getF63134d());
        int i3 = this.f63132b;
        if (i3 < m31923x) {
            m31929E = m31923x - 1;
            if (i3 <= m31929E) {
                while (!Intrinsics.m32174c(obj, this.f63133c[m31929E])) {
                    if (m31929E != i3) {
                        m31929E--;
                    }
                }
                i2 = this.f63132b;
                return m31929E - i2;
            }
            return -1;
        }
        if (i3 > m31923x) {
            int i4 = m31923x - 1;
            while (true) {
                if (-1 >= i4) {
                    m31929E = ArraysKt.m31929E(this.f63133c);
                    int i5 = this.f63132b;
                    if (i5 <= m31929E) {
                        while (!Intrinsics.m32174c(obj, this.f63133c[m31929E])) {
                            if (m31929E != i5) {
                                m31929E--;
                            }
                        }
                        i2 = this.f63132b;
                    }
                } else {
                    if (Intrinsics.m32174c(obj, this.f63133c[i4])) {
                        m31929E = i4 + this.f63133c.length;
                        i2 = this.f63132b;
                        break;
                    }
                    i4--;
                }
            }
        }
        return -1;
    }

    /* renamed from: r */
    public final void m31919r(int i2) {
        if (i2 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f63133c;
        if (i2 <= objArr.length) {
            return;
        }
        if (objArr == f63131f) {
            if (i2 < 10) {
                i2 = 10;
            }
            this.f63133c = new Object[i2];
            return;
        }
        Object[] objArr2 = new Object[f63130e.m31924a(objArr.length, i2)];
        Object[] objArr3 = this.f63133c;
        ArraysKt.m31968r(objArr3, objArr2, 0, this.f63132b, objArr3.length);
        Object[] objArr4 = this.f63133c;
        int length = objArr4.length;
        int i3 = this.f63132b;
        ArraysKt.m31968r(objArr4, objArr2, length - i3, 0, i3);
        this.f63132b = 0;
        this.f63133c = objArr2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        mo31912d(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(@NotNull Collection<? extends Object> elements) {
        int m31923x;
        Intrinsics.m32179h(elements, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty()) {
            if (!(this.f63133c.length == 0)) {
                int m31923x2 = m31923x(this.f63132b + getF63134d());
                int i2 = this.f63132b;
                if (i2 < m31923x2) {
                    m31923x = i2;
                    while (i2 < m31923x2) {
                        Object obj = this.f63133c[i2];
                        if (!elements.contains(obj)) {
                            this.f63133c[m31923x] = obj;
                            m31923x++;
                        } else {
                            z = true;
                        }
                        i2++;
                    }
                    ArraysKt.m31973w(this.f63133c, null, m31923x, m31923x2);
                } else {
                    int length = this.f63133c.length;
                    int i3 = i2;
                    boolean z2 = false;
                    while (i2 < length) {
                        Object[] objArr = this.f63133c;
                        Object obj2 = objArr[i2];
                        objArr[i2] = null;
                        if (!elements.contains(obj2)) {
                            this.f63133c[i3] = obj2;
                            i3++;
                        } else {
                            z2 = true;
                        }
                        i2++;
                    }
                    m31923x = m31923x(i3);
                    for (int i4 = 0; i4 < m31923x2; i4++) {
                        Object[] objArr2 = this.f63133c;
                        Object obj3 = objArr2[i4];
                        objArr2[i4] = null;
                        if (!elements.contains(obj3)) {
                            this.f63133c[m31923x] = obj3;
                            m31923x = m31920s(m31923x);
                        } else {
                            z2 = true;
                        }
                    }
                    z = z2;
                }
                if (z) {
                    this.f63134d = m31922u(m31923x - this.f63132b);
                }
            }
        }
        return z;
    }

    public final E removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        Object[] objArr = this.f63133c;
        int i2 = this.f63132b;
        E e2 = (E) objArr[i2];
        objArr[i2] = null;
        this.f63132b = m31920s(i2);
        this.f63134d = getF63134d() - 1;
        return e2;
    }

    public final E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        int m31923x = m31923x(CollectionsKt.m32047x(this) + this.f63132b);
        Object[] objArr = this.f63133c;
        E e2 = (E) objArr[m31923x];
        objArr[m31923x] = null;
        this.f63134d = getF63134d() - 1;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(@NotNull Collection<? extends Object> elements) {
        int m31923x;
        Intrinsics.m32179h(elements, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty()) {
            if (!(this.f63133c.length == 0)) {
                int m31923x2 = m31923x(this.f63132b + getF63134d());
                int i2 = this.f63132b;
                if (i2 < m31923x2) {
                    m31923x = i2;
                    while (i2 < m31923x2) {
                        Object obj = this.f63133c[i2];
                        if (elements.contains(obj)) {
                            this.f63133c[m31923x] = obj;
                            m31923x++;
                        } else {
                            z = true;
                        }
                        i2++;
                    }
                    ArraysKt.m31973w(this.f63133c, null, m31923x, m31923x2);
                } else {
                    int length = this.f63133c.length;
                    int i3 = i2;
                    boolean z2 = false;
                    while (i2 < length) {
                        Object[] objArr = this.f63133c;
                        Object obj2 = objArr[i2];
                        objArr[i2] = null;
                        if (elements.contains(obj2)) {
                            this.f63133c[i3] = obj2;
                            i3++;
                        } else {
                            z2 = true;
                        }
                        i2++;
                    }
                    m31923x = m31923x(i3);
                    for (int i4 = 0; i4 < m31923x2; i4++) {
                        Object[] objArr2 = this.f63133c;
                        Object obj3 = objArr2[i4];
                        objArr2[i4] = null;
                        if (elements.contains(obj3)) {
                            this.f63133c[m31923x] = obj3;
                            m31923x = m31920s(m31923x);
                        } else {
                            z2 = true;
                        }
                    }
                    z = z2;
                }
                if (z) {
                    this.f63134d = m31922u(m31923x - this.f63132b);
                }
            }
        }
        return z;
    }

    /* renamed from: s */
    public final int m31920s(int i2) {
        if (i2 == ArraysKt.m31929E(this.f63133c)) {
            return 0;
        }
        return i2 + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i2, E e2) {
        AbstractList.f63114b.m31905a(i2, getF63134d());
        int m31923x = m31923x(this.f63132b + i2);
        Object[] objArr = this.f63133c;
        E e3 = (E) objArr[m31923x];
        objArr[m31923x] = e2;
        return e3;
    }

    @Nullable
    /* renamed from: t */
    public final E m31921t() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.f63133c[m31923x(CollectionsKt.m32047x(this) + this.f63132b)];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public Object[] toArray() {
        return toArray(new Object[getF63134d()]);
    }

    /* renamed from: u */
    public final int m31922u(int i2) {
        return i2 < 0 ? i2 + this.f63133c.length : i2;
    }

    /* renamed from: x */
    public final int m31923x(int i2) {
        Object[] objArr = this.f63133c;
        return i2 >= objArr.length ? i2 - objArr.length : i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i2, E e2) {
        AbstractList.f63114b.m31906b(i2, getF63134d());
        if (i2 == getF63134d()) {
            addLast(e2);
            return;
        }
        if (i2 == 0) {
            m31919r(getF63134d() + 1);
            int m31918g = m31918g(this.f63132b);
            this.f63132b = m31918g;
            this.f63133c[m31918g] = e2;
            this.f63134d = getF63134d() + 1;
            return;
        }
        m31919r(getF63134d() + 1);
        int m31923x = m31923x(this.f63132b + i2);
        if (i2 < ((getF63134d() + 1) >> 1)) {
            int m31918g2 = m31918g(m31923x);
            int m31918g3 = m31918g(this.f63132b);
            int i3 = this.f63132b;
            if (m31918g2 >= i3) {
                Object[] objArr = this.f63133c;
                objArr[m31918g3] = objArr[i3];
                ArraysKt.m31968r(objArr, objArr, i3, i3 + 1, m31918g2 + 1);
            } else {
                Object[] objArr2 = this.f63133c;
                ArraysKt.m31968r(objArr2, objArr2, i3 - 1, i3, objArr2.length);
                Object[] objArr3 = this.f63133c;
                objArr3[objArr3.length - 1] = objArr3[0];
                ArraysKt.m31968r(objArr3, objArr3, 0, 1, m31918g2 + 1);
            }
            this.f63133c[m31918g2] = e2;
            this.f63132b = m31918g3;
        } else {
            int m31923x2 = m31923x(this.f63132b + getF63134d());
            if (m31923x < m31923x2) {
                Object[] objArr4 = this.f63133c;
                ArraysKt.m31968r(objArr4, objArr4, m31923x + 1, m31923x, m31923x2);
            } else {
                Object[] objArr5 = this.f63133c;
                ArraysKt.m31968r(objArr5, objArr5, 1, 0, m31923x2);
                Object[] objArr6 = this.f63133c;
                objArr6[0] = objArr6[objArr6.length - 1];
                ArraysKt.m31968r(objArr6, objArr6, m31923x + 1, m31923x, objArr6.length - 1);
            }
            this.f63133c[m31923x] = e2;
        }
        this.f63134d = getF63134d() + 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public <T> T[] toArray(@NotNull T[] array) {
        Intrinsics.m32179h(array, "array");
        if (array.length < getF63134d()) {
            Object newInstance = Array.newInstance(array.getClass().getComponentType(), getF63134d());
            Intrinsics.m32177f(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            array = (T[]) ((Object[]) newInstance);
        }
        int m31923x = m31923x(this.f63132b + getF63134d());
        int i2 = this.f63132b;
        if (i2 < m31923x) {
            ArraysKt.m31970t(this.f63133c, array, 0, i2, m31923x, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr = this.f63133c;
            ArraysKt.m31968r(objArr, array, 0, this.f63132b, objArr.length);
            Object[] objArr2 = this.f63133c;
            ArraysKt.m31968r(objArr2, array, objArr2.length - this.f63132b, 0, m31923x);
        }
        if (array.length > getF63134d()) {
            array[getF63134d()] = null;
        }
        return array;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i2, @NotNull Collection<? extends E> elements) {
        Intrinsics.m32179h(elements, "elements");
        AbstractList.f63114b.m31906b(i2, getF63134d());
        if (elements.isEmpty()) {
            return false;
        }
        if (i2 == getF63134d()) {
            return addAll(elements);
        }
        m31919r(elements.size() + getF63134d());
        int m31923x = m31923x(this.f63132b + getF63134d());
        int m31923x2 = m31923x(this.f63132b + i2);
        int size = elements.size();
        if (i2 < ((getF63134d() + 1) >> 1)) {
            int i3 = this.f63132b;
            int i4 = i3 - size;
            if (m31923x2 < i3) {
                Object[] objArr = this.f63133c;
                ArraysKt.m31968r(objArr, objArr, i4, i3, objArr.length);
                if (size >= m31923x2) {
                    Object[] objArr2 = this.f63133c;
                    ArraysKt.m31968r(objArr2, objArr2, objArr2.length - size, 0, m31923x2);
                } else {
                    Object[] objArr3 = this.f63133c;
                    ArraysKt.m31968r(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f63133c;
                    ArraysKt.m31968r(objArr4, objArr4, 0, size, m31923x2);
                }
            } else if (i4 >= 0) {
                Object[] objArr5 = this.f63133c;
                ArraysKt.m31968r(objArr5, objArr5, i4, i3, m31923x2);
            } else {
                Object[] objArr6 = this.f63133c;
                i4 += objArr6.length;
                int i5 = m31923x2 - i3;
                int length = objArr6.length - i4;
                if (length >= i5) {
                    ArraysKt.m31968r(objArr6, objArr6, i4, i3, m31923x2);
                } else {
                    ArraysKt.m31968r(objArr6, objArr6, i4, i3, i3 + length);
                    Object[] objArr7 = this.f63133c;
                    ArraysKt.m31968r(objArr7, objArr7, 0, this.f63132b + length, m31923x2);
                }
            }
            this.f63132b = i4;
            m31917f(m31922u(m31923x2 - size), elements);
        } else {
            int i6 = m31923x2 + size;
            if (m31923x2 < m31923x) {
                int i7 = size + m31923x;
                Object[] objArr8 = this.f63133c;
                if (i7 <= objArr8.length) {
                    ArraysKt.m31968r(objArr8, objArr8, i6, m31923x2, m31923x);
                } else if (i6 >= objArr8.length) {
                    ArraysKt.m31968r(objArr8, objArr8, i6 - objArr8.length, m31923x2, m31923x);
                } else {
                    int length2 = m31923x - (i7 - objArr8.length);
                    ArraysKt.m31968r(objArr8, objArr8, 0, length2, m31923x);
                    Object[] objArr9 = this.f63133c;
                    ArraysKt.m31968r(objArr9, objArr9, i6, m31923x2, length2);
                }
            } else {
                Object[] objArr10 = this.f63133c;
                ArraysKt.m31968r(objArr10, objArr10, size, 0, m31923x);
                Object[] objArr11 = this.f63133c;
                if (i6 >= objArr11.length) {
                    ArraysKt.m31968r(objArr11, objArr11, i6 - objArr11.length, m31923x2, objArr11.length);
                } else {
                    ArraysKt.m31968r(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f63133c;
                    ArraysKt.m31968r(objArr12, objArr12, i6, m31923x2, objArr12.length - size);
                }
            }
            m31917f(m31923x2, elements);
        }
        return true;
    }
}
