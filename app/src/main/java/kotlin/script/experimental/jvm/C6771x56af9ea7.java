package kotlin.script.experimental.jvm;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty;
import kotlin.script.experimental.host.ScriptingEnvironmentKt;
import kotlin.script.experimental.host.ScriptingHostConfiguration;

/* compiled from: jvmScriptingHostConfiguration.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m31884d2 = {"<anonymous>", "", "Lkotlin/script/experimental/host/ScriptingHostConfiguration$Builder;", "invoke"}, m31885k = 3, m31886mv = {1, 1, 13})
/* renamed from: kotlin.script.experimental.jvm.JvmScriptingHostConfigurationKt$defaultJvmScriptingHostConfiguration$1 */
/* loaded from: classes3.dex */
final class C6771x56af9ea7 extends Lambda implements Function1<ScriptingHostConfiguration.Builder, Unit> {
    static {
        new C6771x56af9ea7();
    }

    public C6771x56af9ea7() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public Unit invoke(ScriptingHostConfiguration.Builder builder) {
        ScriptingHostConfiguration.Builder receiver$0 = builder;
        Intrinsics.m32180i(receiver$0, "receiver$0");
        KProperty[] kPropertyArr = ScriptingEnvironmentKt.f66641a;
        receiver$0.f66671a.put(ScriptingEnvironmentKt.f66642b.m33821a(ScriptingEnvironmentKt.f66641a[1]), new JvmGetScriptingClass());
        return Unit.f63088a;
    }
}
