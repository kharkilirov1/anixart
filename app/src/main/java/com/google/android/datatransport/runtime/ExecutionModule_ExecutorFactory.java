package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class ExecutionModule_ExecutorFactory implements Factory<Executor> {

    public static final class InstanceHolder {

        /* renamed from: a */
        public static final ExecutionModule_ExecutorFactory f9153a = new ExecutionModule_ExecutorFactory();
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new SafeLoggingExecutor(Executors.newSingleThreadExecutor());
    }
}
