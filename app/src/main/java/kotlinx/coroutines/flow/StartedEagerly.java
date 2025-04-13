package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SharingStarted.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlinx/coroutines/flow/StartedEagerly;", "Lkotlinx/coroutines/flow/SharingStarted;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
final class StartedEagerly implements SharingStarted {
    @Override // kotlinx.coroutines.flow.SharingStarted
    @NotNull
    /* renamed from: a */
    public Flow<SharingCommand> mo34246a(@NotNull StateFlow<Integer> stateFlow) {
        final SharingCommand sharingCommand = SharingCommand.START;
        return new Flow<Object>() { // from class: kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2
            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            /* renamed from: a */
            public Object mo4140a(@NotNull FlowCollector<? super Object> flowCollector, @NotNull Continuation<? super Unit> continuation) {
                Object mo4139f = flowCollector.mo4139f(sharingCommand, continuation);
                return mo4139f == CoroutineSingletons.COROUTINE_SUSPENDED ? mo4139f : Unit.f63088a;
            }
        };
    }

    @NotNull
    public String toString() {
        return "SharingStarted.Eagerly";
    }
}
