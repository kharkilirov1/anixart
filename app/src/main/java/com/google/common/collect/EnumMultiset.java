package com.google.common.collect;

import com.google.android.exoplayer2.extractor.C1008a;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.lang.Enum;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
public final class EnumMultiset<E extends Enum<E>> extends AbstractMultiset<E> implements Serializable {

    /* renamed from: f */
    public static final /* synthetic */ int f20960f = 0;

    /* renamed from: d */
    public transient int f20961d;

    /* renamed from: e */
    public transient long f20962e;

    public abstract class Itr<T> implements Iterator<T> {

        /* renamed from: b */
        public int f20966b = 0;

        /* renamed from: c */
        public int f20967c = -1;

        public Itr() {
        }

        /* renamed from: a */
        public abstract T mo11546a(int i2);

        @Override // java.util.Iterator
        public boolean hasNext() {
            EnumMultiset enumMultiset = EnumMultiset.this;
            int i2 = EnumMultiset.f20960f;
            Objects.requireNonNull(enumMultiset);
            throw null;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T mo11546a = mo11546a(this.f20966b);
            int i2 = this.f20966b;
            this.f20967c = i2;
            this.f20966b = i2 + 1;
            return mo11546a;
        }

        @Override // java.util.Iterator
        public void remove() {
            Preconditions.m11192p(this.f20967c >= 0, "no calls to next() since the last call to remove()");
            EnumMultiset enumMultiset = EnumMultiset.this;
            int i2 = EnumMultiset.f20960f;
            Objects.requireNonNull(enumMultiset);
            throw null;
        }
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    /* renamed from: X */
    public int mo11376X(Object obj, int i2) {
        m11544r((Enum) obj);
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        Arrays.fill((int[]) null, 0);
        this.f20962e = 0L;
        this.f20961d = 0;
    }

    @Override // com.google.common.collect.AbstractMultiset
    /* renamed from: e */
    public int mo11378e() {
        return this.f20961d;
    }

    @Override // com.google.common.collect.AbstractMultiset
    /* renamed from: f */
    public Iterator<E> mo11379f() {
        return new EnumMultiset<E>.Itr<E>() { // from class: com.google.common.collect.EnumMultiset.1
            @Override // com.google.common.collect.EnumMultiset.Itr
            /* renamed from: a */
            public Object mo11546a(int i2) {
                EnumMultiset enumMultiset = EnumMultiset.this;
                int i3 = EnumMultiset.f20960f;
                Objects.requireNonNull(enumMultiset);
                throw null;
            }
        };
    }

    @Override // com.google.common.collect.AbstractMultiset
    /* renamed from: g */
    public Iterator<Multiset.Entry<E>> mo11380g() {
        return new EnumMultiset<E>.Itr<Multiset.Entry<E>>() { // from class: com.google.common.collect.EnumMultiset.2
            @Override // com.google.common.collect.EnumMultiset.Itr
            /* renamed from: a */
            public Object mo11546a(int i2) {
                return new Multisets.AbstractEntry<Enum<Object>>(i2) { // from class: com.google.common.collect.EnumMultiset.2.1
                    @Override // com.google.common.collect.Multiset.Entry
                    /* renamed from: b */
                    public Object mo11547b() {
                        EnumMultiset enumMultiset = EnumMultiset.this;
                        int i3 = EnumMultiset.f20960f;
                        Objects.requireNonNull(enumMultiset);
                        throw null;
                    }

                    @Override // com.google.common.collect.Multiset.Entry
                    public int getCount() {
                        EnumMultiset enumMultiset = EnumMultiset.this;
                        int i3 = EnumMultiset.f20960f;
                        Objects.requireNonNull(enumMultiset);
                        throw null;
                    }
                };
            }
        };
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
    public Iterator<E> iterator() {
        return new Multisets.MultisetIteratorImpl(this, entrySet().iterator());
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    /* renamed from: o */
    public int mo11381o(@NullableDecl Object obj, int i2) {
        m11545s(obj);
        return 0;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    /* renamed from: p */
    public int mo11382p(Object obj, int i2) {
        m11544r((Enum) obj);
        throw null;
    }

    /* renamed from: r */
    public void m11544r(@NullableDecl Object obj) {
        Objects.requireNonNull(obj);
        m11545s(obj);
        String valueOf = String.valueOf(obj);
        throw new ClassCastException(C1008a.m6437d(valueOf.length() + 25, "Expected an ", "null", " but got ", valueOf));
    }

    /* renamed from: s */
    public final boolean m11545s(@NullableDecl Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        ((Enum) obj).ordinal();
        throw null;
    }

    @Override // com.google.common.collect.Multiset
    /* renamed from: s0 */
    public int mo11383s0(@NullableDecl Object obj) {
        m11545s(obj);
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public int size() {
        return Ints.m12084f(this.f20962e);
    }
}
