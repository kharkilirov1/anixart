package com.yandex.mobile.ads.embedded.guava.collect;

import com.yandex.mobile.ads.impl.tr0;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* renamed from: com.yandex.mobile.ads.embedded.guava.collect.g0 */
/* loaded from: classes2.dex */
final class C4681g0<K, V> extends AbstractC4700q<K, V> {

    /* renamed from: g */
    public static final AbstractC4700q<Object, Object> f47861g = new C4681g0(null, new Object[0], 0);
    private static final long serialVersionUID = 0;

    /* renamed from: d */
    @CheckForNull
    private final transient Object f47862d;

    /* renamed from: e */
    public final transient Object[] f47863e;

    /* renamed from: f */
    private final transient int f47864f;

    /* renamed from: com.yandex.mobile.ads.embedded.guava.collect.g0$a */
    public static class a<K, V> extends AbstractC4702r<Map.Entry<K, V>> {

        /* renamed from: c */
        private final transient AbstractC4700q<K, V> f47865c;

        /* renamed from: d */
        private final transient Object[] f47866d;

        /* renamed from: e */
        private final transient int f47867e = 0;

        /* renamed from: f */
        private final transient int f47868f;

        /* renamed from: com.yandex.mobile.ads.embedded.guava.collect.g0$a$a, reason: collision with other inner class name */
        public class C7013a extends AbstractC4698p<Map.Entry<K, V>> {
            public C7013a() {
            }

            @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4694n
            /* renamed from: f */
            public final boolean mo22018f() {
                return true;
            }

            @Override // java.util.List
            public final Object get(int i2) {
                tr0.m28729a(i2, a.this.f47868f);
                int i3 = i2 * 2;
                Object obj = a.this.f47866d[a.this.f47867e + i3];
                Objects.requireNonNull(obj);
                Object obj2 = a.this.f47866d[i3 + (a.this.f47867e ^ 1)];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return a.this.f47868f;
            }
        }

