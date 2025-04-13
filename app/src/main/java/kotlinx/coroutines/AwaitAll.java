package kotlinx.coroutines;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Await.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Lkotlinx/coroutines/AwaitAll;", "T", "", "AwaitAllNode", "DisposeHandlersOnCancel", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
final class AwaitAll<T> {

    /* renamed from: a */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f66930a = AtomicIntegerFieldUpdater.newUpdater(AwaitAll.class, "notCompletedCount");

    @NotNull
    public volatile /* synthetic */ int notCompletedCount;

    /* compiled from: Await.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlinx/coroutines/AwaitAll$AwaitAllNode;", "Lkotlinx/coroutines/JobNode;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
    public final class AwaitAllNode extends JobNode {

        @NotNull
        private volatile /* synthetic */ Object _disposer;

        @Override // kotlinx.coroutines.CompletionHandlerBase
        /* renamed from: R */
        public void mo33958R(@Nullable Throwable th) {
            if (th != null) {
                throw null;
            }
            if (AwaitAll.f66930a.decrementAndGet(null) != 0) {
                return;
            }
            Objects.requireNonNull(null);
            throw null;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            mo33958R(th);
            return Unit.f63088a;
        }
    }

    /* compiled from: Await.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlinx/coroutines/AwaitAll$DisposeHandlersOnCancel;", "Lkotlinx/coroutines/CancelHandler;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
    public final class DisposeHandlersOnCancel extends CancelHandler {
        @Override // kotlinx.coroutines.CancelHandlerBase
        /* renamed from: a */
        public void mo33959a(@Nullable Throwable th) {
            throw null;
        }

        @Override // kotlin.jvm.functions.Function1
        public Unit invoke(Throwable th) {
            throw null;
        }

        @NotNull
        public String toString() {
            return "DisposeHandlersOnCancel[null]";
        }
    }
}
