package kotlin.time;

import kotlin.Metadata;
import kotlin.SinceKotlin;

/* compiled from: TimeSources.kt */
@SinceKotlin
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/time/TestTimeSource;", "Lkotlin/time/AbstractLongTimeSource;", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
@ExperimentalTime
/* loaded from: classes3.dex */
public final class TestTimeSource extends AbstractLongTimeSource {
    public TestTimeSource() {
        super(DurationUnit.NANOSECONDS);
    }
}
