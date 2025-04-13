package kotlinx.coroutines.channels;

import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BeforeResumeCancelHandler;
import kotlinx.coroutines.CancellableContinuation;
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
import kotlinx.coroutines.internal.StackTraceRecoveryKt;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.intrinsics.CancellableKt;
import kotlinx.coroutines.intrinsics.UndispatchedKt;
import kotlinx.coroutines.selects.SelectClause1;
import kotlinx.coroutines.selects.SelectInstance;
import kotlinx.coroutines.selects.SelectKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: AbstractChannel.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0007\u0004\u0005\u0006\u0007\b\t\n¨\u0006\u000b"}, m31884d2 = {"Lkotlinx/coroutines/channels/AbstractChannel;", "E", "Lkotlinx/coroutines/channels/AbstractSendChannel;", "Lkotlinx/coroutines/channels/Channel;", "Itr", "ReceiveElement", "ReceiveElementWithUndeliveredHandler", "ReceiveHasNext", "ReceiveSelect", "RemoveReceiveOnCancel", "TryPollDesc", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public abstract class AbstractChannel<E> extends AbstractSendChannel<E> implements Channel<E> {

    /* renamed from: e */
    public static final /* synthetic */ int f67082e = 0;

    /* compiled from: AbstractChannel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$Itr;", "E", "Lkotlinx/coroutines/channels/ChannelIterator;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static final class Itr<E> implements ChannelIterator<E> {

        /* renamed from: a */
        @JvmField
        @NotNull
        public final AbstractChannel<E> f67084a;

        /* renamed from: b */
        @Nullable
        public Object f67085b = AbstractChannelKt.f67105d;

        public Itr(@NotNull AbstractChannel<E> abstractChannel) {
            this.f67084a = abstractChannel;
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        @Nullable
        /* renamed from: a */
        public Object mo34140a(@NotNull Continuation<? super Boolean> continuation) {
            Object obj = this.f67085b;
            Symbol symbol = AbstractChannelKt.f67105d;
            if (obj != symbol) {
                return Boolean.valueOf(m34141b(obj));
            }
            Object mo34127B = this.f67084a.mo34127B();
            this.f67085b = mo34127B;
            if (mo34127B != symbol) {
                return Boolean.valueOf(m34141b(mo34127B));
            }
            CancellableContinuationImpl m33996b = CancellableContinuationKt.m33996b(IntrinsicsKt.m32122b(continuation));
            ReceiveHasNext receiveHasNext = new ReceiveHasNext(this, m33996b);
            while (true) {
                AbstractChannel<E> abstractChannel = this.f67084a;
                int i2 = AbstractChannel.f67082e;
                if (abstractChannel.mo34135s(receiveHasNext)) {
                    AbstractChannel<E> abstractChannel2 = this.f67084a;
                    Objects.requireNonNull(abstractChannel2);
                    m33996b.mo33966r(abstractChannel2.new RemoveReceiveOnCancel(receiveHasNext));
                    break;
                }
                Object mo34127B2 = this.f67084a.mo34127B();
                this.f67085b = mo34127B2;
                if (mo34127B2 instanceof Closed) {
                    Closed closed = (Closed) mo34127B2;
                    if (closed.f67351e == null) {
                        m33996b.mo31877j(Boolean.FALSE);
                    } else {
                        m33996b.mo31877j(ResultKt.m31891a(closed.m34181W()));
                    }
                } else if (mo34127B2 != AbstractChannelKt.f67105d) {
                    Boolean bool = Boolean.TRUE;
                    Function1<E, Unit> function1 = this.f67084a.f67109b;
                    m33996b.m33976H(bool, m33996b.f66987d, function1 == null ? null : OnUndeliveredElementKt.m34317a(function1, mo34127B2, m33996b.f66944f));
                }
            }
            return m33996b.m33992v();
        }

        /* renamed from: b */
        public final boolean m34141b(Object obj) {
            if (!(obj instanceof Closed)) {
                return true;
            }
            Closed closed = (Closed) obj;
            if (closed.f67351e == null) {
                return false;
            }
            Throwable m34181W = closed.m34181W();
            String str = StackTraceRecoveryKt.f68302a;
            throw m34181W;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlinx.coroutines.channels.ChannelIterator
        public E next() {
            E e2 = (E) this.f67085b;
            if (e2 instanceof Closed) {
                Throwable m34181W = ((Closed) e2).m34181W();
                String str = StackTraceRecoveryKt.f68302a;
                throw m34181W;
            }
            Symbol symbol = AbstractChannelKt.f67105d;
            if (e2 == symbol) {
                throw new IllegalStateException("'hasNext' should be called prior to 'next' invocation");
            }
            this.f67085b = symbol;
            return e2;
        }
    }

    /* compiled from: AbstractChannel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0012\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$ReceiveElement;", "E", "Lkotlinx/coroutines/channels/Receive;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static class ReceiveElement<E> extends Receive<E> {

        /* renamed from: e */
        @JvmField
        @NotNull
        public final CancellableContinuation<Object> f67086e;

        /* renamed from: f */
        @JvmField
        public final int f67087f;

        public ReceiveElement(@NotNull CancellableContinuation<Object> cancellableContinuation, int i2) {
            this.f67086e = cancellableContinuation;
            this.f67087f = i2;
        }

        @Override // kotlinx.coroutines.channels.ReceiveOrClosed
        @Nullable
        /* renamed from: B */
        public Symbol mo34142B(E e2, @Nullable LockFreeLinkedListNode.PrepareOp prepareOp) {
            if (this.f67086e.mo33968w(this.f67087f == 1 ? new ChannelResult(e2) : e2, prepareOp == null ? null : prepareOp.f68278c, mo34145R(e2)) == null) {
                return null;
            }
            if (prepareOp != null) {
                prepareOp.f68278c.mo34298e(prepareOp);
            }
            return CancellableContinuationImplKt.f66946a;
        }

        @Override // kotlinx.coroutines.channels.Receive
        /* renamed from: S */
        public void mo34143S(@NotNull Closed<?> closed) {
            if (this.f67087f == 1) {
                this.f67086e.mo31877j(new ChannelResult(new ChannelResult.Closed(closed.f67351e)));
            } else {
                this.f67086e.mo31877j(ResultKt.m31891a(closed.m34181W()));
            }
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        @NotNull
        public String toString() {
            StringBuilder m24u = C0000a.m24u("ReceiveElement@");
            m24u.append(DebugStringsKt.m34023b(this));
            m24u.append("[receiveMode=");
            return C0000a.m17n(m24u, this.f67087f, ']');
        }

        @Override // kotlinx.coroutines.channels.ReceiveOrClosed
        /* renamed from: u */
        public void mo34144u(E e2) {
            this.f67086e.mo33964G(CancellableContinuationImplKt.f66946a);
        }
    }

    /* compiled from: AbstractChannel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$ReceiveElementWithUndeliveredHandler;", "E", "Lkotlinx/coroutines/channels/AbstractChannel$ReceiveElement;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static final class ReceiveElementWithUndeliveredHandler<E> extends ReceiveElement<E> {

        /* renamed from: g */
        @JvmField
        @NotNull
        public final Function1<E, Unit> f67088g;

        /* JADX WARN: Multi-variable type inference failed */
        public ReceiveElementWithUndeliveredHandler(@NotNull CancellableContinuation<Object> cancellableContinuation, int i2, @NotNull Function1<? super E, Unit> function1) {
            super(cancellableContinuation, i2);
            this.f67088g = function1;
        }

        @Override // kotlinx.coroutines.channels.Receive
        @Nullable
        /* renamed from: R */
        public Function1<Throwable, Unit> mo34145R(E e2) {
            return OnUndeliveredElementKt.m34317a(this.f67088g, e2, this.f67086e.getF68225c());
        }
    }

    /* compiled from: AbstractChannel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0012\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$ReceiveHasNext;", "E", "Lkotlinx/coroutines/channels/Receive;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static class ReceiveHasNext<E> extends Receive<E> {

        /* renamed from: e */
        @JvmField
        @NotNull
        public final Itr<E> f67089e;

        /* renamed from: f */
        @JvmField
        @NotNull
        public final CancellableContinuation<Boolean> f67090f;

        /* JADX WARN: Multi-variable type inference failed */
        public ReceiveHasNext(@NotNull Itr<E> itr, @NotNull CancellableContinuation<? super Boolean> cancellableContinuation) {
            this.f67089e = itr;
            this.f67090f = cancellableContinuation;
        }

        @Override // kotlinx.coroutines.channels.ReceiveOrClosed
        @Nullable
        /* renamed from: B */
        public Symbol mo34142B(E e2, @Nullable LockFreeLinkedListNode.PrepareOp prepareOp) {
            if (this.f67090f.mo33968w(Boolean.TRUE, prepareOp == null ? null : prepareOp.f68278c, mo34145R(e2)) == null) {
                return null;
            }
            if (prepareOp != null) {
                prepareOp.f68278c.mo34298e(prepareOp);
            }
            return CancellableContinuationImplKt.f66946a;
        }

        @Override // kotlinx.coroutines.channels.Receive
        @Nullable
        /* renamed from: R */
        public Function1<Throwable, Unit> mo34145R(E e2) {
            Function1<E, Unit> function1 = this.f67089e.f67084a.f67109b;
            if (function1 == null) {
                return null;
            }
            return OnUndeliveredElementKt.m34317a(function1, e2, this.f67090f.getF68225c());
        }

        @Override // kotlinx.coroutines.channels.Receive
        /* renamed from: S */
        public void mo34143S(@NotNull Closed<?> closed) {
            Object mo33965d = closed.f67351e == null ? this.f67090f.mo33965d(Boolean.FALSE, null) : this.f67090f.mo33967t(closed.m34181W());
            if (mo33965d != null) {
                this.f67089e.f67085b = closed;
                this.f67090f.mo33964G(mo33965d);
            }
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        @NotNull
        public String toString() {
            return Intrinsics.m32187p("ReceiveHasNext@", DebugStringsKt.m34023b(this));
        }

        @Override // kotlinx.coroutines.channels.ReceiveOrClosed
        /* renamed from: u */
        public void mo34144u(E e2) {
            this.f67089e.f67085b = e2;
            this.f67090f.mo33964G(CancellableContinuationImplKt.f66946a);
        }
    }

    /* compiled from: AbstractChannel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u0001*\u0004\b\u0002\u0010\u00022\b\u0012\u0004\u0012\u00028\u00020\u00032\u00020\u0004¨\u0006\u0005"}, m31884d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$ReceiveSelect;", "R", "E", "Lkotlinx/coroutines/channels/Receive;", "Lkotlinx/coroutines/DisposableHandle;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static final class ReceiveSelect<R, E> extends Receive<E> implements DisposableHandle {

        /* renamed from: e */
        @JvmField
        @NotNull
        public final AbstractChannel<E> f67091e;

        /* renamed from: f */
        @JvmField
        @NotNull
        public final SelectInstance<R> f67092f;

        /* renamed from: g */
        @JvmField
        @NotNull
        public final Function2<Object, Continuation<? super R>, Object> f67093g;

        /* renamed from: h */
        @JvmField
        public final int f67094h;

        /* JADX WARN: Multi-variable type inference failed */
        public ReceiveSelect(@NotNull AbstractChannel<E> abstractChannel, @NotNull SelectInstance<? super R> selectInstance, @NotNull Function2<Object, ? super Continuation<? super R>, ? extends Object> function2, int i2) {
            this.f67091e = abstractChannel;
            this.f67092f = selectInstance;
            this.f67093g = function2;
            this.f67094h = i2;
        }

        @Override // kotlinx.coroutines.channels.ReceiveOrClosed
        @Nullable
        /* renamed from: B */
        public Symbol mo34142B(E e2, @Nullable LockFreeLinkedListNode.PrepareOp prepareOp) {
            return (Symbol) this.f67092f.mo34392b(prepareOp);
        }

        @Override // kotlinx.coroutines.channels.Receive
        @Nullable
        /* renamed from: R */
        public Function1<Throwable, Unit> mo34145R(E e2) {
            Function1<E, Unit> function1 = this.f67091e.f67109b;
            if (function1 == null) {
                return null;
            }
            return OnUndeliveredElementKt.m34317a(function1, e2, this.f67092f.mo34395p().getF68225c());
        }

        @Override // kotlinx.coroutines.channels.Receive
        /* renamed from: S */
        public void mo34143S(@NotNull Closed<?> closed) {
            if (this.f67092f.mo34393e()) {
                int i2 = this.f67094h;
                if (i2 == 0) {
                    this.f67092f.mo34396y(closed.m34181W());
                } else {
                    if (i2 != 1) {
                        return;
                    }
                    CancellableKt.m34350d(this.f67093g, new ChannelResult(new ChannelResult.Closed(closed.f67351e)), this.f67092f.mo34395p(), null);
                }
            }
        }

        @Override // kotlinx.coroutines.DisposableHandle
        /* renamed from: f */
        public void mo34038f() {
            if (mo34192O()) {
                Objects.requireNonNull(this.f67091e);
            }
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        @NotNull
        public String toString() {
            StringBuilder m24u = C0000a.m24u("ReceiveSelect@");
            m24u.append(DebugStringsKt.m34023b(this));
            m24u.append('[');
            m24u.append(this.f67092f);
            m24u.append(",receiveMode=");
            return C0000a.m17n(m24u, this.f67094h, ']');
        }

        @Override // kotlinx.coroutines.channels.ReceiveOrClosed
        /* renamed from: u */
        public void mo34144u(E e2) {
            CancellableKt.m34350d(this.f67093g, this.f67094h == 1 ? new ChannelResult(e2) : e2, this.f67092f.mo34395p(), mo34145R(e2));
        }
    }

    /* compiled from: AbstractChannel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$RemoveReceiveOnCancel;", "Lkotlinx/coroutines/BeforeResumeCancelHandler;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
    public final class RemoveReceiveOnCancel extends BeforeResumeCancelHandler {

        /* renamed from: b */
        @NotNull
        public final Receive<?> f67095b;

        public RemoveReceiveOnCancel(@NotNull Receive<?> receive) {
            this.f67095b = receive;
        }

        @Override // kotlinx.coroutines.CancelHandlerBase
        /* renamed from: a */
        public void mo33959a(@Nullable Throwable th) {
            if (this.f67095b.mo34192O()) {
                Objects.requireNonNull(AbstractChannel.this);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public Unit invoke(Throwable th) {
            if (this.f67095b.mo34192O()) {
                Objects.requireNonNull(AbstractChannel.this);
            }
            return Unit.f63088a;
        }

        @NotNull
        public String toString() {
            StringBuilder m24u = C0000a.m24u("RemoveReceiveOnCancel[");
            m24u.append(this.f67095b);
            m24u.append(']');
            return m24u.toString();
        }
    }

    /* compiled from: AbstractChannel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u0000*\u0004\b\u0001\u0010\u00012\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004¨\u0006\u0005"}, m31884d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$TryPollDesc;", "E", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$RemoveFirstDesc;", "Lkotlinx/coroutines/channels/Send;", "Lkotlinx/coroutines/internal/RemoveFirstDesc;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static final class TryPollDesc<E> extends LockFreeLinkedListNode.RemoveFirstDesc<Send> {
        public TryPollDesc(@NotNull LockFreeLinkedListHead lockFreeLinkedListHead) {
            super(lockFreeLinkedListHead);
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.RemoveFirstDesc, kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        @Nullable
        /* renamed from: c */
        public Object mo34146c(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode) {
            if (lockFreeLinkedListNode instanceof Closed) {
                return lockFreeLinkedListNode;
            }
            if (lockFreeLinkedListNode instanceof Send) {
                return null;
            }
            return AbstractChannelKt.f67105d;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        @Nullable
        /* renamed from: h */
        public Object mo34147h(@NotNull LockFreeLinkedListNode.PrepareOp prepareOp) {
            Symbol mo34168U = ((Send) prepareOp.f68276a).mo34168U(prepareOp);
            if (mo34168U == null) {
                return LockFreeLinkedList_commonKt.f68282a;
            }
            Object obj = AtomicKt.f68237b;
            if (mo34168U == obj) {
                return obj;
            }
            return null;
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        /* renamed from: i */
        public void mo34148i(@NotNull LockFreeLinkedListNode lockFreeLinkedListNode) {
            ((Send) lockFreeLinkedListNode).mo34169V();
        }
    }

    public AbstractChannel(@Nullable Function1<? super E, Unit> function1) {
        super(function1);
    }

    /* renamed from: r */
    public static final void m34125r(AbstractChannel abstractChannel, SelectInstance selectInstance, int i2, Function2 function2) {
        Objects.requireNonNull(abstractChannel);
        while (!selectInstance.mo34394o()) {
            if (!(abstractChannel.f67110c.m34291J() instanceof Send) && abstractChannel.mo34137u()) {
                ReceiveSelect receiveSelect = new ReceiveSelect(abstractChannel, selectInstance, function2, i2);
                boolean mo34135s = abstractChannel.mo34135s(receiveSelect);
                if (mo34135s) {
                    selectInstance.mo34387C(receiveSelect);
                }
                if (mo34135s) {
                    return;
                }
            } else {
                Object mo34128C = abstractChannel.mo34128C(selectInstance);
                Object obj = SelectKt.f68384a;
                if (mo34128C == SelectKt.f68385b) {
                    return;
                }
                if (mo34128C != AbstractChannelKt.f67105d && mo34128C != AtomicKt.f68237b) {
                    boolean z = mo34128C instanceof Closed;
                    if (z) {
                        if (i2 == 0) {
                            Throwable m34181W = ((Closed) mo34128C).m34181W();
                            String str = StackTraceRecoveryKt.f68302a;
                            throw m34181W;
                        }
                        if (i2 == 1 && selectInstance.mo34393e()) {
                            UndispatchedKt.m34353b(function2, new ChannelResult(new ChannelResult.Closed(((Closed) mo34128C).f67351e)), selectInstance.mo34395p());
                        }
                    } else if (i2 == 1) {
                        if (z) {
                            mo34128C = new ChannelResult.Closed(((Closed) mo34128C).f67351e);
                        }
                        UndispatchedKt.m34353b(function2, new ChannelResult(mo34128C), selectInstance.mo34395p());
                    } else {
                        UndispatchedKt.m34353b(function2, mo34128C, selectInstance.mo34395p());
                    }
                }
            }
        }
    }

    /* renamed from: A */
    public void mo34126A(@NotNull Object obj, @NotNull Closed<?> closed) {
        if (obj == null) {
            return;
        }
        if (!(obj instanceof ArrayList)) {
            ((Send) obj).mo34167T(closed);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i2 = size - 1;
            ((Send) arrayList.get(size)).mo34167T(closed);
            if (i2 < 0) {
                return;
            } else {
                size = i2;
            }
        }
    }

    @Nullable
    /* renamed from: B */
    public Object mo34127B() {
        while (true) {
            Send m34162o = m34162o();
            if (m34162o == null) {
                return AbstractChannelKt.f67105d;
            }
            if (m34162o.mo34168U(null) != null) {
                m34162o.mo34165R();
                return m34162o.getF67112e();
            }
            m34162o.mo34169V();
        }
    }

    @Nullable
    /* renamed from: C */
    public Object mo34128C(@NotNull SelectInstance<?> selectInstance) {
        TryPollDesc tryPollDesc = new TryPollDesc(this.f67110c);
        Object mo34397z = selectInstance.mo34397z(tryPollDesc);
        if (mo34397z != null) {
            return mo34397z;
        }
        tryPollDesc.m34304m().mo34165R();
        return tryPollDesc.m34304m().getF67112e();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* renamed from: b */
    public final void mo34129b(@Nullable CancellationException cancellationException) {
        if (mo34138w()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new CancellationException(Intrinsics.m32187p(getClass().getSimpleName(), " was cancelled"));
        }
        mo34139x(mo34163y(cancellationException));
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @NotNull
    public final ChannelIterator<E> iterator() {
        return new Itr(this);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @NotNull
    /* renamed from: l */
    public final SelectClause1<E> mo34130l() {
        return new SelectClause1<E>(this) { // from class: kotlinx.coroutines.channels.AbstractChannel$onReceive$1

            /* renamed from: b */
            public final /* synthetic */ AbstractChannel<E> f67097b;

            {
                this.f67097b = this;
            }

            @Override // kotlinx.coroutines.selects.SelectClause1
            /* renamed from: f */
            public <R> void mo34002f(@NotNull SelectInstance<? super R> selectInstance, @NotNull Function2<? super E, ? super Continuation<? super R>, ? extends Object> function2) {
                AbstractChannel.m34125r(this.f67097b, selectInstance, 0, function2);
            }
        };
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @NotNull
    /* renamed from: m */
    public final SelectClause1<ChannelResult<E>> mo34131m() {
        return new SelectClause1<ChannelResult<? extends E>>(this) { // from class: kotlinx.coroutines.channels.AbstractChannel$onReceiveCatching$1

            /* renamed from: b */
            public final /* synthetic */ AbstractChannel<E> f67098b;

            {
                this.f67098b = this;
            }

            @Override // kotlinx.coroutines.selects.SelectClause1
            /* renamed from: f */
            public <R> void mo34002f(@NotNull SelectInstance<? super R> selectInstance, @NotNull Function2<? super ChannelResult<? extends E>, ? super Continuation<? super R>, ? extends Object> function2) {
                AbstractChannel.m34125r(this.f67098b, selectInstance, 1, function2);
            }
        };
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    @Nullable
    /* renamed from: n */
    public ReceiveOrClosed<E> mo34132n() {
        ReceiveOrClosed<E> mo34132n = super.mo34132n();
        if (mo34132n != null) {
            boolean z = mo34132n instanceof Closed;
        }
        return mo34132n;
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @NotNull
    /* renamed from: p */
    public final Object mo34133p() {
        Object mo34127B = mo34127B();
        return mo34127B == AbstractChannelKt.f67105d ? ChannelResult.f67140b : mo34127B instanceof Closed ? new ChannelResult.Closed(((Closed) mo34127B).f67351e) : mo34127B;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @org.jetbrains.annotations.Nullable
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo34134q(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelResult<? extends E>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.channels.AbstractChannel$receiveCatching$1
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.channels.AbstractChannel$receiveCatching$1 r0 = (kotlinx.coroutines.channels.AbstractChannel$receiveCatching$1) r0
            int r1 = r0.f67101g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f67101g = r1
            goto L18
        L13:
            kotlinx.coroutines.channels.AbstractChannel$receiveCatching$1 r0 = new kotlinx.coroutines.channels.AbstractChannel$receiveCatching$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f67099e
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f67101g
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            kotlin.ResultKt.m31892b(r6)
            goto L9f
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L30:
            kotlin.ResultKt.m31892b(r6)
            java.lang.Object r6 = r5.mo34127B()
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.AbstractChannelKt.f67105d
            if (r6 == r2) goto L4a
            boolean r0 = r6 instanceof kotlinx.coroutines.channels.Closed
            if (r0 == 0) goto L49
            kotlinx.coroutines.channels.Closed r6 = (kotlinx.coroutines.channels.Closed) r6
            java.lang.Throwable r6 = r6.f67351e
            kotlinx.coroutines.channels.ChannelResult$Closed r0 = new kotlinx.coroutines.channels.ChannelResult$Closed
            r0.<init>(r6)
            r6 = r0
        L49:
            return r6
        L4a:
            r0.f67101g = r3
            kotlin.coroutines.Continuation r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.m32122b(r0)
            kotlinx.coroutines.CancellableContinuationImpl r6 = kotlinx.coroutines.CancellableContinuationKt.m33996b(r6)
            kotlin.jvm.functions.Function1<E, kotlin.Unit> r0 = r5.f67109b
            if (r0 != 0) goto L5e
            kotlinx.coroutines.channels.AbstractChannel$ReceiveElement r0 = new kotlinx.coroutines.channels.AbstractChannel$ReceiveElement
            r0.<init>(r6, r3)
            goto L65
        L5e:
            kotlinx.coroutines.channels.AbstractChannel$ReceiveElementWithUndeliveredHandler r0 = new kotlinx.coroutines.channels.AbstractChannel$ReceiveElementWithUndeliveredHandler
            kotlin.jvm.functions.Function1<E, kotlin.Unit> r2 = r5.f67109b
            r0.<init>(r6, r3, r2)
        L65:
            boolean r2 = r5.mo34135s(r0)
            if (r2 == 0) goto L74
            kotlinx.coroutines.channels.AbstractChannel$RemoveReceiveOnCancel r2 = new kotlinx.coroutines.channels.AbstractChannel$RemoveReceiveOnCancel
            r2.<init>(r0)
            r6.mo33966r(r2)
            goto L98
        L74:
            java.lang.Object r2 = r5.mo34127B()
            boolean r4 = r2 instanceof kotlinx.coroutines.channels.Closed
            if (r4 == 0) goto L82
            kotlinx.coroutines.channels.Closed r2 = (kotlinx.coroutines.channels.Closed) r2
            r0.mo34143S(r2)
            goto L98
        L82:
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.channels.AbstractChannelKt.f67105d
            if (r2 == r4) goto L65
            int r4 = r0.f67087f
            if (r4 != r3) goto L90
            kotlinx.coroutines.channels.ChannelResult r3 = new kotlinx.coroutines.channels.ChannelResult
            r3.<init>(r2)
            goto L91
        L90:
            r3 = r2
        L91:
            kotlin.jvm.functions.Function1 r0 = r0.mo34145R(r2)
            r6.m33975F(r3, r0)
        L98:
            java.lang.Object r6 = r6.m33992v()
            if (r6 != r1) goto L9f
            return r1
        L9f:
            kotlinx.coroutines.channels.ChannelResult r6 = (kotlinx.coroutines.channels.ChannelResult) r6
            java.lang.Object r6 = r6.f67141a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.AbstractChannel.mo34134q(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: s */
    public boolean mo34135s(@NotNull final Receive<? super E> receive) {
        int m34296Q;
        LockFreeLinkedListNode m34292K;
        if (!mo34136t()) {
            LockFreeLinkedListNode lockFreeLinkedListNode = this.f67110c;
            LockFreeLinkedListNode.CondAddOp condAddOp = new LockFreeLinkedListNode.CondAddOp(receive) { // from class: kotlinx.coroutines.channels.AbstractChannel$enqueueReceiveInternal$$inlined$addLastIfPrevAndIf$1
                @Override // kotlinx.coroutines.internal.AtomicOp
                /* renamed from: i */
                public Object mo34105i(LockFreeLinkedListNode lockFreeLinkedListNode2) {
                    if (this.mo34137u()) {
                        return null;
                    }
                    return LockFreeLinkedListKt.f68266a;
                }
            };
            do {
                LockFreeLinkedListNode m34292K2 = lockFreeLinkedListNode.m34292K();
                if (!(!(m34292K2 instanceof Send))) {
                    return false;
                }
                m34296Q = m34292K2.m34296Q(receive, lockFreeLinkedListNode, condAddOp);
                if (m34296Q != 1) {
                }
            } while (m34296Q != 2);
            return false;
        }
        LockFreeLinkedListNode lockFreeLinkedListNode2 = this.f67110c;
        do {
            m34292K = lockFreeLinkedListNode2.m34292K();
            if (!(!(m34292K instanceof Send))) {
                return false;
            }
        } while (!m34292K.m34287E(receive, lockFreeLinkedListNode2));
        return true;
    }

    /* renamed from: t */
    public abstract boolean mo34136t();

    /* renamed from: u */
    public abstract boolean mo34137u();

    /* renamed from: w */
    public boolean mo34138w() {
        return m34155e() != null && mo34137u();
    }

    /* renamed from: x */
    public void mo34139x(boolean z) {
        Closed<?> m34156f = m34156f();
        if (m34156f == null) {
            throw new IllegalStateException("Cannot happen".toString());
        }
        Object obj = null;
        while (true) {
            LockFreeLinkedListNode m34292K = m34156f.m34292K();
            if (m34292K instanceof LockFreeLinkedListHead) {
                mo34126A(obj, m34156f);
                return;
            } else if (m34292K.mo34192O()) {
                obj = InlineList.m34283a(obj, (Send) m34292K);
            } else {
                m34292K.m34293L();
            }
        }
    }
}
