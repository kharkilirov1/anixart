package kotlin.reflect.jvm.internal.pcollections;

import java.util.Iterator;

/* loaded from: classes3.dex */
final class ConsPStack<E> implements Iterable<E> {

    /* renamed from: e */
    public static final ConsPStack<Object> f66520e = new ConsPStack<>();

    /* renamed from: b */
    public final E f66521b;

    /* renamed from: c */
    public final ConsPStack<E> f66522c;

    /* renamed from: d */
    public final int f66523d;

    public static class Itr<E> implements Iterator<E> {

        /* renamed from: b */
        public ConsPStack<E> f66524b;

        public Itr(ConsPStack<E> consPStack) {
            this.f66524b = consPStack;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f66524b.f66523d > 0;
        }

        @Override // java.util.Iterator
        public E next() {
            ConsPStack<E> consPStack = this.f66524b;
            E e2 = consPStack.f66521b;
            this.f66524b = consPStack.f66522c;
            return e2;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public ConsPStack() {
        this.f66523d = 0;
        this.f66521b = null;
        this.f66522c = null;
    }

    /* renamed from: a */
    public final ConsPStack<E> m33789a(Object obj) {
        if (this.f66523d == 0) {
            return this;
        }
        if (this.f66521b.equals(obj)) {
            return this.f66522c;
        }
        ConsPStack<E> m33789a = this.f66522c.m33789a(obj);
        return m33789a == this.f66522c ? this : new ConsPStack<>(this.f66521b, m33789a);
    }

    /* renamed from: b */
    public final ConsPStack<E> m33790b(int i2) {
        if (i2 < 0 || i2 > this.f66523d) {
            throw new IndexOutOfBoundsException();
        }
        return i2 == 0 ? this : this.f66522c.m33790b(i2 - 1);
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        return new Itr(m33790b(0));
    }

    public ConsPStack(E e2, ConsPStack<E> consPStack) {
        this.f66521b = e2;
        this.f66522c = consPStack;
        this.f66523d = consPStack.f66523d + 1;
    }
}
