package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* compiled from: Executors.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlinx/coroutines/ResumeUndispatchedRunnable;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
final class ResumeUndispatchedRunnable implements Runnable {

    /* renamed from: b */
    @NotNull
    public final CoroutineDispatcher f67047b;

    /* renamed from: c */
    @NotNull
    public final CancellableContinuation<Unit> f67048c;

    /* JADX WARN: Multi-variable type inference failed */
    public ResumeUndispatchedRunnable(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull CancellableContinuation<? super Unit> cancellableContinuation) {
        this.f67047b = coroutineDispatcher;
        this.f67048c = cancellableContinuation;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f67048c.mo33969x(this.f67047b, Unit.f63088a);
    }
}
