package com.yandex.div.internal.viewpool;

import java.util.AbstractQueue;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.Spliterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BatchBlockingQueue.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/yandex/div/internal/viewpool/BatchBlockingQueue;", "E", "Ljava/util/AbstractQueue;", "Ljava/util/concurrent/BlockingQueue;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class BatchBlockingQueue<E> extends AbstractQueue<E> implements BlockingQueue<E> {

    /* renamed from: b */
    @NotNull
    public final Queue<E> f33916b;

    /* renamed from: c */
    @NotNull
    public final ReentrantLock f33917c;

    /* renamed from: d */
    public final Condition f33918d;

    public BatchBlockingQueue(@NotNull Queue<E> queue) {
        this.f33916b = queue;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f33917c = reentrantLock;
        this.f33918d = reentrantLock.newCondition();
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue, java.util.concurrent.BlockingQueue
    public boolean add(E e2) {
        offer(e2);
        return true;
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(@Nullable Collection<? super E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Queue, java.util.concurrent.BlockingQueue
    public boolean offer(E e2) {
        this.f33917c.lock();
        try {
            this.f33916b.offer(e2);
            this.f33918d.signal();
            this.f33917c.unlock();
            return true;
        } catch (Throwable th) {
            this.f33917c.unlock();
            throw th;
        }
    }

    @Override // java.util.Queue
    public E peek() {
        this.f33917c.lock();
        try {
            return this.f33916b.peek();
        } finally {
            this.f33917c.unlock();
        }
    }

    @Override // java.util.Queue
    @Nullable
    public E poll() {
        this.f33917c.lock();
        try {
            return this.f33916b.poll();
        } finally {
            this.f33917c.unlock();
        }
    }

    @Override // java.util.concurrent.BlockingQueue
    public void put(E e2) {
        offer(e2);
    }

    @Override // java.util.concurrent.BlockingQueue
    public int remainingCapacity() {
        return Integer.MAX_VALUE;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.concurrent.BlockingQueue
    public boolean remove(Object obj) {
        this.f33917c.lock();
        try {
            return this.f33916b.remove(obj);
        } finally {
            this.f33917c.unlock();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        this.f33917c.lock();
        try {
            return this.f33916b.size();
        } finally {
            this.f33917c.unlock();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    @NotNull
    public Spliterator<E> spliterator() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.BlockingQueue
    public E take() throws InterruptedException {
        this.f33917c.lockInterruptibly();
        while (this.f33916b.isEmpty()) {
            try {
                this.f33918d.await();
            } finally {
                this.f33917c.unlock();
            }
        }
        return this.f33916b.poll();
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(@Nullable Collection<? super E> collection, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.BlockingQueue
    @Nullable
    public E poll(long j2, @NotNull TimeUnit unit) throws InterruptedException {
        Intrinsics.m32179h(unit, "unit");
        this.f33917c.lockInterruptibly();
        try {
            long nanos = unit.toNanos(j2);
            while (this.f33916b.isEmpty() && nanos > 0) {
                nanos = this.f33918d.awaitNanos(nanos);
            }
            return this.f33916b.poll();
        } finally {
            this.f33917c.unlock();
        }
    }

    @Override // java.util.concurrent.BlockingQueue
    public boolean offer(E e2, long j2, @NotNull TimeUnit unit) {
        Intrinsics.m32179h(unit, "unit");
        offer(e2);
        return true;
    }
}
