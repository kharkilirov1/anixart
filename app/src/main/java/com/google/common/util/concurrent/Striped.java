package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Supplier;
import java.lang.ref.WeakReference;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

@Beta
@GwtIncompatible
/* loaded from: classes2.dex */
public abstract class Striped<L> {

    /* renamed from: com.google.common.util.concurrent.Striped$1 */
    class C20351 implements Supplier<Lock> {
        @Override // com.google.common.base.Supplier
        public Lock get() {
            return new PaddedLock();
        }
    }

    /* renamed from: com.google.common.util.concurrent.Striped$2 */
    class C20362 implements Supplier<Lock> {
        @Override // com.google.common.base.Supplier
        public Lock get() {
            return new ReentrantLock(false);
        }
    }

    /* renamed from: com.google.common.util.concurrent.Striped$3 */
    class C20373 implements Supplier<Semaphore> {
        @Override // com.google.common.base.Supplier
        public Semaphore get() {
            return new PaddedSemaphore(0);
        }
    }

    /* renamed from: com.google.common.util.concurrent.Striped$4 */
    class C20384 implements Supplier<Semaphore> {
        @Override // com.google.common.base.Supplier
        public Semaphore get() {
            return new Semaphore(0, false);
        }
    }

    /* renamed from: com.google.common.util.concurrent.Striped$5 */
    public class C20395 implements Supplier<ReadWriteLock> {
        @Override // com.google.common.base.Supplier
        public ReadWriteLock get() {
            return new ReentrantReadWriteLock();
        }
    }

    /* renamed from: com.google.common.util.concurrent.Striped$6 */
    public class C20406 implements Supplier<ReadWriteLock> {
        @Override // com.google.common.base.Supplier
        public ReadWriteLock get() {
            return new WeakSafeReadWriteLock();
        }
    }

    public static class CompactStriped<L> extends PowerOfTwoStriped<L> {
    }

    @VisibleForTesting
    public static class LargeLazyStriped<L> extends PowerOfTwoStriped<L> {
    }

    public static class PaddedLock extends ReentrantLock {
        public PaddedLock() {
            super(false);
        }
    }

    public static class PaddedSemaphore extends Semaphore {
        public PaddedSemaphore(int i2) {
            super(i2, false);
        }
    }

    public static abstract class PowerOfTwoStriped<L> extends Striped<L> {
    }

    @VisibleForTesting
    public static class SmallLazyStriped<L> extends PowerOfTwoStriped<L> {

        public static final class ArrayReference<L> extends WeakReference<L> {
        }
    }

    public static final class WeakSafeCondition extends ForwardingCondition {

        /* renamed from: a */
        public final Condition f22233a;

        public WeakSafeCondition(Condition condition, WeakSafeReadWriteLock weakSafeReadWriteLock) {
            this.f22233a = condition;
        }

        @Override // com.google.common.util.concurrent.ForwardingCondition
        /* renamed from: a */
        public Condition mo12188a() {
            return this.f22233a;
        }
    }

    public static final class WeakSafeLock extends ForwardingLock {

        /* renamed from: b */
        public final Lock f22234b;

        /* renamed from: c */
        public final WeakSafeReadWriteLock f22235c;

        public WeakSafeLock(Lock lock, WeakSafeReadWriteLock weakSafeReadWriteLock) {
            this.f22234b = lock;
            this.f22235c = weakSafeReadWriteLock;
        }

        @Override // com.google.common.util.concurrent.ForwardingLock
        /* renamed from: a */
        public Lock mo12192a() {
            return this.f22234b;
        }

        @Override // com.google.common.util.concurrent.ForwardingLock, java.util.concurrent.locks.Lock
        public Condition newCondition() {
            return new WeakSafeCondition(this.f22234b.newCondition(), this.f22235c);
        }
    }

    public static final class WeakSafeReadWriteLock implements ReadWriteLock {

        /* renamed from: b */
        public final ReadWriteLock f22236b = new ReentrantReadWriteLock();

        @Override // java.util.concurrent.locks.ReadWriteLock
        public Lock readLock() {
            return new WeakSafeLock(this.f22236b.readLock(), this);
        }

        @Override // java.util.concurrent.locks.ReadWriteLock
        public Lock writeLock() {
            return new WeakSafeLock(this.f22236b.writeLock(), this);
        }
    }
}
