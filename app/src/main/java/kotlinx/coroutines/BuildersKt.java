package kotlinx.coroutines;

import java.util.Objects;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.ScopeCoroutine;
import kotlinx.coroutines.internal.ThreadContextKt;
import kotlinx.coroutines.intrinsics.CancellableKt;
import kotlinx.coroutines.intrinsics.UndispatchedKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m31883d1 = {"kotlinx/coroutines/BuildersKt__BuildersKt", "kotlinx/coroutines/BuildersKt__Builders_commonKt"}, m31885k = 4, m31886mv = {1, 6, 0}, m31888xi = 48)
/* loaded from: classes3.dex */
public final class BuildersKt {
    /* renamed from: a */
    public static Job m33962a(CoroutineScope coroutineScope, CoroutineContext coroutineContext, CoroutineStart coroutineStart, Function2 function2, int i2, Object obj) {
        EmptyCoroutineContext emptyCoroutineContext = (i2 & 1) != 0 ? EmptyCoroutineContext.f63224b : null;
        if ((i2 & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        CoroutineContext m34012c = CoroutineContextKt.m34012c(coroutineScope, emptyCoroutineContext);
        Objects.requireNonNull(coroutineStart);
        AbstractCoroutine lazyStandaloneCoroutine = coroutineStart == CoroutineStart.LAZY ? new LazyStandaloneCoroutine(m34012c, function2) : new StandaloneCoroutine(m34012c, true);
        lazyStandaloneCoroutine.m33957y0(coroutineStart, lazyStandaloneCoroutine, function2);
        return lazyStandaloneCoroutine;
    }

    @Nullable
    /* renamed from: b */
    public static final <T> Object m33963b(@NotNull CoroutineContext coroutineContext, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) {
        CoroutineContext f66944f = continuation.getF66944f();
        CoroutineContext plus = !CoroutineContextKt.m34011b(coroutineContext) ? f66944f.plus(coroutineContext) : CoroutineContextKt.m34010a(f66944f, coroutineContext, false);
        JobKt.m34072d(plus);
        if (plus == f66944f) {
            ScopeCoroutine scopeCoroutine = new ScopeCoroutine(plus, continuation);
            return UndispatchedKt.m34354c(scopeCoroutine, scopeCoroutine, function2);
        }
        ContinuationInterceptor.Key key = ContinuationInterceptor.Key.f63222b;
        if (!Intrinsics.m32174c(plus.get(key), f66944f.get(key))) {
            DispatchedCoroutine dispatchedCoroutine = new DispatchedCoroutine(plus, continuation);
            CancellableKt.m34350d(function2, dispatchedCoroutine, dispatchedCoroutine, null);
            return dispatchedCoroutine.m34034z0();
        }
        UndispatchedCoroutine undispatchedCoroutine = new UndispatchedCoroutine(plus, continuation);
        Object m34338c = ThreadContextKt.m34338c(plus, null);
        try {
            return UndispatchedKt.m34354c(undispatchedCoroutine, undispatchedCoroutine, function2);
        } finally {
            ThreadContextKt.m34336a(plus, m34338c);
        }
    }
}
