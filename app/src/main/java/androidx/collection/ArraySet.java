package androidx.collection;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.MapCollections;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class ArraySet<E> implements Collection<E>, Set<E> {

    /* renamed from: f */
    public static final int[] f1799f = new int[0];

    /* renamed from: g */
    public static final Object[] f1800g = new Object[0];

    /* renamed from: h */
    @Nullable
    public static Object[] f1801h;

    /* renamed from: i */
    public static int f1802i;

    /* renamed from: j */
    @Nullable
    public static Object[] f1803j;

    /* renamed from: k */
    public static int f1804k;

    /* renamed from: b */
    public int[] f1805b;

    /* renamed from: c */
    public Object[] f1806c;

    /* renamed from: d */
    public int f1807d;

    /* renamed from: e */
    public MapCollections<E, E> f1808e;

    public ArraySet() {
        this(0);
    }

    /* renamed from: b */
    public static void m1078b(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (ArraySet.class) {
                if (f1804k < 10) {
                    objArr[0] = f1803j;
                    objArr[1] = iArr;
                    for (int i3 = i2 - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f1803j = objArr;
                    f1804k++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (ArraySet.class) {
                if (f1802i < 10) {
                    objArr[0] = f1801h;
                    objArr[1] = iArr;
                    for (int i4 = i2 - 1; i4 >= 2; i4--) {
                        objArr[i4] = null;
                    }
                    f1801h = objArr;
                    f1802i++;
                }
            }
        }
    }

    /* renamed from: a */
    public final void m1079a(int i2) {
        if (i2 == 8) {
            synchronized (ArraySet.class) {
                Object[] objArr = f1803j;
                if (objArr != null) {
                    this.f1806c = objArr;
                    f1803j = (Object[]) objArr[0];
                    this.f1805b = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f1804k--;
                    return;
                }
            }
        } else if (i2 == 4) {
            synchronized (ArraySet.class) {
                Object[] objArr2 = f1801h;
                if (objArr2 != null) {
                    this.f1806c = objArr2;
                    f1801h = (Object[]) objArr2[0];
                    this.f1805b = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f1802i--;
                    return;
                }
            }
        }
        this.f1805b = new int[i2];
        this.f1806c = new Object[i2];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(@Nullable E e2) {
        int i2;
        int m1080d;
        if (e2 == null) {
            m1080d = m1081e();
            i2 = 0;
        } else {
            int hashCode = e2.hashCode();
            i2 = hashCode;
            m1080d = m1080d(e2, hashCode);
        }
        if (m1080d >= 0) {
            return false;
        }
        int i3 = ~m1080d;
        int i4 = this.f1807d;
        int[] iArr = this.f1805b;
        if (i4 >= iArr.length) {
            int i5 = 4;
            if (i4 >= 8) {
                i5 = (i4 >> 1) + i4;
            } else if (i4 >= 4) {
                i5 = 8;
            }
            Object[] objArr = this.f1806c;
            m1079a(i5);
            int[] iArr2 = this.f1805b;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f1806c, 0, objArr.length);
            }
            m1078b(iArr, objArr, this.f1807d);
        }
        int i6 = this.f1807d;
        if (i3 < i6) {
            int[] iArr3 = this.f1805b;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr2 = this.f1806c;
            System.arraycopy(objArr2, i3, objArr2, i7, this.f1807d - i3);
        }
        this.f1805b[i3] = i2;
        this.f1806c[i3] = e2;
        this.f1807d++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(@NonNull Collection<? extends E> collection) {
        int size = collection.size() + this.f1807d;
        int[] iArr = this.f1805b;
        boolean z = false;
        if (iArr.length < size) {
            Object[] objArr = this.f1806c;
            m1079a(size);
            int i2 = this.f1807d;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.f1805b, 0, i2);
                System.arraycopy(objArr, 0, this.f1806c, 0, this.f1807d);
            }
            m1078b(iArr, objArr, this.f1807d);
        }
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            z |= add(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i2 = this.f1807d;
        if (i2 != 0) {
            m1078b(this.f1805b, this.f1806c, i2);
            this.f1805b = f1799f;
            this.f1806c = f1800g;
            this.f1807d = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(@Nullable Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(@NonNull Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public final int m1080d(Object obj, int i2) {
        int i3 = this.f1807d;
        if (i3 == 0) {
            return -1;
        }
        int m1083a = ContainerHelpers.m1083a(this.f1805b, i3, i2);
        if (m1083a < 0 || obj.equals(this.f1806c[m1083a])) {
            return m1083a;
        }
        int i4 = m1083a + 1;
        while (i4 < i3 && this.f1805b[i4] == i2) {
            if (obj.equals(this.f1806c[i4])) {
                return i4;
            }
            i4++;
        }
        for (int i5 = m1083a - 1; i5 >= 0 && this.f1805b[i5] == i2; i5--) {
            if (obj.equals(this.f1806c[i5])) {
                return i5;
            }
        }
        return ~i4;
    }

    /* renamed from: e */
    public final int m1081e() {
        int i2 = this.f1807d;
        if (i2 == 0) {
            return -1;
        }
        int m1083a = ContainerHelpers.m1083a(this.f1805b, i2, 0);
        if (m1083a < 0 || this.f1806c[m1083a] == null) {
            return m1083a;
        }
        int i3 = m1083a + 1;
        while (i3 < i2 && this.f1805b[i3] == 0) {
            if (this.f1806c[i3] == null) {
                return i3;
            }
            i3++;
        }
        for (int i4 = m1083a - 1; i4 >= 0 && this.f1805b[i4] == 0; i4--) {
            if (this.f1806c[i4] == null) {
                return i4;
            }
        }
        return ~i3;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f1807d != set.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f1807d; i2++) {
                try {
                    if (!set.contains(this.f1806c[i2])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public E m1082f(int i2) {
        Object[] objArr = this.f1806c;
        E e2 = (E) objArr[i2];
        int i3 = this.f1807d;
        if (i3 <= 1) {
            m1078b(this.f1805b, objArr, i3);
            this.f1805b = f1799f;
            this.f1806c = f1800g;
            this.f1807d = 0;
        } else {
            int[] iArr = this.f1805b;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                int i4 = i3 - 1;
                this.f1807d = i4;
                if (i2 < i4) {
                    int i5 = i2 + 1;
                    System.arraycopy(iArr, i5, iArr, i2, i4 - i2);
                    Object[] objArr2 = this.f1806c;
                    System.arraycopy(objArr2, i5, objArr2, i2, this.f1807d - i2);
                }
                this.f1806c[this.f1807d] = null;
            } else {
                m1079a(i3 > 8 ? i3 + (i3 >> 1) : 8);
                this.f1807d--;
                if (i2 > 0) {
                    System.arraycopy(iArr, 0, this.f1805b, 0, i2);
                    System.arraycopy(objArr, 0, this.f1806c, 0, i2);
                }
                int i6 = this.f1807d;
                if (i2 < i6) {
                    int i7 = i2 + 1;
                    System.arraycopy(iArr, i7, this.f1805b, i2, i6 - i2);
                    System.arraycopy(objArr, i7, this.f1806c, i2, this.f1807d - i2);
                }
            }
        }
        return e2;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f1805b;
        int i2 = this.f1807d;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += iArr[i4];
        }
        return i3;
    }

    public int indexOf(@Nullable Object obj) {
        return obj == null ? m1081e() : m1080d(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f1807d <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        if (this.f1808e == null) {
            this.f1808e = (MapCollections<E, E>) new MapCollections<Object, Object>() { // from class: androidx.collection.ArraySet.1
                @Override // androidx.collection.MapCollections
                /* renamed from: a */
                public void mo1069a() {
                    ArraySet.this.clear();
                }

                @Override // androidx.collection.MapCollections
                /* renamed from: b */
                public Object mo1070b(int i2, int i3) {
                    return ArraySet.this.f1806c[i2];
                }

                @Override // androidx.collection.MapCollections
                /* renamed from: c */
                public Map<Object, Object> mo1071c() {
                    throw new UnsupportedOperationException("not a map");
                }

                @Override // androidx.collection.MapCollections
                /* renamed from: d */
                public int mo1072d() {
                    return ArraySet.this.f1807d;
                }

                @Override // androidx.collection.MapCollections
                /* renamed from: e */
                public int mo1073e(Object obj) {
                    return ArraySet.this.indexOf(obj);
                }

                @Override // androidx.collection.MapCollections
                /* renamed from: f */
                public int mo1074f(Object obj) {
                    return ArraySet.this.indexOf(obj);
                }

                @Override // androidx.collection.MapCollections
                /* renamed from: g */
                public void mo1075g(Object obj, Object obj2) {
                    ArraySet.this.add(obj);
                }

                @Override // androidx.collection.MapCollections
                /* renamed from: h */
                public void mo1076h(int i2) {
                    ArraySet.this.m1082f(i2);
                }

                @Override // androidx.collection.MapCollections
                /* renamed from: i */
                public Object mo1077i(int i2, Object obj) {
                    throw new UnsupportedOperationException("not a map");
                }
            };
        }
        MapCollections<E, E> mapCollections = this.f1808e;
        if (mapCollections.f1830b == null) {
            mapCollections.f1830b = new MapCollections.KeySet();
        }
        return mapCollections.f1830b.iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(@Nullable Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        m1082f(indexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(@NonNull Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(@NonNull Collection<?> collection) {
        boolean z = false;
        for (int i2 = this.f1807d - 1; i2 >= 0; i2--) {
            if (!collection.contains(this.f1806c[i2])) {
                m1082f(i2);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f1807d;
    }

    @Override // java.util.Collection, java.util.Set
    @NonNull
    public Object[] toArray() {
        int i2 = this.f1807d;
        Object[] objArr = new Object[i2];
        System.arraycopy(this.f1806c, 0, objArr, 0, i2);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1807d * 14);
        sb.append('{');
        for (int i2 = 0; i2 < this.f1807d; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.f1806c[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public ArraySet(int i2) {
        if (i2 == 0) {
            this.f1805b = f1799f;
            this.f1806c = f1800g;
        } else {
            m1079a(i2);
        }
        this.f1807d = 0;
    }

    @Override // java.util.Collection, java.util.Set
    @NonNull
    public <T> T[] toArray(@NonNull T[] tArr) {
        if (tArr.length < this.f1807d) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f1807d));
        }
        System.arraycopy(this.f1806c, 0, tArr, 0, this.f1807d);
        int length = tArr.length;
        int i2 = this.f1807d;
        if (length > i2) {
            tArr[i2] = null;
        }
        return tArr;
    }
}
