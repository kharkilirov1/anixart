package com.airbnb.lottie;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.airbnb.lottie.utils.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* loaded from: classes.dex */
public class LottieTask<T> {

    /* renamed from: e */
    public static Executor f7261e = Executors.newCachedThreadPool();

    /* renamed from: a */
    public final Set<LottieListener<T>> f7262a = new LinkedHashSet(1);

    /* renamed from: b */
    public final Set<LottieListener<Throwable>> f7263b = new LinkedHashSet(1);

    /* renamed from: c */
    public final Handler f7264c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    @Nullable
    public volatile LottieResult<T> f7265d = null;

    public class LottieFutureTask extends FutureTask<LottieResult<T>> {
        public LottieFutureTask(Callable<LottieResult<T>> callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
            if (isCancelled()) {
                return;
            }
            try {
                LottieTask lottieTask = LottieTask.this;
                LottieResult<T> lottieResult = get();
                Executor executor = LottieTask.f7261e;
                lottieTask.m4686c(lottieResult);
            } catch (InterruptedException | ExecutionException e2) {
                LottieTask lottieTask2 = LottieTask.this;
                LottieResult<T> lottieResult2 = new LottieResult<>(e2);
                Executor executor2 = LottieTask.f7261e;
                lottieTask2.m4686c(lottieResult2);
            }
        }
    }

    @RestrictTo
    public LottieTask(Callable<LottieResult<T>> callable) {
        f7261e.execute(new LottieFutureTask(callable));
    }

    /* renamed from: a */
    public synchronized LottieTask<T> m4684a(LottieListener<Throwable> lottieListener) {
        if (this.f7265d != null && this.f7265d.f7260b != null) {
            lottieListener.onResult(this.f7265d.f7260b);
        }
        this.f7263b.add(lottieListener);
        return this;
    }

    /* renamed from: b */
    public synchronized LottieTask<T> m4685b(LottieListener<T> lottieListener) {
        if (this.f7265d != null && this.f7265d.f7259a != null) {
            lottieListener.onResult(this.f7265d.f7259a);
        }
        this.f7262a.add(lottieListener);
        return this;
    }

    /* renamed from: c */
    public final void m4686c(@Nullable LottieResult<T> lottieResult) {
        if (this.f7265d != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.f7265d = lottieResult;
        this.f7264c.post(new Runnable() { // from class: com.airbnb.lottie.LottieTask.1
            @Override // java.lang.Runnable
            public void run() {
                if (LottieTask.this.f7265d == null) {
                    return;
                }
                LottieResult<T> lottieResult2 = LottieTask.this.f7265d;
                T t = lottieResult2.f7259a;
                if (t != null) {
                    LottieTask lottieTask = LottieTask.this;
                    synchronized (lottieTask) {
                        Iterator it = new ArrayList(lottieTask.f7262a).iterator();
                        while (it.hasNext()) {
                            ((LottieListener) it.next()).onResult(t);
                        }
                    }
                    return;
                }
                LottieTask lottieTask2 = LottieTask.this;
                Throwable th = lottieResult2.f7260b;
                synchronized (lottieTask2) {
                    ArrayList arrayList = new ArrayList(lottieTask2.f7263b);
                    if (arrayList.isEmpty()) {
                        Logger.m4834b("Lottie encountered an error but no failure listener was added:", th);
                        return;
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((LottieListener) it2.next()).onResult(th);
                    }
                }
            }
        });
    }
}
