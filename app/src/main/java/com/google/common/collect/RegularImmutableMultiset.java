package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.Multiset;
import com.google.common.collect.ObjectCountHashMap;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
class RegularImmutableMultiset<E> extends ImmutableMultiset<E> {

    /* renamed from: h */
    public static final RegularImmutableMultiset<Object> f21440h = new RegularImmutableMultiset<>(new ObjectCountHashMap());

    /* renamed from: e */
    public final transient ObjectCountHashMap<E> f21441e;

    /* renamed from: f */
    public final transient int f21442f;

    /* renamed from: g */
    @LazyInit
    public transient ImmutableSet<E> f21443g;

    public final class ElementSet extends IndexedImmutableSet<E> {
        public ElementSet(C17521 c17521) {
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            return RegularImmutableMultiset.this.contains(obj);
        }

        @Override // com.google.common.collect.IndexedImmutableSet
        public E get(int i2) {
            ObjectCountHashMap<E> objectCountHashMap = RegularImmutableMultiset.this.f21441e;
            Preconditions.m11186j(i2, objectCountHashMap.f21389c);
            return (E) objectCountHashMap.f21387a[i2];
        }

        @Override // com.google.common.collect.ImmutableCollection
        /* renamed from: r */
        public boolean mo11425r() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return RegularImmutableMultiset.this.f21441e.f21389c;
        }
    }

    @GwtIncompatible
    public static class SerializedForm implements Serializable {
    }

    public RegularImmutableMultiset(ObjectCountHashMap<E> objectCountHashMap) {
        this.f21441e = objectCountHashMap;
        long j2 = 0;
        for (int i2 = 0; i2 < objectCountHashMap.f21389c; i2++) {
            j2 += objectCountHashMap.m11838g(i2);
        }
        this.f21442f = Ints.m12084f(j2);
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* renamed from: r */
    public boolean mo11425r() {
        return false;
    }

    @Override // com.google.common.collect.Multiset
    /* renamed from: s0 */
    public int mo11383s0(@NullableDecl Object obj) {
        return this.f21441e.m11836d(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public int size() {
        return this.f21442f;
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public ImmutableSet<E> mo11389l() {
        ImmutableSet<E> immutableSet = this.f21443g;
        if (immutableSet != null) {
            return immutableSet;
        }
        ElementSet elementSet = new ElementSet(null);
        this.f21443g = elementSet;
        return elementSet;
    }

    @Override // com.google.common.collect.ImmutableMultiset
    /* renamed from: y */
    public Multiset.Entry<E> mo11531y(int i2) {
        ObjectCountHashMap<E> objectCountHashMap = this.f21441e;
        Preconditions.m11186j(i2, objectCountHashMap.f21389c);
        return new ObjectCountHashMap.MapEntry(i2);
    }
}
