package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.internal.ScopeCoroutine;
import kotlinx.coroutines.intrinsics.UndispatchedKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CoroutineScope.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"kotlinx-coroutines-core"}, m31885k = 2, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class CoroutineScopeKt {
    @NotNull
    /* renamed from: a */
    public static final CoroutineScope m34019a(@NotNull CoroutineContext coroutineContext) {
        if (coroutineContext.get(Job.Key.f67019b) == null) {
            coroutineContext = coroutineContext.plus(JobKt.m34069a(null, 1, null));
        }
        return new ContextScope(coroutineContext);
    }

    @NotNull
    /* renamed from: b */
    public static final CoroutineScope m34020b() {
        SupervisorJobImpl supervisorJobImpl = new SupervisorJobImpl(null);
        CoroutineDispatcher coroutineDispatcher = Dispatchers.f66988a;
        return new ContextScope(CoroutineContext.Element.DefaultImpls.m32118d(supervisorJobImpl, MainDispatcherLoader.f68292a));
    }

    @Nullable
    /* renamed from: c */
    public static final <R> Object m34021c(@NotNull Function2<? super CoroutineScope, ? super Continuation<? super R>, ? extends Object> function2, @NotNull Continuation<? super R> continuation) {
        ScopeCoroutine scopeCoroutine = new ScopeCoroutine(continuation.getF66944f(), continuation);
        return UndispatchedKt.m34354c(scopeCoroutine, scopeCoroutine, function2);
    }
}
