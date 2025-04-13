package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: typeEnhancement.kt */
/* loaded from: classes3.dex */
public final class TypeEnhancementKt {

    /* renamed from: a */
    public static final EnhancedTypeAnnotations f64743a;

    /* renamed from: b */
    public static final EnhancedTypeAnnotations f64744b;

    public final /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[MutabilityQualifier.values().length];
            iArr[0] = 1;
            iArr[1] = 2;
            int[] iArr2 = new int[NullabilityQualifier.values().length];
            iArr2[0] = 1;
            iArr2[1] = 2;
        }
    }

    static {
        FqName fqName = JvmAnnotationNames.f64357j;
        Intrinsics.m32175d(fqName, "JvmAnnotationNames.ENHANCED_NULLABILITY_ANNOTATION");
        f64743a = new EnhancedTypeAnnotations(fqName);
        FqName fqName2 = JvmAnnotationNames.f64358k;
        Intrinsics.m32175d(fqName2, "JvmAnnotationNames.ENHANCED_MUTABILITY_ANNOTATION");
        f64744b = new EnhancedTypeAnnotations(fqName2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static final SimpleResult m32861a(@NotNull SimpleType simpleType, Function1<? super Integer, JavaTypeQualifiers> function1, int i2, TypeComponentPosition typeComponentPosition) {
        EnhancementResult m32864d;
        EnhancementResult enhancementResult;
        EnhancementResult m32864d2;
        EnhancementResult enhancementResult2;
        Object m33747b;
        if (!m32865e(typeComponentPosition) && simpleType.mo33514G0().isEmpty()) {
            return new SimpleResult(simpleType, 1, false);
        }
        ClassifierDescriptor mo32449b = simpleType.mo33515H0().mo32449b();
        if (mo32449b == null) {
            return new SimpleResult(simpleType, 1, false);
        }
        JavaTypeQualifiers invoke = function1.invoke(Integer.valueOf(i2));
        if (!m32865e(typeComponentPosition)) {
            m32864d = m32864d(mo32449b);
        } else if (mo32449b instanceof ClassDescriptor) {
            JavaToKotlinClassMap javaToKotlinClassMap = JavaToKotlinClassMap.f63882m;
            MutabilityQualifier mutabilityQualifier = invoke.f64649b;
            if (mutabilityQualifier != null) {
                int ordinal = mutabilityQualifier.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1 && typeComponentPosition == TypeComponentPosition.FLEXIBLE_UPPER) {
                        ClassDescriptor classDescriptor = (ClassDescriptor) mo32449b;
                        if (javaToKotlinClassMap.m32471i(classDescriptor)) {
                            enhancementResult = new EnhancementResult(javaToKotlinClassMap.m32467e(classDescriptor), f64744b);
                            m32864d = enhancementResult;
                        }
                    }
                } else if (typeComponentPosition == TypeComponentPosition.FLEXIBLE_LOWER) {
                    ClassDescriptor classDescriptor2 = (ClassDescriptor) mo32449b;
                    if (javaToKotlinClassMap.m32470h(classDescriptor2)) {
                        enhancementResult = new EnhancementResult(javaToKotlinClassMap.m32468f(classDescriptor2, JavaToKotlinClassMap.f63879j, "mutable"), f64744b);
                        m32864d = enhancementResult;
                    }
                }
            }
            m32864d = m32864d(mo32449b);
        } else {
            m32864d = m32864d(mo32449b);
        }
        ClassifierDescriptor classifierDescriptor = (ClassifierDescriptor) m32864d.f64644a;
        Annotations annotations = m32864d.f64645b;
        TypeConstructor mo32440j = classifierDescriptor.mo32440j();
        Intrinsics.m32175d(mo32440j, "enhancedClassifier.typeConstructor");
        int i3 = i2 + 1;
        boolean z = annotations != null;
        List<TypeProjection> mo33514G0 = simpleType.mo33514G0();
        ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(mo33514G0, 10));
        int i4 = 0;
        for (Object obj : mo33514G0) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                CollectionsKt.m32023h0();
                throw null;
            }
            TypeProjection typeProjection = (TypeProjection) obj;
            if (typeProjection.mo33672b()) {
                i3++;
                TypeConstructor mo32440j2 = classifierDescriptor.mo32440j();
                Intrinsics.m32175d(mo32440j2, "enhancedClassifier.typeConstructor");
                TypeParameterDescriptor typeParameterDescriptor = mo32440j2.getParameters().get(i4);
                SimpleType simpleType2 = TypeUtils.f66355a;
                m33747b = new StarProjectionImpl(typeParameterDescriptor);
            } else {
                Result m32862b = m32862b(typeProjection.getType().mo33662J0(), function1, i3);
                z = z || m32862b.f64704c;
                i3 += m32862b.f64703b;
                KotlinType mo32845a = m32862b.mo32845a();
                Variance mo33671a = typeProjection.mo33671a();
                Intrinsics.m32175d(mo33671a, "arg.projectionKind");
                m33747b = TypeUtilsKt.m33747b(mo32845a, mo33671a, mo32440j.getParameters().get(i4));
            }
            arrayList.add(m33747b);
            i4 = i5;
        }
        if (m32865e(typeComponentPosition)) {
            NullabilityQualifier nullabilityQualifier = invoke.f64648a;
            if (nullabilityQualifier != null) {
                int ordinal2 = nullabilityQualifier.ordinal();
                if (ordinal2 == 0) {
                    enhancementResult2 = new EnhancementResult(Boolean.TRUE, f64743a);
                } else if (ordinal2 == 1) {
                    enhancementResult2 = new EnhancementResult(Boolean.FALSE, f64743a);
                }
                m32864d2 = enhancementResult2;
            }
            m32864d2 = m32864d(Boolean.valueOf(simpleType.mo32838I0()));
        } else {
            m32864d2 = m32864d(Boolean.valueOf(simpleType.mo32838I0()));
        }
        boolean booleanValue = ((Boolean) m32864d2.f64644a).booleanValue();
        Annotations annotations2 = m32864d2.f64645b;
        int i6 = i3 - i2;
        if (!(z || annotations2 != null)) {
            return new SimpleResult(simpleType, i6, false);
        }
        List m32042s = CollectionsKt.m32042s(CollectionsKt.m31994G(simpleType.getAnnotations(), annotations, annotations2));
        int size = ((ArrayList) m32042s).size();
        if (size == 0) {
            throw new IllegalStateException("At least one Annotations object expected".toString());
        }
        SimpleType m33665c = KotlinTypeFactory.m33665c(size != 1 ? new CompositeAnnotations((List<? extends Annotations>) CollectionsKt.m32027j0(m32042s)) : (Annotations) CollectionsKt.m32011X(m32042s), mo32440j, arrayList, booleanValue);
        UnwrappedType unwrappedType = m33665c;
        if (invoke.f64650c) {
            unwrappedType = new NotNullTypeParameter(m33665c);
        }
        if (annotations2 != null && invoke.f64651d) {
            unwrappedType = TypeWithEnhancementKt.m33700c(simpleType, unwrappedType);
        }
        return new SimpleResult((SimpleType) unwrappedType, i6, true);
    }

    /* renamed from: b */
    public static final Result m32862b(@NotNull UnwrappedType unwrappedType, Function1<? super Integer, JavaTypeQualifiers> function1, int i2) {
        boolean z = true;
        if (KotlinTypeKt.m33667a(unwrappedType)) {
            return new Result(unwrappedType, 1, false);
        }
        if (!(unwrappedType instanceof FlexibleType)) {
            if (unwrappedType instanceof SimpleType) {
                return m32861a((SimpleType) unwrappedType, function1, i2, TypeComponentPosition.INFLEXIBLE);
            }
            throw new NoWhenBranchMatchedException();
        }
        FlexibleType flexibleType = (FlexibleType) unwrappedType;
        SimpleResult m32861a = m32861a(flexibleType.f66316a, function1, i2, TypeComponentPosition.FLEXIBLE_LOWER);
        SimpleResult m32861a2 = m32861a(flexibleType.f66317b, function1, i2, TypeComponentPosition.FLEXIBLE_UPPER);
        if (!m32861a.f64704c && !m32861a2.f64704c) {
            z = false;
        }
        KotlinType m33698a = TypeWithEnhancementKt.m33698a(m32861a.f64735d);
        if (m33698a == null) {
            m33698a = TypeWithEnhancementKt.m33698a(m32861a2.f64735d);
        }
        if (z) {
            unwrappedType = TypeWithEnhancementKt.m33700c(unwrappedType instanceof RawTypeImpl ? new RawTypeImpl(m32861a.f64735d, m32861a2.f64735d) : KotlinTypeFactory.m33663a(m32861a.f64735d, m32861a2.f64735d), m33698a);
        }
        return new Result(unwrappedType, m32861a.f64703b, z);
    }

    /* renamed from: c */
    public static final boolean m32863c(@NotNull KotlinType kotlinType) {
        Annotations annotations = kotlinType.getAnnotations();
        FqName fqName = JvmAnnotationNames.f64357j;
        Intrinsics.m32175d(fqName, "JvmAnnotationNames.ENHANCED_NULLABILITY_ANNOTATION");
        return annotations.mo32593h(fqName) != null;
    }

    /* renamed from: d */
    public static final <T> EnhancementResult<T> m32864d(T t) {
        return new EnhancementResult<>(t, null);
    }

    /* renamed from: e */
    public static final boolean m32865e(@NotNull TypeComponentPosition typeComponentPosition) {
        return typeComponentPosition != TypeComponentPosition.INFLEXIBLE;
    }
}
