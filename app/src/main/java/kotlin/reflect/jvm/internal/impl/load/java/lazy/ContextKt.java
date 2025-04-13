package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassOrPackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner;
import org.jetbrains.annotations.NotNull;

/* compiled from: context.kt */
/* loaded from: classes3.dex */
public final class ContextKt {
    @NotNull
    /* renamed from: a */
    public static LazyJavaResolverContext m32716a(final LazyJavaResolverContext lazyJavaResolverContext, final ClassOrPackageFragmentDescriptor classOrPackageFragmentDescriptor, JavaTypeParameterListOwner javaTypeParameterListOwner, int i2, int i3) {
        if ((i3 & 2) != 0) {
            javaTypeParameterListOwner = null;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return new LazyJavaResolverContext(lazyJavaResolverContext.f64479c, javaTypeParameterListOwner != null ? new LazyJavaTypeParameterResolver(lazyJavaResolverContext, classOrPackageFragmentDescriptor, javaTypeParameterListOwner, i2) : lazyJavaResolverContext.f64480d, LazyKt.m31880a(LazyThreadSafetyMode.NONE, new Function0<JavaTypeQualifiersByElementType>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt$childForClassOrPackage$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public JavaTypeQualifiersByElementType invoke() {
                return ContextKt.m32718c(LazyJavaResolverContext.this, classOrPackageFragmentDescriptor.getAnnotations());
            }
        }));
    }

    @NotNull
    /* renamed from: b */
    public static final LazyJavaResolverContext m32717b(@NotNull LazyJavaResolverContext receiver$0, @NotNull DeclarationDescriptor containingDeclaration, @NotNull JavaTypeParameterListOwner typeParameterOwner, int i2) {
        Intrinsics.m32180i(receiver$0, "receiver$0");
        Intrinsics.m32180i(containingDeclaration, "containingDeclaration");
        Intrinsics.m32180i(typeParameterOwner, "typeParameterOwner");
        return new LazyJavaResolverContext(receiver$0.f64479c, new LazyJavaTypeParameterResolver(receiver$0, containingDeclaration, typeParameterOwner, i2), receiver$0.f64481e);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01a3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0024 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0171 A[SYNTHETIC] */
    @org.jetbrains.annotations.Nullable
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaTypeQualifiersByElementType m32718c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext r17, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r18) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt.m32718c(kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations):kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaTypeQualifiersByElementType");
    }

    @NotNull
    /* renamed from: d */
    public static final LazyJavaResolverContext m32719d(@NotNull final LazyJavaResolverContext receiver$0, @NotNull final Annotations additionalAnnotations) {
        Intrinsics.m32180i(receiver$0, "receiver$0");
        Intrinsics.m32180i(additionalAnnotations, "additionalAnnotations");
        return additionalAnnotations.isEmpty() ? receiver$0 : new LazyJavaResolverContext(receiver$0.f64479c, receiver$0.f64480d, LazyKt.m31880a(LazyThreadSafetyMode.NONE, new Function0<JavaTypeQualifiersByElementType>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt$copyWithNewDefaultTypeQualifiers$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public JavaTypeQualifiersByElementType invoke() {
                return ContextKt.m32718c(LazyJavaResolverContext.this, additionalAnnotations);
            }
        }));
    }
}
