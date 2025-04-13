package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public class UnmodifiableLazyStringList extends AbstractList<String> implements RandomAccess, LazyStringList {

    /* renamed from: b */
    public final LazyStringList f65722b;

    public UnmodifiableLazyStringList(LazyStringList lazyStringList) {
        this.f65722b = lazyStringList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    /* renamed from: O0 */
    public ByteString mo33333O0(int i2) {
        return this.f65722b.mo33333O0(i2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    /* renamed from: e1 */
    public void mo33334e1(ByteString byteString) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i2) {
        return this.f65722b.get(i2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
        return new Iterator<String>(this) { // from class: kotlin.reflect.jvm.internal.impl.protobuf.UnmodifiableLazyStringList.2

            /* renamed from: b */
            public Iterator<String> f65724b;

            {
                this.f65724b = this.f65722b.iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f65724b.hasNext();
            }

            @Override // java.util.Iterator
            public String next() {
                return this.f65724b.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(int i2) {
        return new ListIterator<String>(this, i2) { // from class: kotlin.reflect.jvm.internal.impl.protobuf.UnmodifiableLazyStringList.1

            /* renamed from: b */
            public ListIterator<String> f65723b;

            {
                this.f65723b = this.f65722b.listIterator(i2);
            }

            @Override // java.util.ListIterator
            public void add(String str) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                return this.f65723b.hasNext();
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return this.f65723b.hasPrevious();
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public Object next() {
                return this.f65723b.next();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return this.f65723b.nextIndex();
            }

            @Override // java.util.ListIterator
            public String previous() {
                return this.f65723b.previous();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return this.f65723b.previousIndex();
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

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    /* renamed from: m */
    public List<?> mo33335m() {
        return this.f65722b.mo33335m();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    /* renamed from: n */
    public LazyStringList mo33336n() {
        return this;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f65722b.size();
    }
}
