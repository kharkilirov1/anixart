package io.reactivex.internal.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class VolatileSizeArrayList<T> extends AtomicInteger implements List<T>, RandomAccess {

    /* renamed from: b */
    public final ArrayList<T> f62806b = new ArrayList<>();

    @Override // java.util.List, java.util.Collection
    public boolean add(T t) {
        boolean add = this.f62806b.add(t);
        lazySet(this.f62806b.size());
        return add;
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        boolean addAll = this.f62806b.addAll(collection);
        lazySet(this.f62806b.size());
        return addAll;
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        this.f62806b.clear();
        lazySet(0);
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return this.f62806b.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return this.f62806b.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        return obj instanceof VolatileSizeArrayList ? this.f62806b.equals(((VolatileSizeArrayList) obj).f62806b) : this.f62806b.equals(obj);
    }

    @Override // java.util.List
    public T get(int i2) {
        return this.f62806b.get(i2);
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.f62806b.hashCode();
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return this.f62806b.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return get() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return this.f62806b.iterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return this.f62806b.lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<T> listIterator() {
        return this.f62806b.listIterator();
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        boolean remove = this.f62806b.remove(obj);
        lazySet(this.f62806b.size());
        return remove;
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        boolean removeAll = this.f62806b.removeAll(collection);
        lazySet(this.f62806b.size());
        return removeAll;
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        boolean retainAll = this.f62806b.retainAll(collection);
        lazySet(this.f62806b.size());
        return retainAll;
    }

    @Override // java.util.List
    public T set(int i2, T t) {
        return this.f62806b.set(i2, t);
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        return get();
    }

    @Override // java.util.List
    public List<T> subList(int i2, int i3) {
        return this.f62806b.subList(i2, i3);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return this.f62806b.toArray();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger
    public String toString() {
        return this.f62806b.toString();
    }

    @Override // java.util.List
    public ListIterator<T> listIterator(int i2) {
        return this.f62806b.listIterator(i2);
    }

    @Override // java.util.List, java.util.Collection
    public <E> E[] toArray(E[] eArr) {
        return (E[]) this.f62806b.toArray(eArr);
    }

    @Override // java.util.List
    public void add(int i2, T t) {
        this.f62806b.add(i2, t);
        lazySet(this.f62806b.size());
    }

    @Override // java.util.List
    public boolean addAll(int i2, Collection<? extends T> collection) {
        boolean addAll = this.f62806b.addAll(i2, collection);
        lazySet(this.f62806b.size());
        return addAll;
    }

    @Override // java.util.List
    public T remove(int i2) {
        T remove = this.f62806b.remove(i2);
        lazySet(this.f62806b.size());
        return remove;
    }
}
