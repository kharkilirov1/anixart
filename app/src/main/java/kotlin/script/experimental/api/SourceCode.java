package kotlin.script.experimental.api;

import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: scriptData.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Lkotlin/script/experimental/api/SourceCode;", "", "Location", "Position", "Range", "kotlin-scripting-common"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public interface SourceCode {

    /* compiled from: scriptData.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/script/experimental/api/SourceCode$Location;", "", "kotlin-scripting-common"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final /* data */ class Location {
        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Location)) {
                return false;
            }
            Objects.requireNonNull((Location) obj);
            return Intrinsics.m32174c(null, null) && Intrinsics.m32174c(null, null);
        }

        public int hashCode() {
            return 0;
        }

        @NotNull
        public String toString() {
            return "Location(start=null, end=null)";
        }
    }

    /* compiled from: scriptData.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/script/experimental/api/SourceCode$Position;", "", "kotlin-scripting-common"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final /* data */ class Position {
        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Position)) {
                return false;
            }
            Objects.requireNonNull((Position) obj);
            return Intrinsics.m32174c(null, null);
        }

        public int hashCode() {
            return 0;
        }

        @NotNull
        public String toString() {
            return "Position(line=0, col=0, absolutePos=null)";
        }
    }

    /* compiled from: scriptData.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/script/experimental/api/SourceCode$Range;", "", "kotlin-scripting-common"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final /* data */ class Range {
        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Range)) {
                return false;
            }
            Objects.requireNonNull((Range) obj);
            return Intrinsics.m32174c(null, null) && Intrinsics.m32174c(null, null);
        }

        public int hashCode() {
            return 0;
        }

        @NotNull
        public String toString() {
            return "Range(start=null, end=null)";
        }
    }
}
