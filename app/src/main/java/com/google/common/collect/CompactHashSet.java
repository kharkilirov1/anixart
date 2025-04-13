package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtIncompatible
/* loaded from: classes.dex */
class CompactHashSet<E> extends AbstractSet<E> implements Serializable {

    /* renamed from: b */
    @NullableDecl
    public transient Object f20910b;

    /* renamed from: c */
    @NullableDecl
    public transient int[] f20911c;

    /* renamed from: d */
    @VisibleForTesting
    @NullableDecl
    public transient Object[] f20912d;

    /* renamed from: e */
    public transient int f20913e;

    /* renamed from: f */
    public transient int f20914f;

    public CompactHashSet() {
        mo11464t(3);
    }

    @CanIgnoreReturnValue
    /* renamed from: A */
    public final int m11455A(int i2, int i3, int i4, int i5) {
        Object m11469a = CompactHashing.m11469a(i3);
        int i6 = i3 - 1;
        if (i5 != 0) {
            CompactHashing.m11475g(m11469a, i4 & i6, i5 + 1);
        }
        Object obj = this.f20910b;
        int[] iArr = this.f20911c;
        for (int i7 = 0; i7 <= i2; i7++) {
            int m11474f = CompactHashing.m11474f(obj, i7);
            while (m11474f != 0) {
                int i8 = m11474f - 1;
                int i9 = iArr[i8];
                int i10 = ((~i2) & i9) | i7;
                int i11 = i10 & i6;
                int m11474f2 = CompactHashing.m11474f(m11469a, i11);
                CompactHashing.m11475g(m11469a, i11, m11474f);
                iArr[i8] = CompactHashing.m11470b(i10, m11474f2, i6);
                m11474f = i9 & i2;
            }
        }
        this.f20910b = m11469a;
        this.f20913e = CompactHashing.m11470b(this.f20913e, 32 - Integer.numberOfLeadingZeros(i6), 31);
        return i6;
    }

