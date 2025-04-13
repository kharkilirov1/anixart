package kotlin.script.experimental.api;

import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: errorHandling.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlin/script/experimental/api/ScriptDiagnostic;", "", "Severity", "kotlin-scripting-common"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final /* data */ class ScriptDiagnostic {

    /* compiled from: errorHandling.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m31884d2 = {"Lkotlin/script/experimental/api/ScriptDiagnostic$Severity;", "", "FATAL", "ERROR", "WARNING", "INFO", "DEBUG", "kotlin-scripting-common"}, m31885k = 1, m31886mv = {1, 4, 0})
    public enum Severity {
        /* JADX INFO: Fake field, exist only in values array */
        FATAL,
        /* JADX INFO: Fake field, exist only in values array */
        ERROR,
        /* JADX INFO: Fake field, exist only in values array */
        WARNING,
        /* JADX INFO: Fake field, exist only in values array */
        INFO,
        /* JADX INFO: Fake field, exist only in values array */
        DEBUG
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScriptDiagnostic)) {
            return false;
        }
        Objects.requireNonNull((ScriptDiagnostic) obj);
        return Intrinsics.m32174c(null, null) && Intrinsics.m32174c(null, null) && Intrinsics.m32174c(null, null) && Intrinsics.m32174c(null, null);
    }

    public int hashCode() {
        return 0;
    }

    @NotNull
    public String toString() {
        return "ScriptDiagnostic(message=null, severity=null, location=null, exception=null)";
    }
}
