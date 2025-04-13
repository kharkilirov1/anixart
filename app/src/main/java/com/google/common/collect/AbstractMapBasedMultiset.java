package com.google.common.collect;

import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.google.common.collect.ObjectCountHashMap;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
abstract class AbstractMapBasedMultiset<E> extends AbstractMultiset<E> implements Serializable {

    /* renamed from: d */
    public transient ObjectCountHashMap<E> f20830d;

    /* renamed from: e */
    public transient long f20831e;

    public abstract class Itr<T> implements Iterator<T> {

        /* renamed from: b */
        public int f20834b;

        /* renamed from: c */
        public int f20835c = -1;

        /* renamed from: d */
        public int f20836d;

        public Itr() {
            this.f20834b = AbstractMapBasedMultiset.this.f20830d.mo11835c();
            this.f20836d = AbstractMapBasedMultiset.this.f20830d.f21390d;
        }

        /* renamed from: a */
        public abstract T mo11384a(int i2);

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (AbstractMapBasedMultiset.this.f20830d.f21390d == this.f20836d) {
                return this.f20834b >= 0;
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T mo11384a = mo11384a(this.f20834b);
            int i2 = this.f20834b;
            this.f20835c = i2;
            this.f20834b = AbstractMapBasedMultiset.this.f20830d.mo11844m(i2);
            return mo11384a;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (AbstractMapBasedMultiset.this.f20830d.f21390d != this.f20836d) {
                throw new ConcurrentModificationException();
            }
            Preconditions.m11192p(this.f20835c != -1, "no calls to next() since the last call to remove()");
            AbstractMapBasedMultiset.this.f20831e -= r0.f20830d.m11848q(this.f20835c);
            this.f20834b = AbstractMapBasedMultiset.this.f20830d.mo11845n(this.f20834b, this.f20835c);
            this.f20835c = -1;
            this.f20836d = AbstractMapBasedMultiset.this.f20830d.f21390d;
        }
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    /* renamed from: X */
    public final int mo11376X(@NullableDecl E e2, int i2) {
        int m11846o;
        CollectPreconditions.m11427b(i2, "count");
        ObjectCountHashMap<E> objectCountHashMap = this.f20830d;
        if (i2 == 0) {
            Objects.requireNonNull(objectCountHashMap);
            m11846o = objectCountHashMap.m11847p(e2, Hashing.m11607c(e2));
        } else {
            m11846o = objectCountHashMap.m11846o(e2, i2);
        }
        this.f20831e += i2 - m11846o;
        return m11846o;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f20830d.mo11833a();
        this.f20831e = 0L;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    /* renamed from: d0 */
    public final boolean mo11377d0(@NullableDecl E e2, int i2, int i3) {
        CollectPreconditions.m11427b(i2, "oldCount");
        CollectPreconditions.m11427b(i3, "newCount");
        int m11840i = this.f20830d.m11840i(e2);
        if (m11840i == -1) {
            if (i2 != 0) {
                return false;
            }
            if (i3 > 0) {
                this.f20830d.m11846o(e2, i3);
                this.f20831e += i3;
            }
            return true;
        }
        if (this.f20830d.m11838g(m11840i) != i2) {
            return false;
        }
        if (i3 == 0) {
            this.f20830d.m11848q(m11840i);
            this.f20831e -= i2;
        } else {
            this.f20830d.m11851t(m11840i, i3);
            this.f20831e += i3 - i2;
        }
        return true;
    }

    @Override // com.google.common.collect.AbstractMultiset
    /* renamed from: e */
    public final int mo11378e() {
        return this.f20830d.f21389c;
    }

    @Override // com.google.common.collect.AbstractMultiset
    /* renamed from: f */
    public final Iterator<E> mo11379f() {
        return new AbstractMapBasedMultiset<E>.Itr<E>() { // from class: com.google.common.collect.AbstractMapBasedMultiset.1
            @Override // com.google.common.collect.AbstractMapBasedMultiset.Itr
            /* renamed from: a */
            public E mo11384a(int i2) {
                ObjectCountHashMap<E> objectCountHashMap = AbstractMapBasedMultiset.this.f20830d;
                Preconditions.m11186j(i2, objectCountHashMap.f21389c);
                return (E) objectCountHashMap.f21387a[i2];
            }
        };
    }

    @Override // com.google.common.collect.AbstractMultiset
    /* renamed from: g */
    public final Iterator<Multiset.Entry<E>> mo11380g() {
        return new AbstractMapBasedMultiset<E>.Itr<Multiset.Entry<E>>() { // from class: com.google.common.collect.AbstractMapBasedMultiset.2
            @Override // com.google.common.collect.AbstractMapBasedMultiset.Itr
            /* renamed from: a */
            public Object mo11384a(int i2) {
                ObjectCountHashMap<E> objectCountHashMap = AbstractMapBasedMultiset.this.f20830d;
                Preconditions.m11186j(i2, objectCountHashMap.f21389c);
                return new ObjectCountHashMap.MapEntry(i2);
            }
        };
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
    public final Iterator<E> iterator() {
        return new Multisets.MultisetIteratorImpl(this, entrySet().iterator());
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    /* renamed from: o */
    public final int mo11381o(@NullableDecl Object obj, int i2) {
        if (i2 == 0) {
            return this.f20830d.m11836d(obj);
        }
        Preconditions.m11181e(i2 > 0, "occurrences cannot be negative: %s", i2);
        int m11840i = this.f20830d.m11840i(obj);
        if (m11840i == -1) {
            return 0;
        }
        int m11838g = this.f20830d.m11838g(m11840i);
        if (m11838g > i2) {
            this.f20830d.m11851t(m11840i, m11838g - i2);
        } else {
            this.f20830d.m11848q(m11840i);
            i2 = m11838g;
        }
        this.f20831e -= i2;
        return m11838g;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    /* renamed from: p */
    public final int mo11382p(@NullableDecl E e2, int i2) {
        if (i2 == 0) {
            return this.f20830d.m11836d(e2);
        }
        Preconditions.m11181e(i2 > 0, "occurrences cannot be negative: %s", i2);
        int m11840i = this.f20830d.m11840i(e2);
        if (m11840i == -1) {
            this.f20830d.m11846o(e2, i2);
            this.f20831e += i2;
            return 0;
        }
        int m11838g = this.f20830d.m11838g(m11840i);
        long j2 = i2;
        long j3 = m11838g + j2;
        Preconditions.m11183g(j3 <= ParserMinimalBase.MAX_INT_L, "too many occurrences: %s", j3);
        this.f20830d.m11851t(m11840i, (int) j3);
        this.f20831e += j2;
        return m11838g;
    }

    @Override // com.google.common.collect.Multiset
    /* renamed from: s0 */
    public final int mo11383s0(@NullableDecl Object obj) {
        return this.f20830d.m11836d(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public final int size() {
        return Ints.m12084f(this.f20831e);
    }
}
