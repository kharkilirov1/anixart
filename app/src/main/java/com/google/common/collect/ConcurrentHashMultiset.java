package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtIncompatible
/* loaded from: classes.dex */
public final class ConcurrentHashMultiset<E> extends AbstractMultiset<E> implements Serializable {

    /* renamed from: d */
    public static final /* synthetic */ int f20932d = 0;

    /* renamed from: com.google.common.collect.ConcurrentHashMultiset$1 */
    public class C16341 extends ForwardingSet<E> {

        /* renamed from: b */
        public final /* synthetic */ Set f20933b;

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        /* renamed from: G */
        public Object mo7455G() {
            return this.f20933b;
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection
        /* renamed from: H */
        public Collection mo11329H() {
            return this.f20933b;
        }

        @Override // com.google.common.collect.ForwardingSet
        /* renamed from: K */
        public Set<E> mo7455G() {
            return this.f20933b;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            return obj != null && Collections2.m11434e(this.f20933b, obj);
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return Collections2.m11431b(this, collection);
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            boolean z;
            if (obj == null) {
                return false;
            }
            Set set = this.f20933b;
            Objects.requireNonNull(set);
            try {
                z = set.remove(obj);
            } catch (ClassCastException | NullPointerException unused) {
                z = false;
            }
            return z;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return m11570L(collection);
        }
    }

    /* renamed from: com.google.common.collect.ConcurrentHashMultiset$3 */
    public class C16363 extends ForwardingIterator<Multiset.Entry<E>> {

        /* renamed from: b */
        @NullableDecl
        public Multiset.Entry<E> f20934b;

        /* renamed from: c */
        public final /* synthetic */ Iterator f20935c;

        /* renamed from: d */
        public final /* synthetic */ ConcurrentHashMultiset f20936d;

        @Override // com.google.common.collect.ForwardingIterator, com.google.common.collect.ForwardingObject
        /* renamed from: G */
        public Object mo7455G() {
            return this.f20935c;
        }

        @Override // com.google.common.collect.ForwardingIterator
        /* renamed from: H */
        public Iterator<Multiset.Entry<E>> mo7455G() {
            return this.f20935c;
        }

        @Override // com.google.common.collect.ForwardingIterator, java.util.Iterator
        public Object next() {
            Multiset.Entry<E> entry = (Multiset.Entry) super.next();
            this.f20934b = entry;
            return entry;
        }

        @Override // com.google.common.collect.ForwardingIterator, java.util.Iterator
        public void remove() {
            Preconditions.m11192p(this.f20934b != null, "no calls to next() since the last call to remove()");
            this.f20936d.mo11376X(this.f20934b.mo11547b(), 0);
            throw null;
        }
    }

    public static class FieldSettersHolder {
        static {
            Serialization.m11882a(ConcurrentHashMultiset.class, "countMap");
        }
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    /* renamed from: X */
    public int mo11376X(E e2, int i2) {
        Objects.requireNonNull(e2);
        CollectPreconditions.m11427b(i2, "count");
        Maps.m11793j(null, e2);
        throw null;
    }

    @Override // com.google.common.collect.AbstractMultiset
    /* renamed from: b */
    public Set<E> mo11387b() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        throw null;
    }

    @Override // com.google.common.collect.AbstractMultiset
    @Deprecated
    /* renamed from: d */
    public Set<Multiset.Entry<E>> mo11388d() {
        return new EntrySet(null);
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    /* renamed from: d0 */
    public boolean mo11377d0(E e2, int i2, int i3) {
        Objects.requireNonNull(e2);
        CollectPreconditions.m11427b(i2, "oldCount");
        CollectPreconditions.m11427b(i3, "newCount");
        Maps.m11793j(null, e2);
        throw null;
    }

    @Override // com.google.common.collect.AbstractMultiset
    /* renamed from: e */
    public int mo11378e() {
        throw null;
    }

    @Override // com.google.common.collect.AbstractMultiset
    /* renamed from: f */
    public Iterator<E> mo11379f() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.AbstractMultiset
    /* renamed from: g */
    public Iterator<Multiset.Entry<E>> mo11380g() {
        new AbstractIterator<Multiset.Entry<E>>(this) { // from class: com.google.common.collect.ConcurrentHashMultiset.2
            {
                int i2 = ConcurrentHashMultiset.f20932d;
                throw null;
            }

            @Override // com.google.common.collect.AbstractIterator
            /* renamed from: a */
            public Object mo11332a() {
                throw null;
            }
        };
        throw null;
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
    public Iterator<E> iterator() {
        return new Multisets.MultisetIteratorImpl(this, entrySet().iterator());
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    /* renamed from: o */
    public int mo11381o(@NullableDecl Object obj, int i2) {
        if (i2 == 0) {
            Maps.m11793j(null, obj);
            throw null;
        }
        CollectPreconditions.m11429d(i2, "occurences");
        Maps.m11793j(null, obj);
        throw null;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    /* renamed from: p */
    public int mo11382p(E e2, int i2) {
        Objects.requireNonNull(e2);
        if (i2 == 0) {
            Maps.m11793j(null, e2);
            throw null;
        }
        CollectPreconditions.m11429d(i2, "occurences");
        Maps.m11793j(null, e2);
        throw null;
    }

    @Override // com.google.common.collect.Multiset
    /* renamed from: s0 */
    public int mo11383s0(@NullableDecl Object obj) {
        Maps.m11793j(null, obj);
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public int size() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public Object[] toArray() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        throw null;
    }

    public class EntrySet extends AbstractMultiset<E>.EntrySet {
        public EntrySet(C16341 c16341) {
            super();
        }

        @Override // com.google.common.collect.AbstractMultiset.EntrySet, com.google.common.collect.Multisets.EntrySet
        /* renamed from: e */
        public Multiset mo11391e() {
            return ConcurrentHashMultiset.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            ArrayList arrayList = new ArrayList(Lists.m11734a(size()));
            Iterators.m11706a(arrayList, iterator());
            return arrayList.toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            ArrayList arrayList = new ArrayList(Lists.m11734a(size()));
            Iterators.m11706a(arrayList, iterator());
            return (T[]) arrayList.toArray(tArr);
        }
    }
}
