package kotlinx.coroutines;

import kotlin.Metadata;
import kotlinx.coroutines.intrinsics.CancellableKt;

/* compiled from: Builders.common.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlinx/coroutines/LazyDeferredCoroutine;", "T", "Lkotlinx/coroutines/DeferredCoroutine;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
final class LazyDeferredCoroutine<T> extends DeferredCoroutine<T> {
    @Override // kotlinx.coroutines.JobSupport
    /* renamed from: m0 */
    public void mo34097m0() {
        CancellableKt.m34348b(null, this);
    }
}
