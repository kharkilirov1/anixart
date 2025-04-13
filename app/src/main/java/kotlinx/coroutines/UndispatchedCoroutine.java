package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.ScopeCoroutine;
import kotlinx.coroutines.internal.ThreadContextKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CoroutineContext.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlinx/coroutines/UndispatchedCoroutine;", "T", "Lkotlinx/coroutines/internal/ScopeCoroutine;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class UndispatchedCoroutine<T> extends ScopeCoroutine<T> {

    /* renamed from: e */
    @NotNull
    public ThreadLocal<Pair<CoroutineContext, Object>> f67066e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public UndispatchedCoroutine(@org.jetbrains.annotations.NotNull kotlin.coroutines.CoroutineContext r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super T> r4) {
        /*
            r2 = this;
            kotlinx.coroutines.UndispatchedMarker r0 = kotlinx.coroutines.UndispatchedMarker.f67067b
            kotlin.coroutines.CoroutineContext$Element r1 = r3.get(r0)
            if (r1 != 0) goto Lc
            kotlin.coroutines.CoroutineContext r3 = r3.plus(r0)
        Lc:
            r2.<init>(r3, r4)
            java.lang.ThreadLocal r3 = new java.lang.ThreadLocal
            r3.<init>()
            r2.f67066e = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.UndispatchedCoroutine.<init>(kotlin.coroutines.CoroutineContext, kotlin.coroutines.Continuation):void");
    }

    @Override // kotlinx.coroutines.internal.ScopeCoroutine, kotlinx.coroutines.AbstractCoroutine
    /* renamed from: v0 */
    public void mo33954v0(@Nullable Object obj) {
        Pair<CoroutineContext, Object> pair = this.f67066e.get();
        if (pair != null) {
            ThreadContextKt.m34336a(pair.f63055b, pair.f63056c);
            this.f67066e.set(null);
        }
        Object m34005a = CompletionStateKt.m34005a(obj, this.f68299d);
        Continuation<T> continuation = this.f68299d;
        CoroutineContext f68225c = continuation.getF68225c();
        Object m34338c = ThreadContextKt.m34338c(f68225c, null);
        UndispatchedCoroutine<?> m34013d = m34338c != ThreadContextKt.f68306a ? CoroutineContextKt.m34013d(continuation, f68225c, m34338c) : null;
        try {
            this.f68299d.mo31877j(m34005a);
        } finally {
            if (m34013d == null || m34013d.m34121z0()) {
                ThreadContextKt.m34336a(f68225c, m34338c);
            }
        }
    }

    /* renamed from: z0 */
    public final boolean m34121z0() {
        if (this.f67066e.get() == null) {
            return false;
        }
        this.f67066e.set(null);
        return true;
    }
}
