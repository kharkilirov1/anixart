package kotlinx.coroutines.flow;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: SharingStarted.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlinx/coroutines/flow/SharingStarted;", "", "Companion", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public interface SharingStarted {

    /* compiled from: SharingStarted.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlinx/coroutines/flow/SharingStarted$Companion;", "", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static final class Companion {

        /* renamed from: a */
        public static final /* synthetic */ Companion f68048a = new Companion();

        /* renamed from: b */
        @NotNull
        public static final SharingStarted f68049b = new StartedEagerly();

        /* renamed from: c */
        @NotNull
        public static final SharingStarted f68050c = new StartedLazily();
    }

    @NotNull
    /* renamed from: a */
    Flow<SharingCommand> mo34246a(@NotNull StateFlow<Integer> stateFlow);
}
