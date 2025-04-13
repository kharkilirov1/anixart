package kotlin.reflect.jvm.internal.impl.utils;

import androidx.room.util.C0576a;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* loaded from: classes3.dex */
public class SmartList<E> extends AbstractList<E> implements RandomAccess {

    /* renamed from: b */
    public int f66506b;

    /* renamed from: c */
    public Object f66507c;

    public static class EmptyIterator<T> implements Iterator<T> {

        /* renamed from: b */
        public static final EmptyIterator f66508b = new EmptyIterator();

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new IllegalStateException();
        }
    }

    public class SingletonIterator extends SingletonIteratorBase<E> {

        /* renamed from: c */
        public final int f66509c;

        public SingletonIterator() {
            super(null);
            this.f66509c = ((AbstractList) SmartList.this).modCount;
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.SmartList.SingletonIteratorBase
        /* renamed from: a */
        public void mo33784a() {
            if (((AbstractList) SmartList.this).modCount == this.f66509c) {
                return;
            }
            StringBuilder m24u = C0000a.m24u("ModCount: ");
            m24u.append(((AbstractList) SmartList.this).modCount);
            m24u.append("; expected: ");
            m24u.append(this.f66509c);
            throw new ConcurrentModificationException(m24u.toString());
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.SmartList.SingletonIteratorBase
        /* renamed from: b */
        public E mo33785b() {
            return (E) SmartList.this.f66507c;
        }

        @Override // java.util.Iterator
        public void remove() {
            mo33784a();
            SmartList.this.clear();
        }
    }

    public static abstract class SingletonIteratorBase<T> implements Iterator<T> {

        /* renamed from: b */
        public boolean f66511b;

        public SingletonIteratorBase() {
        }

        /* renamed from: a */
        public abstract void mo33784a();

        /* renamed from: b */
        public abstract T mo33785b();

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return !this.f66511b;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.f66511b) {
                throw new NoSuchElementException();
            }
            this.f66511b = true;
            mo33784a();
            return mo33785b();
        }

        public SingletonIteratorBase(C67591 c67591) {
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e2) {
        int i2 = this.f66506b;
        if (i2 == 0) {
            this.f66507c = e2;
        } else if (i2 == 1) {
            this.f66507c = new Object[]{this.f66507c, e2};
        } else {
            Object[] objArr = (Object[]) this.f66507c;
            int length = objArr.length;
            if (i2 >= length) {
                int m4105d = C0576a.m4105d(length, 3, 2, 1);
                int i3 = i2 + 1;
                if (m4105d < i3) {
                    m4105d = i3;
                }
                Object[] objArr2 = new Object[m4105d];
                this.f66507c = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
                objArr = objArr2;
            }
            objArr[this.f66506b] = e2;
        }
        this.f66506b++;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f66507c = null;
        this.f66506b = 0;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i2) {
        int i3;
        if (i2 >= 0 && i2 < (i3 = this.f66506b)) {
            return i3 == 1 ? (E) this.f66507c : (E) ((Object[]) this.f66507c)[i2];
        }
        StringBuilder m25v = C0000a.m25v("Index: ", i2, ", Size: ");
        m25v.append(this.f66506b);
        throw new IndexOutOfBoundsException(m25v.toString());
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @NotNull
    public Iterator<E> iterator() {
        int i2 = this.f66506b;
        return i2 == 0 ? EmptyIterator.f66508b : i2 == 1 ? new SingletonIterator() : super.iterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i2) {
        int i3;
        E e2;
        if (i2 < 0 || i2 >= (i3 = this.f66506b)) {
            StringBuilder m25v = C0000a.m25v("Index: ", i2, ", Size: ");
            m25v.append(this.f66506b);
            throw new IndexOutOfBoundsException(m25v.toString());
        }
        if (i3 == 1) {
            e2 = (E) this.f66507c;
            this.f66507c = null;
        } else {
            Object[] objArr = (Object[]) this.f66507c;
            Object obj = objArr[i2];
            if (i3 == 2) {
                this.f66507c = objArr[1 - i2];
            } else {
                int i4 = (i3 - i2) - 1;
                if (i4 > 0) {
                    System.arraycopy(objArr, i2 + 1, objArr, i2, i4);
                }
                objArr[this.f66506b - 1] = null;
            }
            e2 = (E) obj;
        }
        this.f66506b--;
        ((AbstractList) this).modCount++;
        return e2;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i2, E e2) {
        int i3;
        if (i2 < 0 || i2 >= (i3 = this.f66506b)) {
            StringBuilder m25v = C0000a.m25v("Index: ", i2, ", Size: ");
            m25v.append(this.f66506b);
            throw new IndexOutOfBoundsException(m25v.toString());
        }
        if (i3 == 1) {
            E e3 = (E) this.f66507c;
            this.f66507c = e2;
            return e3;
        }
        Object[] objArr = (Object[]) this.f66507c;
        E e4 = (E) objArr[i2];
        objArr[i2] = e2;
        return e4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f66506b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public <T> T[] toArray(@NotNull T[] tArr) {
        int length = tArr.length;
        int i2 = this.f66506b;
        if (i2 == 1) {
            if (length == 0) {
                T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), 1));
                tArr2[0] = this.f66507c;
                return tArr2;
            }
            tArr[0] = this.f66507c;
        } else {
            if (length < i2) {
                return (T[]) Arrays.copyOf((Object[]) this.f66507c, i2, tArr.getClass());
            }
            if (i2 != 0) {
                System.arraycopy(this.f66507c, 0, tArr, 0, i2);
            }
        }
        int i3 = this.f66506b;
        if (length > i3) {
            tArr[i3] = 0;
        }
        return tArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i2, E e2) {
        int i3;
        if (i2 >= 0 && i2 <= (i3 = this.f66506b)) {
            if (i3 == 0) {
                this.f66507c = e2;
            } else if (i3 == 1 && i2 == 0) {
                this.f66507c = new Object[]{e2, this.f66507c};
            } else {
                Object[] objArr = new Object[i3 + 1];
                if (i3 == 1) {
                    objArr[0] = this.f66507c;
                } else {
                    Object[] objArr2 = (Object[]) this.f66507c;
                    System.arraycopy(objArr2, 0, objArr, 0, i2);
                    System.arraycopy(objArr2, i2, objArr, i2 + 1, this.f66506b - i2);
                }
                objArr[i2] = e2;
                this.f66507c = objArr;
            }
            this.f66506b++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder m25v = C0000a.m25v("Index: ", i2, ", Size: ");
        m25v.append(this.f66506b);
        throw new IndexOutOfBoundsException(m25v.toString());
    }
}
