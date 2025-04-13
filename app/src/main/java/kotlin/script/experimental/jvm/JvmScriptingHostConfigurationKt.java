package kotlin.script.experimental.jvm;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.script.experimental.util.PropertiesCollection;
import org.jetbrains.annotations.NotNull;

/* compiled from: jvmScriptingHostConfiguration.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"kotlin-scripting-jvm"}, m31885k = 2, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class JvmScriptingHostConfigurationKt {

    /* renamed from: a */
    public static final /* synthetic */ KProperty[] f66644a = {Reflection.m32197e(new PropertyReference1Impl(Reflection.m32194b(JvmScriptingHostConfigurationKt.class, "kotlin-scripting-jvm"), "javaHome", "getJavaHome(Lkotlin/script/experimental/jvm/JvmScriptingHostConfigurationKeys;)Lkotlin/script/experimental/util/PropertiesCollection$Key;"))};

    /* renamed from: b */
    @NotNull
    public static final PropertiesCollection.PropertyKeyDelegate f66645b = new PropertiesCollection.PropertyKeyDelegate(new File(System.getProperty("java.home")));
}
