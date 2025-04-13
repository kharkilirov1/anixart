package com.google.common.collect;

import androidx.room.util.C0576a;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import java.util.AbstractMap;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p000a.C0000a;

@GwtCompatible
/* loaded from: classes.dex */
final class RegularImmutableMap<K, V> extends ImmutableMap<K, V> {

    /* renamed from: h */
    public static final ImmutableMap<Object, Object> f21426h = new RegularImmutableMap(null, new Object[0], 0);

    /* renamed from: e */
    public final transient Object f21427e;

    /* renamed from: f */
    @VisibleForTesting
    public final transient Object[] f21428f;

    /* renamed from: g */
    public final transient int f21429g;

    public static class EntrySet<K, V> extends ImmutableSet<Map.Entry<K, V>> {

        /* renamed from: e */
        public final transient ImmutableMap<K, V> f21430e;

        /* renamed from: f */
        public final transient Object[] f21431f;

        /* renamed from: g */
        public final transient int f21432g;

        /* renamed from: h */
        public final transient int f21433h;

        public EntrySet(ImmutableMap<K, V> immutableMap, Object[] objArr, int i2, int i3) {
            this.f21430e = immutableMap;
            this.f21431f = objArr;
            this.f21432g = i2;
            this.f21433h = i3;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return value != null && value.equals(this.f21430e.get(key));
        }

        @Override // com.google.common.collect.ImmutableCollection
        /* renamed from: d */
        public int mo11618d(Object[] objArr, int i2) {
            return mo11543b().mo11618d(objArr, i2);
        }

        @Override // com.google.common.collect.ImmutableCollection
        /* renamed from: r */
        public boolean mo11425r() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
        /* renamed from: s */
        public UnmodifiableIterator<Map.Entry<K, V>> iterator() {
            return mo11543b().listIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f21433h;
        }

        @Override // com.google.common.collect.ImmutableSet
        /* renamed from: z */
        public ImmutableList<Map.Entry<K, V>> mo11658z() {
            return new ImmutableList<Map.Entry<K, V>>() { // from class: com.google.common.collect.RegularImmutableMap.EntrySet.1
                @Override // java.util.List
                public Object get(int i2) {
                    Preconditions.m11186j(i2, EntrySet.this.f21433h);
                    EntrySet entrySet = EntrySet.this;
                    Object[] objArr = entrySet.f21431f;
                    int i3 = i2 * 2;
                    int i4 = entrySet.f21432g;
                    return new AbstractMap.SimpleImmutableEntry(objArr[i3 + i4], objArr[i3 + (i4 ^ 1)]);
                }

                @Override // com.google.common.collect.ImmutableCollection
                /* renamed from: r */
                public boolean mo11425r() {
                    return true;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public int size() {
                    return EntrySet.this.f21433h;
                }
            };
        }
    }

    public static final class KeySet<K> extends ImmutableSet<K> {

        /* renamed from: e */
        public final transient ImmutableMap<K, ?> f21435e;

        /* renamed from: f */
        public final transient ImmutableList<K> f21436f;

        public KeySet(ImmutableMap<K, ?> immutableMap, ImmutableList<K> immutableList) {
            this.f21435e = immutableMap;
            this.f21436f = immutableList;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        /* renamed from: b */
        public ImmutableList<K> mo11543b() {
            return this.f21436f;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            return this.f21435e.get(obj) != null;
        }

        @Override // com.google.common.collect.ImmutableCollection
        /* renamed from: d */
        public int mo11618d(Object[] objArr, int i2) {
            return this.f21436f.mo11618d(objArr, i2);
        }

        @Override // com.google.common.collect.ImmutableCollection
        /* renamed from: r */
        public boolean mo11425r() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
        /* renamed from: s */
        public UnmodifiableIterator<K> iterator() {
            return this.f21436f.listIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f21435e.size();
        }
    }

    public static final class KeysOrValuesAsList extends ImmutableList<Object> {

        /* renamed from: d */
        public final transient Object[] f21437d;

        /* renamed from: e */
        public final transient int f21438e;

        /* renamed from: f */
        public final transient int f21439f;

