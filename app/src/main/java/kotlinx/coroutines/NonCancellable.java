package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: NonCancellable.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlinx/coroutines/NonCancellable;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/Job;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class NonCancellable extends AbstractCoroutineContextElement implements Job {
    static {
        new NonCancellable();
    }

    public NonCancellable() {
        super(Job.Key.f67019b);
    }

    @Override // kotlinx.coroutines.Job
    @Deprecated
    @NotNull
    /* renamed from: X */
    public ChildHandle mo34060X(@NotNull ChildJob childJob) {
        return NonDisposableHandle.f67044b;
    }

    @Override // kotlinx.coroutines.Job
    /* renamed from: a */
    public boolean mo33950a() {
        return true;
    }

    @Override // kotlinx.coroutines.Job
    @Deprecated
    /* renamed from: b */
    public void mo34061b(@Nullable CancellationException cancellationException) {
    }

    @Override // kotlinx.coroutines.Job
    public boolean isCancelled() {
        return false;
    }

    @Override // kotlinx.coroutines.Job
    @Deprecated
    @Nullable
    /* renamed from: k */
    public Object mo34062k(@NotNull Continuation<? super Unit> continuation) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // kotlinx.coroutines.Job
    @Deprecated
    @NotNull
    /* renamed from: n */
    public DisposableHandle mo34063n(boolean z, boolean z2, @NotNull Function1<? super Throwable, Unit> function1) {
        return NonDisposableHandle.f67044b;
    }

    @Override // kotlinx.coroutines.Job
    @Deprecated
    @NotNull
    /* renamed from: o */
    public CancellationException mo34064o() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // kotlinx.coroutines.Job
    @Deprecated
    public boolean start() {
        return false;
    }

    @NotNull
    public String toString() {
        return "NonCancellable";
    }
}
