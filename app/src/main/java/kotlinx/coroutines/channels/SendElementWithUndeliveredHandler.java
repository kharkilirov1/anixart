package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: AbstractChannel.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlinx/coroutines/channels/SendElementWithUndeliveredHandler;", "E", "Lkotlinx/coroutines/channels/SendElement;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class SendElementWithUndeliveredHandler<E> extends SendElement<E> {

    /* renamed from: g */
    @JvmField
    @NotNull
    public final Function1<E, Unit> f67376g;

    /* JADX WARN: Multi-variable type inference failed */
    public SendElementWithUndeliveredHandler(E e2, @NotNull CancellableContinuation<? super Unit> cancellableContinuation, @NotNull Function1<? super E, Unit> function1) {
        super(e2, cancellableContinuation);
        this.f67376g = function1;
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    /* renamed from: O */
    public boolean mo34192O() {
        if (!super.mo34192O()) {
            return false;
        }
        mo34169V();
        return true;
    }

    @Override // kotlinx.coroutines.channels.Send
    /* renamed from: V */
    public void mo34169V() {
        OnUndeliveredElementKt.m34318b(this.f67376g, this.f67374e, this.f67375f.getF68225c());
    }
}
