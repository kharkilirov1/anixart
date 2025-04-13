package io.reactivex.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.annotations.NonNull;
import io.reactivex.internal.schedulers.ComputationScheduler;
import io.reactivex.internal.schedulers.IoScheduler;
import io.reactivex.internal.schedulers.NewThreadScheduler;
import io.reactivex.internal.schedulers.SingleScheduler;
import io.reactivex.internal.schedulers.TrampolineScheduler;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class Schedulers {

    /* renamed from: a */
    @NonNull
    public static final Scheduler f62899a = RxJavaPlugins.m31847a(new SingleTask());

    /* renamed from: b */
    @NonNull
    public static final Scheduler f62900b = RxJavaPlugins.m31847a(new ComputationTask());

    /* renamed from: c */
    @NonNull
    public static final Scheduler f62901c = RxJavaPlugins.m31847a(new IOTask());

    public static final class ComputationHolder {

        /* renamed from: a */
        public static final Scheduler f62902a = new ComputationScheduler();
    }

    public static final class ComputationTask implements Callable<Scheduler> {
        @Override // java.util.concurrent.Callable
        public Scheduler call() throws Exception {
            return ComputationHolder.f62902a;
        }
    }

    public static final class IOTask implements Callable<Scheduler> {
        @Override // java.util.concurrent.Callable
        public Scheduler call() throws Exception {
            return IoHolder.f62903a;
        }
    }

    public static final class IoHolder {

        /* renamed from: a */
        public static final Scheduler f62903a = new IoScheduler();
    }

    public static final class NewThreadHolder {

        /* renamed from: a */
        public static final Scheduler f62904a = new NewThreadScheduler();
    }

    public static final class NewThreadTask implements Callable<Scheduler> {
        @Override // java.util.concurrent.Callable
        public Scheduler call() throws Exception {
            return NewThreadHolder.f62904a;
        }
    }

    public static final class SingleHolder {

        /* renamed from: a */
        public static final Scheduler f62905a = new SingleScheduler();
    }

    public static final class SingleTask implements Callable<Scheduler> {
        @Override // java.util.concurrent.Callable
        public Scheduler call() throws Exception {
            return SingleHolder.f62905a;
        }
    }

    static {
        TrampolineScheduler trampolineScheduler = TrampolineScheduler.f62705c;
        TrampolineScheduler trampolineScheduler2 = TrampolineScheduler.f62705c;
        RxJavaPlugins.m31847a(new NewThreadTask());
    }

    public Schedulers() {
        throw new IllegalStateException("No instances!");
    }
}
