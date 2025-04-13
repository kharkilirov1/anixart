package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import org.jetbrains.annotations.NotNull;

/* compiled from: CancellableContinuation.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"kotlinx-coroutines-core"}, m31885k = 2, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class CancellableContinuationKt {
    @InternalCoroutinesApi
    /* renamed from: a */
    public static final void m33995a(@NotNull CancellableContinuation<?> cancellableContinuation, @NotNull DisposableHandle disposableHandle) {
        cancellableContinuation.mo33966r(new DisposeOnCancel(disposableHandle));
    }

    @NotNull
    /* renamed from: b */
    public static final <T> CancellableContinuationImpl<T> m33996b(@NotNull Continuation<? super T> continuation) {
        if (!(continuation instanceof DispatchedContinuation)) {
            return new CancellableContinuationImpl<>(continuation, 1);
        }
        CancellableContinuationImpl<T> m34275k = ((DispatchedContinuation) continuation).m34275k();
        if (m34275k == null || !m34275k.m33974E()) {
            m34275k = null;
        }
        return m34275k == null ? new CancellableContinuationImpl<>(continuation, 2) : m34275k;
    }

    /* renamed from: c */
    public static final void m33997c(@NotNull CancellableContinuation<?> cancellableContinuation, @NotNull LockFreeLinkedListNode lockFreeLinkedListNode) {
        ((CancellableContinuationImpl) cancellableContinuation).mo33966r(new RemoveOnCancel(lockFreeLinkedListNode));
    }
}
