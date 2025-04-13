package androidx.collection;

import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public class LongSparseArray<E> implements Cloneable {

    /* renamed from: f */
    public static final Object f1814f = new Object();

    /* renamed from: b */
    public boolean f1815b;

    /* renamed from: c */
    public long[] f1816c;

    /* renamed from: d */
    public Object[] f1817d;

    /* renamed from: e */
    public int f1818e;

    public LongSparseArray() {
        this(10);
    }

    /* renamed from: a */
    public void m1089a(long j2, E e2) {
        int i2 = this.f1818e;
        if (i2 != 0 && j2 <= this.f1816c[i2 - 1]) {
            m1098m(j2, e2);
            return;
        }
        if (this.f1815b && i2 >= this.f1816c.length) {
            m1093g();
        }
        int i3 = this.f1818e;
        if (i3 >= this.f1816c.length) {
            int m1088f = ContainerHelpers.m1088f(i3 + 1);
            long[] jArr = new long[m1088f];
            Object[] objArr = new Object[m1088f];
            long[] jArr2 = this.f1816c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f1817d;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f1816c = jArr;
            this.f1817d = objArr;
        }
        this.f1816c[i3] = j2;
        this.f1817d[i3] = e2;
        this.f1818e = i3 + 1;
    }

    /* renamed from: c */
    public void m1090c() {
        int i2 = this.f1818e;
        Object[] objArr = this.f1817d;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        this.f1818e = 0;
        this.f1815b = false;
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public LongSparseArray<E> clone() {
        try {
            LongSparseArray<E> longSparseArray = (LongSparseArray) super.clone();
            longSparseArray.f1816c = (long[]) this.f1816c.clone();
            longSparseArray.f1817d = (Object[]) this.f1817d.clone();
            return longSparseArray;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    /* renamed from: f */
    public boolean m1092f(long j2) {
        if (this.f1815b) {
            m1093g();
        }
        return ContainerHelpers.m1084b(this.f1816c, this.f1818e, j2) >= 0;
    }

    /* renamed from: g */
    public final void m1093g() {
        int i2 = this.f1818e;
        long[] jArr = this.f1816c;
        Object[] objArr = this.f1817d;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != f1814f) {
                if (i4 != i3) {
                    jArr[i3] = jArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        this.f1815b = false;
        this.f1818e = i3;
    }

    @Nullable
    /* renamed from: h */
    public E m1094h(long j2) {
        return m1095i(j2, null);
    }

    /* renamed from: i */
    public E m1095i(long j2, E e2) {
        int m1084b = ContainerHelpers.m1084b(this.f1816c, this.f1818e, j2);
        if (m1084b >= 0) {
            Object[] objArr = this.f1817d;
            if (objArr[m1084b] != f1814f) {
                return (E) objArr[m1084b];
            }
        }
        return e2;
    }

    /* renamed from: k */
    public int m1096k(long j2) {
        if (this.f1815b) {
            m1093g();
        }
        return ContainerHelpers.m1084b(this.f1816c, this.f1818e, j2);
    }

    /* renamed from: l */
    public long m1097l(int i2) {
        if (this.f1815b) {
            m1093g();
        }
        return this.f1816c[i2];
    }

    /* renamed from: m */
    public void m1098m(long j2, E e2) {
        int m1084b = ContainerHelpers.m1084b(this.f1816c, this.f1818e, j2);
        if (m1084b >= 0) {
            this.f1817d[m1084b] = e2;
            return;
        }
        int i2 = ~m1084b;
        int i3 = this.f1818e;
        if (i2 < i3) {
            Object[] objArr = this.f1817d;
            if (objArr[i2] == f1814f) {
                this.f1816c[i2] = j2;
                objArr[i2] = e2;
                return;
            }
        }
        if (this.f1815b && i3 >= this.f1816c.length) {
            m1093g();
            i2 = ~ContainerHelpers.m1084b(this.f1816c, this.f1818e, j2);
        }
        int i4 = this.f1818e;
        if (i4 >= this.f1816c.length) {
            int m1088f = ContainerHelpers.m1088f(i4 + 1);
            long[] jArr = new long[m1088f];
            Object[] objArr2 = new Object[m1088f];
            long[] jArr2 = this.f1816c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f1817d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f1816c = jArr;
            this.f1817d = objArr2;
        }
        int i5 = this.f1818e;
        if (i5 - i2 != 0) {
            long[] jArr3 = this.f1816c;
            int i6 = i2 + 1;
            System.arraycopy(jArr3, i2, jArr3, i6, i5 - i2);
            Object[] objArr4 = this.f1817d;
            System.arraycopy(objArr4, i2, objArr4, i6, this.f1818e - i2);
        }
        this.f1816c[i2] = j2;
        this.f1817d[i2] = e2;
        this.f1818e++;
    }

    /* renamed from: n */
    public void m1099n(long j2) {
        int m1084b = ContainerHelpers.m1084b(this.f1816c, this.f1818e, j2);
        if (m1084b >= 0) {
            Object[] objArr = this.f1817d;
            Object obj = objArr[m1084b];
            Object obj2 = f1814f;
            if (obj != obj2) {
                objArr[m1084b] = obj2;
                this.f1815b = true;
            }
        }
    }

    /* renamed from: o */
    public int m1100o() {
        if (this.f1815b) {
            m1093g();
        }
        return this.f1818e;
    }

    /* renamed from: p */
    public E m1101p(int i2) {
        if (this.f1815b) {
            m1093g();
        }
        return (E) this.f1817d[i2];
    }

    public String toString() {
        if (m1100o() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1818e * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f1818e; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(m1097l(i2));
            sb.append('=');
            E m1101p = m1101p(i2);
            if (m1101p != this) {
                sb.append(m1101p);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public LongSparseArray(int i2) {
        this.f1815b = false;
        if (i2 == 0) {
            this.f1816c = ContainerHelpers.f1812b;
            this.f1817d = ContainerHelpers.f1813c;
        } else {
            int m1088f = ContainerHelpers.m1088f(i2);
            this.f1816c = new long[m1088f];
            this.f1817d = new Object[m1088f];
        }
    }
}
