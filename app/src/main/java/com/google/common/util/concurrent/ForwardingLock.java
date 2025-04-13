package com.google.common.util.concurrent;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* loaded from: classes2.dex */
abstract class ForwardingLock implements Lock {
    /* renamed from: a */
    public abstract Lock mo12192a();

    @Override // java.util.concurrent.locks.Lock
    public void lock() {
        mo12192a().lock();
    }

    @Override // java.util.concurrent.locks.Lock
    public void lockInterruptibly() throws InterruptedException {
        mo12192a().lockInterruptibly();
    }

    @Override // java.util.concurrent.locks.Lock
    public Condition newCondition() {
        return mo12192a().newCondition();
    }

    @Override // java.util.concurrent.locks.Lock
    public boolean tryLock() {
        return mo12192a().tryLock();
    }

    @Override // java.util.concurrent.locks.Lock
    public void unlock() {
        mo12192a().unlock();
    }

    @Override // java.util.concurrent.locks.Lock
    public boolean tryLock(long j2, TimeUnit timeUnit) throws InterruptedException {
        return mo12192a().tryLock(j2, timeUnit);
    }
}
