package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.DispatchedContinuation;
import org.jetbrains.annotations.NotNull;

/* compiled from: DebugStrings.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"kotlinx-coroutines-core"}, m31885k = 2, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class DebugStringsKt {
    @NotNull
    /* renamed from: a */
    public static final String m34022a(@NotNull Object obj) {
        return obj.getClass().getSimpleName();
    }

    @NotNull
    /* renamed from: b */
    public static final String m34023b(@NotNull Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    @NotNull
    /* renamed from: c */
    public static final String m34024c(@NotNull Continuation<?> continuation) {
        Object m31891a;
        if (continuation instanceof DispatchedContinuation) {
            return continuation.toString();
        }
        try {
            m31891a = continuation + '@' + m34023b(continuation);
        } catch (Throwable th) {
            m31891a = ResultKt.m31891a(th);
        }
        if (Result.m31890a(m31891a) != null) {
            m31891a = ((Object) continuation.getClass().getName()) + '@' + m34023b(continuation);
        }
        return (String) m31891a;
    }
}
