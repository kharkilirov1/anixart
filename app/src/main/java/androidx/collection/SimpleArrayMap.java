package androidx.collection;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* loaded from: classes.dex */
public class SimpleArrayMap<K, V> {

    /* renamed from: e */
    @Nullable
    public static Object[] f1844e;

    /* renamed from: f */
    public static int f1845f;

    /* renamed from: g */
    @Nullable
    public static Object[] f1846g;

    /* renamed from: h */
    public static int f1847h;

    /* renamed from: b */
    public int[] f1848b;

    /* renamed from: c */
    public Object[] f1849c;

    /* renamed from: d */
    public int f1850d;

    public SimpleArrayMap() {
        this.f1848b = ContainerHelpers.f1811a;
        this.f1849c = ContainerHelpers.f1813c;
        this.f1850d = 0;
    }

    /* renamed from: a */
    private void m1115a(int i2) {
        if (i2 == 8) {
            synchronized (SimpleArrayMap.class) {
                Object[] objArr = f1846g;
                if (objArr != null) {
                    this.f1849c = objArr;
                    f1846g = (Object[]) objArr[0];
                    this.f1848b = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f1847h--;
                    return;
                }
            }
        } else if (i2 == 4) {
            synchronized (SimpleArrayMap.class) {
                Object[] objArr2 = f1844e;
                if (objArr2 != null) {
                    this.f1849c = objArr2;
                    f1844e = (Object[]) objArr2[0];
                    this.f1848b = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f1845f--;
                    return;
                }
            }
        }
        this.f1848b = new int[i2];
        this.f1849c = new Object[i2 << 1];
    }

