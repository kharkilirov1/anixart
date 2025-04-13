package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.JvmField;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.CompletionStateKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Scopes.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, m31884d2 = {"Lkotlinx/coroutines/internal/ScopeCoroutine;", "T", "Lkotlinx/coroutines/AbstractCoroutine;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public class ScopeCoroutine<T> extends AbstractCoroutine<T> implements CoroutineStackFrame {

    /* renamed from: d */
    @JvmField
    @NotNull
    public final Continuation<T> f68299d;

    /* JADX WARN: Multi-variable type inference failed */
    public ScopeCoroutine(@NotNull CoroutineContext coroutineContext, @NotNull Continuation<? super T> continuation) {
        super(coroutineContext, true, true);
        this.f68299d = continuation;
    }

    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: I */
    public void mo33960I(@Nullable Object obj) {
        DispatchedContinuationKt.m34280a(IntrinsicsKt.m32122b(this.f68299d), CompletionStateKt.m34005a(obj, this.f68299d), null);
    }

    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: e0 */
    public final boolean mo34091e0() {
        return true;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    /* renamed from: h */
    public final CoroutineStackFrame mo32119h() {
        Continuation<T> continuation = this.f68299d;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    /* renamed from: s */
    public final StackTraceElement mo32120s() {
        return null;
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    /* renamed from: v0 */
    public void mo33954v0(@Nullable Object obj) {
        Continuation<T> continuation = this.f68299d;
        continuation.mo31877j(CompletionStateKt.m34005a(obj, continuation));
    }
}
