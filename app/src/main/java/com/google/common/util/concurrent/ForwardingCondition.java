package com.google.common.util.concurrent;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

/* loaded from: classes2.dex */
abstract class ForwardingCondition implements Condition {
    /* renamed from: a */
    public abstract Condition mo12188a();

    @Override // java.util.concurrent.locks.Condition
    public void await() throws InterruptedException {
        mo12188a().await();
    }

    @Override // java.util.concurrent.locks.Condition
    public long awaitNanos(long j2) throws InterruptedException {
        return mo12188a().awaitNanos(j2);
    }

    @Override // java.util.concurrent.locks.Condition
    public void awaitUninterruptibly() {
        mo12188a().awaitUninterruptibly();
    }

    @Override // java.util.concurrent.locks.Condition
    public boolean awaitUntil(Date date) throws InterruptedException {
        return mo12188a().awaitUntil(date);
    }

    @Override // java.util.concurrent.locks.Condition
    public void signal() {
        mo12188a().signal();
    }

    @Override // java.util.concurrent.locks.Condition
    public void signalAll() {
        mo12188a().signalAll();
    }

    @Override // java.util.concurrent.locks.Condition
    public boolean await(long j2, TimeUnit timeUnit) throws InterruptedException {
        return mo12188a().await(j2, timeUnit);
    }
}
