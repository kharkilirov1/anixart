package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.ThreadContextKt;
import kotlinx.coroutines.scheduling.Task;
import kotlinx.coroutines.scheduling.TaskContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DispatchedTask.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00060\u0002j\u0002`\u0003¨\u0006\u0004"}, m31884d2 = {"Lkotlinx/coroutines/DispatchedTask;", "T", "Lkotlinx/coroutines/scheduling/Task;", "Lkotlinx/coroutines/SchedulerTask;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public abstract class DispatchedTask<T> extends Task {

    /* renamed from: d */
    @JvmField
    public int f66987d;

    public DispatchedTask(int i2) {
        this.f66987d = i2;
    }

    /* renamed from: a */
    public void mo33979a(@Nullable Object obj, @NotNull Throwable th) {
    }

    @NotNull
    /* renamed from: b */
    public abstract Continuation<T> mo33980b();

    @Nullable
    /* renamed from: c */
    public Throwable mo33981c(@Nullable Object obj) {
        CompletedExceptionally completedExceptionally = obj instanceof CompletedExceptionally ? (CompletedExceptionally) obj : null;
        if (completedExceptionally == null) {
            return null;
        }
        return completedExceptionally.f66956a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public <T> T mo33982e(@Nullable Object obj) {
        return obj;
    }

    /* renamed from: f */
    public final void m34035f(@Nullable Throwable th, @Nullable Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            kotlin.ExceptionsKt.m31878a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        Intrinsics.m32176e(th);
        CoroutineExceptionHandlerKt.m34016a(mo33980b().getF66944f(), new CoroutinesInternalError("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    @Nullable
    /* renamed from: i */
    public abstract Object get_state();

    @Override // java.lang.Runnable
    public final void run() {
        Object m31891a;
        Job job;
        TaskContext taskContext = this.f68357c;
        try {
            DispatchedContinuation dispatchedContinuation = (DispatchedContinuation) mo33980b();
            Continuation<T> continuation = dispatchedContinuation.f68247f;
            Object obj = dispatchedContinuation.f68249h;
            CoroutineContext f66944f = continuation.getF66944f();
            Object m34338c = ThreadContextKt.m34338c(f66944f, obj);
            UndispatchedCoroutine<?> m34013d = m34338c != ThreadContextKt.f68306a ? CoroutineContextKt.m34013d(continuation, f66944f, m34338c) : null;
            try {
                CoroutineContext f66944f2 = continuation.getF66944f();
                Object obj2 = get_state();
                Throwable mo33981c = mo33981c(obj2);
                if (mo33981c == null && DispatchedTaskKt.m34036a(this.f66987d)) {
                    int i2 = Job.f67018J1;
                    job = (Job) f66944f2.get(Job.Key.f67019b);
                } else {
                    job = null;
                }
                if (job != null && !job.mo33950a()) {
                    CancellationException mo34064o = job.mo34064o();
                    mo33979a(obj2, mo34064o);
                    continuation.mo31877j(ResultKt.m31891a(mo34064o));
                } else if (mo33981c != null) {
                    continuation.mo31877j(ResultKt.m31891a(mo33981c));
                } else {
                    continuation.mo31877j(mo33982e(obj2));
                }
                Object obj3 = Unit.f63088a;
                if (m34013d == null || m34013d.m34121z0()) {
                    ThreadContextKt.m34336a(f66944f, m34338c);
                }
                try {
                    taskContext.mo34376h();
                } catch (Throwable th) {
                    obj3 = ResultKt.m31891a(th);
                }
                m34035f(null, Result.m31890a(obj3));
            } catch (Throwable th2) {
                if (m34013d == null || m34013d.m34121z0()) {
                    ThreadContextKt.m34336a(f66944f, m34338c);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                taskContext.mo34376h();
                m31891a = Unit.f63088a;
            } catch (Throwable th4) {
                m31891a = ResultKt.m31891a(th4);
            }
            m34035f(th3, Result.m31890a(m31891a));
        }
    }
}
