package kotlin.collections.builders;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.jvm.internal.markers.KMutableMap;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MapBuilder.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u00060\u0004j\u0002`\u0005:\u0006\u0006\u0007\b\t\n\u000b¨\u0006\f"}, m31884d2 = {"Lkotlin/collections/builders/MapBuilder;", "K", "V", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Companion", "EntriesItr", "EntryRef", "Itr", "KeysItr", "ValuesItr", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class MapBuilder<K, V> implements Map<K, V>, Serializable, KMutableMap {

    /* renamed from: b */
    @NotNull
    public K[] f63184b;

    /* renamed from: c */
    @Nullable
    public V[] f63185c;

    /* renamed from: d */
    @NotNull
    public int[] f63186d;

    /* renamed from: e */
    @NotNull
    public int[] f63187e;

    /* renamed from: f */
    public int f63188f;

    /* renamed from: g */
    public int f63189g;

    /* renamed from: h */
    public int f63190h;

    /* renamed from: i */
    public int f63191i;

    /* renamed from: j */
    @Nullable
    public MapBuilderKeys<K> f63192j;

    /* renamed from: k */
    @Nullable
    public MapBuilderValues<V> f63193k;

    /* renamed from: l */
    @Nullable
    public MapBuilderEntries<K, V> f63194l;

    /* renamed from: m */
    public boolean f63195m;

    /* compiled from: MapBuilder.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\b"}, m31884d2 = {"Lkotlin/collections/builders/MapBuilder$Companion;", "", "", "INITIAL_CAPACITY", "I", "INITIAL_MAX_PROBE_DISTANCE", "MAGIC", "TOMBSTONE", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    /* compiled from: MapBuilder.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0010'\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00050\u0004¨\u0006\u0006"}, m31884d2 = {"Lkotlin/collections/builders/MapBuilder$EntriesItr;", "K", "V", "Lkotlin/collections/builders/MapBuilder$Itr;", "", "", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class EntriesItr<K, V> extends Itr<K, V> implements Iterator<Map.Entry<K, V>>, KMutableIterator {
        public EntriesItr(@NotNull MapBuilder<K, V> mapBuilder) {
            super(mapBuilder);
        }

        @Override // java.util.Iterator
        public Object next() {
            int i2 = this.f63199c;
            MapBuilder<K, V> mapBuilder = this.f63198b;
            if (i2 >= mapBuilder.f63189g) {
                throw new NoSuchElementException();
            }
            this.f63199c = i2 + 1;
            this.f63200d = i2;
            EntryRef entryRef = new EntryRef(mapBuilder, i2);
            m32107a();
            return entryRef;
        }
    }

    /* compiled from: MapBuilder.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003¨\u0006\u0004"}, m31884d2 = {"Lkotlin/collections/builders/MapBuilder$EntryRef;", "K", "V", "", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class EntryRef<K, V> implements Map.Entry<K, V>, KMutableMap.Entry {

        /* renamed from: b */
        @NotNull
        public final MapBuilder<K, V> f63196b;

        /* renamed from: c */
        public final int f63197c;

        public EntryRef(@NotNull MapBuilder<K, V> map, int i2) {
            Intrinsics.m32179h(map, "map");
            this.f63196b = map;
            this.f63197c = i2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(@Nullable Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (Intrinsics.m32174c(entry.getKey(), getKey()) && Intrinsics.m32174c(entry.getValue(), getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f63196b.f63184b[this.f63197c];
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            V[] vArr = this.f63196b.f63185c;
            Intrinsics.m32176e(vArr);
            return vArr[this.f63197c];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K key = getKey();
            int hashCode = key != null ? key.hashCode() : 0;
            V value = getValue();
            return hashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            this.f63196b.m32097c();
            V[] m32096b = this.f63196b.m32096b();
            int i2 = this.f63197c;
            V v2 = m32096b[i2];
            m32096b[i2] = v;
            return v2;
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append('=');
            sb.append(getValue());
            return sb.toString();
        }
    }

    /* compiled from: MapBuilder.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\b\u0010\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003¨\u0006\u0004"}, m31884d2 = {"Lkotlin/collections/builders/MapBuilder$Itr;", "K", "V", "", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static class Itr<K, V> {

        /* renamed from: b */
        @NotNull
        public final MapBuilder<K, V> f63198b;

        /* renamed from: c */
        public int f63199c;

        /* renamed from: d */
        public int f63200d = -1;

        public Itr(@NotNull MapBuilder<K, V> mapBuilder) {
            this.f63198b = mapBuilder;
            m32107a();
        }

        /* renamed from: a */
        public final void m32107a() {
            while (true) {
                int i2 = this.f63199c;
                MapBuilder<K, V> mapBuilder = this.f63198b;
                if (i2 >= mapBuilder.f63189g || mapBuilder.f63186d[i2] >= 0) {
                    return;
                } else {
                    this.f63199c = i2 + 1;
                }
            }
        }

        public final boolean hasNext() {
            return this.f63199c < this.f63198b.f63189g;
        }

        public final void remove() {
            if (!(this.f63200d != -1)) {
                throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
            }
            this.f63198b.m32097c();
            this.f63198b.m32106n(this.f63200d);
            this.f63200d = -1;
        }
    }

    /* compiled from: MapBuilder.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004¨\u0006\u0005"}, m31884d2 = {"Lkotlin/collections/builders/MapBuilder$KeysItr;", "K", "V", "Lkotlin/collections/builders/MapBuilder$Itr;", "", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class KeysItr<K, V> extends Itr<K, V> implements Iterator<K>, KMutableIterator {
        public KeysItr(@NotNull MapBuilder<K, V> mapBuilder) {
            super(mapBuilder);
        }

        @Override // java.util.Iterator
        public K next() {
            int i2 = this.f63199c;
            MapBuilder<K, V> mapBuilder = this.f63198b;
            if (i2 >= mapBuilder.f63189g) {
                throw new NoSuchElementException();
            }
            this.f63199c = i2 + 1;
            this.f63200d = i2;
            K k2 = mapBuilder.f63184b[i2];
            m32107a();
            return k2;
        }
    }

    /* compiled from: MapBuilder.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\b\u0012\u0004\u0012\u00028\u00030\u0004¨\u0006\u0005"}, m31884d2 = {"Lkotlin/collections/builders/MapBuilder$ValuesItr;", "K", "V", "Lkotlin/collections/builders/MapBuilder$Itr;", "", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class ValuesItr<K, V> extends Itr<K, V> implements Iterator<V>, KMutableIterator {
        public ValuesItr(@NotNull MapBuilder<K, V> mapBuilder) {
            super(mapBuilder);
        }

        @Override // java.util.Iterator
        public V next() {
            int i2 = this.f63199c;
            MapBuilder<K, V> mapBuilder = this.f63198b;
            if (i2 >= mapBuilder.f63189g) {
                throw new NoSuchElementException();
            }
            this.f63199c = i2 + 1;
            this.f63200d = i2;
            V[] vArr = mapBuilder.f63185c;
            Intrinsics.m32176e(vArr);
            V v = vArr[this.f63200d];
            m32107a();
            return v;
        }
    }

    public MapBuilder() {
        this(8);
    }

    /* renamed from: a */
    public final int m32095a(K k2) {
        m32097c();
        while (true) {
            int m32103k = m32103k(k2);
            int i2 = this.f63188f * 2;
            int length = this.f63187e.length / 2;
            if (i2 > length) {
                i2 = length;
            }
            int i3 = 0;
            while (true) {
                int[] iArr = this.f63187e;
                int i4 = iArr[m32103k];
                if (i4 <= 0) {
                    int i5 = this.f63189g;
                    K[] kArr = this.f63184b;
                    if (i5 < kArr.length) {
                        int i6 = i5 + 1;
                        this.f63189g = i6;
                        kArr[i5] = k2;
                        this.f63186d[i5] = m32103k;
                        iArr[m32103k] = i6;
                        this.f63191i++;
                        if (i3 > this.f63188f) {
                            this.f63188f = i3;
                        }
                        return i5;
                    }
                    m32100g(1);
                } else {
                    if (Intrinsics.m32174c(this.f63184b[i4 - 1], k2)) {
                        return -i4;
                    }
                    i3++;
                    if (i3 > i2) {
                        m32104l(this.f63187e.length * 2);
                        break;
                    }
                    m32103k = m32103k == 0 ? this.f63187e.length - 1 : m32103k - 1;
                }
            }
        }
    }

    /* renamed from: b */
    public final V[] m32096b() {
        V[] vArr = this.f63185c;
        if (vArr != null) {
            return vArr;
        }
        V[] vArr2 = (V[]) ListBuilderKt.m32091a(this.f63184b.length);
        this.f63185c = vArr2;
        return vArr2;
    }

    /* renamed from: c */
    public final void m32097c() {
        if (this.f63195m) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public void clear() {
        m32097c();
        IntIterator it = new IntRange(0, this.f63189g - 1).iterator();
        while (((IntProgressionIterator) it).f63385d) {
            int mo1135a = it.mo1135a();
            int[] iArr = this.f63186d;
            int i2 = iArr[mo1135a];
            if (i2 >= 0) {
                this.f63187e[i2] = 0;
                iArr[mo1135a] = -1;
            }
        }
        ListBuilderKt.m32094d(this.f63184b, 0, this.f63189g);
        V[] vArr = this.f63185c;
        if (vArr != null) {
            ListBuilderKt.m32094d(vArr, 0, this.f63189g);
        }
        this.f63191i = 0;
        this.f63189g = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return m32101i(obj) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return m32102j(obj) >= 0;
    }

    /* renamed from: d */
    public final boolean m32098d(@NotNull Collection<?> m2) {
        Intrinsics.m32179h(m2, "m");
        for (Object obj : m2) {
            if (obj != null) {
                try {
                    if (!m32099f((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        MapBuilderEntries<K, V> mapBuilderEntries = this.f63194l;
        if (mapBuilderEntries != null) {
            return mapBuilderEntries;
        }
        MapBuilderEntries<K, V> mapBuilderEntries2 = new MapBuilderEntries<>(this);
        this.f63194l = mapBuilderEntries2;
        return mapBuilderEntries2;
    }

    @Override // java.util.Map
    public boolean equals(@Nullable Object obj) {
        if (obj != this) {
            if (!(obj instanceof Map)) {
                return false;
            }
            Map map = (Map) obj;
            if (!(this.f63191i == map.size() && m32098d(map.entrySet()))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final boolean m32099f(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        int m32101i = m32101i(entry.getKey());
        if (m32101i < 0) {
            return false;
        }
        V[] vArr = this.f63185c;
        Intrinsics.m32176e(vArr);
        return Intrinsics.m32174c(vArr[m32101i], entry.getValue());
    }

    /* renamed from: g */
    public final void m32100g(int i2) {
        int i3 = this.f63189g;
        int i4 = i2 + i3;
        if (i4 < 0) {
            throw new OutOfMemoryError();
        }
        K[] kArr = this.f63184b;
        if (i4 <= kArr.length) {
            if ((i3 + i4) - this.f63191i > kArr.length) {
                m32104l(this.f63187e.length);
                return;
            }
            return;
        }
        int length = (kArr.length * 3) / 2;
        if (i4 <= length) {
            i4 = length;
        }
        this.f63184b = (K[]) ListBuilderKt.m32092b(kArr, i4);
        V[] vArr = this.f63185c;
        this.f63185c = vArr != null ? (V[]) ListBuilderKt.m32092b(vArr, i4) : null;
        int[] copyOf = Arrays.copyOf(this.f63186d, i4);
        Intrinsics.m32178g(copyOf, "copyOf(this, newSize)");
        this.f63186d = copyOf;
        if (i4 < 1) {
            i4 = 1;
        }
        int highestOneBit = Integer.highestOneBit(i4 * 3);
        if (highestOneBit > this.f63187e.length) {
            m32104l(highestOneBit);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    @Nullable
    public V get(Object obj) {
        int m32101i = m32101i(obj);
        if (m32101i < 0) {
            return null;
        }
        V[] vArr = this.f63185c;
        Intrinsics.m32176e(vArr);
        return vArr[m32101i];
    }

    @Override // java.util.Map
    public int hashCode() {
        EntriesItr entriesItr = new EntriesItr(this);
        int i2 = 0;
        while (entriesItr.hasNext()) {
            int i3 = entriesItr.f63199c;
            MapBuilder<K, V> mapBuilder = entriesItr.f63198b;
            if (i3 >= mapBuilder.f63189g) {
                throw new NoSuchElementException();
            }
            entriesItr.f63199c = i3 + 1;
            entriesItr.f63200d = i3;
            K k2 = mapBuilder.f63184b[i3];
            int hashCode = k2 != null ? k2.hashCode() : 0;
            V[] vArr = entriesItr.f63198b.f63185c;
            Intrinsics.m32176e(vArr);
            V v = vArr[entriesItr.f63200d];
            int hashCode2 = v != null ? v.hashCode() : 0;
            entriesItr.m32107a();
            i2 += hashCode ^ hashCode2;
        }
        return i2;
    }

    /* renamed from: i */
    public final int m32101i(K k2) {
        int m32103k = m32103k(k2);
        int i2 = this.f63188f;
        while (true) {
            int i3 = this.f63187e[m32103k];
            if (i3 == 0) {
                return -1;
            }
            if (i3 > 0) {
                int i4 = i3 - 1;
                if (Intrinsics.m32174c(this.f63184b[i4], k2)) {
                    return i4;
                }
            }
            i2--;
            if (i2 < 0) {
                return -1;
            }
            m32103k = m32103k == 0 ? this.f63187e.length - 1 : m32103k - 1;
        }
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f63191i == 0;
    }

    /* renamed from: j */
    public final int m32102j(V v) {
        int i2 = this.f63189g;
        while (true) {
            i2--;
            if (i2 < 0) {
                return -1;
            }
            if (this.f63186d[i2] >= 0) {
                V[] vArr = this.f63185c;
                Intrinsics.m32176e(vArr);
                if (Intrinsics.m32174c(vArr[i2], v)) {
                    return i2;
                }
            }
        }
    }

    /* renamed from: k */
    public final int m32103k(K k2) {
        return ((k2 != null ? k2.hashCode() : 0) * (-1640531527)) >>> this.f63190h;
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        MapBuilderKeys<K> mapBuilderKeys = this.f63192j;
        if (mapBuilderKeys != null) {
            return mapBuilderKeys;
        }
        MapBuilderKeys<K> mapBuilderKeys2 = new MapBuilderKeys<>(this);
        this.f63192j = mapBuilderKeys2;
        return mapBuilderKeys2;
    }

    /* renamed from: l */
    public final void m32104l(int i2) {
        boolean z;
        int i3;
        if (this.f63189g > this.f63191i) {
            V[] vArr = this.f63185c;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                i3 = this.f63189g;
                if (i4 >= i3) {
                    break;
                }
                if (this.f63186d[i4] >= 0) {
                    K[] kArr = this.f63184b;
                    kArr[i5] = kArr[i4];
                    if (vArr != null) {
                        vArr[i5] = vArr[i4];
                    }
                    i5++;
                }
                i4++;
            }
            ListBuilderKt.m32094d(this.f63184b, i5, i3);
            if (vArr != null) {
                ListBuilderKt.m32094d(vArr, i5, this.f63189g);
            }
            this.f63189g = i5;
        }
        int[] iArr = this.f63187e;
        if (i2 != iArr.length) {
            this.f63187e = new int[i2];
            this.f63190h = Integer.numberOfLeadingZeros(i2) + 1;
        } else {
            Arrays.fill(iArr, 0, iArr.length, 0);
        }
        int i6 = 0;
        while (i6 < this.f63189g) {
            int i7 = i6 + 1;
            int m32103k = m32103k(this.f63184b[i6]);
            int i8 = this.f63188f;
            while (true) {
                int[] iArr2 = this.f63187e;
                if (iArr2[m32103k] == 0) {
                    iArr2[m32103k] = i7;
                    this.f63186d[i6] = m32103k;
                    z = true;
                    break;
                } else {
                    i8--;
                    if (i8 < 0) {
                        z = false;
                        break;
                    }
                    m32103k = m32103k == 0 ? iArr2.length - 1 : m32103k - 1;
                }
            }
            if (!z) {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
            i6 = i7;
        }
    }

    /* renamed from: m */
    public final int m32105m(K k2) {
        m32097c();
        int m32101i = m32101i(k2);
        if (m32101i < 0) {
            return -1;
        }
        m32106n(m32101i);
        return m32101i;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[LOOP:0: B:5:0x0019->B:22:?, LOOP_END, SYNTHETIC] */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m32106n(int r12) {
        /*
            r11 = this;
            K[] r0 = r11.f63184b
            kotlin.collections.builders.ListBuilderKt.m32093c(r0, r12)
            int[] r0 = r11.f63186d
            r0 = r0[r12]
            int r1 = r11.f63188f
            int r1 = r1 * 2
            int[] r2 = r11.f63187e
            int r2 = r2.length
            int r2 = r2 / 2
            if (r1 <= r2) goto L15
            r1 = r2
        L15:
            r2 = 0
            r3 = r1
            r4 = 0
            r1 = r0
        L19:
            int r5 = r0 + (-1)
            r6 = -1
            if (r0 != 0) goto L23
            int[] r0 = r11.f63187e
            int r0 = r0.length
            int r0 = r0 + r6
            goto L24
        L23:
            r0 = r5
        L24:
            int r4 = r4 + 1
            int r5 = r11.f63188f
            if (r4 <= r5) goto L2f
            int[] r0 = r11.f63187e
            r0[r1] = r2
            goto L5e
        L2f:
            int[] r5 = r11.f63187e
            r7 = r5[r0]
            if (r7 != 0) goto L38
            r5[r1] = r2
            goto L5e
        L38:
            if (r7 >= 0) goto L3d
            r5[r1] = r6
            goto L55
        L3d:
            K[] r5 = r11.f63184b
            int r8 = r7 + (-1)
            r5 = r5[r8]
            int r5 = r11.m32103k(r5)
            int r5 = r5 - r0
            int[] r9 = r11.f63187e
            int r10 = r9.length
            int r10 = r10 + r6
            r5 = r5 & r10
            if (r5 < r4) goto L57
            r9[r1] = r7
            int[] r4 = r11.f63186d
            r4[r8] = r1
        L55:
            r1 = r0
            r4 = 0
        L57:
            int r3 = r3 + r6
            if (r3 >= 0) goto L19
            int[] r0 = r11.f63187e
            r0[r1] = r6
        L5e:
            int[] r0 = r11.f63186d
            r0[r12] = r6
            int r12 = r11.f63191i
            int r12 = r12 + r6
            r11.f63191i = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.builders.MapBuilder.m32106n(int):void");
    }

    @Override // java.util.Map
    @Nullable
    public V put(K k2, V v) {
        m32097c();
        int m32095a = m32095a(k2);
        V[] m32096b = m32096b();
        if (m32095a >= 0) {
            m32096b[m32095a] = v;
            return null;
        }
        int i2 = (-m32095a) - 1;
        V v2 = m32096b[i2];
        m32096b[i2] = v;
        return v2;
    }

    @Override // java.util.Map
    public void putAll(@NotNull Map<? extends K, ? extends V> from) {
        Intrinsics.m32179h(from, "from");
        m32097c();
        Set<Map.Entry<? extends K, ? extends V>> entrySet = from.entrySet();
        if (entrySet.isEmpty()) {
            return;
        }
        m32100g(entrySet.size());
        for (Map.Entry<? extends K, ? extends V> entry : entrySet) {
            int m32095a = m32095a(entry.getKey());
            V[] m32096b = m32096b();
            if (m32095a >= 0) {
                m32096b[m32095a] = entry.getValue();
            } else {
                int i2 = (-m32095a) - 1;
                if (!Intrinsics.m32174c(entry.getValue(), m32096b[i2])) {
                    m32096b[i2] = entry.getValue();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    @Nullable
    public V remove(Object obj) {
        int m32105m = m32105m(obj);
        if (m32105m < 0) {
            return null;
        }
        V[] vArr = this.f63185c;
        Intrinsics.m32176e(vArr);
        V v = vArr[m32105m];
        ListBuilderKt.m32093c(vArr, m32105m);
        return v;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f63191i;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder((this.f63191i * 3) + 2);
        sb.append("{");
        int i2 = 0;
        EntriesItr entriesItr = new EntriesItr(this);
        while (entriesItr.hasNext()) {
            if (i2 > 0) {
                sb.append(", ");
            }
            int i3 = entriesItr.f63199c;
            MapBuilder<K, V> mapBuilder = entriesItr.f63198b;
            if (i3 >= mapBuilder.f63189g) {
                throw new NoSuchElementException();
            }
            entriesItr.f63199c = i3 + 1;
            entriesItr.f63200d = i3;
            K k2 = mapBuilder.f63184b[i3];
            if (Intrinsics.m32174c(k2, mapBuilder)) {
                sb.append("(this Map)");
            } else {
                sb.append(k2);
            }
            sb.append('=');
            V[] vArr = entriesItr.f63198b.f63185c;
            Intrinsics.m32176e(vArr);
            V v = vArr[entriesItr.f63200d];
            if (Intrinsics.m32174c(v, entriesItr.f63198b)) {
                sb.append("(this Map)");
            } else {
                sb.append(v);
            }
            entriesItr.m32107a();
            i2++;
        }
        sb.append("}");
        String sb2 = sb.toString();
        Intrinsics.m32178g(sb2, "sb.toString()");
        return sb2;
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        MapBuilderValues<V> mapBuilderValues = this.f63193k;
        if (mapBuilderValues != null) {
            return mapBuilderValues;
        }
        MapBuilderValues<V> mapBuilderValues2 = new MapBuilderValues<>(this);
        this.f63193k = mapBuilderValues2;
        return mapBuilderValues2;
    }

    public MapBuilder(int i2) {
        K[] kArr = (K[]) ListBuilderKt.m32091a(i2);
        int[] iArr = new int[i2];
        int highestOneBit = Integer.highestOneBit((i2 < 1 ? 1 : i2) * 3);
        this.f63184b = kArr;
        this.f63185c = null;
        this.f63186d = iArr;
        this.f63187e = new int[highestOneBit];
        this.f63188f = 2;
        this.f63189g = 0;
        this.f63190h = Integer.numberOfLeadingZeros(highestOneBit) + 1;
    }
}
