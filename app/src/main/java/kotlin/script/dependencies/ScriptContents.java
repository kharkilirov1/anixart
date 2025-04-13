package kotlin.script.dependencies;

import java.lang.annotation.Annotation;
import java.util.Objects;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: resolvers_deprecated.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlin/script/dependencies/ScriptContents;", "", "Position", "kotlin-script-runtime"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public interface ScriptContents {

    /* compiled from: resolvers_deprecated.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/script/dependencies/ScriptContents$Position;", "", "kotlin-script-runtime"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final /* data */ class Position {
        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Position)) {
                return false;
            }
            Objects.requireNonNull((Position) obj);
            return true;
        }

        public int hashCode() {
            return 0;
        }

        @NotNull
        public String toString() {
            return "Position(line=0, col=0)";
        }
    }

    @NotNull
    Iterable<Annotation> getAnnotations();
}
