package com.airbnb.epoxy;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
class HandlerExecutor implements Executor {

    /* renamed from: b */
    public final Handler f6998b;

    public HandlerExecutor(Handler handler) {
        this.f6998b = handler;
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NonNull Runnable runnable) {
        if (Looper.myLooper() == this.f6998b.getLooper()) {
            runnable.run();
        } else {
            this.f6998b.post(runnable);
        }
    }
}
