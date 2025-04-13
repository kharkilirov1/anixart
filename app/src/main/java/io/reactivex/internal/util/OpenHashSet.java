package io.reactivex.internal.util;

/* loaded from: classes3.dex */
public final class OpenHashSet<T> {

    /* renamed from: a */
    public final float f62801a = 0.75f;

    /* renamed from: b */
    public int f62802b;

    /* renamed from: c */
    public int f62803c;

    /* renamed from: d */
    public int f62804d;

    /* renamed from: e */
    public T[] f62805e;

    public OpenHashSet() {
        int m31840a = Pow2.m31840a(16);
        this.f62802b = m31840a - 1;
        this.f62804d = (int) (0.75f * m31840a);
        this.f62805e = (T[]) new Object[m31840a];
    }

    /* renamed from: b */
    public static int m31837b(int i2) {
        int i3 = i2 * (-1640531527);
        return i3 ^ (i3 >>> 16);
    }

    /* renamed from: a */
    public boolean m31838a(T t) {
        T t2;
        T[] tArr = this.f62805e;
        int i2 = this.f62802b;
        int m31837b = m31837b(t.hashCode()) & i2;
        T t3 = tArr[m31837b];
        if (t3 != null) {
            if (t3.equals(t)) {
                return false;
            }
            do {
                m31837b = (m31837b + 1) & i2;
                t2 = tArr[m31837b];
                if (t2 == null) {
                }
            } while (!t2.equals(t));
            return false;
        }
        tArr[m31837b] = t;
        int i3 = this.f62803c + 1;
        this.f62803c = i3;
        if (i3 >= this.f62804d) {
            T[] tArr2 = this.f62805e;
            int length = tArr2.length;
            int i4 = length << 1;
            int i5 = i4 - 1;
            T[] tArr3 = (T[]) new Object[i4];
            while (true) {
                int i6 = i3 - 1;
                if (i3 == 0) {
                    break;
                }
                do {
                    length--;
                } while (tArr2[length] == null);
                int m31837b2 = m31837b(tArr2[length].hashCode()) & i5;
                if (tArr3[m31837b2] != null) {
                    do {
                        m31837b2 = (m31837b2 + 1) & i5;
                    } while (tArr3[m31837b2] != null);
                }
                tArr3[m31837b2] = tArr2[length];
                i3 = i6;
            }
            this.f62802b = i5;
            this.f62804d = (int) (i4 * this.f62801a);
            this.f62805e = tArr3;
        }
        return true;
    }

    /* renamed from: c */
    public boolean m31839c(int i2, T[] tArr, int i3) {
        int i4;
        T t;
        this.f62803c--;
        while (true) {
            int i5 = i2 + 1;
            while (true) {
                i4 = i5 & i3;
                t = tArr[i4];
                if (t == null) {
                    tArr[i2] = null;
                    return true;
                }
                int m31837b = m31837b(t.hashCode()) & i3;
                if (i2 > i4) {
                    if (i2 >= m31837b && m31837b > i4) {
                        break;
                    }
                    i5 = i4 + 1;
                } else if (i2 < m31837b && m31837b <= i4) {
                    i5 = i4 + 1;
                }
            }
            tArr[i2] = t;
            i2 = i4;
        }
    }
}
