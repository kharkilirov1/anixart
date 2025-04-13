package com.google.common.collect;

import androidx.room.util.C0576a;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
public final class HashBiMap<K, V> extends AbstractMap<K, V> implements BiMap<K, V>, Serializable {

    /* renamed from: b */
    public transient K[] f20993b;

    /* renamed from: c */
    public transient V[] f20994c;

    /* renamed from: d */
    public transient int f20995d;

    /* renamed from: e */
    public transient int f20996e;

    /* renamed from: f */
    public transient int[] f20997f;

    /* renamed from: g */
    public transient int[] f20998g;

    /* renamed from: h */
    public transient int[] f20999h;

    /* renamed from: i */
    public transient int[] f21000i;

    /* renamed from: j */
    @NullableDecl
    public transient int f21001j;

    /* renamed from: k */
    @NullableDecl
    public transient int f21002k;

    /* renamed from: l */
    public transient int[] f21003l;

    /* renamed from: m */
    public transient int[] f21004m;

    /* renamed from: n */
    public transient Set<K> f21005n;

    /* renamed from: o */
    public transient Set<V> f21006o;

    /* renamed from: p */
    public transient Set<Map.Entry<K, V>> f21007p;

    public final class EntryForKey extends AbstractMapEntry<K, V> {

        /* renamed from: b */
        @NullableDecl
        public final K f21008b;

        /* renamed from: c */
        public int f21009c;

        public EntryForKey(int i2) {
            this.f21008b = HashBiMap.this.f20993b[i2];
            this.f21009c = i2;
        }

