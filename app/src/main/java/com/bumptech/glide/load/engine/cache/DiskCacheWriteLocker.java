package com.bumptech.glide.load.engine.cache;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
final class DiskCacheWriteLocker {

    /* renamed from: a */
    public final Map<String, WriteLock> f8373a = new HashMap();

    /* renamed from: b */
    public final WriteLockPool f8374b = new WriteLockPool();

    public static class WriteLock {

        /* renamed from: a */
        public final Lock f8375a = new ReentrantLock();

        /* renamed from: b */
        public int f8376b;
    }

    public static class WriteLockPool {

        /* renamed from: a */
        public final Queue<WriteLock> f8377a = new ArrayDeque();
    }

    /* renamed from: a */
    public void m5107a(String str) {
        WriteLock writeLock;
        synchronized (this) {
            WriteLock writeLock2 = this.f8373a.get(str);
            Objects.requireNonNull(writeLock2, "Argument must not be null");
            writeLock = writeLock2;
            int i2 = writeLock.f8376b;
            if (i2 < 1) {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + writeLock.f8376b);
            }
            int i3 = i2 - 1;
            writeLock.f8376b = i3;
            if (i3 == 0) {
                WriteLock remove = this.f8373a.remove(str);
                if (!remove.equals(writeLock)) {
                    throw new IllegalStateException("Removed the wrong lock, expected to remove: " + writeLock + ", but actually removed: " + remove + ", safeKey: " + str);
                }
                WriteLockPool writeLockPool = this.f8374b;
                synchronized (writeLockPool.f8377a) {
                    if (writeLockPool.f8377a.size() < 10) {
                        writeLockPool.f8377a.offer(remove);
                    }
                }
            }
        }
        writeLock.f8375a.unlock();
    }
}
