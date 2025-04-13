package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.ThreadContextKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: DispatchedTask.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"kotlinx-coroutines-core"}, m31885k = 2, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class DispatchedTaskKt {
    /* renamed from: a */
    public static final boolean m34036a(int i2) {
        return i2 == 1 || i2 == 2;
    }

    /* renamed from: b */
    public static final <T> void m34037b(@NotNull DispatchedTask<? super T> dispatchedTask, @NotNull Continuation<? super T> continuation, boolean z) {
        Object obj = dispatchedTask.get_state();
        Throwable mo33981c = dispatchedTask.mo33981c(obj);
        Object m31891a = mo33981c != null ? ResultKt.m31891a(mo33981c) : dispatchedTask.mo33982e(obj);
        if (!z) {
            continuation.mo31877j(m31891a);
            return;
        }
        DispatchedContinuation dispatchedContinuation = (DispatchedContinuation) continuation;
        Continuation<T> continuation2 = dispatchedContinuation.f68247f;
        Object obj2 = dispatchedContinuation.f68249h;
        CoroutineContext f66944f = continuation2.getF66944f();
        Object m34338c = ThreadContextKt.m34338c(f66944f, obj2);
        UndispatchedCoroutine<?> m34013d = m34338c != ThreadContextKt.f68306a ? CoroutineContextKt.m34013d(continuation2, f66944f, m34338c) : null;
        try {
            dispatchedContinuation.f68247f.mo31877j(m31891a);
        } finally {
            if (m34013d == null || m34013d.m34121z0()) {
                ThreadContextKt.m34336a(f66944f, m34338c);
            }
        }
    }
}
