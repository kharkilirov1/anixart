package com.yandex.div.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public class ObserverList<E> implements Iterable<E> {

    /* renamed from: b */
    public final List<E> f30990b = new ArrayList();

    /* renamed from: c */
    public int f30991c;

    /* renamed from: d */
    public int f30992d;

    /* renamed from: e */
    public boolean f30993e;

    public class ObserverListIterator implements RewindableIterator<E> {

        /* renamed from: b */
        public int f30994b;

        /* renamed from: c */
        public int f30995c;

        /* renamed from: d */
        public boolean f30996d;

        public ObserverListIterator(C28121 c28121) {
            ObserverList.this.f30991c++;
            this.f30994b = ObserverList.this.f30990b.size();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i2 = this.f30995c;
            while (i2 < this.f30994b && ObserverList.m16611a(ObserverList.this, i2) == null) {
                i2++;
            }
            if (i2 < this.f30994b) {
                return true;
            }
            if (this.f30996d) {
                return false;
            }
            this.f30996d = true;
            ObserverList.m16612b(ObserverList.this);
            return false;
        }

        @Override // java.util.Iterator
        public E next() {
            while (true) {
                int i2 = this.f30995c;
                if (i2 >= this.f30994b || ObserverList.m16611a(ObserverList.this, i2) != null) {
                    break;
                }
                this.f30995c++;
            }
            int i3 = this.f30995c;
            if (i3 < this.f30994b) {
                ObserverList observerList = ObserverList.this;
                this.f30995c = i3 + 1;
                return (E) ObserverList.m16611a(observerList, i3);
            }
            if (!this.f30996d) {
                this.f30996d = true;
                ObserverList.m16612b(ObserverList.this);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public class ObserverListReversedIterator implements RewindableIterator<E> {

        /* renamed from: b */
        public int f30998b;

        /* renamed from: c */
        public boolean f30999c;

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i2 = this.f30998b;
            if (i2 >= 0) {
                ObserverList.m16611a(null, i2);
                throw null;
            }
            if (i2 >= 0) {
                return true;
            }
            if (this.f30999c) {
                return false;
            }
            this.f30999c = true;
            ObserverList.m16612b(null);
            throw null;
        }

        @Override // java.util.Iterator
        public E next() {
            int i2 = this.f30998b;
            if (i2 >= 0) {
                ObserverList.m16611a(null, i2);
                throw null;
            }
            if (i2 >= 0) {
                this.f30998b = i2 - 1;
                ObserverList.m16611a(null, i2);
                throw null;
            }
            if (this.f30999c) {
                throw new NoSuchElementException();
            }
            this.f30999c = true;
            ObserverList.m16612b(null);
            throw null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public interface RewindableIterator<E> extends Iterator<E> {
    }

    /* renamed from: a */
    public static Object m16611a(ObserverList observerList, int i2) {
        return observerList.f30990b.get(i2);
    }

    /* renamed from: b */
    public static void m16612b(ObserverList observerList) {
        int i2 = observerList.f30991c - 1;
        observerList.f30991c = i2;
        if (i2 > 0 || !observerList.f30993e) {
            return;
        }
        observerList.f30993e = false;
        int size = observerList.f30990b.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            if (observerList.f30990b.get(size) == null) {
                observerList.f30990b.remove(size);
            }
        }
    }

    /* renamed from: d */
    public boolean m16613d(E e2) {
        if (e2 == null || this.f30990b.contains(e2)) {
            return false;
        }
        this.f30990b.add(e2);
        this.f30992d++;
        return true;
    }

    /* renamed from: e */
    public boolean m16614e(E e2) {
        int indexOf;
        if (e2 == null || (indexOf = this.f30990b.indexOf(e2)) == -1) {
            return false;
        }
        if (this.f30991c == 0) {
            this.f30990b.remove(indexOf);
        } else {
            this.f30993e = true;
            this.f30990b.set(indexOf, null);
        }
        this.f30992d--;
        return true;
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        return new ObserverListIterator(null);
    }
}
