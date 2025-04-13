package kotlinx.coroutines.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Atomic.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlinx/coroutines/internal/AtomicDesc;", "", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public abstract class AtomicDesc {

    /* renamed from: a */
    public AtomicOp<?> f68235a;

    /* renamed from: a */
    public abstract void mo34260a(@NotNull AtomicOp<?> atomicOp, @Nullable Object obj);

    @Nullable
    /* renamed from: b */
    public abstract Object mo34261b(@NotNull AtomicOp<?> atomicOp);
}
