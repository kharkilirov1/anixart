package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlinx.coroutines.DebugStringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Atomic.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlinx/coroutines/internal/OpDescriptor;", "", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public abstract class OpDescriptor {
    @Nullable
    /* renamed from: a */
    public abstract AtomicOp<?> mo34262a();

    /* renamed from: b */
    public final boolean m34321b(@NotNull OpDescriptor opDescriptor) {
        AtomicOp<?> mo34262a;
        AtomicOp<?> mo34262a2 = mo34262a();
        return (mo34262a2 == null || (mo34262a = opDescriptor.mo34262a()) == null || mo34262a2.mo34267g() >= mo34262a.mo34267g()) ? false : true;
    }

    @Nullable
    /* renamed from: c */
    public abstract Object mo34263c(@Nullable Object obj);

    @NotNull
    public String toString() {
        return getClass().getSimpleName() + '@' + DebugStringsKt.m34023b(this);
    }
}
