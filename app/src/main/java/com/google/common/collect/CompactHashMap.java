package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtIncompatible
/* loaded from: classes.dex */
class CompactHashMap<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: k */
    public static final Object f20887k = new Object();

    /* renamed from: b */
    @NullableDecl
    public transient Object f20888b;

    /* renamed from: c */
    @VisibleForTesting
    @NullableDecl
    public transient int[] f20889c;

    /* renamed from: d */
    @VisibleForTesting
    @NullableDecl
    public transient Object[] f20890d;

    /* renamed from: e */
    @VisibleForTesting
    @NullableDecl
    public transient Object[] f20891e;

    /* renamed from: f */
    public transient int f20892f;

    /* renamed from: g */
    public transient int f20893g;

    /* renamed from: h */
    @NullableDecl
    public transient Set<K> f20894h;

    /* renamed from: i */
    @NullableDecl
    public transient Set<Map.Entry<K, V>> f20895i;

    /* renamed from: j */
    @NullableDecl
    public transient Collection<V> f20896j;

    public class EntrySetView extends AbstractSet<Map.Entry<K, V>> {
        public EntrySetView() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            CompactHashMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            Map<K, V> m11440g = CompactHashMap.this.m11440g();
            if (m11440g != null) {
                return m11440g.entrySet().contains(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int m11445l = CompactHashMap.this.m11445l(entry.getKey());
            return m11445l != -1 && Objects.m11173a(CompactHashMap.this.f20891e[m11445l], entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            final CompactHashMap compactHashMap = CompactHashMap.this;
            Map<K, V> m11440g = compactHashMap.m11440g();
            return m11440g != null ? m11440g.entrySet().iterator() : new CompactHashMap<Object, Object>.Itr<Map.Entry<Object, Object>>() { // from class: com.google.common.collect.CompactHashMap.2
                @Override // com.google.common.collect.CompactHashMap.Itr
                /* renamed from: a */
                public Map.Entry<Object, Object> mo11453a(int i2) {
                    return new MapEntry(i2);
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@NullableDecl Object obj) {
            Map<K, V> m11440g = CompactHashMap.this.m11440g();
            if (m11440g != null) {
                return m11440g.entrySet().remove(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (CompactHashMap.this.m11449p()) {
                return false;
            }
            int m11443j = CompactHashMap.this.m11443j();
            Object key = entry.getKey();
            Object value = entry.getValue();
            CompactHashMap compactHashMap = CompactHashMap.this;
            int m11472d = CompactHashing.m11472d(key, value, m11443j, compactHashMap.f20888b, compactHashMap.f20889c, compactHashMap.f20890d, compactHashMap.f20891e);
            if (m11472d == -1) {
                return false;
            }
            CompactHashMap.this.mo11448o(m11472d, m11443j);
            r10.f20893g--;
            CompactHashMap.this.m11444k();
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return CompactHashMap.this.size();
        }
    }

    public abstract class Itr<T> implements Iterator<T> {

        /* renamed from: b */
        public int f20901b;

        /* renamed from: c */
        public int f20902c;

        /* renamed from: d */
        public int f20903d = -1;

        public Itr(C16291 c16291) {
            this.f20901b = CompactHashMap.this.f20892f;
            this.f20902c = CompactHashMap.this.mo11441h();
        }

        /* renamed from: a */
        public abstract T mo11453a(int i2);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f20902c >= 0;
        }

        @Override // java.util.Iterator
        public T next() {
            if (CompactHashMap.this.f20892f != this.f20901b) {
                throw new ConcurrentModificationException();
            }
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i2 = this.f20902c;
            this.f20903d = i2;
            T mo11453a = mo11453a(i2);
            this.f20902c = CompactHashMap.this.mo11442i(this.f20902c);
            return mo11453a;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (CompactHashMap.this.f20892f != this.f20901b) {
                throw new ConcurrentModificationException();
            }
            Preconditions.m11192p(this.f20903d >= 0, "no calls to next() since the last call to remove()");
            this.f20901b += 32;
            CompactHashMap compactHashMap = CompactHashMap.this;
            compactHashMap.remove(compactHashMap.f20890d[this.f20903d]);
            this.f20902c = CompactHashMap.this.mo11436b(this.f20902c, this.f20903d);
            this.f20903d = -1;
        }
    }

    public class KeySetView extends AbstractSet<K> {
        public KeySetView() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            CompactHashMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return CompactHashMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            final CompactHashMap compactHashMap = CompactHashMap.this;
            Map<K, V> m11440g = compactHashMap.m11440g();
            return m11440g != null ? m11440g.keySet().iterator() : new CompactHashMap<Object, Object>.Itr<Object>() { // from class: com.google.common.collect.CompactHashMap.1
                @Override // com.google.common.collect.CompactHashMap.Itr
                /* renamed from: a */
                public Object mo11453a(int i2) {
                    return CompactHashMap.this.f20890d[i2];
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@NullableDecl Object obj) {
            Map<K, V> m11440g = CompactHashMap.this.m11440g();
            if (m11440g != null) {
                return m11440g.keySet().remove(obj);
            }
            Object m11450q = CompactHashMap.this.m11450q(obj);
            Object obj2 = CompactHashMap.f20887k;
            return m11450q != CompactHashMap.f20887k;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return CompactHashMap.this.size();
        }
    }

    public final class MapEntry extends AbstractMapEntry<K, V> {

        /* renamed from: b */
        @NullableDecl
        public final K f20906b;

        /* renamed from: c */
        public int f20907c;

        public MapEntry(int i2) {
            this.f20906b = (K) CompactHashMap.this.f20890d[i2];
            this.f20907c = i2;
        }

        /* renamed from: c */
        public final void m11454c() {
            int i2 = this.f20907c;
            if (i2 == -1 || i2 >= CompactHashMap.this.size() || !Objects.m11173a(this.f20906b, CompactHashMap.this.f20890d[this.f20907c])) {
                CompactHashMap compactHashMap = CompactHashMap.this;
                K k2 = this.f20906b;
                Object obj = CompactHashMap.f20887k;
                this.f20907c = compactHashMap.m11445l(k2);
            }
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @NullableDecl
        public K getKey() {
            return this.f20906b;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @NullableDecl
        public V getValue() {
            Map<K, V> m11440g = CompactHashMap.this.m11440g();
            if (m11440g != null) {
                return m11440g.get(this.f20906b);
            }
            m11454c();
            int i2 = this.f20907c;
            if (i2 == -1) {
                return null;
            }
            return (V) CompactHashMap.this.f20891e[i2];
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public V setValue(V v) {
            Map<K, V> m11440g = CompactHashMap.this.m11440g();
            if (m11440g != null) {
                return m11440g.put(this.f20906b, v);
            }
            m11454c();
            int i2 = this.f20907c;
            if (i2 == -1) {
                CompactHashMap.this.put(this.f20906b, v);
                return null;
            }
            Object[] objArr = CompactHashMap.this.f20891e;
            V v2 = (V) objArr[i2];
            objArr[i2] = v;
            return v2;
        }
    }

    public class ValuesView extends AbstractCollection<V> {
        public ValuesView() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            CompactHashMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            final CompactHashMap compactHashMap = CompactHashMap.this;
            Map<K, V> m11440g = compactHashMap.m11440g();
            return m11440g != null ? m11440g.values().iterator() : new CompactHashMap<Object, Object>.Itr<Object>() { // from class: com.google.common.collect.CompactHashMap.3
                @Override // com.google.common.collect.CompactHashMap.Itr
                /* renamed from: a */
                public Object mo11453a(int i2) {
                    return CompactHashMap.this.f20891e[i2];
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return CompactHashMap.this.size();
        }
    }

    public CompactHashMap() {
        mo11446m(3);
    }

    /* renamed from: a */
    public void mo11435a(int i2) {
    }

    /* renamed from: b */
    public int mo11436b(int i2, int i3) {
        return i2 - 1;
    }

    @CanIgnoreReturnValue
    /* renamed from: c */
    public int mo11437c() {
        Preconditions.m11192p(m11449p(), "Arrays already allocated");
        int i2 = this.f20892f;
        int max = Math.max(4, Hashing.m11605a(i2 + 1, 1.0d));
        this.f20888b = CompactHashing.m11469a(max);
        this.f20892f = CompactHashing.m11470b(this.f20892f, 32 - Integer.numberOfLeadingZeros(max - 1), 31);
        this.f20889c = new int[i2];
        this.f20890d = new Object[i2];
        this.f20891e = new Object[i2];
        return i2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (m11449p()) {
            return;
        }
        m11444k();
        Map<K, V> m11440g = m11440g();
        if (m11440g != null) {
            this.f20892f = Ints.m12082d(size(), 3, 1073741823);
            m11440g.clear();
            this.f20888b = null;
            this.f20893g = 0;
            return;
        }
        Arrays.fill(this.f20890d, 0, this.f20893g, (Object) null);
        Arrays.fill(this.f20891e, 0, this.f20893g, (Object) null);
        CompactHashing.m11473e(this.f20888b);
        Arrays.fill(this.f20889c, 0, this.f20893g, 0);
        this.f20893g = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(@NullableDecl Object obj) {
        Map<K, V> m11440g = m11440g();
        return m11440g != null ? m11440g.containsKey(obj) : m11445l(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@NullableDecl Object obj) {
        Map<K, V> m11440g = m11440g();
        if (m11440g != null) {
            return m11440g.containsValue(obj);
        }
        for (int i2 = 0; i2 < this.f20893g; i2++) {
            if (Objects.m11173a(obj, this.f20891e[i2])) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @VisibleForTesting
    @CanIgnoreReturnValue
    /* renamed from: d */
    public Map<K, V> mo11438d() {
        Map<K, V> mo11439f = mo11439f(m11443j() + 1);
        int mo11441h = mo11441h();
        while (mo11441h >= 0) {
            mo11439f.put(this.f20890d[mo11441h], this.f20891e[mo11441h]);
            mo11441h = mo11442i(mo11441h);
        }
        this.f20888b = mo11439f;
        this.f20889c = null;
        this.f20890d = null;
        this.f20891e = null;
        m11444k();
        return mo11439f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f20895i;
        if (set != null) {
            return set;
        }
        EntrySetView entrySetView = new EntrySetView();
        this.f20895i = entrySetView;
        return entrySetView;
    }

    /* renamed from: f */
    public Map<K, V> mo11439f(int i2) {
        return new LinkedHashMap(i2, 1.0f);
    }

    @VisibleForTesting
    @NullableDecl
    /* renamed from: g */
    public Map<K, V> m11440g() {
        Object obj = this.f20888b;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(@NullableDecl Object obj) {
        Map<K, V> m11440g = m11440g();
        if (m11440g != null) {
            return m11440g.get(obj);
        }
        int m11445l = m11445l(obj);
        if (m11445l == -1) {
            return null;
        }
        mo11435a(m11445l);
        return (V) this.f20891e[m11445l];
    }

    /* renamed from: h */
    public int mo11441h() {
        return isEmpty() ? -1 : 0;
    }

    /* renamed from: i */
    public int mo11442i(int i2) {
        int i3 = i2 + 1;
        if (i3 < this.f20893g) {
            return i3;
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    /* renamed from: j */
    public final int m11443j() {
        return (1 << (this.f20892f & 31)) - 1;
    }

    /* renamed from: k */
    public void m11444k() {
        this.f20892f += 32;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f20894h;
        if (set != null) {
            return set;
        }
        KeySetView keySetView = new KeySetView();
        this.f20894h = keySetView;
        return keySetView;
    }

    /* renamed from: l */
    public final int m11445l(@NullableDecl Object obj) {
        if (m11449p()) {
            return -1;
        }
        int m11607c = Hashing.m11607c(obj);
        int m11443j = m11443j();
        int m11474f = CompactHashing.m11474f(this.f20888b, m11607c & m11443j);
        if (m11474f == 0) {
            return -1;
        }
        int i2 = ~m11443j;
        int i3 = m11607c & i2;
        do {
            int i4 = m11474f - 1;
            int i5 = this.f20889c[i4];
            if ((i5 & i2) == i3 && Objects.m11173a(obj, this.f20890d[i4])) {
                return i4;
            }
            m11474f = i5 & m11443j;
        } while (m11474f != 0);
        return -1;
    }

    /* renamed from: m */
    public void mo11446m(int i2) {
        Preconditions.m11179c(i2 >= 0, "Expected size must be >= 0");
        this.f20892f = Ints.m12082d(i2, 1, 1073741823);
    }

    /* renamed from: n */
    public void mo11447n(int i2, @NullableDecl K k2, @NullableDecl V v, int i3, int i4) {
        this.f20889c[i2] = CompactHashing.m11470b(i3, 0, i4);
        this.f20890d[i2] = k2;
        this.f20891e[i2] = v;
    }

    /* renamed from: o */
    public void mo11448o(int i2, int i3) {
        int size = size() - 1;
        if (i2 >= size) {
            this.f20890d[i2] = null;
            this.f20891e[i2] = null;
            this.f20889c[i2] = 0;
            return;
        }
        Object[] objArr = this.f20890d;
        Object obj = objArr[size];
        objArr[i2] = obj;
        Object[] objArr2 = this.f20891e;
        objArr2[i2] = objArr2[size];
        objArr[size] = null;
        objArr2[size] = null;
        int[] iArr = this.f20889c;
        iArr[i2] = iArr[size];
        iArr[size] = 0;
        int m11607c = Hashing.m11607c(obj) & i3;
        int m11474f = CompactHashing.m11474f(this.f20888b, m11607c);
        int i4 = size + 1;
        if (m11474f == i4) {
            CompactHashing.m11475g(this.f20888b, m11607c, i2 + 1);
            return;
        }
        while (true) {
            int i5 = m11474f - 1;
            int[] iArr2 = this.f20889c;
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
    /* renamed from: p */
    public boolean m11449p() {
        return this.f20888b == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    @NullableDecl
    public V put(@NullableDecl K k2, @NullableDecl V v) {
        int m11452s;
        int length;
        int min;
        if (m11449p()) {
            mo11437c();
        }
        Map<K, V> m11440g = m11440g();
        if (m11440g != null) {
            return m11440g.put(k2, v);
        }
        int[] iArr = this.f20889c;
        Object[] objArr = this.f20890d;
        Object[] objArr2 = this.f20891e;
        int i2 = this.f20893g;
        int i3 = i2 + 1;
        int m11607c = Hashing.m11607c(k2);
        int m11443j = m11443j();
        int i4 = m11607c & m11443j;
        int m11474f = CompactHashing.m11474f(this.f20888b, i4);
        int i5 = 1;
        if (m11474f == 0) {
            if (i3 <= m11443j) {
                CompactHashing.m11475g(this.f20888b, i4, i3);
                length = this.f20889c.length;
                if (i3 > length) {
                    mo11451r(min);
                }
                mo11447n(i2, k2, v, m11607c, m11443j);
                this.f20893g = i3;
                m11444k();
                return null;
            }
            m11452s = m11452s(m11443j, CompactHashing.m11471c(m11443j), m11607c, i2);
            m11443j = m11452s;
            length = this.f20889c.length;
            if (i3 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
                mo11451r(min);
            }
            mo11447n(i2, k2, v, m11607c, m11443j);
            this.f20893g = i3;
            m11444k();
            return null;
        }
        int i6 = ~m11443j;
        int i7 = m11607c & i6;
        int i8 = 0;
        while (true) {
            int i9 = m11474f - i5;
            int i10 = iArr[i9];
            if ((i10 & i6) == i7 && Objects.m11173a(k2, objArr[i9])) {
                V v2 = (V) objArr2[i9];
                objArr2[i9] = v;
                mo11435a(i9);
                return v2;
            }
            int i11 = i10 & m11443j;
            i8++;
            if (i11 != 0) {
                m11474f = i11;
                i5 = 1;
            } else {
                if (i8 >= 9) {
                    return mo11438d().put(k2, v);
                }
                if (i3 > m11443j) {
                    m11452s = m11452s(m11443j, CompactHashing.m11471c(m11443j), m11607c, i2);
                } else {
                    iArr[i9] = CompactHashing.m11470b(i10, i3, m11443j);
                }
            }
        }
    }

    @NullableDecl
    /* renamed from: q */
    public final Object m11450q(@NullableDecl Object obj) {
        if (m11449p()) {
            return f20887k;
        }
        int m11443j = m11443j();
        int m11472d = CompactHashing.m11472d(obj, null, m11443j, this.f20888b, this.f20889c, this.f20890d, null);
        if (m11472d == -1) {
            return f20887k;
        }
        Object obj2 = this.f20891e[m11472d];
        mo11448o(m11472d, m11443j);
        this.f20893g--;
        m11444k();
        return obj2;
    }

    /* renamed from: r */
    public void mo11451r(int i2) {
        this.f20889c = Arrays.copyOf(this.f20889c, i2);
        this.f20890d = Arrays.copyOf(this.f20890d, i2);
        this.f20891e = Arrays.copyOf(this.f20891e, i2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    @NullableDecl
    public V remove(@NullableDecl Object obj) {
        Map<K, V> m11440g = m11440g();
        if (m11440g != null) {
            return m11440g.remove(obj);
        }
        V v = (V) m11450q(obj);
        if (v == f20887k) {
            return null;
        }
        return v;
    }

    @CanIgnoreReturnValue
    /* renamed from: s */
    public final int m11452s(int i2, int i3, int i4, int i5) {
        Object m11469a = CompactHashing.m11469a(i3);
        int i6 = i3 - 1;
        if (i5 != 0) {
            CompactHashing.m11475g(m11469a, i4 & i6, i5 + 1);
        }
        Object obj = this.f20888b;
        int[] iArr = this.f20889c;
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
        this.f20888b = m11469a;
        this.f20892f = CompactHashing.m11470b(this.f20892f, 32 - Integer.numberOfLeadingZeros(i6), 31);
        return i6;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        Map<K, V> m11440g = m11440g();
        return m11440g != null ? m11440g.size() : this.f20893g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.f20896j;
        if (collection != null) {
            return collection;
        }
        ValuesView valuesView = new ValuesView();
        this.f20896j = valuesView;
        return valuesView;
    }

    public CompactHashMap(int i2) {
        mo11446m(i2);
    }
}
