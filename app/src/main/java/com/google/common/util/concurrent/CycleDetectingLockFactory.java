package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.MapMaker;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.logging.Logger;

@CanIgnoreReturnValue
@Beta
@GwtIncompatible
/* loaded from: classes2.dex */
public class CycleDetectingLockFactory {

    /* renamed from: a */
    public static final Logger f22155a;

    /* renamed from: b */
    public static final ThreadLocal<ArrayList<LockGraphNode>> f22156b;

    public interface CycleDetectingLock {
    }

    public final class CycleDetectingReentrantLock extends ReentrantLock implements CycleDetectingLock {
        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public void lock() {
            CycleDetectingLockFactory.m12181a(null, this);
            throw null;
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
            CycleDetectingLockFactory.m12181a(null, this);
            throw null;
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public boolean tryLock() {
            CycleDetectingLockFactory.m12181a(null, this);
            throw null;
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public void unlock() {
            try {
                super.unlock();
            } finally {
                CycleDetectingLockFactory.m12182b(this);
            }
        }

        @Override // java.util.concurrent.locks.ReentrantLock, java.util.concurrent.locks.Lock
        public boolean tryLock(long j2, TimeUnit timeUnit) throws InterruptedException {
            CycleDetectingLockFactory.m12181a(null, this);
            throw null;
        }
    }

    public class CycleDetectingReentrantReadLock extends ReentrantReadWriteLock.ReadLock {
        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public void lock() {
            CycleDetectingLockFactory.m12181a(null, null);
            throw null;
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
            CycleDetectingLockFactory.m12181a(null, null);
            throw null;
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public boolean tryLock() {
            CycleDetectingLockFactory.m12181a(null, null);
            throw null;
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public void unlock() {
            super.unlock();
            CycleDetectingLockFactory.m12182b(null);
            throw null;
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock, java.util.concurrent.locks.Lock
        public boolean tryLock(long j2, TimeUnit timeUnit) throws InterruptedException {
            CycleDetectingLockFactory.m12181a(null, null);
            throw null;
        }
    }

    public final class CycleDetectingReentrantReadWriteLock extends ReentrantReadWriteLock implements CycleDetectingLock {
        @Override // java.util.concurrent.locks.ReentrantReadWriteLock, java.util.concurrent.locks.ReadWriteLock
        public /* bridge */ /* synthetic */ Lock readLock() {
            return null;
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock, java.util.concurrent.locks.ReadWriteLock
        public ReentrantReadWriteLock.ReadLock readLock() {
            return null;
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock, java.util.concurrent.locks.ReadWriteLock
        public /* bridge */ /* synthetic */ Lock writeLock() {
            return null;
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock, java.util.concurrent.locks.ReadWriteLock
        public ReentrantReadWriteLock.WriteLock writeLock() {
            return null;
        }
    }

    public class CycleDetectingReentrantWriteLock extends ReentrantReadWriteLock.WriteLock {
        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public void lock() {
            CycleDetectingLockFactory.m12181a(null, null);
            throw null;
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
            CycleDetectingLockFactory.m12181a(null, null);
            throw null;
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public boolean tryLock() {
            CycleDetectingLockFactory.m12181a(null, null);
            throw null;
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public void unlock() {
            super.unlock();
            CycleDetectingLockFactory.m12182b(null);
            throw null;
        }

        @Override // java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock, java.util.concurrent.locks.Lock
        public boolean tryLock(long j2, TimeUnit timeUnit) throws InterruptedException {
            CycleDetectingLockFactory.m12181a(null, null);
            throw null;
        }
    }

    public static class ExampleStackTrace extends IllegalStateException {

        /* renamed from: b */
        public static final StackTraceElement[] f22157b = new StackTraceElement[0];

        /* renamed from: c */
        public static final ImmutableSet<String> f22158c = ImmutableSet.m11673E(CycleDetectingLockFactory.class.getName(), ExampleStackTrace.class.getName(), LockGraphNode.class.getName());
    }

    public static class LockGraphNode {
    }

    @Beta
    public enum Policies implements Policy {
        THROW { // from class: com.google.common.util.concurrent.CycleDetectingLockFactory.Policies.1
        },
        WARN { // from class: com.google.common.util.concurrent.CycleDetectingLockFactory.Policies.2
        },
        DISABLED { // from class: com.google.common.util.concurrent.CycleDetectingLockFactory.Policies.3
        };

        Policies(C19981 c19981) {
        }
    }

    @Beta
    public interface Policy {
    }

    @Beta
    public static final class PotentialDeadlockException extends ExampleStackTrace {

        /* renamed from: d */
        public final ExampleStackTrace f22163d;

        @Override // java.lang.Throwable
        public String getMessage() {
            StringBuilder sb = new StringBuilder(super.getMessage());
            for (Throwable th = this.f22163d; th != null; th = th.getCause()) {
                sb.append(", ");
                sb.append(th.getMessage());
            }
            return sb.toString();
        }
    }

    @Beta
    public static final class WithExplicitOrdering<E extends Enum<E>> extends CycleDetectingLockFactory {
    }

    static {
        MapMaker mapMaker = new MapMaker();
        mapMaker.m11749d();
        mapMaker.m11748c();
        f22155a = Logger.getLogger(CycleDetectingLockFactory.class.getName());
        f22156b = new ThreadLocal<ArrayList<LockGraphNode>>() { // from class: com.google.common.util.concurrent.CycleDetectingLockFactory.1
            @Override // java.lang.ThreadLocal
            public ArrayList<LockGraphNode> initialValue() {
                return Lists.m11738e(3);
            }
        };
    }

    /* renamed from: a */
    public static void m12181a(CycleDetectingLockFactory cycleDetectingLockFactory, CycleDetectingLock cycleDetectingLock) {
        Objects.requireNonNull(null);
        throw null;
    }

    /* renamed from: b */
    public static void m12182b(CycleDetectingLock cycleDetectingLock) {
        if (((CycleDetectingReentrantLock) cycleDetectingLock).isHeldByCurrentThread()) {
            return;
        }
        ArrayList<LockGraphNode> arrayList = f22156b.get();
        int size = arrayList.size();
        do {
            size--;
            if (size < 0) {
                return;
            }
        } while (arrayList.get(size) != null);
        arrayList.remove(size);
    }
}
