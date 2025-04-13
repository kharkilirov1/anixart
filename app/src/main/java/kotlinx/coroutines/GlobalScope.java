package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import org.jetbrains.annotations.NotNull;

/* compiled from: CoroutineScope.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlinx/coroutines/GlobalScope;", "Lkotlinx/coroutines/CoroutineScope;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
@DelicateCoroutinesApi
/* loaded from: classes3.dex */
public final class GlobalScope implements CoroutineScope {
    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    /* renamed from: getCoroutineContext */
    public CoroutineContext getF68244b() {
        return EmptyCoroutineContext.f63224b;
    }
}
