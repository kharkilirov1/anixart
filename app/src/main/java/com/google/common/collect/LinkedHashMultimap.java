package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.collect.Sets;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
public final class LinkedHashMultimap<K, V> extends LinkedHashMultimapGwtSerializationDependencies<K, V> {

    /* renamed from: com.google.common.collect.LinkedHashMultimap$1 */
    public class C16921 implements Iterator<Map.Entry<K, V>> {

        /* renamed from: b */
        public ValueEntry<K, V> f21147b;

        /* renamed from: c */
        @NullableDecl
        public ValueEntry<K, V> f21148c;

        public C16921() {
            throw null;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            ValueEntry<K, V> valueEntry = this.f21147b;
            Objects.requireNonNull(LinkedHashMultimap.this);
            return valueEntry != null;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            ValueEntry<K, V> valueEntry = this.f21147b;
            this.f21148c = valueEntry;
            this.f21147b = valueEntry.f21155i;
            return valueEntry;
        }

        @Override // java.util.Iterator
        public void remove() {
            Preconditions.m11192p(this.f21148c != null, "no calls to next() since the last call to remove()");
            LinkedHashMultimap linkedHashMultimap = LinkedHashMultimap.this;
            ValueEntry<K, V> valueEntry = this.f21148c;
            linkedHashMultimap.remove(valueEntry.f21031b, valueEntry.f21032c);
            this.f21148c = null;
        }
    }

    @VisibleForTesting
    public static final class ValueEntry<K, V> extends ImmutableEntry<K, V> implements ValueSetLink<K, V> {

        /* renamed from: d */
        public final int f21150d;

        /* renamed from: e */
        @NullableDecl
        public ValueEntry<K, V> f21151e;

        /* renamed from: f */
        @NullableDecl
        public ValueSetLink<K, V> f21152f;

        /* renamed from: g */
        @NullableDecl
        public ValueSetLink<K, V> f21153g;

        /* renamed from: h */
        @NullableDecl
        public ValueEntry<K, V> f21154h;

        /* renamed from: i */
        @NullableDecl
        public ValueEntry<K, V> f21155i;

