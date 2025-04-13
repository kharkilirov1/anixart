package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.annotations.NonNull;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes3.dex */
public final class NewThreadScheduler extends Scheduler {

    /* renamed from: d */
    public static final RxThreadFactory f62668d = new RxThreadFactory("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())));

    /* renamed from: c */
    public final ThreadFactory f62669c = f62668d;

    @Override // io.reactivex.Scheduler
    @NonNull
    /* renamed from: a */
    public Scheduler.Worker mo31374a() {
        return new NewThreadWorker(this.f62669c);
    }
}
