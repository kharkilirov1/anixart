package kotlin.time;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;

/* compiled from: MonoTimeSource.kt */
@SinceKotlin
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/time/MonotonicTimeSource;", "Lkotlin/time/TimeSource;", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
@ExperimentalTime
/* loaded from: classes3.dex */
public final class MonotonicTimeSource implements TimeSource {

    /* renamed from: a */
    @NotNull
    public static final MonotonicTimeSource f66923a = new MonotonicTimeSource();

    static {
        System.nanoTime();
    }

    @NotNull
    public String toString() {
        return "TimeSource(System.nanoTime())";
    }
}
