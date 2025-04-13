package com.google.common.collect;

import androidx.room.util.C0576a;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
class FilteredKeyMultimap<K, V> extends AbstractMultimap<K, V> implements FilteredMultimap<K, V> {

    public static class AddRejectingList<K, V> extends ForwardingList<V> {

        /* renamed from: b */
        public final K f20976b;

        @Override // com.google.common.collect.ForwardingList, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        /* renamed from: G */
        public Object mo11329H() {
            return Collections.emptyList();
        }

        @Override // com.google.common.collect.ForwardingList, com.google.common.collect.ForwardingCollection
        /* renamed from: H */
        public Collection mo11329H() {
            return Collections.emptyList();
        }

        @Override // com.google.common.collect.ForwardingList
        /* renamed from: K */
        public List<V> mo7455G() {
            return Collections.emptyList();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
        public boolean add(V v) {
            add(0, v);
            return true;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            addAll(0, collection);
            return true;
        }

        @Override // com.google.common.collect.ForwardingList, java.util.List
        public void add(int i2, V v) {
            Preconditions.m11189m(i2, 0);
            String valueOf = String.valueOf(this.f20976b);
            throw new IllegalArgumentException(C0576a.m4114m(valueOf.length() + 32, "Key does not satisfy predicate: ", valueOf));
        }

        @Override // com.google.common.collect.ForwardingList, java.util.List
        @CanIgnoreReturnValue
        public boolean addAll(int i2, Collection<? extends V> collection) {
            Objects.requireNonNull(collection);
            Preconditions.m11189m(i2, 0);
            String valueOf = String.valueOf(this.f20976b);
            throw new IllegalArgumentException(C0576a.m4114m(valueOf.length() + 32, "Key does not satisfy predicate: ", valueOf));
        }
    }

    public static class AddRejectingSet<K, V> extends ForwardingSet<V> {

        /* renamed from: b */
        public final K f20977b;

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        /* renamed from: G */
        public Object mo11329H() {
            return Collections.emptySet();
        }

        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection
        /* renamed from: H */
        public Collection mo11329H() {
            return Collections.emptySet();
        }

        @Override // com.google.common.collect.ForwardingSet
        /* renamed from: K */
        public Set<V> mo11329H() {
            return Collections.emptySet();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
        public boolean add(V v) {
            String valueOf = String.valueOf(this.f20977b);
            throw new IllegalArgumentException(C0576a.m4114m(valueOf.length() + 32, "Key does not satisfy predicate: ", valueOf));
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            Objects.requireNonNull(collection);
            String valueOf = String.valueOf(this.f20977b);
            throw new IllegalArgumentException(C0576a.m4114m(valueOf.length() + 32, "Key does not satisfy predicate: ", valueOf));
        }
    }

    public class Entries extends ForwardingCollection<Map.Entry<K, V>> {
        public Entries() {
        }

        @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        /* renamed from: G */
        public /* bridge */ /* synthetic */ Object mo11329H() {
            mo11329H();
            throw null;
        }

        @Override // com.google.common.collect.ForwardingCollection
        /* renamed from: H */
        public Collection<Map.Entry<K, V>> mo11329H() {
            Objects.requireNonNull(FilteredKeyMultimap.this);
            throw null;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean remove(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Objects.requireNonNull(FilteredKeyMultimap.this);
            ((Map.Entry) obj).getKey();
            throw null;
        }
    }

    @Override // com.google.common.collect.Multimap
    /* renamed from: a */
    public Collection<V> mo11335a(Object obj) {
        throw null;
    }

    @Override // com.google.common.collect.AbstractMultimap
    /* renamed from: c */
    public Map<K, Collection<V>> mo11346c() {
        throw null;
    }

    @Override // com.google.common.collect.Multimap
    public void clear() {
        keySet().clear();
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsKey(@NullableDecl Object obj) {
        throw null;
    }

    @Override // com.google.common.collect.AbstractMultimap
    /* renamed from: d */
    public Collection<Map.Entry<K, V>> mo11347d() {
        return new Entries();
    }

    @Override // com.google.common.collect.AbstractMultimap
    /* renamed from: e */
    public Set<K> mo11348e() {
        throw null;
    }

    @Override // com.google.common.collect.FilteredMultimap
    /* renamed from: f */
    public Predicate<? super Map.Entry<K, V>> mo11549f() {
        Maps.m11791h(null);
        throw null;
    }

    @Override // com.google.common.collect.AbstractMultimap
    /* renamed from: g */
    public Collection<V> mo11349g() {
        return new FilteredMultimapValues(this);
    }

    @Override // com.google.common.collect.Multimap
    public Collection<V> get(K k2) {
        throw null;
    }

    @Override // com.google.common.collect.AbstractMultimap
    /* renamed from: h */
    public Iterator<Map.Entry<K, V>> mo11350h() {
        throw new AssertionError("should never be called");
    }

    /* renamed from: s */
    public Multimap<K, V> mo11550s() {
        return null;
    }

    @Override // com.google.common.collect.Multimap
    public int size() {
        Iterator<Collection<V>> it = mo11334E().values().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 += it.next().size();
        }
        return i2;
    }
}
