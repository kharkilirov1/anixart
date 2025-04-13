package androidx.arch.core.executor;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

@RestrictTo
/* loaded from: classes.dex */
public class DefaultTaskExecutor extends TaskExecutor {

    /* renamed from: a */
    public final Object f1689a = new Object();

    /* renamed from: b */
    public final ExecutorService f1690b = Executors.newFixedThreadPool(4, new ThreadFactory(this) { // from class: androidx.arch.core.executor.DefaultTaskExecutor.1

        /* renamed from: b */
        public final AtomicInteger f1692b = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", Integer.valueOf(this.f1692b.getAndIncrement())));
            return thread;
        }
    });

    /* renamed from: c */
    @Nullable
    public volatile Handler f1691c;

    /* renamed from: d */
    public static Handler m1013d(@NonNull Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Handler.createAsync(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    @Override // androidx.arch.core.executor.TaskExecutor
    /* renamed from: a */
    public void mo1010a(Runnable runnable) {
        this.f1690b.execute(runnable);
    }

    @Override // androidx.arch.core.executor.TaskExecutor
    /* renamed from: b */
    public boolean mo1011b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override // androidx.arch.core.executor.TaskExecutor
    /* renamed from: c */
    public void mo1012c(Runnable runnable) {
        if (this.f1691c == null) {
            synchronized (this.f1689a) {
                if (this.f1691c == null) {
                    this.f1691c = m1013d(Looper.getMainLooper());
                }
            }
        }
        this.f1691c.post(runnable);
    }
}
