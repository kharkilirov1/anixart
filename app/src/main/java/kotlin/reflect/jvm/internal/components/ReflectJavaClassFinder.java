package kotlin.reflect.jvm.internal.components;

import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.structure.ReflectJavaClass;
import kotlin.reflect.jvm.internal.structure.ReflectJavaPackage;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: ReflectJavaClassFinder.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/reflect/jvm/internal/components/ReflectJavaClassFinder;", "Lkotlin/reflect/jvm/internal/impl/load/java/JavaClassFinder;", "descriptors.runtime"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class ReflectJavaClassFinder implements JavaClassFinder {

    /* renamed from: a */
    public final ClassLoader f63695a;

    public ReflectJavaClassFinder(@NotNull ClassLoader classLoader) {
        this.f63695a = classLoader;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder
    @Nullable
    /* renamed from: a */
    public JavaClass mo32344a(@NotNull ClassId classId) {
        FqName fqName = classId.f65593a;
        Intrinsics.m32175d(fqName, "classId.packageFqName");
        String str = classId.f65594b.f65597a.f65602a;
        Intrinsics.m32175d(str, "classId.relativeClassName.asString()");
        String m33890P = StringsKt.m33890P(str, '.', '$', false, 4, null);
        if (!fqName.m33197b()) {
            m33890P = C0000a.m21r(new StringBuilder(), fqName.f65597a.f65602a, ".", m33890P);
        }
        Class<?> m32347a = ReflectJavaClassFinderKt.m32347a(this.f63695a, m33890P);
        if (m32347a != null) {
            return new ReflectJavaClass(m32347a);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder
    @Nullable
    /* renamed from: b */
    public JavaPackage mo32345b(@NotNull FqName fqName) {
        Intrinsics.m32180i(fqName, "fqName");
        return new ReflectJavaPackage(fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder
    @Nullable
    /* renamed from: c */
    public Set<String> mo32346c(@NotNull FqName packageFqName) {
        Intrinsics.m32180i(packageFqName, "packageFqName");
        return null;
    }
}
