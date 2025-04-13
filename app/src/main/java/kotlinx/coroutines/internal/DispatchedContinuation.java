package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CompletedWithCancellation;
import kotlinx.coroutines.CompletionStateKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.DebugStringsKt;
import kotlinx.coroutines.DispatchedTask;
import kotlinx.coroutines.EventLoop;
import kotlinx.coroutines.ThreadLocalEventLoop;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: DispatchedContinuation.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005¨\u0006\u0006"}, m31884d2 = {"Lkotlinx/coroutines/internal/DispatchedContinuation;", "T", "Lkotlinx/coroutines/DispatchedTask;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lkotlin/coroutines/Continuation;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class DispatchedContinuation<T> extends DispatchedTask<T> implements CoroutineStackFrame, Continuation<T> {

    /* renamed from: i */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f68245i = AtomicReferenceFieldUpdater.newUpdater(DispatchedContinuation.class, Object.class, "_reusableCancellableContinuation");

    @NotNull
    private volatile /* synthetic */ Object _reusableCancellableContinuation;

    /* renamed from: e */
    @JvmField
    @NotNull
    public final CoroutineDispatcher f68246e;

    /* renamed from: f */
    @JvmField
    @NotNull
    public final Continuation<T> f68247f;

    /* renamed from: g */
    @JvmField
    @Nullable
    public Object f68248g;

    /* renamed from: h */
    @JvmField
    @NotNull
    public final Object f68249h;

    /* JADX WARN: Multi-variable type inference failed */
    public DispatchedContinuation(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull Continuation<? super T> continuation) {
        super(-1);
        this.f68246e = coroutineDispatcher;
        this.f68247f = continuation;
        this.f68248g = DispatchedContinuationKt.f68250a;
        this.f68249h = ThreadContextKt.m34337b(getF66944f());
        this._reusableCancellableContinuation = null;
    }

    @Override // kotlinx.coroutines.DispatchedTask
    /* renamed from: a */
    public void mo33979a(@Nullable Object obj, @NotNull Throwable th) {
        if (obj instanceof CompletedWithCancellation) {
            ((CompletedWithCancellation) obj).f66958b.invoke(th);
        }
    }

    @Override // kotlinx.coroutines.DispatchedTask
    @NotNull
    /* renamed from: b */
    public Continuation<T> mo33980b() {
        return this;
    }

    @Override // kotlin.coroutines.Continuation
    @NotNull
    /* renamed from: g */
    public CoroutineContext getF66944f() {
        return this.f68247f.getF66944f();
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    /* renamed from: h */
    public CoroutineStackFrame mo32119h() {
        Continuation<T> continuation = this.f68247f;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlinx.coroutines.DispatchedTask
    @Nullable
    /* renamed from: i */
    public Object get_state() {
        Object obj = this.f68248g;
        this.f68248g = DispatchedContinuationKt.f68250a;
        return obj;
    }

    @Override // kotlin.coroutines.Continuation
    /* renamed from: j */
    public void mo31877j(@NotNull Object obj) {
        Object m34006b;
        CoroutineContext f66944f;
        Object m34338c;
        CoroutineContext f66944f2 = this.f68247f.getF66944f();
        m34006b = CompletionStateKt.m34006b(obj, null);
        if (this.f68246e.mo3222q(f66944f2)) {
            this.f68248g = m34006b;
            this.f66987d = 0;
            this.f68246e.mo3221m(f66944f2, this);
            return;
        }
        EventLoop m34117a = ThreadLocalEventLoop.f67053a.m34117a();
        if (m34117a.m34043d0()) {
            this.f68248g = m34006b;
            this.f66987d = 0;
            m34117a.m34041Z(this);
            return;
        }
        m34117a.m34042b0(true);
        try {
            f66944f = getF66944f();
            m34338c = ThreadContextKt.m34338c(f66944f, this.f68249h);
        } finally {
            try {
            } finally {
            }
        }
        try {
            this.f68247f.mo31877j(obj);
            while (m34117a.m34044n0()) {
            }
        } finally {
            ThreadContextKt.m34336a(f66944f, m34338c);
        }
    }

    @Nullable
    /* renamed from: k */
    public final CancellableContinuationImpl<T> m34275k() {
        boolean z;
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            if (obj == null) {
                this._reusableCancellableContinuation = DispatchedContinuationKt.f68251b;
                return null;
            }
            if (obj instanceof CancellableContinuationImpl) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f68245i;
                Symbol symbol = DispatchedContinuationKt.f68251b;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, symbol)) {
                        z = true;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    return (CancellableContinuationImpl) obj;
                }
            } else if (obj != DispatchedContinuationKt.f68251b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(Intrinsics.m32187p("Inconsistent state ", obj).toString());
            }
        }
    }

    /* renamed from: l */
    public final boolean m34276l() {
        return this._reusableCancellableContinuation != null;
    }

    /* renamed from: m */
    public final boolean m34277m(@NotNull Throwable th) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            Symbol symbol = DispatchedContinuationKt.f68251b;
            boolean z = false;
            boolean z2 = true;
            if (Intrinsics.m32174c(obj, symbol)) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f68245i;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, symbol, th)) {
                        z = true;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != symbol) {
                        break;
                    }
                }
                if (z) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f68245i;
                while (true) {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, null)) {
                        break;
                    }
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        z2 = false;
                        break;
                    }
                }
                if (z2) {
                    return false;
                }
            }
        }
    }

    /* renamed from: n */
    public final void m34278n() {
        Object obj = this._reusableCancellableContinuation;
        CancellableContinuationImpl cancellableContinuationImpl = obj instanceof CancellableContinuationImpl ? (CancellableContinuationImpl) obj : null;
        if (cancellableContinuationImpl == null) {
            return;
        }
        cancellableContinuationImpl.m33988o();
    }

    @Nullable
    /* renamed from: o */
    public final Throwable m34279o(@NotNull CancellableContinuation<?> cancellableContinuation) {
        boolean z;
        do {
            Object obj = this._reusableCancellableContinuation;
            Symbol symbol = DispatchedContinuationKt.f68251b;
            z = false;
            if (obj != symbol) {
                if (!(obj instanceof Throwable)) {
                    throw new IllegalStateException(Intrinsics.m32187p("Inconsistent state ", obj).toString());
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f68245i;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                        z = true;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                if (z) {
                    return (Throwable) obj;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f68245i;
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(this, symbol, cancellableContinuation)) {
                    z = true;
                    break;
                }
                if (atomicReferenceFieldUpdater2.get(this) != symbol) {
                    break;
                }
            }
        } while (!z);
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    /* renamed from: s */
    public StackTraceElement mo32120s() {
        return null;
    }

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("DispatchedContinuation[");
        m24u.append(this.f68246e);
        m24u.append(", ");
        m24u.append(DebugStringsKt.m34024c(this.f68247f));
        m24u.append(']');
        return m24u.toString();
    }
}
