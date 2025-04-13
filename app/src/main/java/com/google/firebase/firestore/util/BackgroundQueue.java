package com.google.firebase.firestore.util;

import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;

/* loaded from: classes2.dex */
public class BackgroundQueue implements Executor {

    /* renamed from: b */
    public Semaphore f23013b = new Semaphore(0);

    /* renamed from: c */
    public int f23014c = 0;

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f23014c++;
        ((ThrottledForwardingExecutor) Executors.f23020c).execute(new RunnableC2135c(this, runnable, 1));
    }
}
