package com.google.common.util.concurrent;

import androidx.room.util.C0576a;
import com.google.android.exoplayer2.extractor.C1008a;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Supplier;
import com.google.common.util.concurrent.Service;
import java.util.concurrent.Executor;

@GwtIncompatible
/* loaded from: classes2.dex */
public abstract class AbstractIdleService implements Service {

    /* renamed from: a */
    public final Supplier<String> f22078a = new ThreadNameSupplier(null);

    /* renamed from: b */
    public final Service f22079b = new DelegateService(null);

    /* renamed from: com.google.common.util.concurrent.AbstractIdleService$1 */
    class ExecutorC19521 implements Executor {

        /* renamed from: b */
        public final /* synthetic */ AbstractIdleService f22080b;

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            MoreExecutors.m12202b(this.f22080b.f22078a.get(), runnable).start();
        }
    }

    public final class DelegateService extends AbstractService {

        /* renamed from: com.google.common.util.concurrent.AbstractIdleService$DelegateService$1 */
        class RunnableC19531 implements Runnable {
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
                throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.AbstractIdleService.DelegateService.RunnableC19531.run():void");
            }
        }

        /* renamed from: com.google.common.util.concurrent.AbstractIdleService$DelegateService$2 */
        class RunnableC19542 implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ DelegateService f22082b;

            @Override // java.lang.Runnable
            public void run() {
                try {
                    AbstractIdleService.this.m12159b();
                    this.f22082b.m12168e();
                } catch (Throwable th) {
                    this.f22082b.m12167d(th);
                }
            }
        }

        public DelegateService(ExecutorC19521 executorC19521) {
        }

        @Override // com.google.common.util.concurrent.AbstractService
        public String toString() {
            return AbstractIdleService.this.toString();
        }
    }

    public final class ThreadNameSupplier implements Supplier<String> {
        public ThreadNameSupplier(ExecutorC19521 executorC19521) {
        }

        @Override // com.google.common.base.Supplier
        public String get() {
            String simpleName = AbstractIdleService.this.getClass().getSimpleName();
            String valueOf = String.valueOf(AbstractIdleService.this.mo12136a());
            return C0576a.m4115n(valueOf.length() + simpleName.length() + 1, simpleName, " ", valueOf);
        }
    }

    @Override // com.google.common.util.concurrent.Service
    /* renamed from: a */
    public final Service.State mo12136a() {
        return this.f22079b.mo12136a();
    }

    /* renamed from: b */
    public abstract void m12159b() throws Exception;

    public String toString() {
        String simpleName = getClass().getSimpleName();
        String valueOf = String.valueOf(mo12136a());
        return C1008a.m6437d(valueOf.length() + simpleName.length() + 3, simpleName, " [", valueOf, "]");
    }
}
