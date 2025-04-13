package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: JobSupport.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlinx/coroutines/InvokeOnCancelling;", "Lkotlinx/coroutines/JobCancellingNode;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
final class InvokeOnCancelling extends JobCancellingNode {

    /* renamed from: g */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f67015g = AtomicIntegerFieldUpdater.newUpdater(InvokeOnCancelling.class, "_invoked");

    @NotNull
    private volatile /* synthetic */ int _invoked = 0;

    /* renamed from: f */
    @NotNull
    public final Function1<Throwable, Unit> f67016f;

    /* JADX WARN: Multi-variable type inference failed */
    public InvokeOnCancelling(@NotNull Function1<? super Throwable, Unit> function1) {
        this.f67016f = function1;
    }

    @Override // kotlinx.coroutines.CompletionHandlerBase
    /* renamed from: R */
    public void mo33958R(@Nullable Throwable th) {
        if (f67015g.compareAndSet(this, 0, 1)) {
            this.f67016f.invoke(th);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        mo33958R(th);
        return Unit.f63088a;
    }
}
