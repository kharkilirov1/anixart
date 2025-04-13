package androidx.collection;

import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public class SparseArrayCompat<E> implements Cloneable {

    /* renamed from: e */
    public static final Object f1851e = new Object();

    /* renamed from: b */
    public int[] f1852b;

    /* renamed from: c */
    public Object[] f1853c;

    /* renamed from: d */
    public int f1854d;

    public SparseArrayCompat() {
        int m1087e = ContainerHelpers.m1087e(10);
        this.f1852b = new int[m1087e];
        this.f1853c = new Object[m1087e];
    }

    /* renamed from: a */
    public void m1127a(int i2, E e2) {
        int i3 = this.f1854d;
        if (i3 != 0 && i2 <= this.f1852b[i3 - 1]) {
            m1132f(i2, e2);
            return;
        }
        if (i3 >= this.f1852b.length) {
            int m1087e = ContainerHelpers.m1087e(i3 + 1);
            int[] iArr = new int[m1087e];
            Object[] objArr = new Object[m1087e];
            int[] iArr2 = this.f1852b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f1853c;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f1852b = iArr;
            this.f1853c = objArr;
        }
        this.f1852b[i3] = i2;
        this.f1853c[i3] = e2;
        this.f1854d = i3 + 1;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public SparseArrayCompat<E> clone() {
        try {
            SparseArrayCompat<E> sparseArrayCompat = (SparseArrayCompat) super.clone();
            sparseArrayCompat.f1852b = (int[]) this.f1852b.clone();
            sparseArrayCompat.f1853c = (Object[]) this.f1853c.clone();
            return sparseArrayCompat;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    @Nullable
    /* renamed from: c */
    public E m1129c(int i2) {
        return m1130d(i2, null);
    }

    /* renamed from: d */
    public E m1130d(int i2, E e2) {
        int m1083a = ContainerHelpers.m1083a(this.f1852b, this.f1854d, i2);
        if (m1083a >= 0) {
            Object[] objArr = this.f1853c;
            if (objArr[m1083a] != f1851e) {
                return (E) objArr[m1083a];
            }
        }
        return e2;
    }

    /* renamed from: e */
    public int m1131e(int i2) {
        return this.f1852b[i2];
    }

    /* renamed from: f */
    public void m1132f(int i2, E e2) {
        int m1083a = ContainerHelpers.m1083a(this.f1852b, this.f1854d, i2);
        if (m1083a >= 0) {
            this.f1853c[m1083a] = e2;
            return;
        }
        int i3 = ~m1083a;
        int i4 = this.f1854d;
        if (i3 < i4) {
            Object[] objArr = this.f1853c;
            if (objArr[i3] == f1851e) {
                this.f1852b[i3] = i2;
                objArr[i3] = e2;
                return;
            }
        }
        if (i4 >= this.f1852b.length) {
            int m1087e = ContainerHelpers.m1087e(i4 + 1);
            int[] iArr = new int[m1087e];
            Object[] objArr2 = new Object[m1087e];
            int[] iArr2 = this.f1852b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f1853c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f1852b = iArr;
            this.f1853c = objArr2;
        }
        int i5 = this.f1854d - i3;
        if (i5 != 0) {
            int[] iArr3 = this.f1852b;
            int i6 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i6, i5);
            Object[] objArr4 = this.f1853c;
            System.arraycopy(objArr4, i3, objArr4, i6, this.f1854d - i3);
        }
        this.f1852b[i3] = i2;
        this.f1853c[i3] = e2;
        this.f1854d++;
    }

    /* renamed from: g */
    public int m1133g() {
        return this.f1854d;
    }

    /* renamed from: h */
    public E m1134h(int i2) {
        return (E) this.f1853c[i2];
    }

    public String toString() {
        if (m1133g() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1854d * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f1854d; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(m1131e(i2));
            sb.append('=');
            E m1134h = m1134h(i2);
            if (m1134h != this) {
                sb.append(m1134h);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
