package kotlin.script.experimental.host;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty;
import kotlin.script.experimental.api.ScriptCompilationConfiguration;
import kotlin.script.experimental.api.ScriptCompilationKt;
import kotlin.script.experimental.util.PropertiesCollection;

/* compiled from: configurationFromTemplate.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m31884d2 = {"<anonymous>", "", "Lkotlin/script/experimental/api/ScriptCompilationConfiguration$Builder;", "invoke"}, m31885k = 3, m31886mv = {1, 1, 13})
/* renamed from: kotlin.script.experimental.host.ConfigurationFromTemplateKt$createCompilationConfigurationFromTemplate$3 */
/* loaded from: classes3.dex */
final class C6768xba30f683 extends Lambda implements Function1<ScriptCompilationConfiguration.Builder, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public Unit invoke(ScriptCompilationConfiguration.Builder builder) {
        ScriptCompilationConfiguration.Builder receiver$0 = builder;
        Intrinsics.m32180i(receiver$0, "receiver$0");
        KProperty[] kPropertyArr = ScriptCompilationKt.f66594a;
        PropertiesCollection.PropertyKeyDelegate propertyKeyDelegate = ScriptCompilationKt.f66597d;
        KProperty[] kPropertyArr2 = ScriptCompilationKt.f66594a;
        if (receiver$0.m33819a(propertyKeyDelegate.m33821a(kPropertyArr2[2])) == null) {
            receiver$0.m33820b(propertyKeyDelegate.m33821a(kPropertyArr2[2]), null);
        }
        PropertiesCollection.PropertyKeyDelegate propertyKeyDelegate2 = ScriptCompilationKt.f66596c;
        if (receiver$0.m33819a(propertyKeyDelegate2.m33821a(kPropertyArr2[1])) == null) {
            propertyKeyDelegate2.m33821a(kPropertyArr2[1]);
            throw null;
        }
        PropertiesCollection.PropertyKeyDelegate propertyKeyDelegate3 = ScriptCompilationKt.f66595b;
        if (receiver$0.m33819a(propertyKeyDelegate3.m33821a(kPropertyArr2[0])) != null) {
            throw null;
        }
        propertyKeyDelegate3.m33821a(kPropertyArr2[0]);
        throw null;
    }
}