        public KeysOrValuesAsList(Object[] objArr, int i2, int i3) {
            this.f21437d = objArr;
            this.f21438e = i2;
            this.f21439f = i3;
        }

        @Override // java.util.List
        public Object get(int i2) {
            Preconditions.m11186j(i2, this.f21439f);
            return this.f21437d[(i2 * 2) + this.f21438e];
        }

        @Override // com.google.common.collect.ImmutableCollection
        /* renamed from: r */
        public boolean mo11425r() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f21439f;
        }
    }

    public RegularImmutableMap(Object obj, Object[] objArr, int i2) {
        this.f21427e = obj;
        this.f21428f = objArr;
        this.f21429g = i2;
    }

    /* renamed from: o */
    public static <K, V> RegularImmutableMap<K, V> m11874o(int i2, Object[] objArr) {
        if (i2 == 0) {
            return (RegularImmutableMap) f21426h;
        }
        if (i2 == 1) {
            CollectPreconditions.m11426a(objArr[0], objArr[1]);
            return new RegularImmutableMap<>(null, objArr, 1);
        }
        Preconditions.m11189m(i2, objArr.length >> 1);
        return new RegularImmutableMap<>(m11875p(objArr, i2, ImmutableSet.m11674t(i2), 0), objArr, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
    
        r11[r5] = (byte) r1;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0079, code lost:
    
        r11[r5] = (short) r1;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b0, code lost:
    
        r11[r6] = r1;
        r2 = r2 + 1;
     */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object m11875p(java.lang.Object[] r9, int r10, int r11, int r12) {
        /*
            r0 = 1
            if (r10 != r0) goto Le
            r10 = r9[r12]
            r11 = r12 ^ 1
            r9 = r9[r11]
            com.google.common.collect.CollectPreconditions.m11426a(r10, r9)
            r9 = 0
            return r9
        Le:
            int r0 = r11 + (-1)
            r1 = 128(0x80, float:1.8E-43)
            r2 = 0
            r3 = -1
            if (r11 > r1) goto L50
            byte[] r11 = new byte[r11]
            java.util.Arrays.fill(r11, r3)
        L1b:
            if (r2 >= r10) goto L4f
            int r1 = r2 * 2
            int r1 = r1 + r12
            r3 = r9[r1]
            r4 = r1 ^ 1
            r4 = r9[r4]
            com.google.common.collect.CollectPreconditions.m11426a(r3, r4)
            int r5 = r3.hashCode()
            int r5 = com.google.common.collect.Hashing.m11606b(r5)
        L31:
            r5 = r5 & r0
            r6 = r11[r5]
            r7 = 255(0xff, float:3.57E-43)
            r6 = r6 & r7
            if (r6 != r7) goto L3f
            byte r1 = (byte) r1
            r11[r5] = r1
            int r2 = r2 + 1
            goto L1b
        L3f:
            r7 = r9[r6]
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L4a
            int r5 = r5 + 1
            goto L31
        L4a:
            java.lang.IllegalArgumentException r9 = m11876q(r3, r4, r9, r6)
            throw r9
        L4f:
            return r11
        L50:
            r1 = 32768(0x8000, float:4.5918E-41)
            if (r11 > r1) goto L90
            short[] r11 = new short[r11]
            java.util.Arrays.fill(r11, r3)
        L5a:
            if (r2 >= r10) goto L8f
            int r1 = r2 * 2
            int r1 = r1 + r12
            r3 = r9[r1]
            r4 = r1 ^ 1
            r4 = r9[r4]
            com.google.common.collect.CollectPreconditions.m11426a(r3, r4)
            int r5 = r3.hashCode()
            int r5 = com.google.common.collect.Hashing.m11606b(r5)
        L70:
            r5 = r5 & r0
            short r6 = r11[r5]
            r7 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r7
            if (r6 != r7) goto L7f
            short r1 = (short) r1
            r11[r5] = r1
            int r2 = r2 + 1
            goto L5a
        L7f:
            r7 = r9[r6]
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L8a
            int r5 = r5 + 1
            goto L70
        L8a:
            java.lang.IllegalArgumentException r9 = m11876q(r3, r4, r9, r6)
            throw r9
        L8f:
            return r11
        L90:
            int[] r11 = new int[r11]
            java.util.Arrays.fill(r11, r3)
        L95:
            if (r2 >= r10) goto Lc5
            int r1 = r2 * 2
            int r1 = r1 + r12
            r4 = r9[r1]
            r5 = r1 ^ 1
            r5 = r9[r5]
            com.google.common.collect.CollectPreconditions.m11426a(r4, r5)
            int r6 = r4.hashCode()
            int r6 = com.google.common.collect.Hashing.m11606b(r6)
        Lab:
            r6 = r6 & r0
            r7 = r11[r6]
            if (r7 != r3) goto Lb5
            r11[r6] = r1
            int r2 = r2 + 1
            goto L95
        Lb5:
            r8 = r9[r7]
            boolean r8 = r8.equals(r4)
            if (r8 != 0) goto Lc0
            int r6 = r6 + 1
            goto Lab
        Lc0:
            java.lang.IllegalArgumentException r9 = m11876q(r4, r5, r9, r7)
            throw r9
        Lc5:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.RegularImmutableMap.m11875p(java.lang.Object[], int, int, int):java.lang.Object");
    }

    /* renamed from: q */
    public static IllegalArgumentException m11876q(Object obj, Object obj2, Object[] objArr, int i2) {
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(obj2);
        String valueOf3 = String.valueOf(objArr[i2]);
        String valueOf4 = String.valueOf(objArr[i2 ^ 1]);
        return new IllegalArgumentException(C0000a.m22s(C0576a.m4122u(valueOf4.length() + valueOf3.length() + valueOf2.length() + valueOf.length() + 39, "Multiple entries with same key: ", valueOf, "=", valueOf2), " and ", valueOf3, "=", valueOf4));
    }

    /* renamed from: r */
    public static Object m11877r(@NullableDecl Object obj, @NullableDecl Object[] objArr, int i2, int i3, @NullableDecl Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i2 == 1) {
            if (objArr[i3].equals(obj2)) {
                return objArr[i3 ^ 1];
            }
            return null;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int m11606b = Hashing.m11606b(obj2.hashCode());
            while (true) {
                int i4 = m11606b & length;
                int i5 = bArr[i4] & 255;
                if (i5 == 255) {
                    return null;
                }
                if (objArr[i5].equals(obj2)) {
                    return objArr[i5 ^ 1];
                }
                m11606b = i4 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int m11606b2 = Hashing.m11606b(obj2.hashCode());
            while (true) {
                int i6 = m11606b2 & length2;
                int i7 = sArr[i6] & 65535;
                if (i7 == 65535) {
                    return null;
                }
                if (objArr[i7].equals(obj2)) {
                    return objArr[i7 ^ 1];
                }
                m11606b2 = i6 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int m11606b3 = Hashing.m11606b(obj2.hashCode());
            while (true) {
                int i8 = m11606b3 & length3;
                int i9 = iArr[i8];
                if (i9 == -1) {
                    return null;
                }
                if (objArr[i9].equals(obj2)) {
                    return objArr[i9 ^ 1];
                }
                m11606b3 = i8 + 1;
            }
        }
    }

    @Override // com.google.common.collect.ImmutableMap
    /* renamed from: c */
    public ImmutableSet<Map.Entry<K, V>> mo11652c() {
        return new EntrySet(this, this.f21428f, 0, this.f21429g);
    }

    @Override // com.google.common.collect.ImmutableMap
    /* renamed from: d */
    public ImmutableSet<K> mo11523d() {
        return new KeySet(this, new KeysOrValuesAsList(this.f21428f, 0, this.f21429g));
    }

    @Override // com.google.common.collect.ImmutableMap
    /* renamed from: f */
    public ImmutableCollection<V> mo11609f() {
        return new KeysOrValuesAsList(this.f21428f, 1, this.f21429g);
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    @NullableDecl
    public V get(@NullableDecl Object obj) {
        return (V) m11877r(this.f21427e, this.f21428f, this.f21429g, 0, obj);
    }

    @Override // com.google.common.collect.ImmutableMap
    /* renamed from: i */
    public boolean mo11520i() {
        return false;
    }

    @Override // java.util.Map
    public int size() {
        return this.f21429g;
    }
}
