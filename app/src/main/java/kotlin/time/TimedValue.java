package kotlin.time;

import java.util.Objects;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: measureTime.kt */
@SinceKotlin
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlin/time/TimedValue;", "T", "", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
@ExperimentalTime
/* loaded from: classes3.dex */
public final /* data */ class TimedValue<T> {
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimedValue)) {
            return false;
        }
        Objects.requireNonNull((TimedValue) obj);
        if (!Intrinsics.m32174c(null, null)) {
            return false;
        }
        Duration.Companion companion = Duration.f66910b;
        return true;
    }

    public int hashCode() {
        Duration.Companion companion = Duration.f66910b;
        return ((int) 0) + 0;
    }

    @NotNull
    public String toString() {
        return "TimedValue(value=" + ((Object) null) + ", duration=" + ((Object) Duration.m33948f(0L)) + ')';
    }
}
