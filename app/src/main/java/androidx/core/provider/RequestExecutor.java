package androidx.core.provider;

import android.os.Handler;
import android.os.Process;
import androidx.annotation.NonNull;
import androidx.core.util.Consumer;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
class RequestExecutor {

    public static class DefaultThreadFactory implements ThreadFactory {

        /* renamed from: b */
        public String f3501b;

        /* renamed from: c */
        public int f3502c;

        public static class ProcessPriorityThread extends Thread {

            /* renamed from: b */
            public final int f3503b;

            public ProcessPriorityThread(Runnable runnable, String str, int i2) {
                super(runnable, str);
                this.f3503b = i2;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f3503b);
                super.run();
            }
        }

        public DefaultThreadFactory(@NonNull String str, int i2) {
            this.f3501b = str;
            this.f3502c = i2;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new ProcessPriorityThread(runnable, this.f3501b, this.f3502c);
        }
    }

    public static class HandlerExecutor implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            Objects.requireNonNull(runnable);
            throw null;
        }
    }

    public static class ReplyRunnable<T> implements Runnable {

        /* renamed from: b */
        @NonNull
        public Callable<T> f3504b;

        /* renamed from: c */
        @NonNull
        public Consumer<T> f3505c;

        /* renamed from: d */
        @NonNull
        public Handler f3506d;

        public ReplyRunnable(@NonNull Handler handler, @NonNull Callable<T> callable, @NonNull Consumer<T> consumer) {
            this.f3504b = callable;
            this.f3505c = consumer;
            this.f3506d = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            final T t;
            try {
                t = this.f3504b.call();
            } catch (Exception unused) {
                t = null;
            }
            final Consumer<T> consumer = this.f3505c;
            this.f3506d.post(new Runnable(this) { // from class: androidx.core.provider.RequestExecutor.ReplyRunnable.1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public void run() {
                    consumer.accept(t);
                }
            });
        }
    }
}
