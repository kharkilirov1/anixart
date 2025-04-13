package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CapturedTypeApproximation.kt */
/* loaded from: classes3.dex */
public final class CapturedTypeApproximationKt {

    public final /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[Variance.values().length];
            iArr[Variance.INVARIANT.ordinal()] = 1;
            iArr[Variance.IN_VARIANCE.ordinal()] = 2;
            iArr[Variance.OUT_VARIANCE.ordinal()] = 3;
            int[] iArr2 = new int[Variance.values().length];
            iArr2[1] = 1;
            iArr2[2] = 2;
        }
    }

    /* JADX WARN: Type inference failed for: r1v18, types: [kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt$approximateCapturedTypes$1] */
    @NotNull
    /* renamed from: a */
    public static final ApproximationBounds<KotlinType> m33755a(@NotNull final KotlinType type) {
        Object m33757c;
        TypeArgument typeArgument;
        Intrinsics.m32180i(type, "type");
        if (type.mo33662J0() instanceof FlexibleType) {
            ApproximationBounds<KotlinType> m33755a = m33755a(FlexibleTypesKt.m33659c(type));
            ApproximationBounds<KotlinType> m33755a2 = m33755a(FlexibleTypesKt.m33660d(type));
            return new ApproximationBounds<>(TypeWithEnhancementKt.m33699b(KotlinTypeFactory.m33663a(FlexibleTypesKt.m33659c(m33755a.f66412a), FlexibleTypesKt.m33660d(m33755a2.f66412a)), type), TypeWithEnhancementKt.m33699b(KotlinTypeFactory.m33663a(FlexibleTypesKt.m33659c(m33755a.f66413b), FlexibleTypesKt.m33660d(m33755a2.f66413b)), type));
        }
        TypeConstructor mo33515H0 = type.mo33515H0();
        boolean z = true;
        if (type.mo33515H0() instanceof CapturedTypeConstructor) {
            if (mo33515H0 == null) {
                throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor");
            }
            TypeProjection typeProjection = ((CapturedTypeConstructor) mo33515H0).f65917b;
            ?? r1 = new Function1<KotlinType, KotlinType>() { // from class: kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt$approximateCapturedTypes$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final KotlinType invoke(@NotNull KotlinType receiver$0) {
                    Intrinsics.m32180i(receiver$0, "receiver$0");
                    KotlinType m33696f = TypeUtils.m33696f(receiver$0, KotlinType.this.mo32838I0());
                    Intrinsics.m32175d(m33696f, "TypeUtils.makeNullableIf…s, type.isMarkedNullable)");
                    return m33696f;
                }
            };
            KotlinType type2 = typeProjection.getType();
            Intrinsics.m32175d(type2, "typeProjection.type");
            KotlinType invoke = r1.invoke(type2);
            int ordinal = typeProjection.mo33671a().ordinal();
            if (ordinal == 1) {
                SimpleType m32408r = TypeUtilsKt.m33748c(type).m32408r();
                Intrinsics.m32175d(m32408r, "type.builtIns.nullableAnyType");
                return new ApproximationBounds<>(invoke, m32408r);
            }
            if (ordinal == 2) {
                SimpleType m32407q = TypeUtilsKt.m33748c(type).m32407q();
                Intrinsics.m32175d(m32407q, "type.builtIns.nothingType");
                return new ApproximationBounds<>(r1.invoke(m32407q), invoke);
            }
            throw new AssertionError("Only nontrivial projections should have been captured, not: " + typeProjection);
        }
        if (type.mo33514G0().isEmpty() || type.mo33514G0().size() != mo33515H0.getParameters().size()) {
            return new ApproximationBounds<>(type, type);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<TypeProjection> mo33514G0 = type.mo33514G0();
        List<TypeParameterDescriptor> parameters = mo33515H0.getParameters();
        Intrinsics.m32175d(parameters, "typeConstructor.parameters");
        Iterator it = ((ArrayList) CollectionsKt.m32039p0(mo33514G0, parameters)).iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            TypeProjection typeProjection2 = (TypeProjection) pair.f63055b;
            TypeParameterDescriptor typeParameter = (TypeParameterDescriptor) pair.f63056c;
            Intrinsics.m32175d(typeParameter, "typeParameter");
            Variance mo32500m = typeParameter.mo32500m();
            TypeSubstitutor typeSubstitutor = TypeSubstitutor.f66348b;
            int ordinal2 = (typeProjection2.mo33672b() ? Variance.OUT_VARIANCE : TypeSubstitutor.m33682a(mo32500m, typeProjection2.mo33671a())).ordinal();
            if (ordinal2 == 0) {
                KotlinType type3 = typeProjection2.getType();
                Intrinsics.m32175d(type3, "type");
                KotlinType type4 = typeProjection2.getType();
                Intrinsics.m32175d(type4, "type");
                typeArgument = new TypeArgument(typeParameter, type3, type4);
            } else if (ordinal2 == 1) {
                KotlinType type5 = typeProjection2.getType();
                Intrinsics.m32175d(type5, "type");
                SimpleType m32408r2 = DescriptorUtilsKt.m33534g(typeParameter).m32408r();
                Intrinsics.m32175d(m32408r2, "typeParameter.builtIns.nullableAnyType");
                typeArgument = new TypeArgument(typeParameter, type5, m32408r2);
            } else {
                if (ordinal2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                SimpleType m32407q2 = DescriptorUtilsKt.m33534g(typeParameter).m32407q();
                Intrinsics.m32175d(m32407q2, "typeParameter.builtIns.nothingType");
                KotlinType type6 = typeProjection2.getType();
                Intrinsics.m32175d(type6, "type");
                typeArgument = new TypeArgument(typeParameter, m32407q2, type6);
            }
            if (typeProjection2.mo33672b()) {
                arrayList.add(typeArgument);
                arrayList2.add(typeArgument);
            } else {
                ApproximationBounds<KotlinType> m33755a3 = m33755a(typeArgument.f66418b);
                KotlinType kotlinType = m33755a3.f66412a;
                KotlinType kotlinType2 = m33755a3.f66413b;
                ApproximationBounds<KotlinType> m33755a4 = m33755a(typeArgument.f66419c);
                KotlinType kotlinType3 = m33755a4.f66412a;
                KotlinType kotlinType4 = m33755a4.f66413b;
                TypeArgument typeArgument2 = new TypeArgument(typeArgument.f66417a, kotlinType2, kotlinType3);
                TypeArgument typeArgument3 = new TypeArgument(typeArgument.f66417a, kotlinType, kotlinType4);
                arrayList.add(typeArgument2);
                arrayList2.add(typeArgument3);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Objects.requireNonNull((TypeArgument) it2.next());
                if (!NewKotlinTypeChecker.f66379b.m33713h(r1.f66418b, r1.f66419c)) {
                    break;
                }
            }
        }
        z = false;
        if (z) {
            m33757c = TypeUtilsKt.m33748c(type).m32407q();
            Intrinsics.m32175d(m33757c, "type.builtIns.nothingType");
        } else {
            m33757c = m33757c(type, arrayList);
        }
        return new ApproximationBounds<>(m33757c, m33757c(type, arrayList2));
    }

    @Nullable
    /* renamed from: b */
    public static final TypeProjection m33756b(@Nullable TypeProjection typeProjection, boolean z) {
        if (typeProjection == null) {
            return null;
        }
        if (typeProjection.mo33672b()) {
            return typeProjection;
        }
        KotlinType type = typeProjection.getType();
        Intrinsics.m32175d(type, "typeProjection.type");
        if (!TypeUtils.m33692b(type, new Function1<UnwrappedType, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt$approximateCapturedTypesIfNecessary$1
            @Override // kotlin.jvm.functions.Function1
            public Boolean invoke(UnwrappedType unwrappedType) {
                UnwrappedType it = unwrappedType;
                Intrinsics.m32175d(it, "it");
                return Boolean.valueOf(it.mo33515H0() instanceof CapturedTypeConstructor);
            }
        })) {
            return typeProjection;
        }
        Variance mo33671a = typeProjection.mo33671a();
        Intrinsics.m32175d(mo33671a, "typeProjection.projectionKind");
        if (mo33671a == Variance.OUT_VARIANCE) {
            return new TypeProjectionImpl(mo33671a, m33755a(type).f66413b);
        }
        if (z) {
            return new TypeProjectionImpl(mo33671a, m33755a(type).f66412a);
        }
        TypeSubstitutor typeSubstitutor = new TypeSubstitutor(new TypeConstructorSubstitution() { // from class: kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt$substituteCapturedTypesWithProjections$typeSubstitutor$1
            @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution
            @Nullable
            /* renamed from: g */
            public TypeProjection mo33674g(@NotNull TypeConstructor key) {
                Intrinsics.m32180i(key, "key");
                if (!(key instanceof CapturedTypeConstructor)) {
                    key = null;
                }
                CapturedTypeConstructor capturedTypeConstructor = (CapturedTypeConstructor) key;
                if (capturedTypeConstructor != null) {
                    return capturedTypeConstructor.f65917b.mo33672b() ? new TypeProjectionImpl(Variance.OUT_VARIANCE, capturedTypeConstructor.f65917b.getType()) : capturedTypeConstructor.f65917b;
                }
                return null;
            }
        });
        if (typeSubstitutor.m33687e()) {
            return typeProjection;
        }
        try {
            return typeSubstitutor.m33690i(typeProjection, 0);
        } catch (TypeSubstitutor.SubstitutionException unused) {
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt$toTypeProjection$2] */
    /* renamed from: c */
    public static final KotlinType m33757c(@NotNull KotlinType kotlinType, List<TypeArgument> list) {
        TypeProjectionImpl typeProjectionImpl;
        TypeProjectionImpl typeProjectionImpl2;
        kotlinType.mo33514G0().size();
        list.size();
        ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(list, 10));
        for (final TypeArgument typeArgument : list) {
            Objects.requireNonNull(typeArgument);
            NewKotlinTypeChecker.f66379b.m33713h(typeArgument.f66418b, typeArgument.f66419c);
            ?? r2 = new Function1<Variance, Variance>() { // from class: kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt$toTypeProjection$2
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Variance invoke(@NotNull Variance variance) {
                    Intrinsics.m32180i(variance, "variance");
                    return variance == TypeArgument.this.f66417a.mo32500m() ? Variance.INVARIANT : variance;
                }
            };
            if (Intrinsics.m32174c(typeArgument.f66418b, typeArgument.f66419c)) {
                typeProjectionImpl2 = new TypeProjectionImpl(Variance.INVARIANT, typeArgument.f66418b);
            } else {
                if (!KotlinBuiltIns.m32380H(typeArgument.f66418b) || typeArgument.f66417a.mo32500m() == Variance.IN_VARIANCE) {
                    KotlinType kotlinType2 = typeArgument.f66419c;
                    typeProjectionImpl = KotlinBuiltIns.m32374B(kotlinType2) && kotlinType2.mo32838I0() ? new TypeProjectionImpl(r2.invoke(Variance.IN_VARIANCE), typeArgument.f66418b) : new TypeProjectionImpl(r2.invoke(Variance.OUT_VARIANCE), typeArgument.f66419c);
                } else {
                    typeProjectionImpl = new TypeProjectionImpl(r2.invoke(Variance.OUT_VARIANCE), typeArgument.f66419c);
                }
                typeProjectionImpl2 = typeProjectionImpl;
            }
            arrayList.add(typeProjectionImpl2);
        }
        return TypeSubstitutionKt.m33679b(kotlinType, arrayList, kotlinType.getAnnotations());
    }
}
