package kotlin.time;

import java.util.Objects;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.JvmInline;
import org.jetbrains.annotations.NotNull;

/* compiled from: TimeSource.kt */
@SinceKotlin
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m31884d2 = {"Lkotlin/time/TimeSource;", "", "Companion", "Monotonic", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
@ExperimentalTime
/* loaded from: classes3.dex */
public interface TimeSource {

    /* compiled from: TimeSource.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/time/TimeSource$Companion;", "", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    /* compiled from: TimeSource.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlin/time/TimeSource$Monotonic;", "Lkotlin/time/TimeSource;", "ValueTimeMark", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Monotonic implements TimeSource {

        /* compiled from: TimeSource.kt */
        @SinceKotlin
        @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00060\u0003j\u0002`\u0004ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0005"}, m31884d2 = {"Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;", "Lkotlin/time/TimeMark;", "reading", "", "Lkotlin/time/ValueTimeMarkReading;", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
        @JvmInline
        @ExperimentalTime
        public static final class ValueTimeMark implements TimeMark {
            public boolean equals(Object obj) {
                if (!(obj instanceof ValueTimeMark)) {
                    return false;
                }
                Objects.requireNonNull((ValueTimeMark) obj);
                return true;
            }

            public int hashCode() {
                return (int) 0;
            }

            public String toString() {
                return "ValueTimeMark(reading=0)";
            }
        }

        @NotNull
        public String toString() {
            MonotonicTimeSource monotonicTimeSource = MonotonicTimeSource.f66923a;
            return "TimeSource(System.nanoTime())";
        }
    }
}
