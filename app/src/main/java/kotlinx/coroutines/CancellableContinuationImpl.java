package kotlinx.coroutines;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.Symbol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CancellableContinuationImpl.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0011\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u0005¨\u0006\u0006"}, m31884d2 = {"Lkotlinx/coroutines/CancellableContinuationImpl;", "T", "Lkotlinx/coroutines/DispatchedTask;", "Lkotlinx/coroutines/CancellableContinuation;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
@PublishedApi
/* loaded from: classes3.dex */
public class CancellableContinuationImpl<T> extends DispatchedTask<T> implements CancellableContinuation<T>, CoroutineStackFrame {

    /* renamed from: h */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f66941h = AtomicIntegerFieldUpdater.newUpdater(CancellableContinuationImpl.class, "_decision");

    /* renamed from: i */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f66942i = AtomicReferenceFieldUpdater.newUpdater(CancellableContinuationImpl.class, Object.class, "_state");

    @NotNull
    private volatile /* synthetic */ int _decision;

    @NotNull
    private volatile /* synthetic */ Object _state;

    /* renamed from: e */
    @NotNull
    public final Continuation<T> f66943e;

    /* renamed from: f */
    @NotNull
    public final CoroutineContext f66944f;

    /* renamed from: g */
    @Nullable
    public DisposableHandle f66945g;

    /* JADX WARN: Multi-variable type inference failed */
    public CancellableContinuationImpl(@NotNull Continuation<? super T> continuation, int i2) {
        super(i2);
        this.f66943e = continuation;
        this.f66944f = continuation.getF68225c();
        this._decision = 0;
        this._state = Active.f66929b;
    }

    /* renamed from: A */
    public final boolean m33970A() {
        return (this.f66987d == 2) && ((DispatchedContinuation) this.f66943e).m34276l();
    }

