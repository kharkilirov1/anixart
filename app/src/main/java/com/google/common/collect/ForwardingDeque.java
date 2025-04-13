package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Deque;
import java.util.Iterator;

@GwtIncompatible
/* loaded from: classes.dex */
public abstract class ForwardingDeque<E> extends ForwardingQueue<E> implements Deque<E> {
    @Override // com.google.common.collect.ForwardingQueue
    /* renamed from: L, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public abstract Deque<E> mo7455G();

    @Override // java.util.Deque
    public void addFirst(E e2) {
        mo7455G().addFirst(e2);
    }

    @Override // java.util.Deque
    public void addLast(E e2) {
        mo7455G().addLast(e2);
    }

    @Override // java.util.Deque
    public Iterator<E> descendingIterator() {
        return mo7455G().descendingIterator();
    }

    @Override // java.util.Deque
    public E getFirst() {
        return mo7455G().getFirst();
    }

    @Override // java.util.Deque
    public E getLast() {
        return mo7455G().getLast();
    }

    @Override // java.util.Deque
    @CanIgnoreReturnValue
    public boolean offerFirst(E e2) {
        return mo7455G().offerFirst(e2);
    }

    @Override // java.util.Deque
    @CanIgnoreReturnValue
    public boolean offerLast(E e2) {
        return mo7455G().offerLast(e2);
    }

    @Override // java.util.Deque
    public E peekFirst() {
        return mo7455G().peekFirst();
    }

    @Override // java.util.Deque
    public E peekLast() {
        return mo7455G().peekLast();
    }

    @Override // java.util.Deque
    @CanIgnoreReturnValue
    public E pollFirst() {
        return mo7455G().pollFirst();
    }

    @Override // java.util.Deque
    @CanIgnoreReturnValue
    public E pollLast() {
        return mo7455G().pollLast();
    }

    @Override // java.util.Deque
    @CanIgnoreReturnValue
    public E pop() {
        return mo7455G().pop();
    }

    @Override // java.util.Deque
    public void push(E e2) {
        mo7455G().push(e2);
    }

    @Override // java.util.Deque
    @CanIgnoreReturnValue
    public E removeFirst() {
        return mo7455G().removeFirst();
    }

    @Override // java.util.Deque
    @CanIgnoreReturnValue
    public boolean removeFirstOccurrence(Object obj) {
        return mo7455G().removeFirstOccurrence(obj);
    }

    @Override // java.util.Deque
    @CanIgnoreReturnValue
    public E removeLast() {
        return mo7455G().removeLast();
    }

    @Override // java.util.Deque
    @CanIgnoreReturnValue
    public boolean removeLastOccurrence(Object obj) {
        return mo7455G().removeLastOccurrence(obj);
    }
}
