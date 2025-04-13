package androidx.lifecycle;

import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.arch.core.executor.ArchTaskExecutor;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

@RestrictTo
/* loaded from: classes.dex */
public abstract class ComputableLiveData<T> {

    /* renamed from: a */
    public final Executor f4554a;

    /* renamed from: b */
    public final LiveData<T> f4555b;

    /* renamed from: c */
    public final AtomicBoolean f4556c;

    /* renamed from: d */
    public final AtomicBoolean f4557d;

    /* renamed from: e */
    @VisibleForTesting
    public final Runnable f4558e;

    /* renamed from: androidx.lifecycle.ComputableLiveData$3 */
    public class RunnableC03983 implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ ComputableLiveData f4561b;

        @Override // java.lang.Runnable
        @MainThread
        public void run() {
            boolean m3210e = this.f4561b.f4555b.m3210e();
            if (this.f4561b.f4556c.compareAndSet(false, true) && m3210e) {
                ComputableLiveData computableLiveData = this.f4561b;
                computableLiveData.f4554a.execute(computableLiveData.f4558e);
            }
        }
    }

    public ComputableLiveData() {
        Executor executor = ArchTaskExecutor.f1687c;
        this.f4556c = new AtomicBoolean(true);
        this.f4557d = new AtomicBoolean(false);
        this.f4558e = new Runnable() { // from class: androidx.lifecycle.ComputableLiveData.2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            @WorkerThread
            public void run() {
                do {
                    boolean z = false;
                    if (ComputableLiveData.this.f4557d.compareAndSet(false, true)) {
                        Object obj = null;
                        boolean z2 = false;
                        while (ComputableLiveData.this.f4556c.compareAndSet(true, false)) {
                            try {
                                obj = ComputableLiveData.this.m3178a();
                                z2 = true;
                            } catch (Throwable th) {
                                ComputableLiveData.this.f4557d.set(false);
                                throw th;
                            }
                        }
                        if (z2) {
                            ComputableLiveData.this.f4555b.mo3214j(obj);
                        }
                        ComputableLiveData.this.f4557d.set(false);
                        z = z2;
                    }
                    if (!z) {
                        return;
                    }
                } while (ComputableLiveData.this.f4556c.get());
            }
        };
        this.f4554a = executor;
        this.f4555b = (LiveData<T>) new LiveData<Object>() { // from class: androidx.lifecycle.ComputableLiveData.1
            @Override // androidx.lifecycle.LiveData
            /* renamed from: h */
            public void mo3179h() {
                ComputableLiveData computableLiveData = ComputableLiveData.this;
                computableLiveData.f4554a.execute(computableLiveData.f4558e);
            }
        };
    }

    @WorkerThread
    /* renamed from: a */
    public abstract T m3178a();
}
