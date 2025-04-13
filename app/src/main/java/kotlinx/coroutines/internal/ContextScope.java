package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* compiled from: Scopes.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlinx/coroutines/internal/ContextScope;", "Lkotlinx/coroutines/CoroutineScope;", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class ContextScope implements CoroutineScope {

    /* renamed from: b */
    @NotNull
    public final CoroutineContext f68244b;

    public ContextScope(@NotNull CoroutineContext coroutineContext) {
        this.f68244b = coroutineContext;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    /* renamed from: getCoroutineContext, reason: from getter */
    public CoroutineContext getF68244b() {
        return this.f68244b;
    }

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("CoroutineScope(coroutineContext=");
        m24u.append(this.f68244b);
        m24u.append(')');
        return m24u.toString();
    }
}
