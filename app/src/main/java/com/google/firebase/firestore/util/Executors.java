package com.google.firebase.firestore.util;

import android.os.AsyncTask;
import androidx.window.layout.ExecutorC0688c;
import com.google.android.gms.tasks.TaskExecutors;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class Executors {

    /* renamed from: a */
    public static final Executor f23018a = TaskExecutors.f17241a;

    /* renamed from: b */
    public static final Executor f23019b = ExecutorC0688c.f6812d;

    /* renamed from: c */
    public static final Executor f23020c = new ThrottledForwardingExecutor(4, AsyncTask.THREAD_POOL_EXECUTOR);
}
