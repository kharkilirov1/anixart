package kotlinx.coroutines.flow;

import androidx.room.util.C0576a;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: SharingStarted.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlinx/coroutines/flow/StartedWhileSubscribed;", "Lkotlinx/coroutines/flow/SharingStarted;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
final class StartedWhileSubscribed implements SharingStarted {
    @Override // kotlinx.coroutines.flow.SharingStarted
    @NotNull
    /* renamed from: a */
    public Flow<SharingCommand> mo34246a(@NotNull StateFlow<Integer> stateFlow) {
        final Flow m34215g = FlowKt.m34215g(stateFlow, new StartedWhileSubscribed$command$1(this, null));
        final StartedWhileSubscribed$command$2 startedWhileSubscribed$command$2 = new StartedWhileSubscribed$command$2(null);
        return FlowKt.m34210b(new Flow<Object>() { // from class: kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$$inlined$unsafeFlow$1
            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            /* renamed from: a */
            public Object mo4140a(@NotNull FlowCollector<? super Object> flowCollector, @NotNull Continuation<? super Unit> continuation) {
                Object mo4140a = Flow.this.mo4140a(new FlowKt__LimitKt$dropWhile$1$1(new Ref.BooleanRef(), flowCollector, startedWhileSubscribed$command$2), continuation);
                return mo4140a == CoroutineSingletons.COROUTINE_SUSPENDED ? mo4140a : Unit.f63088a;
            }
        });
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof StartedWhileSubscribed)) {
            return false;
        }
        StartedWhileSubscribed startedWhileSubscribed = (StartedWhileSubscribed) obj;
        Objects.requireNonNull(startedWhileSubscribed);
        Objects.requireNonNull(startedWhileSubscribed);
        return true;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        int i2 = (int) 0;
        return (i2 * 31) + i2;
    }

    @NotNull
    public String toString() {
        ListBuilder listBuilder = new ListBuilder(2);
        listBuilder.m32086r();
        listBuilder.m32085g(listBuilder.f63176c + listBuilder.f63177d, "replayExpiration=0ms");
        return C0576a.m4118q(C0000a.m24u("SharingStarted.WhileSubscribed("), CollectionsKt.m31989B(CollectionsKt.m32030l(listBuilder), null, null, null, 0, null, null, 63, null), ')');
    }
}
