package kotlinx.coroutines.flow;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlow;
import kotlinx.coroutines.flow.internal.FusibleFlow;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import kotlinx.coroutines.internal.Symbol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: StateFlow.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0012\u0004\u0012\u00028\u00000\u0006¨\u0006\u0007"}, m31884d2 = {"Lkotlinx/coroutines/flow/StateFlowImpl;", "T", "Lkotlinx/coroutines/flow/internal/AbstractSharedFlow;", "Lkotlinx/coroutines/flow/StateFlowSlot;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/CancellableFlow;", "Lkotlinx/coroutines/flow/internal/FusibleFlow;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
final class StateFlowImpl<T> extends AbstractSharedFlow<StateFlowSlot> implements MutableStateFlow<T>, CancellableFlow<T>, FusibleFlow<T> {

    @NotNull
    private volatile /* synthetic */ Object _state;

    /* renamed from: f */
    public int f68064f;

    public StateFlowImpl(@NotNull Object obj) {
        this._state = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c0, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.m32174c(r0, r13) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00af, code lost:
    
        if (kotlin.Unit.f63088a == r2) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00af, code lost:
    
        if (0 == 0) goto L55;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00db A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b4 A[Catch: all -> 0x0078, TryCatch #1 {all -> 0x0078, blocks: (B:13:0x0041, B:15:0x00af, B:19:0x00bc, B:21:0x00dd, B:25:0x00f6, B:26:0x010e, B:33:0x0125, B:39:0x012c, B:41:0x0120, B:28:0x0117, B:47:0x00c2, B:50:0x00c9, B:55:0x00b4, B:57:0x0131, B:58:0x0135, B:63:0x0060, B:66:0x0074, B:67:0x009c), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // kotlinx.coroutines.flow.SharedFlow, kotlinx.coroutines.flow.Flow
    @org.jetbrains.annotations.Nullable
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo4140a(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.FlowCollector<? super T> r18, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r19) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.StateFlowImpl.mo4140a(kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    /* renamed from: b */
    public void mo34220b() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    /* renamed from: c */
    public boolean mo34221c(T t) {
        setValue(t);
        return true;
    }

    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    @NotNull
    /* renamed from: d */
    public Flow<T> mo34223d(@NotNull CoroutineContext coroutineContext, int i2, @NotNull BufferOverflow bufferOverflow) {
        return StateFlowKt.m34248a(this, coroutineContext, i2, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    @Nullable
    /* renamed from: f */
    public Object mo4139f(T t, @NotNull Continuation<? super Unit> continuation) {
        setValue(t);
        return Unit.f63088a;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    /* renamed from: h */
    public StateFlowSlot mo34228h() {
        return new StateFlowSlot();
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    /* renamed from: i */
    public StateFlowSlot[] mo34229i(int i2) {
        return new StateFlowSlot[i2];
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow
    public void setValue(T t) {
        int i2;
        Object obj;
        Symbol symbol;
        boolean z;
        boolean z2;
        if (t == null) {
            t = (T) NullSurrogateKt.f68209a;
        }
        synchronized (this) {
            if (Intrinsics.m32174c(this._state, t)) {
                return;
            }
            this._state = t;
            int i3 = this.f68064f;
            if ((i3 & 1) != 0) {
                this.f68064f = i3 + 2;
                return;
            }
            int i4 = i3 + 1;
            this.f68064f = i4;
            Object obj2 = this.f68088b;
            while (true) {
                StateFlowSlot[] stateFlowSlotArr = (StateFlowSlot[]) obj2;
                if (stateFlowSlotArr != null) {
                    int length = stateFlowSlotArr.length;
                    int i5 = 0;
                    while (i5 < length) {
                        StateFlowSlot stateFlowSlot = stateFlowSlotArr[i5];
                        i5++;
                        if (stateFlowSlot != null) {
                            while (true) {
                                Object obj3 = stateFlowSlot._state;
                                if (obj3 != null && obj3 != (symbol = StateFlowKt.f68074b)) {
                                    Symbol symbol2 = StateFlowKt.f68073a;
                                    if (obj3 == symbol2) {
                                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = StateFlowSlot.f68075a;
                                        while (true) {
                                            if (atomicReferenceFieldUpdater.compareAndSet(stateFlowSlot, obj3, symbol)) {
                                                z = true;
                                                break;
                                            } else if (atomicReferenceFieldUpdater.get(stateFlowSlot) != obj3) {
                                                z = false;
                                                break;
                                            }
                                        }
                                        if (z) {
                                            break;
                                        }
                                    } else {
                                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = StateFlowSlot.f68075a;
                                        while (true) {
                                            if (atomicReferenceFieldUpdater2.compareAndSet(stateFlowSlot, obj3, symbol2)) {
                                                z2 = true;
                                                break;
                                            } else if (atomicReferenceFieldUpdater2.get(stateFlowSlot) != obj3) {
                                                z2 = false;
                                                break;
                                            }
                                        }
                                        if (z2) {
                                            ((CancellableContinuationImpl) obj3).mo31877j(Unit.f63088a);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i2 = this.f68064f;
                    if (i2 == i4) {
                        this.f68064f = i4 + 1;
                        return;
                    }
                    obj = this.f68088b;
                }
                obj2 = obj;
                i4 = i2;
            }
        }
    }
}
