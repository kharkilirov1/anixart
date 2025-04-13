package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.jetbrains.annotations.NotNull;

/* compiled from: CoroutineExceptionHandler.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"kotlinx-coroutines-core"}, m31885k = 2, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class CoroutineExceptionHandlerKt {
    @InternalCoroutinesApi
    /* renamed from: a */
    public static final void m34016a(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th) {
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) coroutineContext.get(CoroutineExceptionHandler.Key.f66966b);
            if (coroutineExceptionHandler == null) {
                CoroutineExceptionHandlerImplKt.m34015a(coroutineContext, th);
            } else {
                coroutineExceptionHandler.handleException(coroutineContext, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                kotlin.ExceptionsKt.m31878a(runtimeException, th);
                th = runtimeException;
            }
            CoroutineExceptionHandlerImplKt.m34015a(coroutineContext, th);
        }
    }
}
