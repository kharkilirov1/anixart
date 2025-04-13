package kotlinx.coroutines;

import kotlin.Metadata;
import kotlinx.coroutines.internal.Symbol;
import org.jetbrains.annotations.NotNull;

/* compiled from: EventLoop.common.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u001e\b\u0002\u0010\u0002\u001a\u0004\b\u0000\u0010\u0000\"\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003"}, m31884d2 = {"T", "Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "Queue", "kotlinx-coroutines-core"}, m31885k = 2, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class EventLoop_commonKt {

    /* renamed from: a */
    @NotNull
    public static final Symbol f67006a = new Symbol("REMOVED_TASK");

    /* renamed from: b */
    @NotNull
    public static final Symbol f67007b = new Symbol("CLOSED_EMPTY");

    /* renamed from: a */
    public static final long m34056a(long j2) {
        if (j2 <= 0) {
            return 0L;
        }
        if (j2 >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return 1000000 * j2;
    }
}
