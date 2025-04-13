package com.swiftsoft.anixartd.utils;

import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TimeMeasuring.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/swiftsoft/anixartd/utils/TimeMeasuring;", "", "Measurement", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class TimeMeasuring {

    /* compiled from: TimeMeasuring.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/utils/TimeMeasuring$Measurement;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final /* data */ class Measurement {
        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Measurement)) {
                return false;
            }
            Objects.requireNonNull((Measurement) obj);
            return Intrinsics.m32174c(null, null) && Intrinsics.m32174c(null, null);
        }

        public int hashCode() {
            throw null;
        }

        @NotNull
        public String toString() {
            return "Measurement(name=null, tag=null)";
        }
    }

    static {
        new ConcurrentHashMap();
    }
}
