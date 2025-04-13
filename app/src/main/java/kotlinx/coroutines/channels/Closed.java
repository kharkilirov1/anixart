package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlinx.coroutines.CancellableContinuationImplKt;
import kotlinx.coroutines.DebugStringsKt;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.Symbol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: AbstractChannel.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, m31884d2 = {"Lkotlinx/coroutines/channels/Closed;", "E", "Lkotlinx/coroutines/channels/Send;", "Lkotlinx/coroutines/channels/ReceiveOrClosed;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class Closed<E> extends Send implements ReceiveOrClosed<E> {

    /* renamed from: e */
    @JvmField
    @Nullable
    public final Throwable f67351e;

    public Closed(@Nullable Throwable th) {
        this.f67351e = th;
    }

    @Override // kotlinx.coroutines.channels.ReceiveOrClosed
    @NotNull
    /* renamed from: B */
    public Symbol mo34142B(E e2, @Nullable LockFreeLinkedListNode.PrepareOp prepareOp) {
        Symbol symbol = CancellableContinuationImplKt.f66946a;
        if (prepareOp != null) {
            prepareOp.f68278c.mo34298e(prepareOp);
        }
        return symbol;
    }

    @Override // kotlinx.coroutines.channels.Send
    /* renamed from: R */
    public void mo34165R() {
    }

    @Override // kotlinx.coroutines.channels.Send
    /* renamed from: S */
    public Object mo34166S() {
        return this;
    }

    @Override // kotlinx.coroutines.channels.Send
    /* renamed from: T */
    public void mo34167T(@NotNull Closed<?> closed) {
    }

    @Override // kotlinx.coroutines.channels.Send
    @NotNull
    /* renamed from: U */
    public Symbol mo34168U(@Nullable LockFreeLinkedListNode.PrepareOp prepareOp) {
        Symbol symbol = CancellableContinuationImplKt.f66946a;
        if (prepareOp != null) {
            prepareOp.f68278c.mo34298e(prepareOp);
        }
        return symbol;
    }

    @NotNull
    /* renamed from: W */
    public final Throwable m34181W() {
        Throwable th = this.f67351e;
        return th == null ? new ClosedReceiveChannelException("Channel was closed") : th;
    }

    @NotNull
    /* renamed from: X */
    public final Throwable m34182X() {
        Throwable th = this.f67351e;
        return th == null ? new ClosedSendChannelException("Channel was closed") : th;
    }

    @Override // kotlinx.coroutines.channels.ReceiveOrClosed
    /* renamed from: c */
    public Object mo34183c() {
        return this;
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("Closed@");
        m24u.append(DebugStringsKt.m34023b(this));
        m24u.append('[');
        m24u.append(this.f67351e);
        m24u.append(']');
        return m24u.toString();
    }

    @Override // kotlinx.coroutines.channels.ReceiveOrClosed
    /* renamed from: u */
    public void mo34144u(E e2) {
    }
}
