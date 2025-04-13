package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.checker.NewTypeVariableConstructor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public class TypeUtils {

    /* renamed from: a */
    public static final SimpleType f66355a = new ErrorType(new ErrorUtils.C67422(ErrorUtils.f66307b, "DONT_CARE"), ErrorUtils.m33650a("DONT_CARE"), EmptyList.f63144b, false);

    /* renamed from: b */
    public static final SimpleType f66356b = ErrorUtils.m33652c("Cannot be inferred");

    /* renamed from: c */
    @NotNull
    public static final SimpleType f66357c = new SpecialType("NO_EXPECTED_TYPE");

    /* renamed from: d */
    public static final SimpleType f66358d = new SpecialType("UNIT_EXPECTED_TYPE");

    public static class SpecialType extends DelegatingSimpleType {

        /* renamed from: a */
        public final String f66359a;

        public SpecialType(String str) {
            this.f66359a = str;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType
        /* renamed from: K0 */
        public /* bridge */ /* synthetic */ UnwrappedType mo32787K0(boolean z) {
            mo32787K0(z);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
        /* renamed from: L0 */
        public /* bridge */ /* synthetic */ UnwrappedType mo32788L0(Annotations annotations) {
            mo32788L0(annotations);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
        @NotNull
        /* renamed from: M0 */
        public SimpleType mo32787K0(boolean z) {
            throw new IllegalStateException(this.f66359a);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
        @NotNull
        /* renamed from: N0 */
        public SimpleType mo32788L0(@NotNull Annotations annotations) {
            throw new IllegalStateException(this.f66359a);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
        @NotNull
        /* renamed from: O0 */
        public SimpleType mo32841O0() {
            throw new IllegalStateException(this.f66359a);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
        @NotNull
        public String toString() {
            return this.f66359a;
        }
    }

    /* renamed from: a */
    public static boolean m33691a(@NotNull KotlinType kotlinType) {
        if (kotlinType.mo32838I0()) {
            return true;
        }
        return (kotlinType.mo33662J0() instanceof FlexibleType) && m33691a(FlexibleTypesKt.m33657a(kotlinType).f66317b);
    }

    /* renamed from: b */
    public static boolean m33692b(@Nullable KotlinType kotlinType, @NotNull Function1<UnwrappedType, Boolean> function1) {
        if (kotlinType == null) {
            return false;
        }
        UnwrappedType mo33662J0 = kotlinType.mo33662J0();
        if (function1.invoke(mo33662J0).booleanValue()) {
            return true;
        }
        FlexibleType flexibleType = mo33662J0 instanceof FlexibleType ? (FlexibleType) mo33662J0 : null;
        if (flexibleType != null && (m33692b(flexibleType.f66316a, function1) || m33692b(flexibleType.f66317b, function1))) {
            return true;
        }
        if ((mo33662J0 instanceof DefinitelyNotNullType) && m33692b(((DefinitelyNotNullType) mo33662J0).f66296a, function1)) {
            return true;
        }
        TypeConstructor mo33515H0 = kotlinType.mo33515H0();
        if (mo33515H0 instanceof IntersectionTypeConstructor) {
            Iterator<KotlinType> it = ((IntersectionTypeConstructor) mo33515H0).f66323a.iterator();
            while (it.hasNext()) {
                if (m33692b(it.next(), function1)) {
                    return true;
                }
            }
            return false;
        }
        for (TypeProjection typeProjection : kotlinType.mo33514G0()) {
            if (!typeProjection.mo33672b()) {
                if (m33692b(typeProjection.getType(), function1)) {
                    return true;
                }
            }
        }
        return false;
    }

    @NotNull
    /* renamed from: c */
    public static List<TypeProjection> m33693c(@NotNull List<TypeParameterDescriptor> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<TypeParameterDescriptor> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new TypeProjectionImpl(Variance.INVARIANT, it.next().mo32502r()));
        }
        return CollectionsKt.m32027j0(arrayList);
    }

    /* renamed from: d */
    public static boolean m33694d(@NotNull KotlinType kotlinType) {
        if (kotlinType.mo32838I0()) {
            return true;
        }
        if ((kotlinType.mo33662J0() instanceof FlexibleType) && m33694d(FlexibleTypesKt.m33657a(kotlinType).f66317b)) {
            return true;
        }
        if (!m33695e(kotlinType)) {
            TypeConstructor mo33515H0 = kotlinType.mo33515H0();
            if (mo33515H0 instanceof IntersectionTypeConstructor) {
                Iterator<KotlinType> it = mo33515H0.mo32602a().iterator();
                while (it.hasNext()) {
                    if (m33694d(it.next())) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (!(kotlinType.mo33515H0().mo32449b() instanceof ClassDescriptor)) {
            TypeSubstitutor m33684c = TypeSubstitutor.m33684c(kotlinType);
            Collection<KotlinType> mo32602a = kotlinType.mo33515H0().mo32602a();
            ArrayList arrayList = new ArrayList(mo32602a.size());
            Iterator<KotlinType> it2 = mo32602a.iterator();
            while (it2.hasNext()) {
                KotlinType m33689h = m33684c.m33689h(it2.next(), Variance.INVARIANT);
                KotlinType m33696f = m33689h != null ? m33696f(m33689h, kotlinType.mo32838I0()) : null;
                if (m33696f != null) {
                    arrayList.add(m33696f);
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                if (m33694d((KotlinType) it3.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m33695e(@NotNull KotlinType kotlinType) {
        return (kotlinType.mo33515H0().mo32449b() instanceof TypeParameterDescriptor ? (TypeParameterDescriptor) kotlinType.mo33515H0().mo32449b() : null) != null || (kotlinType.mo33515H0() instanceof NewTypeVariableConstructor);
    }

    @NotNull
    /* renamed from: f */
    public static KotlinType m33696f(@NotNull KotlinType kotlinType, boolean z) {
        return z ? kotlinType.mo33662J0().mo32787K0(true) : kotlinType;
    }

    @NotNull
    /* renamed from: g */
    public static SimpleType m33697g(ClassifierDescriptor classifierDescriptor, MemberScope memberScope) {
        if (!ErrorUtils.m33654e(classifierDescriptor)) {
            TypeConstructor mo32440j = classifierDescriptor.mo32440j();
            return KotlinTypeFactory.m33666d(Annotations.Companion.f64024a, mo32440j, m33693c(mo32440j.getParameters()), false, memberScope);
        }
        return ErrorUtils.m33652c("Unsubstituted type for " + classifierDescriptor);
    }
}
