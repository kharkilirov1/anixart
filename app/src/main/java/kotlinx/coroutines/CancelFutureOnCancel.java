package kotlinx.coroutines;

import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: Future.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlinx/coroutines/CancelFutureOnCancel;", "Lkotlinx/coroutines/CancelHandler;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
final class CancelFutureOnCancel extends CancelHandler {

    /* renamed from: b */
    @NotNull
    public final Future<?> f66940b;

    public CancelFutureOnCancel(@NotNull Future<?> future) {
        this.f66940b = future;
    }

    @Override // kotlinx.coroutines.CancelHandlerBase
    /* renamed from: a */
    public void mo33959a(@Nullable Throwable th) {
        if (th != null) {
            this.f66940b.cancel(false);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public Unit invoke(Throwable th) {
        if (th != null) {
            this.f66940b.cancel(false);
        }
        return Unit.f63088a;
    }

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("CancelFutureOnCancel[");
        m24u.append(this.f66940b);
        m24u.append(']');
        return m24u.toString();
    }
}
