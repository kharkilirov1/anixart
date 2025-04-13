package com.yandex.mobile.ads.embedded.guava.collect;

import com.yandex.mobile.ads.impl.tr0;
import com.yandex.mobile.ads.impl.ur0;
import com.yandex.mobile.ads.impl.y60;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* renamed from: com.yandex.mobile.ads.embedded.guava.collect.i */
/* loaded from: classes2.dex */
class C4684i<E> extends AbstractCollection<E> {

    /* renamed from: a */
    public final Collection<E> f47882a;

    /* renamed from: b */
    public final ur0<? super E> f47883b;

    public C4684i(Collection<E> collection, ur0<? super E> ur0Var) {
        this.f47882a = collection;
        this.f47883b = ur0Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(E e2) {
        tr0.m28732a(this.f47883b.apply(e2));
        return this.f47882a.add(e2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            tr0.m28732a(this.f47883b.apply(it.next()));
        }
        return this.f47882a.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        y60.m29865b(this.f47882a, this.f47883b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        boolean z;
        Collection<E> collection = this.f47882a;
        Objects.requireNonNull(collection);
        try {
            z = collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            z = false;
        }
        if (z) {
            return this.f47883b.apply(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return !y60.m29864a(this.f47882a, this.f47883b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        Iterator<E> it = this.f47882a.iterator();
        ur0<? super E> ur0Var = this.f47883b;
        Objects.requireNonNull(it);
        Objects.requireNonNull(ur0Var);
        return new C4703s(it, ur0Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(@CheckForNull Object obj) {
        return contains(obj) && this.f47882a.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        Iterator<E> it = this.f47882a.iterator();
        boolean z = false;
        while (it.hasNext()) {
            E next = it.next();
            if (this.f47883b.apply(next) && collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        Iterator<E> it = this.f47882a.iterator();
        boolean z = false;
        while (it.hasNext()) {
            E next = it.next();
            if (this.f47883b.apply(next) && !collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        Iterator<E> it = this.f47882a.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (this.f47883b.apply(it.next())) {
                i2++;
            }
        }
        return i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        Iterator<E> it = iterator();
        ArrayList arrayList = new ArrayList();
        C4705u.m22076a(arrayList, (Iterator) it);
        return arrayList.toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        Iterator<E> it = iterator();
        ArrayList arrayList = new ArrayList();
        C4705u.m22076a(arrayList, (Iterator) it);
        return (T[]) arrayList.toArray(tArr);
    }
}
