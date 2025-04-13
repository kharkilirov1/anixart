package kotlinx.coroutines.channels;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.AbstractSendChannel;
import kotlinx.coroutines.internal.LockFreeLinkedListHead;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.internal.UndeliveredElementException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LinkedListChannel.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlinx/coroutines/channels/LinkedListChannel;", "E", "Lkotlinx/coroutines/channels/AbstractChannel;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public class LinkedListChannel<E> extends AbstractChannel<E> {
    public LinkedListChannel(@Nullable Function1<? super E, Unit> function1) {
        super(function1);
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    /* renamed from: A */
    public void mo34126A(@NotNull Object obj, @NotNull Closed<?> closed) {
        UndeliveredElementException undeliveredElementException = null;
        if (obj != null) {
            if (obj instanceof ArrayList) {
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size() - 1;
                if (size >= 0) {
                    UndeliveredElementException undeliveredElementException2 = null;
                    while (true) {
                        int i2 = size - 1;
                        Send send = (Send) arrayList.get(size);
                        if (send instanceof AbstractSendChannel.SendBuffered) {
                            Function1<E, Unit> function1 = this.f67109b;
                            undeliveredElementException2 = function1 == null ? null : OnUndeliveredElementKt.m34319c(function1, ((AbstractSendChannel.SendBuffered) send).f67112e, undeliveredElementException2);
                        } else {
                            send.mo34167T(closed);
                        }
                        if (i2 < 0) {
                            break;
                        } else {
                            size = i2;
                        }
                    }
                    undeliveredElementException = undeliveredElementException2;
                }
            } else {
                Send send2 = (Send) obj;
                if (send2 instanceof AbstractSendChannel.SendBuffered) {
                    Function1<E, Unit> function12 = this.f67109b;
                    if (function12 != null) {
                        undeliveredElementException = OnUndeliveredElementKt.m34319c(function12, ((AbstractSendChannel.SendBuffered) send2).f67112e, null);
                    }
                } else {
                    send2.mo34167T(closed);
                }
            }
        }
        if (undeliveredElementException != null) {
            throw undeliveredElementException;
        }
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    /* renamed from: h */
    public final boolean mo34158h() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    /* renamed from: i */
    public final boolean mo34159i() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    @NotNull
    /* renamed from: k */
    public Object mo34161k(E e2) {
        ReceiveOrClosed receiveOrClosed;
        do {
            Object mo34161k = super.mo34161k(e2);
            Symbol symbol = AbstractChannelKt.f67103b;
            if (mo34161k == symbol) {
                return symbol;
            }
            if (mo34161k != AbstractChannelKt.f67104c) {
                if (mo34161k instanceof Closed) {
                    return mo34161k;
                }
                throw new IllegalStateException(Intrinsics.m32187p("Invalid offerInternal result ", mo34161k).toString());
            }
            LockFreeLinkedListHead lockFreeLinkedListHead = this.f67110c;
            AbstractSendChannel.SendBuffered sendBuffered = new AbstractSendChannel.SendBuffered(e2);
            while (true) {
                LockFreeLinkedListNode m34292K = lockFreeLinkedListHead.m34292K();
                if (m34292K instanceof ReceiveOrClosed) {
                    receiveOrClosed = (ReceiveOrClosed) m34292K;
                    break;
                }
                if (m34292K.m34287E(sendBuffered, lockFreeLinkedListHead)) {
                    receiveOrClosed = null;
                    break;
                }
            }
            if (receiveOrClosed == null) {
                return AbstractChannelKt.f67103b;
            }
        } while (!(receiveOrClosed instanceof Closed));
        return receiveOrClosed;
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    /* renamed from: t */
    public final boolean mo34136t() {
        return true;
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    /* renamed from: u */
    public final boolean mo34137u() {
        return true;
    }
}
