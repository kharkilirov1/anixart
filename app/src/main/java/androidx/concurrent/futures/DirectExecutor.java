package androidx.concurrent.futures;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
enum DirectExecutor implements Executor {
    /* JADX INFO: Fake field, exist only in values array */
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public String toString() {
        return "DirectExecutor";
    }
}
