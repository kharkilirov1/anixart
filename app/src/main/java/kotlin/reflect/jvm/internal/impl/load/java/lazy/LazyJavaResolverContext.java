package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: context.kt */
/* loaded from: classes3.dex */
public final class LazyJavaResolverContext {

    /* renamed from: f */
    public static final /* synthetic */ KProperty[] f64476f = {Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(LazyJavaResolverContext.class), "defaultTypeQualifiers", "getDefaultTypeQualifiers()Lorg/jetbrains/kotlin/load/java/lazy/JavaTypeQualifiersByElementType;"))};

    /* renamed from: a */
    @Nullable
    public final Lazy f64477a;

    /* renamed from: b */
    @NotNull
    public final JavaTypeResolver f64478b;

    /* renamed from: c */
    @NotNull
    public final JavaResolverComponents f64479c;

    /* renamed from: d */
    @NotNull
    public final TypeParameterResolver f64480d;

    /* renamed from: e */
    @NotNull
    public final Lazy<JavaTypeQualifiersByElementType> f64481e;

    public LazyJavaResolverContext(@NotNull JavaResolverComponents components, @NotNull TypeParameterResolver typeParameterResolver, @NotNull Lazy<JavaTypeQualifiersByElementType> delegateForDefaultTypeQualifiers) {
        Intrinsics.m32180i(components, "components");
        Intrinsics.m32180i(typeParameterResolver, "typeParameterResolver");
        Intrinsics.m32180i(delegateForDefaultTypeQualifiers, "delegateForDefaultTypeQualifiers");
        this.f64479c = components;
        this.f64480d = typeParameterResolver;
        this.f64481e = delegateForDefaultTypeQualifiers;
        this.f64477a = delegateForDefaultTypeQualifiers;
        this.f64478b = new JavaTypeResolver(this, typeParameterResolver);
    }

    @Nullable
    /* renamed from: a */
    public final JavaTypeQualifiersByElementType m32724a() {
        Lazy lazy = this.f64477a;
        KProperty kProperty = f64476f[0];
        return (JavaTypeQualifiersByElementType) lazy.getValue();
    }
}