        /* renamed from: c */
        public void m11602c() {
            int i2 = this.f21009c;
            if (i2 != -1) {
                HashBiMap hashBiMap = HashBiMap.this;
                if (i2 <= hashBiMap.f20995d && Objects.m11173a(hashBiMap.f20993b[i2], this.f21008b)) {
                    return;
                }
            }
            this.f21009c = HashBiMap.this.m11589h(this.f21008b);
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public K getKey() {
            return this.f21008b;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        @NullableDecl
        public V getValue() {
            m11602c();
            int i2 = this.f21009c;
            if (i2 == -1) {
                return null;
            }
            return HashBiMap.this.f20994c[i2];
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public V setValue(V v) {
            m11602c();
            int i2 = this.f21009c;
            if (i2 == -1) {
                return (V) HashBiMap.this.put(this.f21008b, v);
            }
            V v2 = HashBiMap.this.f20994c[i2];
            if (Objects.m11173a(v2, v)) {
                return v;
            }
            HashBiMap.this.m11600s(this.f21009c, v, false);
            return v2;
        }
    }

    public static final class EntryForValue<K, V> extends AbstractMapEntry<V, K> {

        /* renamed from: b */
        public final HashBiMap<K, V> f21011b;

        /* renamed from: c */
        public final V f21012c;

        /* renamed from: d */
        public int f21013d;

        public EntryForValue(HashBiMap<K, V> hashBiMap, int i2) {
            this.f21011b = hashBiMap;
            this.f21012c = hashBiMap.f20994c[i2];
            this.f21013d = i2;
        }

        /* renamed from: c */
        public final void m11603c() {
            int i2 = this.f21013d;
            if (i2 != -1) {
                HashBiMap<K, V> hashBiMap = this.f21011b;
                if (i2 <= hashBiMap.f20995d && Objects.m11173a(this.f21012c, hashBiMap.f20994c[i2])) {
                    return;
                }
            }
            this.f21013d = this.f21011b.m11591j(this.f21012c);
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public V getKey() {
            return this.f21012c;
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public K getValue() {
            m11603c();
            int i2 = this.f21013d;
            if (i2 == -1) {
                return null;
            }
            return this.f21011b.f20993b[i2];
        }

        @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
        public K setValue(K k2) {
            m11603c();
            int i2 = this.f21013d;
            if (i2 == -1) {
                return this.f21011b.m11595n(this.f21012c, k2, false);
            }
            K k3 = this.f21011b.f20993b[i2];
            if (Objects.m11173a(k3, k2)) {
                return k2;
            }
            this.f21011b.m11599r(this.f21013d, k2, false);
            return k3;
        }
    }

    public final class EntrySet extends View<K, V, Map.Entry<K, V>> {
        public EntrySet() {
            super(HashBiMap.this);
        }

        @Override // com.google.common.collect.HashBiMap.View
        /* renamed from: a */
        public Object mo11604a(int i2) {
            return new EntryForKey(i2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int m11589h = HashBiMap.this.m11589h(key);
            return m11589h != -1 && Objects.m11173a(value, HashBiMap.this.f20994c[m11589h]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        public boolean remove(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int m11607c = Hashing.m11607c(key);
            int m11590i = HashBiMap.this.m11590i(key, m11607c);
            if (m11590i == -1 || !Objects.m11173a(value, HashBiMap.this.f20994c[m11590i])) {
                return false;
            }
            HashBiMap.this.m11597p(m11590i, m11607c);
            return true;
        }
    }

    public static class Inverse<K, V> extends AbstractMap<V, K> implements BiMap<V, K>, Serializable {

        /* renamed from: b */
        public final HashBiMap<K, V> f21015b;

        /* renamed from: c */
        public transient Set<Map.Entry<V, K>> f21016c;

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            this.f21015b.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@NullableDecl Object obj) {
            return this.f21015b.containsValue(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsValue(@NullableDecl Object obj) {
            return this.f21015b.containsKey(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<V, K>> entrySet() {
            Set<Map.Entry<V, K>> set = this.f21016c;
            if (set != null) {
                return set;
            }
            InverseEntrySet inverseEntrySet = new InverseEntrySet(this.f21015b);
            this.f21016c = inverseEntrySet;
            return inverseEntrySet;
        }

        @Override // java.util.AbstractMap, java.util.Map
        @NullableDecl
        public K get(@NullableDecl Object obj) {
            HashBiMap<K, V> hashBiMap = this.f21015b;
            int m11591j = hashBiMap.m11591j(obj);
            if (m11591j == -1) {
                return null;
            }
            return hashBiMap.f20993b[m11591j];
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<V> keySet() {
            return this.f21015b.values();
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CanIgnoreReturnValue
        @NullableDecl
        public K put(@NullableDecl V v, @NullableDecl K k2) {
            return this.f21015b.m11595n(v, k2, false);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @CanIgnoreReturnValue
        @NullableDecl
        public K remove(@NullableDecl Object obj) {
            HashBiMap<K, V> hashBiMap = this.f21015b;
            java.util.Objects.requireNonNull(hashBiMap);
            int m11607c = Hashing.m11607c(obj);
            int m11592k = hashBiMap.m11592k(obj, m11607c);
            if (m11592k == -1) {
                return null;
            }
            K k2 = hashBiMap.f20993b[m11592k];
            hashBiMap.m11598q(m11592k, m11607c);
            return k2;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f21015b.f20995d;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> values() {
            return this.f21015b.keySet();
        }
    }

    public static class InverseEntrySet<K, V> extends View<K, V, Map.Entry<V, K>> {
        public InverseEntrySet(HashBiMap<K, V> hashBiMap) {
            super(hashBiMap);
        }

        @Override // com.google.common.collect.HashBiMap.View
        /* renamed from: a */
        public Object mo11604a(int i2) {
            return new EntryForValue(this.f21019b, i2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int m11591j = this.f21019b.m11591j(key);
            return m11591j != -1 && Objects.m11173a(this.f21019b.f20993b[m11591j], value);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int m11607c = Hashing.m11607c(key);
            int m11592k = this.f21019b.m11592k(key, m11607c);
            if (m11592k == -1 || !Objects.m11173a(this.f21019b.f20993b[m11592k], value)) {
                return false;
            }
            this.f21019b.m11598q(m11592k, m11607c);
            return true;
        }
    }

    public final class KeySet extends View<K, V, K> {
        public KeySet() {
            super(HashBiMap.this);
        }

        @Override // com.google.common.collect.HashBiMap.View
        /* renamed from: a */
        public K mo11604a(int i2) {
            return HashBiMap.this.f20993b[i2];
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            return HashBiMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@NullableDecl Object obj) {
            int m11607c = Hashing.m11607c(obj);
            int m11590i = HashBiMap.this.m11590i(obj, m11607c);
            if (m11590i == -1) {
                return false;
            }
            HashBiMap.this.m11597p(m11590i, m11607c);
            return true;
        }
    }

    public final class ValueSet extends View<K, V, V> {
        public ValueSet() {
            super(HashBiMap.this);
        }

        @Override // com.google.common.collect.HashBiMap.View
        /* renamed from: a */
        public V mo11604a(int i2) {
            return HashBiMap.this.f20994c[i2];
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            return HashBiMap.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@NullableDecl Object obj) {
            int m11607c = Hashing.m11607c(obj);
            int m11592k = HashBiMap.this.m11592k(obj, m11607c);
            if (m11592k == -1) {
                return false;
            }
            HashBiMap.this.m11598q(m11592k, m11607c);
            return true;
        }
    }

    public static abstract class View<K, V, T> extends AbstractSet<T> {

        /* renamed from: b */
        public final HashBiMap<K, V> f21019b;

        public View(HashBiMap<K, V> hashBiMap) {
            this.f21019b = hashBiMap;
        }

        /* renamed from: a */
        public abstract T mo11604a(int i2);

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.f21019b.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<T> iterator() {
            return new Iterator<T>() { // from class: com.google.common.collect.HashBiMap.View.1

                /* renamed from: b */
                public int f21020b;

                /* renamed from: c */
                public int f21021c;

                /* renamed from: d */
                public int f21022d;

                /* renamed from: e */
                public int f21023e;

                {
                    HashBiMap<K, V> hashBiMap = View.this.f21019b;
                    this.f21020b = hashBiMap.f21001j;
                    this.f21021c = -1;
                    this.f21022d = hashBiMap.f20996e;
                    this.f21023e = hashBiMap.f20995d;
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    if (View.this.f21019b.f20996e == this.f21022d) {
                        return this.f21020b != -2 && this.f21023e > 0;
                    }
                    throw new ConcurrentModificationException();
                }

                @Override // java.util.Iterator
                public T next() {
                    if (!hasNext()) {
                        throw new NoSuchElementException();
                    }
                    T t = (T) View.this.mo11604a(this.f21020b);
                    int i2 = this.f21020b;
                    this.f21021c = i2;
                    this.f21020b = View.this.f21019b.f21004m[i2];
                    this.f21023e--;
                    return t;
                }

                @Override // java.util.Iterator
                public void remove() {
                    if (View.this.f21019b.f20996e != this.f21022d) {
                        throw new ConcurrentModificationException();
                    }
                    Preconditions.m11192p(this.f21021c != -1, "no calls to next() since the last call to remove()");
                    HashBiMap<K, V> hashBiMap = View.this.f21019b;
                    int i2 = this.f21021c;
                    hashBiMap.m11596o(i2, Hashing.m11607c(hashBiMap.f20993b[i2]), Hashing.m11607c(hashBiMap.f20994c[i2]));
                    int i3 = this.f21020b;
                    HashBiMap<K, V> hashBiMap2 = View.this.f21019b;
                    if (i3 == hashBiMap2.f20995d) {
                        this.f21020b = this.f21021c;
                    }
                    this.f21021c = -1;
                    this.f21022d = hashBiMap2.f20996e;
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f21019b.f20995d;
        }
    }

    /* renamed from: f */
    public static int[] m11583f(int[] iArr, int i2) {
        int length = iArr.length;
        int[] copyOf = Arrays.copyOf(iArr, i2);
        Arrays.fill(copyOf, length, i2, -1);
        return copyOf;
    }

    /* renamed from: a */
    public final int m11584a(int i2) {
        return i2 & (this.f20997f.length - 1);
    }

    /* renamed from: b */
    public final void m11585b(int i2, int i3) {
        Preconditions.m11178b(i2 != -1);
        int[] iArr = this.f20997f;
        int length = i3 & (iArr.length - 1);
        if (iArr[length] == i2) {
            int[] iArr2 = this.f20999h;
            iArr[length] = iArr2[i2];
            iArr2[i2] = -1;
            return;
        }
        int i4 = iArr[length];
        int i5 = this.f20999h[i4];
        while (true) {
            int i6 = i5;
            int i7 = i4;
            i4 = i6;
            if (i4 == -1) {
                String valueOf = String.valueOf(this.f20993b[i2]);
                throw new AssertionError(C0576a.m4114m(valueOf.length() + 32, "Expected to find entry with key ", valueOf));
            }
            if (i4 == i2) {
                int[] iArr3 = this.f20999h;
                iArr3[i7] = iArr3[i2];
                iArr3[i2] = -1;
                return;
            }
            i5 = this.f20999h[i4];
        }
    }

    /* renamed from: c */
    public final void m11586c(int i2, int i3) {
        Preconditions.m11178b(i2 != -1);
        int length = i3 & (this.f20997f.length - 1);
        int[] iArr = this.f20998g;
        if (iArr[length] == i2) {
            int[] iArr2 = this.f21000i;
            iArr[length] = iArr2[i2];
            iArr2[i2] = -1;
            return;
        }
        int i4 = iArr[length];
        int i5 = this.f21000i[i4];
        while (true) {
            int i6 = i5;
            int i7 = i4;
            i4 = i6;
            if (i4 == -1) {
                String valueOf = String.valueOf(this.f20994c[i2]);
                throw new AssertionError(C0576a.m4114m(valueOf.length() + 34, "Expected to find entry with value ", valueOf));
            }
            if (i4 == i2) {
                int[] iArr3 = this.f21000i;
                iArr3[i7] = iArr3[i2];
                iArr3[i2] = -1;
                return;
            }
            i5 = this.f21000i[i4];
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.f20993b, 0, this.f20995d, (Object) null);
        Arrays.fill(this.f20994c, 0, this.f20995d, (Object) null);
        Arrays.fill(this.f20997f, -1);
        Arrays.fill(this.f20998g, -1);
        Arrays.fill(this.f20999h, 0, this.f20995d, -1);
        Arrays.fill(this.f21000i, 0, this.f20995d, -1);
        Arrays.fill(this.f21003l, 0, this.f20995d, -1);
        Arrays.fill(this.f21004m, 0, this.f20995d, -1);
        this.f20995d = 0;
        this.f21001j = -2;
        this.f21002k = -2;
        this.f20996e++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(@NullableDecl Object obj) {
        return m11589h(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@NullableDecl Object obj) {
        return m11591j(obj) != -1;
    }

    /* renamed from: d */
    public final void m11587d(int i2) {
        int[] iArr = this.f20999h;
        if (iArr.length < i2) {
            int m11624a = ImmutableCollection.Builder.m11624a(iArr.length, i2);
            this.f20993b = (K[]) Arrays.copyOf(this.f20993b, m11624a);
            this.f20994c = (V[]) Arrays.copyOf(this.f20994c, m11624a);
            this.f20999h = m11583f(this.f20999h, m11624a);
            this.f21000i = m11583f(this.f21000i, m11624a);
            this.f21003l = m11583f(this.f21003l, m11624a);
            this.f21004m = m11583f(this.f21004m, m11624a);
        }
        if (this.f20997f.length < i2) {
            int m11605a = Hashing.m11605a(i2, 1.0d);
            int[] iArr2 = new int[m11605a];
            Arrays.fill(iArr2, -1);
            this.f20997f = iArr2;
            int[] iArr3 = new int[m11605a];
            Arrays.fill(iArr3, -1);
            this.f20998g = iArr3;
            for (int i3 = 0; i3 < this.f20995d; i3++) {
                int m11584a = m11584a(Hashing.m11607c(this.f20993b[i3]));
                int[] iArr4 = this.f20999h;
                int[] iArr5 = this.f20997f;
                iArr4[i3] = iArr5[m11584a];
                iArr5[m11584a] = i3;
                int m11584a2 = m11584a(Hashing.m11607c(this.f20994c[i3]));
                int[] iArr6 = this.f21000i;
                int[] iArr7 = this.f20998g;
                iArr6[i3] = iArr7[m11584a2];
                iArr7[m11584a2] = i3;
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f21007p;
        if (set != null) {
            return set;
        }
        EntrySet entrySet = new EntrySet();
        this.f21007p = entrySet;
        return entrySet;
    }

    /* renamed from: g */
    public int m11588g(@NullableDecl Object obj, int i2, int[] iArr, int[] iArr2, Object[] objArr) {
        int i3 = iArr[i2 & (this.f20997f.length - 1)];
        while (i3 != -1) {
            if (Objects.m11173a(objArr[i3], obj)) {
                return i3;
            }
            i3 = iArr2[i3];
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @NullableDecl
    public V get(@NullableDecl Object obj) {
        int m11589h = m11589h(obj);
        if (m11589h == -1) {
            return null;
        }
        return this.f20994c[m11589h];
    }

    /* renamed from: h */
    public int m11589h(@NullableDecl Object obj) {
        return m11590i(obj, Hashing.m11607c(obj));
    }

    /* renamed from: i */
    public int m11590i(@NullableDecl Object obj, int i2) {
        return m11588g(obj, i2, this.f20997f, this.f20999h, this.f20993b);
    }

    /* renamed from: j */
    public int m11591j(@NullableDecl Object obj) {
        return m11592k(obj, Hashing.m11607c(obj));
    }

    /* renamed from: k */
    public int m11592k(@NullableDecl Object obj, int i2) {
        return m11588g(obj, i2, this.f20998g, this.f21000i, this.f20994c);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f21005n;
        if (set != null) {
            return set;
        }
        KeySet keySet = new KeySet();
        this.f21005n = keySet;
        return keySet;
    }

    /* renamed from: l */
    public final void m11593l(int i2, int i3) {
        Preconditions.m11178b(i2 != -1);
        int[] iArr = this.f20997f;
        int length = i3 & (iArr.length - 1);
        this.f20999h[i2] = iArr[length];
        iArr[length] = i2;
    }

    /* renamed from: m */
    public final void m11594m(int i2, int i3) {
        Preconditions.m11178b(i2 != -1);
        int length = i3 & (this.f20997f.length - 1);
        int[] iArr = this.f21000i;
        int[] iArr2 = this.f20998g;
        iArr[i2] = iArr2[length];
        iArr2[length] = i2;
    }

    @NullableDecl
    /* renamed from: n */
    public K m11595n(@NullableDecl V v, @NullableDecl K k2, boolean z) {
        int m11607c = Hashing.m11607c(v);
        int m11592k = m11592k(v, m11607c);
        if (m11592k != -1) {
            K k3 = this.f20993b[m11592k];
            if (Objects.m11173a(k3, k2)) {
                return k2;
            }
            m11599r(m11592k, k2, z);
            return k3;
        }
        int i2 = this.f21002k;
        int m11607c2 = Hashing.m11607c(k2);
        int m11590i = m11590i(k2, m11607c2);
        if (!z) {
            Preconditions.m11184h(m11590i == -1, "Key already present: %s", k2);
        } else if (m11590i != -1) {
            i2 = this.f21003l[m11590i];
            m11597p(m11590i, m11607c2);
        }
        m11587d(this.f20995d + 1);
        K[] kArr = this.f20993b;
        int i3 = this.f20995d;
        kArr[i3] = k2;
        this.f20994c[i3] = v;
        m11593l(i3, m11607c2);
        m11594m(this.f20995d, m11607c);
        int i4 = i2 == -2 ? this.f21001j : this.f21004m[i2];
        m11601t(i2, this.f20995d);
        m11601t(this.f20995d, i4);
        this.f20995d++;
        this.f20996e++;
        return null;
    }

    /* renamed from: o */
    public final void m11596o(int i2, int i3, int i4) {
        int i5;
        int i6;
        Preconditions.m11178b(i2 != -1);
        m11585b(i2, i3);
        m11586c(i2, i4);
        m11601t(this.f21003l[i2], this.f21004m[i2]);
        int i7 = this.f20995d - 1;
        if (i7 != i2) {
            int i8 = this.f21003l[i7];
            int i9 = this.f21004m[i7];
            m11601t(i8, i2);
            m11601t(i2, i9);
            K[] kArr = this.f20993b;
            K k2 = kArr[i7];
            V[] vArr = this.f20994c;
            V v = vArr[i7];
            kArr[i2] = k2;
            vArr[i2] = v;
            int m11584a = m11584a(Hashing.m11607c(k2));
            int[] iArr = this.f20997f;
            if (iArr[m11584a] == i7) {
                iArr[m11584a] = i2;
            } else {
                int i10 = iArr[m11584a];
                int i11 = this.f20999h[i10];
                while (true) {
                    int i12 = i11;
                    i5 = i10;
                    i10 = i12;
                    if (i10 == i7) {
                        break;
                    } else {
                        i11 = this.f20999h[i10];
                    }
                }
                this.f20999h[i5] = i2;
            }
            int[] iArr2 = this.f20999h;
            iArr2[i2] = iArr2[i7];
            iArr2[i7] = -1;
            int m11584a2 = m11584a(Hashing.m11607c(v));
            int[] iArr3 = this.f20998g;
            if (iArr3[m11584a2] == i7) {
                iArr3[m11584a2] = i2;
            } else {
                int i13 = iArr3[m11584a2];
                int i14 = this.f21000i[i13];
                while (true) {
                    int i15 = i14;
                    i6 = i13;
                    i13 = i15;
                    if (i13 == i7) {
                        break;
                    } else {
                        i14 = this.f21000i[i13];
                    }
                }
                this.f21000i[i6] = i2;
            }
            int[] iArr4 = this.f21000i;
            iArr4[i2] = iArr4[i7];
            iArr4[i7] = -1;
        }
        K[] kArr2 = this.f20993b;
        int i16 = this.f20995d;
        kArr2[i16 - 1] = null;
        this.f20994c[i16 - 1] = null;
        this.f20995d = i16 - 1;
        this.f20996e++;
    }

    /* renamed from: p */
    public void m11597p(int i2, int i3) {
        m11596o(i2, i3, Hashing.m11607c(this.f20994c[i2]));
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    public V put(@NullableDecl K k2, @NullableDecl V v) {
        int m11607c = Hashing.m11607c(k2);
        int m11590i = m11590i(k2, m11607c);
        if (m11590i != -1) {
            V v2 = this.f20994c[m11590i];
            if (Objects.m11173a(v2, v)) {
                return v;
            }
            m11600s(m11590i, v, false);
            return v2;
        }
        int m11607c2 = Hashing.m11607c(v);
        Preconditions.m11184h(m11592k(v, m11607c2) == -1, "Value already present: %s", v);
        m11587d(this.f20995d + 1);
        K[] kArr = this.f20993b;
        int i2 = this.f20995d;
        kArr[i2] = k2;
        this.f20994c[i2] = v;
        m11593l(i2, m11607c);
        m11594m(this.f20995d, m11607c2);
        m11601t(this.f21002k, this.f20995d);
        m11601t(this.f20995d, -2);
        this.f20995d++;
        this.f20996e++;
        return null;
    }

    /* renamed from: q */
    public void m11598q(int i2, int i3) {
        m11596o(i2, Hashing.m11607c(this.f20993b[i2]), i3);
    }

    /* renamed from: r */
    public final void m11599r(int i2, @NullableDecl K k2, boolean z) {
        Preconditions.m11178b(i2 != -1);
        int m11607c = Hashing.m11607c(k2);
        int m11590i = m11590i(k2, m11607c);
        int i3 = this.f21002k;
        int i4 = -2;
        if (m11590i != -1) {
            if (!z) {
                String valueOf = String.valueOf(k2);
                throw new IllegalArgumentException(C0576a.m4114m(valueOf.length() + 28, "Key already present in map: ", valueOf));
            }
            i3 = this.f21003l[m11590i];
            i4 = this.f21004m[m11590i];
            m11597p(m11590i, m11607c);
            if (i2 == this.f20995d) {
                i2 = m11590i;
            }
        }
        if (i3 == i2) {
            i3 = this.f21003l[i2];
        } else if (i3 == this.f20995d) {
            i3 = m11590i;
        }
        if (i4 == i2) {
            m11590i = this.f21004m[i2];
        } else if (i4 != this.f20995d) {
            m11590i = i4;
        }
        m11601t(this.f21003l[i2], this.f21004m[i2]);
        m11585b(i2, Hashing.m11607c(this.f20993b[i2]));
        this.f20993b[i2] = k2;
        m11593l(i2, Hashing.m11607c(k2));
        m11601t(i3, i2);
        m11601t(i2, m11590i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    @NullableDecl
    public V remove(@NullableDecl Object obj) {
        int m11607c = Hashing.m11607c(obj);
        int m11590i = m11590i(obj, m11607c);
        if (m11590i == -1) {
            return null;
        }
        V v = this.f20994c[m11590i];
        m11597p(m11590i, m11607c);
        return v;
    }

    /* renamed from: s */
    public final void m11600s(int i2, @NullableDecl V v, boolean z) {
        Preconditions.m11178b(i2 != -1);
        int m11607c = Hashing.m11607c(v);
        int m11592k = m11592k(v, m11607c);
        if (m11592k != -1) {
            if (!z) {
                String valueOf = String.valueOf(v);
                throw new IllegalArgumentException(C0576a.m4114m(valueOf.length() + 30, "Value already present in map: ", valueOf));
            }
            m11598q(m11592k, m11607c);
            if (i2 == this.f20995d) {
                i2 = m11592k;
            }
        }
        m11586c(i2, Hashing.m11607c(this.f20994c[i2]));
        this.f20994c[i2] = v;
        m11594m(i2, m11607c);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f20995d;
    }

    /* renamed from: t */
    public final void m11601t(int i2, int i3) {
        if (i2 == -2) {
            this.f21001j = i3;
        } else {
            this.f21004m[i2] = i3;
        }
        if (i3 == -2) {
            this.f21002k = i2;
        } else {
            this.f21003l[i3] = i2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<V> values() {
        Set<V> set = this.f21006o;
        if (set != null) {
            return set;
        }
        ValueSet valueSet = new ValueSet();
        this.f21006o = valueSet;
        return valueSet;
    }
}
