package androidx.core.os;

import android.os.Handler;
import androidx.annotation.NonNull;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public final class ExecutorCompat {

    public static class HandlerExecutor implements Executor {

        /* renamed from: b */
        public final Handler f3460b;

        public HandlerExecutor(@NonNull Handler handler) {
            Objects.requireNonNull(handler);
            this.f3460b = handler;
        }

        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            Handler handler = this.f3460b;
            Objects.requireNonNull(runnable);
            if (handler.post(runnable)) {
                return;
            }
            throw new RejectedExecutionException(this.f3460b + " is shutting down");
        }
    }

    @NonNull
    /* renamed from: a */
    public static Executor m1954a(@NonNull Handler handler) {
        return new HandlerExecutor(handler);
    }
}
