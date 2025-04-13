package androidx.emoji2.text;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
class ConcurrencyHelpers {

    @RequiresApi
    public static class Handler28Impl {
        @DoNotInline
        /* renamed from: a */
        public static Handler m2790a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    /* renamed from: a */
    public static ThreadPoolExecutor m2788a(@NonNull final String str) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactory() { // from class: androidx.emoji2.text.a
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, str);
                thread.setPriority(10);
                return thread;
            }
        });
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* renamed from: b */
    public static Handler m2789b() {
        return Build.VERSION.SDK_INT >= 28 ? Handler28Impl.m2790a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper());
    }
}
