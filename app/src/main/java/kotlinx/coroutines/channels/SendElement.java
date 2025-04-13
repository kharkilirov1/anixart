package kotlinx.coroutines.channels;

import androidx.room.util.C0576a;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImplKt;
import kotlinx.coroutines.DebugStringsKt;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.Symbol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AbstractChannel.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlinx/coroutines/channels/SendElement;", "E", "Lkotlinx/coroutines/channels/Send;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public class SendElement<E> extends Send {

    /* renamed from: e */
    public final E f67374e;

    /* renamed from: f */
    @JvmField
    @NotNull
    public final CancellableContinuation<Unit> f67375f;

    /* JADX WARN: Multi-variable type inference failed */
    public SendElement(E e2, @NotNull CancellableContinuation<? super Unit> cancellableContinuation) {
        this.f67374e = e2;
        this.f67375f = cancellableContinuation;
    }

    @Override // kotlinx.coroutines.channels.Send
    /* renamed from: R */
    public void mo34165R() {
        this.f67375f.mo33964G(CancellableContinuationImplKt.f66946a);
    }

    @Override // kotlinx.coroutines.channels.Send
    /* renamed from: S */
    public E mo34166S() {
        return this.f67374e;
    }

    @Override // kotlinx.coroutines.channels.Send
    /* renamed from: T */
    public void mo34167T(@NotNull Closed<?> closed) {
        this.f67375f.mo31877j(ResultKt.m31891a(closed.m34182X()));
    }

    @Override // kotlinx.coroutines.channels.Send
    @Nullable
    /* renamed from: U */
    public Symbol mo34168U(@Nullable LockFreeLinkedListNode.PrepareOp prepareOp) {
        if (this.f67375f.mo33965d(Unit.f63088a, prepareOp == null ? null : prepareOp.f68278c) == null) {
            return null;
        }
        if (prepareOp != null) {
            prepareOp.f68278c.mo34298e(prepareOp);
        }
        return CancellableContinuationImplKt.f66946a;
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('@');
        sb.append(DebugStringsKt.m34023b(this));
        sb.append('(');
        return C0576a.m4117p(sb, this.f67374e, ')');
    }
}
