package androidx.loader.content;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p000a.C0000a;

/* loaded from: classes.dex */
abstract class ModernAsyncTask<Params, Progress, Result> {

    /* renamed from: g */
    public static final Executor f4739g;

    /* renamed from: h */
    public static InternalHandler f4740h;

    /* renamed from: b */
    public final WorkerRunnable<Params, Result> f4741b;

    /* renamed from: c */
    public final FutureTask<Result> f4742c;

    /* renamed from: d */
    public volatile Status f4743d = Status.PENDING;

    /* renamed from: e */
    public final AtomicBoolean f4744e = new AtomicBoolean();

    /* renamed from: f */
    public final AtomicBoolean f4745f = new AtomicBoolean();

    /* renamed from: androidx.loader.content.ModernAsyncTask$4 */
    public static /* synthetic */ class C04294 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f4749a;

        static {
            int[] iArr = new int[Status.values().length];
            f4749a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4749a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class AsyncTaskResult<Data> {

        /* renamed from: a */
        public final ModernAsyncTask f4750a;

        /* renamed from: b */
        public final Data[] f4751b;

        public AsyncTaskResult(ModernAsyncTask modernAsyncTask, Data... dataArr) {
            this.f4750a = modernAsyncTask;
            this.f4751b = dataArr;
        }
    }

    public static class InternalHandler extends Handler {
        public InternalHandler() {
            super(Looper.getMainLooper());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            AsyncTaskResult asyncTaskResult = (AsyncTaskResult) message.obj;
            int i2 = message.what;
            if (i2 != 1) {
                if (i2 != 2) {
                    return;
                }
                Objects.requireNonNull(asyncTaskResult.f4750a);
            } else {
                ModernAsyncTask modernAsyncTask = asyncTaskResult.f4750a;
                Object obj = asyncTaskResult.f4751b[0];
                if (modernAsyncTask.f4744e.get()) {
                    modernAsyncTask.mo3271b(obj);
                } else {
                    modernAsyncTask.mo3272c(obj);
                }
                modernAsyncTask.f4743d = Status.FINISHED;
            }
        }
    }

    public enum Status {
        PENDING,
        RUNNING,
        FINISHED
    }

    public static abstract class WorkerRunnable<Params, Result> implements Callable<Result> {

        /* renamed from: b */
        public Params[] f4756b;
    }

    static {
        ThreadFactory threadFactory = new ThreadFactory() { // from class: androidx.loader.content.ModernAsyncTask.1

            /* renamed from: b */
            public final AtomicInteger f4746b = new AtomicInteger(1);

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                StringBuilder m24u = C0000a.m24u("ModernAsyncTask #");
                m24u.append(this.f4746b.getAndIncrement());
                return new Thread(runnable, m24u.toString());
            }
        };
        f4739g = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(10), threadFactory);
    }

    public ModernAsyncTask() {
        WorkerRunnable<Params, Result> workerRunnable = new WorkerRunnable<Params, Result>() { // from class: androidx.loader.content.ModernAsyncTask.2
            @Override // java.util.concurrent.Callable
            public Result call() throws Exception {
                ModernAsyncTask.this.f4745f.set(true);
                Result result = null;
                try {
                    Process.setThreadPriority(10);
                    result = (Result) ModernAsyncTask.this.mo3270a(this.f4756b);
                    Binder.flushPendingCommands();
                    return result;
                } finally {
                }
            }
        };
        this.f4741b = workerRunnable;
        this.f4742c = new FutureTask<Result>(workerRunnable) { // from class: androidx.loader.content.ModernAsyncTask.3
            @Override // java.util.concurrent.FutureTask
            public void done() {
                try {
                    Result result = get();
                    ModernAsyncTask modernAsyncTask = ModernAsyncTask.this;
                    if (modernAsyncTask.f4745f.get()) {
                        return;
                    }
                    modernAsyncTask.m3278d(result);
                } catch (InterruptedException e2) {
                    Log.w("AsyncTask", e2);
                } catch (CancellationException unused) {
                    ModernAsyncTask modernAsyncTask2 = ModernAsyncTask.this;
                    if (modernAsyncTask2.f4745f.get()) {
                        return;
                    }
                    modernAsyncTask2.m3278d(null);
                } catch (ExecutionException e3) {
                    throw new RuntimeException("An error occurred while executing doInBackground()", e3.getCause());
                } catch (Throwable th) {
                    throw new RuntimeException("An error occurred while executing doInBackground()", th);
                }
            }
        };
    }

    /* renamed from: a */
    public abstract Result mo3270a(Params... paramsArr);

    /* renamed from: b */
    public void mo3271b(Result result) {
    }

    /* renamed from: c */
    public void mo3272c(Result result) {
    }

    /* renamed from: d */
    public Result m3278d(Result result) {
        InternalHandler internalHandler;
        synchronized (ModernAsyncTask.class) {
            if (f4740h == null) {
                f4740h = new InternalHandler();
            }
            internalHandler = f4740h;
        }
        internalHandler.obtainMessage(1, new AsyncTaskResult(this, result)).sendToTarget();
        return result;
    }
}
