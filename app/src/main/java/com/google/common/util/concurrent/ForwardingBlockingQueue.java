package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.ForwardingQueue;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

@CanIgnoreReturnValue
@GwtIncompatible
/* loaded from: classes2.dex */
public abstract class ForwardingBlockingQueue<E> extends ForwardingQueue<E> implements BlockingQueue<E> {
    @Override // com.google.common.collect.ForwardingQueue
    /* renamed from: L, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public abstract BlockingQueue<E> mo7455G();

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(Collection<? super E> collection, int i2) {
        return mo11329H().drainTo(collection, i2);
    }

    @Override // java.util.concurrent.BlockingQueue
    public boolean offer(E e2, long j2, TimeUnit timeUnit) throws InterruptedException {
        return mo11329H().offer(e2, j2, timeUnit);
    }

    @Override // java.util.concurrent.BlockingQueue
    public E poll(long j2, TimeUnit timeUnit) throws InterruptedException {
        return mo11329H().poll(j2, timeUnit);
    }

    @Override // java.util.concurrent.BlockingQueue
    public void put(E e2) throws InterruptedException {
        mo11329H().put(e2);
    }

    @Override // java.util.concurrent.BlockingQueue
    public int remainingCapacity() {
        return mo11329H().remainingCapacity();
    }

    @Override // java.util.concurrent.BlockingQueue
    public E take() throws InterruptedException {
        return mo11329H().take();
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(Collection<? super E> collection) {
        return mo11329H().drainTo(collection);
    }
}
