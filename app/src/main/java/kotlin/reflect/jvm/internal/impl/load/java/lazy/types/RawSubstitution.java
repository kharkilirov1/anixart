package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* compiled from: RawType.kt */
/* loaded from: classes3.dex */
public final class RawSubstitution extends TypeSubstitution {

    /* renamed from: b */
    public static final JavaTypeAttributes f64632b;

    /* renamed from: c */
    public static final JavaTypeAttributes f64633c;

    /* renamed from: d */
    public static final RawSubstitution f64634d = new RawSubstitution();

    public final /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[JavaTypeFlexibility.values().length];
            iArr[2] = 1;
            iArr[1] = 2;
            iArr[0] = 3;
        }
    }

    static {
        TypeUsage typeUsage = TypeUsage.COMMON;
        f64632b = JavaTypeResolverKt.m32782c(typeUsage, false, null, 3).m32773a(JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND);
        f64633c = JavaTypeResolverKt.m32782c(typeUsage, false, null, 3).m32773a(JavaTypeFlexibility.FLEXIBLE_UPPER_BOUND);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    /* renamed from: d */
    public TypeProjection mo32783d(KotlinType kotlinType) {
        return new TypeProjectionImpl(Variance.INVARIANT, m32786i(kotlinType));
    }

    @NotNull
    /* renamed from: g */
    public final TypeProjection m32784g(@NotNull TypeParameterDescriptor parameter, @NotNull JavaTypeAttributes attr, @NotNull KotlinType erasedUpperBound) {
        Intrinsics.m32180i(parameter, "parameter");
        Intrinsics.m32180i(attr, "attr");
        Intrinsics.m32180i(erasedUpperBound, "erasedUpperBound");
        int ordinal = attr.f64615b.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal == 2) {
                return new TypeProjectionImpl(Variance.INVARIANT, erasedUpperBound);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!parameter.mo32500m().f66366c) {
            return new TypeProjectionImpl(Variance.INVARIANT, DescriptorUtilsKt.m33534g(parameter).m32407q());
        }
        List<TypeParameterDescriptor> parameters = erasedUpperBound.mo33515H0().getParameters();
        Intrinsics.m32175d(parameters, "erasedUpperBound.constructor.parameters");
        return parameters.isEmpty() ^ true ? new TypeProjectionImpl(Variance.OUT_VARIANCE, erasedUpperBound) : JavaTypeResolverKt.m32781b(parameter, attr);
    }

    /* renamed from: h */
    public final Pair<SimpleType, Boolean> m32785h(SimpleType simpleType, ClassDescriptor classDescriptor, JavaTypeAttributes javaTypeAttributes) {
        if (simpleType.mo33515H0().getParameters().isEmpty()) {
            return new Pair<>(simpleType, Boolean.FALSE);
        }
        if (KotlinBuiltIns.m32375C(simpleType)) {
            TypeProjection typeProjection = simpleType.mo33514G0().get(0);
            Variance mo33671a = typeProjection.mo33671a();
            KotlinType type = typeProjection.getType();
            Intrinsics.m32175d(type, "componentTypeProjection.type");
            return new Pair<>(KotlinTypeFactory.m33665c(simpleType.getAnnotations(), simpleType.mo33515H0(), CollectionsKt.m31993F(new TypeProjectionImpl(mo33671a, m32786i(type))), simpleType.mo32838I0()), Boolean.FALSE);
        }
        if (KotlinTypeKt.m33667a(simpleType)) {
            StringBuilder m24u = C0000a.m24u("Raw error type: ");
            m24u.append(simpleType.mo33515H0());
            return new Pair<>(ErrorUtils.m33652c(m24u.toString()), Boolean.FALSE);
        }
        Annotations annotations = simpleType.getAnnotations();
        TypeConstructor mo33515H0 = simpleType.mo33515H0();
        List<TypeParameterDescriptor> parameters = simpleType.mo33515H0().getParameters();
        Intrinsics.m32175d(parameters, "type.constructor.parameters");
        ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(parameters, 10));
        for (TypeParameterDescriptor parameter : parameters) {
            RawSubstitution rawSubstitution = f64634d;
            Intrinsics.m32175d(parameter, "parameter");
            FqName fqName = JavaTypeResolverKt.f64630a;
            arrayList.add(rawSubstitution.m32784g(parameter, javaTypeAttributes, JavaTypeResolverKt.m32780a(parameter, null, new JavaTypeResolverKt$getErasedUpperBound$1(parameter))));
        }
        boolean mo32838I0 = simpleType.mo32838I0();
        MemberScope mo32505a0 = classDescriptor.mo32505a0(f64634d);
        Intrinsics.m32175d(mo32505a0, "declaration.getMemberScope(RawSubstitution)");
        return new Pair<>(KotlinTypeFactory.m33666d(annotations, mo33515H0, arrayList, mo32838I0, mo32505a0), Boolean.TRUE);
    }

    /* renamed from: i */
    public final KotlinType m32786i(KotlinType kotlinType) {
        ClassifierDescriptor mo32449b = kotlinType.mo33515H0().mo32449b();
        if (mo32449b instanceof TypeParameterDescriptor) {
            TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) mo32449b;
            FqName fqName = JavaTypeResolverKt.f64630a;
            return m32786i(JavaTypeResolverKt.m32780a(typeParameterDescriptor, null, new JavaTypeResolverKt$getErasedUpperBound$1(typeParameterDescriptor)));
        }
        if (!(mo32449b instanceof ClassDescriptor)) {
            throw new IllegalStateException(("Unexpected declaration kind: " + mo32449b).toString());
        }
        ClassDescriptor classDescriptor = (ClassDescriptor) mo32449b;
        Pair<SimpleType, Boolean> m32785h = m32785h(FlexibleTypesKt.m33659c(kotlinType), classDescriptor, f64632b);
        SimpleType simpleType = m32785h.f63055b;
        boolean booleanValue = m32785h.f63056c.booleanValue();
        Pair<SimpleType, Boolean> m32785h2 = m32785h(FlexibleTypesKt.m33660d(kotlinType), classDescriptor, f64633c);
        SimpleType simpleType2 = m32785h2.f63055b;
        return (booleanValue || m32785h2.f63056c.booleanValue()) ? new RawTypeImpl(simpleType, simpleType2) : KotlinTypeFactory.m33663a(simpleType, simpleType2);
    }
}
