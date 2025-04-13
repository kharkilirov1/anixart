package kotlinx.coroutines.internal;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CompletedWithCancellation;
import kotlinx.coroutines.CompletionStateKt;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.EventLoop;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.ThreadLocalEventLoop;
import kotlinx.coroutines.UndispatchedCoroutine;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DispatchedContinuation.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"kotlinx-coroutines-core"}, m31885k = 2, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class DispatchedContinuationKt {

    /* renamed from: a */
    @NotNull
    public static final Symbol f68250a = new Symbol("UNDEFINED");

    /* renamed from: b */
    @JvmField
    @NotNull
    public static final Symbol f68251b = new Symbol("REUSABLE_CLAIMED");

    /* JADX WARN: Finally extract failed */
    @InternalCoroutinesApi
    /* renamed from: a */
    public static final <T> void m34280a(@NotNull Continuation<? super T> continuation, @NotNull Object obj, @Nullable Function1<? super Throwable, Unit> function1) {
        boolean z;
        if (!(continuation instanceof DispatchedContinuation)) {
            continuation.mo31877j(obj);
            return;
        }
        DispatchedContinuation dispatchedContinuation = (DispatchedContinuation) continuation;
        Object m34006b = CompletionStateKt.m34006b(obj, function1);
        if (dispatchedContinuation.f68246e.mo3222q(dispatchedContinuation.getF66944f())) {
            dispatchedContinuation.f68248g = m34006b;
            dispatchedContinuation.f66987d = 1;
            dispatchedContinuation.f68246e.mo3221m(dispatchedContinuation.getF66944f(), dispatchedContinuation);
            return;
        }
        EventLoop m34117a = ThreadLocalEventLoop.f67053a.m34117a();
        if (m34117a.m34043d0()) {
            dispatchedContinuation.f68248g = m34006b;
            dispatchedContinuation.f66987d = 1;
            m34117a.m34041Z(dispatchedContinuation);
            return;
        }
        m34117a.m34042b0(true);
        try {
            CoroutineContext f66944f = dispatchedContinuation.getF66944f();
            int i2 = Job.f67018J1;
            Job job = (Job) f66944f.get(Job.Key.f67019b);
            if (job == null || job.mo33950a()) {
                z = false;
            } else {
                CancellationException mo34064o = job.mo34064o();
                if (m34006b instanceof CompletedWithCancellation) {
                    ((CompletedWithCancellation) m34006b).f66958b.invoke(mo34064o);
                }
                dispatchedContinuation.mo31877j(ResultKt.m31891a(mo34064o));
                z = true;
            }
            if (!z) {
                Continuation<T> continuation2 = dispatchedContinuation.f68247f;
                Object obj2 = dispatchedContinuation.f68249h;
                CoroutineContext f66944f2 = continuation2.getF66944f();
                Object m34338c = ThreadContextKt.m34338c(f66944f2, obj2);
                UndispatchedCoroutine<?> m34013d = m34338c != ThreadContextKt.f68306a ? CoroutineContextKt.m34013d(continuation2, f66944f2, m34338c) : null;
                try {
                    dispatchedContinuation.f68247f.mo31877j(obj);
                    if (m34013d == null || m34013d.m34121z0()) {
                        ThreadContextKt.m34336a(f66944f2, m34338c);
                    }
                } catch (Throwable th) {
                    if (m34013d == null || m34013d.m34121z0()) {
                        ThreadContextKt.m34336a(f66944f2, m34338c);
                    }
                    throw th;
                }
            }
            while (m34117a.m34044n0()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }
}
