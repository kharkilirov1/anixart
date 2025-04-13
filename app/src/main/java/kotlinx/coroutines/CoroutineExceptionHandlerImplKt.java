package kotlinx.coroutines;

import java.lang.Thread;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: CoroutineExceptionHandlerImpl.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"kotlinx-coroutines-core"}, m31885k = 2, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class CoroutineExceptionHandlerImplKt {

    /* renamed from: a */
    @NotNull
    public static final List<CoroutineExceptionHandler> f66967a = SequencesKt.m33831A(SequencesKt.m33836d(ServiceLoader.load(CoroutineExceptionHandler.class, CoroutineExceptionHandler.class.getClassLoader()).iterator()));

    /* renamed from: a */
    public static final void m34015a(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th) {
        Throwable runtimeException;
        Iterator<CoroutineExceptionHandler> it = f66967a.iterator();
        while (it.hasNext()) {
            try {
                it.next().handleException(coroutineContext, th);
            } catch (Throwable th2) {
                Thread currentThread = Thread.currentThread();
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = currentThread.getUncaughtExceptionHandler();
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    kotlin.ExceptionsKt.m31878a(runtimeException, th);
                }
                uncaughtExceptionHandler.uncaughtException(currentThread, runtimeException);
            }
        }
        Thread currentThread2 = Thread.currentThread();
        try {
            kotlin.ExceptionsKt.m31878a(th, new DiagnosticCoroutineContextException(coroutineContext));
        } catch (Throwable th3) {
            ResultKt.m31891a(th3);
        }
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }
}
