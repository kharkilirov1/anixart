package com.bumptech.glide.util;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class Executors {

    /* renamed from: a */
    public static final Executor f8839a = new Executor() { // from class: com.bumptech.glide.util.Executors.1

        /* renamed from: b */
        public final Handler f8841b = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            this.f8841b.post(runnable);
        }
    };

    /* renamed from: b */
    public static final Executor f8840b = new Executor() { // from class: com.bumptech.glide.util.Executors.2
        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            runnable.run();
        }
    };
}
