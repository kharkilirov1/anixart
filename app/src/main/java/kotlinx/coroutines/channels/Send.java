package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.Symbol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AbstractChannel.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlinx/coroutines/channels/Send;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public abstract class Send extends LockFreeLinkedListNode {
    /* renamed from: R */
    public abstract void mo34165R();

    @Nullable
    /* renamed from: S */
    public abstract Object mo34166S();

    /* renamed from: T */
    public abstract void mo34167T(@NotNull Closed<?> closed);

    @Nullable
    /* renamed from: U */
    public abstract Symbol mo34168U(@Nullable LockFreeLinkedListNode.PrepareOp prepareOp);

    /* renamed from: V */
    public void mo34169V() {
    }
}
