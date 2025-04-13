package com.google.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public class UnmodifiableLazyStringList extends AbstractList<String> implements LazyStringList, RandomAccess {

    /* renamed from: b */
    public final LazyStringList f24383b;

    public UnmodifiableLazyStringList(LazyStringList lazyStringList) {
        this.f24383b = lazyStringList;
    }

    @Override // com.google.protobuf.LazyStringList
    /* renamed from: Q */
    public void mo13472Q(ByteString byteString) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.LazyStringList
    /* renamed from: Z0 */
    public Object mo13473Z0(int i2) {
        return this.f24383b.mo13473Z0(i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i2) {
        return this.f24383b.get(i2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
        return new Iterator<String>(this) { // from class: com.google.protobuf.UnmodifiableLazyStringList.2

            /* renamed from: b */
            public Iterator<String> f24385b;

            {
                this.f24385b = this.f24383b.iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f24385b.hasNext();
            }

            @Override // java.util.Iterator
            public String next() {
                return this.f24385b.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(int i2) {
        return new ListIterator<String>(this, i2) { // from class: com.google.protobuf.UnmodifiableLazyStringList.1

            /* renamed from: b */
            public ListIterator<String> f24384b;

            {
                this.f24384b = this.f24383b.listIterator(i2);
            }

            @Override // java.util.ListIterator
            public void add(String str) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                return this.f24384b.hasNext();
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return this.f24384b.hasPrevious();
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public Object next() {
                return this.f24384b.next();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return this.f24384b.nextIndex();
            }

            @Override // java.util.ListIterator
            public String previous() {
                return this.f24384b.previous();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return this.f24384b.previousIndex();
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.ListIterator
            public void set(String str) {
                throw new UnsupportedOperationException();
            }
        };
    }

    @Override // com.google.protobuf.LazyStringList
    /* renamed from: m */
    public List<?> mo13475m() {
        return this.f24383b.mo13475m();
    }

    @Override // com.google.protobuf.LazyStringList
    /* renamed from: n */
    public LazyStringList mo13476n() {
        return this;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f24383b.size();
    }
}
