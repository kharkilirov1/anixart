package com.google.android.play.core.tasks;

import androidx.annotation.NonNull;
import com.google.android.play.core.internal.zzci;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public final class Tasks {
    /* renamed from: a */
    public static <ResultT> ResultT m11005a(@NonNull Task<ResultT> task) throws ExecutionException, InterruptedException {
        zzci.m10890a(task, "Task must not be null");
        if (task.mo11003g()) {
            return (ResultT) m11008d(task);
        }
        zzo zzoVar = new zzo(null);
        Executor executor = TaskExecutors.f20305b;
        task.mo11000d(executor, zzoVar);
        task.mo10998b(executor, zzoVar);
        zzoVar.f20331b.await();
        return (ResultT) m11008d(task);
    }

    /* renamed from: b */
    public static <ResultT> Task<ResultT> m11006b(Exception exc) {
        zzm zzmVar = new zzm();
        zzmVar.m11016i(exc);
        return zzmVar;
    }

    /* renamed from: c */
    public static <ResultT> Task<ResultT> m11007c(ResultT resultt) {
        zzm zzmVar = new zzm();
        zzmVar.m11017j(resultt);
        return zzmVar;
    }

    /* renamed from: d */
    public static <ResultT> ResultT m11008d(Task<ResultT> task) throws ExecutionException {
        if (task.mo11004h()) {
            return task.mo11002f();
        }
        throw new ExecutionException(task.mo11001e());
    }
}
