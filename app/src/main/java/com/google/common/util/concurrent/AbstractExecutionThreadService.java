package com.google.common.util.concurrent;

import com.google.android.exoplayer2.extractor.C1008a;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Supplier;
import com.google.common.util.concurrent.Service;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

@GwtIncompatible
/* loaded from: classes2.dex */
public abstract class AbstractExecutionThreadService implements Service {

    /* renamed from: b */
    public static final Logger f22042b = Logger.getLogger(AbstractExecutionThreadService.class.getName());

    /* renamed from: a */
    public final Service f22043a = new AbstractService() { // from class: com.google.common.util.concurrent.AbstractExecutionThreadService.1

        /* renamed from: com.google.common.util.concurrent.AbstractExecutionThreadService$1$1, reason: invalid class name */
        class AnonymousClass1 implements Supplier<String> {
            @Override // com.google.common.base.Supplier
            public String get() {
                throw null;
            }
        }

        /* renamed from: com.google.common.util.concurrent.AbstractExecutionThreadService$1$2, reason: invalid class name */
        class AnonymousClass2 implements Runnable {
            /* JADX WARN: Code restructure failed: missing block: B:5:?, code lost:
            
                throw null;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void run() {
                /*
                    r1 = this;
                    r0 = 0
                    throw r0     // Catch: java.lang.Throwable -> L2
                L2:
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.AbstractExecutionThreadService.C19471.AnonymousClass2.run():void");
            }
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public String toString() {
            return AbstractExecutionThreadService.this.toString();
        }
    };

    /* renamed from: com.google.common.util.concurrent.AbstractExecutionThreadService$2 */
    class ExecutorC19482 implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            throw null;
        }
    }

    @Override // com.google.common.util.concurrent.Service
    /* renamed from: a */
    public final Service.State mo12136a() {
        return this.f22043a.mo12136a();
    }

    /* renamed from: b */
    public String m12137b() {
        return getClass().getSimpleName();
    }

    public String toString() {
        String m12137b = m12137b();
        String valueOf = String.valueOf(mo12136a());
        return C1008a.m6437d(valueOf.length() + m12137b.length() + 3, m12137b, " [", valueOf, "]");
    }
}
