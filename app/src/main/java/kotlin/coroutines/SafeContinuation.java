package kotlin.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SafeContinuationJvm.kt */
@SinceKotlin
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003:\u0001\u0007R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m31884d2 = {"Lkotlin/coroutines/SafeContinuation;", "T", "Lkotlin/coroutines/Continuation;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "", "result", "Ljava/lang/Object;", "Companion", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
@PublishedApi
/* loaded from: classes3.dex */
public final class SafeContinuation<T> implements Continuation<T>, CoroutineStackFrame {

    /* renamed from: b */
    @Deprecated
    public static final AtomicReferenceFieldUpdater<SafeContinuation<?>, Object> f63225b = AtomicReferenceFieldUpdater.newUpdater(SafeContinuation.class, Object.class, "result");

    @Nullable
    private volatile Object result;

    /* compiled from: SafeContinuationJvm.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001Rj\u0010\u0005\u001aR\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u0004*\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001 \u0004*(\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u0004*\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u0007\u0010\b¨\u0006\t"}, m31884d2 = {"Lkotlin/coroutines/SafeContinuation$Companion;", "", "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "Lkotlin/coroutines/SafeContinuation;", "kotlin.jvm.PlatformType", "RESULT", "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "getRESULT$annotations", "()V", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    @Override // kotlin.coroutines.Continuation
    @NotNull
    /* renamed from: g */
    public CoroutineContext getF68225c() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    /* renamed from: h */
    public CoroutineStackFrame mo32119h() {
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    /* renamed from: j */
    public void mo31877j(@NotNull Object obj) {
        while (true) {
            Object obj2 = this.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.UNDECIDED;
            boolean z = false;
            if (obj2 == coroutineSingletons) {
                AtomicReferenceFieldUpdater<SafeContinuation<?>, Object> atomicReferenceFieldUpdater = f63225b;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, coroutineSingletons, obj)) {
                        z = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != coroutineSingletons) {
                        break;
                    }
                }
                if (z) {
                    return;
                }
            } else {
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (obj2 != coroutineSingletons2) {
                    throw new IllegalStateException("Already resumed");
                }
                AtomicReferenceFieldUpdater<SafeContinuation<?>, Object> atomicReferenceFieldUpdater2 = f63225b;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.RESUMED;
                while (true) {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, coroutineSingletons2, coroutineSingletons3)) {
                        z = true;
                        break;
                    } else if (atomicReferenceFieldUpdater2.get(this) != coroutineSingletons2) {
                        break;
                    }
                }
                if (z) {
                    throw null;
                }
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    /* renamed from: s */
    public StackTraceElement mo32120s() {
        return null;
    }

    @NotNull
    public String toString() {
        return "SafeContinuation for null";
    }
}
