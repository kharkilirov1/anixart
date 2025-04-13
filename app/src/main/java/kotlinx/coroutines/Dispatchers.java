package kotlinx.coroutines;

import kotlin.Metadata;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import org.jetbrains.annotations.NotNull;

/* compiled from: Dispatchers.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlinx/coroutines/Dispatchers;", "", "kotlinx-coroutines-core"}, m31885k = 1, m31886mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class Dispatchers {

    /* renamed from: a */
    @NotNull
    public static final CoroutineDispatcher f66988a = DefaultScheduler.f68348h;

    /* renamed from: b */
    @NotNull
    public static final CoroutineDispatcher f66989b;

    static {
        Unconfined unconfined = Unconfined.f67065c;
        f66989b = DefaultIoScheduler.f68346c;
    }
}
