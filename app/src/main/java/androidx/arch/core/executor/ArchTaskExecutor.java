package androidx.arch.core.executor;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.concurrent.Executor;

@RestrictTo
/* loaded from: classes.dex */
public class ArchTaskExecutor extends TaskExecutor {

    /* renamed from: b */
    public static volatile ArchTaskExecutor f1686b;

    /* renamed from: c */
    @NonNull
    public static final Executor f1687c = new Executor() { // from class: androidx.arch.core.executor.ArchTaskExecutor.2
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            ArchTaskExecutor.m1009d().f1688a.mo1010a(runnable);
        }
    };

    /* renamed from: a */
    @NonNull
    public TaskExecutor f1688a = new DefaultTaskExecutor();

    /* renamed from: androidx.arch.core.executor.ArchTaskExecutor$1 */
    public static class ExecutorC01441 implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            ArchTaskExecutor.m1009d().f1688a.mo1012c(runnable);
        }
    }

    @NonNull
    /* renamed from: d */
    public static ArchTaskExecutor m1009d() {
        if (f1686b != null) {
            return f1686b;
        }
        synchronized (ArchTaskExecutor.class) {
            if (f1686b == null) {
                f1686b = new ArchTaskExecutor();
            }
        }
        return f1686b;
    }

    @Override // androidx.arch.core.executor.TaskExecutor
    /* renamed from: a */
    public void mo1010a(Runnable runnable) {
        this.f1688a.mo1010a(runnable);
    }

    @Override // androidx.arch.core.executor.TaskExecutor
    /* renamed from: b */
    public boolean mo1011b() {
        return this.f1688a.mo1011b();
    }

    @Override // androidx.arch.core.executor.TaskExecutor
    /* renamed from: c */
    public void mo1012c(Runnable runnable) {
        this.f1688a.mo1012c(runnable);
    }
}
