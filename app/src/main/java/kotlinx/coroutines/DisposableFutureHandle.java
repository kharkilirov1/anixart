package kotlinx.coroutines;

import java.util.concurrent.Future;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* compiled from: Executors.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlinx/coroutines/DisposableFutureHandle;", "Lkotlinx/coroutines/DisposableHandle;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
final class DisposableFutureHandle implements DisposableHandle {

    /* renamed from: b */
    @NotNull
    public final Future<?> f66990b;

    public DisposableFutureHandle(@NotNull Future<?> future) {
        this.f66990b = future;
    }

    @Override // kotlinx.coroutines.DisposableHandle
    /* renamed from: f */
    public void mo34038f() {
        this.f66990b.cancel(false);
    }

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("DisposableFutureHandle[");
        m24u.append(this.f66990b);
        m24u.append(']');
        return m24u.toString();
    }
}
