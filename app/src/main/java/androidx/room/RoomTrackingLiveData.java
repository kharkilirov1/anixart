package androidx.room;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.lifecycle.LiveData;
import androidx.room.InvalidationTracker;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
class RoomTrackingLiveData<T> extends LiveData<T> {

    /* renamed from: androidx.room.RoomTrackingLiveData$1 */
    public class RunnableC05561 implements Runnable {
        @Override // java.lang.Runnable
        @WorkerThread
        public void run() {
            Objects.requireNonNull(null);
            throw null;
        }
    }

    /* renamed from: androidx.room.RoomTrackingLiveData$2 */
    public class RunnableC05572 implements Runnable {
        @Override // java.lang.Runnable
        @MainThread
        public void run() {
            throw null;
        }
    }

    /* renamed from: androidx.room.RoomTrackingLiveData$3 */
    class C05583 extends InvalidationTracker.Observer {
        @Override // androidx.room.InvalidationTracker.Observer
        /* renamed from: a */
        public void mo4069a(@NonNull Set<String> set) {
            ArchTaskExecutor.m1009d();
            Objects.requireNonNull(null);
            throw null;
        }
    }

    @Override // androidx.lifecycle.LiveData
    /* renamed from: h */
    public void mo3179h() {
        throw null;
    }

    @Override // androidx.lifecycle.LiveData
    /* renamed from: i */
    public void mo3213i() {
        throw null;
    }
}
