package kotlinx.coroutines.debug.internal;

import java.lang.ref.Reference;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.debug.internal.ConcurrentWeakMap;

/* compiled from: DebugProbesImpl.kt */
@Metadata(m31883d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m31884d2 = {"<anonymous>", "", "invoke"}, m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
/* loaded from: classes3.dex */
final class DebugProbesImpl$startWeakRefCleanerThread$1 extends Lambda implements Function0<Unit> {
    static {
        new DebugProbesImpl$startWeakRefCleanerThread$1();
    }

    public DebugProbesImpl$startWeakRefCleanerThread$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public Unit invoke() {
        ConcurrentWeakMap<CoroutineStackFrame, DebugCoroutineInfoImpl> concurrentWeakMap = DebugProbesImpl.f67431e;
        if (!(concurrentWeakMap.f67395b != null)) {
            throw new IllegalStateException("Must be created with weakRefQueue = true".toString());
        }
        while (true) {
            try {
                Reference<? extends CoroutineStackFrame> remove = concurrentWeakMap.f67395b.remove();
                if (remove == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.debug.internal.HashedWeakRef<*>");
                }
                HashedWeakRef hashedWeakRef = (HashedWeakRef) remove;
                ConcurrentWeakMap.Core core = (ConcurrentWeakMap.Core) concurrentWeakMap.core;
                Objects.requireNonNull(core);
                int m34196a = core.m34196a(hashedWeakRef.f67432a);
                while (true) {
                    HashedWeakRef hashedWeakRef2 = (HashedWeakRef) core.f67400d.get(m34196a);
                    if (hashedWeakRef2 != null) {
                        if (hashedWeakRef2 == hashedWeakRef) {
                            core.m34199d(m34196a);
                            break;
                        }
                        if (m34196a == 0) {
                            m34196a = core.f67397a;
                        }
                        m34196a--;
                    }
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return Unit.f63088a;
            }
        }
    }
}
