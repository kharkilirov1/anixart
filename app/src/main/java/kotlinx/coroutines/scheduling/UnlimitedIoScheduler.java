package kotlinx.coroutines.scheduling;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.InternalCoroutinesApi;
import org.jetbrains.annotations.NotNull;

/* compiled from: Dispatcher.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlinx/coroutines/scheduling/UnlimitedIoScheduler;", "Lkotlinx/coroutines/CoroutineDispatcher;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
final class UnlimitedIoScheduler extends CoroutineDispatcher {

    /* renamed from: c */
    @NotNull
    public static final UnlimitedIoScheduler f68367c = new UnlimitedIoScheduler();

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: m */
    public void mo3221m(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        DefaultScheduler defaultScheduler = DefaultScheduler.f68348h;
        defaultScheduler.f68355g.m34359e(runnable, TasksKt.f68366g, false);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @InternalCoroutinesApi
    /* renamed from: p */
    public void mo34014p(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        DefaultScheduler defaultScheduler = DefaultScheduler.f68348h;
        defaultScheduler.f68355g.m34359e(runnable, TasksKt.f68366g, true);
    }
}
