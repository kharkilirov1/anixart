package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import java.util.Collection;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.TimeUnit;

@GwtIncompatible
@Deprecated
/* loaded from: classes.dex */
public abstract class ForwardingBlockingDeque<E> extends ForwardingDeque<E> implements BlockingDeque<E> {
    @Override // com.google.common.collect.ForwardingDeque
    /* renamed from: M, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public abstract BlockingDeque<E> mo7455G();

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(Collection<? super E> collection) {
        return mo11329H().drainTo(collection);
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    public boolean offer(E e2, long j2, TimeUnit timeUnit) throws InterruptedException {
        return mo11329H().offer(e2, j2, timeUnit);
    }

    @Override // java.util.concurrent.BlockingDeque
    public boolean offerFirst(E e2, long j2, TimeUnit timeUnit) throws InterruptedException {
        return mo11329H().offerFirst(e2, j2, timeUnit);
    }

    @Override // java.util.concurrent.BlockingDeque
    public boolean offerLast(E e2, long j2, TimeUnit timeUnit) throws InterruptedException {
        return mo11329H().offerLast(e2, j2, timeUnit);
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    public E poll(long j2, TimeUnit timeUnit) throws InterruptedException {
        return mo11329H().poll(j2, timeUnit);
    }

    @Override // java.util.concurrent.BlockingDeque
    public E pollFirst(long j2, TimeUnit timeUnit) throws InterruptedException {
        return mo11329H().pollFirst(j2, timeUnit);
    }

    @Override // java.util.concurrent.BlockingDeque
    public E pollLast(long j2, TimeUnit timeUnit) throws InterruptedException {
        return mo11329H().pollLast(j2, timeUnit);
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    public void put(E e2) throws InterruptedException {
        mo11329H().put(e2);
    }

    @Override // java.util.concurrent.BlockingDeque
    public void putFirst(E e2) throws InterruptedException {
        mo11329H().putFirst(e2);
    }

    @Override // java.util.concurrent.BlockingDeque
    public void putLast(E e2) throws InterruptedException {
        mo11329H().putLast(e2);
    }

    @Override // java.util.concurrent.BlockingQueue
    public int remainingCapacity() {
        return mo11329H().remainingCapacity();
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    public E take() throws InterruptedException {
        return mo11329H().take();
    }

    @Override // java.util.concurrent.BlockingDeque
    public E takeFirst() throws InterruptedException {
        return mo11329H().takeFirst();
    }

    @Override // java.util.concurrent.BlockingDeque
    public E takeLast() throws InterruptedException {
        return mo11329H().takeLast();
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(Collection<? super E> collection, int i2) {
        return mo11329H().drainTo(collection, i2);
    }
}
