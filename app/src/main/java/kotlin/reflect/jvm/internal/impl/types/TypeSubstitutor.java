package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.FilteredAnnotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt;
import kotlin.reflect.jvm.internal.impl.utils.ExceptionUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* loaded from: classes3.dex */
public class TypeSubstitutor {

    /* renamed from: b */
    public static final TypeSubstitutor f66348b = new TypeSubstitutor(TypeSubstitution.f66347a);

    /* renamed from: a */
    @NotNull
    public final TypeSubstitution f66349a;

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor$2 */
    public static /* synthetic */ class C67442 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f66350a;

        static {
            int[] iArr = new int[VarianceConflictType.values().length];
            f66350a = iArr;
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f66350a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f66350a[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final class SubstitutionException extends Exception {
        public SubstitutionException(String str) {
            super(str);
        }
    }

    public enum VarianceConflictType {
        NO_CONFLICT,
        IN_IN_OUT_POSITION,
        OUT_IN_IN_POSITION
    }

    public TypeSubstitutor(@NotNull TypeSubstitution typeSubstitution) {
        this.f66349a = typeSubstitution;
    }

    @NotNull
    /* renamed from: a */
    public static Variance m33682a(@NotNull Variance variance, @NotNull Variance variance2) {
        Variance variance3 = Variance.INVARIANT;
        if (variance == variance3) {
            return variance2;
        }
        if (variance2 == variance3) {
            return variance;
        }
        if (variance == variance2) {
            return variance2;
        }
        throw new AssertionError("Variance conflict: type parameter variance '" + variance + "' and projection kind '" + variance2 + "' cannot be combined");
    }

    /* renamed from: b */
    public static VarianceConflictType m33683b(Variance variance, Variance variance2) {
        Variance variance3 = Variance.IN_VARIANCE;
        return (variance == variance3 && variance2 == Variance.OUT_VARIANCE) ? VarianceConflictType.OUT_IN_IN_POSITION : (variance == Variance.OUT_VARIANCE && variance2 == variance3) ? VarianceConflictType.IN_IN_OUT_POSITION : VarianceConflictType.NO_CONFLICT;
    }

    @NotNull
    /* renamed from: c */
    public static TypeSubstitutor m33684c(@NotNull KotlinType kotlinType) {
        return new TypeSubstitutor(TypeConstructorSubstitution.f66342b.m33677b(kotlinType.mo33515H0(), kotlinType.mo33514G0()));
    }

    @NotNull
    /* renamed from: d */
    public static TypeSubstitutor m33685d(@NotNull TypeSubstitution first, @NotNull TypeSubstitution second) {
        Intrinsics.m32180i(first, "first");
        Intrinsics.m32180i(second, "second");
        if (first.mo33646e()) {
            first = second;
        } else if (!second.mo33646e()) {
            first = new DisjointKeysUnionTypeSubstitution(first, second, null);
        }
        return new TypeSubstitutor(first);
    }

    /* renamed from: g */
    public static String m33686g(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th) {
            if (ExceptionUtilsKt.m33778a(th)) {
                throw th;
            }
            return "[Exception while computing toString(): " + th + "]";
        }
    }

    /* renamed from: e */
    public boolean m33687e() {
        return this.f66349a.mo33646e();
    }

    @NotNull
    /* renamed from: f */
    public KotlinType m33688f(@NotNull KotlinType kotlinType, @NotNull Variance variance) {
        if (m33687e()) {
            return kotlinType;
        }
        try {
            return m33690i(new TypeProjectionImpl(variance, kotlinType), 0).getType();
        } catch (SubstitutionException e2) {
            return ErrorUtils.m33652c(e2.getMessage());
        }
    }

    @Nullable
    /* renamed from: h */
    public KotlinType m33689h(@NotNull KotlinType kotlinType, @NotNull Variance variance) {
        TypeProjection typeProjectionImpl = new TypeProjectionImpl(variance, this.f66349a.mo33647f(kotlinType, variance));
        if (!m33687e()) {
            try {
                typeProjectionImpl = m33690i(typeProjectionImpl, 0);
            } catch (SubstitutionException unused) {
                typeProjectionImpl = null;
            }
        }
        if (this.f66349a.mo33644a() || this.f66349a.mo33520b()) {
            typeProjectionImpl = CapturedTypeApproximationKt.m33756b(typeProjectionImpl, this.f66349a.mo33520b());
        }
        if (typeProjectionImpl == null) {
            return null;
        }
        return typeProjectionImpl.getType();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* renamed from: i */
    public final TypeProjection m33690i(@NotNull TypeProjection typeProjection, int i2) throws SubstitutionException {
        TypeSubstitution typeSubstitution = this.f66349a;
        if (i2 > 100) {
            StringBuilder m24u = C0000a.m24u("Recursion too deep. Most likely infinite loop while substituting ");
            m24u.append(m33686g(typeProjection));
            m24u.append("; substitution: ");
            m24u.append(m33686g(typeSubstitution));
            throw new IllegalStateException(m24u.toString());
        }
        if (typeProjection.mo33672b()) {
            return typeProjection;
        }
        KotlinType type = typeProjection.getType();
        if (type instanceof TypeWithEnhancement) {
            TypeWithEnhancement typeWithEnhancement = (TypeWithEnhancement) type;
            UnwrappedType mo33656z0 = typeWithEnhancement.mo33656z0();
            KotlinType mo33655D = typeWithEnhancement.mo33655D();
            TypeProjection m33690i = m33690i(new TypeProjectionImpl(typeProjection.mo33671a(), mo33656z0), i2 + 1);
            return new TypeProjectionImpl(m33690i.mo33671a(), TypeWithEnhancementKt.m33700c(m33690i.getType().mo33662J0(), m33689h(mo33655D, typeProjection.mo33671a())));
        }
        if (DynamicTypesKt.m33649a(type) || (type.mo33662J0() instanceof RawType)) {
            return typeProjection;
        }
        TypeProjection mo32783d = this.f66349a.mo32783d(type);
        Variance mo33671a = typeProjection.mo33671a();
        r4 = null;
        CustomTypeVariable customTypeVariable = null;
        if (mo32783d == null && (type.mo33662J0() instanceof FlexibleType)) {
            UnwrappedType mo33662J0 = type.mo33662J0();
            boolean z = mo33662J0 instanceof CustomTypeVariable;
            Object obj = mo33662J0;
            if (!z) {
                obj = null;
            }
            CustomTypeVariable customTypeVariable2 = (CustomTypeVariable) obj;
            if (!(customTypeVariable2 != null ? customTypeVariable2.mo32836C() : false)) {
                FlexibleType m33657a = FlexibleTypesKt.m33657a(type);
                int i3 = i2 + 1;
                TypeProjection m33690i2 = m33690i(new TypeProjectionImpl(mo33671a, m33657a.f66316a), i3);
                TypeProjection m33690i3 = m33690i(new TypeProjectionImpl(mo33671a, m33657a.f66317b), i3);
                return (m33690i2.getType() == m33657a.f66316a && m33690i3.getType() == m33657a.f66317b) ? typeProjection : new TypeProjectionImpl(m33690i2.mo33671a(), KotlinTypeFactory.m33663a(TypeSubstitutionKt.m33678a(m33690i2.getType()), TypeSubstitutionKt.m33678a(m33690i3.getType())));
            }
        }
        if (KotlinBuiltIns.m32380H(type) || KotlinTypeKt.m33667a(type)) {
            return typeProjection;
        }
        if (mo32783d != null) {
            VarianceConflictType m33683b = m33683b(mo33671a, mo32783d.mo33671a());
            if (!(type.mo33515H0() instanceof CapturedTypeConstructor)) {
                int ordinal = m33683b.ordinal();
                if (ordinal == 1) {
                    return new TypeProjectionImpl(Variance.OUT_VARIANCE, type.mo33515H0().mo32603n().m32408r());
                }
                if (ordinal == 2) {
                    throw new SubstitutionException("Out-projection in in-position");
                }
            }
            UnwrappedType mo33662J02 = type.mo33662J0();
            boolean z2 = mo33662J02 instanceof CustomTypeVariable;
            Object obj2 = mo33662J02;
            if (!z2) {
                obj2 = null;
            }
            CustomTypeVariable customTypeVariable3 = (CustomTypeVariable) obj2;
            if (customTypeVariable3 != null && customTypeVariable3.mo32836C()) {
                customTypeVariable = customTypeVariable3;
            }
            if (mo32783d.mo33672b()) {
                return mo32783d;
            }
            KotlinType mo32837G = customTypeVariable != null ? customTypeVariable.mo32837G(mo32783d.getType()) : TypeUtils.m33696f(mo32783d.getType(), type.mo32838I0());
            if (!type.getAnnotations().isEmpty()) {
                Annotations mo33645c = this.f66349a.mo33645c(type.getAnnotations());
                if (mo33645c.mo32592R0(KotlinBuiltIns.f63730l.f63747F)) {
                    mo33645c = new FilteredAnnotations(mo33645c, new Function1<FqName, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.1
                        @Override // kotlin.jvm.functions.Function1
                        public Boolean invoke(FqName fqName) {
                            return Boolean.valueOf(!fqName.equals(KotlinBuiltIns.f63730l.f63747F));
                        }
                    });
                }
                mo32837G = TypeUtilsKt.m33753h(mo32837G, new CompositeAnnotations(mo32837G.getAnnotations(), mo33645c));
            }
            if (m33683b == VarianceConflictType.NO_CONFLICT) {
                mo33671a = m33682a(mo33671a, mo32783d.mo33671a());
            }
            return new TypeProjectionImpl(mo33671a, mo32837G);
        }
        KotlinType type2 = typeProjection.getType();
        Variance mo33671a2 = typeProjection.mo33671a();
        if (type2.mo33515H0().mo32449b() instanceof TypeParameterDescriptor) {
            return typeProjection;
        }
        UnwrappedType mo33662J03 = type2.mo33662J0();
        if (!(mo33662J03 instanceof AbbreviatedType)) {
            mo33662J03 = null;
        }
        AbbreviatedType abbreviatedType = (AbbreviatedType) mo33662J03;
        SimpleType simpleType = abbreviatedType != null ? abbreviatedType.f66279b : null;
        KotlinType m33689h = simpleType != null ? m33689h(simpleType, Variance.INVARIANT) : null;
        List<TypeParameterDescriptor> parameters = type2.mo33515H0().getParameters();
        List<TypeProjection> mo33514G0 = type2.mo33514G0();
        ArrayList arrayList = new ArrayList(parameters.size());
        boolean z3 = false;
        for (int i4 = 0; i4 < parameters.size(); i4++) {
            TypeParameterDescriptor typeParameterDescriptor = parameters.get(i4);
            TypeProjection typeProjection2 = mo33514G0.get(i4);
            TypeProjection m33690i4 = m33690i(typeProjection2, i2 + 1);
            int ordinal2 = m33683b(typeParameterDescriptor.mo32500m(), m33690i4.mo33671a()).ordinal();
            if (ordinal2 == 0) {
                Variance mo32500m = typeParameterDescriptor.mo32500m();
                Variance variance = Variance.INVARIANT;
                if (mo32500m != variance && !m33690i4.mo33672b()) {
                    m33690i4 = new TypeProjectionImpl(variance, m33690i4.getType());
                }
            } else if (ordinal2 == 1 || ordinal2 == 2) {
                SimpleType simpleType2 = TypeUtils.f66355a;
                m33690i4 = new StarProjectionImpl(typeParameterDescriptor);
            }
            if (m33690i4 != typeProjection2) {
                z3 = true;
            }
            arrayList.add(m33690i4);
        }
        if (z3) {
            mo33514G0 = arrayList;
        }
        KotlinType m33679b = TypeSubstitutionKt.m33679b(type2, mo33514G0, this.f66349a.mo33645c(type2.getAnnotations()));
        if ((m33679b instanceof SimpleType) && (m33689h instanceof SimpleType)) {
            m33679b = SpecialTypesKt.m33670a((SimpleType) m33679b, (SimpleType) m33689h);
        }
        return new TypeProjectionImpl(mo33671a2, m33679b);
    }
}
