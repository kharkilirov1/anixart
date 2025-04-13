package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.internal.ThreadContextKt;
import kotlinx.coroutines.intrinsics.CancellableKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AbstractCoroutine.kt */
@InternalCoroutinesApi
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00020\u0005¨\u0006\u0006"}, m31884d2 = {"Lkotlinx/coroutines/AbstractCoroutine;", "T", "Lkotlinx/coroutines/JobSupport;", "Lkotlinx/coroutines/Job;", "Lkotlin/coroutines/Continuation;", "Lkotlinx/coroutines/CoroutineScope;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public abstract class AbstractCoroutine<T> extends JobSupport implements Continuation<T>, CoroutineScope {

    /* renamed from: c */
    @NotNull
    public final CoroutineContext f66928c;

    public AbstractCoroutine(@NotNull CoroutineContext coroutineContext, boolean z, boolean z2) {
        super(z2);
        if (z) {
            m34090d0((Job) coroutineContext.get(Job.Key.f67019b));
        }
        this.f66928c = coroutineContext.plus(this);
    }

    @Override // kotlinx.coroutines.JobSupport
    @NotNull
    /* renamed from: M */
    public String mo33949M() {
        return Intrinsics.m32187p(getClass().getSimpleName(), " was cancelled");
    }

    @Override // kotlinx.coroutines.JobSupport, kotlinx.coroutines.Job
    /* renamed from: a */
    public boolean mo33950a() {
        return super.mo33950a();
    }

    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: c0 */
    public final void mo33951c0(@NotNull Throwable th) {
        CoroutineExceptionHandlerKt.m34016a(this.f66928c, th);
    }

    @Override // kotlin.coroutines.Continuation
    @NotNull
    /* renamed from: g, reason: from getter */
    public final CoroutineContext getF66928c() {
        return this.f66928c;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    /* renamed from: getCoroutineContext */
    public CoroutineContext getF68244b() {
        return this.f66928c;
    }

    @Override // kotlinx.coroutines.JobSupport
    @NotNull
    /* renamed from: h0 */
    public String mo33952h0() {
        return super.mo33952h0();
    }

    @Override // kotlin.coroutines.Continuation
    /* renamed from: j */
    public final void mo31877j(@NotNull Object obj) {
        Object m34006b;
        m34006b = CompletionStateKt.m34006b(obj, null);
        Object m34093g0 = m34093g0(m34006b);
        if (m34093g0 == JobSupportKt.f67037b) {
            return;
        }
        mo33954v0(m34093g0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: l0 */
    public final void mo33953l0(@Nullable Object obj) {
        if (!(obj instanceof CompletedExceptionally)) {
            mo33956x0(obj);
        } else {
            CompletedExceptionally completedExceptionally = (CompletedExceptionally) obj;
            mo33955w0(completedExceptionally.f66956a, completedExceptionally.m34004a());
        }
    }

    /* renamed from: v0 */
    public void mo33954v0(@Nullable Object obj) {
        mo33960I(obj);
    }

    /* renamed from: w0 */
    public void mo33955w0(@NotNull Throwable th, boolean z) {
    }

    /* renamed from: x0 */
    public void mo33956x0(T t) {
    }

    /* renamed from: y0 */
    public final <R> void m33957y0(@NotNull CoroutineStart coroutineStart, R r, @NotNull Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2) {
        int ordinal = coroutineStart.ordinal();
        if (ordinal == 0) {
            CancellableKt.m34350d(function2, r, this, null);
            return;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                Intrinsics.m32179h(function2, "<this>");
                IntrinsicsKt.m32122b(IntrinsicsKt.m32121a(function2, r, this)).mo31877j(Unit.f63088a);
                return;
            }
            if (ordinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            try {
                CoroutineContext coroutineContext = this.f66928c;
                Object m34338c = ThreadContextKt.m34338c(coroutineContext, null);
                try {
                    TypeIntrinsics.m32215d(function2, 2);
                    Object invoke = function2.invoke(r, this);
                    if (invoke != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        mo31877j(invoke);
                    }
                } finally {
                    ThreadContextKt.m34336a(coroutineContext, m34338c);
                }
            } catch (Throwable th) {
                mo31877j(ResultKt.m31891a(th));
            }
        }
    }
}
