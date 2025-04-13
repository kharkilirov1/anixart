package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: CancellableContinuationImpl.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlinx/coroutines/InvokeOnCancel;", "Lkotlinx/coroutines/CancelHandler;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
final class InvokeOnCancel extends CancelHandler {

    /* renamed from: b */
    @NotNull
    public final Function1<Throwable, Unit> f67014b;

    /* JADX WARN: Multi-variable type inference failed */
    public InvokeOnCancel(@NotNull Function1<? super Throwable, Unit> function1) {
        this.f67014b = function1;
    }

    @Override // kotlinx.coroutines.CancelHandlerBase
    /* renamed from: a */
    public void mo33959a(@Nullable Throwable th) {
        this.f67014b.invoke(th);
    }

    @Override // kotlin.jvm.functions.Function1
    public Unit invoke(Throwable th) {
        this.f67014b.invoke(th);
        return Unit.f63088a;
    }

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("InvokeOnCancel[");
        m24u.append(DebugStringsKt.m34022a(this.f67014b));
        m24u.append('@');
        m24u.append(DebugStringsKt.m34023b(this));
        m24u.append(']');
        return m24u.toString();
    }
}
