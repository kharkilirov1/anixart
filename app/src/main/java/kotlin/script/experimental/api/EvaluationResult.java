package kotlin.script.experimental.api;

import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: scriptEvaluation.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/script/experimental/api/EvaluationResult;", "", "kotlin-scripting-common"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final /* data */ class EvaluationResult {
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EvaluationResult)) {
            return false;
        }
        Objects.requireNonNull((EvaluationResult) obj);
        return Intrinsics.m32174c(null, null) && Intrinsics.m32174c(null, null);
    }

    public int hashCode() {
        return 0;
    }

    @NotNull
    public String toString() {
        return "EvaluationResult(returnValue=null, configuration=null)";
    }
}