    /* renamed from: B */
    public final void m33971B(Function1<? super Throwable, Unit> function1, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + function1 + ", already has " + obj).toString());
    }

    @NotNull
    /* renamed from: C */
    public String mo33972C() {
        return "CancellableContinuation";
    }

    /* renamed from: D */
    public final void m33973D() {
        Continuation<T> continuation = this.f66943e;
        DispatchedContinuation dispatchedContinuation = continuation instanceof DispatchedContinuation ? (DispatchedContinuation) continuation : null;
        Throwable m34279o = dispatchedContinuation != null ? dispatchedContinuation.m34279o(this) : null;
        if (m34279o == null) {
            return;
        }
        m33988o();
        m33987n(m34279o);
    }

    @JvmName
    /* renamed from: E */
    public final boolean m33974E() {
        Object obj = this._state;
        if ((obj instanceof CompletedContinuation) && ((CompletedContinuation) obj).f66953d != null) {
            m33988o();
            return false;
        }
        this._decision = 0;
        this._state = Active.f66929b;
        return true;
    }

    /* renamed from: F */
    public void m33975F(T t, @Nullable Function1<? super Throwable, Unit> function1) {
        m33976H(t, this.f66987d, function1);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    /* renamed from: G */
    public void mo33964G(@NotNull Object obj) {
        m33990q(this.f66987d);
    }

    /* renamed from: H */
    public final void m33976H(Object obj, int i2, Function1<? super Throwable, Unit> function1) {
        boolean z;
        do {
            Object obj2 = this._state;
            z = false;
            if (!(obj2 instanceof NotCompleted)) {
                if (obj2 instanceof CancelledContinuation) {
                    CancelledContinuation cancelledContinuation = (CancelledContinuation) obj2;
                    Objects.requireNonNull(cancelledContinuation);
                    if (CancelledContinuation.f66947c.compareAndSet(cancelledContinuation, 0, 1)) {
                        if (function1 == null) {
                            return;
                        }
                        m33986m(function1, cancelledContinuation.f66956a);
                        return;
                    }
                }
                throw new IllegalStateException(Intrinsics.m32187p("Already resumed, but proposed with update ", obj).toString());
            }
            Object m33977I = m33977I((NotCompleted) obj2, obj, i2, function1, null);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f66942i;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, m33977I)) {
                    z = true;
                    break;
                } else if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
        } while (!z);
        m33989p();
        m33990q(i2);
    }

    /* renamed from: I */
    public final Object m33977I(NotCompleted notCompleted, Object obj, int i2, Function1<? super Throwable, Unit> function1, Object obj2) {
        if (obj instanceof CompletedExceptionally) {
            return obj;
        }
        if (!DispatchedTaskKt.m34036a(i2) && obj2 == null) {
            return obj;
        }
        if (function1 != null || (((notCompleted instanceof CancelHandler) && !(notCompleted instanceof BeforeResumeCancelHandler)) || obj2 != null)) {
            return new CompletedContinuation(obj, notCompleted instanceof CancelHandler ? (CancelHandler) notCompleted : null, function1, obj2, null, 16);
        }
        return obj;
    }

    /* renamed from: J */
    public final Symbol m33978J(Object obj, Object obj2, Function1<? super Throwable, Unit> function1) {
        boolean z;
        do {
            Object obj3 = this._state;
            if (!(obj3 instanceof NotCompleted)) {
                if ((obj3 instanceof CompletedContinuation) && obj2 != null && ((CompletedContinuation) obj3).f66953d == obj2) {
                    return CancellableContinuationImplKt.f66946a;
                }
                return null;
            }
            Object m33977I = m33977I((NotCompleted) obj3, obj, this.f66987d, function1, obj2);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f66942i;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj3, m33977I)) {
                    z = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != obj3) {
                    z = false;
                    break;
                }
            }
        } while (!z);
        m33989p();
        return CancellableContinuationImplKt.f66946a;
    }

    @Override // kotlinx.coroutines.DispatchedTask
    /* renamed from: a */
    public void mo33979a(@Nullable Object obj, @NotNull Throwable th) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof NotCompleted) {
                throw new IllegalStateException("Not completed".toString());
            }
            if (obj2 instanceof CompletedExceptionally) {
                return;
            }
            boolean z = false;
            if (obj2 instanceof CompletedContinuation) {
                CompletedContinuation completedContinuation = (CompletedContinuation) obj2;
                if (!(!(completedContinuation.f66954e != null))) {
                    throw new IllegalStateException("Must be called at most once".toString());
                }
                CompletedContinuation m34003a = CompletedContinuation.m34003a(completedContinuation, null, null, null, null, th, 15);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f66942i;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, m34003a)) {
                        z = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (z) {
                    CancelHandler cancelHandler = completedContinuation.f66951b;
                    if (cancelHandler != null) {
                        m33985l(cancelHandler, th);
                    }
                    Function1<Throwable, Unit> function1 = completedContinuation.f66952c;
                    if (function1 == null) {
                        return;
                    }
                    m33986m(function1, th);
                    return;
                }
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f66942i;
                CompletedContinuation completedContinuation2 = new CompletedContinuation(obj2, null, null, null, th, 14);
                while (true) {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj2, completedContinuation2)) {
                        z = true;
                        break;
                    } else if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                        break;
                    }
                }
                if (z) {
                    return;
                }
            }
        }
    }

    @Override // kotlinx.coroutines.DispatchedTask
    @NotNull
    /* renamed from: b */
    public final Continuation<T> mo33980b() {
        return this.f66943e;
    }

    @Override // kotlinx.coroutines.DispatchedTask
    @Nullable
    /* renamed from: c */
    public Throwable mo33981c(@Nullable Object obj) {
        Throwable mo33981c = super.mo33981c(obj);
        if (mo33981c == null) {
            return null;
        }
        return mo33981c;
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    @Nullable
    /* renamed from: d */
    public Object mo33965d(T t, @Nullable Object obj) {
        return m33978J(t, obj, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.DispatchedTask
    /* renamed from: e */
    public <T> T mo33982e(@Nullable Object obj) {
        return obj instanceof CompletedContinuation ? (T) ((CompletedContinuation) obj).f66950a : obj;
    }

    @Override // kotlin.coroutines.Continuation
    @NotNull
    /* renamed from: g, reason: from getter */
    public CoroutineContext getF68225c() {
        return this.f66944f;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    /* renamed from: h */
    public CoroutineStackFrame mo32119h() {
        Continuation<T> continuation = this.f66943e;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlinx.coroutines.DispatchedTask
    @Nullable
    /* renamed from: i, reason: from getter */
    public Object get_state() {
        return this._state;
    }

    @Override // kotlin.coroutines.Continuation
    /* renamed from: j */
    public void mo31877j(@NotNull Object obj) {
        Throwable m31890a = Result.m31890a(obj);
        if (m31890a != null) {
            obj = new CompletedExceptionally(m31890a, false, 2);
        }
        m33976H(obj, this.f66987d, null);
    }

    /* renamed from: k */
    public final void m33984k(Function1<? super Throwable, Unit> function1, Throwable th) {
        try {
            function1.invoke(th);
        } catch (Throwable th2) {
            CoroutineExceptionHandlerKt.m34016a(this.f66944f, new CompletionHandlerException(Intrinsics.m32187p("Exception in invokeOnCancellation handler for ", this), th2));
        }
    }

    /* renamed from: l */
    public final void m33985l(@NotNull CancelHandler cancelHandler, @Nullable Throwable th) {
        try {
            cancelHandler.mo33959a(th);
        } catch (Throwable th2) {
            CoroutineExceptionHandlerKt.m34016a(this.f66944f, new CompletionHandlerException(Intrinsics.m32187p("Exception in invokeOnCancellation handler for ", this), th2));
        }
    }

    /* renamed from: m */
    public final void m33986m(@NotNull Function1<? super Throwable, Unit> function1, @NotNull Throwable th) {
        try {
            function1.invoke(th);
        } catch (Throwable th2) {
            CoroutineExceptionHandlerKt.m34016a(this.f66944f, new CompletionHandlerException(Intrinsics.m32187p("Exception in resume onCancellation handler for ", this), th2));
        }
    }

    /* renamed from: n */
    public boolean m33987n(@Nullable Throwable th) {
        Object obj;
        boolean z;
        boolean z2;
        do {
            obj = this._state;
            z = false;
            if (!(obj instanceof NotCompleted)) {
                return false;
            }
            z2 = obj instanceof CancelHandler;
            CancelledContinuation cancelledContinuation = new CancelledContinuation(this, th, z2);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f66942i;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, cancelledContinuation)) {
                    z = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
        } while (!z);
        CancelHandler cancelHandler = z2 ? (CancelHandler) obj : null;
        if (cancelHandler != null) {
            m33985l(cancelHandler, th);
        }
        m33989p();
        m33990q(this.f66987d);
        return true;
    }

    /* renamed from: o */
    public final void m33988o() {
        DisposableHandle disposableHandle = this.f66945g;
        if (disposableHandle == null) {
            return;
        }
        disposableHandle.mo34038f();
        this.f66945g = NonDisposableHandle.f67044b;
    }

    /* renamed from: p */
    public final void m33989p() {
        if (m33970A()) {
            return;
        }
        m33988o();
    }

    /* JADX WARN: Finally extract failed */
    /* renamed from: q */
    public final void m33990q(int i2) {
        boolean z;
        while (true) {
            int i3 = this._decision;
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("Already resumed".toString());
                }
                z = false;
            } else if (f66941h.compareAndSet(this, 0, 2)) {
                z = true;
                break;
            }
        }
        if (z) {
            return;
        }
        Continuation<T> mo33980b = mo33980b();
        boolean z2 = i2 == 4;
        if (z2 || !(mo33980b instanceof DispatchedContinuation) || DispatchedTaskKt.m34036a(i2) != DispatchedTaskKt.m34036a(this.f66987d)) {
            DispatchedTaskKt.m34037b(this, mo33980b, z2);
            return;
        }
        CoroutineDispatcher coroutineDispatcher = ((DispatchedContinuation) mo33980b).f68246e;
        CoroutineContext f68225c = mo33980b.getF68225c();
        if (coroutineDispatcher.mo3222q(f68225c)) {
            coroutineDispatcher.mo3221m(f68225c, this);
            return;
        }
        EventLoop m34117a = ThreadLocalEventLoop.f67053a.m34117a();
        if (m34117a.m34043d0()) {
            m34117a.m34041Z(this);
            return;
        }
        m34117a.m34042b0(true);
        try {
            DispatchedTaskKt.m34037b(this, mo33980b(), true);
            do {
            } while (m34117a.m34044n0());
        } catch (Throwable th) {
            try {
                m34035f(th, null);
            } finally {
                m34117a.m34045v(true);
            }
        }
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    /* renamed from: r */
    public void mo33966r(@NotNull Function1<? super Throwable, Unit> function1) {
        CancelHandler invokeOnCancel = function1 instanceof CancelHandler ? (CancelHandler) function1 : new InvokeOnCancel(function1);
        while (true) {
            Object obj = this._state;
            boolean z = false;
            if (obj instanceof Active) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f66942i;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, invokeOnCancel)) {
                        z = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                if (z) {
                    return;
                }
            } else {
                if (obj instanceof CancelHandler) {
                    m33971B(function1, obj);
                    throw null;
                }
                boolean z2 = obj instanceof CompletedExceptionally;
                if (z2) {
                    CompletedExceptionally completedExceptionally = (CompletedExceptionally) obj;
                    Objects.requireNonNull(completedExceptionally);
                    if (!CompletedExceptionally.f66955b.compareAndSet(completedExceptionally, 0, 1)) {
                        m33971B(function1, obj);
                        throw null;
                    }
                    if (obj instanceof CancelledContinuation) {
                        if (!z2) {
                            completedExceptionally = null;
                        }
                        m33984k(function1, completedExceptionally != null ? completedExceptionally.f66956a : null);
                        return;
                    }
                    return;
                }
                if (obj instanceof CompletedContinuation) {
                    CompletedContinuation completedContinuation = (CompletedContinuation) obj;
                    if (completedContinuation.f66951b != null) {
                        m33971B(function1, obj);
                        throw null;
                    }
                    if (invokeOnCancel instanceof BeforeResumeCancelHandler) {
                        return;
                    }
                    Throwable th = completedContinuation.f66954e;
                    if (th != null) {
                        m33984k(function1, th);
                        return;
                    }
                    CompletedContinuation m34003a = CompletedContinuation.m34003a(completedContinuation, null, invokeOnCancel, null, null, null, 29);
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f66942i;
                    while (true) {
                        if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, m34003a)) {
                            z = true;
                            break;
                        } else if (atomicReferenceFieldUpdater2.get(this) != obj) {
                            break;
                        }
                    }
                    if (z) {
                        return;
                    }
                } else {
                    if (invokeOnCancel instanceof BeforeResumeCancelHandler) {
                        return;
                    }
                    CompletedContinuation completedContinuation2 = new CompletedContinuation(obj, invokeOnCancel, null, null, null, 28);
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = f66942i;
                    while (true) {
                        if (atomicReferenceFieldUpdater3.compareAndSet(this, obj, completedContinuation2)) {
                            z = true;
                            break;
                        } else if (atomicReferenceFieldUpdater3.get(this) != obj) {
                            break;
                        }
                    }
                    if (z) {
                        return;
                    }
                }
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    /* renamed from: s */
    public StackTraceElement mo32120s() {
        return null;
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    @Nullable
    /* renamed from: t */
    public Object mo33967t(@NotNull Throwable th) {
        return m33978J(new CompletedExceptionally(th, false, 2), null, null);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo33972C());
        sb.append('(');
        sb.append(DebugStringsKt.m34024c(this.f66943e));
        sb.append("){");
        Object obj = this._state;
        sb.append(obj instanceof NotCompleted ? "Active" : obj instanceof CancelledContinuation ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(DebugStringsKt.m34023b(this));
        return sb.toString();
    }

    @NotNull
    /* renamed from: u */
    public Throwable mo33991u(@NotNull Job job) {
        return ((JobSupport) job).mo34064o();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        if (r4.f66945g != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        m33994z();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        if (r0 == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        m33973D();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        return kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
    
        if (r0 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:
    
        m33973D();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        r0 = r4._state;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
    
        if ((r0 instanceof kotlinx.coroutines.CompletedExceptionally) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0045, code lost:
    
        if (kotlinx.coroutines.DispatchedTaskKt.m34036a(r4.f66987d) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
    
        r1 = r4.f66944f;
        r2 = kotlinx.coroutines.Job.f67018J1;
        r1 = (kotlinx.coroutines.Job) r1.get(kotlinx.coroutines.Job.Key.f67019b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
    
        if (r1 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0059, code lost:
    
        if (r1.mo33950a() == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005c, code lost:
    
        r1 = r1.mo34064o();
        mo33979a(r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0063, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0068, code lost:
    
        return mo33982e(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006d, code lost:
    
        throw ((kotlinx.coroutines.CompletedExceptionally) r0).f66956a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (r2 == false) goto L21;
     */
    @kotlin.PublishedApi
    @org.jetbrains.annotations.Nullable
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m33992v() {
        /*
            r4 = this;
            boolean r0 = r4.m33970A()
        L4:
            int r1 = r4._decision
            r2 = 0
            if (r1 == 0) goto L19
            r3 = 2
            if (r1 != r3) goto Ld
            goto L23
        Ld:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Already suspended"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L19:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = kotlinx.coroutines.CancellableContinuationImpl.f66941h
            r3 = 1
            boolean r1 = r1.compareAndSet(r4, r2, r3)
            if (r1 == 0) goto L4
            r2 = 1
        L23:
            if (r2 == 0) goto L34
            kotlinx.coroutines.DisposableHandle r1 = r4.f66945g
            if (r1 != 0) goto L2c
            r4.m33994z()
        L2c:
            if (r0 == 0) goto L31
            r4.m33973D()
        L31:
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            return r0
        L34:
            if (r0 == 0) goto L39
            r4.m33973D()
        L39:
            java.lang.Object r0 = r4._state
            boolean r1 = r0 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r1 != 0) goto L69
            int r1 = r4.f66987d
            boolean r1 = kotlinx.coroutines.DispatchedTaskKt.m34036a(r1)
            if (r1 == 0) goto L64
            kotlin.coroutines.CoroutineContext r1 = r4.f66944f
            int r2 = kotlinx.coroutines.Job.f67018J1
            kotlinx.coroutines.Job$Key r2 = kotlinx.coroutines.Job.Key.f67019b
            kotlin.coroutines.CoroutineContext$Element r1 = r1.get(r2)
            kotlinx.coroutines.Job r1 = (kotlinx.coroutines.Job) r1
            if (r1 == 0) goto L64
            boolean r2 = r1.mo33950a()
            if (r2 == 0) goto L5c
            goto L64
        L5c:
            java.util.concurrent.CancellationException r1 = r1.mo34064o()
            r4.mo33979a(r0, r1)
            throw r1
        L64:
            java.lang.Object r0 = r4.mo33982e(r0)
            return r0
        L69:
            kotlinx.coroutines.CompletedExceptionally r0 = (kotlinx.coroutines.CompletedExceptionally) r0
            java.lang.Throwable r0 = r0.f66956a
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.CancellableContinuationImpl.m33992v():java.lang.Object");
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    @Nullable
    /* renamed from: w */
    public Object mo33968w(T t, @Nullable Object obj, @Nullable Function1<? super Throwable, Unit> function1) {
        return m33978J(t, obj, function1);
    }

    @Override // kotlinx.coroutines.CancellableContinuation
    /* renamed from: x */
    public void mo33969x(@NotNull CoroutineDispatcher coroutineDispatcher, T t) {
        Continuation<T> continuation = this.f66943e;
        DispatchedContinuation dispatchedContinuation = continuation instanceof DispatchedContinuation ? (DispatchedContinuation) continuation : null;
        m33976H(t, (dispatchedContinuation == null ? null : dispatchedContinuation.f68246e) == coroutineDispatcher ? 4 : this.f66987d, null);
    }

    /* renamed from: y */
    public void m33993y() {
        DisposableHandle m33994z = m33994z();
        if (m33994z != null && (!(this._state instanceof NotCompleted))) {
            m33994z.mo34038f();
            this.f66945g = NonDisposableHandle.f67044b;
        }
    }

    /* renamed from: z */
    public final DisposableHandle m33994z() {
        CoroutineContext coroutineContext = this.f66944f;
        int i2 = Job.f67018J1;
        Job job = (Job) coroutineContext.get(Job.Key.f67019b);
        if (job == null) {
            return null;
        }
        DisposableHandle m34066b = Job.DefaultImpls.m34066b(job, true, false, new ChildContinuation(this), 2, null);
        this.f66945g = m34066b;
        return m34066b;
    }
}