    /* renamed from: a */
    public int mo11456a(int i2, int i3) {
        return i2 - 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @CanIgnoreReturnValue
    public boolean add(@NullableDecl E e2) {
        int min;
        if (m11467y()) {
            mo11457b();
        }
        Set<E> m11459e = m11459e();
        if (m11459e != null) {
            return m11459e.add(e2);
        }
        int[] iArr = this.f20911c;
        Object[] objArr = this.f20912d;
        int i2 = this.f20914f;
        int i3 = i2 + 1;
        int m11607c = Hashing.m11607c(e2);
        int m11462r = m11462r();
        int i4 = m11607c & m11462r;
        int m11474f = CompactHashing.m11474f(this.f20910b, i4);
        if (m11474f != 0) {
            int i5 = ~m11462r;
            int i6 = m11607c & i5;
            int i7 = 0;
            while (true) {
                int i8 = m11474f - 1;
                int i9 = iArr[i8];
                if ((i9 & i5) == i6 && Objects.m11173a(e2, objArr[i8])) {
                    return false;
                }
                int i10 = i9 & m11462r;
                i7++;
                if (i10 != 0) {
                    m11474f = i10;
                } else {
                    if (i7 >= 9) {
                        return mo11458d().add(e2);
                    }
                    if (i3 > m11462r) {
                        m11462r = m11455A(m11462r, CompactHashing.m11471c(m11462r), m11607c, i2);
                    } else {
                        iArr[i8] = CompactHashing.m11470b(i9, i3, m11462r);
                    }
                }
            }
        } else if (i3 > m11462r) {
            m11462r = m11455A(m11462r, CompactHashing.m11471c(m11462r), m11607c, i2);
        } else {
            CompactHashing.m11475g(this.f20910b, i4, i3);
        }
        int length = this.f20911c.length;
        if (i3 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            mo11468z(min);
        }
        mo11465u(i2, e2, m11607c, m11462r);
        this.f20914f = i3;
        m11463s();
        return true;
    }

    @CanIgnoreReturnValue
    /* renamed from: b */
    public int mo11457b() {
        Preconditions.m11192p(m11467y(), "Arrays already allocated");
        int i2 = this.f20913e;
        int max = Math.max(4, Hashing.m11605a(i2 + 1, 1.0d));
        this.f20910b = CompactHashing.m11469a(max);
        this.f20913e = CompactHashing.m11470b(this.f20913e, 32 - Integer.numberOfLeadingZeros(max - 1), 31);
        this.f20911c = new int[i2];
        this.f20912d = new Object[i2];
        return i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        if (m11467y()) {
            return;
        }
        m11463s();
        Set<E> m11459e = m11459e();
        if (m11459e != null) {
            this.f20913e = Ints.m12082d(size(), 3, 1073741823);
            m11459e.clear();
            this.f20910b = null;
            this.f20914f = 0;
            return;
        }
        Arrays.fill(this.f20912d, 0, this.f20914f, (Object) null);
        CompactHashing.m11473e(this.f20910b);
        Arrays.fill(this.f20911c, 0, this.f20914f, 0);
        this.f20914f = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@NullableDecl Object obj) {
        if (m11467y()) {
            return false;
        }
        Set<E> m11459e = m11459e();
        if (m11459e != null) {
            return m11459e.contains(obj);
        }
        int m11607c = Hashing.m11607c(obj);
        int m11462r = m11462r();
        int m11474f = CompactHashing.m11474f(this.f20910b, m11607c & m11462r);
        if (m11474f == 0) {
            return false;
        }
        int i2 = ~m11462r;
        int i3 = m11607c & i2;
        do {
            int i4 = m11474f - 1;
            int i5 = this.f20911c[i4];
            if ((i5 & i2) == i3 && Objects.m11173a(obj, this.f20912d[i4])) {
                return true;
            }
            m11474f = i5 & m11462r;
        } while (m11474f != 0);
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @VisibleForTesting
    @CanIgnoreReturnValue
    /* renamed from: d */
    public Set<E> mo11458d() {
        LinkedHashSet linkedHashSet = new LinkedHashSet(m11462r() + 1, 1.0f);
        int mo11460f = mo11460f();
        while (mo11460f >= 0) {
            linkedHashSet.add(this.f20912d[mo11460f]);
            mo11460f = mo11461g(mo11460f);
        }
        this.f20910b = linkedHashSet;
        this.f20911c = null;
        this.f20912d = null;
        m11463s();
        return linkedHashSet;
    }

    @VisibleForTesting
    @NullableDecl
    /* renamed from: e */
    public Set<E> m11459e() {
        Object obj = this.f20910b;
        if (obj instanceof Set) {
            return (Set) obj;
        }
        return null;
    }

    /* renamed from: f */
    public int mo11460f() {
        return isEmpty() ? -1 : 0;
    }

    /* renamed from: g */
    public int mo11461g(int i2) {
        int i3 = i2 + 1;
        if (i3 < this.f20914f) {
            return i3;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        Set<E> m11459e = m11459e();
        return m11459e != null ? m11459e.iterator() : new Iterator<E>() { // from class: com.google.common.collect.CompactHashSet.1

            /* renamed from: b */
            public int f20915b;

            /* renamed from: c */
            public int f20916c;

            /* renamed from: d */
            public int f20917d = -1;

            {
                this.f20915b = CompactHashSet.this.f20913e;
                this.f20916c = CompactHashSet.this.mo11460f();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f20916c >= 0;
            }

            @Override // java.util.Iterator
            public E next() {
                if (CompactHashSet.this.f20913e != this.f20915b) {
                    throw new ConcurrentModificationException();
                }
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i2 = this.f20916c;
                this.f20917d = i2;
                CompactHashSet compactHashSet = CompactHashSet.this;
                E e2 = (E) compactHashSet.f20912d[i2];
                this.f20916c = compactHashSet.mo11461g(i2);
                return e2;
            }

            @Override // java.util.Iterator
            public void remove() {
                if (CompactHashSet.this.f20913e != this.f20915b) {
                    throw new ConcurrentModificationException();
                }
                Preconditions.m11192p(this.f20917d >= 0, "no calls to next() since the last call to remove()");
                this.f20915b += 32;
                CompactHashSet compactHashSet = CompactHashSet.this;
                compactHashSet.remove(compactHashSet.f20912d[this.f20917d]);
                this.f20916c = CompactHashSet.this.mo11456a(this.f20916c, this.f20917d);
                this.f20917d = -1;
            }
        };
    }

    /* renamed from: r */
    public final int m11462r() {
        return (1 << (this.f20913e & 31)) - 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @CanIgnoreReturnValue
    public boolean remove(@NullableDecl Object obj) {
        if (m11467y()) {
            return false;
        }
        Set<E> m11459e = m11459e();
        if (m11459e != null) {
            return m11459e.remove(obj);
        }
        int m11462r = m11462r();
        int m11472d = CompactHashing.m11472d(obj, null, m11462r, this.f20910b, this.f20911c, this.f20912d, null);
        if (m11472d == -1) {
            return false;
        }
        mo11466x(m11472d, m11462r);
        this.f20914f--;
        m11463s();
        return true;
    }

    /* renamed from: s */
    public void m11463s() {
        this.f20913e += 32;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        Set<E> m11459e = m11459e();
        return m11459e != null ? m11459e.size() : this.f20914f;
    }

    /* renamed from: t */
    public void mo11464t(int i2) {
        Preconditions.m11179c(i2 >= 0, "Expected size must be >= 0");
        this.f20913e = Ints.m12082d(i2, 1, 1073741823);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        if (m11467y()) {
            return new Object[0];
        }
        Set<E> m11459e = m11459e();
        return m11459e != null ? m11459e.toArray() : Arrays.copyOf(this.f20912d, this.f20914f);
    }

    /* renamed from: u */
    public void mo11465u(int i2, @NullableDecl E e2, int i3, int i4) {
        this.f20911c[i2] = CompactHashing.m11470b(i3, 0, i4);
        this.f20912d[i2] = e2;
    }

    /* renamed from: x */
    public void mo11466x(int i2, int i3) {
        int size = size() - 1;
        if (i2 >= size) {
            this.f20912d[i2] = null;
            this.f20911c[i2] = 0;
            return;
        }
        Object[] objArr = this.f20912d;
        Object obj = objArr[size];
        objArr[i2] = obj;
        objArr[size] = null;
        int[] iArr = this.f20911c;
        iArr[i2] = iArr[size];
        iArr[size] = 0;
        int m11607c = Hashing.m11607c(obj) & i3;
        int m11474f = CompactHashing.m11474f(this.f20910b, m11607c);
        int i4 = size + 1;
        if (m11474f == i4) {
            CompactHashing.m11475g(this.f20910b, m11607c, i2 + 1);
            return;
        }
        while (true) {
            int i5 = m11474f - 1;
            int[] iArr2 = this.f20911c;
            int i6 = iArr2[i5];
            int i7 = i6 & i3;
            if (i7 == i4) {
                iArr2[i5] = CompactHashing.m11470b(i6, i2 + 1, i3);
                return;
            }
            m11474f = i7;
        }
    }

    @VisibleForTesting
    /* renamed from: y */
    public boolean m11467y() {
        return this.f20910b == null;
    }

    /* renamed from: z */
    public void mo11468z(int i2) {
        this.f20911c = Arrays.copyOf(this.f20911c, i2);
        this.f20912d = Arrays.copyOf(this.f20912d, i2);
    }

    public CompactHashSet(int i2) {
        mo11464t(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @CanIgnoreReturnValue
    public <T> T[] toArray(T[] tArr) {
        if (m11467y()) {
            if (tArr.length > 0) {
                tArr[0] = null;
            }
            return tArr;
        }
        Set<E> m11459e = m11459e();
        if (m11459e != null) {
            return (T[]) m11459e.toArray(tArr);
        }
        Object[] objArr = this.f20912d;
        int i2 = this.f20914f;
        Preconditions.m11190n(0, 0 + i2, objArr.length);
        if (tArr.length < i2) {
            tArr = (T[]) ObjectArrays.m11829c(tArr, i2);
        } else if (tArr.length > i2) {
            tArr[i2] = null;
        }
        System.arraycopy(objArr, 0, tArr, 0, i2);
        return tArr;
    }
}
