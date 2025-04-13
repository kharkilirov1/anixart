package kotlin.script.experimental.jvm.compat;

import kotlin.Metadata;
import kotlin.script.dependencies.ScriptDependenciesResolver;
import kotlin.script.experimental.api.ScriptDiagnostic;

/* compiled from: diagnosticsUtil.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"kotlin-scripting-jvm"}, m31885k = 2, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class DiagnosticsUtilKt {

    @Metadata(m31882bv = {1, 0, 3}, m31885k = 3, m31886mv = {1, 1, 13})
    public final /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[ScriptDependenciesResolver.ReportSeverity.values().length];
            iArr[0] = 1;
            iArr[1] = 2;
            iArr[2] = 3;
            iArr[3] = 4;
            iArr[4] = 5;
            int[] iArr2 = new int[ScriptDiagnostic.Severity.values().length];
            iArr2[0] = 1;
            iArr2[1] = 2;
            iArr2[2] = 3;
            iArr2[3] = 4;
            iArr2[4] = 5;
        }
    }
}
