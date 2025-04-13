package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.Multisets;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
/* loaded from: classes.dex */
class ObjectCountHashMap<K> {

    /* renamed from: a */
    public transient Object[] f21387a;

    /* renamed from: b */
    public transient int[] f21388b;

    /* renamed from: c */
    public transient int f21389c;

    /* renamed from: d */
    public transient int f21390d;

    /* renamed from: e */
    public transient int[] f21391e;

    /* renamed from: f */
    @VisibleForTesting
    public transient long[] f21392f;

    /* renamed from: g */
    public transient float f21393g;

    /* renamed from: h */
    public transient int f21394h;

    public class MapEntry extends Multisets.AbstractEntry<K> {

        /* renamed from: b */
        @NullableDecl
        public final K f21395b;

        /* renamed from: c */
        public int f21396c;

        public MapEntry(int i2) {
            this.f21395b = (K) ObjectCountHashMap.this.f21387a[i2];
            this.f21396c = i2;
        }

        @Override // com.google.common.collect.Multiset.Entry
        /* renamed from: b */
        public K mo11547b() {
            return this.f21395b;
        }

        /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
        
            if (com.google.common.base.Objects.m11173a(r4.f21395b, r2.f21387a[r0]) != false) goto L9;
         */
        @Override // com.google.common.collect.Multiset.Entry
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int getCount() {
            /*
                r4 = this;
                int r0 = r4.f21396c
                r1 = -1
                if (r0 == r1) goto L17
                com.google.common.collect.ObjectCountHashMap r2 = com.google.common.collect.ObjectCountHashMap.this
                int r3 = r2.f21389c
                if (r0 >= r3) goto L17
                K r3 = r4.f21395b
                java.lang.Object[] r2 = r2.f21387a
                r0 = r2[r0]
                boolean r0 = com.google.common.base.Objects.m11173a(r3, r0)
                if (r0 != 0) goto L21
            L17:
                com.google.common.collect.ObjectCountHashMap r0 = com.google.common.collect.ObjectCountHashMap.this
                K r2 = r4.f21395b
                int r0 = r0.m11840i(r2)
                r4.f21396c = r0
            L21:
                int r0 = r4.f21396c
                if (r0 != r1) goto L27
                r0 = 0
                goto L2d
            L27:
                com.google.common.collect.ObjectCountHashMap r1 = com.google.common.collect.ObjectCountHashMap.this
                int[] r1 = r1.f21388b
                r0 = r1[r0]
            L2d:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ObjectCountHashMap.MapEntry.getCount():int");
        }
    }

    public ObjectCountHashMap() {
        mo11841j(3, 1.0f);
    }

    /* renamed from: e */
    public static int m11831e(long j2) {
        return (int) (j2 >>> 32);
    }

    /* renamed from: u */
    public static long m11832u(long j2, int i2) {
        return (j2 & (-4294967296L)) | (i2 & 4294967295L);
    }

    /* renamed from: a */
    public void mo11833a() {
        this.f21390d++;
        Arrays.fill(this.f21387a, 0, this.f21389c, (Object) null);
        Arrays.fill(this.f21388b, 0, this.f21389c, 0);
        Arrays.fill(this.f21391e, -1);
        Arrays.fill(this.f21392f, -1L);
        this.f21389c = 0;
    }

    /* renamed from: b */
    public void m11834b(int i2) {
        if (i2 > this.f21392f.length) {
            mo11849r(i2);
        }
        if (i2 >= this.f21394h) {
            m11850s(Math.max(2, Integer.highestOneBit(i2 - 1) << 1));
        }
    }

    /* renamed from: c */
    public int mo11835c() {
        return this.f21389c == 0 ? -1 : 0;
    }

    /* renamed from: d */
    public int m11836d(@NullableDecl Object obj) {
        int m11840i = m11840i(obj);
        if (m11840i == -1) {
            return 0;
        }
        return this.f21388b[m11840i];
    }

    /* renamed from: f */
    public K m11837f(int i2) {
        Preconditions.m11186j(i2, this.f21389c);
        return (K) this.f21387a[i2];
    }

    /* renamed from: g */
    public int m11838g(int i2) {
        Preconditions.m11186j(i2, this.f21389c);
        return this.f21388b[i2];
    }

    /* renamed from: h */
    public final int m11839h() {
        return this.f21391e.length - 1;
    }

    /* renamed from: i */
    public int m11840i(@NullableDecl Object obj) {
        int m11607c = Hashing.m11607c(obj);
        int i2 = this.f21391e[m11839h() & m11607c];
        while (i2 != -1) {
            long j2 = this.f21392f[i2];
            if (m11831e(j2) == m11607c && Objects.m11173a(obj, this.f21387a[i2])) {
                return i2;
            }
            i2 = (int) j2;
        }
        return -1;
    }

    /* renamed from: j */
    public void mo11841j(int i2, float f2) {
        Preconditions.m11179c(i2 >= 0, "Initial capacity must be non-negative");
        Preconditions.m11179c(f2 > 0.0f, "Illegal load factor");
        int m11605a = Hashing.m11605a(i2, f2);
        int[] iArr = new int[m11605a];
        Arrays.fill(iArr, -1);
        this.f21391e = iArr;
        this.f21393g = f2;
        this.f21387a = new Object[i2];
        this.f21388b = new int[i2];
        long[] jArr = new long[i2];
        Arrays.fill(jArr, -1L);
        this.f21392f = jArr;
        this.f21394h = Math.max(1, (int) (m11605a * f2));
    }

    /* renamed from: k */
    public void mo11842k(int i2, @NullableDecl K k2, int i3, int i4) {
        this.f21392f[i2] = (i4 << 32) | 4294967295L;
        this.f21387a[i2] = k2;
        this.f21388b[i2] = i3;
    }

    /* renamed from: l */
    public void mo11843l(int i2) {
        int i3 = this.f21389c - 1;
        if (i2 >= i3) {
            this.f21387a[i2] = null;
            this.f21388b[i2] = 0;
            this.f21392f[i2] = -1;
            return;
        }
        Object[] objArr = this.f21387a;
        objArr[i2] = objArr[i3];
        int[] iArr = this.f21388b;
        iArr[i2] = iArr[i3];
        objArr[i3] = null;
        iArr[i3] = 0;
        long[] jArr = this.f21392f;
        long j2 = jArr[i3];
        jArr[i2] = j2;
        jArr[i3] = -1;
        int m11831e = m11831e(j2) & m11839h();
        int[] iArr2 = this.f21391e;
        int i4 = iArr2[m11831e];
        if (i4 == i3) {
            iArr2[m11831e] = i2;
            return;
        }
        while (true) {
            long[] jArr2 = this.f21392f;
            long j3 = jArr2[i4];
            int i5 = (int) j3;
            if (i5 == i3) {
                jArr2[i4] = m11832u(j3, i2);
                return;
            }
            i4 = i5;
        }
    }

    /* renamed from: m */
    public int mo11844m(int i2) {
        int i3 = i2 + 1;
        if (i3 < this.f21389c) {
            return i3;
        }
        return -1;
    }

    /* renamed from: n */
    public int mo11845n(int i2, int i3) {
        return i2 - 1;
    }

    @CanIgnoreReturnValue
    /* renamed from: o */
    public int m11846o(@NullableDecl K k2, int i2) {
        CollectPreconditions.m11429d(i2, "count");
        long[] jArr = this.f21392f;
        Object[] objArr = this.f21387a;
        int[] iArr = this.f21388b;
        int m11607c = Hashing.m11607c(k2);
        int m11839h = m11839h() & m11607c;
        int i3 = this.f21389c;
        int[] iArr2 = this.f21391e;
        int i4 = iArr2[m11839h];
        if (i4 == -1) {
            iArr2[m11839h] = i3;
        } else {
            while (true) {
                long j2 = jArr[i4];
                if (m11831e(j2) == m11607c && Objects.m11173a(k2, objArr[i4])) {
                    int i5 = iArr[i4];
                    iArr[i4] = i2;
                    return i5;
                }
                int i6 = (int) j2;
                if (i6 == -1) {
                    jArr[i4] = m11832u(j2, i3);
                    break;
                }
                i4 = i6;
            }
        }
        if (i3 == Integer.MAX_VALUE) {
            throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
        }
        int i7 = i3 + 1;
        int length = this.f21392f.length;
        if (i7 > length) {
            int max = Math.max(1, length >>> 1) + length;
            int i8 = max >= 0 ? max : Integer.MAX_VALUE;
            if (i8 != length) {
                mo11849r(i8);
            }
        }
        mo11842k(i3, k2, i2, m11607c);
        this.f21389c = i7;
        if (i3 >= this.f21394h) {
            m11850s(this.f21391e.length * 2);
        }
        this.f21390d++;
        return 0;
    }

    /* renamed from: p */
    public final int m11847p(@NullableDecl Object obj, int i2) {
        int m11839h = m11839h() & i2;
        int i3 = this.f21391e[m11839h];
        if (i3 == -1) {
            return 0;
        }
        int i4 = -1;
        while (true) {
            if (m11831e(this.f21392f[i3]) == i2 && Objects.m11173a(obj, this.f21387a[i3])) {
                int i5 = this.f21388b[i3];
                if (i4 == -1) {
                    this.f21391e[m11839h] = (int) this.f21392f[i3];
                } else {
                    long[] jArr = this.f21392f;
                    jArr[i4] = m11832u(jArr[i4], (int) jArr[i3]);
                }
                mo11843l(i3);
                this.f21389c--;
                this.f21390d++;
                return i5;
            }
            int i6 = (int) this.f21392f[i3];
            if (i6 == -1) {
                return 0;
            }
            i4 = i3;
            i3 = i6;
        }
    }

    @CanIgnoreReturnValue
    /* renamed from: q */
    public int m11848q(int i2) {
        return m11847p(this.f21387a[i2], m11831e(this.f21392f[i2]));
    }

    /* renamed from: r */
    public void mo11849r(int i2) {
        this.f21387a = Arrays.copyOf(this.f21387a, i2);
        this.f21388b = Arrays.copyOf(this.f21388b, i2);
        long[] jArr = this.f21392f;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i2);
        if (i2 > length) {
            Arrays.fill(copyOf, length, i2, -1L);
        }
        this.f21392f = copyOf;
    }

