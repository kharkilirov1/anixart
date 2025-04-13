package kotlin.reflect.jvm.internal.impl.storage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
class NoLock implements Lock {

    /* renamed from: b */
    public static final Lock f66277b = new NoLock();

    @Override // java.util.concurrent.locks.Lock
    public void lock() {
    }

    @Override // java.util.concurrent.locks.Lock
    public void lockInterruptibly() throws InterruptedException {
        throw new UnsupportedOperationException("Should not be called");
    }

    @Override // java.util.concurrent.locks.Lock
    @NotNull
    public Condition newCondition() {
        throw new UnsupportedOperationException("Should not be called");
    }

    @Override // java.util.concurrent.locks.Lock
    public boolean tryLock() {
        throw new UnsupportedOperationException("Should not be called");
    }

    @Override // java.util.concurrent.locks.Lock
    public void unlock() {
    }

    @Override // java.util.concurrent.locks.Lock
    public boolean tryLock(long j2, @NotNull TimeUnit timeUnit) throws InterruptedException {
        throw new UnsupportedOperationException("Should not be called");
    }
}
