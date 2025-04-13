package kotlin.script.experimental.api;

import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.script.experimental.util.PropertiesCollection;
import org.jetbrains.annotations.NotNull;

/* compiled from: scriptCompilation.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*.\u0010\u0004\"\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00002\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000¨\u0006\u0005"}, m31884d2 = {"Lkotlin/Function1;", "Lkotlin/script/experimental/api/ScriptConfigurationRefinementContext;", "Lkotlin/script/experimental/api/ResultWithDiagnostics;", "Lkotlin/script/experimental/api/ScriptCompilationConfiguration;", "RefineScriptCompilationConfigurationHandler", "kotlin-scripting-common"}, m31885k = 2, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class ScriptCompilationKt {

    /* renamed from: a */
    public static final /* synthetic */ KProperty[] f66594a = {Reflection.m32197e(new PropertyReference1Impl(Reflection.m32194b(ScriptCompilationKt.class, "kotlin-scripting-common"), "displayName", "getDisplayName(Lkotlin/script/experimental/api/ScriptCompilationConfigurationKeys;)Lkotlin/script/experimental/util/PropertiesCollection$Key;")), Reflection.m32197e(new PropertyReference1Impl(Reflection.m32194b(ScriptCompilationKt.class, "kotlin-scripting-common"), "fileExtension", "getFileExtension(Lkotlin/script/experimental/api/ScriptCompilationConfigurationKeys;)Lkotlin/script/experimental/util/PropertiesCollection$Key;")), Reflection.m32197e(new PropertyReference1Impl(Reflection.m32194b(ScriptCompilationKt.class, "kotlin-scripting-common"), "baseClass", "getBaseClass(Lkotlin/script/experimental/api/ScriptCompilationConfigurationKeys;)Lkotlin/script/experimental/util/PropertiesCollection$Key;")), Reflection.m32197e(new PropertyReference1Impl(Reflection.m32194b(ScriptCompilationKt.class, "kotlin-scripting-common"), "implicitReceivers", "getImplicitReceivers(Lkotlin/script/experimental/api/ScriptCompilationConfigurationKeys;)Lkotlin/script/experimental/util/PropertiesCollection$Key;")), Reflection.m32197e(new PropertyReference1Impl(Reflection.m32194b(ScriptCompilationKt.class, "kotlin-scripting-common"), "providedProperties", "getProvidedProperties(Lkotlin/script/experimental/api/ScriptCompilationConfigurationKeys;)Lkotlin/script/experimental/util/PropertiesCollection$Key;")), Reflection.m32197e(new PropertyReference1Impl(Reflection.m32194b(ScriptCompilationKt.class, "kotlin-scripting-common"), "defaultImports", "getDefaultImports(Lkotlin/script/experimental/api/ScriptCompilationConfigurationKeys;)Lkotlin/script/experimental/util/PropertiesCollection$Key;")), Reflection.m32197e(new PropertyReference1Impl(Reflection.m32194b(ScriptCompilationKt.class, "kotlin-scripting-common"), "dependencies", "getDependencies(Lkotlin/script/experimental/api/ScriptCompilationConfigurationKeys;)Lkotlin/script/experimental/util/PropertiesCollection$Key;")), Reflection.m32197e(new PropertyReference1Impl(Reflection.m32194b(ScriptCompilationKt.class, "kotlin-scripting-common"), "compilerOptions", "getCompilerOptions(Lkotlin/script/experimental/api/ScriptCompilationConfigurationKeys;)Lkotlin/script/experimental/util/PropertiesCollection$Key;")), Reflection.m32197e(new PropertyReference1Impl(Reflection.m32194b(ScriptCompilationKt.class, "kotlin-scripting-common"), "refineConfigurationBeforeParsing", "getRefineConfigurationBeforeParsing(Lkotlin/script/experimental/api/ScriptCompilationConfigurationKeys;)Lkotlin/script/experimental/util/PropertiesCollection$Key;")), Reflection.m32197e(new PropertyReference1Impl(Reflection.m32194b(ScriptCompilationKt.class, "kotlin-scripting-common"), "refineConfigurationOnAnnotations", "getRefineConfigurationOnAnnotations(Lkotlin/script/experimental/api/ScriptCompilationConfigurationKeys;)Lkotlin/script/experimental/util/PropertiesCollection$Key;")), Reflection.m32197e(new PropertyReference1Impl(Reflection.m32194b(ScriptCompilationKt.class, "kotlin-scripting-common"), "sourceFragments", "getSourceFragments(Lkotlin/script/experimental/api/ScriptCompilationConfigurationKeys;)Lkotlin/script/experimental/util/PropertiesCollection$Key;"))};

    /* renamed from: b */
    @NotNull
    public static final PropertiesCollection.PropertyKeyDelegate f66595b = new PropertiesCollection.PropertyKeyDelegate("Kotlin script");

    /* renamed from: c */
    @NotNull
    public static final PropertiesCollection.PropertyKeyDelegate f66596c = new PropertiesCollection.PropertyKeyDelegate("kts");

    /* renamed from: d */
    @NotNull
    public static final PropertiesCollection.PropertyKeyDelegate f66597d = new PropertiesCollection.PropertyKeyDelegate(null);

    /* renamed from: e */
    @NotNull
    public static final PropertiesCollection.PropertyKeyDelegate f66598e = new PropertiesCollection.PropertyKeyDelegate(null);

    /* renamed from: f */
    @NotNull
    public static final PropertiesCollection.PropertyKeyDelegate f66599f = new PropertiesCollection.PropertyKeyDelegate(null);

    /* renamed from: g */
    @NotNull
    public static final PropertiesCollection.PropertyKeyDelegate f66600g = new PropertiesCollection.PropertyKeyDelegate(null);
}