        public a(AbstractC4700q abstractC4700q, Object[] objArr, int i2) {
            this.f47865c = abstractC4700q;
            this.f47866d = objArr;
            this.f47868f = i2;
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4694n, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(@CheckForNull Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return value != null && value.equals(this.f47865c.get(key));
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4694n
        /* renamed from: f */
        public final boolean mo22018f() {
            return true;
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4702r, com.yandex.mobile.ads.embedded.guava.collect.AbstractC4694n, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: g */
        public final AbstractC4699p0<Map.Entry<K, V>> iterator() {
            return mo22031b().listIterator(0);
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4702r
        /* renamed from: h */
        public final AbstractC4698p<Map.Entry<K, V>> mo22030h() {
            return new C7013a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.f47868f;
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4694n
        /* renamed from: a */
        public final int mo22014a(int i2, Object[] objArr) {
            return mo22031b().mo22014a(i2, objArr);
        }
    }

    /* renamed from: com.yandex.mobile.ads.embedded.guava.collect.g0$b */
    public static final class b<K> extends AbstractC4702r<K> {

        /* renamed from: c */
        private final transient AbstractC4700q<K, ?> f47870c;

        /* renamed from: d */
        private final transient AbstractC4698p<K> f47871d;

        public b(AbstractC4700q<K, ?> abstractC4700q, AbstractC4698p<K> abstractC4698p) {
            this.f47870c = abstractC4700q;
            this.f47871d = abstractC4698p;
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4694n
        /* renamed from: a */
        public final int mo22014a(int i2, Object[] objArr) {
            return this.f47871d.mo22014a(i2, objArr);
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4702r, com.yandex.mobile.ads.embedded.guava.collect.AbstractC4694n
        /* renamed from: b */
        public final AbstractC4698p<K> mo22031b() {
            return this.f47871d;
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4694n, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(@CheckForNull Object obj) {
            return this.f47870c.get(obj) != null;
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4694n
        /* renamed from: f */
        public final boolean mo22018f() {
            return true;
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4702r, com.yandex.mobile.ads.embedded.guava.collect.AbstractC4694n, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: g */
        public final AbstractC4699p0<K> iterator() {
            return this.f47871d.listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.f47870c.size();
        }
    }

    /* renamed from: com.yandex.mobile.ads.embedded.guava.collect.g0$c */
    public static final class c extends AbstractC4698p<Object> {

        /* renamed from: d */
        private final transient Object[] f47872d;

        /* renamed from: e */
        private final transient int f47873e;

        /* renamed from: f */
        private final transient int f47874f;

        public c(Object[] objArr, int i2, int i3) {
            this.f47872d = objArr;
            this.f47873e = i2;
            this.f47874f = i3;
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4694n
        /* renamed from: f */
        public final boolean mo22018f() {
            return true;
        }

        @Override // java.util.List
        public final Object get(int i2) {
            tr0.m28729a(i2, this.f47874f);
            Object obj = this.f47872d[(i2 * 2) + this.f47873e];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.f47874f;
        }
    }

    private C4681g0(@CheckForNull Object obj, Object[] objArr, int i2) {
        this.f47862d = obj;
        this.f47863e = objArr;
        this.f47864f = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0061, code lost:
    
        r2[r7] = (byte) r4;
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a7, code lost:
    
        r2[r7] = (short) r4;
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e1, code lost:
    
        r2[r8] = r5;
        r3 = r3 + 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [int] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <K, V> com.yandex.mobile.ads.embedded.guava.collect.C4681g0<K, V> m22020a(int r11, java.lang.Object[] r12) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.embedded.guava.collect.C4681g0.m22020a(int, java.lang.Object[]):com.yandex.mobile.ads.embedded.guava.collect.g0");
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4700q
    /* renamed from: b */
    public final AbstractC4702r<Map.Entry<K, V>> mo22022b() {
        return new a(this, this.f47863e, this.f47864f);
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4700q
    /* renamed from: c */
    public final AbstractC4702r<K> mo22023c() {
        return new b(this, new c(this.f47863e, 0, this.f47864f));
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4700q
    /* renamed from: d */
    public final AbstractC4694n<V> mo22024d() {
        return new c(this.f47863e, 1, this.f47864f);
    }

    @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4700q
    /* renamed from: f */
    public final void mo22025f() {
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x009d A[RETURN] */
    @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4700q, java.util.Map
    @javax.annotation.CheckForNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V get(@javax.annotation.CheckForNull java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f47862d
            java.lang.Object[] r1 = r8.f47863e
            int r2 = r8.f47864f
            r3 = 0
            if (r9 != 0) goto Lb
            goto L8d
        Lb:
            r4 = 1
            if (r2 != r4) goto L21
            r0 = 0
            r0 = r1[r0]
            java.util.Objects.requireNonNull(r0)
            boolean r9 = r0.equals(r9)
            if (r9 == 0) goto L8d
            r9 = r1[r4]
            java.util.Objects.requireNonNull(r9)
            goto L9b
        L21:
            if (r0 != 0) goto L24
            goto L8d
        L24:
            boolean r2 = r0 instanceof byte[]
            if (r2 == 0) goto L4f
            r2 = r0
            byte[] r2 = (byte[]) r2
            int r0 = r2.length
            int r5 = r0 + (-1)
            int r0 = r9.hashCode()
            int r0 = com.yandex.mobile.ads.embedded.guava.collect.C4692m.m22038a(r0)
        L36:
            r0 = r0 & r5
            r6 = r2[r0]
            r7 = 255(0xff, float:3.57E-43)
            r6 = r6 & r7
            if (r6 != r7) goto L3f
            goto L8d
        L3f:
            r7 = r1[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L4c
            r9 = r6 ^ 1
            r9 = r1[r9]
            goto L9b
        L4c:
            int r0 = r0 + 1
            goto L36
        L4f:
            boolean r2 = r0 instanceof short[]
            if (r2 == 0) goto L7b
            r2 = r0
            short[] r2 = (short[]) r2
            int r0 = r2.length
            int r5 = r0 + (-1)
            int r0 = r9.hashCode()
            int r0 = com.yandex.mobile.ads.embedded.guava.collect.C4692m.m22038a(r0)
        L61:
            r0 = r0 & r5
            short r6 = r2[r0]
            r7 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r7
            if (r6 != r7) goto L6b
            goto L8d
        L6b:
            r7 = r1[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L78
            r9 = r6 ^ 1
            r9 = r1[r9]
            goto L9b
        L78:
            int r0 = r0 + 1
            goto L61
        L7b:
            int[] r0 = (int[]) r0
            int r2 = r0.length
            int r2 = r2 - r4
            int r5 = r9.hashCode()
            int r5 = com.yandex.mobile.ads.embedded.guava.collect.C4692m.m22038a(r5)
        L87:
            r5 = r5 & r2
            r6 = r0[r5]
            r7 = -1
            if (r6 != r7) goto L8f
        L8d:
            r9 = r3
            goto L9b
        L8f:
            r7 = r1[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L9f
            r9 = r6 ^ 1
            r9 = r1[r9]
        L9b:
            if (r9 != 0) goto L9e
            return r3
        L9e:
            return r9
        L9f:
            int r5 = r5 + 1
            goto L87
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.embedded.guava.collect.C4681g0.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f47864f;
    }

    /* renamed from: a */
    private static IllegalArgumentException m22021a(Object obj, Object obj2, Object[] objArr, int i2) {
        return new IllegalArgumentException("Multiple entries with same key: " + obj + "=" + obj2 + " and " + objArr[i2] + "=" + objArr[i2 ^ 1]);
    }
}
