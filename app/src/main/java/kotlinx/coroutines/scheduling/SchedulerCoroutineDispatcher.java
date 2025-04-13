package kotlinx.coroutines.scheduling;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* compiled from: Dispatcher.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlinx/coroutines/scheduling/SchedulerCoroutineDispatcher;", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public class SchedulerCoroutineDispatcher extends ExecutorCoroutineDispatcher {

    /* renamed from: c */
    public final int f68351c;

    /* renamed from: d */
    public final int f68352d;

    /* renamed from: e */
    public final long f68353e;

    /* renamed from: f */
    @NotNull
    public final String f68354f;

    /* renamed from: g */
    @NotNull
    public CoroutineScheduler f68355g;

    public SchedulerCoroutineDispatcher() {
        this(TasksKt.f68361b, TasksKt.f68362c, TasksKt.f68363d, "CoroutineScheduler");
    }

    public void close() {
        this.f68355g.close();
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: m */
    public void mo3221m(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        CoroutineScheduler.m34355g(this.f68355g, runnable, null, false, 6);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: p */
    public void mo34014p(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        CoroutineScheduler.m34355g(this.f68355g, runnable, null, true, 2);
    }

    public SchedulerCoroutineDispatcher(int i2, int i3, long j2, @NotNull String str) {
        this.f68351c = i2;
        this.f68352d = i3;
        this.f68353e = j2;
        this.f68354f = str;
        this.f68355g = new CoroutineScheduler(i2, i3, j2, str);
    }
}