    /* renamed from: c */
    public static void m1116c(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (SimpleArrayMap.class) {
                if (f1847h < 10) {
                    objArr[0] = f1846g;
                    objArr[1] = iArr;
                    for (int i3 = (i2 << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f1846g = objArr;
                    f1847h++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (SimpleArrayMap.class) {
                if (f1845f < 10) {
                    objArr[0] = f1844e;
                    objArr[1] = iArr;
                    for (int i4 = (i2 << 1) - 1; i4 >= 2; i4--) {
                        objArr[i4] = null;
                    }
                    f1844e = objArr;
                    f1845f++;
                }
            }
        }
    }

    /* renamed from: b */
    public void m1117b(int i2) {
        int i3 = this.f1850d;
        int[] iArr = this.f1848b;
        if (iArr.length < i2) {
            Object[] objArr = this.f1849c;
            m1115a(i2);
            if (this.f1850d > 0) {
                System.arraycopy(iArr, 0, this.f1848b, 0, i3);
                System.arraycopy(objArr, 0, this.f1849c, 0, i3 << 1);
            }
            m1116c(iArr, objArr, i3);
        }
        if (this.f1850d != i3) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i2 = this.f1850d;
        if (i2 > 0) {
            int[] iArr = this.f1848b;
            Object[] objArr = this.f1849c;
            this.f1848b = ContainerHelpers.f1811a;
            this.f1849c = ContainerHelpers.f1813c;
            this.f1850d = 0;
            m1116c(iArr, objArr, i2);
        }
        if (this.f1850d > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(@Nullable Object obj) {
        return m1119f(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return m1121h(obj) >= 0;
    }

    /* renamed from: d */
    public int m1118d(Object obj, int i2) {
        int i3 = this.f1850d;
        if (i3 == 0) {
            return -1;
        }
        try {
            int m1083a = ContainerHelpers.m1083a(this.f1848b, i3, i2);
            if (m1083a < 0 || obj.equals(this.f1849c[m1083a << 1])) {
                return m1083a;
            }
            int i4 = m1083a + 1;
            while (i4 < i3 && this.f1848b[i4] == i2) {
                if (obj.equals(this.f1849c[i4 << 1])) {
                    return i4;
                }
                i4++;
            }
            for (int i5 = m1083a - 1; i5 >= 0 && this.f1848b[i5] == i2; i5--) {
                if (obj.equals(this.f1849c[i5 << 1])) {
                    return i5;
                }
            }
            return ~i4;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SimpleArrayMap) {
            SimpleArrayMap simpleArrayMap = (SimpleArrayMap) obj;
            if (size() != simpleArrayMap.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f1850d; i2++) {
                try {
                    K m1122i = m1122i(i2);
                    V m1126m = m1126m(i2);
                    Object obj2 = simpleArrayMap.get(m1122i);
                    if (m1126m == null) {
                        if (obj2 != null || !simpleArrayMap.containsKey(m1122i)) {
                            return false;
                        }
                    } else if (!m1126m.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i3 = 0; i3 < this.f1850d; i3++) {
                try {
                    K m1122i2 = m1122i(i3);
                    V m1126m2 = m1126m(i3);
                    Object obj3 = map.get(m1122i2);
                    if (m1126m2 == null) {
                        if (obj3 != null || !map.containsKey(m1122i2)) {
                            return false;
                        }
                    } else if (!m1126m2.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public int m1119f(@Nullable Object obj) {
        return obj == null ? m1120g() : m1118d(obj, obj.hashCode());
    }

    /* renamed from: g */
    public int m1120g() {
        int i2 = this.f1850d;
        if (i2 == 0) {
            return -1;
        }
        try {
            int m1083a = ContainerHelpers.m1083a(this.f1848b, i2, 0);
            if (m1083a < 0 || this.f1849c[m1083a << 1] == null) {
                return m1083a;
            }
            int i3 = m1083a + 1;
            while (i3 < i2 && this.f1848b[i3] == 0) {
                if (this.f1849c[i3 << 1] == null) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = m1083a - 1; i4 >= 0 && this.f1848b[i4] == 0; i4--) {
                if (this.f1849c[i4 << 1] == null) {
                    return i4;
                }
            }
            return ~i3;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    @Nullable
    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v) {
        int m1119f = m1119f(obj);
        return m1119f >= 0 ? (V) this.f1849c[(m1119f << 1) + 1] : v;
    }

    /* renamed from: h */
    int m1121h(Object obj) {
        int i2 = this.f1850d * 2;
        Object[] objArr = this.f1849c;
        if (obj == null) {
            for (int i3 = 1; i3 < i2; i3 += 2) {
                if (objArr[i3] == null) {
                    return i3 >> 1;
                }
            }
            return -1;
        }
        for (int i4 = 1; i4 < i2; i4 += 2) {
            if (obj.equals(objArr[i4])) {
                return i4 >> 1;
            }
        }
        return -1;
    }

    public int hashCode() {
        int[] iArr = this.f1848b;
        Object[] objArr = this.f1849c;
        int i2 = this.f1850d;
        int i3 = 1;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            Object obj = objArr[i3];
            i5 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i4];
            i4++;
            i3 += 2;
        }
        return i5;
    }

    /* renamed from: i */
    public K m1122i(int i2) {
        return (K) this.f1849c[i2 << 1];
    }

    public boolean isEmpty() {
        return this.f1850d <= 0;
    }

    /* renamed from: j */
    public void mo1123j(@NonNull SimpleArrayMap<? extends K, ? extends V> simpleArrayMap) {
        int i2 = simpleArrayMap.f1850d;
        m1117b(this.f1850d + i2);
        if (this.f1850d != 0) {
            for (int i3 = 0; i3 < i2; i3++) {
                put(simpleArrayMap.m1122i(i3), simpleArrayMap.m1126m(i3));
            }
        } else if (i2 > 0) {
            System.arraycopy(simpleArrayMap.f1848b, 0, this.f1848b, 0, i2);
            System.arraycopy(simpleArrayMap.f1849c, 0, this.f1849c, 0, i2 << 1);
            this.f1850d = i2;
        }
    }

    /* renamed from: k */
    public V mo1124k(int i2) {
        Object[] objArr = this.f1849c;
        int i3 = i2 << 1;
        V v = (V) objArr[i3 + 1];
        int i4 = this.f1850d;
        int i5 = 0;
        if (i4 <= 1) {
            m1116c(this.f1848b, objArr, i4);
            this.f1848b = ContainerHelpers.f1811a;
            this.f1849c = ContainerHelpers.f1813c;
        } else {
            int i6 = i4 - 1;
            int[] iArr = this.f1848b;
            if (iArr.length <= 8 || i4 >= iArr.length / 3) {
                if (i2 < i6) {
                    int i7 = i2 + 1;
                    int i8 = i6 - i2;
                    System.arraycopy(iArr, i7, iArr, i2, i8);
                    Object[] objArr2 = this.f1849c;
                    System.arraycopy(objArr2, i7 << 1, objArr2, i3, i8 << 1);
                }
                Object[] objArr3 = this.f1849c;
                int i9 = i6 << 1;
                objArr3[i9] = null;
                objArr3[i9 + 1] = null;
            } else {
                m1115a(i4 > 8 ? i4 + (i4 >> 1) : 8);
                if (i4 != this.f1850d) {
                    throw new ConcurrentModificationException();
                }
                if (i2 > 0) {
                    System.arraycopy(iArr, 0, this.f1848b, 0, i2);
                    System.arraycopy(objArr, 0, this.f1849c, 0, i3);
                }
                if (i2 < i6) {
                    int i10 = i2 + 1;
                    int i11 = i6 - i2;
                    System.arraycopy(iArr, i10, this.f1848b, i2, i11);
                    System.arraycopy(objArr, i10 << 1, this.f1849c, i3, i11 << 1);
                }
            }
            i5 = i6;
        }
        if (i4 != this.f1850d) {
            throw new ConcurrentModificationException();
        }
        this.f1850d = i5;
        return v;
    }

    /* renamed from: l */
    public V mo1125l(int i2, V v) {
        int i3 = (i2 << 1) + 1;
        Object[] objArr = this.f1849c;
        V v2 = (V) objArr[i3];
        objArr[i3] = v;
        return v2;
    }

    /* renamed from: m */
    public V m1126m(int i2) {
        return (V) this.f1849c[(i2 << 1) + 1];
    }

    @Nullable
    public V put(K k2, V v) {
        int i2;
        int m1118d;
        int i3 = this.f1850d;
        if (k2 == null) {
            m1118d = m1120g();
            i2 = 0;
        } else {
            int hashCode = k2.hashCode();
            i2 = hashCode;
            m1118d = m1118d(k2, hashCode);
        }
        if (m1118d >= 0) {
            int i4 = (m1118d << 1) + 1;
            Object[] objArr = this.f1849c;
            V v2 = (V) objArr[i4];
            objArr[i4] = v;
            return v2;
        }
        int i5 = ~m1118d;
        int[] iArr = this.f1848b;
        if (i3 >= iArr.length) {
            int i6 = 4;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i6 = 8;
            }
            Object[] objArr2 = this.f1849c;
            m1115a(i6);
            if (i3 != this.f1850d) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f1848b;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f1849c, 0, objArr2.length);
            }
            m1116c(iArr, objArr2, i3);
        }
        if (i5 < i3) {
            int[] iArr3 = this.f1848b;
            int i7 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
            Object[] objArr3 = this.f1849c;
            System.arraycopy(objArr3, i5 << 1, objArr3, i7 << 1, (this.f1850d - i5) << 1);
        }
        int i8 = this.f1850d;
        if (i3 == i8) {
            int[] iArr4 = this.f1848b;
            if (i5 < iArr4.length) {
                iArr4[i5] = i2;
                Object[] objArr4 = this.f1849c;
                int i9 = i5 << 1;
                objArr4[i9] = k2;
                objArr4[i9 + 1] = v;
                this.f1850d = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Nullable
    public V putIfAbsent(K k2, V v) {
        V v2 = get(k2);
        return v2 == null ? put(k2, v) : v2;
    }

    @Nullable
    public V remove(Object obj) {
        int m1119f = m1119f(obj);
        if (m1119f >= 0) {
            return mo1124k(m1119f);
        }
        return null;
    }

    @Nullable
    public V replace(K k2, V v) {
        int m1119f = m1119f(k2);
        if (m1119f >= 0) {
            return mo1125l(m1119f, v);
        }
        return null;
    }

    public int size() {
        return this.f1850d;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1850d * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f1850d; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            K m1122i = m1122i(i2);
            if (m1122i != this) {
                sb.append(m1122i);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V m1126m = m1126m(i2);
            if (m1126m != this) {
                sb.append(m1126m);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public boolean remove(Object obj, Object obj2) {
        int m1119f = m1119f(obj);
        if (m1119f < 0) {
            return false;
        }
        V m1126m = m1126m(m1119f);
        if (obj2 != m1126m && (obj2 == null || !obj2.equals(m1126m))) {
            return false;
        }
        mo1124k(m1119f);
        return true;
    }

    public boolean replace(K k2, V v, V v2) {
        int m1119f = m1119f(k2);
        if (m1119f < 0) {
            return false;
        }
        V m1126m = m1126m(m1119f);
        if (m1126m != v && (v == null || !v.equals(m1126m))) {
            return false;
        }
        mo1125l(m1119f, v2);
        return true;
    }

    public SimpleArrayMap(int i2) {
        if (i2 == 0) {
            this.f1848b = ContainerHelpers.f1811a;
            this.f1849c = ContainerHelpers.f1813c;
        } else {
            m1115a(i2);
        }
        this.f1850d = 0;
    }
}
