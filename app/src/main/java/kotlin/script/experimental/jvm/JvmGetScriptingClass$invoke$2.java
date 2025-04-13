package kotlin.script.experimental.jvm;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.script.experimental.api.ScriptDependency;

/* compiled from: jvmScriptingHostConfiguration.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m31884d2 = {"<anonymous>", "", "it", "Lkotlin/script/experimental/api/ScriptDependency;", "invoke"}, m31885k = 3, m31886mv = {1, 1, 13})
/* loaded from: classes3.dex */
final class JvmGetScriptingClass$invoke$2 extends Lambda implements Function1<ScriptDependency, String> {
    static {
        new JvmGetScriptingClass$invoke$2();
    }

    public JvmGetScriptingClass$invoke$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public String invoke(ScriptDependency scriptDependency) {
        ScriptDependency it = scriptDependency;
        Intrinsics.m32180i(it, "it");
        if (!(it instanceof JvmDependency)) {
            it = null;
        }
        return "null";
    }
}
