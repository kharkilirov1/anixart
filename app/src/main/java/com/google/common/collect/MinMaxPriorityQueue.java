package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.math.IntMath;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.AbstractQueue;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

@Beta
@GwtCompatible
/* loaded from: classes.dex */
public final class MinMaxPriorityQueue<E> extends AbstractQueue<E> {

    /* renamed from: b */
    public Object[] f21329b;

    /* renamed from: c */
    public int f21330c;

    /* renamed from: d */
    public int f21331d;

    @Beta
    public static final class Builder<B> {
    }

    public class Heap {
    }

    public static class MoveDesc<E> {
    }

    public class QueueIterator implements Iterator<E> {

        /* renamed from: b */
        public int f21332b = -1;

        /* renamed from: c */
        public int f21333c = -1;

        /* renamed from: d */
        public int f21334d;

        /* renamed from: e */
        public boolean f21335e;

        public QueueIterator(C17231 c17231) {
            this.f21334d = MinMaxPriorityQueue.this.f21331d;
        }

        /* renamed from: a */
        public final void m11810a() {
            if (MinMaxPriorityQueue.this.f21331d != this.f21334d) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            m11810a();
            int i2 = this.f21332b + 1;
            if (this.f21333c < i2) {
                this.f21333c = i2;
            }
            return this.f21333c < MinMaxPriorityQueue.this.f21330c;
        }

        @Override // java.util.Iterator
        public E next() {
            m11810a();
            int i2 = this.f21332b + 1;
            if (this.f21333c < i2) {
                this.f21333c = i2;
            }
            int i3 = this.f21333c;
            MinMaxPriorityQueue minMaxPriorityQueue = MinMaxPriorityQueue.this;
            if (i3 >= minMaxPriorityQueue.f21330c) {
                throw new NoSuchElementException("iterator moved past last element in queue.");
            }
            this.f21332b = i3;
            this.f21335e = true;
            return (E) minMaxPriorityQueue.f21329b[i3];
        }

        @Override // java.util.Iterator
        public void remove() {
            Preconditions.m11192p(this.f21335e, "no calls to next() since the last call to remove()");
            m11810a();
            boolean z = false;
            this.f21335e = false;
            this.f21334d++;
            int i2 = this.f21332b;
            MinMaxPriorityQueue minMaxPriorityQueue = MinMaxPriorityQueue.this;
            if (i2 < minMaxPriorityQueue.f21330c) {
                minMaxPriorityQueue.m11809b(i2);
                this.f21332b--;
                this.f21333c--;
                return;
            }
            int i3 = 0;
            while (true) {
                MinMaxPriorityQueue minMaxPriorityQueue2 = MinMaxPriorityQueue.this;
                if (i3 >= minMaxPriorityQueue2.f21330c) {
                    break;
                }
                if (minMaxPriorityQueue2.f21329b[i3] == null) {
                    minMaxPriorityQueue2.m11809b(i3);
                    z = true;
                    break;
                }
                i3++;
            }
            Preconditions.m11191o(z);
        }
    }

    /* renamed from: a */
    public final MinMaxPriorityQueue<E>.Heap m11808a(int i2) {
        Preconditions.m11192p((~(~(i2 + 1))) > 0, "negative index");
        return null;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue
    @CanIgnoreReturnValue
    public boolean add(E e2) {
        offer(e2);
        throw null;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    public boolean addAll(Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        if (!it.hasNext()) {
            return false;
        }
        offer(it.next());
        throw null;
    }

    @VisibleForTesting
    @CanIgnoreReturnValue
    /* renamed from: b */
    public MoveDesc<E> m11809b(int i2) {
        Preconditions.m11189m(i2, this.f21330c);
        this.f21331d++;
        int i3 = this.f21330c - 1;
        this.f21330c = i3;
        if (i3 == i2) {
            this.f21329b[i3] = null;
            return null;
        }
        Object obj = this.f21329b[i3];
        m11808a(i3);
        throw null;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        for (int i2 = 0; i2 < this.f21330c; i2++) {
            this.f21329b[i2] = null;
        }
        this.f21330c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return new QueueIterator(null);
    }

    @Override // java.util.Queue
    @CanIgnoreReturnValue
    public boolean offer(E e2) {
        Objects.requireNonNull(e2);
        this.f21331d++;
        int i2 = this.f21330c;
        int i3 = i2 + 1;
        this.f21330c = i3;
        Object[] objArr = this.f21329b;
        if (i3 > objArr.length) {
            Object[] objArr2 = new Object[Math.min((objArr.length < 64 ? (r0 + 1) * 2 : IntMath.m12058a(r0 / 2, 3)) - 1, 0) + 1];
            Object[] objArr3 = this.f21329b;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f21329b = objArr2;
        }
        m11808a(i2);
        throw null;
    }

    @Override // java.util.Queue
    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.f21329b[0];
    }

    @Override // java.util.Queue
    @CanIgnoreReturnValue
    public E poll() {
        if (isEmpty()) {
            return null;
        }
        E e2 = (E) this.f21329b[0];
        m11809b(0);
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.f21330c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public Object[] toArray() {
        int i2 = this.f21330c;
        Object[] objArr = new Object[i2];
        System.arraycopy(this.f21329b, 0, objArr, 0, i2);
        return objArr;
    }
}
