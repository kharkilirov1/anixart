package kotlin.script.experimental.jvm;

import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.script.experimental.util.PropertiesCollection;

/* compiled from: jvmScriptCompilation.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"kotlin-scripting-jvm"}, m31885k = 2, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class JvmScriptCompilationKt {

    /* renamed from: a */
    public static final /* synthetic */ KProperty[] f66643a = {Reflection.m32197e(new PropertyReference1Impl(Reflection.m32194b(JvmScriptCompilationKt.class, "kotlin-scripting-jvm"), "javaHome", "getJavaHome(Lkotlin/script/experimental/jvm/JvmScriptCompilationConfigurationKeys;)Lkotlin/script/experimental/util/PropertiesCollection$Key;"))};

    static {
        KProperty[] kPropertyArr = JvmScriptingHostConfigurationKt.f66644a;
        new JvmScriptingHostConfigurationBuilder();
        new PropertiesCollection.PropertyKeyCopyDelegate(JvmScriptingHostConfigurationKt.f66645b.m33821a(JvmScriptingHostConfigurationKt.f66644a[0]));
    }
}
