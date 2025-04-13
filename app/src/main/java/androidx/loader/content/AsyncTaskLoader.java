package androidx.loader.content;

import android.content.Context;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.os.OperationCanceledException;
import androidx.loader.content.ModernAsyncTask;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class AsyncTaskLoader<D> extends Loader<D> {

    /* renamed from: i */
    public final Executor f4724i;

    /* renamed from: j */
    public volatile AsyncTaskLoader<D>.LoadTask f4725j;

    /* renamed from: k */
    public volatile AsyncTaskLoader<D>.LoadTask f4726k;

    public final class LoadTask extends ModernAsyncTask<Void, Void, D> implements Runnable {

        /* renamed from: i */
        public final CountDownLatch f4727i = new CountDownLatch(1);

        public LoadTask() {
        }

        @Override // androidx.loader.content.ModernAsyncTask
        /* renamed from: a */
        public Object mo3270a(Void[] voidArr) {
            try {
                return AsyncTaskLoader.this.mo3267j();
            } catch (OperationCanceledException e2) {
                if (this.f4744e.get()) {
                    return null;
                }
                throw e2;
            }
        }

        @Override // androidx.loader.content.ModernAsyncTask
        /* renamed from: b */
        public void mo3271b(D d) {
            try {
                AsyncTaskLoader.this.m3265h(this, d);
            } finally {
                this.f4727i.countDown();
            }
        }

        @Override // androidx.loader.content.ModernAsyncTask
        /* renamed from: c */
        public void mo3272c(D d) {
            try {
                AsyncTaskLoader asyncTaskLoader = AsyncTaskLoader.this;
                if (asyncTaskLoader.f4725j != this) {
                    asyncTaskLoader.m3265h(this, d);
                } else if (asyncTaskLoader.f4735e) {
                    asyncTaskLoader.mo3268k(d);
                } else {
                    asyncTaskLoader.f4738h = false;
                    SystemClock.uptimeMillis();
                    asyncTaskLoader.f4725j = null;
                    asyncTaskLoader.mo3273a(d);
                }
            } finally {
                this.f4727i.countDown();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            AsyncTaskLoader.this.m3266i();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncTaskLoader(@NonNull Context context) {
        super(context);
        Executor executor = ModernAsyncTask.f4739g;
        this.f4724i = executor;
    }

    @Override // androidx.loader.content.Loader
    @Deprecated
    /* renamed from: b */
    public void mo3262b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo3262b(str, fileDescriptor, printWriter, strArr);
        if (this.f4725j != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f4725j);
            printWriter.print(" waiting=");
            Objects.requireNonNull(this.f4725j);
            printWriter.println(false);
        }
        if (this.f4726k != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f4726k);
            printWriter.print(" waiting=");
            Objects.requireNonNull(this.f4726k);
            printWriter.println(false);
        }
    }

    @Override // androidx.loader.content.Loader
    /* renamed from: c */
    public boolean mo3263c() {
        if (this.f4725j == null) {
            return false;
        }
        if (!this.f4734d) {
            this.f4737g = true;
        }
        if (this.f4726k != null) {
            Objects.requireNonNull(this.f4725j);
            this.f4725j = null;
            return false;
        }
        Objects.requireNonNull(this.f4725j);
        AsyncTaskLoader<D>.LoadTask loadTask = this.f4725j;
        loadTask.f4744e.set(true);
        boolean cancel = loadTask.f4742c.cancel(false);
        if (cancel) {
            this.f4726k = this.f4725j;
            mo3264g();
        }
        this.f4725j = null;
        return cancel;
    }

    /* renamed from: g */
    public void mo3264g() {
    }

    /* renamed from: h */
    public void m3265h(AsyncTaskLoader<D>.LoadTask loadTask, D d) {
        mo3268k(d);
        if (this.f4726k == loadTask) {
            if (this.f4738h) {
                if (this.f4734d) {
                    m3269l();
                } else {
                    this.f4737g = true;
                }
            }
            SystemClock.uptimeMillis();
            this.f4726k = null;
            m3266i();
        }
    }

    /* renamed from: i */
    public void m3266i() {
        if (this.f4726k != null || this.f4725j == null) {
            return;
        }
        Objects.requireNonNull(this.f4725j);
        AsyncTaskLoader<D>.LoadTask loadTask = this.f4725j;
        Executor executor = this.f4724i;
        if (loadTask.f4743d == ModernAsyncTask.Status.PENDING) {
            loadTask.f4743d = ModernAsyncTask.Status.RUNNING;
            loadTask.f4741b.f4756b = null;
            executor.execute(loadTask.f4742c);
        } else {
            int ordinal = loadTask.f4743d.ordinal();
            if (ordinal == 1) {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            }
            if (ordinal == 2) {
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
            throw new IllegalStateException("We should never reach this state");
        }
    }

    @Nullable
    /* renamed from: j */
    public abstract D mo3267j();

    /* renamed from: k */
    public void mo3268k(@Nullable D d) {
    }

    /* renamed from: l */
    public void m3269l() {
        mo3263c();
        this.f4725j = new LoadTask();
        m3266i();
    }
}
