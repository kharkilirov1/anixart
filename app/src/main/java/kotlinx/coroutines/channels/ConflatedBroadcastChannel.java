package kotlinx.coroutines.channels;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.ObsoleteCoroutinesApi;
import kotlinx.coroutines.internal.Symbol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ConflatedBroadcastChannel.kt */
@ObsoleteCoroutinesApi
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, m31884d2 = {"Lkotlinx/coroutines/channels/ConflatedBroadcastChannel;", "E", "Lkotlinx/coroutines/channels/BroadcastChannel;", "Closed", "Companion", "State", "Subscriber", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class ConflatedBroadcastChannel<E> implements BroadcastChannel<E> {

    /* renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f67352b;

    /* renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f67353c;

    /* renamed from: d */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f67354d;

    /* renamed from: e */
    @Deprecated
    @NotNull
    public static final Closed f67355e = new Closed(null);

    /* renamed from: f */
    @Deprecated
    @NotNull
    public static final Symbol f67356f;

    /* renamed from: g */
    @Deprecated
    @NotNull
    public static final State<Object> f67357g;

    @NotNull
    private volatile /* synthetic */ Object _state = f67357g;

    @NotNull
    private volatile /* synthetic */ int _updating = 0;

    @NotNull
    private volatile /* synthetic */ Object onCloseHandler = null;

    /* compiled from: ConflatedBroadcastChannel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$Closed;", "", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static final class Closed {

        /* renamed from: a */
        @JvmField
        @Nullable
        public final Throwable f67358a;

        public Closed(@Nullable Throwable th) {
            this.f67358a = th;
        }
    }

    /* compiled from: ConflatedBroadcastChannel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, m31884d2 = {"Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$Companion;", "", "Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$Closed;", "CLOSED", "Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$Closed;", "Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$State;", "INITIAL_STATE", "Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$State;", "Lkotlinx/coroutines/internal/Symbol;", "UNDEFINED", "Lkotlinx/coroutines/internal/Symbol;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static final class Companion {
    }

    /* compiled from: ConflatedBroadcastChannel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$State;", "E", "", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static final class State<E> {

        /* renamed from: a */
        @JvmField
        @Nullable
        public final Object f67359a;

        /* renamed from: b */
        @JvmField
        @Nullable
        public final Subscriber<E>[] f67360b;

        public State(@Nullable Object obj, @Nullable Subscriber<E>[] subscriberArr) {
            this.f67359a = obj;
            this.f67360b = subscriberArr;
        }
    }

    /* compiled from: ConflatedBroadcastChannel.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, m31884d2 = {"Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$Subscriber;", "E", "Lkotlinx/coroutines/channels/ConflatedChannel;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static final class Subscriber<E> extends ConflatedChannel<E> implements ReceiveChannel<E> {

        /* renamed from: h */
        @NotNull
        public final ConflatedBroadcastChannel<E> f67361h;

        @Override // kotlinx.coroutines.channels.ConflatedChannel, kotlinx.coroutines.channels.AbstractSendChannel
        @NotNull
        /* renamed from: k */
        public Object mo34161k(E e2) {
            return super.mo34161k(e2);
        }

        @Override // kotlinx.coroutines.channels.ConflatedChannel, kotlinx.coroutines.channels.AbstractChannel
        /* renamed from: x */
        public void mo34139x(boolean z) {
            if (z) {
                ConflatedBroadcastChannel.m34184a(this.f67361h, this);
            }
        }
    }

    static {
        Symbol symbol = new Symbol("UNDEFINED");
        f67356f = symbol;
        f67357g = new State<>(symbol, null);
        f67352b = AtomicReferenceFieldUpdater.newUpdater(ConflatedBroadcastChannel.class, Object.class, "_state");
        f67353c = AtomicIntegerFieldUpdater.newUpdater(ConflatedBroadcastChannel.class, "_updating");
        f67354d = AtomicReferenceFieldUpdater.newUpdater(ConflatedBroadcastChannel.class, Object.class, "onCloseHandler");
    }

    /* renamed from: a */
    public static final void m34184a(ConflatedBroadcastChannel conflatedBroadcastChannel, Subscriber subscriber) {
        boolean z;
        Subscriber[] subscriberArr;
        do {
            Object obj = conflatedBroadcastChannel._state;
            if (obj instanceof Closed) {
                return;
            }
            if (!(obj instanceof State)) {
                throw new IllegalStateException(Intrinsics.m32187p("Invalid state ", obj).toString());
            }
            State state = (State) obj;
            Object obj2 = state.f67359a;
            Subscriber<E>[] subscriberArr2 = state.f67360b;
            Intrinsics.m32176e(subscriberArr2);
            int length = subscriberArr2.length;
            int m31935K = ArraysKt.m31935K(subscriberArr2, subscriber);
            z = true;
            if (length == 1) {
                subscriberArr = null;
            } else {
                Subscriber[] subscriberArr3 = new Subscriber[length - 1];
                ArraysKt.m31970t(subscriberArr2, subscriberArr3, 0, 0, m31935K, 6, null);
                ArraysKt.m31970t(subscriberArr2, subscriberArr3, m31935K, m31935K + 1, 0, 8, null);
                subscriberArr = subscriberArr3;
            }
            State state2 = new State(obj2, subscriberArr);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f67352b;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(conflatedBroadcastChannel, obj, state2)) {
                    break;
                } else if (atomicReferenceFieldUpdater.get(conflatedBroadcastChannel) != obj) {
                    z = false;
                    break;
                }
            }
        } while (!z);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @Nullable
    /* renamed from: E */
    public Object mo34151E(E e2, @NotNull Continuation<? super Unit> continuation) {
        Closed m34185b = m34185b(e2);
        if (m34185b == null) {
            return Unit.f63088a;
        }
        Throwable th = m34185b.f67358a;
        if (th == null) {
            throw new ClosedSendChannelException("Channel was closed");
        }
        throw th;
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* renamed from: F */
    public boolean mo34152F() {
        return this._state instanceof Closed;
    }

    /* renamed from: b */
    public final Closed m34185b(E e2) {
        Object obj;
        boolean z;
        if (!f67353c.compareAndSet(this, 0, 1)) {
            return null;
        }
        do {
            try {
                obj = this._state;
                if (obj instanceof Closed) {
                    return (Closed) obj;
                }
                if (!(obj instanceof State)) {
                    throw new IllegalStateException(Intrinsics.m32187p("Invalid state ", obj).toString());
                }
                State state = new State(e2, ((State) obj).f67360b);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f67352b;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, state)) {
                        z = true;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        z = false;
                        break;
                    }
                }
            } finally {
                this._updating = 0;
            }
        } while (!z);
        Subscriber<E>[] subscriberArr = ((State) obj).f67360b;
        if (subscriberArr != null) {
            int length = subscriberArr.length;
            int i2 = 0;
            while (i2 < length) {
                Subscriber<E> subscriber = subscriberArr[i2];
                i2++;
                subscriber.mo34161k(e2);
            }
        }
        return null;
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* renamed from: y */
    public boolean mo34163y(@Nullable Throwable th) {
        Object obj;
        boolean z;
        boolean z2;
        Symbol symbol;
        do {
            obj = this._state;
            z = false;
            if (obj instanceof Closed) {
                return false;
            }
            if (!(obj instanceof State)) {
                throw new IllegalStateException(Intrinsics.m32187p("Invalid state ", obj).toString());
            }
            Closed closed = th == null ? f67355e : new Closed(th);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f67352b;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, closed)) {
                    z2 = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    z2 = false;
                    break;
                }
            }
        } while (!z2);
        Subscriber<E>[] subscriberArr = ((State) obj).f67360b;
        if (subscriberArr != null) {
            int length = subscriberArr.length;
            int i2 = 0;
            while (i2 < length) {
                Subscriber<E> subscriber = subscriberArr[i2];
                i2++;
                subscriber.mo34163y(th);
            }
        }
        Object obj2 = this.onCloseHandler;
        if (obj2 != null && obj2 != (symbol = AbstractChannelKt.f67107f)) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f67354d;
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(this, obj2, symbol)) {
                    z = true;
                    break;
                }
                if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                    break;
                }
            }
            if (z) {
                TypeIntrinsics.m32215d(obj2, 1);
                ((Function1) obj2).invoke(th);
            }
        }
        return true;
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* renamed from: z */
    public void mo34164z(@NotNull Function1<? super Throwable, Unit> function1) {
        boolean z;
        boolean z2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f67354d;
        while (true) {
            z = true;
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
        Object obj2 = this._state;
        if (obj2 instanceof Closed) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f67354d;
            Symbol symbol = AbstractChannelKt.f67107f;
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(this, function1, symbol)) {
                    break;
                } else if (atomicReferenceFieldUpdater2.get(this) != function1) {
                    z = false;
                    break;
                }
            }
            if (z) {
                function1.invoke(((Closed) obj2).f67358a);
            }
        }
    }
}
