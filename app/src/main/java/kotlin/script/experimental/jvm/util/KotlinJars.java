package kotlin.script.experimental.jvm.util;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.script.templates.standard.ScriptTemplateWithArgs;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: jvmClasspathUtil.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/script/experimental/jvm/util/KotlinJars;", "", "kotlin-scripting-jvm"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class KotlinJars {

    /* renamed from: a */
    public static final /* synthetic */ KProperty[] f66653a = {Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(KotlinJars.class), "explicitCompilerClasspath", "getExplicitCompilerClasspath()Ljava/util/List;")), Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(KotlinJars.class), "compilerClasspath", "getCompilerClasspath()Ljava/util/List;")), Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(KotlinJars.class), "stdlibOrNull", "getStdlibOrNull()Ljava/io/File;")), Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(KotlinJars.class), "stdlib", "getStdlib()Ljava/io/File;")), Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(KotlinJars.class), "scriptRuntimeOrNull", "getScriptRuntimeOrNull()Ljava/io/File;")), Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(KotlinJars.class), "scriptRuntime", "getScriptRuntime()Ljava/io/File;"))};

    /* renamed from: h */
    public static final KotlinJars f66660h = new KotlinJars();

    /* renamed from: b */
    public static final Lazy f66654b = LazyKt.m31881b(new Function0<List<? extends File>>() { // from class: kotlin.script.experimental.jvm.util.KotlinJars$explicitCompilerClasspath$2
        @Override // kotlin.jvm.functions.Function0
        public List<? extends File> invoke() {
            String property = System.getProperty("kotlin.compiler.classpath");
            if (property != null) {
                String str = File.pathSeparator;
                Intrinsics.m32175d(str, "File.pathSeparator");
                List m33893S = StringsKt.m33893S(property, new String[]{str}, false, 0, 6, null);
                ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(m33893S, 10));
                Iterator it = m33893S.iterator();
                while (it.hasNext()) {
                    arrayList.add(new File((String) it.next()));
                }
                return arrayList;
            }
            String property2 = System.getProperty("kotlin.compiler.jar");
            if (property2 == null) {
                return null;
            }
            File file = new File(property2);
            if (!file.exists()) {
                file = null;
            }
            if (file != null) {
                return CollectionsKt.m31993F(file);
            }
            return null;
        }
    });

    /* renamed from: c */
    @NotNull
    public static final Lazy f66655c = LazyKt.m31881b(new Function0<List<? extends File>>() { // from class: kotlin.script.experimental.jvm.util.KotlinJars$compilerClasspath$2
        /* JADX WARN: Code restructure failed: missing block: B:164:0x02a8, code lost:
        
            if (r4 == false) goto L146;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0161, code lost:
        
            if (r11 == false) goto L67;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r9v12, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r9v13, types: [java.lang.Iterable] */
        /* JADX WARN: Type inference failed for: r9v14, types: [java.util.ArrayList] */
        @Override // kotlin.jvm.functions.Function0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.util.List<? extends java.io.File> invoke() {
            /*
                Method dump skipped, instructions count: 691
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.script.experimental.jvm.util.KotlinJars$compilerClasspath$2.invoke():java.lang.Object");
        }
    });

    /* renamed from: d */
    @Nullable
    public static final Lazy f66656d = LazyKt.m31881b(new Function0<File>() { // from class: kotlin.script.experimental.jvm.util.KotlinJars$stdlibOrNull$2
        @Override // kotlin.jvm.functions.Function0
        public File invoke() {
            String property = System.getProperty("kotlin.java.stdlib.jar");
            if (property != null) {
                File file = new File(property);
                if (!file.exists()) {
                    file = null;
                }
                if (file != null) {
                    return file;
                }
            }
            return KotlinJars.f66660h.m33818a("kotlin.java.runtime.jar", "kotlin-stdlib.jar", Reflection.m32193a(JvmStatic.class));
        }
    });

    /* renamed from: e */
    @NotNull
    public static final Lazy f66657e = LazyKt.m31881b(new Function0<File>() { // from class: kotlin.script.experimental.jvm.util.KotlinJars$stdlib$2
        @Override // kotlin.jvm.functions.Function0
        public File invoke() {
            Objects.requireNonNull(KotlinJars.f66660h);
            Lazy lazy = KotlinJars.f66656d;
            KProperty kProperty = KotlinJars.f66653a[2];
            File file = (File) lazy.getValue();
            if (file != null) {
                return file;
            }
            throw new Exception("Unable to find kotlin stdlib, please specify it explicitly via \"kotlin.java.stdlib.jar\" property");
        }
    });

    /* renamed from: f */
    @Nullable
    public static final Lazy f66658f = LazyKt.m31881b(new Function0<File>() { // from class: kotlin.script.experimental.jvm.util.KotlinJars$scriptRuntimeOrNull$2
        @Override // kotlin.jvm.functions.Function0
        public File invoke() {
            return KotlinJars.f66660h.m33818a("kotlin.script.runtime.jar", "kotlin-script-runtime.jar", Reflection.m32193a(ScriptTemplateWithArgs.class));
        }
    });

    /* renamed from: g */
    @NotNull
    public static final Lazy f66659g = LazyKt.m31881b(new Function0<File>() { // from class: kotlin.script.experimental.jvm.util.KotlinJars$scriptRuntime$2
        @Override // kotlin.jvm.functions.Function0
        public File invoke() {
            Objects.requireNonNull(KotlinJars.f66660h);
            Lazy lazy = KotlinJars.f66658f;
            KProperty kProperty = KotlinJars.f66653a[4];
            File file = (File) lazy.getValue();
            if (file != null) {
                return file;
            }
            throw new Exception("Unable to find kotlin script runtime, please specify it explicitly via \"kotlin.script.runtime.jar\" property");
        }
    });

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001c, code lost:
    
        if (r4 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0050, code lost:
    
        if (r4.exists() != false) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0214  */
    @org.jetbrains.annotations.Nullable
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.File m33818a(@org.jetbrains.annotations.NotNull java.lang.String r20, @org.jetbrains.annotations.NotNull java.lang.String r21, @org.jetbrains.annotations.NotNull kotlin.reflect.KClass<?> r22) {
        /*
            Method dump skipped, instructions count: 544
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.script.experimental.jvm.util.KotlinJars.m33818a(java.lang.String, java.lang.String, kotlin.reflect.KClass):java.io.File");
    }
}
