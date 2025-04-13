package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.ChildHandle;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.internal.ScopeCoroutine;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: SafeCollector.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, m31884d2 = {"Lkotlinx/coroutines/flow/internal/SafeCollector;", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class SafeCollector<T> extends ContinuationImpl implements FlowCollector<T> {

    /* renamed from: e */
    @JvmField
    @NotNull
    public final FlowCollector<T> f68212e;

    /* renamed from: f */
    @JvmField
    @NotNull
    public final CoroutineContext f68213f;

    /* renamed from: g */
    @JvmField
    public final int f68214g;

    /* renamed from: h */
    @Nullable
    public CoroutineContext f68215h;

    /* renamed from: i */
    @Nullable
    public Continuation<? super Unit> f68216i;

    /* JADX WARN: Multi-variable type inference failed */
    public SafeCollector(@NotNull FlowCollector<? super T> flowCollector, @NotNull CoroutineContext coroutineContext) {
        super(NoOpContinuation.f68207b, EmptyCoroutineContext.f63224b);
        this.f68212e = flowCollector;
        this.f68213f = coroutineContext;
        this.f68214g = ((Number) coroutineContext.fold(0, new Function2<Integer, CoroutineContext.Element, Integer>() { // from class: kotlinx.coroutines.flow.internal.SafeCollector$collectContextSize$1
            @Override // kotlin.jvm.functions.Function2
            public Integer invoke(Integer num, CoroutineContext.Element element) {
                return Integer.valueOf(num.intValue() + 1);
            }
        })).intValue();
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    @Nullable
    /* renamed from: f */
    public Object mo4139f(T t, @NotNull Continuation<? super Unit> continuation) {
        try {
            Object m34258p = m34258p(continuation, t);
            return m34258p == CoroutineSingletons.COROUTINE_SUSPENDED ? m34258p : Unit.f63088a;
        } catch (Throwable th) {
            this.f68215h = new DownstreamExceptionContext(th, continuation.getF68225c());
            throw th;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, kotlin.coroutines.Continuation
    @NotNull
    /* renamed from: g */
    public CoroutineContext getF68225c() {
        CoroutineContext coroutineContext = this.f68215h;
        return coroutineContext == null ? EmptyCoroutineContext.f63224b : coroutineContext;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    /* renamed from: h */
    public CoroutineStackFrame mo32119h() {
        Continuation<? super Unit> continuation = this.f68216i;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    /* renamed from: m */
    public Object mo2379m(@NotNull Object obj) {
        Throwable m31890a = Result.m31890a(obj);
        if (m31890a != null) {
            this.f68215h = new DownstreamExceptionContext(m31890a, getF68225c());
        }
        Continuation<? super Unit> continuation = this.f68216i;
        if (continuation != null) {
            continuation.mo31877j(obj);
        }
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* renamed from: o */
    public void mo32124o() {
        super.mo32124o();
    }

    /* renamed from: p */
    public final Object m34258p(Continuation<? super Unit> continuation, T t) {
        CoroutineContext f68225c = continuation.getF68225c();
        JobKt.m34072d(f68225c);
        CoroutineContext coroutineContext = this.f68215h;
        if (coroutineContext != f68225c) {
            if (coroutineContext instanceof DownstreamExceptionContext) {
                StringBuilder m24u = C0000a.m24u("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception ");
                m24u.append(((DownstreamExceptionContext) coroutineContext).f68201b);
                m24u.append(", but then emission attempt of value '");
                m24u.append(t);
                m24u.append("' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ");
                throw new IllegalStateException(StringsKt.m33916o0(m24u.toString()).toString());
            }
            if (((Number) f68225c.fold(0, new Function2<Integer, CoroutineContext.Element, Integer>(this) { // from class: kotlinx.coroutines.flow.internal.SafeCollector_commonKt$checkContext$result$1

                /* renamed from: b */
                public final /* synthetic */ SafeCollector<?> f68220b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                    this.f68220b = this;
                }

                @Override // kotlin.jvm.functions.Function2
                public Integer invoke(Integer num, CoroutineContext.Element element) {
                    int intValue = num.intValue();
                    CoroutineContext.Element element2 = element;
                    CoroutineContext.Key<?> key = element2.getKey();
                    CoroutineContext.Element element3 = this.f68220b.f68213f.get(key);
                    int i2 = Job.f67018J1;
                    if (key != Job.Key.f67019b) {
                        return Integer.valueOf(element2 != element3 ? Integer.MIN_VALUE : intValue + 1);
                    }
                    Job job = (Job) element3;
                    Job job2 = (Job) element2;
                    while (true) {
                        if (job2 != null) {
                            if (job2 == job || !(job2 instanceof ScopeCoroutine)) {
                                break;
                            }
                            ChildHandle m34087Z = ((ScopeCoroutine) job2).m34087Z();
                            job2 = m34087Z == null ? null : m34087Z.getParent();
                        } else {
                            job2 = null;
                            break;
                        }
                    }
                    if (job2 == job) {
                        if (job != null) {
                            intValue++;
                        }
                        return Integer.valueOf(intValue);
                    }
                    throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + job2 + ", expected child of " + job + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                }
            })).intValue() != this.f68214g) {
                StringBuilder m24u2 = C0000a.m24u("Flow invariant is violated:\n\t\tFlow was collected in ");
                m24u2.append(this.f68213f);
                m24u2.append(",\n\t\tbut emission happened in ");
                m24u2.append(f68225c);
                m24u2.append(".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead");
                throw new IllegalStateException(m24u2.toString().toString());
            }
            this.f68215h = f68225c;
        }
        this.f68216i = continuation;
        Object mo16505k = SafeCollectorKt.f68218a.mo16505k(this.f68212e, t, this);
        if (!Intrinsics.m32174c(mo16505k, CoroutineSingletons.COROUTINE_SUSPENDED)) {
            this.f68216i = null;
        }
        return mo16505k;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    /* renamed from: s */
    public StackTraceElement mo32120s() {
        return null;
    }
}
