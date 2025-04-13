package com.google.android.datatransport.runtime.synchronization;

import androidx.annotation.WorkerThread;

@WorkerThread
/* loaded from: classes.dex */
public interface SynchronizationGuard {

    public interface CriticalSection<T> {
        T execute();
    }

    /* renamed from: b */
    <T> T mo5594b(CriticalSection<T> criticalSection);
}
