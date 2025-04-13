package kotlinx.coroutines.sync;

import kotlin.Metadata;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.internal.SystemPropsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: Semaphore.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"kotlinx-coroutines-core"}, m31885k = 2, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class SemaphoreKt {

    /* renamed from: a */
    public static final int f68438a = SystemPropsKt.m34334f("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);

    /* renamed from: b */
    @NotNull
    public static final Symbol f68439b = new Symbol("PERMIT");

    /* renamed from: c */
    @NotNull
    public static final Symbol f68440c = new Symbol("TAKEN");

    /* renamed from: d */
    @NotNull
    public static final Symbol f68441d = new Symbol("BROKEN");

    /* renamed from: e */
    @NotNull
    public static final Symbol f68442e = new Symbol("CANCELLED");

    /* renamed from: f */
    public static final int f68443f = SystemPropsKt.m34334f("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);

    /* renamed from: a */
    public static Semaphore m34403a(int i2, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i3 = 0;
        }
        return new SemaphoreImpl(i2, i3);
    }
}
