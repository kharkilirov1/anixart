package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.Multiset;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
public abstract class ImmutableMultiset<E> extends ImmutableMultisetGwtSerializationDependencies<E> implements Multiset<E> {

    /* renamed from: c */
    @LazyInit
    public transient ImmutableList<E> f21062c;

    /* renamed from: d */
    @LazyInit
    public transient ImmutableSet<Multiset.Entry<E>> f21063d;

    public final class EntrySet extends IndexedImmutableSet<Multiset.Entry<E>> {
        public EntrySet(C16601 c16601) {
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Multiset.Entry)) {
                return false;
            }
            Multiset.Entry entry = (Multiset.Entry) obj;
            return entry.getCount() > 0 && ImmutableMultiset.this.mo11383s0(entry.mo11547b()) == entry.getCount();
        }

        @Override // com.google.common.collect.IndexedImmutableSet
        public Object get(int i2) {
            return ImmutableMultiset.this.mo11531y(i2);
        }

        @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return ImmutableMultiset.this.hashCode();
        }

        @Override // com.google.common.collect.ImmutableCollection
        /* renamed from: r */
        public boolean mo11425r() {
            return ImmutableMultiset.this.mo11425r();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return ImmutableMultiset.this.mo11389l().size();
        }
    }

    @GwtIncompatible
    public static class EntrySetSerializedForm<E> implements Serializable {
    }

    /* renamed from: t */
    public static <E> ImmutableMultiset<E> m11661t(Iterable<? extends E> iterable) {
        if (iterable instanceof ImmutableMultiset) {
            ImmutableMultiset<E> immutableMultiset = (ImmutableMultiset) iterable;
            if (!immutableMultiset.mo11425r()) {
                return immutableMultiset;
            }
        }
        boolean z = iterable instanceof Multiset;
        Builder builder = new Builder(z ? ((Multiset) iterable).mo11389l().size() : 11);
        if (z) {
            Multiset multiset = (Multiset) iterable;
            ObjectCountHashMap<E> objectCountHashMap = multiset instanceof RegularImmutableMultiset ? ((RegularImmutableMultiset) multiset).f21441e : multiset instanceof AbstractMapBasedMultiset ? ((AbstractMapBasedMultiset) multiset).f20830d : null;
            if (objectCountHashMap != null) {
                ObjectCountHashMap<E> objectCountHashMap2 = builder.f21067a;
                objectCountHashMap2.m11834b(Math.max(objectCountHashMap2.f21389c, objectCountHashMap.f21389c));
                for (int mo11835c = objectCountHashMap.mo11835c(); mo11835c >= 0; mo11835c = objectCountHashMap.mo11844m(mo11835c)) {
                    builder.mo11664c(objectCountHashMap.m11837f(mo11835c), objectCountHashMap.m11838g(mo11835c));
                }
            } else {
                Set<Multiset.Entry<E>> entrySet = multiset.entrySet();
                ObjectCountHashMap<E> objectCountHashMap3 = builder.f21067a;
                objectCountHashMap3.m11834b(Math.max(objectCountHashMap3.f21389c, entrySet.size()));
                for (Multiset.Entry<E> entry : multiset.entrySet()) {
                    builder.mo11664c(entry.mo11547b(), entry.getCount());
                }
            }
        } else {
            Iterator<? extends E> it = iterable.iterator();
            while (it.hasNext()) {
                builder.mo11663b(it.next());
            }
        }
        if (builder.f21067a.f21389c == 0) {
            return RegularImmutableMultiset.f21440h;
        }
        builder.f21068b = true;
        return new RegularImmutableMultiset(builder.f21067a);
    }

    @Override // com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    @DoNotCall
    @Deprecated
    /* renamed from: X */
    public final int mo11376X(E e2, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* renamed from: b */
    public ImmutableList<E> mo11543b() {
        ImmutableList<E> immutableList = this.f21062c;
        if (immutableList != null) {
            return immutableList;
        }
        ImmutableList<E> mo11543b = super.mo11543b();
        this.f21062c = mo11543b;
        return mo11543b;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@NullableDecl Object obj) {
        return mo11383s0(obj) > 0;
    }

    @Override // com.google.common.collect.ImmutableCollection
    @GwtIncompatible
    /* renamed from: d */
    public int mo11618d(Object[] objArr, int i2) {
        UnmodifiableIterator<Multiset.Entry<E>> it = entrySet().iterator();
        while (it.hasNext()) {
            Multiset.Entry<E> next = it.next();
            Arrays.fill(objArr, i2, next.getCount() + i2, next.mo11547b());
            i2 += next.getCount();
        }
        return i2;
    }

    @Override // com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    @DoNotCall
    @Deprecated
    /* renamed from: d0 */
    public final boolean mo11377d0(E e2, int i2, int i3) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public boolean equals(@NullableDecl Object obj) {
        return Multisets.m11821a(this, obj);
    }

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public int hashCode() {
        return Sets.m11887e(entrySet());
    }

    @Override // com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    @DoNotCall
    @Deprecated
    /* renamed from: o */
    public final int mo11381o(Object obj, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    @DoNotCall
    @Deprecated
    /* renamed from: p */
    public final int mo11382p(E e2, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* renamed from: s */
    public UnmodifiableIterator<E> iterator() {
        final UnmodifiableIterator<Multiset.Entry<E>> it = entrySet().iterator();
        return new UnmodifiableIterator<E>() { // from class: com.google.common.collect.ImmutableMultiset.1

            /* renamed from: b */
            public int f21064b;

            /* renamed from: c */
            @NullableDecl
            public E f21065c;

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f21064b > 0 || it.hasNext();
            }

            @Override // java.util.Iterator
            public E next() {
                if (this.f21064b <= 0) {
                    Multiset.Entry entry = (Multiset.Entry) it.next();
                    this.f21065c = (E) entry.mo11547b();
                    this.f21064b = entry.getCount();
                }
                this.f21064b--;
                return this.f21065c;
            }
        };
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return entrySet().toString();
    }

    @Override // com.google.common.collect.Multiset
    /* renamed from: u */
    public abstract ImmutableSet<E> mo11389l();

    @Override // com.google.common.collect.Multiset
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public ImmutableSet<Multiset.Entry<E>> entrySet() {
        ImmutableSet<Multiset.Entry<E>> immutableSet = this.f21063d;
        if (immutableSet == null) {
            immutableSet = isEmpty() ? RegularImmutableSet.f21445j : new EntrySet(null);
            this.f21063d = immutableSet;
        }
        return immutableSet;
    }

    /* renamed from: y */
    public abstract Multiset.Entry<E> mo11531y(int i2);

    public static class Builder<E> extends ImmutableCollection.Builder<E> {

        /* renamed from: a */
        public ObjectCountHashMap<E> f21067a;

        /* renamed from: b */
        public boolean f21068b;

        public Builder() {
            this.f21068b = false;
            this.f21067a = new ObjectCountHashMap<>(4);
        }

        @CanIgnoreReturnValue
        /* renamed from: b */
        public Builder<E> mo11663b(E e2) {
            return mo11664c(e2, 1);
        }

        @CanIgnoreReturnValue
        /* renamed from: c */
        public Builder<E> mo11664c(E e2, int i2) {
            if (i2 == 0) {
                return this;
            }
            if (this.f21068b) {
                this.f21067a = new ObjectCountHashMap<>(this.f21067a);
            }
            this.f21068b = false;
            Objects.requireNonNull(e2);
            ObjectCountHashMap<E> objectCountHashMap = this.f21067a;
            objectCountHashMap.m11846o(e2, i2 + objectCountHashMap.m11836d(e2));
            return this;
        }

        public Builder(int i2) {
            this.f21068b = false;
            this.f21067a = new ObjectCountHashMap<>(i2);
        }
    }
}
