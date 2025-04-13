package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.Symbol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AbstractChannel.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b`\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlinx/coroutines/channels/ReceiveOrClosed;", "E", "", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public interface ReceiveOrClosed<E> {
    @Nullable
    /* renamed from: B */
    Symbol mo34142B(E e2, @Nullable LockFreeLinkedListNode.PrepareOp prepareOp);

    @NotNull
    /* renamed from: c */
    Object mo34183c();

    /* renamed from: u */
    void mo34144u(E e2);
}
