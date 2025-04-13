package com.google.android.gms.internal.common;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes.dex */
public abstract class zzag<E> extends zzac<E> implements List<E>, RandomAccess {

    /* renamed from: c */
    public static final zzak<Object> f16244c = new zzae(zzai.f16245f, 0);

    /* renamed from: t */
    public static <E> zzag<E> m8553t(Object[] objArr, int i2) {
        return i2 == 0 ? (zzag<E>) zzai.f16245f : new zzai(objArr, i2);
    }

    /* renamed from: u */
    public static <E> zzag<E> m8554u(Collection<? extends E> collection) {
        if (!(collection instanceof zzac)) {
            Object[] array = collection.toArray();
            int length = array.length;
            zzah.m8557a(array, length);
            return m8553t(array, length);
        }
        zzag<E> mo8547e = ((zzac) collection).mo8547e();
        if (!mo8547e.mo8549g()) {
            return mo8547e;
        }
        Object[] array2 = mo8547e.toArray();
        return m8553t(array2, array2.length);
    }

    /* renamed from: x */
    public static <E> zzag<E> m8555x() {
        return (zzag<E>) zzai.f16245f;
    }

    @Override // com.google.android.gms.internal.common.zzac
    /* renamed from: a */
    public int mo8544a(Object[] objArr, int i2) {
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            objArr[i3] = get(i3);
        }
        return size;
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i2, E e2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i2, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(@CheckForNull Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // com.google.android.gms.internal.common.zzac
    @Deprecated
    /* renamed from: e */
    public final zzag<E> mo8547e() {
        return this;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i2 = 0; i2 < size; i2++) {
                        if (zzr.m8561a(get(i2), list.get(i2))) {
                        }
                    }
                    return true;
                }
                Iterator<E> it = iterator();
                Iterator<E> it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!it2.hasNext() || !zzr.m8561a(it.next(), it2.next())) {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.common.zzac
    /* renamed from: f */
    public final zzaj<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i2 = 1;
        for (int i3 = 0; i3 < size; i3++) {
            i2 = (i2 * 31) + get(i3).hashCode();
        }
        return i2;
    }

    @Override // java.util.List
    public final int indexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (obj.equals(get(i2))) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.common.zzac, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: s */
    public zzag<E> subList(int i2, int i3) {
        zzs.m8564c(i2, i3, size());
        int i4 = i3 - i2;
        return i4 == size() ? this : i4 == 0 ? (zzag<E>) zzai.f16245f : new zzaf(this, i2, i4);
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i2, E e2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public final zzak<E> listIterator(int i2) {
        zzs.m8563b(i2, size(), "index");
        return isEmpty() ? (zzak<E>) f16244c : new zzae(this, i2);
    }
}