    /* renamed from: s */
    public final void m11850s(int i2) {
        if (this.f21391e.length >= 1073741824) {
            this.f21394h = Integer.MAX_VALUE;
            return;
        }
        int i3 = ((int) (i2 * this.f21393g)) + 1;
        int[] iArr = new int[i2];
        Arrays.fill(iArr, -1);
        long[] jArr = this.f21392f;
        int i4 = i2 - 1;
        for (int i5 = 0; i5 < this.f21389c; i5++) {
            int m11831e = m11831e(jArr[i5]);
            int i6 = m11831e & i4;
            int i7 = iArr[i6];
            iArr[i6] = i5;
            jArr[i5] = (m11831e << 32) | (i7 & 4294967295L);
        }
        this.f21394h = i3;
        this.f21391e = iArr;
    }

    /* renamed from: t */
    public void m11851t(int i2, int i3) {
        Preconditions.m11186j(i2, this.f21389c);
        this.f21388b[i2] = i3;
    }

    public ObjectCountHashMap(ObjectCountHashMap<? extends K> objectCountHashMap) {
        mo11841j(objectCountHashMap.f21389c, 1.0f);
        int mo11835c = objectCountHashMap.mo11835c();
        while (mo11835c != -1) {
            m11846o(objectCountHashMap.m11837f(mo11835c), objectCountHashMap.m11838g(mo11835c));
            mo11835c = objectCountHashMap.mo11844m(mo11835c);
        }
    }

    public ObjectCountHashMap(int i2) {
        mo11841j(i2, 1.0f);
    }

    public ObjectCountHashMap(int i2, float f2) {
        mo11841j(i2, f2);
    }
}
