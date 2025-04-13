package kotlinx.coroutines;

import kotlin.Metadata;

/* compiled from: CoroutineStart.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m31884d2 = {"Lkotlinx/coroutines/CoroutineStart;", "", "DEFAULT", "LAZY", "ATOMIC", "UNDISPATCHED", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public enum CoroutineStart {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    /* compiled from: CoroutineStart.kt */
    @Metadata(m31885k = 3, m31886mv = {1, 6, 0}, m31888xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[CoroutineStart.values().length];
            iArr[0] = 1;
            iArr[2] = 2;
            iArr[3] = 3;
            iArr[1] = 4;
        }
    }
}
