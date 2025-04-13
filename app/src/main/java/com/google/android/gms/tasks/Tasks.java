package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* loaded from: classes.dex */
public final class Tasks {
    /* renamed from: a */
    public static <TResult> TResult m9719a(@NonNull Task<TResult> task) throws ExecutionException, InterruptedException {
        Preconditions.m8131f("Must not be called on the main application thread");
        Preconditions.m8132g(task, "Task must not be null");
        if (task.mo9711p()) {
            return (TResult) m9724f(task);
        }
        zzad zzadVar = new zzad(null);
        m9725g(task, zzadVar);
        zzadVar.f17243b.await();
        return (TResult) m9724f(task);
    }

    /* renamed from: b */
    public static <TResult> TResult m9720b(@NonNull Task<TResult> task, long j2, @NonNull TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        Preconditions.m8131f("Must not be called on the main application thread");
        Preconditions.m8132g(task, "Task must not be null");
        Preconditions.m8132g(timeUnit, "TimeUnit must not be null");
        if (task.mo9711p()) {
            return (TResult) m9724f(task);
        }
        zzad zzadVar = new zzad(null);
        m9725g(task, zzadVar);
        if (zzadVar.f17243b.await(j2, timeUnit)) {
            return (TResult) m9724f(task);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    @NonNull
    @Deprecated
    /* renamed from: c */
    public static <TResult> Task<TResult> m9721c(@NonNull Executor executor, @NonNull Callable<TResult> callable) {
        Preconditions.m8132g(executor, "Executor must not be null");
        zzw zzwVar = new zzw();
        executor.execute(new zzz(zzwVar, callable));
        return zzwVar;
    }

    @NonNull
    /* renamed from: d */
    public static <TResult> Task<TResult> m9722d(@NonNull Exception exc) {
        zzw zzwVar = new zzw();
        zzwVar.m9731t(exc);
        return zzwVar;
    }

    @NonNull
    /* renamed from: e */
    public static <TResult> Task<TResult> m9723e(TResult tresult) {
        zzw zzwVar = new zzw();
        zzwVar.m9732u(tresult);
        return zzwVar;
    }

    /* renamed from: f */
    public static <TResult> TResult m9724f(@NonNull Task<TResult> task) throws ExecutionException {
        if (task.mo9712q()) {
            return task.mo9708m();
        }
        if (task.mo9710o()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(task.mo9707l());
    }

    /* renamed from: g */
    public static <T> void m9725g(Task<T> task, zzae<? super T> zzaeVar) {
        Executor executor = TaskExecutors.f17242b;
        task.mo9702g(executor, zzaeVar);
        task.mo9701f(executor, zzaeVar);
        task.mo9696a(executor, zzaeVar);
    }
}
