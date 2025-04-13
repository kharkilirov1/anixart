package kotlinx.coroutines.channels;

import androidx.room.util.C0576a;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancellableContinuationImplKt;
import kotlinx.coroutines.CancellableContinuationKt;
import kotlinx.coroutines.DebugStringsKt;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.internal.AtomicKt;
import kotlinx.coroutines.internal.InlineList;
import kotlinx.coroutines.internal.LockFreeLinkedListHead;
import kotlinx.coroutines.internal.LockFreeLinkedListKt;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.LockFreeLinkedList_commonKt;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.intrinsics.CancellableKt;
import kotlinx.coroutines.selects.SelectInstance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: AbstractChannel.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, m31884d2 = {"Lkotlinx/coroutines/channels/AbstractSendChannel;", "E", "Lkotlinx/coroutines/channels/SendChannel;", "SendBuffered", "SendBufferedDesc", "SendSelect", "TryOfferDesc", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public abstract class AbstractSendChannel<E> implements SendChannel<E> {

    /* renamed from: d */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f67108d = AtomicReferenceFieldUpdater.newUpdater(AbstractSendChannel.class, Object.class, "onCloseHandler");

    /* renamed from: b */
    @JvmField
    @Nullable
    public final Function1<E, Unit> f67109b;

    /* renamed from: c */
    @NotNull
    public final LockFreeLinkedListHead f67110c = new LockFreeLinkedListHead();

    @NotNull
    private volatile /* synthetic */ Object onCloseHandler = null;

    /* compiled from: AbstractChannel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlinx/coroutines/channels/AbstractSendChannel$SendBuffered;", "E", "Lkotlinx/coroutines/channels/Send;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static final class SendBuffered<E> extends Send {

        /* renamed from: e */
        @JvmField
        public final E f67112e;

        public SendBuffered(E e2) {
            this.f67112e = e2;
        }

        @Override // kotlinx.coroutines.channels.Send
        /* renamed from: R */
        public void mo34165R() {
        }

        @Override // kotlinx.coroutines.channels.Send
        @Nullable
        /* renamed from: S, reason: from getter */
        public Object getF67112e() {
            return this.f67112e;
        }

        @Override // kotlinx.coroutines.channels.Send
        /* renamed from: T */
        public void mo34167T(@NotNull Closed<?> closed) {
        }

        @Override // kotlinx.coroutines.channels.Send
        @Nullable
        /* renamed from: U */
        public Symbol mo34168U(@Nullable LockFreeLinkedListNode.PrepareOp prepareOp) {
            Symbol symbol = CancellableContinuationImplKt.f66946a;
            if (prepareOp != null) {
                prepareOp.f68278c.mo34298e(prepareOp);
            }
            return symbol;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        @NotNull
        public String toString() {
            StringBuilder m24u = C0000a.m24u("SendBuffered@");
            m24u.append(DebugStringsKt.m34023b(this));
            m24u.append('(');
            return C0576a.m4117p(m24u, this.f67112e, ')');
        }
    }

    /* compiled from: AbstractChannel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0012\u0018\u0000*\u0004\b\u0001\u0010\u00012\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0002j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003`\u0004¨\u0006\u0005"}, m31884d2 = {"Lkotlinx/coroutines/channels/AbstractSendChannel$SendBufferedDesc;", "E", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc;", "Lkotlinx/coroutines/channels/AbstractSendChannel$SendBuffered;", "Lkotlinx/coroutines/internal/AddLastDesc;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static class SendBufferedDesc<E> extends LockFreeLinkedListNode.AddLastDesc<SendBuffered<? extends E>> {
        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        @Nullable
        /* renamed from: c */
        public Object mo34146c(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode) {
            if (lockFreeLinkedListNode instanceof Closed) {
                return lockFreeLinkedListNode;
            }
            if (lockFreeLinkedListNode instanceof ReceiveOrClosed) {
                return AbstractChannelKt.f67104c;
            }
            return null;
        }
    }

    /* compiled from: AbstractChannel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u0001*\u0004\b\u0002\u0010\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, m31884d2 = {"Lkotlinx/coroutines/channels/AbstractSendChannel$SendSelect;", "E", "R", "Lkotlinx/coroutines/channels/Send;", "Lkotlinx/coroutines/DisposableHandle;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static final class SendSelect<E, R> extends Send implements DisposableHandle {

        /* renamed from: e */
        public final E f67113e;

        /* renamed from: f */
        @JvmField
        @NotNull
        public final AbstractSendChannel<E> f67114f;

        /* renamed from: g */
        @JvmField
        @NotNull
        public final SelectInstance<R> f67115g;

        /* renamed from: h */
        @JvmField
        @NotNull
        public final Function2<SendChannel<? super E>, Continuation<? super R>, Object> f67116h;

        @Override // kotlinx.coroutines.channels.Send
        /* renamed from: R */
        public void mo34165R() {
            CancellableKt.m34350d(this.f67116h, this.f67114f, this.f67115g.mo34395p(), null);
        }

        @Override // kotlinx.coroutines.channels.Send
        /* renamed from: S */
        public E getF67112e() {
            return this.f67113e;
        }

        @Override // kotlinx.coroutines.channels.Send
        /* renamed from: T */
        public void mo34167T(@NotNull Closed<?> closed) {
            if (this.f67115g.mo34393e()) {
                this.f67115g.mo34396y(closed.m34182X());
            }
        }

        @Override // kotlinx.coroutines.channels.Send
        @Nullable
        /* renamed from: U */
        public Symbol mo34168U(@Nullable LockFreeLinkedListNode.PrepareOp prepareOp) {
            return (Symbol) this.f67115g.mo34392b(prepareOp);
        }

        @Override // kotlinx.coroutines.channels.Send
        /* renamed from: V */
        public void mo34169V() {
            Function1<E, Unit> function1 = this.f67114f.f67109b;
            if (function1 == null) {
                return;
            }
            OnUndeliveredElementKt.m34318b(function1, this.f67113e, this.f67115g.mo34395p().getF66944f());
        }

        @Override // kotlinx.coroutines.DisposableHandle
        /* renamed from: f */
        public void mo34038f() {
            if (mo34192O()) {
                mo34169V();
            }
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        @NotNull
        public String toString() {
            StringBuilder m24u = C0000a.m24u("SendSelect@");
            m24u.append(DebugStringsKt.m34023b(this));
            m24u.append('(');
            m24u.append(this.f67113e);
            m24u.append(")[");
            m24u.append(this.f67114f);
            m24u.append(", ");
            m24u.append(this.f67115g);
            m24u.append(']');
            return m24u.toString();
        }
    }

    /* compiled from: AbstractChannel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u0000*\u0004\b\u0001\u0010\u00012\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0002j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003`\u0004¨\u0006\u0005"}, m31884d2 = {"Lkotlinx/coroutines/channels/AbstractSendChannel$TryOfferDesc;", "E", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$RemoveFirstDesc;", "Lkotlinx/coroutines/channels/ReceiveOrClosed;", "Lkotlinx/coroutines/internal/RemoveFirstDesc;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static final class TryOfferDesc<E> extends LockFreeLinkedListNode.RemoveFirstDesc<ReceiveOrClosed<? super E>> {

        /* renamed from: e */
        @JvmField
        public final E f67117e;

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.RemoveFirstDesc, kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        @Nullable
        /* renamed from: c */
        public Object mo34146c(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode) {
            if (lockFreeLinkedListNode instanceof Closed) {
                return lockFreeLinkedListNode;
            }
            if (lockFreeLinkedListNode instanceof ReceiveOrClosed) {
                return null;
            }
            return AbstractChannelKt.f67104c;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        @Nullable
        /* renamed from: h */
        public Object mo34147h(@NotNull LockFreeLinkedListNode.PrepareOp prepareOp) {
            Symbol mo34142B = ((ReceiveOrClosed) prepareOp.f68276a).mo34142B(this.f67117e, prepareOp);
            if (mo34142B == null) {
                return LockFreeLinkedList_commonKt.f68282a;
            }
            Object obj = AtomicKt.f68237b;
            if (mo34142B == obj) {
                return obj;
            }
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractSendChannel(@Nullable Function1<? super E, Unit> function1) {
        this.f67109b = function1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x000c, code lost:
    
        r2 = kotlinx.coroutines.internal.OnUndeliveredElementKt.m34319c(r2, r4, null);
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m34149a(kotlinx.coroutines.channels.AbstractSendChannel r2, kotlin.coroutines.Continuation r3, java.lang.Object r4, kotlinx.coroutines.channels.Closed r5) {
        /*
            r2.m34157g(r5)
            java.lang.Throwable r5 = r5.m34182X()
            kotlin.jvm.functions.Function1<E, kotlin.Unit> r2 = r2.f67109b
            if (r2 != 0) goto Lc
            goto L14
        Lc:
            r0 = 0
            r1 = 2
            kotlinx.coroutines.internal.UndeliveredElementException r2 = kotlinx.coroutines.internal.OnUndeliveredElementKt.m34320d(r2, r4, r0, r1)
            if (r2 != 0) goto L1e
        L14:
            java.lang.Object r2 = kotlin.ResultKt.m31891a(r5)
            kotlinx.coroutines.CancellableContinuationImpl r3 = (kotlinx.coroutines.CancellableContinuationImpl) r3
            r3.mo31877j(r2)
            goto L2a
        L1e:
            kotlin.ExceptionsKt.m31878a(r2, r5)
            java.lang.Object r2 = kotlin.ResultKt.m31891a(r2)
            kotlinx.coroutines.CancellableContinuationImpl r3 = (kotlinx.coroutines.CancellableContinuationImpl) r3
            r3.mo31877j(r2)
        L2a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.AbstractSendChannel.m34149a(kotlinx.coroutines.channels.AbstractSendChannel, kotlin.coroutines.Continuation, java.lang.Object, kotlinx.coroutines.channels.Closed):void");
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @NotNull
    /* renamed from: D */
    public final Object mo34150D(E e2) {
        ChannelResult.Closed closed;
        Object mo34161k = mo34161k(e2);
        if (mo34161k == AbstractChannelKt.f67103b) {
            return Unit.f63088a;
        }
        if (mo34161k == AbstractChannelKt.f67104c) {
            Closed<?> m34156f = m34156f();
            if (m34156f == null) {
                return ChannelResult.f67140b;
            }
            m34157g(m34156f);
            closed = new ChannelResult.Closed(m34156f.m34182X());
        } else {
            if (!(mo34161k instanceof Closed)) {
                throw new IllegalStateException(Intrinsics.m32187p("trySend returned ", mo34161k).toString());
            }
            Closed<?> closed2 = (Closed) mo34161k;
            m34157g(closed2);
            closed = new ChannelResult.Closed(closed2.m34182X());
        }
        return closed;
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @Nullable
    /* renamed from: E */
    public final Object mo34151E(E e2, @NotNull Continuation<? super Unit> continuation) {
        if (mo34161k(e2) == AbstractChannelKt.f67103b) {
            return Unit.f63088a;
        }
        CancellableContinuationImpl m33996b = CancellableContinuationKt.m33996b(IntrinsicsKt.m32122b(continuation));
        while (true) {
            if (m34160j()) {
                Send sendElement = this.f67109b == null ? new SendElement(e2, m33996b) : new SendElementWithUndeliveredHandler(e2, m33996b, this.f67109b);
                Object mo34153c = mo34153c(sendElement);
                if (mo34153c == null) {
                    CancellableContinuationKt.m33997c(m33996b, sendElement);
                    break;
                }
                if (mo34153c instanceof Closed) {
                    m34149a(this, m33996b, e2, (Closed) mo34153c);
                    break;
                }
                if (mo34153c != AbstractChannelKt.f67106e && !(mo34153c instanceof Receive)) {
                    throw new IllegalStateException(Intrinsics.m32187p("enqueueSend returned ", mo34153c).toString());
                }
            }
            Object mo34161k = mo34161k(e2);
            if (mo34161k == AbstractChannelKt.f67103b) {
                m33996b.mo31877j(Unit.f63088a);
                break;
            }
            if (mo34161k != AbstractChannelKt.f67104c) {
                if (!(mo34161k instanceof Closed)) {
                    throw new IllegalStateException(Intrinsics.m32187p("offerInternal returned ", mo34161k).toString());
                }
                m34149a(this, m33996b, e2, (Closed) mo34161k);
            }
        }
        Object m33992v = m33996b.m33992v();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (m33992v != coroutineSingletons) {
            m33992v = Unit.f63088a;
        }
        return m33992v == coroutineSingletons ? m33992v : Unit.f63088a;
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* renamed from: F */
    public final boolean mo34152F() {
        return m34156f() != null;
    }

    @Nullable
    /* renamed from: c */
    public Object mo34153c(@NotNull final Send send) {
        boolean z;
        LockFreeLinkedListNode m34292K;
        if (mo34158h()) {
            LockFreeLinkedListNode lockFreeLinkedListNode = this.f67110c;
            do {
                m34292K = lockFreeLinkedListNode.m34292K();
                if (m34292K instanceof ReceiveOrClosed) {
                    return m34292K;
                }
            } while (!m34292K.m34287E(send, lockFreeLinkedListNode));
            return null;
        }
        LockFreeLinkedListNode lockFreeLinkedListNode2 = this.f67110c;
        LockFreeLinkedListNode.CondAddOp condAddOp = new LockFreeLinkedListNode.CondAddOp(send) { // from class: kotlinx.coroutines.channels.AbstractSendChannel$enqueueSend$$inlined$addLastIfPrevAndIf$1
            @Override // kotlinx.coroutines.internal.AtomicOp
            /* renamed from: i */
            public Object mo34105i(LockFreeLinkedListNode lockFreeLinkedListNode3) {
                if (this.mo34159i()) {
                    return null;
                }
                return LockFreeLinkedListKt.f68266a;
            }
        };
        while (true) {
            LockFreeLinkedListNode m34292K2 = lockFreeLinkedListNode2.m34292K();
            if (!(m34292K2 instanceof ReceiveOrClosed)) {
                int m34296Q = m34292K2.m34296Q(send, lockFreeLinkedListNode2, condAddOp);
                z = true;
                if (m34296Q != 1) {
                    if (m34296Q == 2) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            } else {
                return m34292K2;
            }
        }
        if (z) {
            return null;
        }
        return AbstractChannelKt.f67106e;
    }

    @NotNull
    /* renamed from: d */
    public String mo34154d() {
        return "";
    }

    @Nullable
    /* renamed from: e */
    public final Closed<?> m34155e() {
        LockFreeLinkedListNode m34291J = this.f67110c.m34291J();
        Closed<?> closed = m34291J instanceof Closed ? (Closed) m34291J : null;
        if (closed == null) {
            return null;
        }
        m34157g(closed);
        return closed;
    }

    @Nullable
    /* renamed from: f */
    public final Closed<?> m34156f() {
        LockFreeLinkedListNode m34292K = this.f67110c.m34292K();
        Closed<?> closed = m34292K instanceof Closed ? (Closed) m34292K : null;
        if (closed == null) {
            return null;
        }
        m34157g(closed);
        return closed;
    }

    /* renamed from: g */
    public final void m34157g(Closed<?> closed) {
        Object obj = null;
        while (true) {
            LockFreeLinkedListNode m34292K = closed.m34292K();
            Receive receive = m34292K instanceof Receive ? (Receive) m34292K : null;
            if (receive == null) {
                break;
            } else if (receive.mo34192O()) {
                obj = InlineList.m34283a(obj, receive);
            } else {
                receive.m34293L();
            }
        }
        if (obj == null) {
            return;
        }
        if (!(obj instanceof ArrayList)) {
            ((Receive) obj).mo34143S(closed);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i2 = size - 1;
            ((Receive) arrayList.get(size)).mo34143S(closed);
            if (i2 < 0) {
                return;
            } else {
                size = i2;
            }
        }
    }

    /* renamed from: h */
    public abstract boolean mo34158h();

    /* renamed from: i */
    public abstract boolean mo34159i();

    /* renamed from: j */
    public final boolean m34160j() {
        return !(this.f67110c.m34291J() instanceof ReceiveOrClosed) && mo34159i();
    }

    @NotNull
    /* renamed from: k */
    public Object mo34161k(E e2) {
        ReceiveOrClosed<E> mo34132n;
        do {
            mo34132n = mo34132n();
            if (mo34132n == null) {
                return AbstractChannelKt.f67104c;
            }
        } while (mo34132n.mo34142B(e2, null) == null);
        mo34132n.mo34144u(e2);
        return mo34132n.mo34183c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.internal.LockFreeLinkedListNode] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    @Nullable
    /* renamed from: n */
    public ReceiveOrClosed<E> mo34132n() {
        ?? r1;
        LockFreeLinkedListNode m34295P;
        LockFreeLinkedListHead lockFreeLinkedListHead = this.f67110c;
        while (true) {
            r1 = (LockFreeLinkedListNode) lockFreeLinkedListHead.m34290I();
            if (r1 != lockFreeLinkedListHead && (r1 instanceof ReceiveOrClosed)) {
                if (((((ReceiveOrClosed) r1) instanceof Closed) && !r1.mo34285N()) || (m34295P = r1.m34295P()) == null) {
                    break;
                }
                m34295P.m34294M();
            }
        }
        r1 = 0;
        return (ReceiveOrClosed) r1;
    }

    @Nullable
    /* renamed from: o */
    public final Send m34162o() {
        LockFreeLinkedListNode lockFreeLinkedListNode;
        LockFreeLinkedListNode m34295P;
        LockFreeLinkedListHead lockFreeLinkedListHead = this.f67110c;
        while (true) {
            lockFreeLinkedListNode = (LockFreeLinkedListNode) lockFreeLinkedListHead.m34290I();
            if (lockFreeLinkedListNode != lockFreeLinkedListHead && (lockFreeLinkedListNode instanceof Send)) {
                if (((((Send) lockFreeLinkedListNode) instanceof Closed) && !lockFreeLinkedListNode.mo34285N()) || (m34295P = lockFreeLinkedListNode.m34295P()) == null) {
                    break;
                }
                m34295P.m34294M();
            }
        }
        lockFreeLinkedListNode = null;
        return (Send) lockFreeLinkedListNode;
    }

    @NotNull
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('@');
        sb.append(DebugStringsKt.m34023b(this));
        sb.append('{');
        LockFreeLinkedListNode m34291J = this.f67110c.m34291J();
        if (m34291J == this.f67110c) {
            str = "EmptyQueue";
        } else {
            String lockFreeLinkedListNode = m34291J instanceof Closed ? m34291J.toString() : m34291J instanceof Receive ? "ReceiveQueued" : m34291J instanceof Send ? "SendQueued" : Intrinsics.m32187p("UNEXPECTED:", m34291J);
            LockFreeLinkedListNode m34292K = this.f67110c.m34292K();
            if (m34292K != m34291J) {
                StringBuilder m27x = C0000a.m27x(lockFreeLinkedListNode, ",queueSize=");
                LockFreeLinkedListHead lockFreeLinkedListHead = this.f67110c;
                int i2 = 0;
                for (LockFreeLinkedListNode lockFreeLinkedListNode2 = (LockFreeLinkedListNode) lockFreeLinkedListHead.m34290I(); !Intrinsics.m32174c(lockFreeLinkedListNode2, lockFreeLinkedListHead); lockFreeLinkedListNode2 = lockFreeLinkedListNode2.m34291J()) {
                    if (lockFreeLinkedListNode2 instanceof LockFreeLinkedListNode) {
                        i2++;
                    }
                }
                m27x.append(i2);
                str = m27x.toString();
                if (m34292K instanceof Closed) {
                    str = str + ",closedForSend=" + m34292K;
                }
            } else {
                str = lockFreeLinkedListNode;
            }
        }
        sb.append(str);
        sb.append('}');
        sb.append(mo34154d());
        return sb.toString();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* renamed from: y */
    public boolean mo34163y(@Nullable Throwable th) {
        boolean z;
        boolean z2;
        Object obj;
        Symbol symbol;
        Closed<?> closed = new Closed<>(th);
        LockFreeLinkedListNode lockFreeLinkedListNode = this.f67110c;
        while (true) {
            LockFreeLinkedListNode m34292K = lockFreeLinkedListNode.m34292K();
            z = false;
            if (!(!(m34292K instanceof Closed))) {
                z2 = false;
                break;
            }
            if (m34292K.m34287E(closed, lockFreeLinkedListNode)) {
                z2 = true;
                break;
            }
        }
        if (!z2) {
            closed = (Closed) this.f67110c.m34292K();
        }
        m34157g(closed);
        if (z2 && (obj = this.onCloseHandler) != null && obj != (symbol = AbstractChannelKt.f67107f)) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f67108d;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, symbol)) {
                    z = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            if (z) {
                TypeIntrinsics.m32215d(obj, 1);
                ((Function1) obj).invoke(th);
            }
        }
        return z2;
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* renamed from: z */
    public void mo34164z(@NotNull Function1<? super Throwable, Unit> function1) {
        boolean z;
        boolean z2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f67108d;
        while (true) {
            z = false;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, function1)) {
                z2 = true;
                break;
            } else if (atomicReferenceFieldUpdater.get(this) != null) {
                z2 = false;
                break;
            }
        }
        if (!z2) {
            Object obj = this.onCloseHandler;
            if (obj != AbstractChannelKt.f67107f) {
                throw new IllegalStateException(Intrinsics.m32187p("Another handler was already registered: ", obj));
            }
            throw new IllegalStateException("Another handler was already registered and successfully invoked");
        }
        Closed<?> m34156f = m34156f();
        if (m34156f != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f67108d;
            Symbol symbol = AbstractChannelKt.f67107f;
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(this, function1, symbol)) {
                    z = true;
                    break;
                } else if (atomicReferenceFieldUpdater2.get(this) != function1) {
                    break;
                }
            }
            if (z) {
                function1.invoke(m34156f.f67351e);
            }
        }
    }
}
