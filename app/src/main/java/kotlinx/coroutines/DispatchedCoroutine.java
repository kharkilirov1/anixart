package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.internal.DispatchedContinuationKt;
import kotlinx.coroutines.internal.ScopeCoroutine;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Builders.common.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlinx/coroutines/DispatchedCoroutine;", "T", "Lkotlinx/coroutines/internal/ScopeCoroutine;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class DispatchedCoroutine<T> extends ScopeCoroutine<T> {

    /* renamed from: e */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f66986e = AtomicIntegerFieldUpdater.newUpdater(DispatchedCoroutine.class, "_decision");

    @NotNull
    private volatile /* synthetic */ int _decision;

    public DispatchedCoroutine(@NotNull CoroutineContext coroutineContext, @NotNull Continuation<? super T> continuation) {
        super(coroutineContext, continuation);
        this._decision = 0;
    }

    @Override // kotlinx.coroutines.internal.ScopeCoroutine, kotlinx.coroutines.JobSupport
    /* renamed from: I */
    public void mo33960I(@Nullable Object obj) {
        mo33954v0(obj);
    }

    @Override // kotlinx.coroutines.internal.ScopeCoroutine, kotlinx.coroutines.AbstractCoroutine
    /* renamed from: v0 */
    public void mo33954v0(@Nullable Object obj) {
        boolean z;
        while (true) {
            int i2 = this._decision;
            z = false;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("Already resumed".toString());
                }
            } else if (f66986e.compareAndSet(this, 0, 2)) {
                z = true;
                break;
            }
        }
        if (z) {
            return;
        }
        DispatchedContinuationKt.m34280a(IntrinsicsKt.m32122b(this.f68299d), CompletionStateKt.m34005a(obj, this.f68299d), null);
    }

    @Nullable
    /* renamed from: z0 */
    public final Object m34034z0() {
        boolean z;
        while (true) {
            int i2 = this._decision;
            z = false;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new IllegalStateException("Already suspended".toString());
                }
            } else if (f66986e.compareAndSet(this, 0, 1)) {
                z = true;
                break;
            }
        }
        if (z) {
            return CoroutineSingletons.COROUTINE_SUSPENDED;
        }
        Object m34114a = JobSupportKt.m34114a(m34088a0());
        if (m34114a instanceof CompletedExceptionally) {
            throw ((CompletedExceptionally) m34114a).f66956a;
        }
        return m34114a;
    }
}
