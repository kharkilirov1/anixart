package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import java.util.List;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImplKt;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: JavaTypeResolver.kt */
/* loaded from: classes3.dex */
public final class JavaTypeResolverKt {

    /* renamed from: a */
    public static final FqName f64630a = new FqName("java.lang.Class");

    @NotNull
    /* renamed from: a */
    public static final KotlinType m32780a(@NotNull TypeParameterDescriptor receiver$0, @Nullable TypeParameterDescriptor typeParameterDescriptor, @NotNull Function0<? extends KotlinType> defaultValue) {
        Intrinsics.m32180i(receiver$0, "receiver$0");
        Intrinsics.m32180i(defaultValue, "defaultValue");
        if (receiver$0 == typeParameterDescriptor) {
            return defaultValue.invoke();
        }
        List<KotlinType> upperBounds = receiver$0.getUpperBounds();
        Intrinsics.m32175d(upperBounds, "upperBounds");
        KotlinType kotlinType = (KotlinType) CollectionsKt.m32044u(upperBounds);
        if (kotlinType.mo33515H0().mo32449b() instanceof ClassDescriptor) {
            return TypeUtilsKt.m33754i(kotlinType);
        }
        if (typeParameterDescriptor != null) {
            receiver$0 = typeParameterDescriptor;
        }
        ClassifierDescriptor mo32449b = kotlinType.mo33515H0().mo32449b();
        if (mo32449b == null) {
            throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
        }
        do {
            TypeParameterDescriptor typeParameterDescriptor2 = (TypeParameterDescriptor) mo32449b;
            if (!(!Intrinsics.m32174c(typeParameterDescriptor2, receiver$0))) {
                return defaultValue.invoke();
            }
            List<KotlinType> upperBounds2 = typeParameterDescriptor2.getUpperBounds();
            Intrinsics.m32175d(upperBounds2, "current.upperBounds");
            KotlinType kotlinType2 = (KotlinType) CollectionsKt.m32044u(upperBounds2);
            if (kotlinType2.mo33515H0().mo32449b() instanceof ClassDescriptor) {
                return TypeUtilsKt.m33754i(kotlinType2);
            }
            mo32449b = kotlinType2.mo33515H0().mo32449b();
        } while (mo32449b != null);
        throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
    }

    @NotNull
    /* renamed from: b */
    public static final TypeProjection m32781b(@NotNull TypeParameterDescriptor typeParameter, @NotNull JavaTypeAttributes attr) {
        Intrinsics.m32180i(typeParameter, "typeParameter");
        Intrinsics.m32180i(attr, "attr");
        if (attr.f64614a != TypeUsage.SUPERTYPE) {
            return new StarProjectionImpl(typeParameter);
        }
        return new TypeProjectionImpl(Variance.INVARIANT, StarProjectionImplKt.m33673a(typeParameter));
    }

    @NotNull
    /* renamed from: c */
    public static JavaTypeAttributes m32782c(TypeUsage typeUsage, boolean z, TypeParameterDescriptor typeParameterDescriptor, int i2) {
        boolean z2 = (i2 & 1) != 0 ? false : z;
        if ((i2 & 2) != 0) {
            typeParameterDescriptor = null;
        }
        return new JavaTypeAttributes(typeUsage, null, z2, typeParameterDescriptor, 2);
    }
}
