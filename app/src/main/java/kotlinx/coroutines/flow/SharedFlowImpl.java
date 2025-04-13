package kotlinx.coroutines.flow;

import java.util.Arrays;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancellableContinuationKt;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowKt;
import kotlinx.coroutines.flow.internal.FusibleFlow;
import kotlinx.coroutines.internal.Symbol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SharedFlow.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0012\u0004\u0012\u00028\u00000\u0006:\u0001\u0007¨\u0006\b"}, m31884d2 = {"Lkotlinx/coroutines/flow/SharedFlowImpl;", "T", "Lkotlinx/coroutines/flow/internal/AbstractSharedFlow;", "Lkotlinx/coroutines/flow/SharedFlowSlot;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/CancellableFlow;", "Lkotlinx/coroutines/flow/internal/FusibleFlow;", "Emitter", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public class SharedFlowImpl<T> extends AbstractSharedFlow<SharedFlowSlot> implements MutableSharedFlow<T>, CancellableFlow<T>, FusibleFlow<T> {

    /* renamed from: f */
    public final int f68022f;

    /* renamed from: g */
    public final int f68023g;

    /* renamed from: h */
    @NotNull
    public final BufferOverflow f68024h;

    /* renamed from: i */
    @Nullable
    public Object[] f68025i;

    /* renamed from: j */
    public long f68026j;

    /* renamed from: k */
    public long f68027k;

    /* renamed from: l */
    public int f68028l;

    /* renamed from: m */
    public int f68029m;

    /* compiled from: SharedFlow.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlinx/coroutines/flow/SharedFlowImpl$Emitter;", "Lkotlinx/coroutines/DisposableHandle;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static final class Emitter implements DisposableHandle {

        /* renamed from: b */
        @JvmField
        @NotNull
        public final SharedFlowImpl<?> f68030b;

        /* renamed from: c */
        @JvmField
        public long f68031c;

        /* renamed from: d */
        @JvmField
        @Nullable
        public final Object f68032d;

        /* renamed from: e */
        @JvmField
        @NotNull
        public final Continuation<Unit> f68033e;

        /* JADX WARN: Multi-variable type inference failed */
        public Emitter(@NotNull SharedFlowImpl<?> sharedFlowImpl, long j2, @Nullable Object obj, @NotNull Continuation<? super Unit> continuation) {
            this.f68030b = sharedFlowImpl;
            this.f68031c = j2;
            this.f68032d = obj;
            this.f68033e = continuation;
        }

        @Override // kotlinx.coroutines.DisposableHandle
        /* renamed from: f */
        public void mo34038f() {
            SharedFlowImpl.m34224k(this.f68030b, this);
        }
    }

    /* compiled from: SharedFlow.kt */
    @Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[BufferOverflow.values().length];
            iArr[0] = 1;
            iArr[2] = 2;
            iArr[1] = 3;
        }
    }

    public SharedFlowImpl(int i2, int i3, @NotNull BufferOverflow bufferOverflow) {
        this.f68022f = i2;
        this.f68023g = i3;
        this.f68024h = bufferOverflow;
    }

    /* renamed from: k */
    public static final void m34224k(SharedFlowImpl sharedFlowImpl, Emitter emitter) {
        synchronized (sharedFlowImpl) {
            if (emitter.f68031c < sharedFlowImpl.m34226s()) {
                return;
            }
            Object[] objArr = sharedFlowImpl.f68025i;
            Intrinsics.m32176e(objArr);
            int i2 = (int) emitter.f68031c;
            if (objArr[(objArr.length - 1) & i2] != emitter) {
                return;
            }
            objArr[(objArr.length - 1) & i2] = SharedFlowKt.f68041a;
            sharedFlowImpl.m34231m();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|(3:(6:(1:(1:11)(2:46|47))(1:48)|12|13|14|15|(3:16|(4:26|(3:36|37|38)|29|(2:31|32)(1:33))(3:18|19|(2:21|22)(1:24))|25))(4:49|50|51|52)|42|43)(5:58|59|60|(2:62|(1:64))|66)|53|54|15|(3:16|(0)(0)|25)))|69|6|(0)(0)|53|54|15|(3:16|(0)(0)|25)) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00dc, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00dd, code lost:
    
        r5 = r8;
        r8 = r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00cb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object m34225n(kotlinx.coroutines.flow.SharedFlowImpl r8, kotlinx.coroutines.flow.FlowCollector r9, kotlin.coroutines.Continuation r10) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.SharedFlowImpl.m34225n(kotlinx.coroutines.flow.SharedFlowImpl, kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: s */
    private final long m34226s() {
        return Math.min(this.f68027k, this.f68026j);
    }

    @NotNull
    /* renamed from: A */
    public final Continuation<Unit>[] m34227A(long j2) {
        Object[] objArr;
        if (j2 > this.f68027k) {
            return AbstractSharedFlowKt.f68092a;
        }
        long m34226s = m34226s();
        long j3 = this.f68028l + m34226s;
        long j4 = 1;
        if (this.f68023g == 0 && this.f68029m > 0) {
            j3++;
        }
        if (this.f68089c != 0 && (objArr = this.f68088b) != null) {
            int length = objArr.length;
            int i2 = 0;
            while (i2 < length) {
                Object obj = objArr[i2];
                i2++;
                if (obj != null) {
                    long j5 = ((SharedFlowSlot) obj).f68042a;
                    if (j5 >= 0 && j5 < j3) {
                        j3 = j5;
                    }
                }
            }
        }
        if (j3 <= this.f68027k) {
            return AbstractSharedFlowKt.f68092a;
        }
        long m34235r = m34235r();
        int min = this.f68089c > 0 ? Math.min(this.f68029m, this.f68023g - ((int) (m34235r - j3))) : this.f68029m;
        Continuation<Unit>[] continuationArr = AbstractSharedFlowKt.f68092a;
        long j6 = this.f68029m + m34235r;
        if (min > 0) {
            continuationArr = new Continuation[min];
            Object[] objArr2 = this.f68025i;
            Intrinsics.m32176e(objArr2);
            long j7 = m34235r;
            int i3 = 0;
            while (true) {
                if (m34235r >= j6) {
                    m34235r = j7;
                    break;
                }
                long j8 = m34235r + j4;
                int i4 = (int) m34235r;
                Object obj2 = objArr2[(objArr2.length - 1) & i4];
                Symbol symbol = SharedFlowKt.f68041a;
                if (obj2 != symbol) {
                    Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    Emitter emitter = (Emitter) obj2;
                    int i5 = i3 + 1;
                    continuationArr[i3] = emitter.f68033e;
                    objArr2[(objArr2.length - 1) & i4] = symbol;
                    Object obj3 = emitter.f68032d;
                    long j9 = j7;
                    objArr2[((int) j9) & (objArr2.length - 1)] = obj3;
                    long j10 = j9 + 1;
                    if (i5 >= min) {
                        m34235r = j10;
                        break;
                    }
                    i3 = i5;
                    j7 = j10;
                    m34235r = j8;
                    j4 = 1;
                } else {
                    m34235r = j8;
                }
            }
        }
        int i6 = (int) (m34235r - m34226s);
        long j11 = this.f68089c == 0 ? m34235r : j3;
        long max = Math.max(this.f68026j, m34235r - Math.min(this.f68022f, i6));
        if (this.f68023g == 0 && max < j6) {
            Object[] objArr3 = this.f68025i;
            Intrinsics.m32176e(objArr3);
            if (Intrinsics.m32174c(objArr3[((int) max) & (objArr3.length - 1)], SharedFlowKt.f68041a)) {
                m34235r++;
                max++;
            }
        }
        m34242z(max, j11, m34235r, j6);
        m34231m();
        return (continuationArr.length == 0) ^ true ? m34234q(continuationArr) : continuationArr;
    }

    @Override // kotlinx.coroutines.flow.SharedFlow, kotlinx.coroutines.flow.Flow
    @Nullable
    /* renamed from: a */
    public Object mo4140a(@NotNull FlowCollector<? super T> flowCollector, @NotNull Continuation<?> continuation) {
        return m34225n(this, flowCollector, continuation);
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    /* renamed from: b */
    public void mo34220b() {
        synchronized (this) {
            m34242z(m34235r(), this.f68027k, m34235r(), m34226s() + this.f68028l + this.f68029m);
        }
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    /* renamed from: c */
    public boolean mo34221c(T t) {
        int i2;
        boolean z;
        Continuation<Unit>[] continuationArr = AbstractSharedFlowKt.f68092a;
        synchronized (this) {
            i2 = 0;
            if (m34239w(t)) {
                continuationArr = m34234q(continuationArr);
                z = true;
            } else {
                z = false;
            }
        }
        int length = continuationArr.length;
        while (i2 < length) {
            Continuation<Unit> continuation = continuationArr[i2];
            i2++;
            if (continuation != null) {
                continuation.mo31877j(Unit.f63088a);
            }
        }
        return z;
    }

    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    @NotNull
    /* renamed from: d */
    public Flow<T> mo34223d(@NotNull CoroutineContext coroutineContext, int i2, @NotNull BufferOverflow bufferOverflow) {
        return SharedFlowKt.m34243a(this, coroutineContext, i2, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    @Nullable
    /* renamed from: f */
    public Object mo4139f(T t, @NotNull Continuation<? super Unit> continuation) {
        Continuation<Unit>[] continuationArr;
        Emitter emitter;
        if (mo34221c(t)) {
            return Unit.f63088a;
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.m32122b(continuation), 1);
        cancellableContinuationImpl.m33993y();
        Continuation<Unit>[] continuationArr2 = AbstractSharedFlowKt.f68092a;
        synchronized (this) {
            if (m34239w(t)) {
                cancellableContinuationImpl.mo31877j(Unit.f63088a);
                continuationArr = m34234q(continuationArr2);
                emitter = null;
            } else {
                Emitter emitter2 = new Emitter(this, m34237u() + m34226s(), t, cancellableContinuationImpl);
                m34233p(emitter2);
                this.f68029m++;
                if (this.f68023g == 0) {
                    continuationArr2 = m34234q(continuationArr2);
                }
                continuationArr = continuationArr2;
                emitter = emitter2;
            }
        }
        if (emitter != null) {
            CancellableContinuationKt.m33995a(cancellableContinuationImpl, emitter);
        }
        int i2 = 0;
        int length = continuationArr.length;
        while (i2 < length) {
            Continuation<Unit> continuation2 = continuationArr[i2];
            i2++;
            if (continuation2 != null) {
                continuation2.mo31877j(Unit.f63088a);
            }
        }
        Object m33992v = cancellableContinuationImpl.m33992v();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (m33992v != coroutineSingletons) {
            m33992v = Unit.f63088a;
        }
        return m33992v == coroutineSingletons ? m33992v : Unit.f63088a;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    /* renamed from: h */
    public SharedFlowSlot mo34228h() {
        return new SharedFlowSlot();
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    /* renamed from: i */
    public SharedFlowSlot[] mo34229i(int i2) {
        return new SharedFlowSlot[i2];
    }

    /* renamed from: l */
    public final Object m34230l(SharedFlowSlot sharedFlowSlot, Continuation<? super Unit> continuation) {
        Unit unit;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.m32122b(continuation), 1);
        cancellableContinuationImpl.m33993y();
        synchronized (this) {
            if (m34240x(sharedFlowSlot) < 0) {
                sharedFlowSlot.f68043b = cancellableContinuationImpl;
                sharedFlowSlot.f68043b = cancellableContinuationImpl;
            } else {
                cancellableContinuationImpl.mo31877j(Unit.f63088a);
            }
            unit = Unit.f63088a;
        }
        Object m33992v = cancellableContinuationImpl.m33992v();
        return m33992v == CoroutineSingletons.COROUTINE_SUSPENDED ? m33992v : unit;
    }

    /* renamed from: m */
    public final void m34231m() {
        if (this.f68023g != 0 || this.f68029m > 1) {
            Object[] objArr = this.f68025i;
            Intrinsics.m32176e(objArr);
            while (this.f68029m > 0) {
                if (objArr[(objArr.length - 1) & ((int) ((m34226s() + m34237u()) - 1))] != SharedFlowKt.f68041a) {
                    return;
                }
                this.f68029m--;
                objArr[(objArr.length - 1) & ((int) (m34226s() + m34237u()))] = null;
            }
        }
    }

    /* renamed from: o */
    public final void m34232o() {
        Object[] objArr;
        Object[] objArr2 = this.f68025i;
        Intrinsics.m32176e(objArr2);
        objArr2[(objArr2.length - 1) & ((int) m34226s())] = null;
        this.f68028l--;
        long m34226s = m34226s() + 1;
        if (this.f68026j < m34226s) {
            this.f68026j = m34226s;
        }
        if (this.f68027k < m34226s) {
            if (this.f68089c != 0 && (objArr = this.f68088b) != null) {
                int i2 = 0;
                int length = objArr.length;
                while (i2 < length) {
                    Object obj = objArr[i2];
                    i2++;
                    if (obj != null) {
                        SharedFlowSlot sharedFlowSlot = (SharedFlowSlot) obj;
                        long j2 = sharedFlowSlot.f68042a;
                        if (j2 >= 0 && j2 < m34226s) {
                            sharedFlowSlot.f68042a = m34226s;
                        }
                    }
                }
            }
            this.f68027k = m34226s;
        }
    }

    /* renamed from: p */
    public final void m34233p(Object obj) {
        int m34237u = m34237u();
        Object[] objArr = this.f68025i;
        if (objArr == null) {
            objArr = m34238v(null, 0, 2);
        } else if (m34237u >= objArr.length) {
            objArr = m34238v(objArr, m34237u, objArr.length * 2);
        }
        objArr[((int) (m34226s() + m34237u)) & (objArr.length - 1)] = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object, java.lang.Object[]] */
    /* renamed from: q */
    public final Continuation<Unit>[] m34234q(Continuation<Unit>[] continuationArr) {
        Object[] objArr;
        SharedFlowSlot sharedFlowSlot;
        Continuation<? super Unit> continuation;
        int length = continuationArr.length;
        if (this.f68089c != 0 && (objArr = this.f68088b) != null) {
            int i2 = 0;
            int length2 = objArr.length;
            while (i2 < length2) {
                Object obj = objArr[i2];
                i2++;
                if (obj != null && (continuation = (sharedFlowSlot = (SharedFlowSlot) obj).f68043b) != null && m34240x(sharedFlowSlot) >= 0) {
                    int length3 = continuationArr.length;
                    continuationArr = continuationArr;
                    if (length >= length3) {
                        ?? copyOf = Arrays.copyOf(continuationArr, Math.max(2, continuationArr.length * 2));
                        Intrinsics.m32178g(copyOf, "copyOf(this, newSize)");
                        continuationArr = copyOf;
                    }
                    continuationArr[length] = continuation;
                    sharedFlowSlot.f68043b = null;
                    length++;
                }
            }
        }
        return continuationArr;
    }

    /* renamed from: r */
    public final long m34235r() {
        return m34226s() + this.f68028l;
    }

    /* renamed from: t */
    public final T m34236t() {
        Object[] objArr = this.f68025i;
        Intrinsics.m32176e(objArr);
        return (T) objArr[(objArr.length - 1) & ((int) ((this.f68026j + ((int) ((m34226s() + this.f68028l) - this.f68026j))) - 1))];
    }

    /* renamed from: u */
    public final int m34237u() {
        return this.f68028l + this.f68029m;
    }

    /* renamed from: v */
    public final Object[] m34238v(Object[] objArr, int i2, int i3) {
        int i4 = 0;
        if (!(i3 > 0)) {
            throw new IllegalStateException("Buffer size overflow".toString());
        }
        Object[] objArr2 = new Object[i3];
        this.f68025i = objArr2;
        if (objArr == null) {
            return objArr2;
        }
        long m34226s = m34226s();
        while (i4 < i2) {
            int i5 = i4 + 1;
            int i6 = (int) (i4 + m34226s);
            objArr2[i6 & (i3 - 1)] = objArr[(objArr.length - 1) & i6];
            i4 = i5;
        }
        return objArr2;
    }

    /* renamed from: w */
    public final boolean m34239w(T t) {
        if (this.f68089c == 0) {
            if (this.f68022f != 0) {
                m34233p(t);
                int i2 = this.f68028l + 1;
                this.f68028l = i2;
                if (i2 > this.f68022f) {
                    m34232o();
                }
                this.f68027k = m34226s() + this.f68028l;
            }
            return true;
        }
        if (this.f68028l >= this.f68023g && this.f68027k <= this.f68026j) {
            int ordinal = this.f68024h.ordinal();
            if (ordinal == 0) {
                return false;
            }
            if (ordinal == 2) {
                return true;
            }
        }
        m34233p(t);
        int i3 = this.f68028l + 1;
        this.f68028l = i3;
        if (i3 > this.f68023g) {
            m34232o();
        }
        long m34226s = m34226s() + this.f68028l;
        long j2 = this.f68026j;
        if (((int) (m34226s - j2)) > this.f68022f) {
            m34242z(j2 + 1, this.f68027k, m34235r(), m34226s() + this.f68028l + this.f68029m);
        }
        return true;
    }

    /* renamed from: x */
    public final long m34240x(SharedFlowSlot sharedFlowSlot) {
        long j2 = sharedFlowSlot.f68042a;
        if (j2 < m34235r()) {
            return j2;
        }
        if (this.f68023g <= 0 && j2 <= m34226s() && this.f68029m != 0) {
            return j2;
        }
        return -1L;
    }

    /* renamed from: y */
    public final Object m34241y(SharedFlowSlot sharedFlowSlot) {
        Object obj;
        Continuation<Unit>[] continuationArr = AbstractSharedFlowKt.f68092a;
        synchronized (this) {
            long m34240x = m34240x(sharedFlowSlot);
            if (m34240x < 0) {
                obj = SharedFlowKt.f68041a;
            } else {
                long j2 = sharedFlowSlot.f68042a;
                Object[] objArr = this.f68025i;
                Intrinsics.m32176e(objArr);
                Object obj2 = objArr[((int) m34240x) & (objArr.length - 1)];
                if (obj2 instanceof Emitter) {
                    obj2 = ((Emitter) obj2).f68032d;
                }
                sharedFlowSlot.f68042a = m34240x + 1;
                Object obj3 = obj2;
                continuationArr = m34227A(j2);
                obj = obj3;
            }
        }
        int i2 = 0;
        int length = continuationArr.length;
        while (i2 < length) {
            Continuation<Unit> continuation = continuationArr[i2];
            i2++;
            if (continuation != null) {
                continuation.mo31877j(Unit.f63088a);
            }
        }
        return obj;
    }

    /* renamed from: z */
    public final void m34242z(long j2, long j3, long j4, long j5) {
        long min = Math.min(j3, j2);
        for (long m34226s = m34226s(); m34226s < min; m34226s = 1 + m34226s) {
            Object[] objArr = this.f68025i;
            Intrinsics.m32176e(objArr);
            objArr[(objArr.length - 1) & ((int) m34226s)] = null;
        }
        this.f68026j = j2;
        this.f68027k = j3;
        this.f68028l = (int) (j4 - min);
        this.f68029m = (int) (j5 - j4);
    }
}