        public ValueEntry(@NullableDecl K k2, @NullableDecl V v, int i2, @NullableDecl ValueEntry<K, V> valueEntry) {
            super(k2, v);
            this.f21150d = i2;
            this.f21151e = valueEntry;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.ValueSetLink
        /* renamed from: a */
        public void mo11722a(ValueSetLink<K, V> valueSetLink) {
            this.f21153g = valueSetLink;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.ValueSetLink
        /* renamed from: b */
        public ValueSetLink<K, V> mo11723b() {
            return this.f21153g;
        }

        /* renamed from: c */
        public boolean m11724c(@NullableDecl Object obj, int i2) {
            return this.f21150d == i2 && com.google.common.base.Objects.m11173a(this.f21032c, obj);
        }

        @Override // com.google.common.collect.LinkedHashMultimap.ValueSetLink
        /* renamed from: d */
        public void mo11725d(ValueSetLink<K, V> valueSetLink) {
            this.f21152f = valueSetLink;
        }
    }

    @VisibleForTesting
    public final class ValueSet extends Sets.ImprovedAbstractSet<V> implements ValueSetLink<K, V> {

        /* renamed from: b */
        public final K f21156b;

        /* renamed from: c */
        @VisibleForTesting
        public ValueEntry<K, V>[] f21157c;

        /* renamed from: d */
        public int f21158d = 0;

        /* renamed from: e */
        public int f21159e = 0;

        /* renamed from: f */
        public ValueSetLink<K, V> f21160f = this;

        /* renamed from: g */
        public ValueSetLink<K, V> f21161g = this;

        public ValueSet(K k2, int i2) {
            this.f21156b = k2;
            this.f21157c = new ValueEntry[Hashing.m11605a(i2, 1.0d)];
        }

        @Override // com.google.common.collect.LinkedHashMultimap.ValueSetLink
        /* renamed from: a */
        public void mo11722a(ValueSetLink<K, V> valueSetLink) {
            this.f21160f = valueSetLink;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(@NullableDecl V v) {
            int m11607c = Hashing.m11607c(v);
            ValueEntry<K, V> valueEntry = this.f21157c[m11726e() & m11607c];
            for (ValueEntry<K, V> valueEntry2 = valueEntry; valueEntry2 != null; valueEntry2 = valueEntry2.f21151e) {
                if (valueEntry2.m11724c(v, m11607c)) {
                    return false;
                }
            }
            ValueEntry valueEntry3 = new ValueEntry(this.f21156b, v, m11607c, valueEntry);
            ValueSetLink<K, V> valueSetLink = this.f21161g;
            valueSetLink.mo11722a(valueEntry3);
            valueEntry3.f21152f = valueSetLink;
            valueEntry3.f21153g = this;
            this.f21161g = valueEntry3;
            Objects.requireNonNull(LinkedHashMultimap.this);
            throw null;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.ValueSetLink
        /* renamed from: b */
        public ValueSetLink<K, V> mo11723b() {
            return this.f21160f;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            Arrays.fill(this.f21157c, (Object) null);
            this.f21158d = 0;
            for (ValueSetLink<K, V> valueSetLink = this.f21160f; valueSetLink != this; valueSetLink = valueSetLink.mo11723b()) {
                ValueEntry valueEntry = (ValueEntry) valueSetLink;
                ValueEntry<K, V> valueEntry2 = valueEntry.f21154h;
                ValueEntry<K, V> valueEntry3 = valueEntry.f21155i;
                valueEntry2.f21155i = valueEntry3;
                valueEntry3.f21154h = valueEntry2;
            }
            this.f21160f = this;
            this.f21161g = this;
            this.f21159e++;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            int m11607c = Hashing.m11607c(obj);
            for (ValueEntry<K, V> valueEntry = this.f21157c[m11726e() & m11607c]; valueEntry != null; valueEntry = valueEntry.f21151e) {
                if (valueEntry.m11724c(obj, m11607c)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.LinkedHashMultimap.ValueSetLink
        /* renamed from: d */
        public void mo11725d(ValueSetLink<K, V> valueSetLink) {
            this.f21161g = valueSetLink;
        }

        /* renamed from: e */
        public final int m11726e() {
            return this.f21157c.length - 1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<V> iterator() {
            return new Iterator<V>() { // from class: com.google.common.collect.LinkedHashMultimap.ValueSet.1

                /* renamed from: b */
                public ValueSetLink<K, V> f21163b;

                /* renamed from: c */
                @NullableDecl
                public ValueEntry<K, V> f21164c;

                /* renamed from: d */
                public int f21165d;

                {
                    this.f21163b = ValueSet.this.f21160f;
                    this.f21165d = ValueSet.this.f21159e;
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    ValueSet valueSet = ValueSet.this;
                    if (valueSet.f21159e == this.f21165d) {
                        return this.f21163b != valueSet;
                    }
                    throw new ConcurrentModificationException();
                }

                @Override // java.util.Iterator
                public V next() {
                    if (!hasNext()) {
                        throw new NoSuchElementException();
                    }
                    ValueEntry<K, V> valueEntry = (ValueEntry) this.f21163b;
                    V v = valueEntry.f21032c;
                    this.f21164c = valueEntry;
                    this.f21163b = valueEntry.f21153g;
                    return v;
                }

                @Override // java.util.Iterator
                public void remove() {
                    if (ValueSet.this.f21159e != this.f21165d) {
                        throw new ConcurrentModificationException();
                    }
                    Preconditions.m11192p(this.f21164c != null, "no calls to next() since the last call to remove()");
                    ValueSet.this.remove(this.f21164c.f21032c);
                    this.f21165d = ValueSet.this.f21159e;
                    this.f21164c = null;
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        public boolean remove(@NullableDecl Object obj) {
            int m11607c = Hashing.m11607c(obj);
            int m11726e = m11726e() & m11607c;
            ValueEntry<K, V> valueEntry = null;
            for (ValueEntry<K, V> valueEntry2 = this.f21157c[m11726e]; valueEntry2 != null; valueEntry2 = valueEntry2.f21151e) {
                if (valueEntry2.m11724c(obj, m11607c)) {
                    if (valueEntry == null) {
                        this.f21157c[m11726e] = valueEntry2.f21151e;
                    } else {
                        valueEntry.f21151e = valueEntry2.f21151e;
                    }
                    ValueSetLink<K, V> valueSetLink = valueEntry2.f21152f;
                    ValueSetLink<K, V> valueSetLink2 = valueEntry2.f21153g;
                    valueSetLink.mo11722a(valueSetLink2);
                    valueSetLink2.mo11725d(valueSetLink);
                    ValueEntry<K, V> valueEntry3 = valueEntry2.f21154h;
                    ValueEntry<K, V> valueEntry4 = valueEntry2.f21155i;
                    valueEntry3.f21155i = valueEntry4;
                    valueEntry4.f21154h = valueEntry3;
                    this.f21158d--;
                    this.f21159e++;
                    return true;
                }
                valueEntry = valueEntry2;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f21158d;
        }
    }

    public interface ValueSetLink<K, V> {
        /* renamed from: a */
        void mo11722a(ValueSetLink<K, V> valueSetLink);

        /* renamed from: b */
        ValueSetLink<K, V> mo11723b();

        /* renamed from: d */
        void mo11725d(ValueSetLink<K, V> valueSetLink);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    /* renamed from: b */
    public Collection mo11345b() {
        return super.mo11345b();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap
    public void clear() {
        super.clear();
        throw null;
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
    /* renamed from: h */
    public Iterator<Map.Entry<K, V>> mo11350h() {
        new C16921();
        throw null;
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
    /* renamed from: i */
    public Iterator<V> mo11351i() {
        new C16921();
        throw null;
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public Set<K> keySet() {
        return super.keySet();
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
    /* renamed from: n */
    public Collection mo11336n() {
        return new CompactLinkedHashSet(0);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    /* renamed from: o */
    public Collection<V> mo11352o(K k2) {
        return new ValueSet(k2, 0);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public Collection<V> values() {
        return super.values();
    }

    @Override // com.google.common.collect.AbstractSetMultimap
    /* renamed from: w */
    public Set<V> mo11336n() {
        return new CompactLinkedHashSet(0);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    /* renamed from: b */
    public Set<Map.Entry<K, V>> mo11345b() {
        return super.mo11345b();
    }
}
