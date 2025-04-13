package kotlinx.coroutines.intrinsics;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.CompletedExceptionally;
import kotlinx.coroutines.JobSupportKt;
import kotlinx.coroutines.internal.ScopeCoroutine;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Undispatched.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"kotlinx-coroutines-core"}, m31885k = 2, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class UndispatchedKt {
    /* renamed from: a */
    public static final <T> void m34352a(@NotNull Function1<? super Continuation<? super T>, ? extends Object> function1, @NotNull Continuation<? super T> completion) {
        Intrinsics.m32179h(completion, "completion");
        try {
            TypeIntrinsics.m32215d(function1, 1);
            Object invoke = function1.invoke(completion);
            if (invoke != CoroutineSingletons.COROUTINE_SUSPENDED) {
                completion.mo31877j(invoke);
            }
        } catch (Throwable th) {
            completion.mo31877j(ResultKt.m31891a(th));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static final <R, T> void m34353b(@NotNull Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2, R r, @NotNull Continuation<? super T> completion) {
        Intrinsics.m32179h(completion, "completion");
        try {
            TypeIntrinsics.m32215d(function2, 2);
            Object invoke = function2.invoke(r, completion);
            if (invoke != CoroutineSingletons.COROUTINE_SUSPENDED) {
                completion.mo31877j(invoke);
            }
        } catch (Throwable th) {
            completion.mo31877j(ResultKt.m31891a(th));
        }
    }

    @Nullable
    /* renamed from: c */
    public static final <T, R> Object m34354c(@NotNull ScopeCoroutine<? super T> scopeCoroutine, R r, @NotNull Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2) {
        Object completedExceptionally;
        Object m34093g0;
        try {
            TypeIntrinsics.m32215d(function2, 2);
            completedExceptionally = function2.invoke(r, scopeCoroutine);
        } catch (Throwable th) {
            completedExceptionally = new CompletedExceptionally(th, false, 2);
        }
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (completedExceptionally == coroutineSingletons || (m34093g0 = scopeCoroutine.m34093g0(completedExceptionally)) == JobSupportKt.f67037b) {
            return coroutineSingletons;
        }
        if (m34093g0 instanceof CompletedExceptionally) {
            throw ((CompletedExceptionally) m34093g0).f66956a;
        }
        return JobSupportKt.m34114a(m34093g0);
    }
}
