package kotlinx.coroutines.selects;

import androidx.room.util.C0576a;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImplKt;
import kotlinx.coroutines.CompletedExceptionally;
import kotlinx.coroutines.CompletionStateKt;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobCancellingNode;
import kotlinx.coroutines.internal.AtomicDesc;
import kotlinx.coroutines.internal.AtomicKt;
import kotlinx.coroutines.internal.AtomicOp;
import kotlinx.coroutines.internal.LockFreeLinkedListHead;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.OpDescriptor;
import kotlinx.coroutines.intrinsics.CancellableKt;
import kotlinx.coroutines.intrinsics.UndispatchedKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: Select.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\u00060\u0006j\u0002`\u0007:\u0004\b\t\n\u000b¨\u0006\f"}, m31884d2 = {"Lkotlinx/coroutines/selects/SelectBuilderImpl;", "R", "Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "Lkotlinx/coroutines/selects/SelectBuilder;", "Lkotlinx/coroutines/selects/SelectInstance;", "Lkotlin/coroutines/Continuation;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "AtomicSelectOp", "DisposeNode", "PairSelectOp", "SelectOnCancelling", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
@PublishedApi
/* loaded from: classes3.dex */
public final class SelectBuilderImpl<R> extends LockFreeLinkedListHead implements SelectBuilder<R>, SelectInstance<R>, Continuation<R>, CoroutineStackFrame {

    /* renamed from: f */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f68373f = AtomicReferenceFieldUpdater.newUpdater(SelectBuilderImpl.class, Object.class, "_state");

    /* renamed from: g */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f68374g = AtomicReferenceFieldUpdater.newUpdater(SelectBuilderImpl.class, Object.class, "_result");

    @NotNull
    private volatile /* synthetic */ Object _parentHandle;

    @NotNull
    private volatile /* synthetic */ Object _result;

    @NotNull
    public volatile /* synthetic */ Object _state;

    /* renamed from: e */
    @NotNull
    public final Continuation<R> f68375e;

    /* compiled from: Select.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, m31884d2 = {"Lkotlinx/coroutines/selects/SelectBuilderImpl$AtomicSelectOp;", "Lkotlinx/coroutines/internal/AtomicOp;", "", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static final class AtomicSelectOp extends AtomicOp<Object> {

        /* renamed from: b */
        @JvmField
        @NotNull
        public final SelectBuilderImpl<?> f68378b;

        /* renamed from: c */
        @JvmField
        @NotNull
        public final AtomicDesc f68379c;

        /* renamed from: d */
        public final long f68380d;

        public AtomicSelectOp(@NotNull SelectBuilderImpl<?> selectBuilderImpl, @NotNull AtomicDesc atomicDesc) {
            this.f68378b = selectBuilderImpl;
            this.f68379c = atomicDesc;
            SeqNumber seqNumber = SelectKt.f68388e;
            Objects.requireNonNull(seqNumber);
            this.f68380d = SeqNumber.f68389a.incrementAndGet(seqNumber);
            atomicDesc.f68235a = this;
        }

        @Override // kotlinx.coroutines.internal.AtomicOp
        /* renamed from: d */
        public void mo34264d(@Nullable Object obj, @Nullable Object obj2) {
            Object obj3;
            boolean z = false;
            boolean z2 = obj2 == null;
            if (z2) {
                obj3 = null;
            } else {
                Object obj4 = SelectKt.f68384a;
                obj3 = SelectKt.f68384a;
            }
            SelectBuilderImpl<?> selectBuilderImpl = this.f68378b;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = SelectBuilderImpl.f68373f;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(selectBuilderImpl, this, obj3)) {
                    z = true;
                    break;
                } else if (atomicReferenceFieldUpdater.get(selectBuilderImpl) != this) {
                    break;
                }
            }
            if (z && z2) {
                this.f68378b.m34388R();
            }
            this.f68379c.mo34260a(this, obj2);
        }

        @Override // kotlinx.coroutines.internal.AtomicOp
        /* renamed from: g, reason: from getter */
        public long getF68380d() {
            return this.f68380d;
        }

        @Override // kotlinx.coroutines.internal.AtomicOp
        @Nullable
        /* renamed from: i */
        public Object mo34105i(@Nullable Object obj) {
            Object obj2;
            boolean z;
            if (obj == null) {
                SelectBuilderImpl<?> selectBuilderImpl = this.f68378b;
                while (true) {
                    Object obj3 = selectBuilderImpl._state;
                    obj2 = null;
                    if (obj3 == this) {
                        break;
                    }
                    if (!(obj3 instanceof OpDescriptor)) {
                        Object obj4 = SelectKt.f68384a;
                        Object obj5 = SelectKt.f68384a;
                        if (obj3 != obj5) {
                            obj2 = SelectKt.f68385b;
                            break;
                        }
                        SelectBuilderImpl<?> selectBuilderImpl2 = this.f68378b;
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = SelectBuilderImpl.f68373f;
                        while (true) {
                            if (atomicReferenceFieldUpdater.compareAndSet(selectBuilderImpl2, obj5, this)) {
                                z = true;
                                break;
                            }
                            if (atomicReferenceFieldUpdater.get(selectBuilderImpl2) != obj5) {
                                z = false;
                                break;
                            }
                        }
                        if (z) {
                            break;
                        }
                    } else {
                        ((OpDescriptor) obj3).mo34263c(this.f68378b);
                    }
                }
                if (obj2 != null) {
                    return obj2;
                }
            }
            try {
                return this.f68379c.mo34261b(this);
            } catch (Throwable th) {
                if (obj == null) {
                    SelectBuilderImpl<?> selectBuilderImpl3 = this.f68378b;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = SelectBuilderImpl.f68373f;
                    Object obj6 = SelectKt.f68384a;
                    Object obj7 = SelectKt.f68384a;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(selectBuilderImpl3, this, obj7) && atomicReferenceFieldUpdater2.get(selectBuilderImpl3) == this) {
                    }
                }
                throw th;
            }
        }

        @Override // kotlinx.coroutines.internal.OpDescriptor
        @NotNull
        public String toString() {
            StringBuilder m24u = C0000a.m24u("AtomicSelectOp(sequence=");
            m24u.append(this.f68380d);
            m24u.append(')');
            return m24u.toString();
        }
    }

    /* compiled from: Select.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlinx/coroutines/selects/SelectBuilderImpl$DisposeNode;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static final class DisposeNode extends LockFreeLinkedListNode {

        /* renamed from: e */
        @JvmField
        @NotNull
        public final DisposableHandle f68381e;

        public DisposeNode(@NotNull DisposableHandle disposableHandle) {
            this.f68381e = disposableHandle;
        }
    }

    /* compiled from: Select.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlinx/coroutines/selects/SelectBuilderImpl$PairSelectOp;", "Lkotlinx/coroutines/internal/OpDescriptor;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static final class PairSelectOp extends OpDescriptor {

        /* renamed from: a */
        @JvmField
        @NotNull
        public final LockFreeLinkedListNode.PrepareOp f68382a;

        public PairSelectOp(@NotNull LockFreeLinkedListNode.PrepareOp prepareOp) {
            this.f68382a = prepareOp;
        }

        @Override // kotlinx.coroutines.internal.OpDescriptor
        @NotNull
        /* renamed from: a */
        public AtomicOp<?> mo34262a() {
            return this.f68382a.mo34262a();
        }

        @Override // kotlinx.coroutines.internal.OpDescriptor
        @Nullable
        /* renamed from: c */
        public Object mo34263c(@Nullable Object obj) {
            Object obj2;
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectBuilderImpl<*>");
            SelectBuilderImpl selectBuilderImpl = (SelectBuilderImpl) obj;
            LockFreeLinkedListNode.PrepareOp prepareOp = this.f68382a;
            prepareOp.f68278c.mo34298e(prepareOp);
            Object m34265e = this.f68382a.mo34262a().m34265e(null);
            if (m34265e == null) {
                obj2 = this.f68382a.f68278c;
            } else {
                Object obj3 = SelectKt.f68384a;
                obj2 = SelectKt.f68384a;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = SelectBuilderImpl.f68373f;
            while (!atomicReferenceFieldUpdater.compareAndSet(selectBuilderImpl, this, obj2) && atomicReferenceFieldUpdater.get(selectBuilderImpl) == this) {
            }
            return m34265e;
        }
    }

    /* compiled from: Select.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlinx/coroutines/selects/SelectBuilderImpl$SelectOnCancelling;", "Lkotlinx/coroutines/JobCancellingNode;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
    public final class SelectOnCancelling extends JobCancellingNode {
        public SelectOnCancelling() {
        }

        @Override // kotlinx.coroutines.CompletionHandlerBase
        /* renamed from: R */
        public void mo33958R(@Nullable Throwable th) {
            if (SelectBuilderImpl.this.mo34393e()) {
                SelectBuilderImpl.this.mo34396y(m34074S().mo34064o());
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            mo33958R(th);
            return Unit.f63088a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SelectBuilderImpl(@NotNull Continuation<? super R> continuation) {
        this.f68375e = continuation;
        Object obj = SelectKt.f68384a;
        this._state = SelectKt.f68384a;
        this._result = SelectKt.f68386c;
        this._parentHandle = null;
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    /* renamed from: C */
    public void mo34387C(@NotNull DisposableHandle disposableHandle) {
        DisposeNode disposeNode = new DisposeNode(disposableHandle);
        if (!mo34394o()) {
            while (!m34292K().m34287E(disposeNode, this)) {
            }
            if (!mo34394o()) {
                return;
            }
        }
        disposableHandle.mo34038f();
    }

    /* renamed from: R */
    public final void m34388R() {
        DisposableHandle disposableHandle = (DisposableHandle) this._parentHandle;
        if (disposableHandle != null) {
            disposableHandle.mo34038f();
        }
        for (LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) m34290I(); !Intrinsics.m32174c(lockFreeLinkedListNode, this); lockFreeLinkedListNode = lockFreeLinkedListNode.m34291J()) {
            if (lockFreeLinkedListNode instanceof DisposeNode) {
                ((DisposeNode) lockFreeLinkedListNode).f68381e.mo34038f();
            }
        }
    }

    @PublishedApi
    @Nullable
    /* renamed from: S */
    public final Object m34389S() {
        boolean z;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (!mo34394o()) {
            CoroutineContext f68225c = getF68225c();
            int i2 = Job.f67018J1;
            Job job = (Job) f68225c.get(Job.Key.f67019b);
            if (job != null) {
                DisposableHandle m34066b = Job.DefaultImpls.m34066b(job, true, false, new SelectOnCancelling(), 2, null);
                this._parentHandle = m34066b;
                if (mo34394o()) {
                    m34066b.mo34038f();
                }
            }
        }
        Object obj = this._result;
        Object obj2 = SelectKt.f68384a;
        Object obj3 = SelectKt.f68386c;
        if (obj == obj3) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f68374g;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj3, coroutineSingletons)) {
                    z = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != obj3) {
                    z = false;
                    break;
                }
            }
            if (z) {
                return coroutineSingletons;
            }
            obj = this._result;
        }
        Object obj4 = SelectKt.f68384a;
        if (obj == SelectKt.f68387d) {
            throw new IllegalStateException("Already resumed");
        }
        if (obj instanceof CompletedExceptionally) {
            throw ((CompletedExceptionally) obj).f66956a;
        }
        return obj;
    }

    @PublishedApi
    /* renamed from: T */
    public final void m34390T(@NotNull Throwable th) {
        if (mo34393e()) {
            mo31877j(ResultKt.m31891a(th));
            return;
        }
        if (th instanceof CancellationException) {
            return;
        }
        Object m34389S = m34389S();
        if ((m34389S instanceof CompletedExceptionally) && ((CompletedExceptionally) m34389S).f66956a == th) {
            return;
        }
        CoroutineExceptionHandlerKt.m34016a(getF68225c(), th);
    }

    /* renamed from: U */
    public void m34391U(long j2, @NotNull final Function1<? super Continuation<? super R>, ? extends Object> function1) {
        if (j2 > 0) {
            mo34387C(DelayKt.m34033b(getF68225c()).mo34028l(j2, new Runnable() { // from class: kotlinx.coroutines.selects.SelectBuilderImpl$onTimeout$$inlined$Runnable$1
                @Override // java.lang.Runnable
                public final void run() {
                    if (SelectBuilderImpl.this.mo34393e()) {
                        Function1 function12 = function1;
                        SelectBuilderImpl selectBuilderImpl = SelectBuilderImpl.this;
                        Objects.requireNonNull(selectBuilderImpl);
                        CancellableKt.m34349c(function12, selectBuilderImpl);
                    }
                }
            }, getF68225c()));
        } else if (mo34393e()) {
            UndispatchedKt.m34352a(function1, this);
        }
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    @Nullable
    /* renamed from: b */
    public Object mo34392b(@Nullable LockFreeLinkedListNode.PrepareOp prepareOp) {
        while (true) {
            Object obj = this._state;
            Object obj2 = SelectKt.f68384a;
            Object obj3 = SelectKt.f68384a;
            if (obj == obj3) {
                boolean z = false;
                if (prepareOp == null) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f68373f;
                    while (true) {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj3, null)) {
                            z = true;
                            break;
                        }
                        if (atomicReferenceFieldUpdater.get(this) != obj3) {
                            break;
                        }
                    }
                    if (z) {
                        break;
                    }
                } else {
                    PairSelectOp pairSelectOp = new PairSelectOp(prepareOp);
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f68373f;
                    while (true) {
                        if (atomicReferenceFieldUpdater2.compareAndSet(this, obj3, pairSelectOp)) {
                            z = true;
                            break;
                        }
                        if (atomicReferenceFieldUpdater2.get(this) != obj3) {
                            break;
                        }
                    }
                    if (z) {
                        Object mo34263c = pairSelectOp.mo34263c(this);
                        if (mo34263c != null) {
                            return mo34263c;
                        }
                    }
                }
            } else {
                if (!(obj instanceof OpDescriptor)) {
                    if (prepareOp != null && obj == prepareOp.f68278c) {
                        return CancellableContinuationImplKt.f66946a;
                    }
                    return null;
                }
                if (prepareOp != null) {
                    AtomicOp<?> mo34262a = prepareOp.mo34262a();
                    if ((mo34262a instanceof AtomicSelectOp) && ((AtomicSelectOp) mo34262a).f68378b == this) {
                        throw new IllegalStateException("Cannot use matching select clauses on the same object".toString());
                    }
                    if (mo34262a.m34321b((OpDescriptor) obj)) {
                        return AtomicKt.f68237b;
                    }
                }
                ((OpDescriptor) obj).mo34263c(this);
            }
        }
        m34388R();
        return CancellableContinuationImplKt.f66946a;
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    /* renamed from: e */
    public boolean mo34393e() {
        Object mo34392b = mo34392b(null);
        if (mo34392b == CancellableContinuationImplKt.f66946a) {
            return true;
        }
        if (mo34392b == null) {
            return false;
        }
        throw new IllegalStateException(Intrinsics.m32187p("Unexpected trySelectIdempotent result ", mo34392b).toString());
    }

    @Override // kotlin.coroutines.Continuation
    @NotNull
    /* renamed from: g */
    public CoroutineContext getF68225c() {
        return this.f68375e.getF68225c();
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    /* renamed from: h */
    public CoroutineStackFrame mo32119h() {
        Continuation<R> continuation = this.f68375e;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    /* renamed from: j */
    public void mo31877j(@NotNull Object obj) {
        Object m34006b;
        while (true) {
            Object obj2 = this._result;
            Object obj3 = SelectKt.f68384a;
            Object obj4 = SelectKt.f68386c;
            boolean z = false;
            if (obj2 == obj4) {
                m34006b = CompletionStateKt.m34006b(obj, null);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f68374g;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj4, m34006b)) {
                        z = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj4) {
                        break;
                    }
                }
                if (z) {
                    return;
                }
            } else {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (obj2 != coroutineSingletons) {
                    throw new IllegalStateException("Already resumed");
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f68374g;
                Object obj5 = SelectKt.f68387d;
                while (true) {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, coroutineSingletons, obj5)) {
                        z = true;
                        break;
                    } else if (atomicReferenceFieldUpdater2.get(this) != coroutineSingletons) {
                        break;
                    }
                }
                if (z) {
                    if (!(obj instanceof Result.Failure)) {
                        this.f68375e.mo31877j(obj);
                        return;
                    }
                    Continuation<R> continuation = this.f68375e;
                    Throwable m31890a = Result.m31890a(obj);
                    Intrinsics.m32176e(m31890a);
                    continuation.mo31877j(ResultKt.m31891a(m31890a));
                    return;
                }
            }
        }
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    /* renamed from: o */
    public boolean mo34394o() {
        while (true) {
            Object obj = this._state;
            Object obj2 = SelectKt.f68384a;
            if (obj == SelectKt.f68384a) {
                return false;
            }
            if (!(obj instanceof OpDescriptor)) {
                return true;
            }
            ((OpDescriptor) obj).mo34263c(this);
        }
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    @NotNull
    /* renamed from: p */
    public Continuation<R> mo34395p() {
        return this;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    /* renamed from: s */
    public StackTraceElement mo32120s() {
        return null;
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("SelectInstance(state=");
        m24u.append(this._state);
        m24u.append(", result=");
        return C0576a.m4117p(m24u, this._result, ')');
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    /* renamed from: y */
    public void mo34396y(@NotNull Throwable th) {
        while (true) {
            Object obj = this._result;
            Object obj2 = SelectKt.f68384a;
            Object obj3 = SelectKt.f68386c;
            boolean z = true;
            if (obj == obj3) {
                CompletedExceptionally completedExceptionally = new CompletedExceptionally(th, false, 2);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f68374g;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj3, completedExceptionally)) {
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj3) {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    return;
                }
            } else {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (obj != coroutineSingletons) {
                    throw new IllegalStateException("Already resumed");
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f68374g;
                Object obj4 = SelectKt.f68387d;
                while (true) {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, coroutineSingletons, obj4)) {
                        break;
                    } else if (atomicReferenceFieldUpdater2.get(this) != coroutineSingletons) {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    IntrinsicsKt.m32122b(this.f68375e).mo31877j(ResultKt.m31891a(th));
                    return;
                }
            }
        }
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    @Nullable
    /* renamed from: z */
    public Object mo34397z(@NotNull AtomicDesc atomicDesc) {
        return new AtomicSelectOp(this, atomicDesc).mo34263c(null);
    }
}
