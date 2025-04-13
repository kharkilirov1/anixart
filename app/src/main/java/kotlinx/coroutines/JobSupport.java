package kotlinx.coroutines;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.internal.LockFreeLinkedListKt;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.OpDescriptor;
import kotlinx.coroutines.intrinsics.UndispatchedKt;
import kotlinx.coroutines.selects.SelectClause0;
import kotlinx.coroutines.selects.SelectInstance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: JobSupport.kt */
@Deprecated
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0003\u0005\u0006\u0007¨\u0006\b"}, m31884d2 = {"Lkotlinx/coroutines/JobSupport;", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/ChildJob;", "Lkotlinx/coroutines/ParentJob;", "Lkotlinx/coroutines/selects/SelectClause0;", "AwaitContinuation", "ChildCompletion", "Finishing", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public class JobSupport implements Job, ChildJob, ParentJob, SelectClause0 {

    /* renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f67023b = AtomicReferenceFieldUpdater.newUpdater(JobSupport.class, Object.class, "_state");

    @NotNull
    private volatile /* synthetic */ Object _parentHandle;

    @NotNull
    private volatile /* synthetic */ Object _state;

    /* compiled from: JobSupport.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlinx/coroutines/JobSupport$AwaitContinuation;", "T", "Lkotlinx/coroutines/CancellableContinuationImpl;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static final class AwaitContinuation<T> extends CancellableContinuationImpl<T> {
        @Override // kotlinx.coroutines.CancellableContinuationImpl
        @NotNull
        /* renamed from: C */
        public String mo33972C() {
            return "AwaitContinuation";
        }

        @Override // kotlinx.coroutines.CancellableContinuationImpl
        @NotNull
        /* renamed from: u */
        public Throwable mo33991u(@NotNull Job job) {
            throw null;
        }
    }

    /* compiled from: JobSupport.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlinx/coroutines/JobSupport$ChildCompletion;", "Lkotlinx/coroutines/JobNode;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static final class ChildCompletion extends JobNode {

        /* renamed from: f */
        @NotNull
        public final JobSupport f67026f;

        /* renamed from: g */
        @NotNull
        public final Finishing f67027g;

        /* renamed from: h */
        @NotNull
        public final ChildHandleNode f67028h;

        /* renamed from: i */
        @Nullable
        public final Object f67029i;

        public ChildCompletion(@NotNull JobSupport jobSupport, @NotNull Finishing finishing, @NotNull ChildHandleNode childHandleNode, @Nullable Object obj) {
            this.f67026f = jobSupport;
            this.f67027g = finishing;
            this.f67028h = childHandleNode;
            this.f67029i = obj;
        }

        @Override // kotlinx.coroutines.CompletionHandlerBase
        /* renamed from: R */
        public void mo33958R(@Nullable Throwable th) {
            JobSupport jobSupport = this.f67026f;
            Finishing finishing = this.f67027g;
            ChildHandleNode childHandleNode = this.f67028h;
            Object obj = this.f67029i;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = JobSupport.f67023b;
            ChildHandleNode m34094i0 = jobSupport.m34094i0(childHandleNode);
            if (m34094i0 == null || !jobSupport.m34104u0(finishing, m34094i0, obj)) {
                jobSupport.mo33960I(jobSupport.m34084T(finishing, obj));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            mo33958R(th);
            return Unit.f63088a;
        }
    }

    /* compiled from: JobSupport.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003¨\u0006\u0004"}, m31884d2 = {"Lkotlinx/coroutines/JobSupport$Finishing;", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "Lkotlinx/coroutines/Incomplete;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
    public static final class Finishing implements Incomplete {

        @NotNull
        private volatile /* synthetic */ Object _exceptionsHolder = null;

        @NotNull
        private volatile /* synthetic */ int _isCompleting;

        @NotNull
        private volatile /* synthetic */ Object _rootCause;

        /* renamed from: b */
        @NotNull
        public final NodeList f67030b;

        public Finishing(@NotNull NodeList nodeList, boolean z, @Nullable Throwable th) {
            this.f67030b = nodeList;
            this._isCompleting = z ? 1 : 0;
            this._rootCause = th;
        }

        @Override // kotlinx.coroutines.Incomplete
        /* renamed from: a */
        public boolean getF66993b() {
            return ((Throwable) this._rootCause) == null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: b */
        public final void m34106b(@NotNull Throwable th) {
            Throwable th2 = (Throwable) this._rootCause;
            if (th2 == null) {
                this._rootCause = th;
                return;
            }
            if (th == th2) {
                return;
            }
            Object obj = this._exceptionsHolder;
            if (obj == null) {
                this._exceptionsHolder = th;
                return;
            }
            if (!(obj instanceof Throwable)) {
                if (!(obj instanceof ArrayList)) {
                    throw new IllegalStateException(Intrinsics.m32187p("State is ", obj).toString());
                }
                ((ArrayList) obj).add(th);
            } else {
                if (th == obj) {
                    return;
                }
                ArrayList<Throwable> m34107c = m34107c();
                m34107c.add(obj);
                m34107c.add(th);
                this._exceptionsHolder = m34107c;
            }
        }

        /* renamed from: c */
        public final ArrayList<Throwable> m34107c() {
            return new ArrayList<>(4);
        }

        @Nullable
        /* renamed from: d */
        public final Throwable m34108d() {
            return (Throwable) this._rootCause;
        }

        /* renamed from: e */
        public final boolean m34109e() {
            return ((Throwable) this._rootCause) != null;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
        /* renamed from: f */
        public final boolean m34110f() {
            return this._isCompleting;
        }

        /* renamed from: g */
        public final boolean m34111g() {
            return this._exceptionsHolder == JobSupportKt.f67040e;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        /* renamed from: h */
        public final List<Throwable> m34112h(@Nullable Throwable th) {
            ArrayList<Throwable> arrayList;
            Object obj = this._exceptionsHolder;
            if (obj == null) {
                arrayList = m34107c();
            } else if (obj instanceof Throwable) {
                ArrayList<Throwable> m34107c = m34107c();
                m34107c.add(obj);
                arrayList = m34107c;
            } else {
                if (!(obj instanceof ArrayList)) {
                    throw new IllegalStateException(Intrinsics.m32187p("State is ", obj).toString());
                }
                arrayList = (ArrayList) obj;
            }
            Throwable th2 = (Throwable) this._rootCause;
            if (th2 != null) {
                arrayList.add(0, th2);
            }
            if (th != null && !Intrinsics.m32174c(th, th2)) {
                arrayList.add(th);
            }
            this._exceptionsHolder = JobSupportKt.f67040e;
            return arrayList;
        }

        /* renamed from: i */
        public final void m34113i(boolean z) {
            this._isCompleting = z ? 1 : 0;
        }

        @Override // kotlinx.coroutines.Incomplete
        @NotNull
        /* renamed from: m, reason: from getter */
        public NodeList getF67010b() {
            return this.f67030b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
        @NotNull
        public String toString() {
            StringBuilder m24u = C0000a.m24u("Finishing[cancelling=");
            m24u.append(m34109e());
            m24u.append(", completing=");
            m24u.append((boolean) this._isCompleting);
            m24u.append(", rootCause=");
            m24u.append((Throwable) this._rootCause);
            m24u.append(", exceptions=");
            m24u.append(this._exceptionsHolder);
            m24u.append(", list=");
            m24u.append(this.f67030b);
            m24u.append(']');
            return m24u.toString();
        }
    }

    public JobSupport(boolean z) {
        this._state = z ? JobSupportKt.f67042g : JobSupportKt.f67041f;
        this._parentHandle = null;
    }

    /* renamed from: s0 */
    public static /* synthetic */ CancellationException m34075s0(JobSupport jobSupport, Throwable th, String str, int i2, Object obj) {
        return jobSupport.m34102r0(th, null);
    }

    /* renamed from: H */
    public final boolean m34076H(final Object obj, NodeList nodeList, final JobNode jobNode) {
        int m34296Q;
        LockFreeLinkedListNode.CondAddOp condAddOp = new LockFreeLinkedListNode.CondAddOp(jobNode) { // from class: kotlinx.coroutines.JobSupport$addLastAtomic$$inlined$addLastIf$1
            @Override // kotlinx.coroutines.internal.AtomicOp
            /* renamed from: i */
            public Object mo34105i(LockFreeLinkedListNode lockFreeLinkedListNode) {
                if (this.m34088a0() == obj) {
                    return null;
                }
                return LockFreeLinkedListKt.f68266a;
            }
        };
        do {
            m34296Q = nodeList.m34292K().m34296Q(jobNode, nodeList, condAddOp);
            if (m34296Q == 1) {
                return true;
            }
        } while (m34296Q != 2);
        return false;
    }

    /* renamed from: I */
    public void mo33960I(@Nullable Object obj) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f0, code lost:
    
        r0 = r11;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0040 A[SYNTHETIC] */
    /* renamed from: J */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m34077J(@org.jetbrains.annotations.Nullable java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.JobSupport.m34077J(java.lang.Object):boolean");
    }

    /* renamed from: K */
    public void mo34078K(@NotNull Throwable th) {
        m34077J(th);
    }

    /* renamed from: L */
    public final boolean m34079L(Throwable th) {
        if (mo34091e0()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        ChildHandle childHandle = (ChildHandle) this._parentHandle;
        return (childHandle == null || childHandle == NonDisposableHandle.f67044b) ? z : childHandle.mo33998l(th) || z;
    }

    @NotNull
    /* renamed from: M */
    public String mo33949M() {
        return "Job was cancelled";
    }

    /* renamed from: O */
    public boolean mo34080O(@NotNull Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return m34077J(th) && getF67021c();
    }

    /* renamed from: P */
    public final void m34081P(Incomplete incomplete, Object obj) {
        CompletionHandlerException completionHandlerException;
        ChildHandle childHandle = (ChildHandle) this._parentHandle;
        if (childHandle != null) {
            childHandle.mo34038f();
            this._parentHandle = NonDisposableHandle.f67044b;
        }
        CompletedExceptionally completedExceptionally = obj instanceof CompletedExceptionally ? (CompletedExceptionally) obj : null;
        Throwable th = completedExceptionally == null ? null : completedExceptionally.f66956a;
        if (incomplete instanceof JobNode) {
            try {
                ((JobNode) incomplete).mo33958R(th);
                return;
            } catch (Throwable th2) {
                mo33951c0(new CompletionHandlerException("Exception in completion handler " + incomplete + " for " + this, th2));
                return;
            }
        }
        NodeList f67010b = incomplete.getF67010b();
        if (f67010b == null) {
            return;
        }
        CompletionHandlerException completionHandlerException2 = null;
        for (LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) f67010b.m34290I(); !Intrinsics.m32174c(lockFreeLinkedListNode, f67010b); lockFreeLinkedListNode = lockFreeLinkedListNode.m34291J()) {
            if (lockFreeLinkedListNode instanceof JobNode) {
                JobNode jobNode = (JobNode) lockFreeLinkedListNode;
                try {
                    jobNode.mo33958R(th);
                } catch (Throwable th3) {
                    if (completionHandlerException2 == null) {
                        completionHandlerException = null;
                    } else {
                        kotlin.ExceptionsKt.m31878a(completionHandlerException2, th3);
                        completionHandlerException = completionHandlerException2;
                    }
                    if (completionHandlerException == null) {
                        completionHandlerException2 = new CompletionHandlerException("Exception in completion handler " + jobNode + " for " + this, th3);
                    }
                }
            }
        }
        if (completionHandlerException2 == null) {
            return;
        }
        mo33951c0(completionHandlerException2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    @Override // kotlinx.coroutines.ParentJob
    @NotNull
    /* renamed from: Q */
    public CancellationException mo34082Q() {
        CancellationException cancellationException;
        Object m34088a0 = m34088a0();
        if (m34088a0 instanceof Finishing) {
            cancellationException = ((Finishing) m34088a0).m34108d();
        } else if (m34088a0 instanceof CompletedExceptionally) {
            cancellationException = ((CompletedExceptionally) m34088a0).f66956a;
        } else {
            if (m34088a0 instanceof Incomplete) {
                throw new IllegalStateException(Intrinsics.m32187p("Cannot be cancelling child in this state: ", m34088a0).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        return cancellationException2 == null ? new JobCancellationException(Intrinsics.m32187p("Parent job is ", m34101q0(m34088a0)), cancellationException, this) : cancellationException2;
    }

    /* renamed from: S */
    public final Throwable m34083S(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new JobCancellationException(mo33949M(), null, this) : th;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((ParentJob) obj).mo34082Q();
    }

    /* renamed from: T */
    public final Object m34084T(Finishing finishing, Object obj) {
        boolean m34109e;
        Throwable m34085U;
        CompletedExceptionally completedExceptionally = obj instanceof CompletedExceptionally ? (CompletedExceptionally) obj : null;
        Throwable th = completedExceptionally != null ? completedExceptionally.f66956a : null;
        synchronized (finishing) {
            m34109e = finishing.m34109e();
            List<Throwable> m34112h = finishing.m34112h(th);
            m34085U = m34085U(finishing, m34112h);
            if (m34085U != null && m34112h.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(m34112h.size()));
                for (Throwable th2 : m34112h) {
                    if (th2 != m34085U && th2 != m34085U && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                        kotlin.ExceptionsKt.m31878a(m34085U, th2);
                    }
                }
            }
        }
        if (m34085U != null && m34085U != th) {
            obj = new CompletedExceptionally(m34085U, false, 2);
        }
        if (m34085U != null) {
            if (m34079L(m34085U) || mo34089b0(m34085U)) {
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                CompletedExceptionally.f66955b.compareAndSet((CompletedExceptionally) obj, 0, 1);
            }
        }
        if (!m34109e) {
            mo34096k0(m34085U);
        }
        mo33953l0(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f67023b;
        Object incompleteStateBox = obj instanceof Incomplete ? new IncompleteStateBox((Incomplete) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, finishing, incompleteStateBox) && atomicReferenceFieldUpdater.get(this) == finishing) {
        }
        m34081P(finishing, obj);
        return obj;
    }

    /* renamed from: U */
    public final Throwable m34085U(Finishing finishing, List<? extends Throwable> list) {
        Object obj;
        Object obj2 = null;
        if (list.isEmpty()) {
            if (finishing.m34109e()) {
                return new JobCancellationException(mo33949M(), null, this);
            }
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = list.get(0);
        if (th2 instanceof TimeoutCancellationException) {
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Throwable th3 = (Throwable) next;
                if (th3 != th2 && (th3 instanceof TimeoutCancellationException)) {
                    obj2 = next;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    /* renamed from: V */
    public boolean getF67021c() {
        return true;
    }

    /* renamed from: W */
    public boolean mo34068W() {
        return this instanceof CompletableDeferredImpl;
    }

    @Override // kotlinx.coroutines.Job
    @NotNull
    /* renamed from: X */
    public final ChildHandle mo34060X(@NotNull ChildJob childJob) {
        return (ChildHandle) Job.DefaultImpls.m34066b(this, true, false, new ChildHandleNode(childJob), 2, null);
    }

    /* renamed from: Y */
    public final NodeList m34086Y(Incomplete incomplete) {
        NodeList f67010b = incomplete.getF67010b();
        if (f67010b != null) {
            return f67010b;
        }
        if (incomplete instanceof Empty) {
            return new NodeList();
        }
        if (!(incomplete instanceof JobNode)) {
            throw new IllegalStateException(Intrinsics.m32187p("State should have list: ", incomplete).toString());
        }
        m34098n0((JobNode) incomplete);
        return null;
    }

    @Nullable
    /* renamed from: Z */
    public final ChildHandle m34087Z() {
        return (ChildHandle) this._parentHandle;
    }

    @Override // kotlinx.coroutines.Job
    /* renamed from: a */
    public boolean mo33950a() {
        Object m34088a0 = m34088a0();
        return (m34088a0 instanceof Incomplete) && ((Incomplete) m34088a0).getF66993b();
    }

    @Nullable
    /* renamed from: a0 */
    public final Object m34088a0() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof OpDescriptor)) {
                return obj;
            }
            ((OpDescriptor) obj).mo34263c(this);
        }
    }

    @Override // kotlinx.coroutines.Job
    /* renamed from: b */
    public void mo34061b(@Nullable CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(mo33949M(), null, this);
        }
        mo34078K(cancellationException);
    }

    /* renamed from: b0 */
    public boolean mo34089b0(@NotNull Throwable th) {
        return false;
    }

    /* renamed from: c0 */
    public void mo33951c0(@NotNull Throwable th) {
        throw th;
    }

    /* renamed from: d0 */
    public final void m34090d0(@Nullable Job job) {
        if (job == null) {
            this._parentHandle = NonDisposableHandle.f67044b;
            return;
        }
        job.start();
        ChildHandle mo34060X = job.mo34060X(this);
        this._parentHandle = mo34060X;
        if (!(m34088a0() instanceof Incomplete)) {
            mo34060X.mo34038f();
            this._parentHandle = NonDisposableHandle.f67044b;
        }
    }

    /* renamed from: e0 */
    public boolean mo34091e0() {
        return this instanceof BlockingCoroutine;
    }

    /* renamed from: f0 */
    public final boolean m34092f0(@Nullable Object obj) {
        Object m34103t0;
        do {
            m34103t0 = m34103t0(m34088a0(), obj);
            if (m34103t0 == JobSupportKt.f67036a) {
                return false;
            }
            if (m34103t0 == JobSupportKt.f67037b) {
                return true;
            }
        } while (m34103t0 == JobSupportKt.f67038c);
        return true;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) CoroutineContext.Element.DefaultImpls.m32115a(this, r, function2);
    }

    @Nullable
    /* renamed from: g0 */
    public final Object m34093g0(@Nullable Object obj) {
        Object m34103t0;
        do {
            m34103t0 = m34103t0(m34088a0(), obj);
            if (m34103t0 == JobSupportKt.f67036a) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                CompletedExceptionally completedExceptionally = obj instanceof CompletedExceptionally ? (CompletedExceptionally) obj : null;
                throw new IllegalStateException(str, completedExceptionally != null ? completedExceptionally.f66956a : null);
            }
        } while (m34103t0 == JobSupportKt.f67038c);
        return m34103t0;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Nullable
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.Key<E> key) {
        return (E) CoroutineContext.Element.DefaultImpls.m32116b(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    @NotNull
    public final CoroutineContext.Key<?> getKey() {
        return Job.Key.f67019b;
    }

    @NotNull
    /* renamed from: h0 */
    public String mo33952h0() {
        return getClass().getSimpleName();
    }

    /* renamed from: i0 */
    public final ChildHandleNode m34094i0(LockFreeLinkedListNode lockFreeLinkedListNode) {
        while (lockFreeLinkedListNode.mo34285N()) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.m34292K();
        }
        while (true) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.m34291J();
            if (!lockFreeLinkedListNode.mo34285N()) {
                if (lockFreeLinkedListNode instanceof ChildHandleNode) {
                    return (ChildHandleNode) lockFreeLinkedListNode;
                }
                if (lockFreeLinkedListNode instanceof NodeList) {
                    return null;
                }
            }
        }
    }

    @Override // kotlinx.coroutines.Job
    public final boolean isCancelled() {
        Object m34088a0 = m34088a0();
        return (m34088a0 instanceof CompletedExceptionally) || ((m34088a0 instanceof Finishing) && ((Finishing) m34088a0).m34109e());
    }

    /* renamed from: j0 */
    public final void m34095j0(NodeList nodeList, Throwable th) {
        CompletionHandlerException completionHandlerException;
        mo34096k0(th);
        CompletionHandlerException completionHandlerException2 = null;
        for (LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) nodeList.m34290I(); !Intrinsics.m32174c(lockFreeLinkedListNode, nodeList); lockFreeLinkedListNode = lockFreeLinkedListNode.m34291J()) {
            if (lockFreeLinkedListNode instanceof JobCancellingNode) {
                JobNode jobNode = (JobNode) lockFreeLinkedListNode;
                try {
                    jobNode.mo33958R(th);
                } catch (Throwable th2) {
                    if (completionHandlerException2 == null) {
                        completionHandlerException = null;
                    } else {
                        kotlin.ExceptionsKt.m31878a(completionHandlerException2, th2);
                        completionHandlerException = completionHandlerException2;
                    }
                    if (completionHandlerException == null) {
                        completionHandlerException2 = new CompletionHandlerException("Exception in completion handler " + jobNode + " for " + this, th2);
                    }
                }
            }
        }
        if (completionHandlerException2 != null) {
            mo33951c0(completionHandlerException2);
        }
        m34079L(th);
    }

    @Override // kotlinx.coroutines.Job
    @Nullable
    /* renamed from: k */
    public final Object mo34062k(@NotNull Continuation<? super Unit> continuation) {
        boolean z;
        while (true) {
            Object m34088a0 = m34088a0();
            if (!(m34088a0 instanceof Incomplete)) {
                z = false;
                break;
            }
            if (m34100p0(m34088a0) >= 0) {
                z = true;
                break;
            }
        }
        if (!z) {
            JobKt.m34072d(continuation.getF68225c());
            return Unit.f63088a;
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.m32122b(continuation), 1);
        cancellableContinuationImpl.m33993y();
        CancellableContinuationKt.m33995a(cancellableContinuationImpl, mo34063n(false, true, new ResumeOnCompletion(cancellableContinuationImpl)));
        Object m33992v = cancellableContinuationImpl.m33992v();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (m33992v != coroutineSingletons) {
            m33992v = Unit.f63088a;
        }
        return m33992v == coroutineSingletons ? m33992v : Unit.f63088a;
    }

    /* renamed from: k0 */
    public void mo34096k0(@Nullable Throwable th) {
    }

    /* renamed from: l0 */
    public void mo33953l0(@Nullable Object obj) {
    }

    /* renamed from: m0 */
    public void mo34097m0() {
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext minusKey(@NotNull CoroutineContext.Key<?> key) {
        return CoroutineContext.Element.DefaultImpls.m32117c(this, key);
    }

    @Override // kotlinx.coroutines.Job
    @NotNull
    /* renamed from: n */
    public final DisposableHandle mo34063n(boolean z, boolean z2, @NotNull Function1<? super Throwable, Unit> function1) {
        JobNode jobNode;
        boolean z3;
        Throwable th;
        if (z) {
            jobNode = function1 instanceof JobCancellingNode ? (JobCancellingNode) function1 : null;
            if (jobNode == null) {
                jobNode = new InvokeOnCancelling(function1);
            }
        } else {
            jobNode = function1 instanceof JobNode ? (JobNode) function1 : null;
            if (jobNode == null) {
                jobNode = null;
            }
            if (jobNode == null) {
                jobNode = new InvokeOnCompletion(function1);
            }
        }
        jobNode.f67022e = this;
        while (true) {
            Object m34088a0 = m34088a0();
            if (m34088a0 instanceof Empty) {
                Empty empty = (Empty) m34088a0;
                if (empty.f66993b) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f67023b;
                    while (true) {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, m34088a0, jobNode)) {
                            z3 = true;
                            break;
                        }
                        if (atomicReferenceFieldUpdater.get(this) != m34088a0) {
                            z3 = false;
                            break;
                        }
                    }
                    if (z3) {
                        return jobNode;
                    }
                } else {
                    NodeList nodeList = new NodeList();
                    Incomplete inactiveNodeList = empty.f66993b ? nodeList : new InactiveNodeList(nodeList);
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f67023b;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, empty, inactiveNodeList) && atomicReferenceFieldUpdater2.get(this) == empty) {
                    }
                }
            } else {
                if (!(m34088a0 instanceof Incomplete)) {
                    if (z2) {
                        CompletedExceptionally completedExceptionally = m34088a0 instanceof CompletedExceptionally ? (CompletedExceptionally) m34088a0 : null;
                        function1.invoke(completedExceptionally != null ? completedExceptionally.f66956a : null);
                    }
                    return NonDisposableHandle.f67044b;
                }
                NodeList f67010b = ((Incomplete) m34088a0).getF67010b();
                if (f67010b == null) {
                    Objects.requireNonNull(m34088a0, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    m34098n0((JobNode) m34088a0);
                } else {
                    DisposableHandle disposableHandle = NonDisposableHandle.f67044b;
                    if (z && (m34088a0 instanceof Finishing)) {
                        synchronized (m34088a0) {
                            th = ((Finishing) m34088a0).m34108d();
                            if (th == null || ((function1 instanceof ChildHandleNode) && !((Finishing) m34088a0).m34110f())) {
                                if (m34076H(m34088a0, f67010b, jobNode)) {
                                    if (th == null) {
                                        return jobNode;
                                    }
                                    disposableHandle = jobNode;
                                }
                            }
                        }
                    } else {
                        th = null;
                    }
                    if (th != null) {
                        if (z2) {
                            function1.invoke(th);
                        }
                        return disposableHandle;
                    }
                    if (m34076H(m34088a0, f67010b, jobNode)) {
                        return jobNode;
                    }
                }
            }
        }
    }

    /* renamed from: n0 */
    public final void m34098n0(JobNode jobNode) {
        NodeList nodeList = new NodeList();
        LockFreeLinkedListNode.f68269c.lazySet(nodeList, jobNode);
        LockFreeLinkedListNode.f68268b.lazySet(nodeList, jobNode);
        while (true) {
            boolean z = false;
            if (jobNode.m34290I() != jobNode) {
                break;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LockFreeLinkedListNode.f68268b;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(jobNode, jobNode, nodeList)) {
                    z = true;
                    break;
                } else if (atomicReferenceFieldUpdater.get(jobNode) != jobNode) {
                    break;
                }
            }
            if (z) {
                nodeList.m34289H(jobNode);
                break;
            }
        }
        LockFreeLinkedListNode m34291J = jobNode.m34291J();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f67023b;
        while (!atomicReferenceFieldUpdater2.compareAndSet(this, jobNode, m34291J) && atomicReferenceFieldUpdater2.get(this) == jobNode) {
        }
    }

    @Override // kotlinx.coroutines.Job
    @NotNull
    /* renamed from: o */
    public final CancellationException mo34064o() {
        Object m34088a0 = m34088a0();
        if (!(m34088a0 instanceof Finishing)) {
            if (m34088a0 instanceof Incomplete) {
                throw new IllegalStateException(Intrinsics.m32187p("Job is still new or active: ", this).toString());
            }
            return m34088a0 instanceof CompletedExceptionally ? m34075s0(this, ((CompletedExceptionally) m34088a0).f66956a, null, 1, null) : new JobCancellationException(Intrinsics.m32187p(getClass().getSimpleName(), " has completed normally"), null, this);
        }
        Throwable m34108d = ((Finishing) m34088a0).m34108d();
        CancellationException m34102r0 = m34108d != null ? m34102r0(m34108d, Intrinsics.m32187p(getClass().getSimpleName(), " is cancelling")) : null;
        if (m34102r0 != null) {
            return m34102r0;
        }
        throw new IllegalStateException(Intrinsics.m32187p("Job is still new or active: ", this).toString());
    }

    /* renamed from: o0 */
    public final <T, R> void m34099o0(@NotNull SelectInstance<? super R> selectInstance, @NotNull Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2) {
        Object m34088a0;
        do {
            m34088a0 = m34088a0();
            if (selectInstance.mo34394o()) {
                return;
            }
            if (!(m34088a0 instanceof Incomplete)) {
                if (selectInstance.mo34393e()) {
                    if (m34088a0 instanceof CompletedExceptionally) {
                        selectInstance.mo34396y(((CompletedExceptionally) m34088a0).f66956a);
                        return;
                    } else {
                        UndispatchedKt.m34353b(function2, JobSupportKt.m34114a(m34088a0), selectInstance.mo34395p());
                        return;
                    }
                }
                return;
            }
        } while (m34100p0(m34088a0) != 0);
        selectInstance.mo34387C(mo34063n(false, true, new SelectAwaitOnCompletion(selectInstance, function2)));
    }

    /* renamed from: p0 */
    public final int m34100p0(Object obj) {
        boolean z = false;
        if (obj instanceof Empty) {
            if (((Empty) obj).f66993b) {
                return 0;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f67023b;
            Empty empty = JobSupportKt.f67042g;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, empty)) {
                    z = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            if (!z) {
                return -1;
            }
            mo34097m0();
            return 1;
        }
        if (!(obj instanceof InactiveNodeList)) {
            return 0;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f67023b;
        NodeList nodeList = ((InactiveNodeList) obj).f67010b;
        while (true) {
            if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, nodeList)) {
                z = true;
                break;
            }
            if (atomicReferenceFieldUpdater2.get(this) != obj) {
                break;
            }
        }
        if (!z) {
            return -1;
        }
        mo34097m0();
        return 1;
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return CoroutineContext.Element.DefaultImpls.m32118d(this, coroutineContext);
    }

    /* renamed from: q0 */
    public final String m34101q0(Object obj) {
        if (!(obj instanceof Finishing)) {
            return obj instanceof Incomplete ? ((Incomplete) obj).getF66993b() ? "Active" : "New" : obj instanceof CompletedExceptionally ? "Cancelled" : "Completed";
        }
        Finishing finishing = (Finishing) obj;
        return finishing.m34109e() ? "Cancelling" : finishing.m34110f() ? "Completing" : "Active";
    }

    @NotNull
    /* renamed from: r0 */
    public final CancellationException m34102r0(@NotNull Throwable th, @Nullable String str) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            if (str == null) {
                str = mo33949M();
            }
            cancellationException = new JobCancellationException(str, th, this);
        }
        return cancellationException;
    }

    @Override // kotlinx.coroutines.Job
    public final boolean start() {
        int m34100p0;
        do {
            m34100p0 = m34100p0(m34088a0());
            if (m34100p0 == 0) {
                return false;
            }
        } while (m34100p0 != 1);
        return true;
    }

    /* renamed from: t0 */
    public final Object m34103t0(Object obj, Object obj2) {
        boolean z;
        if (!(obj instanceof Incomplete)) {
            return JobSupportKt.f67036a;
        }
        ChildHandleNode childHandleNode = null;
        boolean z2 = false;
        if (((obj instanceof Empty) || (obj instanceof JobNode)) && !(obj instanceof ChildHandleNode) && !(obj2 instanceof CompletedExceptionally)) {
            Incomplete incomplete = (Incomplete) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f67023b;
            Object incompleteStateBox = obj2 instanceof Incomplete ? new IncompleteStateBox((Incomplete) obj2) : obj2;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, incomplete, incompleteStateBox)) {
                    z = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != incomplete) {
                    z = false;
                    break;
                }
            }
            if (z) {
                mo34096k0(null);
                mo33953l0(obj2);
                m34081P(incomplete, obj2);
                z2 = true;
            }
            return z2 ? obj2 : JobSupportKt.f67038c;
        }
        Incomplete incomplete2 = (Incomplete) obj;
        NodeList m34086Y = m34086Y(incomplete2);
        if (m34086Y == null) {
            return JobSupportKt.f67038c;
        }
        Finishing finishing = incomplete2 instanceof Finishing ? (Finishing) incomplete2 : null;
        if (finishing == null) {
            finishing = new Finishing(m34086Y, false, null);
        }
        synchronized (finishing) {
            if (finishing.m34110f()) {
                return JobSupportKt.f67036a;
            }
            finishing.m34113i(true);
            if (finishing != incomplete2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f67023b;
                while (true) {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, incomplete2, finishing)) {
                        z2 = true;
                        break;
                    }
                    if (atomicReferenceFieldUpdater2.get(this) != incomplete2) {
                        break;
                    }
                }
                if (!z2) {
                    return JobSupportKt.f67038c;
                }
            }
            boolean m34109e = finishing.m34109e();
            CompletedExceptionally completedExceptionally = obj2 instanceof CompletedExceptionally ? (CompletedExceptionally) obj2 : null;
            if (completedExceptionally != null) {
                finishing.m34106b(completedExceptionally.f66956a);
            }
            Throwable m34108d = finishing.m34108d();
            if (!(!m34109e)) {
                m34108d = null;
            }
            if (m34108d != null) {
                m34095j0(m34086Y, m34108d);
            }
            ChildHandleNode childHandleNode2 = incomplete2 instanceof ChildHandleNode ? (ChildHandleNode) incomplete2 : null;
            if (childHandleNode2 == null) {
                NodeList f67010b = incomplete2.getF67010b();
                if (f67010b != null) {
                    childHandleNode = m34094i0(f67010b);
                }
            } else {
                childHandleNode = childHandleNode2;
            }
            return (childHandleNode == null || !m34104u0(finishing, childHandleNode, obj2)) ? m34084T(finishing, obj2) : JobSupportKt.f67037b;
        }
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo33952h0() + '{' + m34101q0(m34088a0()) + '}');
        sb.append('@');
        sb.append(DebugStringsKt.m34023b(this));
        return sb.toString();
    }

    @Override // kotlinx.coroutines.ChildJob
    /* renamed from: u */
    public final void mo33999u(@NotNull ParentJob parentJob) {
        m34077J(parentJob);
    }

    /* renamed from: u0 */
    public final boolean m34104u0(Finishing finishing, ChildHandleNode childHandleNode, Object obj) {
        while (Job.DefaultImpls.m34066b(childHandleNode.f66949f, false, false, new ChildCompletion(this, finishing, childHandleNode, obj), 1, null) == NonDisposableHandle.f67044b) {
            childHandleNode = m34094i0(childHandleNode);
            if (childHandleNode == null) {
                return false;
            }
        }
        return true;
    }
}
